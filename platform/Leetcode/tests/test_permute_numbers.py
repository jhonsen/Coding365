import pytest
import mock
from leetcode.src.permute_numbers import permute, get_input, main
import leetcode.src.permute_numbers as pmt

class TestMain(object):
    
    # https://stackoverflow.com/questions/35851323/how-to-test-a-function-with-input-call
    def test_main_with_inputs_1_and_2(self):
        pmt.input = lambda x: '1,2'
        output = pmt.main() 
        assert output == [[1,2],[2,1]]

    def teardown_method(self, method):
        # This method is being called after each test case,
        #   and it will revert input back to original function
        pmt.input = input          

        
class TestProperInput(object):
    
    def test_one_element_as_input(self):        
        assert permute([1]) == [[1]]
        assert permute([0]) == [[0]]
        assert permute([123]) == [[123]]
        
    def test_empty_element(self):
        assert permute([]) == []
        
    def test_negative_inputs(self):
        assert permute([-1,-3]) == [[-1,-3],[-3,-1]]
        assert permute([-10]) == [[-10]]
    
    
import pytest
from leetcode.src.find_max_profit import find_max_profit

class TestProperInput(object):
    
    def test_empty_list_as_input(self):
        assert find_max_profit([]) == 0
    
    def test_single_input_in_list(self):
        assert find_max_profit([1]) == 0
        assert find_max_profit([2]) == 0
        
    def test_proper_input(self):
        assert find_max_profit([7,6,5,4,3,2]) == 0
        assert find_max_profit([7,1,5,3,6,4]) == 5
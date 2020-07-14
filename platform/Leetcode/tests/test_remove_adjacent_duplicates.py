import pytest
from leetcode.src.remove_adjacent_duplicates import remove_duplicates_stackwise

class TestProperInput(object):
    
    def test_empty_string_as_input(self):
        assert remove_duplicates_stackwise('') == ''
        
    def test_integer_as_input(self):
        with pytest.raises(AssertionError) as exception_info:
            remove_duplicates_stackwise(1223)
        assert exception_info.match("Input should be a string")
    
    def test_non_string_input(self):     
        with pytest.raises(AssertionError) as exception_info:
            remove_duplicates_stackwise(['1223'])
        assert exception_info.match("Input should be a string")
    
    def test_proper_string_as_input(self):
        assert remove_duplicates_stackwise('aabac') == "bac"
        assert remove_duplicates_stackwise('11213') == "213"
    
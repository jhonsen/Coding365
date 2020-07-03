import pytest
from leetcode.src.split_balanced_string import split_balanced_string

class TestProperInput(object):
    
    def test_imbalanced_input(self):
        with pytest.raises(AssertionError) as exception_info:
            split_balanced_string('LRL')
        assert exception_info.match('Input must be a balanced combination of L & R')
        
        with pytest.raises(AssertionError) as exception_info:
            split_balanced_string('LRLK')
        assert exception_info.match('Input must be a balanced combination of L & R')
    
    def test_empty_string_as_input(self):
        with pytest.raises(AssertionError) as exception_info:
            split_balanced_string('')
        assert exception_info.match('Input must be a balanced combination of L & R')
    
    def test_balanced_input(self):
        assert split_balanced_string('LRLR') == 2
        assert split_balanced_string('LLLRRR') == 1
        assert split_balanced_string('RLRRRLLRLL')== 2    
    
    def test_integer_as_input(self):
        with pytest.raises(TypeError) as exception_info:
            split_balanced_string(1212)
        assert exception_info.match("'int' object is not iterable")
    
    
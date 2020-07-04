import pytest
from leetcode.src.contains_duplicate import contains_duplicate, convert_to_list

class TestProperInput(object):
    
    def test_empty_list_as_input(self):
        assert contains_duplicate([]) == False
    
    def test_single_input_in_list(self):
        assert contains_duplicate([1]) == False
        assert contains_duplicate([2]) == False
        assert contains_duplicate([3]) == False
    
    def test_non_list_input(self):
        
        with pytest.raises(AssertionError) as exception_info:
            contains_duplicate(1) 
        assert exception_info.match("Input must be a list of integers")
    
        with pytest.raises(AssertionError) as exception_info:
            contains_duplicate('1') 
        assert exception_info.match("Input must be a list of integers")
    
    def test_proper_input(self):
        assert contains_duplicate([1,1]) == True
        assert contains_duplicate([1,2,2,3]) == True
        assert contains_duplicate([1,1,2,2]) == True
        
class TestConvertToList(object):
    
        def test_proper_input(self):
            assert convert_to_list('1,2,3') == [1,2,3]
            assert convert_to_list('1, 2, 3') == [1,2,3]
        
        def test_empty_space_as_input(self):
            assert convert_to_list('') == []
            
        def test_empty_input(self):
            
            with pytest.raises(ValueError) as exception_info:
                if convert_to_list(' '):
                    raise ValueError("invalid literal for int() with base 10")
            assert exception_info.type is ValueError
            
            
            
            
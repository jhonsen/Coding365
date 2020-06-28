import os
import pytest

from leetcode.src.ugly_number import is_ugly

class TestProperInput(object):
    
    def test_zero_returns_NOT_ugly(self):
        message = 'Input must be positive integer'
        assert is_ugly(0) == False, message
    
    def test_string_as_input(self):
        with pytest.raises(TypeError) as exception_info:
            is_ugly('15')
        assert exception_info.match("not supported between instances of 'str' and 'int'")
    
    def test_empty_string_as_input(self):
        with pytest.raises(TypeError) as exception_info:
            is_ugly('')
        assert exception_info.match("not supported between instances of 'str' and 'int'")
        
    def test_one_and_prime_factors_IS_ugly(self):
        assert is_ugly(1) == True
        assert is_ugly(2) == True
        assert is_ugly(3) == True
        assert is_ugly(5) == True

    def test_odd_integer_IS_ugly(self):
        assert is_ugly(15) == True
        assert is_ugly(25) == True
        assert is_ugly(27) == True
        
    def test_odd_numbers_NOT_ugly(self):        
        assert is_ugly(13) == False
        assert is_ugly(17) == False
        assert is_ugly(19) == False
        
    def test_even_numbers_IS_ugly(self):
        assert is_ugly(8) == True
        assert is_ugly(12) == True
        assert is_ugly(30) == True
        
    def test_even_numbers_NOT_ugly(self):        
        assert is_ugly(14) == False
        assert is_ugly(26) == False
        assert is_ugly(35) == False
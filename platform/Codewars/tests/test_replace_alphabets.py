import os
import pytest

try:
    from codewars.src.replace_alphabets import replace_alphabets
except ModuleNotFoundError:
    os.chdir(os.path.join(os.getcwd(), '../../'))
    print(f'Warning: Changing directory to {os.getcwd()}. Run test_files.py from the "platform"-folders')
from codewars.src.replace_alphabets import replace_alphabets


_proper_inputs = ["Hello 123 world!", 
                  "abcdefghijklmnopqrstuvwxyz"]

_expected_output = ["8 5 12 12 15 23 15 18 12 4",        
                    "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26"]

class TestProperInput(object):
    
    def test_replace_alphabet_with_proper_string_inputs(self):
        assert replace_alphabets(_proper_inputs[0]) == _expected_output[0]
        assert replace_alphabets(_proper_inputs[1]) == _expected_output[1]

    def test_replace_alphabet_with_empty_string(self):
        assert replace_alphabets("") == ""

    def test_replace_alphabet_with_non_alphanumeric(self):
        assert replace_alphabets("!$^&*@") == ""

    def test_TypeError_with_integer_input(self):
        integer_input = 123
        with pytest.raises(TypeError) as exception_info:
            replace_alphabets(integer_input)
        assert exception_info.match("'int' object is not iterable")
    
    def test_KeyError_input_type(self):       
        error_input_cases = [('abc',), # tuple
                               {'abc'},  # set
                               ['abc'],  # list
                              ]
        
        for case in error_input_cases:
            with pytest.raises(KeyError) as exception_info:
                replace_alphabets(case)
            assert exception_info.match("abc")
        

        

import unittest

import MyMath
import MyMathTest


class MyMathTestCase(unittest.TestCase):
    def test_DivPass(self):
        number1 = 6
        number2 = 3
        expected = 2
        self.assertEqual(expected, MyMath.div(number1, number2))  # add assertion here

    def test_DivFail(self):
        number1 = 6
        number2 = 1
        expected = 2
        self.assertEqual(expected, MyMath.div(number1, number2))

    def test_DivError(self):
        number1 = 6
        number2 = 0
        expected = 0
        self.assertEqual(expected, MyMath.div(number1, number2))

    def test_DivException(self):
        number1 = 6
        number2 = 0
        with self.assertRaises(ZeroDivisionError):
            MyMath.div(number1, number2)

if __name__ == '__main__':
    unittest.main()

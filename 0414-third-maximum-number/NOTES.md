​
# Approach

* The first loop looks for the first largest number and stores it in _firstDistinct_
* The second loop looks for the largest number that is less than _firstDistinct_ and stores it in _secondDistinct_.
* The third loop looks for the largest number that is less than _secondDistinct_ and stores it in _thirdDistinct_.
* Additional condition equals in _nums[i] >= thirdDistinct_. Equals when the third largest number and is the default value(Integer.MIN_VALUE) when initializing the _thirdDistinct_ variable.
* boolean variable _isChanged_ is declared to know whether the third largest number was found; if not, then return the first largest number.
* If _isChanged_ is true then return the third number

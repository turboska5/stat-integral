# stat-integral

### <u>How to run the application</u>
Two arguments are required at runtime:
* arg[0] is the lower bound of the integral, an integer represented as a String.
* arg[1] is the upper bound of the integral, an integer represented as a String.

### <u>What occurs within the application</u>
The application will then evaluate the integral of the function
[(Math.pow(Math.E, (Math.pow(x, 2) / -2))) / (Math.sqrt(2 * Math.PI))]
using the Apache Commons Math3 Simpson Integrator.

### <u>What is returned by the application</u>
The returned value is the percentage of the population covered, expressed as a decimal.

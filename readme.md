# stat-integral

## Norm

### _How to run the application_
If ONE argument is supplied at runtime:
* arg[0] is the number of standard deviations, a Double represented as a String.

If TWO arguments are supplied at runtime:
* arg[0] is the lower bound of the integral, a Double represented as a String.
* arg[1] is the upper bound of the integral, a Double represented as a String.

### _What occurs within the application_
The application will then evaluate the integral of the function
[Math.pow(Math.E, (-0.5 * x * x)) / (Math.sqrt(2 * Math.PI))]
using the Apache Commons Math3 Simpson Integrator.

### _What is returned by the application_
The returned value is the percent of the population over the given interval, as a Double,
using Standard Normal Distribution.



## NormInv

### _How to run the application_
One argument is supplied at runtime:
* arg[0] is the percent of the population, a Double represented as a String.

### _What is returned by the application_
The returned value is the number of standard deviations, as a Double.

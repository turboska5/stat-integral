# stat-integral

## Norm

### _How to run the application_
One argument is supplied at runtime:
* arg[0] is the number of standard deviations, a Double represented as a String.

### _What occurs within the application_
The application will then evaluate the integral of the function
[Math.pow(Math.E, (-0.5 * x * x)) / (Math.sqrt(2 * Math.PI))]
using the Apache Commons Math3 Simpson Integrator.

### _What is returned by the application_
The returned value is the percent of population encapsulated from the mean, represented as a Double.



## NormInv

### _How to run the application_
One argument is supplied at runtime:
* arg[0] is the percent of population encapsulated, a Double represented as a String.

### _What is returned by the application_
The returned value is the number of standard deviations, represented as a Double.

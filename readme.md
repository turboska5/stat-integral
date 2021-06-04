# stat-integral

## GetPercent

### _How to run the application_
Two arguments are required at runtime:
* arg[0] is the lower bound of the integral, a Double represented as a String.
* arg[1] is the upper bound of the integral, a Double represented as a String.

### _What occurs within the application_
The application will then evaluate the integral of the function
[Math.pow(Math.E, (-0.5 * x * x)) / (Math.sqrt(2 * Math.PI))]
using the Apache Commons Math3 Simpson Integrator.

### _What is returned by the application_
The returned value is the percentage of the covered population expressed as a decimal.

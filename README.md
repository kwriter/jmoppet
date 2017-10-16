jMoppet is providing Monitor oriented Programming for JAVA in JAVA. No DSLs, lightweight, yet powerful.

Monitoring oriented programming provides a way to separate your logic from error handling code, to just be able to just run the moppet!

What it is.

jMoppet makes use of the fact that most applications use events or are able to do so. There are network events, GUI events, File evemts, ... 

With jMoppet you can attach to those events and define constraints as well as repair mechanisms that kick in when the constraint is violated. To define constraints quickly,  jUnit-like assertion syntax is used.

You can see jMoppet as a test framework, though it operates at runtime.

On top of that, you can provide recovery code when a constraint failed.

Together this should give big teams enable to make a rock hard application with little unit testing effort.

jMoppet is using CPU cycles what can cause apps to slow down a litte. Since it's a multi threaded moppet, the performance impact should be insignificant.

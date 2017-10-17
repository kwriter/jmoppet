jMoppet is providing Monitor oriented Programming for JAVA in JAVA. No DSLs, lightweight, yet powerful.

Monitoring oriented programming provides a way to separate your logic from error handling code, to just run the moppet!

What it is
----------

jMoppet makes use of the fact that most applications use events or are able to do so. There are network events, GUI events, File events, ... 

With jMoppet you can attach to those events and define constraints as well as repair mechanisms that kick in when the constraint is violated. To define constraints easily,  jUnit-like assertion syntax is used.

This should enable teams to make a rock hard application with less unit testing effort.

Performance
------

jMoppet is using CPU cycles depending on the mount of constraints and how hard it is to evaluate them. This can cause apps to slow down a litte. Since it's a multi threaded moppet, the performance impact should be insignificant.

Progress
--------

jMoppet was just started, so every additional input is useful.

This is a readme file created to describe work done in commit 1.
In commit 1, the use of interface reference is being showed by
creating 1 interface named Sim with some methods like calling() an data()
and 2 classes Airtel and Jio which will override those Sim interface methods
after implementing it.

This makes use of interface reference  but still the app is not configurable without changing code in
MainApplication as new object of any of the class still needs to be provided in case any new operator is added such as VI.
So to prevent this we will make sue of ApplicationContext in next commit which will help us configure
new objects of any class in config XML.
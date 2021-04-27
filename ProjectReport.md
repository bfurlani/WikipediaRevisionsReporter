# Project Report

Ben Furlani

## Challenge #1 Complete

Switched the binding for the FakeQueryEngine to the WikipediaQueryEngine 
that actually displays the data inside of QueryEngineModule. 

## Challenge #2 Complete

Added a reference to the IFormatter interface and binded the newRevisonFormatter
to the Guine thing.

## Challenge #3 Complete
I took away the foreach for the revisions inside the loop and replaced it all
with a Stream thing from the java tools. I used that to concat them and
left the way it added the stuff to the UI the same. I had no clue how to use the 
stream thing before so that was an adventure.

## Reflection Question #1: Functional vs OO

It seems that they are equal in useablilty and was a waste of time to change it,
but I felt the foreach was obviosuly easier to me because I knew how to do that.
Unfortunatley I had to actual research on how to do the weird Stream thing. It felt
like a mapping function in javascript, but that strikes me the same as a for loop.
Argueably the foreach is much easier to read than the garbage the stream has.

## Reflection Question #2: Polymorphism and Dependency Inversion

I'll be honest I still don't get the whole dependency inversion thing. I have found there to be 
no guidance (being honest dock me if you feel the need); however, the polymorphism is in the IFormatter
Interface being implemented on the Formatters allowing for other Formatters to be made and used inside the
application by simply adding the Formatter to the QueryEngineModule instead of having to change
other items else where.


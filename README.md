<h1>Activity: Section 8 Project 2</h1>

<h2>Overview</h2>

In the previous activity, we wrote code to save and load the state of a board to a file. We also mentioned that this code was not testable. Did you get a chance to think about why it is not testable ? 

One of the reasons why this code was not testable, is because, the class Storage, had a hardcoded filename (in which the data was to be stored). It is never a good idea to test with a hardcoded filename. There are often several developers working in a team. Unit tests should not only run on everyone's machine, but also on the test servers. A hardcoded filename is disaster, because we may not even be able to stat that file on a particular machine. Also when working with files, we should always [mock](http://en.wikipedia.org/wiki/Mock_object) the part that deals with file IO, to [allow faster execution of those test cases which test some high level code](http://stackoverflow.com/questions/38181/when-should-i-mock), which in turn calls the persistence code. 

In this section, we will improve testability of the code that saves and loads the board. We have created an interface called ```PersistenceStrategy``` for you. You need to implement this interface in a class called ```MockPersistenceStrategy```. Remember, you actually have to create this class. Since this is a mock class whose exclusive reason for existence is to be used in test cases, you should create it in the _test_ directory. You also have to create another implementation of the interface, and call the class, ```FilePersistenceStrategy```. This class will be used in production code. Be sure not to hardcode the filename in  ```FilePersistenceStrategy```. 

You may have noticed that we are using the Strategy Design Pattern here. The strategy itself is defined by ```PersistenceStrategy```, which has two strategic implementations - ```MockPersistenceStrategy``` and ```FilePersistencceStrategy```. We will use ```FilePersistenceStrategy``` as the strategy of choice when we are playing the game, and ```MockPersistenceStrategy``` when we are running test cases.

<h2>Steps For This Project</h2>

We have given you a suite of test cases. Run AllTests and verify that 49 tests are run, and there are 2 failures. You need to get the failing tests to pass. 

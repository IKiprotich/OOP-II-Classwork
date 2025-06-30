## Exception Handling
It allows developers to manage runtime errors effectively by using mechanisms like try-catch block, finally block, throwing Exceptions, Custom Exception handling, etc.

# Explanation
An exception occurs when something unexpected happens, like accessing an invalid index, dividing by zero, or trying to open a file that does not exist. 

Without proper exception handling, an error can cause the entire application to crash, leading to a poor user experience.

By handling these exceptions, Java enables developers to create robust and fault-tolerant applications.

## Common Examples
- ClassNotFoundException
- IOException
- SQLException
- RemoteException

## Key Components of Exception Handling
try: The block of code where exceptions might occur.
catch: The block of code that handles the exception.
finally: An optional block that executes regardless of whether an exception was thrown or not, typically used for cleanup activities.

try {
// code that may throw an exception
} catch (ExceptionType e) {
 // code to handle the exception
} finally {
 // code that will always execute
}

### Java Exception Hierarchy
- All exception and error types are subclasses of the class Throwable, which is the base class of the hierarchy. One branch is headed by Exception. 

- This class is used for exceptional conditions that user programs should catch. NullPointerException is an example of such an exception. 

- Another branch, Error is used by the Java run-time system(JVM) to indicate errors having to do with the run-time environment itself(JRE). StackOverflowError is an example of such an error.

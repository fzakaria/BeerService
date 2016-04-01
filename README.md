# BeerService

This is a sample [finatra](https://twitter.github.io/finatra/),
[thrift](https://thrift.apache.org/) example build using 
[pants](https://pantsbuild.github.io/).

Hopefully this might serve as a template for future projects that would like to
use these technologies. Lots of time was spent trying to understand the limited documentation
and the fact that some of these technologies are rapidly changing (i.e. pants)

At the moment, this codebase sets up a simple `BeerService` and corresponding clients for languages:
python, scala and java.

The `BeerService` is a Thrift service with the underlying server written using Finagle.


# Helpful Commands

```bash
# Generate idea project for the beer-service
./pants idea //:beer-server-bin

# Run the application
./pants run //:beer-server-bin 
./pants run --jvm-debug //:beer-server-bin 

# If the server is running in another tab, run the python client for some
# example calls
./pants run //:beer-client-python
```
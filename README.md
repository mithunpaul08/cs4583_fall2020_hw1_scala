# Setup your environment

You will need to set up an appropriate coding environment on whatever computer
you expect to use for this assignment.
Minimally, you should install:
 
* [git](https://git-scm.com/downloads)
* [Scala](https://www.scala-lang.org/)
* [sbt](https://www.scala-sbt.org/)



# Write your code

You will implement one function each for each of the 4 qns, Eg:`runQ13a()` inside 
the class `QueryEngine`. These functions should return the documents in the right order (atleast the top 2) , as asked in the question, as Lucene Documents. 
A sample return function is also provided for your reference. 

Also, you **should not edit** these files:
- `runAllTests.sh`
- `.travis.yml`
- `src/test/resources/input.txt`
- `src/test/scala/edu/arizona/cs/QueryEngineTest.scala`

# To run your code


To run all the provided tests, run the `sbt clean` and `sbt run` script from the directory containing `build.sbt`

# Test your code

Tests have been provided for you in the `src/test/scala/edu/arizona/cs/QueryEngineTest.scala` file.
To run all the provided tests, run the ``sbt test`` script from the directory containing `build.sbt`

If your code passes the test case, you will see output like:
```
[info] Loading project definition from /Users/mordor/teaching_for_grading/hw3_qn1_stub_scala_version/project
[info] Loading settings for project hw3_qn1_stub_scala_version from build.sbt ...
[info] Set current project to hw3_scala (in build file:/Users/mordor/teaching_for_grading/hw3_qn1_stub_scala_version/)
[info] QueryEngineTest:
[info] - QueryEngine.Q1
[info] - QueryEngine.Q13a
[info] - QueryEngine.Q13b
[info] - QueryEngine.Q13c
[info] Run completed in 804 milliseconds.
[info] Total number of tests run: 4
[info] Suites: completed 1, aborted 0
[info] Tests: succeeded 4, failed 0, canceled 0, ignored 0, pending 0
[info] All tests passed.
[success] Total time: 5 s, completed Mar 13, 2019, 8:38:34 PM
```

# Test case for StackOverflow question

http://stackoverflow.com/questions/25817210/why-are-play-2-2-3-test-templates-in-a-submodule-not-compiled

Templates in `test/views/` are not compiled.

```
[play-223-test-templates] $ test
[info] Compiling 1 Java source to D:\Users\stysin\Play\play-2.2.3-test-templates
\target\scala-2.10\test-classes...
[error] D:\Users\stysin\Play\play-2.2.3-test-templates\test\ApplicationTest.java
:45: error: cannot find symbol
[error]                 Content html = views.html.test.render("This is a test te
mplate");
[error]                                          ^
[error]   symbol:   class test
[error]   location: package views.html
[error] 1 error
[error] (test:compile) javac returned nonzero exit code
[error] Total time: 4 s, completed 16.09.2014 19:52:14
[play-223-test-templates] $
```



@echo off
@SET M2_HOME=..\utils\apache-maven-3.0.3
@SET JAVA_HOME=..\utils\jdk1.6.0_22
@SET ANT_HOME=..\utils\apache-ant-1.8.2
@SET GRADLE_HOME=..\utils\gradle-1.5

@SET M2=%M2_HOME%\bin
@REM SET MAVEN_OPTS=-Xms256m


@SET JAVA_BIN=%JAVA_HOME%\BIN
@SET ANT_BIN=%ANT_HOME%\bin
@SET GRADLE_BIN=%GRADLE_HOME%\BIN

@SET PATH=%PATH%;%JAVA_BIN%;%M2%;%ANT_BIN%;%GRADLE_BIN%

@echo on
@path
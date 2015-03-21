@echo off
set CACHEPATH=%~dp0..\..
echo CACHEPATH=%CACHEPATH%
set LOCAL_FOP_HOME=%CACHEPATH%\fop
set LIBDIR=%LOCAL_FOP_HOME%\lib
if "%JAVA_HOME%" == "" goto noJavaHome
if not exist "%JAVA_HOME%\bin\java.exe" goto noJavaHome
if "%JAVACMD%" == "" set JAVACMD=%JAVA_HOME%\bin\java
goto runXEP

:noJavaHome
if "%JAVACMD%" == "" set JAVACMD=java

:runXEP
if "%XEP_HOME%" == "" goto xepDefault
goto setClassPath
:xepDefault
set XEP_HOME=C:\RenderX\XEP
:setClassPath
set CP=%XEP_HOME%\lib\xep.jar;%LIBDIR%\saxon9he.jar;%CACHEPATH%\lib\RenderServer\renderserver.jar
"%JAVACMD%" -Xmx512m -Xrs -Dcom.renderx.xep.CONFIG=%XEP_HOME%\xep.xml -Djava.net.preferIPv4Stack=true -classpath "%CP%" com.intersys.zenreports.RenderServer %*

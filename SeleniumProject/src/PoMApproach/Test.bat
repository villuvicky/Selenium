set projectLocation=C:\Users\villu\git\Selenium\SeleniumProject\src\PoMApproach
 
cd %projectLocation%
 
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
 
java org.testng.TestNG %projectLocation%\Test.xml
 
pause
cd ..
for %%i in ("%cd%") do set jarName=%%~ni

set WORK=%cd%
set classpath=.;
cd %WORK%\target\classes
jar -cvfm %jarName%.jar MANIFEST.MF  version.txt 
copy %jarName%.jar %WORK%\lib
del -f %jarName%.jar


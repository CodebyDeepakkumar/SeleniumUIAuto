@echo off
echo Running Maven tests...
cd path_to_your_project
mvn clean test
echo Tests completed. Opening the report...
start path_to_your_report_directory\index.html
exit

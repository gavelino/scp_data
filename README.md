# Measuring and Analyzing Code Authorship in 1+118 Open Source Projects (DATA)
This repository contains the scripts used to extract and compute the data used in the under developmnet paper. 

###Folders
-	scripts: script files and program used to extract and compute the authorship data. 
-	authorshipAnalyzer: Java project with the source code of the program used to compute file authorship. 
-	data: sample data used in this paper

###Execution Environment 
The scripts were developed using Shell and AWK. So, the execution environment must support those script languages.  Additionally, the ruby interpreter is required to use the Linguist library to automatically discard files like documentation and third-party libraries. See the specific Linguist requirements in [linguist page](https://github.com/github/linguist).

# Measuring and Analyzing Code Authorship in 1+118 Open Source Projects (DATA)
This repository contains the scripts to compute the data used in the study. 

## Repositories
In this study we investigate code authorship in 1+118 open-source projects. First, we investiga 66 stable releases of Linux kernel (v2.6.12–v4.17). After, we contrast the Linux results with the ones computed for a extended dataset of 118 popular opens-source projects. More details about these projecs are provided below.


### Folders
*	scripts: script files and program used to extract and compute the authorship data. 
*	authorshipAnalyzer: Java project with the source code of the program used to compute file authorship. 
*	data: sample data used in this paper.
  * bugs: data from bugzilla and authorship data about the files changed to fix the bugs
  * extended_dataset: authorship data of the other 118 repositories.

### Execution Environment 
The scripts were developed using Shell and AWK. So, the execution environment must support those script languages.  Additionally, the ruby interpreter is required to use the Linguist library to automatically discard files like documentation and third-party libraries. See the specific Linguist requirements in [linguist page](https://github.com/github/linguist).

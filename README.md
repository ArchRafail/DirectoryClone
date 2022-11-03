# DirectoryClone

</br>
</br>
The task was the next:</br>
User enter the path to the source directory and target directory.</br>
The clone's thread starts to work. It must copy the structure (subdirectories and files) from source folder to target folder.</br>
Structure of target folder must be the same as source folder.</br>
In Main method I have to show statistic about execution result of those threads.</br>
</br>
</br>
Program operating conditions.</br>
1. Path to source and target folders has to be absolut, example D:\Projects\Java\DirectoryClone\src\main\resources\source.</br>
2. If path to folder/folders has incorrect input or folder/folders doesn't exist -> program will stop to work.</br>
3. In source folder has to be few files and/or folder/folders with subdirectory/subdirecties with/without file/files.</br>
4. Program doesn't copy the content of your files! It was not a target of program. The target in structure of folder.</br>
</br>
</br>
Test of program.</br>
1. Input incorrect absolut path. Example D:\Projects\Java\/DirectoryClone\src\main\resources\source.</br>
Program will show you an error. Incorrect path.</br>
2. Input incorrect absolut path. Example D:\Projects\Java\DirectoryClone\src\main\resources\source\sample.txt.</br>
Program will show you an error. Folder is not a directory type.</br>
3. Input correct absolut path to source folder - YourPath\DirectoryClone\src\main\resources\source.</br>
Example D:\Projects\Java\DirectoryClone\src\main\resources\source\</br>
Input correct absolut path to target folder - YourPath\DirectoryClone\src\main\resources\target.</br>
Example D:\Projects\Java\DirectoryClone\src\main\resources\target\</br>
Program catch them. Pathes correct.</br>
Program will show you the structure of source folder and target folder. They are the same.</br>
You can check source folder and target folder with Windows Explorer.

@project.name@ - README File

Installation :

{PLATFORM} can either be win32 or linux, depending on the base operating system you are using.

- Unzip the install file
- move the @project.artifactId@ directory to the location of your choice, recommend a separate drive in \srv\
- open @project.artifactId@\{PLATFORM}\bin
- execute the following command in a cmd / shell

WIN32:
- @project.artifactId@.exe --install ../etc/wrapper.conf

LINUX:
- @project.artifactId@ --install ../etc/wrapper.conf

- You may now execute the service
 - Win32 - Service - @project.artifactId@ start
 - Linux - Init.d - /etc/init.d/@project.artifactId@ start

Support : support@zss.co.zw
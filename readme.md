Created from this tutorial: https://www.spigotmc.org/wiki/creating-a-blank-spigot-plugin-in-vs-code/

Prerequisites
  - You would be using VS Code with Java Extension Pack to develop your Spigot plugin.
  - You will need OpenJDK. (Because Java Extension Pack requires OpenJDK.)
  - Apache Maven will be needed also.

Build:

From "MAVEN PROJECTS" pane, right click "BlankPlugin" and select "install" from the menu.
Please check there is "BUILD SUCCESS" message in the shell pane.

Then, from "MAVEN PROJECTS" pane, right click "BlankPlugin", select "custom goals ..." from the menu.
And type "eclipse:eclipse" on a input panel above VS Code window, and press enter key.

Finally, from "MAVEN PROJECTS" pane, right click "BlankPlugin" and select "install" from the menu once again.
After success building, you'll get your Spigot plugin in the 📁target directory.
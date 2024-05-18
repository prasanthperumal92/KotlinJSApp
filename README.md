# KotlinJSApp
This repository is a basic template for creating Kotlin Js app

## Steps:
1. Create a new kotlin project in Intellij 
2. Remove all unnecessary folders .
3. Goto build.gradle add `kotlin("multiplatform") version "1.9.24"` in the plugins section at the top
4. add a `Kotlin{js{}}` section
5. then add either `browser{}` or `nodeJs` inside `js{}`
6. below that add `binaries.executable()` so that the section looks like this
   <img width="509" alt="image" src="https://github.com/prasanthperumal92/KotlinJSApp/assets/39849022/a1ccb69e-64c8-4daf-928c-e4944c1c9669">

7. create a resources folder in your src folder and add a `index.html` 
   <img width="509" alt="image" src="https://github.com/prasanthperumal92/KotlinJSApp/assets/39849022/e01670d5-d3cb-43d4-9e49-5a47a6bbb3bf">


8. inside the `index.html` add `<html> <head> and <body>` tags and  a `<div id="content"></div>`
9. After that add a `<script src="$PROJECT_NAME.js"></script>`
10. either add a new source set `jsMain` or rename `main`
11. add a  `Main.kt` file and add `document.getElementById("content")?.innerHTML = "<a href='contact.json'>Hello Kotlin</a>"`
12. YESSSS!!! we are done. Just run the code using `.gradlew jsRun`
13. For running a full fledged Node Js server . install npm in you desktop
14. and replace the `browser{}` to `nodeJs{}` in the build.gradle file
15. edit the `Main.kt` file like
https://github.com/prasanthperumal92/KotlinJSApp/blob/b3d37de452a022912d24949566f6496b00e189cd/src/jsMain/kotlin/App.kt
16. Where `external fun require(module: String): dynamic` provides you the ability to use node modules in your code.

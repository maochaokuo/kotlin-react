# Kotlin React example

## update 12/12
1. yarn create react-kotlin-app <my-app> (ex: kotlin-react)
   it is better than create-react-kotlin-app (more up to date)
2. (make up from video in KotlinConf 2017 - How to Build a React App in Kotlin by Dave Ford)
3. from https://play.kotlinlang.org/hands-on/Building Web Applications with React and Kotlin JS/02_Setting_up)

## extract function
The following steps are about how to extract function from html
1. select the html segment
2. right click, choose Refactor then Function
3. give a name (ex: handUi), and then choose RBuilder type from
   dropdown combobox 
   
## trouble shooting
1. 'if react-scripts-kotlin' is not recognized as an 
    internal or external command, happened, then:
```
npm i react-scripts-kotlin --save
```

## create-react-kotlin-app 
1. create-react-kotlin-app <my-app> (ex: kotlin-react)
2. must install JDK 8
3. yarn start
4. use IntelliJ to open it, will convert to new project
   file format
   
## IntelliJ tips
1. setting/editor/general, may enable editor zoom by Ctrl 
    and mouse wheel
2. Ctrl-K commit, type in description
3. then Ctrl-Alt-K push
4. Ctrl-S, save all
5. block comment
    1. Ctrl-/ (toggle selected line comment)
    2. Ctrl-Shift-/ (toggle block comment)

### How to disable auto-save:
1. Go to File > Settings (Ctrl+Alt+S).
2. Go to Appearance & Behavior > System Settings.
3. Make sure the two are unchecked:
    1. Save files on frame deactivation
    2. Save files automatically if application is idle for x sec.
4. Go to Editor > General > Editor Tabs
5. Put a checkmark on "Mark modified files with asterisk"
6. (Optional but recommended) Under "Tab Closing Policy", select "Close non-modified files first". You may also want to increase the number of allowed tabs.
7. Click Apply > OK.
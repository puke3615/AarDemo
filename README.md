##AarDemo
aar的基本使用流程
参考： http://www.stormzhang.com/android/2015/03/01/android-reference-local-aar/?utm_source=tuicool

声明：
	A：依赖包
	B:   使用包

步骤：
	1.   【A】设置A：apply plugin: 'com.android.library'
	2.   【A】执行gradle的【./gradlew assembleRelease】命令来生成aar文件，并从【build/outputs/aar】中copy该文件
	3.   【B】将copy的aar文件paste到B的libs目录下
	4.   【B】在B的app下的build.gradle文件添加
	 `repositories {
	        flatDir {
            dirs 'libs' //this way we can find the .aar file in libs folder
        }
    }`
    5.  【B】B中添加
    `dependencies {
    compile(name:'test', ext:'aar')
}`
    6.  【B】Run 

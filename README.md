[![Build Status](https://travis-ci.org/MartinRGB/jenkins_avd_previewer_android.svg?branch=master)](https://travis-ci.org/MartinRGB/jenkins_avd_previewer_android)

# jenkins_avd_previewer_android

Android 的 AnimatedVectorDrawable 无法从外部读取 .XML 来预览动画。因为需要在编译时将 .XML 生成二进制文件，然后再使用。

尝试使用 **Travis CI**（适合 repo 使用） 和 **Jenkins**（适合内网服务器） 来完成Android AVD 自动化编译打包 -> 预览。

## 视频教程

[视频地址](https://github.com/MartinRGB/jenkins_avd_previewer_android/blob/master/art/tutorial.mp4?raw=true)

## 使用方法

- 把 Bodymovin 生成的 **data.xml** 的代码复制粘贴进 **REPLACEMENT_FOLDER** 的 **data.xml** 然后点击 'Commit change'

![img0](https://raw.githubusercontent.com/MartinRGB/jenkins_avd_previewer_android/master/art/0.png?token=AGtfIplf1-fQxvBAN2R1Dr2TinBx8xl-ks5cPx3TwA%3D%3D)

- 编译需要等待三分钟左右，然后点击仓库中的 Release 按钮

![img1](https://github.com/MartinRGB/jenkins_avd_previewer_android/blob/master/art/1.jpg?raw=true)

- 根据时间戳，下载最新生成的 APK 并安装

![img2](https://raw.githubusercontent.com/MartinRGB/jenkins_avd_previewer_android/master/art/1.jpg?token=AGtfIjqY8wXhE4ADrs7C6P0an3pdOH03ks5cPx4dwA%3D%3D)

## 可能问题

Q：签名冲突

A：删除之前应用，重新安装新 APK 即可

Q：编译失败后重新编译

A：可以重新 commit 触发编译（WIP)

Q：Travis CI 的 Trigger 范围太广

A：后续完善


## 参考

### Jenkins

[基于Jenkins+Git+Gradle 实现Android自动化打包发包](https://www.jianshu.com/p/426e7033b0a5)

[Jenkins设置GitLab push事件发生时自动构建](https://blog.csdn.net/maggietian77/article/details/78724055)

### Travis CI

[基于Travis CI搭建Android自动打包发布工作流（支持Github Release及fir.im）](https://avnpc.com/pages/android-auto-deploy-workflow-on-travis-ci)

[用TRAVIS CI给ANDROID项目部署GITHUB RELEASE](http://kescoode.com/travis-ci-android-github-release/)


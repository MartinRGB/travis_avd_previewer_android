# jenkins_avd_previewer_android

Android 的 AnimatedVectorDrawable 无法从外部读取 .XML 来预览动画。因为需要在编译时将 .XML 生成二进制文件，然后再使用。

尝试使用 **Travis CI**（适合 repo 使用） 和 **Jenkins**（适合内网服务器） 来完成Android AnimatedVectorDrawable 自动化编译打包 -> 预览。

## 使用方法

把 Bodymovin 生成的 **data.xml** 放进 **REPLACEMENT_FOLDER**，等待自动化编译完成即可（Jenkins 对应服务器目录，Travisi CI 对应目录）

## 参考

### Jenkins

[基于Jenkins+Git+Gradle 实现Android自动化打包发包](https://www.jianshu.com/p/426e7033b0a5)

[Jenkins设置GitLab push事件发生时自动构建](https://blog.csdn.net/maggietian77/article/details/78724055)

### Travis CI

[基于Travis CI搭建Android自动打包发布工作流（支持Github Release及fir.im）](https://avnpc.com/pages/android-auto-deploy-workflow-on-travis-ci)

[用TRAVIS CI给ANDROID项目部署GITHUB RELEASE](http://kescoode.com/travis-ci-android-github-release/)


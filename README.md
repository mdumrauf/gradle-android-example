#Gradle Android Example

This is an example app that uses [gradle-android-plugin] (https://github.com/jvoegele/gradle-android-plugin), tests with JUnit and [Robolectric] (https://github.com/pivotal/robolectric/)
and tunes eclipse-plugin to enable running it either from Eclipse IDE or from command line.


##Requirements

- Gradle 1.3: http://www.gradle.org/downloads
- Android SDK: http://developer.android.com/sdk/index.html
- Android SDK Tools rev 20

	Since the plugin has a bug with rev 21, it is necessary to
	install the older one. To install it:

	- Download it: http://dl.google.com/android/android-sdk_r20-linux.tgz
	- Replace the *tools* folder with the one in the package downloaded
	- Restart Eclipse

- Maps dependency deployed in your local maven repository with [Maven Android SDK Deployer] (https://github.com/mosabua/maven-android-sdk-deployer).


##Gradle Tasks

###Resolve dependencies:

	gradle dependencies

###Generate the apk package:

	gradle clean build

 It can be found under *build/distributions*.

###Run tests:

	gradle test

###Install onto a running emulator or device:

	gradle androidInstall

###Eclipse metadata

	gradle cleanEclipse
	gradle eclipse

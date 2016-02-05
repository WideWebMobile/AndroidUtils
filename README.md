# AndroidUtils
Gradle Dependency
Release Build Status License

#### Repository

Add this in your root `build.gradle` file (**not** your module `build.gradle` file):

```gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

#### Dependency

Add this to your module's `build.gradle` file:

```gradle
dependencies {
    ...
    compile 'com.github.WideWebMobile:AndroidUtils:0.0.1'
}

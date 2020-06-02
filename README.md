<a href="#">
    <img src="https://raw.githubusercontent.com/paulrozhkin/RestaurantClientApplication/master/app/src/main/res/drawable/logo.png" title="Tamagotchi" alt="Tamagotchi" width="200">
</a>

# Tamagotchi Remote Library

[![](https://jitpack.io/v/paulrozhkin/tamagotchi-remote-library.svg)](https://jitpack.io/#paulrozhkin/tamagotchi-remote-library)

This is a library for interacting with the Tamagotchi server.

---

## Linked Repositories
- [Server](https://github.com/paulrozhkin/tamagotchi-server)
- [Web client](https://github.com/paulrozhkin/tamagotchi-web-client)
- [Android client application](https://github.com/paulrozhkin/tamagotch-android-client)
- [Android stuff application](https://github.com/ForsaiR/RestaurantEmployerApplication)

---

## Setup

1. Add the JitPack repository to your build file

```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

2. Add the dependency

```
dependencies {
	implementation 'com.github.paulrozhkin:tamagotchi-remote-library:Tag'
}
```

3. Add permissions to android manifest
```
<!-- Retrofit permission -->
<uses-permission android:name="android.permission.INTERNET" />
<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
```

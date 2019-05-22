![Download](images/download-cover.jpg)

The library is available via JCenter. The minimum API level supported by this library is API 16.

### Adding Library

```gradle
dependencies {
    implementation 'dev.ahamed.mva2:adapter:2.0.0-alpha01'
}
```

### Adding Extension

```gradle
dependencies {
    implementation 'dev.ahamed.mva2:ext-databinding:2.0.0-alpha01'   // DataBinding
    implementation 'dev.ahamed.mva2:ext-decorator:2.0.0-alpha01'     // Decorators
    implementation 'dev.ahamed.mva2:ext-diffutil-rx:2.0.0-alpha01'   // RxDiffUtil
}
```

### Using Snapshot Version

Just add '-SNAPSHOT' to the version name

```gradle
dependencies {
    implementation 'dev.ahamed.mva2:adapter:2.0.0-SNAPSHOT' // Library
}
```

To use the above sanpshot version add the following to your project's gradle file

```gradle
allprojects {
    repositories {
        maven {
            url 'https://oss.jfrog.org/artifactory/oss-snapshot-local'
        }
    }
}
```

### Proguard / R8

The library plays nice with proguard/r8. There is no special config needed at your end.
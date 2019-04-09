# Android-Secure-REST-API


####Part 1: Authentication 

1. Create a new application from the application templates with a *Navigation Drawer Activity*.
    
    ![](images/navigation-drawer-activity.png)

2. Check the AndroidX artifacts options and click *finish*

    ![](images/android-x.png)
    
3. Create a new class Activity called *LoginActivity* and add it to *AndroidManifest.xml*.

4. Create a new class Activity called *LaunchActivity* and add it to *AndroidManifest.xml*.

5. Change your *AndroidManifest.xml* so the *LaunchActivity* has the action MAIN and LAUNCHER CATEGORY.

    ```xml
    <?xml version="1.0" encoding="utf-8"?>
    <manifest package="com.sancarbar.myapplication"
              xmlns:android="http://schemas.android.com/apk/res/android">
    
      <application
          android:allowBackup="true"
          android:icon="@mipmap/ic_launcher"
          android:label="@string/app_name"
          android:roundIcon="@mipmap/ic_launcher_round"
          android:supportsRtl="true"
          android:theme="@style/AppTheme">
        <activity
            android:name=".LaunchActivity"
            android:label="@string/app_name"
            android:theme="@style/AppTheme.NoActionBar">
          <intent-filter>
            <action android:name="android.intent.action.MAIN" />
    
            <category android:name="android.intent.category.LAUNCHER" />
          </intent-filter>
        </activity>
    
        <activity android:name=".LoginActivity"/>
        <activity android:name=".MainActivity"/>
    
    
      </application>
    
    </manifest>
    ```
6. 
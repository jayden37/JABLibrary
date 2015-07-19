package com.jablibrary.Common;

import android.app.Application;

/**
 * @author Jayden
 * @since 2015. 07. 19.
 *
 * This class is Application class.
 * Global values 선언.
 * Application Component 들이 공유할수 있는 변수들 지정하는 class.
 * Context를 가지고 접근 가능하다.
 *
 * Android Manifest.xml 에 Application class 등록이 필요하다.
 */

public class ApplicationClass extends Application {

    /**
     * Activity, Receiver, Service 가 생성되기 전,
     * Application이 시작중일때 Application onCreate()가 만들어진다.
     */
    @Override
    public void onCreate() {
        super.onCreate();
    }
}

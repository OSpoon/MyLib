package com.frames.spoon.mylibrary;

import com.frames.spoon.mylibrary.base.BaseApplication;

import static com.frames.spoon.mylibrary.AppConfig.KEY_FRITST_START;
import static com.frames.spoon.mylibrary.AppConfig.KEY_LOAD_IMAGE;


/**
 * 全局应用程序类
 * 用于保存和调用全局应用配置及访问网络数据
 */
public class AppContext extends BaseApplication {
    private static AppContext instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        init();
    }

    private void init() {
//        AppCrashHandler handler = AppCrashHandler.getInstance();
//        if (!BuildConfig.DEBUG)
//            handler.init(this);

//        // 初始化网络请求
//        ApiHttpClient.init(this);
//
//        // Log控制器
//        KJLoger.openDebutLog(BuildConfig.DEBUG);
//        TLog.DEBUG = BuildConfig.DEBUG;
//
//        // Bitmap缓存地址
//        HttpConfig.CACHEPATH = "OSChina/ImageCache";
    }

    /**
     * 获得当前app运行的AppContext
     *
     * @return
     */
    public static AppContext getInstance() {
        return instance;
    }

    public static void setLoadImage(boolean flag) {
        set(KEY_LOAD_IMAGE, flag);
    }

    /**
     * 判断当前版本是否兼容目标版本的方法
     *
     * @param VersionCode
     * @return
     */
    public static boolean isMethodsCompat(int VersionCode) {
        int currentVersion = android.os.Build.VERSION.SDK_INT;
        return currentVersion >= VersionCode;
    }

    public static boolean isFirstStart() {
        return getPreferences().getBoolean(KEY_FRITST_START, true);
    }

    public static void setFirstStart(boolean frist) {
        set(KEY_FRITST_START, frist);
    }

}
package com.cooldev.gba.emulator.gameboy;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import com.applovin.sdk.AppLovinMediationProvider;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.cooldev.gba.emulator.gameboy.network.services.analytic.FirebaseAnalyticsManager;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.safedk.android.internal.DexBridge;
import com.safedk.android.utils.Logger;
import kotlin.jvm.internal.q;
import org.koin.core.context.DefaultContextExtKt;
import p0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class MyApplication extends Application {
    public static final int $stable = 0;

    private final void initApp() {
        try {
            FirebaseApp.initializeApp(this);
            FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(this);
            a.r(firebaseAnalytics, "getInstance(...)");
            FirebaseAnalyticsManager.INSTANCE.initialize(firebaseAnalytics);
        } catch (Throwable th) {
            q.d(th);
        }
    }

    private final void initAppLovin() {
        AppLovinSdk.getInstance(this).setMediationProvider(AppLovinMediationProvider.MAX);
        AppLovinSdk.getInstance(this).initializeSdk(new androidx.compose.animation.core.a(19));
    }

    public static final void initAppLovin$lambda$0(AppLovinSdkConfiguration appLovinSdkConfiguration) {
        a.s(appLovinSdkConfiguration, "config");
        Log.d("initAppLovin", "AppLovin SDK initialized with configuration: " + appLovinSdkConfiguration);
    }

    public static void safedk_MyApplication_onCreate_a251e490ab93f2ee65b8d3eae72f4f1d(MyApplication p02) {
        super.onCreate();
        p02.initAppLovin();
        p02.initApp();
        DefaultContextExtKt.startKoin(new MyApplication$onCreate$1(p02));
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    @Override // android.app.Application
    public void onCreate() {
        Logger.d("SafeDK|SafeDK: App> Lcom/cooldev/gba/emulator/gameboy/MyApplication;->onCreate()V");
        DexBridge.appClassOnCreateBefore(this);
        safedk_MyApplication_onCreate_a251e490ab93f2ee65b8d3eae72f4f1d(this);
    }
}

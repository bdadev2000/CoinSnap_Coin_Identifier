package com.apm.insight;

import android.app.Application;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.l.r;
import com.apm.insight.runtime.ConfigManager;
import com.apm.insight.runtime.o;
import java.util.Map;

/* loaded from: classes.dex */
public final class Npth {
    private static boolean sInit;

    public static void addAttachLongUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            i.b().b(attachUserData, crashType);
        }
    }

    public static void addAttachUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            i.b().a(attachUserData, crashType);
        }
    }

    public static void addTags(Map<? extends String, ? extends String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        i.b().a(map);
    }

    public static void checkInnerNpth(boolean z8) {
        o.c(z8);
    }

    public static void dumpHprof(String str) {
        o.c(str);
    }

    public static void enableALogCollector(String str, com.apm.insight.a.b bVar, com.apm.insight.a.c cVar) {
        o.a(str, bVar, cVar);
    }

    public static void enableAnrInfo(boolean z8) {
        o.b(z8);
    }

    public static void enableLoopMonitor(boolean z8) {
        o.a(z8);
    }

    public static void enableNativeDump(boolean z8) {
        o.d(z8);
    }

    public static void enableThreadsBoost() {
        i.a(1);
    }

    public static ConfigManager getConfigManager() {
        return i.i();
    }

    public static boolean hasCrash() {
        return o.k();
    }

    public static boolean hasCrashWhenJavaCrash() {
        return o.l();
    }

    public static boolean hasCrashWhenNativeCrash() {
        return o.m();
    }

    public static synchronized void init(@NonNull Application application, @NonNull Context context, @NonNull ICommonParams iCommonParams, boolean z8, boolean z9, boolean z10, boolean z11, long j7) {
        synchronized (Npth.class) {
            if (sInit) {
                return;
            }
            sInit = true;
            o.a(application, context, true, true, true, true, j7);
            i.a(application, context, iCommonParams);
            Map<String, Object> a6 = i.a().a();
            MonitorCrash init = MonitorCrash.init(context, String.valueOf(r.a(a6.get("aid"), 4444)), r.a(a6.get("update_version_code"), 0), String.valueOf(a6.get("app_version")));
            if (init != null) {
                init.config().setDeviceId(i.a().d()).setChannel(String.valueOf(a6.get("channel")));
            }
        }
    }

    public static synchronized void initMiniApp(@NonNull Context context, @NonNull ICommonParams iCommonParams) {
        synchronized (Npth.class) {
            i.a(true);
            init(context, iCommonParams, true, false, true, true);
        }
    }

    public static boolean isANREnable() {
        return o.c();
    }

    public static boolean isInit() {
        return sInit;
    }

    public static boolean isJavaCrashEnable() {
        return o.b();
    }

    public static boolean isNativeCrashEnable() {
        return o.d();
    }

    public static boolean isRunning() {
        return o.i();
    }

    public static boolean isStopUpload() {
        return o.n();
    }

    public static void openANRMonitor() {
        o.g();
    }

    public static void openJavaCrashMonitor() {
        o.f();
    }

    public static boolean openNativeCrashMonitor() {
        return o.h();
    }

    public static void registerCrashCallback(ICrashCallback iCrashCallback, CrashType crashType) {
        o.a(iCrashCallback, crashType);
    }

    public static void registerOOMCallback(IOOMCallback iOOMCallback) {
        o.a(iOOMCallback);
    }

    public static void registerSdk(int i9, String str) {
        i.a(i9, str);
    }

    public static void removeAttachLongUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            i.b().b(crashType, attachUserData);
        }
    }

    public static void removeAttachUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            i.b().a(crashType, attachUserData);
        }
    }

    public static void reportDartError(String str) {
        o.a(str);
    }

    @Deprecated
    public static void reportError(String str) {
        o.b(str);
    }

    public static void setAlogFlushAddr(long j7) {
        o.a(j7);
    }

    public static void setAlogFlushV2Addr(long j7) {
        o.b(j7);
    }

    public static void setAlogLogDirAddr(long j7) {
        o.c(j7);
    }

    public static void setAlogWriteAddr(long j7) {
    }

    public static void setAnrInfoFileObserver(String str, f fVar) {
        o.a(str, fVar);
    }

    public static void setApplication(Application application) {
        i.a(application);
    }

    @Deprecated
    public static void setAttachUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            i.b().a(attachUserData, crashType);
        }
    }

    public static void setBusiness(String str) {
        if (str != null) {
            i.a(str);
        }
    }

    public static void setCrashFilter(ICrashFilter iCrashFilter) {
        i.b().a(iCrashFilter);
    }

    public static void setCurProcessName(String str) {
        com.apm.insight.l.a.a(str);
    }

    public static void setEncryptImpl(@NonNull e eVar) {
        o.a(eVar);
    }

    public static void setLogcatImpl(com.apm.insight.runtime.j jVar) {
        o.a(jVar);
    }

    public static void setRequestIntercept(com.apm.insight.k.h hVar) {
        o.a(hVar);
    }

    public static void stopAnr() {
        o.j();
    }

    public static void stopUpload() {
        o.o();
    }

    public static void unregisterCrashCallback(ICrashCallback iCrashCallback, CrashType crashType) {
        o.b(iCrashCallback, crashType);
    }

    public static void unregisterOOMCallback(IOOMCallback iOOMCallback, CrashType crashType) {
        o.a(iOOMCallback, crashType);
    }

    public static synchronized void init(@NonNull Context context, @NonNull ICommonParams iCommonParams) {
        synchronized (Npth.class) {
            init(context, iCommonParams, true, false, false);
        }
    }

    public static synchronized void initMiniApp(@NonNull Context context, @NonNull ICommonParams iCommonParams, int i9, String str) {
        synchronized (Npth.class) {
            i.a(true);
            i.b(i9, str);
            init(context, iCommonParams, true, true, true, true);
        }
    }

    public static void reportDartError(String str, @Nullable Map<? extends String, ? extends String> map, @Nullable Map<String, String> map2, @Nullable g gVar) {
        o.a(str, map, map2, gVar);
    }

    @Deprecated
    public static void reportError(@NonNull Throwable th) {
        o.a(th);
    }

    public static synchronized void init(@NonNull Context context, @NonNull ICommonParams iCommonParams, boolean z8, boolean z9, boolean z10) {
        synchronized (Npth.class) {
            init(context, iCommonParams, z8, z8, z9, z10);
        }
    }

    public static void reportDartError(String str, @Nullable Map<? extends String, ? extends String> map, @Nullable Map<String, String> map2, @Nullable Map<String, String> map3, @Nullable g gVar) {
        o.a(str, map, map2, map3, gVar);
    }

    public static synchronized void init(@NonNull Context context, @NonNull ICommonParams iCommonParams, boolean z8, boolean z9, boolean z10, boolean z11) {
        synchronized (Npth.class) {
            init(context, iCommonParams, z8, z9, z10, z11, 0L);
        }
    }

    public static synchronized void init(@NonNull Context context, @NonNull ICommonParams iCommonParams, boolean z8, boolean z9, boolean z10, boolean z11, long j7) {
        Application application;
        Context context2 = context;
        synchronized (Npth.class) {
            try {
                if (i.h() != null) {
                    application = i.h();
                } else if (context2 instanceof Application) {
                    application = (Application) context2;
                    if (application.getBaseContext() == null) {
                        throw new IllegalArgumentException("The Application passed in when init has not been attached, please pass a attachBaseContext as param and call Npth.setApplication(Application) before init.");
                    }
                } else {
                    application = (Application) context.getApplicationContext();
                    if (application == null) {
                        throw new IllegalArgumentException("Can not get the Application instance since a baseContext was passed in when init, please call Npth.setApplication(Application) before init.");
                    }
                    if (application.getBaseContext() != null) {
                        context2 = application.getBaseContext();
                    }
                }
                init(application, context2, iCommonParams, z8, z9, z10, z11, j7);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class CrashlyticsUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    private final CrashListener crashListener;
    private final Thread.UncaughtExceptionHandler defaultHandler;
    private final AtomicBoolean isHandlingException = new AtomicBoolean(false);
    private final CrashlyticsNativeComponent nativeComponent;
    private final SettingsProvider settingsProvider;

    /* loaded from: classes4.dex */
    public interface CrashListener {
        void onUncaughtException(SettingsProvider settingsProvider, Thread thread, Throwable th);
    }

    public CrashlyticsUncaughtExceptionHandler(CrashListener crashListener, SettingsProvider settingsProvider, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, CrashlyticsNativeComponent crashlyticsNativeComponent) {
        this.crashListener = crashListener;
        this.settingsProvider = settingsProvider;
        this.defaultHandler = uncaughtExceptionHandler;
        this.nativeComponent = crashlyticsNativeComponent;
    }

    private boolean shouldRecordUncaughtException(Thread thread, Throwable th) {
        if (thread == null) {
            Logger.getLogger().e("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (th == null) {
            Logger.getLogger().e("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if (!this.nativeComponent.hasCrashDataForCurrentSession()) {
            return true;
        }
        Logger.getLogger().d("Crashlytics will not record uncaught exception; native crash exists for session.");
        return false;
    }

    public boolean isHandlingException() {
        return this.isHandlingException.get();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        r7.isHandlingException.set(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0055, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        com.google.firebase.crashlytics.internal.Logger.getLogger().d("Completed exception processing, but no default exception handler.");
        java.lang.System.exit(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r7.defaultHandler == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r7.defaultHandler != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        com.google.firebase.crashlytics.internal.Logger.getLogger().d("Completed exception processing. Invoking default exception handler.");
        r7.defaultHandler.uncaughtException(r8, r9);
     */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void uncaughtException(java.lang.Thread r8, java.lang.Throwable r9) {
        /*
            r7 = this;
            java.lang.String r0 = "Completed exception processing, but no default exception handler."
            java.lang.String r1 = "Completed exception processing. Invoking default exception handler."
            java.util.concurrent.atomic.AtomicBoolean r2 = r7.isHandlingException
            r3 = 1
            r2.set(r3)
            r2 = 0
            boolean r4 = r7.shouldRecordUncaughtException(r8, r9)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            if (r4 == 0) goto L1d
            com.google.firebase.crashlytics.internal.common.CrashlyticsUncaughtExceptionHandler$CrashListener r4 = r7.crashListener     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            com.google.firebase.crashlytics.internal.settings.SettingsProvider r5 = r7.settingsProvider     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            r4.onUncaughtException(r5, r8, r9)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            goto L26
        L19:
            r4 = move-exception
            goto L56
        L1b:
            r4 = move-exception
            goto L47
        L1d:
            com.google.firebase.crashlytics.internal.Logger r4 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            java.lang.String r5 = "Uncaught exception will not be recorded by Crashlytics."
            r4.d(r5)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
        L26:
            java.lang.Thread$UncaughtExceptionHandler r4 = r7.defaultHandler
            if (r4 == 0) goto L37
        L2a:
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            r0.d(r1)
            java.lang.Thread$UncaughtExceptionHandler r0 = r7.defaultHandler
            r0.uncaughtException(r8, r9)
            goto L41
        L37:
            com.google.firebase.crashlytics.internal.Logger r8 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            r8.d(r0)
            java.lang.System.exit(r3)
        L41:
            java.util.concurrent.atomic.AtomicBoolean r8 = r7.isHandlingException
            r8.set(r2)
            goto L55
        L47:
            com.google.firebase.crashlytics.internal.Logger r5 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch: java.lang.Throwable -> L19
            java.lang.String r6 = "An error occurred in the uncaught exception handler"
            r5.e(r6, r4)     // Catch: java.lang.Throwable -> L19
            java.lang.Thread$UncaughtExceptionHandler r4 = r7.defaultHandler
            if (r4 == 0) goto L37
            goto L2a
        L55:
            return
        L56:
            java.lang.Thread$UncaughtExceptionHandler r5 = r7.defaultHandler
            if (r5 == 0) goto L67
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            r0.d(r1)
            java.lang.Thread$UncaughtExceptionHandler r0 = r7.defaultHandler
            r0.uncaughtException(r8, r9)
            goto L71
        L67:
            com.google.firebase.crashlytics.internal.Logger r8 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            r8.d(r0)
            java.lang.System.exit(r3)
        L71:
            java.util.concurrent.atomic.AtomicBoolean r8 = r7.isHandlingException
            r8.set(r2)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.CrashlyticsUncaughtExceptionHandler.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}

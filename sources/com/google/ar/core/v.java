package com.google.ar.core;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.exceptions.FatalException;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import java.util.Objects;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class v extends ArCoreApk {
    public static final v m = new v();
    public Exception b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14310c;

    /* renamed from: e, reason: collision with root package name */
    public int f14312e;

    /* renamed from: f, reason: collision with root package name */
    public long f14313f;

    /* renamed from: g, reason: collision with root package name */
    public ArCoreApk.Availability f14314g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f14315h;

    /* renamed from: i, reason: collision with root package name */
    public H f14316i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f14317j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f14318k;
    public int l;

    /* renamed from: a, reason: collision with root package name */
    public final Handler f14309a = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    public boolean f14311d = true;

    public static int d(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.ar.core", 4);
            int i9 = packageInfo.versionCode;
            if (i9 == 0) {
                ServiceInfo[] serviceInfoArr = packageInfo.services;
                if (serviceInfoArr != null) {
                    if (serviceInfoArr.length != 0) {
                        return 0;
                    }
                }
                return -1;
            }
            return i9;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    public final synchronized H a(Context context) {
        try {
            if (this.f14316i == null) {
                H h6 = new H();
                h6.a(context.getApplicationContext());
                this.f14316i = h6;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f14316i;
    }

    public final synchronized void b() {
        try {
            if (this.b == null) {
                this.f14312e = 0;
            }
            this.f14310c = false;
            H h6 = this.f14316i;
            if (h6 != null) {
                h6.b();
                this.f14316i = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c(Context context, s sVar) {
        ArCoreApk.Availability availability;
        try {
            e(context);
            if (d(context) != 0 && d(context) < this.l) {
                if (d(context) != -1) {
                    sVar.a(ArCoreApk.Availability.SUPPORTED_APK_TOO_OLD);
                    return;
                }
                e(context);
                if (this.f14318k) {
                    sVar.a(ArCoreApk.Availability.SUPPORTED_NOT_INSTALLED);
                    return;
                } else {
                    a(context).c(context, sVar);
                    return;
                }
            }
            b();
            try {
                try {
                    if (AbstractC1862h.a(context) != null) {
                        availability = ArCoreApk.Availability.SUPPORTED_APK_TOO_OLD;
                    } else {
                        availability = ArCoreApk.Availability.SUPPORTED_INSTALLED;
                    }
                } catch (UnavailableDeviceNotCompatibleException unused) {
                    availability = ArCoreApk.Availability.UNSUPPORTED_DEVICE_NOT_CAPABLE;
                }
            } catch (UnavailableUserDeclinedInstallationException | RuntimeException unused2) {
                availability = ArCoreApk.Availability.UNKNOWN_ERROR;
            }
            sVar.a(availability);
        } catch (FatalException e4) {
            Log.e("ARCore-ArCoreApk", "Error while checking app details and ARCore status", e4);
            sVar.a(ArCoreApk.Availability.UNKNOWN_ERROR);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021 A[Catch: all -> 0x000c, TryCatch #0 {all -> 0x000c, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x001d, B:10:0x0021, B:12:0x0027, B:13:0x002a, B:16:0x002c, B:18:0x0030, B:19:0x0032, B:21:0x0034, B:22:0x003d, B:24:0x000e, B:26:0x0012), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002c A[Catch: all -> 0x000c, TryCatch #0 {all -> 0x000c, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x001d, B:10:0x0021, B:12:0x0027, B:13:0x002a, B:16:0x002c, B:18:0x0030, B:19:0x0032, B:21:0x0034, B:22:0x003d, B:24:0x000e, B:26:0x0012), top: B:2:0x0001 }] */
    @Override // com.google.ar.core.ArCoreApk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.ar.core.ArCoreApk.Availability checkAvailability(android.content.Context r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.google.ar.core.ArCoreApk$Availability r0 = r1.f14314g     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto Le
            boolean r0 = r0.isUnknown()     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto L1d
            goto Le
        Lc:
            r2 = move-exception
            goto L3f
        Le:
            boolean r0 = r1.f14315h     // Catch: java.lang.Throwable -> Lc
            if (r0 != 0) goto L1d
            r0 = 1
            r1.f14315h = r0     // Catch: java.lang.Throwable -> Lc
            com.google.ar.core.t r0 = new com.google.ar.core.t     // Catch: java.lang.Throwable -> Lc
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc
            r1.c(r2, r0)     // Catch: java.lang.Throwable -> Lc
        L1d:
            com.google.ar.core.ArCoreApk$Availability r2 = r1.f14314g     // Catch: java.lang.Throwable -> Lc
            if (r2 == 0) goto L2c
            boolean r0 = r2.isUnsupported()     // Catch: java.lang.Throwable -> Lc
            if (r0 != 0) goto L2a
            r0 = 0
            r1.f14314g = r0     // Catch: java.lang.Throwable -> Lc
        L2a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            return r2
        L2c:
            boolean r2 = r1.f14315h     // Catch: java.lang.Throwable -> Lc
            if (r2 == 0) goto L34
            com.google.ar.core.ArCoreApk$Availability r2 = com.google.ar.core.ArCoreApk.Availability.UNKNOWN_CHECKING     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            return r2
        L34:
            java.lang.String r2 = "ARCore-ArCoreApk"
            java.lang.String r0 = "request not running but result is null?"
            android.util.Log.e(r2, r0)     // Catch: java.lang.Throwable -> Lc
            com.google.ar.core.ArCoreApk$Availability r2 = com.google.ar.core.ArCoreApk.Availability.UNKNOWN_ERROR     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            return r2
        L3f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ar.core.v.checkAvailability(android.content.Context):com.google.ar.core.ArCoreApk$Availability");
    }

    @Override // com.google.ar.core.ArCoreApk
    public final void checkAvailabilityAsync(Context context, Consumer consumer) {
        c(context, new u(this, consumer));
    }

    public final synchronized void e(Context context) {
        if (this.f14317j) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        try {
            Bundle bundle = packageManager.getApplicationInfo(packageName, 128).metaData;
            if (bundle.containsKey("com.google.ar.core")) {
                String string = bundle.getString("com.google.ar.core");
                Objects.requireNonNull(string);
                this.f14318k = string.equals("required");
                if (bundle.containsKey("com.google.ar.core.min_apk_version")) {
                    this.l = bundle.getInt("com.google.ar.core.min_apk_version");
                    try {
                        ActivityInfo[] activityInfoArr = packageManager.getPackageInfo(packageName, 1).activities;
                        String canonicalName = InstallActivity.class.getCanonicalName();
                        for (ActivityInfo activityInfo : activityInfoArr) {
                            if (canonicalName.equals(activityInfo.name)) {
                                this.f14317j = true;
                                return;
                            }
                        }
                        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 43);
                        sb.append("Application manifest must contain activity ");
                        sb.append(canonicalName);
                        throw new FatalException(sb.toString());
                    } catch (PackageManager.NameNotFoundException e4) {
                        throw new FatalException("Could not load application package info", e4);
                    }
                }
                throw new FatalException("Application manifest must contain meta-data com.google.ar.core.min_apk_version");
            }
            throw new FatalException("Application manifest must contain meta-data com.google.ar.core");
        } catch (PackageManager.NameNotFoundException e9) {
            throw new FatalException("Could not load application package metadata", e9);
        }
    }

    @Override // com.google.ar.core.ArCoreApk
    public final ArCoreApk.InstallStatus requestInstall(Activity activity, boolean z8) {
        ArCoreApk.UserMessageType userMessageType;
        e(activity);
        ArCoreApk.InstallBehavior installBehavior = this.f14318k ? ArCoreApk.InstallBehavior.REQUIRED : ArCoreApk.InstallBehavior.OPTIONAL;
        e(activity);
        if (this.f14318k) {
            userMessageType = ArCoreApk.UserMessageType.APPLICATION;
        } else {
            userMessageType = ArCoreApk.UserMessageType.USER_ALREADY_INFORMED;
        }
        return requestInstall(activity, z8, installBehavior, userMessageType);
    }

    @Override // com.google.ar.core.ArCoreApk
    public final ArCoreApk.InstallStatus requestInstall(Activity activity, boolean z8, ArCoreApk.InstallBehavior installBehavior, ArCoreApk.UserMessageType userMessageType) {
        Bundle bundle;
        ActivityOptions pendingIntentBackgroundActivityStartMode;
        e(activity);
        if (d(activity) == 0 || d(activity) >= this.l) {
            b();
            PendingIntent a6 = AbstractC1862h.a(activity);
            if (a6 != null) {
                try {
                    Log.i("ARCore-ArCoreApk", "Starting setup activity");
                    if (Build.VERSION.SDK_INT > 33) {
                        pendingIntentBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                        bundle = pendingIntentBackgroundActivityStartMode.toBundle();
                    } else {
                        bundle = null;
                    }
                    activity.startIntentSender(a6.getIntentSender(), null, 0, 0, 0, bundle);
                    return ArCoreApk.InstallStatus.INSTALL_REQUESTED;
                } catch (IntentSender.SendIntentException e4) {
                    e = e4;
                    Log.w("ARCore-ArCoreApk", "Setup activity launch failed", e);
                    return ArCoreApk.InstallStatus.INSTALLED;
                } catch (RuntimeException e9) {
                    e = e9;
                    Log.w("ARCore-ArCoreApk", "Setup activity launch failed", e);
                    return ArCoreApk.InstallStatus.INSTALLED;
                }
            }
            return ArCoreApk.InstallStatus.INSTALLED;
        }
        if (!this.f14310c) {
            Exception exc = this.b;
            if (exc != null) {
                if (z8) {
                    Log.w("ARCore-ArCoreApk", "Clearing previous failure: ", exc);
                    this.b = null;
                } else {
                    if (!(exc instanceof UnavailableDeviceNotCompatibleException)) {
                        if (!(exc instanceof UnavailableUserDeclinedInstallationException)) {
                            if (exc instanceof RuntimeException) {
                                Log.e("ARCore-ArCoreApk", "Throwing RuntimeException.");
                                throw ((RuntimeException) exc);
                            }
                            throw new RuntimeException("Unexpected exception type", exc);
                        }
                        Log.e("ARCore-ArCoreApk", "Throwing UnavailableUserDeclinedInstallationException");
                        throw ((UnavailableUserDeclinedInstallationException) exc);
                    }
                    Log.e("ARCore-ArCoreApk", "Throwing UnavailableDeviceNotCompatibleException");
                    throw ((UnavailableDeviceNotCompatibleException) exc);
                }
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            if (uptimeMillis - this.f14313f > DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS) {
                this.f14312e = 0;
            }
            int i9 = this.f14312e + 1;
            this.f14312e = i9;
            this.f14313f = uptimeMillis;
            if (i9 <= 2) {
                try {
                    activity.startActivity(new Intent(activity, (Class<?>) InstallActivity.class).putExtra("message", userMessageType).putExtra("behavior", installBehavior));
                    this.f14310c = true;
                    return ArCoreApk.InstallStatus.INSTALL_REQUESTED;
                } catch (ActivityNotFoundException e10) {
                    throw new FatalException("Failed to launch InstallActivity.", e10);
                }
            }
            throw new FatalException("Requesting ARCore installation too rapidly.");
        }
        return ArCoreApk.InstallStatus.INSTALL_REQUESTED;
    }
}

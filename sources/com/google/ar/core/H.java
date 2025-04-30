package com.google.ar.core;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.util.Log;
import com.facebook.internal.C1835d;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.exceptions.FatalException;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class H {
    public Context b;

    /* renamed from: c, reason: collision with root package name */
    public com.google.ar.core.dependencies.h f14265c;

    /* renamed from: e, reason: collision with root package name */
    public C1835d f14267e;

    /* renamed from: f, reason: collision with root package name */
    public Activity f14268f;

    /* renamed from: g, reason: collision with root package name */
    public PackageInstaller f14269g;

    /* renamed from: h, reason: collision with root package name */
    public C1857c f14270h;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f14264a = new ArrayDeque();

    /* renamed from: i, reason: collision with root package name */
    public volatile int f14271i = 1;

    /* renamed from: d, reason: collision with root package name */
    public final I f14266d = new I(this);

    public static void e(Activity activity, B3.e eVar) {
        boolean z8;
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.ar.core"));
            v vVar = v.m;
            Iterator<ResolveInfo> it = activity.getPackageManager().queryIntentActivities(intent, 65536).iterator();
            while (true) {
                if (it.hasNext()) {
                    ActivityInfo activityInfo = it.next().activityInfo;
                    if (activityInfo != null && activityInfo.name.equals("com.sec.android.app.samsungapps.MainForChina")) {
                        z8 = true;
                        break;
                    }
                } else {
                    z8 = false;
                    break;
                }
            }
            vVar.f14311d = !z8;
            activity.startActivity(intent);
        } catch (ActivityNotFoundException e4) {
            eVar.c(new FatalException("Failed to launch installer.", e4));
        }
    }

    public final synchronized void a(Context context) {
        this.b = context;
        if (context.bindService(new Intent("com.google.android.play.core.install.BIND_INSTALL_SERVICE").setPackage("com.android.vending"), this.f14266d, 1)) {
            this.f14271i = 2;
            return;
        }
        this.f14271i = 1;
        this.b = null;
        Log.w("ARCore-InstallService", "bindService returned false.");
        context.unbindService(this.f14266d);
    }

    public final synchronized void b() {
        try {
            int i9 = this.f14271i;
            int i10 = i9 - 1;
            if (i9 != 0) {
                if (i10 == 1 || i10 == 2) {
                    this.b.unbindService(this.f14266d);
                    this.b = null;
                    this.f14271i = 1;
                }
                C1835d c1835d = this.f14267e;
                if (c1835d != null) {
                    this.f14268f.unregisterReceiver(c1835d);
                }
                C1857c c1857c = this.f14270h;
                if (c1857c != null) {
                    this.f14269g.unregisterSessionCallback(c1857c);
                    this.f14270h = null;
                    return;
                }
                return;
            }
            throw null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(Context context, s sVar) {
        try {
            d(new RunnableC1856b(this, context, sVar));
        } catch (C1859e unused) {
            Log.e("ARCore-InstallService", "Play Store install service could not be bound.");
            sVar.a(ArCoreApk.Availability.UNKNOWN_ERROR);
        }
    }

    public final synchronized void d(Runnable runnable) {
        int i9 = this.f14271i;
        int i10 = i9 - 1;
        if (i9 != 0) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        return;
                    }
                    runnable.run();
                    return;
                }
                this.f14264a.offer(runnable);
                return;
            }
            throw new Exception("InstallService not bound");
        }
        throw null;
    }
}

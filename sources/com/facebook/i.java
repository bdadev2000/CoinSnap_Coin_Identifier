package com.facebook;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.List;

/* loaded from: classes.dex */
public final class i {
    public String a;

    /* renamed from: b, reason: collision with root package name */
    public String f11014b;

    /* renamed from: c, reason: collision with root package name */
    public int f11015c;

    /* renamed from: d, reason: collision with root package name */
    public int f11016d;

    /* renamed from: e, reason: collision with root package name */
    public Object f11017e;

    public i() {
    }

    public i(Context context) {
        this.f11016d = 0;
        this.f11017e = context;
    }

    public static String a(va.g gVar) {
        gVar.a();
        String str = gVar.f26389c.f26409e;
        if (str != null) {
            return str;
        }
        gVar.a();
        String str2 = gVar.f26389c.f26406b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public final PackageInfo b(String str) {
        try {
            return ((Context) this.f11017e).getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e2) {
            Log.w("FirebaseMessaging", "Failed to find package " + e2);
            return null;
        }
    }

    public final boolean c() {
        int i10;
        synchronized (this) {
            i10 = this.f11016d;
            if (i10 == 0) {
                PackageManager packageManager = ((Context) this.f11017e).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i10 = 0;
                } else {
                    if (!PlatformVersion.isAtLeastO()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null && queryIntentServices.size() > 0) {
                            this.f11016d = 1;
                            i10 = 1;
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
                        this.f11016d = 2;
                        i10 = 2;
                    } else {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        if (PlatformVersion.isAtLeastO()) {
                            this.f11016d = 2;
                        } else {
                            this.f11016d = 1;
                        }
                        i10 = this.f11016d;
                    }
                }
            }
        }
        if (i10 != 0) {
            return true;
        }
        return false;
    }

    public final synchronized void d() {
        PackageInfo b3 = b(((Context) this.f11017e).getPackageName());
        if (b3 != null) {
            this.a = Integer.toString(b3.versionCode);
            this.f11014b = b3.versionName;
        }
    }
}

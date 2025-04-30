package U4;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import g4.C2296f;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public Serializable f3324a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int f3325c;

    /* renamed from: d, reason: collision with root package name */
    public Serializable f3326d;

    /* renamed from: e, reason: collision with root package name */
    public Object f3327e;

    public static String b(C2296f c2296f) {
        c2296f.a();
        g4.i iVar = c2296f.f20434c;
        String str = iVar.f20449e;
        if (str != null) {
            return str;
        }
        c2296f.a();
        String str2 = iVar.b;
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

    public synchronized String a() {
        try {
            if (((String) this.f3324a) == null) {
                e();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.f3324a;
    }

    public PackageInfo c(String str) {
        try {
            return ((Context) this.f3327e).getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e4) {
            Log.w("FirebaseMessaging", "Failed to find package " + e4);
            return null;
        }
    }

    public boolean d() {
        int i9;
        synchronized (this) {
            i9 = this.f3325c;
            if (i9 == 0) {
                PackageManager packageManager = ((Context) this.f3327e).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i9 = 0;
                } else {
                    if (!PlatformVersion.isAtLeastO()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null && queryIntentServices.size() > 0) {
                            this.f3325c = 1;
                            i9 = 1;
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
                        this.f3325c = 2;
                        i9 = 2;
                    } else {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        if (PlatformVersion.isAtLeastO()) {
                            this.f3325c = 2;
                        } else {
                            this.f3325c = 1;
                        }
                        i9 = this.f3325c;
                    }
                }
            }
        }
        if (i9 != 0) {
            return true;
        }
        return false;
    }

    public synchronized void e() {
        PackageInfo c9 = c(((Context) this.f3327e).getPackageName());
        if (c9 != null) {
            this.f3324a = Integer.toString(c9.versionCode);
            this.f3326d = c9.versionName;
        }
    }
}

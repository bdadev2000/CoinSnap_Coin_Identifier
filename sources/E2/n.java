package E2;

import a5.C0398b;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.H;
import com.facebook.N;
import com.facebook.appevents.o;
import com.facebook.internal.z;
import com.facebook.r;
import y2.AbstractC2947c;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f1005a = new Object();
    public static final long[] b = {300000, 900000, 1800000, 3600000, 21600000, 43200000, com.vungle.ads.internal.signals.j.TWENTY_FOUR_HOURS_MILLIS, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    public static final void b(Context context, String str, String str2) {
        if (O2.a.b(n.class)) {
            return;
        }
        try {
            G7.j.e(context, "context");
            Bundle bundle = new Bundle();
            bundle.putString("fb_mobile_launch_source", "Unclassified");
            bundle.putString("fb_mobile_pckg_fp", f1005a.a(context));
            bundle.putString("fb_mobile_app_cert_hash", AbstractC2947c.k(context));
            com.facebook.appevents.l lVar = new com.facebook.appevents.l(str, str2);
            r rVar = r.f13801a;
            if (N.b()) {
                lVar.d(bundle, "fb_mobile_activate_app");
            }
            String str3 = com.facebook.appevents.l.f13492c;
            if (C0398b.u() != com.facebook.appevents.j.f13488c && !O2.a.b(lVar)) {
                try {
                    D0.i iVar = com.facebook.appevents.h.f13483a;
                    com.facebook.appevents.h.c(o.b);
                } catch (Throwable th) {
                    O2.a.a(lVar, th);
                }
            }
        } catch (Throwable th2) {
            O2.a.a(n.class, th2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[Catch: all -> 0x0028, TryCatch #2 {all -> 0x0028, blocks: (B:8:0x000f, B:10:0x0015, B:11:0x0019, B:14:0x0023, B:15:0x002b, B:17:0x002f, B:20:0x0034, B:23:0x0043, B:24:0x0047, B:40:0x0076, B:41:0x0079, B:44:0x0093, B:48:0x009b, B:51:0x00ad, B:53:0x00cc, B:60:0x00e2, B:65:0x00a9, B:56:0x00d3, B:29:0x0062, B:31:0x0068), top: B:7:0x000f, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a9 A[Catch: all -> 0x0028, TryCatch #2 {all -> 0x0028, blocks: (B:8:0x000f, B:10:0x0015, B:11:0x0019, B:14:0x0023, B:15:0x002b, B:17:0x002f, B:20:0x0034, B:23:0x0043, B:24:0x0047, B:40:0x0076, B:41:0x0079, B:44:0x0093, B:48:0x009b, B:51:0x00ad, B:53:0x00cc, B:60:0x00e2, B:65:0x00a9, B:56:0x00d3, B:29:0x0062, B:31:0x0068), top: B:7:0x000f, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(java.lang.String r17, E2.m r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: E2.n.d(java.lang.String, E2.m, java.lang.String):void");
    }

    public final String a(Context context) {
        if (O2.a.b(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            String j7 = G7.j.j(packageManager.getPackageInfo(context.getPackageName(), 0).versionName, "PCKGCHKSUM;");
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            String string = sharedPreferences.getString(j7, null);
            if (string != null && string.length() == 32) {
                return string;
            }
            String b8 = l.b(context);
            if (b8 == null) {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
                G7.j.d(applicationInfo, "pm.getApplicationInfo(context.packageName, 0)");
                b8 = l.a(applicationInfo.sourceDir);
            }
            sharedPreferences.edit().putString(j7, b8).apply();
            return b8;
        } catch (Exception unused) {
            return null;
        } catch (Throwable th) {
            O2.a.a(this, th);
            return null;
        }
    }

    public final void c() {
        if (O2.a.b(this)) {
            return;
        }
        try {
            L4.f fVar = z.f13680c;
            L4.f.l(H.f13413f, "E2.n", "Clock skew detected");
        } catch (Throwable th) {
            O2.a.a(this, th);
        }
    }
}

package c6;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.facebook.appevents.p;
import com.facebook.appevents.r;
import com.facebook.u0;
import com.facebook.x;
import kotlin.jvm.internal.Intrinsics;
import w3.e0;
import w3.o;
import wh.y0;

/* loaded from: classes3.dex */
public class m implements k1.b, h4.d, ni.l, e0 {

    /* renamed from: b, reason: collision with root package name */
    public static final m f2664b = new m();

    /* renamed from: c, reason: collision with root package name */
    public static final long[] f2665c = {300000, 900000, 1800000, 3600000, 21600000, 43200000, com.vungle.ads.internal.signals.j.TWENTY_FOUR_HOURS_MILLIS, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    /* renamed from: d, reason: collision with root package name */
    public static final m f2666d = new m();

    /* renamed from: f, reason: collision with root package name */
    public static final m f2667f = new m();

    /* renamed from: g, reason: collision with root package name */
    public static final m f2668g = new m();

    public static final void h(String activityName, String str, Context context) {
        if (m6.a.b(m.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            Intrinsics.checkNotNullParameter(context, "context");
            Bundle bundle = new Bundle();
            bundle.putString("fb_mobile_launch_source", "Unclassified");
            bundle.putString("fb_mobile_pckg_fp", f2664b.g(context));
            bundle.putString("fb_mobile_app_cert_hash", mi.a.f(context));
            com.facebook.c cVar = r.f10969b;
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            r rVar = new r(new com.facebook.appevents.l(activityName, str));
            x xVar = x.a;
            boolean b3 = u0.b();
            com.facebook.appevents.l lVar = rVar.a;
            if (b3) {
                lVar.d(bundle, "fb_mobile_activate_app");
            }
            if (cVar.r() != com.facebook.appevents.j.EXPLICIT_ONLY) {
                lVar.getClass();
                if (!m6.a.b(lVar)) {
                    try {
                        kc.c cVar2 = com.facebook.appevents.h.a;
                        com.facebook.appevents.h.c(p.EXPLICIT);
                    } catch (Throwable th2) {
                        m6.a.a(lVar, th2);
                    }
                }
            }
        } catch (Throwable th3) {
            m6.a.a(m.class, th3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d5, code lost:
    
        if (r0 != null) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006b A[Catch: all -> 0x0111, TRY_LEAVE, TryCatch #1 {all -> 0x0111, blocks: (B:6:0x000f, B:9:0x0015, B:11:0x001b, B:13:0x0021, B:16:0x002b, B:19:0x003e, B:26:0x004f, B:27:0x0053, B:29:0x0057, B:32:0x005c, B:35:0x006b, B:42:0x007c, B:43:0x0080, B:55:0x00b5, B:59:0x00d9, B:62:0x00eb, B:65:0x00e7, B:66:0x00d1, B:71:0x00b1, B:74:0x0027, B:75:0x002e, B:48:0x00a0, B:50:0x00a6, B:39:0x0072, B:23:0x0045), top: B:5:0x000f, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e7 A[Catch: all -> 0x0111, TryCatch #1 {all -> 0x0111, blocks: (B:6:0x000f, B:9:0x0015, B:11:0x001b, B:13:0x0021, B:16:0x002b, B:19:0x003e, B:26:0x004f, B:27:0x0053, B:29:0x0057, B:32:0x005c, B:35:0x006b, B:42:0x007c, B:43:0x0080, B:55:0x00b5, B:59:0x00d9, B:62:0x00eb, B:65:0x00e7, B:66:0x00d1, B:71:0x00b1, B:74:0x0027, B:75:0x002e, B:48:0x00a0, B:50:0x00a6, B:39:0x0072, B:23:0x0045), top: B:5:0x000f, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d1 A[Catch: all -> 0x0111, TRY_LEAVE, TryCatch #1 {all -> 0x0111, blocks: (B:6:0x000f, B:9:0x0015, B:11:0x001b, B:13:0x0021, B:16:0x002b, B:19:0x003e, B:26:0x004f, B:27:0x0053, B:29:0x0057, B:32:0x005c, B:35:0x006b, B:42:0x007c, B:43:0x0080, B:55:0x00b5, B:59:0x00d9, B:62:0x00eb, B:65:0x00e7, B:66:0x00d1, B:71:0x00b1, B:74:0x0027, B:75:0x002e, B:48:0x00a0, B:50:0x00a6, B:39:0x0072, B:23:0x0045), top: B:5:0x000f, inners: #0, #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void i(java.lang.String r20, c6.l r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.m.i(java.lang.String, c6.l, java.lang.String):void");
    }

    @Override // h4.d
    public void a(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // h4.d
    public Bitmap b(int i10, int i11, Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // h4.d
    public Bitmap c(int i10, int i11, Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // ni.l
    public Object convert(Object obj) {
        y0 y0Var = (y0) obj;
        try {
            ki.i iVar = new ki.i();
            y0Var.source().l(iVar);
            return y0.create(y0Var.contentType(), y0Var.contentLength(), iVar);
        } finally {
            y0Var.close();
        }
    }

    @Override // h4.d
    public void d(int i10) {
    }

    @Override // h4.d
    public void e() {
    }

    @Override // w3.e0
    public Object f(x3.b bVar, float f10) {
        return Float.valueOf(o.d(bVar) * f10);
    }

    public String g(Context context) {
        if (m6.a.b(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            String stringPlus = Intrinsics.stringPlus("PCKGCHKSUM;", packageManager.getPackageInfo(context.getPackageName(), 0).versionName);
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            String string = sharedPreferences.getString(stringPlus, null);
            if (string != null && string.length() == 32) {
                return string;
            }
            String i10 = k.i(context);
            if (i10 == null) {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
                Intrinsics.checkNotNullExpressionValue(applicationInfo, "pm.getApplicationInfo(context.packageName, 0)");
                i10 = k.h(applicationInfo.sourceDir);
            }
            sharedPreferences.edit().putString(stringPlus, i10).apply();
            return i10;
        } catch (Exception unused) {
            return null;
        } catch (Throwable th2) {
            m6.a.a(this, th2);
            return null;
        }
    }
}

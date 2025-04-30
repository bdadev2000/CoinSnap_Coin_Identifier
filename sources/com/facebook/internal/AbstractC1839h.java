package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import com.facebook.C1849l;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import u7.AbstractC2815f;
import u7.AbstractC2829t;
import x0.AbstractC2914a;

/* renamed from: com.facebook.internal.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1839h {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f13614a = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};
    public static final /* synthetic */ int b = 0;

    public static p a(int i9) {
        p[] valuesCustom = p.valuesCustom();
        int length = valuesCustom.length;
        int i10 = 0;
        while (i10 < length) {
            p pVar = valuesCustom[i10];
            i10++;
            if (pVar.b == i9) {
                return pVar;
            }
        }
        return p.Unknown;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d2 A[Catch: all -> 0x00e8, Exception -> 0x00eb, TryCatch #8 {Exception -> 0x00eb, all -> 0x00e8, blocks: (B:30:0x00c4, B:32:0x00d2, B:34:0x00d6, B:37:0x00ed, B:39:0x0107, B:41:0x0116, B:43:0x0137, B:47:0x0149, B:49:0x014d, B:51:0x0156, B:74:0x013f, B:76:0x0120, B:78:0x012f, B:80:0x01b8, B:81:0x01bf), top: B:29:0x00c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0149 A[Catch: all -> 0x00e8, Exception -> 0x00eb, TryCatch #8 {Exception -> 0x00eb, all -> 0x00e8, blocks: (B:30:0x00c4, B:32:0x00d2, B:34:0x00d6, B:37:0x00ed, B:39:0x0107, B:41:0x0116, B:43:0x0137, B:47:0x0149, B:49:0x014d, B:51:0x0156, B:74:0x013f, B:76:0x0120, B:78:0x012f, B:80:0x01b8, B:81:0x01bf), top: B:29:0x00c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014d A[Catch: all -> 0x00e8, Exception -> 0x00eb, TryCatch #8 {Exception -> 0x00eb, all -> 0x00e8, blocks: (B:30:0x00c4, B:32:0x00d2, B:34:0x00d6, B:37:0x00ed, B:39:0x0107, B:41:0x0116, B:43:0x0137, B:47:0x0149, B:49:0x014d, B:51:0x0156, B:74:0x013f, B:76:0x0120, B:78:0x012f, B:80:0x01b8, B:81:0x01bf), top: B:29:0x00c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0156 A[Catch: all -> 0x00e8, Exception -> 0x00eb, TRY_LEAVE, TryCatch #8 {Exception -> 0x00eb, all -> 0x00e8, blocks: (B:30:0x00c4, B:32:0x00d2, B:34:0x00d6, B:37:0x00ed, B:39:0x0107, B:41:0x0116, B:43:0x0137, B:47:0x0149, B:49:0x014d, B:51:0x0156, B:74:0x013f, B:76:0x0120, B:78:0x012f, B:80:0x01b8, B:81:0x01bf), top: B:29:0x00c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013f A[Catch: all -> 0x00e8, Exception -> 0x00eb, TryCatch #8 {Exception -> 0x00eb, all -> 0x00e8, blocks: (B:30:0x00c4, B:32:0x00d2, B:34:0x00d6, B:37:0x00ed, B:39:0x0107, B:41:0x0116, B:43:0x0137, B:47:0x0149, B:49:0x014d, B:51:0x0156, B:74:0x013f, B:76:0x0120, B:78:0x012f, B:80:0x01b8, B:81:0x01bf), top: B:29:0x00c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b8 A[Catch: all -> 0x00e8, Exception -> 0x00eb, TRY_ENTER, TryCatch #8 {Exception -> 0x00eb, all -> 0x00e8, blocks: (B:30:0x00c4, B:32:0x00d2, B:34:0x00d6, B:37:0x00ed, B:39:0x0107, B:41:0x0116, B:43:0x0137, B:47:0x0149, B:49:0x014d, B:51:0x0156, B:74:0x013f, B:76:0x0120, B:78:0x012f, B:80:0x01b8, B:81:0x01bf), top: B:29:0x00c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d1  */
    /* JADX WARN: Type inference failed for: r16v0, types: [android.content.Context, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, com.facebook.internal.c] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.facebook.internal.c] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, com.facebook.internal.c] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.internal.C1834c b(android.content.Context r16) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.AbstractC1839h.b(android.content.Context):com.facebook.internal.c");
    }

    public static final String c() {
        if (O2.a.b(AbstractC1839h.class)) {
            return null;
        }
        try {
            Context a6 = com.facebook.r.a();
            List<ResolveInfo> queryIntentServices = a6.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
            G7.j.d(queryIntentServices, "context.packageManager.queryIntentServices(serviceIntent, 0)");
            String[] strArr = f13614a;
            HashSet hashSet = new HashSet(AbstractC2829t.Y(3));
            AbstractC2815f.C(strArr, hashSet);
            Iterator<ResolveInfo> it = queryIntentServices.iterator();
            while (it.hasNext()) {
                ServiceInfo serviceInfo = it.next().serviceInfo;
                if (serviceInfo != null && hashSet.contains(serviceInfo.packageName)) {
                    return serviceInfo.packageName;
                }
            }
            return null;
        } catch (Throwable th) {
            O2.a.a(AbstractC1839h.class, th);
            return null;
        }
    }

    public static final String d() {
        if (O2.a.b(AbstractC1839h.class)) {
            return null;
        }
        try {
            return G7.j.j(com.facebook.r.a().getPackageName(), "fbconnect://cct.");
        } catch (Throwable th) {
            O2.a.a(AbstractC1839h.class, th);
            return null;
        }
    }

    public static final String e(String str) {
        if (O2.a.b(AbstractC1839h.class)) {
            return null;
        }
        try {
            G7.j.e(str, "developerDefinedRedirectURI");
            if (f(com.facebook.r.a(), str)) {
                return str;
            }
            if (f(com.facebook.r.a(), d())) {
                return d();
            }
            return "";
        } catch (Throwable th) {
            O2.a.a(AbstractC1839h.class, th);
            return null;
        }
    }

    public static final boolean f(Context context, String str) {
        List<ResolveInfo> list;
        G7.j.e(str, "redirectURI");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse(str));
            list = packageManager.queryIntentActivities(intent, 64);
        } else {
            list = null;
        }
        if (list == null) {
            return false;
        }
        Iterator<ResolveInfo> it = list.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (!G7.j.a(activityInfo.name, "com.facebook.CustomTabActivity") || !G7.j.a(activityInfo.packageName, context.getPackageName())) {
                return false;
            }
            z8 = true;
        }
        return z8;
    }

    public static boolean g(Context context) {
        Method t9 = H.t("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (t9 == null) {
            return false;
        }
        Object w2 = H.w(null, t9, context);
        if (!(w2 instanceof Integer) || !G7.j.a(w2, 0)) {
            return false;
        }
        return true;
    }

    public static final void h(String str, String str2) {
        G7.j.e(str, "arg");
        if (str.length() > 0) {
        } else {
            throw new IllegalArgumentException(AbstractC2914a.e("Argument '", str2, "' cannot be empty").toString());
        }
    }

    public static final void i(Collection collection) {
        G7.j.e(collection, "container");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new NullPointerException("Container 'requests' cannot contain null values");
            }
        }
        if (!collection.isEmpty()) {
        } else {
            throw new IllegalArgumentException("Container 'requests' cannot be empty".toString());
        }
    }

    public static final void j(String str, String str2) {
        if (str != null && str.length() > 0) {
        } else {
            throw new IllegalArgumentException(AbstractC2914a.e("Argument '", str2, "' cannot be null or empty").toString());
        }
    }

    public static final void k() {
        if (com.facebook.r.f13812o.get()) {
        } else {
            throw new C1849l("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }
}

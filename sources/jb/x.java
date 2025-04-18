package jb;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class x implements y {

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f19966g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h, reason: collision with root package name */
    public static final String f19967h = Pattern.quote("/");
    public final a4.a a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f19968b;

    /* renamed from: c, reason: collision with root package name */
    public final String f19969c;

    /* renamed from: d, reason: collision with root package name */
    public final dc.e f19970d;

    /* renamed from: e, reason: collision with root package name */
    public final t f19971e;

    /* renamed from: f, reason: collision with root package name */
    public b f19972f;

    public x(Context context, String str, dc.e eVar, t tVar) {
        if (str != null) {
            this.f19968b = context;
            this.f19969c = str;
            this.f19970d = eVar;
            this.f19971e = tVar;
            this.a = new a4.a();
            return;
        }
        throw new IllegalArgumentException("appIdentifier must not be null");
    }

    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = f19966g.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        b6.a.f2288f.h("Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(7:13|14|4|5|6|7|8)|3|4|5|6|7|8) */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        r0.i("Error getting Firebase installation id.", r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final jb.w b(boolean r7) {
        /*
            r6 = this;
            kb.b r0 = new kb.b
            r1 = 2
            r0.<init>(r1)
            b6.c r1 = b6.c.f2302g
            kb.c.a(r0, r1)
            b6.a r0 = b6.a.f2288f
            r1 = 10000(0x2710, double:4.9407E-320)
            dc.e r3 = r6.f19970d
            r4 = 0
            if (r7 == 0) goto L2c
            r7 = r3
            dc.d r7 = (dc.d) r7     // Catch: java.lang.Exception -> L26
            com.google.android.gms.tasks.Task r7 = r7.d()     // Catch: java.lang.Exception -> L26
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> L26
            java.lang.Object r7 = com.google.android.gms.tasks.Tasks.await(r7, r1, r5)     // Catch: java.lang.Exception -> L26
            dc.a r7 = (dc.a) r7     // Catch: java.lang.Exception -> L26
            java.lang.String r7 = r7.a     // Catch: java.lang.Exception -> L26
            goto L2d
        L26:
            r7 = move-exception
            java.lang.String r5 = "Error getting Firebase authentication token."
            r0.i(r5, r7)
        L2c:
            r7 = r4
        L2d:
            dc.d r3 = (dc.d) r3     // Catch: java.lang.Exception -> L3d
            com.google.android.gms.tasks.Task r3 = r3.c()     // Catch: java.lang.Exception -> L3d
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> L3d
            java.lang.Object r1 = com.google.android.gms.tasks.Tasks.await(r3, r1, r5)     // Catch: java.lang.Exception -> L3d
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L3d
            r4 = r1
            goto L43
        L3d:
            r1 = move-exception
            java.lang.String r2 = "Error getting Firebase installation id."
            r0.i(r2, r1)
        L43:
            jb.w r0 = new jb.w
            r0.<init>(r4, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jb.x.b(boolean):jb.w");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f A[Catch: all -> 0x0084, TRY_LEAVE, TryCatch #0 {all -> 0x0084, blocks: (B:4:0x0007, B:6:0x000d, B:8:0x0011, B:13:0x001f, B:17:0x0023, B:19:0x0050, B:21:0x0069, B:23:0x006d, B:24:0x0088, B:26:0x008b, B:28:0x0093, B:29:0x00f3, B:32:0x00a5, B:34:0x00b9, B:38:0x00c4, B:39:0x00d2), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0023 A[Catch: all -> 0x0084, TRY_ENTER, TryCatch #0 {all -> 0x0084, blocks: (B:4:0x0007, B:6:0x000d, B:8:0x0011, B:13:0x001f, B:17:0x0023, B:19:0x0050, B:21:0x0069, B:23:0x006d, B:24:0x0088, B:26:0x008b, B:28:0x0093, B:29:0x00f3, B:32:0x00a5, B:34:0x00b9, B:38:0x00c4, B:39:0x00d2), top: B:3:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized jb.b c() {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jb.x.c():jb.b");
    }

    public final String d() {
        String str;
        a4.a aVar = this.a;
        Context context = this.f19968b;
        synchronized (aVar) {
            if (aVar.f77b == null) {
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName == null) {
                    installerPackageName = "";
                }
                aVar.f77b = installerPackageName;
            }
            if ("".equals(aVar.f77b)) {
                str = null;
            } else {
                str = aVar.f77b;
            }
        }
        return str;
    }
}

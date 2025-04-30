package u4;

import J1.C0208a;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.regex.Pattern;

/* renamed from: u4.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2778w implements InterfaceC2779x {

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f23178g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h, reason: collision with root package name */
    public static final String f23179h = Pattern.quote("/");

    /* renamed from: a, reason: collision with root package name */
    public final C0208a f23180a;
    public final Context b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23181c;

    /* renamed from: d, reason: collision with root package name */
    public final O4.e f23182d;

    /* renamed from: e, reason: collision with root package name */
    public final J1.B f23183e;

    /* renamed from: f, reason: collision with root package name */
    public C2757b f23184f;

    /* JADX WARN: Type inference failed for: r1v3, types: [J1.a, java.lang.Object] */
    public C2778w(Context context, String str, O4.e eVar, J1.B b) {
        if (context != null) {
            if (str != null) {
                this.b = context;
                this.f23181c = str;
                this.f23182d = eVar;
                this.f23183e = b;
                this.f23180a = new Object();
                return;
            }
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        throw new IllegalArgumentException("appContext must not be null");
    }

    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = f23178g.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(7:13|14|4|5|6|7|8)|3|4|5|6|7|8) */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        android.util.Log.w("FirebaseCrashlytics", "Error getting Firebase installation id.", r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final u4.C2777v b(boolean r5) {
        /*
            r4 = this;
            java.lang.String r0 = "FirebaseCrashlytics"
            O4.e r1 = r4.f23182d
            r2 = 0
            if (r5 == 0) goto L1d
            r5 = r1
            O4.d r5 = (O4.d) r5     // Catch: java.lang.Exception -> L17
            com.google.android.gms.tasks.Task r5 = r5.d()     // Catch: java.lang.Exception -> L17
            java.lang.Object r5 = u4.AbstractC2755B.a(r5)     // Catch: java.lang.Exception -> L17
            O4.a r5 = (O4.a) r5     // Catch: java.lang.Exception -> L17
            java.lang.String r5 = r5.f2177a     // Catch: java.lang.Exception -> L17
            goto L1e
        L17:
            r5 = move-exception
            java.lang.String r3 = "Error getting Firebase authentication token."
            android.util.Log.w(r0, r3, r5)
        L1d:
            r5 = r2
        L1e:
            O4.d r1 = (O4.d) r1     // Catch: java.lang.Exception -> L2c
            com.google.android.gms.tasks.Task r1 = r1.c()     // Catch: java.lang.Exception -> L2c
            java.lang.Object r1 = u4.AbstractC2755B.a(r1)     // Catch: java.lang.Exception -> L2c
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L2c
            r2 = r1
            goto L32
        L2c:
            r1 = move-exception
            java.lang.String r3 = "Error getting Firebase installation id."
            android.util.Log.w(r0, r3, r1)
        L32:
            u4.v r0 = new u4.v
            r0.<init>(r2, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.C2778w.b(boolean):u4.v");
    }

    public final synchronized C2757b c() {
        String str;
        C2757b c2757b = this.f23184f;
        if (c2757b != null && (c2757b.b != null || !this.f23183e.c())) {
            return this.f23184f;
        }
        r4.d dVar = r4.d.f22842a;
        dVar.f("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        dVar.f("Cached Firebase Installation ID: " + string);
        if (this.f23183e.c()) {
            C2777v b = b(false);
            dVar.f("Fetched Firebase Installation ID: " + b.f23177a);
            if (b.f23177a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                b = new C2777v(str, null);
            }
            if (Objects.equals(b.f23177a, string)) {
                this.f23184f = new C2757b(sharedPreferences.getString("crashlytics.installation.id", null), b.f23177a, b.b);
            } else {
                this.f23184f = new C2757b(a(sharedPreferences, b.f23177a), b.f23177a, b.b);
            }
        } else if (string != null && string.startsWith("SYN_")) {
            this.f23184f = new C2757b(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        } else {
            this.f23184f = new C2757b(a(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), null, null);
        }
        dVar.f("Install IDs: " + this.f23184f);
        return this.f23184f;
    }

    public final String d() {
        String str;
        C0208a c0208a = this.f23180a;
        Context context = this.b;
        synchronized (c0208a) {
            try {
                if (c0208a.b == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    c0208a.b = installerPackageName;
                }
                if ("".equals(c0208a.b)) {
                    str = null;
                } else {
                    str = c0208a.b;
                }
            } finally {
            }
        }
        return str;
    }
}

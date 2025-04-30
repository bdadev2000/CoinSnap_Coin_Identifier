package J1;

import Q7.n0;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import g4.C2296f;
import i8.C;
import i8.C2365b;
import i8.G;
import i8.H;
import java.io.IOException;
import p1.C2537a;
import p8.C2573a;
import p8.E;
import p8.EnumC2574b;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1487a;
    public final Object b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1488c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1489d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1490e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f1491f;

    public B(Context context, C2537a c2537a, y yVar) {
        this.b = context;
        this.f1488c = c2537a;
        this.f1489d = yVar;
        this.f1490e = new A(this, true);
        this.f1491f = new A(this, false);
    }

    public IOException a(boolean z8, boolean z9, IOException iOException) {
        if (iOException != null) {
            f(iOException);
        }
        C2365b c2365b = (C2365b) this.f1488c;
        m8.i iVar = (m8.i) this.b;
        if (z9) {
            if (iOException != null) {
                c2365b.getClass();
                G7.j.e(iVar, NotificationCompat.CATEGORY_CALL);
            } else {
                c2365b.getClass();
                G7.j.e(iVar, NotificationCompat.CATEGORY_CALL);
            }
        }
        if (z8) {
            if (iOException != null) {
                c2365b.getClass();
                G7.j.e(iVar, NotificationCompat.CATEGORY_CALL);
            } else {
                c2365b.getClass();
                G7.j.e(iVar, NotificationCompat.CATEGORY_CALL);
            }
        }
        return iVar.g(this, z9, z8, iOException);
    }

    public m8.c b(C c9, boolean z8) {
        G7.j.e(c9, com.vungle.ads.internal.ui.i.REQUEST_KEY_EXTRA);
        this.f1487a = z8;
        G g9 = c9.f20756d;
        G7.j.b(g9);
        long contentLength = g9.contentLength();
        ((C2365b) this.f1488c).getClass();
        G7.j.e((m8.i) this.b, NotificationCompat.CATEGORY_CALL);
        return new m8.c(this, ((n8.d) this.f1490e).e(c9, contentLength), contentLength);
    }

    public synchronized boolean c() {
        boolean z8;
        Boolean bool = (Boolean) this.f1490e;
        if (bool != null) {
            z8 = bool.booleanValue();
        } else {
            try {
                z8 = ((C2296f) this.b).h();
            } catch (IllegalStateException unused) {
                z8 = false;
            }
        }
        d(z8);
        return z8;
    }

    public void d(boolean z8) {
        String str;
        String str2;
        if (z8) {
            str = "ENABLED";
        } else {
            str = "DISABLED";
        }
        if (((Boolean) this.f1490e) == null) {
            str2 = "global Firebase setting";
        } else if (this.f1487a) {
            str2 = "firebase_crashlytics_collection_enabled manifest flag";
        } else {
            str2 = "API";
        }
        String j7 = n0.j("Crashlytics automatic data collection ", str, " by ", str2, ".");
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", j7, null);
        }
    }

    public H e(boolean z8) {
        try {
            H readResponseHeaders = ((n8.d) this.f1490e).readResponseHeaders(z8);
            if (readResponseHeaders != null) {
                readResponseHeaders.m = this;
            }
            return readResponseHeaders;
        } catch (IOException e4) {
            ((C2365b) this.f1488c).getClass();
            G7.j.e((m8.i) this.b, NotificationCompat.CATEGORY_CALL);
            f(e4);
            throw e4;
        }
    }

    public void f(IOException iOException) {
        ((m8.e) this.f1489d).c(iOException);
        m8.k c9 = ((n8.d) this.f1490e).c();
        m8.i iVar = (m8.i) this.b;
        synchronized (c9) {
            try {
                G7.j.e(iVar, NotificationCompat.CATEGORY_CALL);
                if (iOException instanceof E) {
                    if (((E) iOException).b == EnumC2574b.REFUSED_STREAM) {
                        int i9 = c9.f21808n + 1;
                        c9.f21808n = i9;
                        if (i9 > 1) {
                            c9.f21806j = true;
                            c9.l++;
                        }
                    } else if (((E) iOException).b != EnumC2574b.CANCEL || !iVar.f21795r) {
                        c9.f21806j = true;
                        c9.l++;
                    }
                } else if (c9.f21803g == null || (iOException instanceof C2573a)) {
                    c9.f21806j = true;
                    if (c9.m == 0) {
                        m8.k.d(iVar.b, c9.b, iOException);
                        c9.l++;
                    }
                }
            } finally {
            }
        }
    }

    public void g(boolean z8) {
        int i9;
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f1487a = z8;
        ((A) this.f1491f).a((Context) this.b, intentFilter2);
        if (this.f1487a) {
            A a6 = (A) this.f1490e;
            Context context = (Context) this.b;
            synchronized (a6) {
                try {
                    if (!a6.f1485a) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            if (true != a6.b) {
                                i9 = 4;
                            } else {
                                i9 = 2;
                            }
                            context.registerReceiver(a6, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, i9);
                        } else {
                            context.registerReceiver(a6, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                        }
                        a6.f1485a = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        ((A) this.f1490e).a((Context) this.b, intentFilter);
    }

    public B(m8.i iVar, m8.e eVar, n8.d dVar) {
        C2365b c2365b = C2365b.f20810d;
        G7.j.e(iVar, NotificationCompat.CATEGORY_CALL);
        G7.j.e(eVar, "finder");
        this.b = iVar;
        this.f1488c = c2365b;
        this.f1489d = eVar;
        this.f1490e = dVar;
        this.f1491f = dVar.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public B(g4.C2296f r7) {
        /*
            r6 = this;
            r6.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r6.f1488c = r0
            com.google.android.gms.tasks.TaskCompletionSource r0 = new com.google.android.gms.tasks.TaskCompletionSource
            r0.<init>()
            r6.f1489d = r0
            r0 = 0
            r6.f1487a = r0
            com.google.android.gms.tasks.TaskCompletionSource r1 = new com.google.android.gms.tasks.TaskCompletionSource
            r1.<init>()
            r6.f1491f = r1
            r7.a()
            android.content.Context r1 = r7.f20433a
            r6.b = r7
            java.lang.String r7 = "com.google.firebase.crashlytics"
            android.content.SharedPreferences r7 = r1.getSharedPreferences(r7, r0)
            java.lang.String r2 = "firebase_crashlytics_collection_enabled"
            boolean r3 = r7.contains(r2)
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L3d
            r6.f1487a = r0
            boolean r7 = r7.getBoolean(r2, r4)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L3e
        L3d:
            r7 = r5
        L3e:
            if (r7 != 0) goto L84
            java.lang.String r7 = "firebase_crashlytics_collection_enabled"
            android.content.pm.PackageManager r2 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            if (r2 == 0) goto L71
            java.lang.String r1 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            r3 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r1 = r2.getApplicationInfo(r1, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            if (r1 == 0) goto L71
            android.os.Bundle r2 = r1.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            if (r2 == 0) goto L71
            boolean r2 = r2.containsKey(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            if (r2 == 0) goto L71
            android.os.Bundle r1 = r1.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            boolean r7 = r1.getBoolean(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            goto L72
        L69:
            r7 = move-exception
            java.lang.String r1 = "FirebaseCrashlytics"
            java.lang.String r2 = "Could not read data collection permission from manifest"
            android.util.Log.e(r1, r2, r7)
        L71:
            r7 = r5
        L72:
            if (r7 != 0) goto L78
            r6.f1487a = r0
            r7 = r5
            goto L84
        L78:
            r6.f1487a = r4
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r7 = r0.equals(r7)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
        L84:
            r6.f1490e = r7
            java.lang.Object r7 = r6.f1488c
            monitor-enter(r7)
            boolean r0 = r6.c()     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L99
            java.lang.Object r0 = r6.f1489d     // Catch: java.lang.Throwable -> L97
            com.google.android.gms.tasks.TaskCompletionSource r0 = (com.google.android.gms.tasks.TaskCompletionSource) r0     // Catch: java.lang.Throwable -> L97
            r0.trySetResult(r5)     // Catch: java.lang.Throwable -> L97
            goto L99
        L97:
            r0 = move-exception
            goto L9b
        L99:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L97
            return
        L9b:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L97
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.B.<init>(g4.f):void");
    }
}

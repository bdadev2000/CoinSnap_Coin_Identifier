package l5;

import Q7.n0;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import g4.C2296f;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import q.c1;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f21622p = {2, 4, 8, 16, 32, 64, 128, NotificationCompat.FLAG_LOCAL_ONLY};

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f21623q = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a, reason: collision with root package name */
    public final Set f21624a;

    /* renamed from: c, reason: collision with root package name */
    public int f21625c;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f21628f;

    /* renamed from: g, reason: collision with root package name */
    public final g f21629g;

    /* renamed from: h, reason: collision with root package name */
    public final C2296f f21630h;

    /* renamed from: i, reason: collision with root package name */
    public final O4.e f21631i;

    /* renamed from: j, reason: collision with root package name */
    public final C2451c f21632j;

    /* renamed from: k, reason: collision with root package name */
    public final Context f21633k;
    public final String l;

    /* renamed from: o, reason: collision with root package name */
    public final j f21635o;
    public boolean b = false;
    public final Random m = new Random();

    /* renamed from: n, reason: collision with root package name */
    public final Clock f21634n = DefaultClock.getInstance();

    /* renamed from: d, reason: collision with root package name */
    public boolean f21626d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f21627e = false;

    public m(C2296f c2296f, O4.e eVar, g gVar, C2451c c2451c, Context context, String str, LinkedHashSet linkedHashSet, j jVar, ScheduledExecutorService scheduledExecutorService) {
        this.f21624a = linkedHashSet;
        this.f21628f = scheduledExecutorService;
        this.f21625c = Math.max(8 - jVar.b().f21613a, 1);
        this.f21630h = c2296f;
        this.f21629g = gVar;
        this.f21631i = eVar;
        this.f21632j = c2451c;
        this.f21633k = context;
        this.l = str;
        this.f21635o = jVar;
    }

    public static void b(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
                if (httpURLConnection.getErrorStream() != null) {
                    httpURLConnection.getErrorStream().close();
                }
            } catch (IOException unused) {
            }
        }
    }

    public static boolean d(int i9) {
        if (i9 != 408 && i9 != 429 && i9 != 502 && i9 != 503 && i9 != 504) {
            return false;
        }
        return true;
    }

    public static String f(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
        } catch (IOException unused) {
            if (sb.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb.toString();
    }

    public final synchronized boolean a() {
        boolean z8;
        if (!this.f21624a.isEmpty() && !this.b && !this.f21626d) {
            if (!this.f21627e) {
                z8 = true;
            }
        }
        z8 = false;
        return z8;
    }

    public final String c(String str) {
        String str2;
        C2296f c2296f = this.f21630h;
        c2296f.a();
        Matcher matcher = f21623q.matcher(c2296f.f20434c.b);
        if (matcher.matches()) {
            str2 = matcher.group(1);
        } else {
            str2 = null;
        }
        return n0.j("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/", str2, "/namespaces/", str, ":streamFetchInvalidations");
    }

    public final synchronized void e(long j7) {
        try {
            if (!a()) {
                return;
            }
            int i9 = this.f21625c;
            if (i9 > 0) {
                this.f21625c = i9 - 1;
                this.f21628f.schedule(new B3.k(this, 17), j7, TimeUnit.MILLISECONDS);
            } else if (!this.f21627e) {
                new g4.h("Unable to connect to the server. Check your connection and try again.");
                g();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void g() {
        for (l lVar : this.f21624a) {
            m mVar = lVar.f21621a;
            synchronized (mVar) {
                mVar.f21626d = true;
            }
            lVar.f21621a.g();
        }
    }

    public final synchronized void h() {
        e(Math.max(0L, this.f21635o.b().b.getTime() - new Date(this.f21634n.currentTimeMillis()).getTime()));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(java.net.HttpURLConnection r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            java.lang.String r0 = "POST"
            r7.setRequestMethod(r0)
            java.lang.String r0 = "X-Goog-Firebase-Installations-Auth"
            r7.setRequestProperty(r0, r9)
            g4.f r9 = r6.f21630h
            r9.a()
            g4.i r0 = r9.f20434c
            java.lang.String r1 = r0.f20446a
            java.lang.String r2 = "X-Goog-Api-Key"
            r7.setRequestProperty(r2, r1)
            android.content.Context r1 = r6.f21633k
            java.lang.String r2 = r1.getPackageName()
            java.lang.String r3 = "X-Android-Package"
            r7.setRequestProperty(r3, r2)
            java.lang.String r2 = "FirebaseRemoteConfig"
            java.lang.String r3 = "Could not get fingerprint hash for package: "
            r4 = 0
            java.lang.String r5 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            byte[] r5 = com.google.android.gms.common.util.AndroidUtilsLight.getPackageCertificateHashBytes(r1, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            if (r5 != 0) goto L47
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            r5.<init>(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            java.lang.String r3 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            r5.append(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            java.lang.String r3 = r5.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            android.util.Log.e(r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
        L45:
            r1 = r4
            goto L63
        L47:
            r3 = 0
            java.lang.String r1 = com.google.android.gms.common.util.Hex.bytesToStringUppercase(r5, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            goto L63
        L4d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "No such package: "
            r3.<init>(r5)
            java.lang.String r1 = r1.getPackageName()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            android.util.Log.i(r2, r1)
            goto L45
        L63:
            java.lang.String r2 = "X-Android-Cert"
            r7.setRequestProperty(r2, r1)
            java.lang.String r1 = "X-Google-GFE-Can-Retry"
            java.lang.String r2 = "yes"
            r7.setRequestProperty(r1, r2)
            java.lang.String r1 = "X-Accept-Response-Streaming"
            java.lang.String r2 = "true"
            r7.setRequestProperty(r1, r2)
            java.lang.String r1 = "Content-Type"
            java.lang.String r2 = "application/json"
            r7.setRequestProperty(r1, r2)
            java.lang.String r1 = "Accept"
            r7.setRequestProperty(r1, r2)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r9.a()
            java.lang.String r2 = r0.b
            java.util.regex.Pattern r3 = l5.m.f21623q
            java.util.regex.Matcher r2 = r3.matcher(r2)
            boolean r3 = r2.matches()
            if (r3 == 0) goto L9d
            r3 = 1
            java.lang.String r4 = r2.group(r3)
        L9d:
            java.lang.String r2 = "project"
            r1.put(r2, r4)
            java.lang.String r2 = "namespace"
            java.lang.String r3 = r6.l
            r1.put(r2, r3)
            l5.g r2 = r6.f21629g
            l5.j r2 = r2.f21606h
            android.content.SharedPreferences r2 = r2.f21616a
            java.lang.String r3 = "last_template_version"
            r4 = 0
            long r2 = r2.getLong(r3, r4)
            java.lang.String r2 = java.lang.Long.toString(r2)
            java.lang.String r3 = "lastKnownVersionNumber"
            r1.put(r3, r2)
            r9.a()
            java.lang.String r9 = "appId"
            java.lang.String r0 = r0.b
            r1.put(r9, r0)
            java.lang.String r9 = "sdkVersion"
            java.lang.String r0 = "22.0.0"
            r1.put(r9, r0)
            java.lang.String r9 = "appInstanceId"
            r1.put(r9, r8)
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>(r1)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "utf-8"
            byte[] r8 = r8.getBytes(r9)
            java.io.BufferedOutputStream r9 = new java.io.BufferedOutputStream
            java.io.OutputStream r7 = r7.getOutputStream()
            r9.<init>(r7)
            r9.write(r8)
            r9.flush()
            r9.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.m.i(java.net.HttpURLConnection, java.lang.String, java.lang.String):void");
    }

    public final synchronized c1 j(HttpURLConnection httpURLConnection) {
        return new c1(httpURLConnection, this.f21629g, this.f21632j, this.f21624a, new l(this), this.f21628f);
    }

    public final void k(Date date) {
        j jVar = this.f21635o;
        int i9 = jVar.b().f21613a + 1;
        int i10 = 8;
        if (i9 < 8) {
            i10 = i9;
        }
        jVar.d(i9, new Date(date.getTime() + (TimeUnit.MINUTES.toMillis(f21622p[i10 - 1]) / 2) + this.m.nextInt((int) r2)));
    }
}

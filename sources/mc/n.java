package mc;

import android.content.Context;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f22201p = {2, 4, 8, 16, 32, 64, 128, NotificationCompat.FLAG_LOCAL_ONLY};

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f22202q = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    public final Set a;

    /* renamed from: c, reason: collision with root package name */
    public int f22204c;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f22207f;

    /* renamed from: g, reason: collision with root package name */
    public final i f22208g;

    /* renamed from: h, reason: collision with root package name */
    public final va.g f22209h;

    /* renamed from: i, reason: collision with root package name */
    public final dc.e f22210i;

    /* renamed from: j, reason: collision with root package name */
    public final d f22211j;

    /* renamed from: k, reason: collision with root package name */
    public final Context f22212k;

    /* renamed from: o, reason: collision with root package name */
    public final l f22216o;

    /* renamed from: b, reason: collision with root package name */
    public boolean f22203b = false;

    /* renamed from: m, reason: collision with root package name */
    public final Random f22214m = new Random();

    /* renamed from: n, reason: collision with root package name */
    public final Clock f22215n = DefaultClock.getInstance();

    /* renamed from: l, reason: collision with root package name */
    public final String f22213l = "firebase";

    /* renamed from: d, reason: collision with root package name */
    public boolean f22205d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f22206e = false;

    public n(va.g gVar, dc.e eVar, i iVar, d dVar, Context context, Set set, l lVar, ScheduledExecutorService scheduledExecutorService) {
        this.a = set;
        this.f22207f = scheduledExecutorService;
        this.f22204c = Math.max(8 - lVar.b().a, 1);
        this.f22209h = gVar;
        this.f22208g = iVar;
        this.f22210i = eVar;
        this.f22211j = dVar;
        this.f22212k = context;
        this.f22216o = lVar;
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

    public static boolean d(int i10) {
        return i10 == 408 || i10 == 429 || i10 == 502 || i10 == 503 || i10 == 504;
    }

    public static String f(InputStream inputStream) {
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb2.append(readLine);
            }
        } catch (IOException unused) {
            if (sb2.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb2.toString();
    }

    public final synchronized boolean a() {
        boolean z10;
        if (!this.a.isEmpty() && !this.f22203b && !this.f22205d) {
            if (!this.f22206e) {
                z10 = true;
            }
        }
        z10 = false;
        return z10;
    }

    public final URL c() {
        String str;
        try {
            String str2 = this.f22213l;
            Object[] objArr = new Object[2];
            va.g gVar = this.f22209h;
            gVar.a();
            Matcher matcher = f22202q.matcher(gVar.f26389c.f26406b);
            if (matcher.matches()) {
                str = matcher.group(1);
            } else {
                str = null;
            }
            objArr[0] = str;
            objArr[1] = str2;
            return new URL(String.format("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/%s/namespaces/%s:streamFetchInvalidations", objArr));
        } catch (MalformedURLException unused) {
            Log.e("FirebaseRemoteConfig", "URL is malformed");
            return null;
        }
    }

    public final synchronized void e(long j3) {
        if (!a()) {
            return;
        }
        int i10 = this.f22204c;
        if (i10 > 0) {
            this.f22204c = i10 - 1;
            this.f22207f.schedule(new androidx.activity.i(this, 24), j3, TimeUnit.MILLISECONDS);
        } else if (!this.f22206e) {
            new lc.c();
            g();
        }
    }

    public final synchronized void g() {
        for (m mVar : this.a) {
            n nVar = mVar.a;
            synchronized (nVar) {
                nVar.f22205d = true;
            }
            mVar.a.g();
        }
    }

    public final synchronized void h() {
        e(Math.max(0L, this.f22216o.b().a().getTime() - new Date(this.f22215n.currentTimeMillis()).getTime()));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0097  */
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
            va.g r9 = r6.f22209h
            r9.a()
            va.i r0 = r9.f26389c
            java.lang.String r1 = r0.a
            java.lang.String r2 = "X-Goog-Api-Key"
            r7.setRequestProperty(r2, r1)
            android.content.Context r1 = r6.f22212k
            java.lang.String r2 = r1.getPackageName()
            java.lang.String r3 = "X-Android-Package"
            r7.setRequestProperty(r3, r2)
            java.lang.String r2 = "FirebaseRemoteConfig"
            java.lang.String r3 = "Could not get fingerprint hash for package: "
            r4 = 0
            java.lang.String r5 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            byte[] r5 = com.google.android.gms.common.util.AndroidUtilsLight.getPackageCertificateHashBytes(r1, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            if (r5 != 0) goto L46
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            r5.<init>(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            java.lang.String r3 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            r5.append(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            java.lang.String r3 = r5.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            android.util.Log.e(r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            goto L61
        L46:
            r3 = 0
            java.lang.String r1 = com.google.android.gms.common.util.Hex.bytesToStringUppercase(r5, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            goto L62
        L4c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "No such package: "
            r3.<init>(r5)
            java.lang.String r1 = r1.getPackageName()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            android.util.Log.i(r2, r1)
        L61:
            r1 = r4
        L62:
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
            java.lang.String r2 = r0.f26406b
            java.util.regex.Pattern r3 = mc.n.f22202q
            java.util.regex.Matcher r2 = r3.matcher(r2)
            boolean r3 = r2.matches()
            if (r3 == 0) goto L9c
            r3 = 1
            java.lang.String r4 = r2.group(r3)
        L9c:
            java.lang.String r2 = "project"
            r1.put(r2, r4)
            java.lang.String r2 = "namespace"
            java.lang.String r3 = r6.f22213l
            r1.put(r2, r3)
            mc.i r2 = r6.f22208g
            mc.l r2 = r2.f22188h
            android.content.SharedPreferences r2 = r2.a
            java.lang.String r3 = "last_template_version"
            r4 = 0
            long r2 = r2.getLong(r3, r4)
            java.lang.String r2 = java.lang.Long.toString(r2)
            java.lang.String r3 = "lastKnownVersionNumber"
            r1.put(r3, r2)
            r9.a()
            java.lang.String r9 = r0.f26406b
            java.lang.String r0 = "appId"
            r1.put(r0, r9)
            java.lang.String r9 = "sdkVersion"
            java.lang.String r0 = "22.0.1"
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
        throw new UnsupportedOperationException("Method not decompiled: mc.n.i(java.net.HttpURLConnection, java.lang.String, java.lang.String):void");
    }

    public final synchronized c j(HttpURLConnection httpURLConnection) {
        return new c(httpURLConnection, this.f22208g, this.f22211j, this.a, new m(this), this.f22207f);
    }

    public final void k(Date date) {
        l lVar = this.f22216o;
        int i10 = lVar.b().a + 1;
        int i11 = 8;
        if (i10 < 8) {
            i11 = i10;
        }
        lVar.d(i10, new Date(date.getTime() + (TimeUnit.MINUTES.toMillis(f22201p[i11 - 1]) / 2) + this.f22214m.nextInt((int) r2)));
    }
}

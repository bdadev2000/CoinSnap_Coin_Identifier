package O4;

import android.net.TrafficStats;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import g4.C2296f;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import o4.l;
import org.json.JSONException;
import org.json.JSONObject;
import z.AbstractC2965e;

/* loaded from: classes2.dex */
public final class d implements e {
    public static final Object m = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final C2296f f2181a;
    public final Q4.c b;

    /* renamed from: c, reason: collision with root package name */
    public final E1.d f2182c;

    /* renamed from: d, reason: collision with root package name */
    public final k f2183d;

    /* renamed from: e, reason: collision with root package name */
    public final l f2184e;

    /* renamed from: f, reason: collision with root package name */
    public final i f2185f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f2186g;

    /* renamed from: h, reason: collision with root package name */
    public final ExecutorService f2187h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f2188i;

    /* renamed from: j, reason: collision with root package name */
    public String f2189j;

    /* renamed from: k, reason: collision with root package name */
    public final HashSet f2190k;
    public final ArrayList l;

    static {
        new AtomicInteger(1);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [O4.i, java.lang.Object] */
    public d(C2296f c2296f, N4.b bVar, ExecutorService executorService, p4.k kVar) {
        c2296f.a();
        Q4.c cVar = new Q4.c(c2296f.f20433a, bVar);
        E1.d dVar = new E1.d(c2296f);
        if (R3.e.f2642c == null) {
            R3.e.f2642c = new R3.e(10);
        }
        R3.e eVar = R3.e.f2642c;
        if (k.f2195d == null) {
            k.f2195d = new k(eVar);
        }
        k kVar2 = k.f2195d;
        l lVar = new l(new b(c2296f, 0));
        ?? obj = new Object();
        this.f2186g = new Object();
        this.f2190k = new HashSet();
        this.l = new ArrayList();
        this.f2181a = c2296f;
        this.b = cVar;
        this.f2182c = dVar;
        this.f2183d = kVar2;
        this.f2184e = lVar;
        this.f2185f = obj;
        this.f2187h = executorService;
        this.f2188i = kVar;
    }

    /* JADX WARN: Finally extract failed */
    public final void a() {
        P4.b x9;
        synchronized (m) {
            try {
                C2296f c2296f = this.f2181a;
                c2296f.a();
                E1.d e4 = E1.d.e(c2296f.f20433a);
                try {
                    x9 = this.f2182c.x();
                    int i9 = x9.b;
                    if (i9 == 2 || i9 == 1) {
                        String f9 = f(x9);
                        E1.d dVar = this.f2182c;
                        P4.a a6 = x9.a();
                        a6.b = f9;
                        a6.f2415a = 3;
                        x9 = a6.f();
                        dVar.u(x9);
                    }
                    if (e4 != null) {
                        e4.z();
                    }
                } catch (Throwable th) {
                    if (e4 != null) {
                        e4.z();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        i(x9);
        this.f2188i.execute(new L3.l(this, 1));
    }

    public final P4.b b(P4.b bVar) {
        int responseCode;
        boolean z8;
        Q4.b f9;
        C2296f c2296f = this.f2181a;
        c2296f.a();
        String str = c2296f.f20434c.f20446a;
        String str2 = bVar.f2421a;
        C2296f c2296f2 = this.f2181a;
        c2296f2.a();
        String str3 = c2296f2.f20434c.f20451g;
        String str4 = bVar.f2423d;
        Q4.c cVar = this.b;
        Q4.d dVar = cVar.f2517c;
        if (dVar.a()) {
            URL a6 = Q4.c.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
            for (int i9 = 0; i9 <= 1; i9++) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection c9 = cVar.c(a6, str);
                try {
                    try {
                        c9.setRequestMethod("POST");
                        c9.addRequestProperty("Authorization", "FIS_v2 " + str4);
                        c9.setDoOutput(true);
                        Q4.c.h(c9);
                        responseCode = c9.getResponseCode();
                        dVar.b(responseCode);
                        if (responseCode >= 200 && responseCode < 300) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                    } catch (IOException | AssertionError unused) {
                    }
                    if (z8) {
                        f9 = Q4.c.f(c9);
                    } else {
                        Q4.c.b(c9, null, str, str3);
                        if (responseCode != 401 && responseCode != 404) {
                            if (responseCode != 429) {
                                if (responseCode < 500 || responseCode >= 600) {
                                    Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                    D0.l a9 = Q4.b.a();
                                    a9.b = 2;
                                    f9 = a9.a();
                                }
                                c9.disconnect();
                                TrafficStats.clearThreadStatsTag();
                            } else {
                                throw new g4.h("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            }
                        } else {
                            D0.l a10 = Q4.b.a();
                            a10.b = 3;
                            f9 = a10.a();
                        }
                    }
                    c9.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    int d2 = AbstractC2965e.d(f9.f2513c);
                    if (d2 != 0) {
                        if (d2 != 1) {
                            if (d2 == 2) {
                                synchronized (this) {
                                    this.f2189j = null;
                                }
                                P4.a a11 = bVar.a();
                                a11.f2415a = 2;
                                return a11.f();
                            }
                            throw new g4.h("Firebase Installations Service is unavailable. Please try again later.");
                        }
                        P4.a a12 = bVar.a();
                        a12.f2418e = "BAD CONFIG";
                        a12.f2415a = 5;
                        return a12.f();
                    }
                    k kVar = this.f2183d;
                    kVar.getClass();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    kVar.f2196a.getClass();
                    long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                    P4.a a13 = bVar.a();
                    a13.f2416c = f9.f2512a;
                    a13.f2419f = Long.valueOf(f9.b);
                    a13.f2420g = Long.valueOf(seconds);
                    return a13.f();
                } catch (Throwable th) {
                    c9.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
            throw new g4.h("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new g4.h("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final Task c() {
        String str;
        e();
        synchronized (this) {
            str = this.f2189j;
        }
        if (str != null) {
            return Tasks.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        h hVar = new h(taskCompletionSource);
        synchronized (this.f2186g) {
            this.l.add(hVar);
        }
        Task task = taskCompletionSource.getTask();
        this.f2187h.execute(new c(this, 0));
        return task;
    }

    public final Task d() {
        e();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        g gVar = new g(this.f2183d, taskCompletionSource);
        synchronized (this.f2186g) {
            this.l.add(gVar);
        }
        Task task = taskCompletionSource.getTask();
        this.f2187h.execute(new c(this, 1));
        return task;
    }

    public final void e() {
        C2296f c2296f = this.f2181a;
        c2296f.a();
        Preconditions.checkNotEmpty(c2296f.f20434c.b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        c2296f.a();
        Preconditions.checkNotEmpty(c2296f.f20434c.f20451g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        c2296f.a();
        Preconditions.checkNotEmpty(c2296f.f20434c.f20446a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        c2296f.a();
        String str = c2296f.f20434c.b;
        Pattern pattern = k.f2194c;
        Preconditions.checkArgument(str.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        c2296f.a();
        Preconditions.checkArgument(k.f2194c.matcher(c2296f.f20434c.f20446a).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if ("[DEFAULT]".equals(r0.b) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String f(P4.b r6) {
        /*
            r5 = this;
            g4.f r0 = r5.f2181a
            r0.a()
            java.lang.String r0 = r0.b
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            g4.f r0 = r5.f2181a
            r0.a()
            java.lang.String r1 = "[DEFAULT]"
            java.lang.String r0 = r0.b
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5b
        L1e:
            r0 = 1
            int r6 = r6.b
            if (r6 != r0) goto L5b
            o4.l r6 = r5.f2184e
            java.lang.Object r6 = r6.get()
            P4.c r6 = (P4.c) r6
            android.content.SharedPreferences r0 = r6.f2428a
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r6.f2428a     // Catch: java.lang.Throwable -> L3f
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L3f
            android.content.SharedPreferences r2 = r6.f2428a     // Catch: java.lang.Throwable -> L56
            java.lang.String r3 = "|S|id"
            r4 = 0
            java.lang.String r2 = r2.getString(r3, r4)     // Catch: java.lang.Throwable -> L56
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L56
            if (r2 == 0) goto L41
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            goto L46
        L3f:
            r6 = move-exception
            goto L59
        L41:
            java.lang.String r2 = r6.a()     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
        L46:
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto L55
            O4.i r6 = r5.f2185f
            r6.getClass()
            java.lang.String r2 = O4.i.a()
        L55:
            return r2
        L56:
            r6 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L56
            throw r6     // Catch: java.lang.Throwable -> L3f
        L59:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            throw r6
        L5b:
            O4.i r6 = r5.f2185f
            r6.getClass()
            java.lang.String r6 = O4.i.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: O4.d.f(P4.b):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [Q4.c] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [Q4.a] */
    public final P4.b g(P4.b bVar) {
        int responseCode;
        String str = bVar.f2421a;
        int i9 = 0;
        String str2 = null;
        if (str != null && str.length() == 11) {
            P4.c cVar = (P4.c) this.f2184e.get();
            synchronized (cVar.f2428a) {
                try {
                    String[] strArr = P4.c.f2427c;
                    int i10 = 0;
                    while (true) {
                        if (i10 < 4) {
                            String str3 = strArr[i10];
                            String string = cVar.f2428a.getString("|T|" + cVar.b + "|" + str3, null);
                            if (string != null && !string.isEmpty()) {
                                if (string.startsWith("{")) {
                                    try {
                                        str2 = new JSONObject(string).getString(BidResponsed.KEY_TOKEN);
                                    } catch (JSONException unused) {
                                    }
                                } else {
                                    str2 = string;
                                }
                            } else {
                                i10++;
                            }
                        }
                    }
                } finally {
                }
            }
        }
        Q4.c cVar2 = this.b;
        C2296f c2296f = this.f2181a;
        c2296f.a();
        String str4 = c2296f.f20434c.f20446a;
        String str5 = bVar.f2421a;
        C2296f c2296f2 = this.f2181a;
        c2296f2.a();
        String str6 = c2296f2.f20434c.f20451g;
        C2296f c2296f3 = this.f2181a;
        c2296f3.a();
        String str7 = c2296f3.f20434c.b;
        Q4.d dVar = cVar2.f2517c;
        if (dVar.a()) {
            URL a6 = Q4.c.a("projects/" + str6 + "/installations");
            Q4.a aVar = cVar2;
            while (i9 <= 1) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection c9 = aVar.c(a6, str4);
                try {
                    try {
                        c9.setRequestMethod("POST");
                        c9.setDoOutput(true);
                        if (str2 != null) {
                            c9.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                        }
                        Q4.c.g(c9, str5, str7);
                        responseCode = c9.getResponseCode();
                        dVar.b(responseCode);
                    } catch (IOException | AssertionError unused2) {
                    }
                    if (responseCode >= 200 && responseCode < 300) {
                        Q4.a e4 = Q4.c.e(c9);
                        c9.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        aVar = e4;
                    } else {
                        try {
                            Q4.c.b(c9, str7, str4, str6);
                        } catch (IOException | AssertionError unused3) {
                            c9.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i9++;
                            aVar = aVar;
                        }
                        if (responseCode != 429) {
                            if (responseCode >= 500 && responseCode < 600) {
                                c9.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                i9++;
                                aVar = aVar;
                            } else {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                Q4.a aVar2 = new Q4.a(null, null, null, null, 2);
                                c9.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                aVar = aVar2;
                            }
                        } else {
                            throw new g4.h("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            break;
                        }
                    }
                    int d2 = AbstractC2965e.d(aVar.f2511e);
                    if (d2 != 0) {
                        if (d2 == 1) {
                            P4.a a9 = bVar.a();
                            a9.f2418e = "BAD CONFIG";
                            a9.f2415a = 5;
                            return a9.f();
                        }
                        throw new g4.h("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    String str8 = aVar.b;
                    String str9 = aVar.f2509c;
                    k kVar = this.f2183d;
                    kVar.getClass();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    kVar.f2196a.getClass();
                    long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                    Q4.b bVar2 = aVar.f2510d;
                    String str10 = bVar2.f2512a;
                    long j7 = bVar2.b;
                    P4.a a10 = bVar.a();
                    a10.b = str8;
                    a10.f2415a = 4;
                    a10.f2416c = str10;
                    a10.f2417d = str9;
                    a10.f2419f = Long.valueOf(j7);
                    a10.f2420g = Long.valueOf(seconds);
                    return a10.f();
                } finally {
                    c9.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            }
            throw new g4.h("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new g4.h("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void h(Exception exc) {
        synchronized (this.f2186g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((j) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(P4.b bVar) {
        synchronized (this.f2186g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((j) it.next()).b(bVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

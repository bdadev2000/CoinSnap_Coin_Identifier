package dc;

import android.net.TrafficStats;
import android.util.Log;
import com.facebook.internal.m;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.common.collect.c1;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import db.n;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class d implements e {

    /* renamed from: m, reason: collision with root package name */
    public static final Object f16973m = new Object();
    public final va.g a;

    /* renamed from: b, reason: collision with root package name */
    public final fc.c f16974b;

    /* renamed from: c, reason: collision with root package name */
    public final qa.a f16975c;

    /* renamed from: d, reason: collision with root package name */
    public final k f16976d;

    /* renamed from: e, reason: collision with root package name */
    public final n f16977e;

    /* renamed from: f, reason: collision with root package name */
    public final i f16978f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f16979g;

    /* renamed from: h, reason: collision with root package name */
    public final ExecutorService f16980h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f16981i;

    /* renamed from: j, reason: collision with root package name */
    public String f16982j;

    /* renamed from: k, reason: collision with root package name */
    public final HashSet f16983k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f16984l;

    static {
        new c();
    }

    public d(va.g gVar, cc.c cVar, ExecutorService executorService, eb.k kVar) {
        gVar.a();
        fc.c cVar2 = new fc.c(gVar.a, cVar);
        qa.a aVar = new qa.a(gVar, 10);
        if (m.f11048b == null) {
            m.f11048b = new m();
        }
        m mVar = m.f11048b;
        if (k.f16989d == null) {
            k.f16989d = new k(mVar);
        }
        k kVar2 = k.f16989d;
        n nVar = new n(new db.c(gVar, 2));
        i iVar = new i();
        this.f16979g = new Object();
        this.f16983k = new HashSet();
        this.f16984l = new ArrayList();
        this.a = gVar;
        this.f16974b = cVar2;
        this.f16975c = aVar;
        this.f16976d = kVar2;
        this.f16977e = nVar;
        this.f16978f = iVar;
        this.f16980h = executorService;
        this.f16981i = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025 A[Catch: all -> 0x0060, TRY_LEAVE, TryCatch #0 {all -> 0x0060, blocks: (B:6:0x000e, B:8:0x001b, B:13:0x0025), top: B:5:0x000e, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040 A[Catch: all -> 0x0067, DONT_GENERATE, TRY_ENTER, TryCatch #1 {, blocks: (B:4:0x0003, B:16:0x0040, B:17:0x0043, B:26:0x0063, B:27:0x0066, B:6:0x000e, B:8:0x001b, B:13:0x0025), top: B:3:0x0003, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = dc.d.f16973m
            monitor-enter(r0)
            va.g r1 = r7.a     // Catch: java.lang.Throwable -> L67
            r1.a()     // Catch: java.lang.Throwable -> L67
            android.content.Context r1 = r1.a     // Catch: java.lang.Throwable -> L67
            qa.a r1 = qa.a.d(r1)     // Catch: java.lang.Throwable -> L67
            qa.a r2 = r7.f16975c     // Catch: java.lang.Throwable -> L60
            ec.a r2 = r2.m()     // Catch: java.lang.Throwable -> L60
            ec.c r3 = ec.c.NOT_GENERATED     // Catch: java.lang.Throwable -> L60
            ec.c r4 = r2.f17292b     // Catch: java.lang.Throwable -> L60
            r5 = 1
            if (r4 == r3) goto L22
            ec.c r3 = ec.c.ATTEMPT_MIGRATION     // Catch: java.lang.Throwable -> L60
            if (r4 != r3) goto L20
            goto L22
        L20:
            r3 = 0
            goto L23
        L22:
            r3 = r5
        L23:
            if (r3 == 0) goto L3e
            java.lang.String r3 = r7.f(r2)     // Catch: java.lang.Throwable -> L60
            qa.a r4 = r7.f16975c     // Catch: java.lang.Throwable -> L60
            ob.c r6 = new ob.c     // Catch: java.lang.Throwable -> L60
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L60
            r6.a = r3     // Catch: java.lang.Throwable -> L60
            ec.c r2 = ec.c.UNREGISTERED     // Catch: java.lang.Throwable -> L60
            r6.v(r2)     // Catch: java.lang.Throwable -> L60
            ec.a r2 = r6.j()     // Catch: java.lang.Throwable -> L60
            r4.k(r2)     // Catch: java.lang.Throwable -> L60
        L3e:
            if (r1 == 0) goto L43
            r1.n()     // Catch: java.lang.Throwable -> L67
        L43:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L67
            if (r8 == 0) goto L52
            ob.c r0 = new ob.c
            r0.<init>(r2)
            r1 = 0
            r0.f23293c = r1
            ec.a r2 = r0.j()
        L52:
            r7.i(r2)
            java.util.concurrent.Executor r0 = r7.f16981i
            dc.b r1 = new dc.b
            r1.<init>(r7, r8, r5)
            r0.execute(r1)
            return
        L60:
            r8 = move-exception
            if (r1 == 0) goto L66
            r1.n()     // Catch: java.lang.Throwable -> L67
        L66:
            throw r8     // Catch: java.lang.Throwable -> L67
        L67:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L67
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: dc.d.a(boolean):void");
    }

    public final ec.a b(ec.a aVar) {
        boolean z10;
        int responseCode;
        boolean z11;
        fc.b f10;
        va.g gVar = this.a;
        gVar.a();
        String str = gVar.f26389c.a;
        String str2 = aVar.a;
        va.g gVar2 = this.a;
        gVar2.a();
        String str3 = gVar2.f26389c.f26411g;
        String str4 = aVar.f17294d;
        fc.c cVar = this.f16974b;
        fc.e eVar = cVar.f17783c;
        synchronized (eVar) {
            if (eVar.f17790c != 0) {
                eVar.a.a.getClass();
                if (System.currentTimeMillis() <= eVar.f17789b) {
                    z10 = false;
                }
            }
            z10 = true;
        }
        if (z10) {
            URL a = fc.c.a(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
            for (int i10 = 0; i10 <= 1; i10++) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection c10 = cVar.c(a, str);
                try {
                    c10.setRequestMethod("POST");
                    c10.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    c10.setDoOutput(true);
                    fc.c.h(c10);
                    responseCode = c10.getResponseCode();
                    eVar.a(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th2) {
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th2;
                }
                if (z11) {
                    f10 = fc.c.f(c10);
                } else {
                    fc.c.b(c10, null, str, str3);
                    if (responseCode != 401 && responseCode != 404) {
                        if (responseCode != 429) {
                            if (responseCode < 500 || responseCode >= 600) {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                c1 c1Var = new c1(7);
                                c1Var.f11924c = 0L;
                                c1Var.f11925d = fc.f.BAD_CONFIG;
                                f10 = c1Var.d();
                            } else {
                                c10.disconnect();
                                TrafficStats.clearThreadStatsTag();
                            }
                        } else {
                            throw new f("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                    }
                    c1 c1Var2 = new c1(7);
                    c1Var2.f11924c = 0L;
                    c1Var2.f11925d = fc.f.AUTH_ERROR;
                    f10 = c1Var2.d();
                }
                c10.disconnect();
                TrafficStats.clearThreadStatsTag();
                int ordinal = f10.f17779c.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            synchronized (this) {
                                this.f16982j = null;
                            }
                            ob.c cVar2 = new ob.c(aVar);
                            cVar2.v(ec.c.NOT_GENERATED);
                            return cVar2.j();
                        }
                        throw new f("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    ob.c cVar3 = new ob.c(aVar);
                    cVar3.f23297g = "BAD CONFIG";
                    cVar3.v(ec.c.REGISTER_ERROR);
                    return cVar3.j();
                }
                k kVar = this.f16976d;
                kVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                kVar.a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                ob.c cVar4 = new ob.c(aVar);
                cVar4.f23293c = f10.a;
                cVar4.f23295e = Long.valueOf(f10.f17778b);
                cVar4.f23296f = Long.valueOf(seconds);
                return cVar4.j();
            }
            throw new f("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new f("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final Task c() {
        String str;
        e();
        synchronized (this) {
            str = this.f16982j;
        }
        if (str != null) {
            return Tasks.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        h hVar = new h(taskCompletionSource);
        synchronized (this.f16979g) {
            this.f16984l.add(hVar);
        }
        Task task = taskCompletionSource.getTask();
        this.f16980h.execute(new k8.f(this, 10));
        return task;
    }

    public final Task d() {
        e();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        g gVar = new g(this.f16976d, taskCompletionSource);
        synchronized (this.f16979g) {
            this.f16984l.add(gVar);
        }
        Task task = taskCompletionSource.getTask();
        this.f16980h.execute(new b(this, false, 0 == true ? 1 : 0));
        return task;
    }

    public final void e() {
        va.g gVar = this.a;
        gVar.a();
        Preconditions.checkNotEmpty(gVar.f26389c.f26406b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        Preconditions.checkNotEmpty(gVar.f26389c.f26411g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        Preconditions.checkNotEmpty(gVar.f26389c.a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        String str = gVar.f26389c.f26406b;
        Pattern pattern = k.f16988c;
        Preconditions.checkArgument(str.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        Preconditions.checkArgument(k.f16988c.matcher(gVar.f26389c.a).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if ("[DEFAULT]".equals(r0.f26388b) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String f(ec.a r6) {
        /*
            r5 = this;
            va.g r0 = r5.a
            r0.a()
            java.lang.String r0 = r0.f26388b
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            va.g r0 = r5.a
            r0.a()
            java.lang.String r1 = "[DEFAULT]"
            java.lang.String r0 = r0.f26388b
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L29
        L1e:
            ec.c r0 = ec.c.ATTEMPT_MIGRATION
            ec.c r6 = r6.f17292b
            if (r6 != r0) goto L26
            r6 = 1
            goto L27
        L26:
            r6 = 0
        L27:
            if (r6 != 0) goto L33
        L29:
            dc.i r6 = r5.f16978f
            r6.getClass()
            java.lang.String r6 = dc.i.a()
            return r6
        L33:
            db.n r6 = r5.f16977e
            java.lang.Object r6 = r6.get()
            ec.b r6 = (ec.b) r6
            android.content.SharedPreferences r0 = r6.a
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r6.a     // Catch: java.lang.Throwable -> L67
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L67
            android.content.SharedPreferences r2 = r6.a     // Catch: java.lang.Throwable -> L64
            java.lang.String r3 = "|S|id"
            r4 = 0
            java.lang.String r2 = r2.getString(r3, r4)     // Catch: java.lang.Throwable -> L64
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L64
            if (r2 == 0) goto L4f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L67
            goto L54
        L4f:
            java.lang.String r2 = r6.a()     // Catch: java.lang.Throwable -> L67
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L67
        L54:
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto L63
            dc.i r6 = r5.f16978f
            r6.getClass()
            java.lang.String r2 = dc.i.a()
        L63:
            return r2
        L64:
            r6 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L64
            throw r6     // Catch: java.lang.Throwable -> L67
        L67:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L67
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: dc.d.f(ec.a):java.lang.String");
    }

    public final ec.a g(ec.a aVar) {
        boolean z10;
        int responseCode;
        boolean z11;
        fc.a e2;
        String str = aVar.a;
        String str2 = null;
        if (str != null && str.length() == 11) {
            ec.b bVar = (ec.b) this.f16977e.get();
            synchronized (bVar.a) {
                String[] strArr = ec.b.f17298c;
                int i10 = 0;
                while (true) {
                    if (i10 >= 4) {
                        break;
                    }
                    String str3 = strArr[i10];
                    String string = bVar.a.getString("|T|" + bVar.f17299b + "|" + str3, null);
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
        }
        fc.c cVar = this.f16974b;
        va.g gVar = this.a;
        gVar.a();
        String str4 = gVar.f26389c.a;
        String str5 = aVar.a;
        va.g gVar2 = this.a;
        gVar2.a();
        String str6 = gVar2.f26389c.f26411g;
        va.g gVar3 = this.a;
        gVar3.a();
        String str7 = gVar3.f26389c.f26406b;
        fc.e eVar = cVar.f17783c;
        synchronized (eVar) {
            if (eVar.f17790c != 0) {
                eVar.a.a.getClass();
                if (System.currentTimeMillis() <= eVar.f17789b) {
                    z10 = false;
                }
            }
            z10 = true;
        }
        if (z10) {
            URL a = fc.c.a(String.format("projects/%s/installations", str6));
            for (int i11 = 0; i11 <= 1; i11++) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection c10 = cVar.c(a, str4);
                try {
                    try {
                        c10.setRequestMethod("POST");
                        c10.setDoOutput(true);
                        if (str2 != null) {
                            c10.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                        }
                        fc.c.g(c10, str5, str7);
                        responseCode = c10.getResponseCode();
                        eVar.a(responseCode);
                        if (responseCode >= 200 && responseCode < 300) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    } catch (IOException | AssertionError unused2) {
                    }
                    if (z11) {
                        e2 = fc.c.e(c10);
                    } else {
                        fc.c.b(c10, str7, str4, str6);
                        if (responseCode != 429) {
                            if (responseCode < 500 || responseCode >= 600) {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                w3.h hVar = new w3.h();
                                hVar.f26702e = fc.d.BAD_CONFIG;
                                e2 = hVar.a();
                            } else {
                                c10.disconnect();
                                TrafficStats.clearThreadStatsTag();
                            }
                        } else {
                            throw new f("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                    }
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    int ordinal = e2.f17777e.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            ob.c cVar2 = new ob.c(aVar);
                            cVar2.f23297g = "BAD CONFIG";
                            cVar2.v(ec.c.REGISTER_ERROR);
                            return cVar2.j();
                        }
                        throw new f("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    String str8 = e2.f17774b;
                    String str9 = e2.f17775c;
                    k kVar = this.f16976d;
                    kVar.getClass();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    kVar.a.getClass();
                    long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                    fc.b bVar2 = e2.f17776d;
                    String str10 = bVar2.a;
                    long j3 = bVar2.f17778b;
                    ob.c cVar3 = new ob.c(aVar);
                    cVar3.a = str8;
                    cVar3.v(ec.c.REGISTERED);
                    cVar3.f23293c = str10;
                    cVar3.f23294d = str9;
                    cVar3.f23295e = Long.valueOf(j3);
                    cVar3.f23296f = Long.valueOf(seconds);
                    return cVar3.j();
                } catch (Throwable th2) {
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th2;
                }
            }
            throw new f("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new f("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void h(Exception exc) {
        synchronized (this.f16979g) {
            Iterator it = this.f16984l.iterator();
            while (it.hasNext()) {
                if (((j) it.next()).a(exc)) {
                    it.remove();
                }
            }
        }
    }

    public final void i(ec.a aVar) {
        synchronized (this.f16979g) {
            Iterator it = this.f16984l.iterator();
            while (it.hasNext()) {
                if (((j) it.next()).b(aVar)) {
                    it.remove();
                }
            }
        }
    }
}

package k5;

import android.content.Context;
import com.applovin.impl.V1;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import l5.C2451c;
import l5.m;
import l5.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f21473a;
    public final h4.c b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f21474c;

    /* renamed from: d, reason: collision with root package name */
    public final C2451c f21475d;

    /* renamed from: e, reason: collision with root package name */
    public final C2451c f21476e;

    /* renamed from: f, reason: collision with root package name */
    public final C2451c f21477f;

    /* renamed from: g, reason: collision with root package name */
    public final l5.g f21478g;

    /* renamed from: h, reason: collision with root package name */
    public final l5.h f21479h;

    /* renamed from: i, reason: collision with root package name */
    public final l5.j f21480i;

    /* renamed from: j, reason: collision with root package name */
    public final l5.k f21481j;

    /* renamed from: k, reason: collision with root package name */
    public final b1.h f21482k;

    public b(Context context, h4.c cVar, Executor executor, C2451c c2451c, C2451c c2451c2, C2451c c2451c3, l5.g gVar, l5.h hVar, l5.j jVar, l5.k kVar, b1.h hVar2) {
        this.f21473a = context;
        this.b = cVar;
        this.f21474c = executor;
        this.f21475d = c2451c;
        this.f21476e = c2451c2;
        this.f21477f = c2451c3;
        this.f21478g = gVar;
        this.f21479h = hVar;
        this.f21480i = jVar;
        this.f21481j = kVar;
        this.f21482k = hVar2;
    }

    public static ArrayList f(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i9);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    public final Task a() {
        l5.g gVar = this.f21478g;
        l5.j jVar = gVar.f21606h;
        jVar.getClass();
        long j7 = jVar.f21616a.getLong("minimum_fetch_interval_in_seconds", l5.g.f21598j);
        HashMap hashMap = new HashMap(gVar.f21607i);
        hashMap.put("X-Firebase-RC-Fetch-Type", "BASE/1");
        return gVar.f21604f.b().continueWithTask(gVar.f21601c, new V1(gVar, j7, hashMap)).onSuccessTask(p4.j.b, new com.applovin.impl.sdk.ad.g(26)).onSuccessTask(this.f21474c, new a(this));
    }

    public final HashMap b() {
        o oVar;
        l5.h hVar = this.f21479h;
        hVar.getClass();
        HashSet hashSet = new HashSet();
        C2451c c2451c = hVar.f21611c;
        hashSet.addAll(l5.h.b(c2451c));
        C2451c c2451c2 = hVar.f21612d;
        hashSet.addAll(l5.h.b(c2451c2));
        HashMap hashMap = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String c9 = l5.h.c(c2451c, str);
            if (c9 != null) {
                hVar.a(str, c2451c.c());
                oVar = new o(c9, 2);
            } else {
                String c10 = l5.h.c(c2451c2, str);
                if (c10 != null) {
                    oVar = new o(c10, 1);
                } else {
                    l5.h.d(str, "FirebaseRemoteConfigValue");
                    oVar = new o("", 0);
                }
            }
            hashMap.put(str, oVar);
        }
        return hashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (r3.matcher(r0).matches() != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(java.lang.String r9) {
        /*
            r8 = this;
            l5.h r0 = r8.f21479h
            l5.c r1 = r0.f21611c
            java.lang.String r2 = l5.h.c(r1, r9)
            java.util.regex.Pattern r3 = l5.h.f21609f
            java.util.regex.Pattern r4 = l5.h.f21608e
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L35
            java.util.regex.Matcher r7 = r4.matcher(r2)
            boolean r7 = r7.matches()
            if (r7 == 0) goto L22
            l5.d r1 = r1.c()
            r0.a(r9, r1)
            goto L59
        L22:
            java.util.regex.Matcher r2 = r3.matcher(r2)
            boolean r2 = r2.matches()
            if (r2 == 0) goto L35
            l5.d r1 = r1.c()
            r0.a(r9, r1)
        L33:
            r5 = r6
            goto L59
        L35:
            l5.c r0 = r0.f21612d
            java.lang.String r0 = l5.h.c(r0, r9)
            if (r0 == 0) goto L53
            java.util.regex.Matcher r1 = r4.matcher(r0)
            boolean r1 = r1.matches()
            if (r1 == 0) goto L48
            goto L59
        L48:
            java.util.regex.Matcher r0 = r3.matcher(r0)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L53
            goto L33
        L53:
            java.lang.String r0 = "Boolean"
            l5.h.d(r9, r0)
            goto L33
        L59:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.b.c(java.lang.String):boolean");
    }

    public final androidx.work.o d() {
        androidx.work.o oVar;
        l5.j jVar = this.f21480i;
        synchronized (jVar.b) {
            try {
                jVar.f21616a.getLong("last_fetch_time_in_millis", -1L);
                int i9 = jVar.f21616a.getInt("last_fetch_status", 0);
                int[] iArr = l5.g.f21599k;
                long j7 = jVar.f21616a.getLong("fetch_timeout_in_seconds", 60L);
                if (j7 >= 0) {
                    long j9 = jVar.f21616a.getLong("minimum_fetch_interval_in_seconds", l5.g.f21598j);
                    if (j9 >= 0) {
                        oVar = new androidx.work.o(i9);
                    } else {
                        throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j9 + " is an invalid argument");
                    }
                } else {
                    throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j7)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return oVar;
    }

    public final void e(boolean z8) {
        l5.k kVar = this.f21481j;
        synchronized (kVar) {
            ((m) kVar.f21620c).f21627e = z8;
            if (!z8) {
                synchronized (kVar) {
                    if (!((LinkedHashSet) kVar.b).isEmpty()) {
                        ((m) kVar.f21620c).e(0L);
                    }
                }
            }
        }
    }
}

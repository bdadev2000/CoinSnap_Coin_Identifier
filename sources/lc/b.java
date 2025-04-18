package lc;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import mc.l;
import mc.n;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class b {
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final wa.c f21327b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f21328c;

    /* renamed from: d, reason: collision with root package name */
    public final mc.d f21329d;

    /* renamed from: e, reason: collision with root package name */
    public final mc.d f21330e;

    /* renamed from: f, reason: collision with root package name */
    public final mc.d f21331f;

    /* renamed from: g, reason: collision with root package name */
    public final mc.i f21332g;

    /* renamed from: h, reason: collision with root package name */
    public final mc.j f21333h;

    /* renamed from: i, reason: collision with root package name */
    public final l f21334i;

    /* renamed from: j, reason: collision with root package name */
    public final u2.l f21335j;

    /* renamed from: k, reason: collision with root package name */
    public final s2.h f21336k;

    public b(Context context, wa.c cVar, ScheduledExecutorService scheduledExecutorService, mc.d dVar, mc.d dVar2, mc.d dVar3, mc.i iVar, mc.j jVar, l lVar, u2.l lVar2, s2.h hVar) {
        this.a = context;
        this.f21327b = cVar;
        this.f21328c = scheduledExecutorService;
        this.f21329d = dVar;
        this.f21330e = dVar2;
        this.f21331f = dVar3;
        this.f21332g = iVar;
        this.f21333h = jVar;
        this.f21334i = lVar;
        this.f21335j = lVar2;
        this.f21336k = hVar;
    }

    public static ArrayList d(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0048 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(java.lang.String r10) {
        /*
            r9 = this;
            mc.j r0 = r9.f21333h
            mc.d r1 = r0.f22193c
            mc.f r2 = r1.c()
            r3 = 0
            if (r2 != 0) goto Ld
        Lb:
            r2 = r3
            goto L13
        Ld:
            org.json.JSONObject r2 = r2.f22167b     // Catch: org.json.JSONException -> Lb
            java.lang.String r2 = r2.getString(r10)     // Catch: org.json.JSONException -> Lb
        L13:
            java.util.regex.Pattern r4 = mc.j.f22191f
            java.util.regex.Pattern r5 = mc.j.f22190e
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L3f
            java.util.regex.Matcher r8 = r5.matcher(r2)
            boolean r8 = r8.matches()
            if (r8 == 0) goto L2d
            mc.f r1 = r1.c()
            r0.a(r1, r10)
            goto L5a
        L2d:
            java.util.regex.Matcher r2 = r4.matcher(r2)
            boolean r2 = r2.matches()
            if (r2 == 0) goto L3f
            mc.f r1 = r1.c()
            r0.a(r1, r10)
            goto L7b
        L3f:
            mc.d r0 = r0.f22194d
            mc.f r0 = r0.c()
            if (r0 != 0) goto L48
            goto L4e
        L48:
            org.json.JSONObject r0 = r0.f22167b     // Catch: org.json.JSONException -> L4e
            java.lang.String r3 = r0.getString(r10)     // Catch: org.json.JSONException -> L4e
        L4e:
            if (r3 == 0) goto L67
            java.util.regex.Matcher r0 = r5.matcher(r3)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L5c
        L5a:
            r6 = r7
            goto L7b
        L5c:
            java.util.regex.Matcher r0 = r4.matcher(r3)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L67
            goto L7b
        L67:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Boolean"
            r0[r6] = r1
            r0[r7] = r10
            java.lang.String r10 = "No value of type '%s' exists for parameter key '%s'."
            java.lang.String r10 = java.lang.String.format(r10, r0)
            java.lang.String r0 = "FirebaseRemoteConfig"
            android.util.Log.w(r0, r10)
        L7b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: lc.b.a(java.lang.String):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long b() {
        /*
            r7 = this;
            mc.j r0 = r7.f21333h
            mc.d r1 = r0.f22193c
            mc.f r2 = r1.c()
            r3 = 0
            java.lang.String r4 = "total_number_of_scan_free"
            if (r2 != 0) goto Lf
        Ld:
            r2 = r3
            goto L19
        Lf:
            org.json.JSONObject r2 = r2.f22167b     // Catch: org.json.JSONException -> Ld
            long r5 = r2.getLong(r4)     // Catch: org.json.JSONException -> Ld
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch: org.json.JSONException -> Ld
        L19:
            if (r2 == 0) goto L27
            mc.f r1 = r1.c()
            r0.a(r1, r4)
            long r0 = r2.longValue()
            goto L59
        L27:
            mc.d r0 = r0.f22194d
            mc.f r0 = r0.c()
            if (r0 != 0) goto L30
            goto L3a
        L30:
            org.json.JSONObject r0 = r0.f22167b     // Catch: org.json.JSONException -> L3a
            long r0 = r0.getLong(r4)     // Catch: org.json.JSONException -> L3a
            java.lang.Long r3 = java.lang.Long.valueOf(r0)     // Catch: org.json.JSONException -> L3a
        L3a:
            if (r3 == 0) goto L41
            long r0 = r3.longValue()
            goto L59
        L41:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.String r2 = "Long"
            r0[r1] = r2
            r1 = 1
            r0[r1] = r4
            java.lang.String r1 = "No value of type '%s' exists for parameter key '%s'."
            java.lang.String r0 = java.lang.String.format(r1, r0)
            java.lang.String r1 = "FirebaseRemoteConfig"
            android.util.Log.w(r1, r0)
            r0 = 0
        L59:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lc.b.b():long");
    }

    public final void c(boolean z10) {
        u2.l lVar = this.f21335j;
        synchronized (lVar) {
            ((n) lVar.f25469b).f22206e = z10;
            if (!z10) {
                synchronized (lVar) {
                    if (!((Set) lVar.a).isEmpty()) {
                        ((n) lVar.f25469b).e(0L);
                    }
                }
            }
        }
    }
}

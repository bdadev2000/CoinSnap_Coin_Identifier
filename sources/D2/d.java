package D2;

import G7.j;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import t7.AbstractC2712a;
import t7.C2724m;

/* loaded from: classes.dex */
public final class d {
    public static boolean b;

    /* renamed from: d, reason: collision with root package name */
    public static HashSet f737d;

    /* renamed from: a, reason: collision with root package name */
    public static final d f735a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final C2724m f736c = AbstractC2712a.d(c.b);

    public static final void b(Bundle bundle) {
        if (O2.a.b(d.class)) {
            return;
        }
        try {
            if (b && bundle != null && !bundle.isEmpty() && f737d != null) {
                ArrayList arrayList = new ArrayList();
                Set<String> keySet = bundle.keySet();
                j.d(keySet, "parameters.keySet()");
                for (String str : keySet) {
                    HashSet hashSet = f737d;
                    j.b(hashSet);
                    if (!hashSet.contains(str)) {
                        j.d(str, "param");
                        arrayList.add(str);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    bundle.remove((String) it.next());
                }
                bundle.putString("pm", "1");
            }
        } catch (Throwable th) {
            O2.a.a(d.class, th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004e A[Catch: all -> 0x0067, TRY_LEAVE, TryCatch #1 {all -> 0x0067, blocks: (B:6:0x0007, B:9:0x0015, B:14:0x004e, B:22:0x0060, B:23:0x0064, B:39:0x0048, B:28:0x0022, B:31:0x0029, B:33:0x0034, B:18:0x0055), top: B:5:0x0007, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r7 = this;
            boolean r0 = O2.a.b(r7)
            if (r0 == 0) goto L7
            return
        L7:
            com.facebook.internal.w r0 = com.facebook.internal.w.f13674a     // Catch: java.lang.Throwable -> L67
            java.lang.String r0 = com.facebook.r.b()     // Catch: java.lang.Throwable -> L67
            r1 = 0
            com.facebook.internal.t r0 = com.facebook.internal.w.f(r0, r1)     // Catch: java.lang.Throwable -> L67
            if (r0 != 0) goto L15
            return
        L15:
            org.json.JSONArray r0 = r0.m     // Catch: java.lang.Throwable -> L67
            boolean r2 = O2.a.b(r7)     // Catch: java.lang.Throwable -> L67
            r3 = 0
            if (r2 == 0) goto L20
        L1e:
            r2 = r3
            goto L4c
        L20:
            if (r0 == 0) goto L1e
            int r2 = r0.length()     // Catch: java.lang.Throwable -> L47
            if (r2 != 0) goto L29
            goto L1e
        L29:
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> L47
            r2.<init>()     // Catch: java.lang.Throwable -> L47
            int r4 = r0.length()     // Catch: java.lang.Throwable -> L47
            if (r4 <= 0) goto L4c
        L34:
            int r5 = r1 + 1
            java.lang.String r1 = r0.getString(r1)     // Catch: java.lang.Throwable -> L47
            java.lang.String r6 = "jsonArray.getString(i)"
            G7.j.d(r1, r6)     // Catch: java.lang.Throwable -> L47
            r2.add(r1)     // Catch: java.lang.Throwable -> L47
            if (r5 < r4) goto L45
            goto L4c
        L45:
            r1 = r5
            goto L34
        L47:
            r0 = move-exception
            O2.a.a(r7, r0)     // Catch: java.lang.Throwable -> L67
            goto L1e
        L4c:
            if (r2 != 0) goto L64
            boolean r0 = O2.a.b(r7)     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L55
            goto L63
        L55:
            t7.m r0 = D2.d.f736c     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L5f
            java.util.HashSet r0 = (java.util.HashSet) r0     // Catch: java.lang.Throwable -> L5f
            r3 = r0
            goto L63
        L5f:
            r0 = move-exception
            O2.a.a(r7, r0)     // Catch: java.lang.Throwable -> L67
        L63:
            r2 = r3
        L64:
            D2.d.f737d = r2     // Catch: java.lang.Throwable -> L67
            return
        L67:
            r0 = move-exception
            O2.a.a(r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D2.d.a():void");
    }
}

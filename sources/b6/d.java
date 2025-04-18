package b6;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f2313b;

    /* renamed from: d, reason: collision with root package name */
    public static HashSet f2315d;
    public static final d a = new d();

    /* renamed from: c, reason: collision with root package name */
    public static final Lazy f2314c = LazyKt.lazy(c.f2299c);

    public static final void b(Bundle bundle) {
        if (m6.a.b(d.class)) {
            return;
        }
        try {
            if (f2313b && bundle != null && !bundle.isEmpty() && f2315d != null) {
                ArrayList arrayList = new ArrayList();
                Set<String> keySet = bundle.keySet();
                Intrinsics.checkNotNullExpressionValue(keySet, "parameters.keySet()");
                for (String param : keySet) {
                    HashSet hashSet = f2315d;
                    Intrinsics.checkNotNull(hashSet);
                    if (!hashSet.contains(param)) {
                        Intrinsics.checkNotNullExpressionValue(param, "param");
                        arrayList.add(param);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    bundle.remove((String) it.next());
                }
                bundle.putString("pm", "1");
            }
        } catch (Throwable th2) {
            m6.a.a(d.class, th2);
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
            boolean r0 = m6.a.b(r7)
            if (r0 == 0) goto L7
            return
        L7:
            com.facebook.internal.z r0 = com.facebook.internal.z.a     // Catch: java.lang.Throwable -> L67
            java.lang.String r0 = com.facebook.x.b()     // Catch: java.lang.Throwable -> L67
            r1 = 0
            com.facebook.internal.x r0 = com.facebook.internal.z.f(r0, r1)     // Catch: java.lang.Throwable -> L67
            if (r0 != 0) goto L15
            return
        L15:
            org.json.JSONArray r0 = r0.f11133n     // Catch: java.lang.Throwable -> L67
            boolean r2 = m6.a.b(r7)     // Catch: java.lang.Throwable -> L67
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
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r6)     // Catch: java.lang.Throwable -> L47
            r2.add(r1)     // Catch: java.lang.Throwable -> L47
            if (r5 < r4) goto L45
            goto L4c
        L45:
            r1 = r5
            goto L34
        L47:
            r0 = move-exception
            m6.a.a(r7, r0)     // Catch: java.lang.Throwable -> L67
            goto L1e
        L4c:
            if (r2 != 0) goto L64
            boolean r0 = m6.a.b(r7)     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L55
            goto L63
        L55:
            kotlin.Lazy r0 = b6.d.f2314c     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L5f
            java.util.HashSet r0 = (java.util.HashSet) r0     // Catch: java.lang.Throwable -> L5f
            r3 = r0
            goto L63
        L5f:
            r0 = move-exception
            m6.a.a(r7, r0)     // Catch: java.lang.Throwable -> L67
        L63:
            r2 = r3
        L64:
            b6.d.f2315d = r2     // Catch: java.lang.Throwable -> L67
            return
        L67:
            r0 = move-exception
            m6.a.a(r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.d.a():void");
    }
}

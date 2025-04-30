package q5;

import G7.j;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f22796a = new Object();
    public static final Map b = Collections.synchronizedMap(new LinkedHashMap());

    public static C2646a a(d dVar) {
        Map map = b;
        j.d(map, "dependencies");
        Object obj = map.get(dVar);
        if (obj != null) {
            return (C2646a) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + dVar + ". Dependencies should be added at class load time.");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b5 A[Catch: all -> 0x00ce, TRY_ENTER, TryCatch #0 {all -> 0x00ce, blocks: (B:12:0x009e, B:23:0x00b5, B:24:0x00cd), top: B:11:0x009e }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x009c -> B:10:0x009d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(w7.f r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof q5.b
            if (r0 == 0) goto L13
            r0 = r11
            q5.b r0 = (q5.b) r0
            int r1 = r0.f22795n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22795n = r1
            goto L18
        L13:
            q5.b r0 = new q5.b
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.l
            x7.a r1 = x7.EnumC2928a.b
            int r2 = r0.f22795n
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r2 = r0.f22794k
            java.util.Map r4 = r0.f22793j
            java.util.Map r4 = (java.util.Map) r4
            Y7.a r5 = r0.f22792i
            q5.d r6 = r0.f22791h
            java.util.Iterator r7 = r0.f22790g
            java.util.Map r8 = r0.f22789f
            java.util.Map r8 = (java.util.Map) r8
            t7.AbstractC2712a.f(r11)
            goto L9d
        L37:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3f:
            t7.AbstractC2712a.f(r11)
            java.util.Map r11 = q5.c.b
            java.lang.String r2 = "dependencies"
            G7.j.d(r11, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r4 = r11.size()
            int r4 = u7.AbstractC2829t.Y(r4)
            r2.<init>(r4)
            java.util.Set r11 = r11.entrySet()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
            r7 = r11
            r4 = r2
        L62:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto Ld5
            java.lang.Object r11 = r7.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Object r5 = r11.getKey()
            r6 = r5
            q5.d r6 = (q5.d) r6
            java.lang.Object r11 = r11.getValue()
            q5.a r11 = (q5.C2646a) r11
            Y7.a r11 = r11.f22788a
            r5 = r4
            java.util.Map r5 = (java.util.Map) r5
            r0.f22789f = r5
            r0.f22790g = r7
            r0.f22791h = r6
            r0.f22792i = r11
            r0.f22793j = r5
            r0.f22794k = r2
            r0.f22795n = r3
            r5 = r11
            Y7.d r5 = (Y7.d) r5
            java.lang.Object r11 = r5.d(r0)
            if (r11 != r1) goto L9c
            return r1
        L9c:
            r8 = r4
        L9d:
            r11 = 0
            java.lang.String r9 = "subscriberName"
            G7.j.e(r6, r9)     // Catch: java.lang.Throwable -> Lce
            q5.a r9 = a(r6)     // Catch: java.lang.Throwable -> Lce
            u4.i r9 = r9.b     // Catch: java.lang.Throwable -> Lce
            if (r9 == 0) goto Lb5
            Y7.d r5 = (Y7.d) r5
            r5.e(r11)
            r4.put(r2, r9)
            r4 = r8
            goto L62
        Lb5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lce
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lce
            java.lang.String r2 = "Subscriber "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lce
            r1.append(r6)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r2 = " has not been registered."
            r1.append(r2)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lce
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lce
            throw r0     // Catch: java.lang.Throwable -> Lce
        Lce:
            r0 = move-exception
            Y7.d r5 = (Y7.d) r5
            r5.e(r11)
            throw r0
        Ld5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.c.b(w7.f):java.lang.Object");
    }
}

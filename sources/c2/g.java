package C2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes.dex */
public final class g implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f496a = 0;
    public final Runnable b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f497c;

    public g(h hVar, A4.d dVar) {
        G7.j.e(hVar, "this$0");
        this.f497c = hVar;
        this.b = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0047 A[Catch: Exception -> 0x000f, all -> 0x004a, TryCatch #1 {Exception -> 0x000f, blocks: (B:11:0x0019, B:17:0x002c, B:20:0x003c, B:22:0x0047, B:25:0x0050, B:28:0x0065, B:31:0x0074, B:40:0x0083, B:33:0x0086, B:46:0x0061, B:55:0x0038, B:60:0x0028), top: B:10:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x000f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0034 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.util.List r9) {
        /*
            r8 = this;
            java.lang.String r0 = "productId"
            java.lang.Class<C2.h> r1 = C2.h.class
            boolean r2 = O2.a.b(r8)
            if (r2 == 0) goto Lb
            return
        Lb:
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L4a
        Lf:
            boolean r2 = r9.hasNext()     // Catch: java.lang.Throwable -> L4a
            if (r2 == 0) goto L99
            java.lang.Object r2 = r9.next()     // Catch: java.lang.Throwable -> L4a
            boolean r3 = O2.a.b(r1)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            C2.h r4 = r8.f497c
            r5 = 0
            if (r3 == 0) goto L24
        L22:
            r3 = r5
            goto L2c
        L24:
            java.lang.Class r3 = r4.f509g     // Catch: java.lang.Throwable -> L27
            goto L2c
        L27:
            r3 = move-exception
            O2.a.a(r1, r3)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            goto L22
        L2c:
            boolean r6 = O2.a.b(r1)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            if (r6 == 0) goto L34
        L32:
            r6 = r5
            goto L3c
        L34:
            java.lang.reflect.Method r6 = r4.f514n     // Catch: java.lang.Throwable -> L37
            goto L3c
        L37:
            r6 = move-exception
            O2.a.a(r1, r6)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            goto L32
        L3c:
            r7 = 0
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            java.lang.Object r2 = C2.m.t(r3, r6, r2, r7)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            if (r3 == 0) goto L4c
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            goto L4d
        L4a:
            r9 = move-exception
            goto L9f
        L4c:
            r2 = r5
        L4d:
            if (r2 != 0) goto L50
            goto Lf
        L50:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            r3.<init>(r2)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            boolean r2 = O2.a.b(r1)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            if (r2 == 0) goto L5d
        L5b:
            r2 = r5
            goto L65
        L5d:
            android.content.Context r2 = r4.f504a     // Catch: java.lang.Throwable -> L60
            goto L65
        L60:
            r2 = move-exception
            O2.a.a(r1, r2)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            goto L5b
        L65:
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            java.lang.String r6 = "packageName"
            r3.put(r6, r2)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            boolean r2 = r3.has(r0)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            if (r2 == 0) goto Lf
            java.lang.String r2 = r3.getString(r0)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            boolean r6 = O2.a.b(r1)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            if (r6 == 0) goto L7f
            goto L86
        L7f:
            java.util.concurrent.CopyOnWriteArraySet r5 = r4.f518r     // Catch: java.lang.Throwable -> L82
            goto L86
        L82:
            r4 = move-exception
            O2.a.a(r1, r4)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
        L86:
            r5.add(r2)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            C2.e r4 = C2.h.f498s     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            java.util.concurrent.ConcurrentHashMap r4 = C2.e.b()     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            java.lang.String r5 = "skuID"
            G7.j.d(r2, r5)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            r4.put(r2, r3)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            goto Lf
        L99:
            java.lang.Runnable r9 = r8.b     // Catch: java.lang.Throwable -> L4a
            r9.run()     // Catch: java.lang.Throwable -> L4a
            return
        L9f:
            O2.a.a(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.g.a(java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0047 A[Catch: Exception -> 0x000f, all -> 0x004a, TryCatch #0 {Exception -> 0x000f, blocks: (B:11:0x0019, B:17:0x002c, B:20:0x003c, B:22:0x0047, B:25:0x0050, B:28:0x005b, B:37:0x006c, B:30:0x006f, B:47:0x0038, B:52:0x0028), top: B:10:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0034 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(java.util.List r8) {
        /*
            r7 = this;
            java.lang.String r0 = "productId"
            java.lang.Class<C2.h> r1 = C2.h.class
            boolean r2 = O2.a.b(r7)
            if (r2 == 0) goto Lb
            return
        Lb:
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L4a
        Lf:
            boolean r2 = r8.hasNext()     // Catch: java.lang.Throwable -> L4a
            if (r2 == 0) goto L78
            java.lang.Object r2 = r8.next()     // Catch: java.lang.Throwable -> L4a
            boolean r3 = O2.a.b(r1)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            r4 = 0
            C2.h r5 = r7.f497c
            if (r3 == 0) goto L24
        L22:
            r3 = r4
            goto L2c
        L24:
            java.lang.Class r3 = r5.f508f     // Catch: java.lang.Throwable -> L27
            goto L2c
        L27:
            r3 = move-exception
            O2.a.a(r1, r3)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            goto L22
        L2c:
            boolean r6 = O2.a.b(r1)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            if (r6 == 0) goto L34
        L32:
            r5 = r4
            goto L3c
        L34:
            java.lang.reflect.Method r5 = r5.m     // Catch: java.lang.Throwable -> L37
            goto L3c
        L37:
            r5 = move-exception
            O2.a.a(r1, r5)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            goto L32
        L3c:
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            java.lang.Object r2 = C2.m.t(r3, r5, r2, r6)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            if (r3 == 0) goto L4c
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            goto L4d
        L4a:
            r8 = move-exception
            goto L7e
        L4c:
            r2 = r4
        L4d:
            if (r2 != 0) goto L50
            goto Lf
        L50:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            r3.<init>(r2)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            boolean r2 = r3.has(r0)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            if (r2 == 0) goto Lf
            java.lang.String r2 = r3.getString(r0)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            C2.e r5 = C2.h.f498s     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            boolean r5 = O2.a.b(r1)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            if (r5 == 0) goto L68
            goto L6f
        L68:
            java.util.concurrent.ConcurrentHashMap r4 = C2.h.f503x     // Catch: java.lang.Throwable -> L6b
            goto L6f
        L6b:
            r5 = move-exception
            O2.a.a(r1, r5)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
        L6f:
            java.lang.String r5 = "skuID"
            G7.j.d(r2, r5)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            r4.put(r2, r3)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L4a
            goto Lf
        L78:
            java.lang.Runnable r8 = r7.b     // Catch: java.lang.Throwable -> L4a
            r8.run()     // Catch: java.lang.Throwable -> L4a
            return
        L7e:
            O2.a.a(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.g.b(java.util.List):void");
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2;
        Object obj3;
        switch (this.f496a) {
            case 0:
                if (!O2.a.b(this)) {
                    try {
                        G7.j.e(obj, "proxy");
                        G7.j.e(method, "method");
                        if (G7.j.a(method.getName(), "onPurchaseHistoryResponse")) {
                            if (objArr == null) {
                                obj2 = null;
                            } else {
                                obj2 = objArr[1];
                            }
                            if (obj2 != null && (obj2 instanceof List)) {
                                a((List) obj2);
                            }
                        }
                    } catch (Throwable th) {
                        O2.a.a(this, th);
                    }
                }
                return null;
            default:
                if (!O2.a.b(this)) {
                    try {
                        G7.j.e(obj, "proxy");
                        G7.j.e(method, "m");
                        if (G7.j.a(method.getName(), "onSkuDetailsResponse")) {
                            if (objArr == null) {
                                obj3 = null;
                            } else {
                                obj3 = objArr[1];
                            }
                            if (obj3 != null && (obj3 instanceof List)) {
                                b((List) obj3);
                            }
                        }
                    } catch (Throwable th2) {
                        O2.a.a(this, th2);
                    }
                }
                return null;
        }
    }

    public g(h hVar, Runnable runnable) {
        G7.j.e(hVar, "this$0");
        this.f497c = hVar;
        this.b = runnable;
    }
}

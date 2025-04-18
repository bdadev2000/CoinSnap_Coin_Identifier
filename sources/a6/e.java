package a6;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e implements InvocationHandler {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f253b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f254c;

    public e(f this$0, Runnable runnable, int i10) {
        this.a = i10;
        if (i10 != 1) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.f254c = this$0;
            this.f253b = runnable;
            return;
        }
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f254c = this$0;
        this.f253b = runnable;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0045 A[Catch: Exception -> 0x000f, all -> 0x009a, TryCatch #0 {Exception -> 0x000f, blocks: (B:11:0x0019, B:17:0x002b, B:20:0x003a, B:22:0x0045, B:25:0x004c, B:28:0x0060, B:31:0x006f, B:40:0x007e, B:33:0x0081, B:46:0x005c, B:55:0x0036, B:60:0x0027), top: B:10:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x000f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.util.List r9) {
        /*
            r8 = this;
            java.lang.String r0 = "productId"
            java.lang.Class<a6.f> r1 = a6.f.class
            boolean r2 = m6.a.b(r8)
            if (r2 == 0) goto Lb
            return
        Lb:
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L9a
        Lf:
            boolean r2 = r9.hasNext()     // Catch: java.lang.Throwable -> L9a
            if (r2 == 0) goto L94
            java.lang.Object r2 = r9.next()     // Catch: java.lang.Throwable -> L9a
            boolean r3 = m6.a.b(r1)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L9a
            a6.f r4 = r8.f254c
            r5 = 0
            if (r3 == 0) goto L23
            goto L2a
        L23:
            java.lang.Class r3 = r4.f265g     // Catch: java.lang.Throwable -> L26
            goto L2b
        L26:
            r3 = move-exception
            m6.a.a(r1, r3)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L9a
        L2a:
            r3 = r5
        L2b:
            boolean r6 = m6.a.b(r1)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L9a
            if (r6 == 0) goto L32
            goto L39
        L32:
            java.lang.reflect.Method r6 = r4.f272n     // Catch: java.lang.Throwable -> L35
            goto L3a
        L35:
            r6 = move-exception
            m6.a.a(r1, r6)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L9a
        L39:
            r6 = r5
        L3a:
            r7 = 0
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L9a
            java.lang.Object r2 = a6.k.D(r3, r2, r6, r7)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L9a
            boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L9a
            if (r3 == 0) goto L48
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L9a
            goto L49
        L48:
            r2 = r5
        L49:
            if (r2 != 0) goto L4c
            goto Lf
        L4c:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L9a
            r3.<init>(r2)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L9a
            boolean r2 = m6.a.b(r1)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L9a
            if (r2 == 0) goto L58
            goto L5f
        L58:
            android.content.Context r2 = r4.a     // Catch: java.lang.Throwable -> L5b
            goto L60
        L5b:
            r2 = move-exception
            m6.a.a(r1, r2)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L9a
        L5f:
            r2 = r5
        L60:
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L9a
            java.lang.String r6 = "packageName"
            r3.put(r6, r2)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L9a
            boolean r2 = r3.has(r0)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L9a
            if (r2 == 0) goto Lf
            java.lang.String r2 = r3.getString(r0)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L9a
            boolean r6 = m6.a.b(r1)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L9a
            if (r6 == 0) goto L7a
            goto L81
        L7a:
            java.util.concurrent.CopyOnWriteArraySet r5 = r4.f276r     // Catch: java.lang.Throwable -> L7d
            goto L81
        L7d:
            r4 = move-exception
            m6.a.a(r1, r4)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L9a
        L81:
            r5.add(r2)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L9a
            com.facebook.c r4 = a6.f.f255s     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L9a
            java.util.concurrent.ConcurrentHashMap r4 = com.facebook.c.t()     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L9a
            java.lang.String r5 = "skuID"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L9a
            r4.put(r2, r3)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L9a
            goto Lf
        L94:
            java.lang.Runnable r9 = r8.f253b     // Catch: java.lang.Throwable -> L9a
            r9.run()     // Catch: java.lang.Throwable -> L9a
            return
        L9a:
            r9 = move-exception
            m6.a.a(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.e.a(java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004a A[Catch: Exception -> 0x0014, all -> 0x007f, TryCatch #3 {Exception -> 0x0014, blocks: (B:11:0x001e, B:17:0x0030, B:20:0x003f, B:22:0x004a, B:25:0x0051, B:28:0x005c, B:37:0x006d, B:30:0x0070, B:47:0x003b, B:52:0x002c), top: B:10:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0037 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.util.List r8) {
        /*
            r7 = this;
            java.lang.String r0 = "productId"
            java.lang.Class<a6.f> r1 = a6.f.class
            boolean r2 = m6.a.b(r7)
            if (r2 == 0) goto Lb
            return
        Lb:
            java.lang.String r2 = "skuDetailsObjectList"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)     // Catch: java.lang.Throwable -> L7f
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L7f
        L14:
            boolean r2 = r8.hasNext()     // Catch: java.lang.Throwable -> L7f
            if (r2 == 0) goto L79
            java.lang.Object r2 = r8.next()     // Catch: java.lang.Throwable -> L7f
            boolean r3 = m6.a.b(r1)     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L7f
            r4 = 0
            a6.f r5 = r7.f254c
            if (r3 == 0) goto L28
            goto L2f
        L28:
            java.lang.Class r3 = r5.f264f     // Catch: java.lang.Throwable -> L2b
            goto L30
        L2b:
            r3 = move-exception
            m6.a.a(r1, r3)     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L7f
        L2f:
            r3 = r4
        L30:
            boolean r6 = m6.a.b(r1)     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L7f
            if (r6 == 0) goto L37
            goto L3e
        L37:
            java.lang.reflect.Method r5 = r5.f271m     // Catch: java.lang.Throwable -> L3a
            goto L3f
        L3a:
            r5 = move-exception
            m6.a.a(r1, r5)     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L7f
        L3e:
            r5 = r4
        L3f:
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L7f
            java.lang.Object r2 = a6.k.D(r3, r2, r5, r6)     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L7f
            boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L7f
            if (r3 == 0) goto L4d
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L7f
            goto L4e
        L4d:
            r2 = r4
        L4e:
            if (r2 != 0) goto L51
            goto L14
        L51:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L7f
            r3.<init>(r2)     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L7f
            boolean r2 = r3.has(r0)     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L7f
            if (r2 == 0) goto L14
            java.lang.String r2 = r3.getString(r0)     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L7f
            com.facebook.c r5 = a6.f.f255s     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L7f
            boolean r5 = m6.a.b(r1)     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L7f
            if (r5 == 0) goto L69
            goto L70
        L69:
            java.util.concurrent.ConcurrentHashMap r4 = a6.f.f259x     // Catch: java.lang.Throwable -> L6c
            goto L70
        L6c:
            r5 = move-exception
            m6.a.a(r1, r5)     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L7f
        L70:
            java.lang.String r5 = "skuID"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L7f
            r4.put(r2, r3)     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L7f
            goto L14
        L79:
            java.lang.Runnable r8 = r7.f253b     // Catch: java.lang.Throwable -> L7f
            r8.run()     // Catch: java.lang.Throwable -> L7f
            return
        L7f:
            r8 = move-exception
            m6.a.a(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.e.b(java.util.List):void");
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object proxy, Method m10, Object[] objArr) {
        Object obj;
        Object obj2;
        switch (this.a) {
            case 0:
                if (!m6.a.b(this)) {
                    try {
                        Intrinsics.checkNotNullParameter(proxy, "proxy");
                        Intrinsics.checkNotNullParameter(m10, "method");
                        if (Intrinsics.areEqual(m10.getName(), "onPurchaseHistoryResponse")) {
                            if (objArr == null) {
                                obj2 = null;
                            } else {
                                obj2 = objArr[1];
                            }
                            if (obj2 != null && (obj2 instanceof List)) {
                                a((List) obj2);
                            }
                        }
                    } catch (Throwable th2) {
                        m6.a.a(this, th2);
                    }
                }
                return null;
            default:
                if (!m6.a.b(this)) {
                    try {
                        Intrinsics.checkNotNullParameter(proxy, "proxy");
                        Intrinsics.checkNotNullParameter(m10, "m");
                        if (Intrinsics.areEqual(m10.getName(), "onSkuDetailsResponse")) {
                            if (objArr == null) {
                                obj = null;
                            } else {
                                obj = objArr[1];
                            }
                            if (obj != null && (obj instanceof List)) {
                                b((List) obj);
                            }
                        }
                    } catch (Throwable th3) {
                        m6.a.a(this, th3);
                    }
                }
                return null;
        }
    }
}

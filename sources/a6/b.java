package a6;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.facebook.x;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b {
    public static final AtomicBoolean a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f244b;

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f245c;

    /* renamed from: d, reason: collision with root package name */
    public static a f246d;

    /* renamed from: e, reason: collision with root package name */
    public static d3.f f247e;

    /* renamed from: f, reason: collision with root package name */
    public static Intent f248f;

    /* renamed from: g, reason: collision with root package name */
    public static Object f249g;

    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(android.content.Context r8, java.util.ArrayList r9, boolean r10) {
        /*
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L8
            goto Lbd
        L8:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r9 = r9.iterator()
        L16:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L47
            java.lang.Object r2 = r9.next()
            java.lang.String r2 = (java.lang.String) r2
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> L3e
            r3.<init>(r2)     // Catch: org.json.JSONException -> L3e
            java.lang.String r4 = "productId"
            java.lang.String r3 = r3.getString(r4)     // Catch: org.json.JSONException -> L3e
            java.lang.String r4 = "sku"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)     // Catch: org.json.JSONException -> L3e
            java.lang.String r4 = "purchase"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)     // Catch: org.json.JSONException -> L3e
            r0.put(r3, r2)     // Catch: org.json.JSONException -> L3e
            r1.add(r3)     // Catch: org.json.JSONException -> L3e
            goto L16
        L3e:
            r2 = move-exception
            java.lang.String r3 = "a6.b"
            java.lang.String r4 = "Error parsing in-app purchase data."
            android.util.Log.e(r3, r4, r2)
            goto L16
        L47:
            a6.g r9 = a6.g.a
            java.lang.Object r9 = a6.b.f249g
            java.lang.Class<a6.g> r2 = a6.g.class
            boolean r3 = m6.a.b(r2)
            if (r3 == 0) goto L54
            goto L8f
        L54:
            java.lang.String r3 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r3)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r3 = "skuList"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)     // Catch: java.lang.Throwable -> L8b
            a6.g r3 = a6.g.a
            java.util.LinkedHashMap r4 = r3.j(r1)     // Catch: java.lang.Throwable -> L8b
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8b
            r5.<init>()     // Catch: java.lang.Throwable -> L8b
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L8b
        L6d:
            boolean r6 = r1.hasNext()     // Catch: java.lang.Throwable -> L8b
            if (r6 == 0) goto L83
            java.lang.Object r6 = r1.next()     // Catch: java.lang.Throwable -> L8b
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L8b
            boolean r7 = r4.containsKey(r6)     // Catch: java.lang.Throwable -> L8b
            if (r7 != 0) goto L6d
            r5.add(r6)     // Catch: java.lang.Throwable -> L8b
            goto L6d
        L83:
            java.util.LinkedHashMap r8 = r3.g(r8, r5, r9, r10)     // Catch: java.lang.Throwable -> L8b
            r4.putAll(r8)     // Catch: java.lang.Throwable -> L8b
            goto L90
        L8b:
            r8 = move-exception
            m6.a.a(r2, r8)
        L8f:
            r4 = 0
        L90:
            java.util.Set r8 = r4.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L98:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto Lbd
            java.lang.Object r9 = r8.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r1 = r9.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r9 = r9.getValue()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto Lb9
            goto L98
        Lb9:
            c6.g.b(r1, r9, r10)
            goto L98
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.b.a(android.content.Context, java.util.ArrayList, boolean):void");
    }

    public static final void b() {
        boolean z10;
        boolean z11;
        int i10 = 1;
        if (f244b == null) {
            if (k.v("com.android.vending.billing.IInAppBillingService$Stub") != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            Boolean valueOf = Boolean.valueOf(z10);
            f244b = valueOf;
            if (!Intrinsics.areEqual(valueOf, Boolean.FALSE)) {
                if (k.v("com.android.billingclient.api.ProxyBillingActivity") != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                f245c = Boolean.valueOf(z11);
                g gVar = g.a;
                if (!m6.a.b(g.class)) {
                    try {
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        SharedPreferences sharedPreferences = g.f280e;
                        long j3 = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
                        if (j3 == 0) {
                            sharedPreferences.edit().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
                        } else if (currentTimeMillis - j3 > 604800) {
                            sharedPreferences.edit().clear().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
                        }
                    } catch (Throwable th2) {
                        m6.a.a(g.class, th2);
                    }
                }
                Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
                Intrinsics.checkNotNullExpressionValue(intent, "Intent(\"com.android.vending.billing.InAppBillingService.BIND\")\n            .setPackage(\"com.android.vending\")");
                f248f = intent;
                f246d = new a();
                f247e = new d3.f(i10);
            }
        }
        if (!Intrinsics.areEqual(f244b, Boolean.FALSE) && c6.g.a() && a.compareAndSet(false, true)) {
            Context a10 = x.a();
            if (a10 instanceof Application) {
                Application application = (Application) a10;
                d3.f fVar = f247e;
                if (fVar != null) {
                    application.registerActivityLifecycleCallbacks(fVar);
                    Intent intent2 = f248f;
                    if (intent2 != null) {
                        a aVar = f246d;
                        if (aVar != null) {
                            a10.bindService(intent2, aVar, 1);
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("serviceConnection");
                            throw null;
                        }
                    }
                    Intrinsics.throwUninitializedPropertyAccessException("intent");
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("callbacks");
                throw null;
            }
        }
    }
}

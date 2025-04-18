package a6;

import android.media.MediaDrmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import lb.n;
import x7.a0;
import x7.b0;
import x7.z;

/* loaded from: classes3.dex */
public final class c implements z1.f, b0 {

    /* renamed from: b, reason: collision with root package name */
    public static final c f250b = new c();

    /* renamed from: c, reason: collision with root package name */
    public static final c f251c = new c();

    /* renamed from: d, reason: collision with root package name */
    public static final z1.d f252d = new z1.d(26);

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038 A[Catch: all -> 0x00a0, TRY_LEAVE, TryCatch #0 {, blocks: (B:12:0x001a, B:16:0x0032, B:18:0x0038, B:39:0x003e, B:47:0x004e, B:41:0x0051, B:52:0x002e, B:49:0x002a, B:44:0x004a), top: B:11:0x001a, outer: #2, inners: #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x003e A[Catch: all -> 0x00a0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:12:0x001a, B:16:0x0032, B:18:0x0038, B:39:0x003e, B:47:0x004e, B:41:0x0051, B:52:0x002e, B:49:0x002a, B:44:0x004a), top: B:11:0x001a, outer: #2, inners: #3, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void j(android.content.Context r4) {
        /*
            java.lang.Class<a6.c> r0 = a6.c.class
            boolean r0 = m6.a.b(r0)
            if (r0 == 0) goto L9
            return
        L9:
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)     // Catch: java.lang.Throwable -> La3
            java.lang.String r0 = "com.android.billingclient.api.Purchase"
            java.lang.Class r0 = a6.k.v(r0)     // Catch: java.lang.Throwable -> La3
            if (r0 != 0) goto L17
            return
        L17:
            com.facebook.c r0 = a6.f.f255s     // Catch: java.lang.Throwable -> La3
            monitor-enter(r0)     // Catch: java.lang.Throwable -> La3
            java.lang.String r1 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r1)     // Catch: java.lang.Throwable -> La0
            java.lang.Class<a6.f> r1 = a6.f.class
            boolean r2 = m6.a.b(r1)     // Catch: java.lang.Throwable -> La0
            r3 = 0
            if (r2 == 0) goto L2a
        L28:
            r1 = r3
            goto L32
        L2a:
            java.util.concurrent.atomic.AtomicBoolean r1 = a6.f.f256t     // Catch: java.lang.Throwable -> L2d
            goto L32
        L2d:
            r2 = move-exception
            m6.a.a(r1, r2)     // Catch: java.lang.Throwable -> La0
            goto L28
        L32:
            boolean r1 = r1.get()     // Catch: java.lang.Throwable -> La0
            if (r1 == 0) goto L3e
            a6.f r4 = a6.f.a()     // Catch: java.lang.Throwable -> La0
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La3
            goto L5a
        L3e:
            com.facebook.c.i(r4)     // Catch: java.lang.Throwable -> La0
            java.lang.Class<a6.f> r4 = a6.f.class
            boolean r1 = m6.a.b(r4)     // Catch: java.lang.Throwable -> La0
            if (r1 == 0) goto L4a
            goto L51
        L4a:
            java.util.concurrent.atomic.AtomicBoolean r3 = a6.f.f256t     // Catch: java.lang.Throwable -> L4d
            goto L51
        L4d:
            r1 = move-exception
            m6.a.a(r4, r1)     // Catch: java.lang.Throwable -> La0
        L51:
            r4 = 1
            r3.set(r4)     // Catch: java.lang.Throwable -> La0
            a6.f r4 = a6.f.a()     // Catch: java.lang.Throwable -> La0
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La3
        L5a:
            if (r4 != 0) goto L5d
            return
        L5d:
            java.util.concurrent.atomic.AtomicBoolean r0 = com.facebook.c.v()     // Catch: java.lang.Throwable -> La3
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> La3
            if (r0 == 0) goto L9f
            boolean r0 = a6.h.d()     // Catch: java.lang.Throwable -> La3
            r1 = 9
            if (r0 == 0) goto L97
            java.lang.String r0 = "inapp"
            com.applovin.impl.sdk.g0 r2 = new com.applovin.impl.sdk.g0     // Catch: java.lang.Throwable -> La3
            r3 = 8
            r2.<init>(r3)     // Catch: java.lang.Throwable -> La3
            boolean r3 = m6.a.b(r4)     // Catch: java.lang.Throwable -> La3
            if (r3 == 0) goto L7f
            goto L9f
        L7f:
            java.lang.String r3 = "skuType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)     // Catch: java.lang.Throwable -> L92
            java.lang.String r0 = "queryPurchaseHistoryRunnable"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)     // Catch: java.lang.Throwable -> L92
            com.facebook.r0 r0 = new com.facebook.r0     // Catch: java.lang.Throwable -> L92
            r0.<init>(r1, r4, r2)     // Catch: java.lang.Throwable -> L92
            r4.c(r0)     // Catch: java.lang.Throwable -> L92
            goto L9f
        L92:
            r0 = move-exception
            m6.a.a(r4, r0)     // Catch: java.lang.Throwable -> La3
            goto L9f
        L97:
            com.applovin.impl.sdk.g0 r0 = new com.applovin.impl.sdk.g0     // Catch: java.lang.Throwable -> La3
            r0.<init>(r1)     // Catch: java.lang.Throwable -> La3
            r4.b(r0)     // Catch: java.lang.Throwable -> La3
        L9f:
            return
        La0:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La3
            throw r4     // Catch: java.lang.Throwable -> La3
        La3:
            r4 = move-exception
            java.lang.Class<a6.c> r0 = a6.c.class
            m6.a.a(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.c.j(android.content.Context):void");
    }

    @Override // x7.b0
    public int a() {
        return 1;
    }

    @Override // x7.b0
    public void b(v3.c cVar) {
    }

    @Override // x7.b0
    public w7.b c(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // x7.b0
    public void closeSession(byte[] bArr) {
    }

    @Override // z1.f
    public z1.g d(z1.e configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new a2.h(configuration.a, configuration.f28461b, configuration.f28462c, configuration.f28463d, configuration.f28464e);
    }

    @Override // x7.b0
    public z e(byte[] bArr, List list, int i10, HashMap hashMap) {
        throw new IllegalStateException();
    }

    @Override // x7.b0
    public boolean g(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // x7.b0
    public a0 getProvisionRequest() {
        throw new IllegalStateException();
    }

    public void h(wb.a aVar) {
        lb.a aVar2 = lb.a.a;
        xb.d dVar = (xb.d) aVar;
        dVar.a(n.class, aVar2);
        dVar.a(lb.b.class, aVar2);
    }

    public void i() {
        ConcurrentHashMap concurrentHashMap;
        if (m6.a.b(this)) {
            return;
        }
        try {
            h hVar = h.a;
            com.facebook.c cVar = f.f255s;
            ConcurrentHashMap t5 = com.facebook.c.t();
            if (!m6.a.b(f.class)) {
                try {
                    concurrentHashMap = f.f259x;
                } catch (Throwable th2) {
                    m6.a.a(f.class, th2);
                }
                h.e(t5, concurrentHashMap);
                com.facebook.c.t().clear();
            }
            concurrentHashMap = null;
            h.e(t5, concurrentHashMap);
            com.facebook.c.t().clear();
        } catch (Throwable th3) {
            m6.a.a(this, th3);
        }
    }

    @Override // x7.b0
    public byte[] openSession() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // x7.b0
    public byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // x7.b0
    public void provideProvisionResponse(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // x7.b0
    public Map queryKeyStatus(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // x7.b0
    public void release() {
    }

    @Override // x7.b0
    public void restoreKeys(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }
}

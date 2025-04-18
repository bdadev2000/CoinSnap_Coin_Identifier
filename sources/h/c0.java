package h;

import android.graphics.ImageDecoder;
import android.os.Build;
import java.nio.ByteBuffer;
import okio.Path;

/* loaded from: classes2.dex */
public final class c0 implements j {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f30652a;

    /* renamed from: b, reason: collision with root package name */
    public final q.n f30653b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f30654c;

    public c0(d0 d0Var, q.n nVar, boolean z2) {
        this.f30652a = d0Var;
        this.f30653b = nVar;
        this.f30654c = z2;
    }

    public static final ImageDecoder.Source b(c0 c0Var, d0 d0Var) {
        ImageDecoder.Source createSource;
        ImageDecoder.Source createSource2;
        ImageDecoder.Source createSource3;
        ImageDecoder.Source createSource4;
        ImageDecoder.Source createSource5;
        ImageDecoder.Source createSource6;
        ImageDecoder.Source createSource7;
        c0Var.getClass();
        Path c2 = d0Var.c();
        if (c2 != null) {
            createSource7 = ImageDecoder.createSource(c2.toFile());
            return createSource7;
        }
        p0.a e = d0Var.e();
        boolean z2 = e instanceof a;
        q.n nVar = c0Var.f30653b;
        if (z2) {
            createSource6 = ImageDecoder.createSource(nVar.f31314a.getAssets(), ((a) e).f30642a);
            return createSource6;
        }
        if (e instanceof f) {
            createSource5 = ImageDecoder.createSource(nVar.f31314a.getContentResolver(), ((f) e).f30664a);
            return createSource5;
        }
        if (e instanceof f0) {
            f0 f0Var = (f0) e;
            if (p0.a.g(f0Var.f30665a, nVar.f31314a.getPackageName())) {
                createSource4 = ImageDecoder.createSource(nVar.f31314a.getResources(), f0Var.f30666b);
                return createSource4;
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            createSource3 = ImageDecoder.createSource(d0Var.h().readByteArray());
            return createSource3;
        }
        if (i2 == 30) {
            createSource2 = ImageDecoder.createSource(ByteBuffer.wrap(d0Var.h().readByteArray()));
            return createSource2;
        }
        createSource = ImageDecoder.createSource(d0Var.a().toFile());
        return createSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.jvm.internal.b0] */
    @Override // h.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(h0.g r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof h.y
            if (r0 == 0) goto L13
            r0 = r8
            h.y r0 = (h.y) r0
            int r1 = r0.f30710f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30710f = r1
            goto L18
        L13:
            h.y r0 = new h.y
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f30709c
            i0.a r1 = i0.a.f30806a
            int r2 = r0.f30710f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r0 = r0.f30707a
            kotlin.jvm.internal.b0 r0 = (kotlin.jvm.internal.b0) r0
            kotlin.jvm.internal.q.m(r8)
            goto L70
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L36:
            kotlin.jvm.internal.b0 r2 = r0.f30708b
            java.lang.Object r4 = r0.f30707a
            h.c0 r4 = (h.c0) r4
            kotlin.jvm.internal.q.m(r8)
            goto L5f
        L40:
            kotlin.jvm.internal.q.m(r8)
            kotlin.jvm.internal.b0 r8 = new kotlin.jvm.internal.b0
            r8.<init>()
            h.a0 r2 = new h.a0
            r5 = 0
            r2.<init>(r5, r7, r8)
            r0.f30707a = r7
            r0.f30708b = r8
            r0.f30710f = r4
            java.lang.Object r2 = kotlin.jvm.internal.e.A(r2, r0)
            if (r2 != r1) goto L5b
            return r1
        L5b:
            r4 = r7
            r6 = r2
            r2 = r8
            r8 = r6
        L5f:
            android.graphics.drawable.Drawable r8 = (android.graphics.drawable.Drawable) r8
            r0.f30707a = r2
            r5 = 0
            r0.f30708b = r5
            r0.f30710f = r3
            android.graphics.drawable.Drawable r8 = r4.c(r8, r0)
            if (r8 != r1) goto L6f
            return r1
        L6f:
            r0 = r2
        L70:
            android.graphics.drawable.Drawable r8 = (android.graphics.drawable.Drawable) r8
            boolean r0 = r0.f30919a
            h.h r1 = new h.h
            r1.<init>(r8, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h.c0.a(h0.g):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable c(android.graphics.drawable.Drawable r5, h0.g r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof h.b0
            if (r0 == 0) goto L13
            r0 = r6
            h.b0 r0 = (h.b0) r0
            int r1 = r0.f30649c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30649c = r1
            goto L18
        L13:
            h.b0 r0 = new h.b0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f30647a
            i0.a r1 = i0.a.f30806a
            int r0 = r0.f30649c
            if (r0 == 0) goto L31
            r5 = 1
            if (r0 != r5) goto L29
            kotlin.jvm.internal.q.m(r6)
            r5 = 0
            r6 = r5
            goto L6a
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.jvm.internal.q.m(r6)
            boolean r6 = androidx.media.a.B(r5)
            if (r6 != 0) goto L3b
            return r5
        L3b:
            android.graphics.drawable.AnimatedImageDrawable r6 = h.v.g(r5)
            q.n r0 = r4.f30653b
            q.o r1 = r0.f31323l
            java.util.Map r1 = r1.f31328a
            java.lang.String r2 = "coil#repeat_count"
            java.lang.Object r1 = r1.get(r2)
            android.support.v4.media.d.C(r1)
            h.v.o(r6)
            q.o r6 = r0.f31323l
            java.util.Map r0 = r6.f31328a
            java.lang.String r1 = "coil#animation_start_callback"
            java.lang.Object r0 = r0.get(r1)
            android.support.v4.media.d.C(r0)
            java.util.Map r6 = r6.f31328a
            java.lang.String r0 = "coil#animation_end_callback"
            java.lang.Object r6 = r6.get(r0)
            android.support.v4.media.d.C(r6)
            r6 = r4
        L6a:
            j.b r0 = new j.b
            q.n r6 = r6.f30653b
            r.f r6 = r6.e
            r0.<init>(r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h.c0.c(android.graphics.drawable.Drawable, h0.g):android.graphics.drawable.Drawable");
    }
}

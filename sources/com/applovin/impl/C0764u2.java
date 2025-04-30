package com.applovin.impl;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;

/* renamed from: com.applovin.impl.u2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0764u2 extends AbstractC0685d2 {

    /* renamed from: n, reason: collision with root package name */
    private final n5 f11535n;

    /* renamed from: o, reason: collision with root package name */
    private final yg f11536o;

    /* renamed from: p, reason: collision with root package name */
    private long f11537p;

    /* renamed from: q, reason: collision with root package name */
    private InterfaceC0760t2 f11538q;

    /* renamed from: r, reason: collision with root package name */
    private long f11539r;

    public C0764u2() {
        super(6);
        this.f11535n = new n5(1);
        this.f11536o = new yg();
    }

    private void z() {
        InterfaceC0760t2 interfaceC0760t2 = this.f11538q;
        if (interfaceC0760t2 != null) {
            interfaceC0760t2.a();
        }
    }

    @Override // com.applovin.impl.AbstractC0685d2, com.applovin.impl.oh.b
    public void a(int i9, Object obj) {
        if (i9 == 8) {
            this.f11538q = (InterfaceC0760t2) obj;
        } else {
            super.a(i9, obj);
        }
    }

    @Override // com.applovin.impl.li
    public boolean c() {
        return j();
    }

    @Override // com.applovin.impl.li
    public boolean d() {
        return true;
    }

    @Override // com.applovin.impl.li, com.applovin.impl.mi
    public String getName() {
        return "CameraMotionRenderer";
    }

    @Override // com.applovin.impl.AbstractC0685d2
    public void v() {
        z();
    }

    @Override // com.applovin.impl.AbstractC0685d2
    public void a(long j7, boolean z8) {
        this.f11539r = Long.MIN_VALUE;
        z();
    }

    @Override // com.applovin.impl.AbstractC0685d2
    public void a(d9[] d9VarArr, long j7, long j9) {
        this.f11537p = j9;
    }

    private float[] a(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f11536o.a(byteBuffer.array(), byteBuffer.limit());
        this.f11536o.f(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i9 = 0; i9 < 3; i9++) {
            fArr[i9] = Float.intBitsToFloat(this.f11536o.m());
        }
        return fArr;
    }

    @Override // com.applovin.impl.li
    public void a(long j7, long j9) {
        while (!j() && this.f11539r < 100000 + j7) {
            this.f11535n.b();
            if (a(r(), this.f11535n, 0) != -4 || this.f11535n.e()) {
                return;
            }
            n5 n5Var = this.f11535n;
            this.f11539r = n5Var.f9275f;
            if (this.f11538q != null && !n5Var.d()) {
                this.f11535n.g();
                float[] a6 = a((ByteBuffer) yp.a(this.f11535n.f9273c));
                if (a6 != null) {
                    ((InterfaceC0760t2) yp.a(this.f11538q)).a(this.f11539r - this.f11537p, a6);
                }
            }
        }
    }

    @Override // com.applovin.impl.mi
    public int a(d9 d9Var) {
        if (MimeTypes.APPLICATION_CAMERA_MOTION.equals(d9Var.m)) {
            return mi.a(4);
        }
        return mi.a(0);
    }
}

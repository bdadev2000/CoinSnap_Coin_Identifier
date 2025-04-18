package com.applovin.impl;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class w2 extends e2 {

    /* renamed from: n, reason: collision with root package name */
    private final p5 f27661n;

    /* renamed from: o, reason: collision with root package name */
    private final bh f27662o;

    /* renamed from: p, reason: collision with root package name */
    private long f27663p;

    /* renamed from: q, reason: collision with root package name */
    private v2 f27664q;

    /* renamed from: r, reason: collision with root package name */
    private long f27665r;

    public w2() {
        super(6);
        this.f27661n = new p5(1);
        this.f27662o = new bh();
    }

    private void z() {
        v2 v2Var = this.f27664q;
        if (v2Var != null) {
            v2Var.a();
        }
    }

    @Override // com.applovin.impl.e2
    public void a(f9[] f9VarArr, long j2, long j3) {
        this.f27663p = j3;
    }

    @Override // com.applovin.impl.qi
    public boolean c() {
        return j();
    }

    @Override // com.applovin.impl.qi
    public boolean d() {
        return true;
    }

    @Override // com.applovin.impl.qi, com.applovin.impl.ri
    public String getName() {
        return "CameraMotionRenderer";
    }

    @Override // com.applovin.impl.e2
    public void v() {
        z();
    }

    @Override // com.applovin.impl.e2, com.applovin.impl.rh.b
    public void a(int i2, Object obj) {
        if (i2 == 8) {
            this.f27664q = (v2) obj;
        } else {
            super.a(i2, obj);
        }
    }

    @Override // com.applovin.impl.e2
    public void a(long j2, boolean z2) {
        this.f27665r = Long.MIN_VALUE;
        z();
    }

    private float[] a(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f27662o.a(byteBuffer.array(), byteBuffer.limit());
        this.f27662o.f(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i2 = 0; i2 < 3; i2++) {
            fArr[i2] = Float.intBitsToFloat(this.f27662o.m());
        }
        return fArr;
    }

    @Override // com.applovin.impl.qi
    public void a(long j2, long j3) {
        while (!j() && this.f27665r < 100000 + j2) {
            this.f27661n.b();
            if (a(r(), this.f27661n, 0) != -4 || this.f27661n.e()) {
                return;
            }
            p5 p5Var = this.f27661n;
            this.f27665r = p5Var.f25964f;
            if (this.f27664q != null && !p5Var.d()) {
                this.f27661n.g();
                float[] a2 = a((ByteBuffer) xp.a(this.f27661n.f25963c));
                if (a2 != null) {
                    ((v2) xp.a(this.f27664q)).a(this.f27665r - this.f27663p, a2);
                }
            }
        }
    }

    @Override // com.applovin.impl.ri
    public int a(f9 f9Var) {
        if ("application/x-camera-motion".equals(f9Var.f23840m)) {
            return ri.a(4);
        }
        return ri.a(0);
    }
}

package com.applovin.impl;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class u2 extends d2 {

    /* renamed from: n, reason: collision with root package name */
    private final n5 f8324n;

    /* renamed from: o, reason: collision with root package name */
    private final yg f8325o;

    /* renamed from: p, reason: collision with root package name */
    private long f8326p;

    /* renamed from: q, reason: collision with root package name */
    private t2 f8327q;

    /* renamed from: r, reason: collision with root package name */
    private long f8328r;

    public u2() {
        super(6);
        this.f8324n = new n5(1);
        this.f8325o = new yg();
    }

    private void z() {
        t2 t2Var = this.f8327q;
        if (t2Var != null) {
            t2Var.a();
        }
    }

    @Override // com.applovin.impl.d2, com.applovin.impl.oh.b
    public void a(int i10, Object obj) {
        if (i10 == 8) {
            this.f8327q = (t2) obj;
        } else {
            super.a(i10, obj);
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

    @Override // com.applovin.impl.d2
    public void v() {
        z();
    }

    @Override // com.applovin.impl.d2
    public void a(long j3, boolean z10) {
        this.f8328r = Long.MIN_VALUE;
        z();
    }

    @Override // com.applovin.impl.d2
    public void a(d9[] d9VarArr, long j3, long j10) {
        this.f8326p = j10;
    }

    private float[] a(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f8325o.a(byteBuffer.array(), byteBuffer.limit());
        this.f8325o.f(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i10 = 0; i10 < 3; i10++) {
            fArr[i10] = Float.intBitsToFloat(this.f8325o.m());
        }
        return fArr;
    }

    @Override // com.applovin.impl.li
    public void a(long j3, long j10) {
        while (!j() && this.f8328r < 100000 + j3) {
            this.f8324n.b();
            if (a(r(), this.f8324n, 0) != -4 || this.f8324n.e()) {
                return;
            }
            n5 n5Var = this.f8324n;
            this.f8328r = n5Var.f6353f;
            if (this.f8327q != null && !n5Var.d()) {
                this.f8324n.g();
                float[] a = a((ByteBuffer) yp.a(this.f8324n.f6351c));
                if (a != null) {
                    ((t2) yp.a(this.f8327q)).a(this.f8328r - this.f8326p, a);
                }
            }
        }
    }

    @Override // com.applovin.impl.mi
    public int a(d9 d9Var) {
        if (MimeTypes.APPLICATION_CAMERA_MOTION.equals(d9Var.f4228m)) {
            return mi.a(4);
        }
        return mi.a(0);
    }
}

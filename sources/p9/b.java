package p9;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import n9.h0;
import n9.x;
import s7.r0;

/* loaded from: classes3.dex */
public final class b extends s7.g {

    /* renamed from: q, reason: collision with root package name */
    public final w7.i f23494q;

    /* renamed from: r, reason: collision with root package name */
    public final x f23495r;

    /* renamed from: s, reason: collision with root package name */
    public long f23496s;

    /* renamed from: t, reason: collision with root package name */
    public a f23497t;
    public long u;

    public b() {
        super(6);
        this.f23494q = new w7.i(1);
        this.f23495r = new x();
    }

    @Override // s7.g
    public final String f() {
        return "CameraMotionRenderer";
    }

    @Override // s7.g
    public final boolean h() {
        return g();
    }

    @Override // s7.g, s7.i2
    public final void handleMessage(int i10, Object obj) {
        if (i10 == 8) {
            this.f23497t = (a) obj;
        }
    }

    @Override // s7.g
    public final boolean i() {
        return true;
    }

    @Override // s7.g
    public final void j() {
        a aVar = this.f23497t;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // s7.g
    public final void l(long j3, boolean z10) {
        this.u = Long.MIN_VALUE;
        a aVar = this.f23497t;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // s7.g
    public final void q(r0[] r0VarArr, long j3, long j10) {
        this.f23496s = j10;
    }

    @Override // s7.g
    public final void s(long j3, long j10) {
        float[] fArr;
        while (!g() && this.u < 100000 + j3) {
            w7.i iVar = this.f23494q;
            iVar.e();
            r4.c cVar = this.f24360d;
            cVar.i();
            if (r(cVar, iVar, 0) == -4 && !iVar.c(4)) {
                this.u = iVar.f26892h;
                if (this.f23497t != null && !iVar.d()) {
                    iVar.h();
                    ByteBuffer byteBuffer = iVar.f26890f;
                    int i10 = h0.a;
                    if (byteBuffer.remaining() != 16) {
                        fArr = null;
                    } else {
                        byte[] array = byteBuffer.array();
                        int limit = byteBuffer.limit();
                        x xVar = this.f23495r;
                        xVar.E(array, limit);
                        xVar.G(byteBuffer.arrayOffset() + 4);
                        float[] fArr2 = new float[3];
                        for (int i11 = 0; i11 < 3; i11++) {
                            fArr2[i11] = Float.intBitsToFloat(xVar.i());
                        }
                        fArr = fArr2;
                    }
                    if (fArr != null) {
                        this.f23497t.b(this.u - this.f23496s, fArr);
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override // s7.g
    public final int w(r0 r0Var) {
        if (MimeTypes.APPLICATION_CAMERA_MOTION.equals(r0Var.f24723n)) {
            return s7.g.b(4, 0, 0);
        }
        return s7.g.b(0, 0, 0);
    }
}

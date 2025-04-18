package c8;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import eb.j;
import kotlin.UByte;
import l0.h;
import n9.u;
import n9.x;
import s7.q0;
import s7.r0;
import y7.a0;

/* loaded from: classes3.dex */
public final class e extends h {

    /* renamed from: d, reason: collision with root package name */
    public final x f2733d;

    /* renamed from: f, reason: collision with root package name */
    public final x f2734f;

    /* renamed from: g, reason: collision with root package name */
    public int f2735g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2736h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2737i;

    /* renamed from: j, reason: collision with root package name */
    public int f2738j;

    public e(a0 a0Var) {
        super(a0Var, 7);
        this.f2733d = new x(u.a);
        this.f2734f = new x(4);
    }

    public final boolean k(x xVar) {
        int v10 = xVar.v();
        int i10 = (v10 >> 4) & 15;
        int i11 = v10 & 15;
        if (i11 == 7) {
            this.f2738j = i10;
            if (i10 != 5) {
                return true;
            }
            return false;
        }
        throw new d(j.i("Video format not supported: ", i11));
    }

    public final boolean l(long j3, x xVar) {
        int i10;
        int v10 = xVar.v();
        byte[] bArr = xVar.a;
        int i11 = xVar.f22599b;
        int i12 = i11 + 1;
        int i13 = (((bArr[i11] & UByte.MAX_VALUE) << 24) >> 8) | ((bArr[i12] & UByte.MAX_VALUE) << 8);
        xVar.f22599b = i12 + 1 + 1;
        long j10 = (((bArr[r4] & UByte.MAX_VALUE) | i13) * 1000) + j3;
        if (v10 == 0 && !this.f2736h) {
            x xVar2 = new x(new byte[xVar.f22600c - xVar.f22599b]);
            xVar.d(xVar2.a, 0, xVar.f22600c - xVar.f22599b);
            o9.a a = o9.a.a(xVar2);
            this.f2735g = a.f23171b;
            q0 q0Var = new q0();
            q0Var.f24667k = MimeTypes.VIDEO_H264;
            q0Var.f24664h = a.f23178i;
            q0Var.f24672p = a.f23172c;
            q0Var.f24673q = a.f23173d;
            q0Var.f24676t = a.f23177h;
            q0Var.f24669m = a.a;
            ((a0) this.f21106c).f(new r0(q0Var));
            this.f2736h = true;
            return false;
        }
        if (v10 != 1 || !this.f2736h) {
            return false;
        }
        if (this.f2738j == 1) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (!this.f2737i && i10 == 0) {
            return false;
        }
        x xVar3 = this.f2734f;
        byte[] bArr2 = xVar3.a;
        bArr2[0] = 0;
        bArr2[1] = 0;
        bArr2[2] = 0;
        int i14 = 4 - this.f2735g;
        int i15 = 0;
        while (xVar.f22600c - xVar.f22599b > 0) {
            xVar.d(xVar3.a, i14, this.f2735g);
            xVar3.G(0);
            int y4 = xVar3.y();
            x xVar4 = this.f2733d;
            xVar4.G(0);
            ((a0) this.f21106c).a(4, xVar4);
            ((a0) this.f21106c).a(y4, xVar);
            i15 = i15 + 4 + y4;
        }
        ((a0) this.f21106c).d(j10, i10, i15, 0, null);
        this.f2737i = true;
        return true;
    }
}

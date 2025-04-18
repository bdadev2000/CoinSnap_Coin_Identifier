package c8;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;
import l0.h;
import n9.x;
import s7.q0;
import s7.r0;
import x5.i;
import y7.a0;

/* loaded from: classes3.dex */
public final class a extends h {

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f2711h = {5512, 11025, 22050, 44100};

    /* renamed from: d, reason: collision with root package name */
    public boolean f2712d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2713f;

    /* renamed from: g, reason: collision with root package name */
    public int f2714g;

    public a(a0 a0Var) {
        super(a0Var, 7);
    }

    public final boolean k(x xVar) {
        String str;
        if (!this.f2712d) {
            int v10 = xVar.v();
            int i10 = (v10 >> 4) & 15;
            this.f2714g = i10;
            if (i10 == 2) {
                int i11 = f2711h[(v10 >> 2) & 3];
                q0 q0Var = new q0();
                q0Var.f24667k = MimeTypes.AUDIO_MPEG;
                q0Var.f24679x = 1;
                q0Var.f24680y = i11;
                ((a0) this.f21106c).f(q0Var.a());
                this.f2713f = true;
            } else if (i10 != 7 && i10 != 8) {
                if (i10 != 10) {
                    throw new d("Audio format not supported: " + this.f2714g);
                }
            } else {
                if (i10 == 7) {
                    str = MimeTypes.AUDIO_ALAW;
                } else {
                    str = MimeTypes.AUDIO_MLAW;
                }
                q0 q0Var2 = new q0();
                q0Var2.f24667k = str;
                q0Var2.f24679x = 1;
                q0Var2.f24680y = 8000;
                ((a0) this.f21106c).f(q0Var2.a());
                this.f2713f = true;
            }
            this.f2712d = true;
        } else {
            xVar.H(1);
        }
        return true;
    }

    public final boolean l(long j3, x xVar) {
        if (this.f2714g == 2) {
            int i10 = xVar.f22600c - xVar.f22599b;
            ((a0) this.f21106c).a(i10, xVar);
            ((a0) this.f21106c).d(j3, 1, i10, 0, null);
            return true;
        }
        int v10 = xVar.v();
        if (v10 == 0 && !this.f2713f) {
            int i11 = xVar.f22600c - xVar.f22599b;
            byte[] bArr = new byte[i11];
            xVar.d(bArr, 0, i11);
            u7.a q10 = i.q(bArr);
            q0 q0Var = new q0();
            q0Var.f24667k = MimeTypes.AUDIO_AAC;
            q0Var.f24664h = q10.a;
            q0Var.f24679x = q10.f25528c;
            q0Var.f24680y = q10.f25527b;
            q0Var.f24669m = Collections.singletonList(bArr);
            ((a0) this.f21106c).f(new r0(q0Var));
            this.f2713f = true;
            return false;
        }
        if (this.f2714g == 10 && v10 != 1) {
            return false;
        }
        int i12 = xVar.f22600c - xVar.f22599b;
        ((a0) this.f21106c).a(i12, xVar);
        ((a0) this.f21106c).d(j3, 1, i12, 0, null);
        return true;
    }
}

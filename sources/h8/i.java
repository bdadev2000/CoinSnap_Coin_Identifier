package h8;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.UByte;
import n9.x;
import s7.q0;
import s7.r0;
import v8.u0;

/* loaded from: classes3.dex */
public final class i extends j {

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f18898o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f18899p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n, reason: collision with root package name */
    public boolean f18900n;

    public static boolean e(x xVar, byte[] bArr) {
        int i10 = xVar.f22600c;
        int i11 = xVar.f22599b;
        if (i10 - i11 < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        xVar.d(bArr2, 0, bArr.length);
        xVar.G(i11);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // h8.j
    public final long b(x xVar) {
        byte[] bArr = xVar.a;
        byte b3 = 0;
        byte b10 = bArr[0];
        if (bArr.length > 1) {
            b3 = bArr[1];
        }
        return (this.f18908i * com.bumptech.glide.c.y(b10, b3)) / 1000000;
    }

    @Override // h8.j
    public final boolean c(x xVar, long j3, r4.c cVar) {
        if (e(xVar, f18898o)) {
            byte[] copyOf = Arrays.copyOf(xVar.a, xVar.f22600c);
            int i10 = copyOf[9] & UByte.MAX_VALUE;
            ArrayList e2 = com.bumptech.glide.c.e(copyOf);
            if (((r0) cVar.f23999c) != null) {
                return true;
            }
            q0 q0Var = new q0();
            q0Var.f24667k = MimeTypes.AUDIO_OPUS;
            q0Var.f24679x = i10;
            q0Var.f24680y = 48000;
            q0Var.f24669m = e2;
            cVar.f23999c = new r0(q0Var);
            return true;
        }
        if (e(xVar, f18899p)) {
            u0.p((r0) cVar.f23999c);
            if (this.f18900n) {
                return true;
            }
            this.f18900n = true;
            xVar.H(8);
            l8.b u = com.bumptech.glide.d.u(com.google.common.collect.r0.l((String[]) com.bumptech.glide.d.y(xVar, false, false).f17517d));
            if (u == null) {
                return true;
            }
            r0 r0Var = (r0) cVar.f23999c;
            r0Var.getClass();
            q0 q0Var2 = new q0(r0Var);
            l8.b bVar = ((r0) cVar.f23999c).f24721l;
            if (bVar != null) {
                u = u.a(bVar.f21159b);
            }
            q0Var2.f24665i = u;
            cVar.f23999c = new r0(q0Var2);
            return true;
        }
        u0.p((r0) cVar.f23999c);
        return false;
    }

    @Override // h8.j
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f18900n = false;
        }
    }
}

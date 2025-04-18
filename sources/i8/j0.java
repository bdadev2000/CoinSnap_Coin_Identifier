package i8;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.List;
import s7.q0;
import s7.r0;
import v8.u0;

/* loaded from: classes3.dex */
public final class j0 {
    public final List a;

    /* renamed from: b, reason: collision with root package name */
    public final y7.a0[] f19325b;

    public j0(List list) {
        this.a = list;
        this.f19325b = new y7.a0[list.size()];
    }

    public final void a(long j3, n9.x xVar) {
        if (xVar.f22600c - xVar.f22599b < 9) {
            return;
        }
        int f10 = xVar.f();
        int f11 = xVar.f();
        int v10 = xVar.v();
        if (f10 == 434 && f11 == 1195456820 && v10 == 3) {
            c6.c.e(j3, xVar, this.f19325b);
        }
    }

    public final void b(y7.n nVar, h0 h0Var) {
        boolean z10;
        int i10 = 0;
        while (true) {
            y7.a0[] a0VarArr = this.f19325b;
            if (i10 < a0VarArr.length) {
                h0Var.a();
                h0Var.b();
                y7.a0 track = nVar.track(h0Var.f19317d, 3);
                r0 r0Var = (r0) this.a.get(i10);
                String str = r0Var.f24723n;
                if (!MimeTypes.APPLICATION_CEA608.equals(str) && !MimeTypes.APPLICATION_CEA708.equals(str)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                u0.e(z10, "Invalid closed caption MIME type provided: " + str);
                q0 q0Var = new q0();
                h0Var.b();
                q0Var.a = h0Var.f19318e;
                q0Var.f24667k = str;
                q0Var.f24660d = r0Var.f24715f;
                q0Var.f24659c = r0Var.f24714d;
                q0Var.C = r0Var.F;
                q0Var.f24669m = r0Var.f24725p;
                track.f(new r0(q0Var));
                a0VarArr[i10] = track;
                i10++;
            } else {
                return;
            }
        }
    }
}

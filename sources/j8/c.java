package j8;

import a4.j;
import n9.h0;
import s7.q0;
import s7.r0;
import s7.x1;
import y7.a0;
import y7.m;
import y7.n;

/* loaded from: classes3.dex */
public final class c implements b {
    public final n a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f19798b;

    /* renamed from: c, reason: collision with root package name */
    public final u7.b f19799c;

    /* renamed from: d, reason: collision with root package name */
    public final r0 f19800d;

    /* renamed from: e, reason: collision with root package name */
    public final int f19801e;

    /* renamed from: f, reason: collision with root package name */
    public long f19802f;

    /* renamed from: g, reason: collision with root package name */
    public int f19803g;

    /* renamed from: h, reason: collision with root package name */
    public long f19804h;

    public c(n nVar, a0 a0Var, u7.b bVar, String str, int i10) {
        this.a = nVar;
        this.f19798b = a0Var;
        this.f19799c = bVar;
        int i11 = (bVar.f25537c * bVar.f25541g) / 8;
        if (bVar.f25540f == i11) {
            int i12 = bVar.f25538d * i11;
            int i13 = i12 * 8;
            int max = Math.max(i11, i12 / 10);
            this.f19801e = max;
            q0 q0Var = new q0();
            q0Var.f24667k = str;
            q0Var.f24662f = i13;
            q0Var.f24663g = i13;
            q0Var.f24668l = max;
            q0Var.f24679x = bVar.f25537c;
            q0Var.f24680y = bVar.f25538d;
            q0Var.f24681z = i10;
            this.f19800d = new r0(q0Var);
            return;
        }
        StringBuilder m10 = j.m("Expected block size: ", i11, "; got: ");
        m10.append(bVar.f25540f);
        throw x1.a(m10.toString(), null);
    }

    @Override // j8.b
    public final void a(int i10, long j3) {
        this.a.d(new f(this.f19799c, 1, i10, j3));
        this.f19798b.f(this.f19800d);
    }

    @Override // j8.b
    public final boolean b(m mVar, long j3) {
        int i10;
        int i11;
        long j10 = j3;
        while (j10 > 0 && (i10 = this.f19803g) < (i11 = this.f19801e)) {
            int b3 = this.f19798b.b(mVar, (int) Math.min(i11 - i10, j10), true);
            if (b3 == -1) {
                j10 = 0;
            } else {
                this.f19803g += b3;
                j10 -= b3;
            }
        }
        int i12 = this.f19799c.f25540f;
        int i13 = this.f19803g / i12;
        if (i13 > 0) {
            long M = this.f19802f + h0.M(this.f19804h, 1000000L, r1.f25538d);
            int i14 = i13 * i12;
            int i15 = this.f19803g - i14;
            this.f19798b.d(M, 1, i14, i15, null);
            this.f19804h += i13;
            this.f19803g = i15;
        }
        if (j10 <= 0) {
            return true;
        }
        return false;
    }

    @Override // j8.b
    public final void c(long j3) {
        this.f19802f = j3;
        this.f19803g = 0;
        this.f19804h = 0L;
    }
}

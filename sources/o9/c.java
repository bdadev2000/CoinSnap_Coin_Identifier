package o9;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class c {
    public long a;

    /* renamed from: b, reason: collision with root package name */
    public long f23190b;

    /* renamed from: c, reason: collision with root package name */
    public long f23191c;

    /* renamed from: d, reason: collision with root package name */
    public long f23192d;

    /* renamed from: e, reason: collision with root package name */
    public long f23193e;

    /* renamed from: f, reason: collision with root package name */
    public long f23194f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f23195g = new boolean[15];

    /* renamed from: h, reason: collision with root package name */
    public int f23196h;

    public final boolean a() {
        return this.f23192d > 15 && this.f23196h == 0;
    }

    public final void b(long j3) {
        long j10 = this.f23192d;
        if (j10 == 0) {
            this.a = j3;
        } else if (j10 == 1) {
            long j11 = j3 - this.a;
            this.f23190b = j11;
            this.f23194f = j11;
            this.f23193e = 1L;
        } else {
            long j12 = j3 - this.f23191c;
            int i10 = (int) (j10 % 15);
            long abs = Math.abs(j12 - this.f23190b);
            boolean[] zArr = this.f23195g;
            if (abs <= 1000000) {
                this.f23193e++;
                this.f23194f += j12;
                if (zArr[i10]) {
                    zArr[i10] = false;
                    this.f23196h--;
                }
            } else if (!zArr[i10]) {
                zArr[i10] = true;
                this.f23196h++;
            }
        }
        this.f23192d++;
        this.f23191c = j3;
    }

    public final void c() {
        this.f23192d = 0L;
        this.f23193e = 0L;
        this.f23194f = 0L;
        this.f23196h = 0;
        Arrays.fill(this.f23195g, false);
    }
}

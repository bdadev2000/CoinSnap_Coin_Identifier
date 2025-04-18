package i8;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import kotlin.UByte;
import s7.q0;
import s7.r0;
import v8.u0;

/* loaded from: classes3.dex */
public final class v implements j {
    public final n9.x a;

    /* renamed from: b, reason: collision with root package name */
    public final u7.b f19459b;

    /* renamed from: c, reason: collision with root package name */
    public final String f19460c;

    /* renamed from: d, reason: collision with root package name */
    public y7.a0 f19461d;

    /* renamed from: e, reason: collision with root package name */
    public String f19462e;

    /* renamed from: f, reason: collision with root package name */
    public int f19463f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f19464g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f19465h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f19466i;

    /* renamed from: j, reason: collision with root package name */
    public long f19467j;

    /* renamed from: k, reason: collision with root package name */
    public int f19468k;

    /* renamed from: l, reason: collision with root package name */
    public long f19469l;

    public v(String str) {
        n9.x xVar = new n9.x(4);
        this.a = xVar;
        xVar.a[0] = -1;
        this.f19459b = new u7.b();
        this.f19469l = C.TIME_UNSET;
        this.f19460c = str;
    }

    @Override // i8.j
    public final void a(n9.x xVar) {
        boolean z10;
        boolean z11;
        u0.p(this.f19461d);
        while (true) {
            int i10 = xVar.f22600c;
            int i11 = xVar.f22599b;
            int i12 = i10 - i11;
            if (i12 > 0) {
                int i13 = this.f19463f;
                n9.x xVar2 = this.a;
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 == 2) {
                            int min = Math.min(i12, this.f19468k - this.f19464g);
                            this.f19461d.a(min, xVar);
                            int i14 = this.f19464g + min;
                            this.f19464g = i14;
                            int i15 = this.f19468k;
                            if (i14 >= i15) {
                                long j3 = this.f19469l;
                                if (j3 != C.TIME_UNSET) {
                                    this.f19461d.d(j3, 1, i15, 0, null);
                                    this.f19469l += this.f19467j;
                                }
                                this.f19464g = 0;
                                this.f19463f = 0;
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        int min2 = Math.min(i12, 4 - this.f19464g);
                        xVar.d(xVar2.a, this.f19464g, min2);
                        int i16 = this.f19464g + min2;
                        this.f19464g = i16;
                        if (i16 >= 4) {
                            xVar2.G(0);
                            int f10 = xVar2.f();
                            u7.b bVar = this.f19459b;
                            if (!bVar.a(f10)) {
                                this.f19464g = 0;
                                this.f19463f = 1;
                            } else {
                                this.f19468k = bVar.f25537c;
                                if (!this.f19465h) {
                                    int i17 = bVar.f25538d;
                                    this.f19467j = (bVar.f25541g * 1000000) / i17;
                                    q0 q0Var = new q0();
                                    q0Var.a = this.f19462e;
                                    q0Var.f24667k = (String) bVar.f25536b;
                                    q0Var.f24668l = 4096;
                                    q0Var.f24679x = bVar.f25539e;
                                    q0Var.f24680y = i17;
                                    q0Var.f24659c = this.f19460c;
                                    this.f19461d.f(new r0(q0Var));
                                    this.f19465h = true;
                                }
                                xVar2.G(0);
                                this.f19461d.a(4, xVar2);
                                this.f19463f = 2;
                            }
                        }
                    }
                } else {
                    byte[] bArr = xVar.a;
                    while (true) {
                        if (i11 < i10) {
                            byte b3 = bArr[i11];
                            if ((b3 & UByte.MAX_VALUE) == 255) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (this.f19466i && (b3 & 224) == 224) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            this.f19466i = z10;
                            if (z11) {
                                xVar.G(i11 + 1);
                                this.f19466i = false;
                                xVar2.a[1] = bArr[i11];
                                this.f19464g = 2;
                                this.f19463f = 1;
                                break;
                            }
                            i11++;
                        } else {
                            xVar.G(i10);
                            break;
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override // i8.j
    public final void b(int i10, long j3) {
        if (j3 != C.TIME_UNSET) {
            this.f19469l = j3;
        }
    }

    @Override // i8.j
    public final void c(y7.n nVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.f19462e = h0Var.f19318e;
        h0Var.b();
        this.f19461d = nVar.track(h0Var.f19317d, 1);
    }

    @Override // i8.j
    public final void packetFinished() {
    }

    @Override // i8.j
    public final void seek() {
        this.f19463f = 0;
        this.f19464g = 0;
        this.f19466i = false;
        this.f19469l = C.TIME_UNSET;
    }
}

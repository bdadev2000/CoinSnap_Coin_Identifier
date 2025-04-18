package i8;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;
import java.util.List;
import s7.q0;
import s7.r0;
import v8.u0;

/* loaded from: classes3.dex */
public final class i implements j {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f19319b;

    /* renamed from: c, reason: collision with root package name */
    public long f19320c;

    /* renamed from: d, reason: collision with root package name */
    public int f19321d;

    /* renamed from: e, reason: collision with root package name */
    public int f19322e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f19323f;

    /* renamed from: g, reason: collision with root package name */
    public Object f19324g;

    public i(List list) {
        this.a = 0;
        this.f19323f = list;
        this.f19324g = new y7.a0[list.size()];
        this.f19320c = C.TIME_UNSET;
    }

    @Override // i8.j
    public final void a(n9.x xVar) {
        boolean z10;
        boolean z11;
        switch (this.a) {
            case 0:
                if (this.f19319b) {
                    if (this.f19321d == 2) {
                        if (xVar.f22600c - xVar.f22599b == 0) {
                            z11 = false;
                        } else {
                            if (xVar.v() != 32) {
                                this.f19319b = false;
                            }
                            this.f19321d--;
                            z11 = this.f19319b;
                        }
                        if (!z11) {
                            return;
                        }
                    }
                    if (this.f19321d == 1) {
                        if (xVar.f22600c - xVar.f22599b == 0) {
                            z10 = false;
                        } else {
                            if (xVar.v() != 0) {
                                this.f19319b = false;
                            }
                            this.f19321d--;
                            z10 = this.f19319b;
                        }
                        if (!z10) {
                            return;
                        }
                    }
                    int i10 = xVar.f22599b;
                    int i11 = xVar.f22600c - i10;
                    for (y7.a0 a0Var : (y7.a0[]) this.f19324g) {
                        xVar.G(i10);
                        a0Var.a(i11, xVar);
                    }
                    this.f19322e += i11;
                    return;
                }
                return;
            default:
                u0.p((y7.a0) this.f19324g);
                if (this.f19319b) {
                    int i12 = xVar.f22600c - xVar.f22599b;
                    int i13 = this.f19322e;
                    if (i13 < 10) {
                        int min = Math.min(i12, 10 - i13);
                        byte[] bArr = xVar.a;
                        int i14 = xVar.f22599b;
                        n9.x xVar2 = (n9.x) this.f19323f;
                        System.arraycopy(bArr, i14, xVar2.a, this.f19322e, min);
                        if (this.f19322e + min == 10) {
                            xVar2.G(0);
                            if (73 == xVar2.v() && 68 == xVar2.v() && 51 == xVar2.v()) {
                                xVar2.H(3);
                                this.f19321d = xVar2.u() + 10;
                            } else {
                                n9.o.f("Id3Reader", "Discarding invalid ID3 tag");
                                this.f19319b = false;
                                return;
                            }
                        }
                    }
                    int min2 = Math.min(i12, this.f19321d - this.f19322e);
                    ((y7.a0) this.f19324g).a(min2, xVar);
                    this.f19322e += min2;
                    return;
                }
                return;
        }
    }

    @Override // i8.j
    public final void b(int i10, long j3) {
        switch (this.a) {
            case 0:
                if ((i10 & 4) != 0) {
                    this.f19319b = true;
                    if (j3 != C.TIME_UNSET) {
                        this.f19320c = j3;
                    }
                    this.f19322e = 0;
                    this.f19321d = 2;
                    return;
                }
                return;
            default:
                if ((i10 & 4) != 0) {
                    this.f19319b = true;
                    if (j3 != C.TIME_UNSET) {
                        this.f19320c = j3;
                    }
                    this.f19321d = 0;
                    this.f19322e = 0;
                    return;
                }
                return;
        }
    }

    @Override // i8.j
    public final void c(y7.n nVar, h0 h0Var) {
        switch (this.a) {
            case 0:
                for (int i10 = 0; i10 < ((y7.a0[]) this.f19324g).length; i10++) {
                    g0 g0Var = (g0) ((List) this.f19323f).get(i10);
                    h0Var.a();
                    h0Var.b();
                    y7.a0 track = nVar.track(h0Var.f19317d, 3);
                    q0 q0Var = new q0();
                    h0Var.b();
                    q0Var.a = h0Var.f19318e;
                    q0Var.f24667k = MimeTypes.APPLICATION_DVBSUBS;
                    q0Var.f24669m = Collections.singletonList(g0Var.f19304b);
                    q0Var.f24659c = g0Var.a;
                    track.f(new r0(q0Var));
                    ((y7.a0[]) this.f19324g)[i10] = track;
                }
                return;
            default:
                h0Var.a();
                h0Var.b();
                y7.a0 track2 = nVar.track(h0Var.f19317d, 5);
                this.f19324g = track2;
                q0 q0Var2 = new q0();
                h0Var.b();
                q0Var2.a = h0Var.f19318e;
                q0Var2.f24667k = MimeTypes.APPLICATION_ID3;
                track2.f(new r0(q0Var2));
                return;
        }
    }

    @Override // i8.j
    public final void packetFinished() {
        int i10;
        switch (this.a) {
            case 0:
                if (this.f19319b) {
                    if (this.f19320c != C.TIME_UNSET) {
                        for (y7.a0 a0Var : (y7.a0[]) this.f19324g) {
                            a0Var.d(this.f19320c, 1, this.f19322e, 0, null);
                        }
                    }
                    this.f19319b = false;
                    return;
                }
                return;
            default:
                u0.p((y7.a0) this.f19324g);
                if (this.f19319b && (i10 = this.f19321d) != 0 && this.f19322e == i10) {
                    long j3 = this.f19320c;
                    if (j3 != C.TIME_UNSET) {
                        ((y7.a0) this.f19324g).d(j3, 1, i10, 0, null);
                    }
                    this.f19319b = false;
                    return;
                }
                return;
        }
    }

    @Override // i8.j
    public final void seek() {
        switch (this.a) {
            case 0:
                this.f19319b = false;
                this.f19320c = C.TIME_UNSET;
                return;
            default:
                this.f19319b = false;
                this.f19320c = C.TIME_UNSET;
                return;
        }
    }

    public i() {
        this.a = 1;
        this.f19323f = new n9.x(10);
        this.f19320c = C.TIME_UNSET;
    }
}

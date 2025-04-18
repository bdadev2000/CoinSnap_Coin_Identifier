package androidx.datastore.preferences.protobuf;

import android.util.SparseArray;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.List;

/* loaded from: classes.dex */
public final class o {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public int f1445b;

    /* renamed from: c, reason: collision with root package name */
    public int f1446c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1447d;

    public o() {
    }

    public o(int i10, int i11) {
        lb.l[] lVarArr = new lb.l[i10];
        this.f1447d = lVarArr;
        int length = lVarArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            ((lb.l[]) this.f1447d)[i12] = new lb.l(((i11 + 4) * 17) + 1);
        }
        this.f1446c = i11 * 17;
        this.f1445b = i10;
        this.a = -1;
    }

    public static void G(int i10) {
        if ((i10 & 3) == 0) {
        } else {
            throw new j0("Failed to parse the message.");
        }
    }

    public static void H(int i10) {
        if ((i10 & 7) == 0) {
        } else {
            throw new j0("Failed to parse the message.");
        }
    }

    public final int A() {
        E(0);
        return ((n) this.f1447d).v();
    }

    public final void B(List list) {
        int u;
        if (list instanceof f0) {
            int i10 = this.a & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw j0.b();
                }
                ((n) this.f1447d).v();
                ((n) this.f1447d).b();
                ((n) this.f1447d).v();
                throw null;
            }
            ((n) this.f1447d).v();
            throw null;
        }
        int i11 = this.a & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int b3 = ((n) this.f1447d).b() + ((n) this.f1447d).v();
                do {
                    list.add(Integer.valueOf(((n) this.f1447d).v()));
                } while (((n) this.f1447d).b() < b3);
                D(b3);
                return;
            }
            throw j0.b();
        }
        do {
            list.add(Integer.valueOf(((n) this.f1447d).v()));
            if (((n) this.f1447d).c()) {
                return;
            } else {
                u = ((n) this.f1447d).u();
            }
        } while (u == this.a);
        this.f1446c = u;
    }

    public final void C(List list) {
        int u;
        if (list instanceof q0) {
            int i10 = this.a & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw j0.b();
                }
                ((n) this.f1447d).v();
                ((n) this.f1447d).b();
                ((n) this.f1447d).w();
                throw null;
            }
            ((n) this.f1447d).w();
            throw null;
        }
        int i11 = this.a & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int b3 = ((n) this.f1447d).b() + ((n) this.f1447d).v();
                do {
                    list.add(Long.valueOf(((n) this.f1447d).w()));
                } while (((n) this.f1447d).b() < b3);
                D(b3);
                return;
            }
            throw j0.b();
        }
        do {
            list.add(Long.valueOf(((n) this.f1447d).w()));
            if (((n) this.f1447d).c()) {
                return;
            } else {
                u = ((n) this.f1447d).u();
            }
        } while (u == this.a);
        this.f1446c = u;
    }

    public final void D(int i10) {
        if (((n) this.f1447d).b() == i10) {
        } else {
            throw j0.e();
        }
    }

    public final void E(int i10) {
        if ((this.a & 7) == i10) {
        } else {
            throw j0.b();
        }
    }

    public final boolean F() {
        int i10;
        if (!((n) this.f1447d).c() && (i10 = this.a) != this.f1445b) {
            return ((n) this.f1447d).x(i10);
        }
        return false;
    }

    public final void a(yg.v vVar) {
        vVar.f28272d = null;
        vVar.f28270b = null;
        vVar.f28271c = null;
        vVar.f28278k = 1;
        int i10 = this.a;
        if (i10 > 0) {
            int i11 = this.f1446c;
            if ((i11 & 1) == 0) {
                this.f1446c = i11 + 1;
                this.a = i10 - 1;
                this.f1445b++;
            }
        }
        vVar.f28270b = (yg.v) this.f1447d;
        this.f1447d = vVar;
        int i12 = this.f1446c + 1;
        this.f1446c = i12;
        int i13 = this.a;
        if (i13 > 0 && (i12 & 1) == 0) {
            this.f1446c = i12 + 1;
            this.a = i13 - 1;
            this.f1445b++;
        }
        int i14 = 4;
        while (true) {
            int i15 = i14 - 1;
            if ((this.f1446c & i15) == i15) {
                int i16 = this.f1445b;
                if (i16 == 0) {
                    yg.v vVar2 = (yg.v) this.f1447d;
                    yg.v vVar3 = vVar2.f28270b;
                    yg.v vVar4 = vVar3.f28270b;
                    vVar3.f28270b = vVar4.f28270b;
                    this.f1447d = vVar3;
                    vVar3.f28271c = vVar4;
                    vVar3.f28272d = vVar2;
                    vVar3.f28278k = vVar2.f28278k + 1;
                    vVar4.f28270b = vVar3;
                    vVar2.f28270b = vVar3;
                } else if (i16 == 1) {
                    yg.v vVar5 = (yg.v) this.f1447d;
                    yg.v vVar6 = vVar5.f28270b;
                    this.f1447d = vVar6;
                    vVar6.f28272d = vVar5;
                    vVar6.f28278k = vVar5.f28278k + 1;
                    vVar5.f28270b = vVar6;
                    this.f1445b = 0;
                } else if (i16 == 2) {
                    this.f1445b = 0;
                }
                i14 *= 2;
            } else {
                return;
            }
        }
    }

    public final s7.q b() {
        boolean z10;
        if (this.f1445b <= this.f1446c) {
            z10 = true;
        } else {
            z10 = false;
        }
        v8.u0.d(z10);
        return new s7.q(this);
    }

    public final lb.l c() {
        return ((lb.l[]) this.f1447d)[this.a];
    }

    public final int d() {
        int i10 = this.f1446c;
        if (i10 != 0) {
            this.a = i10;
            this.f1446c = 0;
        } else {
            this.a = ((n) this.f1447d).u();
        }
        int i11 = this.a;
        if (i11 != 0 && i11 != this.f1445b) {
            return i11 >>> 3;
        }
        return Integer.MAX_VALUE;
    }

    public final byte[][] e(int i10, int i11) {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.f1445b * i11, this.f1446c * i10);
        int i12 = this.f1445b * i11;
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = (i12 - i13) - 1;
            byte[] bArr2 = ((lb.l[]) this.f1447d)[i13 / i11].a;
            int length = bArr2.length * i10;
            byte[] bArr3 = new byte[length];
            for (int i15 = 0; i15 < length; i15++) {
                bArr3[i15] = bArr2[i15 / i10];
            }
            bArr[i14] = bArr3;
        }
        return bArr;
    }

    public final void f(Object obj, k1 k1Var, u uVar) {
        int i10 = this.f1445b;
        this.f1445b = ((this.a >>> 3) << 3) | 4;
        try {
            k1Var.b(obj, this, uVar);
            if (this.a == this.f1445b) {
            } else {
                throw new j0("Failed to parse the message.");
            }
        } finally {
            this.f1445b = i10;
        }
    }

    public final void g(Object obj, k1 k1Var, u uVar) {
        int v10 = ((n) this.f1447d).v();
        n nVar = (n) this.f1447d;
        if (nVar.a < nVar.f1441b) {
            int e2 = nVar.e(v10);
            ((n) this.f1447d).a++;
            k1Var.b(obj, this, uVar);
            ((n) this.f1447d).a(0);
            r5.a--;
            ((n) this.f1447d).d(e2);
            return;
        }
        throw new j0("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public final void h(List list) {
        int u;
        if (list instanceof e) {
            int i10 = this.a & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw j0.b();
                }
                ((n) this.f1447d).v();
                ((n) this.f1447d).b();
                ((n) this.f1447d).f();
                throw null;
            }
            ((n) this.f1447d).f();
            throw null;
        }
        int i11 = this.a & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int b3 = ((n) this.f1447d).b() + ((n) this.f1447d).v();
                do {
                    list.add(Boolean.valueOf(((n) this.f1447d).f()));
                } while (((n) this.f1447d).b() < b3);
                D(b3);
                return;
            }
            throw j0.b();
        }
        do {
            list.add(Boolean.valueOf(((n) this.f1447d).f()));
            if (((n) this.f1447d).c()) {
                return;
            } else {
                u = ((n) this.f1447d).u();
            }
        } while (u == this.a);
        this.f1446c = u;
    }

    public final k i() {
        E(2);
        return ((n) this.f1447d).g();
    }

    public final void j(List list) {
        int u;
        if ((this.a & 7) != 2) {
            throw j0.b();
        }
        do {
            list.add(i());
            if (((n) this.f1447d).c()) {
                return;
            } else {
                u = ((n) this.f1447d).u();
            }
        } while (u == this.a);
        this.f1446c = u;
    }

    public final void k(List list) {
        int u;
        if (list instanceof s) {
            int i10 = this.a & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    int i11 = j0.f1378c;
                    throw new i0();
                }
                H(((n) this.f1447d).v());
                ((n) this.f1447d).b();
                ((n) this.f1447d).h();
                throw null;
            }
            ((n) this.f1447d).h();
            throw null;
        }
        int i12 = this.a & 7;
        if (i12 != 1) {
            if (i12 == 2) {
                int v10 = ((n) this.f1447d).v();
                H(v10);
                int b3 = ((n) this.f1447d).b() + v10;
                do {
                    list.add(Double.valueOf(((n) this.f1447d).h()));
                } while (((n) this.f1447d).b() < b3);
                return;
            }
            int i13 = j0.f1378c;
            throw new i0();
        }
        do {
            list.add(Double.valueOf(((n) this.f1447d).h()));
            if (((n) this.f1447d).c()) {
                return;
            } else {
                u = ((n) this.f1447d).u();
            }
        } while (u == this.a);
        this.f1446c = u;
    }

    public final void l(List list) {
        int u;
        if (list instanceof f0) {
            int i10 = this.a & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw j0.b();
                }
                ((n) this.f1447d).v();
                ((n) this.f1447d).b();
                ((n) this.f1447d).i();
                throw null;
            }
            ((n) this.f1447d).i();
            throw null;
        }
        int i11 = this.a & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int b3 = ((n) this.f1447d).b() + ((n) this.f1447d).v();
                do {
                    list.add(Integer.valueOf(((n) this.f1447d).i()));
                } while (((n) this.f1447d).b() < b3);
                D(b3);
                return;
            }
            throw j0.b();
        }
        do {
            list.add(Integer.valueOf(((n) this.f1447d).i()));
            if (((n) this.f1447d).c()) {
                return;
            } else {
                u = ((n) this.f1447d).u();
            }
        } while (u == this.a);
        this.f1446c = u;
    }

    public final Object m(j2 j2Var, Class cls, u uVar) {
        switch (j2Var.ordinal()) {
            case 0:
                E(1);
                return Double.valueOf(((n) this.f1447d).h());
            case 1:
                E(5);
                return Float.valueOf(((n) this.f1447d).l());
            case 2:
                return Long.valueOf(t());
            case 3:
                E(0);
                return Long.valueOf(((n) this.f1447d).w());
            case 4:
                E(0);
                return Integer.valueOf(((n) this.f1447d).m());
            case 5:
                return Long.valueOf(p());
            case 6:
                return Integer.valueOf(n());
            case 7:
                E(0);
                return Boolean.valueOf(((n) this.f1447d).f());
            case 8:
                E(2);
                return ((n) this.f1447d).t();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                E(2);
                k1 a = h1.f1372c.a(cls);
                e0 newInstance = a.newInstance();
                g(newInstance, a, uVar);
                a.makeImmutable(newInstance);
                return newInstance;
            case 11:
                return i();
            case 12:
                return Integer.valueOf(A());
            case 13:
                E(0);
                return Integer.valueOf(((n) this.f1447d).i());
            case 14:
                E(5);
                return Integer.valueOf(((n) this.f1447d).o());
            case 15:
                E(1);
                return Long.valueOf(((n) this.f1447d).p());
            case 16:
                E(0);
                return Integer.valueOf(((n) this.f1447d).q());
            case 17:
                E(0);
                return Long.valueOf(((n) this.f1447d).r());
        }
    }

    public final int n() {
        E(5);
        return ((n) this.f1447d).j();
    }

    public final void o(List list) {
        int u;
        if (list instanceof f0) {
            int i10 = this.a & 7;
            if (i10 != 2) {
                if (i10 != 5) {
                    int i11 = j0.f1378c;
                    throw new i0();
                }
                ((n) this.f1447d).j();
                throw null;
            }
            G(((n) this.f1447d).v());
            ((n) this.f1447d).b();
            ((n) this.f1447d).j();
            throw null;
        }
        int i12 = this.a & 7;
        if (i12 != 2) {
            if (i12 != 5) {
                int i13 = j0.f1378c;
                throw new i0();
            }
            do {
                list.add(Integer.valueOf(((n) this.f1447d).j()));
                if (((n) this.f1447d).c()) {
                    return;
                } else {
                    u = ((n) this.f1447d).u();
                }
            } while (u == this.a);
            this.f1446c = u;
            return;
        }
        int v10 = ((n) this.f1447d).v();
        G(v10);
        int b3 = ((n) this.f1447d).b() + v10;
        do {
            list.add(Integer.valueOf(((n) this.f1447d).j()));
        } while (((n) this.f1447d).b() < b3);
    }

    public final long p() {
        E(1);
        return ((n) this.f1447d).k();
    }

    public final void q(List list) {
        int u;
        if (list instanceof q0) {
            int i10 = this.a & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    int i11 = j0.f1378c;
                    throw new i0();
                }
                H(((n) this.f1447d).v());
                ((n) this.f1447d).b();
                ((n) this.f1447d).k();
                throw null;
            }
            ((n) this.f1447d).k();
            throw null;
        }
        int i12 = this.a & 7;
        if (i12 != 1) {
            if (i12 == 2) {
                int v10 = ((n) this.f1447d).v();
                H(v10);
                int b3 = ((n) this.f1447d).b() + v10;
                do {
                    list.add(Long.valueOf(((n) this.f1447d).k()));
                } while (((n) this.f1447d).b() < b3);
                return;
            }
            int i13 = j0.f1378c;
            throw new i0();
        }
        do {
            list.add(Long.valueOf(((n) this.f1447d).k()));
            if (((n) this.f1447d).c()) {
                return;
            } else {
                u = ((n) this.f1447d).u();
            }
        } while (u == this.a);
        this.f1446c = u;
    }

    public final void r(List list) {
        int u;
        if (list instanceof z) {
            int i10 = this.a & 7;
            if (i10 != 2) {
                if (i10 != 5) {
                    int i11 = j0.f1378c;
                    throw new i0();
                }
                ((n) this.f1447d).l();
                throw null;
            }
            G(((n) this.f1447d).v());
            ((n) this.f1447d).b();
            ((n) this.f1447d).l();
            throw null;
        }
        int i12 = this.a & 7;
        if (i12 != 2) {
            if (i12 != 5) {
                int i13 = j0.f1378c;
                throw new i0();
            }
            do {
                list.add(Float.valueOf(((n) this.f1447d).l()));
                if (((n) this.f1447d).c()) {
                    return;
                } else {
                    u = ((n) this.f1447d).u();
                }
            } while (u == this.a);
            this.f1446c = u;
            return;
        }
        int v10 = ((n) this.f1447d).v();
        G(v10);
        int b3 = ((n) this.f1447d).b() + v10;
        do {
            list.add(Float.valueOf(((n) this.f1447d).l()));
        } while (((n) this.f1447d).b() < b3);
    }

    public final void s(List list) {
        int u;
        if (list instanceof f0) {
            int i10 = this.a & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw j0.b();
                }
                ((n) this.f1447d).v();
                ((n) this.f1447d).b();
                ((n) this.f1447d).m();
                throw null;
            }
            ((n) this.f1447d).m();
            throw null;
        }
        int i11 = this.a & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int b3 = ((n) this.f1447d).b() + ((n) this.f1447d).v();
                do {
                    list.add(Integer.valueOf(((n) this.f1447d).m()));
                } while (((n) this.f1447d).b() < b3);
                D(b3);
                return;
            }
            throw j0.b();
        }
        do {
            list.add(Integer.valueOf(((n) this.f1447d).m()));
            if (((n) this.f1447d).c()) {
                return;
            } else {
                u = ((n) this.f1447d).u();
            }
        } while (u == this.a);
        this.f1446c = u;
    }

    public final long t() {
        E(0);
        return ((n) this.f1447d).n();
    }

    public final void u(List list) {
        int u;
        if (list instanceof q0) {
            int i10 = this.a & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw j0.b();
                }
                ((n) this.f1447d).v();
                ((n) this.f1447d).b();
                ((n) this.f1447d).n();
                throw null;
            }
            ((n) this.f1447d).n();
            throw null;
        }
        int i11 = this.a & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int b3 = ((n) this.f1447d).b() + ((n) this.f1447d).v();
                do {
                    list.add(Long.valueOf(((n) this.f1447d).n()));
                } while (((n) this.f1447d).b() < b3);
                D(b3);
                return;
            }
            throw j0.b();
        }
        do {
            list.add(Long.valueOf(((n) this.f1447d).n()));
            if (((n) this.f1447d).c()) {
                return;
            } else {
                u = ((n) this.f1447d).u();
            }
        } while (u == this.a);
        this.f1446c = u;
    }

    public final void v(List list) {
        int u;
        if (list instanceof f0) {
            int i10 = this.a & 7;
            if (i10 != 2) {
                if (i10 != 5) {
                    int i11 = j0.f1378c;
                    throw new i0();
                }
                ((n) this.f1447d).o();
                throw null;
            }
            G(((n) this.f1447d).v());
            ((n) this.f1447d).b();
            ((n) this.f1447d).o();
            throw null;
        }
        int i12 = this.a & 7;
        if (i12 != 2) {
            if (i12 != 5) {
                int i13 = j0.f1378c;
                throw new i0();
            }
            do {
                list.add(Integer.valueOf(((n) this.f1447d).o()));
                if (((n) this.f1447d).c()) {
                    return;
                } else {
                    u = ((n) this.f1447d).u();
                }
            } while (u == this.a);
            this.f1446c = u;
            return;
        }
        int v10 = ((n) this.f1447d).v();
        G(v10);
        int b3 = ((n) this.f1447d).b() + v10;
        do {
            list.add(Integer.valueOf(((n) this.f1447d).o()));
        } while (((n) this.f1447d).b() < b3);
    }

    public final void w(List list) {
        int u;
        if (list instanceof q0) {
            int i10 = this.a & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    int i11 = j0.f1378c;
                    throw new i0();
                }
                H(((n) this.f1447d).v());
                ((n) this.f1447d).b();
                ((n) this.f1447d).p();
                throw null;
            }
            ((n) this.f1447d).p();
            throw null;
        }
        int i12 = this.a & 7;
        if (i12 != 1) {
            if (i12 == 2) {
                int v10 = ((n) this.f1447d).v();
                H(v10);
                int b3 = ((n) this.f1447d).b() + v10;
                do {
                    list.add(Long.valueOf(((n) this.f1447d).p()));
                } while (((n) this.f1447d).b() < b3);
                return;
            }
            int i13 = j0.f1378c;
            throw new i0();
        }
        do {
            list.add(Long.valueOf(((n) this.f1447d).p()));
            if (((n) this.f1447d).c()) {
                return;
            } else {
                u = ((n) this.f1447d).u();
            }
        } while (u == this.a);
        this.f1446c = u;
    }

    public final void x(List list) {
        int u;
        if (list instanceof f0) {
            int i10 = this.a & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw j0.b();
                }
                ((n) this.f1447d).v();
                ((n) this.f1447d).b();
                ((n) this.f1447d).q();
                throw null;
            }
            ((n) this.f1447d).q();
            throw null;
        }
        int i11 = this.a & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int b3 = ((n) this.f1447d).b() + ((n) this.f1447d).v();
                do {
                    list.add(Integer.valueOf(((n) this.f1447d).q()));
                } while (((n) this.f1447d).b() < b3);
                D(b3);
                return;
            }
            throw j0.b();
        }
        do {
            list.add(Integer.valueOf(((n) this.f1447d).q()));
            if (((n) this.f1447d).c()) {
                return;
            } else {
                u = ((n) this.f1447d).u();
            }
        } while (u == this.a);
        this.f1446c = u;
    }

    public final void y(List list) {
        int u;
        if (list instanceof q0) {
            int i10 = this.a & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw j0.b();
                }
                ((n) this.f1447d).v();
                ((n) this.f1447d).b();
                ((n) this.f1447d).r();
                throw null;
            }
            ((n) this.f1447d).r();
            throw null;
        }
        int i11 = this.a & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int b3 = ((n) this.f1447d).b() + ((n) this.f1447d).v();
                do {
                    list.add(Long.valueOf(((n) this.f1447d).r()));
                } while (((n) this.f1447d).b() < b3);
                D(b3);
                return;
            }
            throw j0.b();
        }
        do {
            list.add(Long.valueOf(((n) this.f1447d).r()));
            if (((n) this.f1447d).c()) {
                return;
            } else {
                u = ((n) this.f1447d).u();
            }
        } while (u == this.a);
        this.f1446c = u;
    }

    public final void z(List list, boolean z10) {
        String s5;
        int u;
        int u4;
        if ((this.a & 7) == 2) {
            if ((list instanceof m0) && !z10) {
                m0 m0Var = (m0) list;
                do {
                    m0Var.k(i());
                    if (((n) this.f1447d).c()) {
                        return;
                    } else {
                        u4 = ((n) this.f1447d).u();
                    }
                } while (u4 == this.a);
                this.f1446c = u4;
                return;
            }
            do {
                if (z10) {
                    E(2);
                    s5 = ((n) this.f1447d).t();
                } else {
                    E(2);
                    s5 = ((n) this.f1447d).s();
                }
                list.add(s5);
                if (((n) this.f1447d).c()) {
                    return;
                } else {
                    u = ((n) this.f1447d).u();
                }
            } while (u == this.a);
            this.f1446c = u;
            return;
        }
        int i10 = j0.f1378c;
        throw new i0();
    }

    public o(n nVar) {
        this.f1446c = 0;
        Charset charset = h0.a;
        this.f1447d = nVar;
        nVar.f1443d = this;
    }

    public o(int i10) {
        this.a = i10;
    }

    public o(int i10, int i11, int i12, SparseArray sparseArray) {
        this.a = i10;
        this.f1445b = i11;
        this.f1446c = i12;
        this.f1447d = sparseArray;
    }
}

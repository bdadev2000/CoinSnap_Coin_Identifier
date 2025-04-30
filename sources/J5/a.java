package J5;

import R1.f;
import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.datastore.preferences.protobuf.A;
import androidx.datastore.preferences.protobuf.AbstractC0429d;
import androidx.datastore.preferences.protobuf.AbstractC0436k;
import androidx.datastore.preferences.protobuf.AbstractC0447w;
import androidx.datastore.preferences.protobuf.AbstractC0449y;
import androidx.datastore.preferences.protobuf.C0432g;
import androidx.datastore.preferences.protobuf.C0433h;
import androidx.datastore.preferences.protobuf.C0438m;
import androidx.datastore.preferences.protobuf.D;
import androidx.datastore.preferences.protobuf.H;
import androidx.datastore.preferences.protobuf.InterfaceC0426a0;
import androidx.datastore.preferences.protobuf.X;
import androidx.datastore.preferences.protobuf.r;
import androidx.datastore.preferences.protobuf.z0;
import com.mbridge.msdk.foundation.entity.o;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.List;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f1589a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int f1590c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1591d;

    public a(int i9, int i10) {
        b[] bVarArr = new b[i9];
        this.f1591d = bVarArr;
        int length = bVarArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            ((b[]) this.f1591d)[i11] = new b(((i10 + 4) * 17) + 1);
        }
        this.f1590c = i10 * 17;
        this.b = i9;
        this.f1589a = -1;
    }

    public static void Z(int i9) {
        if ((i9 & 3) == 0) {
        } else {
            throw A.e();
        }
    }

    public static void a0(int i9) {
        if ((i9 & 7) == 0) {
        } else {
            throw A.e();
        }
    }

    public void A(List list) {
        int C8;
        boolean z8 = list instanceof H;
        C0433h c0433h = (C0433h) this.f1591d;
        if (z8) {
            o.v(list);
            int i9 = this.f1589a & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw A.b();
                }
                c0433h.D();
                c0433h.n();
                throw null;
            }
            c0433h.n();
            throw null;
        }
        int i10 = this.f1589a & 7;
        if (i10 != 0) {
            if (i10 == 2) {
                int b = c0433h.b() + c0433h.D();
                do {
                    list.add(Long.valueOf(c0433h.n()));
                } while (c0433h.b() < b);
                W(b);
                return;
            }
            throw A.b();
        }
        do {
            list.add(Long.valueOf(c0433h.n()));
            if (c0433h.c()) {
                return;
            } else {
                C8 = c0433h.C();
            }
        } while (C8 == this.f1589a);
        this.f1590c = C8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x005f, code lost:
    
        r10.put(r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0062, code lost:
    
        r1.d(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0065, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void B(androidx.datastore.preferences.protobuf.L r10, U4.y r11, androidx.datastore.preferences.protobuf.C0438m r12) {
        /*
            r9 = this;
            r0 = 2
            r9.X(r0)
            java.lang.Object r1 = r9.f1591d
            androidx.datastore.preferences.protobuf.h r1 = (androidx.datastore.preferences.protobuf.C0433h) r1
            int r2 = r1.D()
            int r2 = r1.e(r2)
            java.lang.Object r3 = r11.b
            java.lang.Object r4 = r11.f3336d
            r5 = r4
        L15:
            int r6 = r9.c()     // Catch: java.lang.Throwable -> L39
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == r7) goto L5f
            boolean r7 = r1.c()     // Catch: java.lang.Throwable -> L39
            if (r7 == 0) goto L25
            goto L5f
        L25:
            r7 = 1
            java.lang.String r8 = "Unable to parse map entry."
            if (r6 == r7) goto L48
            if (r6 == r0) goto L3b
            boolean r6 = r9.Y()     // Catch: java.lang.Throwable -> L39 androidx.datastore.preferences.protobuf.C0450z -> L52
            if (r6 == 0) goto L33
            goto L15
        L33:
            androidx.datastore.preferences.protobuf.A r6 = new androidx.datastore.preferences.protobuf.A     // Catch: java.lang.Throwable -> L39 androidx.datastore.preferences.protobuf.C0450z -> L52
            r6.<init>(r8)     // Catch: java.lang.Throwable -> L39 androidx.datastore.preferences.protobuf.C0450z -> L52
            throw r6     // Catch: java.lang.Throwable -> L39 androidx.datastore.preferences.protobuf.C0450z -> L52
        L39:
            r10 = move-exception
            goto L66
        L3b:
            java.lang.Object r6 = r11.f3335c     // Catch: java.lang.Throwable -> L39 androidx.datastore.preferences.protobuf.C0450z -> L52
            androidx.datastore.preferences.protobuf.z0 r6 = (androidx.datastore.preferences.protobuf.z0) r6     // Catch: java.lang.Throwable -> L39 androidx.datastore.preferences.protobuf.C0450z -> L52
            java.lang.Class r7 = r4.getClass()     // Catch: java.lang.Throwable -> L39 androidx.datastore.preferences.protobuf.C0450z -> L52
            java.lang.Object r5 = r9.n(r6, r7, r12)     // Catch: java.lang.Throwable -> L39 androidx.datastore.preferences.protobuf.C0450z -> L52
            goto L15
        L48:
            java.lang.Object r6 = r11.f3334a     // Catch: java.lang.Throwable -> L39 androidx.datastore.preferences.protobuf.C0450z -> L52
            androidx.datastore.preferences.protobuf.z0 r6 = (androidx.datastore.preferences.protobuf.z0) r6     // Catch: java.lang.Throwable -> L39 androidx.datastore.preferences.protobuf.C0450z -> L52
            r7 = 0
            java.lang.Object r3 = r9.n(r6, r7, r7)     // Catch: java.lang.Throwable -> L39 androidx.datastore.preferences.protobuf.C0450z -> L52
            goto L15
        L52:
            boolean r6 = r9.Y()     // Catch: java.lang.Throwable -> L39
            if (r6 == 0) goto L59
            goto L15
        L59:
            androidx.datastore.preferences.protobuf.A r10 = new androidx.datastore.preferences.protobuf.A     // Catch: java.lang.Throwable -> L39
            r10.<init>(r8)     // Catch: java.lang.Throwable -> L39
            throw r10     // Catch: java.lang.Throwable -> L39
        L5f:
            r10.put(r3, r5)     // Catch: java.lang.Throwable -> L39
            r1.d(r2)
            return
        L66:
            r1.d(r2)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: J5.a.B(androidx.datastore.preferences.protobuf.L, U4.y, androidx.datastore.preferences.protobuf.m):void");
    }

    public Object C(InterfaceC0426a0 interfaceC0426a0, C0438m c0438m) {
        C0433h c0433h = (C0433h) this.f1591d;
        int D8 = c0433h.D();
        if (c0433h.f4566a < c0433h.b) {
            int e4 = c0433h.e(D8);
            Object newInstance = interfaceC0426a0.newInstance();
            c0433h.f4566a++;
            interfaceC0426a0.b(newInstance, this, c0438m);
            interfaceC0426a0.makeImmutable(newInstance);
            c0433h.a(0);
            c0433h.f4566a--;
            c0433h.d(e4);
            return newInstance;
        }
        throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public Object D(InterfaceC0426a0 interfaceC0426a0, C0438m c0438m) {
        X(2);
        return C(interfaceC0426a0, c0438m);
    }

    public void E(List list, InterfaceC0426a0 interfaceC0426a0, C0438m c0438m) {
        int C8;
        int i9 = this.f1589a;
        if ((i9 & 7) != 2) {
            throw A.b();
        }
        do {
            list.add(C(interfaceC0426a0, c0438m));
            C0433h c0433h = (C0433h) this.f1591d;
            if (!c0433h.c() && this.f1590c == 0) {
                C8 = c0433h.C();
            } else {
                return;
            }
        } while (C8 == i9);
        this.f1590c = C8;
    }

    public int F() {
        X(5);
        return ((C0433h) this.f1591d).w();
    }

    public void G(List list) {
        int C8;
        boolean z8 = list instanceof AbstractC0447w;
        C0433h c0433h = (C0433h) this.f1591d;
        if (z8) {
            o.v(list);
            int i9 = this.f1589a & 7;
            if (i9 != 2) {
                if (i9 != 5) {
                    throw A.b();
                }
                c0433h.w();
                throw null;
            }
            Z(c0433h.D());
            c0433h.w();
            throw null;
        }
        int i10 = this.f1589a & 7;
        if (i10 != 2) {
            if (i10 != 5) {
                throw A.b();
            }
            do {
                list.add(Integer.valueOf(c0433h.w()));
                if (c0433h.c()) {
                    return;
                } else {
                    C8 = c0433h.C();
                }
            } while (C8 == this.f1589a);
            this.f1590c = C8;
            return;
        }
        int D8 = c0433h.D();
        Z(D8);
        int b = c0433h.b() + D8;
        do {
            list.add(Integer.valueOf(c0433h.w()));
        } while (c0433h.b() < b);
    }

    public long H() {
        X(1);
        return ((C0433h) this.f1591d).x();
    }

    public void I(List list) {
        int C8;
        boolean z8 = list instanceof H;
        C0433h c0433h = (C0433h) this.f1591d;
        if (z8) {
            o.v(list);
            int i9 = this.f1589a & 7;
            if (i9 != 1) {
                if (i9 != 2) {
                    throw A.b();
                }
                a0(c0433h.D());
                c0433h.x();
                throw null;
            }
            c0433h.x();
            throw null;
        }
        int i10 = this.f1589a & 7;
        if (i10 != 1) {
            if (i10 == 2) {
                int D8 = c0433h.D();
                a0(D8);
                int b = c0433h.b() + D8;
                do {
                    list.add(Long.valueOf(c0433h.x()));
                } while (c0433h.b() < b);
                return;
            }
            throw A.b();
        }
        do {
            list.add(Long.valueOf(c0433h.x()));
            if (c0433h.c()) {
                return;
            } else {
                C8 = c0433h.C();
            }
        } while (C8 == this.f1589a);
        this.f1590c = C8;
    }

    public int J() {
        X(0);
        return ((C0433h) this.f1591d).y();
    }

    public void K(List list) {
        int C8;
        boolean z8 = list instanceof AbstractC0447w;
        C0433h c0433h = (C0433h) this.f1591d;
        if (z8) {
            o.v(list);
            int i9 = this.f1589a & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw A.b();
                }
                c0433h.D();
                c0433h.y();
                throw null;
            }
            c0433h.y();
            throw null;
        }
        int i10 = this.f1589a & 7;
        if (i10 != 0) {
            if (i10 == 2) {
                int b = c0433h.b() + c0433h.D();
                do {
                    list.add(Integer.valueOf(c0433h.y()));
                } while (c0433h.b() < b);
                W(b);
                return;
            }
            throw A.b();
        }
        do {
            list.add(Integer.valueOf(c0433h.y()));
            if (c0433h.c()) {
                return;
            } else {
                C8 = c0433h.C();
            }
        } while (C8 == this.f1589a);
        this.f1590c = C8;
    }

    public long L() {
        X(0);
        return ((C0433h) this.f1591d).z();
    }

    public void M(List list) {
        int C8;
        boolean z8 = list instanceof H;
        C0433h c0433h = (C0433h) this.f1591d;
        if (z8) {
            o.v(list);
            int i9 = this.f1589a & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw A.b();
                }
                c0433h.D();
                c0433h.z();
                throw null;
            }
            c0433h.z();
            throw null;
        }
        int i10 = this.f1589a & 7;
        if (i10 != 0) {
            if (i10 == 2) {
                int b = c0433h.b() + c0433h.D();
                do {
                    list.add(Long.valueOf(c0433h.z()));
                } while (c0433h.b() < b);
                W(b);
                return;
            }
            throw A.b();
        }
        do {
            list.add(Long.valueOf(c0433h.z()));
            if (c0433h.c()) {
                return;
            } else {
                C8 = c0433h.C();
            }
        } while (C8 == this.f1589a);
        this.f1590c = C8;
    }

    public String N() {
        X(2);
        return ((C0433h) this.f1591d).A();
    }

    public void O(List list) {
        P(list, false);
    }

    public void P(List list, boolean z8) {
        String N8;
        int C8;
        int C9;
        if ((this.f1589a & 7) == 2) {
            boolean z9 = list instanceof D;
            C0433h c0433h = (C0433h) this.f1591d;
            if (z9 && !z8) {
                D d2 = (D) list;
                do {
                    d2.a(h());
                    if (c0433h.c()) {
                        return;
                    } else {
                        C9 = c0433h.C();
                    }
                } while (C9 == this.f1589a);
                this.f1590c = C9;
                return;
            }
            do {
                if (z8) {
                    N8 = R();
                } else {
                    N8 = N();
                }
                list.add(N8);
                if (c0433h.c()) {
                    return;
                } else {
                    C8 = c0433h.C();
                }
            } while (C8 == this.f1589a);
            this.f1590c = C8;
            return;
        }
        throw A.b();
    }

    public void Q(List list) {
        P(list, true);
    }

    public String R() {
        X(2);
        return ((C0433h) this.f1591d).B();
    }

    public int S() {
        X(0);
        return ((C0433h) this.f1591d).D();
    }

    public void T(List list) {
        int C8;
        boolean z8 = list instanceof AbstractC0447w;
        C0433h c0433h = (C0433h) this.f1591d;
        if (z8) {
            o.v(list);
            int i9 = this.f1589a & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw A.b();
                }
                c0433h.D();
                c0433h.D();
                throw null;
            }
            c0433h.D();
            throw null;
        }
        int i10 = this.f1589a & 7;
        if (i10 != 0) {
            if (i10 == 2) {
                int b = c0433h.b() + c0433h.D();
                do {
                    list.add(Integer.valueOf(c0433h.D()));
                } while (c0433h.b() < b);
                W(b);
                return;
            }
            throw A.b();
        }
        do {
            list.add(Integer.valueOf(c0433h.D()));
            if (c0433h.c()) {
                return;
            } else {
                C8 = c0433h.C();
            }
        } while (C8 == this.f1589a);
        this.f1590c = C8;
    }

    public long U() {
        X(0);
        return ((C0433h) this.f1591d).E();
    }

    public void V(List list) {
        int C8;
        boolean z8 = list instanceof H;
        C0433h c0433h = (C0433h) this.f1591d;
        if (z8) {
            o.v(list);
            int i9 = this.f1589a & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw A.b();
                }
                c0433h.D();
                c0433h.E();
                throw null;
            }
            c0433h.E();
            throw null;
        }
        int i10 = this.f1589a & 7;
        if (i10 != 0) {
            if (i10 == 2) {
                int b = c0433h.b() + c0433h.D();
                do {
                    list.add(Long.valueOf(c0433h.E()));
                } while (c0433h.b() < b);
                W(b);
                return;
            }
            throw A.b();
        }
        do {
            list.add(Long.valueOf(c0433h.E()));
            if (c0433h.c()) {
                return;
            } else {
                C8 = c0433h.C();
            }
        } while (C8 == this.f1589a);
        this.f1590c = C8;
    }

    public void W(int i9) {
        if (((C0433h) this.f1591d).b() == i9) {
        } else {
            throw A.f();
        }
    }

    public void X(int i9) {
        if ((this.f1589a & 7) == i9) {
        } else {
            throw A.b();
        }
    }

    public boolean Y() {
        int i9;
        C0433h c0433h = (C0433h) this.f1591d;
        if (!c0433h.c() && (i9 = this.f1589a) != this.b) {
            return c0433h.H(i9);
        }
        return false;
    }

    public void a() {
        int i9 = this.f1590c;
        View view = (View) this.f1591d;
        ViewCompat.offsetTopAndBottom(view, i9 - (view.getTop() - this.f1589a));
        ViewCompat.offsetLeftAndRight(view, 0 - (view.getLeft() - this.b));
    }

    public b b() {
        return ((b[]) this.f1591d)[this.f1589a];
    }

    public int c() {
        int i9 = this.f1590c;
        if (i9 != 0) {
            this.f1589a = i9;
            this.f1590c = 0;
        } else {
            this.f1589a = ((C0433h) this.f1591d).C();
        }
        int i10 = this.f1589a;
        if (i10 != 0 && i10 != this.b) {
            return i10 >>> 3;
        }
        return Integer.MAX_VALUE;
    }

    public byte[][] d(int i9, int i10) {
        int i11 = this.b;
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i11 * i10, this.f1590c * i9);
        int i12 = i11 * i10;
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = (i12 - i13) - 1;
            byte[] bArr2 = ((b[]) this.f1591d)[i13 / i10].f1592a;
            int length = bArr2.length * i9;
            byte[] bArr3 = new byte[length];
            for (int i15 = 0; i15 < length; i15++) {
                bArr3[i15] = bArr2[i15 / i9];
            }
            bArr[i14] = bArr3;
        }
        return bArr;
    }

    public int e() {
        return this.f1589a;
    }

    public boolean f() {
        X(0);
        return ((C0433h) this.f1591d).f();
    }

    public void g(List list) {
        int C8;
        boolean z8 = list instanceof AbstractC0429d;
        C0433h c0433h = (C0433h) this.f1591d;
        if (z8) {
            o.v(list);
            int i9 = this.f1589a & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw A.b();
                }
                c0433h.D();
                c0433h.f();
                throw null;
            }
            c0433h.f();
            throw null;
        }
        int i10 = this.f1589a & 7;
        if (i10 != 0) {
            if (i10 == 2) {
                int b = c0433h.b() + c0433h.D();
                do {
                    list.add(Boolean.valueOf(c0433h.f()));
                } while (c0433h.b() < b);
                W(b);
                return;
            }
            throw A.b();
        }
        do {
            list.add(Boolean.valueOf(c0433h.f()));
            if (c0433h.c()) {
                return;
            } else {
                C8 = c0433h.C();
            }
        } while (C8 == this.f1589a);
        this.f1590c = C8;
    }

    public C0432g h() {
        X(2);
        return ((C0433h) this.f1591d).g();
    }

    public void i(List list) {
        int C8;
        if ((this.f1589a & 7) != 2) {
            throw A.b();
        }
        do {
            list.add(h());
            C0433h c0433h = (C0433h) this.f1591d;
            if (c0433h.c()) {
                return;
            } else {
                C8 = c0433h.C();
            }
        } while (C8 == this.f1589a);
        this.f1590c = C8;
    }

    public double j() {
        X(1);
        return ((C0433h) this.f1591d).h();
    }

    public void k(List list) {
        int C8;
        boolean z8 = list instanceof AbstractC0436k;
        C0433h c0433h = (C0433h) this.f1591d;
        if (z8) {
            o.v(list);
            int i9 = this.f1589a & 7;
            if (i9 != 1) {
                if (i9 != 2) {
                    throw A.b();
                }
                a0(c0433h.D());
                c0433h.h();
                throw null;
            }
            c0433h.h();
            throw null;
        }
        int i10 = this.f1589a & 7;
        if (i10 != 1) {
            if (i10 == 2) {
                int D8 = c0433h.D();
                a0(D8);
                int b = c0433h.b() + D8;
                do {
                    list.add(Double.valueOf(c0433h.h()));
                } while (c0433h.b() < b);
                return;
            }
            throw A.b();
        }
        do {
            list.add(Double.valueOf(c0433h.h()));
            if (c0433h.c()) {
                return;
            } else {
                C8 = c0433h.C();
            }
        } while (C8 == this.f1589a);
        this.f1590c = C8;
    }

    public int l() {
        X(0);
        return ((C0433h) this.f1591d).i();
    }

    public void m(List list) {
        int C8;
        boolean z8 = list instanceof AbstractC0447w;
        C0433h c0433h = (C0433h) this.f1591d;
        if (z8) {
            o.v(list);
            int i9 = this.f1589a & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw A.b();
                }
                c0433h.D();
                c0433h.i();
                throw null;
            }
            c0433h.i();
            throw null;
        }
        int i10 = this.f1589a & 7;
        if (i10 != 0) {
            if (i10 == 2) {
                int b = c0433h.b() + c0433h.D();
                do {
                    list.add(Integer.valueOf(c0433h.i()));
                } while (c0433h.b() < b);
                W(b);
                return;
            }
            throw A.b();
        }
        do {
            list.add(Integer.valueOf(c0433h.i()));
            if (c0433h.c()) {
                return;
            } else {
                C8 = c0433h.C();
            }
        } while (C8 == this.f1589a);
        this.f1590c = C8;
    }

    public Object n(z0 z0Var, Class cls, C0438m c0438m) {
        switch (z0Var.ordinal()) {
            case 0:
                return Double.valueOf(j());
            case 1:
                return Float.valueOf(s());
            case 2:
                return Long.valueOf(z());
            case 3:
                return Long.valueOf(U());
            case 4:
                return Integer.valueOf(x());
            case 5:
                return Long.valueOf(q());
            case 6:
                return Integer.valueOf(o());
            case 7:
                return Boolean.valueOf(f());
            case 8:
                return R();
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                X(2);
                return C(X.f4537c.a(cls), c0438m);
            case 11:
                return h();
            case 12:
                return Integer.valueOf(S());
            case 13:
                return Integer.valueOf(l());
            case 14:
                return Integer.valueOf(F());
            case 15:
                return Long.valueOf(H());
            case 16:
                return Integer.valueOf(J());
            case 17:
                return Long.valueOf(L());
        }
    }

    public int o() {
        X(5);
        return ((C0433h) this.f1591d).j();
    }

    public void p(List list) {
        int C8;
        boolean z8 = list instanceof AbstractC0447w;
        C0433h c0433h = (C0433h) this.f1591d;
        if (z8) {
            o.v(list);
            int i9 = this.f1589a & 7;
            if (i9 != 2) {
                if (i9 != 5) {
                    throw A.b();
                }
                c0433h.j();
                throw null;
            }
            Z(c0433h.D());
            c0433h.j();
            throw null;
        }
        int i10 = this.f1589a & 7;
        if (i10 != 2) {
            if (i10 != 5) {
                throw A.b();
            }
            do {
                list.add(Integer.valueOf(c0433h.j()));
                if (c0433h.c()) {
                    return;
                } else {
                    C8 = c0433h.C();
                }
            } while (C8 == this.f1589a);
            this.f1590c = C8;
            return;
        }
        int D8 = c0433h.D();
        Z(D8);
        int b = c0433h.b() + D8;
        do {
            list.add(Integer.valueOf(c0433h.j()));
        } while (c0433h.b() < b);
    }

    public long q() {
        X(1);
        return ((C0433h) this.f1591d).k();
    }

    public void r(List list) {
        int C8;
        boolean z8 = list instanceof H;
        C0433h c0433h = (C0433h) this.f1591d;
        if (z8) {
            o.v(list);
            int i9 = this.f1589a & 7;
            if (i9 != 1) {
                if (i9 != 2) {
                    throw A.b();
                }
                a0(c0433h.D());
                c0433h.k();
                throw null;
            }
            c0433h.k();
            throw null;
        }
        int i10 = this.f1589a & 7;
        if (i10 != 1) {
            if (i10 == 2) {
                int D8 = c0433h.D();
                a0(D8);
                int b = c0433h.b() + D8;
                do {
                    list.add(Long.valueOf(c0433h.k()));
                } while (c0433h.b() < b);
                return;
            }
            throw A.b();
        }
        do {
            list.add(Long.valueOf(c0433h.k()));
            if (c0433h.c()) {
                return;
            } else {
                C8 = c0433h.C();
            }
        } while (C8 == this.f1589a);
        this.f1590c = C8;
    }

    public float s() {
        X(5);
        return ((C0433h) this.f1591d).l();
    }

    public void t(List list) {
        int C8;
        boolean z8 = list instanceof r;
        C0433h c0433h = (C0433h) this.f1591d;
        if (z8) {
            o.v(list);
            int i9 = this.f1589a & 7;
            if (i9 != 2) {
                if (i9 != 5) {
                    throw A.b();
                }
                c0433h.l();
                throw null;
            }
            Z(c0433h.D());
            c0433h.l();
            throw null;
        }
        int i10 = this.f1589a & 7;
        if (i10 != 2) {
            if (i10 != 5) {
                throw A.b();
            }
            do {
                list.add(Float.valueOf(c0433h.l()));
                if (c0433h.c()) {
                    return;
                } else {
                    C8 = c0433h.C();
                }
            } while (C8 == this.f1589a);
            this.f1590c = C8;
            return;
        }
        int D8 = c0433h.D();
        Z(D8);
        int b = c0433h.b() + D8;
        do {
            list.add(Float.valueOf(c0433h.l()));
        } while (c0433h.b() < b);
    }

    public Object u(InterfaceC0426a0 interfaceC0426a0, C0438m c0438m) {
        int i9 = this.b;
        this.b = ((this.f1589a >>> 3) << 3) | 4;
        try {
            Object newInstance = interfaceC0426a0.newInstance();
            interfaceC0426a0.b(newInstance, this, c0438m);
            interfaceC0426a0.makeImmutable(newInstance);
            if (this.f1589a == this.b) {
                return newInstance;
            }
            throw A.e();
        } finally {
            this.b = i9;
        }
    }

    public Object v(InterfaceC0426a0 interfaceC0426a0, C0438m c0438m) {
        X(3);
        return u(interfaceC0426a0, c0438m);
    }

    public void w(List list, InterfaceC0426a0 interfaceC0426a0, C0438m c0438m) {
        int C8;
        int i9 = this.f1589a;
        if ((i9 & 7) != 3) {
            throw A.b();
        }
        do {
            list.add(u(interfaceC0426a0, c0438m));
            C0433h c0433h = (C0433h) this.f1591d;
            if (!c0433h.c() && this.f1590c == 0) {
                C8 = c0433h.C();
            } else {
                return;
            }
        } while (C8 == i9);
        this.f1590c = C8;
    }

    public int x() {
        X(0);
        return ((C0433h) this.f1591d).m();
    }

    public void y(List list) {
        int C8;
        boolean z8 = list instanceof AbstractC0447w;
        C0433h c0433h = (C0433h) this.f1591d;
        if (z8) {
            o.v(list);
            int i9 = this.f1589a & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw A.b();
                }
                c0433h.D();
                c0433h.m();
                throw null;
            }
            c0433h.m();
            throw null;
        }
        int i10 = this.f1589a & 7;
        if (i10 != 0) {
            if (i10 == 2) {
                int b = c0433h.b() + c0433h.D();
                do {
                    list.add(Integer.valueOf(c0433h.m()));
                } while (c0433h.b() < b);
                W(b);
                return;
            }
            throw A.b();
        }
        do {
            list.add(Integer.valueOf(c0433h.m()));
            if (c0433h.c()) {
                return;
            } else {
                C8 = c0433h.C();
            }
        } while (C8 == this.f1589a);
        this.f1590c = C8;
    }

    public long z() {
        X(0);
        return ((C0433h) this.f1591d).n();
    }

    public a(f fVar) {
        Context context = fVar.f2631a;
        this.f1591d = context;
        ActivityManager activityManager = fVar.b;
        int i9 = activityManager.isLowRamDevice() ? 2097152 : 4194304;
        this.f1590c = i9;
        int round = Math.round(activityManager.getMemoryClass() * 1048576 * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = (DisplayMetrics) fVar.f2632c.f21833c;
        float f9 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        float f10 = fVar.f2633d;
        int round2 = Math.round(f9 * f10);
        int round3 = Math.round(f9 * 2.0f);
        int i10 = round - i9;
        int i11 = round3 + round2;
        if (i11 <= i10) {
            this.b = round3;
            this.f1589a = round2;
        } else {
            float f11 = i10 / (f10 + 2.0f);
            this.b = Math.round(2.0f * f11);
            this.f1589a = Math.round(f11 * f10);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder("Calculation complete, Calculated memory cache size: ");
            sb.append(Formatter.formatFileSize(context, this.b));
            sb.append(", pool size: ");
            sb.append(Formatter.formatFileSize(context, this.f1589a));
            sb.append(", byte array size: ");
            sb.append(Formatter.formatFileSize(context, i9));
            sb.append(", memory class limited? ");
            sb.append(i11 > round);
            sb.append(", max size: ");
            sb.append(Formatter.formatFileSize(context, round));
            sb.append(", memoryClass: ");
            sb.append(activityManager.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(activityManager.isLowRamDevice());
            Log.d("MemorySizeCalculator", sb.toString());
        }
    }

    public a(View view) {
        this.f1591d = view;
    }

    public a(C0433h c0433h) {
        this.f1590c = 0;
        Charset charset = AbstractC0449y.f4610a;
        this.f1591d = c0433h;
        c0433h.f4568d = this;
    }
}

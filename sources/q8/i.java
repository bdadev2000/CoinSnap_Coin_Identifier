package q8;

import com.google.common.collect.m0;
import com.google.common.collect.n0;
import com.google.common.collect.r0;
import com.google.common.collect.z1;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.UByte;
import n9.h0;
import n9.x;
import y7.c0;

/* loaded from: classes3.dex */
public final class i extends p6.a {

    /* renamed from: g, reason: collision with root package name */
    public static final nb.a f23716g = new nb.a(27);

    /* renamed from: f, reason: collision with root package name */
    public final g f23717f;

    public i(nb.a aVar) {
        this.f23717f = aVar;
    }

    public static a F(int i10, int i11, x xVar) {
        int S;
        String str;
        byte[] copyOfRange;
        int v10 = xVar.v();
        Charset P = P(v10);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        xVar.d(bArr, 0, i12);
        if (i11 == 2) {
            String str2 = "image/" + c6.k.C(new String(bArr, 0, 3, ra.f.f24048b));
            if ("image/jpg".equals(str2)) {
                str2 = "image/jpeg";
            }
            str = str2;
            S = 2;
        } else {
            S = S(bArr, 0);
            String C = c6.k.C(new String(bArr, 0, S, ra.f.f24048b));
            if (C.indexOf(47) == -1) {
                str = "image/".concat(C);
            } else {
                str = C;
            }
        }
        int i13 = bArr[S + 1] & UByte.MAX_VALUE;
        int i14 = S + 2;
        int R = R(i14, v10, bArr);
        String str3 = new String(bArr, i14, R - i14, P);
        int O = O(v10) + R;
        if (i12 <= O) {
            copyOfRange = h0.f22548f;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, O, i12);
        }
        return new a(str, str3, i13, copyOfRange);
    }

    public static c G(x xVar, int i10, int i11, boolean z10, int i12, g gVar) {
        long j3;
        long j10;
        int i13 = xVar.f22599b;
        int S = S(xVar.a, i13);
        String str = new String(xVar.a, i13, S - i13, ra.f.f24048b);
        xVar.G(S + 1);
        int f10 = xVar.f();
        int f11 = xVar.f();
        long w10 = xVar.w();
        if (w10 == 4294967295L) {
            j3 = -1;
        } else {
            j3 = w10;
        }
        long w11 = xVar.w();
        if (w11 == 4294967295L) {
            j10 = -1;
        } else {
            j10 = w11;
        }
        ArrayList arrayList = new ArrayList();
        int i14 = i13 + i10;
        while (xVar.f22599b < i14) {
            j J = J(i11, xVar, z10, i12, gVar);
            if (J != null) {
                arrayList.add(J);
            }
        }
        return new c(str, f10, f11, j3, j10, (j[]) arrayList.toArray(new j[0]));
    }

    public static d H(x xVar, int i10, int i11, boolean z10, int i12, g gVar) {
        boolean z11;
        boolean z12;
        int i13 = xVar.f22599b;
        int S = S(xVar.a, i13);
        String str = new String(xVar.a, i13, S - i13, ra.f.f24048b);
        xVar.G(S + 1);
        int v10 = xVar.v();
        if ((v10 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((v10 & 1) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        int v11 = xVar.v();
        String[] strArr = new String[v11];
        for (int i14 = 0; i14 < v11; i14++) {
            int i15 = xVar.f22599b;
            int S2 = S(xVar.a, i15);
            strArr[i14] = new String(xVar.a, i15, S2 - i15, ra.f.f24048b);
            xVar.G(S2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i16 = i13 + i10;
        while (xVar.f22599b < i16) {
            j J = J(i11, xVar, z10, i12, gVar);
            if (J != null) {
                arrayList.add(J);
            }
        }
        return new d(str, z11, z12, strArr, (j[]) arrayList.toArray(new j[0]));
    }

    public static e I(int i10, x xVar) {
        if (i10 < 4) {
            return null;
        }
        int v10 = xVar.v();
        Charset P = P(v10);
        byte[] bArr = new byte[3];
        xVar.d(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        xVar.d(bArr2, 0, i11);
        int R = R(0, v10, bArr2);
        String str2 = new String(bArr2, 0, R, P);
        int O = O(v10) + R;
        return new e(str, str2, M(bArr2, O, R(O, v10, bArr2), P));
    }

    /* JADX WARN: Code restructure failed: missing block: B:159:0x0249, code lost:
    
        if (r12 == 67) goto L161;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02ba A[Catch: all -> 0x0164, TRY_LEAVE, TryCatch #0 {all -> 0x0164, blocks: (B:76:0x0139, B:78:0x02ba, B:85:0x016b, B:88:0x0173, B:97:0x019e, B:99:0x01d1, B:107:0x01ff, B:109:0x0214, B:110:0x021b, B:111:0x0217, B:120:0x0232, B:127:0x024b, B:134:0x025d, B:140:0x026c, B:146:0x0286, B:154:0x02a4, B:155:0x02a9), top: B:68:0x012b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static q8.j J(int r21, n9.x r22, boolean r23, int r24, q8.g r25) {
        /*
            Method dump skipped, instructions count: 750
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q8.i.J(int, n9.x, boolean, int, q8.g):q8.j");
    }

    public static f K(int i10, x xVar) {
        byte[] copyOfRange;
        int v10 = xVar.v();
        Charset P = P(v10);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        xVar.d(bArr, 0, i11);
        int S = S(bArr, 0);
        String str = new String(bArr, 0, S, ra.f.f24048b);
        int i12 = S + 1;
        int R = R(i12, v10, bArr);
        String M = M(bArr, i12, R, P);
        int O = O(v10) + R;
        int R2 = R(O, v10, bArr);
        String M2 = M(bArr, O, R2, P);
        int O2 = O(v10) + R2;
        if (i11 <= O2) {
            copyOfRange = h0.f22548f;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, O2, i11);
        }
        return new f(str, M, M2, copyOfRange);
    }

    public static l L(int i10, x xVar) {
        int A = xVar.A();
        int x10 = xVar.x();
        int x11 = xVar.x();
        int v10 = xVar.v();
        int v11 = xVar.v();
        c0 c0Var = new c0(2);
        c0Var.n(xVar.a, xVar.f22600c);
        c0Var.o(xVar.f22599b * 8);
        int i11 = ((i10 - 10) * 8) / (v10 + v11);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = c0Var.i(v10);
            int i14 = c0Var.i(v11);
            iArr[i12] = i13;
            iArr2[i12] = i14;
        }
        return new l(A, x10, x11, iArr, iArr2);
    }

    public static String M(byte[] bArr, int i10, int i11, Charset charset) {
        if (i11 > i10 && i11 <= bArr.length) {
            return new String(bArr, i10, i11 - i10, charset);
        }
        return "";
    }

    public static z1 N(int i10, int i11, byte[] bArr) {
        if (i11 >= bArr.length) {
            return r0.o("");
        }
        n0 n0Var = r0.f12026c;
        m0 m0Var = new m0();
        int R = R(i11, i10, bArr);
        while (i11 < R) {
            m0Var.u(new String(bArr, i11, R - i11, P(i10)));
            i11 = O(i10) + R;
            R = R(i11, i10, bArr);
        }
        z1 y4 = m0Var.y();
        if (y4.isEmpty()) {
            return r0.o("");
        }
        return y4;
    }

    public static int O(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    public static Charset P(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return ra.f.f24048b;
                }
                return ra.f.f24049c;
            }
            return ra.f.f24050d;
        }
        return ra.f.f24052f;
    }

    public static String Q(int i10, int i11, int i12, int i13, int i14) {
        if (i10 == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    public static int R(int i10, int i11, byte[] bArr) {
        int S = S(bArr, i10);
        if (i11 != 0 && i11 != 3) {
            while (S < bArr.length - 1) {
                if ((S - i10) % 2 == 0 && bArr[S + 1] == 0) {
                    return S;
                }
                S = S(bArr, S + 1);
            }
            return bArr.length;
        }
        return S;
    }

    public static int S(byte[] bArr, int i10) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    public static int T(int i10, x xVar) {
        byte[] bArr = xVar.a;
        int i11 = xVar.f22599b;
        int i12 = i11;
        while (true) {
            int i13 = i12 + 1;
            if (i13 < i11 + i10) {
                if ((bArr[i12] & UByte.MAX_VALUE) == 255 && bArr[i13] == 0) {
                    System.arraycopy(bArr, i12 + 2, bArr, i13, (i10 - (i12 - i11)) - 2);
                    i10--;
                }
                i12 = i13;
            } else {
                return i10;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
    
        if ((r10 & 1) != 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0083, code lost:
    
        if ((r10 & 128) != 0) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean U(n9.x r18, int r19, int r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 180
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q8.i.U(n9.x, int, int, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final l8.b E(int r13, byte[] r14) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q8.i.E(int, byte[]):l8.b");
    }

    @Override // p6.a
    public final l8.b g(l8.d dVar, ByteBuffer byteBuffer) {
        return E(byteBuffer.limit(), byteBuffer.array());
    }
}

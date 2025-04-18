package o9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s7.x1;

/* loaded from: classes3.dex */
public final class a {
    public final List a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23171b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23172c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23173d;

    /* renamed from: e, reason: collision with root package name */
    public final int f23174e;

    /* renamed from: f, reason: collision with root package name */
    public final int f23175f;

    /* renamed from: g, reason: collision with root package name */
    public final int f23176g;

    /* renamed from: h, reason: collision with root package name */
    public final float f23177h;

    /* renamed from: i, reason: collision with root package name */
    public final String f23178i;

    public /* synthetic */ a(List list, int i10, int i11, int i12, int i13, int i14, int i15, float f10, String str) {
        this.a = list;
        this.f23171b = i10;
        this.f23172c = i11;
        this.f23173d = i12;
        this.f23174e = i13;
        this.f23175f = i14;
        this.f23176g = i15;
        this.f23177h = f10;
        this.f23178i = str;
    }

    public static a a(n9.x xVar) {
        byte[] bArr;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f10;
        String str;
        try {
            xVar.H(4);
            int v10 = (xVar.v() & 3) + 1;
            if (v10 != 3) {
                ArrayList arrayList = new ArrayList();
                int v11 = xVar.v() & 31;
                int i15 = 0;
                while (true) {
                    bArr = c6.k.f2646f;
                    if (i15 >= v11) {
                        break;
                    }
                    int A = xVar.A();
                    int i16 = xVar.f22599b;
                    xVar.H(A);
                    byte[] bArr2 = xVar.a;
                    byte[] bArr3 = new byte[A + 4];
                    System.arraycopy(bArr, 0, bArr3, 0, 4);
                    System.arraycopy(bArr2, i16, bArr3, 4, A);
                    arrayList.add(bArr3);
                    i15++;
                }
                int v12 = xVar.v();
                for (int i17 = 0; i17 < v12; i17++) {
                    int A2 = xVar.A();
                    int i18 = xVar.f22599b;
                    xVar.H(A2);
                    byte[] bArr4 = xVar.a;
                    byte[] bArr5 = new byte[A2 + 4];
                    System.arraycopy(bArr, 0, bArr5, 0, 4);
                    System.arraycopy(bArr4, i18, bArr5, 4, A2);
                    arrayList.add(bArr5);
                }
                if (v11 > 0) {
                    n9.t d10 = n9.u.d(v10, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                    int i19 = d10.f22577e;
                    int i20 = d10.f22578f;
                    int i21 = d10.f22586n;
                    int i22 = d10.f22587o;
                    int i23 = d10.f22588p;
                    float f11 = d10.f22579g;
                    str = c6.k.f(d10.a, d10.f22574b, d10.f22575c);
                    i12 = i21;
                    i13 = i22;
                    i14 = i23;
                    f10 = f11;
                    i10 = i19;
                    i11 = i20;
                } else {
                    i10 = -1;
                    i11 = -1;
                    i12 = -1;
                    i13 = -1;
                    i14 = -1;
                    f10 = 1.0f;
                    str = null;
                }
                return new a(arrayList, v10, i10, i11, i12, i13, i14, f10, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw x1.a("Error parsing AVC config", e2);
        }
    }

    public static a b(n9.x xVar) {
        List singletonList;
        int i10;
        int i11;
        try {
            xVar.H(21);
            int v10 = xVar.v() & 3;
            int v11 = xVar.v();
            int i12 = xVar.f22599b;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < v11; i15++) {
                xVar.H(1);
                int A = xVar.A();
                for (int i16 = 0; i16 < A; i16++) {
                    int A2 = xVar.A();
                    i14 += A2 + 4;
                    xVar.H(A2);
                }
            }
            xVar.G(i12);
            byte[] bArr = new byte[i14];
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            int i21 = -1;
            float f10 = 1.0f;
            String str = null;
            int i22 = 0;
            int i23 = 0;
            while (i22 < v11) {
                int v12 = xVar.v() & 63;
                int A3 = xVar.A();
                int i24 = i13;
                while (i24 < A3) {
                    int A4 = xVar.A();
                    int i25 = v11;
                    System.arraycopy(n9.u.a, i13, bArr, i23, 4);
                    int i26 = i23 + 4;
                    System.arraycopy(xVar.a, xVar.f22599b, bArr, i26, A4);
                    if (v12 == 33 && i24 == 0) {
                        n9.r c10 = n9.u.c(i26, i26 + A4, bArr);
                        int i27 = c10.f22567g;
                        i18 = c10.f22568h;
                        i19 = c10.f22570j;
                        int i28 = c10.f22571k;
                        int i29 = c10.f22572l;
                        float f11 = c10.f22569i;
                        i10 = v12;
                        i11 = A3;
                        i17 = i27;
                        str = c6.k.g(c10.a, c10.f22562b, c10.f22563c, c10.f22564d, c10.f22565e, c10.f22566f);
                        i21 = i29;
                        i20 = i28;
                        f10 = f11;
                    } else {
                        i10 = v12;
                        i11 = A3;
                    }
                    i23 = i26 + A4;
                    xVar.H(A4);
                    i24++;
                    v11 = i25;
                    v12 = i10;
                    A3 = i11;
                    i13 = 0;
                }
                i22++;
                i13 = 0;
            }
            if (i14 == 0) {
                singletonList = Collections.emptyList();
            } else {
                singletonList = Collections.singletonList(bArr);
            }
            return new a(singletonList, v10 + 1, i17, i18, i19, i20, i21, f10, str);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw x1.a("Error parsing HEVC config", e2);
        }
    }
}

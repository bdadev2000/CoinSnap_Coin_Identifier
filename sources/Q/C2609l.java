package q;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import p.MenuC2533l;
import y1.InterfaceC2943b;

/* renamed from: q.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2609l implements p.w, InterfaceC2943b {
    public static final String h(byte[] bArr, byte[][] bArr2, int i9) {
        int i10;
        boolean z8;
        int i11;
        int i12;
        int i13 = -1;
        byte[] bArr3 = PublicSuffixDatabase.f22023e;
        int length = bArr.length;
        int i14 = 0;
        while (i14 < length) {
            int i15 = (i14 + length) / 2;
            while (i15 > i13 && bArr[i15] != 10) {
                i15 += i13;
            }
            int i16 = i15 + 1;
            int i17 = 1;
            while (true) {
                i10 = i16 + i17;
                if (bArr[i10] == 10) {
                    break;
                }
                i17++;
            }
            int i18 = i10 - i16;
            int i19 = i9;
            boolean z9 = false;
            int i20 = 0;
            int i21 = 0;
            while (true) {
                if (z9) {
                    i11 = 46;
                    z8 = false;
                } else {
                    byte b = bArr2[i19][i20];
                    byte[] bArr4 = j8.b.f21214a;
                    int i22 = b & 255;
                    z8 = z9;
                    i11 = i22;
                }
                byte b8 = bArr[i16 + i21];
                byte[] bArr5 = j8.b.f21214a;
                i12 = i11 - (b8 & 255);
                if (i12 != 0) {
                    break;
                }
                i21++;
                i20++;
                if (i21 == i18) {
                    break;
                }
                if (bArr2[i19].length == i20) {
                    if (i19 == bArr2.length - 1) {
                        break;
                    }
                    i19++;
                    z9 = true;
                    i20 = -1;
                } else {
                    z9 = z8;
                }
            }
            if (i12 >= 0) {
                if (i12 <= 0) {
                    int i23 = i18 - i21;
                    int length2 = bArr2[i19].length - i20;
                    int length3 = bArr2.length;
                    for (int i24 = i19 + 1; i24 < length3; i24++) {
                        length2 += bArr2[i24].length;
                    }
                    if (length2 >= i23) {
                        if (length2 <= i23) {
                            Charset charset = StandardCharsets.UTF_8;
                            G7.j.d(charset, "UTF_8");
                            return new String(bArr, i16, i18, charset);
                        }
                    }
                }
                i14 = i10 + 1;
                i13 = -1;
            }
            length = i15;
            i13 = -1;
        }
        return null;
    }

    @Override // y1.InterfaceC2943b
    public boolean a(float f9) {
        throw new IllegalStateException("not implemented");
    }

    @Override // y1.InterfaceC2943b
    public I1.a c() {
        throw new IllegalStateException("not implemented");
    }

    @Override // y1.InterfaceC2943b
    public boolean d(float f9) {
        return false;
    }

    @Override // y1.InterfaceC2943b
    public float e() {
        return 1.0f;
    }

    @Override // y1.InterfaceC2943b
    public float f() {
        return 0.0f;
    }

    @Override // p.w
    public boolean g(MenuC2533l menuC2533l) {
        return false;
    }

    public synchronized r6.h i() {
        r6.h hVar;
        try {
            if (r6.h.f22922f == null) {
                r6.h.f22922f = new r6.h();
            }
            hVar = r6.h.f22922f;
            G7.j.b(hVar);
        } catch (Throwable th) {
            throw th;
        }
        return hVar;
    }

    @Override // y1.InterfaceC2943b
    public boolean isEmpty() {
        return true;
    }

    @Override // p.w
    public void b(MenuC2533l menuC2533l, boolean z8) {
    }
}

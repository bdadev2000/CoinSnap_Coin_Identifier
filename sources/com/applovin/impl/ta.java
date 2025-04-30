package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Ascii;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class ta extends ak {
    public static final a b = new C1(8);

    /* renamed from: a */
    private final a f11355a;

    /* loaded from: classes.dex */
    public interface a {
        boolean a(int i9, int i10, int i11, int i12, int i13);
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final int f11356a;
        private final boolean b;

        /* renamed from: c */
        private final int f11357c;

        public b(int i9, boolean z8, int i10) {
            this.f11356a = i9;
            this.b = z8;
            this.f11357c = i10;
        }
    }

    public ta() {
        this(null);
    }

    private static int a(int i9) {
        return (i9 == 0 || i9 == 3) ? 1 : 2;
    }

    public static /* synthetic */ boolean b(int i9, int i10, int i11, int i12, int i13) {
        return false;
    }

    public static /* synthetic */ boolean c(int i9, int i10, int i11, int i12, int i13) {
        return b(i9, i10, i11, i12, i13);
    }

    private static sh d(yg ygVar, int i9) {
        byte[] bArr = new byte[i9];
        ygVar.a(bArr, 0, i9);
        int b8 = b(bArr, 0);
        return new sh(new String(bArr, 0, b8, "ISO-8859-1"), a(bArr, b8 + 1, i9));
    }

    private static ao e(yg ygVar, int i9) {
        if (i9 < 1) {
            return null;
        }
        int w2 = ygVar.w();
        String b8 = b(w2);
        int i10 = i9 - 1;
        byte[] bArr = new byte[i10];
        ygVar.a(bArr, 0, i10);
        int b9 = b(bArr, 0, w2);
        String str = new String(bArr, 0, b9, b8);
        int a6 = b9 + a(w2);
        return new ao("TXXX", str, a(bArr, a6, b(bArr, a6, w2), b8));
    }

    private static vp f(yg ygVar, int i9) {
        if (i9 < 1) {
            return null;
        }
        int w2 = ygVar.w();
        String b8 = b(w2);
        int i10 = i9 - 1;
        byte[] bArr = new byte[i10];
        ygVar.a(bArr, 0, i10);
        int b9 = b(bArr, 0, w2);
        String str = new String(bArr, 0, b9, b8);
        int a6 = b9 + a(w2);
        return new vp("WXXX", str, a(bArr, a6, b(bArr, a6), "ISO-8859-1"));
    }

    private static int g(yg ygVar, int i9) {
        byte[] c9 = ygVar.c();
        int d2 = ygVar.d();
        int i10 = d2;
        while (true) {
            int i11 = i10 + 1;
            if (i11 < d2 + i9) {
                if ((c9[i10] & 255) == 255 && c9[i11] == 0) {
                    System.arraycopy(c9, i10 + 2, c9, i11, (i9 - (i10 - d2)) - 2);
                    i9--;
                }
                i10 = i11;
            } else {
                return i9;
            }
        }
    }

    public ta(a aVar) {
        this.f11355a = aVar;
    }

    private static byte[] a(byte[] bArr, int i9, int i10) {
        if (i10 <= i9) {
            return yp.f12455f;
        }
        return Arrays.copyOfRange(bArr, i9, i10);
    }

    private static C0686d3 b(yg ygVar, int i9, int i10, boolean z8, int i11, a aVar) {
        int d2 = ygVar.d();
        int b8 = b(ygVar.c(), d2);
        String str = new String(ygVar.c(), d2, b8 - d2, "ISO-8859-1");
        ygVar.f(b8 + 1);
        int w2 = ygVar.w();
        boolean z9 = (w2 & 2) != 0;
        boolean z10 = (w2 & 1) != 0;
        int w9 = ygVar.w();
        String[] strArr = new String[w9];
        for (int i12 = 0; i12 < w9; i12++) {
            int d9 = ygVar.d();
            int b9 = b(ygVar.c(), d9);
            strArr[i12] = new String(ygVar.c(), d9, b9 - d9, "ISO-8859-1");
            ygVar.f(b9 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i13 = d2 + i9;
        while (ygVar.d() < i13) {
            ua a6 = a(i10, ygVar, z8, i11, aVar);
            if (a6 != null) {
                arrayList.add(a6);
            }
        }
        return new C0686d3(str, z9, z10, strArr, (ua[]) arrayList.toArray(new ua[0]));
    }

    private static ef c(yg ygVar, int i9) {
        int C8 = ygVar.C();
        int z8 = ygVar.z();
        int z9 = ygVar.z();
        int w2 = ygVar.w();
        int w9 = ygVar.w();
        xg xgVar = new xg();
        xgVar.a(ygVar);
        int i10 = ((i9 - 10) * 8) / (w2 + w9);
        int[] iArr = new int[i10];
        int[] iArr2 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int a6 = xgVar.a(w2);
            int a9 = xgVar.a(w9);
            iArr[i11] = a6;
            iArr2[i11] = a9;
        }
        return new ef(C8, z8, z9, iArr, iArr2);
    }

    @Override // com.applovin.impl.ak
    public we a(ze zeVar, ByteBuffer byteBuffer) {
        return a(byteBuffer.array(), byteBuffer.limit());
    }

    private static C0762u0 a(yg ygVar, int i9, int i10) {
        int b8;
        String lowerCase;
        int w2 = ygVar.w();
        String b9 = b(w2);
        int i11 = i9 - 1;
        byte[] bArr = new byte[i11];
        ygVar.a(bArr, 0, i11);
        if (i10 == 2) {
            lowerCase = "image/" + Ascii.toLowerCase(new String(bArr, 0, 3, "ISO-8859-1"));
            if ("image/jpg".equals(lowerCase)) {
                lowerCase = "image/jpeg";
            }
            b8 = 2;
        } else {
            b8 = b(bArr, 0);
            lowerCase = Ascii.toLowerCase(new String(bArr, 0, b8, "ISO-8859-1"));
            if (lowerCase.indexOf(47) == -1) {
                lowerCase = "image/".concat(lowerCase);
            }
        }
        int i12 = bArr[b8 + 1] & 255;
        int i13 = b8 + 2;
        int b10 = b(bArr, i13, w2);
        return new C0762u0(lowerCase, new String(bArr, i13, b10 - i13, b9), i12, a(bArr, b10 + a(w2), i11));
    }

    private static vp c(yg ygVar, int i9, String str) {
        byte[] bArr = new byte[i9];
        ygVar.a(bArr, 0, i9);
        return new vp(str, null, new String(bArr, 0, b(bArr, 0), "ISO-8859-1"));
    }

    private static y9 b(yg ygVar, int i9) {
        int w2 = ygVar.w();
        String b8 = b(w2);
        int i10 = i9 - 1;
        byte[] bArr = new byte[i10];
        ygVar.a(bArr, 0, i10);
        int b9 = b(bArr, 0);
        String str = new String(bArr, 0, b9, "ISO-8859-1");
        int i11 = b9 + 1;
        int b10 = b(bArr, i11, w2);
        String a6 = a(bArr, i11, b10, b8);
        int a9 = b10 + a(w2);
        int b11 = b(bArr, a9, w2);
        return new y9(str, a6, a(bArr, a9, b11, b8), a(bArr, b11 + a(w2), i10));
    }

    private static C0700g2 a(yg ygVar, int i9, String str) {
        byte[] bArr = new byte[i9];
        ygVar.a(bArr, 0, i9);
        return new C0700g2(str, bArr);
    }

    private static C0681c3 a(yg ygVar, int i9, int i10, boolean z8, int i11, a aVar) {
        int d2 = ygVar.d();
        int b8 = b(ygVar.c(), d2);
        String str = new String(ygVar.c(), d2, b8 - d2, "ISO-8859-1");
        ygVar.f(b8 + 1);
        int j7 = ygVar.j();
        int j9 = ygVar.j();
        long y4 = ygVar.y();
        long j10 = y4 == 4294967295L ? -1L : y4;
        long y6 = ygVar.y();
        long j11 = y6 == 4294967295L ? -1L : y6;
        ArrayList arrayList = new ArrayList();
        int i12 = d2 + i9;
        while (ygVar.d() < i12) {
            ua a6 = a(i10, ygVar, z8, i11, aVar);
            if (a6 != null) {
                arrayList.add(a6);
            }
        }
        return new C0681c3(str, j7, j9, j10, j11, (ua[]) arrayList.toArray(new ua[0]));
    }

    private static ao b(yg ygVar, int i9, String str) {
        if (i9 < 1) {
            return null;
        }
        int w2 = ygVar.w();
        String b8 = b(w2);
        int i10 = i9 - 1;
        byte[] bArr = new byte[i10];
        ygVar.a(bArr, 0, i10);
        return new ao(str, null, new String(bArr, 0, b(bArr, 0, w2), b8));
    }

    private static s3 a(yg ygVar, int i9) {
        if (i9 < 4) {
            return null;
        }
        int w2 = ygVar.w();
        String b8 = b(w2);
        byte[] bArr = new byte[3];
        ygVar.a(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i10 = i9 - 4;
        byte[] bArr2 = new byte[i10];
        ygVar.a(bArr2, 0, i10);
        int b9 = b(bArr2, 0, w2);
        String str2 = new String(bArr2, 0, b9, b8);
        int a6 = b9 + a(w2);
        return new s3(str, str2, a(bArr2, a6, b(bArr2, a6, w2), b8));
    }

    private static String b(int i9) {
        if (i9 == 1) {
            return com.mbridge.msdk.playercommon.exoplayer2.C.UTF16_NAME;
        }
        if (i9 == 2) {
            return "UTF-16BE";
        }
        if (i9 != 3) {
            return "ISO-8859-1";
        }
        return "UTF-8";
    }

    private static int b(byte[] bArr, int i9, int i10) {
        int b8 = b(bArr, i9);
        if (i10 == 0 || i10 == 3) {
            return b8;
        }
        while (b8 < bArr.length - 1) {
            if ((b8 - i9) % 2 == 0 && bArr[b8 + 1] == 0) {
                return b8;
            }
            b8 = b(bArr, b8 + 1);
        }
        return bArr.length;
    }

    private static int b(byte[] bArr, int i9) {
        while (i9 < bArr.length) {
            if (bArr[i9] == 0) {
                return i9;
            }
            i9++;
        }
        return bArr.length;
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x0193, code lost:
    
        if (r14 == 67) goto L305;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.applovin.impl.ua a(int r20, com.applovin.impl.yg r21, boolean r22, int r23, com.applovin.impl.ta.a r24) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.ta.a(int, com.applovin.impl.yg, boolean, int, com.applovin.impl.ta$a):com.applovin.impl.ua");
    }

    private static b a(yg ygVar) {
        if (ygVar.a() < 10) {
            kc.d("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int z8 = ygVar.z();
        if (z8 != 4801587) {
            kc.d("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(z8))));
            return null;
        }
        int w2 = ygVar.w();
        ygVar.g(1);
        int w9 = ygVar.w();
        int v6 = ygVar.v();
        if (w2 == 2) {
            if ((w9 & 64) != 0) {
                kc.d("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (w2 == 3) {
            if ((w9 & 64) != 0) {
                int j7 = ygVar.j();
                ygVar.g(j7);
                v6 -= j7 + 4;
            }
        } else {
            if (w2 != 4) {
                L.p(w2, "Skipped ID3 tag with unsupported majorVersion=", "Id3Decoder");
                return null;
            }
            if ((w9 & 64) != 0) {
                int v9 = ygVar.v();
                ygVar.g(v9 - 4);
                v6 -= v9;
            }
            if ((w9 & 16) != 0) {
                v6 -= 10;
            }
        }
        return new b(w2, w2 < 4 && (w9 & 128) != 0, v6);
    }

    private static String a(byte[] bArr, int i9, int i10, String str) {
        if (i10 > i9 && i10 <= bArr.length) {
            return new String(bArr, i9, i10 - i9, str);
        }
        return "";
    }

    private static String a(int i9, int i10, int i11, int i12, int i13) {
        if (i9 == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
    
        if ((r10 & 1) != 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008a, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0087, code lost:
    
        if ((r10 & 128) != 0) goto L115;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean a(com.applovin.impl.yg r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r18.d()
        L8:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> L22
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lae
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L25
            int r7 = r18.j()     // Catch: java.lang.Throwable -> L22
            long r8 = r18.y()     // Catch: java.lang.Throwable -> L22
            int r10 = r18.C()     // Catch: java.lang.Throwable -> L22
            goto L2f
        L22:
            r0 = move-exception
            goto Lb2
        L25:
            int r7 = r18.z()     // Catch: java.lang.Throwable -> L22
            int r8 = r18.z()     // Catch: java.lang.Throwable -> L22
            long r8 = (long) r8
            r10 = r6
        L2f:
            r11 = 0
            if (r7 != 0) goto L3d
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3d
            if (r10 != 0) goto L3d
            r1.f(r2)
            return r4
        L3d:
            r7 = 4
            if (r0 != r7) goto L6e
            if (r21 != 0) goto L6e
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4e
            r1.f(r2)
            return r6
        L4e:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6e:
            if (r0 != r7) goto L7c
            r3 = r10 & 64
            if (r3 == 0) goto L76
            r3 = r4
            goto L77
        L76:
            r3 = r6
        L77:
            r7 = r10 & 1
            if (r7 == 0) goto L8a
            goto L8e
        L7c:
            if (r0 != r3) goto L8c
            r3 = r10 & 32
            if (r3 == 0) goto L84
            r3 = r4
            goto L85
        L84:
            r3 = r6
        L85:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L8a
            goto L8e
        L8a:
            r4 = r6
            goto L8e
        L8c:
            r3 = r6
            r4 = r3
        L8e:
            if (r4 == 0) goto L92
            int r3 = r3 + 4
        L92:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L9b
            r1.f(r2)
            return r6
        L9b:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> L22
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La8
            r1.f(r2)
            return r6
        La8:
            int r3 = (int) r8
            r1.g(r3)     // Catch: java.lang.Throwable -> L22
            goto L8
        Lae:
            r1.f(r2)
            return r4
        Lb2:
            r1.f(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.ta.a(com.applovin.impl.yg, int, int, boolean):boolean");
    }

    public we a(byte[] bArr, int i9) {
        ArrayList arrayList = new ArrayList();
        yg ygVar = new yg(bArr, i9);
        b a6 = a(ygVar);
        if (a6 == null) {
            return null;
        }
        int d2 = ygVar.d();
        int i10 = a6.f11356a == 2 ? 6 : 10;
        int i11 = a6.f11357c;
        if (a6.b) {
            i11 = g(ygVar, a6.f11357c);
        }
        ygVar.e(d2 + i11);
        boolean z8 = false;
        if (!a(ygVar, a6.f11356a, i10, false)) {
            if (a6.f11356a != 4 || !a(ygVar, 4, i10, true)) {
                kc.d("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + a6.f11356a);
                return null;
            }
            z8 = true;
        }
        while (ygVar.a() >= i10) {
            ua a9 = a(a6.f11356a, ygVar, z8, i10, this.f11355a);
            if (a9 != null) {
                arrayList.add(a9);
            }
        }
        return new we(arrayList);
    }
}

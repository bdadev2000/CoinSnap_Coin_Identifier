package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.UByte;

/* loaded from: classes.dex */
public final class ta extends ak {

    /* renamed from: b */
    public static final a f8187b = new lu(7);
    private final a a;

    /* loaded from: classes.dex */
    public interface a {
        boolean a(int i10, int i11, int i12, int i13, int i14);
    }

    /* loaded from: classes.dex */
    public static final class b {
        private final int a;

        /* renamed from: b */
        private final boolean f8188b;

        /* renamed from: c */
        private final int f8189c;

        public b(int i10, boolean z10, int i11) {
            this.a = i10;
            this.f8188b = z10;
            this.f8189c = i11;
        }
    }

    public ta() {
        this(null);
    }

    private static int a(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    private static String b(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : C.UTF16_NAME;
    }

    public static /* synthetic */ boolean c(int i10, int i11, int i12, int i13, int i14) {
        return b(i10, i11, i12, i13, i14);
    }

    private static sh d(yg ygVar, int i10) {
        byte[] bArr = new byte[i10];
        ygVar.a(bArr, 0, i10);
        int b3 = b(bArr, 0);
        return new sh(new String(bArr, 0, b3, "ISO-8859-1"), a(bArr, b3 + 1, i10));
    }

    private static ao e(yg ygVar, int i10) {
        if (i10 < 1) {
            return null;
        }
        int w10 = ygVar.w();
        String b3 = b(w10);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        ygVar.a(bArr, 0, i11);
        int b10 = b(bArr, 0, w10);
        String str = new String(bArr, 0, b10, b3);
        int a10 = b10 + a(w10);
        return new ao("TXXX", str, a(bArr, a10, b(bArr, a10, w10), b3));
    }

    private static vp f(yg ygVar, int i10) {
        if (i10 < 1) {
            return null;
        }
        int w10 = ygVar.w();
        String b3 = b(w10);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        ygVar.a(bArr, 0, i11);
        int b10 = b(bArr, 0, w10);
        String str = new String(bArr, 0, b10, b3);
        int a10 = b10 + a(w10);
        return new vp("WXXX", str, a(bArr, a10, b(bArr, a10), "ISO-8859-1"));
    }

    private static int g(yg ygVar, int i10) {
        byte[] c10 = ygVar.c();
        int d10 = ygVar.d();
        int i11 = d10;
        while (true) {
            int i12 = i11 + 1;
            if (i12 < d10 + i10) {
                if ((c10[i11] & UByte.MAX_VALUE) == 255 && c10[i12] == 0) {
                    System.arraycopy(c10, i11 + 2, c10, i12, (i10 - (i11 - d10)) - 2);
                    i10--;
                }
                i11 = i12;
            } else {
                return i10;
            }
        }
    }

    public ta(a aVar) {
        this.a = aVar;
    }

    private static byte[] a(byte[] bArr, int i10, int i11) {
        if (i11 <= i10) {
            return yp.f9257f;
        }
        return Arrays.copyOfRange(bArr, i10, i11);
    }

    public static /* synthetic */ boolean b(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    private static ef c(yg ygVar, int i10) {
        int C = ygVar.C();
        int z10 = ygVar.z();
        int z11 = ygVar.z();
        int w10 = ygVar.w();
        int w11 = ygVar.w();
        xg xgVar = new xg();
        xgVar.a(ygVar);
        int i11 = ((i10 - 10) * 8) / (w10 + w11);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int a10 = xgVar.a(w10);
            int a11 = xgVar.a(w11);
            iArr[i12] = a10;
            iArr2[i12] = a11;
        }
        return new ef(C, z10, z11, iArr, iArr2);
    }

    private static d3 b(yg ygVar, int i10, int i11, boolean z10, int i12, a aVar) {
        int d10 = ygVar.d();
        int b3 = b(ygVar.c(), d10);
        String str = new String(ygVar.c(), d10, b3 - d10, "ISO-8859-1");
        ygVar.f(b3 + 1);
        int w10 = ygVar.w();
        boolean z11 = (w10 & 2) != 0;
        boolean z12 = (w10 & 1) != 0;
        int w11 = ygVar.w();
        String[] strArr = new String[w11];
        for (int i13 = 0; i13 < w11; i13++) {
            int d11 = ygVar.d();
            int b10 = b(ygVar.c(), d11);
            strArr[i13] = new String(ygVar.c(), d11, b10 - d11, "ISO-8859-1");
            ygVar.f(b10 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i14 = d10 + i10;
        while (ygVar.d() < i14) {
            ua a10 = a(i11, ygVar, z10, i12, aVar);
            if (a10 != null) {
                arrayList.add(a10);
            }
        }
        return new d3(str, z11, z12, strArr, (ua[]) arrayList.toArray(new ua[0]));
    }

    @Override // com.applovin.impl.ak
    public we a(ze zeVar, ByteBuffer byteBuffer) {
        return a(byteBuffer.array(), byteBuffer.limit());
    }

    private static u0 a(yg ygVar, int i10, int i11) {
        int b3;
        String concat;
        int w10 = ygVar.w();
        String b10 = b(w10);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        ygVar.a(bArr, 0, i12);
        if (i11 == 2) {
            concat = "image/" + Ascii.toLowerCase(new String(bArr, 0, 3, "ISO-8859-1"));
            if ("image/jpg".equals(concat)) {
                concat = "image/jpeg";
            }
            b3 = 2;
        } else {
            b3 = b(bArr, 0);
            String lowerCase = Ascii.toLowerCase(new String(bArr, 0, b3, "ISO-8859-1"));
            concat = lowerCase.indexOf(47) == -1 ? "image/".concat(lowerCase) : lowerCase;
        }
        int i13 = bArr[b3 + 1] & UByte.MAX_VALUE;
        int i14 = b3 + 2;
        int b11 = b(bArr, i14, w10);
        return new u0(concat, new String(bArr, i14, b11 - i14, b10), i13, a(bArr, b11 + a(w10), i12));
    }

    private static vp c(yg ygVar, int i10, String str) {
        byte[] bArr = new byte[i10];
        ygVar.a(bArr, 0, i10);
        return new vp(str, null, new String(bArr, 0, b(bArr, 0), "ISO-8859-1"));
    }

    private static g2 a(yg ygVar, int i10, String str) {
        byte[] bArr = new byte[i10];
        ygVar.a(bArr, 0, i10);
        return new g2(str, bArr);
    }

    private static y9 b(yg ygVar, int i10) {
        int w10 = ygVar.w();
        String b3 = b(w10);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        ygVar.a(bArr, 0, i11);
        int b10 = b(bArr, 0);
        String str = new String(bArr, 0, b10, "ISO-8859-1");
        int i12 = b10 + 1;
        int b11 = b(bArr, i12, w10);
        String a10 = a(bArr, i12, b11, b3);
        int a11 = b11 + a(w10);
        int b12 = b(bArr, a11, w10);
        return new y9(str, a10, a(bArr, a11, b12, b3), a(bArr, b12 + a(w10), i11));
    }

    private static c3 a(yg ygVar, int i10, int i11, boolean z10, int i12, a aVar) {
        int d10 = ygVar.d();
        int b3 = b(ygVar.c(), d10);
        String str = new String(ygVar.c(), d10, b3 - d10, "ISO-8859-1");
        ygVar.f(b3 + 1);
        int j3 = ygVar.j();
        int j10 = ygVar.j();
        long y4 = ygVar.y();
        long j11 = y4 == 4294967295L ? -1L : y4;
        long y10 = ygVar.y();
        long j12 = y10 == 4294967295L ? -1L : y10;
        ArrayList arrayList = new ArrayList();
        int i13 = d10 + i10;
        while (ygVar.d() < i13) {
            ua a10 = a(i11, ygVar, z10, i12, aVar);
            if (a10 != null) {
                arrayList.add(a10);
            }
        }
        return new c3(str, j3, j10, j11, j12, (ua[]) arrayList.toArray(new ua[0]));
    }

    private static ao b(yg ygVar, int i10, String str) {
        if (i10 < 1) {
            return null;
        }
        int w10 = ygVar.w();
        String b3 = b(w10);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        ygVar.a(bArr, 0, i11);
        return new ao(str, null, new String(bArr, 0, b(bArr, 0, w10), b3));
    }

    private static s3 a(yg ygVar, int i10) {
        if (i10 < 4) {
            return null;
        }
        int w10 = ygVar.w();
        String b3 = b(w10);
        byte[] bArr = new byte[3];
        ygVar.a(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        ygVar.a(bArr2, 0, i11);
        int b10 = b(bArr2, 0, w10);
        String str2 = new String(bArr2, 0, b10, b3);
        int a10 = b10 + a(w10);
        return new s3(str, str2, a(bArr2, a10, b(bArr2, a10, w10), b3));
    }

    private static int b(byte[] bArr, int i10, int i11) {
        int b3 = b(bArr, i10);
        if (i11 == 0 || i11 == 3) {
            return b3;
        }
        while (b3 < bArr.length - 1) {
            if ((b3 - i10) % 2 == 0 && bArr[b3 + 1] == 0) {
                return b3;
            }
            b3 = b(bArr, b3 + 1);
        }
        return bArr.length;
    }

    private static int b(byte[] bArr, int i10) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x0191, code lost:
    
        if (r14 == 67) goto L306;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.applovin.impl.ua a(int r20, com.applovin.impl.yg r21, boolean r22, int r23, com.applovin.impl.ta.a r24) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.ta.a(int, com.applovin.impl.yg, boolean, int, com.applovin.impl.ta$a):com.applovin.impl.ua");
    }

    private static b a(yg ygVar) {
        if (ygVar.a() < 10) {
            kc.d("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int z10 = ygVar.z();
        boolean z11 = false;
        if (z10 != 4801587) {
            kc.d("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", Integer.valueOf(z10)));
            return null;
        }
        int w10 = ygVar.w();
        ygVar.g(1);
        int w11 = ygVar.w();
        int v10 = ygVar.v();
        if (w10 == 2) {
            if ((w11 & 64) != 0) {
                kc.d("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (w10 == 3) {
            if ((w11 & 64) != 0) {
                int j3 = ygVar.j();
                ygVar.g(j3);
                v10 -= j3 + 4;
            }
        } else {
            if (w10 != 4) {
                a4.j.u("Skipped ID3 tag with unsupported majorVersion=", w10, "Id3Decoder");
                return null;
            }
            if ((w11 & 64) != 0) {
                int v11 = ygVar.v();
                ygVar.g(v11 - 4);
                v10 -= v11;
            }
            if ((w11 & 16) != 0) {
                v10 -= 10;
            }
        }
        if (w10 < 4 && (w11 & 128) != 0) {
            z11 = true;
        }
        return new b(w10, z11, v10);
    }

    private static String a(byte[] bArr, int i10, int i11, String str) {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, str);
    }

    private static String a(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
    
        if ((r10 & 1) != 0) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0084, code lost:
    
        if ((r10 & 128) != 0) goto L112;
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
            int r3 = r18.a()     // Catch: java.lang.Throwable -> Laf
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lab
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L22
            int r7 = r18.j()     // Catch: java.lang.Throwable -> Laf
            long r8 = r18.y()     // Catch: java.lang.Throwable -> Laf
            int r10 = r18.C()     // Catch: java.lang.Throwable -> Laf
            goto L2c
        L22:
            int r7 = r18.z()     // Catch: java.lang.Throwable -> Laf
            int r8 = r18.z()     // Catch: java.lang.Throwable -> Laf
            long r8 = (long) r8
            r10 = r6
        L2c:
            r11 = 0
            if (r7 != 0) goto L3a
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3a
            if (r10 != 0) goto L3a
            r1.f(r2)
            return r4
        L3a:
            r7 = 4
            if (r0 != r7) goto L6b
            if (r21 != 0) goto L6b
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4b
            r1.f(r2)
            return r6
        L4b:
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
        L6b:
            if (r0 != r7) goto L79
            r3 = r10 & 64
            if (r3 == 0) goto L73
            r3 = r4
            goto L74
        L73:
            r3 = r6
        L74:
            r7 = r10 & 1
            if (r7 == 0) goto L87
            goto L8b
        L79:
            if (r0 != r3) goto L89
            r3 = r10 & 32
            if (r3 == 0) goto L81
            r3 = r4
            goto L82
        L81:
            r3 = r6
        L82:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L87
            goto L8b
        L87:
            r4 = r6
            goto L8b
        L89:
            r3 = r6
            r4 = r3
        L8b:
            if (r4 == 0) goto L8f
            int r3 = r3 + 4
        L8f:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L98
            r1.f(r2)
            return r6
        L98:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> Laf
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La5
            r1.f(r2)
            return r6
        La5:
            int r3 = (int) r8
            r1.g(r3)     // Catch: java.lang.Throwable -> Laf
            goto L8
        Lab:
            r1.f(r2)
            return r4
        Laf:
            r0 = move-exception
            r1.f(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.ta.a(com.applovin.impl.yg, int, int, boolean):boolean");
    }

    public we a(byte[] bArr, int i10) {
        ArrayList arrayList = new ArrayList();
        yg ygVar = new yg(bArr, i10);
        b a10 = a(ygVar);
        if (a10 == null) {
            return null;
        }
        int d10 = ygVar.d();
        int i11 = a10.a == 2 ? 6 : 10;
        int i12 = a10.f8189c;
        if (a10.f8188b) {
            i12 = g(ygVar, a10.f8189c);
        }
        ygVar.e(d10 + i12);
        boolean z10 = false;
        if (!a(ygVar, a10.a, i11, false)) {
            if (a10.a != 4 || !a(ygVar, 4, i11, true)) {
                kc.d("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + a10.a);
                return null;
            }
            z10 = true;
        }
        while (ygVar.a() >= i11) {
            ua a11 = a(a10.a, ygVar, z10, i11, this.a);
            if (a11 != null) {
                arrayList.add(a11);
            }
        }
        return new we(arrayList);
    }
}

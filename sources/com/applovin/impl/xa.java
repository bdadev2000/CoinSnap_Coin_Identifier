package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class xa extends dk {

    /* renamed from: b */
    public static final a f27869b = new ru(17);

    /* renamed from: a */
    private final a f27870a;

    /* loaded from: classes3.dex */
    public interface a {
        boolean a(int i2, int i3, int i4, int i5, int i6);
    }

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        private final int f27871a;

        /* renamed from: b */
        private final boolean f27872b;

        /* renamed from: c */
        private final int f27873c;

        public b(int i2, boolean z2, int i3) {
            this.f27871a = i2;
            this.f27872b = z2;
            this.f27873c = i3;
        }
    }

    public xa() {
        this(null);
    }

    private static int a(int i2) {
        return (i2 == 0 || i2 == 3) ? 1 : 2;
    }

    private static String b(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    public static /* synthetic */ boolean c(int i2, int i3, int i4, int i5, int i6) {
        return b(i2, i3, i4, i5, i6);
    }

    private static vh d(bh bhVar, int i2) {
        byte[] bArr = new byte[i2];
        bhVar.a(bArr, 0, i2);
        int b2 = b(bArr, 0);
        return new vh(new String(bArr, 0, b2, "ISO-8859-1"), a(bArr, b2 + 1, i2));
    }

    private static zn e(bh bhVar, int i2) {
        if (i2 < 1) {
            return null;
        }
        int w = bhVar.w();
        String b2 = b(w);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        bhVar.a(bArr, 0, i3);
        int b3 = b(bArr, 0, w);
        String str = new String(bArr, 0, b3, b2);
        int a2 = b3 + a(w);
        return new zn("TXXX", str, a(bArr, a2, b(bArr, a2, w), b2));
    }

    private static up f(bh bhVar, int i2) {
        if (i2 < 1) {
            return null;
        }
        int w = bhVar.w();
        String b2 = b(w);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        bhVar.a(bArr, 0, i3);
        int b3 = b(bArr, 0, w);
        String str = new String(bArr, 0, b3, b2);
        int a2 = b3 + a(w);
        return new up("WXXX", str, a(bArr, a2, b(bArr, a2), "ISO-8859-1"));
    }

    private static int g(bh bhVar, int i2) {
        byte[] c2 = bhVar.c();
        int d = bhVar.d();
        int i3 = d;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= d + i2) {
                return i2;
            }
            if ((c2[i3] & UnsignedBytes.MAX_VALUE) == 255 && c2[i4] == 0) {
                System.arraycopy(c2, i3 + 2, c2, i4, (i2 - (i3 - d)) - 2);
                i2--;
            }
            i3 = i4;
        }
    }

    public xa(a aVar) {
        this.f27870a = aVar;
    }

    private static byte[] a(byte[] bArr, int i2, int i3) {
        if (i3 <= i2) {
            return xp.f27965f;
        }
        return Arrays.copyOfRange(bArr, i2, i3);
    }

    public static /* synthetic */ boolean b(int i2, int i3, int i4, int i5, int i6) {
        return false;
    }

    private static jf c(bh bhVar, int i2) {
        int C = bhVar.C();
        int z2 = bhVar.z();
        int z3 = bhVar.z();
        int w = bhVar.w();
        int w2 = bhVar.w();
        ah ahVar = new ah();
        ahVar.a(bhVar);
        int i3 = ((i2 - 10) * 8) / (w + w2);
        int[] iArr = new int[i3];
        int[] iArr2 = new int[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int a2 = ahVar.a(w);
            int a3 = ahVar.a(w2);
            iArr[i4] = a2;
            iArr2[i4] = a3;
        }
        return new jf(C, z2, z3, iArr, iArr2);
    }

    private static f3 b(bh bhVar, int i2, int i3, boolean z2, int i4, a aVar) {
        int d = bhVar.d();
        int b2 = b(bhVar.c(), d);
        String str = new String(bhVar.c(), d, b2 - d, "ISO-8859-1");
        bhVar.f(b2 + 1);
        int w = bhVar.w();
        boolean z3 = (w & 2) != 0;
        boolean z4 = (w & 1) != 0;
        int w2 = bhVar.w();
        String[] strArr = new String[w2];
        for (int i5 = 0; i5 < w2; i5++) {
            int d2 = bhVar.d();
            int b3 = b(bhVar.c(), d2);
            strArr[i5] = new String(bhVar.c(), d2, b3 - d2, "ISO-8859-1");
            bhVar.f(b3 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i6 = d + i2;
        while (bhVar.d() < i6) {
            ya a2 = a(i3, bhVar, z2, i4, aVar);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return new f3(str, z3, z4, strArr, (ya[]) arrayList.toArray(new ya[0]));
    }

    @Override // com.applovin.impl.dk
    public bf a(ef efVar, ByteBuffer byteBuffer) {
        return a(byteBuffer.array(), byteBuffer.limit());
    }

    private static v0 a(bh bhVar, int i2, int i3) {
        int b2;
        String lowerCase;
        int w = bhVar.w();
        String b3 = b(w);
        int i4 = i2 - 1;
        byte[] bArr = new byte[i4];
        bhVar.a(bArr, 0, i4);
        if (i3 == 2) {
            lowerCase = "image/" + Ascii.toLowerCase(new String(bArr, 0, 3, "ISO-8859-1"));
            if ("image/jpg".equals(lowerCase)) {
                lowerCase = "image/jpeg";
            }
            b2 = 2;
        } else {
            b2 = b(bArr, 0);
            lowerCase = Ascii.toLowerCase(new String(bArr, 0, b2, "ISO-8859-1"));
            if (lowerCase.indexOf(47) == -1) {
                lowerCase = "image/".concat(lowerCase);
            }
        }
        int i5 = bArr[b2 + 1] & UnsignedBytes.MAX_VALUE;
        int i6 = b2 + 2;
        int b4 = b(bArr, i6, w);
        return new v0(lowerCase, new String(bArr, i6, b4 - i6, b3), i5, a(bArr, b4 + a(w), i4));
    }

    private static up c(bh bhVar, int i2, String str) {
        byte[] bArr = new byte[i2];
        bhVar.a(bArr, 0, i2);
        return new up(str, null, new String(bArr, 0, b(bArr, 0), "ISO-8859-1"));
    }

    private static h2 a(bh bhVar, int i2, String str) {
        byte[] bArr = new byte[i2];
        bhVar.a(bArr, 0, i2);
        return new h2(str, bArr);
    }

    private static aa b(bh bhVar, int i2) {
        int w = bhVar.w();
        String b2 = b(w);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        bhVar.a(bArr, 0, i3);
        int b3 = b(bArr, 0);
        String str = new String(bArr, 0, b3, "ISO-8859-1");
        int i4 = b3 + 1;
        int b4 = b(bArr, i4, w);
        String a2 = a(bArr, i4, b4, b2);
        int a3 = b4 + a(w);
        int b5 = b(bArr, a3, w);
        return new aa(str, a2, a(bArr, a3, b5, b2), a(bArr, b5 + a(w), i3));
    }

    private static e3 a(bh bhVar, int i2, int i3, boolean z2, int i4, a aVar) {
        int d = bhVar.d();
        int b2 = b(bhVar.c(), d);
        String str = new String(bhVar.c(), d, b2 - d, "ISO-8859-1");
        bhVar.f(b2 + 1);
        int j2 = bhVar.j();
        int j3 = bhVar.j();
        long y2 = bhVar.y();
        long j4 = y2 == 4294967295L ? -1L : y2;
        long y3 = bhVar.y();
        long j5 = y3 == 4294967295L ? -1L : y3;
        ArrayList arrayList = new ArrayList();
        int i5 = d + i2;
        while (bhVar.d() < i5) {
            ya a2 = a(i3, bhVar, z2, i4, aVar);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return new e3(str, j2, j3, j4, j5, (ya[]) arrayList.toArray(new ya[0]));
    }

    private static zn b(bh bhVar, int i2, String str) {
        if (i2 < 1) {
            return null;
        }
        int w = bhVar.w();
        String b2 = b(w);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        bhVar.a(bArr, 0, i3);
        return new zn(str, null, new String(bArr, 0, b(bArr, 0, w), b2));
    }

    private static u3 a(bh bhVar, int i2) {
        if (i2 < 4) {
            return null;
        }
        int w = bhVar.w();
        String b2 = b(w);
        byte[] bArr = new byte[3];
        bhVar.a(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i3 = i2 - 4;
        byte[] bArr2 = new byte[i3];
        bhVar.a(bArr2, 0, i3);
        int b3 = b(bArr2, 0, w);
        String str2 = new String(bArr2, 0, b3, b2);
        int a2 = b3 + a(w);
        return new u3(str, str2, a(bArr2, a2, b(bArr2, a2, w), b2));
    }

    private static int b(byte[] bArr, int i2, int i3) {
        int b2 = b(bArr, i2);
        if (i3 == 0 || i3 == 3) {
            return b2;
        }
        while (b2 < bArr.length - 1) {
            if ((b2 - i2) % 2 == 0 && bArr[b2 + 1] == 0) {
                return b2;
            }
            b2 = b(bArr, b2 + 1);
        }
        return bArr.length;
    }

    private static int b(byte[] bArr, int i2) {
        while (i2 < bArr.length) {
            if (bArr[i2] == 0) {
                return i2;
            }
            i2++;
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
    private static com.applovin.impl.ya a(int r20, com.applovin.impl.bh r21, boolean r22, int r23, com.applovin.impl.xa.a r24) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.xa.a(int, com.applovin.impl.bh, boolean, int, com.applovin.impl.xa$a):com.applovin.impl.ya");
    }

    private static b a(bh bhVar) {
        if (bhVar.a() < 10) {
            pc.d("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int z2 = bhVar.z();
        if (z2 != 4801587) {
            pc.d("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", Integer.valueOf(z2)));
            return null;
        }
        int w = bhVar.w();
        bhVar.g(1);
        int w2 = bhVar.w();
        int v2 = bhVar.v();
        if (w == 2) {
            if ((w2 & 64) != 0) {
                pc.d("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (w == 3) {
            if ((w2 & 64) != 0) {
                int j2 = bhVar.j();
                bhVar.g(j2);
                v2 -= j2 + 4;
            }
        } else {
            if (w != 4) {
                com.applovin.impl.adview.t.u("Skipped ID3 tag with unsupported majorVersion=", w, "Id3Decoder");
                return null;
            }
            if ((w2 & 64) != 0) {
                int v3 = bhVar.v();
                bhVar.g(v3 - 4);
                v2 -= v3;
            }
            if ((w2 & 16) != 0) {
                v2 -= 10;
            }
        }
        return new b(w, w < 4 && (w2 & 128) != 0, v2);
    }

    private static String a(byte[] bArr, int i2, int i3, String str) {
        return (i3 <= i2 || i3 > bArr.length) ? "" : new String(bArr, i2, i3 - i2, str);
    }

    private static String a(int i2, int i3, int i4, int i5, int i6) {
        if (i2 == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6));
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
    private static boolean a(com.applovin.impl.bh r18, int r19, int r20, boolean r21) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.xa.a(com.applovin.impl.bh, int, int, boolean):boolean");
    }

    public bf a(byte[] bArr, int i2) {
        ArrayList arrayList = new ArrayList();
        bh bhVar = new bh(bArr, i2);
        b a2 = a(bhVar);
        if (a2 == null) {
            return null;
        }
        int d = bhVar.d();
        int i3 = a2.f27871a == 2 ? 6 : 10;
        int i4 = a2.f27873c;
        if (a2.f27872b) {
            i4 = g(bhVar, a2.f27873c);
        }
        bhVar.e(d + i4);
        boolean z2 = false;
        if (!a(bhVar, a2.f27871a, i3, false)) {
            if (a2.f27871a != 4 || !a(bhVar, 4, i3, true)) {
                pc.d("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + a2.f27871a);
                return null;
            }
            z2 = true;
        }
        while (bhVar.a() >= i3) {
            ya a3 = a(a2.f27871a, bhVar, z2, i3, this.f27870a);
            if (a3 != null) {
                arrayList.add(a3);
            }
        }
        return new bf(arrayList);
    }
}

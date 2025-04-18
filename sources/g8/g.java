package g8;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import n9.h0;
import n9.x;

/* loaded from: classes3.dex */
public abstract class g {
    public static final byte[] a = h0.z("OpusHead");

    public static d a(int i10, x xVar) {
        long j3;
        long j10;
        xVar.G(i10 + 8 + 4);
        xVar.H(1);
        b(xVar);
        xVar.H(2);
        int v10 = xVar.v();
        if ((v10 & 128) != 0) {
            xVar.H(2);
        }
        if ((v10 & 64) != 0) {
            xVar.H(xVar.v());
        }
        if ((v10 & 32) != 0) {
            xVar.H(2);
        }
        xVar.H(1);
        b(xVar);
        String e2 = n9.q.e(xVar.v());
        if (!MimeTypes.AUDIO_MPEG.equals(e2) && !MimeTypes.AUDIO_DTS.equals(e2) && !MimeTypes.AUDIO_DTS_HD.equals(e2)) {
            xVar.H(4);
            long w10 = xVar.w();
            long w11 = xVar.w();
            xVar.H(1);
            int b3 = b(xVar);
            byte[] bArr = new byte[b3];
            xVar.d(bArr, 0, b3);
            if (w11 > 0) {
                j3 = w11;
            } else {
                j3 = -1;
            }
            if (w10 > 0) {
                j10 = w10;
            } else {
                j10 = -1;
            }
            return new d(e2, bArr, j3, j10);
        }
        return new d(e2, null, -1L, -1L);
    }

    public static int b(x xVar) {
        int v10 = xVar.v();
        int i10 = v10 & 127;
        while ((v10 & 128) == 128) {
            v10 = xVar.v();
            i10 = (i10 << 7) | (v10 & 127);
        }
        return i10;
    }

    public static androidx.recyclerview.widget.c c(x xVar) {
        long j3;
        xVar.G(8);
        if (((xVar.f() >> 24) & 255) == 0) {
            j3 = xVar.w();
            xVar.H(4);
        } else {
            long o10 = xVar.o();
            xVar.H(8);
            j3 = o10;
        }
        return new androidx.recyclerview.widget.c(new l8.b(new v7.a((j3 - 2082844800) * 1000)), xVar.w(), 4);
    }

    public static Pair d(int i10, int i11, x xVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        Integer num;
        r rVar;
        Pair create;
        int i12;
        int i13;
        boolean z13;
        byte[] bArr;
        int i14 = xVar.f22599b;
        while (i14 - i10 < i11) {
            xVar.G(i14);
            int f10 = xVar.f();
            boolean z14 = true;
            if (f10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            com.bumptech.glide.d.e("childAtomSize must be positive", z10);
            if (xVar.f() == 1936289382) {
                int i15 = i14 + 8;
                int i16 = 0;
                int i17 = -1;
                String str = null;
                Integer num2 = null;
                while (i15 - i14 < f10) {
                    xVar.G(i15);
                    int f11 = xVar.f();
                    int f12 = xVar.f();
                    if (f12 == 1718775137) {
                        num2 = Integer.valueOf(xVar.f());
                    } else if (f12 == 1935894637) {
                        xVar.H(4);
                        str = xVar.s(4);
                    } else if (f12 == 1935894633) {
                        i17 = i15;
                        i16 = f11;
                    }
                    i15 += f11;
                }
                if (!C.CENC_TYPE_cenc.equals(str) && !C.CENC_TYPE_cbc1.equals(str) && !C.CENC_TYPE_cens.equals(str) && !C.CENC_TYPE_cbcs.equals(str)) {
                    create = null;
                } else {
                    if (num2 != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    com.bumptech.glide.d.e("frma atom is mandatory", z11);
                    if (i17 != -1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    com.bumptech.glide.d.e("schi atom is mandatory", z12);
                    int i18 = i17 + 8;
                    while (true) {
                        if (i18 - i17 < i16) {
                            xVar.G(i18);
                            int f13 = xVar.f();
                            if (xVar.f() == 1952804451) {
                                int f14 = (xVar.f() >> 24) & 255;
                                xVar.H(1);
                                if (f14 == 0) {
                                    xVar.H(1);
                                    i12 = 0;
                                    i13 = 0;
                                } else {
                                    int v10 = xVar.v();
                                    int i19 = (v10 & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                                    i12 = v10 & 15;
                                    i13 = i19;
                                }
                                if (xVar.v() == 1) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                int v11 = xVar.v();
                                byte[] bArr2 = new byte[16];
                                xVar.d(bArr2, 0, 16);
                                if (z13 && v11 == 0) {
                                    int v12 = xVar.v();
                                    byte[] bArr3 = new byte[v12];
                                    xVar.d(bArr3, 0, v12);
                                    bArr = bArr3;
                                } else {
                                    bArr = null;
                                }
                                num = num2;
                                rVar = new r(z13, str, v11, bArr2, i13, i12, bArr);
                            } else {
                                i18 += f13;
                            }
                        } else {
                            num = num2;
                            rVar = null;
                            break;
                        }
                    }
                    if (rVar == null) {
                        z14 = false;
                    }
                    com.bumptech.glide.d.e("tenc atom is mandatory", z14);
                    int i20 = h0.a;
                    create = Pair.create(num, rVar);
                }
                if (create != null) {
                    return create;
                }
            }
            i14 += f10;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x06f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.activity.result.i e(n9.x r42, int r43, int r44, java.lang.String r45, x7.l r46, boolean r47) {
        /*
            Method dump skipped, instructions count: 2886
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.g.e(n9.x, int, int, java.lang.String, x7.l, boolean):androidx.activity.result.i");
    }

    /* JADX WARN: Code restructure failed: missing block: B:357:0x00e5, code lost:
    
        if (r7 == 0) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x077a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0788  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x078d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x079d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0791  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0785  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x077e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x05ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList f(g8.a r45, y7.t r46, long r47, x7.l r49, boolean r50, boolean r51, ra.g r52) {
        /*
            Method dump skipped, instructions count: 2146
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.g.f(g8.a, y7.t, long, x7.l, boolean, boolean, ra.g):java.util.ArrayList");
    }
}

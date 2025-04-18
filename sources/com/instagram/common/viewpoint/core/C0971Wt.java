package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0971Wt implements InterfaceC0570Gz {
    public static byte[] A07;
    public static String[] A08 = {"IyNPMRe3Wq3129mSM2JJi0NNMuNXY8W9", "C94SuBGu", "p8v8XXVPXz4O90kPZAm39VV3npkMPwoF", "0JhHJN6IXOb6Rl6r4FoMpOTStQ2rHZcY", "4KvwhmNBIb78DyW3SVt3pB4MzWrcxbsc", "bfcMZdwzM", "6zjZIoJfL0coyOt5OBcRR6INW9DxFi9j", "1ahrRgqwtfgXyv4XYnMKvvM4rwUartmI"};
    public long A00;
    public AssetFileDescriptor A01;
    public Uri A02;
    public InputStream A03;
    public boolean A04;
    public final Resources A05;
    public final HL<? super C0971Wt> A06;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 100);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{9, 28, 42, 38, 44, 41, 26, 28, -41, 32, 27, 28, 37, 43, 32, 29, 32, 28, 41, -41, 36, 44, 42, 43, -41, 25, 28, -41, 24, 37, -41, 32, 37, 43, 28, 30, 28, 41, -27, 24, 21, 12, -29, 48, 56, 54, 55, -29, 56, 54, 40, -29, 54, 38, 43, 40, 48, 40, -29, 53, 36, 58, 53, 40, 54, 50, 56, 53, 38, 40, -13, -30, -8, -13, -26, -12, -16, -10, -13, -28, -26};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.instagram.common.viewpoint.core.InterfaceC0570Gz
    public final long AEE(H3 h3) throws HK {
        try {
            this.A02 = h3.A04;
            if (!TextUtils.equals(A00(70, 11, 29), this.A02.getScheme())) {
                throw new HK(A00(39, 31, 95));
            }
            try {
                this.A01 = this.A05.openRawResourceFd(Integer.parseInt(this.A02.getLastPathSegment()));
                this.A03 = new FileInputStream(this.A01.getFileDescriptor());
                this.A03.skip(this.A01.getStartOffset());
                if (this.A03.skip(h3.A03) < h3.A03) {
                    throw new EOFException();
                }
                long j2 = h3.A02;
                if (A08[7].charAt(18) != 'M') {
                    throw new RuntimeException();
                }
                A08[2] = "NeR0SJjHXwq6S99lykBHPSy65ApZKYsP";
                if (j2 != -1) {
                    this.A00 = h3.A02;
                } else {
                    long length = this.A01.getLength();
                    this.A00 = length != -1 ? length - h3.A03 : -1L;
                }
                this.A04 = true;
                if (this.A06 != null) {
                    this.A06.ADs(this, h3);
                }
                long j3 = this.A00;
                if (A08[5].length() != 9) {
                    A08[5] = "brCRBkm5E";
                    return j3;
                }
                A08[1] = "jAn2ZAPLqPp6gMTdEbZr";
                return j3;
            } catch (NumberFormatException unused) {
                throw new HK(A00(0, 39, 83));
            }
        } catch (IOException e) {
            throw new HK(e);
        }
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HL != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.RawResourceDataSource> */
    public C0971Wt(Context context, HL<? super C0971Wt> hl) {
        this.A05 = context.getResources();
        this.A06 = hl;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0570Gz
    public final Uri A8c() {
        return this.A02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x006c, code lost:
    
        if (r3 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006e, code lost:
    
        r5.A06.ADr(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007b, code lost:
    
        if (r3 != null) goto L30;
     */
    @Override // com.instagram.common.viewpoint.core.InterfaceC0570Gz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() throws com.instagram.common.viewpoint.core.HK {
        /*
            r5 = this;
            r3 = 0
            r5.A02 = r3
            r2 = 0
            java.io.InputStream r0 = r5.A03     // Catch: java.io.IOException -> L7e java.lang.Throwable -> L85
            if (r0 == 0) goto Ld
            java.io.InputStream r0 = r5.A03     // Catch: java.io.IOException -> L7e java.lang.Throwable -> L85
            r0.close()     // Catch: java.io.IOException -> L7e java.lang.Throwable -> L85
        Ld:
            r5.A03 = r3
            android.content.res.AssetFileDescriptor r0 = r5.A01     // Catch: java.io.IOException -> L44 java.lang.Throwable -> L4b
            if (r0 == 0) goto L18
            android.content.res.AssetFileDescriptor r0 = r5.A01     // Catch: java.io.IOException -> L44 java.lang.Throwable -> L4b
            r0.close()     // Catch: java.io.IOException -> L44 java.lang.Throwable -> L4b
        L18:
            r5.A01 = r3
            boolean r0 = r5.A04
            if (r0 == 0) goto L43
            r5.A04 = r2
            com.facebook.ads.redexgen.X.HL<? super com.facebook.ads.redexgen.X.Wt> r0 = r5.A06
            if (r0 == 0) goto L43
            com.facebook.ads.redexgen.X.HL<? super com.facebook.ads.redexgen.X.Wt> r3 = r5.A06
            java.lang.String[] r1 = com.instagram.common.viewpoint.core.C0971Wt.A08
            r0 = 5
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 9
            if (r1 == r0) goto L39
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L39:
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C0971Wt.A08
            java.lang.String r1 = "2MhjdMt8WeGViEW378NV"
            r0 = 1
            r2[r0] = r1
            r3.ADr(r5)
        L43:
            return
        L44:
            r1 = move-exception
            com.facebook.ads.redexgen.X.HK r0 = new com.facebook.ads.redexgen.X.HK     // Catch: java.lang.Throwable -> L4b
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L4b
            throw r0     // Catch: java.lang.Throwable -> L4b
        L4b:
            r4 = move-exception
            r5.A01 = r3
            boolean r0 = r5.A04
            if (r0 == 0) goto L73
            r5.A04 = r2
            com.facebook.ads.redexgen.X.HL<? super com.facebook.ads.redexgen.X.Wt> r3 = r5.A06
            java.lang.String[] r1 = com.instagram.common.viewpoint.core.C0971Wt.A08
            r0 = 2
            r1 = r1[r0]
            r0 = 8
            char r1 = r1.charAt(r0)
            r0 = 88
            if (r1 == r0) goto L74
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C0971Wt.A08
            java.lang.String r1 = "yK4Di7JH64WA9zfY0TMBJ08urnBzTPx7"
            r0 = 7
            r2[r0] = r1
            if (r3 == 0) goto L73
        L6e:
            com.facebook.ads.redexgen.X.HL<? super com.facebook.ads.redexgen.X.Wt> r0 = r5.A06
            r0.ADr(r5)
        L73:
            throw r4
        L74:
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C0971Wt.A08
            java.lang.String r1 = "m1exV2er9"
            r0 = 5
            r2[r0] = r1
            if (r3 == 0) goto L73
            goto L6e
        L7e:
            r1 = move-exception
            com.facebook.ads.redexgen.X.HK r0 = new com.facebook.ads.redexgen.X.HK     // Catch: java.lang.Throwable -> L85
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L85
            throw r0     // Catch: java.lang.Throwable -> L85
        L85:
            r1 = move-exception
            r5.A03 = r3
            android.content.res.AssetFileDescriptor r0 = r5.A01     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Laa
            if (r0 == 0) goto L91
            android.content.res.AssetFileDescriptor r0 = r5.A01     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Laa
            r0.close()     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Laa
        L91:
            r5.A01 = r3
            boolean r0 = r5.A04
            if (r0 == 0) goto La2
            r5.A04 = r2
            com.facebook.ads.redexgen.X.HL<? super com.facebook.ads.redexgen.X.Wt> r0 = r5.A06
            if (r0 == 0) goto La2
            com.facebook.ads.redexgen.X.HL<? super com.facebook.ads.redexgen.X.Wt> r0 = r5.A06
            r0.ADr(r5)
        La2:
            throw r1
        La3:
            r1 = move-exception
            com.facebook.ads.redexgen.X.HK r0 = new com.facebook.ads.redexgen.X.HK     // Catch: java.lang.Throwable -> Laa
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Laa
            throw r0     // Catch: java.lang.Throwable -> Laa
        Laa:
            r1 = move-exception
            r5.A01 = r3
            boolean r0 = r5.A04
            if (r0 == 0) goto Lbc
            r5.A04 = r2
            com.facebook.ads.redexgen.X.HL<? super com.facebook.ads.redexgen.X.Wt> r0 = r5.A06
            if (r0 == 0) goto Lbc
            com.facebook.ads.redexgen.X.HL<? super com.facebook.ads.redexgen.X.Wt> r0 = r5.A06
            r0.ADr(r5)
        Lbc:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C0971Wt.close():void");
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0570Gz
    public final int read(byte[] bArr, int i2, int i3) throws HK {
        if (i3 == 0) {
            String[] strArr = A08;
            if (strArr[4].charAt(20) != strArr[3].charAt(20)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[0] = "YO0PXEoDNxNkeyj6J5zVBwlvhUUksa7C";
            strArr2[6] = "J54PJiBLJytnlOojbjnozVdd3pHXhFgw";
            return 0;
        }
        if (this.A00 == 0) {
            return -1;
        }
        try {
            if (this.A00 != -1) {
                i3 = (int) Math.min(this.A00, i3);
            }
            int read = this.A03.read(bArr, i2, i3);
            if (read == -1) {
                if (this.A00 == -1) {
                    return -1;
                }
                throw new HK(new EOFException());
            }
            if (this.A00 != -1) {
                this.A00 -= read;
            }
            if (this.A06 != null) {
                this.A06.ABS(this, read);
            }
            return read;
        } catch (IOException e) {
            throw new HK(e);
        }
    }
}

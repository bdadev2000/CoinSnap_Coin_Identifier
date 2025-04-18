package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.content.pm.PackageManager;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto;
import java.nio.ByteBuffer;
import java.util.Arrays;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.3G */
/* loaded from: assets/audience_network.dex */
public final class C3G extends AbstractC03286m implements InterfaceC0592Hv {
    public static byte[] A0E;
    public static String[] A0F = {"L3tWfB", "F", "EhmjBoqWglyFdQALN75wPmPOVrs4sx1V", "uULe", "m", "RQeZ6095wSpXx7VlLYK0RIZgP3RCEpJD", "T11R5eeuDEJdKCYsxGC1ZLgakYf", "g49TrngkoNyO86UN189kQplFANk"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public MediaFormat A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final Context A0B;
    public final C0421An A0C;
    public final InterfaceC0427At A0D;

    public static String A04(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 65);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A0E = new byte[]{47, 45, 56, 78, 51, 37, 35, 78, 1, 1, 3, 78, 4, 5, 3, 55, 53, 32, 86, 31, 23, 23, 31, 20, 29, 86, 10, 25, 15, 86, 28, 29, 27, 23, 28, 29, 10, 53, 58, 48, 38, 59, 61, 48, 122, 39, 59, 50, 32, 35, 53, 38, 49, 122, 56, 49, 53, 58, 54, 53, 55, Utf8.REPLACEMENT_BYTE, 117, 97, 112, 125, 123, 59, 102, 117, 99, 13, 6, 15, 0, 0, 11, 2, 67, 13, 1, 27, 0, 26, 14, 3, 20, 9, 10, 18, 3, 102, 107, 124, 97, Byte.MAX_VALUE, 98, 122, 107, 84, 88, 65, 20, 80, 87, 73, 76, 77, 20, 74, 80, 67, 92, 5, 1, 5, 13, 51, 49, 42, 44, 49, 42, 55, 58, 36, 54, 58, 39, 59, 50, 122, 37, 54, 35, 50, 30, 12, 0, 30, 24, 3, 10, 98, 125, 106, 119, 126, 116, 108, 125};
    }

    static {
        A06();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    public C3G(Context context, DR dr, InterfaceC0439Bh<FrameworkMediaCrypto> interfaceC0439Bh, boolean z2, Handler handler, InterfaceC0422Ao interfaceC0422Ao, AZ az, InterfaceC0414Ag... interfaceC0414AgArr) {
        this(context, dr, interfaceC0439Bh, z2, handler, interfaceC0422Ao, new Z3(az, interfaceC0414AgArr));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    public C3G(Context context, DR dr, InterfaceC0439Bh<FrameworkMediaCrypto> interfaceC0439Bh, boolean z2, Handler handler, InterfaceC0422Ao interfaceC0422Ao, InterfaceC0427At interfaceC0427At) {
        super(1, dr, interfaceC0439Bh, z2);
        this.A0B = context.getApplicationContext();
        this.A0D = interfaceC0427At;
        this.A0C = new C0421An(handler, interfaceC0422Ao);
        interfaceC0427At.AGU(new Z1(this));
    }

    private int A00(DL dl, Format format) {
        PackageManager packageManager;
        if (IK.A02 < 24 && A04(15, 22, 57).equals(dl.A02)) {
            boolean z2 = true;
            if (IK.A02 == 23 && (packageManager = this.A0B.getPackageManager()) != null) {
                boolean needsRawDecoderWorkaround = packageManager.hasSystemFeature(A04(37, 25, 21));
                if (needsRawDecoderWorkaround) {
                    z2 = false;
                }
            }
            if (z2) {
                return -1;
            }
        }
        int i2 = format.A09;
        if (A0F[4].length() == 17) {
            throw new RuntimeException();
        }
        A0F[2] = "fXqyV5kw6OT7Wtv8kj4AmKP3XzDFjN9J";
        return i2;
    }

    private final int A01(DL dl, Format format, Format[] formatArr) {
        int maxInputSize = A00(dl, format);
        return maxInputSize;
    }

    private final MediaFormat A02(Format format, String str, int i2) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(A04(Opcodes.LREM, 4, 41), str);
        mediaFormat.setInteger(A04(71, 13, 47), format.A05);
        mediaFormat.setInteger(A04(Opcodes.LUSHR, 11, 22), format.A0C);
        DX.A06(mediaFormat, format.A0P);
        DX.A04(mediaFormat, A04(99, 14, 120), i2);
        if (IK.A02 >= 23) {
            mediaFormat.setInteger(A04(Opcodes.LNEG, 8, 2), 0);
        }
        return mediaFormat;
    }

    private void A05() {
        long A72 = this.A0D.A72(A9Q());
        if (A72 != Long.MIN_VALUE) {
            if (!this.A08) {
                long newCurrentPositionUs = this.A05;
                A72 = Math.max(newCurrentPositionUs, A72);
            }
            this.A05 = A72;
            this.A08 = false;
        }
    }

    public static boolean A08(String str) {
        if (IK.A02 < 24 && A04(0, 15, 33).equals(str)) {
            if (A04(Opcodes.L2I, 7, 44).equals(IK.A05) && (IK.A03.startsWith(A04(Opcodes.D2L, 8, 89)) || IK.A03.startsWith(A04(84, 7, 39)) || IK.A03.startsWith(A04(91, 8, 79)))) {
                return true;
            }
        }
        return false;
    }

    private final boolean A09(String str) {
        int A00 = AbstractC0594Hx.A00(str);
        return A00 != 0 && this.A0D.A9P(A00);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC03286m, com.instagram.common.viewpoint.core.AbstractC0512Ee
    public final void A13() {
        super.A13();
        this.A0D.AEV();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC03286m, com.instagram.common.viewpoint.core.AbstractC0512Ee
    public final void A14() {
        A05();
        this.A0D.pause();
        super.A14();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC03286m, com.instagram.common.viewpoint.core.AbstractC0512Ee
    public final void A15() {
        try {
            this.A0D.AEy();
            try {
                super.A15();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.A15();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC03286m, com.instagram.common.viewpoint.core.AbstractC0512Ee
    public final void A16(long j2, boolean z2) throws C03909h {
        super.A16(j2, z2);
        this.A0D.reset();
        this.A05 = j2;
        this.A07 = true;
        this.A08 = true;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC03286m, com.instagram.common.viewpoint.core.AbstractC0512Ee
    public final void A17(boolean z2) throws C03909h {
        super.A17(z2);
        this.A0C.A05(this.A0U);
        int i2 = A12().A00;
        if (i2 != 0) {
            this.A0D.A5s(i2);
        } else {
            this.A0D.A5V();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC03286m
    public final int A1B(MediaCodec mediaCodec, DL dl, Format format, Format format2) {
        return 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    @Override // com.instagram.common.viewpoint.core.AbstractC03286m
    public final int A1C(DR dr, InterfaceC0439Bh<FrameworkMediaCrypto> interfaceC0439Bh, Format format) throws DU {
        String str = format.A0O;
        boolean z2 = false;
        if (!AbstractC0594Hx.A09(str)) {
            return 0;
        }
        int i2 = IK.A02 >= 21 ? 32 : 0;
        boolean A0y = AbstractC0512Ee.A0y(interfaceC0439Bh, format.A0H);
        int i3 = 4;
        if (A0y && A09(str) && dr.A80() != null) {
            return i2 | 8 | 4;
        }
        String mimeType = A04(62, 9, 85);
        if ((mimeType.equals(str) && !this.A0D.A9P(format.A0A)) || !this.A0D.A9P(2)) {
            return 1;
        }
        boolean supportsFormatDrm = false;
        DrmInitData drmInitData = format.A0H;
        if (drmInitData != null) {
            for (int tunnelingSupport = 0; tunnelingSupport < drmInitData.A01; tunnelingSupport++) {
                supportsFormatDrm |= drmInitData.A01(tunnelingSupport).A03;
            }
        }
        DL A7A = dr.A7A(str, supportsFormatDrm);
        if (A7A == null) {
            return (!supportsFormatDrm || dr.A7A(str, false) == null) ? 1 : 2;
        }
        if (!A0y) {
            return 2;
        }
        if (IK.A02 < 21 || ((format.A0C == -1 || A7A.A0G(format.A0C)) && (format.A05 == -1 || A7A.A0F(format.A05)))) {
            z2 = true;
        }
        if (!z2) {
            i3 = 3;
        }
        return i2 | 8 | i3;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC03286m
    public final DL A1F(DR dr, Format format, boolean z2) throws DU {
        if (A09(format.A0O)) {
            DL A80 = dr.A80();
            if (A0F[4].length() == 17) {
                throw new RuntimeException();
            }
            A0F[5] = "METof3tp25mzHZV7OR2UQ1qqc32h0eLf";
            if (A80 != null) {
                return A80;
            }
        }
        DL passthroughDecoderInfo = super.A1F(dr, format, z2);
        return passthroughDecoderInfo;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC03286m
    public final void A1I() throws C03909h {
        try {
            this.A0D.AEW();
        } catch (C0426As e) {
            throw C03909h.A01(e, A0z());
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:12:0x0047 */
    @Override // com.instagram.common.viewpoint.core.AbstractC03286m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A1L(android.media.MediaCodec r11, android.media.MediaFormat r12) throws com.instagram.common.viewpoint.core.C03909h {
        /*
            r10 = this;
            android.media.MediaFormat r0 = r10.A06
            if (r0 == 0) goto L4e
            android.media.MediaFormat r3 = r10.A06
            r2 = 113(0x71, float:1.58E-43)
            r1 = 4
            r0 = 41
            java.lang.String r0 = A04(r2, r1, r0)
            java.lang.String r0 = r3.getString(r0)
            int r3 = com.instagram.common.viewpoint.core.AbstractC0594Hx.A00(r0)
            android.media.MediaFormat r12 = r10.A06
        L19:
            r2 = 71
            r1 = 13
            r0 = 47
            java.lang.String r0 = A04(r2, r1, r0)
            int r4 = r12.getInteger(r0)
            r2 = 125(0x7d, float:1.75E-43)
            r1 = 11
            r0 = 22
            java.lang.String r0 = A04(r2, r1, r0)
            int r5 = r12.getInteger(r0)
            boolean r0 = r10.A09
            if (r0 == 0) goto L51
            r1 = 6
            if (r4 != r1) goto L51
            int r0 = r10.A00
            if (r0 >= r1) goto L51
            int r0 = r10.A00
            int[] r7 = new int[r0]
            r1 = 0
        L45:
            int r0 = r10.A00
            if (r1 >= r0) goto L52
            r7[r1] = r1
            int r1 = r1 + 1
            goto L45
        L4e:
            int r3 = r10.A04
            goto L19
        L51:
            r7 = 0
        L52:
            com.facebook.ads.redexgen.X.At r2 = r10.A0D     // Catch: com.instagram.common.viewpoint.core.C0423Ap -> L5d
            int r8 = r10.A02     // Catch: com.instagram.common.viewpoint.core.C0423Ap -> L5d
            int r9 = r10.A03     // Catch: com.instagram.common.viewpoint.core.C0423Ap -> L5d
            r6 = 0
            r2.A4l(r3, r4, r5, r6, r7, r8, r9)     // Catch: com.instagram.common.viewpoint.core.C0423Ap -> L5d
            return
        L5d:
            r1 = move-exception
            int r0 = r10.A0z()
            com.facebook.ads.redexgen.X.9h r0 = com.instagram.common.viewpoint.core.C03909h.A01(r1, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C3G.A1L(android.media.MediaCodec, android.media.MediaFormat):void");
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC03286m
    public final void A1M(Format format) throws C03909h {
        int i2;
        super.A1M(format);
        this.A0C.A03(format);
        if (A04(62, 9, 85).equals(format.A0O)) {
            i2 = format.A0A;
        } else {
            i2 = 2;
        }
        this.A04 = i2;
        this.A00 = format.A05;
        this.A02 = format.A06;
        this.A03 = format.A07;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC03286m
    public final void A1N(C1023Yw c1023Yw) {
        if (!this.A07 || c1023Yw.A03()) {
            return;
        }
        if (Math.abs(c1023Yw.A00 - this.A05) > 500000) {
            this.A05 = c1023Yw.A00;
        }
        if (A0F[2].charAt(22) != 'P') {
            throw new RuntimeException();
        }
        String[] strArr = A0F;
        strArr[6] = "FWwhG0BBvDuToIoVEugJsm3ERbG";
        strArr[7] = "3ppC0HmXHA3R3HDH3tVsAea2i0b";
        this.A07 = false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC03286m
    public final void A1O(DL dl, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) {
        this.A01 = A01(dl, format, A1A());
        this.A09 = A08(dl.A02);
        this.A0A = dl.A04;
        MediaFormat A02 = A02(format, dl.A01 == null ? A04(62, 9, 85) : dl.A01, this.A01);
        mediaCodec.configure(A02, (Surface) null, mediaCrypto, 0);
        if (this.A0A) {
            this.A06 = A02;
            MediaFormat mediaFormat = this.A06;
            String A04 = A04(Opcodes.LREM, 4, 41);
            String codecMimeType = format.A0O;
            mediaFormat.setString(A04, codecMimeType);
            return;
        }
        this.A06 = null;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC03286m
    public final void A1P(String str, long j2, long j3) {
        this.A0C.A06(str, j2, j3);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC03286m
    public final boolean A1Q(long j2, long j3, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i2, int i3, long j4, boolean z2) throws C03909h {
        if (this.A0A && (i3 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i2, false);
            return true;
        }
        if (z2) {
            mediaCodec.releaseOutputBuffer(i2, false);
            this.A0U.A08++;
            this.A0D.A8s();
            return true;
        }
        try {
            if (!this.A0D.A8p(byteBuffer, j4)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i2, false);
            this.A0U.A06++;
            return true;
        } catch (C0424Aq | C0426As e) {
            throw C03909h.A01(e, A0z());
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0512Ee, com.instagram.common.viewpoint.core.ZA
    public final InterfaceC0592Hv A7l() {
        return this;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0592Hv
    public final A2 A85() {
        return this.A0D.A85();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0592Hv
    public final long A88() {
        if (A8P() == 2) {
            A05();
        }
        return this.A05;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0512Ee, com.instagram.common.viewpoint.core.AC
    public final void A8t(int i2, Object obj) throws C03909h {
        switch (i2) {
            case 2:
                this.A0D.setVolume(((Float) obj).floatValue());
                return;
            case 3:
                this.A0D.AGI((AY) obj);
                return;
            default:
                super.A8t(i2, obj);
                return;
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC03286m, com.instagram.common.viewpoint.core.ZA
    public final boolean A9Q() {
        return super.A9Q() && this.A0D.A9Q();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC03286m, com.instagram.common.viewpoint.core.ZA
    public final boolean A9b() {
        if (!this.A0D.A8y()) {
            boolean A9b = super.A9b();
            if (A0F[2].charAt(22) != 'P') {
                throw new RuntimeException();
            }
            A0F[4] = "YoWTwZwJQMw1hShhdJ";
            if (!A9b) {
                return false;
            }
        }
        return true;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0592Hv
    public final A2 AGa(A2 a2) {
        return this.A0D.AGa(a2);
    }
}

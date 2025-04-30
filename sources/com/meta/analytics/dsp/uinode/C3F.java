package com.meta.analytics.dsp.uinode;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import androidx.core.view.MotionEventCompat;
import com.applovin.exoplayer2.common.base.Ascii;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto;
import com.facebook.ads.internal.exoplayer2.thirdparty.video.DummySurface;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.3F, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C3F extends AbstractC09476j {
    public static boolean A0b;
    public static boolean A0c;
    public static byte[] A0d;
    public static String[] A0e = {"1acRM6Cf6EhxOJODmj0H0eP8VC35ZmTt", "cV9GjlkLQwwiHa", "i1c6IC1hwgIn8DthxqNi0XpoGO8BN4qE", "gFn4mUSFpSKHUauCdH5nTsZh8y8bn5UZ", "9nkQNk0PAkkX03QPU4alH8fTsKo9h28D", "s2uNxYIY6duU338ylAtcR72UhbPyFCsP", "VOm8bC2ft6X0ZlQ", "HWs0n0OHt4vGmZ"};
    public static final int[] A0f;
    public IQ A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public long A0M;
    public Surface A0N;
    public Surface A0O;
    public IP A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public final int A0T;
    public final long A0U;
    public final Context A0V;
    public final IT A0W;
    public final C1220Ic A0X;
    public final boolean A0Y;
    public final long[] A0Z;
    public final long[] A0a;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static Point A02(DG dg, Format format) throws DP {
        boolean z8 = format.A08 > format.A0F;
        int i9 = z8 ? format.A08 : format.A0F;
        int i10 = z8 ? format.A0F : format.A08;
        float f9 = i10 / i9;
        for (int i11 : A0f) {
            int i12 = (int) (i11 * f9);
            if (i11 <= i9 || i12 <= i10) {
                return null;
            }
            if (IF.A02 >= 21) {
                int i13 = z8 ? i12 : i11;
                if (!z8) {
                    i11 = i12;
                }
                Point A0E = dg.A0E(i13, i11);
                if (dg.A0H(A0E.x, A0E.y, format.A01)) {
                    return A0E;
                }
            } else {
                int A04 = IF.A04(i11, 16) * 16;
                int A042 = IF.A04(i12, 16) * 16;
                if (A04 * A042 <= DR.A00()) {
                    int i14 = z8 ? A042 : A04;
                    if (!z8) {
                        A04 = A042;
                    }
                    return new Point(i14, A04);
                }
            }
        }
        return null;
    }

    public static String A05(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A0d, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 89);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A0d = new byte[]{10, Ascii.CR, Ascii.VT, 10, 93, 91, 93, 95, 112, 118, 112, 117, 6, 118, 119, 106, 112, 119, 1, 108, Ascii.FS, Ascii.ESC, Ascii.GS, Ascii.FS, 126, Ascii.CR, Ascii.SI, Ascii.SO, 9, 94, Ascii.VT, Ascii.SI, 76, 58, 61, 61, 61, 32, 108, 49, 71, 64, 64, 64, 0, Ascii.FS, 5, 3, 64, 54, 49, 48, 49, 96, 53, 57, 64, 54, 49, 51, 49, 96, 53, 57, 81, 86, 68, 81, 82, 85, 71, 93, 88, 95, 77, 74, 74, 102, 106, 113, 100, 101, Ascii.CAN, 40, 44, 56, 9, 54, 46, 60, 43, Ascii.DC4, 80, 100, 99, 112, 78, 95, 126, 101, 116, 78, 35, 9, 7, 10, 8, 0, 102, 122, 19, 35, 51, 32, 55, 40, 32, 65, 85, 42, 65, 83, 81, 80, 84, 61, 45, 62, 41, 54, 62, 32, 62, 43, 41, 77, 51, 65, 55, 36, 76, 66, 67, 66, 43, 61, 68, 70, 103, 116, 108, Ascii.NAK, Ascii.DC2, Ascii.DC4, Ascii.GS, 85, 70, 79, 46, 37, 73, 95, 38, 38, 81, 125, 118, 119, 113, 50, Ascii.DEL, 115, 106, 50, 96, 119, 97, 125, 126, 103, 102, 123, 125, 124, 50, 115, 118, 120, 103, 97, 102, 119, 118, 50, 102, 125, 40, 50, 104, 68, 70, 66, 68, 120, Ascii.SUB, Ascii.SI, Ascii.DEL, 124, 126, 121, 122, 115, 106, 120, 126, 96, 126, Ascii.FF, 96, 111, 77, 80, 124, 117, 108, 126, 120, 102, 119, 86, 77, 92, 43, 34, 59, 41, 47, 49, 62, Ascii.FS, 7, 3, 44, 37, 60, 46, 40, 54, 59, 8, Ascii.DLE, 54, 49, 67, 112, 99, 116, 85, 114, 103, 116, 89, 85, Ascii.RS, 107, 105, 105, 105, 43, 94, 92, 92, 94, Ascii.VT, 126, 124, 124, 123, Ascii.DEL, 10, Ascii.VT, 8, 8, 64, 53, 52, 55, 53, 90, 47, 46, 45, 41, Ascii.RS, 107, 107, 105, 105, Ascii.EM, 62, 51, 44, 58, Ascii.FS, 55, 58, 60, 52, Ascii.DEL, 4, 51, 58, 56, 62, 60, 38, Ascii.EM, 45, 62, 50, 58, Ascii.FF, 54, 37, 58, 115, Ascii.DEL, 40, 38, 32, 33, 42, 42, 48, 40, 45, 35, 88, 92, 89, 95, 42, 36, 34, 35, 40, 40, 50, 62, 58, 58, 92, 91, 93, 84, 33, 47, 41, 40, 35, 35, 57, 53, 49, 49, 87, 80, 84, 81, Ascii.SYN, Ascii.CAN, Ascii.RS, Ascii.US, Ascii.DC4, Ascii.DC4, Ascii.SO, 2, 6, 6, 96, 103, 98, 96, 84, 90, 92, 93, 86, 86, 76, 68, 81, 95, 38, 36, 35, 43, Ascii.DEL, 113, 119, 118, 125, 125, 103, 111, 122, 116, Ascii.SI, Ascii.VT, Ascii.SO, Ascii.CR, 58, 52, 50, 51, 56, 56, 34, 42, 63, 49, 74, 72, 76, 68, Ascii.FF, 34, 4, 5, Ascii.SO, Ascii.SO, Ascii.DC4, 8, 9, 7, 124, 126, 122, 120, 75, 101, 67, 66, 73, 73, 83, 75, 78, 64, 59, 63, 61, 53, 44, 51, 38, 40, 42, 73, 44, 97, 126, 106, 104, 100, 4, 97, 9, Ascii.SYN, Ascii.ETB, Ascii.SI, Ascii.DC2, 108, 9, 119, 80, 88, 87, 80, 87, 70, 19, 102, Ascii.VT, 9, Ascii.FF, 0, Ascii.CR, Ascii.DLE, 72, 54, 51, 98, 55, 51, Ascii.SYN, Ascii.ESC, Ascii.SO, Ascii.DC2, 10, Ascii.DC4, 4, Ascii.ESC, 101, 125, 120, 121, Ascii.DEL, 8, 112, 38, 62, 54, 58, 41, 38, 44, 62, 70, 76, 89, 55, 53, Ascii.GS, Ascii.FS, 17, Ascii.EM, 59, Ascii.ETB, Ascii.FS, Ascii.GS, Ascii.ESC, 46, 17, Ascii.FS, Ascii.GS, Ascii.ETB, 42, Ascii.GS, Ascii.SYN, Ascii.FS, Ascii.GS, 10, Ascii.GS, 10, 114, 106, 117, 120, 117, 125, Ascii.RS, 8, 101, 100, 97, Ascii.SUB, 115, 101, 8, 10, Ascii.SO, 119, 40, 42, 63, 73, 0, 8, 8, 0, Ascii.VT, 2, 44, Ascii.CR, 6, 51, Ascii.SI, Ascii.SYN, Ascii.DLE, 86, 55, 41, 79, 65, 72, 96, 8, 5, 50, 32, 80, 79, 84, 85, 82, 47, 35, 52, 61, 70, 65, 75, 42, 61, 52, 76, 75, 74, 55, 32, 41, 81, 86, 86, 69, 89, 80, 124, 126, 99, Ascii.ESC, Ascii.DEL, Ascii.DLE, 40, 33, 46, 52, 47, 45, 118, 88, 97, 112, 97, 60, 37, 63, 87, 59, 79, 45, Ascii.DC4, 5, Ascii.DC4, 72, 80, 76, 77, 34, 73, 58, 3, 97, 103, 98, 109, 8, Ascii.SO, 10, Ascii.FF, 52, 81, 87, 82, 120, Ascii.GS, Ascii.SUB, Ascii.CAN, Ascii.EM, 119, 19, 81, 77, 49, 54, 88, 69, 95, 85, Ascii.EM, Ascii.DLE, 121, 118, 65, 87, 75, 72, 81, 80, 77, 75, 74, 87, 4, 81, 74, 79, 74, 75, 83, 74, 10, 4, 103, 75, 64, 65, 71, 4, 73, 69, 92, 4, 86, 65, 87, 75, 72, 81, 80, 77, 75, 74, Ascii.RS, 4, Ascii.ESC, Ascii.RS, Ascii.CAN, 101, Ascii.FF, Ascii.FS, Ascii.RS, 121, 125, 68, 123, 118, 99, 114, 72, 71, 101, 120, 107, 125, Ascii.FF, Ascii.DC2, 8, Ascii.FF, Ascii.SI, 121, 1, Ascii.ETB, 102, 120, 98, 102, 101, Ascii.CR, 51, 37, 84, 74, 95, 82, 87, 33, 68, 82, 35, 61, 40, 37, 32, 93, Ascii.SI, 52, 52, 123, 54, 58, 53, 34, 123, 40, 47, 41, 62, 58, 54, 123, 56, 51, 58, 53, 60, 62, 40, 119, 123, 40, 52, 123, 63, 41, 52, 43, 43, 50, 53, 60, 123, 52, 61, 61, 40, 62, 47, 97, 123, 67, 36, 64, 36, 37, 81, 84, 55, 84, 44, 71, 43, 60, 63, Ascii.FF, 17, 102, Ascii.FF, Ascii.ESC, Ascii.ETB, 114, 117, 117, 112, 86, 61, 62, 83, 92, 94, 67, Ascii.SO, 108, 100, Ascii.EM, 93, 32, 91, 66, 86, 71, 74, 76, Ascii.SO, 80, 70, 80, 80, 74, 76, 77, Ascii.SO, 74, 71, 9, Ascii.GS, Ascii.FS, 7, 69, Ascii.SO, Ascii.SUB, Ascii.VT, Ascii.GS, Ascii.FF, 17, Ascii.SO, 83, Ascii.FS, 17, 10, 10, 17, 19, Ascii.VT, Ascii.SUB, 7, Ascii.CAN, 69, 4, Ascii.CR, Ascii.SO, Ascii.FS, 32, 49, 44, 51, 110, 49, 42, 36, 43, 55, 95, 78, 83, 76, 17, 72, 83, 76, 103, 114, 53, 58, 47, 106, Ascii.RS, Ascii.US, Ascii.CAN, 96, 118, 107, 116, 82, 109, 96, 97, 107, 70, 113, 98, 98, 97, 118, 107, 97, 98, 10, 3, Ascii.US, Ascii.CAN, 9, Ascii.RS, 45, 57, 42, 38, 46, 102, 57, 42, 63, 46, 126, 107, 112, Ascii.DEL, Ascii.DEL, 112, 119, 43, 38, 42, 36, 43, 55, 54, 42, 61, 1, 59, 107, 104, 51, 50, 1, 58, 42, 43, 50, 59, 36, Ascii.DC2, Ascii.US, Ascii.SYN, 126, Ascii.ESC, 120, 115, 
        112, 125, 125, 41, 38, 34, 36, 78, 40, 41, 33, 39, 84, 79, 84, 78, Ascii.VT, Ascii.CR, Ascii.CR, Ascii.DLE, 1, 8, 59, 55, 80, 85, 64, Ascii.CAN, 82, 70, 94, 79, 67, 68, 89, 111, 102, 92, 123, 53, 55, 59, 52, 52, 51, 52, 61, 123, 119, 100, Ascii.DEL, 120, 121, 73, 112, 57, 53, 44, 121, 60, 49, 61, 51, 60, 32, 19, Ascii.US, 6, 83, Ascii.ETB, Ascii.DLE, Ascii.SO, Ascii.VT, 10, 83, Ascii.CR, Ascii.ETB, 4, Ascii.ESC, 45, 33, 56, 109, 55, 41, 36, 52, 40, 54, 51, 109, 105, 100, 111, 76, 72, 76, 68, 96, 111, 99, 111, 122, 102, Ascii.DC2, Ascii.NAK, Ascii.US, Ascii.ETB, Ascii.DLE, Ascii.GS, 9, Ascii.SI, 35, Ascii.SUB, 79, Ascii.CR, Ascii.SO, Ascii.CR, 56, 41, 38, 45, 36, 36, Ascii.ETB, 44, 50, 35, 44, 39, 46, 46, Ascii.GS, 38, 46, 90, 75, 68, 79, 70, 70, 117, 78, 89, 112, 97, 110, 101, 108, 108, 95, 100, 116, 83, 81, 74, 76, 81, 74, 87, 90, 70, 81, 88, 81, 85, 71, 81, 123, 65, 64, 68, 65, 64, 118, 65, 82, 82, 81, 70, Ascii.ESC, 6, Ascii.GS, 8, Ascii.GS, 0, 6, 7, 68, Ascii.CR, Ascii.FF, Ascii.SO, Ascii.ESC, Ascii.FF, Ascii.FF, Ascii.SUB, 113, 59, 50, 55, 122, 50, 51, 58, 65, 83, 92, 70, 93, 92, 91, 110, 118, 116, 109, 75, 116, 121, 120, 114, 95, 104, 123, 123, 120, 111, 71, 82, 90, 87, 92, 108, 65, 92, 68, 74, 93, 82, 97, 91, 75, Ascii.FF, Ascii.CR, Ascii.SYN, Ascii.SYN, Ascii.GS, Ascii.DC4, Ascii.GS, Ascii.FS, 85, 8, Ascii.DC4, Ascii.EM, 1, Ascii.SUB, Ascii.EM, Ascii.ESC, 19, Ascii.GS, Ascii.SO, Ascii.EM, 5, Ascii.SO, Ascii.SO, 52, 38, 94, 62, 33, 44, 45, 39, 103, 123, 47, 56, 56, 55, 40, 37, 36, 46, 110, 32, 55, 34, 0, Ascii.US, Ascii.DC2, 19, Ascii.EM, 89, Ascii.RS, 19, 0, Ascii.NAK, 38, 57, 52, 53, 63, Ascii.DEL, 61, 32, 100, 38, 125, 53, 35, 68, 91, 86, 87, 93, Ascii.GS, 74, Ascii.US, 68, 92, 86, Ascii.FS, 93, 92, 0, Ascii.FS, 68, 66, 10, 50, 45, 32, 33, 43, 107, 60, 105, 50, 42, 32, 106, 43, 42, 118, 106, 50, 52, 125, 97, 119, 98, 101, 121, 120, 110, 113, 96, 107, 124, 125, 61, 35, 46, 62, 34, Ascii.SI, Ascii.ETB, Ascii.ETB, Ascii.FS, Ascii.VT, 39, Ascii.RS, 115, 107, 107, 96, 119, 91, 98, 106, 67};
    }

    static {
        A0D();
        A0f = new int[]{1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bc != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    public C3F(Context context, DM dm, long j7, InterfaceC1058Bc<FrameworkMediaCrypto> interfaceC1058Bc, boolean z8, Handler handler, InterfaceC1221Id interfaceC1221Id, int i9) {
        super(2, dm, interfaceC1058Bc, z8);
        this.A0U = j7;
        this.A0T = i9;
        Context applicationContext = context.getApplicationContext();
        this.A0V = applicationContext;
        this.A0W = new IT(applicationContext);
        this.A0X = new C1220Ic(handler, interfaceC1221Id);
        this.A0Y = A0M();
        this.A0Z = new long[10];
        this.A0a = new long[10];
        this.A0M = C.TIME_UNSET;
        this.A0K = C.TIME_UNSET;
        this.A0J = C.TIME_UNSET;
        this.A08 = -1;
        this.A06 = -1;
        this.A01 = -1.0f;
        this.A02 = -1.0f;
        this.A0F = 1;
        A07();
    }

    public static int A00(DG dg, Format format) {
        if (format.A09 != -1) {
            int i9 = 0;
            int i10 = format.A0P.size();
            for (int initializationDataCount = 0; initializationDataCount < i10; initializationDataCount++) {
                int totalInitializationDataSize = format.A0P.get(initializationDataCount).length;
                i9 += totalInitializationDataSize;
            }
            int i11 = format.A09;
            int initializationDataCount2 = A0e[4].charAt(25);
            if (initializationDataCount2 == 101) {
                throw new RuntimeException();
            }
            A0e[5] = "PFjSJxahL7zuosjl0ltO07DmFDIUFrxC";
            return i11 + i9;
        }
        return A01(dg, format.A0O, format.A0F, format.A08);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ca, code lost:
    
        if (r5.A05 != false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A01(com.meta.analytics.dsp.uinode.DG r5, java.lang.String r6, int r7, int r8) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C3F.A01(com.facebook.ads.redexgen.X.DG, java.lang.String, int, int):int");
    }

    private final MediaFormat A03(Format format, IP ip, boolean z8, int i9) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(A05(1094, 4, 120), format.A0O);
        mediaFormat.setInteger(A05(1359, 5, 19), format.A0F);
        mediaFormat.setInteger(A05(971, 6, 26), format.A08);
        DS.A06(mediaFormat, format.A0P);
        DS.A03(mediaFormat, A05(954, 10, 18), format.A01);
        DS.A04(mediaFormat, A05(1180, 16, 48), format.A0B);
        DS.A02(mediaFormat, format.A0J);
        mediaFormat.setInteger(A05(1079, 9, 25), ip.A02);
        mediaFormat.setInteger(A05(1055, 10, 13), ip.A00);
        DS.A04(mediaFormat, A05(1065, 14, 39), ip.A01);
        if (IF.A02 >= 23) {
            mediaFormat.setInteger(A05(1153, 8, 122), 0);
        }
        if (z8) {
            String A05 = A05(875, 8, 49);
            if (A0e[5].charAt(18) != 't') {
                throw new RuntimeException();
            }
            A0e[5] = "LIFMuRLmQz6XdmDBeptCblAg9hMw0FnF";
            mediaFormat.setInteger(A05, 0);
        }
        if (i9 != 0) {
            A0K(mediaFormat, i9);
        }
        return mediaFormat;
    }

    private final IP A04(DG dg, Format format, Format[] formatArr) throws DP {
        int maxWidth;
        int i9 = format.A0F;
        int i10 = format.A08;
        int A00 = A00(dg, format);
        int maxHeight = formatArr.length;
        if (maxHeight == 1) {
            return new IP(i9, i10, A00);
        }
        int i11 = 0;
        for (Format format2 : formatArr) {
            if (A0V(dg.A03, format, format2)) {
                int maxWidth2 = format2.A0F;
                if (maxWidth2 != -1) {
                    int maxWidth3 = format2.A08;
                    if (maxWidth3 != -1) {
                        maxWidth = 0;
                        i11 |= maxWidth;
                        int maxWidth4 = format2.A0F;
                        i9 = Math.max(i9, maxWidth4);
                        int maxWidth5 = format2.A08;
                        i10 = Math.max(i10, maxWidth5);
                        int maxWidth6 = A00(dg, format2);
                        A00 = Math.max(A00, maxWidth6);
                    }
                }
                maxWidth = 1;
                i11 |= maxWidth;
                int maxWidth42 = format2.A0F;
                i9 = Math.max(i9, maxWidth42);
                int maxWidth52 = format2.A08;
                i10 = Math.max(i10, maxWidth52);
                int maxWidth62 = A00(dg, format2);
                A00 = Math.max(A00, maxWidth62);
            }
        }
        if (i11 != 0) {
            StringBuilder append = new StringBuilder().append(A05(683, 43, 125)).append(i9);
            String A05 = A05(1379, 1, 98);
            String sb = append.append(A05).append(i10).toString();
            String A052 = A05(522, 23, 33);
            Log.w(A052, sb);
            Point A02 = A02(dg, format);
            if (A02 != null) {
                int maxWidth7 = A02.x;
                i9 = Math.max(i9, maxWidth7);
                int maxWidth8 = A02.y;
                i10 = Math.max(i10, maxWidth8);
                int maxWidth9 = A01(dg, format.A0O, i9, i10);
                A00 = Math.max(A00, maxWidth9);
                Log.w(A052, A05(164, 34, 75) + i9 + A05 + i10);
            }
        }
        return new IP(i9, i10, A00);
    }

    private void A06() {
        MediaCodec A1D;
        this.A0R = false;
        if (IF.A02 >= 23 && this.A0S && (A1D = A1D()) != null) {
            this.A00 = new IQ(this, A1D);
        }
    }

    private void A07() {
        this.A0E = -1;
        this.A0C = -1;
        this.A03 = -1.0f;
        this.A0D = -1;
    }

    private void A08() {
        if (this.A09 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long now = this.A0H;
            long elapsedMs = elapsedRealtime - now;
            this.A0X.A02(this.A09, elapsedMs);
            this.A09 = 0;
            this.A0H = elapsedRealtime;
        }
    }

    private void A09() {
        int i9 = this.A08;
        if (i9 == -1 && this.A06 == -1) {
            return;
        }
        if (this.A0E != i9 || this.A0C != this.A06 || this.A0D != this.A07 || this.A03 != this.A01) {
            this.A0X.A01(i9, this.A06, this.A07, this.A01);
            this.A0E = this.A08;
            this.A0C = this.A06;
            this.A0D = this.A07;
            this.A03 = this.A01;
        }
    }

    private void A0A() {
        if (this.A0R) {
            this.A0X.A03(this.A0O);
        }
    }

    private void A0B() {
        int i9 = this.A0E;
        if (i9 == -1) {
            int i10 = this.A0C;
            String[] strArr = A0e;
            if (strArr[0].charAt(20) != strArr[2].charAt(20)) {
                throw new RuntimeException();
            }
            A0e[6] = "GSr0Qxmd2Qhu1M0N5tyB3p9H4Vler7W";
            if (i10 == -1) {
                return;
            }
        }
        this.A0X.A01(i9, this.A0C, this.A0D, this.A03);
    }

    private void A0C() {
        long j7;
        if (this.A0U > 0) {
            j7 = SystemClock.elapsedRealtime() + this.A0U;
        } else {
            j7 = C.TIME_UNSET;
        }
        this.A0J = j7;
    }

    private final void A0E(int i9) {
        super.A0U.A02 += i9;
        this.A09 += i9;
        this.A05 += i9;
        super.A0U.A05 = Math.max(this.A05, super.A0U.A05);
        if (this.A09 >= this.A0T) {
            A08();
        }
    }

    private final void A0F(MediaCodec mediaCodec, int i9, long j7) {
        IC.A02(A05(930, 15, 93));
        mediaCodec.releaseOutputBuffer(i9, false);
        IC.A00();
        A0E(1);
    }

    private final void A0G(MediaCodec mediaCodec, int i9, long j7) {
        A09();
        IC.A02(A05(1161, 19, 109));
        mediaCodec.releaseOutputBuffer(i9, true);
        IC.A00();
        this.A0L = SystemClock.elapsedRealtime() * 1000;
        super.A0U.A06++;
        this.A05 = 0;
        A1S();
    }

    private final void A0H(MediaCodec mediaCodec, int i9, long j7) {
        IC.A02(A05(1211, 15, 68));
        mediaCodec.releaseOutputBuffer(i9, false);
        IC.A00();
        super.A0U.A08++;
    }

    private final void A0I(MediaCodec mediaCodec, int i9, long j7, long j9) {
        A09();
        IC.A02(A05(1161, 19, 109));
        mediaCodec.releaseOutputBuffer(i9, j9);
        IC.A00();
        this.A0L = SystemClock.elapsedRealtime() * 1000;
        super.A0U.A06++;
        this.A05 = 0;
        A1S();
    }

    public static void A0J(MediaCodec mediaCodec, Surface surface) {
        mediaCodec.setOutputSurface(surface);
    }

    public static void A0K(MediaFormat mediaFormat, int i9) {
        mediaFormat.setFeatureEnabled(A05(1241, 17, 33), true);
        mediaFormat.setInteger(A05(859, 16, 122), i9);
    }

    private void A0L(Surface surface) throws C10079c {
        if (surface == null) {
            if (this.A0N != null) {
                surface = this.A0N;
            } else {
                DG A1E = A1E();
                if (A1E != null && A0T(A1E)) {
                    this.A0N = DummySurface.A01(this.A0V, A1E.A05);
                    surface = this.A0N;
                }
            }
        }
        if (this.A0O != surface) {
            this.A0O = surface;
            if (A0e[3].charAt(22) != 'Z') {
                throw new RuntimeException();
            }
            A0e[5] = "451d0u4cD9rJ2w2guGtx9AsvugCig8Nc";
            int A81 = A81();
            if (A81 == 1 || A81 == 2) {
                MediaCodec A1D = A1D();
                if (IF.A02 >= 23 && A1D != null && surface != null && !this.A0Q) {
                    A0J(A1D, surface);
                } else {
                    A1H();
                    A1J();
                }
            }
            if (surface != null && surface != this.A0N) {
                A0B();
                A06();
                if (A81 == 2) {
                    A0C();
                    return;
                }
                return;
            }
            A07();
            if (A0e[5].charAt(18) == 't') {
                A0e[3] = "pSIGciD2qJewSpKsBqH446Zc9mkVUpAR";
                A06();
                return;
            } else {
                A06();
                return;
            }
        }
        if (surface != null) {
            Surface surface2 = this.A0N;
            String[] strArr = A0e;
            if (strArr[1].length() == strArr[7].length()) {
                String[] strArr2 = A0e;
                strArr2[1] = "4gXhdQ7K18codO";
                strArr2[7] = "dCZzuzcRJjaMd3";
                if (surface == surface2) {
                    return;
                }
            } else if (surface == surface2) {
                return;
            }
            A0B();
            A0A();
        }
    }

    public static boolean A0M() {
        return IF.A02 <= 22 && A05(948, 6, 53).equals(IF.A03) && A05(545, 6, 101).equals(IF.A05);
    }

    public static boolean A0N(long j7) {
        return j7 < -30000;
    }

    public static boolean A0O(long j7) {
        return j7 < -500000;
    }

    private final boolean A0P(long j7, long j9) {
        return A0O(j7);
    }

    private final boolean A0Q(long j7, long j9) {
        return A0N(j7);
    }

    private final boolean A0R(long j7, long j9) {
        return A0N(j7) && j9 > 100000;
    }

    private final boolean A0S(MediaCodec mediaCodec, int i9, long j7, long j9) throws C10079c {
        int A10 = A10(j9);
        if (A10 == 0) {
            return false;
        }
        BC bc = super.A0U;
        int droppedSourceBufferCount = bc.A03;
        bc.A03 = droppedSourceBufferCount + 1;
        int droppedSourceBufferCount2 = this.A04;
        A0E(droppedSourceBufferCount2 + A10);
        A1G();
        return true;
    }

    private boolean A0T(DG dg) {
        return IF.A02 >= 23 && !this.A0S && !A0U(dg.A02) && (!dg.A05 || DummySurface.A05(this.A0V));
    }

    private final boolean A0U(String str) {
        char c9 = 0;
        char c10 = 27;
        if (IF.A02 >= 27 || str.startsWith(A05(563, 10, 62))) {
            return false;
        }
        synchronized (C3F.class) {
            if (!A0c) {
                String str2 = IF.A03;
                switch (str2.hashCode()) {
                    case -2144781245:
                        if (str2.equals(A05(341, 14, 52))) {
                            c10 = '\'';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -2144781185:
                        if (str2.equals(A05(355, 14, 63))) {
                            c10 = '(';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -2144781160:
                        if (str2.equals(A05(369, 14, 8))) {
                            c10 = ')';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -2097309513:
                        if (str2.equals(A05(489, 6, 90))) {
                            c10 = '9';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -2022874474:
                        if (str2.equals(A05(138, 10, 45))) {
                            c10 = 16;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1978993182:
                        if (str2.equals(A05(551, 6, 9))) {
                            c10 = 'E';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1978990237:
                        if (str2.equals(A05(557, 6, 100))) {
                            c10 = 'F';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1936688988:
                        if (str2.equals(A05(597, 6, 42))) {
                            c10 = 'P';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1936688066:
                        if (str2.equals(A05(603, 6, 35))) {
                            c10 = 'Q';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1936688065:
                        if (str2.equals(A05(609, 6, 62))) {
                            c10 = 'R';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1931988508:
                        if (str2.equals(A05(82, 10, 0))) {
                            c10 = '\n';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1696512866:
                        if (str2.equals(A05(839, 6, 26))) {
                            c10 = 's';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1680025915:
                        if (str2.equals(A05(198, 7, 114))) {
                            c10 = 15;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1615810839:
                        if (str2.equals(A05(623, 8, 25))) {
                            c10 = 'S';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1554255044:
                        if (str2.equals(A05(1258, 9, 50))) {
                            c10 = 'l';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1481772737:
                        if (str2.equals(A05(1126, 9, 27))) {
                            c10 = 'L';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1481772730:
                        if (str2.equals(A05(1135, 9, 115))) {
                            c10 = 'M';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1481772729:
                        if (str2.equals(A05(1144, 9, 89))) {
                            c10 = 'N';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1320080169:
                        if (str2.equals(A05(439, 14, 85))) {
                            c10 = '%';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1217592143:
                        if (str2.equals(A05(125, 11, 38))) {
                            c10 = '\r';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1180384755:
                        if (str2.equals(A05(1012, 6, 100))) {
                            c10 = '5';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1139198265:
                        if (str2.equals(A05(735, 9, 78))) {
                            c10 = '`';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1052835013:
                        if (str2.equals(A05(1098, 6, 87))) {
                            c10 = 'C';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -993250464:
                        if (str2.equals(A05(12, 7, 30))) {
                            c10 = 3;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -965403638:
                        if (str2.equals(A05(1196, 8, 91))) {
                            c10 = 'b';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -958336948:
                        if (str2.equals(A05(242, 11, 48))) {
                            c10 = 26;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -879245230:
                        if (str2.equals(A05(1235, 6, 103))) {
                            c10 = 'h';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -842500323:
                        if (str2.equals(A05(1104, 10, 37))) {
                            c10 = 'D';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -821392978:
                        if (str2.equals(A05(32, 7, 84))) {
                            c10 = 6;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -797483286:
                        if (str2.equals(A05(726, 9, 17))) {
                            c10 = 'a';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -794946968:
                        if (str2.equals(A05(1347, 6, 79))) {
                            c10 = 'm';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -788334647:
                        if (str2.equals(A05(1353, 6, 64))) {
                            c10 = 'n';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -782144577:
                        if (str2.equals(A05(573, 9, 58))) {
                            c10 = 'G';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -575125681:
                        if (str2.equals(A05(425, 14, 18))) {
                            c10 = '$';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -521118391:
                        if (str2.equals(A05(327, 14, 54))) {
                            c10 = '&';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -430914369:
                        if (str2.equals(A05(631, 10, 81))) {
                            c10 = 'T';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -290434366:
                        if (str2.equals(A05(1226, 9, 106))) {
                            c10 = 'c';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -282781963:
                        if (str2.equals(A05(103, 8, 18))) {
                            c10 = '\f';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -277133239:
                        if (str2.equals(A05(845, 7, 85))) {
                            c10 = 't';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -173639913:
                        if (str2.equals(A05(210, 12, 102))) {
                            c10 = 23;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -56598463:
                        if (str2.equals(A05(1371, 8, 93))) {
                            c10 = 'p';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 2126:
                        if (str2.equals(A05(136, 2, 41))) {
                            c10 = 14;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 2564:
                        if (str2.equals(A05(670, 2, 127))) {
                            c10 = '\\';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 2715:
                        if (str2.equals(A05(821, 2, 76))) {
                            c10 = 'i';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 2719:
                        if (str2.equals(A05(828, 2, 56))) {
                            c10 = 'k';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 3483:
                        if (str2.equals(A05(1088, 2, 2))) {
                            c10 = '@';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 73405:
                        if (str2.equals(A05(486, 3, 19))) {
                            c10 = '8';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 75739:
                        if (str2.equals(A05(508, 3, 28))) {
                            c10 = '<';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 76779:
                        if (str2.equals(A05(519, 3, 88))) {
                            c10 = 'B';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 78669:
                        if (str2.equals(A05(586, 3, 105))) {
                            c10 = 'J';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 79305:
                        if (str2.equals(A05(615, 3, 76))) {
                            c10 = 'V';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 80618:
                        if (str2.equals(A05(680, 3, 17))) {
                            c10 = '^';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 88274:
                        if (str2.equals(A05(852, 3, 13))) {
                            c10 = 'u';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 98846:
                        if (str2.equals(A05(921, 3, 93))) {
                            c10 = 19;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 98848:
                        if (str2.equals(A05(924, 3, 0))) {
                            c10 = 20;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 99329:
                        if (str2.equals(A05(927, 3, 35))) {
                            c10 = 21;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 101481:
                        if (str2.equals(A05(945, 3, 84))) {
                            c10 = '#';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1513190:
                        if (str2.equals(A05(0, 4, 98))) {
                            c10 = 0;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1514184:
                        if (str2.equals(A05(4, 4, 53))) {
                            c10 = 1;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1514185:
                        if (str2.equals(A05(8, 4, 24))) {
                            c10 = 2;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 2436959:
                        if (str2.equals(A05(582, 4, 32))) {
                            c10 = 'I';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 2463773:
                        if (str2.equals(A05(652, 4, 11))) {
                            c10 = 'X';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 2464648:
                        if (str2.equals(A05(661, 4, 60))) {
                            c10 = 'Z';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 2689555:
                        if (str2.equals(A05(835, 4, 13))) {
                            c10 = 'r';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 3351335:
                        if (str2.equals(A05(1090, 4, 89))) {
                            c10 = 'A';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 3386211:
                        if (str2.equals(A05(1114, 4, 102))) {
                            c10 = 'H';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 41325051:
                        if (str2.equals(A05(511, 8, 42))) {
                            c10 = '?';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 55178625:
                        if (str2.equals(A05(92, 11, 72))) {
                            c10 = 11;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 61542055:
                        if (str2.equals(A05(19, 5, 116))) {
                            c10 = 4;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 65355429:
                        if (str2.equals(A05(205, 5, 19))) {
                            c10 = 22;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 66214468:
                        if (str2.equals(A05(263, 5, 1))) {
                            c10 = 28;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 66214470:
                        if (str2.equals(A05(268, 5, 52))) {
                            c10 = 29;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 66214473:
                        if (str2.equals(A05(273, 5, 20))) {
                            c10 = 30;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 66215429:
                        if (str2.equals(A05(278, 5, 96))) {
                            c10 = 31;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 66215431:
                        if (str2.equals(A05(283, 5, 95))) {
                            c10 = ' ';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 66215433:
                        if (str2.equals(A05(288, 5, 69))) {
                            c10 = '!';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 66216390:
                        if (str2.equals(A05(293, 5, 1))) {
                            c10 = '\"';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 76402249:
                        if (str2.equals(A05(618, 5, 117))) {
                            c10 = 'W';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 76404105:
                        if (str2.equals(A05(656, 5, 101))) {
                            c10 = 'Y';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 76404911:
                        if (str2.equals(A05(665, 5, 112))) {
                            c10 = '[';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 80963634:
                        if (str2.equals(A05(823, 5, 79))) {
                            c10 = 'j';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 82882791:
                        if (str2.equals(A05(830, 5, 45))) {
                            c10 = 'q';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 102844228:
                        if (str2.equals(A05(1035, 5, 90))) {
                            c10 = ':';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 165221241:
                        if (str2.equals(A05(24, 8, 102))) {
                            c10 = 5;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 182191441:
                        if (str2.equals(A05(155, 9, 79))) {
                            c10 = 18;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 245388979:
                        if (str2.equals(A05(1047, 8, 79))) {
                            c10 = '>';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 287431619:
                        if (str2.equals(A05(964, 7, 64))) {
                            c10 = '-';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 307593612:
                        if (str2.equals(A05(48, 8, 88))) {
                            c10 = '\b';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 308517133:
                        if (str2.equals(A05(56, 8, 88))) {
                            c10 = '\t';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 316215098:
                        if (str2.equals(A05(744, 8, 102))) {
                            c10 = 'd';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 316215116:
                        if (str2.equals(A05(752, 8, 12))) {
                            c10 = 'e';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 316246811:
                        if (str2.equals(A05(760, 8, 62))) {
                            c10 = 'f';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 316246818:
                        if (str2.equals(A05(768, 8, 73))) {
                            c10 = 'g';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 407160593:
                        if (str2.equals(A05(641, 11, 36))) {
                            c10 = 'U';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 507412548:
                        if (str2.equals(A05(672, 8, 89))) {
                            c10 = ']';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 793982701:
                        if (str2.equals(A05(383, 14, 74))) {
                            c10 = '*';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 794038622:
                        if (str2.equals(A05(397, 14, 97))) {
                            c10 = '+';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 794040393:
                        if (str2.equals(A05(TTAdConstant.IMAGE_CODE, 14, 36))) {
                            c10 = ',';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 835649806:
                        if (str2.equals(A05(1040, 7, 3))) {
                            c10 = '=';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 917340916:
                        if (str2.equals(A05(39, 9, 41))) {
                            c10 = 7;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 958008161:
                        if (str2.equals(A05(1026, 9, 115))) {
                            c10 = '7';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1060579533:
                        if (str2.equals(A05(1118, 8, 17))) {
                            c10 = 'K';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1150207623:
                        if (str2.equals(A05(501, 7, 17))) {
                            c10 = ';';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1176899427:
                        if (str2.equals(A05(1018, 8, 61))) {
                            c10 = '6';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1280332038:
                        if (str2.equals(A05(991, 7, 10))) {
                            c10 = '/';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1306947716:
                        if (str2.equals(A05(253, 10, 95))) {
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1349174697:
                        if (str2.equals(A05(977, 14, 7))) {
                            c10 = '.';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1522194893:
                        if (str2.equals(A05(1364, 7, 33))) {
                            c10 = 'o';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1691543273:
                        if (str2.equals(A05(148, 7, 125))) {
                            c10 = 17;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1709443163:
                        if (str2.equals(A05(998, 14, 72))) {
                            c10 = '3';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1865889110:
                        if (str2.equals(A05(1204, 7, 107))) {
                            c10 = '_';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1906253259:
                        if (str2.equals(A05(589, 8, 59))) {
                            c10 = 'O';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1977196784:
                        if (str2.equals(A05(474, 12, 103))) {
                            c10 = '4';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 2029784656:
                        if (str2.equals(A05(453, 7, 61))) {
                            c10 = '0';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 2030379515:
                        if (str2.equals(A05(460, 7, 112))) {
                            c10 = '1';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 2047190025:
                        if (str2.equals(A05(222, 10, 96))) {
                            c10 = 24;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 2047252157:
                        if (str2.equals(A05(232, 10, 55))) {
                            c10 = 25;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 2048319463:
                        if (str2.equals(A05(467, 7, 24))) {
                            c10 = '2';
                            break;
                        }
                        c10 = 65535;
                        break;
                    default:
                        c10 = 65535;
                        break;
                }
                switch (c10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case '\b':
                    case '\t':
                    case '\n':
                    case 11:
                    case '\f':
                    case '\r':
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case AD_PLAY_RESET_ON_DEINIT_VALUE:
                    case 31:
                    case ' ':
                    case '!':
                    case '\"':
                    case '#':
                    case '$':
                    case '%':
                    case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                    case '\'':
                    case '(':
                    case ')':
                    case '*':
                    case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                    case ',':
                    case '-':
                    case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                    case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                    case '0':
                    case '1':
                    case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case ':':
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                    case '?':
                    case '@':
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case 'G':
                    case 'H':
                    case 'I':
                    case 'J':
                    case 'K':
                    case 'L':
                    case 'M':
                    case 'N':
                    case 'O':
                    case 'P':
                    case 'Q':
                    case 'R':
                    case 'S':
                    case 'T':
                    case 'U':
                    case 'V':
                    case 'W':
                    case 'X':
                    case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                    case 'Z':
                    case '[':
                    case '\\':
                    case ']':
                    case '^':
                    case '_':
                    case '`':
                    case 'a':
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'e':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'i':
                    case 'j':
                    case 'k':
                    case 'l':
                    case 'm':
                    case 'n':
                    case 'o':
                    case 'p':
                    case 'q':
                    case 'r':
                    case 's':
                    case 't':
                    case 'u':
                        A0b = true;
                        break;
                }
                String str3 = IF.A06;
                switch (str3.hashCode()) {
                    case 2006354:
                        if (str3.equals(A05(64, 4, 73))) {
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 2006367:
                        if (str3.equals(A05(68, 4, 74))) {
                            c9 = 1;
                            break;
                        }
                        c9 = 65535;
                        break;
                    default:
                        c9 = 65535;
                        break;
                }
                switch (c9) {
                    case 0:
                    case 1:
                        A0b = true;
                        break;
                }
                A0c = true;
            }
        }
        return A0b;
    }

    public static boolean A0V(boolean z8, Format format, Format format2) {
        return format.A0O.equals(format2.A0O) && format.A0B == format2.A0B && (z8 || (format.A0F == format2.A0F && format.A08 == format2.A08)) && IF.A0g(format.A0J, format2.A0J);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC09476j, com.meta.analytics.dsp.uinode.EM
    public final void A13() {
        super.A13();
        this.A09 = 0;
        this.A0H = SystemClock.elapsedRealtime();
        this.A0L = SystemClock.elapsedRealtime() * 1000;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC09476j, com.meta.analytics.dsp.uinode.EM
    public final void A14() {
        this.A0J = C.TIME_UNSET;
        A08();
        super.A14();
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC09476j, com.meta.analytics.dsp.uinode.EM
    public final void A15() {
        this.A08 = -1;
        this.A06 = -1;
        this.A01 = -1.0f;
        this.A02 = -1.0f;
        this.A0M = C.TIME_UNSET;
        this.A0K = C.TIME_UNSET;
        this.A0A = 0;
        A07();
        A06();
        this.A0W.A08();
        this.A00 = null;
        this.A0S = false;
        try {
            super.A15();
        } finally {
            super.A0U.A00();
            this.A0X.A05(super.A0U);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC09476j, com.meta.analytics.dsp.uinode.EM
    public final void A16(long j7, boolean z8) throws C10079c {
        super.A16(j7, z8);
        A06();
        this.A0I = C.TIME_UNSET;
        this.A05 = 0;
        this.A0K = C.TIME_UNSET;
        int i9 = this.A0A;
        if (i9 != 0) {
            this.A0M = this.A0Z[i9 - 1];
            this.A0A = 0;
        }
        if (z8) {
            A0C();
        } else {
            this.A0J = C.TIME_UNSET;
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC09476j, com.meta.analytics.dsp.uinode.EM
    public final void A17(boolean z8) throws C10079c {
        super.A17(z8);
        int i9 = A12().A00;
        this.A0G = i9;
        this.A0S = i9 != 0;
        this.A0X.A06(super.A0U);
        this.A0W.A09();
    }

    @Override // com.meta.analytics.dsp.uinode.EM
    public final void A18(Format[] formatArr, long j7) throws C10079c {
        if (this.A0M == C.TIME_UNSET) {
            this.A0M = j7;
        } else {
            int i9 = this.A0A;
            if (i9 == this.A0Z.length) {
                Log.w(A05(522, 23, 33), A05(776, 45, 2) + this.A0Z[this.A0A - 1]);
            } else {
                int i10 = i9 + 1;
                String[] strArr = A0e;
                if (strArr[1].length() != strArr[7].length()) {
                    throw new RuntimeException();
                }
                A0e[4] = "ShVF99lXvOUYr05H2Tvsc9mrs3vvqIZt";
                this.A0A = i10;
            }
            long[] jArr = this.A0Z;
            int i11 = this.A0A;
            jArr[i11 - 1] = j7;
            this.A0a[i11 - 1] = this.A0K;
        }
        super.A18(formatArr, j7);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC09476j
    public final int A1B(MediaCodec mediaCodec, DG dg, Format format, Format format2) {
        if (A0V(dg.A03, format, format2) && format2.A0F <= this.A0P.A02 && format2.A08 <= this.A0P.A00 && A00(dg, format2) <= this.A0P.A01) {
            if (format.A0K(format2)) {
                return 1;
            }
            return 3;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ab, code lost:
    
        if (r5 <= com.meta.analytics.dsp.uinode.DR.A00()) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ad, code lost:
    
        r6 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ae, code lost:
    
        if (r6 != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b0, code lost:
    
        r5 = new java.lang.StringBuilder();
        r0 = A05(298, 29, 6);
        r5 = r5.append(r0).append(r12.A0F);
        r0 = A05(1379, 1, 98);
        r5 = r5.append(r0).append(r12.A08);
        r0 = A05(856, 3, 89);
        r1 = r5.append(r0);
        r0 = com.meta.analytics.dsp.uinode.IF.A04;
        r5 = r1.append(r0);
        r0 = A05(855, 1, 29);
        r5.append(r0).toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x010e, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010b, code lost:
    
        if (r5 <= com.meta.analytics.dsp.uinode.DR.A00()) goto L50;
     */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bc != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    @Override // com.meta.analytics.dsp.uinode.AbstractC09476j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int A1C(com.meta.analytics.dsp.uinode.DM r10, com.meta.analytics.dsp.uinode.InterfaceC1058Bc<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> r11, com.facebook.ads.internal.exoplayer2.thirdparty.Format r12) throws com.meta.analytics.dsp.uinode.DP {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C3F.A1C(com.facebook.ads.redexgen.X.DM, com.facebook.ads.redexgen.X.Bc, com.facebook.ads.internal.exoplayer2.thirdparty.Format):int");
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC09476j
    public final void A1G() throws C10079c {
        super.A1G();
        this.A04 = 0;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC09476j
    public final void A1H() {
        try {
            super.A1H();
            this.A04 = 0;
            Surface surface = this.A0N;
            if (surface != null) {
                Surface surface2 = this.A0O;
                String[] strArr = A0e;
                if (strArr[1].length() != strArr[7].length()) {
                    throw new RuntimeException();
                }
                A0e[5] = "XHzJ2HWKwUKgXdkRP5t1s0JJnuLP0pfM";
                if (surface2 == surface) {
                    this.A0O = null;
                }
                surface.release();
                this.A0N = null;
            }
        } catch (Throwable th) {
            this.A04 = 0;
            if (this.A0N != null) {
                Surface surface3 = this.A0O;
                Surface surface4 = this.A0N;
                if (surface3 == surface4) {
                    this.A0O = null;
                }
                surface4.release();
                this.A0N = null;
            }
            throw th;
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC09476j
    public final void A1K(long j7) {
        this.A04--;
        while (true) {
            int i9 = this.A0A;
            if (i9 == 0) {
                return;
            }
            long j9 = this.A0a[0];
            if (A0e[4].charAt(25) == 'e') {
                throw new RuntimeException();
            }
            A0e[6] = "welnO5ckQSDvaPJP3GxM6gJ3";
            if (j7 >= j9) {
                long[] jArr = this.A0Z;
                this.A0M = jArr[0];
                int i10 = i9 - 1;
                this.A0A = i10;
                System.arraycopy(jArr, 1, jArr, 0, i10);
                long[] jArr2 = this.A0a;
                System.arraycopy(jArr2, 1, jArr2, 0, this.A0A);
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0084, code lost:
    
        if (r4 == 270) goto L24;
     */
    @Override // com.meta.analytics.dsp.uinode.AbstractC09476j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A1L(android.media.MediaCodec r9, android.media.MediaFormat r10) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C3F.A1L(android.media.MediaCodec, android.media.MediaFormat):void");
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC09476j
    public final void A1M(Format format) throws C10079c {
        super.A1M(format);
        this.A0X.A04(format);
        this.A02 = format.A02;
        this.A0B = format.A0B;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC09476j
    public final void A1N(C1614Xr c1614Xr) {
        this.A04++;
        this.A0K = Math.max(c1614Xr.A00, this.A0K);
        if (IF.A02 < 23 && this.A0S) {
            A1S();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC09476j
    public final void A1O(DG dg, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) throws DP {
        IP A04 = A04(dg, format, A1A());
        this.A0P = A04;
        MediaFormat A03 = A03(format, A04, this.A0Y, this.A0G);
        if (this.A0O == null) {
            AbstractC1192Ha.A04(A0T(dg));
            if (this.A0N == null) {
                this.A0N = DummySurface.A01(this.A0V, dg.A05);
            }
            this.A0O = this.A0N;
        }
        mediaCodec.configure(A03, this.A0O, mediaCrypto, 0);
        if (IF.A02 >= 23 && this.A0S) {
            this.A00 = new IQ(this, mediaCodec);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC09476j
    public final void A1P(String str, long j7, long j9) {
        this.A0X.A07(str, j7, j9);
        this.A0Q = A0U(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (A0R(r8, r19 - r4) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d6, code lost:
    
        if (r9 != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d8, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d9, code lost:
    
        if (r9 != false) goto L45;
     */
    @Override // com.meta.analytics.dsp.uinode.AbstractC09476j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A1Q(long r32, long r34, android.media.MediaCodec r36, java.nio.ByteBuffer r37, int r38, int r39, long r40, boolean r42) throws com.meta.analytics.dsp.uinode.C10079c {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C3F.A1Q(long, long, android.media.MediaCodec, java.nio.ByteBuffer, int, int, long, boolean):boolean");
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC09476j
    public final boolean A1R(DG dg) {
        return this.A0O != null || A0T(dg);
    }

    public final void A1S() {
        if (!this.A0R) {
            this.A0R = true;
            this.A0X.A03(this.A0O);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.EM, com.meta.analytics.dsp.uinode.A7
    public final void A8V(int i9, Object obj) throws C10079c {
        if (i9 == 1) {
            A0L((Surface) obj);
            return;
        }
        if (i9 == 4) {
            this.A0F = ((Integer) obj).intValue();
            MediaCodec A1D = A1D();
            if (A1D == null) {
                return;
            }
            int i10 = this.A0F;
            if (A0e[6].length() == 11) {
                throw new RuntimeException();
            }
            A0e[4] = "ynW9njiEKJeSgaNYH6SlaayD7qz19oDR";
            A1D.setVideoScalingMode(i10);
            return;
        }
        super.A8V(i9, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r9.A0S == false) goto L20;
     */
    @Override // com.meta.analytics.dsp.uinode.AbstractC09476j, com.meta.analytics.dsp.uinode.Y5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A9C() {
        /*
            r9 = this;
            boolean r0 = super.A9C()
            r8 = 1
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto L3f
            boolean r0 = r9.A0R
            if (r0 != 0) goto L36
            android.view.Surface r1 = r9.A0N
            if (r1 == 0) goto L18
            android.view.Surface r0 = r9.A0O
            if (r0 == r1) goto L36
        L18:
            android.media.MediaCodec r5 = r9.A1D()
            java.lang.String[] r1 = com.meta.analytics.dsp.uinode.C3F.A0e
            r0 = 6
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 11
            if (r1 == r0) goto L39
            java.lang.String[] r2 = com.meta.analytics.dsp.uinode.C3F.A0e
            java.lang.String r1 = "3hQTJaHLIy4JZfUSwiFMMfqMh"
            r0 = 6
            r2[r0] = r1
            if (r5 == 0) goto L36
            boolean r0 = r9.A0S
            if (r0 == 0) goto L3f
        L36:
            r9.A0J = r3
            return r8
        L39:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L3f:
            long r1 = r9.A0J
            r7 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L47
            return r7
        L47:
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r1 = r9.A0J
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L52
            return r8
        L52:
            r9.A0J = r3
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C3F.A9C():boolean");
    }
}

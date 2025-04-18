package k8;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.serialization.json.internal.JsonLexerKt;
import n9.h0;
import s7.r0;

/* loaded from: classes3.dex */
public final class o {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20329b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20330c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f20331d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f20332e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f20333f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f20334g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f20335h;

    public o(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12) {
        str.getClass();
        this.a = str;
        this.f20329b = str2;
        this.f20330c = str3;
        this.f20331d = codecCapabilities;
        this.f20334g = z10;
        this.f20332e = z11;
        this.f20333f = z12;
        this.f20335h = n9.q.l(str2);
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i12 = h0.a;
        Point point = new Point((((i10 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i11 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
        int i13 = point.x;
        int i14 = point.y;
        if (d10 != -1.0d && d10 >= 1.0d) {
            return videoCapabilities.areSizeAndRateSupported(i13, i14, Math.floor(d10));
        }
        return videoCapabilities.isSizeSupported(i13, i14);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
    
        if (r11 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0060, code lost:
    
        if (n9.h0.a < 21) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0068, code lost:
    
        if (r11.isFeatureSupported("secure-playback") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006a, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006d, code lost:
    
        if (r15 == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006c, code lost:
    
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0070, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static k8.o h(java.lang.String r8, java.lang.String r9, java.lang.String r10, android.media.MediaCodecInfo.CodecCapabilities r11, boolean r12, boolean r13, boolean r14, boolean r15) {
        /*
            k8.o r13 = new k8.o
            r14 = 1
            r0 = 0
            if (r11 == 0) goto L46
            int r1 = n9.h0.a
            r2 = 19
            if (r1 < r2) goto L16
            java.lang.String r2 = "adaptive-playback"
            boolean r2 = r11.isFeatureSupported(r2)
            if (r2 == 0) goto L16
            r2 = r14
            goto L17
        L16:
            r2 = r0
        L17:
            if (r2 == 0) goto L46
            r2 = 22
            if (r1 > r2) goto L41
            java.lang.String r1 = n9.h0.f22546d
            java.lang.String r2 = "ODROID-XU3"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L2f
            java.lang.String r2 = "Nexus 10"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L41
        L2f:
            java.lang.String r1 = "OMX.Exynos.AVC.Decoder"
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L3f
            java.lang.String r1 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L41
        L3f:
            r1 = r14
            goto L42
        L41:
            r1 = r0
        L42:
            if (r1 != 0) goto L46
            r6 = r14
            goto L47
        L46:
            r6 = r0
        L47:
            r1 = 21
            if (r11 == 0) goto L5a
            int r2 = n9.h0.a
            if (r2 < r1) goto L59
            java.lang.String r2 = "tunneled-playback"
            boolean r2 = r11.isFeatureSupported(r2)
            if (r2 == 0) goto L59
            r2 = r14
            goto L5a
        L59:
            r2 = r0
        L5a:
            if (r15 != 0) goto L72
            if (r11 == 0) goto L70
            int r15 = n9.h0.a
            if (r15 < r1) goto L6c
            java.lang.String r15 = "secure-playback"
            boolean r15 = r11.isFeatureSupported(r15)
            if (r15 == 0) goto L6c
            r15 = r14
            goto L6d
        L6c:
            r15 = r0
        L6d:
            if (r15 == 0) goto L70
            goto L72
        L70:
            r7 = r0
            goto L73
        L72:
            r7 = r14
        L73:
            r0 = r13
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.o.h(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean):k8.o");
    }

    public final w7.k b(r0 r0Var, r0 r0Var2) {
        int i10;
        int i11;
        boolean z10 = false;
        if (!h0.a(r0Var.f24723n, r0Var2.f24723n)) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        if (this.f20335h) {
            if (r0Var.f24730v != r0Var2.f24730v) {
                i10 |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            if (!this.f20332e && (r0Var.f24728s != r0Var2.f24728s || r0Var.f24729t != r0Var2.f24729t)) {
                i10 |= 512;
            }
            if (!h0.a(r0Var.f24734z, r0Var2.f24734z)) {
                i10 |= 2048;
            }
            if (h0.f22546d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.a)) {
                z10 = true;
            }
            if (z10 && !r0Var.b(r0Var2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                String str = this.a;
                if (r0Var.b(r0Var2)) {
                    i11 = 3;
                } else {
                    i11 = 2;
                }
                return new w7.k(str, r0Var, r0Var2, i11, 0);
            }
        } else {
            if (r0Var.A != r0Var2.A) {
                i10 |= 4096;
            }
            if (r0Var.B != r0Var2.B) {
                i10 |= 8192;
            }
            if (r0Var.C != r0Var2.C) {
                i10 |= JsonLexerKt.BATCH_SIZE;
            }
            String str2 = this.f20329b;
            if (i10 == 0 && MimeTypes.AUDIO_AAC.equals(str2)) {
                Pair d10 = z.d(r0Var);
                Pair d11 = z.d(r0Var2);
                if (d10 != null && d11 != null) {
                    int intValue = ((Integer) d10.first).intValue();
                    int intValue2 = ((Integer) d11.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new w7.k(this.a, r0Var, r0Var2, 3, 0);
                    }
                }
            }
            if (!r0Var.b(r0Var2)) {
                i10 |= 32;
            }
            if (MimeTypes.AUDIO_OPUS.equals(str2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new w7.k(this.a, r0Var, r0Var2, 1, 0);
            }
        }
        return new w7.k(this.a, r0Var, r0Var2, 0, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0102 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(s7.r0 r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.o.c(s7.r0, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(s7.r0 r10) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.o.d(s7.r0):boolean");
    }

    public final boolean e(r0 r0Var) {
        if (this.f20335h) {
            return this.f20332e;
        }
        Pair d10 = z.d(r0Var);
        if (d10 != null && ((Integer) d10.first).intValue() == 42) {
            return true;
        }
        return false;
    }

    public final boolean f(int i10, int i11, double d10) {
        boolean z10;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f20331d;
        if (codecCapabilities == null) {
            g("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            g("sizeAndRate.vCaps");
            return false;
        }
        if (h0.a >= 29) {
            int a = n.a(videoCapabilities, i10, i11, d10);
            if (a == 2) {
                return true;
            }
            if (a == 1) {
                StringBuilder n10 = a4.j.n("sizeAndRate.cover, ", i10, "x", i11, "@");
                n10.append(d10);
                g(n10.toString());
                return false;
            }
        }
        if (!a(videoCapabilities, i10, i11, d10)) {
            if (i10 < i11) {
                String str = this.a;
                if ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(h0.f22544b)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10 && a(videoCapabilities, i11, i10, d10)) {
                    StringBuilder n11 = a4.j.n("sizeAndRate.rotated, ", i10, "x", i11, "@");
                    n11.append(d10);
                    StringBuilder p10 = a4.j.p("AssumedSupport [", n11.toString(), "] [", str, ", ");
                    p10.append(this.f20329b);
                    p10.append("] [");
                    p10.append(h0.f22547e);
                    p10.append("]");
                    n9.o.b(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo.TAG, p10.toString());
                }
            }
            StringBuilder n12 = a4.j.n("sizeAndRate.support, ", i10, "x", i11, "@");
            n12.append(d10);
            g(n12.toString());
            return false;
        }
        return true;
    }

    public final void g(String str) {
        StringBuilder o10 = a4.j.o("NoSupport [", str, "] [");
        o10.append(this.a);
        o10.append(", ");
        o10.append(this.f20329b);
        o10.append("] [");
        o10.append(h0.f22547e);
        o10.append("]");
        n9.o.b(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo.TAG, o10.toString());
    }

    public final String toString() {
        return this.a;
    }
}

package com.bytedance.adsdk.lottie.KS.lMd;

import android.graphics.Paint;
import com.bytedance.adsdk.lottie.zp.zp.cz;
import java.util.List;

/* loaded from: classes.dex */
public class vwr implements KS {
    private final com.bytedance.adsdk.lottie.KS.zp.jU COT;
    private final com.bytedance.adsdk.lottie.KS.zp.lMd HWF;
    private final List<com.bytedance.adsdk.lottie.KS.zp.lMd> KS;
    private final zp QR;
    private final float YW;
    private final boolean dT;
    private final com.bytedance.adsdk.lottie.KS.zp.zp jU;
    private final lMd ku;
    private final com.bytedance.adsdk.lottie.KS.zp.lMd lMd;
    private final String zp;

    /* renamed from: com.bytedance.adsdk.lottie.KS.lMd.vwr$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] lMd;
        static final /* synthetic */ int[] zp;

        static {
            int[] iArr = new int[lMd.values().length];
            lMd = iArr;
            try {
                iArr[lMd.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                lMd[lMd.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                lMd[lMd.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[zp.values().length];
            zp = iArr2;
            try {
                iArr2[zp.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                zp[zp.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                zp[zp.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum lMd {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join zp() {
            int i9 = AnonymousClass1.lMd[ordinal()];
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        return null;
                    }
                    return Paint.Join.ROUND;
                }
                return Paint.Join.MITER;
            }
            return Paint.Join.BEVEL;
        }
    }

    /* loaded from: classes.dex */
    public enum zp {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap zp() {
            int i9 = AnonymousClass1.zp[ordinal()];
            if (i9 != 1) {
                if (i9 != 2) {
                    return Paint.Cap.SQUARE;
                }
                return Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }
    }

    public vwr(String str, com.bytedance.adsdk.lottie.KS.zp.lMd lmd, List<com.bytedance.adsdk.lottie.KS.zp.lMd> list, com.bytedance.adsdk.lottie.KS.zp.zp zpVar, com.bytedance.adsdk.lottie.KS.zp.jU jUVar, com.bytedance.adsdk.lottie.KS.zp.lMd lmd2, zp zpVar2, lMd lmd3, float f9, boolean z8) {
        this.zp = str;
        this.lMd = lmd;
        this.KS = list;
        this.jU = zpVar;
        this.COT = jUVar;
        this.HWF = lmd2;
        this.QR = zpVar2;
        this.ku = lmd3;
        this.YW = f9;
        this.dT = z8;
    }

    public List<com.bytedance.adsdk.lottie.KS.zp.lMd> COT() {
        return this.KS;
    }

    public com.bytedance.adsdk.lottie.KS.zp.lMd HWF() {
        return this.lMd;
    }

    public com.bytedance.adsdk.lottie.KS.zp.jU KS() {
        return this.COT;
    }

    public zp QR() {
        return this.QR;
    }

    public float YW() {
        return this.YW;
    }

    public boolean dT() {
        return this.dT;
    }

    public com.bytedance.adsdk.lottie.KS.zp.lMd jU() {
        return this.HWF;
    }

    public lMd ku() {
        return this.ku;
    }

    public com.bytedance.adsdk.lottie.KS.zp.zp lMd() {
        return this.jU;
    }

    @Override // com.bytedance.adsdk.lottie.KS.lMd.KS
    public com.bytedance.adsdk.lottie.zp.zp.KS zp(com.bytedance.adsdk.lottie.ku kuVar, com.bytedance.adsdk.lottie.HWF hwf, com.bytedance.adsdk.lottie.KS.KS.zp zpVar) {
        return new cz(kuVar, zpVar, this);
    }

    public String zp() {
        return this.zp;
    }
}

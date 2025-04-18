package com.bytedance.adsdk.Sg.tN.Sg;

import android.graphics.Paint;
import com.bytedance.adsdk.Sg.YFl.YFl.aIu;
import java.util.List;

/* loaded from: classes.dex */
public class Wwa implements tN {
    private final com.bytedance.adsdk.Sg.tN.YFl.YFl AlY;
    private final YFl DSW;
    private final float NjR;
    private final com.bytedance.adsdk.Sg.tN.YFl.Sg Sg;
    private final String YFl;

    /* renamed from: nc, reason: collision with root package name */
    private final boolean f10193nc;
    private final Sg qsH;
    private final List<com.bytedance.adsdk.Sg.tN.YFl.Sg> tN;

    /* renamed from: vc, reason: collision with root package name */
    private final com.bytedance.adsdk.Sg.tN.YFl.Sg f10194vc;
    private final com.bytedance.adsdk.Sg.tN.YFl.AlY wN;

    /* renamed from: com.bytedance.adsdk.Sg.tN.Sg.Wwa$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Sg;
        static final /* synthetic */ int[] YFl;

        static {
            int[] iArr = new int[Sg.values().length];
            Sg = iArr;
            try {
                iArr[Sg.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Sg[Sg.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Sg[Sg.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[YFl.values().length];
            YFl = iArr2;
            try {
                iArr2[YFl.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                YFl[YFl.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                YFl[YFl.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum Sg {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join YFl() {
            int i10 = AnonymousClass1.Sg[ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
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
    public enum YFl {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap YFl() {
            int i10 = AnonymousClass1.YFl[ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    return Paint.Cap.SQUARE;
                }
                return Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }
    }

    public Wwa(String str, com.bytedance.adsdk.Sg.tN.YFl.Sg sg2, List<com.bytedance.adsdk.Sg.tN.YFl.Sg> list, com.bytedance.adsdk.Sg.tN.YFl.YFl yFl, com.bytedance.adsdk.Sg.tN.YFl.AlY alY, com.bytedance.adsdk.Sg.tN.YFl.Sg sg3, YFl yFl2, Sg sg4, float f10, boolean z10) {
        this.YFl = str;
        this.Sg = sg2;
        this.tN = list;
        this.AlY = yFl;
        this.wN = alY;
        this.f10194vc = sg3;
        this.DSW = yFl2;
        this.qsH = sg4;
        this.NjR = f10;
        this.f10193nc = z10;
    }

    public com.bytedance.adsdk.Sg.tN.YFl.Sg AlY() {
        return this.f10194vc;
    }

    public YFl DSW() {
        return this.DSW;
    }

    public float NjR() {
        return this.NjR;
    }

    public com.bytedance.adsdk.Sg.tN.YFl.YFl Sg() {
        return this.AlY;
    }

    @Override // com.bytedance.adsdk.Sg.tN.Sg.tN
    public com.bytedance.adsdk.Sg.YFl.YFl.tN YFl(com.bytedance.adsdk.Sg.NjR njR, com.bytedance.adsdk.Sg.DSW dsw, com.bytedance.adsdk.Sg.tN.tN.YFl yFl) {
        return new aIu(njR, yFl, this);
    }

    public boolean nc() {
        return this.f10193nc;
    }

    public Sg qsH() {
        return this.qsH;
    }

    public com.bytedance.adsdk.Sg.tN.YFl.AlY tN() {
        return this.wN;
    }

    public com.bytedance.adsdk.Sg.tN.YFl.Sg vc() {
        return this.Sg;
    }

    public List<com.bytedance.adsdk.Sg.tN.YFl.Sg> wN() {
        return this.tN;
    }

    public String YFl() {
        return this.YFl;
    }
}

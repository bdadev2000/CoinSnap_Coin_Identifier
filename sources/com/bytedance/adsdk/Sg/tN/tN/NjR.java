package com.bytedance.adsdk.Sg.tN.tN;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.LongSparseArray;
import com.bytedance.adsdk.Sg.YFl.Sg.EH;
import com.bytedance.adsdk.Sg.tN.Sg;
import com.bytedance.adsdk.Sg.tN.Sg.rkt;
import com.bytedance.adsdk.Sg.tN.YFl.eT;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class NjR extends com.bytedance.adsdk.Sg.tN.tN.YFl {
    private final StringBuilder DSW;
    private final EH EH;
    private final LongSparseArray<String> GA;
    private com.bytedance.adsdk.Sg.YFl.Sg.YFl<Typeface, Typeface> Ga;
    private com.bytedance.adsdk.Sg.YFl.Sg.YFl<Float, Float> Ne;
    private final Matrix NjR;
    private com.bytedance.adsdk.Sg.YFl.Sg.YFl<Float, Float> UZM;
    private com.bytedance.adsdk.Sg.YFl.Sg.YFl<Float, Float> VOe;
    private com.bytedance.adsdk.Sg.YFl.Sg.YFl<Integer, Integer> Wwa;
    private com.bytedance.adsdk.Sg.YFl.Sg.YFl<Float, Float> YI;
    private final Map<com.bytedance.adsdk.Sg.tN.AlY, List<com.bytedance.adsdk.Sg.YFl.YFl.AlY>> YoT;
    private com.bytedance.adsdk.Sg.YFl.Sg.YFl<Integer, Integer> aIu;
    private com.bytedance.adsdk.Sg.YFl.Sg.YFl<Float, Float> bZ;
    private final Paint eT;
    private final com.bytedance.adsdk.Sg.DSW lG;

    /* renamed from: nc, reason: collision with root package name */
    private final Paint f10204nc;
    private final List<YFl> pDU;
    private com.bytedance.adsdk.Sg.YFl.Sg.YFl<Integer, Integer> qO;
    private final RectF qsH;
    private final com.bytedance.adsdk.Sg.NjR rkt;
    private com.bytedance.adsdk.Sg.YFl.Sg.YFl<Integer, Integer> wXo;

    /* renamed from: com.bytedance.adsdk.Sg.tN.tN.NjR$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] YFl;

        static {
            int[] iArr = new int[Sg.YFl.values().length];
            YFl = iArr;
            try {
                iArr[Sg.YFl.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                YFl[Sg.YFl.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                YFl[Sg.YFl.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class YFl {
        private float Sg;
        private String YFl;

        private YFl() {
            this.YFl = "";
            this.Sg = 0.0f;
        }

        public void YFl(String str, float f10) {
            this.YFl = str;
            this.Sg = f10;
        }
    }

    public NjR(com.bytedance.adsdk.Sg.NjR njR, wN wNVar) {
        super(njR, wNVar);
        com.bytedance.adsdk.Sg.tN.YFl.Sg sg2;
        com.bytedance.adsdk.Sg.tN.YFl.Sg sg3;
        com.bytedance.adsdk.Sg.tN.YFl.YFl yFl;
        com.bytedance.adsdk.Sg.tN.YFl.YFl yFl2;
        this.DSW = new StringBuilder(2);
        this.qsH = new RectF();
        this.NjR = new Matrix();
        int i10 = 1;
        this.f10204nc = new Paint(i10) { // from class: com.bytedance.adsdk.Sg.tN.tN.NjR.1
            {
                setStyle(Paint.Style.FILL);
            }
        };
        this.eT = new Paint(i10) { // from class: com.bytedance.adsdk.Sg.tN.tN.NjR.2
            {
                setStyle(Paint.Style.STROKE);
            }
        };
        this.YoT = new HashMap();
        this.GA = new LongSparseArray<>();
        this.pDU = new ArrayList();
        this.rkt = njR;
        this.lG = wNVar.YFl();
        EH YFl2 = wNVar.qO().YFl();
        this.EH = YFl2;
        YFl2.YFl(this);
        YFl(YFl2);
        eT aIu = wNVar.aIu();
        if (aIu != null && (yFl2 = aIu.YFl) != null) {
            com.bytedance.adsdk.Sg.YFl.Sg.YFl<Integer, Integer> YFl3 = yFl2.YFl();
            this.Wwa = YFl3;
            YFl3.YFl(this);
            YFl(this.Wwa);
        }
        if (aIu != null && (yFl = aIu.Sg) != null) {
            com.bytedance.adsdk.Sg.YFl.Sg.YFl<Integer, Integer> YFl4 = yFl.YFl();
            this.aIu = YFl4;
            YFl4.YFl(this);
            YFl(this.aIu);
        }
        if (aIu != null && (sg3 = aIu.tN) != null) {
            com.bytedance.adsdk.Sg.YFl.Sg.YFl<Float, Float> YFl5 = sg3.YFl();
            this.Ne = YFl5;
            YFl5.YFl(this);
            YFl(this.Ne);
        }
        if (aIu != null && (sg2 = aIu.AlY) != null) {
            com.bytedance.adsdk.Sg.YFl.Sg.YFl<Float, Float> YFl6 = sg2.YFl();
            this.bZ = YFl6;
            YFl6.YFl(this);
            YFl(this.bZ);
        }
    }

    private boolean tN(int i10) {
        if (Character.getType(i10) != 16 && Character.getType(i10) != 27 && Character.getType(i10) != 6 && Character.getType(i10) != 28 && Character.getType(i10) != 8 && Character.getType(i10) != 19) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.adsdk.Sg.tN.tN.YFl
    public void Sg(Canvas canvas, Matrix matrix, int i10) {
        super.Sg(canvas, matrix, i10);
        com.bytedance.adsdk.Sg.tN.Sg DSW = this.EH.DSW();
        com.bytedance.adsdk.Sg.tN.tN tNVar = this.lG.EH().get(DSW.Sg);
        if (tNVar == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        YFl(DSW, matrix);
        if (this.rkt.VOe()) {
            YFl(DSW, matrix, tNVar, canvas);
        } else {
            YFl(DSW, tNVar, canvas);
        }
        canvas.restore();
    }

    @Override // com.bytedance.adsdk.Sg.tN.tN.YFl, com.bytedance.adsdk.Sg.YFl.YFl.wN
    public void YFl(RectF rectF, Matrix matrix, boolean z10) {
        super.YFl(rectF, matrix, z10);
        rectF.set(0.0f, 0.0f, this.lG.AlY().width(), this.lG.AlY().height());
    }

    private void YFl(com.bytedance.adsdk.Sg.tN.Sg sg2, Matrix matrix) {
        com.bytedance.adsdk.Sg.YFl.Sg.YFl<Integer, Integer> yFl = this.qO;
        if (yFl != null) {
            this.f10204nc.setColor(yFl.DSW().intValue());
        } else {
            com.bytedance.adsdk.Sg.YFl.Sg.YFl<Integer, Integer> yFl2 = this.Wwa;
            if (yFl2 != null) {
                this.f10204nc.setColor(yFl2.DSW().intValue());
            } else {
                this.f10204nc.setColor(sg2.qsH);
            }
        }
        com.bytedance.adsdk.Sg.YFl.Sg.YFl<Integer, Integer> yFl3 = this.wXo;
        if (yFl3 != null) {
            this.eT.setColor(yFl3.DSW().intValue());
        } else {
            com.bytedance.adsdk.Sg.YFl.Sg.YFl<Integer, Integer> yFl4 = this.aIu;
            if (yFl4 != null) {
                this.eT.setColor(yFl4.DSW().intValue());
            } else {
                this.eT.setColor(sg2.NjR);
            }
        }
        int intValue = ((this.AlY.YFl() == null ? 100 : this.AlY.YFl().DSW().intValue()) * 255) / 100;
        this.f10204nc.setAlpha(intValue);
        this.eT.setAlpha(intValue);
        com.bytedance.adsdk.Sg.YFl.Sg.YFl<Float, Float> yFl5 = this.VOe;
        if (yFl5 != null) {
            this.eT.setStrokeWidth(yFl5.DSW().floatValue());
            return;
        }
        com.bytedance.adsdk.Sg.YFl.Sg.YFl<Float, Float> yFl6 = this.Ne;
        if (yFl6 != null) {
            this.eT.setStrokeWidth(yFl6.DSW().floatValue());
        } else {
            this.eT.setStrokeWidth(com.bytedance.adsdk.Sg.vc.vc.YFl() * sg2.f10189nc);
        }
    }

    private YFl Sg(int i10) {
        for (int size = this.pDU.size(); size < i10; size++) {
            this.pDU.add(new YFl());
        }
        return this.pDU.get(i10 - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void YFl(com.bytedance.adsdk.Sg.tN.Sg r21, android.graphics.Matrix r22, com.bytedance.adsdk.Sg.tN.tN r23, android.graphics.Canvas r24) {
        /*
            r20 = this;
            r8 = r20
            r9 = r21
            com.bytedance.adsdk.Sg.YFl.Sg.YFl<java.lang.Float, java.lang.Float> r0 = r8.YI
            if (r0 == 0) goto L13
            java.lang.Object r0 = r0.DSW()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            goto L15
        L13:
            float r0 = r9.tN
        L15:
            r1 = 1120403456(0x42c80000, float:100.0)
            float r10 = r0 / r1
            float r11 = com.bytedance.adsdk.Sg.vc.vc.YFl(r22)
            java.lang.String r0 = r9.YFl
            java.util.List r12 = r8.YFl(r0)
            int r13 = r12.size()
            int r0 = r9.wN
            float r0 = (float) r0
            r1 = 1092616192(0x41200000, float:10.0)
            float r0 = r0 / r1
            com.bytedance.adsdk.Sg.YFl.Sg.YFl<java.lang.Float, java.lang.Float> r1 = r8.UZM
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r1.DSW()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
        L3b:
            float r0 = r0 + r1
            goto L4c
        L3d:
            com.bytedance.adsdk.Sg.YFl.Sg.YFl<java.lang.Float, java.lang.Float> r1 = r8.bZ
            if (r1 == 0) goto L4c
            java.lang.Object r1 = r1.DSW()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            goto L3b
        L4c:
            r14 = r0
            r15 = 0
            r0 = -1
            r7 = r0
            r6 = r15
        L51:
            if (r6 >= r13) goto Lb1
            java.lang.Object r0 = r12.get(r6)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            android.graphics.PointF r0 = r9.GA
            if (r0 != 0) goto L60
            r0 = 0
            goto L62
        L60:
            float r0 = r0.x
        L62:
            r2 = r0
            r16 = 1
            r0 = r20
            r3 = r23
            r4 = r10
            r5 = r14
            r17 = r6
            r6 = r16
            java.util.List r6 = r0.YFl(r1, r2, r3, r4, r5, r6)
            r5 = r15
        L74:
            int r0 = r6.size()
            if (r5 >= r0) goto Lae
            java.lang.Object r0 = r6.get(r5)
            com.bytedance.adsdk.Sg.tN.tN.NjR$YFl r0 = (com.bytedance.adsdk.Sg.tN.tN.NjR.YFl) r0
            int r7 = r7 + 1
            r24.save()
            float r1 = com.bytedance.adsdk.Sg.tN.tN.NjR.YFl.YFl(r0)
            r4 = r24
            r8.YFl(r4, r9, r7, r1)
            java.lang.String r1 = com.bytedance.adsdk.Sg.tN.tN.NjR.YFl.Sg(r0)
            r0 = r20
            r2 = r21
            r3 = r23
            r16 = r5
            r5 = r11
            r18 = r6
            r6 = r10
            r19 = r7
            r7 = r14
            r0.YFl(r1, r2, r3, r4, r5, r6, r7)
            r24.restore()
            int r5 = r16 + 1
            r6 = r18
            r7 = r19
            goto L74
        Lae:
            int r6 = r17 + 1
            goto L51
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.Sg.tN.tN.NjR.YFl(com.bytedance.adsdk.Sg.tN.Sg, android.graphics.Matrix, com.bytedance.adsdk.Sg.tN.tN, android.graphics.Canvas):void");
    }

    private void YFl(String str, com.bytedance.adsdk.Sg.tN.Sg sg2, com.bytedance.adsdk.Sg.tN.tN tNVar, Canvas canvas, float f10, float f11, float f12) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            com.bytedance.adsdk.Sg.tN.AlY alY = this.lG.pDU().get(com.bytedance.adsdk.Sg.tN.AlY.YFl(str.charAt(i10), tNVar.YFl(), tNVar.tN()));
            if (alY != null) {
                YFl(alY, f11, sg2, canvas);
                canvas.translate((com.bytedance.adsdk.Sg.vc.vc.YFl() * ((float) alY.Sg()) * f11) + f12, 0.0f);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void YFl(com.bytedance.adsdk.Sg.tN.Sg r19, com.bytedance.adsdk.Sg.tN.tN r20, android.graphics.Canvas r21) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            android.graphics.Typeface r0 = r7.YFl(r9)
            if (r0 != 0) goto Lf
            return
        Lf:
            java.lang.String r1 = r8.YFl
            com.bytedance.adsdk.Sg.NjR r2 = r7.rkt
            com.bytedance.adsdk.Sg.aIu r2 = r2.Ne()
            if (r2 == 0) goto L21
            java.lang.String r3 = r18.NjR()
            java.lang.String r1 = r2.Sg(r3, r1)
        L21:
            android.graphics.Paint r2 = r7.f10204nc
            r2.setTypeface(r0)
            com.bytedance.adsdk.Sg.YFl.Sg.YFl<java.lang.Float, java.lang.Float> r0 = r7.YI
            if (r0 == 0) goto L35
            java.lang.Object r0 = r0.DSW()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            goto L37
        L35:
            float r0 = r8.tN
        L37:
            android.graphics.Paint r2 = r7.f10204nc
            float r3 = com.bytedance.adsdk.Sg.vc.vc.YFl()
            float r3 = r3 * r0
            r2.setTextSize(r3)
            android.graphics.Paint r2 = r7.eT
            android.graphics.Paint r3 = r7.f10204nc
            android.graphics.Typeface r3 = r3.getTypeface()
            r2.setTypeface(r3)
            android.graphics.Paint r2 = r7.eT
            android.graphics.Paint r3 = r7.f10204nc
            float r3 = r3.getTextSize()
            r2.setTextSize(r3)
            int r2 = r8.wN
            float r2 = (float) r2
            r3 = 1092616192(0x41200000, float:10.0)
            float r2 = r2 / r3
            com.bytedance.adsdk.Sg.YFl.Sg.YFl<java.lang.Float, java.lang.Float> r3 = r7.UZM
            if (r3 == 0) goto L6d
            java.lang.Object r3 = r3.DSW()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
        L6b:
            float r2 = r2 + r3
            goto L7c
        L6d:
            com.bytedance.adsdk.Sg.YFl.Sg.YFl<java.lang.Float, java.lang.Float> r3 = r7.bZ
            if (r3 == 0) goto L7c
            java.lang.Object r3 = r3.DSW()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            goto L6b
        L7c:
            float r3 = com.bytedance.adsdk.Sg.vc.vc.YFl()
            float r3 = r3 * r2
            float r3 = r3 * r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r11 = r3 / r0
            java.util.List r12 = r7.YFl(r1)
            int r13 = r12.size()
            r14 = 0
            r0 = -1
            r15 = r0
            r6 = r14
        L92:
            if (r6 >= r13) goto Ldd
            java.lang.Object r0 = r12.get(r6)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            android.graphics.PointF r0 = r8.GA
            if (r0 != 0) goto La1
            r0 = 0
            goto La3
        La1:
            float r0 = r0.x
        La3:
            r2 = r0
            r4 = 0
            r16 = 0
            r0 = r18
            r3 = r20
            r5 = r11
            r17 = r6
            r6 = r16
            java.util.List r0 = r0.YFl(r1, r2, r3, r4, r5, r6)
            r1 = r14
        Lb5:
            int r2 = r0.size()
            if (r1 >= r2) goto Lda
            java.lang.Object r2 = r0.get(r1)
            com.bytedance.adsdk.Sg.tN.tN.NjR$YFl r2 = (com.bytedance.adsdk.Sg.tN.tN.NjR.YFl) r2
            int r15 = r15 + 1
            r21.save()
            float r3 = com.bytedance.adsdk.Sg.tN.tN.NjR.YFl.YFl(r2)
            r7.YFl(r10, r8, r15, r3)
            java.lang.String r2 = com.bytedance.adsdk.Sg.tN.tN.NjR.YFl.Sg(r2)
            r7.YFl(r2, r8, r10, r11)
            r21.restore()
            int r1 = r1 + 1
            goto Lb5
        Lda:
            int r6 = r17 + 1
            goto L92
        Ldd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.Sg.tN.tN.NjR.YFl(com.bytedance.adsdk.Sg.tN.Sg, com.bytedance.adsdk.Sg.tN.tN, android.graphics.Canvas):void");
    }

    private void YFl(Canvas canvas, com.bytedance.adsdk.Sg.tN.Sg sg2, int i10, float f10) {
        PointF pointF = sg2.YoT;
        PointF pointF2 = sg2.GA;
        float YFl2 = com.bytedance.adsdk.Sg.vc.vc.YFl();
        float f11 = (i10 * sg2.f10190vc * YFl2) + (pointF == null ? 0.0f : (sg2.f10190vc * 0.6f * YFl2) + pointF.y);
        float f12 = pointF == null ? 0.0f : pointF.x;
        float f13 = pointF2 != null ? pointF2.x : 0.0f;
        int i11 = AnonymousClass3.YFl[sg2.AlY.ordinal()];
        if (i11 == 1) {
            canvas.translate(f12, f11);
        } else if (i11 == 2) {
            canvas.translate((f12 + f13) - f10, f11);
        } else {
            if (i11 != 3) {
                return;
            }
            canvas.translate(((f13 / 2.0f) + f12) - (f10 / 2.0f), f11);
        }
    }

    private Typeface YFl(com.bytedance.adsdk.Sg.tN.tN tNVar) {
        Typeface DSW;
        com.bytedance.adsdk.Sg.YFl.Sg.YFl<Typeface, Typeface> yFl = this.Ga;
        if (yFl != null && (DSW = yFl.DSW()) != null) {
            return DSW;
        }
        Typeface YFl2 = this.rkt.YFl(tNVar);
        return YFl2 != null ? YFl2 : tNVar.AlY();
    }

    private List<String> YFl(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    private void YFl(String str, com.bytedance.adsdk.Sg.tN.Sg sg2, Canvas canvas, float f10) {
        int i10 = 0;
        while (i10 < str.length()) {
            String YFl2 = YFl(str, i10);
            i10 += YFl2.length();
            YFl(YFl2, sg2, canvas);
            canvas.translate(this.f10204nc.measureText(YFl2) + f10, 0.0f);
        }
    }

    private List<YFl> YFl(String str, float f10, com.bytedance.adsdk.Sg.tN.tN tNVar, float f11, float f12, boolean z10) {
        float measureText;
        int i10 = 0;
        int i11 = 0;
        boolean z11 = false;
        int i12 = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i13 = 0; i13 < str.length(); i13++) {
            char charAt = str.charAt(i13);
            if (z10) {
                com.bytedance.adsdk.Sg.tN.AlY alY = this.lG.pDU().get(com.bytedance.adsdk.Sg.tN.AlY.YFl(charAt, tNVar.YFl(), tNVar.tN()));
                if (alY != null) {
                    measureText = (com.bytedance.adsdk.Sg.vc.vc.YFl() * ((float) alY.Sg()) * f11) + f12;
                }
            } else {
                measureText = this.f10204nc.measureText(str.substring(i13, i13 + 1)) + f12;
            }
            if (charAt == ' ') {
                z11 = true;
                f15 = measureText;
            } else if (z11) {
                z11 = false;
                i12 = i13;
                f14 = measureText;
            } else {
                f14 += measureText;
            }
            f13 += measureText;
            if (f10 > 0.0f && f13 >= f10 && charAt != ' ') {
                i10++;
                YFl Sg = Sg(i10);
                if (i12 == i11) {
                    Sg.YFl(str.substring(i11, i13).trim(), (f13 - measureText) - ((r9.length() - r7.length()) * f15));
                    i11 = i13;
                    i12 = i11;
                    f13 = measureText;
                    f14 = f13;
                } else {
                    Sg.YFl(str.substring(i11, i12 - 1).trim(), ((f13 - f14) - ((r7.length() - r13.length()) * f15)) - f15);
                    f13 = f14;
                    i11 = i12;
                }
            }
        }
        if (f13 > 0.0f) {
            i10++;
            Sg(i10).YFl(str.substring(i11), f13);
        }
        return this.pDU.subList(0, i10);
    }

    private void YFl(com.bytedance.adsdk.Sg.tN.AlY alY, float f10, com.bytedance.adsdk.Sg.tN.Sg sg2, Canvas canvas) {
        List<com.bytedance.adsdk.Sg.YFl.YFl.AlY> YFl2 = YFl(alY);
        for (int i10 = 0; i10 < YFl2.size(); i10++) {
            Path AlY = YFl2.get(i10).AlY();
            AlY.computeBounds(this.qsH, false);
            this.NjR.reset();
            this.NjR.preTranslate(0.0f, com.bytedance.adsdk.Sg.vc.vc.YFl() * (-sg2.DSW));
            this.NjR.preScale(f10, f10);
            AlY.transform(this.NjR);
            if (sg2.eT) {
                YFl(AlY, this.f10204nc, canvas);
                YFl(AlY, this.eT, canvas);
            } else {
                YFl(AlY, this.eT, canvas);
                YFl(AlY, this.f10204nc, canvas);
            }
        }
    }

    private void YFl(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void YFl(String str, com.bytedance.adsdk.Sg.tN.Sg sg2, Canvas canvas) {
        if (sg2.eT) {
            YFl(str, this.f10204nc, canvas);
            YFl(str, this.eT, canvas);
        } else {
            YFl(str, this.eT, canvas);
            YFl(str, this.f10204nc, canvas);
        }
    }

    private void YFl(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private List<com.bytedance.adsdk.Sg.YFl.YFl.AlY> YFl(com.bytedance.adsdk.Sg.tN.AlY alY) {
        if (this.YoT.containsKey(alY)) {
            return this.YoT.get(alY);
        }
        List<rkt> YFl2 = alY.YFl();
        int size = YFl2.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new com.bytedance.adsdk.Sg.YFl.YFl.AlY(this.rkt, this, YFl2.get(i10), this.lG));
        }
        this.YoT.put(alY, arrayList);
        return arrayList;
    }

    private String YFl(String str, int i10) {
        int codePointAt = str.codePointAt(i10);
        int charCount = Character.charCount(codePointAt) + i10;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (!tN(codePointAt2)) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        long j3 = codePointAt;
        if (this.GA.indexOfKey(j3) >= 0) {
            return this.GA.get(j3);
        }
        this.DSW.setLength(0);
        while (i10 < charCount) {
            int codePointAt3 = str.codePointAt(i10);
            this.DSW.appendCodePoint(codePointAt3);
            i10 += Character.charCount(codePointAt3);
        }
        String sb2 = this.DSW.toString();
        this.GA.put(j3, sb2);
        return sb2;
    }
}

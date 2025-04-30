package com.bytedance.adsdk.lottie.KS.KS;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.LongSparseArray;
import com.bytedance.adsdk.lottie.KS.lMd;
import com.bytedance.adsdk.lottie.KS.lMd.KVG;
import com.bytedance.adsdk.lottie.KS.zp.Bj;
import com.bytedance.adsdk.lottie.zp.lMd.dQp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class ku extends com.bytedance.adsdk.lottie.KS.KS.zp {
    private final Paint Bj;
    private com.bytedance.adsdk.lottie.zp.lMd.zp<Integer, Integer> FP;
    private com.bytedance.adsdk.lottie.zp.lMd.zp<Typeface, Typeface> Gzh;
    private final com.bytedance.adsdk.lottie.ku KVG;
    private com.bytedance.adsdk.lottie.zp.lMd.zp<Float, Float> Lij;
    private final StringBuilder QR;
    private com.bytedance.adsdk.lottie.zp.lMd.zp<Float, Float> RCv;
    private final Matrix YW;
    private com.bytedance.adsdk.lottie.zp.lMd.zp<Integer, Integer> cz;
    private final dQp dQp;
    private final Paint dT;
    private final RectF ku;
    private com.bytedance.adsdk.lottie.zp.lMd.zp<Float, Float> ot;
    private com.bytedance.adsdk.lottie.zp.lMd.zp<Float, Float> ox;
    private com.bytedance.adsdk.lottie.zp.lMd.zp<Integer, Integer> pvr;
    private final List<zp> rV;
    private final LongSparseArray<String> tG;
    private final Map<com.bytedance.adsdk.lottie.KS.jU, List<com.bytedance.adsdk.lottie.zp.zp.jU>> vDp;
    private com.bytedance.adsdk.lottie.zp.lMd.zp<Integer, Integer> vwr;
    private final com.bytedance.adsdk.lottie.HWF woN;
    private com.bytedance.adsdk.lottie.zp.lMd.zp<Float, Float> yRU;

    /* renamed from: com.bytedance.adsdk.lottie.KS.KS.ku$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] zp;

        static {
            int[] iArr = new int[lMd.zp.values().length];
            zp = iArr;
            try {
                iArr[lMd.zp.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zp[lMd.zp.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                zp[lMd.zp.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class zp {
        private float lMd;
        private String zp;

        private zp() {
            this.zp = "";
            this.lMd = 0.0f;
        }

        public void zp(String str, float f9) {
            this.zp = str;
            this.lMd = f9;
        }
    }

    public ku(com.bytedance.adsdk.lottie.ku kuVar, jU jUVar) {
        super(kuVar, jUVar);
        com.bytedance.adsdk.lottie.KS.zp.lMd lmd;
        com.bytedance.adsdk.lottie.KS.zp.lMd lmd2;
        com.bytedance.adsdk.lottie.KS.zp.zp zpVar;
        com.bytedance.adsdk.lottie.KS.zp.zp zpVar2;
        this.QR = new StringBuilder(2);
        this.ku = new RectF();
        this.YW = new Matrix();
        int i9 = 1;
        this.dT = new Paint(i9) { // from class: com.bytedance.adsdk.lottie.KS.KS.ku.1
            {
                setStyle(Paint.Style.FILL);
            }
        };
        this.Bj = new Paint(i9) { // from class: com.bytedance.adsdk.lottie.KS.KS.ku.2
            {
                setStyle(Paint.Style.STROKE);
            }
        };
        this.vDp = new HashMap();
        this.tG = new LongSparseArray<>();
        this.rV = new ArrayList();
        this.KVG = kuVar;
        this.woN = jUVar.zp();
        dQp zp2 = jUVar.pvr().zp();
        this.dQp = zp2;
        zp2.zp(this);
        zp(zp2);
        Bj cz = jUVar.cz();
        if (cz != null && (zpVar2 = cz.zp) != null) {
            com.bytedance.adsdk.lottie.zp.lMd.zp<Integer, Integer> zp3 = zpVar2.zp();
            this.vwr = zp3;
            zp3.zp(this);
            zp(this.vwr);
        }
        if (cz != null && (zpVar = cz.lMd) != null) {
            com.bytedance.adsdk.lottie.zp.lMd.zp<Integer, Integer> zp4 = zpVar.zp();
            this.cz = zp4;
            zp4.zp(this);
            zp(this.cz);
        }
        if (cz != null && (lmd2 = cz.KS) != null) {
            com.bytedance.adsdk.lottie.zp.lMd.zp<Float, Float> zp5 = lmd2.zp();
            this.ot = zp5;
            zp5.zp(this);
            zp(this.ot);
        }
        if (cz != null && (lmd = cz.jU) != null) {
            com.bytedance.adsdk.lottie.zp.lMd.zp<Float, Float> zp6 = lmd.zp();
            this.ox = zp6;
            zp6.zp(this);
            zp(this.ox);
        }
    }

    @Override // com.bytedance.adsdk.lottie.KS.KS.zp
    public void lMd(Canvas canvas, Matrix matrix, int i9) {
        com.bytedance.adsdk.lottie.KS.lMd QR = this.dQp.QR();
        com.bytedance.adsdk.lottie.KS.KS ks = this.woN.Bj().get(QR.lMd);
        if (ks == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        zp(QR, matrix);
        if (this.KVG.FP()) {
            zp(QR, matrix, ks, canvas);
        } else {
            zp(QR, ks, canvas);
        }
        canvas.restore();
    }

    @Override // com.bytedance.adsdk.lottie.KS.KS.zp, com.bytedance.adsdk.lottie.zp.zp.COT
    public void zp(RectF rectF, Matrix matrix, boolean z8) {
        super.zp(rectF, matrix, z8);
        rectF.set(0.0f, 0.0f, this.woN.jU().width(), this.woN.jU().height());
    }

    private void zp(com.bytedance.adsdk.lottie.KS.lMd lmd, Matrix matrix) {
        com.bytedance.adsdk.lottie.zp.lMd.zp<Integer, Integer> zpVar = this.pvr;
        if (zpVar != null) {
            this.dT.setColor(zpVar.QR().intValue());
        } else {
            com.bytedance.adsdk.lottie.zp.lMd.zp<Integer, Integer> zpVar2 = this.vwr;
            if (zpVar2 != null) {
                this.dT.setColor(zpVar2.QR().intValue());
            } else {
                this.dT.setColor(lmd.ku);
            }
        }
        com.bytedance.adsdk.lottie.zp.lMd.zp<Integer, Integer> zpVar3 = this.FP;
        if (zpVar3 != null) {
            this.Bj.setColor(zpVar3.QR().intValue());
        } else {
            com.bytedance.adsdk.lottie.zp.lMd.zp<Integer, Integer> zpVar4 = this.cz;
            if (zpVar4 != null) {
                this.Bj.setColor(zpVar4.QR().intValue());
            } else {
                this.Bj.setColor(lmd.YW);
            }
        }
        int intValue = ((this.jU.zp() == null ? 100 : this.jU.zp().QR().intValue()) * 255) / 100;
        this.dT.setAlpha(intValue);
        this.Bj.setAlpha(intValue);
        com.bytedance.adsdk.lottie.zp.lMd.zp<Float, Float> zpVar5 = this.yRU;
        if (zpVar5 != null) {
            this.Bj.setStrokeWidth(zpVar5.QR().floatValue());
            return;
        }
        com.bytedance.adsdk.lottie.zp.lMd.zp<Float, Float> zpVar6 = this.ot;
        if (zpVar6 != null) {
            this.Bj.setStrokeWidth(zpVar6.QR().floatValue());
        } else {
            this.Bj.setStrokeWidth(com.bytedance.adsdk.lottie.HWF.HWF.zp() * lmd.dT);
        }
    }

    private boolean lMd(int i9) {
        return Character.getType(i9) == 16 || Character.getType(i9) == 27 || Character.getType(i9) == 6 || Character.getType(i9) == 28 || Character.getType(i9) == 8 || Character.getType(i9) == 19;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void zp(com.bytedance.adsdk.lottie.KS.lMd r21, android.graphics.Matrix r22, com.bytedance.adsdk.lottie.KS.KS r23, android.graphics.Canvas r24) {
        /*
            r20 = this;
            r8 = r20
            r9 = r21
            com.bytedance.adsdk.lottie.zp.lMd.zp<java.lang.Float, java.lang.Float> r0 = r8.Lij
            if (r0 == 0) goto L13
            java.lang.Object r0 = r0.QR()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            goto L15
        L13:
            float r0 = r9.KS
        L15:
            r1 = 1120403456(0x42c80000, float:100.0)
            float r10 = r0 / r1
            float r11 = com.bytedance.adsdk.lottie.HWF.HWF.zp(r22)
            java.lang.String r0 = r9.zp
            java.util.List r12 = r8.zp(r0)
            int r13 = r12.size()
            int r0 = r9.COT
            float r0 = (float) r0
            r1 = 1092616192(0x41200000, float:10.0)
            float r0 = r0 / r1
            com.bytedance.adsdk.lottie.zp.lMd.zp<java.lang.Float, java.lang.Float> r1 = r8.RCv
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r1.QR()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
        L3b:
            float r0 = r0 + r1
        L3c:
            r14 = r0
            goto L4d
        L3e:
            com.bytedance.adsdk.lottie.zp.lMd.zp<java.lang.Float, java.lang.Float> r1 = r8.ox
            if (r1 == 0) goto L3c
            java.lang.Object r1 = r1.QR()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            goto L3b
        L4d:
            r15 = 0
            r0 = -1
            r7 = r0
            r6 = r15
        L51:
            if (r6 >= r13) goto Lb2
            java.lang.Object r0 = r12.get(r6)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            android.graphics.PointF r0 = r9.tG
            if (r0 != 0) goto L61
            r0 = 0
        L5f:
            r2 = r0
            goto L64
        L61:
            float r0 = r0.x
            goto L5f
        L64:
            r16 = 1
            r0 = r20
            r3 = r23
            r4 = r10
            r5 = r14
            r17 = r6
            r6 = r16
            java.util.List r6 = r0.zp(r1, r2, r3, r4, r5, r6)
            r5 = r15
        L75:
            int r0 = r6.size()
            if (r5 >= r0) goto Laf
            java.lang.Object r0 = r6.get(r5)
            com.bytedance.adsdk.lottie.KS.KS.ku$zp r0 = (com.bytedance.adsdk.lottie.KS.KS.ku.zp) r0
            int r7 = r7 + 1
            r24.save()
            float r1 = com.bytedance.adsdk.lottie.KS.KS.ku.zp.zp(r0)
            r4 = r24
            r8.zp(r4, r9, r7, r1)
            java.lang.String r1 = com.bytedance.adsdk.lottie.KS.KS.ku.zp.lMd(r0)
            r0 = r20
            r2 = r21
            r3 = r23
            r16 = r5
            r5 = r11
            r18 = r6
            r6 = r10
            r19 = r7
            r7 = r14
            r0.zp(r1, r2, r3, r4, r5, r6, r7)
            r24.restore()
            int r5 = r16 + 1
            r6 = r18
            r7 = r19
            goto L75
        Laf:
            int r6 = r17 + 1
            goto L51
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.lottie.KS.KS.ku.zp(com.bytedance.adsdk.lottie.KS.lMd, android.graphics.Matrix, com.bytedance.adsdk.lottie.KS.KS, android.graphics.Canvas):void");
    }

    private void zp(String str, com.bytedance.adsdk.lottie.KS.lMd lmd, com.bytedance.adsdk.lottie.KS.KS ks, Canvas canvas, float f9, float f10, float f11) {
        for (int i9 = 0; i9 < str.length(); i9++) {
            com.bytedance.adsdk.lottie.KS.jU jUVar = this.woN.dT().get(com.bytedance.adsdk.lottie.KS.jU.zp(str.charAt(i9), ks.zp(), ks.KS()));
            if (jUVar != null) {
                zp(jUVar, f10, lmd, canvas);
                canvas.translate((com.bytedance.adsdk.lottie.HWF.HWF.zp() * ((float) jUVar.lMd()) * f10) + f11, 0.0f);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void zp(com.bytedance.adsdk.lottie.KS.lMd r19, com.bytedance.adsdk.lottie.KS.KS r20, android.graphics.Canvas r21) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            android.graphics.Typeface r0 = r7.zp(r9)
            if (r0 != 0) goto Lf
            return
        Lf:
            java.lang.String r1 = r8.zp
            com.bytedance.adsdk.lottie.ku r2 = r7.KVG
            com.bytedance.adsdk.lottie.pvr r2 = r2.cz()
            if (r2 == 0) goto L21
            java.lang.String r3 = r18.COT()
            java.lang.String r1 = r2.lMd(r3, r1)
        L21:
            android.graphics.Paint r2 = r7.dT
            r2.setTypeface(r0)
            com.bytedance.adsdk.lottie.zp.lMd.zp<java.lang.Float, java.lang.Float> r0 = r7.Lij
            if (r0 == 0) goto L35
            java.lang.Object r0 = r0.QR()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            goto L37
        L35:
            float r0 = r8.KS
        L37:
            android.graphics.Paint r2 = r7.dT
            float r3 = com.bytedance.adsdk.lottie.HWF.HWF.zp()
            float r3 = r3 * r0
            r2.setTextSize(r3)
            android.graphics.Paint r2 = r7.Bj
            android.graphics.Paint r3 = r7.dT
            android.graphics.Typeface r3 = r3.getTypeface()
            r2.setTypeface(r3)
            android.graphics.Paint r2 = r7.Bj
            android.graphics.Paint r3 = r7.dT
            float r3 = r3.getTextSize()
            r2.setTextSize(r3)
            int r2 = r8.COT
            float r2 = (float) r2
            r3 = 1092616192(0x41200000, float:10.0)
            float r2 = r2 / r3
            com.bytedance.adsdk.lottie.zp.lMd.zp<java.lang.Float, java.lang.Float> r3 = r7.RCv
            if (r3 == 0) goto L6d
            java.lang.Object r3 = r3.QR()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
        L6b:
            float r2 = r2 + r3
            goto L7c
        L6d:
            com.bytedance.adsdk.lottie.zp.lMd.zp<java.lang.Float, java.lang.Float> r3 = r7.ox
            if (r3 == 0) goto L7c
            java.lang.Object r3 = r3.QR()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            goto L6b
        L7c:
            float r3 = com.bytedance.adsdk.lottie.HWF.HWF.zp()
            float r3 = r3 * r2
            float r3 = r3 * r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r11 = r3 / r0
            java.util.List r12 = r7.zp(r1)
            int r13 = r12.size()
            r14 = 0
            r0 = -1
            r15 = r0
            r6 = r14
        L92:
            if (r6 >= r13) goto Lde
            java.lang.Object r0 = r12.get(r6)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            android.graphics.PointF r0 = r8.tG
            if (r0 != 0) goto La2
            r0 = 0
        La0:
            r2 = r0
            goto La5
        La2:
            float r0 = r0.x
            goto La0
        La5:
            r4 = 0
            r16 = 0
            r0 = r18
            r3 = r20
            r5 = r11
            r17 = r6
            r6 = r16
            java.util.List r0 = r0.zp(r1, r2, r3, r4, r5, r6)
            r1 = r14
        Lb6:
            int r2 = r0.size()
            if (r1 >= r2) goto Ldb
            java.lang.Object r2 = r0.get(r1)
            com.bytedance.adsdk.lottie.KS.KS.ku$zp r2 = (com.bytedance.adsdk.lottie.KS.KS.ku.zp) r2
            int r15 = r15 + 1
            r21.save()
            float r3 = com.bytedance.adsdk.lottie.KS.KS.ku.zp.zp(r2)
            r7.zp(r10, r8, r15, r3)
            java.lang.String r2 = com.bytedance.adsdk.lottie.KS.KS.ku.zp.lMd(r2)
            r7.zp(r2, r8, r10, r11)
            r21.restore()
            int r1 = r1 + 1
            goto Lb6
        Ldb:
            int r6 = r17 + 1
            goto L92
        Lde:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.lottie.KS.KS.ku.zp(com.bytedance.adsdk.lottie.KS.lMd, com.bytedance.adsdk.lottie.KS.KS, android.graphics.Canvas):void");
    }

    private void zp(Canvas canvas, com.bytedance.adsdk.lottie.KS.lMd lmd, int i9, float f9) {
        PointF pointF = lmd.vDp;
        PointF pointF2 = lmd.tG;
        float zp2 = com.bytedance.adsdk.lottie.HWF.HWF.zp();
        float f10 = (i9 * lmd.HWF * zp2) + (pointF == null ? 0.0f : (lmd.HWF * 0.6f * zp2) + pointF.y);
        float f11 = pointF == null ? 0.0f : pointF.x;
        float f12 = pointF2 != null ? pointF2.x : 0.0f;
        int i10 = AnonymousClass3.zp[lmd.jU.ordinal()];
        if (i10 == 1) {
            canvas.translate(f11, f10);
        } else if (i10 == 2) {
            canvas.translate((f11 + f12) - f9, f10);
        } else {
            if (i10 != 3) {
                return;
            }
            canvas.translate(((f12 / 2.0f) + f11) - (f9 / 2.0f), f10);
        }
    }

    private Typeface zp(com.bytedance.adsdk.lottie.KS.KS ks) {
        Typeface QR;
        com.bytedance.adsdk.lottie.zp.lMd.zp<Typeface, Typeface> zpVar = this.Gzh;
        if (zpVar != null && (QR = zpVar.QR()) != null) {
            return QR;
        }
        Typeface zp2 = this.KVG.zp(ks);
        return zp2 != null ? zp2 : ks.jU();
    }

    private List<String> zp(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    private void zp(String str, com.bytedance.adsdk.lottie.KS.lMd lmd, Canvas canvas, float f9) {
        int i9 = 0;
        while (i9 < str.length()) {
            String zp2 = zp(str, i9);
            i9 += zp2.length();
            zp(zp2, lmd, canvas);
            canvas.translate(this.dT.measureText(zp2) + f9, 0.0f);
        }
    }

    private List<zp> zp(String str, float f9, com.bytedance.adsdk.lottie.KS.KS ks, float f10, float f11, boolean z8) {
        float measureText;
        int i9 = 0;
        int i10 = 0;
        boolean z9 = false;
        int i11 = 0;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        for (int i12 = 0; i12 < str.length(); i12++) {
            char charAt = str.charAt(i12);
            if (z8) {
                com.bytedance.adsdk.lottie.KS.jU jUVar = this.woN.dT().get(com.bytedance.adsdk.lottie.KS.jU.zp(charAt, ks.zp(), ks.KS()));
                if (jUVar != null) {
                    measureText = (com.bytedance.adsdk.lottie.HWF.HWF.zp() * ((float) jUVar.lMd()) * f10) + f11;
                }
            } else {
                measureText = this.dT.measureText(str.substring(i12, i12 + 1)) + f11;
            }
            if (charAt == ' ') {
                z9 = true;
                f14 = measureText;
            } else if (z9) {
                z9 = false;
                i11 = i12;
                f13 = measureText;
            } else {
                f13 += measureText;
            }
            f12 += measureText;
            if (f9 > 0.0f && f12 >= f9 && charAt != ' ') {
                i9++;
                zp zp2 = zp(i9);
                if (i11 == i10) {
                    zp2.zp(str.substring(i10, i12).trim(), (f12 - measureText) - ((r9.length() - r7.length()) * f14));
                    i10 = i12;
                    i11 = i10;
                    f12 = measureText;
                    f13 = f12;
                } else {
                    zp2.zp(str.substring(i10, i11 - 1).trim(), ((f12 - f13) - ((r7.length() - r13.length()) * f14)) - f14);
                    f12 = f13;
                    i10 = i11;
                }
            }
        }
        if (f12 > 0.0f) {
            i9++;
            zp(i9).zp(str.substring(i10), f12);
        }
        return this.rV.subList(0, i9);
    }

    private zp zp(int i9) {
        for (int size = this.rV.size(); size < i9; size++) {
            this.rV.add(new zp());
        }
        return this.rV.get(i9 - 1);
    }

    private void zp(com.bytedance.adsdk.lottie.KS.jU jUVar, float f9, com.bytedance.adsdk.lottie.KS.lMd lmd, Canvas canvas) {
        List<com.bytedance.adsdk.lottie.zp.zp.jU> zp2 = zp(jUVar);
        for (int i9 = 0; i9 < zp2.size(); i9++) {
            Path jU = zp2.get(i9).jU();
            jU.computeBounds(this.ku, false);
            this.YW.reset();
            this.YW.preTranslate(0.0f, com.bytedance.adsdk.lottie.HWF.HWF.zp() * (-lmd.QR));
            this.YW.preScale(f9, f9);
            jU.transform(this.YW);
            if (lmd.Bj) {
                zp(jU, this.dT, canvas);
                zp(jU, this.Bj, canvas);
            } else {
                zp(jU, this.Bj, canvas);
                zp(jU, this.dT, canvas);
            }
        }
    }

    private void zp(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void zp(String str, com.bytedance.adsdk.lottie.KS.lMd lmd, Canvas canvas) {
        if (lmd.Bj) {
            zp(str, this.dT, canvas);
            zp(str, this.Bj, canvas);
        } else {
            zp(str, this.Bj, canvas);
            zp(str, this.dT, canvas);
        }
    }

    private void zp(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private List<com.bytedance.adsdk.lottie.zp.zp.jU> zp(com.bytedance.adsdk.lottie.KS.jU jUVar) {
        if (this.vDp.containsKey(jUVar)) {
            return this.vDp.get(jUVar);
        }
        List<KVG> zp2 = jUVar.zp();
        int size = zp2.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i9 = 0; i9 < size; i9++) {
            arrayList.add(new com.bytedance.adsdk.lottie.zp.zp.jU(this.KVG, this, zp2.get(i9), this.woN));
        }
        this.vDp.put(jUVar, arrayList);
        return arrayList;
    }

    private String zp(String str, int i9) {
        int codePointAt = str.codePointAt(i9);
        int charCount = Character.charCount(codePointAt) + i9;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (!lMd(codePointAt2)) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        long j7 = codePointAt;
        if (this.tG.indexOfKey(j7) >= 0) {
            return this.tG.get(j7);
        }
        this.QR.setLength(0);
        while (i9 < charCount) {
            int codePointAt3 = str.codePointAt(i9);
            this.QR.appendCodePoint(codePointAt3);
            i9 += Character.charCount(codePointAt3);
        }
        String sb = this.QR.toString();
        this.tG.put(j7, sb);
        return sb;
    }
}

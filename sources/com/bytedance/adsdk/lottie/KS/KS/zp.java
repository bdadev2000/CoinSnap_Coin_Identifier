package com.bytedance.adsdk.lottie.KS.KS;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.lottie.COT.dT;
import com.bytedance.adsdk.lottie.KS.KS.jU;
import com.bytedance.adsdk.lottie.KS.lMd.ku;
import com.bytedance.adsdk.lottie.KS.lMd.rV;
import com.bytedance.adsdk.lottie.zp.lMd.KVG;
import com.bytedance.adsdk.lottie.zp.lMd.zp;
import com.bytedance.component.sdk.annotation.FloatRange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class zp implements zp.InterfaceC0063zp, com.bytedance.adsdk.lottie.zp.zp.COT {
    private final Paint Bj;
    float COT;
    private com.bytedance.adsdk.lottie.zp.lMd.ku FP;
    private boolean Gzh;
    BlurMaskFilter HWF;
    final jU KS;
    private final RectF KVG;
    private final List<com.bytedance.adsdk.lottie.zp.lMd.zp<?, ?>> Lij;
    private Paint QUv;
    private List<zp> RCv;
    private final String cz;
    private final RectF dQp;
    private boolean irS;
    final KVG jU;
    final com.bytedance.adsdk.lottie.ku lMd;
    private com.bytedance.adsdk.lottie.zp.lMd.jU ot;
    private zp ox;
    private final RectF pvr;
    private final Paint rV;
    private final Paint tG;
    private final Paint vDp;
    private final RectF vwr;
    private final RectF woN;
    private zp yRU;
    final Matrix zp;
    private final Path QR = new Path();
    private final Matrix ku = new Matrix();
    private final Matrix YW = new Matrix();
    private final Paint dT = new com.bytedance.adsdk.lottie.zp.zp(1);

    /* renamed from: com.bytedance.adsdk.lottie.KS.KS.zp$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] lMd;
        static final /* synthetic */ int[] zp;

        static {
            int[] iArr = new int[ku.zp.values().length];
            lMd = iArr;
            try {
                iArr[ku.zp.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                lMd[ku.zp.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                lMd[ku.zp.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                lMd[ku.zp.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[jU.zp.values().length];
            zp = iArr2;
            try {
                iArr2[jU.zp.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                zp[jU.zp.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                zp[jU.zp.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                zp[jU.zp.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                zp[jU.zp.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                zp[jU.zp.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                zp[jU.zp.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public zp(com.bytedance.adsdk.lottie.ku kuVar, jU jUVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.Bj = new com.bytedance.adsdk.lottie.zp.zp(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.vDp = new com.bytedance.adsdk.lottie.zp.zp(1, mode2);
        com.bytedance.adsdk.lottie.zp.zp zpVar = new com.bytedance.adsdk.lottie.zp.zp(1);
        this.tG = zpVar;
        this.rV = new com.bytedance.adsdk.lottie.zp.zp(PorterDuff.Mode.CLEAR);
        this.dQp = new RectF();
        this.KVG = new RectF();
        this.woN = new RectF();
        this.vwr = new RectF();
        this.pvr = new RectF();
        this.zp = new Matrix();
        this.Lij = new ArrayList();
        this.Gzh = true;
        this.COT = 0.0f;
        this.lMd = kuVar;
        this.KS = jUVar;
        this.cz = jUVar.HWF() + "#draw";
        if (jUVar.vDp() == jU.lMd.INVERT) {
            zpVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            zpVar.setXfermode(new PorterDuffXfermode(mode));
        }
        KVG dT = jUVar.dQp().dT();
        this.jU = dT;
        dT.zp((zp.InterfaceC0063zp) this);
        if (jUVar.dT() != null && !jUVar.dT().isEmpty()) {
            com.bytedance.adsdk.lottie.zp.lMd.ku kuVar2 = new com.bytedance.adsdk.lottie.zp.lMd.ku(jUVar.dT());
            this.FP = kuVar2;
            Iterator<com.bytedance.adsdk.lottie.zp.lMd.zp<rV, Path>> it = kuVar2.lMd().iterator();
            while (it.hasNext()) {
                it.next().zp(this);
            }
            for (com.bytedance.adsdk.lottie.zp.lMd.zp<Integer, Integer> zpVar2 : this.FP.KS()) {
                zp(zpVar2);
                zpVar2.zp(this);
            }
        }
        ku();
    }

    private void Bj() {
        if (this.RCv != null) {
            return;
        }
        if (this.ox == null) {
            this.RCv = Collections.emptyList();
            return;
        }
        this.RCv = new ArrayList();
        for (zp zpVar = this.ox; zpVar != null; zpVar = zpVar.ox) {
            this.RCv.add(zpVar);
        }
    }

    private void COT(Canvas canvas, Matrix matrix, com.bytedance.adsdk.lottie.zp.lMd.zp<rV, Path> zpVar, com.bytedance.adsdk.lottie.zp.lMd.zp<Integer, Integer> zpVar2) {
        com.bytedance.adsdk.lottie.HWF.HWF.zp(canvas, this.dQp, this.Bj);
        canvas.drawRect(this.dQp, this.dT);
        this.vDp.setAlpha((int) (zpVar2.QR().intValue() * 2.55f));
        this.QR.set(zpVar.QR());
        this.QR.transform(matrix);
        canvas.drawPath(this.QR, this.vDp);
        canvas.restore();
    }

    private void YW() {
        this.lMd.invalidateSelf();
    }

    private boolean dT() {
        if (this.FP.lMd().isEmpty()) {
            return false;
        }
        for (int i9 = 0; i9 < this.FP.zp().size(); i9++) {
            if (this.FP.zp().get(i9).zp() != ku.zp.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    private void jU(Canvas canvas, Matrix matrix, com.bytedance.adsdk.lottie.zp.lMd.zp<rV, Path> zpVar, com.bytedance.adsdk.lottie.zp.lMd.zp<Integer, Integer> zpVar2) {
        com.bytedance.adsdk.lottie.HWF.HWF.zp(canvas, this.dQp, this.Bj);
        this.QR.set(zpVar.QR());
        this.QR.transform(matrix);
        this.dT.setAlpha((int) (zpVar2.QR().intValue() * 2.55f));
        canvas.drawPath(this.QR, this.dT);
        canvas.restore();
    }

    private void ku() {
        boolean z8 = true;
        if (!this.KS.jU().isEmpty()) {
            com.bytedance.adsdk.lottie.zp.lMd.jU jUVar = new com.bytedance.adsdk.lottie.zp.lMd.jU(this.KS.jU());
            this.ot = jUVar;
            jUVar.zp();
            this.ot.zp(new zp.InterfaceC0063zp() { // from class: com.bytedance.adsdk.lottie.KS.KS.zp.1
                @Override // com.bytedance.adsdk.lottie.zp.lMd.zp.InterfaceC0063zp
                public void zp() {
                    boolean z9;
                    zp zpVar = zp.this;
                    if (zpVar.ot.YW() == 1.0f) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    zpVar.lMd(z9);
                }
            });
            if (this.ot.QR().floatValue() != 1.0f) {
                z8 = false;
            }
            lMd(z8);
            zp(this.ot);
            return;
        }
        lMd(true);
    }

    public com.bytedance.adsdk.lottie.KS.lMd.zp HWF() {
        return this.KS.yRU();
    }

    public dT QR() {
        return this.KS.ox();
    }

    public jU lMd() {
        return this.KS;
    }

    public abstract void lMd(Canvas canvas, Matrix matrix, int i9);

    @Override // com.bytedance.adsdk.lottie.zp.zp.KS
    public void zp(List<com.bytedance.adsdk.lottie.zp.zp.KS> list, List<com.bytedance.adsdk.lottie.zp.zp.KS> list2) {
    }

    public boolean KS() {
        return this.yRU != null;
    }

    public void lMd(zp zpVar) {
        this.ox = zpVar;
    }

    private void KS(float f9) {
        this.lMd.ot().KS().zp(this.KS.HWF(), f9);
    }

    private void lMd(RectF rectF, Matrix matrix) {
        if (KS() && this.KS.vDp() != jU.lMd.INVERT) {
            this.vwr.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.yRU.zp(this.vwr, matrix, true);
            if (rectF.intersect(this.vwr)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    public static zp zp(lMd lmd, jU jUVar, com.bytedance.adsdk.lottie.ku kuVar, com.bytedance.adsdk.lottie.HWF hwf) {
        switch (AnonymousClass2.zp[jUVar.Bj().ordinal()]) {
            case 1:
                return new HWF(kuVar, jUVar, lmd, hwf);
            case 2:
                return new lMd(kuVar, jUVar, hwf.lMd(jUVar.QR()), hwf);
            case 3:
                return new QR(kuVar, jUVar);
            case 4:
                return new KS(kuVar, jUVar);
            case 5:
                return new COT(kuVar, jUVar);
            case 6:
                return new ku(kuVar, jUVar);
            default:
                Objects.toString(jUVar.Bj());
                return null;
        }
    }

    private void KS(Canvas canvas, Matrix matrix, com.bytedance.adsdk.lottie.zp.lMd.zp<rV, Path> zpVar, com.bytedance.adsdk.lottie.zp.lMd.zp<Integer, Integer> zpVar2) {
        com.bytedance.adsdk.lottie.HWF.HWF.zp(canvas, this.dQp, this.vDp);
        canvas.drawRect(this.dQp, this.dT);
        this.vDp.setAlpha((int) (zpVar2.QR().intValue() * 2.55f));
        this.QR.set(zpVar.QR());
        this.QR.transform(matrix);
        canvas.drawPath(this.QR, this.vDp);
        canvas.restore();
    }

    public boolean jU() {
        com.bytedance.adsdk.lottie.zp.lMd.ku kuVar = this.FP;
        return (kuVar == null || kuVar.lMd().isEmpty()) ? false : true;
    }

    private void lMd(Canvas canvas, Matrix matrix, com.bytedance.adsdk.lottie.zp.lMd.zp<rV, Path> zpVar, com.bytedance.adsdk.lottie.zp.lMd.zp<Integer, Integer> zpVar2) {
        com.bytedance.adsdk.lottie.HWF.HWF.zp(canvas, this.dQp, this.dT);
        canvas.drawRect(this.dQp, this.dT);
        this.QR.set(zpVar.QR());
        this.QR.transform(matrix);
        this.dT.setAlpha((int) (zpVar2.QR().intValue() * 2.55f));
        canvas.drawPath(this.QR, this.vDp);
        canvas.restore();
    }

    public String COT() {
        return this.KS.HWF();
    }

    public void zp(boolean z8) {
        if (z8 && this.QUv == null) {
            this.QUv = new com.bytedance.adsdk.lottie.zp.zp();
        }
        this.irS = z8;
    }

    @Override // com.bytedance.adsdk.lottie.zp.lMd.zp.InterfaceC0063zp
    public void zp() {
        YW();
    }

    public void zp(zp zpVar) {
        this.yRU = zpVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lMd(boolean z8) {
        if (z8 != this.Gzh) {
            this.Gzh = z8;
            YW();
        }
    }

    public void zp(com.bytedance.adsdk.lottie.zp.lMd.zp<?, ?> zpVar) {
        if (zpVar == null) {
            return;
        }
        this.Lij.add(zpVar);
    }

    public void zp(RectF rectF, Matrix matrix, boolean z8) {
        this.dQp.set(0.0f, 0.0f, 0.0f, 0.0f);
        Bj();
        this.zp.set(matrix);
        if (z8) {
            List<zp> list = this.RCv;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.zp.preConcat(this.RCv.get(size).jU.jU());
                }
            } else {
                zp zpVar = this.ox;
                if (zpVar != null) {
                    this.zp.preConcat(zpVar.jU.jU());
                }
            }
        }
        this.zp.preConcat(this.jU.jU());
    }

    public BlurMaskFilter lMd(float f9) {
        if (this.COT == f9) {
            return this.HWF;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f9 / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.HWF = blurMaskFilter;
        this.COT = f9;
        return blurMaskFilter;
    }

    @Override // com.bytedance.adsdk.lottie.zp.zp.COT
    public void zp(Canvas canvas, Matrix matrix, int i9) {
        Paint paint;
        Integer QR;
        com.bytedance.adsdk.lottie.COT.zp(this.cz);
        if (this.Gzh && !this.KS.ot()) {
            Bj();
            com.bytedance.adsdk.lottie.COT.zp("Layer#parentMatrix");
            this.ku.reset();
            this.ku.set(matrix);
            for (int size = this.RCv.size() - 1; size >= 0; size--) {
                this.ku.preConcat(this.RCv.get(size).jU.jU());
            }
            com.bytedance.adsdk.lottie.COT.lMd("Layer#parentMatrix");
            com.bytedance.adsdk.lottie.zp.lMd.zp<?, Integer> zp = this.jU.zp();
            int intValue = (int) ((((i9 / 255.0f) * ((zp == null || (QR = zp.QR()) == null) ? 100 : QR.intValue())) / 100.0f) * 255.0f);
            if (!KS() && !jU()) {
                this.ku.preConcat(this.jU.jU());
                com.bytedance.adsdk.lottie.COT.zp("Layer#drawLayer");
                lMd(canvas, this.ku, intValue);
                com.bytedance.adsdk.lottie.COT.lMd("Layer#drawLayer");
                KS(com.bytedance.adsdk.lottie.COT.lMd(this.cz));
                return;
            }
            com.bytedance.adsdk.lottie.COT.zp("Layer#computeBounds");
            zp(this.dQp, this.ku, false);
            lMd(this.dQp, matrix);
            this.ku.preConcat(this.jU.jU());
            zp(this.dQp, this.ku);
            this.KVG.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
            canvas.getMatrix(this.YW);
            if (!this.YW.isIdentity()) {
                Matrix matrix2 = this.YW;
                matrix2.invert(matrix2);
                this.YW.mapRect(this.KVG);
            }
            if (!this.dQp.intersect(this.KVG)) {
                this.dQp.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
            com.bytedance.adsdk.lottie.COT.lMd("Layer#computeBounds");
            if (this.dQp.width() >= 1.0f && this.dQp.height() >= 1.0f) {
                com.bytedance.adsdk.lottie.COT.zp("Layer#saveLayer");
                this.dT.setAlpha(255);
                com.bytedance.adsdk.lottie.HWF.HWF.zp(canvas, this.dQp, this.dT);
                com.bytedance.adsdk.lottie.COT.lMd("Layer#saveLayer");
                zp(canvas);
                com.bytedance.adsdk.lottie.COT.zp("Layer#drawLayer");
                lMd(canvas, this.ku, intValue);
                com.bytedance.adsdk.lottie.COT.lMd("Layer#drawLayer");
                if (jU()) {
                    zp(canvas, this.ku);
                }
                if (KS()) {
                    com.bytedance.adsdk.lottie.COT.zp("Layer#drawMatte");
                    com.bytedance.adsdk.lottie.COT.zp("Layer#saveLayer");
                    com.bytedance.adsdk.lottie.HWF.HWF.zp(canvas, this.dQp, this.tG, 19);
                    com.bytedance.adsdk.lottie.COT.lMd("Layer#saveLayer");
                    zp(canvas);
                    this.yRU.zp(canvas, matrix, intValue);
                    com.bytedance.adsdk.lottie.COT.zp("Layer#restoreLayer");
                    canvas.restore();
                    com.bytedance.adsdk.lottie.COT.lMd("Layer#restoreLayer");
                    com.bytedance.adsdk.lottie.COT.lMd("Layer#drawMatte");
                }
                com.bytedance.adsdk.lottie.COT.zp("Layer#restoreLayer");
                canvas.restore();
                com.bytedance.adsdk.lottie.COT.lMd("Layer#restoreLayer");
            }
            if (this.irS && (paint = this.QUv) != null) {
                paint.setStyle(Paint.Style.STROKE);
                this.QUv.setColor(-251901);
                this.QUv.setStrokeWidth(4.0f);
                canvas.drawRect(this.dQp, this.QUv);
                this.QUv.setStyle(Paint.Style.FILL);
                this.QUv.setColor(1357638635);
                canvas.drawRect(this.dQp, this.QUv);
            }
            KS(com.bytedance.adsdk.lottie.COT.lMd(this.cz));
            return;
        }
        com.bytedance.adsdk.lottie.COT.lMd(this.cz);
    }

    private void zp(Canvas canvas) {
        com.bytedance.adsdk.lottie.COT.zp("Layer#clearLayer");
        RectF rectF = this.dQp;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.rV);
        com.bytedance.adsdk.lottie.COT.lMd("Layer#clearLayer");
    }

    private void zp(RectF rectF, Matrix matrix) {
        this.woN.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (jU()) {
            int size = this.FP.zp().size();
            for (int i9 = 0; i9 < size; i9++) {
                com.bytedance.adsdk.lottie.KS.lMd.ku kuVar = this.FP.zp().get(i9);
                Path QR = this.FP.lMd().get(i9).QR();
                if (QR != null) {
                    this.QR.set(QR);
                    this.QR.transform(matrix);
                    int i10 = AnonymousClass2.lMd[kuVar.zp().ordinal()];
                    if (i10 == 1 || i10 == 2) {
                        return;
                    }
                    if ((i10 == 3 || i10 == 4) && kuVar.jU()) {
                        return;
                    }
                    this.QR.computeBounds(this.pvr, false);
                    if (i9 == 0) {
                        this.woN.set(this.pvr);
                    } else {
                        RectF rectF2 = this.woN;
                        rectF2.set(Math.min(rectF2.left, this.pvr.left), Math.min(this.woN.top, this.pvr.top), Math.max(this.woN.right, this.pvr.right), Math.max(this.woN.bottom, this.pvr.bottom));
                    }
                }
            }
            if (rectF.intersect(this.woN)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void zp(Canvas canvas, Matrix matrix) {
        com.bytedance.adsdk.lottie.COT.zp("Layer#saveLayer");
        com.bytedance.adsdk.lottie.HWF.HWF.zp(canvas, this.dQp, this.Bj, 19);
        if (Build.VERSION.SDK_INT < 28) {
            zp(canvas);
        }
        com.bytedance.adsdk.lottie.COT.lMd("Layer#saveLayer");
        for (int i9 = 0; i9 < this.FP.zp().size(); i9++) {
            com.bytedance.adsdk.lottie.KS.lMd.ku kuVar = this.FP.zp().get(i9);
            com.bytedance.adsdk.lottie.zp.lMd.zp<rV, Path> zpVar = this.FP.lMd().get(i9);
            com.bytedance.adsdk.lottie.zp.lMd.zp<Integer, Integer> zpVar2 = this.FP.KS().get(i9);
            int i10 = AnonymousClass2.lMd[kuVar.zp().ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    if (i9 == 0) {
                        this.dT.setColor(ViewCompat.MEASURED_STATE_MASK);
                        this.dT.setAlpha(255);
                        canvas.drawRect(this.dQp, this.dT);
                    }
                    if (kuVar.jU()) {
                        KS(canvas, matrix, zpVar, zpVar2);
                    } else {
                        zp(canvas, matrix, zpVar);
                    }
                } else if (i10 != 3) {
                    if (i10 == 4) {
                        if (kuVar.jU()) {
                            lMd(canvas, matrix, zpVar, zpVar2);
                        } else {
                            zp(canvas, matrix, zpVar, zpVar2);
                        }
                    }
                } else if (kuVar.jU()) {
                    COT(canvas, matrix, zpVar, zpVar2);
                } else {
                    jU(canvas, matrix, zpVar, zpVar2);
                }
            } else if (dT()) {
                this.dT.setAlpha(255);
                canvas.drawRect(this.dQp, this.dT);
            }
        }
        com.bytedance.adsdk.lottie.COT.zp("Layer#restoreLayer");
        canvas.restore();
        com.bytedance.adsdk.lottie.COT.lMd("Layer#restoreLayer");
    }

    private void zp(Canvas canvas, Matrix matrix, com.bytedance.adsdk.lottie.zp.lMd.zp<rV, Path> zpVar, com.bytedance.adsdk.lottie.zp.lMd.zp<Integer, Integer> zpVar2) {
        this.QR.set(zpVar.QR());
        this.QR.transform(matrix);
        this.dT.setAlpha((int) (zpVar2.QR().intValue() * 2.55f));
        canvas.drawPath(this.QR, this.dT);
    }

    private void zp(Canvas canvas, Matrix matrix, com.bytedance.adsdk.lottie.zp.lMd.zp<rV, Path> zpVar) {
        this.QR.set(zpVar.QR());
        this.QR.transform(matrix);
        canvas.drawPath(this.QR, this.vDp);
    }

    public void zp(@FloatRange(from = 0.0d, to = 1.0d) float f9) {
        this.jU.zp(f9);
        if (this.FP != null) {
            for (int i9 = 0; i9 < this.FP.lMd().size(); i9++) {
                this.FP.lMd().get(i9).zp(f9);
            }
        }
        com.bytedance.adsdk.lottie.zp.lMd.jU jUVar = this.ot;
        if (jUVar != null) {
            jUVar.zp(f9);
        }
        zp zpVar = this.yRU;
        if (zpVar != null) {
            zpVar.zp(f9);
        }
        for (int i10 = 0; i10 < this.Lij.size(); i10++) {
            this.Lij.get(i10).zp(f9);
        }
    }
}

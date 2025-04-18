package com.bytedance.adsdk.Sg.tN.tN;

import android.content.Context;
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
import com.bytedance.adsdk.Sg.YFl.Sg.YFl;
import com.bytedance.adsdk.Sg.YFl.Sg.rkt;
import com.bytedance.adsdk.Sg.tN.Sg.pDU;
import com.bytedance.adsdk.Sg.tN.Sg.qsH;
import com.bytedance.adsdk.Sg.tN.tN.wN;
import com.bytedance.adsdk.Sg.wN.nc;
import com.bytedance.component.sdk.annotation.FloatRange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class YFl implements YFl.InterfaceC0054YFl, com.bytedance.adsdk.Sg.YFl.YFl.wN {
    final rkt AlY;
    private Paint Cfr;
    private final RectF EH;
    private final Paint GA;
    private boolean Ga;
    private com.bytedance.adsdk.Sg.YFl.Sg.AlY Ne;
    final com.bytedance.adsdk.Sg.NjR Sg;
    private List<YFl> UZM;
    private YFl VOe;
    private final RectF Wwa;
    final Matrix YFl;
    private final List<com.bytedance.adsdk.Sg.YFl.Sg.YFl<?, ?>> YI;
    private final String aIu;
    private YFl bZ;
    private boolean dXO;
    private final Matrix hQ;
    private final RectF lG;
    private final Paint pDU;
    private float pq;
    private final RectF qO;
    private final RectF rkt;
    final wN tN;

    /* renamed from: vc, reason: collision with root package name */
    BlurMaskFilter f10207vc;
    float wN;
    private com.bytedance.adsdk.Sg.YFl.Sg.qsH wXo;
    private final Path DSW = new Path();
    private final Matrix qsH = new Matrix();
    private final Matrix NjR = new Matrix();

    /* renamed from: nc, reason: collision with root package name */
    private final Paint f10206nc = new com.bytedance.adsdk.Sg.YFl.YFl(1);
    private final Paint eT = new com.bytedance.adsdk.Sg.YFl.YFl(1, PorterDuff.Mode.DST_IN);
    private final Paint YoT = new com.bytedance.adsdk.Sg.YFl.YFl(1, PorterDuff.Mode.DST_OUT);

    /* renamed from: com.bytedance.adsdk.Sg.tN.tN.YFl$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] Sg;
        static final /* synthetic */ int[] YFl;

        static {
            int[] iArr = new int[qsH.YFl.values().length];
            Sg = iArr;
            try {
                iArr[qsH.YFl.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Sg[qsH.YFl.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Sg[qsH.YFl.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Sg[qsH.YFl.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[wN.YFl.values().length];
            YFl = iArr2;
            try {
                iArr2[wN.YFl.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                YFl[wN.YFl.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                YFl[wN.YFl.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                YFl[wN.YFl.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                YFl[wN.YFl.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                YFl[wN.YFl.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                YFl[wN.YFl.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public YFl(com.bytedance.adsdk.Sg.NjR njR, wN wNVar) {
        com.bytedance.adsdk.Sg.YFl.YFl yFl = new com.bytedance.adsdk.Sg.YFl.YFl(1);
        this.GA = yFl;
        this.pDU = new com.bytedance.adsdk.Sg.YFl.YFl(PorterDuff.Mode.CLEAR);
        this.EH = new RectF();
        this.rkt = new RectF();
        this.lG = new RectF();
        this.Wwa = new RectF();
        this.qO = new RectF();
        this.YFl = new Matrix();
        this.YI = new ArrayList();
        this.Ga = true;
        this.wN = 0.0f;
        this.hQ = new Matrix();
        this.pq = 1.0f;
        this.Sg = njR;
        this.tN = wNVar;
        this.aIu = wNVar.vc() + "#draw";
        if (wNVar.YoT() == wN.Sg.INVERT) {
            yFl.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            yFl.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        rkt nc2 = wNVar.EH().nc();
        this.AlY = nc2;
        nc2.YFl((YFl.InterfaceC0054YFl) this);
        if (wNVar.nc() != null && !wNVar.nc().isEmpty()) {
            com.bytedance.adsdk.Sg.YFl.Sg.qsH qsh = new com.bytedance.adsdk.Sg.YFl.Sg.qsH(wNVar.nc());
            this.wXo = qsh;
            Iterator<com.bytedance.adsdk.Sg.YFl.Sg.YFl<pDU, Path>> it = qsh.Sg().iterator();
            while (it.hasNext()) {
                it.next().YFl(this);
            }
            for (com.bytedance.adsdk.Sg.YFl.Sg.YFl<Integer, Integer> yFl2 : this.wXo.tN()) {
                YFl(yFl2);
                yFl2.YFl(this);
            }
        }
        YoT();
    }

    private void EH() {
        if (this.UZM != null) {
            return;
        }
        if (this.bZ == null) {
            this.UZM = Collections.emptyList();
            return;
        }
        this.UZM = new ArrayList();
        for (YFl yFl = this.bZ; yFl != null; yFl = yFl.bZ) {
            this.UZM.add(yFl);
        }
    }

    private void GA() {
        this.Sg.invalidateSelf();
    }

    private void YoT() {
        boolean z10 = true;
        if (!this.tN.AlY().isEmpty()) {
            com.bytedance.adsdk.Sg.YFl.Sg.AlY alY = new com.bytedance.adsdk.Sg.YFl.Sg.AlY(this.tN.AlY());
            this.Ne = alY;
            alY.YFl();
            this.Ne.YFl(new YFl.InterfaceC0054YFl() { // from class: com.bytedance.adsdk.Sg.tN.tN.YFl.1
                @Override // com.bytedance.adsdk.Sg.YFl.Sg.YFl.InterfaceC0054YFl
                public void YFl() {
                    YFl yFl = YFl.this;
                    yFl.Sg(yFl.Ne.NjR() == 1.0f);
                }
            });
            if (this.Ne.DSW().floatValue() != 1.0f) {
                z10 = false;
            }
            Sg(z10);
            YFl(this.Ne);
            return;
        }
        Sg(true);
    }

    private boolean pDU() {
        if (this.wXo.Sg().isEmpty()) {
            return false;
        }
        for (int i10 = 0; i10 < this.wXo.YFl().size(); i10++) {
            if (this.wXo.YFl().get(i10).YFl() != qsH.YFl.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    public Matrix AlY() {
        return this.hQ;
    }

    public boolean DSW() {
        com.bytedance.adsdk.Sg.YFl.Sg.qsH qsh = this.wXo;
        return (qsh == null || qsh.Sg().isEmpty()) ? false : true;
    }

    public String NjR() {
        return this.tN.vc();
    }

    public wN Sg() {
        return this.tN;
    }

    @Override // com.bytedance.adsdk.Sg.YFl.YFl.tN
    public void YFl(List<com.bytedance.adsdk.Sg.YFl.YFl.tN> list, List<com.bytedance.adsdk.Sg.YFl.YFl.tN> list2) {
    }

    public nc eT() {
        return this.tN.bZ();
    }

    public com.bytedance.adsdk.Sg.tN.Sg.YFl nc() {
        return this.tN.VOe();
    }

    public boolean qsH() {
        return this.Ga;
    }

    public float vc() {
        return this.pq;
    }

    public String wN() {
        wN wNVar = this.tN;
        if (wNVar != null) {
            return wNVar.DSW();
        }
        return null;
    }

    private void AlY(Canvas canvas, Matrix matrix, com.bytedance.adsdk.Sg.YFl.Sg.YFl<pDU, Path> yFl, com.bytedance.adsdk.Sg.YFl.Sg.YFl<Integer, Integer> yFl2) {
        com.bytedance.adsdk.Sg.vc.vc.YFl(canvas, this.EH, this.eT);
        this.DSW.set(yFl.DSW());
        this.DSW.transform(matrix);
        this.f10206nc.setAlpha((int) (yFl2.DSW().intValue() * 2.55f));
        canvas.drawPath(this.DSW, this.f10206nc);
        canvas.restore();
    }

    public void Sg(YFl yFl) {
        this.bZ = yFl;
    }

    public boolean tN() {
        return this.VOe != null;
    }

    private void Sg(RectF rectF, Matrix matrix) {
        if (tN() && this.tN.YoT() != wN.Sg.INVERT) {
            this.Wwa.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.VOe.YFl(this.Wwa, matrix, true);
            if (rectF.intersect(this.Wwa)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    public static YFl YFl(Sg sg2, wN wNVar, com.bytedance.adsdk.Sg.NjR njR, com.bytedance.adsdk.Sg.DSW dsw, Context context) {
        switch (AnonymousClass2.YFl[wNVar.eT().ordinal()]) {
            case 1:
                return new DSW(njR, wNVar, sg2, dsw);
            case 2:
                return new Sg(njR, wNVar, dsw.Sg(wNVar.DSW()), dsw, context);
            case 3:
                return new qsH(njR, wNVar);
            case 4:
                if (YFl(njR, wNVar)) {
                    return new tN(njR, wNVar, context);
                }
                return new AlY(njR, wNVar);
            case 5:
                return new vc(njR, wNVar);
            case 6:
                return new NjR(njR, wNVar);
            default:
                Objects.toString(wNVar.eT());
                return null;
        }
    }

    private void tN(float f10) {
        this.Sg.bZ().tN().YFl(this.tN.vc(), f10);
    }

    private void wN(Canvas canvas, Matrix matrix, com.bytedance.adsdk.Sg.YFl.Sg.YFl<pDU, Path> yFl, com.bytedance.adsdk.Sg.YFl.Sg.YFl<Integer, Integer> yFl2) {
        com.bytedance.adsdk.Sg.vc.vc.YFl(canvas, this.EH, this.eT);
        canvas.drawRect(this.EH, this.f10206nc);
        this.YoT.setAlpha((int) (yFl2.DSW().intValue() * 2.55f));
        this.DSW.set(yFl.DSW());
        this.DSW.transform(matrix);
        canvas.drawPath(this.DSW, this.YoT);
        canvas.restore();
    }

    private void tN(Canvas canvas, Matrix matrix, com.bytedance.adsdk.Sg.YFl.Sg.YFl<pDU, Path> yFl, com.bytedance.adsdk.Sg.YFl.Sg.YFl<Integer, Integer> yFl2) {
        com.bytedance.adsdk.Sg.vc.vc.YFl(canvas, this.EH, this.YoT);
        canvas.drawRect(this.EH, this.f10206nc);
        this.YoT.setAlpha((int) (yFl2.DSW().intValue() * 2.55f));
        this.DSW.set(yFl.DSW());
        this.DSW.transform(matrix);
        canvas.drawPath(this.DSW, this.YoT);
        canvas.restore();
    }

    public void Sg(Canvas canvas, Matrix matrix, int i10) {
        YFl(i10);
    }

    private void Sg(Canvas canvas, Matrix matrix, com.bytedance.adsdk.Sg.YFl.Sg.YFl<pDU, Path> yFl, com.bytedance.adsdk.Sg.YFl.Sg.YFl<Integer, Integer> yFl2) {
        com.bytedance.adsdk.Sg.vc.vc.YFl(canvas, this.EH, this.f10206nc);
        canvas.drawRect(this.EH, this.f10206nc);
        this.DSW.set(yFl.DSW());
        this.DSW.transform(matrix);
        this.f10206nc.setAlpha((int) (yFl2.DSW().intValue() * 2.55f));
        canvas.drawPath(this.DSW, this.YoT);
        canvas.restore();
    }

    private static boolean YFl(com.bytedance.adsdk.Sg.NjR njR, wN wNVar) {
        com.bytedance.adsdk.Sg.nc vc2;
        if (njR == null || wNVar == null || (vc2 = njR.vc(wNVar.DSW())) == null) {
            return false;
        }
        return "text:".equals(vc2.NjR());
    }

    public void YFl(boolean z10) {
        if (z10 && this.Cfr == null) {
            this.Cfr = new com.bytedance.adsdk.Sg.YFl.YFl();
        }
        this.dXO = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sg(boolean z10) {
        if (z10 != this.Ga) {
            this.Ga = z10;
            GA();
        }
    }

    @Override // com.bytedance.adsdk.Sg.YFl.Sg.YFl.InterfaceC0054YFl
    public void YFl() {
        GA();
    }

    public void YFl(YFl yFl) {
        this.VOe = yFl;
    }

    public BlurMaskFilter Sg(float f10) {
        if (this.wN == f10) {
            return this.f10207vc;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f10 / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.f10207vc = blurMaskFilter;
        this.wN = f10;
        return blurMaskFilter;
    }

    public void YFl(com.bytedance.adsdk.Sg.YFl.Sg.YFl<?, ?> yFl) {
        if (yFl == null) {
            return;
        }
        this.YI.add(yFl);
    }

    public void YFl(RectF rectF, Matrix matrix, boolean z10) {
        this.EH.set(0.0f, 0.0f, 0.0f, 0.0f);
        EH();
        this.YFl.set(matrix);
        if (z10) {
            List<YFl> list = this.UZM;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.YFl.preConcat(this.UZM.get(size).AlY.AlY());
                }
            } else {
                YFl yFl = this.bZ;
                if (yFl != null) {
                    this.YFl.preConcat(yFl.AlY.AlY());
                }
            }
        }
        this.YFl.preConcat(this.AlY.AlY());
    }

    @Override // com.bytedance.adsdk.Sg.YFl.YFl.wN
    public void YFl(Canvas canvas, Matrix matrix, int i10) {
        Paint paint;
        Integer DSW;
        com.bytedance.adsdk.Sg.wN.YFl(this.aIu);
        if (this.Ga && !this.tN.Ne()) {
            EH();
            com.bytedance.adsdk.Sg.wN.YFl("Layer#parentMatrix");
            this.hQ.set(matrix);
            this.qsH.reset();
            this.qsH.set(matrix);
            for (int size = this.UZM.size() - 1; size >= 0; size--) {
                this.qsH.preConcat(this.UZM.get(size).AlY.AlY());
            }
            com.bytedance.adsdk.Sg.wN.Sg("Layer#parentMatrix");
            com.bytedance.adsdk.Sg.YFl.Sg.YFl<?, Integer> YFl = this.AlY.YFl();
            int intValue = (int) ((((i10 / 255.0f) * ((YFl == null || (DSW = YFl.DSW()) == null) ? 100 : DSW.intValue())) / 100.0f) * 255.0f);
            if (!tN() && !DSW()) {
                this.qsH.preConcat(this.AlY.AlY());
                com.bytedance.adsdk.Sg.wN.YFl("Layer#drawLayer");
                Sg(canvas, this.qsH, intValue);
                com.bytedance.adsdk.Sg.wN.Sg("Layer#drawLayer");
                tN(com.bytedance.adsdk.Sg.wN.Sg(this.aIu));
                return;
            }
            com.bytedance.adsdk.Sg.wN.YFl("Layer#computeBounds");
            YFl(this.EH, this.qsH, false);
            Sg(this.EH, matrix);
            this.qsH.preConcat(this.AlY.AlY());
            YFl(this.EH, this.qsH);
            this.rkt.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
            canvas.getMatrix(this.NjR);
            if (!this.NjR.isIdentity()) {
                Matrix matrix2 = this.NjR;
                matrix2.invert(matrix2);
                this.NjR.mapRect(this.rkt);
            }
            if (!this.EH.intersect(this.rkt)) {
                this.EH.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
            com.bytedance.adsdk.Sg.wN.Sg("Layer#computeBounds");
            if (this.EH.width() >= 1.0f && this.EH.height() >= 1.0f) {
                com.bytedance.adsdk.Sg.wN.YFl("Layer#saveLayer");
                this.f10206nc.setAlpha(255);
                com.bytedance.adsdk.Sg.vc.vc.YFl(canvas, this.EH, this.f10206nc);
                com.bytedance.adsdk.Sg.wN.Sg("Layer#saveLayer");
                YFl(canvas);
                com.bytedance.adsdk.Sg.wN.YFl("Layer#drawLayer");
                Sg(canvas, this.qsH, intValue);
                com.bytedance.adsdk.Sg.wN.Sg("Layer#drawLayer");
                if (DSW()) {
                    YFl(canvas, this.qsH);
                }
                if (tN()) {
                    com.bytedance.adsdk.Sg.wN.YFl("Layer#drawMatte");
                    com.bytedance.adsdk.Sg.wN.YFl("Layer#saveLayer");
                    com.bytedance.adsdk.Sg.vc.vc.YFl(canvas, this.EH, this.GA, 19);
                    com.bytedance.adsdk.Sg.wN.Sg("Layer#saveLayer");
                    YFl(canvas);
                    this.VOe.YFl(canvas, matrix, intValue);
                    com.bytedance.adsdk.Sg.wN.YFl("Layer#restoreLayer");
                    canvas.restore();
                    com.bytedance.adsdk.Sg.wN.Sg("Layer#restoreLayer");
                    com.bytedance.adsdk.Sg.wN.Sg("Layer#drawMatte");
                }
                com.bytedance.adsdk.Sg.wN.YFl("Layer#restoreLayer");
                canvas.restore();
                com.bytedance.adsdk.Sg.wN.Sg("Layer#restoreLayer");
            }
            if (this.dXO && (paint = this.Cfr) != null) {
                paint.setStyle(Paint.Style.STROKE);
                this.Cfr.setColor(-251901);
                this.Cfr.setStrokeWidth(4.0f);
                canvas.drawRect(this.EH, this.Cfr);
                this.Cfr.setStyle(Paint.Style.FILL);
                this.Cfr.setColor(1357638635);
                canvas.drawRect(this.EH, this.Cfr);
            }
            tN(com.bytedance.adsdk.Sg.wN.Sg(this.aIu));
            return;
        }
        com.bytedance.adsdk.Sg.wN.Sg(this.aIu);
    }

    private void YFl(Canvas canvas) {
        com.bytedance.adsdk.Sg.wN.YFl("Layer#clearLayer");
        RectF rectF = this.EH;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.pDU);
        com.bytedance.adsdk.Sg.wN.Sg("Layer#clearLayer");
    }

    private void YFl(RectF rectF, Matrix matrix) {
        this.lG.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (DSW()) {
            int size = this.wXo.YFl().size();
            for (int i10 = 0; i10 < size; i10++) {
                com.bytedance.adsdk.Sg.tN.Sg.qsH qsh = this.wXo.YFl().get(i10);
                Path DSW = this.wXo.Sg().get(i10).DSW();
                if (DSW != null) {
                    this.DSW.set(DSW);
                    this.DSW.transform(matrix);
                    int i11 = AnonymousClass2.Sg[qsh.YFl().ordinal()];
                    if (i11 == 1 || i11 == 2) {
                        return;
                    }
                    if ((i11 == 3 || i11 == 4) && qsh.AlY()) {
                        return;
                    }
                    this.DSW.computeBounds(this.qO, false);
                    if (i10 == 0) {
                        this.lG.set(this.qO);
                    } else {
                        RectF rectF2 = this.lG;
                        rectF2.set(Math.min(rectF2.left, this.qO.left), Math.min(this.lG.top, this.qO.top), Math.max(this.lG.right, this.qO.right), Math.max(this.lG.bottom, this.qO.bottom));
                    }
                }
            }
            if (rectF.intersect(this.lG)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    public void YFl(int i10) {
        this.pq = (i10 / 255.0f) * ((this.AlY.YFl() != null ? this.AlY.YFl().DSW().intValue() : 100) / 100.0f);
    }

    private void YFl(Canvas canvas, Matrix matrix) {
        com.bytedance.adsdk.Sg.wN.YFl("Layer#saveLayer");
        com.bytedance.adsdk.Sg.vc.vc.YFl(canvas, this.EH, this.eT, 19);
        if (Build.VERSION.SDK_INT < 28) {
            YFl(canvas);
        }
        com.bytedance.adsdk.Sg.wN.Sg("Layer#saveLayer");
        for (int i10 = 0; i10 < this.wXo.YFl().size(); i10++) {
            com.bytedance.adsdk.Sg.tN.Sg.qsH qsh = this.wXo.YFl().get(i10);
            com.bytedance.adsdk.Sg.YFl.Sg.YFl<pDU, Path> yFl = this.wXo.Sg().get(i10);
            com.bytedance.adsdk.Sg.YFl.Sg.YFl<Integer, Integer> yFl2 = this.wXo.tN().get(i10);
            int i11 = AnonymousClass2.Sg[qsh.YFl().ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    if (i10 == 0) {
                        this.f10206nc.setColor(ViewCompat.MEASURED_STATE_MASK);
                        this.f10206nc.setAlpha(255);
                        canvas.drawRect(this.EH, this.f10206nc);
                    }
                    if (qsh.AlY()) {
                        tN(canvas, matrix, yFl, yFl2);
                    } else {
                        YFl(canvas, matrix, yFl);
                    }
                } else if (i11 != 3) {
                    if (i11 == 4) {
                        if (qsh.AlY()) {
                            Sg(canvas, matrix, yFl, yFl2);
                        } else {
                            YFl(canvas, matrix, yFl, yFl2);
                        }
                    }
                } else if (qsh.AlY()) {
                    wN(canvas, matrix, yFl, yFl2);
                } else {
                    AlY(canvas, matrix, yFl, yFl2);
                }
            } else if (pDU()) {
                this.f10206nc.setAlpha(255);
                canvas.drawRect(this.EH, this.f10206nc);
            }
        }
        com.bytedance.adsdk.Sg.wN.YFl("Layer#restoreLayer");
        canvas.restore();
        com.bytedance.adsdk.Sg.wN.Sg("Layer#restoreLayer");
    }

    private void YFl(Canvas canvas, Matrix matrix, com.bytedance.adsdk.Sg.YFl.Sg.YFl<pDU, Path> yFl, com.bytedance.adsdk.Sg.YFl.Sg.YFl<Integer, Integer> yFl2) {
        this.DSW.set(yFl.DSW());
        this.DSW.transform(matrix);
        this.f10206nc.setAlpha((int) (yFl2.DSW().intValue() * 2.55f));
        canvas.drawPath(this.DSW, this.f10206nc);
    }

    private void YFl(Canvas canvas, Matrix matrix, com.bytedance.adsdk.Sg.YFl.Sg.YFl<pDU, Path> yFl) {
        this.DSW.set(yFl.DSW());
        this.DSW.transform(matrix);
        canvas.drawPath(this.DSW, this.YoT);
    }

    public void YFl(@FloatRange(from = 0.0d, to = 1.0d) float f10) {
        this.AlY.YFl(f10);
        if (this.wXo != null) {
            for (int i10 = 0; i10 < this.wXo.Sg().size(); i10++) {
                this.wXo.Sg().get(i10).YFl(f10);
            }
        }
        com.bytedance.adsdk.Sg.YFl.Sg.AlY alY = this.Ne;
        if (alY != null) {
            alY.YFl(f10);
        }
        YFl yFl = this.VOe;
        if (yFl != null) {
            yFl.YFl(f10);
        }
        for (int i11 = 0; i11 < this.YI.size(); i11++) {
            this.YI.get(i11).YFl(f10);
        }
    }
}

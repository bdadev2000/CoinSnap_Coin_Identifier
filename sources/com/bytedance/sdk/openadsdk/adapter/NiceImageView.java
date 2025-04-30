package com.bytedance.sdk.openadsdk.adapter;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.os.Build;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.utils.WNy;

/* loaded from: classes.dex */
public class NiceImageView extends PAGImageView {
    private int Bj;
    private int COT;
    private final RectF FP;
    private int HWF;
    private boolean KS;
    private int KVG;
    private int QR;
    private int YW;
    private RectF cz;
    private int dQp;
    private int dT;
    private int jU;
    private int ku;
    private boolean lMd;
    private final Paint ot;
    private Path ox;
    private final float[] pvr;
    private final Xfermode rV;
    private int tG;
    private int vDp;
    private final float[] vwr;
    private float woN;
    private final Path yRU;
    private final Context zp;

    public NiceImageView(Context context) {
        this(context, null);
    }

    private void KS() {
        if (this.lMd) {
            return;
        }
        int i9 = 0;
        if (this.ku <= 0) {
            float[] fArr = this.vwr;
            int i10 = this.YW;
            float f9 = i10;
            fArr[1] = f9;
            fArr[0] = f9;
            int i11 = this.dT;
            float f10 = i11;
            fArr[3] = f10;
            fArr[2] = f10;
            int i12 = this.vDp;
            float f11 = i12;
            fArr[5] = f11;
            fArr[4] = f11;
            int i13 = this.Bj;
            float f12 = i13;
            fArr[7] = f12;
            fArr[6] = f12;
            float[] fArr2 = this.pvr;
            int i14 = this.jU;
            float f13 = i10 - (i14 / 2.0f);
            fArr2[1] = f13;
            fArr2[0] = f13;
            float f14 = i11 - (i14 / 2.0f);
            fArr2[3] = f14;
            fArr2[2] = f14;
            float f15 = i12 - (i14 / 2.0f);
            fArr2[5] = f15;
            fArr2[4] = f15;
            float f16 = i13 - (i14 / 2.0f);
            fArr2[7] = f16;
            fArr2[6] = f16;
            return;
        }
        while (true) {
            float[] fArr3 = this.vwr;
            if (i9 < fArr3.length) {
                int i15 = this.ku;
                fArr3[i9] = i15;
                this.pvr[i9] = i15 - (this.jU / 2.0f);
                i9++;
            } else {
                return;
            }
        }
    }

    private void jU() {
        if (!this.lMd) {
            this.HWF = 0;
        }
    }

    private void lMd() {
        if (this.lMd) {
            float min = Math.min(this.dQp, this.KVG) / 2.0f;
            this.woN = min;
            RectF rectF = this.cz;
            int i9 = this.dQp;
            int i10 = this.KVG;
            rectF.set((i9 / 2.0f) - min, (i10 / 2.0f) - min, (i9 / 2.0f) + min, (i10 / 2.0f) + min);
            return;
        }
        this.cz.set(0.0f, 0.0f, this.dQp, this.KVG);
        if (this.KS) {
            this.cz = this.FP;
        }
    }

    private void zp(Canvas canvas) {
        if (this.lMd) {
            int i9 = this.jU;
            if (i9 > 0) {
                zp(canvas, i9, this.COT, this.woN - (i9 / 2.0f));
            }
            int i10 = this.HWF;
            if (i10 > 0) {
                zp(canvas, i10, this.QR, (this.woN - this.jU) - (i10 / 2.0f));
                return;
            }
            return;
        }
        int i11 = this.jU;
        if (i11 > 0) {
            zp(canvas, i11, this.COT, this.FP, this.vwr);
        }
    }

    public void isCircle(boolean z8) {
        this.lMd = z8;
        jU();
        lMd();
        invalidate();
    }

    public void isCoverSrc(boolean z8) {
        this.KS = z8;
        lMd();
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        canvas.saveLayer(this.cz, null, 31);
        if (!this.KS) {
            int i9 = this.dQp;
            int i10 = this.jU;
            int i11 = this.HWF;
            int i12 = this.KVG;
            canvas.scale((((i9 - (i10 * 2)) - (i11 * 2)) * 1.0f) / i9, (((i12 - (i10 * 2)) - (i11 * 2)) * 1.0f) / i12, i9 / 2.0f, i12 / 2.0f);
        }
        super.onDraw(canvas);
        this.ot.reset();
        this.yRU.reset();
        if (this.lMd) {
            this.yRU.addCircle(this.dQp / 2.0f, this.KVG / 2.0f, this.woN, Path.Direction.CCW);
        } else {
            this.yRU.addRoundRect(this.cz, this.pvr, Path.Direction.CCW);
        }
        this.ot.setAntiAlias(true);
        this.ot.setStyle(Paint.Style.FILL);
        this.ot.setXfermode(this.rV);
        if (Build.VERSION.SDK_INT <= 27) {
            canvas.drawPath(this.yRU, this.ot);
        } else {
            this.ox.addRect(this.cz, Path.Direction.CCW);
            this.ox.op(this.yRU, Path.Op.DIFFERENCE);
            canvas.drawPath(this.ox, this.ot);
        }
        this.ot.setXfermode(null);
        int i13 = this.tG;
        if (i13 != 0) {
            this.ot.setColor(i13);
            canvas.drawPath(this.yRU, this.ot);
        }
        canvas.restore();
        zp(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        this.dQp = i9;
        this.KVG = i10;
        zp();
        lMd();
    }

    public void setBorderColor(int i9) {
        this.COT = i9;
        invalidate();
    }

    public void setBorderWidth(int i9) {
        this.jU = WNy.lMd(this.zp, i9);
        zp(false);
    }

    public void setCornerBottomLeftRadius(int i9) {
        this.Bj = WNy.lMd(this.zp, i9);
        zp(true);
    }

    public void setCornerBottomRightRadius(int i9) {
        this.vDp = WNy.lMd(this.zp, i9);
        zp(true);
    }

    public void setCornerRadius(int i9) {
        this.ku = WNy.lMd(this.zp, i9);
        zp(false);
    }

    public void setCornerTopLeftRadius(int i9) {
        this.YW = WNy.lMd(this.zp, i9);
        zp(true);
    }

    public void setCornerTopRightRadius(int i9) {
        this.dT = WNy.lMd(this.zp, i9);
        zp(true);
    }

    public void setInnerBorderColor(int i9) {
        this.QR = i9;
        invalidate();
    }

    public void setInnerBorderWidth(int i9) {
        this.HWF = WNy.lMd(this.zp, i9);
        jU();
        invalidate();
    }

    public void setMaskColor(int i9) {
        this.tG = i9;
        invalidate();
    }

    public NiceImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NiceImageView(Context context, @Nullable AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.COT = -1;
        this.QR = -1;
        this.zp = context;
        this.ku = WNy.lMd(context, 10.0f);
        this.vwr = new float[8];
        this.pvr = new float[8];
        this.FP = new RectF();
        this.cz = new RectF();
        this.ot = new Paint();
        this.yRU = new Path();
        if (Build.VERSION.SDK_INT <= 27) {
            this.rV = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        } else {
            this.rV = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
            this.ox = new Path();
        }
        KS();
        jU();
    }

    private void zp(Canvas canvas, int i9, int i10, float f9) {
        zp(i9, i10);
        this.yRU.addCircle(this.dQp / 2.0f, this.KVG / 2.0f, f9, Path.Direction.CCW);
        canvas.drawPath(this.yRU, this.ot);
    }

    private void zp(Canvas canvas, int i9, int i10, RectF rectF, float[] fArr) {
        zp(i9, i10);
        this.yRU.addRoundRect(rectF, fArr, Path.Direction.CCW);
        canvas.drawPath(this.yRU, this.ot);
    }

    private void zp(int i9, int i10) {
        this.yRU.reset();
        this.ot.setStrokeWidth(i9);
        this.ot.setColor(i10);
        this.ot.setStyle(Paint.Style.STROKE);
    }

    private void zp() {
        if (this.lMd) {
            return;
        }
        RectF rectF = this.FP;
        int i9 = this.jU;
        rectF.set(i9 / 2.0f, i9 / 2.0f, this.dQp - (i9 / 2.0f), this.KVG - (i9 / 2.0f));
    }

    private void zp(boolean z8) {
        if (z8) {
            this.ku = 0;
        }
        KS();
        zp();
        invalidate();
    }
}

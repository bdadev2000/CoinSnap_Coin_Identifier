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
import com.bytedance.sdk.openadsdk.core.wN.AlY;
import com.bytedance.sdk.openadsdk.utils.GS;

/* loaded from: classes.dex */
public class NiceImageView extends AlY {
    private int AlY;
    private int DSW;
    private int EH;
    private int GA;
    private final Paint Ne;
    private int NjR;
    private boolean Sg;
    private final Path VOe;
    private final float[] Wwa;
    private final Context YFl;
    private int YoT;
    private RectF aIu;
    private Path bZ;
    private int eT;
    private float lG;

    /* renamed from: nc, reason: collision with root package name */
    private int f10554nc;
    private final Xfermode pDU;
    private final float[] qO;
    private int qsH;
    private int rkt;
    private boolean tN;

    /* renamed from: vc, reason: collision with root package name */
    private int f10555vc;
    private int wN;
    private final RectF wXo;

    public NiceImageView(Context context) {
        this(context, null);
    }

    private void AlY() {
        if (!this.Sg) {
            this.f10555vc = 0;
        }
    }

    private void Sg() {
        if (this.Sg) {
            float min = Math.min(this.EH, this.rkt) / 2.0f;
            this.lG = min;
            RectF rectF = this.aIu;
            int i10 = this.EH;
            int i11 = this.rkt;
            rectF.set((i10 / 2.0f) - min, (i11 / 2.0f) - min, (i10 / 2.0f) + min, (i11 / 2.0f) + min);
            return;
        }
        this.aIu.set(0.0f, 0.0f, this.EH, this.rkt);
        if (this.tN) {
            this.aIu = this.wXo;
        }
    }

    private void YFl(Canvas canvas) {
        if (this.Sg) {
            int i10 = this.AlY;
            if (i10 > 0) {
                YFl(canvas, i10, this.wN, this.lG - (i10 / 2.0f));
            }
            int i11 = this.f10555vc;
            if (i11 > 0) {
                YFl(canvas, i11, this.DSW, (this.lG - this.AlY) - (i11 / 2.0f));
                return;
            }
            return;
        }
        int i12 = this.AlY;
        if (i12 > 0) {
            YFl(canvas, i12, this.wN, this.wXo, this.Wwa);
        }
    }

    private void tN() {
        if (this.Sg) {
            return;
        }
        int i10 = 0;
        if (this.qsH <= 0) {
            float[] fArr = this.Wwa;
            int i11 = this.NjR;
            float f10 = i11;
            fArr[1] = f10;
            fArr[0] = f10;
            int i12 = this.f10554nc;
            float f11 = i12;
            fArr[3] = f11;
            fArr[2] = f11;
            int i13 = this.YoT;
            float f12 = i13;
            fArr[5] = f12;
            fArr[4] = f12;
            int i14 = this.eT;
            float f13 = i14;
            fArr[7] = f13;
            fArr[6] = f13;
            float[] fArr2 = this.qO;
            int i15 = this.AlY;
            float f14 = i11 - (i15 / 2.0f);
            fArr2[1] = f14;
            fArr2[0] = f14;
            float f15 = i12 - (i15 / 2.0f);
            fArr2[3] = f15;
            fArr2[2] = f15;
            float f16 = i13 - (i15 / 2.0f);
            fArr2[5] = f16;
            fArr2[4] = f16;
            float f17 = i14 - (i15 / 2.0f);
            fArr2[7] = f17;
            fArr2[6] = f17;
            return;
        }
        while (true) {
            float[] fArr3 = this.Wwa;
            if (i10 < fArr3.length) {
                int i16 = this.qsH;
                fArr3[i10] = i16;
                this.qO[i10] = i16 - (this.AlY / 2.0f);
                i10++;
            } else {
                return;
            }
        }
    }

    public void isCircle(boolean z10) {
        this.Sg = z10;
        AlY();
        Sg();
        invalidate();
    }

    public void isCoverSrc(boolean z10) {
        this.tN = z10;
        Sg();
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        canvas.saveLayer(this.aIu, null, 31);
        if (!this.tN) {
            int i10 = this.EH;
            int i11 = this.AlY;
            int i12 = this.f10555vc;
            int i13 = this.rkt;
            canvas.scale((((i10 - (i11 * 2)) - (i12 * 2)) * 1.0f) / i10, (((i13 - (i11 * 2)) - (i12 * 2)) * 1.0f) / i13, i10 / 2.0f, i13 / 2.0f);
        }
        super.onDraw(canvas);
        this.Ne.reset();
        this.VOe.reset();
        if (this.Sg) {
            this.VOe.addCircle(this.EH / 2.0f, this.rkt / 2.0f, this.lG, Path.Direction.CCW);
        } else {
            this.VOe.addRoundRect(this.aIu, this.qO, Path.Direction.CCW);
        }
        this.Ne.setAntiAlias(true);
        this.Ne.setStyle(Paint.Style.FILL);
        this.Ne.setXfermode(this.pDU);
        if (Build.VERSION.SDK_INT <= 27) {
            canvas.drawPath(this.VOe, this.Ne);
        } else {
            this.bZ.addRect(this.aIu, Path.Direction.CCW);
            this.bZ.op(this.VOe, Path.Op.DIFFERENCE);
            canvas.drawPath(this.bZ, this.Ne);
        }
        this.Ne.setXfermode(null);
        int i14 = this.GA;
        if (i14 != 0) {
            this.Ne.setColor(i14);
            canvas.drawPath(this.VOe, this.Ne);
        }
        canvas.restore();
        YFl(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.EH = i10;
        this.rkt = i11;
        YFl();
        Sg();
    }

    public void setBorderColor(int i10) {
        this.wN = i10;
        invalidate();
    }

    public void setBorderWidth(int i10) {
        this.AlY = GS.tN(this.YFl, i10);
        YFl(false);
    }

    public void setCornerBottomLeftRadius(int i10) {
        this.eT = GS.tN(this.YFl, i10);
        YFl(true);
    }

    public void setCornerBottomRightRadius(int i10) {
        this.YoT = GS.tN(this.YFl, i10);
        YFl(true);
    }

    public void setCornerRadius(int i10) {
        this.qsH = GS.tN(this.YFl, i10);
        YFl(false);
    }

    public void setCornerTopLeftRadius(int i10) {
        this.NjR = GS.tN(this.YFl, i10);
        YFl(true);
    }

    public void setCornerTopRightRadius(int i10) {
        this.f10554nc = GS.tN(this.YFl, i10);
        YFl(true);
    }

    public void setInnerBorderColor(int i10) {
        this.DSW = i10;
        invalidate();
    }

    public void setInnerBorderWidth(int i10) {
        this.f10555vc = GS.tN(this.YFl, i10);
        AlY();
        invalidate();
    }

    public void setMaskColor(int i10) {
        this.GA = i10;
        invalidate();
    }

    public NiceImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NiceImageView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.wN = -1;
        this.DSW = -1;
        this.YFl = context;
        this.qsH = GS.tN(context, 10.0f);
        this.Wwa = new float[8];
        this.qO = new float[8];
        this.wXo = new RectF();
        this.aIu = new RectF();
        this.Ne = new Paint();
        this.VOe = new Path();
        if (Build.VERSION.SDK_INT <= 27) {
            this.pDU = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        } else {
            this.pDU = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
            this.bZ = new Path();
        }
        tN();
        AlY();
    }

    private void YFl(Canvas canvas, int i10, int i11, float f10) {
        YFl(i10, i11);
        this.VOe.addCircle(this.EH / 2.0f, this.rkt / 2.0f, f10, Path.Direction.CCW);
        canvas.drawPath(this.VOe, this.Ne);
    }

    private void YFl(Canvas canvas, int i10, int i11, RectF rectF, float[] fArr) {
        YFl(i10, i11);
        this.VOe.addRoundRect(rectF, fArr, Path.Direction.CCW);
        canvas.drawPath(this.VOe, this.Ne);
    }

    private void YFl(int i10, int i11) {
        this.VOe.reset();
        this.Ne.setStrokeWidth(i10);
        this.Ne.setColor(i11);
        this.Ne.setStyle(Paint.Style.STROKE);
    }

    private void YFl() {
        if (this.Sg) {
            return;
        }
        RectF rectF = this.wXo;
        int i10 = this.AlY;
        rectF.set(i10 / 2.0f, i10 / 2.0f, this.EH - (i10 / 2.0f), this.rkt - (i10 / 2.0f));
    }

    private void YFl(boolean z10) {
        if (z10) {
            this.qsH = 0;
        }
        tN();
        YFl();
        invalidate();
    }
}

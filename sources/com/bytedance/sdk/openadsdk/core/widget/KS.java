package com.bytedance.sdk.openadsdk.core.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.cz;
import com.bytedance.sdk.openadsdk.core.KVG;

/* loaded from: classes.dex */
public class KS extends Drawable {

    @Nullable
    private Paint Bj;

    @Nullable
    private final LinearGradient COT;
    private final int HWF;

    @Nullable
    private final int[] KS;
    private final int QR;
    private final int YW;

    @Nullable
    private RectF dT;

    @Nullable
    private final float[] jU;
    private final int ku;
    private final int lMd;
    private final int zp;

    /* loaded from: classes.dex */
    public static class zp {
        private LinearGradient COT;
        private int[] KS;
        private int YW;

        @Nullable
        private float[] jU;
        private int ku;
        private int zp = cz.YW(KVG.zp(), "tt_ssxinmian8");
        private int lMd = cz.YW(KVG.zp(), "tt_ssxinxian3");
        private int HWF = 10;
        private int QR = 16;

        public zp() {
            this.ku = 0;
            this.YW = 0;
            this.ku = 0;
            this.YW = 0;
        }

        public zp COT(int i9) {
            this.YW = i9;
            return this;
        }

        public zp KS(int i9) {
            this.HWF = i9;
            return this;
        }

        public zp jU(int i9) {
            this.ku = i9;
            return this;
        }

        public zp lMd(int i9) {
            this.lMd = i9;
            return this;
        }

        public zp zp(int i9) {
            this.zp = i9;
            return this;
        }

        public zp zp(@Nullable int[] iArr) {
            this.KS = iArr;
            return this;
        }

        public KS zp() {
            return new KS(this.zp, this.KS, this.jU, this.lMd, this.COT, this.HWF, this.QR, this.ku, this.YW);
        }
    }

    public KS(int i9, @Nullable int[] iArr, @Nullable float[] fArr, int i10, @Nullable LinearGradient linearGradient, int i11, int i12, int i13, int i14) {
        this.zp = i9;
        this.KS = iArr;
        this.jU = fArr;
        this.lMd = i10;
        this.COT = linearGradient;
        this.HWF = i11;
        this.QR = i12;
        this.ku = i13;
        this.YW = i14;
    }

    private void zp() {
        int[] iArr;
        Paint paint = new Paint();
        this.Bj = paint;
        paint.setAntiAlias(true);
        this.Bj.setShadowLayer(this.QR, this.ku, this.YW, this.lMd);
        if (this.dT != null && (iArr = this.KS) != null && iArr.length > 1) {
            float[] fArr = this.jU;
            boolean z8 = fArr != null && fArr.length > 0 && fArr.length == iArr.length;
            Paint paint2 = this.Bj;
            LinearGradient linearGradient = this.COT;
            if (linearGradient == null) {
                RectF rectF = this.dT;
                linearGradient = new LinearGradient(rectF.left, 0.0f, rectF.right, 0.0f, this.KS, z8 ? this.jU : null, Shader.TileMode.CLAMP);
            }
            paint2.setShader(linearGradient);
            return;
        }
        this.Bj.setColor(this.zp);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (this.dT == null) {
            Rect bounds = getBounds();
            int i9 = bounds.left;
            int i10 = this.QR;
            int i11 = this.ku;
            int i12 = bounds.top + i10;
            int i13 = this.YW;
            this.dT = new RectF((i9 + i10) - i11, i12 - i13, (bounds.right - i10) - i11, (bounds.bottom - i10) - i13);
        }
        if (this.Bj == null) {
            zp();
        }
        RectF rectF = this.dT;
        int i14 = this.HWF;
        canvas.drawRoundRect(rectF, i14, i14, this.Bj);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i9) {
        Paint paint = this.Bj;
        if (paint != null) {
            paint.setAlpha(i9);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        Paint paint = this.Bj;
        if (paint != null) {
            paint.setColorFilter(colorFilter);
        }
    }

    public static void zp(View view, zp zpVar) {
        if (view == null || zpVar == null) {
            return;
        }
        view.setLayerType(1, null);
        view.setBackground(zpVar.zp());
    }
}

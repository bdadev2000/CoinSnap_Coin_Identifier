package com.bytedance.sdk.component.adexpress.widget;

import V1.b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Movie;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.tG;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes.dex */
public class GifView extends ImageView {
    private int Bj;
    private boolean COT;
    private boolean HWF;
    private int KS;
    private float QR;
    private float YW;
    private int dT;
    private AnimatedImageDrawable jU;
    private float ku;
    private long lMd;
    private boolean rV;
    private boolean tG;
    private volatile boolean vDp;
    private Movie zp;

    public GifView(Context context) {
        super(context);
        boolean z8;
        if (Build.VERSION.SDK_INT >= 28) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.COT = z8;
        this.HWF = false;
        this.tG = true;
        this.rV = true;
        zp();
    }

    private void KS() {
        if (this.zp == null) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.lMd == 0) {
            this.lMd = uptimeMillis;
        }
        int duration = this.zp.duration();
        if (duration == 0) {
            duration = 1000;
        }
        if (!this.rV && Math.abs(duration - this.KS) < 60) {
            this.KS = duration;
            this.vDp = true;
        } else {
            this.KS = (int) ((uptimeMillis - this.lMd) % duration);
        }
    }

    private void lMd() {
        if (this.zp != null && !this.COT && this.tG) {
            postInvalidateOnAnimation();
        }
    }

    private void setDrawable(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        setImageDrawable(drawable);
        if (Build.VERSION.SDK_INT >= 28 && b.z(drawable)) {
            AnimatedImageDrawable l = b.l(drawable);
            this.jU = l;
            if (!this.vDp) {
                l.start();
            }
            if (!this.rV) {
                l.setRepeatCount(0);
            }
        }
        lMd();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.zp != null && !this.COT) {
            try {
                if (!this.vDp) {
                    KS();
                    zp(canvas);
                    lMd();
                    return;
                }
                zp(canvas);
                return;
            } catch (Throwable th) {
                tG.zp("GifView", "onDraw->Throwable->", th);
                return;
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z8, int i9, int i10, int i11, int i12) {
        boolean z9;
        super.onLayout(z8, i9, i10, i11, i12);
        if (this.zp != null && !this.COT) {
            this.QR = (getWidth() - this.dT) / 2.0f;
            this.ku = (getHeight() - this.Bj) / 2.0f;
        }
        if (getVisibility() == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.tG = z9;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i9, int i10) {
        Movie movie;
        float f9;
        float f10;
        int size;
        int size2;
        super.onMeasure(i9, i10);
        if (!this.COT && (movie = this.zp) != null) {
            int width = movie.width();
            int height = this.zp.height();
            if (View.MeasureSpec.getMode(i9) != 0 && width > (size2 = View.MeasureSpec.getSize(i9))) {
                f9 = width / size2;
            } else {
                f9 = 1.0f;
            }
            if (View.MeasureSpec.getMode(i10) != 0 && height > (size = View.MeasureSpec.getSize(i10))) {
                f10 = height / size;
            } else {
                f10 = 1.0f;
            }
            float max = 1.0f / Math.max(f9, f10);
            this.YW = max;
            int i11 = (int) (width * max);
            this.dT = i11;
            int i12 = (int) (height * max);
            this.Bj = i12;
            setMeasuredDimension(i11, i12);
        }
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public void onScreenStateChanged(int i9) {
        super.onScreenStateChanged(i9);
        if (this.zp != null) {
            boolean z8 = true;
            if (i9 != 1) {
                z8 = false;
            }
            this.tG = z8;
            lMd();
        }
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public void onVisibilityChanged(View view, int i9) {
        boolean z8;
        super.onVisibilityChanged(view, i9);
        if (this.zp != null) {
            if (i9 == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.tG = z8;
            lMd();
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i9) {
        boolean z8;
        super.onWindowVisibilityChanged(i9);
        if (this.zp != null) {
            if (i9 == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.tG = z8;
            lMd();
        }
    }

    public void setRepeatConfig(boolean z8) {
        AnimatedImageDrawable animatedImageDrawable;
        this.rV = z8;
        if (!z8) {
            try {
                if (Build.VERSION.SDK_INT >= 28 && (animatedImageDrawable = this.jU) != null) {
                    animatedImageDrawable.setRepeatCount(0);
                }
            } catch (Exception e4) {
                tG.zp("GifView", "setRepeatConfig error", e4);
            }
        }
    }

    public void zp() {
        if (this.COT) {
            return;
        }
        setLayerType(1, null);
    }

    private void zp(Canvas canvas) {
        Movie movie = this.zp;
        if (movie == null) {
            return;
        }
        movie.setTime(this.KS);
        float f9 = this.YW;
        if (f9 == 0.0f) {
            canvas.scale(1.0f, 1.0f);
            this.zp.draw(canvas, 0.0f, 0.0f);
        } else {
            canvas.scale(f9, f9);
            Movie movie2 = this.zp;
            float f10 = this.QR;
            float f11 = this.YW;
            movie2.draw(canvas, f10 / f11, this.ku / f11);
        }
        canvas.restore();
    }
}

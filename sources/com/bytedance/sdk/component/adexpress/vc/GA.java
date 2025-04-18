package com.bytedance.sdk.component.adexpress.vc;

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
import androidx.appcompat.widget.b1;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes.dex */
public class GA extends ImageView {
    private AnimatedImageDrawable AlY;
    private float DSW;
    private boolean GA;
    private float NjR;
    private long Sg;
    private Movie YFl;
    private volatile boolean YoT;
    private int eT;

    /* renamed from: nc, reason: collision with root package name */
    private int f10406nc;
    private boolean pDU;
    private float qsH;
    private int tN;

    /* renamed from: vc, reason: collision with root package name */
    private boolean f10407vc;
    private boolean wN;

    public GA(Context context) {
        super(context);
        boolean z10;
        if (Build.VERSION.SDK_INT >= 28) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.wN = z10;
        this.f10407vc = false;
        this.GA = true;
        this.pDU = true;
        YFl();
    }

    private void Sg() {
        if (this.YFl != null && !this.wN && this.GA) {
            postInvalidateOnAnimation();
        }
    }

    private void setDrawable(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        setImageDrawable(drawable);
        if (Build.VERSION.SDK_INT >= 28 && b1.y(drawable)) {
            AnimatedImageDrawable j3 = a.j(drawable);
            this.AlY = j3;
            if (!this.YoT) {
                j3.start();
            }
            if (!this.pDU) {
                j3.setRepeatCount(0);
            }
        }
        Sg();
    }

    private void tN() {
        if (this.YFl == null) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.Sg == 0) {
            this.Sg = uptimeMillis;
        }
        int duration = this.YFl.duration();
        if (duration == 0) {
            duration = 1000;
        }
        if (!this.pDU && Math.abs(duration - this.tN) < 60) {
            this.tN = duration;
            this.YoT = true;
        } else {
            this.tN = (int) ((uptimeMillis - this.Sg) % duration);
        }
    }

    public void YFl() {
        if (this.wN) {
            return;
        }
        setLayerType(1, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.YFl != null && !this.wN) {
            try {
                if (!this.YoT) {
                    tN();
                    YFl(canvas);
                    Sg();
                    return;
                }
                YFl(canvas);
                return;
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.YoT.YFl("GifView", "onDraw->Throwable->", th2);
                return;
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.YFl != null && !this.wN) {
            this.DSW = (getWidth() - this.f10406nc) / 2.0f;
            this.qsH = (getHeight() - this.eT) / 2.0f;
        }
        if (getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.GA = z11;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        Movie movie;
        float f10;
        float f11;
        int size;
        int size2;
        super.onMeasure(i10, i11);
        if (!this.wN && (movie = this.YFl) != null) {
            int width = movie.width();
            int height = this.YFl.height();
            if (View.MeasureSpec.getMode(i10) != 0 && width > (size2 = View.MeasureSpec.getSize(i10))) {
                f10 = width / size2;
            } else {
                f10 = 1.0f;
            }
            if (View.MeasureSpec.getMode(i11) != 0 && height > (size = View.MeasureSpec.getSize(i11))) {
                f11 = height / size;
            } else {
                f11 = 1.0f;
            }
            float max = 1.0f / Math.max(f10, f11);
            this.NjR = max;
            int i12 = (int) (width * max);
            this.f10406nc = i12;
            int i13 = (int) (height * max);
            this.eT = i13;
            setMeasuredDimension(i12, i13);
        }
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public void onScreenStateChanged(int i10) {
        super.onScreenStateChanged(i10);
        if (this.YFl != null) {
            boolean z10 = true;
            if (i10 != 1) {
                z10 = false;
            }
            this.GA = z10;
            Sg();
        }
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public void onVisibilityChanged(View view, int i10) {
        boolean z10;
        super.onVisibilityChanged(view, i10);
        if (this.YFl != null) {
            if (i10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.GA = z10;
            Sg();
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        boolean z10;
        super.onWindowVisibilityChanged(i10);
        if (this.YFl != null) {
            if (i10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.GA = z10;
            Sg();
        }
    }

    public void setRepeatConfig(boolean z10) {
        AnimatedImageDrawable animatedImageDrawable;
        this.pDU = z10;
        if (!z10) {
            try {
                if (Build.VERSION.SDK_INT >= 28 && (animatedImageDrawable = this.AlY) != null) {
                    animatedImageDrawable.setRepeatCount(0);
                }
            } catch (Exception e2) {
                com.bytedance.sdk.component.utils.YoT.YFl("GifView", "setRepeatConfig error", e2);
            }
        }
    }

    private void YFl(Canvas canvas) {
        Movie movie = this.YFl;
        if (movie == null) {
            return;
        }
        movie.setTime(this.tN);
        float f10 = this.NjR;
        if (f10 == 0.0f) {
            canvas.scale(1.0f, 1.0f);
            this.YFl.draw(canvas, 0.0f, 0.0f);
        } else {
            canvas.scale(f10, f10);
            Movie movie2 = this.YFl;
            float f11 = this.DSW;
            float f12 = this.NjR;
            movie2.draw(canvas, f11 / f12, this.qsH / f12);
        }
        canvas.restore();
    }
}

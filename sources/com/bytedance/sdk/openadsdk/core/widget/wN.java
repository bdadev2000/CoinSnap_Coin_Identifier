package com.bytedance.sdk.openadsdk.core.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ImageDecoder;
import android.graphics.Movie;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import java.io.File;
import n0.w0;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes.dex */
public class wN extends ImageView {
    private int AlY;
    private boolean DSW;
    private boolean EH;
    private volatile boolean GA;
    private float NjR;
    private Movie Sg;
    private int YFl;
    private int YoT;
    private int eT;

    /* renamed from: nc, reason: collision with root package name */
    private float f10772nc;
    private boolean pDU;
    private float qsH;
    private long tN;

    /* renamed from: vc, reason: collision with root package name */
    private boolean f10773vc;
    private AnimatedImageDrawable wN;

    public wN(Context context) {
        super(context);
        boolean z10;
        if (Build.VERSION.SDK_INT >= 28) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f10773vc = z10;
        this.DSW = false;
        this.pDU = true;
        this.EH = true;
        YFl();
    }

    private void AlY() {
        if (this.Sg == null) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.tN == 0) {
            this.tN = uptimeMillis;
        }
        int duration = this.Sg.duration();
        if (duration == 0) {
            duration = 1000;
        }
        if (!this.EH && Math.abs(duration - this.AlY) < 60) {
            this.AlY = duration;
            this.GA = true;
        } else {
            this.AlY = (int) ((uptimeMillis - this.tN) % duration);
        }
    }

    private AnimatedImageDrawable Sg(int i10) {
        ImageDecoder.Source createSource;
        if (i10 == -1 || Build.VERSION.SDK_INT < 28) {
            return null;
        }
        createSource = ImageDecoder.createSource(getResources(), i10);
        return YFl(createSource);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003d, code lost:
    
        if (r2 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.graphics.ImageDecoder.Source tN(byte[] r6) {
        /*
            r5 = this;
            r0 = 0
            android.content.Context r1 = r5.getContext()     // Catch: java.lang.Throwable -> L34
            boolean r2 = com.bytedance.sdk.openadsdk.multipro.Sg.tN()     // Catch: java.lang.Throwable -> L34
            if (r2 == 0) goto Le
            java.lang.String r2 = "GIF_AD_CACHE/"
            goto L10
        Le:
            java.lang.String r2 = "/GIF_CACHE/"
        L10:
            java.lang.String r3 = "TT_GIF_FILE"
            java.io.File r1 = YFl(r1, r2, r3)     // Catch: java.lang.Throwable -> L34
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L34
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L34
            int r3 = r6.length     // Catch: java.lang.Throwable -> L32
            r4 = 0
            r2.write(r6, r4, r3)     // Catch: java.lang.Throwable -> L32
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L32
            r3 = 28
            if (r6 < r3) goto L2e
            android.graphics.ImageDecoder$Source r6 = com.bytedance.sdk.component.adexpress.vc.a.i(r1)     // Catch: java.lang.Throwable -> L32
            r2.close()     // Catch: java.lang.Throwable -> L2d
        L2d:
            return r6
        L2e:
            r2.close()     // Catch: java.lang.Throwable -> L40
            goto L40
        L32:
            r6 = move-exception
            goto L36
        L34:
            r6 = move-exception
            r2 = r0
        L36:
            java.lang.String r1 = "GifView"
            java.lang.String r3 = "GifView  getSourceByFile fail : "
            com.bytedance.sdk.component.utils.YoT.YFl(r1, r3, r6)     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L40
            goto L2e
        L40:
            return r0
        L41:
            r6 = move-exception
            if (r2 == 0) goto L47
            r2.close()     // Catch: java.lang.Throwable -> L47
        L47:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.widget.wN.tN(byte[]):android.graphics.ImageDecoder$Source");
    }

    public void YFl() {
        if (this.f10773vc) {
            return;
        }
        setLayerType(1, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.Sg != null && !this.f10773vc) {
            try {
                if (!this.GA) {
                    AlY();
                    YFl(canvas);
                    tN();
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
        if (this.Sg != null && !this.f10773vc) {
            this.qsH = (getWidth() - this.eT) / 2.0f;
            this.NjR = (getHeight() - this.YoT) / 2.0f;
        }
        if (getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.pDU = z11;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        Movie movie;
        float f10;
        float f11;
        int size;
        int size2;
        super.onMeasure(i10, i11);
        if (!this.f10773vc && (movie = this.Sg) != null) {
            int width = movie.width();
            int height = this.Sg.height();
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
            this.f10772nc = max;
            int i12 = (int) (width * max);
            this.eT = i12;
            int i13 = (int) (height * max);
            this.YoT = i13;
            setMeasuredDimension(i12, i13);
        }
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public void onScreenStateChanged(int i10) {
        super.onScreenStateChanged(i10);
        if (this.Sg != null) {
            boolean z10 = true;
            if (i10 != 1) {
                z10 = false;
            }
            this.pDU = z10;
            tN();
        }
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public void onVisibilityChanged(View view, int i10) {
        boolean z10;
        super.onVisibilityChanged(view, i10);
        if (this.Sg != null) {
            if (i10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.pDU = z10;
            tN();
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        boolean z10;
        super.onWindowVisibilityChanged(i10);
        if (this.Sg != null) {
            if (i10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.pDU = z10;
            tN();
        }
    }

    public void setRepeatConfig(boolean z10) {
        AnimatedImageDrawable animatedImageDrawable;
        this.EH = z10;
        if (!z10) {
            try {
                if (Build.VERSION.SDK_INT >= 28 && (animatedImageDrawable = this.wN) != null) {
                    animatedImageDrawable.setRepeatCount(0);
                }
            } catch (Exception e2) {
                com.bytedance.sdk.component.utils.YoT.YFl("GifView", "setRepeatConfig error", e2);
            }
        }
    }

    public void YFl(int i10, boolean z10) {
        this.GA = z10;
        this.YFl = i10;
        if (i10 != -1) {
            if (!this.f10773vc) {
                this.Sg = YFl(i10);
            } else {
                this.wN = Sg(i10);
            }
        }
    }

    private AnimatedImageDrawable Sg(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return YFl(tN(bArr));
    }

    public void Sg() {
        boolean isRunning;
        if (this.Sg == null || !this.GA) {
            return;
        }
        this.GA = false;
        if (!this.f10773vc) {
            this.tN = SystemClock.uptimeMillis() - this.AlY;
            invalidate();
            return;
        }
        AnimatedImageDrawable animatedImageDrawable = this.wN;
        if (animatedImageDrawable != null) {
            isRunning = animatedImageDrawable.isRunning();
            if (isRunning) {
                return;
            }
            this.wN.start();
        }
    }

    public void YFl(byte[] bArr, boolean z10) {
        this.GA = z10;
        if (bArr != null) {
            if (!this.f10773vc) {
                this.Sg = YFl(bArr);
            } else {
                this.wN = Sg(bArr);
            }
            tN();
        }
    }

    private void tN() {
        if (this.Sg == null || this.f10773vc || !this.pDU) {
            return;
        }
        postInvalidateOnAnimation();
    }

    private Movie YFl(int i10) {
        try {
            return Movie.decodeStream(getResources().openRawResource(i10));
        } catch (Throwable unused) {
            return null;
        }
    }

    private Movie YFl(byte[] bArr) {
        try {
            return Movie.decodeByteArray(bArr, 0, bArr.length);
        } catch (Throwable unused) {
            return null;
        }
    }

    private AnimatedImageDrawable YFl(ImageDecoder.Source source) {
        Drawable decodeDrawable;
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        decodeDrawable = ImageDecoder.decodeDrawable(source);
        setImageDrawable(decodeDrawable);
        if (w0.x(decodeDrawable)) {
            AnimatedImageDrawable f10 = w0.f(decodeDrawable);
            if (!this.GA) {
                f10.start();
            }
            return f10;
        }
        return null;
    }

    public static File YFl(Context context, String str, String str2) {
        return com.bytedance.sdk.component.utils.vc.YFl(context, com.bytedance.sdk.openadsdk.multipro.Sg.tN(), str, str2);
    }

    private void YFl(Canvas canvas) {
        Movie movie = this.Sg;
        if (movie == null) {
            return;
        }
        movie.setTime(this.AlY);
        float f10 = this.f10772nc;
        if (f10 == 0.0f) {
            canvas.scale(1.0f, 1.0f);
            this.Sg.draw(canvas, 0.0f, 0.0f);
        } else {
            canvas.scale(f10, f10);
            Movie movie2 = this.Sg;
            float f11 = this.qsH;
            float f12 = this.f10772nc;
            movie2.draw(canvas, f11 / f12, this.NjR / f12);
        }
        canvas.restore();
    }
}

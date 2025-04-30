package com.bytedance.sdk.openadsdk.core.widget;

import V1.b;
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
import com.bytedance.sdk.component.utils.HWF;
import com.bytedance.sdk.component.utils.tG;
import java.io.File;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes.dex */
public class GifView extends ImageView {
    private int Bj;
    private AnimatedImageDrawable COT;
    private boolean HWF;
    private long KS;
    private boolean QR;
    private float YW;
    private boolean dQp;
    private float dT;
    private int jU;
    private float ku;
    private Movie lMd;
    private boolean rV;
    private volatile boolean tG;
    private int vDp;
    private int zp;

    public GifView(Context context) {
        super(context);
        boolean z8;
        if (Build.VERSION.SDK_INT >= 28) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.HWF = z8;
        this.QR = false;
        this.rV = true;
        this.dQp = true;
        zp();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003e, code lost:
    
        if (r2 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.graphics.ImageDecoder.Source KS(byte[] r6) {
        /*
            r5 = this;
            r0 = 0
            android.content.Context r1 = r5.getContext()     // Catch: java.lang.Throwable -> Le
            boolean r2 = com.bytedance.sdk.openadsdk.multipro.lMd.KS()     // Catch: java.lang.Throwable -> Le
            if (r2 == 0) goto L11
            java.lang.String r2 = "GIF_AD_CACHE/"
            goto L13
        Le:
            r6 = move-exception
            r2 = r0
            goto L37
        L11:
            java.lang.String r2 = "/GIF_CACHE/"
        L13:
            java.lang.String r3 = "TT_GIF_FILE"
            java.io.File r1 = zp(r1, r2, r3)     // Catch: java.lang.Throwable -> Le
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Le
            r2.<init>(r1)     // Catch: java.lang.Throwable -> Le
            int r3 = r6.length     // Catch: java.lang.Throwable -> L31
            r4 = 0
            r2.write(r6, r4, r3)     // Catch: java.lang.Throwable -> L31
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L31
            r3 = 28
            if (r6 < r3) goto L33
            android.graphics.ImageDecoder$Source r6 = V1.b.h(r1)     // Catch: java.lang.Throwable -> L31
            r2.close()     // Catch: java.lang.Throwable -> L30
        L30:
            return r6
        L31:
            r6 = move-exception
            goto L37
        L33:
            r2.close()     // Catch: java.lang.Throwable -> L41
            goto L41
        L37:
            java.lang.String r1 = "GifView"
            java.lang.String r3 = "GifView  getSourceByFile fail : "
            com.bytedance.sdk.component.utils.tG.zp(r1, r3, r6)     // Catch: java.lang.Throwable -> L42
            if (r2 == 0) goto L41
            goto L33
        L41:
            return r0
        L42:
            r6 = move-exception
            if (r2 == 0) goto L48
            r2.close()     // Catch: java.lang.Throwable -> L48
        L48:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.widget.GifView.KS(byte[]):android.graphics.ImageDecoder$Source");
    }

    private AnimatedImageDrawable lMd(int i9) {
        ImageDecoder.Source createSource;
        if (i9 == -1 || Build.VERSION.SDK_INT < 28) {
            return null;
        }
        createSource = ImageDecoder.createSource(getResources(), i9);
        return zp(createSource);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.lMd != null && !this.HWF) {
            try {
                if (!this.tG) {
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
        if (this.lMd != null && !this.HWF) {
            this.ku = (getWidth() - this.Bj) / 2.0f;
            this.YW = (getHeight() - this.vDp) / 2.0f;
        }
        if (getVisibility() == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.rV = z9;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i9, int i10) {
        Movie movie;
        float f9;
        float f10;
        int size;
        int size2;
        super.onMeasure(i9, i10);
        if (!this.HWF && (movie = this.lMd) != null) {
            int width = movie.width();
            int height = this.lMd.height();
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
            this.dT = max;
            int i11 = (int) (width * max);
            this.Bj = i11;
            int i12 = (int) (height * max);
            this.vDp = i12;
            setMeasuredDimension(i11, i12);
        }
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public void onScreenStateChanged(int i9) {
        super.onScreenStateChanged(i9);
        if (this.lMd != null) {
            boolean z8 = true;
            if (i9 != 1) {
                z8 = false;
            }
            this.rV = z8;
            lMd();
        }
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public void onVisibilityChanged(View view, int i9) {
        boolean z8;
        super.onVisibilityChanged(view, i9);
        if (this.lMd != null) {
            if (i9 == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.rV = z8;
            lMd();
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i9) {
        boolean z8;
        super.onWindowVisibilityChanged(i9);
        if (this.lMd != null) {
            if (i9 == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.rV = z8;
            lMd();
        }
    }

    public void setRepeatConfig(boolean z8) {
        AnimatedImageDrawable animatedImageDrawable;
        this.dQp = z8;
        if (!z8) {
            try {
                if (Build.VERSION.SDK_INT >= 28 && (animatedImageDrawable = this.COT) != null) {
                    animatedImageDrawable.setRepeatCount(0);
                }
            } catch (Exception e4) {
                tG.zp("GifView", "setRepeatConfig error", e4);
            }
        }
    }

    public void zp() {
        if (this.HWF) {
            return;
        }
        setLayerType(1, null);
    }

    public void zp(int i9, boolean z8) {
        this.tG = z8;
        this.zp = i9;
        if (i9 != -1) {
            if (!this.HWF) {
                this.lMd = zp(i9);
            } else {
                this.COT = lMd(i9);
            }
        }
    }

    private AnimatedImageDrawable lMd(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return zp(KS(bArr));
    }

    private void lMd() {
        if (this.lMd == null || this.HWF || !this.rV) {
            return;
        }
        postInvalidateOnAnimation();
    }

    public void zp(byte[] bArr, boolean z8) {
        this.tG = z8;
        if (bArr != null) {
            if (!this.HWF) {
                this.lMd = zp(bArr);
            } else {
                this.COT = lMd(bArr);
            }
            lMd();
        }
    }

    private void KS() {
        if (this.lMd == null) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.KS == 0) {
            this.KS = uptimeMillis;
        }
        int duration = this.lMd.duration();
        if (duration == 0) {
            duration = 1000;
        }
        if (!this.dQp && Math.abs(duration - this.jU) < 60) {
            this.jU = duration;
            this.tG = true;
        } else {
            this.jU = (int) ((uptimeMillis - this.KS) % duration);
        }
    }

    private Movie zp(int i9) {
        try {
            return Movie.decodeStream(getResources().openRawResource(i9));
        } catch (Throwable unused) {
            return null;
        }
    }

    private Movie zp(byte[] bArr) {
        try {
            return Movie.decodeByteArray(bArr, 0, bArr.length);
        } catch (Throwable unused) {
            return null;
        }
    }

    private AnimatedImageDrawable zp(ImageDecoder.Source source) {
        Drawable decodeDrawable;
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        decodeDrawable = ImageDecoder.decodeDrawable(source);
        setImageDrawable(decodeDrawable);
        if (b.x(decodeDrawable)) {
            AnimatedImageDrawable k6 = b.k(decodeDrawable);
            if (!this.tG) {
                k6.start();
            }
            return k6;
        }
        return null;
    }

    public static File zp(Context context, String str, String str2) {
        return HWF.zp(context, com.bytedance.sdk.openadsdk.multipro.lMd.KS(), str, str2);
    }

    private void zp(Canvas canvas) {
        Movie movie = this.lMd;
        if (movie == null) {
            return;
        }
        movie.setTime(this.jU);
        float f9 = this.dT;
        if (f9 == 0.0f) {
            canvas.scale(1.0f, 1.0f);
            this.lMd.draw(canvas, 0.0f, 0.0f);
        } else {
            canvas.scale(f9, f9);
            Movie movie2 = this.lMd;
            float f10 = this.ku;
            float f11 = this.dT;
            movie2.draw(canvas, f10 / f11, this.YW / f11);
        }
        canvas.restore();
    }
}

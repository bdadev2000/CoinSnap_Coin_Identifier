package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes4.dex */
public class MBridgeImageView extends ImageView {
    private Xfermode a;

    /* renamed from: b, reason: collision with root package name */
    private int f12784b;

    /* renamed from: c, reason: collision with root package name */
    private int f12785c;

    /* renamed from: d, reason: collision with root package name */
    private int f12786d;

    /* renamed from: e, reason: collision with root package name */
    private int f12787e;

    /* renamed from: f, reason: collision with root package name */
    private int f12788f;

    /* renamed from: g, reason: collision with root package name */
    private int f12789g;

    /* renamed from: h, reason: collision with root package name */
    private int f12790h;

    /* renamed from: i, reason: collision with root package name */
    private int f12791i;

    /* renamed from: j, reason: collision with root package name */
    private int f12792j;

    /* renamed from: k, reason: collision with root package name */
    private float[] f12793k;

    /* renamed from: l, reason: collision with root package name */
    private float[] f12794l;

    /* renamed from: m, reason: collision with root package name */
    private RectF f12795m;

    /* renamed from: n, reason: collision with root package name */
    private RectF f12796n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f12797o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f12798p;

    /* renamed from: q, reason: collision with root package name */
    private Path f12799q;

    /* renamed from: r, reason: collision with root package name */
    private Paint f12800r;

    public MBridgeImageView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        try {
            canvas.saveLayer(this.f12795m, null, 31);
            int i10 = this.f12784b;
            int i11 = this.f12791i;
            int i12 = this.f12785c;
            canvas.scale(((i10 - (i11 * 2)) * 1.0f) / i10, ((i12 - (i11 * 2)) * 1.0f) / i12, i10 / 2.0f, i12 / 2.0f);
            super.onDraw(canvas);
            Paint paint = this.f12800r;
            if (paint != null) {
                paint.reset();
                this.f12800r.setAntiAlias(true);
                this.f12800r.setStyle(Paint.Style.FILL);
                this.f12800r.setXfermode(this.a);
            }
            Path path = this.f12799q;
            if (path != null) {
                path.reset();
                this.f12799q.addRoundRect(this.f12795m, this.f12794l, Path.Direction.CCW);
            }
            canvas.drawPath(this.f12799q, this.f12800r);
            Paint paint2 = this.f12800r;
            if (paint2 != null) {
                paint2.setXfermode(null);
            }
            canvas.restore();
            if (this.f12797o) {
                int i13 = this.f12791i;
                int i14 = this.f12792j;
                RectF rectF = this.f12796n;
                float[] fArr = this.f12793k;
                try {
                    Path path2 = this.f12799q;
                    if (path2 != null) {
                        path2.reset();
                    }
                    Paint paint3 = this.f12800r;
                    if (paint3 != null) {
                        paint3.setStrokeWidth(i13);
                        this.f12800r.setColor(i14);
                        this.f12800r.setStyle(Paint.Style.STROKE);
                    }
                    Path path3 = this.f12799q;
                    if (path3 != null) {
                        path3.addRoundRect(rectF, fArr, Path.Direction.CCW);
                    }
                    canvas.drawPath(this.f12799q, this.f12800r);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        } catch (Exception e10) {
            ad.a("MBridgeImageView", e10.getMessage());
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        super.onSizeChanged(i10, i11, i12, i13);
        this.f12784b = i10;
        this.f12785c = i11;
        int i17 = 0;
        if (this.f12798p) {
            try {
                if (this.f12793k != null && this.f12794l != null) {
                    while (true) {
                        i14 = 2;
                        if (i17 >= 2) {
                            break;
                        }
                        float[] fArr = this.f12793k;
                        int i18 = this.f12787e;
                        fArr[i17] = i18;
                        this.f12794l[i17] = i18 - (this.f12791i / 2.0f);
                        i17++;
                    }
                    while (true) {
                        i15 = 4;
                        if (i14 >= 4) {
                            break;
                        }
                        float[] fArr2 = this.f12793k;
                        int i19 = this.f12788f;
                        fArr2[i14] = i19;
                        this.f12794l[i14] = i19 - (this.f12791i / 2.0f);
                        i14++;
                    }
                    while (true) {
                        if (i15 >= 6) {
                            break;
                        }
                        float[] fArr3 = this.f12793k;
                        int i20 = this.f12789g;
                        fArr3[i15] = i20;
                        this.f12794l[i15] = i20 - (this.f12791i / 2.0f);
                        i15++;
                    }
                    for (i16 = 6; i16 < 8; i16++) {
                        float[] fArr4 = this.f12793k;
                        int i21 = this.f12790h;
                        fArr4[i16] = i21;
                        this.f12794l[i16] = i21 - (this.f12791i / 2.0f);
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } else if (this.f12793k != null && this.f12794l != null) {
            while (true) {
                try {
                    float[] fArr5 = this.f12793k;
                    if (i17 >= fArr5.length) {
                        break;
                    }
                    int i22 = this.f12786d;
                    fArr5[i17] = i22;
                    this.f12794l[i17] = i22 - (this.f12791i / 2.0f);
                    i17++;
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
        RectF rectF = this.f12796n;
        if (rectF != null) {
            int i23 = this.f12791i;
            rectF.set(i23 / 2.0f, i23 / 2.0f, this.f12784b - (i23 / 2.0f), this.f12785c - (i23 / 2.0f));
        }
        RectF rectF2 = this.f12795m;
        if (rectF2 != null) {
            rectF2.set(0.0f, 0.0f, this.f12784b, this.f12785c);
        }
    }

    public void setBorder(int i10, int i11, int i12) {
        this.f12797o = true;
        this.f12791i = i11;
        this.f12792j = i12;
        this.f12786d = i10;
    }

    public void setCornerRadius(int i10) {
        this.f12786d = i10;
    }

    public void setCustomBorder(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f12797o = true;
        this.f12798p = true;
        this.f12791i = i14;
        this.f12792j = i15;
        this.f12787e = i10;
        this.f12789g = i12;
        this.f12788f = i11;
        this.f12790h = i13;
    }

    public MBridgeImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MBridgeImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12799q = new Path();
        this.f12800r = new Paint();
        this.f12793k = new float[8];
        this.f12794l = new float[8];
        this.f12796n = new RectF();
        this.f12795m = new RectF();
        this.a = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    }
}

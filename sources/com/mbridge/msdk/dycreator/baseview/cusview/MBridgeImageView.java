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

/* loaded from: classes3.dex */
public class MBridgeImageView extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    private Xfermode f15113a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private int f15114c;

    /* renamed from: d, reason: collision with root package name */
    private int f15115d;

    /* renamed from: e, reason: collision with root package name */
    private int f15116e;

    /* renamed from: f, reason: collision with root package name */
    private int f15117f;

    /* renamed from: g, reason: collision with root package name */
    private int f15118g;

    /* renamed from: h, reason: collision with root package name */
    private int f15119h;

    /* renamed from: i, reason: collision with root package name */
    private int f15120i;

    /* renamed from: j, reason: collision with root package name */
    private int f15121j;

    /* renamed from: k, reason: collision with root package name */
    private float[] f15122k;
    private float[] l;
    private RectF m;

    /* renamed from: n, reason: collision with root package name */
    private RectF f15123n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f15124o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f15125p;

    /* renamed from: q, reason: collision with root package name */
    private Path f15126q;

    /* renamed from: r, reason: collision with root package name */
    private Paint f15127r;

    public MBridgeImageView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        try {
            canvas.saveLayer(this.m, null, 31);
            int i9 = this.b;
            int i10 = this.f15120i;
            int i11 = this.f15114c;
            canvas.scale(((i9 - (i10 * 2)) * 1.0f) / i9, ((i11 - (i10 * 2)) * 1.0f) / i11, i9 / 2.0f, i11 / 2.0f);
            super.onDraw(canvas);
            Paint paint = this.f15127r;
            if (paint != null) {
                paint.reset();
                this.f15127r.setAntiAlias(true);
                this.f15127r.setStyle(Paint.Style.FILL);
                this.f15127r.setXfermode(this.f15113a);
            }
            Path path = this.f15126q;
            if (path != null) {
                path.reset();
                this.f15126q.addRoundRect(this.m, this.l, Path.Direction.CCW);
            }
            canvas.drawPath(this.f15126q, this.f15127r);
            Paint paint2 = this.f15127r;
            if (paint2 != null) {
                paint2.setXfermode(null);
            }
            canvas.restore();
            if (this.f15124o) {
                int i12 = this.f15120i;
                int i13 = this.f15121j;
                RectF rectF = this.f15123n;
                float[] fArr = this.f15122k;
                try {
                    Path path2 = this.f15126q;
                    if (path2 != null) {
                        path2.reset();
                    }
                    Paint paint3 = this.f15127r;
                    if (paint3 != null) {
                        paint3.setStrokeWidth(i12);
                        this.f15127r.setColor(i13);
                        this.f15127r.setStyle(Paint.Style.STROKE);
                    }
                    Path path3 = this.f15126q;
                    if (path3 != null) {
                        path3.addRoundRect(rectF, fArr, Path.Direction.CCW);
                    }
                    canvas.drawPath(this.f15126q, this.f15127r);
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
        } catch (Exception e9) {
            ad.a("MBridgeImageView", e9.getMessage());
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        super.onSizeChanged(i9, i10, i11, i12);
        this.b = i9;
        this.f15114c = i10;
        int i16 = 0;
        if (this.f15125p) {
            try {
                if (this.f15122k != null && this.l != null) {
                    while (true) {
                        i13 = 2;
                        if (i16 >= 2) {
                            break;
                        }
                        float[] fArr = this.f15122k;
                        int i17 = this.f15116e;
                        fArr[i16] = i17;
                        this.l[i16] = i17 - (this.f15120i / 2.0f);
                        i16++;
                    }
                    while (true) {
                        i14 = 4;
                        if (i13 >= 4) {
                            break;
                        }
                        float[] fArr2 = this.f15122k;
                        int i18 = this.f15117f;
                        fArr2[i13] = i18;
                        this.l[i13] = i18 - (this.f15120i / 2.0f);
                        i13++;
                    }
                    while (true) {
                        if (i14 >= 6) {
                            break;
                        }
                        float[] fArr3 = this.f15122k;
                        int i19 = this.f15118g;
                        fArr3[i14] = i19;
                        this.l[i14] = i19 - (this.f15120i / 2.0f);
                        i14++;
                    }
                    for (i15 = 6; i15 < 8; i15++) {
                        float[] fArr4 = this.f15122k;
                        int i20 = this.f15119h;
                        fArr4[i15] = i20;
                        this.l[i15] = i20 - (this.f15120i / 2.0f);
                    }
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        } else if (this.f15122k != null && this.l != null) {
            while (true) {
                try {
                    float[] fArr5 = this.f15122k;
                    if (i16 >= fArr5.length) {
                        break;
                    }
                    int i21 = this.f15115d;
                    fArr5[i16] = i21;
                    this.l[i16] = i21 - (this.f15120i / 2.0f);
                    i16++;
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
            }
        }
        RectF rectF = this.f15123n;
        if (rectF != null) {
            int i22 = this.f15120i;
            rectF.set(i22 / 2.0f, i22 / 2.0f, this.b - (i22 / 2.0f), this.f15114c - (i22 / 2.0f));
        }
        RectF rectF2 = this.m;
        if (rectF2 != null) {
            rectF2.set(0.0f, 0.0f, this.b, this.f15114c);
        }
    }

    public void setBorder(int i9, int i10, int i11) {
        this.f15124o = true;
        this.f15120i = i10;
        this.f15121j = i11;
        this.f15115d = i9;
    }

    public void setCornerRadius(int i9) {
        this.f15115d = i9;
    }

    public void setCustomBorder(int i9, int i10, int i11, int i12, int i13, int i14) {
        this.f15124o = true;
        this.f15125p = true;
        this.f15120i = i13;
        this.f15121j = i14;
        this.f15116e = i9;
        this.f15118g = i11;
        this.f15117f = i10;
        this.f15119h = i12;
    }

    public MBridgeImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MBridgeImageView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f15126q = new Path();
        this.f15127r = new Paint();
        this.f15122k = new float[8];
        this.l = new float[8];
        this.f15123n = new RectF();
        this.m = new RectF();
        this.f15113a = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    }
}

package l9;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/* loaded from: classes3.dex */
public final class r {
    public int A;
    public int B;
    public int C;
    public int D;
    public StaticLayout E;
    public StaticLayout F;
    public int G;
    public int H;
    public int I;
    public Rect J;
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f21253b;

    /* renamed from: c, reason: collision with root package name */
    public final float f21254c;

    /* renamed from: d, reason: collision with root package name */
    public final float f21255d;

    /* renamed from: e, reason: collision with root package name */
    public final float f21256e;

    /* renamed from: f, reason: collision with root package name */
    public final TextPaint f21257f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f21258g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f21259h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f21260i;

    /* renamed from: j, reason: collision with root package name */
    public Layout.Alignment f21261j;

    /* renamed from: k, reason: collision with root package name */
    public Bitmap f21262k;

    /* renamed from: l, reason: collision with root package name */
    public float f21263l;

    /* renamed from: m, reason: collision with root package name */
    public int f21264m;

    /* renamed from: n, reason: collision with root package name */
    public int f21265n;

    /* renamed from: o, reason: collision with root package name */
    public float f21266o;

    /* renamed from: p, reason: collision with root package name */
    public int f21267p;

    /* renamed from: q, reason: collision with root package name */
    public float f21268q;

    /* renamed from: r, reason: collision with root package name */
    public float f21269r;

    /* renamed from: s, reason: collision with root package name */
    public int f21270s;

    /* renamed from: t, reason: collision with root package name */
    public int f21271t;
    public int u;

    /* renamed from: v, reason: collision with root package name */
    public int f21272v;

    /* renamed from: w, reason: collision with root package name */
    public int f21273w;

    /* renamed from: x, reason: collision with root package name */
    public float f21274x;

    /* renamed from: y, reason: collision with root package name */
    public float f21275y;

    /* renamed from: z, reason: collision with root package name */
    public float f21276z;

    public r(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f21256e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f21255d = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.a = round;
        this.f21253b = round;
        this.f21254c = round;
        TextPaint textPaint = new TextPaint();
        this.f21257f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f21258g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f21259h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    public final void a(Canvas canvas, boolean z10) {
        int i10;
        if (z10) {
            StaticLayout staticLayout = this.E;
            StaticLayout staticLayout2 = this.F;
            if (staticLayout != null && staticLayout2 != null) {
                int save = canvas.save();
                canvas.translate(this.G, this.H);
                if (Color.alpha(this.u) > 0) {
                    Paint paint = this.f21258g;
                    paint.setColor(this.u);
                    canvas.drawRect(-this.I, 0.0f, staticLayout.getWidth() + this.I, staticLayout.getHeight(), paint);
                }
                int i11 = this.f21273w;
                TextPaint textPaint = this.f21257f;
                boolean z11 = true;
                if (i11 == 1) {
                    textPaint.setStrokeJoin(Paint.Join.ROUND);
                    textPaint.setStrokeWidth(this.a);
                    textPaint.setColor(this.f21272v);
                    textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
                    staticLayout2.draw(canvas);
                } else {
                    float f10 = this.f21253b;
                    if (i11 == 2) {
                        float f11 = this.f21254c;
                        textPaint.setShadowLayer(f10, f11, f11, this.f21272v);
                    } else if (i11 == 3 || i11 == 4) {
                        if (i11 != 3) {
                            z11 = false;
                        }
                        int i12 = -1;
                        if (z11) {
                            i10 = -1;
                        } else {
                            i10 = this.f21272v;
                        }
                        if (z11) {
                            i12 = this.f21272v;
                        }
                        float f12 = f10 / 2.0f;
                        textPaint.setColor(this.f21270s);
                        textPaint.setStyle(Paint.Style.FILL);
                        float f13 = -f12;
                        textPaint.setShadowLayer(f10, f13, f13, i10);
                        staticLayout2.draw(canvas);
                        textPaint.setShadowLayer(f10, f12, f12, i12);
                    }
                }
                textPaint.setColor(this.f21270s);
                textPaint.setStyle(Paint.Style.FILL);
                staticLayout.draw(canvas);
                textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                canvas.restoreToCount(save);
                return;
            }
            return;
        }
        this.J.getClass();
        this.f21262k.getClass();
        canvas.drawBitmap(this.f21262k, (Rect) null, this.J, this.f21259h);
    }
}

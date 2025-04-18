package com.applovin.exoplayer2.ui;

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
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.applovin.impl.a1;
import com.applovin.impl.v2;
import com.applovin.impl.yp;
import com.applovin.impl.z4;

/* loaded from: classes.dex */
final class g {
    private int A;
    private int B;
    private int C;
    private int D;
    private StaticLayout E;
    private StaticLayout F;
    private int G;
    private int H;
    private int I;
    private Rect J;
    private final float a;

    /* renamed from: b, reason: collision with root package name */
    private final float f3529b;

    /* renamed from: c, reason: collision with root package name */
    private final float f3530c;

    /* renamed from: d, reason: collision with root package name */
    private final float f3531d;

    /* renamed from: e, reason: collision with root package name */
    private final float f3532e;

    /* renamed from: f, reason: collision with root package name */
    private final TextPaint f3533f;

    /* renamed from: g, reason: collision with root package name */
    private final Paint f3534g;

    /* renamed from: h, reason: collision with root package name */
    private final Paint f3535h;

    /* renamed from: i, reason: collision with root package name */
    private CharSequence f3536i;

    /* renamed from: j, reason: collision with root package name */
    private Layout.Alignment f3537j;

    /* renamed from: k, reason: collision with root package name */
    private Bitmap f3538k;

    /* renamed from: l, reason: collision with root package name */
    private float f3539l;

    /* renamed from: m, reason: collision with root package name */
    private int f3540m;

    /* renamed from: n, reason: collision with root package name */
    private int f3541n;

    /* renamed from: o, reason: collision with root package name */
    private float f3542o;

    /* renamed from: p, reason: collision with root package name */
    private int f3543p;

    /* renamed from: q, reason: collision with root package name */
    private float f3544q;

    /* renamed from: r, reason: collision with root package name */
    private float f3545r;

    /* renamed from: s, reason: collision with root package name */
    private int f3546s;

    /* renamed from: t, reason: collision with root package name */
    private int f3547t;
    private int u;

    /* renamed from: v, reason: collision with root package name */
    private int f3548v;

    /* renamed from: w, reason: collision with root package name */
    private int f3549w;

    /* renamed from: x, reason: collision with root package name */
    private float f3550x;

    /* renamed from: y, reason: collision with root package name */
    private float f3551y;

    /* renamed from: z, reason: collision with root package name */
    private float f3552z;

    public g(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f3532e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f3531d = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.a = round;
        this.f3529b = round;
        this.f3530c = round;
        TextPaint textPaint = new TextPaint();
        this.f3533f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f3534g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f3535h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b() {
        /*
            Method dump skipped, instructions count: 487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.ui.g.b():void");
    }

    public void a(z4 z4Var, v2 v2Var, float f10, float f11, float f12, Canvas canvas, int i10, int i11, int i12, int i13) {
        int i14;
        boolean z10 = z4Var.f9323d == null;
        if (!z10) {
            i14 = ViewCompat.MEASURED_STATE_MASK;
        } else if (TextUtils.isEmpty(z4Var.a)) {
            return;
        } else {
            i14 = z4Var.f9331m ? z4Var.f9332n : v2Var.f8454c;
        }
        if (a(this.f3536i, z4Var.a) && yp.a(this.f3537j, z4Var.f9321b) && this.f3538k == z4Var.f9323d && this.f3539l == z4Var.f9324f && this.f3540m == z4Var.f9325g && yp.a(Integer.valueOf(this.f3541n), Integer.valueOf(z4Var.f9326h)) && this.f3542o == z4Var.f9327i && yp.a(Integer.valueOf(this.f3543p), Integer.valueOf(z4Var.f9328j)) && this.f3544q == z4Var.f9329k && this.f3545r == z4Var.f9330l && this.f3546s == v2Var.a && this.f3547t == v2Var.f8453b && this.u == i14 && this.f3549w == v2Var.f8455d && this.f3548v == v2Var.f8456e && yp.a(this.f3533f.getTypeface(), v2Var.f8457f) && this.f3550x == f10 && this.f3551y == f11 && this.f3552z == f12 && this.A == i10 && this.B == i11 && this.C == i12 && this.D == i13) {
            a(canvas, z10);
            return;
        }
        this.f3536i = z4Var.a;
        this.f3537j = z4Var.f9321b;
        this.f3538k = z4Var.f9323d;
        this.f3539l = z4Var.f9324f;
        this.f3540m = z4Var.f9325g;
        this.f3541n = z4Var.f9326h;
        this.f3542o = z4Var.f9327i;
        this.f3543p = z4Var.f9328j;
        this.f3544q = z4Var.f9329k;
        this.f3545r = z4Var.f9330l;
        this.f3546s = v2Var.a;
        this.f3547t = v2Var.f8453b;
        this.u = i14;
        this.f3549w = v2Var.f8455d;
        this.f3548v = v2Var.f8456e;
        this.f3533f.setTypeface(v2Var.f8457f);
        this.f3550x = f10;
        this.f3551y = f11;
        this.f3552z = f12;
        this.A = i10;
        this.B = i11;
        this.C = i12;
        this.D = i13;
        if (z10) {
            a1.a(this.f3536i);
            b();
        } else {
            a1.a(this.f3538k);
            a();
        }
        a(canvas, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a() {
        /*
            r7 = this;
            android.graphics.Bitmap r0 = r7.f3538k
            int r1 = r7.C
            int r2 = r7.A
            int r1 = r1 - r2
            int r3 = r7.D
            int r4 = r7.B
            int r3 = r3 - r4
            float r2 = (float) r2
            float r1 = (float) r1
            float r5 = r7.f3542o
            float r5 = r5 * r1
            float r5 = r5 + r2
            float r2 = (float) r4
            float r3 = (float) r3
            float r4 = r7.f3539l
            float r4 = r4 * r3
            float r4 = r4 + r2
            float r2 = r7.f3544q
            float r1 = r1 * r2
            int r1 = java.lang.Math.round(r1)
            float r2 = r7.f3545r
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 == 0) goto L2e
            float r3 = r3 * r2
            int r0 = java.lang.Math.round(r3)
            goto L3f
        L2e:
            float r2 = (float) r1
            int r3 = r0.getHeight()
            float r3 = (float) r3
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r3 = r3 / r0
            float r3 = r3 * r2
            int r0 = java.lang.Math.round(r3)
        L3f:
            int r2 = r7.f3543p
            r3 = 1
            r6 = 2
            if (r2 != r6) goto L48
            float r2 = (float) r1
        L46:
            float r5 = r5 - r2
            goto L4e
        L48:
            if (r2 != r3) goto L4e
            int r2 = r1 / 2
            float r2 = (float) r2
            goto L46
        L4e:
            int r2 = java.lang.Math.round(r5)
            int r5 = r7.f3541n
            if (r5 != r6) goto L59
            float r3 = (float) r0
        L57:
            float r4 = r4 - r3
            goto L5f
        L59:
            if (r5 != r3) goto L5f
            int r3 = r0 / 2
            float r3 = (float) r3
            goto L57
        L5f:
            int r3 = java.lang.Math.round(r4)
            android.graphics.Rect r4 = new android.graphics.Rect
            int r1 = r1 + r2
            int r0 = r0 + r3
            r4.<init>(r2, r3, r1, r0)
            r7.J = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.ui.g.a():void");
    }

    private void a(Canvas canvas, boolean z10) {
        if (z10) {
            b(canvas);
            return;
        }
        a1.a(this.J);
        a1.a(this.f3538k);
        a(canvas);
    }

    private void a(Canvas canvas) {
        canvas.drawBitmap(this.f3538k, (Rect) null, this.J, this.f3535h);
    }

    private void b(Canvas canvas) {
        StaticLayout staticLayout = this.E;
        StaticLayout staticLayout2 = this.F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(this.G, this.H);
        if (Color.alpha(this.u) > 0) {
            this.f3534g.setColor(this.u);
            canvas.drawRect(-this.I, 0.0f, staticLayout.getWidth() + this.I, staticLayout.getHeight(), this.f3534g);
        }
        int i10 = this.f3549w;
        if (i10 == 1) {
            this.f3533f.setStrokeJoin(Paint.Join.ROUND);
            this.f3533f.setStrokeWidth(this.a);
            this.f3533f.setColor(this.f3548v);
            this.f3533f.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas);
        } else if (i10 == 2) {
            TextPaint textPaint = this.f3533f;
            float f10 = this.f3529b;
            float f11 = this.f3530c;
            textPaint.setShadowLayer(f10, f11, f11, this.f3548v);
        } else if (i10 == 3 || i10 == 4) {
            boolean z10 = i10 == 3;
            int i11 = z10 ? -1 : this.f3548v;
            int i12 = z10 ? this.f3548v : -1;
            float f12 = this.f3529b / 2.0f;
            this.f3533f.setColor(this.f3546s);
            this.f3533f.setStyle(Paint.Style.FILL);
            float f13 = -f12;
            this.f3533f.setShadowLayer(this.f3529b, f13, f13, i11);
            staticLayout2.draw(canvas);
            this.f3533f.setShadowLayer(this.f3529b, f12, f12, i12);
        }
        this.f3533f.setColor(this.f3546s);
        this.f3533f.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        this.f3533f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(save);
    }

    private static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }
}

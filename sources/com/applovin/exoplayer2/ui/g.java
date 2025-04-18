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
import com.applovin.impl.b1;
import com.applovin.impl.b5;
import com.applovin.impl.x2;
import com.applovin.impl.xp;

/* loaded from: classes2.dex */
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

    /* renamed from: a, reason: collision with root package name */
    private final float f22623a;

    /* renamed from: b, reason: collision with root package name */
    private final float f22624b;

    /* renamed from: c, reason: collision with root package name */
    private final float f22625c;
    private final float d;
    private final float e;

    /* renamed from: f, reason: collision with root package name */
    private final TextPaint f22626f;

    /* renamed from: g, reason: collision with root package name */
    private final Paint f22627g;

    /* renamed from: h, reason: collision with root package name */
    private final Paint f22628h;

    /* renamed from: i, reason: collision with root package name */
    private CharSequence f22629i;

    /* renamed from: j, reason: collision with root package name */
    private Layout.Alignment f22630j;

    /* renamed from: k, reason: collision with root package name */
    private Bitmap f22631k;

    /* renamed from: l, reason: collision with root package name */
    private float f22632l;

    /* renamed from: m, reason: collision with root package name */
    private int f22633m;

    /* renamed from: n, reason: collision with root package name */
    private int f22634n;

    /* renamed from: o, reason: collision with root package name */
    private float f22635o;

    /* renamed from: p, reason: collision with root package name */
    private int f22636p;

    /* renamed from: q, reason: collision with root package name */
    private float f22637q;

    /* renamed from: r, reason: collision with root package name */
    private float f22638r;

    /* renamed from: s, reason: collision with root package name */
    private int f22639s;

    /* renamed from: t, reason: collision with root package name */
    private int f22640t;

    /* renamed from: u, reason: collision with root package name */
    private int f22641u;

    /* renamed from: v, reason: collision with root package name */
    private int f22642v;
    private int w;
    private float x;

    /* renamed from: y, reason: collision with root package name */
    private float f22643y;

    /* renamed from: z, reason: collision with root package name */
    private float f22644z;

    public g(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.d = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f22623a = round;
        this.f22624b = round;
        this.f22625c = round;
        TextPaint textPaint = new TextPaint();
        this.f22626f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f22627g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f22628h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b() {
        /*
            Method dump skipped, instructions count: 489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.ui.g.b():void");
    }

    public void a(b5 b5Var, x2 x2Var, float f2, float f3, float f4, Canvas canvas, int i2, int i3, int i4, int i5) {
        int i6;
        boolean z2 = b5Var.d == null;
        if (!z2) {
            i6 = -16777216;
        } else if (TextUtils.isEmpty(b5Var.f22990a)) {
            return;
        } else {
            i6 = b5Var.f23000m ? b5Var.f23001n : x2Var.f27828c;
        }
        if (a(this.f22629i, b5Var.f22990a) && xp.a(this.f22630j, b5Var.f22991b) && this.f22631k == b5Var.d && this.f22632l == b5Var.f22993f && this.f22633m == b5Var.f22994g && xp.a(Integer.valueOf(this.f22634n), Integer.valueOf(b5Var.f22995h)) && this.f22635o == b5Var.f22996i && xp.a(Integer.valueOf(this.f22636p), Integer.valueOf(b5Var.f22997j)) && this.f22637q == b5Var.f22998k && this.f22638r == b5Var.f22999l && this.f22639s == x2Var.f27826a && this.f22640t == x2Var.f27827b && this.f22641u == i6 && this.w == x2Var.d && this.f22642v == x2Var.e && xp.a(this.f22626f.getTypeface(), x2Var.f27829f) && this.x == f2 && this.f22643y == f3 && this.f22644z == f4 && this.A == i2 && this.B == i3 && this.C == i4 && this.D == i5) {
            a(canvas, z2);
            return;
        }
        this.f22629i = b5Var.f22990a;
        this.f22630j = b5Var.f22991b;
        this.f22631k = b5Var.d;
        this.f22632l = b5Var.f22993f;
        this.f22633m = b5Var.f22994g;
        this.f22634n = b5Var.f22995h;
        this.f22635o = b5Var.f22996i;
        this.f22636p = b5Var.f22997j;
        this.f22637q = b5Var.f22998k;
        this.f22638r = b5Var.f22999l;
        this.f22639s = x2Var.f27826a;
        this.f22640t = x2Var.f27827b;
        this.f22641u = i6;
        this.w = x2Var.d;
        this.f22642v = x2Var.e;
        this.f22626f.setTypeface(x2Var.f27829f);
        this.x = f2;
        this.f22643y = f3;
        this.f22644z = f4;
        this.A = i2;
        this.B = i3;
        this.C = i4;
        this.D = i5;
        if (z2) {
            b1.a(this.f22629i);
            b();
        } else {
            b1.a(this.f22631k);
            a();
        }
        a(canvas, z2);
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
            android.graphics.Bitmap r0 = r7.f22631k
            int r1 = r7.C
            int r2 = r7.A
            int r1 = r1 - r2
            int r3 = r7.D
            int r4 = r7.B
            int r3 = r3 - r4
            float r2 = (float) r2
            float r1 = (float) r1
            float r5 = r7.f22635o
            float r5 = r5 * r1
            float r5 = r5 + r2
            float r2 = (float) r4
            float r3 = (float) r3
            float r4 = r7.f22632l
            float r4 = r4 * r3
            float r4 = r4 + r2
            float r2 = r7.f22637q
            float r1 = r1 * r2
            int r1 = java.lang.Math.round(r1)
            float r2 = r7.f22638r
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
            int r2 = r7.f22636p
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
            int r5 = r7.f22634n
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

    private void a(Canvas canvas, boolean z2) {
        if (z2) {
            b(canvas);
            return;
        }
        b1.a(this.J);
        b1.a(this.f22631k);
        a(canvas);
    }

    private void b(Canvas canvas) {
        StaticLayout staticLayout = this.E;
        StaticLayout staticLayout2 = this.F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(this.G, this.H);
        if (Color.alpha(this.f22641u) > 0) {
            this.f22627g.setColor(this.f22641u);
            canvas.drawRect(-this.I, 0.0f, staticLayout.getWidth() + this.I, staticLayout.getHeight(), this.f22627g);
        }
        int i2 = this.w;
        if (i2 == 1) {
            this.f22626f.setStrokeJoin(Paint.Join.ROUND);
            this.f22626f.setStrokeWidth(this.f22623a);
            this.f22626f.setColor(this.f22642v);
            this.f22626f.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas);
        } else if (i2 == 2) {
            TextPaint textPaint = this.f22626f;
            float f2 = this.f22624b;
            float f3 = this.f22625c;
            textPaint.setShadowLayer(f2, f3, f3, this.f22642v);
        } else if (i2 == 3 || i2 == 4) {
            boolean z2 = i2 == 3;
            int i3 = z2 ? -1 : this.f22642v;
            int i4 = z2 ? this.f22642v : -1;
            float f4 = this.f22624b / 2.0f;
            this.f22626f.setColor(this.f22639s);
            this.f22626f.setStyle(Paint.Style.FILL);
            float f5 = -f4;
            this.f22626f.setShadowLayer(this.f22624b, f5, f5, i3);
            staticLayout2.draw(canvas);
            this.f22626f.setShadowLayer(this.f22624b, f4, f4, i4);
        }
        this.f22626f.setColor(this.f22639s);
        this.f22626f.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        this.f22626f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(save);
    }

    private void a(Canvas canvas) {
        canvas.drawBitmap(this.f22631k, (Rect) null, this.J, this.f22628h);
    }

    private static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }
}

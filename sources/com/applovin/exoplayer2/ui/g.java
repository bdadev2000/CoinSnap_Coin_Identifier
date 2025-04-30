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
import com.applovin.impl.AbstractC0669a1;
import com.applovin.impl.C0768v2;
import com.applovin.impl.yp;
import com.applovin.impl.z4;

/* loaded from: classes.dex */
final class g {

    /* renamed from: A, reason: collision with root package name */
    private int f6313A;

    /* renamed from: B, reason: collision with root package name */
    private int f6314B;

    /* renamed from: C, reason: collision with root package name */
    private int f6315C;

    /* renamed from: D, reason: collision with root package name */
    private int f6316D;

    /* renamed from: E, reason: collision with root package name */
    private StaticLayout f6317E;

    /* renamed from: F, reason: collision with root package name */
    private StaticLayout f6318F;

    /* renamed from: G, reason: collision with root package name */
    private int f6319G;

    /* renamed from: H, reason: collision with root package name */
    private int f6320H;

    /* renamed from: I, reason: collision with root package name */
    private int f6321I;

    /* renamed from: J, reason: collision with root package name */
    private Rect f6322J;

    /* renamed from: a, reason: collision with root package name */
    private final float f6323a;
    private final float b;

    /* renamed from: c, reason: collision with root package name */
    private final float f6324c;

    /* renamed from: d, reason: collision with root package name */
    private final float f6325d;

    /* renamed from: e, reason: collision with root package name */
    private final float f6326e;

    /* renamed from: f, reason: collision with root package name */
    private final TextPaint f6327f;

    /* renamed from: g, reason: collision with root package name */
    private final Paint f6328g;

    /* renamed from: h, reason: collision with root package name */
    private final Paint f6329h;

    /* renamed from: i, reason: collision with root package name */
    private CharSequence f6330i;

    /* renamed from: j, reason: collision with root package name */
    private Layout.Alignment f6331j;

    /* renamed from: k, reason: collision with root package name */
    private Bitmap f6332k;
    private float l;
    private int m;

    /* renamed from: n, reason: collision with root package name */
    private int f6333n;

    /* renamed from: o, reason: collision with root package name */
    private float f6334o;

    /* renamed from: p, reason: collision with root package name */
    private int f6335p;

    /* renamed from: q, reason: collision with root package name */
    private float f6336q;

    /* renamed from: r, reason: collision with root package name */
    private float f6337r;

    /* renamed from: s, reason: collision with root package name */
    private int f6338s;

    /* renamed from: t, reason: collision with root package name */
    private int f6339t;

    /* renamed from: u, reason: collision with root package name */
    private int f6340u;

    /* renamed from: v, reason: collision with root package name */
    private int f6341v;

    /* renamed from: w, reason: collision with root package name */
    private int f6342w;

    /* renamed from: x, reason: collision with root package name */
    private float f6343x;

    /* renamed from: y, reason: collision with root package name */
    private float f6344y;

    /* renamed from: z, reason: collision with root package name */
    private float f6345z;

    public g(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f6326e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f6325d = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f6323a = round;
        this.b = round;
        this.f6324c = round;
        TextPaint textPaint = new TextPaint();
        this.f6327f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f6328g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f6329h = paint2;
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

    public void a(z4 z4Var, C0768v2 c0768v2, float f9, float f10, float f11, Canvas canvas, int i9, int i10, int i11, int i12) {
        int i13;
        boolean z8 = z4Var.f12507d == null;
        if (!z8) {
            i13 = ViewCompat.MEASURED_STATE_MASK;
        } else if (TextUtils.isEmpty(z4Var.f12505a)) {
            return;
        } else {
            i13 = z4Var.m ? z4Var.f12514n : c0768v2.f11661c;
        }
        if (a(this.f6330i, z4Var.f12505a) && yp.a(this.f6331j, z4Var.b) && this.f6332k == z4Var.f12507d && this.l == z4Var.f12508f && this.m == z4Var.f12509g && yp.a(Integer.valueOf(this.f6333n), Integer.valueOf(z4Var.f12510h)) && this.f6334o == z4Var.f12511i && yp.a(Integer.valueOf(this.f6335p), Integer.valueOf(z4Var.f12512j)) && this.f6336q == z4Var.f12513k && this.f6337r == z4Var.l && this.f6338s == c0768v2.f11660a && this.f6339t == c0768v2.b && this.f6340u == i13 && this.f6342w == c0768v2.f11662d && this.f6341v == c0768v2.f11663e && yp.a(this.f6327f.getTypeface(), c0768v2.f11664f) && this.f6343x == f9 && this.f6344y == f10 && this.f6345z == f11 && this.f6313A == i9 && this.f6314B == i10 && this.f6315C == i11 && this.f6316D == i12) {
            a(canvas, z8);
            return;
        }
        this.f6330i = z4Var.f12505a;
        this.f6331j = z4Var.b;
        this.f6332k = z4Var.f12507d;
        this.l = z4Var.f12508f;
        this.m = z4Var.f12509g;
        this.f6333n = z4Var.f12510h;
        this.f6334o = z4Var.f12511i;
        this.f6335p = z4Var.f12512j;
        this.f6336q = z4Var.f12513k;
        this.f6337r = z4Var.l;
        this.f6338s = c0768v2.f11660a;
        this.f6339t = c0768v2.b;
        this.f6340u = i13;
        this.f6342w = c0768v2.f11662d;
        this.f6341v = c0768v2.f11663e;
        this.f6327f.setTypeface(c0768v2.f11664f);
        this.f6343x = f9;
        this.f6344y = f10;
        this.f6345z = f11;
        this.f6313A = i9;
        this.f6314B = i10;
        this.f6315C = i11;
        this.f6316D = i12;
        if (z8) {
            AbstractC0669a1.a(this.f6330i);
            b();
        } else {
            AbstractC0669a1.a(this.f6332k);
            a();
        }
        a(canvas, z8);
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
            android.graphics.Bitmap r0 = r7.f6332k
            int r1 = r7.f6315C
            int r2 = r7.f6313A
            int r1 = r1 - r2
            int r3 = r7.f6316D
            int r4 = r7.f6314B
            int r3 = r3 - r4
            float r2 = (float) r2
            float r1 = (float) r1
            float r5 = r7.f6334o
            float r5 = r5 * r1
            float r5 = r5 + r2
            float r2 = (float) r4
            float r3 = (float) r3
            float r4 = r7.l
            float r4 = r4 * r3
            float r4 = r4 + r2
            float r2 = r7.f6336q
            float r1 = r1 * r2
            int r1 = java.lang.Math.round(r1)
            float r2 = r7.f6337r
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
            int r2 = r7.f6335p
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
            int r5 = r7.f6333n
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
            r7.f6322J = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.ui.g.a():void");
    }

    private void a(Canvas canvas, boolean z8) {
        if (z8) {
            b(canvas);
            return;
        }
        AbstractC0669a1.a(this.f6322J);
        AbstractC0669a1.a(this.f6332k);
        a(canvas);
    }

    private void a(Canvas canvas) {
        canvas.drawBitmap(this.f6332k, (Rect) null, this.f6322J, this.f6329h);
    }

    private void b(Canvas canvas) {
        StaticLayout staticLayout = this.f6317E;
        StaticLayout staticLayout2 = this.f6318F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(this.f6319G, this.f6320H);
        if (Color.alpha(this.f6340u) > 0) {
            this.f6328g.setColor(this.f6340u);
            canvas.drawRect(-this.f6321I, 0.0f, staticLayout.getWidth() + this.f6321I, staticLayout.getHeight(), this.f6328g);
        }
        int i9 = this.f6342w;
        if (i9 == 1) {
            this.f6327f.setStrokeJoin(Paint.Join.ROUND);
            this.f6327f.setStrokeWidth(this.f6323a);
            this.f6327f.setColor(this.f6341v);
            this.f6327f.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas);
        } else if (i9 == 2) {
            TextPaint textPaint = this.f6327f;
            float f9 = this.b;
            float f10 = this.f6324c;
            textPaint.setShadowLayer(f9, f10, f10, this.f6341v);
        } else if (i9 == 3 || i9 == 4) {
            boolean z8 = i9 == 3;
            int i10 = z8 ? -1 : this.f6341v;
            int i11 = z8 ? this.f6341v : -1;
            float f11 = this.b / 2.0f;
            this.f6327f.setColor(this.f6338s);
            this.f6327f.setStyle(Paint.Style.FILL);
            float f12 = -f11;
            this.f6327f.setShadowLayer(this.b, f12, f12, i10);
            staticLayout2.draw(canvas);
            this.f6327f.setShadowLayer(this.b, f11, f11, i11);
        }
        this.f6327f.setColor(this.f6338s);
        this.f6327f.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        this.f6327f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(save);
    }

    private static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }
}

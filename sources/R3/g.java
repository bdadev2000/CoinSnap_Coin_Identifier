package R3;

import M0.C0219j;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;
import java.util.Objects;

/* loaded from: classes2.dex */
public class g extends Drawable implements v {

    /* renamed from: y, reason: collision with root package name */
    public static final Paint f2661y;
    public f b;

    /* renamed from: c, reason: collision with root package name */
    public final t[] f2662c;

    /* renamed from: d, reason: collision with root package name */
    public final t[] f2663d;

    /* renamed from: f, reason: collision with root package name */
    public final BitSet f2664f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2665g;

    /* renamed from: h, reason: collision with root package name */
    public final Matrix f2666h;

    /* renamed from: i, reason: collision with root package name */
    public final Path f2667i;

    /* renamed from: j, reason: collision with root package name */
    public final Path f2668j;

    /* renamed from: k, reason: collision with root package name */
    public final RectF f2669k;
    public final RectF l;
    public final Region m;

    /* renamed from: n, reason: collision with root package name */
    public final Region f2670n;

    /* renamed from: o, reason: collision with root package name */
    public k f2671o;

    /* renamed from: p, reason: collision with root package name */
    public final Paint f2672p;

    /* renamed from: q, reason: collision with root package name */
    public final Paint f2673q;

    /* renamed from: r, reason: collision with root package name */
    public final Q3.a f2674r;

    /* renamed from: s, reason: collision with root package name */
    public final E1.c f2675s;

    /* renamed from: t, reason: collision with root package name */
    public final m f2676t;

    /* renamed from: u, reason: collision with root package name */
    public PorterDuffColorFilter f2677u;

    /* renamed from: v, reason: collision with root package name */
    public PorterDuffColorFilter f2678v;

    /* renamed from: w, reason: collision with root package name */
    public final RectF f2679w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f2680x;

    static {
        Paint paint = new Paint(1);
        f2661y = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    public final void a(RectF rectF, Path path) {
        f fVar = this.b;
        this.f2676t.a(fVar.f2643a, fVar.f2651j, rectF, this.f2675s, path);
        if (this.b.f2650i != 1.0f) {
            Matrix matrix = this.f2666h;
            matrix.reset();
            float f9 = this.b.f2650i;
            matrix.setScale(f9, f9, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f2679w, true);
    }

    public final PorterDuffColorFilter b(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z8) {
        PorterDuffColorFilter porterDuffColorFilter;
        int color;
        int c9;
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            if (z8) {
                colorForState = c(colorForState);
            }
            return new PorterDuffColorFilter(colorForState, mode);
        }
        if (z8 && (c9 = c((color = paint.getColor()))) != color) {
            porterDuffColorFilter = new PorterDuffColorFilter(c9, PorterDuff.Mode.SRC_IN);
        } else {
            porterDuffColorFilter = null;
        }
        return porterDuffColorFilter;
    }

    public final int c(int i9) {
        float f9;
        int i10;
        f fVar = this.b;
        float f10 = fVar.f2653n + fVar.f2654o + fVar.m;
        J3.a aVar = fVar.b;
        if (aVar != null && aVar.f1571a && L.c.d(i9, 255) == aVar.f1573d) {
            if (aVar.f1574e > 0.0f && f10 > 0.0f) {
                f9 = Math.min(((((float) Math.log1p(f10 / r3)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
            } else {
                f9 = 0.0f;
            }
            int alpha = Color.alpha(i9);
            int u8 = C0219j.u(f9, L.c.d(i9, 255), aVar.b);
            if (f9 > 0.0f && (i10 = aVar.f1572c) != 0) {
                u8 = L.c.b(L.c.d(i10, J3.a.f1570f), u8);
            }
            return L.c.d(u8, alpha);
        }
        return i9;
    }

    public final void d(Canvas canvas) {
        if (this.f2664f.cardinality() > 0) {
            Log.w("g", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i9 = this.b.f2657r;
        Path path = this.f2667i;
        Q3.a aVar = this.f2674r;
        if (i9 != 0) {
            canvas.drawPath(path, aVar.f2501a);
        }
        for (int i10 = 0; i10 < 4; i10++) {
            t tVar = this.f2662c[i10];
            int i11 = this.b.f2656q;
            Matrix matrix = t.b;
            tVar.a(matrix, aVar, i11, canvas);
            this.f2663d[i10].a(matrix, aVar, this.b.f2656q, canvas);
        }
        if (this.f2680x) {
            f fVar = this.b;
            int sin = (int) (Math.sin(Math.toRadians(fVar.f2658s)) * fVar.f2657r);
            f fVar2 = this.b;
            int cos = (int) (Math.cos(Math.toRadians(fVar2.f2658s)) * fVar2.f2657r);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, f2661y);
            canvas.translate(sin, cos);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f1, code lost:
    
        if (r1 < 29) goto L40;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r19) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: R3.g.draw(android.graphics.Canvas):void");
    }

    public final void e(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (kVar.d(rectF)) {
            float a6 = kVar.f2696f.a(rectF) * this.b.f2651j;
            canvas.drawRoundRect(rectF, a6, a6, paint);
        } else {
            canvas.drawPath(path, paint);
        }
    }

    public void f(Canvas canvas) {
        float f9;
        Paint paint = this.f2673q;
        Path path = this.f2668j;
        k kVar = this.f2671o;
        RectF rectF = this.l;
        rectF.set(g());
        if (h()) {
            f9 = paint.getStrokeWidth() / 2.0f;
        } else {
            f9 = 0.0f;
        }
        rectF.inset(f9, f9);
        e(canvas, paint, path, kVar, rectF);
    }

    public final RectF g() {
        RectF rectF = this.f2669k;
        rectF.set(getBounds());
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.b.l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        f fVar = this.b;
        if (fVar.f2655p == 2) {
            return;
        }
        if (fVar.f2643a.d(g())) {
            outline.setRoundRect(getBounds(), this.b.f2643a.f2695e.a(g()) * this.b.f2651j);
            return;
        }
        RectF g9 = g();
        Path path = this.f2667i;
        a(g9, path);
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 30) {
            I3.c.a(outline, path);
            return;
        }
        if (i9 >= 29) {
            try {
                I3.a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            I3.a.a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.b.f2649h;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.m;
        region.set(bounds);
        RectF g9 = g();
        Path path = this.f2667i;
        a(g9, path);
        Region region2 = this.f2670n;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final boolean h() {
        Paint.Style style = this.b.f2660u;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f2673q.getStrokeWidth() > 0.0f) {
            return true;
        }
        return false;
    }

    public final void i(Context context) {
        this.b.b = new J3.a(context);
        n();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f2665g = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        if (!super.isStateful() && (((colorStateList = this.b.f2647f) == null || !colorStateList.isStateful()) && (((colorStateList2 = this.b.f2646e) == null || !colorStateList2.isStateful()) && (((colorStateList3 = this.b.f2645d) == null || !colorStateList3.isStateful()) && ((colorStateList4 = this.b.f2644c) == null || !colorStateList4.isStateful()))))) {
            return false;
        }
        return true;
    }

    public final void j(float f9) {
        f fVar = this.b;
        if (fVar.f2653n != f9) {
            fVar.f2653n = f9;
            n();
        }
    }

    public final void k(ColorStateList colorStateList) {
        f fVar = this.b;
        if (fVar.f2644c != colorStateList) {
            fVar.f2644c = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean l(int[] iArr) {
        boolean z8;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.b.f2644c != null && color2 != (colorForState2 = this.b.f2644c.getColorForState(iArr, (color2 = (paint2 = this.f2672p).getColor())))) {
            paint2.setColor(colorForState2);
            z8 = true;
        } else {
            z8 = false;
        }
        if (this.b.f2645d != null && color != (colorForState = this.b.f2645d.getColorForState(iArr, (color = (paint = this.f2673q).getColor())))) {
            paint.setColor(colorForState);
            return true;
        }
        return z8;
    }

    public final boolean m() {
        PorterDuffColorFilter porterDuffColorFilter = this.f2677u;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f2678v;
        f fVar = this.b;
        this.f2677u = b(fVar.f2647f, fVar.f2648g, this.f2672p, true);
        f fVar2 = this.b;
        this.f2678v = b(fVar2.f2646e, fVar2.f2648g, this.f2673q, false);
        f fVar3 = this.b;
        if (fVar3.f2659t) {
            int colorForState = fVar3.f2647f.getColorForState(getState(), 0);
            Q3.a aVar = this.f2674r;
            aVar.getClass();
            aVar.f2503d = L.c.d(colorForState, 68);
            aVar.f2504e = L.c.d(colorForState, 20);
            aVar.f2505f = L.c.d(colorForState, 0);
            aVar.f2501a.setColor(aVar.f2503d);
        }
        if (!Objects.equals(porterDuffColorFilter, this.f2677u) || !Objects.equals(porterDuffColorFilter2, this.f2678v)) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.b = new f(this.b);
        return this;
    }

    public final void n() {
        f fVar = this.b;
        float f9 = fVar.f2653n + fVar.f2654o;
        fVar.f2656q = (int) Math.ceil(0.75f * f9);
        this.b.f2657r = (int) Math.ceil(f9 * 0.25f);
        m();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f2665g = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z8;
        boolean l = l(iArr);
        boolean m = m();
        if (!l && !m) {
            z8 = false;
        } else {
            z8 = true;
        }
        if (z8) {
            invalidateSelf();
        }
        return z8;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i9) {
        f fVar = this.b;
        if (fVar.l != i9) {
            fVar.l = i9;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.b.getClass();
        super.invalidateSelf();
    }

    @Override // R3.v
    public final void setShapeAppearanceModel(k kVar) {
        this.b.f2643a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i9) {
        setTintList(ColorStateList.valueOf(i9));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.b.f2647f = colorStateList;
        m();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        f fVar = this.b;
        if (fVar.f2648g != mode) {
            fVar.f2648g = mode;
            m();
            super.invalidateSelf();
        }
    }

    public g(Context context, AttributeSet attributeSet, int i9, int i10) {
        this(k.b(context, attributeSet, i9, i10).a());
    }

    public g(k kVar) {
        this(new f(kVar));
    }

    public g(f fVar) {
        m mVar;
        this.f2662c = new t[4];
        this.f2663d = new t[4];
        this.f2664f = new BitSet(8);
        this.f2666h = new Matrix();
        this.f2667i = new Path();
        this.f2668j = new Path();
        this.f2669k = new RectF();
        this.l = new RectF();
        this.m = new Region();
        this.f2670n = new Region();
        Paint paint = new Paint(1);
        this.f2672p = paint;
        Paint paint2 = new Paint(1);
        this.f2673q = paint2;
        this.f2674r = new Q3.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            mVar = l.f2702a;
        } else {
            mVar = new m();
        }
        this.f2676t = mVar;
        this.f2679w = new RectF();
        this.f2680x = true;
        this.b = fVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m();
        l(getState());
        this.f2675s = new E1.c(this, 11);
    }
}

package ka;

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
import v8.u0;

/* loaded from: classes3.dex */
public class i extends Drawable implements x {
    public static final Paint A;

    /* renamed from: z, reason: collision with root package name */
    public static final l f20556z;

    /* renamed from: b, reason: collision with root package name */
    public h f20557b;

    /* renamed from: c, reason: collision with root package name */
    public final v[] f20558c;

    /* renamed from: d, reason: collision with root package name */
    public final v[] f20559d;

    /* renamed from: f, reason: collision with root package name */
    public final BitSet f20560f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f20561g;

    /* renamed from: h, reason: collision with root package name */
    public final Matrix f20562h;

    /* renamed from: i, reason: collision with root package name */
    public final Path f20563i;

    /* renamed from: j, reason: collision with root package name */
    public final Path f20564j;

    /* renamed from: k, reason: collision with root package name */
    public final RectF f20565k;

    /* renamed from: l, reason: collision with root package name */
    public final RectF f20566l;

    /* renamed from: m, reason: collision with root package name */
    public final Region f20567m;

    /* renamed from: n, reason: collision with root package name */
    public final Region f20568n;

    /* renamed from: o, reason: collision with root package name */
    public l f20569o;

    /* renamed from: p, reason: collision with root package name */
    public l f20570p;

    /* renamed from: q, reason: collision with root package name */
    public final Paint f20571q;

    /* renamed from: r, reason: collision with root package name */
    public final Paint f20572r;

    /* renamed from: s, reason: collision with root package name */
    public final ja.a f20573s;

    /* renamed from: t, reason: collision with root package name */
    public final f f20574t;
    public final o u;

    /* renamed from: v, reason: collision with root package name */
    public PorterDuffColorFilter f20575v;

    /* renamed from: w, reason: collision with root package name */
    public PorterDuffColorFilter f20576w;

    /* renamed from: x, reason: collision with root package name */
    public final RectF f20577x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f20578y;

    static {
        h7.l lVar = new h7.l(1);
        p6.a s5 = u0.s(0);
        lVar.a = s5;
        h7.l.b(s5);
        lVar.f18826b = s5;
        h7.l.b(s5);
        lVar.f18827c = s5;
        h7.l.b(s5);
        lVar.f18828d = s5;
        h7.l.b(s5);
        lVar.f18829e = new a(0.0f);
        lVar.f18830f = new a(0.0f);
        lVar.f18831g = new a(0.0f);
        lVar.f18832h = new a(0.0f);
        f20556z = new l(lVar);
        Paint paint = new Paint(1);
        A = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public i() {
        this(new l());
    }

    public final void a(RectF rectF, Path path) {
        o oVar = this.u;
        h hVar = this.f20557b;
        oVar.a(hVar.a, hVar.f20536b, hVar.f20545k, rectF, this.f20574t, path);
        if (this.f20557b.f20544j != 1.0f) {
            Matrix matrix = this.f20562h;
            matrix.reset();
            float f10 = this.f20557b.f20544j;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f20577x, true);
    }

    public final PorterDuffColorFilter b(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z10) {
        PorterDuffColorFilter porterDuffColorFilter;
        int color;
        int c10;
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            if (z10) {
                colorForState = c(colorForState);
            }
            return new PorterDuffColorFilter(colorForState, mode);
        }
        if (z10 && (c10 = c((color = paint.getColor()))) != color) {
            porterDuffColorFilter = new PorterDuffColorFilter(c10, PorterDuff.Mode.SRC_IN);
        } else {
            porterDuffColorFilter = null;
        }
        return porterDuffColorFilter;
    }

    public final int c(int i10) {
        boolean z10;
        float f10;
        int i11;
        h hVar = this.f20557b;
        float f11 = hVar.f20549o + hVar.f20550p + hVar.f20548n;
        ca.a aVar = hVar.f20537c;
        if (aVar != null && aVar.a) {
            if (g0.d.c(i10, 255) == aVar.f2778d) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (aVar.f2779e > 0.0f && f11 > 0.0f) {
                    f10 = Math.min(((((float) Math.log1p(f11 / r3)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
                } else {
                    f10 = 0.0f;
                }
                int alpha = Color.alpha(i10);
                int O = u0.O(f10, g0.d.c(i10, 255), aVar.f2776b);
                if (f10 > 0.0f && (i11 = aVar.f2777c) != 0) {
                    O = g0.d.b(g0.d.c(i11, ca.a.f2775f), O);
                }
                return g0.d.c(O, alpha);
            }
            return i10;
        }
        return i10;
    }

    public final void d(Canvas canvas) {
        if (this.f20560f.cardinality() > 0) {
            Log.w(com.mbridge.msdk.foundation.same.report.i.a, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i10 = this.f20557b.f20553s;
        Path path = this.f20563i;
        ja.a aVar = this.f20573s;
        if (i10 != 0) {
            canvas.drawPath(path, aVar.a);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            v vVar = this.f20558c[i11];
            int i12 = this.f20557b.f20552r;
            Matrix matrix = v.f20621b;
            vVar.a(matrix, aVar, i12, canvas);
            this.f20559d[i11].a(matrix, aVar, this.f20557b.f20552r, canvas);
        }
        if (this.f20578y) {
            h hVar = this.f20557b;
            int sin = (int) (Math.sin(Math.toRadians(hVar.f20554t)) * hVar.f20553s);
            h hVar2 = this.f20557b;
            int cos = (int) (Math.cos(Math.toRadians(hVar2.f20554t)) * hVar2.f20553s);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, A);
            canvas.translate(sin, cos);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f9, code lost:
    
        if (r0 != 0) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e7  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r24) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.i.draw(android.graphics.Canvas):void");
    }

    public final void e(Canvas canvas, Paint paint, Path path, l lVar, l lVar2, RectF rectF) {
        if (lVar.d(rectF)) {
            float q10 = c6.k.q(lVar2.f20582e.a(rectF), lVar.f20582e.a(rectF), this.f20557b.f20545k);
            canvas.drawRoundRect(rectF, q10, q10, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    public void f(Canvas canvas) {
        boolean z10;
        Paint paint = this.f20572r;
        Path path = this.f20564j;
        l lVar = this.f20569o;
        l lVar2 = this.f20570p;
        RectF rectF = this.f20566l;
        rectF.set(g());
        Paint.Style style = this.f20557b.f20555v;
        float f10 = 0.0f;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && paint.getStrokeWidth() > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f10 = paint.getStrokeWidth() / 2.0f;
        }
        rectF.inset(f10, f10);
        e(canvas, paint, path, lVar, lVar2, rectF);
    }

    public final RectF g() {
        RectF rectF = this.f20565k;
        rectF.set(getBounds());
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f20557b.f20547m;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f20557b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f20557b.f20551q == 2) {
            return;
        }
        if (i()) {
            outline.setRoundRect(getBounds(), c6.k.q(this.f20557b.f20536b.f20582e.a(g()), this.f20557b.a.f20582e.a(g()), this.f20557b.f20545k));
            return;
        }
        RectF g10 = g();
        Path path = this.f20563i;
        a(g10, path);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            ba.c.a(outline, path);
            return;
        }
        if (i10 >= 29) {
            try {
                ba.b.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            ba.b.a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f20557b.f20543i;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f20567m;
        region.set(bounds);
        RectF g10 = g();
        Path path = this.f20563i;
        a(g10, path);
        Region region2 = this.f20568n;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final void h(Context context) {
        this.f20557b.f20537c = new ca.a(context);
        n();
    }

    public final boolean i() {
        if (this.f20557b.a.d(g()) && this.f20557b.f20536b.d(g())) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f20561g = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        if (!super.isStateful() && (((colorStateList = this.f20557b.f20541g) == null || !colorStateList.isStateful()) && (((colorStateList2 = this.f20557b.f20540f) == null || !colorStateList2.isStateful()) && (((colorStateList3 = this.f20557b.f20539e) == null || !colorStateList3.isStateful()) && ((colorStateList4 = this.f20557b.f20538d) == null || !colorStateList4.isStateful()))))) {
            return false;
        }
        return true;
    }

    public final void j(float f10) {
        h hVar = this.f20557b;
        if (hVar.f20549o != f10) {
            hVar.f20549o = f10;
            n();
        }
    }

    public final void k(ColorStateList colorStateList) {
        h hVar = this.f20557b;
        if (hVar.f20538d != colorStateList) {
            hVar.f20538d = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean l(int[] iArr) {
        boolean z10;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f20557b.f20538d != null && color2 != (colorForState2 = this.f20557b.f20538d.getColorForState(iArr, (color2 = (paint2 = this.f20571q).getColor())))) {
            paint2.setColor(colorForState2);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f20557b.f20539e != null && color != (colorForState = this.f20557b.f20539e.getColorForState(iArr, (color = (paint = this.f20572r).getColor())))) {
            paint.setColor(colorForState);
            return true;
        }
        return z10;
    }

    public final boolean m() {
        PorterDuffColorFilter porterDuffColorFilter = this.f20575v;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f20576w;
        h hVar = this.f20557b;
        this.f20575v = b(hVar.f20541g, hVar.f20542h, this.f20571q, true);
        h hVar2 = this.f20557b;
        this.f20576w = b(hVar2.f20540f, hVar2.f20542h, this.f20572r, false);
        h hVar3 = this.f20557b;
        if (hVar3.u) {
            this.f20573s.a(hVar3.f20541g.getColorForState(getState(), 0));
        }
        if (!Objects.equals(porterDuffColorFilter, this.f20575v) || !Objects.equals(porterDuffColorFilter2, this.f20576w)) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f20557b = new h(this.f20557b);
        return this;
    }

    public final void n() {
        h hVar = this.f20557b;
        float f10 = hVar.f20549o + hVar.f20550p;
        hVar.f20552r = (int) Math.ceil(0.75f * f10);
        this.f20557b.f20553s = (int) Math.ceil(f10 * 0.25f);
        m();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f20561g = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z10;
        boolean l10 = l(iArr);
        boolean m10 = m();
        if (!l10 && !m10) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        h hVar = this.f20557b;
        if (hVar.f20547m != i10) {
            hVar.f20547m = i10;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f20557b.getClass();
        super.invalidateSelf();
    }

    @Override // ka.x
    public final void setShapeAppearanceModel(l lVar) {
        this.f20557b.a = lVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f20557b.f20541g = colorStateList;
        m();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        h hVar = this.f20557b;
        if (hVar.f20542h != mode) {
            hVar.f20542h = mode;
            m();
            super.invalidateSelf();
        }
    }

    public i(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(l.b(context, attributeSet, i10, i11).a());
    }

    public i(l lVar) {
        this(new h(lVar));
    }

    public i(h hVar) {
        o oVar;
        this.f20558c = new v[4];
        this.f20559d = new v[4];
        this.f20560f = new BitSet(8);
        this.f20562h = new Matrix();
        this.f20563i = new Path();
        this.f20564j = new Path();
        this.f20565k = new RectF();
        this.f20566l = new RectF();
        this.f20567m = new Region();
        this.f20568n = new Region();
        Paint paint = new Paint(1);
        this.f20571q = paint;
        Paint paint2 = new Paint(1);
        this.f20572r = paint2;
        this.f20573s = new ja.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            oVar = m.a;
        } else {
            oVar = new o();
        }
        this.u = oVar;
        this.f20577x = new RectF();
        this.f20578y = true;
        this.f20557b = hVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m();
        l(getState());
        this.f20574t = new f(this);
    }
}

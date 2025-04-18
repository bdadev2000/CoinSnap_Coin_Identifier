package z9;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import ea.h;
import h0.g;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import ka.i;
import ka.l;
import ka.o;

/* loaded from: classes3.dex */
public final class f extends i implements Drawable.Callback, h {
    public static final int[] K0 = {R.attr.state_enabled};
    public static final ShapeDrawable L0 = new ShapeDrawable(new OvalShape());
    public ColorStateList A0;
    public ColorStateList B;
    public PorterDuff.Mode B0;
    public ColorStateList C;
    public int[] C0;
    public float D;
    public boolean D0;
    public float E;
    public ColorStateList E0;
    public ColorStateList F;
    public WeakReference F0;
    public float G;
    public TextUtils.TruncateAt G0;
    public ColorStateList H;
    public boolean H0;
    public CharSequence I;
    public int I0;
    public boolean J;
    public boolean J0;
    public Drawable K;
    public ColorStateList L;
    public float M;
    public boolean N;
    public boolean O;
    public Drawable P;
    public RippleDrawable Q;
    public ColorStateList R;
    public float S;
    public SpannableStringBuilder T;
    public boolean U;
    public boolean V;
    public Drawable W;
    public ColorStateList X;
    public s9.b Y;
    public s9.b Z;

    /* renamed from: a0, reason: collision with root package name */
    public float f28673a0;

    /* renamed from: b0, reason: collision with root package name */
    public float f28674b0;

    /* renamed from: c0, reason: collision with root package name */
    public float f28675c0;

    /* renamed from: d0, reason: collision with root package name */
    public float f28676d0;

    /* renamed from: e0, reason: collision with root package name */
    public float f28677e0;

    /* renamed from: f0, reason: collision with root package name */
    public float f28678f0;

    /* renamed from: g0, reason: collision with root package name */
    public float f28679g0;

    /* renamed from: h0, reason: collision with root package name */
    public float f28680h0;

    /* renamed from: i0, reason: collision with root package name */
    public final Context f28681i0;

    /* renamed from: j0, reason: collision with root package name */
    public final Paint f28682j0;

    /* renamed from: k0, reason: collision with root package name */
    public final Paint.FontMetrics f28683k0;

    /* renamed from: l0, reason: collision with root package name */
    public final RectF f28684l0;

    /* renamed from: m0, reason: collision with root package name */
    public final PointF f28685m0;

    /* renamed from: n0, reason: collision with root package name */
    public final Path f28686n0;

    /* renamed from: o0, reason: collision with root package name */
    public final ea.i f28687o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f28688p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f28689q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f28690r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f28691s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f28692t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f28693u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f28694v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f28695w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f28696x0;

    /* renamed from: y0, reason: collision with root package name */
    public ColorFilter f28697y0;

    /* renamed from: z0, reason: collision with root package name */
    public PorterDuffColorFilter f28698z0;

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.plantcare.ai.identifier.plantid.R.attr.chipStyle, com.plantcare.ai.identifier.plantid.R.style.Widget_MaterialComponents_Chip_Action);
        this.E = -1.0f;
        this.f28682j0 = new Paint(1);
        this.f28683k0 = new Paint.FontMetrics();
        this.f28684l0 = new RectF();
        this.f28685m0 = new PointF();
        this.f28686n0 = new Path();
        this.f28696x0 = 255;
        this.B0 = PorterDuff.Mode.SRC_IN;
        this.F0 = new WeakReference(null);
        h(context);
        this.f28681i0 = context;
        ea.i iVar = new ea.i(this);
        this.f28687o0 = iVar;
        this.I = "";
        iVar.a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = K0;
        setState(iArr);
        if (!Arrays.equals(this.C0, iArr)) {
            this.C0 = iArr;
            if (U()) {
                w(getState(), iArr);
            }
        }
        this.H0 = true;
        int[] iArr2 = ia.a.a;
        L0.setTint(-1);
    }

    public static void V(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean t(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean u(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A(boolean z10) {
        boolean z11;
        if (this.V != z10) {
            boolean S = S();
            this.V = z10;
            boolean S2 = S();
            if (S != S2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (S2) {
                    o(this.W);
                } else {
                    V(this.W);
                }
                invalidateSelf();
                v();
            }
        }
    }

    public final void B(float f10) {
        if (this.E != f10) {
            this.E = f10;
            l lVar = this.f20557b.a;
            lVar.getClass();
            h7.l lVar2 = new h7.l(lVar);
            lVar2.f18829e = new ka.a(f10);
            lVar2.f18830f = new ka.a(f10);
            lVar2.f18831g = new ka.a(f10);
            lVar2.f18832h = new ka.a(f10);
            setShapeAppearanceModel(new l(lVar2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.K;
        Drawable drawable4 = null;
        if (drawable3 != 0) {
            boolean z10 = drawable3 instanceof g;
            drawable2 = drawable3;
            if (z10) {
                ((h0.h) ((g) drawable3)).getClass();
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float q10 = q();
            if (drawable != null) {
                drawable4 = drawable.mutate();
            }
            this.K = drawable4;
            float q11 = q();
            V(drawable2);
            if (T()) {
                o(this.K);
            }
            invalidateSelf();
            if (q10 != q11) {
                v();
            }
        }
    }

    public final void D(float f10) {
        if (this.M != f10) {
            float q10 = q();
            this.M = f10;
            float q11 = q();
            invalidateSelf();
            if (q10 != q11) {
                v();
            }
        }
    }

    public final void E(ColorStateList colorStateList) {
        this.N = true;
        if (this.L != colorStateList) {
            this.L = colorStateList;
            if (T()) {
                h0.a.h(this.K, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void F(boolean z10) {
        boolean z11;
        if (this.J != z10) {
            boolean T = T();
            this.J = z10;
            boolean T2 = T();
            if (T != T2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (T2) {
                    o(this.K);
                } else {
                    V(this.K);
                }
                invalidateSelf();
                v();
            }
        }
    }

    public final void G(ColorStateList colorStateList) {
        if (this.F != colorStateList) {
            this.F = colorStateList;
            if (this.J0) {
                ka.h hVar = this.f20557b;
                if (hVar.f20539e != colorStateList) {
                    hVar.f20539e = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void H(float f10) {
        if (this.G != f10) {
            this.G = f10;
            this.f28682j0.setStrokeWidth(f10);
            if (this.J0) {
                this.f20557b.f20546l = f10;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.P;
        Drawable drawable4 = null;
        if (drawable3 != 0) {
            boolean z10 = drawable3 instanceof g;
            drawable2 = drawable3;
            if (z10) {
                ((h0.h) ((g) drawable3)).getClass();
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float r6 = r();
            if (drawable != null) {
                drawable4 = drawable.mutate();
            }
            this.P = drawable4;
            int[] iArr = ia.a.a;
            this.Q = new RippleDrawable(ia.a.a(this.H), this.P, L0);
            float r10 = r();
            V(drawable2);
            if (U()) {
                o(this.P);
            }
            invalidateSelf();
            if (r6 != r10) {
                v();
            }
        }
    }

    public final void J(float f10) {
        if (this.f28679g0 != f10) {
            this.f28679g0 = f10;
            invalidateSelf();
            if (U()) {
                v();
            }
        }
    }

    public final void K(float f10) {
        if (this.S != f10) {
            this.S = f10;
            invalidateSelf();
            if (U()) {
                v();
            }
        }
    }

    public final void L(float f10) {
        if (this.f28678f0 != f10) {
            this.f28678f0 = f10;
            invalidateSelf();
            if (U()) {
                v();
            }
        }
    }

    public final void M(ColorStateList colorStateList) {
        if (this.R != colorStateList) {
            this.R = colorStateList;
            if (U()) {
                h0.a.h(this.P, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void N(boolean z10) {
        boolean z11;
        if (this.O != z10) {
            boolean U = U();
            this.O = z10;
            boolean U2 = U();
            if (U != U2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (U2) {
                    o(this.P);
                } else {
                    V(this.P);
                }
                invalidateSelf();
                v();
            }
        }
    }

    public final void O(float f10) {
        if (this.f28675c0 != f10) {
            float q10 = q();
            this.f28675c0 = f10;
            float q11 = q();
            invalidateSelf();
            if (q10 != q11) {
                v();
            }
        }
    }

    public final void P(float f10) {
        if (this.f28674b0 != f10) {
            float q10 = q();
            this.f28674b0 = f10;
            float q11 = q();
            invalidateSelf();
            if (q10 != q11) {
                v();
            }
        }
    }

    public final void Q(ColorStateList colorStateList) {
        ColorStateList colorStateList2;
        if (this.H != colorStateList) {
            this.H = colorStateList;
            if (this.D0) {
                colorStateList2 = ia.a.a(colorStateList);
            } else {
                colorStateList2 = null;
            }
            this.E0 = colorStateList2;
            onStateChange(getState());
        }
    }

    public final void R(ha.d dVar) {
        ea.i iVar = this.f28687o0;
        if (iVar.f17255f != dVar) {
            iVar.f17255f = dVar;
            if (dVar != null) {
                TextPaint textPaint = iVar.a;
                Context context = this.f28681i0;
                b bVar = iVar.f17251b;
                dVar.e(context, textPaint, bVar);
                h hVar = (h) iVar.f17254e.get();
                if (hVar != null) {
                    textPaint.drawableState = hVar.getState();
                }
                dVar.d(context, textPaint, bVar);
                iVar.f17253d = true;
            }
            h hVar2 = (h) iVar.f17254e.get();
            if (hVar2 != null) {
                f fVar = (f) hVar2;
                fVar.v();
                fVar.invalidateSelf();
                fVar.onStateChange(hVar2.getState());
            }
        }
    }

    public final boolean S() {
        return this.V && this.W != null && this.f28694v0;
    }

    public final boolean T() {
        return this.J && this.K != null;
    }

    public final boolean U() {
        return this.O && this.P != null;
    }

    @Override // ka.i, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i10;
        int i11;
        boolean z10;
        int i12;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i10 = this.f28696x0) != 0) {
            if (i10 < 255) {
                i11 = canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i10);
            } else {
                i11 = 0;
            }
            boolean z11 = this.J0;
            Paint paint = this.f28682j0;
            RectF rectF = this.f28684l0;
            if (!z11) {
                paint.setColor(this.f28688p0);
                paint.setStyle(Paint.Style.FILL);
                rectF.set(bounds);
                canvas.drawRoundRect(rectF, s(), s(), paint);
            }
            if (!this.J0) {
                paint.setColor(this.f28689q0);
                paint.setStyle(Paint.Style.FILL);
                ColorFilter colorFilter = this.f28697y0;
                if (colorFilter == null) {
                    colorFilter = this.f28698z0;
                }
                paint.setColorFilter(colorFilter);
                rectF.set(bounds);
                canvas.drawRoundRect(rectF, s(), s(), paint);
            }
            if (this.J0) {
                super.draw(canvas);
            }
            if (this.G > 0.0f && !this.J0) {
                paint.setColor(this.f28691s0);
                paint.setStyle(Paint.Style.STROKE);
                if (!this.J0) {
                    ColorFilter colorFilter2 = this.f28697y0;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.f28698z0;
                    }
                    paint.setColorFilter(colorFilter2);
                }
                float f10 = bounds.left;
                float f11 = this.G / 2.0f;
                rectF.set(f10 + f11, bounds.top + f11, bounds.right - f11, bounds.bottom - f11);
                float f12 = this.E - (this.G / 2.0f);
                canvas.drawRoundRect(rectF, f12, f12, paint);
            }
            paint.setColor(this.f28692t0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            if (!this.J0) {
                canvas.drawRoundRect(rectF, s(), s(), paint);
            } else {
                RectF rectF2 = new RectF(bounds);
                Path path = this.f28686n0;
                o oVar = this.u;
                ka.h hVar = this.f20557b;
                oVar.a(hVar.a, hVar.f20536b, hVar.f20545k, rectF2, this.f20574t, path);
                RectF g10 = g();
                ka.h hVar2 = this.f20557b;
                e(canvas, paint, path, hVar2.a, hVar2.f20536b, g10);
            }
            if (T()) {
                p(bounds, rectF);
                float f13 = rectF.left;
                float f14 = rectF.top;
                canvas.translate(f13, f14);
                this.K.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
                this.K.draw(canvas);
                canvas.translate(-f13, -f14);
            }
            if (S()) {
                p(bounds, rectF);
                float f15 = rectF.left;
                float f16 = rectF.top;
                canvas.translate(f15, f16);
                this.W.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
                this.W.draw(canvas);
                canvas.translate(-f15, -f16);
            }
            if (this.H0 && this.I != null) {
                PointF pointF = this.f28685m0;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                CharSequence charSequence = this.I;
                ea.i iVar = this.f28687o0;
                if (charSequence != null) {
                    float q10 = q() + this.f28673a0 + this.f28676d0;
                    if (h0.b.a(this) == 0) {
                        pointF.x = bounds.left + q10;
                        align = Paint.Align.LEFT;
                    } else {
                        pointF.x = bounds.right - q10;
                        align = Paint.Align.RIGHT;
                    }
                    float centerY = bounds.centerY();
                    TextPaint textPaint = iVar.a;
                    Paint.FontMetrics fontMetrics = this.f28683k0;
                    textPaint.getFontMetrics(fontMetrics);
                    pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                rectF.setEmpty();
                if (this.I != null) {
                    float q11 = q() + this.f28673a0 + this.f28676d0;
                    float r6 = r() + this.f28680h0 + this.f28677e0;
                    if (h0.b.a(this) == 0) {
                        rectF.left = bounds.left + q11;
                        rectF.right = bounds.right - r6;
                    } else {
                        rectF.left = bounds.left + r6;
                        rectF.right = bounds.right - q11;
                    }
                    rectF.top = bounds.top;
                    rectF.bottom = bounds.bottom;
                }
                ha.d dVar = iVar.f17255f;
                TextPaint textPaint2 = iVar.a;
                if (dVar != null) {
                    textPaint2.drawableState = getState();
                    iVar.f17255f.d(this.f28681i0, textPaint2, iVar.f17251b);
                }
                textPaint2.setTextAlign(align);
                if (Math.round(iVar.a(this.I.toString())) > Math.round(rectF.width())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    int save = canvas.save();
                    canvas.clipRect(rectF);
                    i12 = save;
                } else {
                    i12 = 0;
                }
                CharSequence charSequence2 = this.I;
                if (z10 && this.G0 != null) {
                    charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF.width(), this.G0);
                }
                canvas.drawText(charSequence2, 0, charSequence2.length(), pointF.x, pointF.y, textPaint2);
                if (z10) {
                    canvas.restoreToCount(i12);
                }
            }
            if (U()) {
                rectF.setEmpty();
                if (U()) {
                    float f17 = this.f28680h0 + this.f28679g0;
                    if (h0.b.a(this) == 0) {
                        float f18 = bounds.right - f17;
                        rectF.right = f18;
                        rectF.left = f18 - this.S;
                    } else {
                        float f19 = bounds.left + f17;
                        rectF.left = f19;
                        rectF.right = f19 + this.S;
                    }
                    float exactCenterY = bounds.exactCenterY();
                    float f20 = this.S;
                    float f21 = exactCenterY - (f20 / 2.0f);
                    rectF.top = f21;
                    rectF.bottom = f21 + f20;
                }
                float f22 = rectF.left;
                float f23 = rectF.top;
                canvas.translate(f22, f23);
                this.P.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
                int[] iArr = ia.a.a;
                this.Q.setBounds(this.P.getBounds());
                this.Q.jumpToCurrentState();
                this.Q.draw(canvas);
                canvas.translate(-f22, -f23);
            }
            if (this.f28696x0 < 255) {
                canvas.restoreToCount(i11);
            }
        }
    }

    @Override // ka.i, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f28696x0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f28697y0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.D;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(r() + this.f28687o0.a(this.I.toString()) + q() + this.f28673a0 + this.f28676d0 + this.f28677e0 + this.f28680h0), this.I0);
    }

    @Override // ka.i, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // ka.i, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.J0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.E);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.D, this.E);
        }
        outline.setAlpha(this.f28696x0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // ka.i, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        boolean z10;
        boolean z11;
        ColorStateList colorStateList;
        if (t(this.B) || t(this.C) || t(this.F)) {
            return true;
        }
        if (this.D0 && t(this.E0)) {
            return true;
        }
        ha.d dVar = this.f28687o0.f17255f;
        if (dVar != null && (colorStateList = dVar.f19000k) != null && colorStateList.isStateful()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        if (this.V && this.W != null && this.U) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 || u(this.K) || u(this.W) || t(this.A0)) {
            return true;
        }
        return false;
    }

    public final void o(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        h0.b.b(drawable, h0.b.a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.P) {
            if (drawable.isStateful()) {
                drawable.setState(this.C0);
            }
            h0.a.h(drawable, this.R);
            return;
        }
        Drawable drawable2 = this.K;
        if (drawable == drawable2 && this.N) {
            h0.a.h(drawable2, this.L);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i10) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (T()) {
            onLayoutDirectionChanged |= h0.b.b(this.K, i10);
        }
        if (S()) {
            onLayoutDirectionChanged |= h0.b.b(this.W, i10);
        }
        if (U()) {
            onLayoutDirectionChanged |= h0.b.b(this.P, i10);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        boolean onLevelChange = super.onLevelChange(i10);
        if (T()) {
            onLevelChange |= this.K.setLevel(i10);
        }
        if (S()) {
            onLevelChange |= this.W.setLevel(i10);
        }
        if (U()) {
            onLevelChange |= this.P.setLevel(i10);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // ka.i, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.J0) {
            super.onStateChange(iArr);
        }
        return w(iArr, this.C0);
    }

    public final void p(Rect rect, RectF rectF) {
        Drawable drawable;
        Drawable drawable2;
        float f10;
        rectF.setEmpty();
        if (T() || S()) {
            float f11 = this.f28673a0 + this.f28674b0;
            if (this.f28694v0) {
                drawable = this.W;
            } else {
                drawable = this.K;
            }
            float f12 = this.M;
            if (f12 <= 0.0f && drawable != null) {
                f12 = drawable.getIntrinsicWidth();
            }
            if (h0.b.a(this) == 0) {
                float f13 = rect.left + f11;
                rectF.left = f13;
                rectF.right = f13 + f12;
            } else {
                float f14 = rect.right - f11;
                rectF.right = f14;
                rectF.left = f14 - f12;
            }
            if (this.f28694v0) {
                drawable2 = this.W;
            } else {
                drawable2 = this.K;
            }
            float f15 = this.M;
            if (f15 <= 0.0f && drawable2 != null) {
                f15 = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f28681i0.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= f15) {
                    f10 = drawable2.getIntrinsicHeight();
                    float exactCenterY = rect.exactCenterY() - (f10 / 2.0f);
                    rectF.top = exactCenterY;
                    rectF.bottom = exactCenterY + f10;
                }
            }
            f10 = f15;
            float exactCenterY2 = rect.exactCenterY() - (f10 / 2.0f);
            rectF.top = exactCenterY2;
            rectF.bottom = exactCenterY2 + f10;
        }
    }

    public final float q() {
        Drawable drawable;
        if (!T() && !S()) {
            return 0.0f;
        }
        float f10 = this.f28674b0;
        if (this.f28694v0) {
            drawable = this.W;
        } else {
            drawable = this.K;
        }
        float f11 = this.M;
        if (f11 <= 0.0f && drawable != null) {
            f11 = drawable.getIntrinsicWidth();
        }
        return f11 + f10 + this.f28675c0;
    }

    public final float r() {
        if (U()) {
            return this.f28678f0 + this.S + this.f28679g0;
        }
        return 0.0f;
    }

    public final float s() {
        if (this.J0) {
            return this.f20557b.a.f20582e.a(g());
        }
        return this.E;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j3);
        }
    }

    @Override // ka.i, android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.f28696x0 != i10) {
            this.f28696x0 = i10;
            invalidateSelf();
        }
    }

    @Override // ka.i, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f28697y0 != colorFilter) {
            this.f28697y0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // ka.i, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.A0 != colorStateList) {
            this.A0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // ka.i, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.B0 != mode) {
            this.B0 = mode;
            ColorStateList colorStateList = this.A0;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            } else {
                porterDuffColorFilter = null;
            }
            this.f28698z0 = porterDuffColorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (T()) {
            visible |= this.K.setVisible(z10, z11);
        }
        if (S()) {
            visible |= this.W.setVisible(z10, z11);
        }
        if (U()) {
            visible |= this.P.setVisible(z10, z11);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void v() {
        e eVar = (e) this.F0.get();
        if (eVar != null) {
            Chip chip = (Chip) eVar;
            chip.b(chip.f11653r);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    public final boolean w(int[] iArr, int[] iArr2) {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        int i14;
        boolean z12;
        boolean z13;
        boolean z14;
        int i15;
        PorterDuffColorFilter porterDuffColorFilter;
        ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.B;
        if (colorStateList2 != null) {
            i10 = colorStateList2.getColorForState(iArr, this.f28688p0);
        } else {
            i10 = 0;
        }
        int c10 = c(i10);
        boolean z15 = true;
        if (this.f28688p0 != c10) {
            this.f28688p0 = c10;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.C;
        if (colorStateList3 != null) {
            i11 = colorStateList3.getColorForState(iArr, this.f28689q0);
        } else {
            i11 = 0;
        }
        int c11 = c(i11);
        if (this.f28689q0 != c11) {
            this.f28689q0 = c11;
            onStateChange = true;
        }
        int b3 = g0.d.b(c11, c10);
        if (this.f28690r0 != b3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f20557b.f20538d == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 | z11) {
            this.f28690r0 = b3;
            k(ColorStateList.valueOf(b3));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.F;
        if (colorStateList4 != null) {
            i12 = colorStateList4.getColorForState(iArr, this.f28691s0);
        } else {
            i12 = 0;
        }
        if (this.f28691s0 != i12) {
            this.f28691s0 = i12;
            onStateChange = true;
        }
        if (this.E0 != null && ia.a.b(iArr)) {
            i13 = this.E0.getColorForState(iArr, this.f28692t0);
        } else {
            i13 = 0;
        }
        if (this.f28692t0 != i13) {
            this.f28692t0 = i13;
            if (this.D0) {
                onStateChange = true;
            }
        }
        ha.d dVar = this.f28687o0.f17255f;
        if (dVar != null && (colorStateList = dVar.f19000k) != null) {
            i14 = colorStateList.getColorForState(iArr, this.f28693u0);
        } else {
            i14 = 0;
        }
        if (this.f28693u0 != i14) {
            this.f28693u0 = i14;
            onStateChange = true;
        }
        int[] state = getState();
        if (state != null) {
            for (int i16 : state) {
                if (i16 == 16842912) {
                    z12 = true;
                    break;
                }
            }
        }
        z12 = false;
        if (z12 && this.U) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (this.f28694v0 != z13 && this.W != null) {
            float q10 = q();
            this.f28694v0 = z13;
            if (q10 != q()) {
                onStateChange = true;
                z14 = true;
            } else {
                z14 = false;
                onStateChange = true;
            }
        } else {
            z14 = false;
        }
        ColorStateList colorStateList5 = this.A0;
        if (colorStateList5 != null) {
            i15 = colorStateList5.getColorForState(iArr, this.f28695w0);
        } else {
            i15 = 0;
        }
        if (this.f28695w0 != i15) {
            this.f28695w0 = i15;
            ColorStateList colorStateList6 = this.A0;
            PorterDuff.Mode mode = this.B0;
            if (colorStateList6 != null && mode != null) {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
            } else {
                porterDuffColorFilter = null;
            }
            this.f28698z0 = porterDuffColorFilter;
        } else {
            z15 = onStateChange;
        }
        if (u(this.K)) {
            z15 |= this.K.setState(iArr);
        }
        if (u(this.W)) {
            z15 |= this.W.setState(iArr);
        }
        if (u(this.P)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z15 |= this.P.setState(iArr3);
        }
        int[] iArr4 = ia.a.a;
        if (u(this.Q)) {
            z15 |= this.Q.setState(iArr2);
        }
        if (z15) {
            invalidateSelf();
        }
        if (z14) {
            v();
        }
        return z15;
    }

    public final void x(boolean z10) {
        if (this.U != z10) {
            this.U = z10;
            float q10 = q();
            if (!z10 && this.f28694v0) {
                this.f28694v0 = false;
            }
            float q11 = q();
            invalidateSelf();
            if (q10 != q11) {
                v();
            }
        }
    }

    public final void y(Drawable drawable) {
        if (this.W != drawable) {
            float q10 = q();
            this.W = drawable;
            float q11 = q();
            V(this.W);
            o(this.W);
            invalidateSelf();
            if (q10 != q11) {
                v();
            }
        }
    }

    public final void z(ColorStateList colorStateList) {
        boolean z10;
        if (this.X != colorStateList) {
            this.X = colorStateList;
            if (this.V && this.W != null && this.U) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                h0.a.h(this.W, colorStateList);
            }
            onStateChange(getState());
        }
    }
}

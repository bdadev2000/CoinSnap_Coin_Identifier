package com.google.android.material.imageview;

import I.h;
import R3.g;
import R3.k;
import R3.l;
import R3.m;
import R3.v;
import W3.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import com.tools.arruler.photomeasure.camera.ruler.R;
import w3.AbstractC2861a;

/* loaded from: classes2.dex */
public class ShapeableImageView extends AppCompatImageView implements v {
    public final m b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f14075c;

    /* renamed from: d, reason: collision with root package name */
    public final RectF f14076d;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f14077f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f14078g;

    /* renamed from: h, reason: collision with root package name */
    public final Path f14079h;

    /* renamed from: i, reason: collision with root package name */
    public ColorStateList f14080i;

    /* renamed from: j, reason: collision with root package name */
    public g f14081j;

    /* renamed from: k, reason: collision with root package name */
    public k f14082k;
    public float l;
    public final Path m;

    /* renamed from: n, reason: collision with root package name */
    public final int f14083n;

    /* renamed from: o, reason: collision with root package name */
    public final int f14084o;

    /* renamed from: p, reason: collision with root package name */
    public final int f14085p;

    /* renamed from: q, reason: collision with root package name */
    public final int f14086q;

    /* renamed from: r, reason: collision with root package name */
    public final int f14087r;

    /* renamed from: s, reason: collision with root package name */
    public final int f14088s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f14089t;

    public ShapeableImageView(Context context, @Nullable AttributeSet attributeSet) {
        super(a.a(context, attributeSet, 0, R.style.Widget_MaterialComponents_ShapeableImageView), attributeSet, 0);
        this.b = l.f2702a;
        this.f14079h = new Path();
        this.f14089t = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f14078g = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f14075c = new RectF();
        this.f14076d = new RectF();
        this.m = new Path();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC2861a.f23681w, 0, R.style.Widget_MaterialComponents_ShapeableImageView);
        setLayerType(2, null);
        this.f14080i = android.support.v4.media.session.a.p(context2, obtainStyledAttributes, 9);
        this.l = obtainStyledAttributes.getDimensionPixelSize(10, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f14083n = dimensionPixelSize;
        this.f14084o = dimensionPixelSize;
        this.f14085p = dimensionPixelSize;
        this.f14086q = dimensionPixelSize;
        this.f14083n = obtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.f14084o = obtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        this.f14085p = obtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.f14086q = obtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.f14087r = obtainStyledAttributes.getDimensionPixelSize(5, Integer.MIN_VALUE);
        this.f14088s = obtainStyledAttributes.getDimensionPixelSize(2, Integer.MIN_VALUE);
        obtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f14077f = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.f14082k = k.b(context2, attributeSet, 0, R.style.Widget_MaterialComponents_ShapeableImageView).a();
        setOutlineProvider(new K3.a(this));
    }

    public final boolean b() {
        if (getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public final void d(int i9, int i10) {
        RectF rectF = this.f14075c;
        rectF.set(getPaddingLeft(), getPaddingTop(), i9 - getPaddingRight(), i10 - getPaddingBottom());
        k kVar = this.f14082k;
        Path path = this.f14079h;
        this.b.a(kVar, 1.0f, rectF, null, path);
        Path path2 = this.m;
        path2.rewind();
        path2.addPath(path);
        RectF rectF2 = this.f14076d;
        rectF2.set(0.0f, 0.0f, i9, i10);
        path2.addRect(rectF2, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.f14086q;
    }

    public final int getContentPaddingEnd() {
        int i9 = this.f14088s;
        if (i9 != Integer.MIN_VALUE) {
            return i9;
        }
        if (b()) {
            return this.f14083n;
        }
        return this.f14085p;
    }

    public int getContentPaddingLeft() {
        int i9;
        int i10;
        if (this.f14087r != Integer.MIN_VALUE || this.f14088s != Integer.MIN_VALUE) {
            if (b() && (i10 = this.f14088s) != Integer.MIN_VALUE) {
                return i10;
            }
            if (!b() && (i9 = this.f14087r) != Integer.MIN_VALUE) {
                return i9;
            }
        }
        return this.f14083n;
    }

    public int getContentPaddingRight() {
        int i9;
        int i10;
        if (this.f14087r != Integer.MIN_VALUE || this.f14088s != Integer.MIN_VALUE) {
            if (b() && (i10 = this.f14087r) != Integer.MIN_VALUE) {
                return i10;
            }
            if (!b() && (i9 = this.f14088s) != Integer.MIN_VALUE) {
                return i9;
            }
        }
        return this.f14085p;
    }

    public final int getContentPaddingStart() {
        int i9 = this.f14087r;
        if (i9 != Integer.MIN_VALUE) {
            return i9;
        }
        if (b()) {
            return this.f14085p;
        }
        return this.f14083n;
    }

    public int getContentPaddingTop() {
        return this.f14084o;
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    @NonNull
    public k getShapeAppearanceModel() {
        return this.f14082k;
    }

    @Nullable
    public ColorStateList getStrokeColor() {
        return this.f14080i;
    }

    public float getStrokeWidth() {
        return this.l;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.m, this.f14078g);
        if (this.f14080i != null) {
            Paint paint = this.f14077f;
            paint.setStrokeWidth(this.l);
            int colorForState = this.f14080i.getColorForState(getDrawableState(), this.f14080i.getDefaultColor());
            if (this.l > 0.0f && colorForState != 0) {
                paint.setColor(colorForState);
                canvas.drawPath(this.f14079h, paint);
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        if (this.f14089t || !isLayoutDirectionResolved()) {
            return;
        }
        this.f14089t = true;
        if (!isPaddingRelative() && this.f14087r == Integer.MIN_VALUE && this.f14088s == Integer.MIN_VALUE) {
            setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
        } else {
            setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        d(i9, i10);
    }

    @Override // android.view.View
    public final void setPadding(int i9, int i10, int i11, int i12) {
        super.setPadding(getContentPaddingLeft() + i9, getContentPaddingTop() + i10, getContentPaddingRight() + i11, getContentPaddingBottom() + i12);
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i9, int i10, int i11, int i12) {
        super.setPaddingRelative(getContentPaddingStart() + i9, getContentPaddingTop() + i10, getContentPaddingEnd() + i11, getContentPaddingBottom() + i12);
    }

    @Override // R3.v
    public void setShapeAppearanceModel(@NonNull k kVar) {
        this.f14082k = kVar;
        g gVar = this.f14081j;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        d(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        this.f14080i = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i9) {
        setStrokeColor(h.getColorStateList(getContext(), i9));
    }

    public void setStrokeWidth(float f9) {
        if (this.l != f9) {
            this.l = f9;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i9) {
        setStrokeWidth(getResources().getDimensionPixelSize(i9));
    }
}

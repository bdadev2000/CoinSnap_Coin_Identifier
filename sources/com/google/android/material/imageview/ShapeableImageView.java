package com.google.android.material.imageview;

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
import com.plantcare.ai.identifier.plantid.R;
import d0.h;
import ka.i;
import ka.l;
import ka.m;
import ka.o;
import ka.x;
import p6.a;
import v8.u0;

/* loaded from: classes3.dex */
public class ShapeableImageView extends AppCompatImageView implements x {

    /* renamed from: b, reason: collision with root package name */
    public final o f11745b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f11746c;

    /* renamed from: d, reason: collision with root package name */
    public final RectF f11747d;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f11748f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f11749g;

    /* renamed from: h, reason: collision with root package name */
    public final Path f11750h;

    /* renamed from: i, reason: collision with root package name */
    public ColorStateList f11751i;

    /* renamed from: j, reason: collision with root package name */
    public i f11752j;

    /* renamed from: k, reason: collision with root package name */
    public l f11753k;

    /* renamed from: l, reason: collision with root package name */
    public float f11754l;

    /* renamed from: m, reason: collision with root package name */
    public final Path f11755m;

    /* renamed from: n, reason: collision with root package name */
    public final int f11756n;

    /* renamed from: o, reason: collision with root package name */
    public final int f11757o;

    /* renamed from: p, reason: collision with root package name */
    public final int f11758p;

    /* renamed from: q, reason: collision with root package name */
    public final int f11759q;

    /* renamed from: r, reason: collision with root package name */
    public final int f11760r;

    /* renamed from: s, reason: collision with root package name */
    public final int f11761s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f11762t;

    public ShapeableImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final boolean c() {
        return getLayoutDirection() == 1;
    }

    public final void d(int i10, int i11) {
        RectF rectF = this.f11746c;
        rectF.set(getPaddingLeft(), getPaddingTop(), i10 - getPaddingRight(), i11 - getPaddingBottom());
        l lVar = this.f11753k;
        Path path = this.f11750h;
        o oVar = this.f11745b;
        oVar.getClass();
        oVar.a(lVar, i.f20556z, 1.0f, rectF, null, path);
        Path path2 = this.f11755m;
        path2.rewind();
        path2.addPath(path);
        RectF rectF2 = this.f11747d;
        rectF2.set(0.0f, 0.0f, i10, i11);
        path2.addRect(rectF2, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.f11759q;
    }

    public final int getContentPaddingEnd() {
        int i10 = this.f11761s;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        if (c()) {
            return this.f11756n;
        }
        return this.f11758p;
    }

    public int getContentPaddingLeft() {
        boolean z10;
        int i10 = this.f11761s;
        int i11 = this.f11760r;
        if (i11 == Integer.MIN_VALUE && i10 == Integer.MIN_VALUE) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            if (c() && i10 != Integer.MIN_VALUE) {
                return i10;
            }
            if (!c() && i11 != Integer.MIN_VALUE) {
                return i11;
            }
        }
        return this.f11756n;
    }

    public int getContentPaddingRight() {
        boolean z10;
        int i10 = this.f11761s;
        int i11 = this.f11760r;
        if (i11 == Integer.MIN_VALUE && i10 == Integer.MIN_VALUE) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            if (c() && i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (!c() && i10 != Integer.MIN_VALUE) {
                return i10;
            }
        }
        return this.f11758p;
    }

    public final int getContentPaddingStart() {
        int i10 = this.f11760r;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        if (c()) {
            return this.f11758p;
        }
        return this.f11756n;
    }

    public int getContentPaddingTop() {
        return this.f11757o;
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
    public l getShapeAppearanceModel() {
        return this.f11753k;
    }

    @Nullable
    public ColorStateList getStrokeColor() {
        return this.f11751i;
    }

    public float getStrokeWidth() {
        return this.f11754l;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f11755m, this.f11749g);
        if (this.f11751i != null) {
            Paint paint = this.f11748f;
            paint.setStrokeWidth(this.f11754l);
            int colorForState = this.f11751i.getColorForState(getDrawableState(), this.f11751i.getDefaultColor());
            if (this.f11754l > 0.0f && colorForState != 0) {
                paint.setColor(colorForState);
                canvas.drawPath(this.f11750h, paint);
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f11762t || !isLayoutDirectionResolved()) {
            return;
        }
        boolean z10 = true;
        this.f11762t = true;
        if (!isPaddingRelative()) {
            if (this.f11760r == Integer.MIN_VALUE && this.f11761s == Integer.MIN_VALUE) {
                z10 = false;
            }
            if (!z10) {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
                return;
            }
        }
        setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        d(i10, i11);
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(getContentPaddingLeft() + i10, getContentPaddingTop() + i11, getContentPaddingRight() + i12, getContentPaddingBottom() + i13);
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(getContentPaddingStart() + i10, getContentPaddingTop() + i11, getContentPaddingEnd() + i12, getContentPaddingBottom() + i13);
    }

    @Override // ka.x
    public void setShapeAppearanceModel(@NonNull l lVar) {
        this.f11753k = lVar;
        i iVar = this.f11752j;
        if (iVar != null) {
            iVar.setShapeAppearanceModel(lVar);
        }
        d(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        this.f11751i = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i10) {
        setStrokeColor(h.getColorStateList(getContext(), i10));
    }

    public void setStrokeWidth(float f10) {
        if (this.f11754l != f10) {
            this.f11754l = f10;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i10) {
        setStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet, int i10) {
        super(a.z(context, attributeSet, 0, R.style.Widget_MaterialComponents_ShapeableImageView), attributeSet, 0);
        this.f11745b = m.a;
        this.f11750h = new Path();
        this.f11762t = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f11749g = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f11746c = new RectF();
        this.f11747d = new RectF();
        this.f11755m = new Path();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, r9.a.f24040w, 0, R.style.Widget_MaterialComponents_ShapeableImageView);
        setLayerType(2, null);
        this.f11751i = u0.z(context2, obtainStyledAttributes, 9);
        this.f11754l = obtainStyledAttributes.getDimensionPixelSize(10, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f11756n = dimensionPixelSize;
        this.f11757o = dimensionPixelSize;
        this.f11758p = dimensionPixelSize;
        this.f11759q = dimensionPixelSize;
        this.f11756n = obtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.f11757o = obtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        this.f11758p = obtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.f11759q = obtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.f11760r = obtainStyledAttributes.getDimensionPixelSize(5, Integer.MIN_VALUE);
        this.f11761s = obtainStyledAttributes.getDimensionPixelSize(2, Integer.MIN_VALUE);
        obtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f11748f = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.f11753k = new l(l.b(context2, attributeSet, 0, R.style.Widget_MaterialComponents_ShapeableImageView));
        setOutlineProvider(new da.a(this));
    }
}

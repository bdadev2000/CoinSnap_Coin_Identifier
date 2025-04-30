package T3;

import B3.o;
import M0.C0219j;
import R3.g;
import R3.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.tools.arruler.photomeasure.camera.ruler.R;
import w3.AbstractC2861a;

/* loaded from: classes2.dex */
public abstract class a extends FrameLayout {

    /* renamed from: k, reason: collision with root package name */
    public static final o f3005k = new o(1);
    public final k b;

    /* renamed from: c, reason: collision with root package name */
    public int f3006c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3007d;

    /* renamed from: f, reason: collision with root package name */
    public final float f3008f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3009g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3010h;

    /* renamed from: i, reason: collision with root package name */
    public ColorStateList f3011i;

    /* renamed from: j, reason: collision with root package name */
    public PorterDuff.Mode f3012j;

    /* JADX WARN: Multi-variable type inference failed */
    public a(Context context, AttributeSet attributeSet) {
        super(W3.a.a(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC2861a.f23683y);
        if (obtainStyledAttributes.hasValue(6)) {
            ViewCompat.setElevation(this, obtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.f3006c = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.b = k.b(context2, attributeSet, 0, 0).a();
        }
        this.f3007d = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(android.support.v4.media.session.a.p(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(L3.k.g(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f3008f = obtainStyledAttributes.getFloat(1, 1.0f);
        this.f3009g = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f3010h = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f3005k);
        setFocusable(true);
        if (getBackground() == null) {
            int u8 = C0219j.u(getBackgroundOverlayColorAlpha(), C0219j.q(this, R.attr.colorSurface), C0219j.q(this, R.attr.colorOnSurface));
            k kVar = this.b;
            if (kVar != null) {
                int i9 = b.f3013a;
                g gVar = new g(kVar);
                gVar.k(ColorStateList.valueOf(u8));
                gradientDrawable = gVar;
            } else {
                Resources resources = getResources();
                int i10 = b.f3013a;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(u8);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.f3011i;
            if (colorStateList != null) {
                M.a.h(gradientDrawable, colorStateList);
            }
            ViewCompat.setBackground(this, gradientDrawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.f3008f;
    }

    public int getAnimationMode() {
        return this.f3006c;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f3007d;
    }

    public int getMaxInlineActionWidth() {
        return this.f3010h;
    }

    public int getMaxWidth() {
        return this.f3009g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewCompat.requestApplyInsets(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i9, int i10, int i11, int i12) {
        super.onLayout(z8, i9, i10, i11, i12);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        int i11 = this.f3009g;
        if (i11 > 0 && getMeasuredWidth() > i11) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), i10);
        }
    }

    public void setAnimationMode(int i9) {
        this.f3006c = i9;
    }

    @Override // android.view.View
    public void setBackground(@Nullable Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        if (drawable != null && this.f3011i != null) {
            drawable = drawable.mutate();
            M.a.h(drawable, this.f3011i);
            M.a.i(drawable, this.f3012j);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        this.f3011i = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            M.a.h(mutate, colorStateList);
            M.a.i(mutate, this.f3012j);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        this.f3012j = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            M.a.i(mutate, mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        o oVar;
        if (onClickListener != null) {
            oVar = null;
        } else {
            oVar = f3005k;
        }
        setOnTouchListener(oVar);
        super.setOnClickListener(onClickListener);
    }

    private void setBaseTransientBottomBar(b bVar) {
    }
}

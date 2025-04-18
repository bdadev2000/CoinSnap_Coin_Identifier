package ma;

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
import com.plantcare.ai.identifier.plantid.R;
import ka.i;
import ka.l;
import v8.u0;

/* loaded from: classes3.dex */
public abstract class b extends FrameLayout {

    /* renamed from: k, reason: collision with root package name */
    public static final a f21807k = new a();

    /* renamed from: b, reason: collision with root package name */
    public final l f21808b;

    /* renamed from: c, reason: collision with root package name */
    public int f21809c;

    /* renamed from: d, reason: collision with root package name */
    public final float f21810d;

    /* renamed from: f, reason: collision with root package name */
    public final float f21811f;

    /* renamed from: g, reason: collision with root package name */
    public final int f21812g;

    /* renamed from: h, reason: collision with root package name */
    public final int f21813h;

    /* renamed from: i, reason: collision with root package name */
    public ColorStateList f21814i;

    /* renamed from: j, reason: collision with root package name */
    public PorterDuff.Mode f21815j;

    /* JADX WARN: Multi-variable type inference failed */
    public b(Context context, AttributeSet attributeSet) {
        super(p6.a.z(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, r9.a.f24042y);
        if (obtainStyledAttributes.hasValue(6)) {
            ViewCompat.setElevation(this, obtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.f21809c = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.f21808b = new l(l.b(context2, attributeSet, 0, 0));
        }
        this.f21810d = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(u0.z(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(u0.W(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f21811f = obtainStyledAttributes.getFloat(1, 1.0f);
        this.f21812g = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f21813h = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f21807k);
        setFocusable(true);
        if (getBackground() == null) {
            int O = u0.O(getBackgroundOverlayColorAlpha(), u0.x(R.attr.colorSurface, this), u0.x(R.attr.colorOnSurface, this));
            l lVar = this.f21808b;
            if (lVar != null) {
                int i10 = c.a;
                i iVar = new i(lVar);
                iVar.k(ColorStateList.valueOf(O));
                gradientDrawable = iVar;
            } else {
                Resources resources = getResources();
                int i11 = c.a;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(O);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.f21814i;
            if (colorStateList != null) {
                h0.a.h(gradientDrawable, colorStateList);
            }
            setBackground(gradientDrawable);
        }
    }

    private void setBaseTransientBottomBar(c cVar) {
    }

    public float getActionTextColorAlpha() {
        return this.f21811f;
    }

    public int getAnimationMode() {
        return this.f21809c;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f21810d;
    }

    public int getMaxInlineActionWidth() {
        return this.f21813h;
    }

    public int getMaxWidth() {
        return this.f21812g;
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
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int i12 = this.f21812g;
        if (i12 > 0 && getMeasuredWidth() > i12) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
        }
    }

    public void setAnimationMode(int i10) {
        this.f21809c = i10;
    }

    @Override // android.view.View
    public void setBackground(@Nullable Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        if (drawable != null && this.f21814i != null) {
            drawable = drawable.mutate();
            h0.a.h(drawable, this.f21814i);
            h0.a.i(drawable, this.f21815j);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        this.f21814i = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            h0.a.h(mutate, colorStateList);
            h0.a.i(mutate, this.f21815j);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        this.f21815j = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            h0.a.i(mutate, mode);
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
        a aVar;
        if (onClickListener != null) {
            aVar = null;
        } else {
            aVar = f21807k;
        }
        setOnTouchListener(aVar);
        super.setOnClickListener(onClickListener);
    }
}

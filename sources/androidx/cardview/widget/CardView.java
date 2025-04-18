package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;

/* loaded from: classes4.dex */
public class CardView extends FrameLayout {
    private static final int[] COLOR_BACKGROUND_ATTR = {R.attr.colorBackground};
    private static final CardViewImpl IMPL = new Object();
    private final CardViewDelegate mCardViewDelegate;
    private boolean mCompatPadding;
    final Rect mContentPadding;
    private boolean mPreventCornerOverlap;
    final Rect mShadowBounds;
    int mUserSetMinHeight;
    int mUserSetMinWidth;

    /* renamed from: androidx.cardview.widget.CardView$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass1 implements CardViewDelegate {

        /* renamed from: a, reason: collision with root package name */
        public Drawable f1364a;

        public AnonymousClass1() {
        }

        @Override // androidx.cardview.widget.CardViewDelegate
        public final boolean a() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // androidx.cardview.widget.CardViewDelegate
        public final Drawable b() {
            return this.f1364a;
        }

        @Override // androidx.cardview.widget.CardViewDelegate
        public final void c(int i2, int i3) {
            CardView cardView = CardView.this;
            if (i2 > cardView.mUserSetMinWidth) {
                CardView.super.setMinimumWidth(i2);
            }
            if (i3 > cardView.mUserSetMinHeight) {
                CardView.super.setMinimumHeight(i3);
            }
        }

        @Override // androidx.cardview.widget.CardViewDelegate
        public final boolean d() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // androidx.cardview.widget.CardViewDelegate
        public final CardView e() {
            return CardView.this;
        }

        public final void f(Drawable drawable) {
            this.f1364a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // androidx.cardview.widget.CardViewDelegate
        public final void setShadowPadding(int i2, int i3, int i4, int i5) {
            CardView cardView = CardView.this;
            cardView.mShadowBounds.set(i2, i3, i4, i5);
            Rect rect = cardView.mContentPadding;
            CardView.super.setPadding(i2 + rect.left, i3 + rect.top, i4 + rect.right, i5 + rect.bottom);
        }
    }

    public CardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, com.cooldev.gba.emulator.gameboy.R.attr.cardViewStyle);
    }

    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return IMPL.e(this.mCardViewDelegate);
    }

    public float getCardElevation() {
        return IMPL.i(this.mCardViewDelegate);
    }

    @Px
    public int getContentPaddingBottom() {
        return this.mContentPadding.bottom;
    }

    @Px
    public int getContentPaddingLeft() {
        return this.mContentPadding.left;
    }

    @Px
    public int getContentPaddingRight() {
        return this.mContentPadding.right;
    }

    @Px
    public int getContentPaddingTop() {
        return this.mContentPadding.top;
    }

    public float getMaxCardElevation() {
        return IMPL.d(this.mCardViewDelegate);
    }

    public boolean getPreventCornerOverlap() {
        return this.mPreventCornerOverlap;
    }

    public float getRadius() {
        return IMPL.b(this.mCardViewDelegate);
    }

    public boolean getUseCompatPadding() {
        return this.mCompatPadding;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        if (IMPL instanceof CardViewApi21Impl) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.l(this.mCardViewDelegate)), View.MeasureSpec.getSize(i2)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.f(this.mCardViewDelegate)), View.MeasureSpec.getSize(i3)), mode2);
        }
        super.onMeasure(i2, i3);
    }

    public void setCardBackgroundColor(@ColorInt int i2) {
        IMPL.m(this.mCardViewDelegate, ColorStateList.valueOf(i2));
    }

    public void setCardElevation(float f2) {
        IMPL.c(this.mCardViewDelegate, f2);
    }

    public void setContentPadding(int i2, int i3, int i4, int i5) {
        this.mContentPadding.set(i2, i3, i4, i5);
        IMPL.k(this.mCardViewDelegate);
    }

    public void setMaxCardElevation(float f2) {
        IMPL.n(this.mCardViewDelegate, f2);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i2) {
        this.mUserSetMinHeight = i2;
        super.setMinimumHeight(i2);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i2) {
        this.mUserSetMinWidth = i2;
        super.setMinimumWidth(i2);
    }

    @Override // android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i2, int i3, int i4, int i5) {
    }

    public void setPreventCornerOverlap(boolean z2) {
        if (z2 != this.mPreventCornerOverlap) {
            this.mPreventCornerOverlap = z2;
            IMPL.h(this.mCardViewDelegate);
        }
    }

    public void setRadius(float f2) {
        IMPL.a(this.mCardViewDelegate, f2);
    }

    public void setUseCompatPadding(boolean z2) {
        if (this.mCompatPadding != z2) {
            this.mCompatPadding = z2;
            IMPL.j(this.mCardViewDelegate);
        }
    }

    public CardView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        int color;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.mContentPadding = rect;
        this.mShadowBounds = new Rect();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        this.mCardViewDelegate = anonymousClass1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.cardview.R.styleable.f1363a, i2, com.cooldev.gba.emulator.gameboy.R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(COLOR_BACKGROUND_ATTR);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(com.cooldev.gba.emulator.gameboy.R.color.cardview_light_background);
            } else {
                color = getResources().getColor(com.cooldev.gba.emulator.gameboy.R.color.cardview_dark_background);
            }
            valueOf = ColorStateList.valueOf(color);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.mCompatPadding = obtainStyledAttributes.getBoolean(7, false);
        this.mPreventCornerOverlap = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        float f2 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.mUserSetMinWidth = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.mUserSetMinHeight = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        IMPL.g(anonymousClass1, context, colorStateList, dimension, dimension2, f2);
    }

    public void setCardBackgroundColor(@Nullable ColorStateList colorStateList) {
        IMPL.m(this.mCardViewDelegate, colorStateList);
    }
}

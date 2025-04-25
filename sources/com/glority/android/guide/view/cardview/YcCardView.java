package com.glority.android.guide.view.cardview;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes3.dex */
public class YcCardView extends FrameLayout {
    private static final int[] COLOR_BACKGROUND_ATTR = {R.attr.colorBackground};
    private static final YcCardViewImpl IMPL;
    private int endShadowColor;
    private final YcCardViewDelegate mCardViewDelegate;
    private boolean mCompatPadding;
    private final Rect mContentPadding;
    private boolean mPreventCornerOverlap;
    private final Rect mShadowBounds;
    private int mUserSetMinHeight;
    private int mUserSetMinWidth;
    private int startShadowColor;

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    static {
        YcCardViewJellybeanMr1 ycCardViewJellybeanMr1 = new YcCardViewJellybeanMr1();
        IMPL = ycCardViewJellybeanMr1;
        ycCardViewJellybeanMr1.initStatic();
    }

    public YcCardView(Context context) {
        super(context);
        this.mContentPadding = new Rect();
        this.mShadowBounds = new Rect();
        this.mCardViewDelegate = new YcCardViewDelegate() { // from class: com.glority.android.guide.view.cardview.YcCardView.1
            private Drawable mCardBackground;

            @Override // com.glority.android.guide.view.cardview.YcCardViewDelegate
            public void setCardBackground(Drawable drawable) {
                this.mCardBackground = drawable;
                YcCardView.this.setBackgroundDrawable(drawable);
            }

            @Override // com.glority.android.guide.view.cardview.YcCardViewDelegate
            public boolean getUseCompatPadding() {
                return YcCardView.this.getUseCompatPadding();
            }

            @Override // com.glority.android.guide.view.cardview.YcCardViewDelegate
            public boolean getPreventCornerOverlap() {
                return YcCardView.this.getPreventCornerOverlap();
            }

            @Override // com.glority.android.guide.view.cardview.YcCardViewDelegate
            public void setShadowPadding(int i, int i2, int i3, int i4) {
                YcCardView.this.mShadowBounds.set(i, i2, i3, i4);
                YcCardView ycCardView = YcCardView.this;
                YcCardView.super.setPadding(i + ycCardView.mContentPadding.left, i2 + YcCardView.this.mContentPadding.top, i3 + YcCardView.this.mContentPadding.right, i4 + YcCardView.this.mContentPadding.bottom);
            }

            @Override // com.glority.android.guide.view.cardview.YcCardViewDelegate
            public void setMinWidthHeightInternal(int i, int i2) {
                if (i > YcCardView.this.mUserSetMinWidth) {
                    YcCardView.super.setMinimumWidth(i);
                }
                if (i2 > YcCardView.this.mUserSetMinHeight) {
                    YcCardView.super.setMinimumHeight(i2);
                }
            }

            @Override // com.glority.android.guide.view.cardview.YcCardViewDelegate
            public Drawable getCardBackground() {
                return this.mCardBackground;
            }

            @Override // com.glority.android.guide.view.cardview.YcCardViewDelegate
            public View getCardView() {
                return YcCardView.this;
            }
        };
        initialize(context, null, 0);
    }

    public YcCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mContentPadding = new Rect();
        this.mShadowBounds = new Rect();
        this.mCardViewDelegate = new YcCardViewDelegate() { // from class: com.glority.android.guide.view.cardview.YcCardView.1
            private Drawable mCardBackground;

            @Override // com.glority.android.guide.view.cardview.YcCardViewDelegate
            public void setCardBackground(Drawable drawable) {
                this.mCardBackground = drawable;
                YcCardView.this.setBackgroundDrawable(drawable);
            }

            @Override // com.glority.android.guide.view.cardview.YcCardViewDelegate
            public boolean getUseCompatPadding() {
                return YcCardView.this.getUseCompatPadding();
            }

            @Override // com.glority.android.guide.view.cardview.YcCardViewDelegate
            public boolean getPreventCornerOverlap() {
                return YcCardView.this.getPreventCornerOverlap();
            }

            @Override // com.glority.android.guide.view.cardview.YcCardViewDelegate
            public void setShadowPadding(int i, int i2, int i3, int i4) {
                YcCardView.this.mShadowBounds.set(i, i2, i3, i4);
                YcCardView ycCardView = YcCardView.this;
                YcCardView.super.setPadding(i + ycCardView.mContentPadding.left, i2 + YcCardView.this.mContentPadding.top, i3 + YcCardView.this.mContentPadding.right, i4 + YcCardView.this.mContentPadding.bottom);
            }

            @Override // com.glority.android.guide.view.cardview.YcCardViewDelegate
            public void setMinWidthHeightInternal(int i, int i2) {
                if (i > YcCardView.this.mUserSetMinWidth) {
                    YcCardView.super.setMinimumWidth(i);
                }
                if (i2 > YcCardView.this.mUserSetMinHeight) {
                    YcCardView.super.setMinimumHeight(i2);
                }
            }

            @Override // com.glority.android.guide.view.cardview.YcCardViewDelegate
            public Drawable getCardBackground() {
                return this.mCardBackground;
            }

            @Override // com.glority.android.guide.view.cardview.YcCardViewDelegate
            public View getCardView() {
                return YcCardView.this;
            }
        };
        initialize(context, attributeSet, 0);
    }

    public YcCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mContentPadding = new Rect();
        this.mShadowBounds = new Rect();
        this.mCardViewDelegate = new YcCardViewDelegate() { // from class: com.glority.android.guide.view.cardview.YcCardView.1
            private Drawable mCardBackground;

            @Override // com.glority.android.guide.view.cardview.YcCardViewDelegate
            public void setCardBackground(Drawable drawable) {
                this.mCardBackground = drawable;
                YcCardView.this.setBackgroundDrawable(drawable);
            }

            @Override // com.glority.android.guide.view.cardview.YcCardViewDelegate
            public boolean getUseCompatPadding() {
                return YcCardView.this.getUseCompatPadding();
            }

            @Override // com.glority.android.guide.view.cardview.YcCardViewDelegate
            public boolean getPreventCornerOverlap() {
                return YcCardView.this.getPreventCornerOverlap();
            }

            @Override // com.glority.android.guide.view.cardview.YcCardViewDelegate
            public void setShadowPadding(int i2, int i22, int i3, int i4) {
                YcCardView.this.mShadowBounds.set(i2, i22, i3, i4);
                YcCardView ycCardView = YcCardView.this;
                YcCardView.super.setPadding(i2 + ycCardView.mContentPadding.left, i22 + YcCardView.this.mContentPadding.top, i3 + YcCardView.this.mContentPadding.right, i4 + YcCardView.this.mContentPadding.bottom);
            }

            @Override // com.glority.android.guide.view.cardview.YcCardViewDelegate
            public void setMinWidthHeightInternal(int i2, int i22) {
                if (i2 > YcCardView.this.mUserSetMinWidth) {
                    YcCardView.super.setMinimumWidth(i2);
                }
                if (i22 > YcCardView.this.mUserSetMinHeight) {
                    YcCardView.super.setMinimumHeight(i22);
                }
            }

            @Override // com.glority.android.guide.view.cardview.YcCardViewDelegate
            public Drawable getCardBackground() {
                return this.mCardBackground;
            }

            @Override // com.glority.android.guide.view.cardview.YcCardViewDelegate
            public View getCardView() {
                return YcCardView.this;
            }
        };
        initialize(context, attributeSet, i);
    }

    public boolean getUseCompatPadding() {
        return this.mCompatPadding;
    }

    public void setUseCompatPadding(boolean z) {
        if (this.mCompatPadding != z) {
            this.mCompatPadding = z;
            IMPL.onCompatPaddingChanged(this.mCardViewDelegate);
        }
    }

    public void setContentPadding(int i, int i2, int i3, int i4) {
        this.mContentPadding.set(i, i2, i3, i4);
        IMPL.updatePadding(this.mCardViewDelegate);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (!(IMPL instanceof YcCardViewApi21)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.getMinWidth(this.mCardViewDelegate)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.getMinHeight(this.mCardViewDelegate)), View.MeasureSpec.getSize(i2)), mode2);
            }
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    private void initialize(Context context, AttributeSet attributeSet, int i) {
        int color;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.glority.android.guide.R.styleable.YcCardView, i, com.glority.android.guide.R.style.YcCardView);
        if (obtainStyledAttributes.hasValue(com.glority.android.guide.R.styleable.YcCardView_ycCardBackgroundColor)) {
            color = obtainStyledAttributes.getColor(com.glority.android.guide.R.styleable.YcCardView_ycCardBackgroundColor, 0);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(COLOR_BACKGROUND_ATTR);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(com.glority.android.guide.R.color.yc_cardview_light_background);
            } else {
                color = getResources().getColor(com.glority.android.guide.R.color.yc_cardview_dark_background);
            }
        }
        int i2 = color;
        this.startShadowColor = obtainStyledAttributes.getColor(com.glority.android.guide.R.styleable.YcCardView_ycStartShadowColor, 0);
        this.endShadowColor = obtainStyledAttributes.getColor(com.glority.android.guide.R.styleable.YcCardView_ycEndShadowColor, 0);
        float dimension = obtainStyledAttributes.getDimension(com.glority.android.guide.R.styleable.YcCardView_ycCardCornerRadius, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(com.glority.android.guide.R.styleable.YcCardView_ycCardElevation, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(com.glority.android.guide.R.styleable.YcCardView_ycCardMaxElevation, 0.0f);
        this.mCompatPadding = obtainStyledAttributes.getBoolean(com.glority.android.guide.R.styleable.YcCardView_ycCardUseCompatPadding, false);
        this.mPreventCornerOverlap = obtainStyledAttributes.getBoolean(com.glority.android.guide.R.styleable.YcCardView_ycCardPreventCornerOverlap, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(com.glority.android.guide.R.styleable.YcCardView_ycContentPadding, 0);
        this.mContentPadding.left = obtainStyledAttributes.getDimensionPixelSize(com.glority.android.guide.R.styleable.YcCardView_ycContentPaddingLeft, dimensionPixelSize);
        this.mContentPadding.top = obtainStyledAttributes.getDimensionPixelSize(com.glority.android.guide.R.styleable.YcCardView_ycContentPaddingTop, dimensionPixelSize);
        this.mContentPadding.right = obtainStyledAttributes.getDimensionPixelSize(com.glority.android.guide.R.styleable.YcCardView_ycContentPaddingRight, dimensionPixelSize);
        this.mContentPadding.bottom = obtainStyledAttributes.getDimensionPixelSize(com.glority.android.guide.R.styleable.YcCardView_contentPaddingBottom, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.mUserSetMinWidth = obtainStyledAttributes.getDimensionPixelSize(com.glority.android.guide.R.styleable.YcCardView_android_minWidth, 0);
        this.mUserSetMinHeight = obtainStyledAttributes.getDimensionPixelSize(com.glority.android.guide.R.styleable.YcCardView_android_minHeight, 0);
        obtainStyledAttributes.recycle();
        IMPL.initialize(this.mCardViewDelegate, context, i2, dimension, dimension2, f, this.startShadowColor, this.endShadowColor);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        this.mUserSetMinWidth = i;
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        this.mUserSetMinHeight = i;
        super.setMinimumHeight(i);
    }

    public void setCardBackgroundColor(int i) {
        IMPL.setBackgroundColor(this.mCardViewDelegate, i);
    }

    public int getContentPaddingLeft() {
        return this.mContentPadding.left;
    }

    public int getContentPaddingRight() {
        return this.mContentPadding.right;
    }

    public int getContentPaddingTop() {
        return this.mContentPadding.top;
    }

    public int getContentPaddingBottom() {
        return this.mContentPadding.bottom;
    }

    public void setRadius(float f) {
        IMPL.setRadius(this.mCardViewDelegate, f);
    }

    public float getRadius() {
        return IMPL.getRadius(this.mCardViewDelegate);
    }

    public void setCardElevation(float f) {
        IMPL.setElevation(this.mCardViewDelegate, f);
    }

    public float getCardElevation() {
        return IMPL.getElevation(this.mCardViewDelegate);
    }

    public void setMaxCardElevation(float f) {
        IMPL.setMaxElevation(this.mCardViewDelegate, f);
    }

    public float getMaxCardElevation() {
        return IMPL.getMaxElevation(this.mCardViewDelegate);
    }

    public boolean getPreventCornerOverlap() {
        return this.mPreventCornerOverlap;
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.mPreventCornerOverlap) {
            this.mPreventCornerOverlap = z;
            IMPL.onPreventCornerOverlapChanged(this.mCardViewDelegate);
        }
    }
}

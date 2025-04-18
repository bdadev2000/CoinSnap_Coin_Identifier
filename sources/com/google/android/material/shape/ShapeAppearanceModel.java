package com.google.android.material.shape;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.annotation.AttrRes;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import com.google.android.material.R;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* loaded from: classes3.dex */
public class ShapeAppearanceModel {
    public static final CornerSize PILL = new RelativeCornerSize(0.5f);
    EdgeTreatment bottomEdge;
    CornerTreatment bottomLeftCorner;
    CornerSize bottomLeftCornerSize;
    CornerTreatment bottomRightCorner;
    CornerSize bottomRightCornerSize;
    EdgeTreatment leftEdge;
    EdgeTreatment rightEdge;
    EdgeTreatment topEdge;
    CornerTreatment topLeftCorner;
    CornerSize topLeftCornerSize;
    CornerTreatment topRightCorner;
    CornerSize topRightCornerSize;

    /* loaded from: classes3.dex */
    public static final class Builder {

        @NonNull
        private EdgeTreatment bottomEdge;

        @NonNull
        private CornerTreatment bottomLeftCorner;

        @NonNull
        private CornerSize bottomLeftCornerSize;

        @NonNull
        private CornerTreatment bottomRightCorner;

        @NonNull
        private CornerSize bottomRightCornerSize;

        @NonNull
        private EdgeTreatment leftEdge;

        @NonNull
        private EdgeTreatment rightEdge;

        @NonNull
        private EdgeTreatment topEdge;

        @NonNull
        private CornerTreatment topLeftCorner;

        @NonNull
        private CornerSize topLeftCornerSize;

        @NonNull
        private CornerTreatment topRightCorner;

        @NonNull
        private CornerSize topRightCornerSize;

        public Builder() {
            this.topLeftCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.topRightCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.bottomRightCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.bottomLeftCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.topLeftCornerSize = new AbsoluteCornerSize(0.0f);
            this.topRightCornerSize = new AbsoluteCornerSize(0.0f);
            this.bottomRightCornerSize = new AbsoluteCornerSize(0.0f);
            this.bottomLeftCornerSize = new AbsoluteCornerSize(0.0f);
            this.topEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.rightEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.bottomEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.leftEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
        }

        private static float compatCornerTreatmentSize(CornerTreatment cornerTreatment) {
            if (cornerTreatment instanceof RoundedCornerTreatment) {
                return ((RoundedCornerTreatment) cornerTreatment).radius;
            }
            if (cornerTreatment instanceof CutCornerTreatment) {
                return ((CutCornerTreatment) cornerTreatment).size;
            }
            return -1.0f;
        }

        @NonNull
        public ShapeAppearanceModel build() {
            return new ShapeAppearanceModel(this);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setAllCornerSizes(@NonNull CornerSize cornerSize) {
            return setTopLeftCornerSize(cornerSize).setTopRightCornerSize(cornerSize).setBottomRightCornerSize(cornerSize).setBottomLeftCornerSize(cornerSize);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setAllCorners(int i2, @Dimension float f2) {
            return setAllCorners(MaterialShapeUtils.createCornerTreatment(i2)).setAllCornerSizes(f2);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setAllEdges(@NonNull EdgeTreatment edgeTreatment) {
            return setLeftEdge(edgeTreatment).setTopEdge(edgeTreatment).setRightEdge(edgeTreatment).setBottomEdge(edgeTreatment);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomEdge(@NonNull EdgeTreatment edgeTreatment) {
            this.bottomEdge = edgeTreatment;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomLeftCorner(int i2, @Dimension float f2) {
            return setBottomLeftCorner(MaterialShapeUtils.createCornerTreatment(i2)).setBottomLeftCornerSize(f2);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomLeftCornerSize(@NonNull CornerSize cornerSize) {
            this.bottomLeftCornerSize = cornerSize;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomRightCorner(int i2, @Dimension float f2) {
            return setBottomRightCorner(MaterialShapeUtils.createCornerTreatment(i2)).setBottomRightCornerSize(f2);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomRightCornerSize(@NonNull CornerSize cornerSize) {
            this.bottomRightCornerSize = cornerSize;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setLeftEdge(@NonNull EdgeTreatment edgeTreatment) {
            this.leftEdge = edgeTreatment;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setRightEdge(@NonNull EdgeTreatment edgeTreatment) {
            this.rightEdge = edgeTreatment;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopEdge(@NonNull EdgeTreatment edgeTreatment) {
            this.topEdge = edgeTreatment;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopLeftCorner(int i2, @Dimension float f2) {
            return setTopLeftCorner(MaterialShapeUtils.createCornerTreatment(i2)).setTopLeftCornerSize(f2);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopLeftCornerSize(@NonNull CornerSize cornerSize) {
            this.topLeftCornerSize = cornerSize;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopRightCorner(int i2, @Dimension float f2) {
            return setTopRightCorner(MaterialShapeUtils.createCornerTreatment(i2)).setTopRightCornerSize(f2);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopRightCornerSize(@NonNull CornerSize cornerSize) {
            this.topRightCornerSize = cornerSize;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomLeftCornerSize(@Dimension float f2) {
            this.bottomLeftCornerSize = new AbsoluteCornerSize(f2);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomRightCornerSize(@Dimension float f2) {
            this.bottomRightCornerSize = new AbsoluteCornerSize(f2);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopLeftCornerSize(@Dimension float f2) {
            this.topLeftCornerSize = new AbsoluteCornerSize(f2);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopRightCornerSize(@Dimension float f2) {
            this.topRightCornerSize = new AbsoluteCornerSize(f2);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setAllCorners(@NonNull CornerTreatment cornerTreatment) {
            return setTopLeftCorner(cornerTreatment).setTopRightCorner(cornerTreatment).setBottomRightCorner(cornerTreatment).setBottomLeftCorner(cornerTreatment);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomLeftCorner(int i2, @NonNull CornerSize cornerSize) {
            return setBottomLeftCorner(MaterialShapeUtils.createCornerTreatment(i2)).setBottomLeftCornerSize(cornerSize);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomRightCorner(int i2, @NonNull CornerSize cornerSize) {
            return setBottomRightCorner(MaterialShapeUtils.createCornerTreatment(i2)).setBottomRightCornerSize(cornerSize);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopLeftCorner(int i2, @NonNull CornerSize cornerSize) {
            return setTopLeftCorner(MaterialShapeUtils.createCornerTreatment(i2)).setTopLeftCornerSize(cornerSize);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopRightCorner(int i2, @NonNull CornerSize cornerSize) {
            return setTopRightCorner(MaterialShapeUtils.createCornerTreatment(i2)).setTopRightCornerSize(cornerSize);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setAllCornerSizes(@Dimension float f2) {
            return setTopLeftCornerSize(f2).setTopRightCornerSize(f2).setBottomRightCornerSize(f2).setBottomLeftCornerSize(f2);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomLeftCorner(@NonNull CornerTreatment cornerTreatment) {
            this.bottomLeftCorner = cornerTreatment;
            float compatCornerTreatmentSize = compatCornerTreatmentSize(cornerTreatment);
            if (compatCornerTreatmentSize != -1.0f) {
                setBottomLeftCornerSize(compatCornerTreatmentSize);
            }
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomRightCorner(@NonNull CornerTreatment cornerTreatment) {
            this.bottomRightCorner = cornerTreatment;
            float compatCornerTreatmentSize = compatCornerTreatmentSize(cornerTreatment);
            if (compatCornerTreatmentSize != -1.0f) {
                setBottomRightCornerSize(compatCornerTreatmentSize);
            }
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopLeftCorner(@NonNull CornerTreatment cornerTreatment) {
            this.topLeftCorner = cornerTreatment;
            float compatCornerTreatmentSize = compatCornerTreatmentSize(cornerTreatment);
            if (compatCornerTreatmentSize != -1.0f) {
                setTopLeftCornerSize(compatCornerTreatmentSize);
            }
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopRightCorner(@NonNull CornerTreatment cornerTreatment) {
            this.topRightCorner = cornerTreatment;
            float compatCornerTreatmentSize = compatCornerTreatmentSize(cornerTreatment);
            if (compatCornerTreatmentSize != -1.0f) {
                setTopRightCornerSize(compatCornerTreatmentSize);
            }
            return this;
        }

        public Builder(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
            this.topLeftCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.topRightCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.bottomRightCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.bottomLeftCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.topLeftCornerSize = new AbsoluteCornerSize(0.0f);
            this.topRightCornerSize = new AbsoluteCornerSize(0.0f);
            this.bottomRightCornerSize = new AbsoluteCornerSize(0.0f);
            this.bottomLeftCornerSize = new AbsoluteCornerSize(0.0f);
            this.topEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.rightEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.bottomEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.leftEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.topLeftCorner = shapeAppearanceModel.topLeftCorner;
            this.topRightCorner = shapeAppearanceModel.topRightCorner;
            this.bottomRightCorner = shapeAppearanceModel.bottomRightCorner;
            this.bottomLeftCorner = shapeAppearanceModel.bottomLeftCorner;
            this.topLeftCornerSize = shapeAppearanceModel.topLeftCornerSize;
            this.topRightCornerSize = shapeAppearanceModel.topRightCornerSize;
            this.bottomRightCornerSize = shapeAppearanceModel.bottomRightCornerSize;
            this.bottomLeftCornerSize = shapeAppearanceModel.bottomLeftCornerSize;
            this.topEdge = shapeAppearanceModel.topEdge;
            this.rightEdge = shapeAppearanceModel.rightEdge;
            this.bottomEdge = shapeAppearanceModel.bottomEdge;
            this.leftEdge = shapeAppearanceModel.leftEdge;
        }
    }

    @RestrictTo
    /* loaded from: classes3.dex */
    public interface CornerSizeUnaryOperator {
        @NonNull
        CornerSize apply(@NonNull CornerSize cornerSize);
    }

    @NonNull
    public static Builder builder() {
        return new Builder();
    }

    @NonNull
    private static CornerSize getCornerSize(TypedArray typedArray, int i2, @NonNull CornerSize cornerSize) {
        TypedValue peekValue = typedArray.peekValue(i2);
        if (peekValue == null) {
            return cornerSize;
        }
        int i3 = peekValue.type;
        return i3 == 5 ? new AbsoluteCornerSize(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i3 == 6 ? new RelativeCornerSize(peekValue.getFraction(1.0f, 1.0f)) : cornerSize;
    }

    @NonNull
    public EdgeTreatment getBottomEdge() {
        return this.bottomEdge;
    }

    @NonNull
    public CornerTreatment getBottomLeftCorner() {
        return this.bottomLeftCorner;
    }

    @NonNull
    public CornerSize getBottomLeftCornerSize() {
        return this.bottomLeftCornerSize;
    }

    @NonNull
    public CornerTreatment getBottomRightCorner() {
        return this.bottomRightCorner;
    }

    @NonNull
    public CornerSize getBottomRightCornerSize() {
        return this.bottomRightCornerSize;
    }

    @NonNull
    public EdgeTreatment getLeftEdge() {
        return this.leftEdge;
    }

    @NonNull
    public EdgeTreatment getRightEdge() {
        return this.rightEdge;
    }

    @NonNull
    public EdgeTreatment getTopEdge() {
        return this.topEdge;
    }

    @NonNull
    public CornerTreatment getTopLeftCorner() {
        return this.topLeftCorner;
    }

    @NonNull
    public CornerSize getTopLeftCornerSize() {
        return this.topLeftCornerSize;
    }

    @NonNull
    public CornerTreatment getTopRightCorner() {
        return this.topRightCorner;
    }

    @NonNull
    public CornerSize getTopRightCornerSize() {
        return this.topRightCornerSize;
    }

    @RestrictTo
    public boolean isRoundRect(@NonNull RectF rectF) {
        boolean z2 = this.leftEdge.getClass().equals(EdgeTreatment.class) && this.rightEdge.getClass().equals(EdgeTreatment.class) && this.topEdge.getClass().equals(EdgeTreatment.class) && this.bottomEdge.getClass().equals(EdgeTreatment.class);
        float cornerSize = this.topLeftCornerSize.getCornerSize(rectF);
        return z2 && ((this.topRightCornerSize.getCornerSize(rectF) > cornerSize ? 1 : (this.topRightCornerSize.getCornerSize(rectF) == cornerSize ? 0 : -1)) == 0 && (this.bottomLeftCornerSize.getCornerSize(rectF) > cornerSize ? 1 : (this.bottomLeftCornerSize.getCornerSize(rectF) == cornerSize ? 0 : -1)) == 0 && (this.bottomRightCornerSize.getCornerSize(rectF) > cornerSize ? 1 : (this.bottomRightCornerSize.getCornerSize(rectF) == cornerSize ? 0 : -1)) == 0) && ((this.topRightCorner instanceof RoundedCornerTreatment) && (this.topLeftCorner instanceof RoundedCornerTreatment) && (this.bottomRightCorner instanceof RoundedCornerTreatment) && (this.bottomLeftCorner instanceof RoundedCornerTreatment));
    }

    @NonNull
    public Builder toBuilder() {
        return new Builder(this);
    }

    @NonNull
    public ShapeAppearanceModel withCornerSize(float f2) {
        return toBuilder().setAllCornerSizes(f2).build();
    }

    @NonNull
    @RestrictTo
    public ShapeAppearanceModel withTransformedCornerSizes(@NonNull CornerSizeUnaryOperator cornerSizeUnaryOperator) {
        return toBuilder().setTopLeftCornerSize(cornerSizeUnaryOperator.apply(getTopLeftCornerSize())).setTopRightCornerSize(cornerSizeUnaryOperator.apply(getTopRightCornerSize())).setBottomLeftCornerSize(cornerSizeUnaryOperator.apply(getBottomLeftCornerSize())).setBottomRightCornerSize(cornerSizeUnaryOperator.apply(getBottomRightCornerSize())).build();
    }

    private ShapeAppearanceModel(@NonNull Builder builder) {
        this.topLeftCorner = builder.topLeftCorner;
        this.topRightCorner = builder.topRightCorner;
        this.bottomRightCorner = builder.bottomRightCorner;
        this.bottomLeftCorner = builder.bottomLeftCorner;
        this.topLeftCornerSize = builder.topLeftCornerSize;
        this.topRightCornerSize = builder.topRightCornerSize;
        this.bottomRightCornerSize = builder.bottomRightCornerSize;
        this.bottomLeftCornerSize = builder.bottomLeftCornerSize;
        this.topEdge = builder.topEdge;
        this.rightEdge = builder.rightEdge;
        this.bottomEdge = builder.bottomEdge;
        this.leftEdge = builder.leftEdge;
    }

    @NonNull
    public static Builder builder(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i2, @StyleRes int i3) {
        return builder(context, attributeSet, i2, i3, 0);
    }

    @NonNull
    public ShapeAppearanceModel withCornerSize(@NonNull CornerSize cornerSize) {
        return toBuilder().setAllCornerSizes(cornerSize).build();
    }

    @NonNull
    public static Builder builder(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i2, @StyleRes int i3, int i4) {
        return builder(context, attributeSet, i2, i3, new AbsoluteCornerSize(i4));
    }

    @NonNull
    public static Builder builder(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i2, @StyleRes int i3, @NonNull CornerSize cornerSize) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MaterialShape, i2, i3);
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.MaterialShape_shapeAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(R.styleable.MaterialShape_shapeAppearanceOverlay, 0);
        obtainStyledAttributes.recycle();
        return builder(context, resourceId, resourceId2, cornerSize);
    }

    @NonNull
    public static Builder builder(Context context, @StyleRes int i2, @StyleRes int i3) {
        return builder(context, i2, i3, 0);
    }

    @NonNull
    private static Builder builder(Context context, @StyleRes int i2, @StyleRes int i3, int i4) {
        return builder(context, i2, i3, new AbsoluteCornerSize(i4));
    }

    @NonNull
    private static Builder builder(Context context, @StyleRes int i2, @StyleRes int i3, @NonNull CornerSize cornerSize) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i2);
        if (i3 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i3);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(R.styleable.ShapeAppearance);
        try {
            int i4 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamily, 0);
            int i5 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyTopLeft, i4);
            int i6 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyTopRight, i4);
            int i7 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyBottomRight, i4);
            int i8 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyBottomLeft, i4);
            CornerSize cornerSize2 = getCornerSize(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSize, cornerSize);
            CornerSize cornerSize3 = getCornerSize(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeTopLeft, cornerSize2);
            CornerSize cornerSize4 = getCornerSize(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeTopRight, cornerSize2);
            CornerSize cornerSize5 = getCornerSize(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeBottomRight, cornerSize2);
            return new Builder().setTopLeftCorner(i5, cornerSize3).setTopRightCorner(i6, cornerSize4).setBottomRightCorner(i7, cornerSize5).setBottomLeftCorner(i8, getCornerSize(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeBottomLeft, cornerSize2));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public ShapeAppearanceModel() {
        this.topLeftCorner = MaterialShapeUtils.createDefaultCornerTreatment();
        this.topRightCorner = MaterialShapeUtils.createDefaultCornerTreatment();
        this.bottomRightCorner = MaterialShapeUtils.createDefaultCornerTreatment();
        this.bottomLeftCorner = MaterialShapeUtils.createDefaultCornerTreatment();
        this.topLeftCornerSize = new AbsoluteCornerSize(0.0f);
        this.topRightCornerSize = new AbsoluteCornerSize(0.0f);
        this.bottomRightCornerSize = new AbsoluteCornerSize(0.0f);
        this.bottomLeftCornerSize = new AbsoluteCornerSize(0.0f);
        this.topEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
        this.rightEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
        this.bottomEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
        this.leftEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
    }
}

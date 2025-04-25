package com.glority.android.compose.ui.shape;

import androidx.compose.foundation.shape.CornerSize;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.data.LogEventArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BubbleShape.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J*\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Lcom/glority/android/compose/ui/shape/BubbleShape;", "Landroidx/compose/ui/graphics/Shape;", "conner", "Landroidx/compose/foundation/shape/CornerSize;", "archPosition", "", "(Landroidx/compose/foundation/shape/CornerSize;F)V", "createOutline", "Landroidx/compose/ui/graphics/Outline;", LogEventArguments.ARG_SIZE, "Landroidx/compose/ui/geometry/Size;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "density", "Landroidx/compose/ui/unit/Density;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;", "Companion", "lib-compose_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class BubbleShape implements Shape {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final float arrowHeight = Dp.m6997constructorimpl(10);
    private static final float arrowWidth = Dp.m6997constructorimpl(16);
    private final float archPosition;
    private final CornerSize conner;

    /* compiled from: BubbleShape.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Lcom/glority/android/compose/ui/shape/BubbleShape$Companion;", "", "()V", "arrowHeight", "Landroidx/compose/ui/unit/Dp;", "getArrowHeight-D9Ej5fM", "()F", "F", "arrowWidth", "getArrowWidth-D9Ej5fM", "lib-compose_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getArrowHeight-D9Ej5fM, reason: not valid java name */
        public final float m7728getArrowHeightD9Ej5fM() {
            return BubbleShape.arrowHeight;
        }

        /* renamed from: getArrowWidth-D9Ej5fM, reason: not valid java name */
        public final float m7729getArrowWidthD9Ej5fM() {
            return BubbleShape.arrowWidth;
        }
    }

    public BubbleShape(CornerSize conner, float f) {
        Intrinsics.checkNotNullParameter(conner, "conner");
        this.conner = conner;
        this.archPosition = f;
    }

    @Override // androidx.compose.ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public Outline mo588createOutlinePq9zytI(long size, LayoutDirection layoutDirection, Density density) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        float mo677toPx0680j_4 = density.mo677toPx0680j_4(arrowHeight);
        float mo677toPx0680j_42 = density.mo677toPx0680j_4(arrowWidth);
        float f = 2;
        float m4343getWidthimpl = Size.m4343getWidthimpl(size) * (this.archPosition - ((mo677toPx0680j_42 / Size.m4343getWidthimpl(size)) / f));
        float mo1259toPxTmRCtEA = this.conner.mo1259toPxTmRCtEA(size, density);
        Path Path = AndroidPath_androidKt.Path();
        Path.moveTo(m4343getWidthimpl, mo677toPx0680j_4);
        Path.lineTo((mo677toPx0680j_42 / f) + m4343getWidthimpl, 0.0f);
        Path.lineTo(m4343getWidthimpl + mo677toPx0680j_42, mo677toPx0680j_4);
        Path.addRoundRect(RoundRectKt.m4328RoundRectgG7oq9Y(0.0f, mo677toPx0680j_4, Size.m4343getWidthimpl(size), Size.m4340getHeightimpl(size), CornerRadiusKt.CornerRadius$default(mo1259toPxTmRCtEA, 0.0f, 2, null)));
        return new Outline.Generic(Path);
    }
}

package androidx.compose.material.icons.automirrored.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RotateRight.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_rotateRight", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RotateRight", "Landroidx/compose/material/icons/Icons$AutoMirrored$Outlined;", "getRotateRight", "(Landroidx/compose/material/icons/Icons$AutoMirrored$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class RotateRightKt {
    private static ImageVector _rotateRight;

    public static final ImageVector getRotateRight(Icons.AutoMirrored.Outlined outlined) {
        ImageVector.Builder m5207addPathoIyEayM;
        ImageVector imageVector = _rotateRight;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Outlined.RotateRight", Dp.m6997constructorimpl(24.0f), Dp.m6997constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m4541getBlack0d7_KjU(), null);
        int m4868getButtKaPHkGw = StrokeCap.INSTANCE.m4868getButtKaPHkGw();
        int m4878getBevelLxFBmk8 = StrokeJoin.INSTANCE.m4878getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.55f, 5.55f);
        pathBuilder.lineTo(11.0f, 1.0f);
        pathBuilder.verticalLineToRelative(3.07f);
        pathBuilder.curveTo(7.06f, 4.56f, 4.0f, 7.92f, 4.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(3.05f, 7.44f, 7.0f, 7.93f);
        pathBuilder.verticalLineToRelative(-2.02f);
        pathBuilder.curveToRelative(-2.84f, -0.48f, -5.0f, -2.94f, -5.0f, -5.91f);
        pathBuilder.reflectiveCurveToRelative(2.16f, -5.43f, 5.0f, -5.91f);
        pathBuilder.lineTo(11.0f, 10.0f);
        pathBuilder.lineToRelative(4.55f, -4.45f);
        pathBuilder.close();
        pathBuilder.moveTo(19.93f, 11.0f);
        pathBuilder.curveToRelative(-0.17f, -1.39f, -0.72f, -2.73f, -1.62f, -3.89f);
        pathBuilder.lineToRelative(-1.42f, 1.42f);
        pathBuilder.curveToRelative(0.54f, 0.75f, 0.88f, 1.6f, 1.02f, 2.47f);
        pathBuilder.horizontalLineToRelative(2.02f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 17.9f);
        pathBuilder.verticalLineToRelative(2.02f);
        pathBuilder.curveToRelative(1.39f, -0.17f, 2.74f, -0.71f, 3.9f, -1.61f);
        pathBuilder.lineToRelative(-1.44f, -1.44f);
        pathBuilder.curveToRelative(-0.75f, 0.54f, -1.59f, 0.89f, -2.46f, 1.03f);
        pathBuilder.close();
        pathBuilder.moveTo(16.89f, 15.48f);
        pathBuilder.lineToRelative(1.42f, 1.41f);
        pathBuilder.curveToRelative(0.9f, -1.16f, 1.45f, -2.5f, 1.62f, -3.89f);
        pathBuilder.horizontalLineToRelative(-2.02f);
        pathBuilder.curveToRelative(-0.14f, 0.87f, -0.48f, 1.72f, -1.02f, 2.48f);
        pathBuilder.close();
        m5207addPathoIyEayM = builder.m5207addPathoIyEayM(pathBuilder.getNodes(), (r30 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType, (r30 & 4) != 0 ? "" : "", (r30 & 8) != 0 ? null : solidColor, (r30 & 16) != 0 ? 1.0f : 1.0f, (r30 & 32) == 0 ? null : null, (r30 & 64) != 0 ? 1.0f : 1.0f, (r30 & 128) != 0 ? 0.0f : 1.0f, (r30 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : m4868getButtKaPHkGw, (r30 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : m4878getBevelLxFBmk8, (r30 & 1024) != 0 ? 4.0f : 1.0f, (r30 & 2048) != 0 ? 0.0f : 0.0f, (r30 & 4096) == 0 ? 0.0f : 1.0f, (r30 & 8192) == 0 ? 0.0f : 0.0f);
        ImageVector build = m5207addPathoIyEayM.build();
        _rotateRight = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}

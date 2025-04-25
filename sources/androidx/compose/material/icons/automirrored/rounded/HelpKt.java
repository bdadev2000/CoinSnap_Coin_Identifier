package androidx.compose.material.icons.automirrored.rounded;

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

/* compiled from: Help.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_help", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Help", "Landroidx/compose/material/icons/Icons$AutoMirrored$Rounded;", "getHelp", "(Landroidx/compose/material/icons/Icons$AutoMirrored$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class HelpKt {
    private static ImageVector _help;

    public static final ImageVector getHelp(Icons.AutoMirrored.Rounded rounded) {
        ImageVector.Builder m5207addPathoIyEayM;
        ImageVector imageVector = _help;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Rounded.Help", Dp.m6997constructorimpl(24.0f), Dp.m6997constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m4541getBlack0d7_KjU(), null);
        int m4868getButtKaPHkGw = StrokeCap.INSTANCE.m4868getButtKaPHkGw();
        int m4878getBevelLxFBmk8 = StrokeJoin.INSTANCE.m4878getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 19.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.07f, 11.25f);
        pathBuilder.lineToRelative(-0.9f, 0.92f);
        pathBuilder.curveToRelative(-0.5f, 0.51f, -0.86f, 0.97f, -1.04f, 1.69f);
        pathBuilder.curveToRelative(-0.08f, 0.32f, -0.13f, 0.68f, -0.13f, 1.14f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-0.5f);
        pathBuilder.curveToRelative(0.0f, -0.46f, 0.08f, -0.9f, 0.22f, -1.31f);
        pathBuilder.curveToRelative(0.2f, -0.58f, 0.53f, -1.1f, 0.95f, -1.52f);
        pathBuilder.lineToRelative(1.24f, -1.26f);
        pathBuilder.curveToRelative(0.46f, -0.44f, 0.68f, -1.1f, 0.55f, -1.8f);
        pathBuilder.curveToRelative(-0.13f, -0.72f, -0.69f, -1.33f, -1.39f, -1.53f);
        pathBuilder.curveToRelative(-1.11f, -0.31f, -2.14f, 0.32f, -2.47f, 1.27f);
        pathBuilder.curveToRelative(-0.12f, 0.37f, -0.43f, 0.65f, -0.82f, 0.65f);
        pathBuilder.horizontalLineToRelative(-0.3f);
        pathBuilder.curveTo(8.4f, 9.0f, 8.0f, 8.44f, 8.16f, 7.88f);
        pathBuilder.curveToRelative(0.43f, -1.47f, 1.68f, -2.59f, 3.23f, -2.83f);
        pathBuilder.curveToRelative(1.52f, -0.24f, 2.97f, 0.55f, 3.87f, 1.8f);
        pathBuilder.curveToRelative(1.18f, 1.63f, 0.83f, 3.38f, -0.19f, 4.4f);
        pathBuilder.close();
        m5207addPathoIyEayM = builder.m5207addPathoIyEayM(pathBuilder.getNodes(), (r30 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType, (r30 & 4) != 0 ? "" : "", (r30 & 8) != 0 ? null : solidColor, (r30 & 16) != 0 ? 1.0f : 1.0f, (r30 & 32) == 0 ? null : null, (r30 & 64) != 0 ? 1.0f : 1.0f, (r30 & 128) != 0 ? 0.0f : 1.0f, (r30 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : m4868getButtKaPHkGw, (r30 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : m4878getBevelLxFBmk8, (r30 & 1024) != 0 ? 4.0f : 1.0f, (r30 & 2048) != 0 ? 0.0f : 0.0f, (r30 & 4096) == 0 ? 0.0f : 1.0f, (r30 & 8192) == 0 ? 0.0f : 0.0f);
        ImageVector build = m5207addPathoIyEayM.build();
        _help = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}

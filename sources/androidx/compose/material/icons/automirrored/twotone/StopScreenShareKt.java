package androidx.compose.material.icons.automirrored.twotone;

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

/* compiled from: StopScreenShare.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_stopScreenShare", "Landroidx/compose/ui/graphics/vector/ImageVector;", "StopScreenShare", "Landroidx/compose/material/icons/Icons$AutoMirrored$TwoTone;", "getStopScreenShare", "(Landroidx/compose/material/icons/Icons$AutoMirrored$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class StopScreenShareKt {
    private static ImageVector _stopScreenShare;

    public static final ImageVector getStopScreenShare(Icons.AutoMirrored.TwoTone twoTone) {
        ImageVector.Builder m5207addPathoIyEayM;
        ImageVector imageVector = _stopScreenShare;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.TwoTone.StopScreenShare", Dp.m6997constructorimpl(24.0f), Dp.m6997constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m4541getBlack0d7_KjU(), null);
        int m4868getButtKaPHkGw = StrokeCap.INSTANCE.m4868getButtKaPHkGw();
        int m4878getBevelLxFBmk8 = StrokeJoin.INSTANCE.m4878getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.67f, 12.54f);
        pathBuilder.curveTo(9.13f, 12.92f, 7.96f, 13.71f, 7.0f, 15.0f);
        pathBuilder.curveToRelative(0.31f, -1.48f, 0.94f, -2.93f, 2.08f, -4.05f);
        pathBuilder.lineTo(4.13f, 6.02f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineToRelative(10.01f);
        pathBuilder.horizontalLineToRelative(10.14f);
        pathBuilder.lineToRelative(-3.47f, -3.49f);
        pathBuilder.close();
        builder.m5207addPathoIyEayM(pathBuilder.getNodes(), (r30 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType, (r30 & 4) != 0 ? "" : "", (r30 & 8) != 0 ? null : solidColor, (r30 & 16) != 0 ? 1.0f : 0.3f, (r30 & 32) == 0 ? null : null, (r30 & 64) != 0 ? 1.0f : 0.3f, (r30 & 128) != 0 ? 0.0f : 1.0f, (r30 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : m4868getButtKaPHkGw, (r30 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : m4878getBevelLxFBmk8, (r30 & 1024) != 0 ? 4.0f : 1.0f, (r30 & 2048) != 0 ? 0.0f : 0.0f, (r30 & 4096) == 0 ? 0.0f : 1.0f, (r30 & 8192) == 0 ? 0.0f : 0.0f);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(Color.INSTANCE.m4541getBlack0d7_KjU(), null);
        int m4868getButtKaPHkGw2 = StrokeCap.INSTANCE.m4868getButtKaPHkGw();
        int m4878getBevelLxFBmk82 = StrokeJoin.INSTANCE.m4878getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(21.79f, 18.0f);
        pathBuilder2.lineToRelative(2.0f, 2.0f);
        pathBuilder2.lineTo(24.0f, 20.0f);
        pathBuilder2.verticalLineToRelative(-2.0f);
        pathBuilder2.horizontalLineToRelative(-2.21f);
        pathBuilder2.close();
        pathBuilder2.moveTo(1.11f, 2.98f);
        pathBuilder2.lineToRelative(1.55f, 1.56f);
        pathBuilder2.curveToRelative(-0.41f, 0.37f, -0.66f, 0.89f, -0.66f, 1.48f);
        pathBuilder2.lineTo(2.0f, 16.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.01f, 2.0f);
        pathBuilder2.lineTo(0.0f, 18.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.horizontalLineToRelative(18.13f);
        pathBuilder2.lineToRelative(2.71f, 2.71f);
        pathBuilder2.lineToRelative(1.41f, -1.41f);
        pathBuilder2.lineTo(2.52f, 1.57f);
        pathBuilder2.lineTo(1.11f, 2.98f);
        pathBuilder2.close();
        pathBuilder2.moveTo(4.0f, 6.02f);
        pathBuilder2.horizontalLineToRelative(0.13f);
        pathBuilder2.lineToRelative(4.95f, 4.93f);
        pathBuilder2.curveTo(7.94f, 12.07f, 7.31f, 13.52f, 7.0f, 15.0f);
        pathBuilder2.curveToRelative(0.96f, -1.29f, 2.13f, -2.08f, 3.67f, -2.46f);
        pathBuilder2.lineToRelative(3.46f, 3.48f);
        pathBuilder2.lineTo(4.0f, 16.02f);
        pathBuilder2.verticalLineToRelative(-10.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(20.0f, 6.02f);
        pathBuilder2.verticalLineToRelative(10.19f);
        pathBuilder2.lineToRelative(1.3f, 1.3f);
        pathBuilder2.curveToRelative(0.42f, -0.37f, 0.7f, -0.89f, 0.7f, -1.49f);
        pathBuilder2.verticalLineToRelative(-10.0f);
        pathBuilder2.curveToRelative(0.0f, -1.11f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder2.lineTo(7.8f, 4.02f);
        pathBuilder2.lineToRelative(2.0f, 2.0f);
        pathBuilder2.lineTo(20.0f, 6.02f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.93f, 9.15f);
        pathBuilder2.lineToRelative(2.79f, 2.78f);
        pathBuilder2.lineToRelative(1.28f, -1.2f);
        pathBuilder2.lineTo(13.0f, 7.0f);
        pathBuilder2.verticalLineToRelative(2.13f);
        pathBuilder2.lineToRelative(-0.07f, 0.02f);
        pathBuilder2.close();
        builder.m5207addPathoIyEayM(pathBuilder2.getNodes(), (r30 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType2, (r30 & 4) != 0 ? "" : "", (r30 & 8) != 0 ? null : solidColor2, (r30 & 16) != 0 ? 1.0f : 1.0f, (r30 & 32) == 0 ? null : null, (r30 & 64) != 0 ? 1.0f : 1.0f, (r30 & 128) != 0 ? 0.0f : 1.0f, (r30 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : m4868getButtKaPHkGw2, (r30 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : m4878getBevelLxFBmk82, (r30 & 1024) != 0 ? 4.0f : 1.0f, (r30 & 2048) != 0 ? 0.0f : 0.0f, (r30 & 4096) == 0 ? 0.0f : 1.0f, (r30 & 8192) == 0 ? 0.0f : 0.0f);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(Color.INSTANCE.m4541getBlack0d7_KjU(), null);
        int m4868getButtKaPHkGw3 = StrokeCap.INSTANCE.m4868getButtKaPHkGw();
        int m4878getBevelLxFBmk83 = StrokeJoin.INSTANCE.m4878getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(20.0f, 6.02f);
        pathBuilder3.horizontalLineTo(9.8f);
        pathBuilder3.lineToRelative(3.13f, 3.13f);
        pathBuilder3.curveToRelative(0.02f, 0.0f, 0.04f, -0.01f, 0.07f, -0.02f);
        pathBuilder3.verticalLineTo(7.0f);
        pathBuilder3.lineToRelative(4.0f, 3.73f);
        pathBuilder3.lineToRelative(-1.28f, 1.2f);
        pathBuilder3.lineTo(20.0f, 16.21f);
        pathBuilder3.verticalLineTo(6.02f);
        pathBuilder3.close();
        m5207addPathoIyEayM = builder.m5207addPathoIyEayM(pathBuilder3.getNodes(), (r30 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType3, (r30 & 4) != 0 ? "" : "", (r30 & 8) != 0 ? null : solidColor3, (r30 & 16) != 0 ? 1.0f : 0.3f, (r30 & 32) == 0 ? null : null, (r30 & 64) != 0 ? 1.0f : 0.3f, (r30 & 128) != 0 ? 0.0f : 1.0f, (r30 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : m4868getButtKaPHkGw3, (r30 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : m4878getBevelLxFBmk83, (r30 & 1024) != 0 ? 4.0f : 1.0f, (r30 & 2048) != 0 ? 0.0f : 0.0f, (r30 & 4096) == 0 ? 0.0f : 1.0f, (r30 & 8192) == 0 ? 0.0f : 0.0f);
        ImageVector build = m5207addPathoIyEayM.build();
        _stopScreenShare = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}

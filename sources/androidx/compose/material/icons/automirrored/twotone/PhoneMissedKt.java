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

/* compiled from: PhoneMissed.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_phoneMissed", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PhoneMissed", "Landroidx/compose/material/icons/Icons$AutoMirrored$TwoTone;", "getPhoneMissed", "(Landroidx/compose/material/icons/Icons$AutoMirrored$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class PhoneMissedKt {
    private static ImageVector _phoneMissed;

    public static final ImageVector getPhoneMissed(Icons.AutoMirrored.TwoTone twoTone) {
        ImageVector.Builder m5207addPathoIyEayM;
        ImageVector imageVector = _phoneMissed;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.TwoTone.PhoneMissed", Dp.m6997constructorimpl(24.0f), Dp.m6997constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m4541getBlack0d7_KjU(), null);
        int m4868getButtKaPHkGw = StrokeCap.INSTANCE.m4868getButtKaPHkGw();
        int m4878getBevelLxFBmk8 = StrokeJoin.INSTANCE.m4878getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.6f, 17.22f);
        pathBuilder.curveToRelative(0.66f, 0.37f, 1.28f, 0.79f, 1.88f, 1.27f);
        pathBuilder.lineToRelative(1.07f, -1.07f);
        pathBuilder.curveToRelative(-0.91f, -0.75f, -1.9f, -1.39f, -2.95f, -1.9f);
        pathBuilder.verticalLineToRelative(1.7f);
        pathBuilder.close();
        pathBuilder.moveTo(3.53f, 18.5f);
        pathBuilder.curveToRelative(0.58f, -0.47f, 1.21f, -0.89f, 1.87f, -1.27f);
        pathBuilder.verticalLineToRelative(-1.71f);
        pathBuilder.curveToRelative(-1.05f, 0.51f, -2.03f, 1.15f, -2.95f, 1.9f);
        pathBuilder.lineToRelative(1.08f, 1.08f);
        pathBuilder.close();
        builder.m5207addPathoIyEayM(pathBuilder.getNodes(), (r30 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType, (r30 & 4) != 0 ? "" : "", (r30 & 8) != 0 ? null : solidColor, (r30 & 16) != 0 ? 1.0f : 0.3f, (r30 & 32) == 0 ? null : null, (r30 & 64) != 0 ? 1.0f : 0.3f, (r30 & 128) != 0 ? 0.0f : 1.0f, (r30 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : m4868getButtKaPHkGw, (r30 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : m4878getBevelLxFBmk8, (r30 & 1024) != 0 ? 4.0f : 1.0f, (r30 & 2048) != 0 ? 0.0f : 0.0f, (r30 & 4096) == 0 ? 0.0f : 1.0f, (r30 & 8192) == 0 ? 0.0f : 0.0f);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(Color.INSTANCE.m4541getBlack0d7_KjU(), null);
        int m4868getButtKaPHkGw2 = StrokeCap.INSTANCE.m4868getButtKaPHkGw();
        int m4878getBevelLxFBmk82 = StrokeJoin.INSTANCE.m4878getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(23.71f, 16.67f);
        pathBuilder2.curveTo(20.66f, 13.78f, 16.54f, 12.0f, 12.0f, 12.0f);
        pathBuilder2.reflectiveCurveTo(3.34f, 13.78f, 0.29f, 16.67f);
        pathBuilder2.curveToRelative(-0.18f, 0.18f, -0.29f, 0.43f, -0.29f, 0.71f);
        pathBuilder2.curveToRelative(0.0f, 0.28f, 0.11f, 0.53f, 0.29f, 0.71f);
        pathBuilder2.lineToRelative(2.48f, 2.48f);
        pathBuilder2.curveToRelative(0.18f, 0.18f, 0.43f, 0.29f, 0.71f, 0.29f);
        pathBuilder2.curveToRelative(0.27f, 0.0f, 0.52f, -0.11f, 0.7f, -0.28f);
        pathBuilder2.curveToRelative(0.79f, -0.74f, 1.69f, -1.36f, 2.66f, -1.85f);
        pathBuilder2.curveToRelative(0.33f, -0.16f, 0.56f, -0.5f, 0.56f, -0.9f);
        pathBuilder2.verticalLineToRelative(-3.1f);
        pathBuilder2.curveToRelative(1.45f, -0.48f, 3.0f, -0.73f, 4.6f, -0.73f);
        pathBuilder2.reflectiveCurveToRelative(3.15f, 0.25f, 4.6f, 0.72f);
        pathBuilder2.verticalLineToRelative(3.1f);
        pathBuilder2.curveToRelative(0.0f, 0.39f, 0.23f, 0.74f, 0.56f, 0.9f);
        pathBuilder2.curveToRelative(0.98f, 0.49f, 1.87f, 1.12f, 2.67f, 1.85f);
        pathBuilder2.curveToRelative(0.18f, 0.18f, 0.43f, 0.28f, 0.7f, 0.28f);
        pathBuilder2.curveToRelative(0.28f, 0.0f, 0.53f, -0.11f, 0.71f, -0.29f);
        pathBuilder2.lineToRelative(2.48f, -2.48f);
        pathBuilder2.curveToRelative(0.18f, -0.18f, 0.29f, -0.43f, 0.29f, -0.71f);
        pathBuilder2.curveToRelative(0.0f, -0.28f, -0.12f, -0.52f, -0.3f, -0.7f);
        pathBuilder2.close();
        pathBuilder2.moveTo(5.4f, 17.23f);
        pathBuilder2.curveToRelative(-0.66f, 0.37f, -1.29f, 0.8f, -1.87f, 1.27f);
        pathBuilder2.lineToRelative(-1.07f, -1.07f);
        pathBuilder2.curveToRelative(0.91f, -0.75f, 1.9f, -1.39f, 2.95f, -1.9f);
        pathBuilder2.verticalLineToRelative(1.7f);
        pathBuilder2.close();
        pathBuilder2.moveTo(20.48f, 18.49f);
        pathBuilder2.curveToRelative(-0.6f, -0.48f, -1.22f, -0.9f, -1.88f, -1.27f);
        pathBuilder2.verticalLineToRelative(-1.7f);
        pathBuilder2.curveToRelative(1.05f, 0.51f, 2.03f, 1.15f, 2.95f, 1.9f);
        pathBuilder2.lineToRelative(-1.07f, 1.07f);
        pathBuilder2.close();
        pathBuilder2.moveTo(7.0f, 6.43f);
        pathBuilder2.lineToRelative(4.94f, 4.94f);
        pathBuilder2.lineToRelative(7.07f, -7.07f);
        pathBuilder2.lineToRelative(-1.41f, -1.42f);
        pathBuilder2.lineToRelative(-5.66f, 5.66f);
        pathBuilder2.lineTo(8.4f, 5.0f);
        pathBuilder2.lineTo(11.0f, 5.0f);
        pathBuilder2.lineTo(11.0f, 3.0f);
        pathBuilder2.lineTo(5.0f, 3.0f);
        pathBuilder2.verticalLineToRelative(6.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.close();
        m5207addPathoIyEayM = builder.m5207addPathoIyEayM(pathBuilder2.getNodes(), (r30 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType2, (r30 & 4) != 0 ? "" : "", (r30 & 8) != 0 ? null : solidColor2, (r30 & 16) != 0 ? 1.0f : 1.0f, (r30 & 32) == 0 ? null : null, (r30 & 64) != 0 ? 1.0f : 1.0f, (r30 & 128) != 0 ? 0.0f : 1.0f, (r30 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : m4868getButtKaPHkGw2, (r30 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : m4878getBevelLxFBmk82, (r30 & 1024) != 0 ? 4.0f : 1.0f, (r30 & 2048) != 0 ? 0.0f : 0.0f, (r30 & 4096) == 0 ? 0.0f : 1.0f, (r30 & 8192) == 0 ? 0.0f : 0.0f);
        ImageVector build = m5207addPathoIyEayM.build();
        _phoneMissed = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}

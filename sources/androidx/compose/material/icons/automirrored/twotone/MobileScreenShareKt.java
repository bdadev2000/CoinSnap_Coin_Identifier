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

/* compiled from: MobileScreenShare.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_mobileScreenShare", "Landroidx/compose/ui/graphics/vector/ImageVector;", "MobileScreenShare", "Landroidx/compose/material/icons/Icons$AutoMirrored$TwoTone;", "getMobileScreenShare", "(Landroidx/compose/material/icons/Icons$AutoMirrored$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class MobileScreenShareKt {
    private static ImageVector _mobileScreenShare;

    public static final ImageVector getMobileScreenShare(Icons.AutoMirrored.TwoTone twoTone) {
        ImageVector.Builder m5207addPathoIyEayM;
        ImageVector imageVector = _mobileScreenShare;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.TwoTone.MobileScreenShare", Dp.m6997constructorimpl(24.0f), Dp.m6997constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m4541getBlack0d7_KjU(), null);
        int m4868getButtKaPHkGw = StrokeCap.INSTANCE.m4868getButtKaPHkGw();
        int m4878getBevelLxFBmk8 = StrokeJoin.INSTANCE.m4878getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.0f, 19.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.lineTo(17.0f, 5.0f);
        pathBuilder.lineTo(7.0f, 5.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.8f, 10.72f);
        pathBuilder.verticalLineToRelative(-1.7f);
        pathBuilder.lineTo(16.0f, 12.0f);
        pathBuilder.lineToRelative(-3.2f, 2.99f);
        pathBuilder.verticalLineToRelative(-1.75f);
        pathBuilder.curveToRelative(-2.22f, 0.0f, -3.69f, 0.68f, -4.8f, 2.18f);
        pathBuilder.curveToRelative(0.45f, -2.14f, 1.69f, -4.27f, 4.8f, -4.7f);
        pathBuilder.close();
        builder.m5207addPathoIyEayM(pathBuilder.getNodes(), (r30 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType, (r30 & 4) != 0 ? "" : "", (r30 & 8) != 0 ? null : solidColor, (r30 & 16) != 0 ? 1.0f : 0.3f, (r30 & 32) == 0 ? null : null, (r30 & 64) != 0 ? 1.0f : 0.3f, (r30 & 128) != 0 ? 0.0f : 1.0f, (r30 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : m4868getButtKaPHkGw, (r30 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : m4878getBevelLxFBmk8, (r30 & 1024) != 0 ? 4.0f : 1.0f, (r30 & 2048) != 0 ? 0.0f : 0.0f, (r30 & 4096) == 0 ? 0.0f : 1.0f, (r30 & 8192) == 0 ? 0.0f : 0.0f);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(Color.INSTANCE.m4541getBlack0d7_KjU(), null);
        int m4868getButtKaPHkGw2 = StrokeCap.INSTANCE.m4868getButtKaPHkGw();
        int m4878getBevelLxFBmk82 = StrokeJoin.INSTANCE.m4878getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(17.0f, 1.0f);
        pathBuilder2.lineTo(7.0f, 1.0f);
        pathBuilder2.curveToRelative(-1.1f, 0.0f, -1.99f, 0.85f, -1.99f, 1.95f);
        pathBuilder2.verticalLineToRelative(18.0f);
        pathBuilder2.curveTo(5.01f, 22.05f, 5.9f, 23.0f, 7.0f, 23.0f);
        pathBuilder2.horizontalLineToRelative(10.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, -0.95f, 2.0f, -2.05f);
        pathBuilder2.lineTo(19.0f, 3.0f);
        pathBuilder2.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(17.0f, 19.0f);
        pathBuilder2.lineTo(7.0f, 19.0f);
        pathBuilder2.lineTo(7.0f, 5.0f);
        pathBuilder2.horizontalLineToRelative(10.0f);
        pathBuilder2.verticalLineToRelative(14.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.8f, 13.24f);
        pathBuilder2.verticalLineToRelative(1.75f);
        pathBuilder2.lineTo(16.0f, 12.0f);
        pathBuilder2.lineToRelative(-3.2f, -2.98f);
        pathBuilder2.verticalLineToRelative(1.7f);
        pathBuilder2.curveToRelative(-3.11f, 0.43f, -4.35f, 2.56f, -4.8f, 4.7f);
        pathBuilder2.curveToRelative(1.11f, -1.5f, 2.58f, -2.18f, 4.8f, -2.18f);
        pathBuilder2.close();
        m5207addPathoIyEayM = builder.m5207addPathoIyEayM(pathBuilder2.getNodes(), (r30 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType2, (r30 & 4) != 0 ? "" : "", (r30 & 8) != 0 ? null : solidColor2, (r30 & 16) != 0 ? 1.0f : 1.0f, (r30 & 32) == 0 ? null : null, (r30 & 64) != 0 ? 1.0f : 1.0f, (r30 & 128) != 0 ? 0.0f : 1.0f, (r30 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : m4868getButtKaPHkGw2, (r30 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : m4878getBevelLxFBmk82, (r30 & 1024) != 0 ? 4.0f : 1.0f, (r30 & 2048) != 0 ? 0.0f : 0.0f, (r30 & 4096) == 0 ? 0.0f : 1.0f, (r30 & 8192) == 0 ? 0.0f : 0.0f);
        ImageVector build = m5207addPathoIyEayM.build();
        _mobileScreenShare = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}

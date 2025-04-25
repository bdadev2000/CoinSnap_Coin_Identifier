package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;

/* compiled from: VolumeDown.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u001e\u0010\u0002\u001a\u00020\u0001*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"_volumeDown", "Landroidx/compose/ui/graphics/vector/ImageVector;", "VolumeDown", "Landroidx/compose/material/icons/Icons$Filled;", "getVolumeDown$annotations", "(Landroidx/compose/material/icons/Icons$Filled;)V", "getVolumeDown", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class VolumeDownKt {
    private static ImageVector _volumeDown;

    @Deprecated(message = "Use the AutoMirrored version at Icons.AutoMirrored.Filled.VolumeDown", replaceWith = @ReplaceWith(expression = "Icons.AutoMirrored.Filled.VolumeDown", imports = {"androidx.compose.material.icons.automirrored.filled.VolumeDown"}))
    public static /* synthetic */ void getVolumeDown$annotations(Icons.Filled filled) {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: androidx.compose.ui.graphics.vector.ImageVector.Builder.addPath-oIyEayM$default(androidx.compose.ui.graphics.vector.ImageVector$Builder, java.util.List, int, java.lang.String, androidx.compose.ui.graphics.Brush, float, androidx.compose.ui.graphics.Brush, float, float, int, int, float, float, float, float, int, java.lang.Object):androidx.compose.ui.graphics.vector.ImageVector$Builder
        	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:74)
        	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:49)
        Caused by: java.lang.NullPointerException
        */
    public static final androidx.compose.ui.graphics.vector.ImageVector getVolumeDown(androidx.compose.material.icons.Icons.Filled r30) {
        /*
            androidx.compose.ui.graphics.vector.ImageVector r0 = androidx.compose.material.icons.filled.VolumeDownKt._volumeDown
            if (r0 == 0) goto L8
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            return r0
        L8:
            androidx.compose.ui.graphics.vector.ImageVector$Builder r1 = new androidx.compose.ui.graphics.vector.ImageVector$Builder
            r13 = r1
            r0 = 1103101952(0x41c00000, float:24.0)
            float r3 = androidx.compose.ui.unit.Dp.m6997constructorimpl(r0)
            float r4 = androidx.compose.ui.unit.Dp.m6997constructorimpl(r0)
            r11 = 96
            r12 = 0
            java.lang.String r2 = "Filled.VolumeDown"
            r5 = 1103101952(0x41c00000, float:24.0)
            r6 = 1103101952(0x41c00000, float:24.0)
            r7 = 0
            r9 = 0
            r10 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r9, r10, r11, r12)
            int r15 = androidx.compose.ui.graphics.vector.VectorKt.getDefaultFillType()
            androidx.compose.ui.graphics.SolidColor r0 = new androidx.compose.ui.graphics.SolidColor
            androidx.compose.ui.graphics.Color$Companion r1 = androidx.compose.ui.graphics.Color.INSTANCE
            long r1 = r1.m4541getBlack0d7_KjU()
            r3 = 0
            r0.<init>(r1, r3)
            r17 = r0
            androidx.compose.ui.graphics.Brush r17 = (androidx.compose.ui.graphics.Brush) r17
            androidx.compose.ui.graphics.StrokeCap$Companion r0 = androidx.compose.ui.graphics.StrokeCap.INSTANCE
            int r22 = r0.m4868getButtKaPHkGw()
            androidx.compose.ui.graphics.StrokeJoin$Companion r0 = androidx.compose.ui.graphics.StrokeJoin.INSTANCE
            int r23 = r0.m4878getBevelLxFBmk8()
            androidx.compose.ui.graphics.vector.PathBuilder r7 = new androidx.compose.ui.graphics.vector.PathBuilder
            r7.<init>()
            r0 = 1100218368(0x41940000, float:18.5)
            r1 = 1094713344(0x41400000, float:12.0)
            r7.moveTo(r0, r1)
            r5 = -1071644672(0xffffffffc0200000, float:-2.5)
            r6 = -1065290301(0xffffffffc080f5c3, float:-4.03)
            r1 = 0
            r2 = -1075671204(0xffffffffbfe28f5c, float:-1.77)
            r3 = -1081962660(0xffffffffbf828f5c, float:-1.02)
            r4 = -1068331172(0xffffffffc0528f5c, float:-3.29)
            r0 = r7
            r0.curveToRelative(r1, r2, r3, r4, r5, r6)
            r0 = 1090571469(0x4100cccd, float:8.05)
            r7.verticalLineToRelative(r0)
            r5 = 1075838976(0x40200000, float:2.5)
            r6 = -1065311273(0xffffffffc080a3d7, float:-4.02)
            r1 = 1069379748(0x3fbd70a4, float:1.48)
            r2 = -1086660280(0xffffffffbf3ae148, float:-0.73)
            r3 = 1075838976(0x40200000, float:2.5)
            r4 = -1072693248(0xffffffffc0100000, float:-2.25)
            r0 = r7
            r0.curveToRelative(r1, r2, r3, r4, r5, r6)
            r7.close()
            r0 = 1084227584(0x40a00000, float:5.0)
            r1 = 1091567616(0x41100000, float:9.0)
            r7.moveTo(r0, r1)
            r2 = 1086324736(0x40c00000, float:6.0)
            r7.verticalLineToRelative(r2)
            r2 = 1082130432(0x40800000, float:4.0)
            r7.horizontalLineToRelative(r2)
            r7.lineToRelative(r0, r0)
            r7.verticalLineTo(r2)
            r7.lineTo(r1, r1)
            r7.horizontalLineTo(r0)
            r7.close()
            java.util.List r14 = r7.getNodes()
            r28 = 14336(0x3800, float:2.0089E-41)
            r29 = 0
            java.lang.String r16 = ""
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            r20 = 1065353216(0x3f800000, float:1.0)
            r21 = 1065353216(0x3f800000, float:1.0)
            r24 = 1065353216(0x3f800000, float:1.0)
            r25 = 0
            r26 = 0
            r27 = 0
            androidx.compose.ui.graphics.vector.ImageVector$Builder r0 = androidx.compose.ui.graphics.vector.ImageVector.Builder.m5206addPathoIyEayM$default(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            androidx.compose.ui.graphics.vector.ImageVector r0 = r0.build()
            androidx.compose.material.icons.filled.VolumeDownKt._volumeDown = r0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.icons.filled.VolumeDownKt.getVolumeDown(androidx.compose.material.icons.Icons$Filled):androidx.compose.ui.graphics.vector.ImageVector");
    }
}

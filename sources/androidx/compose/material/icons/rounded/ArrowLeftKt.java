package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;

/* compiled from: ArrowLeft.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u001e\u0010\u0002\u001a\u00020\u0001*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"_arrowLeft", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ArrowLeft", "Landroidx/compose/material/icons/Icons$Rounded;", "getArrowLeft$annotations", "(Landroidx/compose/material/icons/Icons$Rounded;)V", "getArrowLeft", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ArrowLeftKt {
    private static ImageVector _arrowLeft;

    @Deprecated(message = "Use the AutoMirrored version at Icons.AutoMirrored.Rounded.ArrowLeft", replaceWith = @ReplaceWith(expression = "Icons.AutoMirrored.Rounded.ArrowLeft", imports = {"androidx.compose.material.icons.automirrored.rounded.ArrowLeft"}))
    public static /* synthetic */ void getArrowLeft$annotations(Icons.Rounded rounded) {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: androidx.compose.ui.graphics.vector.ImageVector.Builder.addPath-oIyEayM$default(androidx.compose.ui.graphics.vector.ImageVector$Builder, java.util.List, int, java.lang.String, androidx.compose.ui.graphics.Brush, float, androidx.compose.ui.graphics.Brush, float, float, int, int, float, float, float, float, int, java.lang.Object):androidx.compose.ui.graphics.vector.ImageVector$Builder
        	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:74)
        	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:49)
        Caused by: java.lang.NullPointerException
        */
    public static final androidx.compose.ui.graphics.vector.ImageVector getArrowLeft(androidx.compose.material.icons.Icons.Rounded r30) {
        /*
            androidx.compose.ui.graphics.vector.ImageVector r0 = androidx.compose.material.icons.rounded.ArrowLeftKt._arrowLeft
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
            java.lang.String r2 = "Rounded.ArrowLeft"
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
            r0 = 1095017431(0x4144a3d7, float:12.29)
            r1 = 1091263529(0x410b5c29, float:8.71)
            r7.moveTo(r0, r1)
            r0 = 1092301619(0x411b3333, float:9.7)
            r1 = 1093979341(0x4134cccd, float:11.3)
            r7.lineTo(r0, r1)
            r5 = 0
            r6 = 1068792545(0x3fb47ae1, float:1.41)
            r1 = -1094210028(0xffffffffbec7ae14, float:-0.39)
            r2 = 1053273620(0x3ec7ae14, float:0.39)
            r3 = -1094210028(0xffffffffbec7ae14, float:-0.39)
            r4 = 1065520988(0x3f828f5c, float:1.02)
            r0 = r7
            r0.curveToRelative(r1, r2, r3, r4, r5, r6)
            r0 = 1076216463(0x4025c28f, float:2.59)
            r7.lineToRelative(r0, r0)
            r5 = 1071309128(0x3fdae148, float:1.71)
            r6 = -1086995825(0xffffffffbf35c28f, float:-0.71)
            r1 = 1059145646(0x3f2147ae, float:0.63)
            r2 = 1059145646(0x3f2147ae, float:0.63)
            r3 = 1071309128(0x3fdae148, float:1.71)
            r4 = 1043878380(0x3e3851ec, float:0.18)
            r0 = r7
            r0.curveToRelative(r1, r2, r3, r4, r5, r6)
            r0 = 1091997532(0x41168f5c, float:9.41)
            r7.verticalLineTo(r0)
            r5 = -1076174520(0xffffffffbfdae148, float:-1.71)
            r6 = -1087163597(0xffffffffbf333333, float:-0.7)
            r1 = 0
            r2 = -1083975926(0xffffffffbf63d70a, float:-0.89)
            r3 = -1081459343(0xffffffffbf8a3d71, float:-1.08)
            r4 = -1079362191(0xffffffffbfaa3d71, float:-1.33)
            r0 = r7
            r0.curveToRelative(r1, r2, r3, r4, r5, r6)
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
            androidx.compose.material.icons.rounded.ArrowLeftKt._arrowLeft = r0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.icons.rounded.ArrowLeftKt.getArrowLeft(androidx.compose.material.icons.Icons$Rounded):androidx.compose.ui.graphics.vector.ImageVector");
    }
}

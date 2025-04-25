package androidx.compose.material.icons.filled;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* compiled from: FlightLand.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_flightLand", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FlightLand", "Landroidx/compose/material/icons/Icons$Filled;", "getFlightLand", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class FlightLandKt {
    private static ImageVector _flightLand;

    /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: androidx.compose.ui.graphics.vector.ImageVector.Builder.addPath-oIyEayM$default(androidx.compose.ui.graphics.vector.ImageVector$Builder, java.util.List, int, java.lang.String, androidx.compose.ui.graphics.Brush, float, androidx.compose.ui.graphics.Brush, float, float, int, int, float, float, float, float, int, java.lang.Object):androidx.compose.ui.graphics.vector.ImageVector$Builder
        	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:74)
        	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:49)
        Caused by: java.lang.NullPointerException
        */
    public static final androidx.compose.ui.graphics.vector.ImageVector getFlightLand(androidx.compose.material.icons.Icons.Filled r30) {
        /*
            androidx.compose.ui.graphics.vector.ImageVector r0 = androidx.compose.material.icons.filled.FlightLandKt._flightLand
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
            java.lang.String r2 = "Filled.FlightLand"
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
            r0 = 1075838976(0x40200000, float:2.5)
            r1 = 1100480512(0x41980000, float:19.0)
            r7.moveTo(r0, r1)
            r7.horizontalLineToRelative(r1)
            r8 = 1073741824(0x40000000, float:2.0)
            r7.verticalLineToRelative(r8)
            r0 = -1047003136(0xffffffffc1980000, float:-19.0)
            r7.horizontalLineToRelative(r0)
            r7.verticalLineTo(r1)
            r7.close()
            r9 = 1100658770(0x419ab852, float:19.34)
            r10 = 1098750362(0x417d999a, float:15.85)
            r7.moveTo(r9, r10)
            r5 = 1072399647(0x3feb851f, float:1.84)
            r6 = -1081627116(0xffffffffbf87ae14, float:-1.06)
            r1 = 1061997773(0x3f4ccccd, float:0.8)
            r2 = 1045891645(0x3e570a3d, float:0.21)
            r3 = 1070554153(0x3fcf5c29, float:1.62)
            r4 = -1098572104(0xffffffffbe851eb8, float:-0.26)
            r0 = r7
            r0.curveToRelative(r1, r2, r3, r4, r5, r6)
            r5 = -1081627116(0xffffffffbf87ae14, float:-1.06)
            r6 = -1075084001(0xffffffffbfeb851f, float:-1.84)
            r1 = 1045891645(0x3e570a3d, float:0.21)
            r2 = -1085485875(0xffffffffbf4ccccd, float:-0.8)
            r3 = -1098572104(0xffffffffbe851eb8, float:-0.26)
            r4 = -1076929495(0xffffffffbfcf5c29, float:-1.62)
            r0.curveToRelative(r1, r2, r3, r4, r5, r6)
            r0 = -1062605947(0xffffffffc0a9eb85, float:-5.31)
            r1 = -1078607217(0xffffffffbfb5c28f, float:-1.42)
            r7.lineToRelative(r0, r1)
            r0 = -1070554153(0xffffffffc030a3d7, float:-2.76)
            r1 = -1055895060(0xffffffffc11051ec, float:-9.02)
            r7.lineToRelative(r0, r1)
            r0 = 1092742021(0x4121eb85, float:10.12)
            r7.lineTo(r0, r8)
            r0 = 1090812641(0x41047ae1, float:8.28)
            r7.verticalLineToRelative(r0)
            r0 = 1084542157(0x40a4cccd, float:5.15)
            r1 = 1091515187(0x410f3333, float:8.95)
            r7.lineTo(r0, r1)
            r0 = 1082591805(0x40870a3d, float:4.22)
            r1 = 1087645942(0x40d428f6, float:6.63)
            r7.lineTo(r0, r1)
            r0 = 1076971438(0x403147ae, float:2.77)
            r1 = 1086828052(0x40c7ae14, float:6.24)
            r7.lineTo(r0, r1)
            r0 = 1084584100(0x40a570a4, float:5.17)
            r7.verticalLineToRelative(r0)
            r7.lineTo(r9, r10)
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
            androidx.compose.material.icons.filled.FlightLandKt._flightLand = r0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.icons.filled.FlightLandKt.getFlightLand(androidx.compose.material.icons.Icons$Filled):androidx.compose.ui.graphics.vector.ImageVector");
    }
}

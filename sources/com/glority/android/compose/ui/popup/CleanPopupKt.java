package com.glority.android.compose.ui.popup;

import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* compiled from: CleanPopup.kt */
@Metadata(d1 = {"\u0000n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0001\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u001528\b\u0002\u0010\u0016\u001a2\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u000b0\u00172\u001c\u0010\u001d\u001a\u0018\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u000b0\u001e¢\u0006\u0002\b ¢\u0006\u0002\b!H\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001aC\u0010$\u001a\u00020\u000b2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&2\b\b\u0002\u0010\f\u001a\u00020\r2\u001c\u0010\u001d\u001a\u0018\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u000b0\u001e¢\u0006\u0002\b ¢\u0006\u0002\b!H\u0001¢\u0006\u0002\u0010(\u001a\u001d\u0010)\u001a\u00020*2\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0018H\u0000¢\u0006\u0002\u0010+\"\u0016\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0007\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\b\u0010\u0003\"\u000e\u0010\t\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006,"}, d2 = {"DropdownMenuVerticalPadding", "Landroidx/compose/ui/unit/Dp;", "getDropdownMenuVerticalPadding", "()F", "F", "InTransitionDuration", "", "MenuVerticalMargin", "getMenuVerticalMargin", "OutTransitionDuration", "CleanPopup", "", "modifier", "Landroidx/compose/ui/Modifier;", "visibleSate", "Lcom/glority/android/picturexx/ui/components/state/VisibleSate;", "onDismissRequest", "Lkotlin/Function0;", "popupPosition", "Landroidx/compose/ui/unit/DpOffset;", "properties", "Landroidx/compose/ui/window/PopupProperties;", "onPositionCalculated", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/IntRect;", "Lkotlin/ParameterName;", "name", "parentBounds", "menuBounds", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "CleanPopup-4kj-_NE", "(Landroidx/compose/ui/Modifier;Lcom/glority/android/picturexx/ui/components/state/VisibleSate;Lkotlin/jvm/functions/Function0;JLandroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DropdownMenuContent", "expandedStates", "Landroidx/compose/animation/core/MutableTransitionState;", "", "(Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "calculateTransformOrigin", "Landroidx/compose/ui/graphics/TransformOrigin;", "(Landroidx/compose/ui/unit/IntRect;Landroidx/compose/ui/unit/IntRect;)J", "lib-compose_release"}, k = 2, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class CleanPopupKt {
    public static final int InTransitionDuration = 120;
    public static final int OutTransitionDuration = 75;
    private static final float MenuVerticalMargin = Dp.m6997constructorimpl(48);
    private static final float DropdownMenuVerticalPadding = Dp.m6997constructorimpl(8);

    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0071  */
    /* renamed from: CleanPopup-4kj-_NE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m7719CleanPopup4kj_NE(androidx.compose.ui.Modifier r26, final com.glority.android.picturexx.ui.components.state.VisibleSate r27, kotlin.jvm.functions.Function0<kotlin.Unit> r28, long r29, androidx.compose.ui.window.PopupProperties r31, kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.IntRect, ? super androidx.compose.ui.unit.IntRect, kotlin.Unit> r32, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r33, androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.compose.ui.popup.CleanPopupKt.m7719CleanPopup4kj_NE(androidx.compose.ui.Modifier, com.glority.android.picturexx.ui.components.state.VisibleSate, kotlin.jvm.functions.Function0, long, androidx.compose.ui.window.PopupProperties, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void DropdownMenuContent(final androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> r18, androidx.compose.ui.Modifier r19, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.compose.ui.popup.CleanPopupKt.DropdownMenuContent(androidx.compose.animation.core.MutableTransitionState, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long calculateTransformOrigin(androidx.compose.ui.unit.IntRect r5, androidx.compose.ui.unit.IntRect r6) {
        /*
            java.lang.String r0 = "parentBounds"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "menuBounds"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            int r0 = r6.getLeft()
            int r1 = r5.getRight()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            if (r0 < r1) goto L19
        L17:
            r0 = r3
            goto L53
        L19:
            int r0 = r6.getRight()
            int r1 = r5.getLeft()
            if (r0 > r1) goto L25
            r0 = r2
            goto L53
        L25:
            int r0 = r6.getWidth()
            if (r0 != 0) goto L2c
            goto L17
        L2c:
            int r0 = r5.getLeft()
            int r1 = r6.getLeft()
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r5.getRight()
            int r4 = r6.getRight()
            int r1 = java.lang.Math.min(r1, r4)
            int r0 = r0 + r1
            int r0 = r0 / 2
            int r1 = r6.getLeft()
            int r0 = r0 - r1
            float r0 = (float) r0
            int r1 = r6.getWidth()
            float r1 = (float) r1
            float r0 = r0 / r1
        L53:
            int r1 = r6.getTop()
            int r4 = r5.getBottom()
            if (r1 < r4) goto L5f
        L5d:
            r2 = r3
            goto L99
        L5f:
            int r1 = r6.getBottom()
            int r4 = r5.getTop()
            if (r1 > r4) goto L6a
            goto L99
        L6a:
            int r1 = r6.getHeight()
            if (r1 != 0) goto L71
            goto L5d
        L71:
            int r1 = r5.getTop()
            int r2 = r6.getTop()
            int r1 = java.lang.Math.max(r1, r2)
            int r5 = r5.getBottom()
            int r2 = r6.getBottom()
            int r5 = java.lang.Math.min(r5, r2)
            int r1 = r1 + r5
            int r1 = r1 / 2
            int r5 = r6.getTop()
            int r1 = r1 - r5
            float r5 = (float) r1
            int r6 = r6.getHeight()
            float r6 = (float) r6
            float r2 = r5 / r6
        L99:
            long r5 = androidx.compose.ui.graphics.TransformOriginKt.TransformOrigin(r0, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.compose.ui.popup.CleanPopupKt.calculateTransformOrigin(androidx.compose.ui.unit.IntRect, androidx.compose.ui.unit.IntRect):long");
    }

    public static final float getMenuVerticalMargin() {
        return MenuVerticalMargin;
    }

    public static final float getDropdownMenuVerticalPadding() {
        return DropdownMenuVerticalPadding;
    }
}

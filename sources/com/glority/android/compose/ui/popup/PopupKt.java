package com.glority.android.compose.ui.popup;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* compiled from: Popup.kt */
@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\u001aP\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001aW\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u001a\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b²\u0006\n\u0010\u001c\u001a\u00020\u001dX\u008a\u008e\u0002²\u0006\n\u0010\u001e\u001a\u00020\u001dX\u008a\u008e\u0002²\u0006\n\u0010\u001f\u001a\u00020\u001dX\u008a\u0084\u0002²\u0006\n\u0010 \u001a\u00020\u001dX\u008a\u0084\u0002"}, d2 = {"glPopupAnchorPadding", "Landroidx/compose/ui/unit/Dp;", "F", "CustomPopupContent", "", "expandedStates", "Landroidx/compose/animation/core/MutableTransitionState;", "", "transformOrigin", "Landroidx/compose/ui/graphics/TransformOrigin;", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "CustomPopupContent-twVAp8k", "(Landroidx/compose/animation/core/MutableTransitionState;JLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "GlPopup", "popupState", "Lcom/glority/android/compose/ui/popup/PopupState;", "onDismissRequest", "Lkotlin/Function0;", "properties", "Landroidx/compose/ui/window/PopupProperties;", "(Landroidx/compose/ui/Modifier;Lcom/glority/android/compose/ui/popup/PopupState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "lib-compose_release", "pivotFractionX", "", "pivotFractionY", "scale", "alpha"}, k = 2, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class PopupKt {
    private static final float glPopupAnchorPadding = Dp.m6997constructorimpl(4);

    /* JADX WARN: Removed duplicated region for block: B:21:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void GlPopup(androidx.compose.ui.Modifier r21, final com.glority.android.compose.ui.popup.PopupState r22, kotlin.jvm.functions.Function0<kotlin.Unit> r23, androidx.compose.ui.window.PopupProperties r24, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.compose.ui.popup.PopupKt.GlPopup(androidx.compose.ui.Modifier, com.glority.android.compose.ui.popup.PopupState, kotlin.jvm.functions.Function0, androidx.compose.ui.window.PopupProperties, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float GlPopup$lambda$3(MutableFloatState mutableFloatState) {
        return mutableFloatState.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float GlPopup$lambda$6(MutableFloatState mutableFloatState) {
        return mutableFloatState.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0062  */
    /* renamed from: CustomPopupContent-twVAp8k, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m7726CustomPopupContenttwVAp8k(final androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> r21, final long r22, androidx.compose.ui.Modifier r24, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.compose.ui.popup.PopupKt.m7726CustomPopupContenttwVAp8k(androidx.compose.animation.core.MutableTransitionState, long, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CustomPopupContent_twVAp8k$graphicsLayerAnim(GraphicsLayerScope graphicsLayerScope, long j, State<Float> state, State<Float> state2) {
        graphicsLayerScope.setScaleX(CustomPopupContent_twVAp8k$lambda$11(state));
        graphicsLayerScope.setScaleY(CustomPopupContent_twVAp8k$lambda$11(state));
        graphicsLayerScope.setAlpha(CustomPopupContent_twVAp8k$lambda$13(state2));
        graphicsLayerScope.mo4708setTransformOrigin__ExYCQ(j);
    }

    private static final float CustomPopupContent_twVAp8k$lambda$11(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final float CustomPopupContent_twVAp8k$lambda$13(State<Float> state) {
        return state.getValue().floatValue();
    }
}

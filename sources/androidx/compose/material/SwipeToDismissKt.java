package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: SwipeToDismiss.kt */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0081\u0001\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\r2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\r¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\r¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0002\u0010\u0014\u001a\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0002\u001a-\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u00172\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001c0\rH\u0007¢\u0006\u0002\u0010\u001d\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006\u001e"}, d2 = {"DISMISS_THRESHOLD", "Landroidx/compose/ui/unit/Dp;", "F", "SwipeToDismiss", "", "state", "Landroidx/compose/material/DismissState;", "modifier", "Landroidx/compose/ui/Modifier;", "directions", "", "Landroidx/compose/material/DismissDirection;", "dismissThresholds", "Lkotlin/Function1;", "Landroidx/compose/material/ThresholdConfig;", "background", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "dismissContent", "(Landroidx/compose/material/DismissState;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "getDismissDirection", "from", "Landroidx/compose/material/DismissValue;", "to", "rememberDismissState", "initialValue", "confirmStateChange", "", "(Landroidx/compose/material/DismissValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/DismissState;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class SwipeToDismissKt {
    private static final float DISMISS_THRESHOLD = Dp.m6997constructorimpl(56);

    public static final DismissState rememberDismissState(final DismissValue dismissValue, final Function1<? super DismissValue, Boolean> function1, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1753522702);
        ComposerKt.sourceInformation(composer, "C(rememberDismissState)P(1)153@5407L127:SwipeToDismiss.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            dismissValue = DismissValue.Default;
        }
        if ((i2 & 2) != 0) {
            function1 = new Function1<DismissValue, Boolean>() { // from class: androidx.compose.material.SwipeToDismissKt$rememberDismissState$1
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(DismissValue dismissValue2) {
                    return true;
                }
            };
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1753522702, i, -1, "androidx.compose.material.rememberDismissState (SwipeToDismiss.kt:152)");
        }
        Object[] objArr = new Object[0];
        Saver<DismissState, DismissValue> Saver = DismissState.INSTANCE.Saver(function1);
        composer.startReplaceableGroup(-822335729);
        boolean changed = composer.changed(dismissValue) | composer.changedInstance(function1);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = (Function0) new Function0<DismissState>() { // from class: androidx.compose.material.SwipeToDismissKt$rememberDismissState$2$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final DismissState invoke() {
                    return new DismissState(DismissValue.this, function1);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        DismissState dismissState = (DismissState) RememberSaveableKt.m4101rememberSaveable(objArr, (Saver) Saver, (String) null, (Function0) rememberedValue, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return dismissState;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void SwipeToDismiss(final androidx.compose.material.DismissState r16, androidx.compose.ui.Modifier r17, java.util.Set<? extends androidx.compose.material.DismissDirection> r18, kotlin.jvm.functions.Function1<? super androidx.compose.material.DismissDirection, ? extends androidx.compose.material.ThresholdConfig> r19, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r20, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeToDismissKt.SwipeToDismiss(androidx.compose.material.DismissState, androidx.compose.ui.Modifier, java.util.Set, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DismissDirection getDismissDirection(DismissValue dismissValue, DismissValue dismissValue2) {
        if (dismissValue == dismissValue2 && dismissValue == DismissValue.Default) {
            return null;
        }
        if (dismissValue == dismissValue2 && dismissValue == DismissValue.DismissedToEnd) {
            return DismissDirection.StartToEnd;
        }
        if (dismissValue == dismissValue2 && dismissValue == DismissValue.DismissedToStart) {
            return DismissDirection.EndToStart;
        }
        if (dismissValue == DismissValue.Default && dismissValue2 == DismissValue.DismissedToEnd) {
            return DismissDirection.StartToEnd;
        }
        if (dismissValue == DismissValue.Default && dismissValue2 == DismissValue.DismissedToStart) {
            return DismissDirection.EndToStart;
        }
        if (dismissValue == DismissValue.DismissedToEnd && dismissValue2 == DismissValue.Default) {
            return DismissDirection.StartToEnd;
        }
        if (dismissValue == DismissValue.DismissedToStart && dismissValue2 == DismissValue.Default) {
            return DismissDirection.EndToStart;
        }
        return null;
    }
}

package com.glority.android.compose.ui;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: ProgressIndicator.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\u001aN\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\r\u0010\u000f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0011²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u008e\u0002²\u0006\n\u0010\u0014\u001a\u00020\u0015X\u008a\u0084\u0002"}, d2 = {"GlCircularProgressIndicator", "", "modifier", "Landroidx/compose/ui/Modifier;", TypedValues.TransitionType.S_DURATION, "", "color", "Landroidx/compose/ui/graphics/Color;", "strokeWidth", "Landroidx/compose/ui/unit/Dp;", "trackColor", "strokeCap", "Landroidx/compose/ui/graphics/StrokeCap;", "GlCircularProgressIndicator-DUhRLBM", "(Landroidx/compose/ui/Modifier;IJFJILandroidx/compose/runtime/Composer;II)V", "GlCircularProgressIndicatorPreview", "(Landroidx/compose/runtime/Composer;I)V", "lib-compose_release", "start", "", "progress", ""}, k = 2, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class ProgressIndicatorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void GlCircularProgressIndicatorPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1055622866);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1055622866, i, -1, "com.glority.android.compose.ui.GlCircularProgressIndicatorPreview (ProgressIndicator.kt:22)");
            }
            m7715GlCircularProgressIndicatorDUhRLBM(SizeKt.m1030size3ABfNKs(Modifier.INSTANCE, Dp.m6997constructorimpl(80)), 0, 0L, 0.0f, 0L, 0, startRestartGroup, 6, 62);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.compose.ui.ProgressIndicatorKt$GlCircularProgressIndicatorPreview$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    ProgressIndicatorKt.GlCircularProgressIndicatorPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0112  */
    /* renamed from: GlCircularProgressIndicator-DUhRLBM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m7715GlCircularProgressIndicatorDUhRLBM(androidx.compose.ui.Modifier r22, int r23, long r24, float r26, long r27, int r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 621
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.compose.ui.ProgressIndicatorKt.m7715GlCircularProgressIndicatorDUhRLBM(androidx.compose.ui.Modifier, int, long, float, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final boolean GlCircularProgressIndicator_DUhRLBM$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GlCircularProgressIndicator_DUhRLBM$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final float GlCircularProgressIndicator_DUhRLBM$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }
}

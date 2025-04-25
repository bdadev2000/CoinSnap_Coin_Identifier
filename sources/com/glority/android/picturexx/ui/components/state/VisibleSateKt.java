package com.glority.android.picturexx.ui.components.state;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* compiled from: VisibleSate.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"rememberVisibleSate", "Lcom/glority/android/picturexx/ui/components/state/VisibleSate;", "visible", "", "(ZLandroidx/compose/runtime/Composer;I)Lcom/glority/android/picturexx/ui/components/state/VisibleSate;", "lib-compose_release"}, k = 2, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final class VisibleSateKt {
    public static final VisibleSate rememberVisibleSate(boolean z, Composer composer, int i) {
        composer.startReplaceableGroup(1837143365);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1837143365, i, -1, "com.glority.android.picturexx.ui.components.state.rememberVisibleSate (VisibleSate.kt:15)");
        }
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new VisibleSate(z);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        VisibleSate visibleSate = (VisibleSate) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return visibleSate;
    }
}

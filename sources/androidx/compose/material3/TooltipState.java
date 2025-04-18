package androidx.compose.material3;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.MutatePriority;
import h0.g;

@ExperimentalMaterial3Api
/* loaded from: classes3.dex */
public interface TooltipState {
    void a();

    Object b(MutatePriority mutatePriority, g gVar);

    MutableTransitionState c();

    void dismiss();

    boolean isVisible();
}

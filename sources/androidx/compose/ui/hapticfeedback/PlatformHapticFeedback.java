package androidx.compose.ui.hapticfeedback;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes4.dex */
public final class PlatformHapticFeedback implements HapticFeedback {

    /* renamed from: a, reason: collision with root package name */
    public final View f15497a;

    public PlatformHapticFeedback(View view) {
        this.f15497a = view;
    }

    @Override // androidx.compose.ui.hapticfeedback.HapticFeedback
    public final void a() {
        this.f15497a.performHapticFeedback(9);
    }
}

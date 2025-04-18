package androidx.compose.ui.platform;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes3.dex */
public final class AndroidAccessibilityManager implements AccessibilityManager {

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    public AndroidAccessibilityManager(Context context) {
        Object systemService = context.getSystemService("accessibility");
        p0.a.q(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
    }
}

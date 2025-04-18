package androidx.compose.ui.platform;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
final class AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1 extends r implements q0.l {

    /* renamed from: a, reason: collision with root package name */
    public static final AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1 f16311a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        SemanticsConfiguration w = ((LayoutNode) obj).w();
        boolean z2 = false;
        if (w != null && w.f16816b) {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }
}

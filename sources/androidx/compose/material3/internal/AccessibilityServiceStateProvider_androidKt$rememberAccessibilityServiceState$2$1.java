package androidx.compose.material3.internal;

import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.material3.internal.Listener;
import d0.b0;
import kotlin.jvm.internal.r;

/* loaded from: classes4.dex */
final class AccessibilityServiceStateProvider_androidKt$rememberAccessibilityServiceState$2$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Listener f12774a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AccessibilityManager f12775b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccessibilityServiceStateProvider_androidKt$rememberAccessibilityServiceState$2$1(Listener listener, AccessibilityManager accessibilityManager) {
        super(0);
        this.f12774a = listener;
        this.f12775b = accessibilityManager;
    }

    @Override // q0.a
    public final Object invoke() {
        Listener$switchAccessListener$1 listener$switchAccessListener$1;
        Listener listener = this.f12774a;
        listener.getClass();
        AccessibilityManager accessibilityManager = this.f12775b;
        accessibilityManager.removeAccessibilityStateChangeListener(listener);
        Listener$touchExplorationListener$1 listener$touchExplorationListener$1 = listener.f13013b;
        if (listener$touchExplorationListener$1 != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(listener$touchExplorationListener$1);
        }
        if (Build.VERSION.SDK_INT >= 33 && (listener$switchAccessListener$1 = listener.f13014c) != null) {
            Listener.Api33Impl.b(accessibilityManager, listener$switchAccessListener$1);
        }
        return b0.f30125a;
    }
}

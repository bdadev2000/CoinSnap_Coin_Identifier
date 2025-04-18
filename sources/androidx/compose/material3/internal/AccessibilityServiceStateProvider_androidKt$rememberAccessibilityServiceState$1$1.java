package androidx.compose.material3.internal;

import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.material3.internal.Listener;
import androidx.lifecycle.Lifecycle;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class AccessibilityServiceStateProvider_androidKt$rememberAccessibilityServiceState$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Listener f12772a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AccessibilityManager f12773b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccessibilityServiceStateProvider_androidKt$rememberAccessibilityServiceState$1$1(Listener listener, AccessibilityManager accessibilityManager) {
        super(1);
        this.f12772a = listener;
        this.f12773b = accessibilityManager;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Listener$switchAccessListener$1 listener$switchAccessListener$1;
        if (((Lifecycle.Event) obj) == Lifecycle.Event.ON_RESUME) {
            Listener listener = this.f12772a;
            listener.getClass();
            AccessibilityManager accessibilityManager = this.f12773b;
            listener.f13012a.setValue(Boolean.valueOf(accessibilityManager.isEnabled()));
            accessibilityManager.addAccessibilityStateChangeListener(listener);
            Listener$touchExplorationListener$1 listener$touchExplorationListener$1 = listener.f13013b;
            if (listener$touchExplorationListener$1 != null) {
                listener$touchExplorationListener$1.f13017a.setValue(Boolean.valueOf(accessibilityManager.isTouchExplorationEnabled()));
                accessibilityManager.addTouchExplorationStateChangeListener(listener$touchExplorationListener$1);
            }
            if (Build.VERSION.SDK_INT >= 33 && (listener$switchAccessListener$1 = listener.f13014c) != null) {
                listener$switchAccessListener$1.f13015a.setValue(Boolean.valueOf(Listener.a(accessibilityManager)));
                Listener.Api33Impl.a(accessibilityManager, listener$switchAccessListener$1);
            }
        }
        return b0.f30125a;
    }
}

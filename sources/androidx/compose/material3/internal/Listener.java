package androidx.compose.material3.internal;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StructuralEqualityPolicy;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import z0.m;

@Stable
/* loaded from: classes3.dex */
final class Listener implements AccessibilityManager.AccessibilityStateChangeListener, State<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f13012a;

    /* renamed from: b, reason: collision with root package name */
    public final Listener$touchExplorationListener$1 f13013b;

    /* renamed from: c, reason: collision with root package name */
    public final Listener$switchAccessListener$1 f13014c;

    @RequiresApi
    /* loaded from: classes3.dex */
    public static final class Api33Impl {
        @DoNotInline
        public static final void a(@NotNull AccessibilityManager accessibilityManager, @NotNull AccessibilityManager$AccessibilityServicesStateChangeListener accessibilityManager$AccessibilityServicesStateChangeListener) {
            accessibilityManager.addAccessibilityServicesStateChangeListener(accessibilityManager$AccessibilityServicesStateChangeListener);
        }

        @DoNotInline
        public static final void b(@NotNull AccessibilityManager accessibilityManager, @NotNull AccessibilityManager$AccessibilityServicesStateChangeListener accessibilityManager$AccessibilityServicesStateChangeListener) {
            accessibilityManager.removeAccessibilityServicesStateChangeListener(accessibilityManager$AccessibilityServicesStateChangeListener);
        }
    }

    public Listener(boolean z2, boolean z3) {
        ParcelableSnapshotMutableState f2;
        f2 = SnapshotStateKt.f(Boolean.FALSE, StructuralEqualityPolicy.f14078a);
        this.f13012a = f2;
        Listener$switchAccessListener$1 listener$switchAccessListener$1 = null;
        this.f13013b = z2 ? new Listener$touchExplorationListener$1() : null;
        if (z3 && Build.VERSION.SDK_INT >= 33) {
            listener$switchAccessListener$1 = new Listener$switchAccessListener$1(this);
        }
        this.f13014c = listener$switchAccessListener$1;
    }

    public static boolean a(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i2 = 0; i2 < size; i2++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i2).getSettingsActivityName();
            if (settingsActivityName != null && m.M0(settingsActivityName, "SwitchAccess", false)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.runtime.State
    public final Object getValue() {
        Listener$touchExplorationListener$1 listener$touchExplorationListener$1;
        Listener$switchAccessListener$1 listener$switchAccessListener$1;
        return Boolean.valueOf(((Boolean) this.f13012a.getValue()).booleanValue() && (((listener$touchExplorationListener$1 = this.f13013b) != null && ((Boolean) listener$touchExplorationListener$1.f13017a.getValue()).booleanValue()) || ((listener$switchAccessListener$1 = this.f13014c) != null && ((Boolean) listener$switchAccessListener$1.f13015a.getValue()).booleanValue())));
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z2) {
        this.f13012a.setValue(Boolean.valueOf(z2));
    }
}

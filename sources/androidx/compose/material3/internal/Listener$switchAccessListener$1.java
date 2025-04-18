package androidx.compose.material3.internal;

import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;

/* loaded from: classes3.dex */
public final class Listener$switchAccessListener$1 implements AccessibilityManager$AccessibilityServicesStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f13015a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Listener f13016b;

    public Listener$switchAccessListener$1(Listener listener) {
        ParcelableSnapshotMutableState f2;
        this.f13016b = listener;
        f2 = SnapshotStateKt.f(Boolean.FALSE, StructuralEqualityPolicy.f14078a);
        this.f13015a = f2;
    }

    public final void onAccessibilityServicesStateChanged(AccessibilityManager accessibilityManager) {
        this.f13016b.getClass();
        this.f13015a.setValue(Boolean.valueOf(Listener.a(accessibilityManager)));
    }
}

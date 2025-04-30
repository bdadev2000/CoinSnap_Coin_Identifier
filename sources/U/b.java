package U;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import androidx.core.view.ViewCompat;
import g4.AbstractC2292b;

/* loaded from: classes.dex */
public final class b implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final F2.d f3085a;

    public b(F2.d dVar) {
        this.f3085a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f3085a.equals(((b) obj).f3085a);
    }

    public final int hashCode() {
        return this.f3085a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z8) {
        int i9;
        U3.k kVar = (U3.k) this.f3085a.f1130c;
        AutoCompleteTextView autoCompleteTextView = kVar.f3158h;
        if (autoCompleteTextView != null && !AbstractC2292b.f(autoCompleteTextView)) {
            if (z8) {
                i9 = 2;
            } else {
                i9 = 1;
            }
            ViewCompat.setImportantForAccessibility(kVar.f3190d, i9);
        }
    }
}

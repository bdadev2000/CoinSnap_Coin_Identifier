package o0;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;

/* loaded from: classes.dex */
public final class b implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final androidx.core.app.h a;

    public b(androidx.core.app.h hVar) {
        this.a = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.a.equals(((b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z10) {
        boolean z11;
        na.j jVar = (na.j) this.a.f1189c;
        AutoCompleteTextView autoCompleteTextView = jVar.f22622h;
        if (autoCompleteTextView != null) {
            int i10 = 1;
            if (autoCompleteTextView.getInputType() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                if (z10) {
                    i10 = 2;
                }
                jVar.f22658d.setImportantForAccessibility(i10);
            }
        }
    }
}

package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import d0.c;
import p0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class AccessibilityAction<T extends c> {

    /* renamed from: a, reason: collision with root package name */
    public final String f16772a;

    /* renamed from: b, reason: collision with root package name */
    public final c f16773b;

    public AccessibilityAction(String str, c cVar) {
        this.f16772a = str;
        this.f16773b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessibilityAction)) {
            return false;
        }
        AccessibilityAction accessibilityAction = (AccessibilityAction) obj;
        return a.g(this.f16772a, accessibilityAction.f16772a) && a.g(this.f16773b, accessibilityAction.f16773b);
    }

    public final int hashCode() {
        String str = this.f16772a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        c cVar = this.f16773b;
        return hashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f16772a + ", action=" + this.f16773b + ')';
    }
}

package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import q0.a;

@StabilityInferred
/* loaded from: classes4.dex */
public final class CustomAccessibilityAction {

    /* renamed from: a, reason: collision with root package name */
    public final String f16782a;

    /* renamed from: b, reason: collision with root package name */
    public final a f16783b;

    public CustomAccessibilityAction(String str, a aVar) {
        this.f16782a = str;
        this.f16783b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomAccessibilityAction)) {
            return false;
        }
        CustomAccessibilityAction customAccessibilityAction = (CustomAccessibilityAction) obj;
        return p0.a.g(this.f16782a, customAccessibilityAction.f16782a) && this.f16783b == customAccessibilityAction.f16783b;
    }

    public final int hashCode() {
        return this.f16783b.hashCode() + (this.f16782a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomAccessibilityAction(label=" + this.f16782a + ", action=" + this.f16783b + ')';
    }
}

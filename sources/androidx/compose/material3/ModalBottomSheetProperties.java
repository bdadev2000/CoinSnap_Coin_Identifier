package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.window.SecureFlagPolicy;

@Immutable
@ExperimentalMaterial3Api
/* loaded from: classes3.dex */
public final class ModalBottomSheetProperties {

    /* renamed from: a, reason: collision with root package name */
    public final SecureFlagPolicy f9932a = SecureFlagPolicy.f17706a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9933b = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ModalBottomSheetProperties) {
            return this.f9932a == ((ModalBottomSheetProperties) obj).f9932a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9933b) + (this.f9932a.hashCode() * 31);
    }
}

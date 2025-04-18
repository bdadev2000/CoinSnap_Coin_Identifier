package androidx.compose.ui.modifier;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.internal.InlineClassHelperKt;

@StabilityInferred
/* loaded from: classes2.dex */
public final class SingleLocalMap extends ModifierLocalMap {

    /* renamed from: a, reason: collision with root package name */
    public final ModifierLocal f15870a;

    /* renamed from: b, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f15871b;

    public SingleLocalMap(ModifierLocal modifierLocal) {
        ParcelableSnapshotMutableState f2;
        this.f15870a = modifierLocal;
        f2 = SnapshotStateKt.f(null, StructuralEqualityPolicy.f14078a);
        this.f15871b = f2;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public final boolean a(ModifierLocal modifierLocal) {
        return modifierLocal == this.f15870a;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public final Object b(ProvidableModifierLocal providableModifierLocal) {
        if (!(providableModifierLocal == this.f15870a)) {
            InlineClassHelperKt.b("Check failed.");
            throw null;
        }
        Object value = this.f15871b.getValue();
        if (value == null) {
            return null;
        }
        return value;
    }

    public final void c(ModifierLocal modifierLocal, Object obj) {
        if (modifierLocal == this.f15870a) {
            this.f15871b.setValue(obj);
        } else {
            InlineClassHelperKt.b("Check failed.");
            throw null;
        }
    }
}

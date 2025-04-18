package androidx.compose.ui.input;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes3.dex */
public final class InputModeManagerImpl implements InputModeManager {

    /* renamed from: a, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f15499a;

    public InputModeManagerImpl(int i2) {
        ParcelableSnapshotMutableState f2;
        f2 = SnapshotStateKt.f(new InputMode(i2), StructuralEqualityPolicy.f14078a);
        this.f15499a = f2;
    }

    @Override // androidx.compose.ui.input.InputModeManager
    public final int a() {
        return ((InputMode) this.f15499a.getValue()).f15498a;
    }
}

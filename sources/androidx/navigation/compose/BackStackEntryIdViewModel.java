package androidx.navigation.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import java.lang.ref.WeakReference;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes4.dex */
public final class BackStackEntryIdViewModel extends ViewModel {

    /* renamed from: b, reason: collision with root package name */
    public final UUID f20527b;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f20528c;

    public BackStackEntryIdViewModel(@NotNull SavedStateHandle savedStateHandle) {
        UUID uuid = (UUID) savedStateHandle.b("SaveableStateHolder_BackStackEntryKey");
        if (uuid == null) {
            uuid = UUID.randomUUID();
            savedStateHandle.c(uuid, "SaveableStateHolder_BackStackEntryKey");
        }
        this.f20527b = uuid;
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        WeakReference weakReference = this.f20528c;
        if (weakReference == null) {
            p0.a.B0("saveableStateHolderRef");
            throw null;
        }
        SaveableStateHolder saveableStateHolder = (SaveableStateHolder) weakReference.get();
        if (saveableStateHolder != null) {
            saveableStateHolder.c(this.f20527b);
        }
        WeakReference weakReference2 = this.f20528c;
        if (weakReference2 != null) {
            weakReference2.clear();
        } else {
            p0.a.B0("saveableStateHolderRef");
            throw null;
        }
    }
}

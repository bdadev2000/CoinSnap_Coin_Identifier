package androidx.navigation;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

/* loaded from: classes3.dex */
public final class NavControllerViewModel$Companion$FACTORY$1 implements ViewModelProvider.Factory {
    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final ViewModel create(Class cls) {
        p0.a.s(cls, "modelClass");
        return new NavControllerViewModel();
    }
}

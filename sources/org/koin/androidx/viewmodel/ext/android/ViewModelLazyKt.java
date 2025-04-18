package org.koin.androidx.viewmodel.ext.android;

import androidx.activity.ComponentActivity;
import androidx.annotation.MainThread;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import b1.f0;
import d0.h;
import d0.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.context.GlobalContext;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import q0.a;
import x0.c;

/* loaded from: classes2.dex */
public final class ViewModelLazyKt {
    @MainThread
    @NotNull
    public static final <T extends ViewModel> h getLazyViewModelForClass(@NotNull c cVar, @NotNull ViewModelStoreOwner viewModelStoreOwner, @NotNull Scope scope, @Nullable Qualifier qualifier, @Nullable a aVar, @Nullable String str, @Nullable a aVar2) {
        p0.a.s(cVar, "clazz");
        p0.a.s(viewModelStoreOwner, "owner");
        p0.a.s(scope, "scope");
        return f0.s(i.f30133c, new ViewModelLazyKt$getLazyViewModelForClass$1(aVar, viewModelStoreOwner, cVar, viewModelStoreOwner.getViewModelStore(), str, qualifier, scope, aVar2));
    }

    public static /* synthetic */ h getLazyViewModelForClass$default(c cVar, ViewModelStoreOwner viewModelStoreOwner, Scope scope, Qualifier qualifier, a aVar, String str, a aVar2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            scope = GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope();
        }
        return getLazyViewModelForClass(cVar, viewModelStoreOwner, scope, (i2 & 8) != 0 ? null : qualifier, (i2 & 16) != 0 ? null : aVar, (i2 & 32) != 0 ? null : str, (i2 & 64) != 0 ? null : aVar2);
    }

    @MainThread
    @NotNull
    public static final <T extends ViewModel> h viewModelForClass(@NotNull ComponentActivity componentActivity, @NotNull c cVar, @Nullable Qualifier qualifier, @NotNull ViewModelStoreOwner viewModelStoreOwner, @Nullable a aVar, @Nullable String str, @Nullable a aVar2) {
        p0.a.s(componentActivity, "<this>");
        p0.a.s(cVar, "clazz");
        p0.a.s(viewModelStoreOwner, "owner");
        return f0.s(i.f30133c, new ViewModelLazyKt$viewModelForClass$1(aVar, viewModelStoreOwner, componentActivity, cVar, viewModelStoreOwner.getViewModelStore(), str, qualifier, aVar2));
    }

    @MainThread
    @NotNull
    public static final <T extends ViewModel> h viewModelForClass(@NotNull Fragment fragment, @NotNull c cVar, @Nullable Qualifier qualifier, @NotNull a aVar, @Nullable a aVar2, @Nullable String str, @Nullable a aVar3) {
        p0.a.s(fragment, "<this>");
        p0.a.s(cVar, "clazz");
        p0.a.s(aVar, "owner");
        return f0.s(i.f30133c, new ViewModelLazyKt$viewModelForClass$3(aVar, aVar2, fragment, cVar, str, qualifier, aVar3));
    }
}

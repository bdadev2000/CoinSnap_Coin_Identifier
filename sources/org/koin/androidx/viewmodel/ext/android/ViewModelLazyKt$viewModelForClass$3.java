package org.koin.androidx.viewmodel.ext.android;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import q0.a;
import x0.c;

/* loaded from: classes2.dex */
public final class ViewModelLazyKt$viewModelForClass$3 extends r implements a {
    final /* synthetic */ c $clazz;
    final /* synthetic */ String $key;
    final /* synthetic */ a $owner;
    final /* synthetic */ a $parameters;
    final /* synthetic */ Qualifier $qualifier;
    final /* synthetic */ a $state;
    final /* synthetic */ Fragment $this_viewModelForClass;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModelLazyKt$viewModelForClass$3(a aVar, a aVar2, Fragment fragment, c cVar, String str, Qualifier qualifier, a aVar3) {
        super(0);
        this.$owner = aVar;
        this.$state = aVar2;
        this.$this_viewModelForClass = fragment;
        this.$clazz = cVar;
        this.$key = str;
        this.$qualifier = qualifier;
        this.$parameters = aVar3;
    }

    /* JADX WARN: Incorrect return type in method signature: ()TT; */
    @Override // q0.a
    @NotNull
    public final ViewModel invoke() {
        CreationExtras creationExtras;
        Bundle bundle;
        ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.$owner.invoke();
        ViewModelStore viewModelStore = viewModelStoreOwner.getViewModelStore();
        a aVar = this.$state;
        if (aVar == null || (bundle = (Bundle) aVar.invoke()) == null || (creationExtras = BundleExtKt.toExtras(bundle, viewModelStoreOwner)) == null) {
            creationExtras = CreationExtras.Empty.f20236b;
        }
        return GetViewModelKt.resolveViewModel(this.$clazz, viewModelStore, this.$key, creationExtras, this.$qualifier, AndroidKoinScopeExtKt.getKoinScope(this.$this_viewModelForClass), this.$parameters);
    }
}

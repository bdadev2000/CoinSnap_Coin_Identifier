package org.koin.androidx.viewmodel.ext.android;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
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
public final class ViewModelLazyKt$viewModelForClass$1 extends r implements a {
    final /* synthetic */ c $clazz;
    final /* synthetic */ String $key;
    final /* synthetic */ ViewModelStoreOwner $owner;
    final /* synthetic */ a $parameters;
    final /* synthetic */ Qualifier $qualifier;
    final /* synthetic */ a $state;
    final /* synthetic */ ComponentActivity $this_viewModelForClass;
    final /* synthetic */ ViewModelStore $viewModelStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModelLazyKt$viewModelForClass$1(a aVar, ViewModelStoreOwner viewModelStoreOwner, ComponentActivity componentActivity, c cVar, ViewModelStore viewModelStore, String str, Qualifier qualifier, a aVar2) {
        super(0);
        this.$state = aVar;
        this.$owner = viewModelStoreOwner;
        this.$this_viewModelForClass = componentActivity;
        this.$clazz = cVar;
        this.$viewModelStore = viewModelStore;
        this.$key = str;
        this.$qualifier = qualifier;
        this.$parameters = aVar2;
    }

    /* JADX WARN: Incorrect return type in method signature: ()TT; */
    @Override // q0.a
    @NotNull
    public final ViewModel invoke() {
        CreationExtras creationExtras;
        Bundle bundle;
        a aVar = this.$state;
        if (aVar == null || (bundle = (Bundle) aVar.invoke()) == null || (creationExtras = BundleExtKt.toExtras(bundle, this.$owner)) == null) {
            creationExtras = CreationExtras.Empty.f20236b;
        }
        return GetViewModelKt.resolveViewModel(this.$clazz, this.$viewModelStore, this.$key, creationExtras, this.$qualifier, AndroidKoinScopeExtKt.getKoinScope(this.$this_viewModelForClass), this.$parameters);
    }
}

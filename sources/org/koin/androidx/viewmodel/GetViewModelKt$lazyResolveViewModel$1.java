package org.koin.androidx.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import q0.a;
import x0.c;

/* loaded from: classes3.dex */
public final class GetViewModelKt$lazyResolveViewModel$1 extends r implements a {
    final /* synthetic */ a $extras;
    final /* synthetic */ String $key;
    final /* synthetic */ a $parameters;
    final /* synthetic */ Qualifier $qualifier;
    final /* synthetic */ Scope $scope;
    final /* synthetic */ a $viewModelStore;
    final /* synthetic */ c $vmClass;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetViewModelKt$lazyResolveViewModel$1(c cVar, a aVar, String str, a aVar2, Qualifier qualifier, Scope scope, a aVar3) {
        super(0);
        this.$vmClass = cVar;
        this.$viewModelStore = aVar;
        this.$key = str;
        this.$extras = aVar2;
        this.$qualifier = qualifier;
        this.$scope = scope;
        this.$parameters = aVar3;
    }

    /* JADX WARN: Incorrect return type in method signature: ()TT; */
    @Override // q0.a
    @NotNull
    public final ViewModel invoke() {
        return GetViewModelKt.resolveViewModel(this.$vmClass, (ViewModelStore) this.$viewModelStore.invoke(), this.$key, (CreationExtras) this.$extras.invoke(), this.$qualifier, this.$scope, this.$parameters);
    }
}

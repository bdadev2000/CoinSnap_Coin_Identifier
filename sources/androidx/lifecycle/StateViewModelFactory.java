package androidx.lifecycle;

import androidx.lifecycle.ViewModel;
import org.koin.androidx.viewmodel.ViewModelParameter;
import org.koin.core.annotation.KoinInternalApi;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.scope.Scope;

@d0.a
@KoinInternalApi
/* loaded from: classes4.dex */
public final class StateViewModelFactory<T extends ViewModel> extends AbstractSavedStateViewModelFactory {
    public final Scope d;
    public final ViewModelParameter e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public StateViewModelFactory(org.koin.core.scope.Scope r3, org.koin.androidx.viewmodel.ViewModelParameter r4) {
        /*
            r2 = this;
            java.lang.String r0 = "scope"
            p0.a.s(r3, r0)
            java.lang.String r0 = "parameters"
            p0.a.s(r4, r0)
            androidx.savedstate.SavedStateRegistryOwner r0 = r4.getRegistryOwner()
            if (r0 == 0) goto L26
            q0.a r1 = r4.getState()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r1.invoke()
            android.os.Bundle r1 = (android.os.Bundle) r1
            goto L1e
        L1d:
            r1 = 0
        L1e:
            r2.<init>(r0, r1)
            r2.d = r3
            r2.e = r4
            return
        L26:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Can't create SavedStateViewModelFactory without a proper stateRegistryOwner"
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.StateViewModelFactory.<init>(org.koin.core.scope.Scope, org.koin.androidx.viewmodel.ViewModelParameter):void");
    }

    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    public final ViewModel b(String str, Class cls, SavedStateHandle savedStateHandle) {
        ParametersHolder emptyParametersHolder;
        p0.a.s(cls, "modelClass");
        p0.a.s(savedStateHandle, "handle");
        ViewModelParameter viewModelParameter = this.e;
        q0.a parameters = viewModelParameter.getParameters();
        if (parameters == null || (emptyParametersHolder = (ParametersHolder) parameters.invoke()) == null) {
            emptyParametersHolder = ParametersHolderKt.emptyParametersHolder();
        }
        return (ViewModel) this.d.get(viewModelParameter.getClazz(), viewModelParameter.getQualifier(), new StateViewModelFactory$addHandle$1(emptyParametersHolder, savedStateHandle));
    }
}

package androidx.lifecycle.viewmodel.internal;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import p0.a;
import x0.c;

/* loaded from: classes.dex */
public final class DefaultViewModelProviderFactory implements ViewModelProvider.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final DefaultViewModelProviderFactory f20243a = new Object();

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final ViewModel create(c cVar, CreationExtras creationExtras) {
        a.s(cVar, "modelClass");
        a.s(creationExtras, "extras");
        return JvmViewModelProviders.a(a.i0(cVar));
    }
}

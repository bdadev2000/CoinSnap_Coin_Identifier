package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.internal.ViewModelProviders;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.j;
import p0.a;
import x0.c;

/* loaded from: classes2.dex */
public final class ViewModelProviderImpl {

    /* renamed from: a, reason: collision with root package name */
    public final ViewModelStore f20237a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewModelProvider.Factory f20238b;

    /* renamed from: c, reason: collision with root package name */
    public final CreationExtras f20239c;

    public ViewModelProviderImpl(ViewModelStore viewModelStore, ViewModelProvider.Factory factory, CreationExtras creationExtras) {
        a.s(viewModelStore, "store");
        a.s(factory, "factory");
        a.s(creationExtras, "extras");
        this.f20237a = viewModelStore;
        this.f20238b = factory;
        this.f20239c = creationExtras;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ViewModel a(String str, c cVar) {
        ViewModel create;
        a.s(cVar, "modelClass");
        a.s(str, SDKConstants.PARAM_KEY);
        ViewModelStore viewModelStore = this.f20237a;
        viewModelStore.getClass();
        LinkedHashMap linkedHashMap = viewModelStore.f20129a;
        ViewModel viewModel = (ViewModel) linkedHashMap.get(str);
        boolean d = ((j) cVar).d(viewModel);
        ViewModelProvider.Factory factory = this.f20238b;
        if (d) {
            if (factory instanceof ViewModelProvider.OnRequeryFactory) {
                a.p(viewModel);
                ((ViewModelProvider.OnRequeryFactory) factory).a(viewModel);
            }
            a.q(viewModel, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
            return viewModel;
        }
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(this.f20239c);
        mutableCreationExtras.f20235a.put(ViewModelProviders.ViewModelKey.f20247a, str);
        a.s(factory, "factory");
        try {
            try {
                create = factory.create(cVar, mutableCreationExtras);
            } catch (AbstractMethodError unused) {
                create = factory.create(a.i0(cVar));
            }
        } catch (AbstractMethodError unused2) {
            create = factory.create(a.i0(cVar), mutableCreationExtras);
        }
        a.s(create, "viewModel");
        ViewModel viewModel2 = (ViewModel) linkedHashMap.put(str, create);
        if (viewModel2 != null) {
            viewModel2.clear$lifecycle_viewmodel_release();
        }
        return create;
    }
}

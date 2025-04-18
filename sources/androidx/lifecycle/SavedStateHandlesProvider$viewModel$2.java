package androidx.lifecycle;

import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
final class SavedStateHandlesProvider$viewModel$2 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewModelStoreOwner f20104a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavedStateHandlesProvider$viewModel$2(ViewModelStoreOwner viewModelStoreOwner) {
        super(0);
        this.f20104a = viewModelStoreOwner;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.lifecycle.ViewModelProvider$Factory, java.lang.Object] */
    @Override // q0.a
    public final Object invoke() {
        ViewModelStoreOwner viewModelStoreOwner = this.f20104a;
        p0.a.s(viewModelStoreOwner, "<this>");
        return (SavedStateHandlesVM) new ViewModelProvider(viewModelStoreOwner, (ViewModelProvider.Factory) new Object()).b(SavedStateHandlesVM.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}

package G6;

import androidx.fragment.app.Fragment;

/* loaded from: classes3.dex */
public final class m extends G7.k implements F7.a {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Fragment f1315c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i9, Fragment fragment) {
        super(0);
        this.b = i9;
        this.f1315c = fragment;
    }

    @Override // F7.a
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return this.f1315c.requireActivity().getViewModelStore();
            case 1:
                return this.f1315c.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return this.f1315c.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}

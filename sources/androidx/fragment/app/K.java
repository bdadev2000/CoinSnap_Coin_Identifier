package androidx.fragment.app;

import T.InterfaceC0278k;
import T.InterfaceC0286q;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.AbstractC0505o;

/* loaded from: classes.dex */
public final class K extends Q implements I.n, I.o, androidx.core.app.j0, androidx.core.app.k0, androidx.lifecycle.g0, f.y, h.j, G0.g, s0, InterfaceC0278k {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f4663g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        this.f4663g = fragmentActivity;
    }

    @Override // androidx.fragment.app.s0
    public final void a(Fragment fragment) {
        this.f4663g.onAttachFragment(fragment);
    }

    @Override // T.InterfaceC0278k
    public final void addMenuProvider(InterfaceC0286q interfaceC0286q) {
        this.f4663g.addMenuProvider(interfaceC0286q);
    }

    @Override // I.n
    public final void addOnConfigurationChangedListener(S.a aVar) {
        this.f4663g.addOnConfigurationChangedListener(aVar);
    }

    @Override // androidx.core.app.j0
    public final void addOnMultiWindowModeChangedListener(S.a aVar) {
        this.f4663g.addOnMultiWindowModeChangedListener(aVar);
    }

    @Override // androidx.core.app.k0
    public final void addOnPictureInPictureModeChangedListener(S.a aVar) {
        this.f4663g.addOnPictureInPictureModeChangedListener(aVar);
    }

    @Override // I.o
    public final void addOnTrimMemoryListener(S.a aVar) {
        this.f4663g.addOnTrimMemoryListener(aVar);
    }

    @Override // androidx.fragment.app.N
    public final View b(int i9) {
        return this.f4663g.findViewById(i9);
    }

    @Override // androidx.fragment.app.N
    public final boolean c() {
        Window window = this.f4663g.getWindow();
        if (window != null && window.peekDecorView() != null) {
            return true;
        }
        return false;
    }

    @Override // h.j
    public final h.i getActivityResultRegistry() {
        return this.f4663g.getActivityResultRegistry();
    }

    @Override // androidx.lifecycle.InterfaceC0511v
    public final AbstractC0505o getLifecycle() {
        return this.f4663g.mFragmentLifecycleRegistry;
    }

    @Override // f.y
    public final f.x getOnBackPressedDispatcher() {
        return this.f4663g.getOnBackPressedDispatcher();
    }

    @Override // G0.g
    public final G0.e getSavedStateRegistry() {
        return this.f4663g.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.g0
    public final androidx.lifecycle.f0 getViewModelStore() {
        return this.f4663g.getViewModelStore();
    }

    @Override // T.InterfaceC0278k
    public final void removeMenuProvider(InterfaceC0286q interfaceC0286q) {
        this.f4663g.removeMenuProvider(interfaceC0286q);
    }

    @Override // I.n
    public final void removeOnConfigurationChangedListener(S.a aVar) {
        this.f4663g.removeOnConfigurationChangedListener(aVar);
    }

    @Override // androidx.core.app.j0
    public final void removeOnMultiWindowModeChangedListener(S.a aVar) {
        this.f4663g.removeOnMultiWindowModeChangedListener(aVar);
    }

    @Override // androidx.core.app.k0
    public final void removeOnPictureInPictureModeChangedListener(S.a aVar) {
        this.f4663g.removeOnPictureInPictureModeChangedListener(aVar);
    }

    @Override // I.o
    public final void removeOnTrimMemoryListener(S.a aVar) {
        this.f4663g.removeOnTrimMemoryListener(aVar);
    }
}

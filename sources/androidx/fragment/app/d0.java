package androidx.fragment.app;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class d0 extends i0 implements d0.m, d0.n, androidx.core.app.p1, androidx.core.app.q1, androidx.lifecycle.e1, androidx.activity.a0, androidx.activity.result.h, y1.f, h1, n0.m {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f1606g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        this.f1606g = fragmentActivity;
    }

    @Override // androidx.fragment.app.h1
    public final void a(Fragment fragment) {
        this.f1606g.onAttachFragment(fragment);
    }

    @Override // n0.m
    public final void addMenuProvider(n0.s sVar) {
        this.f1606g.addMenuProvider(sVar);
    }

    @Override // d0.m
    public final void addOnConfigurationChangedListener(m0.a aVar) {
        this.f1606g.addOnConfigurationChangedListener(aVar);
    }

    @Override // androidx.core.app.p1
    public final void addOnMultiWindowModeChangedListener(m0.a aVar) {
        this.f1606g.addOnMultiWindowModeChangedListener(aVar);
    }

    @Override // androidx.core.app.q1
    public final void addOnPictureInPictureModeChangedListener(m0.a aVar) {
        this.f1606g.addOnPictureInPictureModeChangedListener(aVar);
    }

    @Override // d0.n
    public final void addOnTrimMemoryListener(m0.a aVar) {
        this.f1606g.addOnTrimMemoryListener(aVar);
    }

    @Override // androidx.fragment.app.f0
    public final View b(int i10) {
        return this.f1606g.findViewById(i10);
    }

    @Override // androidx.fragment.app.f0
    public final boolean c() {
        Window window = this.f1606g.getWindow();
        if (window != null && window.peekDecorView() != null) {
            return true;
        }
        return false;
    }

    @Override // androidx.activity.result.h
    public final androidx.activity.result.g getActivityResultRegistry() {
        return this.f1606g.getActivityResultRegistry();
    }

    @Override // androidx.lifecycle.v
    public final androidx.lifecycle.p getLifecycle() {
        return this.f1606g.mFragmentLifecycleRegistry;
    }

    @Override // androidx.activity.a0
    public final androidx.activity.z getOnBackPressedDispatcher() {
        return this.f1606g.getOnBackPressedDispatcher();
    }

    @Override // y1.f
    public final y1.d getSavedStateRegistry() {
        return this.f1606g.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.e1
    public final androidx.lifecycle.d1 getViewModelStore() {
        return this.f1606g.getViewModelStore();
    }

    @Override // n0.m
    public final void removeMenuProvider(n0.s sVar) {
        this.f1606g.removeMenuProvider(sVar);
    }

    @Override // d0.m
    public final void removeOnConfigurationChangedListener(m0.a aVar) {
        this.f1606g.removeOnConfigurationChangedListener(aVar);
    }

    @Override // androidx.core.app.p1
    public final void removeOnMultiWindowModeChangedListener(m0.a aVar) {
        this.f1606g.removeOnMultiWindowModeChangedListener(aVar);
    }

    @Override // androidx.core.app.q1
    public final void removeOnPictureInPictureModeChangedListener(m0.a aVar) {
        this.f1606g.removeOnPictureInPictureModeChangedListener(aVar);
    }

    @Override // d0.n
    public final void removeOnTrimMemoryListener(m0.a aVar) {
        this.f1606g.removeOnTrimMemoryListener(aVar);
    }
}

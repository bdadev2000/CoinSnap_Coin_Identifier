package androidx.compose.runtime;

import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class DisposableEffectImpl implements RememberObserver {

    /* renamed from: a, reason: collision with root package name */
    public final l f13793a;

    /* renamed from: b, reason: collision with root package name */
    public DisposableEffectResult f13794b;

    public DisposableEffectImpl(l lVar) {
        this.f13793a = lVar;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        DisposableEffectResult disposableEffectResult = this.f13794b;
        if (disposableEffectResult != null) {
            disposableEffectResult.dispose();
        }
        this.f13794b = null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
        this.f13794b = (DisposableEffectResult) this.f13793a.invoke(EffectsKt.f13797a);
    }
}

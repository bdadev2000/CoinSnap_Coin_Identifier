package androidx.lifecycle.compose;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LifecycleEffectKt$LifecycleResumeEffectImpl$1$1;
import androidx.lifecycle.compose.LifecycleEffectKt$LifecycleStartEffectImpl$1$1;
import kotlin.jvm.internal.f0;
import q0.l;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements LifecycleEventObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20230a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f20231b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f20232c;
    public final /* synthetic */ LifecycleOwner d;

    public /* synthetic */ b(LifecycleOwner lifecycleOwner, f0 f0Var, l lVar, int i2) {
        this.f20230a = i2;
        this.d = lifecycleOwner;
        this.f20231b = f0Var;
        this.f20232c = lVar;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void c(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int i2 = this.f20230a;
        l lVar = this.f20232c;
        f0 f0Var = this.f20231b;
        LifecycleOwner lifecycleOwner2 = this.d;
        switch (i2) {
            case 0:
                LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope = (LifecycleResumePauseEffectScope) lifecycleOwner2;
                int i3 = LifecycleEffectKt$LifecycleResumeEffectImpl$1$1.WhenMappings.f20191a[event.ordinal()];
                if (i3 == 1) {
                    f0Var.f30930a = lVar.invoke(lifecycleResumePauseEffectScope);
                    return;
                } else {
                    if (i3 != 2) {
                        return;
                    }
                    LifecyclePauseOrDisposeEffectResult lifecyclePauseOrDisposeEffectResult = (LifecyclePauseOrDisposeEffectResult) f0Var.f30930a;
                    if (lifecyclePauseOrDisposeEffectResult != null) {
                        lifecyclePauseOrDisposeEffectResult.a();
                    }
                    f0Var.f30930a = null;
                    return;
                }
            default:
                LifecycleStartStopEffectScope lifecycleStartStopEffectScope = (LifecycleStartStopEffectScope) lifecycleOwner2;
                int i4 = LifecycleEffectKt$LifecycleStartEffectImpl$1$1.WhenMappings.f20220a[event.ordinal()];
                if (i4 == 1) {
                    f0Var.f30930a = lVar.invoke(lifecycleStartStopEffectScope);
                    return;
                } else {
                    if (i4 != 2) {
                        return;
                    }
                    LifecycleStopOrDisposeEffectResult lifecycleStopOrDisposeEffectResult = (LifecycleStopOrDisposeEffectResult) f0Var.f30930a;
                    if (lifecycleStopOrDisposeEffectResult != null) {
                        lifecycleStopOrDisposeEffectResult.a();
                    }
                    f0Var.f30930a = null;
                    return;
                }
        }
    }
}

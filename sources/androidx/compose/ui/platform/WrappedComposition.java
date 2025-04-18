package androidx.compose.ui.platform;

import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionImpl;
import androidx.compose.runtime.CompositionServices;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.cooldev.gba.emulator.gameboy.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class WrappedComposition implements Composition, LifecycleEventObserver, CompositionServices {

    /* renamed from: a, reason: collision with root package name */
    public final AndroidComposeView f16686a;

    /* renamed from: b, reason: collision with root package name */
    public final Composition f16687b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16688c;
    public Lifecycle d;

    /* renamed from: f, reason: collision with root package name */
    public q0.p f16689f = ComposableSingletons$Wrapper_androidKt.f16425a;

    public WrappedComposition(AndroidComposeView androidComposeView, CompositionImpl compositionImpl) {
        this.f16686a = androidComposeView;
        this.f16687b = compositionImpl;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void c(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            dispose();
        } else {
            if (event != Lifecycle.Event.ON_CREATE || this.f16688c) {
                return;
            }
            d(this.f16689f);
        }
    }

    @Override // androidx.compose.runtime.Composition
    public final void d(q0.p pVar) {
        this.f16686a.setOnViewTreeOwnersAvailable(new WrappedComposition$setContent$1(this, pVar));
    }

    @Override // androidx.compose.runtime.Composition
    public final void dispose() {
        if (!this.f16688c) {
            this.f16688c = true;
            this.f16686a.getView().setTag(R.id.wrapped_composition_tag, null);
            Lifecycle lifecycle = this.d;
            if (lifecycle != null) {
                lifecycle.d(this);
            }
        }
        this.f16687b.dispose();
    }
}

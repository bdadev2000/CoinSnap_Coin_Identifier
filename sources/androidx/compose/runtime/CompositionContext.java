package androidx.compose.runtime;

import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import h0.l;
import java.util.Set;

@StabilityInferred
/* loaded from: classes3.dex */
public abstract class CompositionContext {
    public abstract void a(ControlledComposition controlledComposition, ComposableLambdaImpl composableLambdaImpl);

    public abstract void b(MovableContentStateReference movableContentStateReference);

    public void c() {
    }

    public abstract boolean d();

    public abstract boolean e();

    public abstract boolean f();

    public PersistentCompositionLocalMap g() {
        return CompositionContextKt.f13732a;
    }

    public abstract int h();

    public abstract l i();

    public CompositionObserverHolder j() {
        return null;
    }

    public abstract l k();

    public abstract void l(MovableContentStateReference movableContentStateReference);

    public abstract void m(ControlledComposition controlledComposition);

    public abstract void n(MovableContentStateReference movableContentStateReference, MovableContentState movableContentState);

    public MovableContentState o(MovableContentStateReference movableContentStateReference) {
        return null;
    }

    public void p(Set set) {
    }

    public void q(ComposerImpl composerImpl) {
    }

    public abstract void r(ControlledComposition controlledComposition);

    public void s() {
    }

    public void t(ComposerImpl composerImpl) {
    }

    public abstract void u(ControlledComposition controlledComposition);
}

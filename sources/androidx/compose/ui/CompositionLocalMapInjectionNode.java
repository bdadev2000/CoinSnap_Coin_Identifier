package androidx.compose.ui;

import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;

@StabilityInferred
/* loaded from: classes.dex */
public final class CompositionLocalMapInjectionNode extends Modifier.Node {

    /* renamed from: o, reason: collision with root package name */
    public CompositionLocalMap f14686o;

    @Override // androidx.compose.ui.Modifier.Node
    public final void W1() {
        DelegatableNodeKt.f(this).l(this.f14686o);
    }
}

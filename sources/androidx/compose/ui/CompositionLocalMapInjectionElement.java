package androidx.compose.ui;

import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import p0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class CompositionLocalMapInjectionElement extends ModifierNodeElement<CompositionLocalMapInjectionNode> {

    /* renamed from: a, reason: collision with root package name */
    public final CompositionLocalMap f14685a;

    public CompositionLocalMapInjectionElement(CompositionLocalMap compositionLocalMap) {
        this.f14685a = compositionLocalMap;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.CompositionLocalMapInjectionNode, androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? node = new Modifier.Node();
        node.f14686o = this.f14685a;
        return node;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        CompositionLocalMapInjectionNode compositionLocalMapInjectionNode = (CompositionLocalMapInjectionNode) node;
        CompositionLocalMap compositionLocalMap = this.f14685a;
        compositionLocalMapInjectionNode.f14686o = compositionLocalMap;
        DelegatableNodeKt.f(compositionLocalMapInjectionNode).l(compositionLocalMap);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof CompositionLocalMapInjectionElement) && a.g(((CompositionLocalMapInjectionElement) obj).f14685a, this.f14685a);
    }

    public final int hashCode() {
        return this.f14685a.hashCode();
    }
}

package androidx.compose.ui;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;

@StabilityInferred
/* loaded from: classes2.dex */
public final class ZIndexElement extends ModifierNodeElement<ZIndexNode> {

    /* renamed from: a, reason: collision with root package name */
    public final float f14708a;

    public ZIndexElement(float f2) {
        this.f14708a = f2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.ZIndexNode, androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? node = new Modifier.Node();
        node.f14709o = this.f14708a;
        return node;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        ((ZIndexNode) node).f14709o = this.f14708a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZIndexElement) && Float.compare(this.f14708a, ((ZIndexElement) obj).f14708a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f14708a);
    }

    public final String toString() {
        return d.n(new StringBuilder("ZIndexElement(zIndex="), this.f14708a, ')');
    }
}

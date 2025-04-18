package androidx.compose.foundation.layout;

import android.support.v4.media.d;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import q0.l;

/* loaded from: classes3.dex */
final class OffsetPxElement extends ModifierNodeElement<OffsetPxNode> {

    /* renamed from: a, reason: collision with root package name */
    public final l f4055a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4056b = true;

    public OffsetPxElement(l lVar) {
        this.f4055a = lVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.layout.OffsetPxNode, androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? node = new Modifier.Node();
        node.f4057o = this.f4055a;
        node.f4058p = this.f4056b;
        return node;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        OffsetPxNode offsetPxNode = (OffsetPxNode) node;
        offsetPxNode.f4057o = this.f4055a;
        offsetPxNode.f4058p = this.f4056b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetPxElement offsetPxElement = obj instanceof OffsetPxElement ? (OffsetPxElement) obj : null;
        if (offsetPxElement == null) {
            return false;
        }
        return this.f4055a == offsetPxElement.f4055a && this.f4056b == offsetPxElement.f4056b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4056b) + (this.f4055a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OffsetPxModifier(offset=");
        sb.append(this.f4055a);
        sb.append(", rtlAware=");
        return d.s(sb, this.f4056b, ')');
    }
}

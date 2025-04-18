package androidx.compose.foundation.layout;

import android.support.v4.media.d;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class WrapContentElement extends ModifierNodeElement<WrapContentNode> {

    /* renamed from: a, reason: collision with root package name */
    public final Direction f4225a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4226b;

    /* renamed from: c, reason: collision with root package name */
    public final p f4227c;
    public final Object d;

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    public WrapContentElement(Direction direction, boolean z2, p pVar, Object obj) {
        this.f4225a = direction;
        this.f4226b = z2;
        this.f4227c = pVar;
        this.d = obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.layout.WrapContentNode, androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? node = new Modifier.Node();
        node.f4231o = this.f4225a;
        node.f4232p = this.f4226b;
        node.f4233q = this.f4227c;
        return node;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        WrapContentNode wrapContentNode = (WrapContentNode) node;
        wrapContentNode.f4231o = this.f4225a;
        wrapContentNode.f4232p = this.f4226b;
        wrapContentNode.f4233q = this.f4227c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WrapContentElement.class != obj.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        return this.f4225a == wrapContentElement.f4225a && this.f4226b == wrapContentElement.f4226b && p0.a.g(this.d, wrapContentElement.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + d.g(this.f4226b, this.f4225a.hashCode() * 31, 31);
    }
}

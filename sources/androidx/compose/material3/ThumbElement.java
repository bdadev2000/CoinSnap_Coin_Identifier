package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ThumbElement extends ModifierNodeElement<ThumbNode> {

    /* renamed from: a, reason: collision with root package name */
    public final InteractionSource f12288a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12289b;

    public ThumbElement(InteractionSource interactionSource, boolean z2) {
        this.f12288a = interactionSource;
        this.f12289b = z2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.material3.ThumbNode, androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? node = new Modifier.Node();
        node.f12290o = this.f12288a;
        node.f12291p = this.f12289b;
        node.f12295t = Float.NaN;
        node.f12296u = Float.NaN;
        return node;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        ThumbNode thumbNode = (ThumbNode) node;
        thumbNode.f12290o = this.f12288a;
        boolean z2 = thumbNode.f12291p;
        boolean z3 = this.f12289b;
        if (z2 != z3) {
            DelegatableNodeKt.f(thumbNode).J();
        }
        thumbNode.f12291p = z3;
        if (thumbNode.f12294s == null && !Float.isNaN(thumbNode.f12296u)) {
            thumbNode.f12294s = AnimatableKt.a(thumbNode.f12296u);
        }
        if (thumbNode.f12293r != null || Float.isNaN(thumbNode.f12295t)) {
            return;
        }
        thumbNode.f12293r = AnimatableKt.a(thumbNode.f12295t);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThumbElement)) {
            return false;
        }
        ThumbElement thumbElement = (ThumbElement) obj;
        return p0.a.g(this.f12288a, thumbElement.f12288a) && this.f12289b == thumbElement.f12289b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f12289b) + (this.f12288a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ThumbElement(interactionSource=");
        sb.append(this.f12288a);
        sb.append(", checked=");
        return d.s(sb, this.f12289b, ')');
    }
}

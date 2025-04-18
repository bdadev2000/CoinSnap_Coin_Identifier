package androidx.compose.foundation.layout;

import android.support.v4.media.d;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.unit.Dp;

/* loaded from: classes2.dex */
final class OffsetElement extends ModifierNodeElement<OffsetNode> {

    /* renamed from: a, reason: collision with root package name */
    public final float f4046a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4047b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4048c = true;

    public OffsetElement(float f2, float f3) {
        this.f4046a = f2;
        this.f4047b = f3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.layout.OffsetNode, androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? node = new Modifier.Node();
        node.f4049o = this.f4046a;
        node.f4050p = this.f4047b;
        node.f4051q = this.f4048c;
        return node;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        OffsetNode offsetNode = (OffsetNode) node;
        offsetNode.f4049o = this.f4046a;
        offsetNode.f4050p = this.f4047b;
        offsetNode.f4051q = this.f4048c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetElement offsetElement = obj instanceof OffsetElement ? (OffsetElement) obj : null;
        if (offsetElement == null) {
            return false;
        }
        return Dp.a(this.f4046a, offsetElement.f4046a) && Dp.a(this.f4047b, offsetElement.f4047b) && this.f4048c == offsetElement.f4048c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4048c) + d.b(this.f4047b, Float.hashCode(this.f4046a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OffsetModifierElement(x=");
        sb.append((Object) Dp.b(this.f4046a));
        sb.append(", y=");
        sb.append((Object) Dp.b(this.f4047b));
        sb.append(", rtlAware=");
        return d.s(sb, this.f4048c, ')');
    }
}

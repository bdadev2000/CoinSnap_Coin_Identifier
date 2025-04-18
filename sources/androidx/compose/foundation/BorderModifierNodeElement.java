package androidx.compose.foundation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawModifierNode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.unit.Dp;
import p0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class BorderModifierNodeElement extends ModifierNodeElement<BorderModifierNode> {

    /* renamed from: a, reason: collision with root package name */
    public final float f2605a;

    /* renamed from: b, reason: collision with root package name */
    public final Brush f2606b;

    /* renamed from: c, reason: collision with root package name */
    public final Shape f2607c;

    public BorderModifierNodeElement(float f2, Brush brush, Shape shape) {
        this.f2605a = f2;
        this.f2606b = brush;
        this.f2607c = shape;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new BorderModifierNode(this.f2605a, this.f2606b, this.f2607c);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        BorderModifierNode borderModifierNode = (BorderModifierNode) node;
        float f2 = borderModifierNode.f2586r;
        float f3 = this.f2605a;
        boolean a2 = Dp.a(f2, f3);
        CacheDrawModifierNode cacheDrawModifierNode = borderModifierNode.f2589u;
        if (!a2) {
            borderModifierNode.f2586r = f3;
            cacheDrawModifierNode.V0();
        }
        Brush brush = borderModifierNode.f2587s;
        Brush brush2 = this.f2606b;
        if (!a.g(brush, brush2)) {
            borderModifierNode.f2587s = brush2;
            cacheDrawModifierNode.V0();
        }
        Shape shape = borderModifierNode.f2588t;
        Shape shape2 = this.f2607c;
        if (a.g(shape, shape2)) {
            return;
        }
        borderModifierNode.f2588t = shape2;
        cacheDrawModifierNode.V0();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return Dp.a(this.f2605a, borderModifierNodeElement.f2605a) && a.g(this.f2606b, borderModifierNodeElement.f2606b) && a.g(this.f2607c, borderModifierNodeElement.f2607c);
    }

    public final int hashCode() {
        return this.f2607c.hashCode() + ((this.f2606b.hashCode() + (Float.hashCode(this.f2605a) * 31)) * 31);
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) Dp.b(this.f2605a)) + ", brush=" + this.f2606b + ", shape=" + this.f2607c + ')';
    }
}

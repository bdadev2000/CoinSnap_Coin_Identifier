package androidx.compose.foundation.layout;

import android.support.v4.media.d;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.unit.Dp;

/* loaded from: classes2.dex */
final class PaddingElement extends ModifierNodeElement<PaddingNode> {

    /* renamed from: a, reason: collision with root package name */
    public final float f4062a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4063b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4064c;
    public final float d;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4065f = true;

    public PaddingElement(float f2, float f3, float f4, float f5) {
        this.f4062a = f2;
        this.f4063b = f3;
        this.f4064c = f4;
        this.d = f5;
        if ((f2 < 0.0f && !Dp.a(f2, Float.NaN)) || ((f3 < 0.0f && !Dp.a(f3, Float.NaN)) || ((f4 < 0.0f && !Dp.a(f4, Float.NaN)) || (f5 < 0.0f && !Dp.a(f5, Float.NaN))))) {
            throw new IllegalArgumentException("Padding must be non-negative".toString());
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.layout.PaddingNode, androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? node = new Modifier.Node();
        node.f4066o = this.f4062a;
        node.f4067p = this.f4063b;
        node.f4068q = this.f4064c;
        node.f4069r = this.d;
        node.f4070s = this.f4065f;
        return node;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        PaddingNode paddingNode = (PaddingNode) node;
        paddingNode.f4066o = this.f4062a;
        paddingNode.f4067p = this.f4063b;
        paddingNode.f4068q = this.f4064c;
        paddingNode.f4069r = this.d;
        paddingNode.f4070s = this.f4065f;
    }

    public final boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && Dp.a(this.f4062a, paddingElement.f4062a) && Dp.a(this.f4063b, paddingElement.f4063b) && Dp.a(this.f4064c, paddingElement.f4064c) && Dp.a(this.d, paddingElement.d) && this.f4065f == paddingElement.f4065f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4065f) + d.b(this.d, d.b(this.f4064c, d.b(this.f4063b, Float.hashCode(this.f4062a) * 31, 31), 31), 31);
    }
}

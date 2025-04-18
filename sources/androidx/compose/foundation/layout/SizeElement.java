package androidx.compose.foundation.layout;

import android.support.v4.media.d;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.unit.Dp;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class SizeElement extends ModifierNodeElement<SizeNode> {

    /* renamed from: a, reason: collision with root package name */
    public final float f4101a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4102b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4103c;
    public final float d;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4104f;

    public /* synthetic */ SizeElement(float f2, float f3, float f4, float f5, boolean z2, int i2) {
        this((i2 & 1) != 0 ? Float.NaN : f2, (i2 & 2) != 0 ? Float.NaN : f3, (i2 & 4) != 0 ? Float.NaN : f4, (i2 & 8) != 0 ? Float.NaN : f5, z2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.layout.SizeNode, androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? node = new Modifier.Node();
        node.f4112o = this.f4101a;
        node.f4113p = this.f4102b;
        node.f4114q = this.f4103c;
        node.f4115r = this.d;
        node.f4116s = this.f4104f;
        return node;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        SizeNode sizeNode = (SizeNode) node;
        sizeNode.f4112o = this.f4101a;
        sizeNode.f4113p = this.f4102b;
        sizeNode.f4114q = this.f4103c;
        sizeNode.f4115r = this.d;
        sizeNode.f4116s = this.f4104f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return Dp.a(this.f4101a, sizeElement.f4101a) && Dp.a(this.f4102b, sizeElement.f4102b) && Dp.a(this.f4103c, sizeElement.f4103c) && Dp.a(this.d, sizeElement.d) && this.f4104f == sizeElement.f4104f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4104f) + d.b(this.d, d.b(this.f4103c, d.b(this.f4102b, Float.hashCode(this.f4101a) * 31, 31), 31), 31);
    }

    public SizeElement(float f2, float f3, float f4, float f5, boolean z2) {
        this.f4101a = f2;
        this.f4102b = f3;
        this.f4103c = f4;
        this.d = f5;
        this.f4104f = z2;
    }
}

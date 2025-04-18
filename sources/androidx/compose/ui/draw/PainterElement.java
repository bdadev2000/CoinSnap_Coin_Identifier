package androidx.compose.ui.draw;

import android.support.v4.media.d;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import p0.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class PainterElement extends ModifierNodeElement<PainterNode> {

    /* renamed from: a, reason: collision with root package name */
    public final Painter f14808a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f14809b;

    /* renamed from: c, reason: collision with root package name */
    public final Alignment f14810c;
    public final ContentScale d;

    /* renamed from: f, reason: collision with root package name */
    public final float f14811f;

    /* renamed from: g, reason: collision with root package name */
    public final ColorFilter f14812g;

    public PainterElement(Painter painter, boolean z2, Alignment alignment, ContentScale contentScale, float f2, ColorFilter colorFilter) {
        this.f14808a = painter;
        this.f14809b = z2;
        this.f14810c = alignment;
        this.d = contentScale;
        this.f14811f = f2;
        this.f14812g = colorFilter;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.draw.PainterNode, androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? node = new Modifier.Node();
        node.f14813o = this.f14808a;
        node.f14814p = this.f14809b;
        node.f14815q = this.f14810c;
        node.f14816r = this.d;
        node.f14817s = this.f14811f;
        node.f14818t = this.f14812g;
        return node;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        PainterNode painterNode = (PainterNode) node;
        boolean z2 = painterNode.f14814p;
        Painter painter = this.f14808a;
        boolean z3 = this.f14809b;
        boolean z4 = z2 != z3 || (z3 && !Size.a(painterNode.f14813o.mo2getIntrinsicSizeNHjbRc(), painter.mo2getIntrinsicSizeNHjbRc()));
        painterNode.f14813o = painter;
        painterNode.f14814p = z3;
        painterNode.f14815q = this.f14810c;
        painterNode.f14816r = this.d;
        painterNode.f14817s = this.f14811f;
        painterNode.f14818t = this.f14812g;
        if (z4) {
            DelegatableNodeKt.f(painterNode).J();
        }
        DrawModifierNodeKt.a(painterNode);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return a.g(this.f14808a, painterElement.f14808a) && this.f14809b == painterElement.f14809b && a.g(this.f14810c, painterElement.f14810c) && a.g(this.d, painterElement.d) && Float.compare(this.f14811f, painterElement.f14811f) == 0 && a.g(this.f14812g, painterElement.f14812g);
    }

    public final int hashCode() {
        int b2 = d.b(this.f14811f, (this.d.hashCode() + ((this.f14810c.hashCode() + d.g(this.f14809b, this.f14808a.hashCode() * 31, 31)) * 31)) * 31, 31);
        ColorFilter colorFilter = this.f14812g;
        return b2 + (colorFilter == null ? 0 : colorFilter.hashCode());
    }

    public final String toString() {
        return "PainterElement(painter=" + this.f14808a + ", sizeToIntrinsics=" + this.f14809b + ", alignment=" + this.f14810c + ", contentScale=" + this.d + ", alpha=" + this.f14811f + ", colorFilter=" + this.f14812g + ')';
    }
}

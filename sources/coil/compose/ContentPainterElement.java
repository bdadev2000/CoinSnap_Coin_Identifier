package coil.compose;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import g.b0;
import p0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class ContentPainterElement extends ModifierNodeElement<b0> {

    /* renamed from: a, reason: collision with root package name */
    public final Painter f22413a;

    /* renamed from: b, reason: collision with root package name */
    public final Alignment f22414b;

    /* renamed from: c, reason: collision with root package name */
    public final ContentScale f22415c;
    public final float d;

    /* renamed from: f, reason: collision with root package name */
    public final ColorFilter f22416f;

    public ContentPainterElement(Painter painter, Alignment alignment, ContentScale contentScale, float f2, ColorFilter colorFilter) {
        this.f22413a = painter;
        this.f22414b = alignment;
        this.f22415c = contentScale;
        this.d = f2;
        this.f22416f = colorFilter;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [g.b0, androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? node = new Modifier.Node();
        node.f30518o = this.f22413a;
        node.f30519p = this.f22414b;
        node.f30520q = this.f22415c;
        node.f30521r = this.d;
        node.f30522s = this.f22416f;
        return node;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        b0 b0Var = (b0) node;
        long mo2getIntrinsicSizeNHjbRc = b0Var.f30518o.mo2getIntrinsicSizeNHjbRc();
        Painter painter = this.f22413a;
        boolean z2 = !Size.a(mo2getIntrinsicSizeNHjbRc, painter.mo2getIntrinsicSizeNHjbRc());
        b0Var.f30518o = painter;
        b0Var.f30519p = this.f22414b;
        b0Var.f30520q = this.f22415c;
        b0Var.f30521r = this.d;
        b0Var.f30522s = this.f22416f;
        if (z2) {
            DelegatableNodeKt.f(b0Var).J();
        }
        DrawModifierNodeKt.a(b0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentPainterElement)) {
            return false;
        }
        ContentPainterElement contentPainterElement = (ContentPainterElement) obj;
        return a.g(this.f22413a, contentPainterElement.f22413a) && a.g(this.f22414b, contentPainterElement.f22414b) && a.g(this.f22415c, contentPainterElement.f22415c) && Float.compare(this.d, contentPainterElement.d) == 0 && a.g(this.f22416f, contentPainterElement.f22416f);
    }

    public final int hashCode() {
        int b2 = d.b(this.d, (this.f22415c.hashCode() + ((this.f22414b.hashCode() + (this.f22413a.hashCode() * 31)) * 31)) * 31, 31);
        ColorFilter colorFilter = this.f22416f;
        return b2 + (colorFilter == null ? 0 : colorFilter.hashCode());
    }

    public final String toString() {
        return "ContentPainterElement(painter=" + this.f22413a + ", alignment=" + this.f22414b + ", contentScale=" + this.f22415c + ", alpha=" + this.d + ", colorFilter=" + this.f22416f + ')';
    }
}

package androidx.compose.foundation;

import android.support.v4.media.d;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.node.ModifierNodeElement;
import p0.a;

/* loaded from: classes.dex */
final class BackgroundElement extends ModifierNodeElement<BackgroundNode> {

    /* renamed from: a, reason: collision with root package name */
    public final long f2490a;

    /* renamed from: b, reason: collision with root package name */
    public final Brush f2491b = null;

    /* renamed from: c, reason: collision with root package name */
    public final float f2492c = 1.0f;
    public final Shape d;

    public BackgroundElement(long j2, Shape shape) {
        this.f2490a = j2;
        this.d = shape;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.BackgroundNode, androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? node = new Modifier.Node();
        node.f2493o = this.f2490a;
        node.f2494p = this.f2491b;
        node.f2495q = this.f2492c;
        node.f2496r = this.d;
        node.f2497s = 9205357640488583168L;
        return node;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        BackgroundNode backgroundNode = (BackgroundNode) node;
        backgroundNode.f2493o = this.f2490a;
        backgroundNode.f2494p = this.f2491b;
        backgroundNode.f2495q = this.f2492c;
        backgroundNode.f2496r = this.d;
    }

    public final boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        return backgroundElement != null && Color.c(this.f2490a, backgroundElement.f2490a) && a.g(this.f2491b, backgroundElement.f2491b) && this.f2492c == backgroundElement.f2492c && a.g(this.d, backgroundElement.d);
    }

    public final int hashCode() {
        int i2 = Color.f14963j;
        int hashCode = Long.hashCode(this.f2490a) * 31;
        Brush brush = this.f2491b;
        return this.d.hashCode() + d.b(this.f2492c, (hashCode + (brush != null ? brush.hashCode() : 0)) * 31, 31);
    }
}

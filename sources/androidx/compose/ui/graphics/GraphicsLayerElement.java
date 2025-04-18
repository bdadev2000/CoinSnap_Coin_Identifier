package androidx.compose.ui.graphics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeCoordinator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class GraphicsLayerElement extends ModifierNodeElement<SimpleGraphicsLayerModifier> {

    /* renamed from: a, reason: collision with root package name */
    public final float f14969a;

    /* renamed from: b, reason: collision with root package name */
    public final float f14970b;

    /* renamed from: c, reason: collision with root package name */
    public final float f14971c;
    public final float d;

    /* renamed from: f, reason: collision with root package name */
    public final float f14972f;

    /* renamed from: g, reason: collision with root package name */
    public final float f14973g;

    /* renamed from: h, reason: collision with root package name */
    public final float f14974h;

    /* renamed from: i, reason: collision with root package name */
    public final float f14975i;

    /* renamed from: j, reason: collision with root package name */
    public final float f14976j;

    /* renamed from: k, reason: collision with root package name */
    public final float f14977k;

    /* renamed from: l, reason: collision with root package name */
    public final long f14978l;

    /* renamed from: m, reason: collision with root package name */
    public final Shape f14979m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f14980n;

    /* renamed from: o, reason: collision with root package name */
    public final RenderEffect f14981o;

    /* renamed from: p, reason: collision with root package name */
    public final long f14982p;

    /* renamed from: q, reason: collision with root package name */
    public final long f14983q;

    /* renamed from: r, reason: collision with root package name */
    public final int f14984r;

    public GraphicsLayerElement(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, long j2, Shape shape, boolean z2, RenderEffect renderEffect, long j3, long j4, int i2) {
        this.f14969a = f2;
        this.f14970b = f3;
        this.f14971c = f4;
        this.d = f5;
        this.f14972f = f6;
        this.f14973g = f7;
        this.f14974h = f8;
        this.f14975i = f9;
        this.f14976j = f10;
        this.f14977k = f11;
        this.f14978l = j2;
        this.f14979m = shape;
        this.f14980n = z2;
        this.f14981o = renderEffect;
        this.f14982p = j3;
        this.f14983q = j4;
        this.f14984r = i2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.graphics.SimpleGraphicsLayerModifier, androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? node = new Modifier.Node();
        node.f15042o = this.f14969a;
        node.f15043p = this.f14970b;
        node.f15044q = this.f14971c;
        node.f15045r = this.d;
        node.f15046s = this.f14972f;
        node.f15047t = this.f14973g;
        node.f15048u = this.f14974h;
        node.f15049v = this.f14975i;
        node.w = this.f14976j;
        node.x = this.f14977k;
        node.f15050y = this.f14978l;
        node.f15051z = this.f14979m;
        node.A = this.f14980n;
        node.B = this.f14981o;
        node.C = this.f14982p;
        node.D = this.f14983q;
        node.E = this.f14984r;
        node.F = new SimpleGraphicsLayerModifier$layerBlock$1(node);
        return node;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        SimpleGraphicsLayerModifier simpleGraphicsLayerModifier = (SimpleGraphicsLayerModifier) node;
        simpleGraphicsLayerModifier.f15042o = this.f14969a;
        simpleGraphicsLayerModifier.f15043p = this.f14970b;
        simpleGraphicsLayerModifier.f15044q = this.f14971c;
        simpleGraphicsLayerModifier.f15045r = this.d;
        simpleGraphicsLayerModifier.f15046s = this.f14972f;
        simpleGraphicsLayerModifier.f15047t = this.f14973g;
        simpleGraphicsLayerModifier.f15048u = this.f14974h;
        simpleGraphicsLayerModifier.f15049v = this.f14975i;
        simpleGraphicsLayerModifier.w = this.f14976j;
        simpleGraphicsLayerModifier.x = this.f14977k;
        simpleGraphicsLayerModifier.f15050y = this.f14978l;
        simpleGraphicsLayerModifier.f15051z = this.f14979m;
        simpleGraphicsLayerModifier.A = this.f14980n;
        simpleGraphicsLayerModifier.B = this.f14981o;
        simpleGraphicsLayerModifier.C = this.f14982p;
        simpleGraphicsLayerModifier.D = this.f14983q;
        simpleGraphicsLayerModifier.E = this.f14984r;
        NodeCoordinator nodeCoordinator = DelegatableNodeKt.d(simpleGraphicsLayerModifier, 2).f16103p;
        if (nodeCoordinator != null) {
            nodeCoordinator.W1(true, simpleGraphicsLayerModifier.F);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        return Float.compare(this.f14969a, graphicsLayerElement.f14969a) == 0 && Float.compare(this.f14970b, graphicsLayerElement.f14970b) == 0 && Float.compare(this.f14971c, graphicsLayerElement.f14971c) == 0 && Float.compare(this.d, graphicsLayerElement.d) == 0 && Float.compare(this.f14972f, graphicsLayerElement.f14972f) == 0 && Float.compare(this.f14973g, graphicsLayerElement.f14973g) == 0 && Float.compare(this.f14974h, graphicsLayerElement.f14974h) == 0 && Float.compare(this.f14975i, graphicsLayerElement.f14975i) == 0 && Float.compare(this.f14976j, graphicsLayerElement.f14976j) == 0 && Float.compare(this.f14977k, graphicsLayerElement.f14977k) == 0 && TransformOrigin.a(this.f14978l, graphicsLayerElement.f14978l) && p0.a.g(this.f14979m, graphicsLayerElement.f14979m) && this.f14980n == graphicsLayerElement.f14980n && p0.a.g(this.f14981o, graphicsLayerElement.f14981o) && Color.c(this.f14982p, graphicsLayerElement.f14982p) && Color.c(this.f14983q, graphicsLayerElement.f14983q) && CompositingStrategy.a(this.f14984r, graphicsLayerElement.f14984r);
    }

    public final int hashCode() {
        int b2 = android.support.v4.media.d.b(this.f14977k, android.support.v4.media.d.b(this.f14976j, android.support.v4.media.d.b(this.f14975i, android.support.v4.media.d.b(this.f14974h, android.support.v4.media.d.b(this.f14973g, android.support.v4.media.d.b(this.f14972f, android.support.v4.media.d.b(this.d, android.support.v4.media.d.b(this.f14971c, android.support.v4.media.d.b(this.f14970b, Float.hashCode(this.f14969a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i2 = TransformOrigin.f15060c;
        int g2 = android.support.v4.media.d.g(this.f14980n, (this.f14979m.hashCode() + android.support.v4.media.d.d(this.f14978l, b2, 31)) * 31, 31);
        RenderEffect renderEffect = this.f14981o;
        int hashCode = (g2 + (renderEffect == null ? 0 : renderEffect.hashCode())) * 31;
        int i3 = Color.f14963j;
        return Integer.hashCode(this.f14984r) + android.support.v4.media.d.d(this.f14983q, android.support.v4.media.d.d(this.f14982p, hashCode, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb.append(this.f14969a);
        sb.append(", scaleY=");
        sb.append(this.f14970b);
        sb.append(", alpha=");
        sb.append(this.f14971c);
        sb.append(", translationX=");
        sb.append(this.d);
        sb.append(", translationY=");
        sb.append(this.f14972f);
        sb.append(", shadowElevation=");
        sb.append(this.f14973g);
        sb.append(", rotationX=");
        sb.append(this.f14974h);
        sb.append(", rotationY=");
        sb.append(this.f14975i);
        sb.append(", rotationZ=");
        sb.append(this.f14976j);
        sb.append(", cameraDistance=");
        sb.append(this.f14977k);
        sb.append(", transformOrigin=");
        sb.append((Object) TransformOrigin.d(this.f14978l));
        sb.append(", shape=");
        sb.append(this.f14979m);
        sb.append(", clip=");
        sb.append(this.f14980n);
        sb.append(", renderEffect=");
        sb.append(this.f14981o);
        sb.append(", ambientShadowColor=");
        android.support.v4.media.d.z(this.f14982p, sb, ", spotShadowColor=");
        android.support.v4.media.d.z(this.f14983q, sb, ", compositingStrategy=");
        sb.append((Object) CompositingStrategy.b(this.f14984r));
        sb.append(')');
        return sb.toString();
    }
}

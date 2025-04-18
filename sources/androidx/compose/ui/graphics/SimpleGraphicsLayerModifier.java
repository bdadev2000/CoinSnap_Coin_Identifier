package androidx.compose.ui.graphics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import e0.x;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class SimpleGraphicsLayerModifier extends Modifier.Node implements LayoutModifierNode {
    public boolean A;
    public RenderEffect B;
    public long C;
    public long D;
    public int E;
    public l F;

    /* renamed from: o, reason: collision with root package name */
    public float f15042o;

    /* renamed from: p, reason: collision with root package name */
    public float f15043p;

    /* renamed from: q, reason: collision with root package name */
    public float f15044q;

    /* renamed from: r, reason: collision with root package name */
    public float f15045r;

    /* renamed from: s, reason: collision with root package name */
    public float f15046s;

    /* renamed from: t, reason: collision with root package name */
    public float f15047t;

    /* renamed from: u, reason: collision with root package name */
    public float f15048u;

    /* renamed from: v, reason: collision with root package name */
    public float f15049v;
    public float w;
    public float x;

    /* renamed from: y, reason: collision with root package name */
    public long f15050y;

    /* renamed from: z, reason: collision with root package name */
    public Shape f15051z;

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean T1() {
        return false;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult m(MeasureScope measureScope, Measurable measurable, long j2) {
        Placeable V = measurable.V(j2);
        return measureScope.T(V.f15825a, V.f15826b, x.f30219a, new SimpleGraphicsLayerModifier$measure$1(V, this));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.f15042o);
        sb.append(", scaleY=");
        sb.append(this.f15043p);
        sb.append(", alpha = ");
        sb.append(this.f15044q);
        sb.append(", translationX=");
        sb.append(this.f15045r);
        sb.append(", translationY=");
        sb.append(this.f15046s);
        sb.append(", shadowElevation=");
        sb.append(this.f15047t);
        sb.append(", rotationX=");
        sb.append(this.f15048u);
        sb.append(", rotationY=");
        sb.append(this.f15049v);
        sb.append(", rotationZ=");
        sb.append(this.w);
        sb.append(", cameraDistance=");
        sb.append(this.x);
        sb.append(", transformOrigin=");
        sb.append((Object) TransformOrigin.d(this.f15050y));
        sb.append(", shape=");
        sb.append(this.f15051z);
        sb.append(", clip=");
        sb.append(this.A);
        sb.append(", renderEffect=");
        sb.append(this.B);
        sb.append(", ambientShadowColor=");
        android.support.v4.media.d.z(this.C, sb, ", spotShadowColor=");
        android.support.v4.media.d.z(this.D, sb, ", compositingStrategy=");
        sb.append((Object) CompositingStrategy.b(this.E));
        sb.append(')');
        return sb.toString();
    }
}

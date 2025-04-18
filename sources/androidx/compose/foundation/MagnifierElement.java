package androidx.compose.foundation;

import android.support.v4.media.d;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import p0.a;
import q0.l;

@StabilityInferred
/* loaded from: classes3.dex */
public final class MagnifierElement extends ModifierNodeElement<MagnifierNode> {

    /* renamed from: a, reason: collision with root package name */
    public final l f2760a;

    /* renamed from: b, reason: collision with root package name */
    public final l f2761b;

    /* renamed from: c, reason: collision with root package name */
    public final l f2762c;
    public final float d;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2763f;

    /* renamed from: g, reason: collision with root package name */
    public final long f2764g;

    /* renamed from: h, reason: collision with root package name */
    public final float f2765h;

    /* renamed from: i, reason: collision with root package name */
    public final float f2766i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f2767j;

    /* renamed from: k, reason: collision with root package name */
    public final PlatformMagnifierFactory f2768k;

    public MagnifierElement(l lVar, l lVar2, l lVar3, float f2, boolean z2, long j2, float f3, float f4, boolean z3, PlatformMagnifierFactory platformMagnifierFactory) {
        this.f2760a = lVar;
        this.f2761b = lVar2;
        this.f2762c = lVar3;
        this.d = f2;
        this.f2763f = z2;
        this.f2764g = j2;
        this.f2765h = f3;
        this.f2766i = f4;
        this.f2767j = z3;
        this.f2768k = platformMagnifierFactory;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new MagnifierNode(this.f2760a, this.f2761b, this.f2762c, this.d, this.f2763f, this.f2764g, this.f2765h, this.f2766i, this.f2767j, this.f2768k);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        MagnifierNode magnifierNode = (MagnifierNode) node;
        float f2 = magnifierNode.f2772r;
        long j2 = magnifierNode.f2774t;
        float f3 = magnifierNode.f2775u;
        boolean z2 = magnifierNode.f2773s;
        float f4 = magnifierNode.f2776v;
        boolean z3 = magnifierNode.w;
        PlatformMagnifierFactory platformMagnifierFactory = magnifierNode.x;
        View view = magnifierNode.f2777y;
        Density density = magnifierNode.f2778z;
        magnifierNode.f2769o = this.f2760a;
        magnifierNode.f2770p = this.f2761b;
        float f5 = this.d;
        magnifierNode.f2772r = f5;
        boolean z4 = this.f2763f;
        magnifierNode.f2773s = z4;
        long j3 = this.f2764g;
        magnifierNode.f2774t = j3;
        float f6 = this.f2765h;
        magnifierNode.f2775u = f6;
        float f7 = this.f2766i;
        magnifierNode.f2776v = f7;
        boolean z5 = this.f2767j;
        magnifierNode.w = z5;
        magnifierNode.f2771q = this.f2762c;
        PlatformMagnifierFactory platformMagnifierFactory2 = this.f2768k;
        magnifierNode.x = platformMagnifierFactory2;
        View a2 = DelegatableNode_androidKt.a(magnifierNode);
        Density density2 = DelegatableNodeKt.f(magnifierNode).f15959u;
        if (magnifierNode.A != null) {
            SemanticsPropertyKey semanticsPropertyKey = Magnifier_androidKt.f2785a;
            if (((!Float.isNaN(f5) || !Float.isNaN(f2)) && f5 != f2 && !platformMagnifierFactory2.b()) || j3 != j2 || !Dp.a(f6, f3) || !Dp.a(f7, f4) || z4 != z2 || z5 != z3 || !a.g(platformMagnifierFactory2, platformMagnifierFactory) || !a.g(a2, view) || !a.g(density2, density)) {
                magnifierNode.f2();
            }
        }
        magnifierNode.g2();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MagnifierElement)) {
            return false;
        }
        MagnifierElement magnifierElement = (MagnifierElement) obj;
        return this.f2760a == magnifierElement.f2760a && this.f2761b == magnifierElement.f2761b && this.d == magnifierElement.d && this.f2763f == magnifierElement.f2763f && this.f2764g == magnifierElement.f2764g && Dp.a(this.f2765h, magnifierElement.f2765h) && Dp.a(this.f2766i, magnifierElement.f2766i) && this.f2767j == magnifierElement.f2767j && this.f2762c == magnifierElement.f2762c && a.g(this.f2768k, magnifierElement.f2768k);
    }

    public final int hashCode() {
        int hashCode = this.f2760a.hashCode() * 31;
        l lVar = this.f2761b;
        int g2 = d.g(this.f2767j, d.b(this.f2766i, d.b(this.f2765h, d.d(this.f2764g, d.g(this.f2763f, d.b(this.d, (hashCode + (lVar != null ? lVar.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31);
        l lVar2 = this.f2762c;
        return this.f2768k.hashCode() + ((g2 + (lVar2 != null ? lVar2.hashCode() : 0)) * 31);
    }
}

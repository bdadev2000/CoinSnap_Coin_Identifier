package androidx.compose.foundation;

import android.support.v4.media.d;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.semantics.Role;
import q0.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class CombinedClickableElement extends ModifierNodeElement<CombinedClickableNodeImpl> {

    /* renamed from: a, reason: collision with root package name */
    public final MutableInteractionSource f2660a;

    /* renamed from: b, reason: collision with root package name */
    public final IndicationNodeFactory f2661b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2662c;
    public final String d;

    /* renamed from: f, reason: collision with root package name */
    public final Role f2663f;

    /* renamed from: g, reason: collision with root package name */
    public final a f2664g;

    /* renamed from: h, reason: collision with root package name */
    public final String f2665h;

    /* renamed from: i, reason: collision with root package name */
    public final a f2666i;

    /* renamed from: j, reason: collision with root package name */
    public final a f2667j;

    public CombinedClickableElement(IndicationNodeFactory indicationNodeFactory, MutableInteractionSource mutableInteractionSource, Role role, String str, String str2, a aVar, a aVar2, a aVar3, boolean z2) {
        this.f2660a = mutableInteractionSource;
        this.f2661b = indicationNodeFactory;
        this.f2662c = z2;
        this.d = str;
        this.f2663f = role;
        this.f2664g = aVar;
        this.f2665h = str2;
        this.f2666i = aVar2;
        this.f2667j = aVar3;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [androidx.compose.foundation.CombinedClickableNodeImpl, androidx.compose.foundation.AbstractClickableNode, androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? abstractClickableNode = new AbstractClickableNode(this.f2660a, this.f2661b, this.f2662c, this.d, this.f2663f, this.f2664g);
        abstractClickableNode.I = this.f2665h;
        abstractClickableNode.J = this.f2666i;
        abstractClickableNode.K = this.f2667j;
        return abstractClickableNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        boolean z2;
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode;
        CombinedClickableNodeImpl combinedClickableNodeImpl = (CombinedClickableNodeImpl) node;
        a aVar = this.f2664g;
        MutableInteractionSource mutableInteractionSource = this.f2660a;
        IndicationNodeFactory indicationNodeFactory = this.f2661b;
        boolean z3 = this.f2662c;
        String str = this.d;
        Role role = this.f2663f;
        String str2 = combinedClickableNodeImpl.I;
        String str3 = this.f2665h;
        if (!p0.a.g(str2, str3)) {
            combinedClickableNodeImpl.I = str3;
            DelegatableNodeKt.f(combinedClickableNodeImpl).K();
        }
        boolean z4 = combinedClickableNodeImpl.J == null;
        a aVar2 = this.f2666i;
        if (z4 != (aVar2 == null)) {
            combinedClickableNodeImpl.j2();
            DelegatableNodeKt.f(combinedClickableNodeImpl).K();
            z2 = true;
        } else {
            z2 = false;
        }
        combinedClickableNodeImpl.J = aVar2;
        boolean z5 = combinedClickableNodeImpl.K == null;
        a aVar3 = this.f2667j;
        if (z5 != (aVar3 == null)) {
            z2 = true;
        }
        combinedClickableNodeImpl.K = aVar3;
        boolean z6 = combinedClickableNodeImpl.f2411u == z3 ? z2 : true;
        combinedClickableNodeImpl.l2(mutableInteractionSource, indicationNodeFactory, z3, str, role, aVar);
        if (!z6 || (suspendingPointerInputModifierNode = combinedClickableNodeImpl.f2413y) == null) {
            return;
        }
        suspendingPointerInputModifierNode.M0();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CombinedClickableElement.class != obj.getClass()) {
            return false;
        }
        CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
        return p0.a.g(this.f2660a, combinedClickableElement.f2660a) && p0.a.g(this.f2661b, combinedClickableElement.f2661b) && this.f2662c == combinedClickableElement.f2662c && p0.a.g(this.d, combinedClickableElement.d) && p0.a.g(this.f2663f, combinedClickableElement.f2663f) && this.f2664g == combinedClickableElement.f2664g && p0.a.g(this.f2665h, combinedClickableElement.f2665h) && this.f2666i == combinedClickableElement.f2666i && this.f2667j == combinedClickableElement.f2667j;
    }

    public final int hashCode() {
        MutableInteractionSource mutableInteractionSource = this.f2660a;
        int hashCode = (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0) * 31;
        IndicationNodeFactory indicationNodeFactory = this.f2661b;
        int g2 = d.g(this.f2662c, (hashCode + (indicationNodeFactory != null ? indicationNodeFactory.hashCode() : 0)) * 31, 31);
        String str = this.d;
        int hashCode2 = (g2 + (str != null ? str.hashCode() : 0)) * 31;
        Role role = this.f2663f;
        int hashCode3 = (this.f2664g.hashCode() + ((hashCode2 + (role != null ? Integer.hashCode(role.f16789a) : 0)) * 31)) * 31;
        String str2 = this.f2665h;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        a aVar = this.f2666i;
        int hashCode5 = (hashCode4 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        a aVar2 = this.f2667j;
        return hashCode5 + (aVar2 != null ? aVar2.hashCode() : 0);
    }
}

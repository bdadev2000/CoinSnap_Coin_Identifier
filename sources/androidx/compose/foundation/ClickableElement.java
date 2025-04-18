package androidx.compose.foundation;

import android.support.v4.media.d;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.semantics.Role;
import q0.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ClickableElement extends ModifierNodeElement<ClickableNode> {

    /* renamed from: a, reason: collision with root package name */
    public final MutableInteractionSource f2617a;

    /* renamed from: b, reason: collision with root package name */
    public final IndicationNodeFactory f2618b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2619c;
    public final String d;

    /* renamed from: f, reason: collision with root package name */
    public final Role f2620f;

    /* renamed from: g, reason: collision with root package name */
    public final a f2621g;

    public ClickableElement(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z2, String str, Role role, a aVar) {
        this.f2617a = mutableInteractionSource;
        this.f2618b = indicationNodeFactory;
        this.f2619c = z2;
        this.d = str;
        this.f2620f = role;
        this.f2621g = aVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new AbstractClickableNode(this.f2617a, this.f2618b, this.f2619c, this.d, this.f2620f, this.f2621g);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        ((ClickableNode) node).l2(this.f2617a, this.f2618b, this.f2619c, this.d, this.f2620f, this.f2621g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return p0.a.g(this.f2617a, clickableElement.f2617a) && p0.a.g(this.f2618b, clickableElement.f2618b) && this.f2619c == clickableElement.f2619c && p0.a.g(this.d, clickableElement.d) && p0.a.g(this.f2620f, clickableElement.f2620f) && this.f2621g == clickableElement.f2621g;
    }

    public final int hashCode() {
        MutableInteractionSource mutableInteractionSource = this.f2617a;
        int hashCode = (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0) * 31;
        IndicationNodeFactory indicationNodeFactory = this.f2618b;
        int g2 = d.g(this.f2619c, (hashCode + (indicationNodeFactory != null ? indicationNodeFactory.hashCode() : 0)) * 31, 31);
        String str = this.d;
        int hashCode2 = (g2 + (str != null ? str.hashCode() : 0)) * 31;
        Role role = this.f2620f;
        return this.f2621g.hashCode() + ((hashCode2 + (role != null ? Integer.hashCode(role.f16789a) : 0)) * 31);
    }
}

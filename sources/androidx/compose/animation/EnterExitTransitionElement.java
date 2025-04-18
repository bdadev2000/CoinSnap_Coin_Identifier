package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class EnterExitTransitionElement extends ModifierNodeElement<EnterExitTransitionModifierNode> {

    /* renamed from: a, reason: collision with root package name */
    public final Transition f1809a;

    /* renamed from: b, reason: collision with root package name */
    public final Transition.DeferredAnimation f1810b;

    /* renamed from: c, reason: collision with root package name */
    public final Transition.DeferredAnimation f1811c;
    public final Transition.DeferredAnimation d;

    /* renamed from: f, reason: collision with root package name */
    public final EnterTransition f1812f;

    /* renamed from: g, reason: collision with root package name */
    public final ExitTransition f1813g;

    /* renamed from: h, reason: collision with root package name */
    public final q0.a f1814h;

    /* renamed from: i, reason: collision with root package name */
    public final GraphicsLayerBlockForEnterExit f1815i;

    public EnterExitTransitionElement(Transition transition, Transition.DeferredAnimation deferredAnimation, Transition.DeferredAnimation deferredAnimation2, Transition.DeferredAnimation deferredAnimation3, EnterTransition enterTransition, ExitTransition exitTransition, q0.a aVar, GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit) {
        this.f1809a = transition;
        this.f1810b = deferredAnimation;
        this.f1811c = deferredAnimation2;
        this.d = deferredAnimation3;
        this.f1812f = enterTransition;
        this.f1813g = exitTransition;
        this.f1814h = aVar;
        this.f1815i = graphicsLayerBlockForEnterExit;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new EnterExitTransitionModifierNode(this.f1809a, this.f1810b, this.f1811c, this.d, this.f1812f, this.f1813g, this.f1814h, this.f1815i);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        EnterExitTransitionModifierNode enterExitTransitionModifierNode = (EnterExitTransitionModifierNode) node;
        enterExitTransitionModifierNode.f1851o = this.f1809a;
        enterExitTransitionModifierNode.f1852p = this.f1810b;
        enterExitTransitionModifierNode.f1853q = this.f1811c;
        enterExitTransitionModifierNode.f1854r = this.d;
        enterExitTransitionModifierNode.f1855s = this.f1812f;
        enterExitTransitionModifierNode.f1856t = this.f1813g;
        enterExitTransitionModifierNode.f1857u = this.f1814h;
        enterExitTransitionModifierNode.f1858v = this.f1815i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
        return p0.a.g(this.f1809a, enterExitTransitionElement.f1809a) && p0.a.g(this.f1810b, enterExitTransitionElement.f1810b) && p0.a.g(this.f1811c, enterExitTransitionElement.f1811c) && p0.a.g(this.d, enterExitTransitionElement.d) && p0.a.g(this.f1812f, enterExitTransitionElement.f1812f) && p0.a.g(this.f1813g, enterExitTransitionElement.f1813g) && p0.a.g(this.f1814h, enterExitTransitionElement.f1814h) && p0.a.g(this.f1815i, enterExitTransitionElement.f1815i);
    }

    public final int hashCode() {
        int hashCode = this.f1809a.hashCode() * 31;
        Transition.DeferredAnimation deferredAnimation = this.f1810b;
        int hashCode2 = (hashCode + (deferredAnimation == null ? 0 : deferredAnimation.hashCode())) * 31;
        Transition.DeferredAnimation deferredAnimation2 = this.f1811c;
        int hashCode3 = (hashCode2 + (deferredAnimation2 == null ? 0 : deferredAnimation2.hashCode())) * 31;
        Transition.DeferredAnimation deferredAnimation3 = this.d;
        return this.f1815i.hashCode() + ((this.f1814h.hashCode() + ((this.f1813g.hashCode() + ((this.f1812f.hashCode() + ((hashCode3 + (deferredAnimation3 != null ? deferredAnimation3.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "EnterExitTransitionElement(transition=" + this.f1809a + ", sizeAnimation=" + this.f1810b + ", offsetAnimation=" + this.f1811c + ", slideAnimation=" + this.d + ", enter=" + this.f1812f + ", exit=" + this.f1813g + ", isEnabled=" + this.f1814h + ", graphicsLayerBlock=" + this.f1815i + ')';
    }
}

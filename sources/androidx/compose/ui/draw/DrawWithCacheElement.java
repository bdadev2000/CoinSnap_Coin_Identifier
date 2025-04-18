package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import p0.a;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class DrawWithCacheElement extends ModifierNodeElement<CacheDrawModifierNodeImpl> {

    /* renamed from: a, reason: collision with root package name */
    public final l f14803a;

    public DrawWithCacheElement(l lVar) {
        this.f14803a = lVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new CacheDrawModifierNodeImpl(new CacheDrawScope(), this.f14803a);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        CacheDrawModifierNodeImpl cacheDrawModifierNodeImpl = (CacheDrawModifierNodeImpl) node;
        cacheDrawModifierNodeImpl.f14793q = this.f14803a;
        cacheDrawModifierNodeImpl.V0();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithCacheElement) && a.g(this.f14803a, ((DrawWithCacheElement) obj).f14803a);
    }

    public final int hashCode() {
        return this.f14803a.hashCode();
    }

    public final String toString() {
        return "DrawWithCacheElement(onBuildDrawCache=" + this.f14803a + ')';
    }
}

package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.r;
import q0.a;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class CacheDrawModifierNodeImpl extends Modifier.Node implements CacheDrawModifierNode, ObserverModifierNode, BuildDrawCacheParams {

    /* renamed from: o, reason: collision with root package name */
    public final CacheDrawScope f14791o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f14792p;

    /* renamed from: q, reason: collision with root package name */
    public l f14793q;

    /* renamed from: androidx.compose.ui.draw.CacheDrawModifierNodeImpl$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass1 extends r implements a {
        @Override // q0.a
        public final Object invoke() {
            throw null;
        }
    }

    public CacheDrawModifierNodeImpl(CacheDrawScope cacheDrawScope, l lVar) {
        this.f14791o = cacheDrawScope;
        this.f14793q = lVar;
        cacheDrawScope.f14796a = this;
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void C0() {
        V0();
    }

    @Override // androidx.compose.ui.draw.CacheDrawModifierNode
    public final void V0() {
        this.f14792p = false;
        this.f14791o.f14797b = null;
        DrawModifierNodeKt.a(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void X1() {
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    public final long b() {
        return IntSizeKt.c(DelegatableNodeKt.d(this, 128).f15827c);
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    public final Density getDensity() {
        return DelegatableNodeKt.f(this).f15959u;
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    public final LayoutDirection getLayoutDirection() {
        return DelegatableNodeKt.f(this).f15960v;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void p1() {
        V0();
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void z(ContentDrawScope contentDrawScope) {
        boolean z2 = this.f14792p;
        CacheDrawScope cacheDrawScope = this.f14791o;
        if (!z2) {
            cacheDrawScope.f14797b = null;
            cacheDrawScope.f14798c = contentDrawScope;
            ObserverModifierNodeKt.a(this, new CacheDrawModifierNodeImpl$getOrBuildCachedDrawBlock$1$1(this, cacheDrawScope));
            if (cacheDrawScope.f14797b == null) {
                InlineClassHelperKt.c("DrawResult not defined, did you forget to call onDraw?");
                throw null;
            }
            this.f14792p = true;
        }
        DrawResult drawResult = cacheDrawScope.f14797b;
        p0.a.p(drawResult);
        drawResult.f14802a.invoke(contentDrawScope);
    }
}

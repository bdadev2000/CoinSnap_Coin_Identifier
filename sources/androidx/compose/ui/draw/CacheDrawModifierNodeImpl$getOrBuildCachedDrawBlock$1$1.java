package androidx.compose.ui.draw;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes3.dex */
final class CacheDrawModifierNodeImpl$getOrBuildCachedDrawBlock$1$1 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CacheDrawModifierNodeImpl f14794a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CacheDrawScope f14795b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CacheDrawModifierNodeImpl$getOrBuildCachedDrawBlock$1$1(CacheDrawModifierNodeImpl cacheDrawModifierNodeImpl, CacheDrawScope cacheDrawScope) {
        super(0);
        this.f14794a = cacheDrawModifierNodeImpl;
        this.f14795b = cacheDrawScope;
    }

    @Override // q0.a
    public final Object invoke() {
        this.f14794a.f14793q.invoke(this.f14795b);
        return b0.f30125a;
    }
}

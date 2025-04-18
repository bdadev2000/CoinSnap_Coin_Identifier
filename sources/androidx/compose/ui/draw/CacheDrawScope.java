package androidx.compose.ui.draw;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.unit.Density;
import q0.l;

@StabilityInferred
/* loaded from: classes3.dex */
public final class CacheDrawScope implements Density {

    /* renamed from: a, reason: collision with root package name */
    public BuildDrawCacheParams f14796a = EmptyBuildDrawCacheParams.f14806a;

    /* renamed from: b, reason: collision with root package name */
    public DrawResult f14797b;

    /* renamed from: c, reason: collision with root package name */
    public ContentDrawScope f14798c;

    @Override // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.f14796a.getDensity().getDensity();
    }

    public final DrawResult m(l lVar) {
        return n(new CacheDrawScope$onDrawBehind$1(lVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, androidx.compose.ui.draw.DrawResult] */
    public final DrawResult n(l lVar) {
        ?? obj = new Object();
        obj.f14802a = lVar;
        this.f14797b = obj;
        return obj;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public final float x1() {
        return this.f14796a.getDensity().x1();
    }
}

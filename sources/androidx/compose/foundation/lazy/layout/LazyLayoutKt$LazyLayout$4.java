package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class LazyLayoutKt$LazyLayout$4 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f4812a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f4813b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LazyLayoutPrefetchState f4814c;
    public final /* synthetic */ p d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4815f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4816g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutKt$LazyLayout$4(a aVar, Modifier modifier, LazyLayoutPrefetchState lazyLayoutPrefetchState, p pVar, int i2, int i3) {
        super(2);
        this.f4812a = aVar;
        this.f4813b = modifier;
        this.f4814c = lazyLayoutPrefetchState;
        this.d = pVar;
        this.f4815f = i2;
        this.f4816g = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        LazyLayoutKt.a(this.f4812a, this.f4813b, this.f4814c, this.d, (Composer) obj, RecomposeScopeImplKt.a(this.f4815f | 1), this.f4816g);
        return b0.f30125a;
    }
}

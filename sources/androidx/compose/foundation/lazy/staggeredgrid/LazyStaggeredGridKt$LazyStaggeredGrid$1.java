package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class LazyStaggeredGridKt$LazyStaggeredGrid$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LazyStaggeredGridState f4950a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Orientation f4951b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LazyGridStaggeredGridSlotsProvider f4952c;
    public final /* synthetic */ Modifier d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ PaddingValues f4953f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f4954g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ FlingBehavior f4955h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f4956i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f4957j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f4958k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l f4959l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f4960m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f4961n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f4962o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridKt$LazyStaggeredGrid$1(LazyStaggeredGridState lazyStaggeredGridState, Orientation orientation, LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider, Modifier modifier, PaddingValues paddingValues, boolean z2, FlingBehavior flingBehavior, boolean z3, float f2, float f3, l lVar, int i2, int i3, int i4) {
        super(2);
        this.f4950a = lazyStaggeredGridState;
        this.f4951b = orientation;
        this.f4952c = lazyGridStaggeredGridSlotsProvider;
        this.d = modifier;
        this.f4953f = paddingValues;
        this.f4954g = z2;
        this.f4955h = flingBehavior;
        this.f4956i = z3;
        this.f4957j = f2;
        this.f4958k = f3;
        this.f4959l = lVar;
        this.f4960m = i2;
        this.f4961n = i3;
        this.f4962o = i4;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        LazyStaggeredGridKt.a(this.f4950a, this.f4951b, this.f4952c, this.d, this.f4953f, this.f4954g, this.f4955h, this.f4956i, this.f4957j, this.f4958k, this.f4959l, (Composer) obj, RecomposeScopeImplKt.a(this.f4960m | 1), RecomposeScopeImplKt.a(this.f4961n), this.f4962o);
        return b0.f30125a;
    }
}

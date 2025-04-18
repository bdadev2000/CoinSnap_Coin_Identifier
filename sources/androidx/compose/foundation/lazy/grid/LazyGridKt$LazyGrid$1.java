package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class LazyGridKt$LazyGrid$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f4499a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LazyGridState f4500b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LazyGridSlotsProvider f4501c;
    public final /* synthetic */ PaddingValues d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f4502f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f4503g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ FlingBehavior f4504h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f4505i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Arrangement.Vertical f4506j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Arrangement.Horizontal f4507k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l f4508l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f4509m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f4510n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f4511o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridKt$LazyGrid$1(Modifier modifier, LazyGridState lazyGridState, LazyGridSlotsProvider lazyGridSlotsProvider, PaddingValues paddingValues, boolean z2, boolean z3, FlingBehavior flingBehavior, boolean z4, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, l lVar, int i2, int i3, int i4) {
        super(2);
        this.f4499a = modifier;
        this.f4500b = lazyGridState;
        this.f4501c = lazyGridSlotsProvider;
        this.d = paddingValues;
        this.f4502f = z2;
        this.f4503g = z3;
        this.f4504h = flingBehavior;
        this.f4505i = z4;
        this.f4506j = vertical;
        this.f4507k = horizontal;
        this.f4508l = lVar;
        this.f4509m = i2;
        this.f4510n = i3;
        this.f4511o = i4;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        LazyGridKt.a(this.f4499a, this.f4500b, this.f4501c, this.d, this.f4502f, this.f4503g, this.f4504h, this.f4505i, this.f4506j, this.f4507k, this.f4508l, (Composer) obj, RecomposeScopeImplKt.a(this.f4509m | 1), RecomposeScopeImplKt.a(this.f4510n), this.f4511o);
        return b0.f30125a;
    }
}

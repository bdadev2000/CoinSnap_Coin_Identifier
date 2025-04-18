package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class PagerKt$VerticalPager$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PagerState f5163a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f5164b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PaddingValues f5165c;
    public final /* synthetic */ PageSize d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5166f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f5167g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Alignment.Horizontal f5168h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ TargetedFlingBehavior f5169i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f5170j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f5171k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l f5172l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ NestedScrollConnection f5173m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ SnapPosition f5174n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ q0.r f5175o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f5176p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f5177q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5178r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerKt$VerticalPager$1(PagerState pagerState, Modifier modifier, PaddingValues paddingValues, PageSize pageSize, int i2, float f2, Alignment.Horizontal horizontal, TargetedFlingBehavior targetedFlingBehavior, boolean z2, boolean z3, l lVar, NestedScrollConnection nestedScrollConnection, SnapPosition snapPosition, q0.r rVar, int i3, int i4, int i5) {
        super(2);
        this.f5163a = pagerState;
        this.f5164b = modifier;
        this.f5165c = paddingValues;
        this.d = pageSize;
        this.f5166f = i2;
        this.f5167g = f2;
        this.f5168h = horizontal;
        this.f5169i = targetedFlingBehavior;
        this.f5170j = z2;
        this.f5171k = z3;
        this.f5172l = lVar;
        this.f5173m = nestedScrollConnection;
        this.f5174n = snapPosition;
        this.f5175o = rVar;
        this.f5176p = i3;
        this.f5177q = i4;
        this.f5178r = i5;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        PagerKt.b(this.f5163a, this.f5164b, this.f5165c, this.d, this.f5166f, this.f5167g, this.f5168h, this.f5169i, this.f5170j, this.f5171k, this.f5172l, this.f5173m, this.f5174n, this.f5175o, (Composer) obj, RecomposeScopeImplKt.a(this.f5176p | 1), RecomposeScopeImplKt.a(this.f5177q), this.f5178r);
        return b0.f30125a;
    }
}

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
/* loaded from: classes4.dex */
public final class PagerKt$HorizontalPager$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PagerState f5147a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f5148b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PaddingValues f5149c;
    public final /* synthetic */ PageSize d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5150f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f5151g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Alignment.Vertical f5152h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ TargetedFlingBehavior f5153i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f5154j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f5155k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l f5156l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ NestedScrollConnection f5157m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ SnapPosition f5158n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ q0.r f5159o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f5160p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f5161q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5162r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerKt$HorizontalPager$1(PagerState pagerState, Modifier modifier, PaddingValues paddingValues, PageSize pageSize, int i2, float f2, Alignment.Vertical vertical, TargetedFlingBehavior targetedFlingBehavior, boolean z2, boolean z3, l lVar, NestedScrollConnection nestedScrollConnection, SnapPosition snapPosition, q0.r rVar, int i3, int i4, int i5) {
        super(2);
        this.f5147a = pagerState;
        this.f5148b = modifier;
        this.f5149c = paddingValues;
        this.d = pageSize;
        this.f5150f = i2;
        this.f5151g = f2;
        this.f5152h = vertical;
        this.f5153i = targetedFlingBehavior;
        this.f5154j = z2;
        this.f5155k = z3;
        this.f5156l = lVar;
        this.f5157m = nestedScrollConnection;
        this.f5158n = snapPosition;
        this.f5159o = rVar;
        this.f5160p = i3;
        this.f5161q = i4;
        this.f5162r = i5;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        PagerKt.a(this.f5147a, this.f5148b, this.f5149c, this.d, this.f5150f, this.f5151g, this.f5152h, this.f5153i, this.f5154j, this.f5155k, this.f5156l, this.f5157m, this.f5158n, this.f5159o, (Composer) obj, RecomposeScopeImplKt.a(this.f5160p | 1), RecomposeScopeImplKt.a(this.f5161q), this.f5162r);
        return b0.f30125a;
    }
}

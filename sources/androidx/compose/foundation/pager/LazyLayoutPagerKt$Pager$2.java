package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
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
/* loaded from: classes3.dex */
public final class LazyLayoutPagerKt$Pager$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f5088a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PagerState f5089b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PaddingValues f5090c;
    public final /* synthetic */ boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Orientation f5091f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ TargetedFlingBehavior f5092g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f5093h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f5094i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f5095j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ PageSize f5096k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ NestedScrollConnection f5097l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l f5098m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Alignment.Horizontal f5099n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Alignment.Vertical f5100o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ SnapPosition f5101p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ q0.r f5102q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5103r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f5104s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f5105t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutPagerKt$Pager$2(Modifier modifier, PagerState pagerState, PaddingValues paddingValues, boolean z2, Orientation orientation, TargetedFlingBehavior targetedFlingBehavior, boolean z3, int i2, float f2, PageSize pageSize, NestedScrollConnection nestedScrollConnection, l lVar, Alignment.Horizontal horizontal, Alignment.Vertical vertical, SnapPosition snapPosition, q0.r rVar, int i3, int i4, int i5) {
        super(2);
        this.f5088a = modifier;
        this.f5089b = pagerState;
        this.f5090c = paddingValues;
        this.d = z2;
        this.f5091f = orientation;
        this.f5092g = targetedFlingBehavior;
        this.f5093h = z3;
        this.f5094i = i2;
        this.f5095j = f2;
        this.f5096k = pageSize;
        this.f5097l = nestedScrollConnection;
        this.f5098m = lVar;
        this.f5099n = horizontal;
        this.f5100o = vertical;
        this.f5101p = snapPosition;
        this.f5102q = rVar;
        this.f5103r = i3;
        this.f5104s = i4;
        this.f5105t = i5;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        LazyLayoutPagerKt.a(this.f5088a, this.f5089b, this.f5090c, this.d, this.f5091f, this.f5092g, this.f5093h, this.f5094i, this.f5095j, this.f5096k, this.f5097l, this.f5098m, this.f5099n, this.f5100o, this.f5101p, this.f5102q, (Composer) obj, RecomposeScopeImplKt.a(this.f5103r | 1), RecomposeScopeImplKt.a(this.f5104s), this.f5105t);
        return b0.f30125a;
    }
}

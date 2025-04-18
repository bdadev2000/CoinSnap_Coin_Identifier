package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class LazyListKt$LazyList$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f4305a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LazyListState f4306b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PaddingValues f4307c;
    public final /* synthetic */ boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f4308f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ FlingBehavior f4309g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f4310h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f4311i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Alignment.Horizontal f4312j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Arrangement.Vertical f4313k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Alignment.Vertical f4314l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Arrangement.Horizontal f4315m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l f4316n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f4317o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f4318p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f4319q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListKt$LazyList$1(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z2, boolean z3, FlingBehavior flingBehavior, boolean z4, int i2, Alignment.Horizontal horizontal, Arrangement.Vertical vertical, Alignment.Vertical vertical2, Arrangement.Horizontal horizontal2, l lVar, int i3, int i4, int i5) {
        super(2);
        this.f4305a = modifier;
        this.f4306b = lazyListState;
        this.f4307c = paddingValues;
        this.d = z2;
        this.f4308f = z3;
        this.f4309g = flingBehavior;
        this.f4310h = z4;
        this.f4311i = i2;
        this.f4312j = horizontal;
        this.f4313k = vertical;
        this.f4314l = vertical2;
        this.f4315m = horizontal2;
        this.f4316n = lVar;
        this.f4317o = i3;
        this.f4318p = i4;
        this.f4319q = i5;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        LazyListKt.a(this.f4305a, this.f4306b, this.f4307c, this.d, this.f4308f, this.f4309g, this.f4310h, this.f4311i, this.f4312j, this.f4313k, this.f4314l, this.f4315m, this.f4316n, (Composer) obj, RecomposeScopeImplKt.a(this.f4317o | 1), RecomposeScopeImplKt.a(this.f4318p), this.f4319q);
        return b0.f30125a;
    }
}

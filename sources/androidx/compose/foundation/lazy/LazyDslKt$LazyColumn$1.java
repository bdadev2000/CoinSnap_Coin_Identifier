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
/* loaded from: classes3.dex */
public final class LazyDslKt$LazyColumn$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f4241a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LazyListState f4242b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PaddingValues f4243c;
    public final /* synthetic */ boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Arrangement.Vertical f4244f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Alignment.Horizontal f4245g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ FlingBehavior f4246h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f4247i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f4248j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4249k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f4250l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyDslKt$LazyColumn$1(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z2, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, FlingBehavior flingBehavior, boolean z3, l lVar, int i2, int i3) {
        super(2);
        this.f4241a = modifier;
        this.f4242b = lazyListState;
        this.f4243c = paddingValues;
        this.d = z2;
        this.f4244f = vertical;
        this.f4245g = horizontal;
        this.f4246h = flingBehavior;
        this.f4247i = z3;
        this.f4248j = lVar;
        this.f4249k = i2;
        this.f4250l = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        LazyDslKt.a(this.f4241a, this.f4242b, this.f4243c, this.d, this.f4244f, this.f4245g, this.f4246h, this.f4247i, this.f4248j, (Composer) obj, RecomposeScopeImplKt.a(this.f4249k | 1), this.f4250l);
        return b0.f30125a;
    }
}

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
/* loaded from: classes2.dex */
public final class LazyDslKt$LazyRow$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f4260a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LazyListState f4261b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PaddingValues f4262c;
    public final /* synthetic */ boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Arrangement.Horizontal f4263f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Alignment.Vertical f4264g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ FlingBehavior f4265h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f4266i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f4267j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4268k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f4269l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyDslKt$LazyRow$1(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z2, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, FlingBehavior flingBehavior, boolean z3, l lVar, int i2, int i3) {
        super(2);
        this.f4260a = modifier;
        this.f4261b = lazyListState;
        this.f4262c = paddingValues;
        this.d = z2;
        this.f4263f = horizontal;
        this.f4264g = vertical;
        this.f4265h = flingBehavior;
        this.f4266i = z3;
        this.f4267j = lVar;
        this.f4268k = i2;
        this.f4269l = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        LazyDslKt.b(this.f4260a, this.f4261b, this.f4262c, this.d, this.f4263f, this.f4264g, this.f4265h, this.f4266i, this.f4267j, (Composer) obj, RecomposeScopeImplKt.a(this.f4268k | 1), this.f4269l);
        return b0.f30125a;
    }
}

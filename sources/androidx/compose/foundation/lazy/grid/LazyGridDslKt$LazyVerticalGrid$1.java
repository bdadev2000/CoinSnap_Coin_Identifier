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
public final class LazyGridDslKt$LazyVerticalGrid$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GridCells f4463a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f4464b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LazyGridState f4465c;
    public final /* synthetic */ PaddingValues d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f4466f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Arrangement.Vertical f4467g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Arrangement.Horizontal f4468h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ FlingBehavior f4469i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f4470j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l f4471k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f4472l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f4473m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridDslKt$LazyVerticalGrid$1(int i2, int i3, FlingBehavior flingBehavior, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, PaddingValues paddingValues, GridCells gridCells, LazyGridState lazyGridState, Modifier modifier, l lVar, boolean z2, boolean z3) {
        super(2);
        this.f4463a = gridCells;
        this.f4464b = modifier;
        this.f4465c = lazyGridState;
        this.d = paddingValues;
        this.f4466f = z2;
        this.f4467g = vertical;
        this.f4468h = horizontal;
        this.f4469i = flingBehavior;
        this.f4470j = z3;
        this.f4471k = lVar;
        this.f4472l = i2;
        this.f4473m = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        GridCells gridCells = this.f4463a;
        Modifier modifier = this.f4464b;
        LazyGridState lazyGridState = this.f4465c;
        PaddingValues paddingValues = this.d;
        boolean z2 = this.f4466f;
        Arrangement.Vertical vertical = this.f4467g;
        Arrangement.Horizontal horizontal = this.f4468h;
        FlingBehavior flingBehavior = this.f4469i;
        boolean z3 = this.f4470j;
        LazyGridDslKt.a(RecomposeScopeImplKt.a(this.f4472l | 1), this.f4473m, flingBehavior, horizontal, vertical, paddingValues, gridCells, lazyGridState, (Composer) obj, modifier, this.f4471k, z2, z3);
        return b0.f30125a;
    }
}

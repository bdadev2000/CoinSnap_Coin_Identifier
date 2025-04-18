package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class AppBarKt$CenterAlignedTopAppBar$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f7711a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f7712b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f7713c;
    public final /* synthetic */ q d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f7714f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ WindowInsets f7715g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ TopAppBarColors f7716h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ TopAppBarScrollBehavior f7717i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f7718j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f7719k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$CenterAlignedTopAppBar$2(p pVar, Modifier modifier, p pVar2, q qVar, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i2, int i3) {
        super(2);
        this.f7711a = pVar;
        this.f7712b = modifier;
        this.f7713c = pVar2;
        this.d = qVar;
        this.f7714f = f2;
        this.f7715g = windowInsets;
        this.f7716h = topAppBarColors;
        this.f7717i = topAppBarScrollBehavior;
        this.f7718j = i2;
        this.f7719k = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AppBarKt.c(this.f7711a, this.f7712b, this.f7713c, this.d, this.f7714f, this.f7715g, this.f7716h, this.f7717i, (Composer) obj, RecomposeScopeImplKt.a(this.f7718j | 1), this.f7719k);
        return b0.f30125a;
    }
}

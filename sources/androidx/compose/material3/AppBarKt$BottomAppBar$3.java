package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class AppBarKt$BottomAppBar$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f7667a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f7668b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f7669c;
    public final /* synthetic */ long d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f7670f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f7671g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ PaddingValues f7672h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ WindowInsets f7673i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ BottomAppBarScrollBehavior f7674j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f7675k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f7676l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$BottomAppBar$3(q qVar, Modifier modifier, p pVar, long j2, long j3, float f2, PaddingValues paddingValues, WindowInsets windowInsets, BottomAppBarScrollBehavior bottomAppBarScrollBehavior, int i2, int i3) {
        super(2);
        this.f7667a = qVar;
        this.f7668b = modifier;
        this.f7669c = pVar;
        this.d = j2;
        this.f7670f = j3;
        this.f7671g = f2;
        this.f7672h = paddingValues;
        this.f7673i = windowInsets;
        this.f7674j = bottomAppBarScrollBehavior;
        this.f7675k = i2;
        this.f7676l = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AppBarKt.b(this.f7667a, this.f7668b, this.f7669c, this.d, this.f7670f, this.f7671g, this.f7672h, this.f7673i, this.f7674j, (Composer) obj, RecomposeScopeImplKt.a(this.f7675k | 1), this.f7676l);
        return b0.f30125a;
    }
}

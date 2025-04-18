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
/* loaded from: classes4.dex */
public final class AppBarKt$TopAppBar$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f7791a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f7792b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f7793c;
    public final /* synthetic */ q d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f7794f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ WindowInsets f7795g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ TopAppBarColors f7796h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ TopAppBarScrollBehavior f7797i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f7798j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f7799k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$TopAppBar$2(p pVar, Modifier modifier, p pVar2, q qVar, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i2, int i3) {
        super(2);
        this.f7791a = pVar;
        this.f7792b = modifier;
        this.f7793c = pVar2;
        this.d = qVar;
        this.f7794f = f2;
        this.f7795g = windowInsets;
        this.f7796h = topAppBarColors;
        this.f7797i = topAppBarScrollBehavior;
        this.f7798j = i2;
        this.f7799k = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AppBarKt.g(this.f7791a, this.f7792b, this.f7793c, this.d, this.f7794f, this.f7795g, this.f7796h, this.f7797i, (Composer) obj, RecomposeScopeImplKt.a(this.f7798j | 1), this.f7799k);
        return b0.f30125a;
    }
}

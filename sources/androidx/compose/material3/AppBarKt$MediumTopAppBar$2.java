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
public final class AppBarKt$MediumTopAppBar$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f7746a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f7747b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f7748c;
    public final /* synthetic */ q d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f7749f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f7750g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ WindowInsets f7751h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ TopAppBarColors f7752i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ TopAppBarScrollBehavior f7753j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f7754k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f7755l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$MediumTopAppBar$2(p pVar, Modifier modifier, p pVar2, q qVar, float f2, float f3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i2, int i3) {
        super(2);
        this.f7746a = pVar;
        this.f7747b = modifier;
        this.f7748c = pVar2;
        this.d = qVar;
        this.f7749f = f2;
        this.f7750g = f3;
        this.f7751h = windowInsets;
        this.f7752i = topAppBarColors;
        this.f7753j = topAppBarScrollBehavior;
        this.f7754k = i2;
        this.f7755l = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AppBarKt.e(this.f7746a, this.f7747b, this.f7748c, this.d, this.f7749f, this.f7750g, this.f7751h, this.f7752i, this.f7753j, (Composer) obj, RecomposeScopeImplKt.a(this.f7754k | 1), this.f7755l);
        return b0.f30125a;
    }
}

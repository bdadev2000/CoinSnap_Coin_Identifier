package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class AppBarKt$SingleRowTopAppBar$4 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f7766a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f7767b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextStyle f7768c;
    public final /* synthetic */ boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f7769f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q f7770g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f7771h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ WindowInsets f7772i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ TopAppBarColors f7773j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ TopAppBarScrollBehavior f7774k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f7775l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f7776m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$SingleRowTopAppBar$4(Modifier modifier, p pVar, TextStyle textStyle, boolean z2, p pVar2, q qVar, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i2, int i3) {
        super(2);
        this.f7766a = modifier;
        this.f7767b = pVar;
        this.f7768c = textStyle;
        this.d = z2;
        this.f7769f = pVar2;
        this.f7770g = qVar;
        this.f7771h = f2;
        this.f7772i = windowInsets;
        this.f7773j = topAppBarColors;
        this.f7774k = topAppBarScrollBehavior;
        this.f7775l = i2;
        this.f7776m = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AppBarKt.f(this.f7766a, this.f7767b, this.f7768c, this.d, this.f7769f, this.f7770g, this.f7771h, this.f7772i, this.f7773j, this.f7774k, (Composer) obj, RecomposeScopeImplKt.a(this.f7775l | 1), this.f7776m);
        return b0.f30125a;
    }
}

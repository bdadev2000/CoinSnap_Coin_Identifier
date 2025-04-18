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
public final class AppBarKt$BottomAppBar$7 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f7690a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f7691b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f7692c;
    public final /* synthetic */ float d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ PaddingValues f7693f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ WindowInsets f7694g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ BottomAppBarScrollBehavior f7695h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q f7696i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f7697j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f7698k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$BottomAppBar$7(Modifier modifier, long j2, long j3, float f2, PaddingValues paddingValues, WindowInsets windowInsets, BottomAppBarScrollBehavior bottomAppBarScrollBehavior, q qVar, int i2, int i3) {
        super(2);
        this.f7690a = modifier;
        this.f7691b = j2;
        this.f7692c = j3;
        this.d = f2;
        this.f7693f = paddingValues;
        this.f7694g = windowInsets;
        this.f7695h = bottomAppBarScrollBehavior;
        this.f7696i = qVar;
        this.f7697j = i2;
        this.f7698k = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AppBarKt.a(this.f7690a, this.f7691b, this.f7692c, this.d, this.f7693f, this.f7694g, this.f7695h, this.f7696i, (Composer) obj, RecomposeScopeImplKt.a(this.f7697j | 1), this.f7698k);
        return b0.f30125a;
    }
}

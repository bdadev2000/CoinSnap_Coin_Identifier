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
/* loaded from: classes.dex */
public final class AppBarKt$LargeTopAppBar$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f7728a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f7729b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f7730c;
    public final /* synthetic */ q d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f7731f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f7732g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ WindowInsets f7733h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ TopAppBarColors f7734i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ TopAppBarScrollBehavior f7735j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f7736k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f7737l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$LargeTopAppBar$2(p pVar, Modifier modifier, p pVar2, q qVar, float f2, float f3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i2, int i3) {
        super(2);
        this.f7728a = pVar;
        this.f7729b = modifier;
        this.f7730c = pVar2;
        this.d = qVar;
        this.f7731f = f2;
        this.f7732g = f3;
        this.f7733h = windowInsets;
        this.f7734i = topAppBarColors;
        this.f7735j = topAppBarScrollBehavior;
        this.f7736k = i2;
        this.f7737l = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AppBarKt.d(this.f7728a, this.f7729b, this.f7730c, this.d, this.f7731f, this.f7732g, this.f7733h, this.f7734i, this.f7735j, (Composer) obj, RecomposeScopeImplKt.a(this.f7736k | 1), this.f7737l);
        return b0.f30125a;
    }
}

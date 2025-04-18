package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NavigationDrawerKt$DrawerSheet$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DrawerPredictiveBackState f10092a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WindowInsets f10093b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f10094c;
    public final /* synthetic */ Shape d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f10095f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f10096g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f10097h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q f10098i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f10099j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f10100k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$DrawerSheet$2(DrawerPredictiveBackState drawerPredictiveBackState, WindowInsets windowInsets, Modifier modifier, Shape shape, long j2, long j3, float f2, q qVar, int i2, int i3) {
        super(2);
        this.f10092a = drawerPredictiveBackState;
        this.f10093b = windowInsets;
        this.f10094c = modifier;
        this.d = shape;
        this.f10095f = j2;
        this.f10096g = j3;
        this.f10097h = f2;
        this.f10098i = qVar;
        this.f10099j = i2;
        this.f10100k = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        NavigationDrawerKt.a(this.f10092a, this.f10093b, this.f10094c, this.d, this.f10095f, this.f10096g, this.f10097h, this.f10098i, (Composer) obj, RecomposeScopeImplKt.a(this.f10099j | 1), this.f10100k);
        return b0.f30125a;
    }
}

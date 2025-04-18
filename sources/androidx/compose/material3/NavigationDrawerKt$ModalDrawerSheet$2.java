package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.q;

/* loaded from: classes2.dex */
final class NavigationDrawerKt$ModalDrawerSheet$2 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WindowInsets f10109a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f10110b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Shape f10111c;
    public final /* synthetic */ long d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f10112f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f10113g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q f10114h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$ModalDrawerSheet$2(WindowInsets windowInsets, Modifier modifier, Shape shape, long j2, long j3, float f2, q qVar) {
        super(3);
        this.f10109a = windowInsets;
        this.f10110b = modifier;
        this.f10111c = shape;
        this.d = j2;
        this.f10112f = j3;
        this.f10113g = f2;
        this.f10114h = qVar;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        DrawerPredictiveBackState drawerPredictiveBackState = (DrawerPredictiveBackState) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= composer.I(drawerPredictiveBackState) ? 4 : 2;
        }
        if ((intValue & 19) == 18 && composer.i()) {
            composer.A();
        } else {
            NavigationDrawerKt.a(drawerPredictiveBackState, this.f10109a, this.f10110b, this.f10111c, this.d, this.f10112f, this.f10113g, this.f10114h, composer, intValue & 14, 0);
        }
        return b0.f30125a;
    }
}

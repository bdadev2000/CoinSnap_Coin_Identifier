package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class NavigationDrawer_androidKt$DrawerPredictiveBackHandler$4 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DrawerState f10227a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f10228b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10229c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawer_androidKt$DrawerPredictiveBackHandler$4(DrawerState drawerState, q qVar, int i2) {
        super(2);
        this.f10227a = drawerState;
        this.f10228b = qVar;
        this.f10229c = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.f10229c | 1);
        NavigationDrawer_androidKt.a(this.f10227a, this.f10228b, (Composer) obj, a2);
        return b0.f30125a;
    }
}

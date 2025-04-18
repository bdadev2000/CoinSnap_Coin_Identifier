package androidx.compose.material3;

import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$3$1", f = "NavigationDrawer.android.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class NavigationDrawer_androidKt$DrawerPredictiveBackHandler$3$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DrawerState f10225a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DrawerPredictiveBackState f10226b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawer_androidKt$DrawerPredictiveBackHandler$3$1(DrawerState drawerState, DrawerPredictiveBackState drawerPredictiveBackState, g gVar) {
        super(2, gVar);
        this.f10225a = drawerState;
        this.f10226b = drawerPredictiveBackState;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new NavigationDrawer_androidKt$DrawerPredictiveBackHandler$3$1(this.f10225a, this.f10226b, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        NavigationDrawer_androidKt$DrawerPredictiveBackHandler$3$1 navigationDrawer_androidKt$DrawerPredictiveBackHandler$3$1 = (NavigationDrawer_androidKt$DrawerPredictiveBackHandler$3$1) create((d0) obj, (g) obj2);
        b0 b0Var = b0.f30125a;
        navigationDrawer_androidKt$DrawerPredictiveBackHandler$3$1.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        q.m(obj);
        if (((DrawerValue) this.f10225a.f9247a.f12824g.getValue()) == DrawerValue.f9261a) {
            DrawerPredictiveBackState drawerPredictiveBackState = this.f10226b;
            drawerPredictiveBackState.f9244a.setValue(Boolean.TRUE);
            drawerPredictiveBackState.f9245b.n(0.0f);
            drawerPredictiveBackState.f9246c.n(0.0f);
        }
        return b0.f30125a;
    }
}

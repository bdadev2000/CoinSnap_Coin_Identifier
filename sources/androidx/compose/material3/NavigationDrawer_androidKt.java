package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.activity.compose.PredictiveBackHandlerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import b1.d0;
import q0.p;
import q0.q;

/* loaded from: classes4.dex */
public final class NavigationDrawer_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f10207a = 12;

    /* renamed from: b, reason: collision with root package name */
    public static final float f10208b = 24;

    /* renamed from: c, reason: collision with root package name */
    public static final float f10209c = 48;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.jvm.internal.c0] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.jvm.internal.c0] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.jvm.internal.c0] */
    public static final void a(DrawerState drawerState, q qVar, Composer composer, int i2) {
        int i3;
        boolean z2;
        int i4;
        int i5;
        DrawerPredictiveBackState drawerPredictiveBackState;
        DrawerPredictiveBackState drawerPredictiveBackState2;
        q qVar2;
        ComposerImpl g2 = composer.g(1444817207);
        if ((i2 & 6) == 0) {
            i3 = (g2.I(drawerState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.w(qVar) ? 32 : 16;
        }
        int i6 = i3;
        if ((i6 & 19) == 18 && g2.i()) {
            g2.A();
            qVar2 = qVar;
        } else {
            Object u2 = g2.u();
            Object obj = Composer.Companion.f13690a;
            if (u2 == obj) {
                u2 = new DrawerPredictiveBackState();
                g2.o(u2);
            }
            DrawerPredictiveBackState drawerPredictiveBackState3 = (DrawerPredictiveBackState) u2;
            Object u3 = g2.u();
            if (u3 == obj) {
                u3 = d.h(EffectsKt.g(g2), g2);
            }
            d0 d0Var = ((CompositionScopedCoroutineScopeCanceller) u3).f13774a;
            boolean z3 = g2.K(CompositionLocalsKt.f16440l) == LayoutDirection.f17495b;
            ?? obj2 = new Object();
            ?? obj3 = new Object();
            ?? obj4 = new Object();
            Density density = (Density) g2.K(CompositionLocalsKt.f16434f);
            obj2.f30922a = density.y1(f10207a);
            obj3.f30922a = density.y1(f10208b);
            obj4.f30922a = density.y1(f10209c);
            boolean z4 = ((DrawerValue) drawerState.f9247a.f12824g.getValue()) == DrawerValue.f9262b;
            int i7 = i6 & 14;
            boolean a2 = g2.a(z3) | g2.b(obj2.f30922a) | g2.b(obj3.f30922a) | g2.b(obj4.f30922a) | g2.w(d0Var) | (i7 == 4);
            Object u4 = g2.u();
            if (a2 || u4 == obj) {
                z2 = z4;
                i4 = i7;
                i5 = 0;
                drawerPredictiveBackState = drawerPredictiveBackState3;
                u4 = new NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1(drawerPredictiveBackState3, d0Var, drawerState, z3, obj2, obj3, obj4, null);
                g2.o(u4);
            } else {
                z2 = z4;
                i4 = i7;
                drawerPredictiveBackState = drawerPredictiveBackState3;
                i5 = 0;
            }
            PredictiveBackHandlerKt.a(z2, (p) u4, g2, i5, i5);
            Boolean valueOf = Boolean.valueOf(((DrawerValue) drawerState.f9247a.f12824g.getValue()) == DrawerValue.f9261a ? 1 : i5);
            int i8 = i4 == 4 ? 1 : i5;
            Object u5 = g2.u();
            if (i8 != 0 || u5 == obj) {
                drawerPredictiveBackState2 = drawerPredictiveBackState;
                u5 = new NavigationDrawer_androidKt$DrawerPredictiveBackHandler$3$1(drawerState, drawerPredictiveBackState2, null);
                g2.o(u5);
            } else {
                drawerPredictiveBackState2 = drawerPredictiveBackState;
            }
            EffectsKt.f(valueOf, (p) u5, g2);
            q qVar3 = qVar;
            qVar3.invoke(drawerPredictiveBackState2, g2, Integer.valueOf((i6 & 112) | 6));
            qVar2 = qVar3;
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new NavigationDrawer_androidKt$DrawerPredictiveBackHandler$4(drawerState, qVar2, i2);
        }
    }
}

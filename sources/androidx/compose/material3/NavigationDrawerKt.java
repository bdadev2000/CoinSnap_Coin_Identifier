package androidx.compose.material3;

import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import org.objectweb.asm.Opcodes;
import q0.l;
import q0.p;

/* loaded from: classes4.dex */
public final class NavigationDrawerKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f10042a = 400;

    /* renamed from: b, reason: collision with root package name */
    public static final float f10043b = 240;

    /* renamed from: c, reason: collision with root package name */
    public static final TweenSpec f10044c = new TweenSpec(256, (Easing) null, 6);

    /* JADX WARN: Removed duplicated region for block: B:101:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(androidx.compose.material3.DrawerPredictiveBackState r30, androidx.compose.foundation.layout.WindowInsets r31, androidx.compose.ui.Modifier r32, androidx.compose.ui.graphics.Shape r33, long r34, long r36, float r38, q0.q r39, androidx.compose.runtime.Composer r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.a(androidx.compose.material3.DrawerPredictiveBackState, androidx.compose.foundation.layout.WindowInsets, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, float, q0.q, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(boolean z2, q0.a aVar, q0.a aVar2, long j2, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(2106487387);
        if ((i2 & 6) == 0) {
            i3 = (g2.a(z2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.w(aVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g2.w(aVar2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= g2.d(j2) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i3 & 1171) == 1170 && g2.i()) {
            g2.A();
        } else {
            String a2 = Strings_androidKt.a(com.cooldev.gba.emulator.gameboy.R.string.close_drawer, g2);
            g2.J(-1784754787);
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            Modifier modifier = Modifier.Companion.f14687a;
            if (z2) {
                int i4 = i3 & 112;
                boolean z3 = i4 == 32;
                Object u2 = g2.u();
                if (z3 || u2 == composer$Companion$Empty$1) {
                    u2 = new NavigationDrawerKt$Scrim$dismissDrawer$1$1(aVar, null);
                    g2.o(u2);
                }
                Modifier b2 = SuspendingPointerInputFilterKt.b(modifier, aVar, (p) u2);
                boolean I = (i4 == 32) | g2.I(a2);
                Object u3 = g2.u();
                if (I || u3 == composer$Companion$Empty$1) {
                    u3 = new NavigationDrawerKt$Scrim$dismissDrawer$2$1(a2, aVar);
                    g2.o(u3);
                }
                modifier = SemanticsModifierKt.b(b2, true, (l) u3);
            }
            g2.V(false);
            Modifier T0 = SizeKt.f4107c.T0(modifier);
            boolean z4 = ((i3 & 7168) == 2048) | ((i3 & 896) == 256);
            Object u4 = g2.u();
            if (z4 || u4 == composer$Companion$Empty$1) {
                u4 = new NavigationDrawerKt$Scrim$1$1(j2, aVar2);
                g2.o(u4);
            }
            CanvasKt.a(T0, (l) u4, g2, 0);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new NavigationDrawerKt$Scrim$2(z2, aVar, aVar2, j2, i2);
        }
    }

    public static final float c(GraphicsLayerScope graphicsLayerScope, DrawerPredictiveBackState drawerPredictiveBackState) {
        float d = Size.d(graphicsLayerScope.b());
        if (Float.isNaN(d) || d == 0.0f) {
            return 1.0f;
        }
        return 1.0f + ((drawerPredictiveBackState.f9245b.c() * (drawerPredictiveBackState.a() ? 1 : -1)) / d);
    }

    public static final float d(GraphicsLayerScope graphicsLayerScope, DrawerPredictiveBackState drawerPredictiveBackState) {
        float b2 = Size.b(graphicsLayerScope.b());
        if (Float.isNaN(b2) || b2 == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (drawerPredictiveBackState.f9246c.c() / b2);
    }

    public static final DrawerState e(Composer composer) {
        NavigationDrawerKt$rememberDrawerState$1 navigationDrawerKt$rememberDrawerState$1 = NavigationDrawerKt$rememberDrawerState$1.f10204a;
        Object[] objArr = new Object[0];
        DrawerState$Companion$Saver$1 drawerState$Companion$Saver$1 = DrawerState$Companion$Saver$1.f9249a;
        DrawerState$Companion$Saver$2 drawerState$Companion$Saver$2 = new DrawerState$Companion$Saver$2(navigationDrawerKt$rememberDrawerState$1);
        SaverKt$Saver$1 saverKt$Saver$1 = SaverKt.f14531a;
        SaverKt$Saver$1 saverKt$Saver$12 = new SaverKt$Saver$1(drawerState$Companion$Saver$2, drawerState$Companion$Saver$1);
        boolean I = composer.I(navigationDrawerKt$rememberDrawerState$1);
        Object u2 = composer.u();
        if (I || u2 == Composer.Companion.f13690a) {
            u2 = new NavigationDrawerKt$rememberDrawerState$2$1(navigationDrawerKt$rememberDrawerState$1);
            composer.o(u2);
        }
        return (DrawerState) RememberSaveableKt.c(objArr, saverKt$Saver$12, null, (q0.a) u2, composer, 0, 4);
    }
}

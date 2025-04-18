package androidx.compose.material3;

import android.content.res.Configuration;
import android.support.v4.media.d;
import android.view.View;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.unit.Density;
import d0.b0;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.l;
import q0.p;
import q0.q;

/* loaded from: classes4.dex */
final class ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$6 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f9357a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f9358b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f9359c;
    public final /* synthetic */ q d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f9360f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9361g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$6(boolean z2, l lVar, Modifier modifier, q qVar, int i2, int i3) {
        super(2);
        this.f9357a = z2;
        this.f9358b = lVar;
        this.f9359c = modifier;
        this.d = qVar;
        this.f9360f = i2;
        this.f9361g = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        int i2;
        int i3;
        int i4;
        int i5;
        Density density;
        Modifier modifier;
        q qVar;
        boolean z2;
        boolean z3;
        l lVar;
        ((Number) obj2).intValue();
        boolean z4 = this.f9357a;
        l lVar2 = this.f9358b;
        q qVar2 = this.d;
        int a2 = RecomposeScopeImplKt.a(this.f9360f | 1);
        int i6 = this.f9361g;
        float f2 = ExposedDropdownMenu_androidKt.f9345a;
        ComposerImpl g2 = ((Composer) obj).g(2067579792);
        if ((i6 & 1) != 0) {
            i2 = a2 | 6;
        } else if ((a2 & 6) == 0) {
            i2 = (g2.a(z4) ? 4 : 2) | a2;
        } else {
            i2 = a2;
        }
        if ((i6 & 2) != 0) {
            i2 |= 48;
        } else if ((a2 & 48) == 0) {
            i2 |= g2.w(lVar2) ? 32 : 16;
        }
        int i7 = i6 & 4;
        Modifier modifier2 = this.f9359c;
        if (i7 != 0) {
            i2 |= 384;
        } else if ((a2 & 384) == 0) {
            i2 |= g2.I(modifier2) ? 256 : 128;
        }
        if ((i6 & 8) != 0) {
            i2 |= 3072;
        } else if ((a2 & 3072) == 0) {
            i2 |= g2.w(qVar2) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i2 & 1171) == 1170 && g2.i()) {
            g2.A();
            z3 = z4;
            lVar = lVar2;
            qVar = qVar2;
            i4 = a2;
            i3 = i6;
            modifier = modifier2;
        } else {
            if (i7 != 0) {
                modifier2 = Modifier.Companion.f14687a;
            }
            Configuration configuration = (Configuration) g2.K(AndroidCompositionLocals_androidKt.f16324a);
            View view = (View) g2.K(AndroidCompositionLocals_androidKt.f16327f);
            Density density2 = (Density) g2.K(CompositionLocalsKt.f16434f);
            int F0 = density2.F0(MenuKt.f9737a);
            Object u2 = g2.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (u2 == composer$Companion$Empty$1) {
                u2 = SnapshotStateKt.f(null, StructuralEqualityPolicy.f14078a);
                g2.o(u2);
            }
            MutableState mutableState = (MutableState) u2;
            Object u3 = g2.u();
            if (u3 == composer$Companion$Empty$1) {
                u3 = SnapshotIntStateKt.a(0);
                g2.o(u3);
            }
            final MutableIntState mutableIntState = (MutableIntState) u3;
            i3 = i6;
            Object u4 = g2.u();
            if (u4 == composer$Companion$Empty$1) {
                u4 = SnapshotIntStateKt.a(0);
                g2.o(u4);
            }
            final MutableIntState mutableIntState2 = (MutableIntState) u4;
            Object u5 = g2.u();
            if (u5 == composer$Companion$Empty$1) {
                u5 = new FocusRequester();
                g2.o(u5);
            }
            FocusRequester focusRequester = (FocusRequester) u5;
            i4 = a2;
            final SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) g2.K(CompositionLocalsKt.f16442n);
            Strings_androidKt.a(com.cooldev.gba.emulator.gameboy.R.string.m3c_dropdown_menu_expanded, g2);
            Strings_androidKt.a(com.cooldev.gba.emulator.gameboy.R.string.m3c_dropdown_menu_collapsed, g2);
            Strings_androidKt.a(com.cooldev.gba.emulator.gameboy.R.string.m3c_dropdown_menu_toggle, g2);
            Object u6 = g2.u();
            if (u6 == composer$Companion$Empty$1) {
                u6 = SnapshotStateKt.f(new MenuAnchorType(), StructuralEqualityPolicy.f14078a);
                g2.o(u6);
            }
            final MutableState mutableState2 = (MutableState) u6;
            int i8 = i2 & 14;
            boolean z5 = i8 == 4;
            int i9 = i2 & 112;
            boolean I = z5 | (i9 == 32) | g2.I(configuration) | g2.I(view) | g2.I(density2);
            Object u7 = g2.u();
            if (I || u7 == composer$Companion$Empty$1) {
                u7 = new ExposedDropdownMenuBoxScopeImpl() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1
                    @Override // androidx.compose.material3.ExposedDropdownMenuBoxScope
                    public final Modifier b(Modifier modifier3, boolean z6) {
                        return LayoutModifierKt.a(modifier3, new ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1$exposedDropdownSize$1(z6, mutableIntState, mutableIntState2));
                    }

                    @Override // androidx.compose.material3.ExposedDropdownMenuBoxScope
                    public final String c() {
                        return ((MenuAnchorType) mutableState2.getValue()).f9729a;
                    }
                };
                g2.o(u7);
            }
            ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1 exposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1 = (ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1) u7;
            boolean w = g2.w(view) | g2.c(F0);
            Object u8 = g2.u();
            if (w || u8 == composer$Companion$Empty$1) {
                i5 = F0;
                density = density2;
                u8 = new ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$1$1(view, i5, mutableState, mutableIntState, mutableIntState2);
                g2.o(u8);
            } else {
                i5 = F0;
                density = density2;
            }
            Modifier a3 = OnGloballyPositionedModifierKt.a(modifier2, (l) u8);
            MeasurePolicy e = BoxKt.e(Alignment.Companion.f14659a, false);
            int i10 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, a3);
            ComposeUiNode.h8.getClass();
            q0.a aVar = ComposeUiNode.Companion.f15895b;
            modifier = modifier2;
            if (!(g2.f13691a instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            g2.z();
            if (g2.O) {
                g2.B(aVar);
            } else {
                g2.n();
            }
            Updater.b(g2, e, ComposeUiNode.Companion.f15898g);
            Updater.b(g2, Q, ComposeUiNode.Companion.f15897f);
            p pVar = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i10))) {
                d.x(i10, g2, i10, pVar);
            }
            Updater.b(g2, c2, ComposeUiNode.Companion.d);
            qVar = qVar2;
            qVar.invoke(exposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1, g2, Integer.valueOf((i2 >> 6) & 112));
            g2.V(true);
            g2.J(426363998);
            if (z4) {
                boolean w2 = g2.w(view) | g2.c(i5);
                Object u9 = g2.u();
                if (w2 || u9 == composer$Companion$Empty$1) {
                    u9 = new ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$3$1(view, i5, mutableState, mutableIntState2);
                    g2.o(u9);
                }
                z2 = false;
                ExposedDropdownMenu_androidKt.a(view, density, (q0.a) u9, g2, 0);
            } else {
                z2 = false;
            }
            g2.V(z2);
            boolean z6 = i8 == 4;
            Object u10 = g2.u();
            if (z6 || u10 == composer$Companion$Empty$1) {
                z3 = z4;
                u10 = new ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$4$1(z3, focusRequester);
                g2.o(u10);
            } else {
                z3 = z4;
            }
            g2.L((q0.a) u10);
            boolean z7 = i9 == 32;
            Object u11 = g2.u();
            if (z7 || u11 == composer$Companion$Empty$1) {
                lVar = lVar2;
                u11 = new ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$5$1(lVar);
                g2.o(u11);
            } else {
                lVar = lVar2;
            }
            BackHandlerKt.a(z3, (q0.a) u11, g2, i8, 0);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$6(z3, lVar, modifier, qVar, i4, i3);
        }
        return b0.f30125a;
    }
}

package com.cooldev.gba.emulator.gameboy.features.manage_sub.widgets;

import android.support.v4.media.d;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnitKt;
import com.applovin.impl.adview.t;
import com.cooldev.gba.emulator.gameboy.constants.MyFonts;
import com.cooldev.gba.emulator.gameboy.constants.MyImages;
import com.cooldev.gba.emulator.gameboy.features.app.logic.PaywallNavigationViewModel;
import org.jetbrains.annotations.Nullable;
import org.koin.core.scope.Scope;
import org.objectweb.asm.Opcodes;
import q0.a;
import q0.p;

/* loaded from: classes2.dex */
public final class BoxEmptySubscriptionKt {
    @ComposableTarget
    @Composable
    public static final void BoxEmptySubscription(@Nullable Composer composer, int i2) {
        ComposerImpl g2 = composer.g(632906006);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            Modifier.Companion companion = Modifier.Companion.f14687a;
            float f2 = 16;
            Modifier h2 = PaddingKt.h(SizeKt.d(companion, 1.0f), f2, 0.0f, 2);
            MeasurePolicy e = BoxKt.e(Alignment.Companion.f14659a, false);
            int i3 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, h2);
            ComposeUiNode.h8.getClass();
            a aVar = ComposeUiNode.Companion.f15895b;
            Applier applier = g2.f13691a;
            if (!(applier instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            g2.z();
            if (g2.O) {
                g2.B(aVar);
            } else {
                g2.n();
            }
            p pVar = ComposeUiNode.Companion.f15898g;
            Updater.b(g2, e, pVar);
            p pVar2 = ComposeUiNode.Companion.f15897f;
            Updater.b(g2, Q, pVar2);
            p pVar3 = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i3))) {
                d.x(i3, g2, i3, pVar3);
            }
            p pVar4 = ComposeUiNode.Companion.d;
            Updater.b(g2, c2, pVar4);
            MyImages myImages = MyImages.INSTANCE;
            ImageKt.a(PainterResources_androidKt.a(myImages.getManageSub(), g2, 6), null, SizeKt.t(SizeKt.d(companion, 1.0f)), null, ContentScale.Companion.f15724g, 0.0f, null, g2, 25016, 104);
            BiasAlignment.Horizontal horizontal = Alignment.Companion.f14670n;
            Arrangement$Center$1 arrangement$Center$1 = Arrangement.e;
            Modifier i4 = PaddingKt.i(companion, f2, 20, f2, 32);
            ColumnMeasurePolicy a2 = ColumnKt.a(arrangement$Center$1, horizontal, g2, 54);
            int i5 = g2.P;
            PersistentCompositionLocalMap Q2 = g2.Q();
            Modifier c3 = ComposedModifierKt.c(g2, i4);
            if (!(applier instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            g2.z();
            if (g2.O) {
                g2.B(aVar);
            } else {
                g2.n();
            }
            Updater.b(g2, a2, pVar);
            Updater.b(g2, Q2, pVar2);
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i5))) {
                d.x(i5, g2, i5, pVar3);
            }
            Updater.b(g2, c3, pVar4);
            ImageKt.a(PainterResources_androidKt.a(myImages.getManageSub1(), g2, 6), null, SizeKt.e(companion, Opcodes.DCMPG), null, null, 0.0f, null, g2, 440, 120);
            long b2 = TextUnitKt.b(16);
            long b3 = TextUnitKt.b(24);
            TextKt.b("The plan you purchase will\nappear here", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(Color.f14958c, b2, new FontWeight(400), MyFonts.INSTANCE.getInter(), 0L, null, 3, b3, 16613336), g2, 6, 0, 65534);
            SpacerKt.a(SizeKt.e(companion, 10), g2);
            ButtonViewYourPlan(g2, 0);
            g2.V(true);
            g2.V(true);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new BoxEmptySubscriptionKt$BoxEmptySubscription$2(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget
    @Composable
    public static final void ButtonViewYourPlan(Composer composer, int i2) {
        ComposerImpl g2 = composer.g(-1811330518);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            Scope q2 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y2 = t.y(g2, false, 511388516, null) | g2.I(q2);
            Object u2 = g2.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (y2 || u2 == composer$Companion$Empty$1) {
                u2 = t.g(PaywallNavigationViewModel.class, q2, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            PaywallNavigationViewModel paywallNavigationViewModel = (PaywallNavigationViewModel) u2;
            Object e = t.e(g2, 1598786116, 757210042);
            if (e == composer$Companion$Empty$1) {
                e = SnapshotLongStateKt.a(0L);
                g2.o(e);
            }
            g2.V(false);
            BoxEmptySubscriptionKt$ButtonViewYourPlan$$inlined$debounced$1 boxEmptySubscriptionKt$ButtonViewYourPlan$$inlined$debounced$1 = new BoxEmptySubscriptionKt$ButtonViewYourPlan$$inlined$debounced$1(500L, (MutableLongState) e, paywallNavigationViewModel);
            g2.V(false);
            PaddingValuesImpl a2 = PaddingKt.a(3, 0.0f);
            Modifier e2 = SizeKt.e(SizeKt.d(Modifier.Companion.f14687a, 1.0f), 52);
            RoundedCornerShape a3 = RoundedCornerShapeKt.a(0);
            PaddingValuesImpl paddingValuesImpl = ButtonDefaults.f8037a;
            ButtonColors a4 = ButtonDefaults.a(Color.f14961h, g2);
            g2.J(-1030600919);
            boolean I = g2.I(boxEmptySubscriptionKt$ButtonViewYourPlan$$inlined$debounced$1);
            Object u3 = g2.u();
            if (I || u3 == composer$Companion$Empty$1) {
                u3 = new BoxEmptySubscriptionKt$ButtonViewYourPlan$1$1(boxEmptySubscriptionKt$ButtonViewYourPlan$$inlined$debounced$1);
                g2.o(u3);
            }
            g2.V(false);
            ButtonKt.a((a) u3, e2, false, a3, a4, null, null, a2, null, ComposableSingletons$BoxEmptySubscriptionKt.INSTANCE.m260getLambda1$gba_v1_0_35_54__09Apr2025_1046_release(), g2, 817889328, 356);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new BoxEmptySubscriptionKt$ButtonViewYourPlan$2(i2);
        }
    }
}

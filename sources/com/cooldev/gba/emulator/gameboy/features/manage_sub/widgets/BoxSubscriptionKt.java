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
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.TextUnitKt;
import com.android.billingclient.api.Purchase;
import com.applovin.impl.adview.t;
import com.cooldev.gba.emulator.gameboy.constants.MyColors;
import com.cooldev.gba.emulator.gameboy.constants.MyFonts;
import com.cooldev.gba.emulator.gameboy.constants.MyImages;
import com.cooldev.gba.emulator.gameboy.features.dialogs.cancel_sub_dialog.logic.CancelSubDialogViewModel;
import com.cooldev.gba.emulator.gameboy.features.manage_sub.utils.ManageSubscriptionUtil;
import com.cooldev.gba.emulator.gameboy.features.paywalls.enums.BillingEnum;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPState;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel;
import e0.u;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import org.koin.core.scope.Scope;
import p0.a;
import q0.p;

/* loaded from: classes.dex */
public final class BoxSubscriptionKt {
    @ComposableTarget
    @Composable
    public static final void BoxSubscription(@Nullable Composer composer, int i2) {
        String str;
        List<String> products;
        ComposerImpl g2 = composer.g(1448333412);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            Scope q2 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y2 = t.y(g2, false, 511388516, null) | g2.I(q2);
            Object u2 = g2.u();
            if (y2 || u2 == Composer.Companion.f13690a) {
                u2 = t.g(IAPViewModel.class, q2, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            IAPState iAPState = (IAPState) t.f((IAPViewModel) u2, g2, 8);
            Purchase currentPurchase = iAPState.getCurrentPurchase();
            if (currentPurchase == null || (products = currentPurchase.getProducts()) == null || (str = (String) u.F0(products)) == null) {
                str = "";
            }
            ManageSubscriptionUtil manageSubscriptionUtil = ManageSubscriptionUtil.INSTANCE;
            String billingTitleFromProductId = manageSubscriptionUtil.getBillingTitleFromProductId(str);
            Purchase currentPurchase2 = iAPState.getCurrentPurchase();
            String purchaseTimeDisplay = manageSubscriptionUtil.purchaseTimeDisplay(currentPurchase2 != null ? Long.valueOf(currentPurchase2.getPurchaseTime()) : null);
            if (a.g(str, BillingEnum.LIFETIME.getSkuId())) {
                g2.J(-39485293);
                LifeTimeWidget(billingTitleFromProductId, purchaseTimeDisplay, g2, 0);
                g2.V(false);
            } else {
                g2.J(-39428625);
                SubscriptionWidget(billingTitleFromProductId, purchaseTimeDisplay, g2, 0);
                g2.V(false);
            }
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new BoxSubscriptionKt$BoxSubscription$1(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget
    @Composable
    public static final void ButtonCancelSub(Composer composer, int i2) {
        ComposerImpl g2 = composer.g(2072234776);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            Scope q2 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y2 = t.y(g2, false, 511388516, null) | g2.I(q2);
            Object u2 = g2.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (y2 || u2 == composer$Companion$Empty$1) {
                u2 = t.g(CancelSubDialogViewModel.class, q2, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            CancelSubDialogViewModel cancelSubDialogViewModel = (CancelSubDialogViewModel) u2;
            Object e = t.e(g2, 1598786116, 757210042);
            if (e == composer$Companion$Empty$1) {
                e = SnapshotLongStateKt.a(0L);
                g2.o(e);
            }
            g2.V(false);
            BoxSubscriptionKt$ButtonCancelSub$$inlined$debounced$1 boxSubscriptionKt$ButtonCancelSub$$inlined$debounced$1 = new BoxSubscriptionKt$ButtonCancelSub$$inlined$debounced$1(500L, (MutableLongState) e, cancelSubDialogViewModel);
            g2.V(false);
            PaddingValuesImpl a2 = PaddingKt.a(3, 0.0f);
            Modifier e2 = SizeKt.e(SizeKt.d(Modifier.Companion.f14687a, 1.0f), 52);
            RoundedCornerShape a3 = RoundedCornerShapeKt.a(0);
            PaddingValuesImpl paddingValuesImpl = ButtonDefaults.f8037a;
            ButtonColors a4 = ButtonDefaults.a(Color.f14961h, g2);
            g2.J(1754982546);
            boolean I = g2.I(boxSubscriptionKt$ButtonCancelSub$$inlined$debounced$1);
            Object u3 = g2.u();
            if (I || u3 == composer$Companion$Empty$1) {
                u3 = new BoxSubscriptionKt$ButtonCancelSub$1$1(boxSubscriptionKt$ButtonCancelSub$$inlined$debounced$1);
                g2.o(u3);
            }
            g2.V(false);
            ButtonKt.a((q0.a) u3, e2, false, a3, a4, null, null, a2, null, ComposableSingletons$BoxSubscriptionKt.INSTANCE.m261getLambda1$gba_v1_0_35_54__09Apr2025_1046_release(), g2, 817889328, 356);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new BoxSubscriptionKt$ButtonCancelSub$2(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget
    @Composable
    public static final void LifeTimeWidget(String str, String str2, Composer composer, int i2) {
        int i3;
        ComposerImpl composerImpl;
        ComposerImpl g2 = composer.g(-1879598923);
        if ((i2 & 14) == 0) {
            i3 = (g2.I(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= g2.I(str2) ? 32 : 16;
        }
        int i4 = i3;
        if ((i4 & 91) == 18 && g2.i()) {
            g2.A();
            composerImpl = g2;
        } else {
            Modifier.Companion companion = Modifier.Companion.f14687a;
            float f2 = 16;
            Modifier h2 = PaddingKt.h(SizeKt.d(companion, 1.0f), f2, 0.0f, 2);
            MeasurePolicy e = BoxKt.e(Alignment.Companion.f14659a, false);
            int i5 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, h2);
            ComposeUiNode.h8.getClass();
            q0.a aVar = ComposeUiNode.Companion.f15895b;
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
            if (g2.O || !a.g(g2.u(), Integer.valueOf(i5))) {
                d.x(i5, g2, i5, pVar3);
            }
            p pVar4 = ComposeUiNode.Companion.d;
            Updater.b(g2, c2, pVar4);
            ImageKt.a(PainterResources_androidKt.a(MyImages.INSTANCE.getManageSub(), g2, 6), null, SizeKt.t(SizeKt.d(companion, 1.0f)), null, ContentScale.Companion.f15724g, 0.0f, null, g2, 25016, 104);
            BiasAlignment.Horizontal horizontal = Alignment.Companion.f14670n;
            Arrangement$Center$1 arrangement$Center$1 = Arrangement.e;
            Modifier g3 = PaddingKt.g(companion, f2, 32);
            ColumnMeasurePolicy a2 = ColumnKt.a(arrangement$Center$1, horizontal, g2, 54);
            int i6 = g2.P;
            PersistentCompositionLocalMap Q2 = g2.Q();
            Modifier c3 = ComposedModifierKt.c(g2, g3);
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
            if (g2.O || !a.g(g2.u(), Integer.valueOf(i6))) {
                d.x(i6, g2, i6, pVar3);
            }
            Updater.b(g2, c3, pVar4);
            long m27getText220d7_KjU = MyColors.INSTANCE.m27getText220d7_KjU();
            long b2 = TextUnitKt.b(64);
            long b3 = TextUnitKt.b(72);
            FontWeight fontWeight = FontWeight.f17264b;
            MyFonts myFonts = MyFonts.INSTANCE;
            TextKt.b(str, null, m27getText220d7_KjU, b2, null, fontWeight, myFonts.getDeterminationSans(), 0L, null, new TextAlign(3), b3, 0, false, 0, 0, null, null, g2, (i4 & 14) | 1772928, 6, 129426);
            SpacerKt.a(SizeKt.e(companion, f2), g2);
            long j2 = Color.f14958c;
            TextKt.b("Subscriber since", null, j2, TextUnitKt.b(16), null, fontWeight, myFonts.getInter(), 0L, null, new TextAlign(3), TextUnitKt.b(24), 0, false, 0, 0, null, null, g2, 1772934, 6, 129426);
            SpacerKt.a(SizeKt.e(companion, 4), g2);
            long b4 = TextUnitKt.b(20);
            long b5 = TextUnitKt.b(28);
            FontWeight fontWeight2 = FontWeight.f17266f;
            TextKt.b(str2, null, j2, b4, null, fontWeight2, myFonts.getInter(), 0L, null, new TextAlign(3), b5, 0, false, 0, 0, null, null, g2, ((i4 >> 3) & 14) | 1772928, 6, 129426);
            SpacerKt.a(SizeKt.e(companion, 46), g2);
            composerImpl = g2;
            TextKt.b("Thanks for your support to the developer. Enjoy your experience.", null, j2, TextUnitKt.b(16), null, fontWeight2, myFonts.getInter(), 0L, null, new TextAlign(3), TextUnitKt.b(24), 0, false, 0, 0, null, null, composerImpl, 1772934, 6, 129426);
            composerImpl.V(true);
            composerImpl.V(true);
        }
        RecomposeScopeImpl Z = composerImpl.Z();
        if (Z != null) {
            Z.d = new BoxSubscriptionKt$LifeTimeWidget$2(str, str2, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget
    @Composable
    public static final void SubscriptionWidget(String str, String str2, Composer composer, int i2) {
        int i3;
        ComposerImpl composerImpl;
        ComposerImpl g2 = composer.g(557792745);
        if ((i2 & 14) == 0) {
            i3 = (g2.I(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= g2.I(str2) ? 32 : 16;
        }
        int i4 = i3;
        if ((i4 & 91) == 18 && g2.i()) {
            g2.A();
            composerImpl = g2;
        } else {
            Modifier.Companion companion = Modifier.Companion.f14687a;
            float f2 = 16;
            Modifier h2 = PaddingKt.h(SizeKt.d(companion, 1.0f), f2, 0.0f, 2);
            MeasurePolicy e = BoxKt.e(Alignment.Companion.f14659a, false);
            int i5 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, h2);
            ComposeUiNode.h8.getClass();
            q0.a aVar = ComposeUiNode.Companion.f15895b;
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
            if (g2.O || !a.g(g2.u(), Integer.valueOf(i5))) {
                d.x(i5, g2, i5, pVar3);
            }
            p pVar4 = ComposeUiNode.Companion.d;
            Updater.b(g2, c2, pVar4);
            ImageKt.a(PainterResources_androidKt.a(MyImages.INSTANCE.getManageSub(), g2, 6), null, SizeKt.t(SizeKt.d(companion, 1.0f)), null, ContentScale.Companion.f15724g, 0.0f, null, g2, 25016, 104);
            BiasAlignment.Horizontal horizontal = Alignment.Companion.f14670n;
            Arrangement$Center$1 arrangement$Center$1 = Arrangement.e;
            Modifier i6 = PaddingKt.i(companion, f2, 20, f2, 32);
            ColumnMeasurePolicy a2 = ColumnKt.a(arrangement$Center$1, horizontal, g2, 54);
            int i7 = g2.P;
            PersistentCompositionLocalMap Q2 = g2.Q();
            Modifier c3 = ComposedModifierKt.c(g2, i6);
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
            if (g2.O || !a.g(g2.u(), Integer.valueOf(i7))) {
                d.x(i7, g2, i7, pVar3);
            }
            Updater.b(g2, c3, pVar4);
            long m27getText220d7_KjU = MyColors.INSTANCE.m27getText220d7_KjU();
            long b2 = TextUnitKt.b(64);
            long b3 = TextUnitKt.b(72);
            FontWeight fontWeight = FontWeight.f17264b;
            MyFonts myFonts = MyFonts.INSTANCE;
            TextKt.b(str, null, m27getText220d7_KjU, b2, null, fontWeight, myFonts.getDeterminationSans(), 0L, null, new TextAlign(3), b3, 0, false, 0, 0, null, null, g2, (i4 & 14) | 1772928, 6, 129426);
            SpacerKt.a(SizeKt.e(companion, f2), g2);
            long j2 = Color.f14958c;
            TextKt.b("Subscriber since", null, j2, TextUnitKt.b(16), null, fontWeight, myFonts.getInter(), 0L, null, new TextAlign(3), TextUnitKt.b(24), 0, false, 0, 0, null, null, g2, 1772934, 6, 129426);
            SpacerKt.a(SizeKt.e(companion, 4), g2);
            TextKt.b(str2, null, j2, TextUnitKt.b(20), null, FontWeight.f17266f, myFonts.getInter(), 0L, null, new TextAlign(3), TextUnitKt.b(28), 0, false, 0, 0, null, null, g2, ((i4 >> 3) & 14) | 1772928, 6, 129426);
            composerImpl = g2;
            SpacerKt.a(SizeKt.e(companion, 46), composerImpl);
            ButtonCancelSub(composerImpl, 0);
            composerImpl.V(true);
            composerImpl.V(true);
        }
        RecomposeScopeImpl Z = composerImpl.Z();
        if (Z != null) {
            Z.d = new BoxSubscriptionKt$SubscriptionWidget$2(str, str2, i2);
        }
    }
}

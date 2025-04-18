package com.cooldev.gba.emulator.gameboy.features.paywalls.paywall_default.widgets;

import android.content.Context;
import android.support.v4.media.d;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.navigation.NavHostController;
import com.android.billingclient.api.SkuDetails;
import com.applovin.impl.adview.t;
import com.cooldev.gba.emulator.gameboy.constants.MyColors;
import com.cooldev.gba.emulator.gameboy.constants.MyFonts;
import com.cooldev.gba.emulator.gameboy.constants.MyImages;
import com.cooldev.gba.emulator.gameboy.extensions.DebounceExtensionsKt;
import com.cooldev.gba.emulator.gameboy.features.paywalls.enums.BillingEnum;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPState;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel;
import com.cooldev.gba.emulator.gameboy.features.paywalls.utils.PurchaseUtil;
import com.cooldev.gba.emulator.gameboy.network.models.SlackMessage;
import com.cooldev.gba.emulator.gameboy.network.repo.SlackApiRepositoryImpl;
import com.cooldev.gba.emulator.gameboy.router.MultiNavigationAppStateKt;
import e0.u;
import java.util.Comparator;
import java.util.Locale;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.Nullable;
import org.koin.core.scope.Scope;
import q0.a;
import q0.p;

/* loaded from: classes3.dex */
public final class BillingsPaywallDefaultKt {
    @ComposableTarget
    @Composable
    public static final void BillingsPaywallDefault(@Nullable Composer composer, int i2) {
        ComposerImpl g2 = composer.g(-602316715);
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
            IAPViewModel iAPViewModel = (IAPViewModel) u2;
            IAPState iAPState = (IAPState) t.f(iAPViewModel, g2, 8);
            Modifier.Companion companion = Modifier.Companion.f14687a;
            Modifier h2 = PaddingKt.h(companion, 16, 0.0f, 2);
            ColumnMeasurePolicy a2 = ColumnKt.a(Arrangement.f3774c, Alignment.Companion.f14669m, g2, 0);
            int i3 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, h2);
            ComposeUiNode.h8.getClass();
            a aVar = ComposeUiNode.Companion.f15895b;
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
            Updater.b(g2, a2, ComposeUiNode.Companion.f15898g);
            Updater.b(g2, Q, ComposeUiNode.Companion.f15897f);
            p pVar = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i3))) {
                d.x(i3, g2, i3, pVar);
            }
            Updater.b(g2, c2, ComposeUiNode.Companion.d);
            g2.J(1462573654);
            for (SkuDetails skuDetails : u.T0(iAPState.getBillings(), new Comparator() { // from class: com.cooldev.gba.emulator.gameboy.features.paywalls.paywall_default.widgets.BillingsPaywallDefaultKt$BillingsPaywallDefault$lambda$2$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t2, T t3) {
                    int sortOrderDefault;
                    int sortOrderDefault2;
                    String sku = ((SkuDetails) t2).getSku();
                    p0.a.r(sku, "getSku(...)");
                    sortOrderDefault = BillingsPaywallDefaultKt.getSortOrderDefault(sku);
                    Integer valueOf = Integer.valueOf(sortOrderDefault);
                    String sku2 = ((SkuDetails) t3).getSku();
                    p0.a.r(sku2, "getSku(...)");
                    sortOrderDefault2 = BillingsPaywallDefaultKt.getSortOrderDefault(sku2);
                    return q.c(valueOf, Integer.valueOf(sortOrderDefault2));
                }
            })) {
                String sku = skuDetails.getSku();
                if (p0.a.g(sku, BillingEnum.LIFETIME.getSkuId())) {
                    g2.J(254954568);
                    PurchaseLifetime(iAPViewModel, skuDetails, g2, 72);
                    SpacerKt.a(SizeKt.e(companion, 20), g2);
                    g2.V(false);
                } else {
                    BillingEnum billingEnum = BillingEnum.YEARLY;
                    if (p0.a.g(sku, billingEnum.getSkuId())) {
                        g2.J(255140568);
                        if (iAPState.isFreeYearlyPurchaseVisible()) {
                            PurchaseFreeTrial(iAPViewModel, skuDetails, billingEnum, g2, 456);
                            SpacerKt.a(SizeKt.e(companion, 20), g2);
                        }
                        g2.V(false);
                    } else {
                        BillingEnum billingEnum2 = BillingEnum.WEEKLY;
                        if (p0.a.g(sku, billingEnum2.getSkuId())) {
                            g2.J(255434231);
                            if (!iAPState.isFreeYearlyPurchaseVisible()) {
                                PurchaseFreeTrial(iAPViewModel, skuDetails, billingEnum2, g2, 456);
                                SpacerKt.a(SizeKt.e(companion, 20), g2);
                            }
                            g2.V(false);
                        } else if (p0.a.g(sku, BillingEnum.MONTHLY.getSkuId())) {
                            g2.J(255726313);
                            PurchaseMonthly(iAPViewModel, skuDetails, g2, 72);
                            SpacerKt.a(SizeKt.e(companion, 20), g2);
                            g2.V(false);
                        } else {
                            g2.J(255883824);
                            g2.V(false);
                        }
                    }
                }
            }
            g2.V(false);
            g2.V(true);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new BillingsPaywallDefaultKt$BillingsPaywallDefault$2(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget
    @Composable
    public static final void PurchaseFreeTrial(IAPViewModel iAPViewModel, SkuDetails skuDetails, BillingEnum billingEnum, Composer composer, int i2) {
        a aVar;
        p pVar;
        ComposerImpl g2 = composer.g(370171552);
        Context context = (Context) g2.K(AndroidCompositionLocals_androidKt.f16325b);
        NavHostController getNavController = MultiNavigationAppStateKt.getLocalNavigationState().getRootNavigation().getGetNavController();
        PurchaseUtil purchaseUtil = PurchaseUtil.INSTANCE;
        String subscriptionPeriodDescription = purchaseUtil.getSubscriptionPeriodDescription(purchaseUtil.parseSubscriptionPeriodDetails(skuDetails.getFreeTrialPeriod()));
        String title = billingEnum.getTitle();
        String str = "Try " + subscriptionPeriodDescription + " free, then " + purchaseUtil.formatPrice(Long.valueOf(skuDetails.getPriceAmountMicros()), skuDetails.getPriceCurrencyCode()) + '/' + title;
        BiasAlignment.Horizontal horizontal = Alignment.Companion.f14670n;
        Arrangement$Center$1 arrangement$Center$1 = Arrangement.e;
        Modifier.Companion companion = Modifier.Companion.f14687a;
        ColumnMeasurePolicy a2 = ColumnKt.a(arrangement$Center$1, horizontal, g2, 54);
        int i3 = g2.P;
        PersistentCompositionLocalMap Q = g2.Q();
        Modifier c2 = ComposedModifierKt.c(g2, companion);
        ComposeUiNode.h8.getClass();
        a aVar2 = ComposeUiNode.Companion.f15895b;
        Applier applier = g2.f13691a;
        if (!(applier instanceof Applier)) {
            ComposablesKt.a();
            throw null;
        }
        g2.z();
        if (g2.O) {
            g2.B(aVar2);
        } else {
            g2.n();
        }
        p pVar2 = ComposeUiNode.Companion.f15898g;
        Updater.b(g2, a2, pVar2);
        p pVar3 = ComposeUiNode.Companion.f15897f;
        Updater.b(g2, Q, pVar3);
        p pVar4 = ComposeUiNode.Companion.f15900i;
        if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i3))) {
            d.x(i3, g2, i3, pVar4);
        }
        p pVar5 = ComposeUiNode.Companion.d;
        Updater.b(g2, c2, pVar5);
        long b2 = TextUnitKt.b(12);
        long b3 = TextUnitKt.b(16);
        MyFonts myFonts = MyFonts.INSTANCE;
        FontFamily inter = myFonts.getInter();
        FontWeight fontWeight = new FontWeight(400);
        MyColors myColors = MyColors.INSTANCE;
        TextKt.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(myColors.m14getText100d7_KjU(), b2, fontWeight, inter, 0L, null, 3, b3, 16613336), g2, 0, 0, 65534);
        SpacerKt.a(SizeKt.e(companion, 8), g2);
        Modifier debouncedClickable$default = DebounceExtensionsKt.debouncedClickable$default(SizeKt.d(SizeKt.e(companion, 68), 1.0f), false, 0L, new BillingsPaywallDefaultKt$PurchaseFreeTrial$1$1(iAPViewModel, skuDetails, getNavController, context), 3, null);
        MeasurePolicy e = BoxKt.e(Alignment.Companion.f14660b, false);
        int i4 = g2.P;
        PersistentCompositionLocalMap Q2 = g2.Q();
        Modifier c3 = ComposedModifierKt.c(g2, debouncedClickable$default);
        if (!(applier instanceof Applier)) {
            ComposablesKt.a();
            throw null;
        }
        g2.z();
        if (g2.O) {
            aVar = aVar2;
            g2.B(aVar);
        } else {
            aVar = aVar2;
            g2.n();
        }
        Updater.b(g2, e, pVar2);
        Updater.b(g2, Q2, pVar3);
        if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i4))) {
            pVar = pVar4;
            d.x(i4, g2, i4, pVar);
        } else {
            pVar = pVar4;
        }
        Updater.b(g2, c3, pVar5);
        p pVar6 = pVar;
        ImageKt.a(PainterResources_androidKt.a(MyImages.INSTANCE.getButton4(), g2, 6), null, SizeKt.f4107c, null, ContentScale.Companion.f15724g, 0.0f, null, g2, 25016, 104);
        Modifier j2 = PaddingKt.j(companion, 0.0f, 4, 0.0f, 0.0f, 13);
        ColumnMeasurePolicy a3 = ColumnKt.a(Arrangement.f3774c, horizontal, g2, 54);
        int i5 = g2.P;
        PersistentCompositionLocalMap Q3 = g2.Q();
        Modifier c4 = ComposedModifierKt.c(g2, j2);
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
        Updater.b(g2, a3, pVar2);
        Updater.b(g2, Q3, pVar3);
        if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i5))) {
            d.x(i5, g2, i5, pVar6);
        }
        Updater.b(g2, c4, pVar5);
        long b4 = TextUnitKt.b(24);
        long b5 = TextUnitKt.b(32);
        TextKt.b("START FREE TRIAL", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(myColors.m25getText200d7_KjU(), b4, new FontWeight(400), myFonts.getDeterminationSans(), 0L, null, 3, b5, 16613336), g2, 6, 0, 65534);
        StringBuilder sb = new StringBuilder("Auto-renew ");
        String lowerCase = billingEnum.getTitle().toLowerCase(Locale.ROOT);
        p0.a.r(lowerCase, "toLowerCase(...)");
        sb.append(lowerCase);
        sb.append(". Cancel anytime");
        String sb2 = sb.toString();
        long b6 = TextUnitKt.b(12);
        long b7 = TextUnitKt.b(16);
        TextKt.b(sb2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(myColors.m25getText200d7_KjU(), b6, new FontWeight(400), myFonts.getInter(), 0L, null, 3, b7, 16613336), g2, 0, 0, 65534);
        g2.V(true);
        g2.V(true);
        g2.V(true);
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new BillingsPaywallDefaultKt$PurchaseFreeTrial$2(iAPViewModel, skuDetails, billingEnum, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget
    @Composable
    public static final void PurchaseLifetime(IAPViewModel iAPViewModel, SkuDetails skuDetails, Composer composer, int i2) {
        ComposerImpl g2 = composer.g(-2024373421);
        Context context = (Context) g2.K(AndroidCompositionLocals_androidKt.f16325b);
        NavHostController getNavController = MultiNavigationAppStateKt.getLocalNavigationState().getRootNavigation().getGetNavController();
        String price = skuDetails.getPrice();
        p0.a.r(price, "getPrice(...)");
        AnnotatedString.Builder builder = new AnnotatedString.Builder();
        MyColors myColors = MyColors.INSTANCE;
        int e = builder.e(new SpanStyle(myColors.m16getText120d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
        try {
            builder.c("Lifetime");
            builder.d(e);
            builder.c(" - One for forever");
            AnnotatedString f2 = builder.f();
            Modifier.Companion companion = Modifier.Companion.f14687a;
            Modifier debouncedClickable$default = DebounceExtensionsKt.debouncedClickable$default(SizeKt.d(SizeKt.e(companion, 68), 1.0f), false, 0L, new BillingsPaywallDefaultKt$PurchaseLifetime$1(iAPViewModel, skuDetails, getNavController, context), 3, null);
            MeasurePolicy e2 = BoxKt.e(Alignment.Companion.f14659a, false);
            int i3 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, debouncedClickable$default);
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
            Updater.b(g2, e2, pVar);
            p pVar2 = ComposeUiNode.Companion.f15897f;
            Updater.b(g2, Q, pVar2);
            p pVar3 = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i3))) {
                d.x(i3, g2, i3, pVar3);
            }
            p pVar4 = ComposeUiNode.Companion.d;
            Updater.b(g2, c2, pVar4);
            ImageKt.a(PainterResources_androidKt.a(MyImages.INSTANCE.getButton6(), g2, 6), null, SizeKt.f4107c, null, ContentScale.Companion.f15724g, 0.0f, null, g2, 25016, 104);
            Modifier j2 = PaddingKt.j(SizeKt.d(companion, 1.0f), 32, 4, 0.0f, 0.0f, 12);
            ColumnMeasurePolicy a2 = ColumnKt.a(Arrangement.e, Alignment.Companion.f14669m, g2, 54);
            int i4 = g2.P;
            PersistentCompositionLocalMap Q2 = g2.Q();
            Modifier c3 = ComposedModifierKt.c(g2, j2);
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
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i4))) {
                d.x(i4, g2, i4, pVar3);
            }
            Updater.b(g2, c3, pVar4);
            long b2 = TextUnitKt.b(24);
            long b3 = TextUnitKt.b(32);
            MyFonts myFonts = MyFonts.INSTANCE;
            TextKt.b(price, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(myColors.m15getText110d7_KjU(), b2, new FontWeight(400), myFonts.getDeterminationSans(), 0L, null, 3, b3, 16613336), g2, 0, 0, 65534);
            long b4 = TextUnitKt.b(12);
            long b5 = TextUnitKt.b(16);
            TextKt.c(f2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, new TextStyle(myColors.m38getText80d7_KjU(), b4, new FontWeight(400), myFonts.getInter(), 0L, null, 3, b5, 16613336), g2, 0, 0, 131070);
            g2.V(true);
            g2.V(true);
            RecomposeScopeImpl Z = g2.Z();
            if (Z != null) {
                Z.d = new BillingsPaywallDefaultKt$PurchaseLifetime$3(iAPViewModel, skuDetails, i2);
            }
        } catch (Throwable th) {
            builder.d(e);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget
    @Composable
    public static final void PurchaseMonthly(IAPViewModel iAPViewModel, SkuDetails skuDetails, Composer composer, int i2) {
        ComposerImpl g2 = composer.g(1199848141);
        Context context = (Context) g2.K(AndroidCompositionLocals_androidKt.f16325b);
        NavHostController getNavController = MultiNavigationAppStateKt.getLocalNavigationState().getRootNavigation().getGetNavController();
        String price = skuDetails.getPrice();
        p0.a.r(price, "getPrice(...)");
        AnnotatedString.Builder builder = new AnnotatedString.Builder();
        MyColors myColors = MyColors.INSTANCE;
        int e = builder.e(new SpanStyle(myColors.m16getText120d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
        try {
            builder.c("Monthly");
            builder.d(e);
            builder.c(" - Auto renew every month. Cancel anytime");
            AnnotatedString f2 = builder.f();
            Modifier.Companion companion = Modifier.Companion.f14687a;
            Modifier debouncedClickable$default = DebounceExtensionsKt.debouncedClickable$default(SizeKt.d(SizeKt.e(companion, 68), 1.0f), false, 0L, new BillingsPaywallDefaultKt$PurchaseMonthly$1(iAPViewModel, skuDetails, getNavController, context), 3, null);
            MeasurePolicy e2 = BoxKt.e(Alignment.Companion.f14660b, false);
            int i3 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, debouncedClickable$default);
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
            Updater.b(g2, e2, pVar);
            p pVar2 = ComposeUiNode.Companion.f15897f;
            Updater.b(g2, Q, pVar2);
            p pVar3 = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i3))) {
                d.x(i3, g2, i3, pVar3);
            }
            p pVar4 = ComposeUiNode.Companion.d;
            Updater.b(g2, c2, pVar4);
            ImageKt.a(PainterResources_androidKt.a(MyImages.INSTANCE.getButton5(), g2, 6), null, SizeKt.f4107c, null, ContentScale.Companion.f15724g, 0.0f, null, g2, 25016, 104);
            Modifier j2 = PaddingKt.j(SizeKt.d(companion, 1.0f), 32, 4, 0.0f, 0.0f, 12);
            ColumnMeasurePolicy a2 = ColumnKt.a(Arrangement.e, Alignment.Companion.f14669m, g2, 54);
            int i4 = g2.P;
            PersistentCompositionLocalMap Q2 = g2.Q();
            Modifier c3 = ComposedModifierKt.c(g2, j2);
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
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i4))) {
                d.x(i4, g2, i4, pVar3);
            }
            Updater.b(g2, c3, pVar4);
            long b2 = TextUnitKt.b(24);
            long b3 = TextUnitKt.b(32);
            MyFonts myFonts = MyFonts.INSTANCE;
            TextKt.b(price, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(myColors.m15getText110d7_KjU(), b2, new FontWeight(400), myFonts.getDeterminationSans(), 0L, null, 3, b3, 16613336), g2, 0, 0, 65534);
            long b4 = TextUnitKt.b(12);
            long b5 = TextUnitKt.b(16);
            TextKt.c(f2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, new TextStyle(myColors.m38getText80d7_KjU(), b4, new FontWeight(400), myFonts.getInter(), 0L, null, 3, b5, 16613336), g2, 0, 0, 131070);
            g2.V(true);
            g2.V(true);
            RecomposeScopeImpl Z = g2.Z();
            if (Z != null) {
                Z.d = new BillingsPaywallDefaultKt$PurchaseMonthly$3(iAPViewModel, skuDetails, i2);
            }
        } catch (Throwable th) {
            builder.d(e);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getSortOrderDefault(String str) {
        try {
            Locale locale = Locale.getDefault();
            p0.a.r(locale, "getDefault(...)");
            String lowerCase = str.toLowerCase(locale);
            p0.a.r(lowerCase, "toLowerCase(...)");
            if (p0.a.g(lowerCase, BillingEnum.WEEKLY.getSkuId())) {
                return 1;
            }
            if (p0.a.g(lowerCase, BillingEnum.YEARLY.getSkuId())) {
                return 2;
            }
            if (p0.a.g(lowerCase, BillingEnum.MONTHLY.getSkuId())) {
                return 3;
            }
            return p0.a.g(lowerCase, BillingEnum.LIFETIME.getSkuId()) ? 4 : 0;
        } catch (Throwable th) {
            new SlackApiRepositoryImpl().sendMessageToSlack(SlackMessage.Factory.template(th));
            return 0;
        }
    }
}

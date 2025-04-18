package com.cooldev.gba.emulator.gameboy.features.paywalls.paywall_lifetime.widgets;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.TextUnitKt;
import com.android.billingclient.api.SkuDetails;
import com.applovin.impl.adview.t;
import com.cooldev.gba.emulator.gameboy.constants.MyColors;
import com.cooldev.gba.emulator.gameboy.constants.MyFonts;
import com.cooldev.gba.emulator.gameboy.features.paywalls.enums.BillingEnum;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPState;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.PurchasePageState;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.PurchasePageViewModel;
import com.cooldev.gba.emulator.gameboy.features.paywalls.utils.PurchaseUtil;
import java.util.Locale;
import org.jetbrains.annotations.Nullable;
import org.koin.core.scope.Scope;
import p0.a;
import z0.m;

/* loaded from: classes2.dex */
public final class DescriptionPaywallLifetimeKt {
    @ComposableTarget
    @Composable
    public static final void DescriptionPaywallLifetime(@Nullable Composer composer, int i2) {
        String str;
        ComposerImpl g2 = composer.g(1153916075);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            Scope q2 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y2 = t.y(g2, false, 511388516, null) | g2.I(q2);
            Object u2 = g2.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (y2 || u2 == composer$Companion$Empty$1) {
                u2 = t.g(PurchasePageViewModel.class, q2, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            String storeDescription = ((PurchasePageState) SnapshotStateKt.b(((PurchasePageViewModel) u2).getState(), g2, 8).getValue()).getStoreDescription();
            Scope q3 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y3 = t.y(g2, false, 511388516, null) | g2.I(q3);
            Object u3 = g2.u();
            if (y3 || u3 == composer$Companion$Empty$1) {
                u3 = t.g(IAPViewModel.class, q3, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            IAPState iAPState = (IAPState) t.f((IAPViewModel) u3, g2, 8);
            SkuDetails findSkuDetailsBySkuId = iAPState.isFreeYearlyPurchaseVisible() ? iAPState.findSkuDetailsBySkuId(BillingEnum.YEARLY) : iAPState.findSkuDetailsBySkuId(BillingEnum.WEEKLY);
            PurchaseUtil purchaseUtil = PurchaseUtil.INSTANCE;
            String subscriptionPeriodDescription = purchaseUtil.getSubscriptionPeriodDescription(purchaseUtil.parseSubscriptionPeriodDetails(findSkuDetailsBySkuId != null ? findSkuDetailsBySkuId.getFreeTrialPeriod() : null));
            Locale locale = Locale.ROOT;
            String lowerCase = subscriptionPeriodDescription.toLowerCase(locale);
            a.r(lowerCase, "toLowerCase(...)");
            BillingEnum billingEnum = BillingEnum.WEEKLY;
            SkuDetails findSkuDetailsBySkuId2 = iAPState.findSkuDetailsBySkuId(billingEnum);
            String lowerCase2 = purchaseUtil.getSubscriptionUnit(findSkuDetailsBySkuId2 != null ? findSkuDetailsBySkuId2.getSubscriptionPeriod() : null).toLowerCase(locale);
            a.r(lowerCase2, "toLowerCase(...)");
            BillingEnum billingEnum2 = BillingEnum.YEARLY;
            SkuDetails findSkuDetailsBySkuId3 = iAPState.findSkuDetailsBySkuId(billingEnum2);
            String lowerCase3 = purchaseUtil.getSubscriptionUnit(findSkuDetailsBySkuId3 != null ? findSkuDetailsBySkuId3.getSubscriptionPeriod() : null).toLowerCase(locale);
            a.r(lowerCase3, "toLowerCase(...)");
            BillingEnum billingEnum3 = BillingEnum.MONTHLY;
            SkuDetails findSkuDetailsBySkuId4 = iAPState.findSkuDetailsBySkuId(billingEnum3);
            String lowerCase4 = purchaseUtil.getSubscriptionUnit(findSkuDetailsBySkuId4 != null ? findSkuDetailsBySkuId4.getSubscriptionPeriod() : null).toLowerCase(locale);
            a.r(lowerCase4, "toLowerCase(...)");
            String k12 = m.k1(m.k1(purchaseUtil.processText(storeDescription), "{FREE_TRIAL_TITLE}", iAPState.isFreeYearlyPurchaseVisible() ? billingEnum2.getTitle() : billingEnum.getTitle()), "{FREE_TRIAL_DURATION}", lowerCase);
            if (findSkuDetailsBySkuId == null || (str = findSkuDetailsBySkuId.getPrice()) == null) {
                str = "";
            }
            String k13 = m.k1(k12, "{FREE_TRIAL_PRICE}", str);
            if (iAPState.isFreeYearlyPurchaseVisible()) {
                lowerCase2 = lowerCase3;
            }
            String k14 = m.k1(m.k1(m.k1(m.k1(k13, "{FREE_TRIAL_PERIOD}", lowerCase2), "{MONTHLY_TITLE}", billingEnum3.getTitle()), "{MONTHLY_PRICE}", DescriptionPaywallLifetime$getPrice(iAPState, billingEnum3)), "{MONTHLY_PERIOD}", lowerCase4);
            BillingEnum billingEnum4 = BillingEnum.LIFETIME;
            TextKt.b(m.k1(m.k1(k14, "{LIFETIME_TITLE}", billingEnum4.getTitle()), "{LIFETIME_PRICE}", DescriptionPaywallLifetime$getPrice(iAPState, billingEnum4)), PaddingKt.h(Modifier.Companion.f14687a, 16, 0.0f, 2), MyColors.INSTANCE.m38getText80d7_KjU(), TextUnitKt.b(12), null, FontWeight.f17264b, MyFonts.INSTANCE.getInter(), 0L, null, new TextAlign(5), TextUnitKt.b(16), 0, false, 0, 0, null, null, g2, 1772976, 6, 129424);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new DescriptionPaywallLifetimeKt$DescriptionPaywallLifetime$1(i2);
        }
    }

    private static final String DescriptionPaywallLifetime$getPrice(IAPState iAPState, BillingEnum billingEnum) {
        SkuDetails findSkuDetailsBySkuId = iAPState.findSkuDetailsBySkuId(billingEnum);
        String price = findSkuDetailsBySkuId != null ? findSkuDetailsBySkuId.getPrice() : null;
        return price == null ? "" : price;
    }
}

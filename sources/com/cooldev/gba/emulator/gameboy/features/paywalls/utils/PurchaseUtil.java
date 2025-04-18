package com.cooldev.gba.emulator.gameboy.features.paywalls.utils;

import androidx.compose.runtime.internal.StabilityInferred;
import com.android.billingclient.api.SkuDetails;
import com.cooldev.gba.emulator.gameboy.network.models.SlackMessage;
import com.cooldev.gba.emulator.gameboy.network.repo.SlackApiRepositoryImpl;
import e0.u;
import e0.w;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import z0.m;

@StabilityInferred
/* loaded from: classes4.dex */
public final class PurchaseUtil {
    public static final int $stable = 0;

    @NotNull
    public static final PurchaseUtil INSTANCE = new PurchaseUtil();

    private PurchaseUtil() {
    }

    @NotNull
    public final String formatPrice(@Nullable Long l2, @Nullable String str) {
        if (l2 != null && str != null) {
            try {
                double longValue = l2.longValue() / 1000000.0d;
                NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
                a.r(currencyInstance, "getCurrencyInstance(...)");
                currencyInstance.setMaximumFractionDigits(0);
                currencyInstance.setCurrency(Currency.getInstance(str));
                String format = currencyInstance.format(longValue);
                a.r(format, "format(...)");
                return format;
            } catch (Throwable th) {
                new SlackApiRepositoryImpl().sendMessageToSlack(SlackMessage.Factory.template(th));
            }
        }
        return "";
    }

    @NotNull
    public final String getSubscriptionPeriodDescription(@NotNull SubscriptionPeriod subscriptionPeriod) {
        a.s(subscriptionPeriod, "period");
        try {
            ArrayList arrayList = new ArrayList();
            String str = "s";
            if (subscriptionPeriod.getYears() > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(subscriptionPeriod.getYears());
                sb.append(" Year");
                sb.append(subscriptionPeriod.getYears() > 1 ? "s" : "");
                arrayList.add(sb.toString());
            }
            if (subscriptionPeriod.getMonths() > 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(subscriptionPeriod.getMonths());
                sb2.append(" Month");
                sb2.append(subscriptionPeriod.getMonths() > 1 ? "s" : "");
                arrayList.add(sb2.toString());
            }
            if (subscriptionPeriod.getWeeks() > 0) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(subscriptionPeriod.getWeeks());
                sb3.append(" Week");
                sb3.append(subscriptionPeriod.getWeeks() > 1 ? "s" : "");
                arrayList.add(sb3.toString());
            }
            if (subscriptionPeriod.getDays() > 0) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(subscriptionPeriod.getDays());
                sb4.append(" Day");
                if (subscriptionPeriod.getDays() <= 1) {
                    str = "";
                }
                sb4.append(str);
                arrayList.add(sb4.toString());
            }
            return u.K0(arrayList, ", ", null, null, null, 62);
        } catch (Throwable th) {
            new SlackApiRepositoryImpl().sendMessageToSlack(SlackMessage.Factory.template(th));
            return "";
        }
    }

    @NotNull
    public final String getSubscriptionUnit(@Nullable String str) {
        if (str == null) {
            return "";
        }
        try {
            Matcher matcher = Pattern.compile("P(?:(\\d+)Y)?(?:(\\d+)M)?(?:(\\d+)W)?(?:(\\d+)D)?", 2).matcher(str);
            if (matcher.matches()) {
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                String group3 = matcher.group(3);
                String group4 = matcher.group(4);
                if (group != null) {
                    return "Year";
                }
                if (group2 != null) {
                    return "Month";
                }
                if (group3 != null) {
                    return "Week";
                }
                if (group4 != null) {
                    return "Day";
                }
            }
            return "";
        } catch (Throwable th) {
            new SlackApiRepositoryImpl().sendMessageToSlack(SlackMessage.Factory.template(th));
            return "";
        }
    }

    @NotNull
    public final SubscriptionPeriod parseSubscriptionPeriodDetails(@Nullable String str) {
        int i2;
        int i3;
        int i4;
        int i5;
        try {
            if (str == null) {
                return new SubscriptionPeriod(0, 0, 0, 0);
            }
            Matcher matcher = Pattern.compile("P(?:(\\d+)Y)?(?:(\\d+)M)?(?:(\\d+)W)?(?:(\\d+)D)?", 2).matcher(str);
            if (matcher.matches()) {
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                String group3 = matcher.group(3);
                String group4 = matcher.group(4);
                i3 = group != null ? Integer.parseInt(group) : 0;
                i4 = group2 != null ? Integer.parseInt(group2) : 0;
                i5 = group3 != null ? Integer.parseInt(group3) : 0;
                i2 = group4 != null ? Integer.parseInt(group4) : 0;
            } else {
                i2 = 0;
                i3 = 0;
                i4 = 0;
                i5 = 0;
            }
            return new SubscriptionPeriod(i3, i4, i5, i2);
        } catch (Throwable th) {
            new SlackApiRepositoryImpl().sendMessageToSlack(SlackMessage.Factory.template(th));
            return new SubscriptionPeriod(0, 0, 0, 0);
        }
    }

    @NotNull
    public final String processText(@NotNull String str) {
        a.s(str, "input");
        try {
            return m.M0(str, "\\n", false) ? m.k1(str, "\\n", "\n") : str;
        } catch (Throwable th) {
            new SlackApiRepositoryImpl().sendMessageToSlack(SlackMessage.Factory.template(th));
            return str;
        }
    }

    @NotNull
    public final List<SkuDetails> removeDuplicatesByProductId(@NotNull List<? extends SkuDetails> list) {
        a.s(list, "list");
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            ArrayList arrayList = new ArrayList();
            for (SkuDetails skuDetails : list) {
                if (linkedHashSet.add(skuDetails.getSku())) {
                    arrayList.add(skuDetails);
                }
            }
            return arrayList;
        } catch (Throwable th) {
            new SlackApiRepositoryImpl().sendMessageToSlack(SlackMessage.Factory.template(th));
            return w.f30218a;
        }
    }
}

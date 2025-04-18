package com.cooldev.gba.emulator.gameboy.features.manage_sub.utils;

import androidx.compose.runtime.internal.StabilityInferred;
import com.cooldev.gba.emulator.gameboy.features.paywalls.enums.BillingEnum;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;
import java.util.Date;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public final class ManageSubscriptionUtil {
    public static final int $stable = 0;

    @NotNull
    public static final ManageSubscriptionUtil INSTANCE = new ManageSubscriptionUtil();

    private ManageSubscriptionUtil() {
    }

    private final long addDaysToTimestamp(long j2, long j3) {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), ZoneId.systemDefault()).plusDays(j3).toInstant(ZoneOffset.UTC).toEpochMilli();
    }

    private final long getDaysFromPeriod(String str) {
        try {
            Period parse = Period.parse(str);
            LocalDate now = LocalDate.now();
            return ChronoUnit.DAYS.between(now, now.plus((TemporalAmount) parse));
        } catch (Exception unused) {
            return 0L;
        }
    }

    @NotNull
    public final String getBillingTitleFromProductId(@Nullable String str) {
        String str2 = "";
        if (str == null) {
            return "";
        }
        try {
            BillingEnum billingEnum = BillingEnum.YEARLY;
            if (a.g(str, billingEnum.getSkuId())) {
                str2 = billingEnum.getTitle();
            } else {
                BillingEnum billingEnum2 = BillingEnum.WEEKLY;
                if (a.g(str, billingEnum2.getSkuId())) {
                    str2 = billingEnum2.getTitle();
                } else {
                    BillingEnum billingEnum3 = BillingEnum.MONTHLY;
                    if (a.g(str, billingEnum3.getSkuId())) {
                        str2 = billingEnum3.getTitle();
                    } else {
                        BillingEnum billingEnum4 = BillingEnum.LIFETIME;
                        if (a.g(str, billingEnum4.getSkuId())) {
                            str2 = billingEnum4.getTitle();
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return str2;
    }

    @NotNull
    public final String purchaseTimeDisplay(@Nullable Long l2) {
        if (l2 == null) {
            return "";
        }
        try {
            String format = new SimpleDateFormat("dd MMM yyyy", Locale.getDefault()).format(new Date(l2.longValue()));
            a.p(format);
            return format;
        } catch (Exception unused) {
            return "";
        }
    }
}

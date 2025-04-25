package com.glority.billing.definition;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BillingPeriod.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b!\b\u0086\u0081\u0002\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001#B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"¨\u0006$"}, d2 = {"Lcom/glority/billing/definition/BillingPeriod;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "NONE", "ONE_WEEK", "TWO_WEEKS", "THREE_WEEKS", "FOUR_WEEKS", "ONE_MONTH", "TWO_MONTHS", "THREE_MONTHS", "FOUR_MONTHS", "FIVE_MONTHS", "SIX_MONTHS", "SEVEN_MONTHS", "EIGHT_MONTHS", "NINE_MONTHS", "TEN_MONTHS", "ELEVEN_MONTHS", "TWELVE_MONTHS", "ONE_YEAR", "TWO_YEARS", "THREE_YEARS", "FOUR_YEARS", "FIVE_YEARS", "SIX_YEARS", "SEVEN_YEARS", "EIGHT_YEARS", "NINE_YEARS", "TEN_YEARS", "Companion", "base-billing_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class BillingPeriod {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BillingPeriod[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String value;
    public static final BillingPeriod NONE = new BillingPeriod("NONE", 0, "");
    public static final BillingPeriod ONE_WEEK = new BillingPeriod("ONE_WEEK", 1, "P1W");
    public static final BillingPeriod TWO_WEEKS = new BillingPeriod("TWO_WEEKS", 2, "P2W");
    public static final BillingPeriod THREE_WEEKS = new BillingPeriod("THREE_WEEKS", 3, "P3W");
    public static final BillingPeriod FOUR_WEEKS = new BillingPeriod("FOUR_WEEKS", 4, "P4W");
    public static final BillingPeriod ONE_MONTH = new BillingPeriod("ONE_MONTH", 5, "P1M");
    public static final BillingPeriod TWO_MONTHS = new BillingPeriod("TWO_MONTHS", 6, "P2M");
    public static final BillingPeriod THREE_MONTHS = new BillingPeriod("THREE_MONTHS", 7, "P3M");
    public static final BillingPeriod FOUR_MONTHS = new BillingPeriod("FOUR_MONTHS", 8, "P4M");
    public static final BillingPeriod FIVE_MONTHS = new BillingPeriod("FIVE_MONTHS", 9, "P5M");
    public static final BillingPeriod SIX_MONTHS = new BillingPeriod("SIX_MONTHS", 10, "P6M");
    public static final BillingPeriod SEVEN_MONTHS = new BillingPeriod("SEVEN_MONTHS", 11, "P7M");
    public static final BillingPeriod EIGHT_MONTHS = new BillingPeriod("EIGHT_MONTHS", 12, "P8M");
    public static final BillingPeriod NINE_MONTHS = new BillingPeriod("NINE_MONTHS", 13, "P9M");
    public static final BillingPeriod TEN_MONTHS = new BillingPeriod("TEN_MONTHS", 14, "P10M");
    public static final BillingPeriod ELEVEN_MONTHS = new BillingPeriod("ELEVEN_MONTHS", 15, "P11M");
    public static final BillingPeriod TWELVE_MONTHS = new BillingPeriod("TWELVE_MONTHS", 16, "P12M");
    public static final BillingPeriod ONE_YEAR = new BillingPeriod("ONE_YEAR", 17, "P1Y");
    public static final BillingPeriod TWO_YEARS = new BillingPeriod("TWO_YEARS", 18, "P2Y");
    public static final BillingPeriod THREE_YEARS = new BillingPeriod("THREE_YEARS", 19, "P3Y");
    public static final BillingPeriod FOUR_YEARS = new BillingPeriod("FOUR_YEARS", 20, "P4Y");
    public static final BillingPeriod FIVE_YEARS = new BillingPeriod("FIVE_YEARS", 21, "P5Y");
    public static final BillingPeriod SIX_YEARS = new BillingPeriod("SIX_YEARS", 22, "P6Y");
    public static final BillingPeriod SEVEN_YEARS = new BillingPeriod("SEVEN_YEARS", 23, "P7Y");
    public static final BillingPeriod EIGHT_YEARS = new BillingPeriod("EIGHT_YEARS", 24, "P8Y");
    public static final BillingPeriod NINE_YEARS = new BillingPeriod("NINE_YEARS", 25, "P9Y");
    public static final BillingPeriod TEN_YEARS = new BillingPeriod("TEN_YEARS", 26, "P10Y");

    private static final /* synthetic */ BillingPeriod[] $values() {
        return new BillingPeriod[]{NONE, ONE_WEEK, TWO_WEEKS, THREE_WEEKS, FOUR_WEEKS, ONE_MONTH, TWO_MONTHS, THREE_MONTHS, FOUR_MONTHS, FIVE_MONTHS, SIX_MONTHS, SEVEN_MONTHS, EIGHT_MONTHS, NINE_MONTHS, TEN_MONTHS, ELEVEN_MONTHS, TWELVE_MONTHS, ONE_YEAR, TWO_YEARS, THREE_YEARS, FOUR_YEARS, FIVE_YEARS, SIX_YEARS, SEVEN_YEARS, EIGHT_YEARS, NINE_YEARS, TEN_YEARS};
    }

    public static EnumEntries<BillingPeriod> getEntries() {
        return $ENTRIES;
    }

    private BillingPeriod(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        BillingPeriod[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: BillingPeriod.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/glority/billing/definition/BillingPeriod$Companion;", "", "<init>", "()V", "fromValue", "Lcom/glority/billing/definition/BillingPeriod;", "value", "", "base-billing_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final BillingPeriod fromValue(String value) {
            BillingPeriod billingPeriod;
            Intrinsics.checkNotNullParameter(value, "value");
            BillingPeriod[] values = BillingPeriod.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    billingPeriod = null;
                    break;
                }
                billingPeriod = values[i];
                if (StringsKt.equals(billingPeriod.getValue(), value, true)) {
                    break;
                }
                i++;
            }
            return billingPeriod == null ? BillingPeriod.ONE_MONTH : billingPeriod;
        }
    }

    public static BillingPeriod valueOf(String str) {
        return (BillingPeriod) Enum.valueOf(BillingPeriod.class, str);
    }

    public static BillingPeriod[] values() {
        return (BillingPeriod[]) $VALUES.clone();
    }
}

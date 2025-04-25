package com.glority.billing.purchase.generatedAPI.kotlinAPI;

import android.util.SparseArray;
import com.glority.android.xx.constants.Args;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ErrorCodes.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, d2 = {"Lcom/glority/billing/purchase/generatedAPI/kotlinAPI/ErrorCodes;", "", "value", "", Args.title, "", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getValue", "()I", "getTitle", "()Ljava/lang/String;", "SUCCESS", "INTERNAL_ERROR", "MIS_MATCHED_USER", "FAIL_TO_COMMUNICATE_WITH_PAYMENT_PROVIDER", "VERIFY_FAIL", "APP_SERVER_FAIL", "Companion", "base-billing_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class ErrorCodes {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ErrorCodes[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final SparseArray<ErrorCodes> codeMap;
    private final String title;
    private final int value;
    public static final ErrorCodes SUCCESS = new ErrorCodes("SUCCESS", 0, 1, "");
    public static final ErrorCodes INTERNAL_ERROR = new ErrorCodes("INTERNAL_ERROR", 1, 1000, "");
    public static final ErrorCodes MIS_MATCHED_USER = new ErrorCodes("MIS_MATCHED_USER", 2, 1001, "");
    public static final ErrorCodes FAIL_TO_COMMUNICATE_WITH_PAYMENT_PROVIDER = new ErrorCodes("FAIL_TO_COMMUNICATE_WITH_PAYMENT_PROVIDER", 3, 1002, "");
    public static final ErrorCodes VERIFY_FAIL = new ErrorCodes("VERIFY_FAIL", 4, 1003, "");
    public static final ErrorCodes APP_SERVER_FAIL = new ErrorCodes("APP_SERVER_FAIL", 5, 1004, "");

    private static final /* synthetic */ ErrorCodes[] $values() {
        return new ErrorCodes[]{SUCCESS, INTERNAL_ERROR, MIS_MATCHED_USER, FAIL_TO_COMMUNICATE_WITH_PAYMENT_PROVIDER, VERIFY_FAIL, APP_SERVER_FAIL};
    }

    public static EnumEntries<ErrorCodes> getEntries() {
        return $ENTRIES;
    }

    private ErrorCodes(String str, int i, int i2, String str2) {
        this.value = i2;
        this.title = str2;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        ErrorCodes[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
        codeMap = new SparseArray<>();
        for (ErrorCodes errorCodes : values()) {
            codeMap.put(errorCodes.value, errorCodes);
        }
    }

    /* compiled from: ErrorCodes.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/glority/billing/purchase/generatedAPI/kotlinAPI/ErrorCodes$Companion;", "", "<init>", "()V", "codeMap", "Landroid/util/SparseArray;", "Lcom/glority/billing/purchase/generatedAPI/kotlinAPI/ErrorCodes;", "parse", "code", "", "base-billing_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ErrorCodes parse(int code) {
            ErrorCodes errorCodes = (ErrorCodes) ErrorCodes.codeMap.get(code);
            return errorCodes != null ? errorCodes : ErrorCodes.INTERNAL_ERROR;
        }
    }

    public static ErrorCodes valueOf(String str) {
        return (ErrorCodes) Enum.valueOf(ErrorCodes.class, str);
    }

    public static ErrorCodes[] values() {
        return (ErrorCodes[]) $VALUES.clone();
    }
}

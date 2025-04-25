package com.glority.abtesting.generatedAPI.kotlinAPI;

import android.util.SparseArray;
import com.glority.android.xx.constants.Args;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ErrorCodes.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0001\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0018B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0019"}, d2 = {"Lcom/glority/abtesting/generatedAPI/kotlinAPI/ErrorCodes;", "", "value", "", Args.title, "", "(Ljava/lang/String;IILjava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getValue", "()I", "SUCCESS", "INTERNAL_ERROR", "DISPLAYABLE_ERROR", "STORAGE_ERROR", "INVALID_ARGUMENT_ERROR", "STS_TOKEN_ERROR", "MAILER_ERROR", "ORDER_PRICE_CHANGED", "SMS_SEND_ERROR", "LOGIN_AUTHENTICATE_ERROR", "AUTHORIZATION_ERROR", "TRANSACTION_BELONG_TO_OTHER_USER", "TRANSACTION_PAYMENT_PROVIDER_ERROR", "Companion", "base-abtest_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes7.dex */
public enum ErrorCodes {
    SUCCESS(1, ""),
    INTERNAL_ERROR(1000, ""),
    DISPLAYABLE_ERROR(1001, ""),
    STORAGE_ERROR(1002, ""),
    INVALID_ARGUMENT_ERROR(1003, ""),
    STS_TOKEN_ERROR(1004, ""),
    MAILER_ERROR(AnalyticsListener.EVENT_UPSTREAM_DISCARDED, ""),
    ORDER_PRICE_CHANGED(1006, ""),
    SMS_SEND_ERROR(1007, ""),
    LOGIN_AUTHENTICATE_ERROR(1008, ""),
    AUTHORIZATION_ERROR(1009, ""),
    TRANSACTION_BELONG_TO_OTHER_USER(1012, ""),
    TRANSACTION_PAYMENT_PROVIDER_ERROR(1013, "");

    private final String title;
    private final int value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final SparseArray<ErrorCodes> codeMap = new SparseArray<>();

    ErrorCodes(int i, String str) {
        this.value = i;
        this.title = str;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        for (ErrorCodes errorCodes : values()) {
            codeMap.put(errorCodes.value, errorCodes);
        }
    }

    /* compiled from: ErrorCodes.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/glority/abtesting/generatedAPI/kotlinAPI/ErrorCodes$Companion;", "", "()V", "codeMap", "Landroid/util/SparseArray;", "Lcom/glority/abtesting/generatedAPI/kotlinAPI/ErrorCodes;", "parse", "code", "", "base-abtest_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ErrorCodes parse(int code) {
            ErrorCodes errorCodes = (ErrorCodes) ErrorCodes.codeMap.get(code);
            return errorCodes != null ? errorCodes : ErrorCodes.INTERNAL_ERROR;
        }
    }
}

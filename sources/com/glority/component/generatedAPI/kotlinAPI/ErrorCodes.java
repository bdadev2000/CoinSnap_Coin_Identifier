package com.glority.component.generatedAPI.kotlinAPI;

import android.util.SparseArray;
import com.glority.android.xx.constants.Args;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ErrorCodes.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\"\b\u0086\u0081\u0002\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001&B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%¨\u0006'"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/ErrorCodes;", "", "value", "", Args.title, "", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getValue", "()I", "getTitle", "()Ljava/lang/String;", "SUCCESS", "INTERNAL_ERROR", "DISPLAYABLE_ERROR", "STORAGE_ERROR", "INVALID_ARGUMENT_ERROR", "STS_TOKEN_ERROR", "MAILER_ERROR", "ORDER_PRICE_CHANGED", "SMS_SEND_ERROR", "LOGIN_AUTHENTICATE_ERROR", "AUTHORIZATION_ERROR", "TRANSACTION_BELONG_TO_OTHER_USER", "TRANSACTION_PAYMENT_PROVIDER_ERROR", "RECOGNIZE_ENGINE_ERROR", "SERVER_IN_MAINTAIN_MODE", "UPLOAD_FILE_OVER_SIZE", "ITEM_NOT_EXIST", "USER_NOT_HAVE_ITEM", "USER_ALREADY_EXIST", "USER_PASSWORD_ERROR", "USER_EMAIL_FORMAT_ERROR", "USER_LOGIN_METHOD_NOT_SUPPORT", "USER_RESET_PASSWORD_EMAIL_NOT_EXIST", "USER_RESET_PASSWORD_SEND_VERIFY_CODE_FREQUENTLY", "USER_RESET_PASSWORD_VERIFY_CODE_EXPIRED", "USER_RESET_PASSWORD_VERIFY_CODE_ERROR", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
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
    public static final ErrorCodes DISPLAYABLE_ERROR = new ErrorCodes("DISPLAYABLE_ERROR", 2, 1001, "");
    public static final ErrorCodes STORAGE_ERROR = new ErrorCodes("STORAGE_ERROR", 3, 1002, "");
    public static final ErrorCodes INVALID_ARGUMENT_ERROR = new ErrorCodes("INVALID_ARGUMENT_ERROR", 4, 1003, "");
    public static final ErrorCodes STS_TOKEN_ERROR = new ErrorCodes("STS_TOKEN_ERROR", 5, 1004, "");
    public static final ErrorCodes MAILER_ERROR = new ErrorCodes("MAILER_ERROR", 6, AnalyticsListener.EVENT_UPSTREAM_DISCARDED, "");
    public static final ErrorCodes ORDER_PRICE_CHANGED = new ErrorCodes("ORDER_PRICE_CHANGED", 7, 1006, "");
    public static final ErrorCodes SMS_SEND_ERROR = new ErrorCodes("SMS_SEND_ERROR", 8, 1007, "");
    public static final ErrorCodes LOGIN_AUTHENTICATE_ERROR = new ErrorCodes("LOGIN_AUTHENTICATE_ERROR", 9, 1008, "");
    public static final ErrorCodes AUTHORIZATION_ERROR = new ErrorCodes("AUTHORIZATION_ERROR", 10, 1009, "");
    public static final ErrorCodes TRANSACTION_BELONG_TO_OTHER_USER = new ErrorCodes("TRANSACTION_BELONG_TO_OTHER_USER", 11, 1012, "");
    public static final ErrorCodes TRANSACTION_PAYMENT_PROVIDER_ERROR = new ErrorCodes("TRANSACTION_PAYMENT_PROVIDER_ERROR", 12, 1013, "");
    public static final ErrorCodes RECOGNIZE_ENGINE_ERROR = new ErrorCodes("RECOGNIZE_ENGINE_ERROR", 13, AnalyticsListener.EVENT_VIDEO_INPUT_FORMAT_CHANGED, "");
    public static final ErrorCodes SERVER_IN_MAINTAIN_MODE = new ErrorCodes("SERVER_IN_MAINTAIN_MODE", 14, AnalyticsListener.EVENT_DROPPED_VIDEO_FRAMES, "");
    public static final ErrorCodes UPLOAD_FILE_OVER_SIZE = new ErrorCodes("UPLOAD_FILE_OVER_SIZE", 15, 1024, "");
    public static final ErrorCodes ITEM_NOT_EXIST = new ErrorCodes("ITEM_NOT_EXIST", 16, 1025, "");
    public static final ErrorCodes USER_NOT_HAVE_ITEM = new ErrorCodes("USER_NOT_HAVE_ITEM", 17, AnalyticsListener.EVENT_VIDEO_FRAME_PROCESSING_OFFSET, "");
    public static final ErrorCodes USER_ALREADY_EXIST = new ErrorCodes("USER_ALREADY_EXIST", 18, AnalyticsListener.EVENT_RENDERED_FIRST_FRAME, "");
    public static final ErrorCodes USER_PASSWORD_ERROR = new ErrorCodes("USER_PASSWORD_ERROR", 19, AnalyticsListener.EVENT_VIDEO_SIZE_CHANGED, "");
    public static final ErrorCodes USER_EMAIL_FORMAT_ERROR = new ErrorCodes("USER_EMAIL_FORMAT_ERROR", 20, AnalyticsListener.EVENT_SURFACE_SIZE_CHANGED, "");
    public static final ErrorCodes USER_LOGIN_METHOD_NOT_SUPPORT = new ErrorCodes("USER_LOGIN_METHOD_NOT_SUPPORT", 21, AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED, "");
    public static final ErrorCodes USER_RESET_PASSWORD_EMAIL_NOT_EXIST = new ErrorCodes("USER_RESET_PASSWORD_EMAIL_NOT_EXIST", 22, AnalyticsListener.EVENT_DRM_KEYS_REMOVED, "");
    public static final ErrorCodes USER_RESET_PASSWORD_SEND_VERIFY_CODE_FREQUENTLY = new ErrorCodes("USER_RESET_PASSWORD_SEND_VERIFY_CODE_FREQUENTLY", 23, AnalyticsListener.EVENT_DRM_SESSION_RELEASED, "");
    public static final ErrorCodes USER_RESET_PASSWORD_VERIFY_CODE_EXPIRED = new ErrorCodes("USER_RESET_PASSWORD_VERIFY_CODE_EXPIRED", 24, AnalyticsListener.EVENT_PLAYER_RELEASED, "");
    public static final ErrorCodes USER_RESET_PASSWORD_VERIFY_CODE_ERROR = new ErrorCodes("USER_RESET_PASSWORD_VERIFY_CODE_ERROR", 25, 1037, "");

    private static final /* synthetic */ ErrorCodes[] $values() {
        return new ErrorCodes[]{SUCCESS, INTERNAL_ERROR, DISPLAYABLE_ERROR, STORAGE_ERROR, INVALID_ARGUMENT_ERROR, STS_TOKEN_ERROR, MAILER_ERROR, ORDER_PRICE_CHANGED, SMS_SEND_ERROR, LOGIN_AUTHENTICATE_ERROR, AUTHORIZATION_ERROR, TRANSACTION_BELONG_TO_OTHER_USER, TRANSACTION_PAYMENT_PROVIDER_ERROR, RECOGNIZE_ENGINE_ERROR, SERVER_IN_MAINTAIN_MODE, UPLOAD_FILE_OVER_SIZE, ITEM_NOT_EXIST, USER_NOT_HAVE_ITEM, USER_ALREADY_EXIST, USER_PASSWORD_ERROR, USER_EMAIL_FORMAT_ERROR, USER_LOGIN_METHOD_NOT_SUPPORT, USER_RESET_PASSWORD_EMAIL_NOT_EXIST, USER_RESET_PASSWORD_SEND_VERIFY_CODE_FREQUENTLY, USER_RESET_PASSWORD_VERIFY_CODE_EXPIRED, USER_RESET_PASSWORD_VERIFY_CODE_ERROR};
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
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/ErrorCodes$Companion;", "", "<init>", "()V", "codeMap", "Landroid/util/SparseArray;", "Lcom/glority/component/generatedAPI/kotlinAPI/ErrorCodes;", "parse", "code", "", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
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

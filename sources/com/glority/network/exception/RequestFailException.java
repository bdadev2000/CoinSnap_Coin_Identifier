package com.glority.network.exception;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.data.LogEventArguments;
import com.glority.network.model.NetworkMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RequestFailException.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \b2\u00020\u0001:\u0002\b\tB%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/glority/network/exception/RequestFailException;", "Lcom/glority/network/exception/NetworkException;", "messageName", "", LogEventArguments.ARG_MESSAGE, "code", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "Companion", "ErrorCode", "fwk-network_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes9.dex */
public final class RequestFailException extends NetworkException {
    private static final long serialVersionUID = -3066897190645766431L;

    public /* synthetic */ RequestFailException(String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, i);
    }

    public RequestFailException(String str, String str2, int i) {
        super(str, str2, i);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RequestFailException.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0015"}, d2 = {"Lcom/glority/network/exception/RequestFailException$ErrorCode;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "NORMAL", "TOO_MANY_REQUESTS", "SERVER_DEGENERATED", "SERVER_MAINTAIN", "NO_INTERNET", "HTTP_IO", "HTTP_ILLEGAL_STATE", "HTTP_ILLEGAL_ARGUMENT", "INVALID_RESPONSE", "ILLEGAL_API_ARGUMENT", "ENCRYPT_ERROR", "DECRYPT_ERROR", "INTERNAL_ERROR", "Companion", "fwk-network_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes9.dex */
    public static final class ErrorCode {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ErrorCode[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;
        public static final ErrorCode NORMAL = new ErrorCode("NORMAL", 0, 200);
        public static final ErrorCode TOO_MANY_REQUESTS = new ErrorCode("TOO_MANY_REQUESTS", 1, 429);
        public static final ErrorCode SERVER_DEGENERATED = new ErrorCode("SERVER_DEGENERATED", 2, 10001);
        public static final ErrorCode SERVER_MAINTAIN = new ErrorCode("SERVER_MAINTAIN", 3, 10002);
        public static final ErrorCode NO_INTERNET = new ErrorCode("NO_INTERNET", 4, 10003);
        public static final ErrorCode HTTP_IO = new ErrorCode("HTTP_IO", 5, 10004);
        public static final ErrorCode HTTP_ILLEGAL_STATE = new ErrorCode("HTTP_ILLEGAL_STATE", 6, 10005);
        public static final ErrorCode HTTP_ILLEGAL_ARGUMENT = new ErrorCode("HTTP_ILLEGAL_ARGUMENT", 7, 10006);
        public static final ErrorCode INVALID_RESPONSE = new ErrorCode("INVALID_RESPONSE", 8, 10007);
        public static final ErrorCode ILLEGAL_API_ARGUMENT = new ErrorCode("ILLEGAL_API_ARGUMENT", 9, 10008);
        public static final ErrorCode ENCRYPT_ERROR = new ErrorCode("ENCRYPT_ERROR", 10, 10009);
        public static final ErrorCode DECRYPT_ERROR = new ErrorCode("DECRYPT_ERROR", 11, 10010);
        public static final ErrorCode INTERNAL_ERROR = new ErrorCode("INTERNAL_ERROR", 12, 10011);

        private static final /* synthetic */ ErrorCode[] $values() {
            return new ErrorCode[]{NORMAL, TOO_MANY_REQUESTS, SERVER_DEGENERATED, SERVER_MAINTAIN, NO_INTERNET, HTTP_IO, HTTP_ILLEGAL_STATE, HTTP_ILLEGAL_ARGUMENT, INVALID_RESPONSE, ILLEGAL_API_ARGUMENT, ENCRYPT_ERROR, DECRYPT_ERROR, INTERNAL_ERROR};
        }

        public static EnumEntries<ErrorCode> getEntries() {
            return $ENTRIES;
        }

        public static ErrorCode valueOf(String str) {
            return (ErrorCode) Enum.valueOf(ErrorCode.class, str);
        }

        public static ErrorCode[] values() {
            return (ErrorCode[]) $VALUES.clone();
        }

        private ErrorCode(String str, int i, int i2) {
            this.value = i2;
        }

        public final int getValue() {
            return this.value;
        }

        static {
            ErrorCode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
            INSTANCE = new Companion(null);
        }

        /* compiled from: RequestFailException.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/glority/network/exception/RequestFailException$ErrorCode$Companion;", "", "()V", "fromValue", "Lcom/glority/network/exception/RequestFailException$ErrorCode;", "networkMode", "Lcom/glority/network/model/NetworkMode;", "fwk-network_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        /* loaded from: classes9.dex */
        public static final class Companion {

            /* compiled from: RequestFailException.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            /* loaded from: classes9.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[NetworkMode.values().length];
                    try {
                        iArr[NetworkMode.NORMAL.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[NetworkMode.DEGENERATED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[NetworkMode.MAINTAIN.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[NetworkMode.NO_INTERNET.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final ErrorCode fromValue(NetworkMode networkMode) {
                Intrinsics.checkNotNullParameter(networkMode, "networkMode");
                int i = WhenMappings.$EnumSwitchMapping$0[networkMode.ordinal()];
                if (i == 1) {
                    return ErrorCode.NORMAL;
                }
                if (i == 2) {
                    return ErrorCode.SERVER_DEGENERATED;
                }
                if (i == 3) {
                    return ErrorCode.SERVER_MAINTAIN;
                }
                if (i == 4) {
                    return ErrorCode.NO_INTERNET;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}

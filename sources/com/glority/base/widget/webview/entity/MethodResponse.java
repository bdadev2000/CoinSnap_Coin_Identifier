package com.glority.base.widget.webview.entity;

import com.glority.android.core.data.LogEventArguments;
import com.glority.network.util.HttpState;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MethodResponse.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001eB?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JJ\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/glority/base/widget/webview/entity/MethodResponse;", "", LogEventArguments.ARG_MESSAGE, "", "response", "", "errorCode", "", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getResponse", "()Ljava/util/Map;", "getErrorCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getErrorMessage", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/String;)Lcom/glority/base/widget/webview/entity/MethodResponse;", "equals", "", "other", "hashCode", "toString", "MessageStatus", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final /* data */ class MethodResponse {
    public static final int $stable = 8;
    private final Integer errorCode;
    private final String errorMessage;
    private final String message;
    private final Map<String, Object> response;

    /* renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final Map<String, Object> component2() {
        return this.response;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getErrorCode() {
        return this.errorCode;
    }

    /* renamed from: component4, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final MethodResponse copy(String message, Map<String, ? extends Object> response, Integer errorCode, String errorMessage) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new MethodResponse(message, response, errorCode, errorMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MethodResponse)) {
            return false;
        }
        MethodResponse methodResponse = (MethodResponse) other;
        return Intrinsics.areEqual(this.message, methodResponse.message) && Intrinsics.areEqual(this.response, methodResponse.response) && Intrinsics.areEqual(this.errorCode, methodResponse.errorCode) && Intrinsics.areEqual(this.errorMessage, methodResponse.errorMessage);
    }

    public int hashCode() {
        int hashCode = this.message.hashCode() * 31;
        Map<String, Object> map = this.response;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        Integer num = this.errorCode;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.errorMessage;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "MethodResponse(message=" + this.message + ", response=" + this.response + ", errorCode=" + this.errorCode + ", errorMessage=" + this.errorMessage + ")";
    }

    public MethodResponse(String message, Map<String, ? extends Object> map, Integer num, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.message = message;
        this.response = map;
        this.errorCode = num;
        this.errorMessage = str;
    }

    public /* synthetic */ MethodResponse(String str, Map map, Integer num, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MethodResponse copy$default(MethodResponse methodResponse, String str, Map map, Integer num, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = methodResponse.message;
        }
        if ((i & 2) != 0) {
            map = methodResponse.response;
        }
        if ((i & 4) != 0) {
            num = methodResponse.errorCode;
        }
        if ((i & 8) != 0) {
            str2 = methodResponse.errorMessage;
        }
        return methodResponse.copy(str, map, num, str2);
    }

    public final String getMessage() {
        return this.message;
    }

    public final Map<String, Object> getResponse() {
        return this.response;
    }

    public final Integer getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MethodResponse.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/glority/base/widget/webview/entity/MethodResponse$MessageStatus;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "success", HttpState.FAIL, "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class MessageStatus {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ MessageStatus[] $VALUES;
        public static final MessageStatus success = new MessageStatus("success", 0, "success");
        public static final MessageStatus fail = new MessageStatus(HttpState.FAIL, 1, HttpState.FAIL);

        private static final /* synthetic */ MessageStatus[] $values() {
            return new MessageStatus[]{success, fail};
        }

        public static EnumEntries<MessageStatus> getEntries() {
            return $ENTRIES;
        }

        private MessageStatus(String str, int i, String str2) {
        }

        static {
            MessageStatus[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static MessageStatus valueOf(String str) {
            return (MessageStatus) Enum.valueOf(MessageStatus.class, str);
        }

        public static MessageStatus[] values() {
            return (MessageStatus[]) $VALUES.clone();
        }
    }
}

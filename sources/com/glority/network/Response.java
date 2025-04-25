package com.glority.network;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.glority.android.core.definition.APIDefinition;
import com.glority.network.exception.NetworkException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CacheableApiServer.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B5\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010 \u001a\u00020\bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003JL\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020\u00052\b\u0010&\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\nHÖ\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006*"}, d2 = {"Lcom/glority/network/Response;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/glority/android/core/definition/APIDefinition;", "", "isSuccess", "", "data", "responseType", "Lcom/glority/network/ResponseType;", "originalJson", "", "exception", "Lcom/glority/network/exception/NetworkException;", "(ZLcom/glority/android/core/definition/APIDefinition;Lcom/glority/network/ResponseType;Ljava/lang/String;Lcom/glority/network/exception/NetworkException;)V", "getData", "()Lcom/glority/android/core/definition/APIDefinition;", "Lcom/glority/android/core/definition/APIDefinition;", "getException", "()Lcom/glority/network/exception/NetworkException;", "setException", "(Lcom/glority/network/exception/NetworkException;)V", "()Z", "setSuccess", "(Z)V", "getOriginalJson", "()Ljava/lang/String;", "getResponseType", "()Lcom/glority/network/ResponseType;", "setResponseType", "(Lcom/glority/network/ResponseType;)V", "component1", "component2", "component3", "component4", "component5", "copy", "(ZLcom/glority/android/core/definition/APIDefinition;Lcom/glority/network/ResponseType;Ljava/lang/String;Lcom/glority/network/exception/NetworkException;)Lcom/glority/network/Response;", "equals", "other", "hashCode", "", "toString", "fwk-network_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes9.dex */
public final /* data */ class Response<T extends APIDefinition> {
    private final T data;
    private NetworkException exception;
    private boolean isSuccess;
    private final String originalJson;
    private ResponseType responseType;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Response copy$default(Response response, boolean z, APIDefinition aPIDefinition, ResponseType responseType, String str, NetworkException networkException, int i, Object obj) {
        if ((i & 1) != 0) {
            z = response.isSuccess;
        }
        T t = aPIDefinition;
        if ((i & 2) != 0) {
            t = response.data;
        }
        T t2 = t;
        if ((i & 4) != 0) {
            responseType = response.responseType;
        }
        ResponseType responseType2 = responseType;
        if ((i & 8) != 0) {
            str = response.originalJson;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            networkException = response.exception;
        }
        return response.copy(z, t2, responseType2, str2, networkException);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    public final T component2() {
        return this.data;
    }

    /* renamed from: component3, reason: from getter */
    public final ResponseType getResponseType() {
        return this.responseType;
    }

    /* renamed from: component4, reason: from getter */
    public final String getOriginalJson() {
        return this.originalJson;
    }

    /* renamed from: component5, reason: from getter */
    public final NetworkException getException() {
        return this.exception;
    }

    public final Response<T> copy(boolean isSuccess, T data, ResponseType responseType, String originalJson, NetworkException exception) {
        Intrinsics.checkNotNullParameter(responseType, "responseType");
        return new Response<>(isSuccess, data, responseType, originalJson, exception);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Response)) {
            return false;
        }
        Response response = (Response) other;
        return this.isSuccess == response.isSuccess && Intrinsics.areEqual(this.data, response.data) && this.responseType == response.responseType && Intrinsics.areEqual(this.originalJson, response.originalJson) && Intrinsics.areEqual(this.exception, response.exception);
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isSuccess) * 31;
        T t = this.data;
        int hashCode2 = (((hashCode + (t == null ? 0 : t.hashCode())) * 31) + this.responseType.hashCode()) * 31;
        String str = this.originalJson;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        NetworkException networkException = this.exception;
        return hashCode3 + (networkException != null ? networkException.hashCode() : 0);
    }

    public String toString() {
        return "Response(isSuccess=" + this.isSuccess + ", data=" + this.data + ", responseType=" + this.responseType + ", originalJson=" + this.originalJson + ", exception=" + this.exception + ')';
    }

    public Response(boolean z, T t, ResponseType responseType, String str, NetworkException networkException) {
        Intrinsics.checkNotNullParameter(responseType, "responseType");
        this.isSuccess = z;
        this.data = t;
        this.responseType = responseType;
        this.originalJson = str;
        this.exception = networkException;
    }

    public /* synthetic */ Response(boolean z, APIDefinition aPIDefinition, ResponseType responseType, String str, NetworkException networkException, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, aPIDefinition, responseType, str, (i & 16) != 0 ? null : networkException);
    }

    public final boolean isSuccess() {
        return this.isSuccess;
    }

    public final void setSuccess(boolean z) {
        this.isSuccess = z;
    }

    public final T getData() {
        return this.data;
    }

    public final ResponseType getResponseType() {
        return this.responseType;
    }

    public final void setResponseType(ResponseType responseType) {
        Intrinsics.checkNotNullParameter(responseType, "<set-?>");
        this.responseType = responseType;
    }

    public final String getOriginalJson() {
        return this.originalJson;
    }

    public final NetworkException getException() {
        return this.exception;
    }

    public final void setException(NetworkException networkException) {
        this.exception = networkException;
    }
}

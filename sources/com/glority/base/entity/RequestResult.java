package com.glority.base.entity;

import androidx.exifinterface.media.ExifInterface;
import com.glority.network.model.Status;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoadingState.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001d*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u001dB%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J6\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/glority/base/entity/RequestResult;", ExifInterface.GPS_DIRECTION_TRUE, "", "status", "Lcom/glority/network/model/Status;", "data", "exception", "", "<init>", "(Lcom/glority/network/model/Status;Ljava/lang/Object;Ljava/lang/Throwable;)V", "getStatus", "()Lcom/glority/network/model/Status;", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getException", "()Ljava/lang/Throwable;", "component1", "component2", "component3", "copy", "(Lcom/glority/network/model/Status;Ljava/lang/Object;Ljava/lang/Throwable;)Lcom/glority/base/entity/RequestResult;", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final /* data */ class RequestResult<T> {
    private final T data;
    private final Throwable exception;
    private final Status status;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: component1, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    public final T component2() {
        return this.data;
    }

    /* renamed from: component3, reason: from getter */
    public final Throwable getException() {
        return this.exception;
    }

    public final RequestResult<T> copy(Status status, T data, Throwable exception) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new RequestResult<>(status, data, exception);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequestResult)) {
            return false;
        }
        RequestResult requestResult = (RequestResult) other;
        return this.status == requestResult.status && Intrinsics.areEqual(this.data, requestResult.data) && Intrinsics.areEqual(this.exception, requestResult.exception);
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        T t = this.data;
        int hashCode2 = (hashCode + (t == null ? 0 : t.hashCode())) * 31;
        Throwable th = this.exception;
        return hashCode2 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "RequestResult(status=" + this.status + ", data=" + this.data + ", exception=" + this.exception + ")";
    }

    /* compiled from: LoadingState.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0001\u0010\u0006J!\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0001\u0010\u00062\b\u0010\b\u001a\u0004\u0018\u0001H\u0006¢\u0006\u0002\u0010\tJ\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0001\u0010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¨\u0006\r"}, d2 = {"Lcom/glority/base/entity/RequestResult$Companion;", "", "<init>", "()V", "loading", "Lcom/glority/base/entity/RequestResult;", ExifInterface.GPS_DIRECTION_TRUE, "success", "data", "(Ljava/lang/Object;)Lcom/glority/base/entity/RequestResult;", "error", "exception", "", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <T> RequestResult<T> loading() {
            return new RequestResult<>(Status.LOADING, null, null, 4, null);
        }

        public final <T> RequestResult<T> success(T data) {
            return new RequestResult<>(Status.SUCCESS, data, null, 4, null);
        }

        public static /* synthetic */ RequestResult error$default(Companion companion, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = null;
            }
            return companion.error(th);
        }

        public final <T> RequestResult<T> error(Throwable exception) {
            return new RequestResult<>(Status.ERROR, null, exception);
        }
    }

    public RequestResult(Status status, T t, Throwable th) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
        this.data = t;
        this.exception = th;
    }

    public /* synthetic */ RequestResult(Status status, Object obj, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(status, obj, (i & 4) != 0 ? null : th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RequestResult copy$default(RequestResult requestResult, Status status, Object obj, Throwable th, int i, Object obj2) {
        if ((i & 1) != 0) {
            status = requestResult.status;
        }
        if ((i & 2) != 0) {
            obj = requestResult.data;
        }
        if ((i & 4) != 0) {
            th = requestResult.exception;
        }
        return requestResult.copy(status, obj, th);
    }

    public final T getData() {
        return this.data;
    }

    public final Throwable getException() {
        return this.exception;
    }

    public final Status getStatus() {
        return this.status;
    }
}

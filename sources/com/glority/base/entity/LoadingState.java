package com.glority.base.entity;

import androidx.exifinterface.media.ExifInterface;
import com.glority.network.model.Status;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoadingState.kt */
@Deprecated(message = "rename requestResult")
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u0018*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0018B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\u000bJ*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/glority/base/entity/LoadingState;", ExifInterface.GPS_DIRECTION_TRUE, "", "status", "Lcom/glority/network/model/Status;", "data", "<init>", "(Lcom/glority/network/model/Status;Ljava/lang/Object;)V", "getStatus", "()Lcom/glority/network/model/Status;", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "copy", "(Lcom/glority/network/model/Status;Ljava/lang/Object;)Lcom/glority/base/entity/LoadingState;", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final /* data */ class LoadingState<T> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final T data;
    private final Status status;

    /* renamed from: component1, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    public final T component2() {
        return this.data;
    }

    public final LoadingState<T> copy(Status status, T data) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new LoadingState<>(status, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoadingState)) {
            return false;
        }
        LoadingState loadingState = (LoadingState) other;
        return this.status == loadingState.status && Intrinsics.areEqual(this.data, loadingState.data);
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        T t = this.data;
        return hashCode + (t == null ? 0 : t.hashCode());
    }

    public String toString() {
        return "LoadingState(status=" + this.status + ", data=" + this.data + ")";
    }

    public LoadingState(Status status, T t) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
        this.data = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LoadingState copy$default(LoadingState loadingState, Status status, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            status = loadingState.status;
        }
        if ((i & 2) != 0) {
            obj = loadingState.data;
        }
        return loadingState.copy(status, obj);
    }

    /* compiled from: LoadingState.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0001\u0010\u0006J!\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0001\u0010\u00062\b\u0010\b\u001a\u0004\u0018\u0001H\u0006¢\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0001\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/glority/base/entity/LoadingState$Companion;", "", "<init>", "()V", "loading", "Lcom/glority/base/entity/LoadingState;", ExifInterface.GPS_DIRECTION_TRUE, "success", "data", "(Ljava/lang/Object;)Lcom/glority/base/entity/LoadingState;", "error", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <T> LoadingState<T> loading() {
            return new LoadingState<>(Status.LOADING, null);
        }

        public final <T> LoadingState<T> success(T data) {
            return new LoadingState<>(Status.SUCCESS, data);
        }

        public final <T> LoadingState<T> error() {
            return new LoadingState<>(Status.ERROR, null);
        }
    }

    public final T getData() {
        return this.data;
    }

    public final Status getStatus() {
        return this.status;
    }
}

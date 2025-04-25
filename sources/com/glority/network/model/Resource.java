package com.glority.network.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import com.glority.android.core.data.LogEventArguments;
import com.glority.network.exception.NetworkException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Resource.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 \u0018*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001\u0018B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0011\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/glority/network/model/Resource;", ExifInterface.GPS_DIRECTION_TRUE, "", "status", "Lcom/glority/network/model/Status;", "data", LogEventArguments.ARG_MESSAGE, "", "exception", "Lcom/glority/network/exception/NetworkException;", "(Lcom/glority/network/model/Status;Ljava/lang/Object;Ljava/lang/String;Lcom/glority/network/exception/NetworkException;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getException", "()Lcom/glority/network/exception/NetworkException;", "getMessage", "()Ljava/lang/String;", "originalServerJson", "getOriginalServerJson", "setOriginalServerJson", "(Ljava/lang/String;)V", "getStatus", "()Lcom/glority/network/model/Status;", "Companion", "fwk-network_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes9.dex */
public final class Resource<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final T data;
    private final NetworkException exception;
    private final String message;
    private String originalServerJson;
    private final Status status;

    public Resource(Status status, T t, String str, NetworkException networkException) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
        this.data = t;
        this.message = str;
        this.exception = networkException;
    }

    public /* synthetic */ Resource(Status status, Object obj, String str, NetworkException networkException, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(status, obj, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : networkException);
    }

    public final Status getStatus() {
        return this.status;
    }

    public final T getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public final NetworkException getException() {
        return this.exception;
    }

    public final String getOriginalServerJson() {
        return this.originalServerJson;
    }

    public final void setOriginalServerJson(String str) {
        this.originalServerJson = str;
    }

    /* compiled from: Resource.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J7\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u0001H\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ!\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\b\u001a\u0004\u0018\u0001H\u0005¢\u0006\u0002\u0010\rJ!\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\b\u001a\u0004\u0018\u0001H\u0005¢\u0006\u0002\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/glority/network/model/Resource$Companion;", "", "()V", "error", "Lcom/glority/network/model/Resource;", ExifInterface.GPS_DIRECTION_TRUE, NotificationCompat.CATEGORY_MESSAGE, "", "data", "exception", "Lcom/glority/network/exception/NetworkException;", "(Ljava/lang/String;Ljava/lang/Object;Lcom/glority/network/exception/NetworkException;)Lcom/glority/network/model/Resource;", "loading", "(Ljava/lang/Object;)Lcom/glority/network/model/Resource;", "success", "fwk-network_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes9.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <T> Resource<T> success(T data) {
            return new Resource<>(Status.SUCCESS, data, null, null, 12, null);
        }

        public static /* synthetic */ Resource error$default(Companion companion, String str, Object obj, NetworkException networkException, int i, Object obj2) {
            if ((i & 4) != 0) {
                networkException = null;
            }
            return companion.error(str, obj, networkException);
        }

        public final <T> Resource<T> error(String msg, T data, NetworkException exception) {
            return new Resource<>(Status.ERROR, data, msg, exception);
        }

        public final <T> Resource<T> loading(T data) {
            return new Resource<>(Status.LOADING, data, null, null, 12, null);
        }
    }
}

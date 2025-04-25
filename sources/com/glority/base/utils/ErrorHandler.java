package com.glority.base.utils;

import androidx.exifinterface.media.ExifInterface;
import com.glority.android.core.definition.APIBase;
import com.glority.android.core.definition.APIDefinition;
import com.glority.network.exception.NetworkException;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import com.glority.utils.stability.LogUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ErrorHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/glority/base/utils/ErrorHandler;", "", "<init>", "()V", "Companion", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class ErrorHandler {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: ErrorHandler.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\f\b\u0000\u0010\u0006*\u00020\u0007*\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n¨\u0006\u000b"}, d2 = {"Lcom/glority/base/utils/ErrorHandler$Companion;", "", "<init>", "()V", "handleError", "Lcom/glority/network/model/Resource;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "throwable", "", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <T extends APIBase & APIDefinition> Resource<T> handleError(Throwable throwable) {
            LogUtils.e(throwable);
            Status status = Status.ERROR;
            String message = throwable != null ? throwable.getMessage() : null;
            Intrinsics.checkNotNull(throwable, "null cannot be cast to non-null type com.glority.network.exception.NetworkException");
            return new Resource<>(status, null, message, (NetworkException) throwable);
        }
    }

    private ErrorHandler() {
        throw new UnsupportedOperationException("U can't initialize me!");
    }
}

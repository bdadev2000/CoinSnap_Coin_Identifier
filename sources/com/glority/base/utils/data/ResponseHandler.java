package com.glority.base.utils.data;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;

/* compiled from: ResponseHandler.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\u0017\u0010\n\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/glority/base/utils/data/ResponseHandler;", ExifInterface.GPS_DIRECTION_TRUE, "", "success", "", "data", "(Ljava/lang/Object;)V", "error", "e", "", "loading", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public interface ResponseHandler<T> {
    void error(Throwable e);

    void loading(T data);

    void success(T data);
}

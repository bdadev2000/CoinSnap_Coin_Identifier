package com.glority.base.utils.data;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;

/* compiled from: DefaultResponseHandler.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0000\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\bJ\u0012\u0010\n\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\r"}, d2 = {"Lcom/glority/base/utils/data/DefaultResponseHandler;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/glority/base/utils/data/ResponseHandler;", "<init>", "()V", "success", "", "data", "(Ljava/lang/Object;)V", "loading", "error", "e", "", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public class DefaultResponseHandler<T> implements ResponseHandler<T> {
    public static final int $stable = 0;

    @Override // com.glority.base.utils.data.ResponseHandler
    public void loading(T data) {
    }

    @Override // com.glority.base.utils.data.ResponseHandler
    public void success(T data) {
    }

    @Override // com.glority.base.utils.data.ResponseHandler
    public void error(Throwable e) {
        ResponseUtil.INSTANCE.handleError(e);
    }
}

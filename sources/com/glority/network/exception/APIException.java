package com.glority.network.exception;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.exception.AppException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: APIException.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \b2\u00020\u0001:\u0001\bB'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/glority/network/exception/APIException;", "Lcom/glority/network/exception/NetworkException;", "messageName", "", LogEventArguments.ARG_MESSAGE, "code", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "Companion", "fwk-network_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes9.dex */
public final class APIException extends NetworkException {
    private static final long serialVersionUID = -8066897190745766946L;

    public APIException() {
        this(null, null, 0, 7, null);
    }

    public /* synthetic */ APIException(String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? AppException.AppError.APP_ERROR_UNKNOWN.getValue() : i);
    }

    public APIException(String str, String str2, int i) {
        super(str, str2, i);
    }
}

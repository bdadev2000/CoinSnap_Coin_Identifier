package com.glority.network.exception;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.exception.AppException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: NetworkException.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0016\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0003@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/glority/network/exception/NetworkException;", "Lcom/glority/android/core/exception/AppException;", "apiName", "", LogEventArguments.ARG_MESSAGE, "code", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "<set-?>", "getApiName", "()Ljava/lang/String;", "Companion", "fwk-network_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes9.dex */
public class NetworkException extends AppException {
    private static final long serialVersionUID = -8066897190745766939L;
    private String apiName;

    public NetworkException() {
        this(null, null, 0, 7, null);
    }

    public /* synthetic */ NetworkException(String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? AppException.AppError.APP_ERROR_UNKNOWN.getValue() : i);
    }

    public NetworkException(String str, String str2, int i) {
        super(str2, i);
        this.apiName = str;
    }

    public final String getApiName() {
        return this.apiName;
    }
}

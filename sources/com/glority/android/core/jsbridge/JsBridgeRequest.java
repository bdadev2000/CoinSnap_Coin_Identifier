package com.glority.android.core.jsbridge;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.glority.android.core.proguard.NotProguard;
import kotlin.Metadata;

/* compiled from: JsBridgeRequest.kt */
@NotProguard
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003R(\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/glority/android/core/jsbridge/JsBridgeRequest;", ExifInterface.GPS_DIRECTION_TRUE, "", "()V", "callbackId", "", "getCallbackId", "()Ljava/lang/String;", "setCallbackId", "(Ljava/lang/String;)V", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class JsBridgeRequest<T> {
    private String callbackId = "";

    public final String getCallbackId() {
        return this.callbackId;
    }

    public final void setCallbackId(String str) {
        if (str == null) {
            this.callbackId = "";
        } else {
            this.callbackId = str;
        }
    }
}

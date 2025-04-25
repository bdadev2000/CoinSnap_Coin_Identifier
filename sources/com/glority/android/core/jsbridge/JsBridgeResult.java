package com.glority.android.core.jsbridge;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.glority.android.cmsui.entity.LikeItem;
import com.glority.android.core.proguard.NotProguard;
import com.glority.android.xx.constants.LogEvents;
import kotlin.Metadata;

/* compiled from: JsBridgeResult.kt */
@NotProguard
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0003R(\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0005@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001e\u0010\r\u001a\u0004\u0018\u00018\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/glority/android/core/jsbridge/JsBridgeResult;", ExifInterface.GPS_DIRECTION_TRUE, "", "()V", "callbackId", "", "getCallbackId", "()Ljava/lang/String;", "setCallbackId", "(Ljava/lang/String;)V", "code", "getCode", "setCode", LogEvents.result, "getResult", "()Ljava/lang/Object;", "setResult", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "JsBridgeAdapter", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class JsBridgeResult<T> {
    private T result;
    private String code = LikeItem.DISLIKE;
    private String callbackId = "";

    /* compiled from: JsBridgeResult.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002R\u0012\u0010\u0003\u001a\u00028\u0001X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/glority/android/core/jsbridge/JsBridgeResult$JsBridgeAdapter;", ExifInterface.GPS_DIRECTION_TRUE, "", LogEvents.result, "getResult", "()Ljava/lang/Object;", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes7.dex */
    public interface JsBridgeAdapter<T> {
        T getResult();
    }

    public final String getCode() {
        return this.code;
    }

    public final void setCode(String str) {
        if (str == null) {
            this.code = str;
        } else {
            this.code = LikeItem.DISLIKE;
        }
    }

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

    public final T getResult() {
        return this.result;
    }

    public final void setResult(T t) {
        this.result = t;
    }
}

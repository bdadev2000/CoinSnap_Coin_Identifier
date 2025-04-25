package com.glority.android.cmsui.model;

import java.io.Serializable;
import kotlin.Metadata;

/* compiled from: JsBaseParam.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/glority/android/cmsui/model/JsBaseParam;", "Ljava/io/Serializable;", "", "()V", "rawJson", "", "getRawJson", "()Ljava/lang/String;", "setRawJson", "(Ljava/lang/String;)V", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public class JsBaseParam implements Serializable, Cloneable {
    private String rawJson;

    public Object clone() {
        return super.clone();
    }

    public final String getRawJson() {
        return this.rawJson;
    }

    public final void setRawJson(String str) {
        this.rawJson = str;
    }
}

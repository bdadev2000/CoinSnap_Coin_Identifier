package com.glority.android.cmsui2.model;

import java.io.Serializable;
import kotlin.Metadata;

/* compiled from: JsBaseParam.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/glority/android/cmsui2/model/JsBaseParam;", "Ljava/io/Serializable;", "", "<init>", "()V", "rawJson", "", "getRawJson", "()Ljava/lang/String;", "setRawJson", "(Ljava/lang/String;)V", "cmsUI2_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
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

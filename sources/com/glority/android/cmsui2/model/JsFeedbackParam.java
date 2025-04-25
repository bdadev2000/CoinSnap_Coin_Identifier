package com.glority.android.cmsui2.model;

import com.glority.android.xx.constants.Args;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: JsFeedbackParam.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/glority/android/cmsui2/model/JsFeedbackParam;", "Lcom/glority/android/cmsui2/model/JsBaseParam;", "<init>", "()V", Args.uid, "", "getUid", "()Ljava/lang/String;", "setUid", "(Ljava/lang/String;)V", "layoutName", "getLayoutName", "setLayoutName", "update", "obj", "Lorg/json/JSONObject;", "cmsUI2_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes14.dex */
public final class JsFeedbackParam extends JsBaseParam {
    private String layoutName;
    private String uid;

    @Override // com.glority.android.cmsui2.model.JsBaseParam
    public Object clone() {
        return super.clone();
    }

    public final String getUid() {
        return this.uid;
    }

    public final void setUid(String str) {
        this.uid = str;
    }

    public final String getLayoutName() {
        return this.layoutName;
    }

    public final void setLayoutName(String str) {
        this.layoutName = str;
    }

    public final JsFeedbackParam update(JSONObject obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        this.uid = obj.has(Args.uid) ? obj.optString(Args.uid) : null;
        this.layoutName = obj.has("layoutName") ? obj.optString("layoutName") : null;
        setRawJson(obj.toString());
        return this;
    }
}

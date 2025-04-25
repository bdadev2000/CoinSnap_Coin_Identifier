package com.glority.android.cmsui.model;

import com.glority.android.xx.constants.Args;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: JsFeedbackParam.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/glority/android/cmsui/model/JsFeedbackParam;", "Lcom/glority/android/cmsui/model/JsBaseParam;", "()V", "layoutName", "", "getLayoutName", "()Ljava/lang/String;", "setLayoutName", "(Ljava/lang/String;)V", Args.uid, "getUid", "setUid", "update", "obj", "Lorg/json/JSONObject;", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class JsFeedbackParam extends JsBaseParam {
    private String layoutName;
    private String uid;

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

package com.glority.android.cmsui.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: JsPoemParam.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/glority/android/cmsui/model/JsPoemParam;", "Lcom/glority/android/cmsui/model/JsBaseParam;", "()V", "content", "", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "url", "getUrl", "setUrl", "update", "obj", "Lorg/json/JSONObject;", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class JsPoemParam extends JsBaseParam {
    private String content;
    private String url;

    public final String getContent() {
        return this.content;
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public final JsPoemParam update(JSONObject obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        this.content = obj.has("content") ? obj.optString("content") : null;
        this.url = obj.has("mainImageUrl") ? obj.optString("mainImageUrl") : null;
        setRawJson(obj.toString());
        return this;
    }
}

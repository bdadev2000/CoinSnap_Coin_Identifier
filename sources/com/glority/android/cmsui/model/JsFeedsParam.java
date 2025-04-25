package com.glority.android.cmsui.model;

import com.glority.android.xx.constants.Args;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: JsFeedsParam.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0017R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/glority/android/cmsui/model/JsFeedsParam;", "Lcom/glority/android/cmsui/model/JsBaseParam;", "()V", "feedsCategory", "", "getFeedsCategory", "()Ljava/lang/String;", "setFeedsCategory", "(Ljava/lang/String;)V", "feedsId", "getFeedsId", "setFeedsId", "linkUrl", "getLinkUrl", "setLinkUrl", "summary", "getSummary", "setSummary", Args.title, "getTitle", "setTitle", "update", "obj", "Lorg/json/JSONObject;", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class JsFeedsParam extends JsBaseParam {
    private String feedsCategory;
    private String feedsId;
    private String linkUrl;
    private String summary;
    private String title;

    public final String getLinkUrl() {
        return this.linkUrl;
    }

    public final void setLinkUrl(String str) {
        this.linkUrl = str;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final String getFeedsId() {
        return this.feedsId;
    }

    public final void setFeedsId(String str) {
        this.feedsId = str;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final void setSummary(String str) {
        this.summary = str;
    }

    public final String getFeedsCategory() {
        return this.feedsCategory;
    }

    public final void setFeedsCategory(String str) {
        this.feedsCategory = str;
    }

    public final JsFeedsParam update(JSONObject obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        this.linkUrl = obj.has("linkUrl") ? obj.optString("linkUrl") : null;
        this.title = obj.has(Args.title) ? obj.optString(Args.title) : null;
        this.feedsId = obj.has("feedsId") ? obj.optString("feedsId") : null;
        this.summary = obj.has("summary") ? obj.optString("summary") : null;
        this.feedsCategory = obj.has("feedsCategory") ? obj.optString("feedsCategory") : null;
        setRawJson(obj.toString());
        return this;
    }
}

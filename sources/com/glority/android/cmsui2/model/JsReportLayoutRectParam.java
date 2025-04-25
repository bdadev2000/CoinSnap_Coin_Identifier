package com.glority.android.cmsui2.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: JsReportLayoutRectParam.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001dR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/glority/android/cmsui2/model/JsReportLayoutRectParam;", "Lcom/glority/android/cmsui2/model/JsBaseParam;", "<init>", "()V", "id", "", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "offsetTop", "", "getOffsetTop", "()Ljava/lang/Integer;", "setOffsetTop", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "offsetHeight", "getOffsetHeight", "setOffsetHeight", "hasLearnMore", "", "getHasLearnMore", "()Ljava/lang/Boolean;", "setHasLearnMore", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "update", "obj", "Lorg/json/JSONObject;", "cmsUI2_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes14.dex */
public final class JsReportLayoutRectParam extends JsBaseParam {
    private Boolean hasLearnMore;
    private String id;
    private Integer offsetHeight;
    private Integer offsetTop;

    @Override // com.glority.android.cmsui2.model.JsBaseParam
    public Object clone() {
        return super.clone();
    }

    public final String getId() {
        return this.id;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final Integer getOffsetTop() {
        return this.offsetTop;
    }

    public final void setOffsetTop(Integer num) {
        this.offsetTop = num;
    }

    public final Integer getOffsetHeight() {
        return this.offsetHeight;
    }

    public final void setOffsetHeight(Integer num) {
        this.offsetHeight = num;
    }

    public final Boolean getHasLearnMore() {
        return this.hasLearnMore;
    }

    public final void setHasLearnMore(Boolean bool) {
        this.hasLearnMore = bool;
    }

    public final JsReportLayoutRectParam update(JSONObject obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        this.id = obj.has("id") ? obj.optString("id") : null;
        this.offsetTop = obj.has("offsetTop") ? Integer.valueOf(obj.optInt("offsetTop")) : null;
        this.offsetHeight = obj.has("offsetHeight") ? Integer.valueOf(obj.optInt("offsetHeight")) : null;
        this.hasLearnMore = obj.has("hasLearnMore") ? Boolean.valueOf(obj.optBoolean("hasLearnMore")) : null;
        setRawJson(obj.toString());
        return this;
    }
}

package com.glority.android.cmsui.model;

import java.io.Serializable;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: JsData.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0003J\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0014J\b\u0010\u0016\u001a\u00020\u0014H\u0007J\u0006\u0010\u0017\u001a\u00020\u0014J\u0006\u0010\u0018\u001a\u00020\u0014J\u0006\u0010\u0019\u001a\u00020\u0014J\u0006\u0010\u001a\u001a\u00020\u0014J\u0006\u0010\u001b\u001a\u00020\u0014J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\t¨\u0006 "}, d2 = {"Lcom/glority/android/cmsui/model/JsData;", "Ljava/io/Serializable;", "", "()V", "action", "", "getAction", "()Ljava/lang/String;", "setAction", "(Ljava/lang/String;)V", "parameter", "Lcom/glority/android/cmsui/model/JsBaseParam;", "getParameter", "()Lcom/glority/android/cmsui/model/JsBaseParam;", "setParameter", "(Lcom/glority/android/cmsui/model/JsBaseParam;)V", "rawJson", "getRawJson", "setRawJson", "isFeedback", "", "isFeeds", "isImage", "isImages", "isLearnMore", "isLogEvent", "isPage", "isPoem", "update", "obj", "Lorg/json/JSONObject;", "Companion", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class JsData implements Serializable, Cloneable {
    public static final String ACTION_FEEDBACK = "contentFeedback";
    public static final String ACTION_FEEDS = "jumpToFeedsDetail";
    public static final String ACTION_IMAGE = "jumpImage";
    public static final String ACTION_IMAGES = "jumpImages";
    public static final String ACTION_LEARN_MORE = "learnMore";
    public static final String ACTION_LOG_EVENT = "logEvent";
    public static final String ACTION_PAGE = "jumpToPage";
    public static final String ACTION_POEM_DOWNLOAD = "downloadPoem";
    private String action;
    private JsBaseParam parameter;
    private String rawJson;

    public Object clone() {
        return super.clone();
    }

    public final String getAction() {
        return this.action;
    }

    public final void setAction(String str) {
        this.action = str;
    }

    public final JsBaseParam getParameter() {
        return this.parameter;
    }

    public final void setParameter(JsBaseParam jsBaseParam) {
        this.parameter = jsBaseParam;
    }

    public final String getRawJson() {
        return this.rawJson;
    }

    public final void setRawJson(String str) {
        this.rawJson = str;
    }

    public final JsData update(JSONObject obj) throws Exception {
        JsFeedbackParam update;
        Intrinsics.checkNotNullParameter(obj, "obj");
        this.rawJson = obj.toString();
        JsBaseParam jsBaseParam = null;
        this.action = obj.has("action") ? obj.optString("action") : null;
        if (obj.has("parameter")) {
            Object obj2 = obj.get("parameter");
            if (!(obj2 instanceof JSONObject)) {
                obj2 = null;
            }
            JSONObject jSONObject = (JSONObject) obj2;
            if (jSONObject != null) {
                if (isLogEvent()) {
                    update = new JsLogEventParam().update(jSONObject);
                } else if (isPage()) {
                    update = new JsPageParam().update(jSONObject);
                } else if (isFeedback() || isLearnMore()) {
                    update = new JsFeedbackParam().update(jSONObject);
                } else if (isImage()) {
                    update = new JsImgParam().update(jSONObject);
                } else if (isImages()) {
                    update = new JsImgsParam().update(jSONObject);
                } else if (isPoem()) {
                    update = new JsPoemParam().update(jSONObject);
                } else if (isFeeds()) {
                    update = new JsFeedsParam().update(jSONObject);
                } else {
                    JsBaseParam jsBaseParam2 = new JsBaseParam();
                    jsBaseParam2.setRawJson(jSONObject.toString());
                    jsBaseParam = jsBaseParam2;
                }
                jsBaseParam = update;
            }
        }
        this.parameter = jsBaseParam;
        return this;
    }

    public final boolean isLogEvent() {
        return Intrinsics.areEqual("logEvent", this.action);
    }

    public final boolean isPage() {
        return Intrinsics.areEqual("jumpToPage", this.action);
    }

    public final boolean isFeedback() {
        return Intrinsics.areEqual("contentFeedback", this.action);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "will remove in future version", replaceWith = @ReplaceWith(expression = "isImages()", imports = {}))
    public final boolean isImage() {
        return Intrinsics.areEqual("jumpImage", this.action);
    }

    public final boolean isImages() {
        return Intrinsics.areEqual("jumpImages", this.action);
    }

    public final boolean isPoem() {
        return Intrinsics.areEqual("downloadPoem", this.action);
    }

    public final boolean isLearnMore() {
        return Intrinsics.areEqual("learnMore", this.action);
    }

    public final boolean isFeeds() {
        return Intrinsics.areEqual("jumpToFeedsDetail", this.action);
    }
}

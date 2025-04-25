package com.glority.android.cmsui2.model;

import java.io.Serializable;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: JsData.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0001(B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001a\u001a\u00020\u0018J\b\u0010\u001b\u001a\u00020\u0018H\u0007J\u0006\u0010\u001c\u001a\u00020\u0018J\u0006\u0010\u001d\u001a\u00020\u0018J\u0006\u0010\u001e\u001a\u00020\u0018J\u0006\u0010\u001f\u001a\u00020\u0018J\u0006\u0010 \u001a\u00020\u0018J\u0006\u0010!\u001a\u00020\u0018J\u0006\u0010\"\u001a\u00020\u0018J\u0006\u0010#\u001a\u00020\u0018J\u0006\u0010$\u001a\u00020\u0018J\u0006\u0010%\u001a\u00020\u0018J\u0006\u0010&\u001a\u00020\u0018J\u0006\u0010'\u001a\u00020\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\n¨\u0006)"}, d2 = {"Lcom/glority/android/cmsui2/model/JsData;", "Ljava/io/Serializable;", "", "<init>", "()V", "action", "", "getAction", "()Ljava/lang/String;", "setAction", "(Ljava/lang/String;)V", "parameter", "Lcom/glority/android/cmsui2/model/JsBaseParam;", "getParameter", "()Lcom/glority/android/cmsui2/model/JsBaseParam;", "setParameter", "(Lcom/glority/android/cmsui2/model/JsBaseParam;)V", "rawJson", "getRawJson", "setRawJson", "update", "obj", "Lorg/json/JSONObject;", "isLogEvent", "", "isPage", "isFeedback", "isImage", "isImages", "isPoem", "isLearnMore", "isFeeds", "isLayoutRect", "isLayoutSubpageRect", JsData.ACTION_OPEN_IMAGE_ADVISED, JsData.ACTION_OPEN_ADVISED, "isOpenDevelopmentHistory", "isOpenCoinDesign", "isOpenCoinDescription", "isOpenCoinFactsFunnyStory", "Companion", "cmsUI2_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes14.dex */
public final class JsData implements Serializable, Cloneable {
    public static final String ACTION_FEEDBACK = "contentFeedback";
    public static final String ACTION_FEEDS = "jumpToFeedsDetail";
    public static final String ACTION_IMAGE = "jumpImage";
    public static final String ACTION_IMAGES = "jumpImages";
    public static final String ACTION_LAYOUT_RECT = "reportLayoutRect";
    public static final String ACTION_LAYOUT_SUBPAGE_RECT = "reportLayoutSubpageRect";
    public static final String ACTION_LEARN_MORE = "learnMore";
    public static final String ACTION_LOG_EVENT = "logEvent";
    public static final String ACTION_OPEN_ADVISED = "openAdvised";
    public static final String ACTION_OPEN_COIN_DESCRIPTION = "openCoinDescription";
    public static final String ACTION_OPEN_COIN_DESIGN = "openCoinDesign";
    public static final String ACTION_OPEN_COIN_FACTS_FUNNY_STORY = "openCoinFactsFunnyStory";
    public static final String ACTION_OPEN_DEVELOPMENT_HISTORY = "openDevelopmentHistory";
    public static final String ACTION_OPEN_IMAGE_ADVISED = "openImageAdvised";
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
            JSONObject jSONObject = obj2 instanceof JSONObject ? (JSONObject) obj2 : null;
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
                } else if (isLayoutRect()) {
                    update = new JsReportLayoutRectParam().update(jSONObject);
                } else if (isLayoutSubpageRect()) {
                    update = new JsReportLayoutSubpageRectParam().update(jSONObject);
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

    public final boolean isLayoutRect() {
        return Intrinsics.areEqual(ACTION_LAYOUT_RECT, this.action);
    }

    public final boolean isLayoutSubpageRect() {
        return Intrinsics.areEqual(ACTION_LAYOUT_SUBPAGE_RECT, this.action);
    }

    public final boolean openImageAdvised() {
        return Intrinsics.areEqual(ACTION_OPEN_IMAGE_ADVISED, this.action);
    }

    public final boolean openAdvised() {
        return Intrinsics.areEqual(ACTION_OPEN_ADVISED, this.action);
    }

    public final boolean isOpenDevelopmentHistory() {
        return Intrinsics.areEqual(ACTION_OPEN_DEVELOPMENT_HISTORY, this.action);
    }

    public final boolean isOpenCoinDesign() {
        return Intrinsics.areEqual(ACTION_OPEN_COIN_DESIGN, this.action);
    }

    public final boolean isOpenCoinDescription() {
        return Intrinsics.areEqual(ACTION_OPEN_COIN_DESCRIPTION, this.action);
    }

    public final boolean isOpenCoinFactsFunnyStory() {
        return Intrinsics.areEqual(ACTION_OPEN_COIN_FACTS_FUNNY_STORY, this.action);
    }
}

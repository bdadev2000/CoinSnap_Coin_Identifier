package com.glority.android.cmsui2.model;

import android.util.Log;
import com.glority.android.core.app.AppContext;
import com.glority.utils.stability.LogUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: JsReportLayoutSubpageRectParam.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001dR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/glority/android/cmsui2/model/JsReportLayoutSubpageRectParam;", "Lcom/glority/android/cmsui2/model/JsBaseParam;", "<init>", "()V", "id", "", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "offsetTop", "", "getOffsetTop", "()Ljava/lang/Integer;", "setOffsetTop", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "offsetHeight", "getOffsetHeight", "setOffsetHeight", "subpages", "", "Lcom/glority/android/cmsui2/model/JsReportLayoutSubpageRectParam$SubpageRectParam;", "getSubpages", "()Ljava/util/List;", "setSubpages", "(Ljava/util/List;)V", "update", "obj", "Lorg/json/JSONObject;", "SubpageRectParam", "cmsUI2_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes14.dex */
public final class JsReportLayoutSubpageRectParam extends JsBaseParam {
    private String id;
    private Integer offsetHeight;
    private Integer offsetTop;
    private List<SubpageRectParam> subpages = new ArrayList();

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

    public final List<SubpageRectParam> getSubpages() {
        return this.subpages;
    }

    public final void setSubpages(List<SubpageRectParam> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.subpages = list;
    }

    /* compiled from: JsReportLayoutSubpageRectParam.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/glority/android/cmsui2/model/JsReportLayoutSubpageRectParam$SubpageRectParam;", "Lcom/glority/android/cmsui2/model/JsBaseParam;", "<init>", "()V", "id", "", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "offsetTop", "", "getOffsetTop", "()Ljava/lang/Integer;", "setOffsetTop", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "offsetHeight", "getOffsetHeight", "setOffsetHeight", "order", "getOrder", "setOrder", "update", "obj", "Lorg/json/JSONObject;", "cmsUI2_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes14.dex */
    public static final class SubpageRectParam extends JsBaseParam {
        private String id;
        private Integer offsetHeight;
        private Integer offsetTop;
        private Integer order;

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

        public final Integer getOrder() {
            return this.order;
        }

        public final void setOrder(Integer num) {
            this.order = num;
        }

        public final SubpageRectParam update(JSONObject obj) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            this.id = obj.has("id") ? obj.optString("id") : null;
            this.offsetTop = obj.has("offsetTop") ? Integer.valueOf(obj.optInt("offsetTop")) : null;
            this.offsetHeight = obj.has("offsetHeight") ? Integer.valueOf(obj.optInt("offsetHeight")) : null;
            this.order = obj.has("order") ? Integer.valueOf(obj.optInt("order")) : null;
            setRawJson(obj.toString());
            return this;
        }
    }

    public final JsReportLayoutSubpageRectParam update(JSONObject obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        this.id = obj.has("id") ? obj.optString("id") : null;
        this.offsetTop = obj.has("offsetTop") ? Integer.valueOf(obj.optInt("offsetTop")) : null;
        this.offsetHeight = obj.has("offsetHeight") ? Integer.valueOf(obj.optInt("offsetHeight")) : null;
        if (obj.has("subpages") && !obj.isNull("subpages")) {
            try {
                JSONArray jSONArray = obj.getJSONArray("subpages");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    SubpageRectParam subpageRectParam = new SubpageRectParam();
                    Object obj2 = jSONArray.get(i);
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                    this.subpages.add(subpageRectParam.update((JSONObject) obj2));
                }
                Unit unit = Unit.INSTANCE;
            } catch (Exception e) {
                if (AppContext.INSTANCE.isDebugMode()) {
                    LogUtils.e(Log.getStackTraceString(e));
                }
            }
        }
        setRawJson(obj.toString());
        return this;
    }
}

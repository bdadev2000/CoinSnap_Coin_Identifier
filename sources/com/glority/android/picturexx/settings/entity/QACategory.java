package com.glority.android.picturexx.settings.entity;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: FAQAndHelpEntity.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0013\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0002\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/glority/android/picturexx/settings/entity/QACategory;", "", "<init>", "()V", "jsonObject", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "order", "", "getOrder", "()I", "setOrder", "(I)V", "categoryName", "", "getCategoryName", "()Ljava/lang/String;", "setCategoryName", "(Ljava/lang/String;)V", "qaList", "", "Lcom/glority/android/picturexx/settings/entity/QuestionAndAnswer;", "getQaList", "()Ljava/util/List;", "setQaList", "(Ljava/util/List;)V", "settings_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class QACategory {
    private String categoryName;
    private int order;
    private List<QuestionAndAnswer> qaList;

    public final int getOrder() {
        return this.order;
    }

    public final void setOrder(int i) {
        this.order = i;
    }

    public final String getCategoryName() {
        return this.categoryName;
    }

    public final void setCategoryName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.categoryName = str;
    }

    public final List<QuestionAndAnswer> getQaList() {
        return this.qaList;
    }

    public final void setQaList(List<QuestionAndAnswer> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.qaList = list;
    }

    public QACategory() {
        this.categoryName = "";
        this.qaList = new ArrayList();
    }

    public QACategory(JSONObject jSONObject) {
        String str = "";
        this.categoryName = "";
        this.qaList = new ArrayList();
        if (jSONObject == null) {
            return;
        }
        this.order = (!jSONObject.has("order") || jSONObject.isNull("order")) ? -1 : jSONObject.getInt("order");
        if (jSONObject.has("category") && !jSONObject.isNull("category")) {
            str = jSONObject.getString("category");
            Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
        }
        this.categoryName = str;
        if (!jSONObject.has("qas") || jSONObject.isNull("qas")) {
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("qas");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if ((obj instanceof JSONArray) && ((JSONArray) obj).length() == 0) {
                obj = new JSONObject();
            }
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
            this.qaList.add(new QuestionAndAnswer((JSONObject) obj));
        }
    }
}

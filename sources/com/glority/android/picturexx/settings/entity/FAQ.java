package com.glority.android.picturexx.settings.entity;

import com.glority.android.xx.constants.Args;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: FAQAndHelpEntity.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0013\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0002\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/glority/android/picturexx/settings/entity/FAQ;", "", "<init>", "()V", "jsonObject", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", Args.title, "", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "prodColor", "getProdColor", "setProdColor", "faqs", "", "Lcom/glority/android/picturexx/settings/entity/QACategory;", "getFaqs", "()Ljava/util/List;", "setFaqs", "(Ljava/util/List;)V", "settings_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class FAQ {
    private List<QACategory> faqs;
    private String prodColor;
    private String title;

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final String getProdColor() {
        return this.prodColor;
    }

    public final void setProdColor(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.prodColor = str;
    }

    public final List<QACategory> getFaqs() {
        return this.faqs;
    }

    public final void setFaqs(List<QACategory> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.faqs = list;
    }

    public FAQ() {
        this.title = "";
        this.prodColor = "";
        this.faqs = new ArrayList();
    }

    public FAQ(JSONObject jSONObject) {
        String str;
        String str2 = "";
        this.title = "";
        this.prodColor = "";
        this.faqs = new ArrayList();
        if (jSONObject == null) {
            return;
        }
        if (jSONObject.has(Args.title) && !jSONObject.isNull(Args.title)) {
            str2 = jSONObject.getString(Args.title);
            Intrinsics.checkNotNullExpressionValue(str2, "getString(...)");
        }
        this.title = str2;
        if (jSONObject.has("prod_color") && !jSONObject.isNull("prod_color")) {
            str = jSONObject.getString("prod_color");
            Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
        } else {
            str = "#000000";
        }
        this.prodColor = str;
        if (!jSONObject.has("faqs") || jSONObject.isNull("faqs")) {
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("faqs");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if ((obj instanceof JSONArray) && ((JSONArray) obj).length() == 0) {
                obj = new JSONObject();
            }
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
            this.faqs.add(new QACategory((JSONObject) obj));
        }
    }
}

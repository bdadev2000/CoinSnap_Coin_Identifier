package com.glority.android.picturexx.settings.entity;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: FAQAndHelpEntity.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0013\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0002\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/glority/android/picturexx/settings/entity/QuestionAndAnswer;", "", "<init>", "()V", "jsonObject", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "order", "", "getOrder", "()I", "setOrder", "(I)V", "question", "", "getQuestion", "()Ljava/lang/String;", "setQuestion", "(Ljava/lang/String;)V", "answer", "getAnswer", "setAnswer", "appInvisible", "", "getAppInvisible", "()Z", "setAppInvisible", "(Z)V", "clickMethod", "Lkotlin/Function0;", "", "getClickMethod", "()Lkotlin/jvm/functions/Function0;", "setClickMethod", "(Lkotlin/jvm/functions/Function0;)V", "settings_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class QuestionAndAnswer {
    private String answer;
    private boolean appInvisible;
    private Function0<Unit> clickMethod;
    private int order;
    private String question;

    public final int getOrder() {
        return this.order;
    }

    public final void setOrder(int i) {
        this.order = i;
    }

    public final String getQuestion() {
        return this.question;
    }

    public final void setQuestion(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.question = str;
    }

    public final String getAnswer() {
        return this.answer;
    }

    public final void setAnswer(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.answer = str;
    }

    public final boolean getAppInvisible() {
        return this.appInvisible;
    }

    public final void setAppInvisible(boolean z) {
        this.appInvisible = z;
    }

    public final Function0<Unit> getClickMethod() {
        return this.clickMethod;
    }

    public final void setClickMethod(Function0<Unit> function0) {
        this.clickMethod = function0;
    }

    public QuestionAndAnswer() {
        this.question = "";
        this.answer = "";
        this.appInvisible = true;
    }

    public QuestionAndAnswer(JSONObject jSONObject) {
        String str;
        String str2 = "";
        this.question = "";
        this.answer = "";
        this.appInvisible = true;
        if (jSONObject == null) {
            return;
        }
        this.order = (!jSONObject.has("order") || jSONObject.isNull("order")) ? -1 : jSONObject.getInt("order");
        if (!jSONObject.has("q") || jSONObject.isNull("q")) {
            str = "";
        } else {
            str = jSONObject.getString("q");
            Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
        }
        this.question = str;
        if (jSONObject.has("a") && !jSONObject.isNull("a")) {
            str2 = jSONObject.getString("a");
            Intrinsics.checkNotNullExpressionValue(str2, "getString(...)");
        }
        this.answer = str2;
        this.appInvisible = (!jSONObject.has("app_invisible") || jSONObject.isNull("app_invisible")) ? false : jSONObject.getBoolean("app_invisible");
    }
}

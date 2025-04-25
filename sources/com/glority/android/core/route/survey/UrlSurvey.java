package com.glority.android.core.route.survey;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.modules.Consts;
import com.glority.android.survey.event.LogEvents;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UrlSurvey.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/glority/android/core/route/survey/UrlSurvey;", "", "()V", "MODULE", "", "getMODULE", "()Ljava/lang/String;", "setMODULE", "(Ljava/lang/String;)V", "URL_SURVEY_CLOSE", "getURL_SURVEY_CLOSE", "setURL_SURVEY_CLOSE", "URL_SURVEY_OPEN", "getURL_SURVEY_OPEN", "setURL_SURVEY_OPEN", "URL_SURVEY_SAVE_TAG", "getURL_SURVEY_SAVE_TAG", "setURL_SURVEY_SAVE_TAG", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class UrlSurvey {
    public static final UrlSurvey INSTANCE = new UrlSurvey();
    private static String MODULE;
    private static String URL_SURVEY_CLOSE;
    private static String URL_SURVEY_OPEN;
    private static String URL_SURVEY_SAVE_TAG;

    private UrlSurvey() {
    }

    static {
        String stringPlus = Intrinsics.stringPlus(Consts.INSTANCE.getSCHEME_CONSUMER(), LogEvents.SURVEY);
        MODULE = stringPlus;
        URL_SURVEY_OPEN = Intrinsics.stringPlus(stringPlus, "/open");
        URL_SURVEY_CLOSE = Intrinsics.stringPlus(MODULE, "/close");
        URL_SURVEY_SAVE_TAG = Intrinsics.stringPlus(MODULE, "/save_tag");
    }

    public final String getMODULE() {
        return MODULE;
    }

    public final void setMODULE(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        MODULE = str;
    }

    public final String getURL_SURVEY_OPEN() {
        return URL_SURVEY_OPEN;
    }

    public final void setURL_SURVEY_OPEN(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_SURVEY_OPEN = str;
    }

    public final String getURL_SURVEY_CLOSE() {
        return URL_SURVEY_CLOSE;
    }

    public final void setURL_SURVEY_CLOSE(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_SURVEY_CLOSE = str;
    }

    public final String getURL_SURVEY_SAVE_TAG() {
        return URL_SURVEY_SAVE_TAG;
    }

    public final void setURL_SURVEY_SAVE_TAG(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_SURVEY_SAVE_TAG = str;
    }
}

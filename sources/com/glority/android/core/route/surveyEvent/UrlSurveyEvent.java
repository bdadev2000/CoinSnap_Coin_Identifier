package com.glority.android.core.route.surveyEvent;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.modules.Consts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UrlVipEvent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/glority/android/core/route/surveyEvent/UrlSurveyEvent;", "", "()V", "MODULE", "", "getMODULE", "()Ljava/lang/String;", "setMODULE", "(Ljava/lang/String;)V", "URL_SURVEY_ADD_TAG_TO_ITEM", "getURL_SURVEY_ADD_TAG_TO_ITEM", "URL_SURVEY_ADD_TAG_TO_NONITEM", "getURL_SURVEY_ADD_TAG_TO_NONITEM", "URL_SURVEY_ADD_TO_MMS", "getURL_SURVEY_ADD_TO_MMS", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class UrlSurveyEvent {
    public static final UrlSurveyEvent INSTANCE = new UrlSurveyEvent();
    private static String MODULE;
    private static final String URL_SURVEY_ADD_TAG_TO_ITEM;
    private static final String URL_SURVEY_ADD_TAG_TO_NONITEM;
    private static final String URL_SURVEY_ADD_TO_MMS;

    private UrlSurveyEvent() {
    }

    static {
        String stringPlus = Intrinsics.stringPlus(Consts.INSTANCE.getSCHEME_CONSUMER(), "surveyEvent");
        MODULE = stringPlus;
        URL_SURVEY_ADD_TAG_TO_ITEM = Intrinsics.stringPlus(stringPlus, "/url_survey_add_tag_to_item");
        URL_SURVEY_ADD_TAG_TO_NONITEM = Intrinsics.stringPlus(MODULE, "/url_survey_add_tag_to_nonitem");
        URL_SURVEY_ADD_TO_MMS = Intrinsics.stringPlus(MODULE, "/url_survey_add_to_mms");
    }

    public final String getMODULE() {
        return MODULE;
    }

    public final void setMODULE(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        MODULE = str;
    }

    public final String getURL_SURVEY_ADD_TAG_TO_ITEM() {
        return URL_SURVEY_ADD_TAG_TO_ITEM;
    }

    public final String getURL_SURVEY_ADD_TAG_TO_NONITEM() {
        return URL_SURVEY_ADD_TAG_TO_NONITEM;
    }

    public final String getURL_SURVEY_ADD_TO_MMS() {
        return URL_SURVEY_ADD_TO_MMS;
    }
}

package com.glority.android.survey.event;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LogEvents.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004J\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/glority/android/survey/event/LogEvents;", "", "()V", "SURVEY", "", "SURVEY_BA_CLOSE", "SURVEY_BA_SUBMIT", "SURVEY_BQ", "SURVEY_BQ_NO", "SURVEY_BQ_YES", "SURVEY_REASON", "SURVEY_REASON_CLOSE_CLICK", "SURVEY_REASON_INPUT", "SURVEY_REASON_SUBMIT_CLICK", "SURVEY_RESULT", "SURVEY_THANKS", "eventClose", NotificationCompat.CATEGORY_EVENT, "eventOpen", "eventViewTime", "base-survey_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class LogEvents {
    public static final LogEvents INSTANCE = new LogEvents();
    public static final String SURVEY = "survey";
    public static final String SURVEY_BA_CLOSE = "survey_ba_close";
    public static final String SURVEY_BA_SUBMIT = "survey_ba_submit";
    public static final String SURVEY_BQ = "survey_bq";
    public static final String SURVEY_BQ_NO = "survey_bq_no";
    public static final String SURVEY_BQ_YES = "survey_bq_yes";
    public static final String SURVEY_REASON = "surveyreason";
    public static final String SURVEY_REASON_CLOSE_CLICK = "surveyreasoninput_close_click";
    public static final String SURVEY_REASON_INPUT = "surveyreasoninput";
    public static final String SURVEY_REASON_SUBMIT_CLICK = "surveyreasoninput_submit_click";
    public static final String SURVEY_RESULT = "survey_result";
    public static final String SURVEY_THANKS = "surveythanks";

    private LogEvents() {
    }

    public final String eventOpen(String event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return event + "_open";
    }

    public final String eventClose(String event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return event + "_close";
    }

    public final String eventViewTime(String event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return event + "_view_time";
    }
}

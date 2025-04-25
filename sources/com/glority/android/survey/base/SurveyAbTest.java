package com.glority.android.survey.base;

import android.util.Log;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.route.abtest.AbtestGetVariableDataRequest;
import com.glority.android.core.route.abtest.AbtestGetVariableRequest;
import com.glority.utils.stability.LogUtils;
import kotlin.Metadata;

/* compiled from: SurveyAbTest.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004¨\u0006\b"}, d2 = {"Lcom/glority/android/survey/base/SurveyAbTest;", "", "()V", "surveyNOVipNoFirst", "", "surveyNoVipFirst", "surveyVipFirst", "surveyVipNoFirst", "base-survey_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class SurveyAbTest {
    public static final SurveyAbTest INSTANCE = new SurveyAbTest();

    private SurveyAbTest() {
    }

    public final int surveyVipFirst() {
        Integer result = new AbtestGetVariableRequest("vip_survey_rate").toResult();
        if (result != null) {
            return result.intValue();
        }
        return 0;
    }

    public final int surveyVipNoFirst() {
        String result = new AbtestGetVariableDataRequest("vip_survey_rate", String.valueOf(surveyVipFirst())).toResult();
        Integer num = null;
        if (result != null) {
            try {
                num = Integer.valueOf(Integer.parseInt(result));
            } catch (Exception e) {
                if (AppContext.INSTANCE.isDebugMode()) {
                    LogUtils.e(Log.getStackTraceString(e));
                }
            }
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final int surveyNoVipFirst() {
        Integer result = new AbtestGetVariableRequest("survey_rate").toResult();
        if (result != null) {
            return result.intValue();
        }
        return 0;
    }

    public final int surveyNOVipNoFirst() {
        String result = new AbtestGetVariableDataRequest("survey_rate", String.valueOf(surveyNoVipFirst())).toResult();
        Integer num = null;
        if (result != null) {
            try {
                num = Integer.valueOf(Integer.parseInt(result));
            } catch (Exception e) {
                if (AppContext.INSTANCE.isDebugMode()) {
                    LogUtils.e(Log.getStackTraceString(e));
                }
            }
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}

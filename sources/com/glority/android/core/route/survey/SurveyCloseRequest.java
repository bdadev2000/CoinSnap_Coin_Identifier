package com.glority.android.core.route.survey;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.proguard.NotProguard;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.xx.constants.Args;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SurveyCloseRequest.kt */
@NotProguard
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/glority/android/core/route/survey/SurveyCloseRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "pageFrom", Args.pageName, "surveyResultIndex", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getPageFrom", "()Ljava/lang/String;", "setPageFrom", "(Ljava/lang/String;)V", "getPageName", "setPageName", "getSurveyResultIndex", "()I", "setSurveyResultIndex", "(I)V", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class SurveyCloseRequest extends RouteRequest<String> {
    private String pageFrom;
    private String pageName;
    private int surveyResultIndex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurveyCloseRequest(String pageFrom, String pageName, int i) {
        super(UrlSurvey.INSTANCE.getURL_SURVEY_CLOSE(), null, null, 6, null);
        Intrinsics.checkNotNullParameter(pageFrom, "pageFrom");
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        this.pageFrom = pageFrom;
        this.pageName = pageName;
        this.surveyResultIndex = i;
    }

    public /* synthetic */ SurveyCloseRequest(String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, str2, i);
    }

    public final String getPageFrom() {
        return this.pageFrom;
    }

    public final String getPageName() {
        return this.pageName;
    }

    public final int getSurveyResultIndex() {
        return this.surveyResultIndex;
    }

    public final void setPageFrom(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pageFrom = str;
    }

    public final void setPageName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pageName = str;
    }

    public final void setSurveyResultIndex(int i) {
        this.surveyResultIndex = i;
    }
}

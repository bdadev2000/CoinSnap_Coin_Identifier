package com.glority.android.core.route.welcome;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.proguard.NotProguard;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.xx.constants.Args;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WelcomeOpenRequest.kt */
@NotProguard
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0015\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\nR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/glority/android/core/route/welcome/WelcomeOpenRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "pageFrom", Args.pageName, "pageGroup", "requestCode", "", "surveyResult", "extraParam", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getExtraParam", "()Ljava/lang/String;", "setExtraParam", "(Ljava/lang/String;)V", "getPageFrom", "setPageFrom", "getPageGroup", "setPageGroup", "getPageName", "setPageName", "getRequestCode", "()Ljava/lang/Integer;", "setRequestCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getSurveyResult", "setSurveyResult", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class WelcomeOpenRequest extends RouteRequest<String> {
    private String extraParam;
    private String pageFrom;
    private String pageGroup;
    private String pageName;
    private Integer requestCode;
    private Integer surveyResult;

    public final String getPageFrom() {
        return this.pageFrom;
    }

    public final void setPageFrom(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pageFrom = str;
    }

    public final String getPageName() {
        return this.pageName;
    }

    public final void setPageName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pageName = str;
    }

    public final String getPageGroup() {
        return this.pageGroup;
    }

    public final void setPageGroup(String str) {
        this.pageGroup = str;
    }

    public final Integer getRequestCode() {
        return this.requestCode;
    }

    public final void setRequestCode(Integer num) {
        this.requestCode = num;
    }

    public final Integer getSurveyResult() {
        return this.surveyResult;
    }

    public final void setSurveyResult(Integer num) {
        this.surveyResult = num;
    }

    public final String getExtraParam() {
        return this.extraParam;
    }

    public final void setExtraParam(String str) {
        this.extraParam = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomeOpenRequest(String pageFrom, String pageName, String str, Integer num, Integer num2, String str2) {
        super(UrlWelcome.INSTANCE.getURL_OPEN(), null, null, 6, null);
        Intrinsics.checkNotNullParameter(pageFrom, "pageFrom");
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        this.pageFrom = pageFrom;
        this.pageName = pageName;
        this.pageGroup = str;
        this.requestCode = num;
        this.surveyResult = num2;
        this.extraParam = str2;
    }
}

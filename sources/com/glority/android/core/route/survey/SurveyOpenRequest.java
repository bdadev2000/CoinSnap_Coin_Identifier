package com.glority.android.core.route.survey;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.proguard.NotProguard;
import com.glority.android.core.route.RouteRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SurveyOpenRequest.kt */
@NotProguard
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u001a\u0010\u0005\u001a\u00020\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0003\u001a\u00020\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/glority/android/core/route/survey/SurveyOpenRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "paramString", "pageFrom", "itemId", "requestCode", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getItemId", "()Ljava/lang/String;", "setItemId", "(Ljava/lang/String;)V", "getPageFrom", "setPageFrom", "getParamString", "setParamString", "getRequestCode", "()I", "setRequestCode", "(I)V", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class SurveyOpenRequest extends RouteRequest<String> {
    private String itemId;
    private String pageFrom;
    private String paramString;
    private int requestCode;

    public final String getParamString() {
        return this.paramString;
    }

    public final void setParamString(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.paramString = str;
    }

    public final String getPageFrom() {
        return this.pageFrom;
    }

    public final void setPageFrom(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pageFrom = str;
    }

    public /* synthetic */ SurveyOpenRequest(String str, String str2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? -1 : i);
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final void setItemId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.itemId = str;
    }

    public final int getRequestCode() {
        return this.requestCode;
    }

    public final void setRequestCode(int i) {
        this.requestCode = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurveyOpenRequest(String paramString, String pageFrom, String itemId, int i) {
        super(UrlSurvey.INSTANCE.getURL_SURVEY_OPEN(), null, null, 6, null);
        Intrinsics.checkNotNullParameter(paramString, "paramString");
        Intrinsics.checkNotNullParameter(pageFrom, "pageFrom");
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        this.paramString = paramString;
        this.pageFrom = pageFrom;
        this.itemId = itemId;
        this.requestCode = i;
    }
}

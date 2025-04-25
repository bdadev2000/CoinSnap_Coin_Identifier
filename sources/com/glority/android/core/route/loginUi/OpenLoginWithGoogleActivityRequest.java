package com.glority.android.core.route.loginUi;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.xx.constants.Args;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OpenLoginWithGoogleActivityRequest.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0002\u0010\nR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/glority/android/core/route/loginUi/OpenLoginWithGoogleActivityRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", Args.pageName, "", "pageFrom", "pageType", "", "requestCode", "group", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)V", "getGroup", "()Ljava/lang/String;", "setGroup", "(Ljava/lang/String;)V", "getPageFrom", "setPageFrom", "getPageName", "getPageType", "()I", "setPageType", "(I)V", "getRequestCode", "setRequestCode", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class OpenLoginWithGoogleActivityRequest extends RouteRequest<Boolean> {
    private String group;
    private String pageFrom;
    private final String pageName;
    private int pageType;
    private int requestCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenLoginWithGoogleActivityRequest(String str, String str2, int i, int i2, String group) {
        super(UrlLoginUi.INSTANCE.getURL_LOGIN_WITH_GOOGLE(), null, null, 6, null);
        Intrinsics.checkNotNullParameter(group, "group");
        this.pageName = str;
        this.pageFrom = str2;
        this.pageType = i;
        this.requestCode = i2;
        this.group = group;
    }

    public /* synthetic */ OpenLoginWithGoogleActivityRequest(String str, String str2, int i, int i2, String str3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? " " : str2, i, i2, (i3 & 16) != 0 ? "" : str3);
    }

    public final String getGroup() {
        return this.group;
    }

    public final String getPageFrom() {
        return this.pageFrom;
    }

    public final String getPageName() {
        return this.pageName;
    }

    public final int getPageType() {
        return this.pageType;
    }

    public final int getRequestCode() {
        return this.requestCode;
    }

    public final void setGroup(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.group = str;
    }

    public final void setPageFrom(String str) {
        this.pageFrom = str;
    }

    public final void setPageType(int i) {
        this.pageType = i;
    }

    public final void setRequestCode(int i) {
        this.requestCode = i;
    }
}

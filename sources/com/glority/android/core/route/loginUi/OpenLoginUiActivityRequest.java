package com.glority.android.core.route.loginUi;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.xx.constants.Args;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OpenLoginUiActivityRequest.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0002\u0010\u000bR\u001a\u0010\n\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\rR\u001a\u0010\b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0011\"\u0004\b\u0018\u0010\u0013R\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0011\"\u0004\b\u001a\u0010\u0013¨\u0006\u001b"}, d2 = {"Lcom/glority/android/core/route/loginUi/OpenLoginUiActivityRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "loginUiMemo", "", Args.pageName, "", "pageFrom", "pageType", "requestCode", "group", "(ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;)V", "getGroup", "()Ljava/lang/String;", "setGroup", "(Ljava/lang/String;)V", "getLoginUiMemo", "()I", "setLoginUiMemo", "(I)V", "getPageFrom", "setPageFrom", "getPageName", "getPageType", "setPageType", "getRequestCode", "setRequestCode", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class OpenLoginUiActivityRequest extends RouteRequest<Boolean> {
    private String group;
    private int loginUiMemo;
    private String pageFrom;
    private final String pageName;
    private int pageType;
    private int requestCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenLoginUiActivityRequest(int i, String str, String str2, int i2, int i3, String group) {
        super(UrlLoginUi.INSTANCE.getURL_LOGIN_OPEN(), null, null, 6, null);
        Intrinsics.checkNotNullParameter(group, "group");
        this.loginUiMemo = i;
        this.pageName = str;
        this.pageFrom = str2;
        this.pageType = i2;
        this.requestCode = i3;
        this.group = group;
    }

    public /* synthetic */ OpenLoginUiActivityRequest(int i, String str, String str2, int i2, int i3, String str3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i4 & 4) != 0 ? " " : str2, i2, i3, (i4 & 32) != 0 ? "" : str3);
    }

    public final String getGroup() {
        return this.group;
    }

    public final int getLoginUiMemo() {
        return this.loginUiMemo;
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

    public final void setLoginUiMemo(int i) {
        this.loginUiMemo = i;
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

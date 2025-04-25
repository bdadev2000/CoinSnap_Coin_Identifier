package com.glority.android.core.route.guide;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.proguard.NotProguard;
import com.glority.android.core.route.RouteRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: BillingUICloseRequest.kt */
@NotProguard
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/glority/android/core/route/guide/BillingUICloseRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "requestCode", "", "pageFrom", "", "pageType", "(ILjava/lang/String;Ljava/lang/String;)V", "getPageFrom", "()Ljava/lang/String;", "setPageFrom", "(Ljava/lang/String;)V", "getPageType", "setPageType", "getRequestCode", "()I", "setRequestCode", "(I)V", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class BillingUICloseRequest extends RouteRequest<Boolean> {
    private String pageFrom;
    private String pageType;
    private int requestCode;

    public BillingUICloseRequest(int i, String str, String str2) {
        super(UrlGuide.INSTANCE.getURL_BILLING_UI_CLOSE(), null, null, 6, null);
        this.requestCode = i;
        this.pageFrom = str;
        this.pageType = str2;
    }

    public /* synthetic */ BillingUICloseRequest(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2);
    }

    public final String getPageFrom() {
        return this.pageFrom;
    }

    public final String getPageType() {
        return this.pageType;
    }

    public final int getRequestCode() {
        return this.requestCode;
    }

    public final void setPageFrom(String str) {
        this.pageFrom = str;
    }

    public final void setPageType(String str) {
        this.pageType = str;
    }

    public final void setRequestCode(int i) {
        this.requestCode = i;
    }
}

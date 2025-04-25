package com.glority.android.core.route.guide;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.proguard.NotProguard;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.xx.constants.Args;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ConvertPageOpenRequest.kt */
@NotProguard
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\tR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/glority/android/core/route/guide/ConvertPageOpenRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", Args.pageName, "pageFrom", "pageType", "", "requestCode", "gloup", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)V", "getGloup", "()Ljava/lang/String;", "setGloup", "(Ljava/lang/String;)V", "getPageFrom", "setPageFrom", "getPageName", "getPageType", "()I", "setPageType", "(I)V", "getRequestCode", "setRequestCode", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class ConvertPageOpenRequest extends RouteRequest<String> {
    private String gloup;
    private String pageFrom;
    private final String pageName;
    private int pageType;
    private int requestCode;

    public ConvertPageOpenRequest(String str, String str2, int i, int i2, String str3) {
        super(UrlGuide.INSTANCE.getURL_OPEN_CONVERT_PAGE(), null, null, 6, null);
        this.pageName = str;
        this.pageFrom = str2;
        this.pageType = i;
        this.requestCode = i2;
        this.gloup = str3;
    }

    public /* synthetic */ ConvertPageOpenRequest(String str, String str2, int i, int i2, String str3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? " " : str2, (i3 & 4) != 0 ? -1 : i, (i3 & 8) != 0 ? -1 : i2, (i3 & 16) != 0 ? "" : str3);
    }

    public final String getGloup() {
        return this.gloup;
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

    public final void setGloup(String str) {
        this.gloup = str;
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

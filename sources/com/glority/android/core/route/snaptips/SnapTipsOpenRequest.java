package com.glority.android.core.route.snaptips;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.proguard.NotProguard;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.xx.constants.Args;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: SnapTipsOpenRequest.kt */
@NotProguard
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001a\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001BS\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001e\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\n\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001c¨\u0006 "}, d2 = {"Lcom/glority/android/core/route/snaptips/SnapTipsOpenRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", Args.pageName, "pageFrom", "pageType", "", "requestCode", "gloup", "targetPositionX", "targetPositionY", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getGloup", "()Ljava/lang/String;", "setGloup", "(Ljava/lang/String;)V", "getPageFrom", "setPageFrom", "getPageName", "getPageType", "()I", "setPageType", "(I)V", "getRequestCode", "setRequestCode", "getTargetPositionX", "()Ljava/lang/Integer;", "setTargetPositionX", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getTargetPositionY", "setTargetPositionY", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class SnapTipsOpenRequest extends RouteRequest<String> {
    private String gloup;
    private String pageFrom;
    private final String pageName;
    private int pageType;
    private int requestCode;
    private Integer targetPositionX;
    private Integer targetPositionY;

    public SnapTipsOpenRequest(String str, String str2, int i, int i2, String str3, Integer num, Integer num2) {
        super(UrlSnapTips.INSTANCE.getURL_SNAP_TIPS(), null, null, 6, null);
        this.pageName = str;
        this.pageFrom = str2;
        this.pageType = i;
        this.requestCode = i2;
        this.gloup = str3;
        this.targetPositionX = num;
        this.targetPositionY = num2;
    }

    public /* synthetic */ SnapTipsOpenRequest(String str, String str2, int i, int i2, String str3, Integer num, Integer num2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? " " : str2, (i3 & 4) != 0 ? -1 : i, (i3 & 8) == 0 ? i2 : -1, (i3 & 16) != 0 ? "" : str3, (i3 & 32) != 0 ? 0 : num, (i3 & 64) != 0 ? 0 : num2);
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

    public final Integer getTargetPositionX() {
        return this.targetPositionX;
    }

    public final Integer getTargetPositionY() {
        return this.targetPositionY;
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

    public final void setTargetPositionX(Integer num) {
        this.targetPositionX = num;
    }

    public final void setTargetPositionY(Integer num) {
        this.targetPositionY = num;
    }
}

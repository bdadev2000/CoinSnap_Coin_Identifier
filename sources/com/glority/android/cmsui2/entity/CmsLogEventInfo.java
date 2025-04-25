package com.glority.android.cmsui2.entity;

import android.graphics.Rect;
import android.view.View;
import com.glority.android.cmsui2.CmsItemType;
import com.glority.android.cmsui2.common.CmsUILogEvents;
import com.glority.android.xx.constants.Args;
import com.glority.android.xx.constants.LogEvents;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CmsLogEventInfo.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010<\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0002\b=R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000e\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010&\u001a\u00020'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+R\u001e\u0010/\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b0\u0010\"\"\u0004\b1\u0010$R\u0011\u00102\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b3\u0010\u000eR\u0011\u00104\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b5\u0010\u000eR\u001c\u00106\u001a\u0004\u0018\u000107X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;¨\u0006>"}, d2 = {"Lcom/glority/android/cmsui2/entity/CmsLogEventInfo;", "", Args.itemType, "", Args.title, "", "index", "viewRect", "Landroid/graphics/Rect;", "hasLearnMore", "", "<init>", "(ILjava/lang/String;ILandroid/graphics/Rect;Z)V", "getItemType", "()I", "getIndex", "setIndex", "(I)V", "getViewRect", "()Landroid/graphics/Rect;", "setViewRect", "(Landroid/graphics/Rect;)V", "getHasLearnMore", "()Z", "setHasLearnMore", "(Z)V", "children", "", "getChildren", "()Ljava/util/List;", "setChildren", "(Ljava/util/List;)V", CmsUILogEvents.EXPOSURE, "getExposure", "()Ljava/lang/Boolean;", "setExposure", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "lastVisibleTime", "", "getLastVisibleTime", "()J", "setLastVisibleTime", "(J)V", "lastInVisibleTime", "getLastInVisibleTime", "setLastInVisibleTime", "hasRead", "getHasRead", "setHasRead", "top", "getTop", LogEvents.bottom, "getBottom", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "setView", "(Landroid/view/View;)V", "getTitle", "getTitle1", "cmsUI2_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes14.dex */
public final class CmsLogEventInfo {
    private List<CmsLogEventInfo> children;
    private Boolean exposure;
    private boolean hasLearnMore;
    private Boolean hasRead;
    private int index;
    private final int itemType;
    private long lastInVisibleTime;
    private long lastVisibleTime;
    private final String title;
    private View view;
    private Rect viewRect;

    public CmsLogEventInfo(int i, String str, int i2, Rect viewRect, boolean z) {
        Intrinsics.checkNotNullParameter(viewRect, "viewRect");
        this.itemType = i;
        this.title = str;
        this.index = i2;
        this.viewRect = viewRect;
        this.hasLearnMore = z;
        this.exposure = false;
    }

    public /* synthetic */ CmsLogEventInfo(int i, String str, int i2, Rect rect, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, i2, rect, (i3 & 16) != 0 ? false : z);
    }

    public final boolean getHasLearnMore() {
        return this.hasLearnMore;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getItemType() {
        return this.itemType;
    }

    public final Rect getViewRect() {
        return this.viewRect;
    }

    public final void setHasLearnMore(boolean z) {
        this.hasLearnMore = z;
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    public final void setViewRect(Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<set-?>");
        this.viewRect = rect;
    }

    public final List<CmsLogEventInfo> getChildren() {
        return this.children;
    }

    public final void setChildren(List<CmsLogEventInfo> list) {
        this.children = list;
    }

    public final Boolean getExposure() {
        return this.exposure;
    }

    public final void setExposure(Boolean bool) {
        this.exposure = bool;
    }

    public final long getLastVisibleTime() {
        return this.lastVisibleTime;
    }

    public final void setLastVisibleTime(long j) {
        this.lastVisibleTime = j;
    }

    public final long getLastInVisibleTime() {
        return this.lastInVisibleTime;
    }

    public final void setLastInVisibleTime(long j) {
        this.lastInVisibleTime = j;
    }

    public final Boolean getHasRead() {
        return this.hasRead;
    }

    public final void setHasRead(Boolean bool) {
        this.hasRead = bool;
    }

    public final int getTop() {
        return this.viewRect.top;
    }

    public final int getBottom() {
        return this.viewRect.bottom;
    }

    public final View getView() {
        return this.view;
    }

    public final void setView(View view) {
        this.view = view;
    }

    public final String getTitle1() {
        String str = CmsItemType.INSTANCE.getTypeTitleMap().get(Integer.valueOf(this.itemType));
        String str2 = str;
        return (str2 == null || str2.length() == 0) ? this.title : str;
    }
}

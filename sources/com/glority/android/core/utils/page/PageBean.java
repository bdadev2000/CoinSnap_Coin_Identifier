package com.glority.android.core.utils.page;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.xx.constants.Args;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PageBean.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J1\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006#"}, d2 = {"Lcom/glority/android/core/utils/page/PageBean;", "", "objectId", "", "type", "Lcom/glority/android/core/utils/page/PAGETYPE;", Args.pageName, "creteTime", "", "(Ljava/lang/String;Lcom/glority/android/core/utils/page/PAGETYPE;Ljava/lang/String;J)V", "getCreteTime", "()J", "setCreteTime", "(J)V", "getObjectId", "()Ljava/lang/String;", "setObjectId", "(Ljava/lang/String;)V", "getPageName", "setPageName", "getType", "()Lcom/glority/android/core/utils/page/PAGETYPE;", "setType", "(Lcom/glority/android/core/utils/page/PAGETYPE;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final /* data */ class PageBean {
    private long creteTime;
    private String objectId;
    private String pageName;
    private PAGETYPE type;

    public static /* synthetic */ PageBean copy$default(PageBean pageBean, String str, PAGETYPE pagetype, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pageBean.objectId;
        }
        if ((i & 2) != 0) {
            pagetype = pageBean.type;
        }
        PAGETYPE pagetype2 = pagetype;
        if ((i & 4) != 0) {
            str2 = pageBean.pageName;
        }
        String str3 = str2;
        if ((i & 8) != 0) {
            j = pageBean.creteTime;
        }
        return pageBean.copy(str, pagetype2, str3, j);
    }

    /* renamed from: component1, reason: from getter */
    public final String getObjectId() {
        return this.objectId;
    }

    /* renamed from: component2, reason: from getter */
    public final PAGETYPE getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPageName() {
        return this.pageName;
    }

    /* renamed from: component4, reason: from getter */
    public final long getCreteTime() {
        return this.creteTime;
    }

    public final PageBean copy(String objectId, PAGETYPE type, String pageName, long creteTime) {
        Intrinsics.checkNotNullParameter(objectId, "objectId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        return new PageBean(objectId, type, pageName, creteTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PageBean)) {
            return false;
        }
        PageBean pageBean = (PageBean) other;
        return Intrinsics.areEqual(this.objectId, pageBean.objectId) && this.type == pageBean.type && Intrinsics.areEqual(this.pageName, pageBean.pageName) && this.creteTime == pageBean.creteTime;
    }

    public int hashCode() {
        return (((((this.objectId.hashCode() * 31) + this.type.hashCode()) * 31) + this.pageName.hashCode()) * 31) + Long.hashCode(this.creteTime);
    }

    public String toString() {
        return "PageBean(objectId=" + this.objectId + ", type=" + this.type + ", pageName=" + this.pageName + ", creteTime=" + this.creteTime + ')';
    }

    public PageBean(String objectId, PAGETYPE type, String pageName, long j) {
        Intrinsics.checkNotNullParameter(objectId, "objectId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        this.objectId = objectId;
        this.type = type;
        this.pageName = pageName;
        this.creteTime = j;
    }

    public final long getCreteTime() {
        return this.creteTime;
    }

    public final String getObjectId() {
        return this.objectId;
    }

    public final String getPageName() {
        return this.pageName;
    }

    public final PAGETYPE getType() {
        return this.type;
    }

    public final void setCreteTime(long j) {
        this.creteTime = j;
    }

    public final void setObjectId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.objectId = str;
    }

    public final void setPageName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pageName = str;
    }

    public final void setType(PAGETYPE pagetype) {
        Intrinsics.checkNotNullParameter(pagetype, "<set-?>");
        this.type = pagetype;
    }
}

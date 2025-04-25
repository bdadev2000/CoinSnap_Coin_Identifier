package com.glority.android.cmsui.entity;

import com.glority.android.cmsui.model.CmsTag;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FaqItem.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\u0006\u0010\u001a\u001a\u00020\u0007J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/glority/android/cmsui/entity/FaqSubItem;", "", "cmsContent", "Lcom/glority/android/cmsui/model/CmsTag;", "action", "", "expand", "", "(Lcom/glority/android/cmsui/model/CmsTag;IZ)V", "getAction", "()I", "setAction", "(I)V", "getCmsContent", "()Lcom/glority/android/cmsui/model/CmsTag;", "getExpand", "()Z", "setExpand", "(Z)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "isCare", "toString", "", "Companion", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final /* data */ class FaqSubItem {
    public static final int ACTION_ARTICLE_CARE = 2;
    public static final int ACTION_ARTICLE_HARM = 3;
    public static final int ACTION_ARTICLE_PEST_CONTROL = 4;
    public static final int ACTION_ARTICLE_WEED = 1;
    public static final int ACTION_NONE = 0;
    private int action;
    private final CmsTag cmsContent;
    private boolean expand;

    public static /* synthetic */ FaqSubItem copy$default(FaqSubItem faqSubItem, CmsTag cmsTag, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cmsTag = faqSubItem.cmsContent;
        }
        if ((i2 & 2) != 0) {
            i = faqSubItem.action;
        }
        if ((i2 & 4) != 0) {
            z = faqSubItem.expand;
        }
        return faqSubItem.copy(cmsTag, i, z);
    }

    /* renamed from: component1, reason: from getter */
    public final CmsTag getCmsContent() {
        return this.cmsContent;
    }

    /* renamed from: component2, reason: from getter */
    public final int getAction() {
        return this.action;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getExpand() {
        return this.expand;
    }

    public final FaqSubItem copy(CmsTag cmsContent, int action, boolean expand) {
        Intrinsics.checkNotNullParameter(cmsContent, "cmsContent");
        return new FaqSubItem(cmsContent, action, expand);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FaqSubItem)) {
            return false;
        }
        FaqSubItem faqSubItem = (FaqSubItem) other;
        return Intrinsics.areEqual(this.cmsContent, faqSubItem.cmsContent) && this.action == faqSubItem.action && this.expand == faqSubItem.expand;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        CmsTag cmsTag = this.cmsContent;
        int hashCode = (((cmsTag != null ? cmsTag.hashCode() : 0) * 31) + Integer.hashCode(this.action)) * 31;
        boolean z = this.expand;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        return "FaqSubItem(cmsContent=" + this.cmsContent + ", action=" + this.action + ", expand=" + this.expand + ")";
    }

    public FaqSubItem(CmsTag cmsContent, int i, boolean z) {
        Intrinsics.checkNotNullParameter(cmsContent, "cmsContent");
        this.cmsContent = cmsContent;
        this.action = i;
        this.expand = z;
    }

    public /* synthetic */ FaqSubItem(CmsTag cmsTag, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(cmsTag, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? false : z);
    }

    public final int getAction() {
        return this.action;
    }

    public final CmsTag getCmsContent() {
        return this.cmsContent;
    }

    public final boolean getExpand() {
        return this.expand;
    }

    public final void setAction(int i) {
        this.action = i;
    }

    public final void setExpand(boolean z) {
        this.expand = z;
    }

    public final boolean isCare() {
        return this.action == 2;
    }
}

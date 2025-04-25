package com.glority.base.contentfeedback.item;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContentFeedbackTextItem.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003JF\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/glority/base/contentfeedback/item/ContentFeedbackTextItem;", "", "iconRes", "", "textRes", "textInfoRes", "showDivider", "", "nextPage", "Lcom/glority/base/contentfeedback/item/AbsContentFeedbackPage;", "<init>", "(Ljava/lang/Integer;ILjava/lang/Integer;ZLcom/glority/base/contentfeedback/item/AbsContentFeedbackPage;)V", "getIconRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTextRes", "()I", "getTextInfoRes", "getShowDivider", "()Z", "getNextPage", "()Lcom/glority/base/contentfeedback/item/AbsContentFeedbackPage;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;ILjava/lang/Integer;ZLcom/glority/base/contentfeedback/item/AbsContentFeedbackPage;)Lcom/glority/base/contentfeedback/item/ContentFeedbackTextItem;", "equals", "other", "hashCode", "toString", "", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final /* data */ class ContentFeedbackTextItem {
    public static final int $stable = 8;
    private final Integer iconRes;
    private final AbsContentFeedbackPage nextPage;
    private final boolean showDivider;
    private final Integer textInfoRes;
    private final int textRes;

    /* renamed from: component1, reason: from getter */
    public final Integer getIconRes() {
        return this.iconRes;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTextRes() {
        return this.textRes;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getTextInfoRes() {
        return this.textInfoRes;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowDivider() {
        return this.showDivider;
    }

    /* renamed from: component5, reason: from getter */
    public final AbsContentFeedbackPage getNextPage() {
        return this.nextPage;
    }

    public final ContentFeedbackTextItem copy(Integer iconRes, int textRes, Integer textInfoRes, boolean showDivider, AbsContentFeedbackPage nextPage) {
        return new ContentFeedbackTextItem(iconRes, textRes, textInfoRes, showDivider, nextPage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentFeedbackTextItem)) {
            return false;
        }
        ContentFeedbackTextItem contentFeedbackTextItem = (ContentFeedbackTextItem) other;
        return Intrinsics.areEqual(this.iconRes, contentFeedbackTextItem.iconRes) && this.textRes == contentFeedbackTextItem.textRes && Intrinsics.areEqual(this.textInfoRes, contentFeedbackTextItem.textInfoRes) && this.showDivider == contentFeedbackTextItem.showDivider && Intrinsics.areEqual(this.nextPage, contentFeedbackTextItem.nextPage);
    }

    public int hashCode() {
        Integer num = this.iconRes;
        int hashCode = (((num == null ? 0 : num.hashCode()) * 31) + Integer.hashCode(this.textRes)) * 31;
        Integer num2 = this.textInfoRes;
        int hashCode2 = (((hashCode + (num2 == null ? 0 : num2.hashCode())) * 31) + Boolean.hashCode(this.showDivider)) * 31;
        AbsContentFeedbackPage absContentFeedbackPage = this.nextPage;
        return hashCode2 + (absContentFeedbackPage != null ? absContentFeedbackPage.hashCode() : 0);
    }

    public String toString() {
        return "ContentFeedbackTextItem(iconRes=" + this.iconRes + ", textRes=" + this.textRes + ", textInfoRes=" + this.textInfoRes + ", showDivider=" + this.showDivider + ", nextPage=" + this.nextPage + ")";
    }

    public ContentFeedbackTextItem(Integer num, int i, Integer num2, boolean z, AbsContentFeedbackPage absContentFeedbackPage) {
        this.iconRes = num;
        this.textRes = i;
        this.textInfoRes = num2;
        this.showDivider = z;
        this.nextPage = absContentFeedbackPage;
    }

    public static /* synthetic */ ContentFeedbackTextItem copy$default(ContentFeedbackTextItem contentFeedbackTextItem, Integer num, int i, Integer num2, boolean z, AbsContentFeedbackPage absContentFeedbackPage, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = contentFeedbackTextItem.iconRes;
        }
        if ((i2 & 2) != 0) {
            i = contentFeedbackTextItem.textRes;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            num2 = contentFeedbackTextItem.textInfoRes;
        }
        Integer num3 = num2;
        if ((i2 & 8) != 0) {
            z = contentFeedbackTextItem.showDivider;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            absContentFeedbackPage = contentFeedbackTextItem.nextPage;
        }
        return contentFeedbackTextItem.copy(num, i3, num3, z2, absContentFeedbackPage);
    }

    public final Integer getIconRes() {
        return this.iconRes;
    }

    public final int getTextRes() {
        return this.textRes;
    }

    public final Integer getTextInfoRes() {
        return this.textInfoRes;
    }

    public final boolean getShowDivider() {
        return this.showDivider;
    }

    public final AbsContentFeedbackPage getNextPage() {
        return this.nextPage;
    }
}

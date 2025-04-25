package com.glority.base.contentfeedback.item;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContentFeedbackControl.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/glority/base/contentfeedback/item/ContentFeedbackControl;", "", "firstPage", "Lcom/glority/base/contentfeedback/item/AbsContentFeedbackPage;", "feedbackSuccessToastTextRes", "", "<init>", "(Lcom/glority/base/contentfeedback/item/AbsContentFeedbackPage;I)V", "getFirstPage", "()Lcom/glority/base/contentfeedback/item/AbsContentFeedbackPage;", "getFeedbackSuccessToastTextRes", "()I", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class ContentFeedbackControl {
    public static final int $stable = 8;
    private final int feedbackSuccessToastTextRes;
    private final AbsContentFeedbackPage firstPage;

    public ContentFeedbackControl(AbsContentFeedbackPage firstPage, int i) {
        Intrinsics.checkNotNullParameter(firstPage, "firstPage");
        this.firstPage = firstPage;
        this.feedbackSuccessToastTextRes = i;
    }

    public final AbsContentFeedbackPage getFirstPage() {
        return this.firstPage;
    }

    public final int getFeedbackSuccessToastTextRes() {
        return this.feedbackSuccessToastTextRes;
    }
}

package com.glority.base.contentfeedback.item;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;

/* compiled from: ContentFeedbackEditContentPage.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/glority/base/contentfeedback/item/ContentFeedbackEditContentPage;", "Lcom/glority/base/contentfeedback/item/AbsContentFeedbackPage;", "titleRes", "", "editHintRes", "submitTextRes", "backgroundDrawable", "Landroid/graphics/drawable/Drawable;", "nextPage", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;ILandroid/graphics/drawable/Drawable;Lcom/glority/base/contentfeedback/item/AbsContentFeedbackPage;)V", "getTitleRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEditHintRes", "getSubmitTextRes", "()I", "getBackgroundDrawable", "()Landroid/graphics/drawable/Drawable;", "getNextPage", "()Lcom/glority/base/contentfeedback/item/AbsContentFeedbackPage;", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class ContentFeedbackEditContentPage extends AbsContentFeedbackPage {
    public static final int $stable = 8;
    private final Drawable backgroundDrawable;
    private final Integer editHintRes;
    private final AbsContentFeedbackPage nextPage;
    private final int submitTextRes;
    private final Integer titleRes;

    @Override // com.glority.base.contentfeedback.item.AbsContentFeedbackPage
    public Integer getTitleRes() {
        return this.titleRes;
    }

    public final Integer getEditHintRes() {
        return this.editHintRes;
    }

    public final int getSubmitTextRes() {
        return this.submitTextRes;
    }

    @Override // com.glority.base.contentfeedback.item.AbsContentFeedbackPage
    public Drawable getBackgroundDrawable() {
        return this.backgroundDrawable;
    }

    public final AbsContentFeedbackPage getNextPage() {
        return this.nextPage;
    }

    public ContentFeedbackEditContentPage(Integer num, Integer num2, int i, Drawable drawable, AbsContentFeedbackPage absContentFeedbackPage) {
        super(num, drawable);
        this.titleRes = num;
        this.editHintRes = num2;
        this.submitTextRes = i;
        this.backgroundDrawable = drawable;
        this.nextPage = absContentFeedbackPage;
    }
}

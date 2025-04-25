package com.glority.base.contentfeedback.item;

import android.graphics.drawable.Drawable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContentFeedbackSelectPage.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/glority/base/contentfeedback/item/ContentFeedbackSelectPage;", "Lcom/glority/base/contentfeedback/item/AbsContentFeedbackPage;", "titleRes", "", "list", "", "Lcom/glority/base/contentfeedback/item/ContentFeedbackTextItem;", "backgroundDrawable", "Landroid/graphics/drawable/Drawable;", "<init>", "(Ljava/lang/Integer;Ljava/util/List;Landroid/graphics/drawable/Drawable;)V", "getTitleRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getList", "()Ljava/util/List;", "getBackgroundDrawable", "()Landroid/graphics/drawable/Drawable;", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class ContentFeedbackSelectPage extends AbsContentFeedbackPage {
    public static final int $stable = 8;
    private final Drawable backgroundDrawable;
    private final List<ContentFeedbackTextItem> list;
    private final Integer titleRes;

    @Override // com.glority.base.contentfeedback.item.AbsContentFeedbackPage
    public Integer getTitleRes() {
        return this.titleRes;
    }

    public final List<ContentFeedbackTextItem> getList() {
        return this.list;
    }

    @Override // com.glority.base.contentfeedback.item.AbsContentFeedbackPage
    public Drawable getBackgroundDrawable() {
        return this.backgroundDrawable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentFeedbackSelectPage(Integer num, List<ContentFeedbackTextItem> list, Drawable drawable) {
        super(num, drawable);
        Intrinsics.checkNotNullParameter(list, "list");
        this.titleRes = num;
        this.list = list;
        this.backgroundDrawable = drawable;
    }
}

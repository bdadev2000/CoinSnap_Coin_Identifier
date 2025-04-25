package com.glority.base.contentfeedback.item;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;

/* compiled from: AbsContentFeedbackPage.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/glority/base/contentfeedback/item/AbsContentFeedbackPage;", "", "titleRes", "", "backgroundDrawable", "Landroid/graphics/drawable/Drawable;", "<init>", "(Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;)V", "getTitleRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBackgroundDrawable", "()Landroid/graphics/drawable/Drawable;", "showBackButton", "", "getShowBackButton", "()Z", "setShowBackButton", "(Z)V", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public class AbsContentFeedbackPage {
    public static final int $stable = 8;
    private final Drawable backgroundDrawable;
    private boolean showBackButton;
    private final Integer titleRes;

    public AbsContentFeedbackPage(Integer num, Drawable drawable) {
        this.titleRes = num;
        this.backgroundDrawable = drawable;
    }

    public Integer getTitleRes() {
        return this.titleRes;
    }

    public Drawable getBackgroundDrawable() {
        return this.backgroundDrawable;
    }

    public final boolean getShowBackButton() {
        return this.showBackButton;
    }

    public final void setShowBackButton(boolean z) {
        this.showBackButton = z;
    }
}

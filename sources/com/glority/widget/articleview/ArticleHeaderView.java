package com.glority.widget.articleview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.bumptech.glide.Glide;
import com.glority.widget.databinding.GlArticleviewHeaderBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ArticleHeaderView.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/glority/widget/articleview/ArticleHeaderView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/glority/widget/databinding/GlArticleviewHeaderBinding;", "getBinding", "()Lcom/glority/widget/databinding/GlArticleviewHeaderBinding;", "setBgImage", "", "url", "", "onClickListener", "Landroid/view/View$OnClickListener;", "setUserImage", "visibleUserImage", "visible", "", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class ArticleHeaderView extends FrameLayout {
    private final GlArticleviewHeaderBinding binding;

    public ArticleHeaderView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ ArticleHeaderView(android.content.Context r1, android.util.AttributeSet r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L8
            r2 = 0
            r3 = r2
            android.util.AttributeSet r3 = (android.util.AttributeSet) r3
        L8:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.widget.articleview.ArticleHeaderView.<init>(android.content.Context, android.util.AttributeSet, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArticleHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        GlArticleviewHeaderBinding inflate = GlArticleviewHeaderBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(inflate, "GlArticleviewHeaderBindi….from(context),this,true)");
        this.binding = inflate;
    }

    public final GlArticleviewHeaderBinding getBinding() {
        return this.binding;
    }

    public final void setBgImage(String url, View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        Glide.with(getContext()).load(url).into(this.binding.bgIv);
        this.binding.bgIv.setOnClickListener(onClickListener);
    }

    public final void setUserImage(String url, View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        Glide.with(getContext()).load(url).into(this.binding.userIv);
        this.binding.userIv.setOnClickListener(onClickListener);
    }

    public final void visibleUserImage(boolean visible) {
        CardView cardView = this.binding.userCv;
        Intrinsics.checkNotNullExpressionValue(cardView, "binding.userCv");
        cardView.setVisibility(visible ? 0 : 8);
    }
}

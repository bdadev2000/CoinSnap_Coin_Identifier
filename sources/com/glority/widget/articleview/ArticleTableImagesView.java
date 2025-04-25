package com.glority.widget.articleview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.glority.android.xx.constants.Args;
import com.glority.widget.GlTextView;
import com.glority.widget.R;
import com.glority.widget.articleview.ArticleTableImagesView;
import com.glority.widget.databinding.GlArticleviewTableImageBinding;
import com.glority.widget.databinding.GlArticleviewTableImageItemBinding;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: ArticleTableImagesView.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001!B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0014\u001a\u00020\u00152\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0016J\u0016\u0010\u0017\u001a\u00020\u00152\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0016H\u0002J\u0010\u0010\u0018\u001a\u00020\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u001f\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u000b2\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u001cJ\u000e\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001fJ\b\u0010 \u001a\u00020\u0015H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/glority/widget/articleview/ArticleTableImagesView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/glority/widget/databinding/GlArticleviewTableImageBinding;", "data", "", "", "firstVisibleCount", "", "getFirstVisibleCount", "()I", "setFirstVisibleCount", "(I)V", "imageClickCallback", "Lcom/glority/widget/articleview/ArticleTableImagesView$ImageClickCallback;", "setContent", "", "", "setImage", "setImageClickCallback", "setTitle", Args.title, "iconRes", "(Ljava/lang/String;Ljava/lang/Integer;)V", "showDivider", "show", "", "showMore", "ImageClickCallback", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class ArticleTableImagesView extends LinearLayout {
    private final GlArticleviewTableImageBinding binding;
    private List<String> data;
    private int firstVisibleCount;
    private ImageClickCallback imageClickCallback;

    /* compiled from: ArticleTableImagesView.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/glority/widget/articleview/ArticleTableImagesView$ImageClickCallback;", "", "onClick", "", "view", "Landroid/view/View;", "position", "", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes12.dex */
    public interface ImageClickCallback {
        void onClick(View view, int position);
    }

    public ArticleTableImagesView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ ArticleTableImagesView(android.content.Context r1, android.util.AttributeSet r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.glority.widget.articleview.ArticleTableImagesView.<init>(android.content.Context, android.util.AttributeSet, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArticleTableImagesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.firstVisibleCount = 4;
        this.data = new ArrayList();
        GlArticleviewTableImageBinding inflate = GlArticleviewTableImageBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(inflate, "GlArticleviewTableImageB…rom(context), this, true)");
        this.binding = inflate;
        inflate.moreView.setOnClickListener(new View.OnClickListener() { // from class: com.glority.widget.articleview.ArticleTableImagesView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ArticleTableImagesView.this.showMore();
            }
        });
    }

    public final int getFirstVisibleCount() {
        return this.firstVisibleCount;
    }

    public final void setFirstVisibleCount(int i) {
        this.firstVisibleCount = i;
    }

    public final void setImageClickCallback(ImageClickCallback imageClickCallback) {
        this.imageClickCallback = imageClickCallback;
    }

    public static /* synthetic */ void setTitle$default(ArticleTableImagesView articleTableImagesView, String str, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = Integer.valueOf(R.drawable.gl_icon_title_mages);
        }
        articleTableImagesView.setTitle(str, num);
    }

    public final void setTitle(String title, Integer iconRes) {
        Intrinsics.checkNotNullParameter(title, "title");
        GlTextView glTextView = this.binding.titleTv;
        Intrinsics.checkNotNullExpressionValue(glTextView, "binding.titleTv");
        glTextView.setText(title);
        if (iconRes != null) {
            this.binding.iv.setImageResource(iconRes.intValue());
        }
        ImageView imageView = this.binding.iv;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.iv");
        imageView.setVisibility(iconRes != null ? 0 : 8);
    }

    public final void setContent(List<String> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = CollectionsKt.toMutableList((Collection) data);
        this.binding.containerV.removeAllViews();
        int size = data.size();
        int i = this.firstVisibleCount;
        if (size <= i) {
            i = data.size();
        }
        setImage(data.subList(0, i));
        LinearLayout linearLayout = this.binding.moreLl;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.moreLl");
        linearLayout.setVisibility(data.size() > this.firstVisibleCount ? 0 : 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [T, com.glority.widget.databinding.GlArticleviewTableImageItemBinding] */
    private final void setImage(List<String> data) {
        ImageView imageView;
        ImageView imageView2;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = null;
        final int i = 0;
        for (Object obj : data) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final String str = (String) obj;
            if (i % 2 == 0) {
                objectRef.element = GlArticleviewTableImageItemBinding.inflate(LayoutInflater.from(getContext()), this.binding.containerV, true);
                GlArticleviewTableImageItemBinding glArticleviewTableImageItemBinding = (GlArticleviewTableImageItemBinding) objectRef.element;
                if (glArticleviewTableImageItemBinding != null && (imageView2 = glArticleviewTableImageItemBinding.iv1) != null) {
                    Glide.with(imageView2).load(str).transform(new CenterCrop(), new RoundedCorners(8)).into(imageView2);
                    imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.glority.widget.articleview.ArticleTableImagesView$setImage$$inlined$forEachIndexed$lambda$1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View it) {
                            ArticleTableImagesView.ImageClickCallback imageClickCallback;
                            imageClickCallback = this.imageClickCallback;
                            if (imageClickCallback != null) {
                                Intrinsics.checkNotNullExpressionValue(it, "it");
                                imageClickCallback.onClick(it, i);
                            }
                        }
                    });
                }
            } else {
                GlArticleviewTableImageItemBinding glArticleviewTableImageItemBinding2 = (GlArticleviewTableImageItemBinding) objectRef.element;
                if (glArticleviewTableImageItemBinding2 != null && (imageView = glArticleviewTableImageItemBinding2.iv2) != null) {
                    Glide.with(imageView).load(str).transform(new CenterCrop(), new RoundedCorners(8)).into(imageView);
                    imageView.setOnClickListener(new View.OnClickListener() { // from class: com.glority.widget.articleview.ArticleTableImagesView$setImage$$inlined$forEachIndexed$lambda$2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View it) {
                            ArticleTableImagesView.ImageClickCallback imageClickCallback;
                            imageClickCallback = this.imageClickCallback;
                            if (imageClickCallback != null) {
                                Intrinsics.checkNotNullExpressionValue(it, "it");
                                imageClickCallback.onClick(it, i);
                            }
                        }
                    });
                }
            }
            i = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showMore() {
        LinearLayout linearLayout = this.binding.moreLl;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.moreLl");
        linearLayout.setVisibility(8);
        this.binding.containerV.removeAllViews();
        setImage(this.data);
    }

    public final void showDivider(boolean show) {
        View view = this.binding.dividerV;
        Intrinsics.checkNotNullExpressionValue(view, "binding.dividerV");
        view.setVisibility(show ? 0 : 8);
    }
}

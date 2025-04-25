package com.glority.widget.articleview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.glority.widget.GlTextView;
import com.glority.widget.databinding.GlArticleviewTableBinding;
import com.glority.widget.databinding.GlArticleviewTableItemBinding;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ArticleTableView.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J*\u0010\u000b\u001a\u00020\f2\"\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000ej\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f`\u0010J\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0002\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/glority/widget/articleview/ArticleTableView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/glority/widget/databinding/GlArticleviewTableBinding;", "getBinding", "()Lcom/glority/widget/databinding/GlArticleviewTableBinding;", "setData", "", "data", "Ljava/util/LinkedHashMap;", "", "Lkotlin/collections/LinkedHashMap;", "setTitle", "name", "icon", "", "(Ljava/lang/String;Ljava/lang/Integer;)V", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class ArticleTableView extends FrameLayout {
    private final GlArticleviewTableBinding binding;

    public ArticleTableView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ ArticleTableView(android.content.Context r1, android.util.AttributeSet r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.glority.widget.articleview.ArticleTableView.<init>(android.content.Context, android.util.AttributeSet, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArticleTableView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        GlArticleviewTableBinding inflate = GlArticleviewTableBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(inflate, "GlArticleviewTableBindin….from(context),this,true)");
        this.binding = inflate;
    }

    public final GlArticleviewTableBinding getBinding() {
        return this.binding;
    }

    public static /* synthetic */ void setTitle$default(ArticleTableView articleTableView, String str, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        articleTableView.setTitle(str, num);
    }

    public final void setTitle(String name, Integer icon) {
        Intrinsics.checkNotNullParameter(name, "name");
        GlTextView glTextView = this.binding.titleTv;
        Intrinsics.checkNotNullExpressionValue(glTextView, "binding.titleTv");
        glTextView.setText(name);
        ImageView imageView = this.binding.iv;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.iv");
        imageView.setVisibility(icon != null ? 0 : 8);
        if (icon != null) {
            this.binding.iv.setImageResource(icon.intValue());
        }
    }

    public final void setData(LinkedHashMap<String, String> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        int i = 0;
        for (Map.Entry<String, String> entry : data.entrySet()) {
            i++;
            GlArticleviewTableItemBinding inflate = GlArticleviewTableItemBinding.inflate(LayoutInflater.from(getContext()), this.binding.container, true);
            Intrinsics.checkNotNullExpressionValue(inflate, "GlArticleviewTableItemBi…),binding.container,true)");
            if (i == data.size()) {
                View view = inflate.dividerV;
                Intrinsics.checkNotNullExpressionValue(view, "b.dividerV");
                view.setVisibility(8);
            }
            TextView textView = inflate.tv1;
            Intrinsics.checkNotNullExpressionValue(textView, "b.tv1");
            textView.setText(entry.getKey());
            TextView textView2 = inflate.tv2;
            Intrinsics.checkNotNullExpressionValue(textView2, "b.tv2");
            textView2.setText(entry.getValue());
        }
    }
}

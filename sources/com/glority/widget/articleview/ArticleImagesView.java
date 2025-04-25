package com.glority.widget.articleview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.glority.android.adapterhelper.BaseQuickAdapter;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.xx.constants.Args;
import com.glority.widget.R;
import com.glority.widget.articleview.ArticleImagesView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ArticleImagesView.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002#$B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0014\u0010\u0016\u001a\u00020\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018J\u0010\u0010\u001a\u001a\u00020\u00152\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u001f\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00192\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\u0002\u0010\u001fJ\u000e\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\"R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/glority/widget/articleview/ArticleImagesView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "adapter", "Lcom/glority/widget/articleview/ArticleImagesView$Adapter;", "dividerV", "Landroid/view/View;", "icon", "Landroid/widget/ImageView;", "imageClickCallback", "Lcom/glority/widget/articleview/ArticleImagesView$ImageClickCallback;", "indicatorTv", "Landroid/widget/TextView;", "titleTv", "vp2", "Landroidx/viewpager2/widget/ViewPager2;", "initVp2", "", "setContent", "data", "", "", "setImageClickCallback", "setTitle", Args.title, "iconRes", "", "(Ljava/lang/String;Ljava/lang/Integer;)V", "showDivider", "show", "", "Adapter", "ImageClickCallback", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class ArticleImagesView extends LinearLayout {
    private final Adapter adapter;
    private View dividerV;
    private ImageView icon;
    private ImageClickCallback imageClickCallback;
    private final TextView indicatorTv;
    private TextView titleTv;
    private ViewPager2 vp2;

    /* compiled from: ArticleImagesView.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/glority/widget/articleview/ArticleImagesView$ImageClickCallback;", "", "onClick", "", "view", "Landroid/view/View;", "position", "", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes12.dex */
    public interface ImageClickCallback {
        void onClick(View view, int position);
    }

    public ArticleImagesView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ ArticleImagesView(android.content.Context r1, android.util.AttributeSet r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.glority.widget.articleview.ArticleImagesView.<init>(android.content.Context, android.util.AttributeSet, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArticleImagesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.adapter = new Adapter();
        View inflate = LayoutInflater.from(context).inflate(R.layout.gl_articleview_image, this);
        View findViewById = inflate.findViewById(R.id.title_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.title_tv)");
        this.titleTv = (TextView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.vp2);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.vp2)");
        this.vp2 = (ViewPager2) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.iv);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "view.findViewById(R.id.iv)");
        this.icon = (ImageView) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.indicator_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "view.findViewById(R.id.indicator_tv)");
        this.indicatorTv = (TextView) findViewById4;
        View findViewById5 = inflate.findViewById(R.id.divider_v);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "view.findViewById(R.id.divider_v)");
        this.dividerV = findViewById5;
        initVp2();
    }

    public final void setImageClickCallback(ImageClickCallback imageClickCallback) {
        this.imageClickCallback = imageClickCallback;
    }

    public static /* synthetic */ void setTitle$default(ArticleImagesView articleImagesView, String str, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = Integer.valueOf(R.drawable.gl_icon_title_mages);
        }
        articleImagesView.setTitle(str, num);
    }

    public final void setTitle(String title, Integer iconRes) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.titleTv.setText(title);
        if (iconRes != null) {
            this.icon.setImageResource(iconRes.intValue());
        }
        this.icon.setVisibility(iconRes != null ? 0 : 8);
    }

    public final void setContent(List<String> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.adapter.setNewData(data);
        if (!data.isEmpty()) {
            this.indicatorTv.setText("1 / " + data.size());
        }
    }

    public final void showDivider(boolean show) {
        this.dividerV.setVisibility(show ? 0 : 8);
    }

    private final void initVp2() {
        this.vp2.setAdapter(this.adapter);
        this.vp2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() { // from class: com.glority.widget.articleview.ArticleImagesView$initVp2$1
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int position) {
                TextView textView;
                ArticleImagesView.Adapter adapter;
                super.onPageSelected(position);
                textView = ArticleImagesView.this.indicatorTv;
                StringBuilder append = new StringBuilder().append(position + 1).append(" / ");
                adapter = ArticleImagesView.this.adapter;
                textView.setText(append.append(adapter.getData().size()).toString());
            }
        });
        this.adapter.setOnItemClickListener(new Function3<BaseQuickAdapter<?, ?>, View, Integer, Unit>() { // from class: com.glority.widget.articleview.ArticleImagesView$initVp2$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(BaseQuickAdapter<?, ?> baseQuickAdapter, View view, Integer num) {
                invoke(baseQuickAdapter, view, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(BaseQuickAdapter<?, ?> adapter, View view, int i) {
                ArticleImagesView.ImageClickCallback imageClickCallback;
                Intrinsics.checkNotNullParameter(adapter, "adapter");
                Intrinsics.checkNotNullParameter(view, "view");
                imageClickCallback = ArticleImagesView.this.imageClickCallback;
                if (imageClickCallback != null) {
                    imageClickCallback.onClick(view, i);
                }
            }
        });
    }

    /* compiled from: ArticleImagesView.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0014¨\u0006\t"}, d2 = {"Lcom/glority/widget/articleview/ArticleImagesView$Adapter;", "Lcom/glority/android/adapterhelper/BaseQuickAdapter;", "", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "()V", "convert", "", "helper", "item", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes12.dex */
    public static final class Adapter extends BaseQuickAdapter<String, BaseViewHolder> {
        public Adapter() {
            super(R.layout.gl_item_article_image, null, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.glority.android.adapterhelper.BaseQuickAdapter
        public void convert(BaseViewHolder helper, String item) {
            Intrinsics.checkNotNullParameter(helper, "helper");
            Intrinsics.checkNotNullParameter(item, "item");
            ImageView imageView = (ImageView) helper.getView(R.id.iv);
            Glide.with(imageView).load(item).transform(new CenterCrop(), new RoundedCorners(8)).into(imageView);
        }
    }
}

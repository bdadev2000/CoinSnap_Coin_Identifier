package com.glority.android.cmsui.entity;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.cms.base.ExtraData;
import com.glority.android.cms.base.MarkdownTextView;
import com.glority.android.cms.common.CmsMarkdown;
import com.glority.android.cms.listener.ClickListener;
import com.glority.android.cmsui.R;
import com.glority.android.cmsui.common.CmsUILogEvents;
import com.glority.android.cmsui.model.CmsImage;
import com.glority.android.cmsui.model.CmsLayout;
import com.glority.android.cmsui.model.CmsTag;
import com.glority.android.cmsui.model.CmsTagString;
import com.glority.android.cmsui.model.CmsTitle;
import com.glority.android.cmsui.routers.GetDefaultImageDrawableRequest;
import com.glority.android.cmsui.util.CmsContentUtil;
import com.glority.android.cmsui.util.CmsTagValueUtil;
import com.glority.android.cmsui.util.CmsViewUtil;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.xx.constants.Args;
import com.glority.utils.app.ResUtils;
import com.glority.utils.stability.LogUtils;
import com.glority.utils.ui.ViewUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import io.noties.markwon.Markwon;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: FaqItem.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 T2\u00020\u0001:\u0001TB?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003JI\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010&\u001a\u00020\u000f2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J0\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\b\b\u0002\u0010/\u001a\u0002002\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0003H\u0002J \u00102\u001a\u0002032\u0006\u0010+\u001a\u00020,2\u0006\u00104\u001a\u0002002\u0006\u00105\u001a\u000200H\u0002J\b\u00106\u001a\u000200H\u0016J\u001a\u00107\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\b\b\u0003\u00108\u001a\u000200H\u0002J\t\u00109\u001a\u000200HÖ\u0001J \u0010:\u001a\u00020;2\u0006\u0010+\u001a\u00020,2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u0016JV\u0010@\u001a\u00020;2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u0002002\u0014\u0010D\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010(0E2\b\b\u0002\u0010/\u001a\u0002002\b\b\u0002\u0010F\u001a\u00020\u000f2\b\b\u0002\u0010G\u001a\u0002002\b\b\u0002\u0010H\u001a\u00020\u000fH\u0002J.\u0010I\u001a\u00020;2\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020B2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010N\u001a\u000200H\u0002J \u0010O\u001a\u00020;2\u0006\u0010P\u001a\u00020\u00002\u0006\u0010L\u001a\u00020B2\u0006\u0010Q\u001a\u00020RH\u0002J\t\u0010S\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015¨\u0006U"}, d2 = {"Lcom/glority/android/cmsui/entity/FaqItem;", "Lcom/glority/android/cmsui/entity/BaseClickItem;", Args.title, "", "icon", "childes", "", "Lcom/glority/android/cmsui/entity/FaqSubItem;", "markdown", "Lio/noties/markwon/Markwon;", Args.pageName, "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/noties/markwon/Markwon;Ljava/lang/String;)V", "getChildes", "()Ljava/util/List;", "expand", "", "getExpand", "()Z", "setExpand", "(Z)V", "getIcon", "()Ljava/lang/String;", "itemClick", "Lcom/glority/android/cms/listener/ClickListener;", "getItemClick", "()Lcom/glority/android/cms/listener/ClickListener;", "setItemClick", "(Lcom/glority/android/cms/listener/ClickListener;)V", "getMarkdown", "()Lio/noties/markwon/Markwon;", "getPageName", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "getContentTextView", "Lcom/glority/android/cms/base/MarkdownTextView;", "context", "Landroid/content/Context;", "cmsContent", "Lcom/glority/android/cmsui/model/CmsTagString;", "contentMaxLines", "", "sourceUrl", "getImageView", "Landroid/widget/ImageView;", "width", "height", "getLayoutId", "getSubtitleTextView", "textColor", "hashCode", "render", "", "helper", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "data", "Lcom/glority/android/cms/base/ExtraData;", "renderDetailSection", "ll", "Landroid/widget/LinearLayout;", "llWidth", "cmsTagMap", "", "isFaq", "faqChildCount", "hasFaqAction", "renderFaqItem", "inflater", "Landroid/view/LayoutInflater;", "llContainer", "childs", "count", "renderFaqSection", "faqItem", "showMoreContainer", "Landroid/view/View;", "toString", "Companion", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final /* data */ class FaqItem extends BaseClickItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final List<FaqSubItem> childes;
    private boolean expand;
    private final String icon;
    private ClickListener<FaqSubItem> itemClick;
    private final Markwon markdown;
    private final String pageName;
    private final String title;

    public static /* synthetic */ FaqItem copy$default(FaqItem faqItem, String str, String str2, List list, Markwon markwon, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = faqItem.title;
        }
        if ((i & 2) != 0) {
            str2 = faqItem.icon;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            list = faqItem.childes;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            markwon = faqItem.markdown;
        }
        Markwon markwon2 = markwon;
        if ((i & 16) != 0) {
            str3 = faqItem.pageName;
        }
        return faqItem.copy(str, str4, list2, markwon2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    public final List<FaqSubItem> component3() {
        return this.childes;
    }

    /* renamed from: component4, reason: from getter */
    public final Markwon getMarkdown() {
        return this.markdown;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPageName() {
        return this.pageName;
    }

    public final FaqItem copy(String title, String icon, List<FaqSubItem> childes, Markwon markdown, String pageName) {
        Intrinsics.checkNotNullParameter(childes, "childes");
        return new FaqItem(title, icon, childes, markdown, pageName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FaqItem)) {
            return false;
        }
        FaqItem faqItem = (FaqItem) other;
        return Intrinsics.areEqual(this.title, faqItem.title) && Intrinsics.areEqual(this.icon, faqItem.icon) && Intrinsics.areEqual(this.childes, faqItem.childes) && Intrinsics.areEqual(this.markdown, faqItem.markdown) && Intrinsics.areEqual(this.pageName, faqItem.pageName);
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.icon;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<FaqSubItem> list = this.childes;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        Markwon markwon = this.markdown;
        int hashCode4 = (hashCode3 + (markwon != null ? markwon.hashCode() : 0)) * 31;
        String str3 = this.pageName;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "FaqItem(title=" + this.title + ", icon=" + this.icon + ", childes=" + this.childes + ", markdown=" + this.markdown + ", pageName=" + this.pageName + ")";
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ FaqItem(java.lang.String r8, java.lang.String r9, java.util.List r10, io.noties.markwon.Markwon r11, java.lang.String r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r7 = this;
            r14 = r13 & 8
            r0 = 0
            if (r14 == 0) goto La
            r11 = r0
            io.noties.markwon.Markwon r11 = (io.noties.markwon.Markwon) r11
            r5 = r0
            goto Lb
        La:
            r5 = r11
        Lb:
            r11 = r13 & 16
            if (r11 == 0) goto L14
            r11 = r0
            java.lang.String r11 = (java.lang.String) r11
            r6 = r0
            goto L15
        L14:
            r6 = r12
        L15:
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.cmsui.entity.FaqItem.<init>(java.lang.String, java.lang.String, java.util.List, io.noties.markwon.Markwon, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final List<FaqSubItem> getChildes() {
        return this.childes;
    }

    public final Markwon getMarkdown() {
        return this.markdown;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaqItem(String str, String str2, List<FaqSubItem> childes, Markwon markwon, String str3) {
        super(str3);
        Intrinsics.checkNotNullParameter(childes, "childes");
        this.title = str;
        this.icon = str2;
        this.childes = childes;
        this.markdown = markwon;
        this.pageName = str3;
    }

    public final String getPageName() {
        return this.pageName;
    }

    public final boolean getExpand() {
        return this.expand;
    }

    public final void setExpand(boolean z) {
        this.expand = z;
    }

    public final ClickListener<FaqSubItem> getItemClick() {
        return this.itemClick;
    }

    public final void setItemClick(ClickListener<FaqSubItem> clickListener) {
        this.itemClick = clickListener;
    }

    @Override // com.glority.android.cms.base.BaseItem
    public int getLayoutId() {
        return R.layout.item_cms_faq;
    }

    @Override // com.glority.android.cms.base.BaseItem
    public void render(Context context, BaseViewHolder helper, ExtraData data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(data, "data");
        ImageView imageView = (ImageView) helper.getView(R.id.iv_icon);
        Glide.with(imageView).load(this.icon).into(imageView);
        CmsMarkdown.INSTANCE.setText(this.markdown, (TextView) helper.getView(R.id.tv_title), this.title);
        renderFaqSection(this, (LinearLayout) helper.getView(R.id.ll_container), helper.getView(R.id.show_more_container));
    }

    private final void renderFaqSection(final FaqItem faqItem, final LinearLayout llContainer, final View showMoreContainer) {
        final List<FaqSubItem> list = faqItem.childes;
        boolean z = !faqItem.expand && list.size() >= 8;
        showMoreContainer.setVisibility(z ? 0 : 8);
        if (z) {
            ViewGroup.LayoutParams layoutParams = llContainer.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = (int) ResUtils.getDimension(R.dimen.x40);
            }
        }
        int size = z ? 4 : list.size();
        final LayoutInflater inflater = LayoutInflater.from(llContainer.getContext());
        Intrinsics.checkNotNullExpressionValue(inflater, "inflater");
        renderFaqItem(inflater, llContainer, list, size);
        ViewExtensionsKt.setSingleClickListener$default(showMoreContainer, 0L, new Function1<View, Unit>() { // from class: com.glority.android.cmsui.entity.FaqItem$renderFaqSection$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (faqItem.getExpand() || list.size() < 8) {
                    return;
                }
                new LogEventRequest(FaqItem.this.getPageName() + CmsUILogEvents.CMS_SHOW_MORE, null, 2, null).post();
                faqItem.setExpand(true);
                showMoreContainer.setVisibility(8);
                ViewGroup.LayoutParams layoutParams2 = llContainer.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? layoutParams2 : null);
                if (marginLayoutParams2 != null) {
                    marginLayoutParams2.bottomMargin = 0;
                }
                FaqItem faqItem2 = FaqItem.this;
                LayoutInflater inflater2 = inflater;
                Intrinsics.checkNotNullExpressionValue(inflater2, "inflater");
                LinearLayout linearLayout = llContainer;
                List list2 = list;
                faqItem2.renderFaqItem(inflater2, linearLayout, list2, list2.size());
            }
        }, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderFaqItem(final LayoutInflater inflater, final LinearLayout llContainer, List<FaqSubItem> childs, int count) {
        String str;
        llContainer.removeAllViews();
        final int screenWidth = ViewUtils.getScreenWidth() - ((int) ResUtils.getDimension(R.dimen.x136));
        ArrayList arrayList = new ArrayList();
        for (Object obj : childs) {
            if (!((FaqSubItem) obj).getCmsContent().getTagValues().isEmpty()) {
                arrayList.add(obj);
            }
        }
        for (final FaqSubItem faqSubItem : CollectionsKt.take(arrayList, count)) {
            CmsTag cmsContent = faqSubItem.getCmsContent();
            boolean z = false;
            View inflate = inflater.inflate(R.layout.item_cms_faq_sub, (ViewGroup) llContainer, false);
            TextView textView = (TextView) inflate.findViewById(R.id.tv_faq_title);
            final ImageView imageView = (ImageView) inflate.findViewById(R.id.iv_faq_arrow);
            final LinearLayout llFaqContent = (LinearLayout) inflate.findViewById(R.id.ll_faq_content);
            LinearLayout llFaqContentSub = (LinearLayout) inflate.findViewById(R.id.ll_faq_content_sub);
            TextView tvFaqMore = (TextView) inflate.findViewById(R.id.tv_faq_more);
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.ll_faq_title);
            CmsMarkdown cmsMarkdown = CmsMarkdown.INSTANCE;
            Markwon markwon = this.markdown;
            CmsTitle cmsTitle = cmsContent.getCmsTitle();
            cmsMarkdown.setText(markwon, textView, cmsTitle != null ? cmsTitle.getDisplayName() : null);
            Intrinsics.checkNotNullExpressionValue(llFaqContent, "llFaqContent");
            llFaqContent.setVisibility(faqSubItem.getExpand() ? 0 : 8);
            imageView.setImageResource(faqSubItem.getExpand() ? R.drawable.icon_more_16_arrow_up : R.drawable.icon_more_16_arrow_down);
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.cmsui.entity.FaqItem$renderFaqItem$2$1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FaqSubItem.this.setExpand(!r3.getExpand());
                    LinearLayout llFaqContent2 = llFaqContent;
                    Intrinsics.checkNotNullExpressionValue(llFaqContent2, "llFaqContent");
                    llFaqContent2.setVisibility(FaqSubItem.this.getExpand() ? 0 : 8);
                    imageView.setImageResource(FaqSubItem.this.getExpand() ? R.drawable.icon_more_16_arrow_up : R.drawable.icon_more_16_arrow_down);
                    new LogEventRequest(CmsUILogEvents.CMS_FAQ_ITEM, null).post();
                }
            });
            boolean z2 = faqSubItem.getAction() != 0;
            if (!z2) {
                str = "tvFaqMore";
            } else {
                Intrinsics.checkNotNullExpressionValue(tvFaqMore, "tvFaqMore");
                str = "tvFaqMore";
                ViewExtensionsKt.setSingleClickListener$default(tvFaqMore, 0L, new Function1<View, Unit>() { // from class: com.glority.android.cmsui.entity.FaqItem$renderFaqItem$$inlined$forEach$lambda$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(View view) {
                        invoke2(view);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(View view) {
                        Intrinsics.checkNotNullParameter(view, "view");
                        new LogEventRequest(CmsUILogEvents.CMS_FAQ_MORE, null).post();
                        ClickListener<FaqSubItem> itemClick = this.getItemClick();
                        if (itemClick != null) {
                            itemClick.onClick(view, FaqSubItem.this);
                        }
                    }
                }, 1, (Object) null);
            }
            Intrinsics.checkNotNullExpressionValue(llFaqContentSub, "llFaqContentSub");
            llFaqContentSub.setClickable(z2);
            Intrinsics.checkNotNullExpressionValue(tvFaqMore, str);
            tvFaqMore.setVisibility(z2 ? 0 : 8);
            List<Map<String, Object>> tagValues = cmsContent.getTagValues();
            int size = z2 ? 1 : tagValues.size();
            int i = z2 ? 3 : Integer.MAX_VALUE;
            if (tagValues.size() > 0) {
                Iterator it = CollectionsKt.take(tagValues, size).iterator();
                while (it.hasNext()) {
                    boolean z3 = z2;
                    renderDetailSection(llFaqContentSub, screenWidth, (Map) it.next(), i, true, size, z3);
                    it = it;
                    cmsContent = cmsContent;
                    inflate = inflate;
                    z = z;
                    llFaqContentSub = llFaqContentSub;
                    z2 = z3;
                    size = size;
                }
            }
            LinearLayout linearLayout2 = llFaqContentSub;
            View view = inflate;
            if (CmsTagValueUtil.checkTagHasMedicinal$default(CmsTagValueUtil.INSTANCE, cmsContent, z, 2, null)) {
                FrameLayout flMedicinal = (FrameLayout) view.findViewById(R.id.fl_medicinal);
                CmsViewUtil cmsViewUtil = CmsViewUtil.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(flMedicinal, "flMedicinal");
                Context context = flMedicinal.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "flMedicinal.context");
                flMedicinal.addView(cmsViewUtil.getMedicinalView(context));
            }
            if (linearLayout2.getChildCount() != 0) {
                llContainer.addView(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderDetailSection(final LinearLayout ll, final int llWidth, Map<String, ? extends Object> cmsTagMap, int contentMaxLines, boolean isFaq, int faqChildCount, boolean hasFaqAction) {
        CmsTag convert2CmsTag;
        List<Map<String, Object>> tagValues;
        int i;
        CmsTitle cmsTitle;
        String displayName;
        String str = null;
        if (CmsTagValueUtil.INSTANCE.isCmsTag(cmsTagMap)) {
            final CmsTag convert2CmsTag2 = CmsTagValueUtil.INSTANCE.convert2CmsTag(cmsTagMap);
            Function0<Unit> function0 = new Function0<Unit>() { // from class: com.glority.android.cmsui.entity.FaqItem$renderDetailSection$addSubtitle$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    MarkdownTextView subtitleTextView;
                    CmsTitle cmsTitle2;
                    FaqItem faqItem = FaqItem.this;
                    Context context = ll.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "ll.context");
                    subtitleTextView = faqItem.getSubtitleTextView(context, R.color.Gray111);
                    CmsMarkdown cmsMarkdown = CmsMarkdown.INSTANCE;
                    Markwon markdown = FaqItem.this.getMarkdown();
                    MarkdownTextView markdownTextView = subtitleTextView;
                    CmsTag cmsTag = convert2CmsTag2;
                    cmsMarkdown.setText(markdown, markdownTextView, (cmsTag == null || (cmsTitle2 = cmsTag.getCmsTitle()) == null) ? null : cmsTitle2.getDisplayName());
                    ll.addView(subtitleTextView);
                }
            };
            if (convert2CmsTag2 != null && (cmsTitle = convert2CmsTag2.getCmsTitle()) != null && (displayName = cmsTitle.getDisplayName()) != null && displayName.length() > 0 && isFaq && faqChildCount > 1) {
                function0.invoke();
            }
            if (convert2CmsTag2 != null) {
                str = convert2CmsTag2.getSourceUrl();
            }
        }
        if (CmsTagValueUtil.INSTANCE.isCmsTagString(cmsTagMap)) {
            CmsTagString convert2CmsTagString = CmsTagValueUtil.INSTANCE.convert2CmsTagString(cmsTagMap);
            if (convert2CmsTagString != null) {
                Context context = ll.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "ll.context");
                MarkdownTextView contentTextView = getContentTextView(context, convert2CmsTagString, contentMaxLines, str);
                if (contentTextView != null) {
                    ll.addView(contentTextView);
                    return;
                }
                return;
            }
            return;
        }
        if (CmsTagValueUtil.INSTANCE.isCmsImage(cmsTagMap)) {
            final CmsImage convert2CmsImage = CmsTagValueUtil.INSTANCE.convert2CmsImage(cmsTagMap);
            if (convert2CmsImage != null) {
                int dp2px = ViewUtils.dp2px(200.0f);
                Context context2 = ll.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "ll.context");
                final ImageView imageView = getImageView(context2, llWidth, dp2px);
                ImageView imageView2 = imageView;
                RequestBuilder<Bitmap> load = Glide.with(imageView2).asBitmap().load(convert2CmsImage.getImageUrl());
                try {
                    i = new GetDefaultImageDrawableRequest().toResult().intValue();
                } catch (Exception e) {
                    if (AppContext.INSTANCE.isDebugMode()) {
                        LogUtils.e(Log.getStackTraceString(e));
                    }
                    i = R.drawable.common_background_banner;
                }
                load.placeholder(i).into((RequestBuilder) new SimpleTarget<Bitmap>() { // from class: com.glority.android.cmsui.entity.FaqItem$renderDetailSection$$inlined$let$lambda$1
                    @Override // com.bumptech.glide.request.target.Target
                    public /* bridge */ /* synthetic */ void onResourceReady(Object obj, Transition transition) {
                        onResourceReady((Bitmap) obj, (Transition<? super Bitmap>) transition);
                    }

                    public void onResourceReady(Bitmap resource, Transition<? super Bitmap> transition) {
                        Intrinsics.checkNotNullParameter(resource, "resource");
                        if (resource.getWidth() > 0) {
                            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                            if (layoutParams != null) {
                                layoutParams.width = llWidth;
                                layoutParams.height = (llWidth * resource.getHeight()) / resource.getWidth();
                            }
                            imageView.setImageBitmap(resource);
                        }
                    }
                });
                ViewExtensionsKt.setSingleClickListener$default(imageView2, 0L, new Function1<View, Unit>() { // from class: com.glority.android.cmsui.entity.FaqItem$renderDetailSection$$inlined$let$lambda$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(View view) {
                        invoke2(view);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(View it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        ClickListener<CmsImage> imageClick = this.getImageClick();
                        if (imageClick != null) {
                            imageClick.onClick(it, CmsImage.this);
                        }
                    }
                }, 1, (Object) null);
                ll.addView(imageView2);
                return;
            }
            return;
        }
        if (!CmsTagValueUtil.INSTANCE.isCmsTag(cmsTagMap) || (convert2CmsTag = CmsTagValueUtil.INSTANCE.convert2CmsTag(cmsTagMap)) == null || (tagValues = convert2CmsTag.getTagValues()) == null) {
            return;
        }
        int size = hasFaqAction ? 1 : tagValues.size();
        if (tagValues.size() > 0) {
            Iterator it = CollectionsKt.take(tagValues, size).iterator();
            while (it.hasNext()) {
                renderDetailSection(ll, llWidth, (Map) it.next(), contentMaxLines, isFaq, size, hasFaqAction);
            }
        }
    }

    static /* synthetic */ MarkdownTextView getSubtitleTextView$default(FaqItem faqItem, Context context, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = R.color.Gray111;
        }
        return faqItem.getSubtitleTextView(context, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MarkdownTextView getSubtitleTextView(Context context, int textColor) {
        MarkdownTextView markdownTextView = new MarkdownTextView(context, null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = (int) ResUtils.getDimension(R.dimen.x8);
        layoutParams.bottomMargin = layoutParams.topMargin;
        markdownTextView.setLayoutParams(layoutParams);
        markdownTextView.setTextSize(0, ResUtils.getDimension(R.dimen.x32));
        markdownTextView.setTypeface(null, 1);
        markdownTextView.setTextColor(ResUtils.getColor(textColor));
        return markdownTextView;
    }

    static /* synthetic */ MarkdownTextView getContentTextView$default(FaqItem faqItem, Context context, CmsTagString cmsTagString, int i, String str, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i2 & 8) != 0) {
            str = null;
        }
        return faqItem.getContentTextView(context, cmsTagString, i, str);
    }

    private final MarkdownTextView getContentTextView(Context context, CmsTagString cmsContent, int contentMaxLines, String sourceUrl) {
        String value;
        if (sourceUrl != null && sourceUrl.length() > 0) {
            value = cmsContent.getValue() + " [![wiki](https://static.picturethisai.com/web_static/info@3x.png)](" + sourceUrl + ')';
        } else {
            value = cmsContent.getValue();
        }
        MarkdownTextView markdownTextView = new MarkdownTextView(context, null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = (int) ResUtils.getDimension(R.dimen.x8);
        layoutParams.bottomMargin = layoutParams.topMargin;
        markdownTextView.setLayoutParams(layoutParams);
        markdownTextView.setTextSize(0, ResUtils.getDimension(R.dimen.x30));
        markdownTextView.setTextColor(ResUtils.getColor(R.color.Gray));
        markdownTextView.setLineSpacing(0.0f, 1.3f);
        markdownTextView.setMaxLines(contentMaxLines);
        markdownTextView.setEllipsize(TextUtils.TruncateAt.END);
        CmsMarkdown.INSTANCE.setText(this.markdown, markdownTextView, value);
        return markdownTextView;
    }

    private final ImageView getImageView(Context context, int width, int height) {
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(width, height);
        layoutParams.topMargin = (int) ResUtils.getDimension(R.dimen.x8);
        layoutParams.bottomMargin = layoutParams.topMargin;
        appCompatImageView.setLayoutParams(layoutParams);
        appCompatImageView.setAdjustViewBounds(true);
        return appCompatImageView;
    }

    /* compiled from: FaqItem.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rJ \u0010\u000e\u001a\u0004\u0018\u00010\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0010\u001a\u00020\rH\u0002J.\u0010\u0011\u001a\u0004\u0018\u00010\u00122\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014H\u0002¨\u0006\u0015"}, d2 = {"Lcom/glority/android/cmsui/entity/FaqItem$Companion;", "", "()V", "create", "Lcom/glority/android/cmsui/entity/FaqItem;", TtmlNode.TAG_LAYOUT, "Lcom/glority/android/cmsui/model/CmsLayout;", "cmsTags", "", "Lcom/glority/android/cmsui/model/CmsTag;", "markdown", "Lio/noties/markwon/Markwon;", Args.pageName, "", "getCmsContentByTagName", "cmsContents", "tagName", "mapFaqSubItem", "Lcom/glority/android/cmsui/entity/FaqSubItem;", "map", "", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ FaqItem create$default(Companion companion, CmsLayout cmsLayout, List list, Markwon markwon, String str, int i, Object obj) {
            if ((i & 4) != 0) {
                markwon = null;
            }
            if ((i & 8) != 0) {
                str = "";
            }
            return companion.create(cmsLayout, list, markwon, str);
        }

        public final FaqItem create(CmsLayout layout, List<CmsTag> cmsTags, Markwon markdown, String pageName) {
            List<Map<String, Object>> tagValues;
            Object obj;
            Intrinsics.checkNotNullParameter(layout, "layout");
            Intrinsics.checkNotNullParameter(cmsTags, "cmsTags");
            CmsTitle cmsTitle = layout.getCmsTitle();
            String displayName = cmsTitle != null ? cmsTitle.getDisplayName() : null;
            CmsTitle cmsTitle2 = layout.getCmsTitle();
            String lightModeIconUrl = cmsTitle2 != null ? cmsTitle2.getLightModeIconUrl() : null;
            List<String> tagNames = layout.getTagNames();
            if (tagNames != null) {
                ArrayList arrayList = new ArrayList();
                String str = displayName;
                String str2 = lightModeIconUrl;
                for (String str3 : tagNames) {
                    Iterator<T> it = cmsTags.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (Intrinsics.areEqual(((CmsTag) obj).getTagName(), str3)) {
                            break;
                        }
                    }
                    CmsTag cmsTag = (CmsTag) obj;
                    if (cmsTag != null) {
                        String str4 = str2;
                        if (str4 == null || str4.length() == 0) {
                            CmsTitle cmsTitle3 = cmsTag.getCmsTitle();
                            str2 = cmsTitle3 != null ? cmsTitle3.getLightModeIconUrl() : null;
                        }
                        String str5 = str;
                        if (str5 == null || str5.length() == 0) {
                            CmsTitle cmsTitle4 = cmsTag.getCmsTitle();
                            str = cmsTitle4 != null ? cmsTitle4.getDisplayName() : null;
                        }
                    } else {
                        cmsTag = null;
                    }
                    if (cmsTag != null) {
                        arrayList.add(cmsTag);
                    }
                }
                CmsTag cmsTag2 = (CmsTag) CollectionsKt.firstOrNull((List) arrayList);
                if (cmsTag2 != null && (tagValues = cmsTag2.getTagValues()) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<T> it2 = tagValues.iterator();
                    while (it2.hasNext()) {
                        FaqSubItem mapFaqSubItem = FaqItem.INSTANCE.mapFaqSubItem(cmsTags, (Map) it2.next());
                        if (mapFaqSubItem != null) {
                            arrayList2.add(mapFaqSubItem);
                        }
                    }
                    ArrayList arrayList3 = arrayList2;
                    if (!arrayList3.isEmpty()) {
                        return new FaqItem(str, str2, arrayList3, markdown, pageName);
                    }
                }
            }
            return null;
        }

        private final FaqSubItem mapFaqSubItem(List<CmsTag> cmsContents, Map<String, ? extends Object> map) {
            CmsTag convert2CmsTag;
            List<Map<String, Object>> tagValues;
            int i;
            Integer num;
            int intValue;
            if (!CmsTagValueUtil.INSTANCE.isCmsTag(map) || (convert2CmsTag = CmsTagValueUtil.INSTANCE.convert2CmsTag(map)) == null || (tagValues = convert2CmsTag.getTagValues()) == null) {
                return null;
            }
            Iterator<T> it = tagValues.iterator();
            while (it.hasNext()) {
                Map<String, ? extends Object> map2 = (Map) it.next();
                if (CmsTagValueUtil.INSTANCE.isCmsTagString(map2)) {
                    if (map2 == null) {
                        return null;
                    }
                    Object obj = map2.get("value");
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    String str = (String) obj;
                    if (Intrinsics.areEqual(str, "#PlantCare")) {
                        str = "#PlantCare @Cultivation:ConditionRequirementsSummary";
                    }
                    ArrayList arrayList = new ArrayList();
                    if (!StringsKt.startsWith$default(str, "#", false, 2, (Object) null)) {
                        arrayList.add(map2);
                        i = 0;
                    } else {
                        int i2 = 0;
                        for (String str2 : StringsKt.split$default((CharSequence) str, new String[]{" "}, false, 0, 6, (Object) null)) {
                            if (StringsKt.startsWith$default(str2, "#", false, 2, (Object) null)) {
                                if (str2 != null) {
                                    String substring = str2.substring(1);
                                    Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
                                    if (i2 == 0 && (num = CmsContentUtil.INSTANCE.getFaqActionMap().get(substring)) != null && (intValue = num.intValue()) != i2) {
                                        i2 = intValue;
                                    }
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                                }
                            } else if (StringsKt.startsWith$default(str2, "@", false, 2, (Object) null)) {
                                if (str2 != null) {
                                    String substring2 = str2.substring(1);
                                    Intrinsics.checkNotNullExpressionValue(substring2, "(this as java.lang.String).substring(startIndex)");
                                    CmsTag cmsContentByTagName = FaqItem.INSTANCE.getCmsContentByTagName(cmsContents, substring2);
                                    if (cmsContentByTagName != null) {
                                        convert2CmsTag.setTagName(substring2);
                                        arrayList.add(cmsContentByTagName.getJsonMap());
                                    }
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                                }
                            }
                        }
                        i = i2;
                    }
                    convert2CmsTag.setTagValues(arrayList);
                    if (!arrayList.isEmpty()) {
                        return new FaqSubItem(convert2CmsTag, i, false, 4, null);
                    }
                    return null;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }

        private final CmsTag getCmsContentByTagName(List<CmsTag> cmsContents, String tagName) {
            for (CmsTag cmsTag : cmsContents) {
                if (Intrinsics.areEqual(cmsTag.getTagName(), tagName)) {
                    return cmsTag;
                }
                if (cmsTag.getTagValues() != null) {
                    List<Map<String, Object>> tagValues = cmsTag.getTagValues();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : tagValues) {
                        if (CmsTagValueUtil.INSTANCE.isCmsTag((Map) obj)) {
                            arrayList.add(obj);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        CmsTag convert2CmsTag = CmsTagValueUtil.INSTANCE.convert2CmsTag((Map) it.next());
                        if (convert2CmsTag != null) {
                            arrayList2.add(convert2CmsTag);
                        }
                    }
                    CmsTag cmsContentByTagName = FaqItem.INSTANCE.getCmsContentByTagName(arrayList2, tagName);
                    if (cmsContentByTagName != null) {
                        return cmsContentByTagName;
                    }
                }
            }
            return null;
        }
    }
}

package com.glority.android.cmsui.entity;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.cms.base.BaseItem;
import com.glority.android.cms.base.ExtraData;
import com.glority.android.cms.common.CmsMarkdown;
import com.glority.android.cms.listener.ClickListener;
import com.glority.android.cmsui.R;
import com.glority.android.cmsui.model.CmsLayout;
import com.glority.android.cmsui.model.CmsTag;
import com.glority.android.cmsui.util.CmsTagValueUtil;
import com.glority.android.cmsui.util.CmsViewUtil;
import com.glority.android.xx.constants.Args;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import io.noties.markwon.Markwon;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardItem.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 92\u00020\u0001:\u00019BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003JY\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u0010)\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\b\u0010,\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020\nH\u0002J\t\u0010/\u001a\u00020-HÖ\u0001J \u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0016J\t\u00108\u001a\u00020\u0003HÖ\u0001R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016¨\u0006:"}, d2 = {"Lcom/glority/android/cmsui/entity/CardItem;", "Lcom/glority/android/cms/base/BaseItem;", Args.title, "", "content", "icon", "contents", "", "Lcom/glority/android/cmsui/model/CmsTag;", "isPlantCare", "", "markdown", "Lio/noties/markwon/Markwon;", Args.pageName, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLio/noties/markwon/Markwon;Ljava/lang/String;)V", "cardClick", "Lcom/glority/android/cms/listener/ClickListener;", "getCardClick", "()Lcom/glority/android/cms/listener/ClickListener;", "setCardClick", "(Lcom/glority/android/cms/listener/ClickListener;)V", "getContent", "()Ljava/lang/String;", "getContents", "()Ljava/util/List;", "getIcon", "()Z", "setPlantCare", "(Z)V", "getMarkdown", "()Lio/noties/markwon/Markwon;", "getPageName", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "getLayoutId", "", "hasMedicinal", "hashCode", "render", "", "context", "Landroid/content/Context;", "helper", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "data", "Lcom/glority/android/cms/base/ExtraData;", "toString", "Companion", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final /* data */ class CardItem extends BaseItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static boolean hasCareArticle;
    private static boolean hasWeedArticle;
    private ClickListener<CardItem> cardClick;
    private final String content;
    private final List<CmsTag> contents;
    private final String icon;
    private boolean isPlantCare;
    private final Markwon markdown;
    private final String pageName;
    private final String title;

    public static /* synthetic */ CardItem copy$default(CardItem cardItem, String str, String str2, String str3, List list, boolean z, Markwon markwon, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardItem.title;
        }
        if ((i & 2) != 0) {
            str2 = cardItem.content;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = cardItem.icon;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            list = cardItem.contents;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            z = cardItem.isPlantCare;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            markwon = cardItem.markdown;
        }
        Markwon markwon2 = markwon;
        if ((i & 64) != 0) {
            str4 = cardItem.pageName;
        }
        return cardItem.copy(str, str5, str6, list2, z2, markwon2, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    public final List<CmsTag> component4() {
        return this.contents;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsPlantCare() {
        return this.isPlantCare;
    }

    /* renamed from: component6, reason: from getter */
    public final Markwon getMarkdown() {
        return this.markdown;
    }

    /* renamed from: component7, reason: from getter */
    public final String getPageName() {
        return this.pageName;
    }

    public final CardItem copy(String title, String content, String icon, List<CmsTag> contents, boolean isPlantCare, Markwon markdown, String pageName) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(contents, "contents");
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        return new CardItem(title, content, icon, contents, isPlantCare, markdown, pageName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardItem)) {
            return false;
        }
        CardItem cardItem = (CardItem) other;
        return Intrinsics.areEqual(this.title, cardItem.title) && Intrinsics.areEqual(this.content, cardItem.content) && Intrinsics.areEqual(this.icon, cardItem.icon) && Intrinsics.areEqual(this.contents, cardItem.contents) && this.isPlantCare == cardItem.isPlantCare && Intrinsics.areEqual(this.markdown, cardItem.markdown) && Intrinsics.areEqual(this.pageName, cardItem.pageName);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.title;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.content;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.icon;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<CmsTag> list = this.contents;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        boolean z = this.isPlantCare;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode4 + i) * 31;
        Markwon markwon = this.markdown;
        int hashCode5 = (i2 + (markwon != null ? markwon.hashCode() : 0)) * 31;
        String str4 = this.pageName;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "CardItem(title=" + this.title + ", content=" + this.content + ", icon=" + this.icon + ", contents=" + this.contents + ", isPlantCare=" + this.isPlantCare + ", markdown=" + this.markdown + ", pageName=" + this.pageName + ")";
    }

    public final String getContent() {
        return this.content;
    }

    public final List<CmsTag> getContents() {
        return this.contents;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardItem(String title, String content, String str, List<CmsTag> contents, boolean z, Markwon markwon, String pageName) {
        super(pageName);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(contents, "contents");
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        this.title = title;
        this.content = content;
        this.icon = str;
        this.contents = contents;
        this.isPlantCare = z;
        this.markdown = markwon;
        this.pageName = pageName;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ CardItem(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.util.List r13, boolean r14, io.noties.markwon.Markwon r15, java.lang.String r16, int r17, kotlin.jvm.internal.DefaultConstructorMarker r18) {
        /*
            r9 = this;
            r0 = r17 & 16
            if (r0 == 0) goto L7
            r0 = 0
            r6 = r0
            goto L8
        L7:
            r6 = r14
        L8:
            r0 = r17 & 32
            if (r0 == 0) goto L12
            r0 = 0
            r1 = r0
            io.noties.markwon.Markwon r1 = (io.noties.markwon.Markwon) r1
            r7 = r0
            goto L13
        L12:
            r7 = r15
        L13:
            r0 = r17 & 64
            if (r0 == 0) goto L1b
            java.lang.String r0 = ""
            r8 = r0
            goto L1d
        L1b:
            r8 = r16
        L1d:
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.cmsui.entity.CardItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.List, boolean, io.noties.markwon.Markwon, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final Markwon getMarkdown() {
        return this.markdown;
    }

    public final String getPageName() {
        return this.pageName;
    }

    public final boolean isPlantCare() {
        return this.isPlantCare;
    }

    public final void setPlantCare(boolean z) {
        this.isPlantCare = z;
    }

    public final ClickListener<CardItem> getCardClick() {
        return this.cardClick;
    }

    public final void setCardClick(ClickListener<CardItem> clickListener) {
        this.cardClick = clickListener;
    }

    @Override // com.glority.android.cms.base.BaseItem
    public int getLayoutId() {
        return R.layout.item_cms_card;
    }

    @Override // com.glority.android.cms.base.BaseItem
    public void render(Context context, BaseViewHolder helper, ExtraData data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(data, "data");
        ImageView imageView = (ImageView) helper.getView(R.id.iv_icon);
        Glide.with(imageView).load(this.icon).into(imageView);
        TextView textView = (TextView) helper.getView(R.id.tv_title);
        TextView textView2 = (TextView) helper.getView(R.id.tv_content);
        CmsMarkdown.INSTANCE.setText(this.markdown, textView, this.title);
        CmsMarkdown.INSTANCE.setText(this.markdown, textView2, this.content);
        FrameLayout frameLayout = (FrameLayout) helper.getView(R.id.fl_medicinal);
        if (hasMedicinal()) {
            CmsViewUtil cmsViewUtil = CmsViewUtil.INSTANCE;
            Context context2 = frameLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "flMedicinal.context");
            frameLayout.addView(cmsViewUtil.getMedicinalView(context2));
        }
        helper.getView(R.id.fl_cms_card_container).setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.cmsui.entity.CardItem$render$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View it) {
                ClickListener<CardItem> cardClick = CardItem.this.getCardClick();
                if (cardClick != null) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    cardClick.onClick(it, CardItem.this);
                }
            }
        });
    }

    private final boolean hasMedicinal() {
        Iterator<T> it = this.contents.iterator();
        while (it.hasNext()) {
            if (CmsTagValueUtil.checkTagHasMedicinal$default(CmsTagValueUtil.INSTANCE, (CmsTag) it.next(), false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    /* compiled from: CardItem.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J2\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\u0017"}, d2 = {"Lcom/glority/android/cmsui/entity/CardItem$Companion;", "", "()V", "hasCareArticle", "", "getHasCareArticle", "()Z", "setHasCareArticle", "(Z)V", "hasWeedArticle", "getHasWeedArticle", "setHasWeedArticle", "create", "Lcom/glority/android/cmsui/entity/CardItem;", TtmlNode.TAG_LAYOUT, "Lcom/glority/android/cmsui/model/CmsLayout;", "cmsTags", "", "Lcom/glority/android/cmsui/model/CmsTag;", "markdown", "Lio/noties/markwon/Markwon;", Args.pageName, "", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean getHasCareArticle() {
            return CardItem.hasCareArticle;
        }

        public final void setHasCareArticle(boolean z) {
            CardItem.hasCareArticle = z;
        }

        public final boolean getHasWeedArticle() {
            return CardItem.hasWeedArticle;
        }

        public final void setHasWeedArticle(boolean z) {
            CardItem.hasWeedArticle = z;
        }

        public static /* synthetic */ CardItem create$default(Companion companion, CmsLayout cmsLayout, List list, Markwon markwon, String str, int i, Object obj) {
            if ((i & 8) != 0) {
                str = "";
            }
            return companion.create(cmsLayout, list, markwon, str);
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x00a2  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00d8  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0111  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x00b2 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:85:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x008d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.glority.android.cmsui.entity.CardItem create(com.glority.android.cmsui.model.CmsLayout r14, java.util.List<com.glority.android.cmsui.model.CmsTag> r15, io.noties.markwon.Markwon r16, java.lang.String r17) {
            /*
                Method dump skipped, instructions count: 354
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.glority.android.cmsui.entity.CardItem.Companion.create(com.glority.android.cmsui.model.CmsLayout, java.util.List, io.noties.markwon.Markwon, java.lang.String):com.glority.android.cmsui.entity.CardItem");
        }
    }
}

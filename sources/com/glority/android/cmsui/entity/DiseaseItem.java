package com.glority.android.cmsui.entity;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.cms.base.BaseItem;
import com.glority.android.cms.base.ExtraData;
import com.glority.android.cms.common.CmsMarkdown;
import com.glority.android.cms.listener.ClickListener;
import com.glority.android.cmsui.R;
import com.glority.android.cmsui.common.CmsUILogEvents;
import com.glority.android.cmsui.model.CmsLayout;
import com.glority.android.cmsui.model.CmsTag;
import com.glority.android.cmsui.model.CmsTagString;
import com.glority.android.cmsui.model.CmsTitle;
import com.glority.android.cmsui.util.CmsTagValueUtil;
import com.glority.android.xx.constants.Args;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import io.noties.markwon.Markwon;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DiseaseItem.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 62\u00020\u0001:\u00016BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003JY\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010'\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\b\u0010*\u001a\u00020+H\u0016J\t\u0010,\u001a\u00020+HÖ\u0001J \u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0016J\t\u00105\u001a\u00020\u0003HÖ\u0001R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014¨\u00067"}, d2 = {"Lcom/glority/android/cmsui/entity/DiseaseItem;", "Lcom/glority/android/cms/base/BaseItem;", "iconUrl", "", "tagName", "displayTagName", "value", "hasCareDetail", "", Args.pageName, "markdown", "Lio/noties/markwon/Markwon;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lio/noties/markwon/Markwon;)V", "careClick", "Lcom/glority/android/cms/listener/ClickListener;", "getCareClick", "()Lcom/glority/android/cms/listener/ClickListener;", "setCareClick", "(Lcom/glority/android/cms/listener/ClickListener;)V", "getDisplayTagName", "()Ljava/lang/String;", "getHasCareDetail", "()Z", "setHasCareDetail", "(Z)V", "getIconUrl", "getMarkdown", "()Lio/noties/markwon/Markwon;", "getPageName", "getTagName", "getValue", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "getLayoutId", "", "hashCode", "render", "", "context", "Landroid/content/Context;", "helper", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "data", "Lcom/glority/android/cms/base/ExtraData;", "toString", "Companion", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final /* data */ class DiseaseItem extends BaseItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private ClickListener<DiseaseItem> careClick;
    private final String displayTagName;
    private boolean hasCareDetail;
    private final String iconUrl;
    private final Markwon markdown;
    private final String pageName;
    private final String tagName;
    private final String value;

    public static /* synthetic */ DiseaseItem copy$default(DiseaseItem diseaseItem, String str, String str2, String str3, String str4, boolean z, String str5, Markwon markwon, int i, Object obj) {
        if ((i & 1) != 0) {
            str = diseaseItem.iconUrl;
        }
        if ((i & 2) != 0) {
            str2 = diseaseItem.tagName;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = diseaseItem.displayTagName;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = diseaseItem.value;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            z = diseaseItem.hasCareDetail;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            str5 = diseaseItem.pageName;
        }
        String str9 = str5;
        if ((i & 64) != 0) {
            markwon = diseaseItem.markdown;
        }
        return diseaseItem.copy(str, str6, str7, str8, z2, str9, markwon);
    }

    /* renamed from: component1, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTagName() {
        return this.tagName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDisplayTagName() {
        return this.displayTagName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getHasCareDetail() {
        return this.hasCareDetail;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPageName() {
        return this.pageName;
    }

    /* renamed from: component7, reason: from getter */
    public final Markwon getMarkdown() {
        return this.markdown;
    }

    public final DiseaseItem copy(String iconUrl, String tagName, String displayTagName, String value, boolean hasCareDetail, String pageName, Markwon markdown) {
        Intrinsics.checkNotNullParameter(tagName, "tagName");
        return new DiseaseItem(iconUrl, tagName, displayTagName, value, hasCareDetail, pageName, markdown);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DiseaseItem)) {
            return false;
        }
        DiseaseItem diseaseItem = (DiseaseItem) other;
        return Intrinsics.areEqual(this.iconUrl, diseaseItem.iconUrl) && Intrinsics.areEqual(this.tagName, diseaseItem.tagName) && Intrinsics.areEqual(this.displayTagName, diseaseItem.displayTagName) && Intrinsics.areEqual(this.value, diseaseItem.value) && this.hasCareDetail == diseaseItem.hasCareDetail && Intrinsics.areEqual(this.pageName, diseaseItem.pageName) && Intrinsics.areEqual(this.markdown, diseaseItem.markdown);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.iconUrl;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.tagName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.displayTagName;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.value;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z = this.hasCareDetail;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode4 + i) * 31;
        String str5 = this.pageName;
        int hashCode5 = (i2 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Markwon markwon = this.markdown;
        return hashCode5 + (markwon != null ? markwon.hashCode() : 0);
    }

    public String toString() {
        return "DiseaseItem(iconUrl=" + this.iconUrl + ", tagName=" + this.tagName + ", displayTagName=" + this.displayTagName + ", value=" + this.value + ", hasCareDetail=" + this.hasCareDetail + ", pageName=" + this.pageName + ", markdown=" + this.markdown + ")";
    }

    public final String getDisplayTagName() {
        return this.displayTagName;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getTagName() {
        return this.tagName;
    }

    public final boolean getHasCareDetail() {
        return this.hasCareDetail;
    }

    public final String getValue() {
        return this.value;
    }

    public final void setHasCareDetail(boolean z) {
        this.hasCareDetail = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiseaseItem(String str, String tagName, String str2, String str3, boolean z, String str4, Markwon markwon) {
        super(str4);
        Intrinsics.checkNotNullParameter(tagName, "tagName");
        this.iconUrl = str;
        this.tagName = tagName;
        this.displayTagName = str2;
        this.value = str3;
        this.hasCareDetail = z;
        this.pageName = str4;
        this.markdown = markwon;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ DiseaseItem(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, boolean r14, java.lang.String r15, io.noties.markwon.Markwon r16, int r17, kotlin.jvm.internal.DefaultConstructorMarker r18) {
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
            r1 = 0
            if (r0 == 0) goto L12
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            r7 = r1
            goto L13
        L12:
            r7 = r15
        L13:
            r0 = r17 & 64
            if (r0 == 0) goto L1c
            r0 = r1
            io.noties.markwon.Markwon r0 = (io.noties.markwon.Markwon) r0
            r8 = r1
            goto L1e
        L1c:
            r8 = r16
        L1e:
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.cmsui.entity.DiseaseItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, io.noties.markwon.Markwon, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final Markwon getMarkdown() {
        return this.markdown;
    }

    public final String getPageName() {
        return this.pageName;
    }

    public final ClickListener<DiseaseItem> getCareClick() {
        return this.careClick;
    }

    public final void setCareClick(ClickListener<DiseaseItem> clickListener) {
        this.careClick = clickListener;
    }

    @Override // com.glority.android.cms.base.BaseItem
    public int getLayoutId() {
        return R.layout.item_cms_diseases;
    }

    @Override // com.glority.android.cms.base.BaseItem
    public void render(Context context, BaseViewHolder helper, ExtraData data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(data, "data");
        CmsMarkdown.INSTANCE.setText(this.markdown, (TextView) helper.getView(R.id.tv_title), this.displayTagName);
        ImageView imageView = (ImageView) helper.getView(R.id.iv_icon);
        Glide.with(imageView).load(this.iconUrl).into(imageView);
        TextView textView = (TextView) helper.getView(R.id.tv_diseases_content);
        ImageView imageView2 = (ImageView) helper.getView(R.id.iv_diseases_arrow);
        CmsMarkdown.INSTANCE.setText(this.markdown, textView, this.value);
        if (this.hasCareDetail) {
            imageView2.setVisibility(0);
            ((LinearLayout) helper.getView(R.id.ll_disease_root)).setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.cmsui.entity.DiseaseItem$render$1
                @Override // android.view.View.OnClickListener
                public final void onClick(View it) {
                    BaseItem.logEvent$default(DiseaseItem.this, CmsUILogEvents.CMS_DISEASE, null, 2, null);
                    ClickListener<DiseaseItem> careClick = DiseaseItem.this.getCareClick();
                    if (careClick != null) {
                        Intrinsics.checkNotNullExpressionValue(it, "it");
                        careClick.onClick(it, DiseaseItem.this);
                    }
                }
            });
        } else {
            imageView2.setVisibility(8);
        }
    }

    /* compiled from: DiseaseItem.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r¨\u0006\u000e"}, d2 = {"Lcom/glority/android/cmsui/entity/DiseaseItem$Companion;", "", "()V", "create", "Lcom/glority/android/cmsui/entity/DiseaseItem;", TtmlNode.TAG_LAYOUT, "Lcom/glority/android/cmsui/model/CmsLayout;", "cmsTags", "", "Lcom/glority/android/cmsui/model/CmsTag;", "markdown", "Lio/noties/markwon/Markwon;", Args.pageName, "", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ DiseaseItem create$default(Companion companion, CmsLayout cmsLayout, List list, Markwon markwon, String str, int i, Object obj) {
            if ((i & 4) != 0) {
                markwon = null;
            }
            if ((i & 8) != 0) {
                str = "";
            }
            return companion.create(cmsLayout, list, markwon, str);
        }

        public final DiseaseItem create(CmsLayout layout, List<CmsTag> cmsTags, Markwon markdown, String pageName) {
            String str;
            Object obj;
            String lightModeIconUrl;
            Intrinsics.checkNotNullParameter(layout, "layout");
            Intrinsics.checkNotNullParameter(cmsTags, "cmsTags");
            Intrinsics.checkNotNullParameter(pageName, "pageName");
            CmsTitle cmsTitle = layout.getCmsTitle();
            String displayName = cmsTitle != null ? cmsTitle.getDisplayName() : null;
            CmsTitle cmsTitle2 = layout.getCmsTitle();
            String lightModeIconUrl2 = cmsTitle2 != null ? cmsTitle2.getLightModeIconUrl() : null;
            List<String> tagNames = layout.getTagNames();
            if (tagNames != null && (str = (String) CollectionsKt.firstOrNull((List) tagNames)) != null) {
                Iterator<T> it = cmsTags.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (Intrinsics.areEqual(((CmsTag) obj).getTagName(), str)) {
                        break;
                    }
                }
                CmsTag cmsTag = (CmsTag) obj;
                if (cmsTag == null) {
                } else {
                    String str2 = lightModeIconUrl2;
                    if (str2 == null || str2.length() == 0) {
                        CmsTitle cmsTitle3 = cmsTag.getCmsTitle();
                        lightModeIconUrl = cmsTitle3 != null ? cmsTitle3.getLightModeIconUrl() : null;
                    } else {
                        lightModeIconUrl = lightModeIconUrl2;
                    }
                    String str3 = displayName;
                    if (str3 == null || str3.length() == 0) {
                        CmsTitle cmsTitle4 = cmsTag.getCmsTitle();
                        displayName = cmsTitle4 != null ? cmsTitle4.getDisplayName() : null;
                    }
                    String str4 = "";
                    int i = 0;
                    for (Object obj2 : cmsTag.getTagValues()) {
                        int i2 = i + 1;
                        if (i < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        Map<String, ? extends Object> map = (Map) obj2;
                        if (CmsTagValueUtil.INSTANCE.isCmsTagString(map)) {
                            CmsTagString convert2CmsTagString = CmsTagValueUtil.INSTANCE.convert2CmsTagString(map);
                            str4 = str4 + ' ' + (convert2CmsTagString != null ? convert2CmsTagString.getValue() : null);
                            if (i < cmsTag.getTagValues().size() - 1) {
                                str4 = str4 + '\n';
                            }
                        }
                        i = i2;
                    }
                    return new DiseaseItem(lightModeIconUrl, cmsTag.getTagName(), displayName, str4, false, pageName, markdown, 16, null);
                }
            }
            return null;
        }
    }
}

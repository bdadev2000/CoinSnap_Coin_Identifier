package com.glority.android.cmsui.entity;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
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
import com.glority.android.cmsui.model.CmsImage;
import com.glority.android.cmsui.model.CmsLayout;
import com.glority.android.cmsui.model.CmsTag;
import com.glority.android.cmsui.model.CmsTagString;
import com.glority.android.cmsui.model.CmsTitle;
import com.glority.android.cmsui.util.CmsTagValueUtil;
import com.glority.android.cmsui.util.CmsViewUtil;
import com.glority.android.cmsui.util.FontUtil;
import com.glority.android.core.ext.ViewExtensionsKt;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MultiLevelWaterFallItem.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 C2\u00020\u0001:\u0001CBI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003JS\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\tHÖ\u0003J2\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0003H\u0002J \u0010/\u001a\u0002002\u0006\u0010)\u001a\u00020*2\u0006\u00101\u001a\u00020\u00112\u0006\u00102\u001a\u00020\u0011H\u0002J\b\u00103\u001a\u00020\u0011H\u0016J\u0010\u00104\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0002J\t\u00105\u001a\u00020\u0011HÖ\u0001J \u00106\u001a\u0002072\u0006\u0010)\u001a\u00020*2\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0016J6\u0010<\u001a\u0002072\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020\u00112\u0006\u0010@\u001a\u00020\u00072\b\b\u0002\u0010A\u001a\u00020%2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0003H\u0002J\t\u0010B\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u00020\u00118\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0010\u0010\u0018\u001a\u00020\u00118\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006D"}, d2 = {"Lcom/glority/android/cmsui/entity/MultiLevelWaterFallItem;", "Lcom/glority/android/cmsui/entity/BaseClickItem;", "icon", "", "displayName", "cmsTags", "", "Lcom/glority/android/cmsui/model/CmsTag;", "tag", "", "markdown", "Lio/noties/markwon/Markwon;", Args.pageName, "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Object;Lio/noties/markwon/Markwon;Ljava/lang/String;)V", "getCmsTags", "()Ljava/util/List;", "contentColor", "", "getDisplayName", "()Ljava/lang/String;", "getIcon", "getMarkdown", "()Lio/noties/markwon/Markwon;", "getPageName", "subtitleColor", "getTag", "()Ljava/lang/Object;", "setTag", "(Ljava/lang/Object;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "getContentTextView", "Lcom/glority/android/cms/base/MarkdownTextView;", "context", "Landroid/content/Context;", "cmsContent", "Lcom/glority/android/cmsui/model/CmsTagString;", "markwon", "sourceUrl", "getImageView", "Landroid/widget/ImageView;", "width", "height", "getLayoutId", "getSubtitleTextView", "hashCode", "render", "", "helper", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "data", "Lcom/glority/android/cms/base/ExtraData;", "renderStreamSectionItemDetail", "ll", "Landroid/widget/LinearLayout;", "llWidth", "cmsTag", "showSubTitle", "toString", "Companion", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final /* data */ class MultiLevelWaterFallItem extends BaseClickItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final List<CmsTag> cmsTags;
    private final int contentColor;
    private final String displayName;
    private final String icon;
    private final Markwon markdown;
    private final String pageName;
    private final int subtitleColor;
    private Object tag;

    public static /* synthetic */ MultiLevelWaterFallItem copy$default(MultiLevelWaterFallItem multiLevelWaterFallItem, String str, String str2, List list, Object obj, Markwon markwon, String str3, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = multiLevelWaterFallItem.icon;
        }
        if ((i & 2) != 0) {
            str2 = multiLevelWaterFallItem.displayName;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            list = multiLevelWaterFallItem.cmsTags;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            obj = multiLevelWaterFallItem.tag;
        }
        Object obj3 = obj;
        if ((i & 16) != 0) {
            markwon = multiLevelWaterFallItem.markdown;
        }
        Markwon markwon2 = markwon;
        if ((i & 32) != 0) {
            str3 = multiLevelWaterFallItem.pageName;
        }
        return multiLevelWaterFallItem.copy(str, str4, list2, obj3, markwon2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    public final List<CmsTag> component3() {
        return this.cmsTags;
    }

    /* renamed from: component4, reason: from getter */
    public final Object getTag() {
        return this.tag;
    }

    /* renamed from: component5, reason: from getter */
    public final Markwon getMarkdown() {
        return this.markdown;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPageName() {
        return this.pageName;
    }

    public final MultiLevelWaterFallItem copy(String icon, String displayName, List<CmsTag> cmsTags, Object tag, Markwon markdown, String pageName) {
        Intrinsics.checkNotNullParameter(cmsTags, "cmsTags");
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        return new MultiLevelWaterFallItem(icon, displayName, cmsTags, tag, markdown, pageName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiLevelWaterFallItem)) {
            return false;
        }
        MultiLevelWaterFallItem multiLevelWaterFallItem = (MultiLevelWaterFallItem) other;
        return Intrinsics.areEqual(this.icon, multiLevelWaterFallItem.icon) && Intrinsics.areEqual(this.displayName, multiLevelWaterFallItem.displayName) && Intrinsics.areEqual(this.cmsTags, multiLevelWaterFallItem.cmsTags) && Intrinsics.areEqual(this.tag, multiLevelWaterFallItem.tag) && Intrinsics.areEqual(this.markdown, multiLevelWaterFallItem.markdown) && Intrinsics.areEqual(this.pageName, multiLevelWaterFallItem.pageName);
    }

    public int hashCode() {
        String str = this.icon;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.displayName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<CmsTag> list = this.cmsTags;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        Object obj = this.tag;
        int hashCode4 = (hashCode3 + (obj != null ? obj.hashCode() : 0)) * 31;
        Markwon markwon = this.markdown;
        int hashCode5 = (hashCode4 + (markwon != null ? markwon.hashCode() : 0)) * 31;
        String str3 = this.pageName;
        return hashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "MultiLevelWaterFallItem(icon=" + this.icon + ", displayName=" + this.displayName + ", cmsTags=" + this.cmsTags + ", tag=" + this.tag + ", markdown=" + this.markdown + ", pageName=" + this.pageName + ")";
    }

    public final List<CmsTag> getCmsTags() {
        return this.cmsTags;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getIcon() {
        return this.icon;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiLevelWaterFallItem(String str, String str2, List<CmsTag> cmsTags, Object obj, Markwon markwon, String pageName) {
        super(pageName);
        Intrinsics.checkNotNullParameter(cmsTags, "cmsTags");
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        this.icon = str;
        this.displayName = str2;
        this.cmsTags = cmsTags;
        this.tag = obj;
        this.markdown = markwon;
        this.pageName = pageName;
        this.subtitleColor = R.color.Gray111;
        this.contentColor = R.color.Gray;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ MultiLevelWaterFallItem(java.lang.String r10, java.lang.String r11, java.util.List r12, java.lang.Object r13, io.noties.markwon.Markwon r14, java.lang.String r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r9 = this;
            r0 = r16 & 8
            r1 = 0
            if (r0 == 0) goto L7
            r6 = r1
            goto L8
        L7:
            r6 = r13
        L8:
            r0 = r16 & 16
            if (r0 == 0) goto L11
            r0 = r1
            io.noties.markwon.Markwon r0 = (io.noties.markwon.Markwon) r0
            r7 = r1
            goto L12
        L11:
            r7 = r14
        L12:
            r0 = r16 & 32
            if (r0 == 0) goto L1a
            java.lang.String r0 = ""
            r8 = r0
            goto L1b
        L1a:
            r8 = r15
        L1b:
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.cmsui.entity.MultiLevelWaterFallItem.<init>(java.lang.String, java.lang.String, java.util.List, java.lang.Object, io.noties.markwon.Markwon, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final Markwon getMarkdown() {
        return this.markdown;
    }

    public final String getPageName() {
        return this.pageName;
    }

    public final Object getTag() {
        return this.tag;
    }

    public final void setTag(Object obj) {
        this.tag = obj;
    }

    @Override // com.glority.android.cms.base.BaseItem
    public int getLayoutId() {
        return R.layout.cms_item_multi_level_water_fall;
    }

    @Override // com.glority.android.cms.base.BaseItem
    public void render(Context context, BaseViewHolder helper, ExtraData data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(data, "data");
        LogUtils.i("MultiLevelWaterFallItem", "render(context: Context, helper: BaseViewHolder, data: ExtraData)");
        final TextView textView = (TextView) helper.getView(R.id.tv_title);
        ImageView imageView = (ImageView) helper.getView(R.id.iv_icon);
        LinearLayout linearLayout = (LinearLayout) helper.getView(R.id.ll_container);
        linearLayout.removeAllViews();
        CmsMarkdown.INSTANCE.setText(this.markdown, textView, this.displayName);
        String str = this.icon;
        if (str != null && str.length() > 0) {
            imageView.setVisibility(0);
            Intrinsics.checkNotNullExpressionValue(Glide.with(imageView).load(this.icon).skipMemoryCache(true).into(imageView), "Glide.with(ivIcon).load(…            .into(ivIcon)");
        } else {
            imageView.setVisibility(8);
        }
        int i = R.id.title;
        String str2 = this.displayName;
        helper.setGone(i, str2 != null && str2.length() > 0);
        int screenWidth = ViewUtils.getScreenWidth() - ((int) ResUtils.getDimension(R.dimen.x72));
        getSubTitleTextViews().clear();
        getContentTextViews().clear();
        getMedicinalTextViews().clear();
        for (CmsTag cmsTag : this.cmsTags) {
            renderStreamSectionItemDetail(linearLayout, screenWidth, cmsTag, !Intrinsics.areEqual(cmsTag.getCmsTitle() != null ? r2.getDisplayName() : null, this.displayName), cmsTag.getSourceUrl());
            if (CmsTagValueUtil.checkTagHasMedicinal$default(CmsTagValueUtil.INSTANCE, cmsTag, false, 2, null)) {
                CmsViewUtil cmsViewUtil = CmsViewUtil.INSTANCE;
                Context context2 = linearLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "llContainer.context");
                TextView medicinalView = cmsViewUtil.getMedicinalView(context2);
                setTextScaleSize(medicinalView, FontUtil.INSTANCE.getFont26());
                linearLayout.addView(medicinalView);
                getMedicinalTextViews().add(medicinalView);
            }
        }
        observeFontScale(context, new Function1<Float, Unit>() { // from class: com.glority.android.cmsui.entity.MultiLevelWaterFallItem$render$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                invoke(f.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(float f) {
                MultiLevelWaterFallItem.this.setTextScaleSize(textView, FontUtil.INSTANCE.getFont34());
                Iterator<T> it = MultiLevelWaterFallItem.this.getSubTitleTextViews().iterator();
                while (it.hasNext()) {
                    MultiLevelWaterFallItem.this.setTextScaleSize((TextView) it.next(), FontUtil.INSTANCE.getFont32());
                }
                Iterator<T> it2 = MultiLevelWaterFallItem.this.getContentTextViews().iterator();
                while (it2.hasNext()) {
                    MultiLevelWaterFallItem.this.setTextScaleSize((TextView) it2.next(), FontUtil.INSTANCE.getFont30());
                }
                Iterator<T> it3 = MultiLevelWaterFallItem.this.getMedicinalTextViews().iterator();
                while (it3.hasNext()) {
                    MultiLevelWaterFallItem.this.setTextScaleSize((TextView) it3.next(), FontUtil.INSTANCE.getFont26());
                }
            }
        });
    }

    static /* synthetic */ void renderStreamSectionItemDetail$default(MultiLevelWaterFallItem multiLevelWaterFallItem, LinearLayout linearLayout, int i, CmsTag cmsTag, boolean z, String str, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            str = null;
        }
        multiLevelWaterFallItem.renderStreamSectionItemDetail(linearLayout, i, cmsTag, z2, str);
    }

    private final void renderStreamSectionItemDetail(final LinearLayout ll, final int llWidth, final CmsTag cmsTag, boolean showSubTitle, final String sourceUrl) {
        CmsTag convert2CmsTag;
        String displayName;
        final MultiLevelWaterFallItem multiLevelWaterFallItem = this;
        Function0<Boolean> function0 = new Function0<Boolean>() { // from class: com.glority.android.cmsui.entity.MultiLevelWaterFallItem$renderStreamSectionItemDetail$addSubtitle$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Boolean invoke() {
                return Boolean.valueOf(invoke2());
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2() {
                MarkdownTextView subtitleTextView;
                MultiLevelWaterFallItem multiLevelWaterFallItem2 = MultiLevelWaterFallItem.this;
                Context context = ll.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "ll.context");
                subtitleTextView = multiLevelWaterFallItem2.getSubtitleTextView(context);
                CmsMarkdown cmsMarkdown = CmsMarkdown.INSTANCE;
                Markwon markdown = MultiLevelWaterFallItem.this.getMarkdown();
                MarkdownTextView markdownTextView = subtitleTextView;
                CmsTitle cmsTitle = cmsTag.getCmsTitle();
                cmsMarkdown.setText(markdown, markdownTextView, cmsTitle != null ? cmsTitle.getDisplayName() : null);
                ll.addView(subtitleTextView);
                return MultiLevelWaterFallItem.this.getSubTitleTextViews().add(subtitleTextView);
            }
        };
        CmsTitle cmsTitle = cmsTag.getCmsTitle();
        if (cmsTitle != null && (displayName = cmsTitle.getDisplayName()) != null && displayName.length() > 0 && showSubTitle) {
            function0.invoke();
        }
        Iterator<T> it = cmsTag.getTagValues().iterator();
        while (it.hasNext()) {
            Map<String, ? extends Object> map = (Map) it.next();
            if (CmsTagValueUtil.INSTANCE.isCmsTagString(map)) {
                String sourceUrl2 = cmsTag.getSourceUrl();
                String sourceUrl3 = (sourceUrl2 == null || sourceUrl2.length() <= 0) ? sourceUrl : cmsTag.getSourceUrl();
                CmsTagString convert2CmsTagString = CmsTagValueUtil.INSTANCE.convert2CmsTagString(map);
                if (convert2CmsTagString != null) {
                    Context context = ll.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "ll.context");
                    MarkdownTextView contentTextView = multiLevelWaterFallItem.getContentTextView(context, convert2CmsTagString, multiLevelWaterFallItem.markdown, sourceUrl3);
                    if (contentTextView != null) {
                        ll.addView(contentTextView);
                        getContentTextViews().add(contentTextView);
                    }
                }
            } else {
                if (CmsTagValueUtil.INSTANCE.isCmsImage(map)) {
                    final CmsImage convert2CmsImage = CmsTagValueUtil.INSTANCE.convert2CmsImage(map);
                    if (convert2CmsImage != null) {
                        int dp2px = ViewUtils.dp2px(200.0f);
                        Context context2 = ll.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "ll.context");
                        final ImageView imageView = multiLevelWaterFallItem.getImageView(context2, llWidth, dp2px);
                        ImageView imageView2 = imageView;
                        final int i = 600;
                        final int i2 = 400;
                        Glide.with(imageView2).asBitmap().load(convert2CmsImage.getImageUrl()).skipMemoryCache(true).centerCrop().placeholder(R.drawable.common_background_banner).into((RequestBuilder) new SimpleTarget<Bitmap>(i, i2) { // from class: com.glority.android.cmsui.entity.MultiLevelWaterFallItem$renderStreamSectionItemDetail$$inlined$forEach$lambda$1
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
                        ViewExtensionsKt.setSingleClickListener$default(imageView2, 0L, new Function1<View, Unit>() { // from class: com.glority.android.cmsui.entity.MultiLevelWaterFallItem$renderStreamSectionItemDetail$$inlined$forEach$lambda$2
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
                            public final void invoke2(View it2) {
                                Intrinsics.checkNotNullParameter(it2, "it");
                                ClickListener<CmsImage> imageClick = this.getImageClick();
                                if (imageClick != null) {
                                    imageClick.onClick(it2, CmsImage.this);
                                }
                            }
                        }, 1, (Object) null);
                        ll.addView(imageView2);
                    }
                } else if (CmsTagValueUtil.INSTANCE.isCmsTag(map) && (convert2CmsTag = CmsTagValueUtil.INSTANCE.convert2CmsTag(map)) != null) {
                    String sourceUrl4 = convert2CmsTag.getSourceUrl();
                    renderStreamSectionItemDetail$default(this, ll, llWidth, convert2CmsTag, false, (sourceUrl4 == null || sourceUrl4.length() <= 0) ? sourceUrl : convert2CmsTag.getSourceUrl(), 8, null);
                }
                multiLevelWaterFallItem = this;
            }
            multiLevelWaterFallItem = this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MarkdownTextView getSubtitleTextView(Context context) {
        MarkdownTextView markdownTextView = new MarkdownTextView(context, null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = (int) ResUtils.getDimension(R.dimen.x8);
        layoutParams.bottomMargin = layoutParams.topMargin;
        markdownTextView.setLayoutParams(layoutParams);
        setTextScaleSize(markdownTextView, FontUtil.INSTANCE.getFont32());
        markdownTextView.setTypeface(null, 1);
        markdownTextView.setTextColor(ResUtils.getColor(this.subtitleColor));
        return markdownTextView;
    }

    static /* synthetic */ MarkdownTextView getContentTextView$default(MultiLevelWaterFallItem multiLevelWaterFallItem, Context context, CmsTagString cmsTagString, Markwon markwon, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            markwon = null;
        }
        if ((i & 8) != 0) {
            str = null;
        }
        return multiLevelWaterFallItem.getContentTextView(context, cmsTagString, markwon, str);
    }

    private final MarkdownTextView getContentTextView(Context context, CmsTagString cmsContent, Markwon markwon, String sourceUrl) {
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
        markdownTextView.setTextColor(ResUtils.getColor(this.contentColor));
        markdownTextView.setLineSpacing(0.0f, 1.3f);
        markdownTextView.setEllipsize(TextUtils.TruncateAt.END);
        MarkdownTextView markdownTextView2 = markdownTextView;
        CmsMarkdown.INSTANCE.setText(markwon, markdownTextView2, value);
        setTextScaleSize(markdownTextView2, FontUtil.INSTANCE.getFont30());
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

    /* compiled from: MultiLevelWaterFallItem.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r¨\u0006\u000e"}, d2 = {"Lcom/glority/android/cmsui/entity/MultiLevelWaterFallItem$Companion;", "", "()V", "create", "Lcom/glority/android/cmsui/entity/MultiLevelWaterFallItem;", TtmlNode.TAG_LAYOUT, "Lcom/glority/android/cmsui/model/CmsLayout;", "cmsTags", "", "Lcom/glority/android/cmsui/model/CmsTag;", "markdown", "Lio/noties/markwon/Markwon;", Args.pageName, "", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ MultiLevelWaterFallItem create$default(Companion companion, CmsLayout cmsLayout, List list, Markwon markwon, String str, int i, Object obj) {
            if ((i & 4) != 0) {
                markwon = null;
            }
            if ((i & 8) != 0) {
                str = "";
            }
            return companion.create(cmsLayout, list, markwon, str);
        }

        public final MultiLevelWaterFallItem create(CmsLayout layout, List<CmsTag> cmsTags, Markwon markdown, String pageName) {
            String str;
            String str2;
            CmsTitle cmsTitle;
            CmsTitle cmsTitle2;
            Object obj;
            Intrinsics.checkNotNullParameter(layout, "layout");
            Intrinsics.checkNotNullParameter(cmsTags, "cmsTags");
            Intrinsics.checkNotNullParameter(pageName, "pageName");
            CmsTitle cmsTitle3 = layout.getCmsTitle();
            String str3 = null;
            String displayName = cmsTitle3 != null ? cmsTitle3.getDisplayName() : null;
            CmsTitle cmsTitle4 = layout.getCmsTitle();
            String lightModeIconUrl = cmsTitle4 != null ? cmsTitle4.getLightModeIconUrl() : null;
            List<String> tagNames = layout.getTagNames();
            if (tagNames == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (String str4 : tagNames) {
                Iterator<T> it = cmsTags.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (Intrinsics.areEqual(((CmsTag) obj).getTagName(), str4)) {
                        break;
                    }
                }
                CmsTag cmsTag = (CmsTag) obj;
                if (cmsTag != null) {
                    arrayList.add(cmsTag);
                }
            }
            ArrayList arrayList2 = arrayList;
            if (arrayList2.size() == 1) {
                String str5 = lightModeIconUrl;
                if (str5 == null || str5.length() == 0) {
                    CmsTag cmsTag2 = (CmsTag) CollectionsKt.firstOrNull((List) arrayList2);
                    lightModeIconUrl = (cmsTag2 == null || (cmsTitle = cmsTag2.getCmsTitle()) == null) ? null : cmsTitle.getLightModeIconUrl();
                }
                String str6 = displayName;
                if (str6 == null || str6.length() == 0) {
                    CmsTag cmsTag3 = (CmsTag) CollectionsKt.firstOrNull((List) arrayList2);
                    if (cmsTag3 != null && (cmsTitle2 = cmsTag3.getCmsTitle()) != null) {
                        str3 = cmsTitle2.getDisplayName();
                    }
                } else {
                    str3 = displayName;
                }
                String str7 = lightModeIconUrl;
                str2 = str3;
                str = str7;
            } else {
                str = lightModeIconUrl;
                str2 = displayName;
            }
            return new MultiLevelWaterFallItem(str, str2, arrayList2, null, markdown, pageName, 8, null);
        }
    }
}

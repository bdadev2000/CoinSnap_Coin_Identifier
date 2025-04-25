package com.glority.android.cmsui.entity;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.cms.base.ExtraData;
import com.glority.android.cms.common.CmsMarkdown;
import com.glority.android.cmsui.R;
import com.glority.android.cmsui.common.CmsUILogEvents;
import com.glority.android.cmsui.model.CmsLayout;
import com.glority.android.cmsui.model.CmsTag;
import com.glority.android.cmsui.model.CmsTagColors;
import com.glority.android.cmsui.model.CmsTagString;
import com.glority.android.cmsui.model.CmsTitle;
import com.glority.android.cmsui.model.Color;
import com.glority.android.cmsui.util.CmsTagValueUtil;
import com.glority.android.cmsui.util.CmsViewUtil;
import com.glority.android.cmsui.util.FontUtil;
import com.glority.android.cmsui.widget.AppFlowLayout;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.xx.constants.Args;
import com.glority.utils.app.ResUtils;
import com.glority.utils.stability.LogUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import io.noties.markwon.Markwon;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: FeaturesItem.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u0000 E2\u00020\u0001:\u0001EBQ\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\t\u0010&\u001a\u00020\u000bHÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J[\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u0010)\u001a\u00020\u000b2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\b\u0010,\u001a\u00020-H\u0016J\u0010\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u000200H\u0002J\u0010\u00101\u001a\u00020\u00032\u0006\u0010/\u001a\u000200H\u0002J\u0010\u00102\u001a\u00020\u00032\u0006\u0010/\u001a\u000200H\u0002J\t\u00103\u001a\u00020-HÖ\u0001J\u0018\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u0007H\u0002J \u00109\u001a\u0002052\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u0016J\u0018\u0010@\u001a\u0002052\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u000207H\u0002J\t\u0010D\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001c¨\u0006F"}, d2 = {"Lcom/glority/android/cmsui/entity/FeaturesItem;", "Lcom/glority/android/cmsui/entity/BaseFontScaleItem;", Args.title, "", "icon", "childes", "", "Lcom/glority/android/cmsui/entity/FeaturesSubItem;", "markdown", "Lio/noties/markwon/Markwon;", "hasMedicinal", "", "forceExpend", Args.pageName, "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/noties/markwon/Markwon;ZZLjava/lang/String;)V", "getChildes", "()Ljava/util/List;", "colorTextViews", "", "Landroid/widget/TextView;", "expand", "getExpand", "()Z", "setExpand", "(Z)V", "getForceExpend", "getHasMedicinal", "getIcon", "()Ljava/lang/String;", "getMarkdown", "()Lio/noties/markwon/Markwon;", "getPageName", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "getLayoutId", "", "getMapBackgroundResource", "color", "Lcom/glority/android/cmsui/model/Color;", "getMappingText", "getMappingTextColor", "hashCode", "readerColor", "", "llSubContainer", "Landroid/view/View;", "featuresSubItem", "render", "context", "Landroid/content/Context;", "helper", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "data", "Lcom/glority/android/cms/base/ExtraData;", "renderFeaturesItem", "llContainer", "Landroid/widget/LinearLayout;", "showMoreContainer", "toString", "Companion", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final /* data */ class FeaturesItem extends BaseFontScaleItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final List<FeaturesSubItem> childes;
    private final List<TextView> colorTextViews;
    private boolean expand;
    private final boolean forceExpend;
    private final boolean hasMedicinal;
    private final String icon;
    private final Markwon markdown;
    private final String pageName;
    private final String title;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    /* loaded from: classes14.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[Color.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[Color.ORANGE.ordinal()] = 1;
            iArr[Color.YELLOW.ordinal()] = 2;
            iArr[Color.GREEN.ordinal()] = 3;
            iArr[Color.RED.ordinal()] = 4;
            iArr[Color.PURPLE.ordinal()] = 5;
            iArr[Color.BLUE.ordinal()] = 6;
            iArr[Color.WHITE.ordinal()] = 7;
            iArr[Color.PINK.ordinal()] = 8;
            iArr[Color.BRONZE.ordinal()] = 9;
            iArr[Color.CREAM.ordinal()] = 10;
            iArr[Color.BLACK.ordinal()] = 11;
            iArr[Color.GREY.ordinal()] = 12;
            iArr[Color.SILVER.ordinal()] = 13;
            iArr[Color.BROWN.ordinal()] = 14;
            iArr[Color.GOLD.ordinal()] = 15;
            iArr[Color.VARIEGATED.ordinal()] = 16;
            int[] iArr2 = new int[Color.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[Color.GREEN.ordinal()] = 1;
            iArr2[Color.PINK.ordinal()] = 2;
            iArr2[Color.GREY.ordinal()] = 3;
            iArr2[Color.BROWN.ordinal()] = 4;
            iArr2[Color.BLACK.ordinal()] = 5;
            iArr2[Color.RED.ordinal()] = 6;
            iArr2[Color.BLUE.ordinal()] = 7;
            iArr2[Color.GOLD.ordinal()] = 8;
            iArr2[Color.BRONZE.ordinal()] = 9;
            iArr2[Color.SILVER.ordinal()] = 10;
            iArr2[Color.PURPLE.ordinal()] = 11;
            iArr2[Color.VARIEGATED.ordinal()] = 12;
            iArr2[Color.ORANGE.ordinal()] = 13;
            iArr2[Color.YELLOW.ordinal()] = 14;
            iArr2[Color.WHITE.ordinal()] = 15;
            iArr2[Color.CREAM.ordinal()] = 16;
            int[] iArr3 = new int[Color.values().length];
            $EnumSwitchMapping$2 = iArr3;
            iArr3[Color.ORANGE.ordinal()] = 1;
            iArr3[Color.YELLOW.ordinal()] = 2;
            iArr3[Color.GREEN.ordinal()] = 3;
            iArr3[Color.RED.ordinal()] = 4;
            iArr3[Color.PURPLE.ordinal()] = 5;
            iArr3[Color.BLUE.ordinal()] = 6;
            iArr3[Color.WHITE.ordinal()] = 7;
            iArr3[Color.PINK.ordinal()] = 8;
            iArr3[Color.BRONZE.ordinal()] = 9;
            iArr3[Color.CREAM.ordinal()] = 10;
            iArr3[Color.BLACK.ordinal()] = 11;
            iArr3[Color.GREY.ordinal()] = 12;
            iArr3[Color.SILVER.ordinal()] = 13;
            iArr3[Color.BROWN.ordinal()] = 14;
            iArr3[Color.GOLD.ordinal()] = 15;
            iArr3[Color.VARIEGATED.ordinal()] = 16;
        }
    }

    public static /* synthetic */ FeaturesItem copy$default(FeaturesItem featuresItem, String str, String str2, List list, Markwon markwon, boolean z, boolean z2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = featuresItem.title;
        }
        if ((i & 2) != 0) {
            str2 = featuresItem.icon;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            list = featuresItem.childes;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            markwon = featuresItem.markdown;
        }
        Markwon markwon2 = markwon;
        if ((i & 16) != 0) {
            z = featuresItem.hasMedicinal;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = featuresItem.forceExpend;
        }
        boolean z4 = z2;
        if ((i & 64) != 0) {
            str3 = featuresItem.pageName;
        }
        return featuresItem.copy(str, str4, list2, markwon2, z3, z4, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    public final List<FeaturesSubItem> component3() {
        return this.childes;
    }

    /* renamed from: component4, reason: from getter */
    public final Markwon getMarkdown() {
        return this.markdown;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getHasMedicinal() {
        return this.hasMedicinal;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getForceExpend() {
        return this.forceExpend;
    }

    /* renamed from: component7, reason: from getter */
    public final String getPageName() {
        return this.pageName;
    }

    public final FeaturesItem copy(String title, String icon, List<FeaturesSubItem> childes, Markwon markdown, boolean hasMedicinal, boolean forceExpend, String pageName) {
        Intrinsics.checkNotNullParameter(childes, "childes");
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        return new FeaturesItem(title, icon, childes, markdown, hasMedicinal, forceExpend, pageName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeaturesItem)) {
            return false;
        }
        FeaturesItem featuresItem = (FeaturesItem) other;
        return Intrinsics.areEqual(this.title, featuresItem.title) && Intrinsics.areEqual(this.icon, featuresItem.icon) && Intrinsics.areEqual(this.childes, featuresItem.childes) && Intrinsics.areEqual(this.markdown, featuresItem.markdown) && this.hasMedicinal == featuresItem.hasMedicinal && this.forceExpend == featuresItem.forceExpend && Intrinsics.areEqual(this.pageName, featuresItem.pageName);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.title;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.icon;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<FeaturesSubItem> list = this.childes;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        Markwon markwon = this.markdown;
        int hashCode4 = (hashCode3 + (markwon != null ? markwon.hashCode() : 0)) * 31;
        boolean z = this.hasMedicinal;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode4 + i) * 31;
        boolean z2 = this.forceExpend;
        int i3 = (i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        String str3 = this.pageName;
        return i3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "FeaturesItem(title=" + this.title + ", icon=" + this.icon + ", childes=" + this.childes + ", markdown=" + this.markdown + ", hasMedicinal=" + this.hasMedicinal + ", forceExpend=" + this.forceExpend + ", pageName=" + this.pageName + ")";
    }

    public final List<FeaturesSubItem> getChildes() {
        return this.childes;
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
    public /* synthetic */ FeaturesItem(java.lang.String r11, java.lang.String r12, java.util.List r13, io.noties.markwon.Markwon r14, boolean r15, boolean r16, java.lang.String r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r10 = this;
            r0 = r18 & 8
            if (r0 == 0) goto La
            r0 = 0
            r1 = r0
            io.noties.markwon.Markwon r1 = (io.noties.markwon.Markwon) r1
            r6 = r0
            goto Lb
        La:
            r6 = r14
        Lb:
            r0 = r18 & 16
            r1 = 0
            if (r0 == 0) goto L12
            r7 = r1
            goto L13
        L12:
            r7 = r15
        L13:
            r0 = r18 & 32
            if (r0 == 0) goto L19
            r8 = r1
            goto L1b
        L19:
            r8 = r16
        L1b:
            r0 = r18 & 64
            if (r0 == 0) goto L23
            java.lang.String r0 = ""
            r9 = r0
            goto L25
        L23:
            r9 = r17
        L25:
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.cmsui.entity.FeaturesItem.<init>(java.lang.String, java.lang.String, java.util.List, io.noties.markwon.Markwon, boolean, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final boolean getHasMedicinal() {
        return this.hasMedicinal;
    }

    public final Markwon getMarkdown() {
        return this.markdown;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeaturesItem(String str, String str2, List<FeaturesSubItem> childes, Markwon markwon, boolean z, boolean z2, String pageName) {
        super(pageName);
        Intrinsics.checkNotNullParameter(childes, "childes");
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        this.title = str;
        this.icon = str2;
        this.childes = childes;
        this.markdown = markwon;
        this.hasMedicinal = z;
        this.forceExpend = z2;
        this.pageName = pageName;
        this.colorTextViews = new ArrayList();
    }

    public final boolean getForceExpend() {
        return this.forceExpend;
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

    @Override // com.glority.android.cms.base.BaseItem
    public int getLayoutId() {
        return R.layout.item_cms_features;
    }

    @Override // com.glority.android.cms.base.BaseItem
    public void render(Context context, BaseViewHolder helper, ExtraData data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(data, "data");
        ImageView imageView = (ImageView) helper.getView(R.id.iv_icon);
        helper.setGone(R.id.ll_separator, false);
        Glide.with(imageView).load(this.icon).into(imageView);
        final TextView textView = (TextView) helper.getView(R.id.tv_title);
        CmsMarkdown.INSTANCE.setText(this.markdown, textView, this.title);
        LinearLayout linearLayout = (LinearLayout) helper.getView(R.id.ll_container);
        View view = helper.getView(R.id.show_more_container);
        this.colorTextViews.clear();
        getContentTextViews().clear();
        getMedicinalTextViews().clear();
        renderFeaturesItem(linearLayout, view);
        observeFontScale(context, new Function1<Float, Unit>() { // from class: com.glority.android.cmsui.entity.FeaturesItem$render$1
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
                List list;
                FeaturesItem.this.setTextScaleSize(textView, FontUtil.INSTANCE.getFont34());
                list = FeaturesItem.this.colorTextViews;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    FeaturesItem.this.setTextScaleSize((TextView) it.next(), FontUtil.INSTANCE.getFont28());
                }
                Iterator<T> it2 = FeaturesItem.this.getContentTextViews().iterator();
                while (it2.hasNext()) {
                    FeaturesItem.this.setTextScaleSize((TextView) it2.next(), FontUtil.INSTANCE.getFont32());
                }
                Iterator<T> it3 = FeaturesItem.this.getMedicinalTextViews().iterator();
                while (it3.hasNext()) {
                    FeaturesItem.this.setTextScaleSize((TextView) it3.next(), FontUtil.INSTANCE.getFont26());
                }
            }
        });
    }

    private final void renderFeaturesItem(final LinearLayout llContainer, final View showMoreContainer) {
        final boolean z = (this.expand || this.childes.size() <= 6 || this.hasMedicinal || this.forceExpend) ? false : true;
        showMoreContainer.setVisibility(z ? 0 : 8);
        final LayoutInflater from = LayoutInflater.from(llContainer.getContext());
        final Function1<Integer, Unit> function1 = new Function1<Integer, Unit>() { // from class: com.glority.android.cmsui.entity.FeaturesItem$renderFeaturesItem$render$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                Map map;
                Map<String, ? extends Object> map2;
                llContainer.removeAllViews();
                int i2 = 0;
                for (Object obj : FeaturesItem.this.getChildes()) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    FeaturesSubItem featuresSubItem = (FeaturesSubItem) obj;
                    if (!z || i2 < i) {
                        View llSubContainer = from.inflate(R.layout.item_cms_features_sub, (ViewGroup) llContainer, false);
                        TextView tvFeatureKey = (TextView) llSubContainer.findViewById(R.id.tv_features_key);
                        Intrinsics.checkNotNullExpressionValue(tvFeatureKey, "tvFeatureKey");
                        tvFeatureKey.setText(featuresSubItem.getKey() + ':');
                        FeaturesItem.this.getContentTextViews().add(tvFeatureKey);
                        List<Map<String, Object>> value = featuresSubItem.getValue();
                        if (value != null && (map2 = (Map) CollectionsKt.firstOrNull((List) value)) != null && CmsTagValueUtil.INSTANCE.isTagColor(map2)) {
                            FeaturesItem featuresItem = FeaturesItem.this;
                            Intrinsics.checkNotNullExpressionValue(llSubContainer, "llSubContainer");
                            featuresItem.readerColor(llSubContainer, featuresSubItem);
                        } else {
                            TextView tvFeatureValue = (TextView) llSubContainer.findViewById(R.id.tv_features_value);
                            List<TextView> contentTextViews = FeaturesItem.this.getContentTextViews();
                            Intrinsics.checkNotNullExpressionValue(tvFeatureValue, "tvFeatureValue");
                            contentTextViews.add(tvFeatureValue);
                            try {
                                List<Map<String, Object>> value2 = featuresSubItem.getValue();
                                if (value2 != null && (map = (Map) CollectionsKt.firstOrNull((List) value2)) != null) {
                                    CmsTagString cmsTagString = new CmsTagString(new JSONObject(map));
                                    CmsMarkdown.INSTANCE.setText(FeaturesItem.this.getMarkdown(), tvFeatureValue, TextUtils.isEmpty(cmsTagString.getValue()) ? "-" : cmsTagString.getValue());
                                    Unit unit = Unit.INSTANCE;
                                }
                            } catch (Exception e) {
                                if (AppContext.INSTANCE.isDebugMode()) {
                                    LogUtils.e(Log.getStackTraceString(e));
                                }
                            }
                        }
                        llContainer.addView(llSubContainer);
                    }
                    i2 = i3;
                }
                if (FeaturesItem.this.getHasMedicinal()) {
                    CmsViewUtil cmsViewUtil = CmsViewUtil.INSTANCE;
                    Context context = llContainer.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "llContainer.context");
                    TextView medicinalView = cmsViewUtil.getMedicinalView(context);
                    FeaturesItem.this.setTextScaleSize(medicinalView, FontUtil.INSTANCE.getFont26());
                    llContainer.addView(medicinalView);
                    FeaturesItem.this.getMedicinalTextViews().add(medicinalView);
                }
            }
        };
        function1.invoke(Integer.valueOf(z ? 6 : this.childes.size()));
        ViewExtensionsKt.setSingleClickListener$default(showMoreContainer, 0L, new Function1<View, Unit>() { // from class: com.glority.android.cmsui.entity.FeaturesItem$renderFeaturesItem$1
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
                new LogEventRequest(CmsUILogEvents.CMS_SHOW_MORE_FEATURES, null).post();
                showMoreContainer.setVisibility(8);
                function1.invoke(Integer.valueOf(FeaturesItem.this.getChildes().size()));
            }
        }, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void readerColor(View llSubContainer, FeaturesSubItem featuresSubItem) {
        AppFlowLayout llFeatureValue = (AppFlowLayout) llSubContainer.findViewById(R.id.ll_features_value);
        llFeatureValue.removeAllViews();
        int dimension = (int) ResUtils.getDimension(R.dimen.x16);
        int dimension2 = (int) ResUtils.getDimension(R.dimen.x6);
        List<Map<String, Object>> value = featuresSubItem.getValue();
        if (value != null) {
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                try {
                    CmsTagColors cmsTagColors = new CmsTagColors(new JSONObject((Map) it.next()));
                    Intrinsics.checkNotNullExpressionValue(llFeatureValue, "llFeatureValue");
                    TextView textView = new TextView(llFeatureValue.getContext());
                    textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    textView.setBackgroundResource(getMapBackgroundResource(cmsTagColors.getColor()));
                    textView.setText(getMappingText(cmsTagColors.getColor()));
                    textView.setSingleLine(true);
                    setTextScaleSize(textView, FontUtil.INSTANCE.getFont28());
                    textView.setTextColor(android.graphics.Color.parseColor(getMappingTextColor(cmsTagColors.getColor())));
                    textView.setPadding(dimension, 0, dimension, dimension2);
                    llFeatureValue.addView(textView);
                    Boolean.valueOf(this.colorTextViews.add(textView));
                } catch (Exception e) {
                    if (AppContext.INSTANCE.isDebugMode()) {
                        LogUtils.e(Log.getStackTraceString(e));
                    }
                }
            }
        }
    }

    private final int getMapBackgroundResource(Color color) {
        switch (WhenMappings.$EnumSwitchMapping$0[color.ordinal()]) {
            case 1:
                return R.drawable.shape_rect_solid_orange_r_4;
            case 2:
                return R.drawable.shape_rect_solid_yellow_r_4;
            case 3:
                return R.drawable.shape_rect_solid_green_r_4;
            case 4:
                return R.drawable.shape_rect_solid_red_r_4;
            case 5:
                return R.drawable.shape_rect_solid_purple_r_4;
            case 6:
                return R.drawable.shape_rect_solid_blue_r_4;
            case 7:
                return R.drawable.shape_rect_solid_white_stroke979797_r_4;
            case 8:
                return R.drawable.shape_rect_solid_pink_r_4;
            case 9:
                return R.drawable.shape_rect_solid_bronze_r_4;
            case 10:
                return R.drawable.shape_rect_solid_cream_r_4;
            case 11:
                return R.drawable.shape_rect_solid_black_r_4;
            case 12:
                return R.drawable.shape_rect_solid_grey_r_4;
            case 13:
                return R.drawable.shape_rect_solid_silver_r_4;
            case 14:
                return R.drawable.shape_rect_solid_brown_r_4;
            case 15:
                return R.drawable.shape_rect_solid_gold_r_4;
            case 16:
                return R.drawable.shape_rect_solid_variegated_r_4;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final String getMappingTextColor(Color color) {
        switch (WhenMappings.$EnumSwitchMapping$1[color.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return "#FFFFFF";
            case 14:
            case 15:
                return "#000000";
            case 16:
                return "#95A674";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final String getMappingText(Color color) {
        switch (WhenMappings.$EnumSwitchMapping$2[color.ordinal()]) {
            case 1:
                String string = ResUtils.getString(R.string.text_orange);
                Intrinsics.checkNotNullExpressionValue(string, "ResUtils.getString(R.string.text_orange)");
                return string;
            case 2:
                String string2 = ResUtils.getString(R.string.text_yellow);
                Intrinsics.checkNotNullExpressionValue(string2, "ResUtils.getString(R.string.text_yellow)");
                return string2;
            case 3:
                String string3 = ResUtils.getString(R.string.text_green);
                Intrinsics.checkNotNullExpressionValue(string3, "ResUtils.getString(R.string.text_green)");
                return string3;
            case 4:
                String string4 = ResUtils.getString(R.string.text_red);
                Intrinsics.checkNotNullExpressionValue(string4, "ResUtils.getString(R.string.text_red)");
                return string4;
            case 5:
                String string5 = ResUtils.getString(R.string.text_purple);
                Intrinsics.checkNotNullExpressionValue(string5, "ResUtils.getString(R.string.text_purple)");
                return string5;
            case 6:
                String string6 = ResUtils.getString(R.string.text_blue);
                Intrinsics.checkNotNullExpressionValue(string6, "ResUtils.getString(R.string.text_blue)");
                return string6;
            case 7:
                String string7 = ResUtils.getString(R.string.text_white);
                Intrinsics.checkNotNullExpressionValue(string7, "ResUtils.getString(R.string.text_white)");
                return string7;
            case 8:
                String string8 = ResUtils.getString(R.string.text_pink);
                Intrinsics.checkNotNullExpressionValue(string8, "ResUtils.getString(R.string.text_pink)");
                return string8;
            case 9:
                String string9 = ResUtils.getString(R.string.text_bronze);
                Intrinsics.checkNotNullExpressionValue(string9, "ResUtils.getString(R.string.text_bronze)");
                return string9;
            case 10:
                String string10 = ResUtils.getString(R.string.text_cream);
                Intrinsics.checkNotNullExpressionValue(string10, "ResUtils.getString(R.string.text_cream)");
                return string10;
            case 11:
                String string11 = ResUtils.getString(R.string.text_black);
                Intrinsics.checkNotNullExpressionValue(string11, "ResUtils.getString(R.string.text_black)");
                return string11;
            case 12:
                String string12 = ResUtils.getString(R.string.text_gray);
                Intrinsics.checkNotNullExpressionValue(string12, "ResUtils.getString(R.string.text_gray)");
                return string12;
            case 13:
                String string13 = ResUtils.getString(R.string.text_silver);
                Intrinsics.checkNotNullExpressionValue(string13, "ResUtils.getString(R.string.text_silver)");
                return string13;
            case 14:
                String string14 = ResUtils.getString(R.string.text_brown);
                Intrinsics.checkNotNullExpressionValue(string14, "ResUtils.getString(R.string.text_brown)");
                return string14;
            case 15:
                String string15 = ResUtils.getString(R.string.text_gold);
                Intrinsics.checkNotNullExpressionValue(string15, "ResUtils.getString(R.string.text_gold)");
                return string15;
            case 16:
                String string16 = ResUtils.getString(R.string.text_variegated);
                Intrinsics.checkNotNullExpressionValue(string16, "ResUtils.getString(R.string.text_variegated)");
                return string16;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: FeaturesItem.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J<\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f¨\u0006\u0010"}, d2 = {"Lcom/glority/android/cmsui/entity/FeaturesItem$Companion;", "", "()V", "create", "Lcom/glority/android/cmsui/entity/FeaturesItem;", TtmlNode.TAG_LAYOUT, "Lcom/glority/android/cmsui/model/CmsLayout;", "cmsTags", "", "Lcom/glority/android/cmsui/model/CmsTag;", "markdown", "Lio/noties/markwon/Markwon;", "forceExpend", "", Args.pageName, "", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ FeaturesItem create$default(Companion companion, CmsLayout cmsLayout, List list, Markwon markwon, boolean z, String str, int i, Object obj) {
            if ((i & 8) != 0) {
                z = false;
            }
            boolean z2 = z;
            if ((i & 16) != 0) {
                str = "";
            }
            return companion.create(cmsLayout, list, markwon, z2, str);
        }

        public final FeaturesItem create(CmsLayout layout, List<CmsTag> cmsTags, Markwon markdown, boolean forceExpend, String pageName) {
            Object obj;
            FeaturesSubItem featuresSubItem;
            Intrinsics.checkNotNullParameter(layout, "layout");
            Intrinsics.checkNotNullParameter(cmsTags, "cmsTags");
            Intrinsics.checkNotNullParameter(pageName, "pageName");
            CmsTitle cmsTitle = layout.getCmsTitle();
            String displayName = cmsTitle != null ? cmsTitle.getDisplayName() : null;
            CmsTitle cmsTitle2 = layout.getCmsTitle();
            String lightModeIconUrl = cmsTitle2 != null ? cmsTitle2.getLightModeIconUrl() : null;
            List<String> tagNames = layout.getTagNames();
            if (tagNames != null) {
                ArrayList arrayList = new ArrayList();
                boolean z = false;
                for (String str : tagNames) {
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
                    if (cmsTag != null) {
                        Boolean withEdibleOrMedicalInfo = cmsTag.getWithEdibleOrMedicalInfo();
                        z = withEdibleOrMedicalInfo != null ? withEdibleOrMedicalInfo.booleanValue() : false;
                        String str2 = lightModeIconUrl;
                        if (str2 == null || str2.length() == 0) {
                            CmsTitle cmsTitle3 = cmsTag.getCmsTitle();
                            lightModeIconUrl = cmsTitle3 != null ? cmsTitle3.getLightModeIconUrl() : null;
                        }
                        String str3 = displayName;
                        if (str3 == null || str3.length() == 0) {
                            CmsTitle cmsTitle4 = cmsTag.getCmsTitle();
                            displayName = cmsTitle4 != null ? cmsTitle4.getDisplayName() : null;
                        }
                        CmsTitle cmsTitle5 = cmsTag.getCmsTitle();
                        featuresSubItem = new FeaturesSubItem(cmsTitle5 != null ? cmsTitle5.getDisplayName() : null, cmsTag.getTagValues());
                    } else {
                        featuresSubItem = null;
                    }
                    if (featuresSubItem != null) {
                        arrayList.add(featuresSubItem);
                    }
                }
                ArrayList arrayList2 = arrayList;
                if (!arrayList2.isEmpty()) {
                    return new FeaturesItem(displayName, lightModeIconUrl, arrayList2, markdown, z, forceExpend, pageName);
                }
            }
            return null;
        }
    }
}

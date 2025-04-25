package com.glority.android.cmsui.entity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.cms.base.BaseItem;
import com.glority.android.cms.base.CmsMultiEntity;
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
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.xx.constants.Args;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import io.noties.markwon.Markwon;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConditionItem.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u0000 A2\u00020\u0001:\u0001ABQ\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010+\u001a\u00020\t2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\b\u0010.\u001a\u00020/H\u0016J\t\u00100\u001a\u00020/HÖ\u0001J \u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000208H\u0016J:\u00109\u001a\u0002022\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u0003H\u0002J\t\u0010@\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\n\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018¨\u0006B"}, d2 = {"Lcom/glority/android/cmsui/entity/ConditionItem;", "Lcom/glority/android/cms/base/BaseItem;", Args.title, "", "icon", "childs", "", "Lcom/glority/android/cmsui/entity/ConditionSubItem;", "hasCareDetail", "", "expand", "markdown", "Lio/noties/markwon/Markwon;", Args.pageName, "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZLio/noties/markwon/Markwon;Ljava/lang/String;)V", "getChilds", "()Ljava/util/List;", "getExpand", "()Z", "setExpand", "(Z)V", "getHasCareDetail", "setHasCareDetail", "getIcon", "()Ljava/lang/String;", "itemClick", "Lcom/glority/android/cms/listener/ClickListener;", "getItemClick", "()Lcom/glority/android/cms/listener/ClickListener;", "setItemClick", "(Lcom/glority/android/cms/listener/ClickListener;)V", "getMarkdown", "()Lio/noties/markwon/Markwon;", "getPageName", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "getLayoutId", "", "hashCode", "render", "", "context", "Landroid/content/Context;", "helper", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "data", "Lcom/glority/android/cms/base/ExtraData;", "renderConditionSection", "llContainer", "Landroid/widget/LinearLayout;", "showMoreContainer", "Landroid/view/View;", "markwon", "section", "toString", "Companion", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final /* data */ class ConditionItem extends BaseItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final List<ConditionSubItem> childs;
    private boolean expand;
    private boolean hasCareDetail;
    private final String icon;
    private ClickListener<ConditionSubItem> itemClick;
    private final Markwon markdown;
    private final String pageName;
    private final String title;

    public static /* synthetic */ ConditionItem copy$default(ConditionItem conditionItem, String str, String str2, List list, boolean z, boolean z2, Markwon markwon, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = conditionItem.title;
        }
        if ((i & 2) != 0) {
            str2 = conditionItem.icon;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            list = conditionItem.childs;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            z = conditionItem.hasCareDetail;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = conditionItem.expand;
        }
        boolean z4 = z2;
        if ((i & 32) != 0) {
            markwon = conditionItem.markdown;
        }
        Markwon markwon2 = markwon;
        if ((i & 64) != 0) {
            str3 = conditionItem.pageName;
        }
        return conditionItem.copy(str, str4, list2, z3, z4, markwon2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    public final List<ConditionSubItem> component3() {
        return this.childs;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getHasCareDetail() {
        return this.hasCareDetail;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getExpand() {
        return this.expand;
    }

    /* renamed from: component6, reason: from getter */
    public final Markwon getMarkdown() {
        return this.markdown;
    }

    /* renamed from: component7, reason: from getter */
    public final String getPageName() {
        return this.pageName;
    }

    public final ConditionItem copy(String title, String icon, List<ConditionSubItem> childs, boolean hasCareDetail, boolean expand, Markwon markdown, String pageName) {
        Intrinsics.checkNotNullParameter(childs, "childs");
        return new ConditionItem(title, icon, childs, hasCareDetail, expand, markdown, pageName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConditionItem)) {
            return false;
        }
        ConditionItem conditionItem = (ConditionItem) other;
        return Intrinsics.areEqual(this.title, conditionItem.title) && Intrinsics.areEqual(this.icon, conditionItem.icon) && Intrinsics.areEqual(this.childs, conditionItem.childs) && this.hasCareDetail == conditionItem.hasCareDetail && this.expand == conditionItem.expand && Intrinsics.areEqual(this.markdown, conditionItem.markdown) && Intrinsics.areEqual(this.pageName, conditionItem.pageName);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.title;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.icon;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<ConditionSubItem> list = this.childs;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        boolean z = this.hasCareDetail;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode3 + i) * 31;
        boolean z2 = this.expand;
        int i3 = (i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        Markwon markwon = this.markdown;
        int hashCode4 = (i3 + (markwon != null ? markwon.hashCode() : 0)) * 31;
        String str3 = this.pageName;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "ConditionItem(title=" + this.title + ", icon=" + this.icon + ", childs=" + this.childs + ", hasCareDetail=" + this.hasCareDetail + ", expand=" + this.expand + ", markdown=" + this.markdown + ", pageName=" + this.pageName + ")";
    }

    public final List<ConditionSubItem> getChilds() {
        return this.childs;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean getExpand() {
        return this.expand;
    }

    public final boolean getHasCareDetail() {
        return this.hasCareDetail;
    }

    public final void setExpand(boolean z) {
        this.expand = z;
    }

    public final void setHasCareDetail(boolean z) {
        this.hasCareDetail = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConditionItem(String str, String str2, List<ConditionSubItem> childs, boolean z, boolean z2, Markwon markwon, String str3) {
        super(str3);
        Intrinsics.checkNotNullParameter(childs, "childs");
        this.title = str;
        this.icon = str2;
        this.childs = childs;
        this.hasCareDetail = z;
        this.expand = z2;
        this.markdown = markwon;
        this.pageName = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ ConditionItem(java.lang.String r11, java.lang.String r12, java.util.List r13, boolean r14, boolean r15, io.noties.markwon.Markwon r16, java.lang.String r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r10 = this;
            r0 = r18 & 8
            r1 = 0
            if (r0 == 0) goto L7
            r6 = r1
            goto L8
        L7:
            r6 = r14
        L8:
            r0 = r18 & 16
            if (r0 == 0) goto Le
            r7 = r1
            goto Lf
        Le:
            r7 = r15
        Lf:
            r0 = r18 & 32
            if (r0 == 0) goto L19
            r0 = 0
            r1 = r0
            io.noties.markwon.Markwon r1 = (io.noties.markwon.Markwon) r1
            r8 = r0
            goto L1b
        L19:
            r8 = r16
        L1b:
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r9 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.cmsui.entity.ConditionItem.<init>(java.lang.String, java.lang.String, java.util.List, boolean, boolean, io.noties.markwon.Markwon, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final Markwon getMarkdown() {
        return this.markdown;
    }

    public final String getPageName() {
        return this.pageName;
    }

    public final ClickListener<ConditionSubItem> getItemClick() {
        return this.itemClick;
    }

    public final void setItemClick(ClickListener<ConditionSubItem> clickListener) {
        this.itemClick = clickListener;
    }

    @Override // com.glority.android.cms.base.BaseItem
    public int getLayoutId() {
        return R.layout.item_cms_condition;
    }

    @Override // com.glority.android.cms.base.BaseItem
    public void render(Context context, BaseViewHolder helper, ExtraData data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(data, "data");
        ImageView imageView = (ImageView) helper.getView(R.id.iv_icon);
        Glide.with(imageView).load(this.icon).into(imageView);
        CmsMarkdown.INSTANCE.setText(this.markdown, (TextView) helper.getView(R.id.tv_title), this.title);
        LinearLayout linearLayout = (LinearLayout) helper.getView(R.id.ll_container);
        View view = helper.getView(R.id.show_more_container);
        CmsMultiEntity item = data.getItem();
        String str = (item == null || item.getItemType() != 3) ? "CareGuide" : "Conditions";
        Markwon markwon = this.markdown;
        String str2 = this.pageName;
        if (str2 == null) {
            str2 = "";
        }
        renderConditionSection(linearLayout, view, markwon, str2, str);
    }

    static /* synthetic */ void renderConditionSection$default(ConditionItem conditionItem, LinearLayout linearLayout, View view, Markwon markwon, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            markwon = null;
        }
        Markwon markwon2 = markwon;
        if ((i & 8) != 0) {
            str = "detail";
        }
        String str3 = str;
        if ((i & 16) != 0) {
            str2 = "Conditions";
        }
        conditionItem.renderConditionSection(linearLayout, view, markwon2, str3, str2);
    }

    private final void renderConditionSection(LinearLayout llContainer, final View showMoreContainer, Markwon markwon, final String pageName, final String section) {
        boolean z = !this.expand && this.childs.size() > 4;
        showMoreContainer.setVisibility(z ? 0 : 8);
        LayoutInflater from = LayoutInflater.from(llContainer.getContext());
        final Function1<String, Unit> function1 = new Function1<String, Unit>() { // from class: com.glority.android.cmsui.entity.ConditionItem$renderConditionSection$logEvent$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String it) {
                String str;
                Intrinsics.checkNotNullParameter(it, "it");
                StringBuilder sb = new StringBuilder();
                String str2 = pageName;
                if (str2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String lowerCase = str2.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                StringBuilder append = sb.append(lowerCase).append('_');
                String str3 = section;
                if (str3 == null) {
                    str = null;
                } else {
                    if (str3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    str = str3.toLowerCase();
                    Intrinsics.checkNotNullExpressionValue(str, "(this as java.lang.String).toLowerCase()");
                }
                new LogEventRequest(append.append(str).append(it).toString(), null, 2, null).post();
            }
        };
        List<ConditionSubItem> list = this.childs;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String iconUrl = ((ConditionSubItem) it.next()).getIconUrl();
            arrayList.add(Boolean.valueOf(!(iconUrl == null || iconUrl.length() == 0)));
        }
        final ConditionItem$renderConditionSection$render$1 conditionItem$renderConditionSection$render$1 = new ConditionItem$renderConditionSection$render$1(this, llContainer, z, from, markwon, !arrayList.contains(false), function1);
        conditionItem$renderConditionSection$render$1.invoke((ConditionItem$renderConditionSection$render$1) Integer.valueOf(z ? 3 : this.childs.size()));
        ViewExtensionsKt.setSingleClickListener$default(showMoreContainer, 0L, new Function1<View, Unit>() { // from class: com.glority.android.cmsui.entity.ConditionItem$renderConditionSection$1
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
                function1.invoke(CmsUILogEvents.CMS_SHOW_MORE);
                showMoreContainer.setVisibility(8);
                conditionItem$renderConditionSection$render$1.invoke(Integer.valueOf(ConditionItem.this.getChilds().size()));
            }
        }, 1, (Object) null);
    }

    /* compiled from: ConditionItem.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¨\u0006\u000e"}, d2 = {"Lcom/glority/android/cmsui/entity/ConditionItem$Companion;", "", "()V", "create", "Lcom/glority/android/cmsui/entity/ConditionItem;", TtmlNode.TAG_LAYOUT, "Lcom/glority/android/cmsui/model/CmsLayout;", "cmsTags", "", "Lcom/glority/android/cmsui/model/CmsTag;", "markdown", "Lio/noties/markwon/Markwon;", Args.pageName, "", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ConditionItem create$default(Companion companion, CmsLayout cmsLayout, List list, Markwon markwon, String str, int i, Object obj) {
            if ((i & 4) != 0) {
                markwon = null;
            }
            if ((i & 8) != 0) {
                str = null;
            }
            return companion.create(cmsLayout, list, markwon, str);
        }

        public final ConditionItem create(CmsLayout layout, List<CmsTag> cmsTags, Markwon markdown, String pageName) {
            Object obj;
            ConditionSubItem conditionSubItem;
            Map<String, ? extends Object> map;
            Intrinsics.checkNotNullParameter(layout, "layout");
            Intrinsics.checkNotNullParameter(cmsTags, "cmsTags");
            CmsTitle cmsTitle = layout.getCmsTitle();
            String displayName = cmsTitle != null ? cmsTitle.getDisplayName() : null;
            CmsTitle cmsTitle2 = layout.getCmsTitle();
            String lightModeIconUrl = cmsTitle2 != null ? cmsTitle2.getLightModeIconUrl() : null;
            List<String> tagNames = layout.getTagNames();
            if (tagNames != null) {
                ArrayList arrayList = new ArrayList();
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
                    if (cmsTag == null || (map = (Map) CollectionsKt.firstOrNull((List) cmsTag.getTagValues())) == null) {
                        conditionSubItem = null;
                    } else {
                        if (!CmsTagValueUtil.INSTANCE.isCmsTagString(map)) {
                            return null;
                        }
                        CmsTagString convert2CmsTagString = CmsTagValueUtil.INSTANCE.convert2CmsTagString(map);
                        CmsTitle cmsTitle3 = cmsTag.getCmsTitle();
                        String displayName2 = cmsTitle3 != null ? cmsTitle3.getDisplayName() : null;
                        String value = convert2CmsTagString != null ? convert2CmsTagString.getValue() : null;
                        String tagName = cmsTag.getTagName();
                        CmsTitle cmsTitle4 = cmsTag.getCmsTitle();
                        conditionSubItem = new ConditionSubItem(displayName2, value, tagName, cmsTitle4 != null ? cmsTitle4.getLightModeIconUrl() : null);
                    }
                    if (conditionSubItem != null) {
                        arrayList.add(conditionSubItem);
                    }
                }
                ArrayList arrayList2 = arrayList;
                if (!arrayList2.isEmpty()) {
                    return new ConditionItem(displayName, lightModeIconUrl, arrayList2, false, false, markdown, pageName, 24, null);
                }
            }
            return null;
        }
    }
}

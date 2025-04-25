package com.glority.android.cmsui.entity;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
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
import com.glority.android.cmsui.model.CmsObject;
import com.glority.android.cmsui.model.TaxonomyName;
import com.glority.android.cmsui.model.TaxonomyType;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.xx.constants.Args;
import com.glority.utils.app.ResUtils;
import io.noties.markwon.Markwon;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScientificItem.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 >2\u00020\u0001:\u0001>BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003JO\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\b\u0010'\u001a\u00020(H\u0016J\t\u0010)\u001a\u00020(HÖ\u0001J \u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0016J.\u00102\u001a\u00020+2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u0007082\u0006\u00109\u001a\u00020(H\u0002J\"\u0010:\u001a\u00020+2\u0006\u00105\u001a\u0002062\u0006\u0010;\u001a\u00020<2\b\b\u0002\u0010\f\u001a\u00020\u0003H\u0002J\t\u0010=\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0015\"\u0004\b\u001c\u0010\u0017¨\u0006?"}, d2 = {"Lcom/glority/android/cmsui/entity/ScientificItem;", "Lcom/glority/android/cmsui/entity/BaseFontScaleItem;", Args.title, "", "icon", "child", "", "Lcom/glority/android/cmsui/entity/ScientificSubItem;", "expand", "", "markdown", "Lio/noties/markwon/Markwon;", Args.pageName, "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLio/noties/markwon/Markwon;Ljava/lang/String;)V", "getChild", "()Ljava/util/List;", "getExpand", "()Z", "setExpand", "(Z)V", "getIcon", "()Ljava/lang/String;", "setIcon", "(Ljava/lang/String;)V", "getMarkdown", "()Lio/noties/markwon/Markwon;", "getPageName", "getTitle", "setTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "getLayoutId", "", "hashCode", "render", "", "context", "Landroid/content/Context;", "helper", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "data", "Lcom/glority/android/cms/base/ExtraData;", "renderScientificItem", "inflater", "Landroid/view/LayoutInflater;", "llContainer", "Landroid/widget/LinearLayout;", "childs", "", "count", "renderScientificSection", "showMoreContainer", "Landroid/view/View;", "toString", "Companion", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final /* data */ class ScientificItem extends BaseFontScaleItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final List<ScientificSubItem> child;
    private boolean expand;
    private String icon;
    private final Markwon markdown;
    private final String pageName;
    private String title;

    public static /* synthetic */ ScientificItem copy$default(ScientificItem scientificItem, String str, String str2, List list, boolean z, Markwon markwon, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = scientificItem.title;
        }
        if ((i & 2) != 0) {
            str2 = scientificItem.icon;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            list = scientificItem.child;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            z = scientificItem.expand;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            markwon = scientificItem.markdown;
        }
        Markwon markwon2 = markwon;
        if ((i & 32) != 0) {
            str3 = scientificItem.pageName;
        }
        return scientificItem.copy(str, str4, list2, z2, markwon2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    public final List<ScientificSubItem> component3() {
        return this.child;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getExpand() {
        return this.expand;
    }

    /* renamed from: component5, reason: from getter */
    public final Markwon getMarkdown() {
        return this.markdown;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPageName() {
        return this.pageName;
    }

    public final ScientificItem copy(String title, String icon, List<ScientificSubItem> child, boolean expand, Markwon markdown, String pageName) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        return new ScientificItem(title, icon, child, expand, markdown, pageName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScientificItem)) {
            return false;
        }
        ScientificItem scientificItem = (ScientificItem) other;
        return Intrinsics.areEqual(this.title, scientificItem.title) && Intrinsics.areEqual(this.icon, scientificItem.icon) && Intrinsics.areEqual(this.child, scientificItem.child) && this.expand == scientificItem.expand && Intrinsics.areEqual(this.markdown, scientificItem.markdown) && Intrinsics.areEqual(this.pageName, scientificItem.pageName);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.title;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.icon;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<ScientificSubItem> list = this.child;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        boolean z = this.expand;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode3 + i) * 31;
        Markwon markwon = this.markdown;
        int hashCode4 = (i2 + (markwon != null ? markwon.hashCode() : 0)) * 31;
        String str3 = this.pageName;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "ScientificItem(title=" + this.title + ", icon=" + this.icon + ", child=" + this.child + ", expand=" + this.expand + ", markdown=" + this.markdown + ", pageName=" + this.pageName + ")";
    }

    public final List<ScientificSubItem> getChild() {
        return this.child;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setIcon(String str) {
        this.icon = str;
    }

    public final void setTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScientificItem(String title, String str, List<ScientificSubItem> child, boolean z, Markwon markwon, String pageName) {
        super(pageName);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        this.title = title;
        this.icon = str;
        this.child = child;
        this.expand = z;
        this.markdown = markwon;
        this.pageName = pageName;
    }

    public /* synthetic */ ScientificItem(String str, String str2, List list, boolean z, Markwon markwon, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, (i & 8) != 0 ? false : z, markwon, (i & 32) != 0 ? "" : str3);
    }

    public final boolean getExpand() {
        return this.expand;
    }

    public final Markwon getMarkdown() {
        return this.markdown;
    }

    public final String getPageName() {
        return this.pageName;
    }

    public final void setExpand(boolean z) {
        this.expand = z;
    }

    @Override // com.glority.android.cms.base.BaseItem
    public int getLayoutId() {
        return R.layout.item_cms_scientific;
    }

    @Override // com.glority.android.cms.base.BaseItem
    public void render(Context context, BaseViewHolder helper, ExtraData data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(data, "data");
        ImageView imageView = (ImageView) helper.getView(R.id.iv_icon);
        Glide.with(imageView).load(this.icon).into(imageView);
        CmsMarkdown.INSTANCE.setText(this.markdown, (TextView) helper.getView(R.id.tv_title), this.title);
        renderScientificSection$default(this, (LinearLayout) helper.getView(R.id.ll_container), helper.getView(R.id.show_more_container), null, 4, null);
    }

    static /* synthetic */ void renderScientificSection$default(ScientificItem scientificItem, LinearLayout linearLayout, View view, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = "detail";
        }
        scientificItem.renderScientificSection(linearLayout, view, str);
    }

    private final void renderScientificSection(final LinearLayout llContainer, final View showMoreContainer, final String pageName) {
        final List<ScientificSubItem> list = this.child;
        boolean z = !this.expand && list.size() > 2;
        showMoreContainer.setVisibility(z ? 0 : 8);
        if (z) {
            ViewGroup.LayoutParams layoutParams = llContainer.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = (int) ResUtils.getDimension(R.dimen.x50);
            }
        }
        int size = z ? 2 : list.size();
        final LayoutInflater inflater = LayoutInflater.from(llContainer.getContext());
        Intrinsics.checkNotNullExpressionValue(inflater, "inflater");
        renderScientificItem(inflater, llContainer, list, size);
        ViewExtensionsKt.setSingleClickListener$default(showMoreContainer, 0L, new Function1<View, Unit>() { // from class: com.glority.android.cmsui.entity.ScientificItem$renderScientificSection$1
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
                if (ScientificItem.this.getExpand() || list.size() <= 2) {
                    return;
                }
                new LogEventRequest(pageName + CmsUILogEvents.CMS_SHOW_MORE, null, 2, null).post();
                ScientificItem.this.setExpand(true);
                showMoreContainer.setVisibility(8);
                ViewGroup.LayoutParams layoutParams2 = llContainer.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? layoutParams2 : null);
                if (marginLayoutParams2 != null) {
                    marginLayoutParams2.bottomMargin = 0;
                }
                ScientificItem scientificItem = ScientificItem.this;
                LayoutInflater inflater2 = inflater;
                Intrinsics.checkNotNullExpressionValue(inflater2, "inflater");
                LinearLayout linearLayout = llContainer;
                List list2 = list;
                scientificItem.renderScientificItem(inflater2, linearLayout, list2, list2.size());
            }
        }, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderScientificItem(LayoutInflater inflater, LinearLayout llContainer, List<ScientificSubItem> childs, int count) {
        llContainer.removeAllViews();
        for (ScientificSubItem scientificSubItem : CollectionsKt.take(childs, count)) {
            View inflate = inflater.inflate(R.layout.item_cms_scientific_sub, (ViewGroup) llContainer, false);
            ((TextView) inflate.findViewById(R.id.tv_scientific_key)).setText(scientificSubItem.getKey());
            View findViewById = inflate.findViewById(R.id.tv_scientific_value);
            Intrinsics.checkNotNullExpressionValue(findViewById, "llSubContainer.findViewB…R.id.tv_scientific_value)");
            ((TextView) findViewById).setText(scientificSubItem.getValue());
            llContainer.addView(inflate);
        }
    }

    /* compiled from: ScientificItem.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nJ\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0002J\u001a\u0010\u000f\u001a\u0004\u0018\u00010\n2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0011H\u0002¨\u0006\u0012"}, d2 = {"Lcom/glority/android/cmsui/entity/ScientificItem$Companion;", "", "()V", "create", "Lcom/glority/android/cmsui/entity/ScientificItem;", "cmsObject", "Lcom/glority/android/cmsui/model/CmsObject;", "markdown", "Lio/noties/markwon/Markwon;", Args.pageName, "", "formatScientificContent", "Landroid/text/SpannableStringBuilder;", "latin", "name", "scientificAllNames", "commonNames", "", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes14.dex */
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
        /* loaded from: classes14.dex */
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[TaxonomyType.values().length];
                $EnumSwitchMapping$0 = iArr;
                iArr[TaxonomyType.GENUS.ordinal()] = 1;
                iArr[TaxonomyType.FAMILY.ordinal()] = 2;
                iArr[TaxonomyType.ORDER.ordinal()] = 3;
                iArr[TaxonomyType.CLASS.ordinal()] = 4;
                iArr[TaxonomyType.PHYLUM.ordinal()] = 5;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ScientificItem create$default(Companion companion, CmsObject cmsObject, Markwon markwon, String str, int i, Object obj) {
            if ((i & 4) != 0) {
                str = "";
            }
            return companion.create(cmsObject, markwon, str);
        }

        public final ScientificItem create(CmsObject cmsObject, Markwon markdown, String pageName) {
            Object obj;
            Intrinsics.checkNotNullParameter(cmsObject, "cmsObject");
            Intrinsics.checkNotNullParameter(pageName, "pageName");
            ArrayList arrayList = new ArrayList();
            List<TaxonomyName> taxonomies = cmsObject.getTaxonomies();
            for (TaxonomyType taxonomyType : CollectionsKt.listOf((Object[]) new TaxonomyType[]{TaxonomyType.GENUS, TaxonomyType.FAMILY, TaxonomyType.ORDER, TaxonomyType.CLASS, TaxonomyType.PHYLUM})) {
                Iterator<T> it = taxonomies.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((TaxonomyName) obj).getType() == taxonomyType) {
                        break;
                    }
                }
                TaxonomyName taxonomyName = (TaxonomyName) obj;
                if (taxonomyName != null) {
                    String scientificAllNames = ScientificItem.INSTANCE.scientificAllNames(taxonomyName.getCommonNames());
                    SpannableStringBuilder formatScientificContent = ScientificItem.INSTANCE.formatScientificContent(taxonomyName.getLatinName(), scientificAllNames);
                    if (taxonomyName.getLatinName().length() > 0 && scientificAllNames != null && scientificAllNames.length() > 0) {
                        int i = WhenMappings.$EnumSwitchMapping$0[taxonomyName.getType().ordinal()];
                        if (i == 1) {
                            arrayList.add(new ScientificSubItem(R.string.item_genus, formatScientificContent, R.color.GrayF7F8F8));
                        } else if (i == 2) {
                            arrayList.add(new ScientificSubItem(R.string.item_family, formatScientificContent, R.color.EEEEEE));
                        } else if (i == 3) {
                            arrayList.add(new ScientificSubItem(R.string.label_text_order, formatScientificContent, R.color.GrayF7F8F8));
                        } else if (i == 4) {
                            arrayList.add(new ScientificSubItem(R.string.label_text_class, formatScientificContent, R.color.EEEEEE));
                        } else if (i == 5) {
                            arrayList.add(new ScientificSubItem(R.string.label_text_phylum, formatScientificContent, R.color.GrayF7F8F8));
                        }
                    }
                }
            }
            return new ScientificItem("", "", arrayList, false, markdown, pageName);
        }

        private final String scientificAllNames(List<String> commonNames) {
            String str = "";
            if (commonNames != null) {
                for (String str2 : commonNames) {
                    str = str.length() == 0 ? str2 : str + ',' + str2;
                }
            }
            return str;
        }

        private final SpannableStringBuilder formatScientificContent(String latin, String name) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(latin);
            String str = name;
            if (!TextUtils.isEmpty(str) && (!Intrinsics.areEqual(latin, name))) {
                spannableStringBuilder.append((CharSequence) "-");
                spannableStringBuilder.append((CharSequence) str);
                spannableStringBuilder.setSpan(new ForegroundColorSpan((int) 4284900966L), 0, latin.length(), 33);
            }
            spannableStringBuilder.setSpan(new StyleSpan(2), 0, latin.length(), 33);
            return spannableStringBuilder;
        }
    }
}

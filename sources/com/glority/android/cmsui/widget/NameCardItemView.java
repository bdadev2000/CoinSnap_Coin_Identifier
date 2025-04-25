package com.glority.android.cmsui.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.cms.base.BaseItem;
import com.glority.android.cms.base.ExtraData;
import com.glority.android.cms.listener.ClickListener;
import com.glority.android.cmsui.R;
import com.glority.android.cmsui.common.CmsUILogEvents;
import com.glority.android.cmsui.entity.namecard.BaseNameCardItem;
import com.glority.android.core.app.AppContext;
import com.glority.android.namecard.base.AbsCmsNameCardView;
import com.glority.android.namecard.base.CmsNameCardFactory;
import com.glority.android.namecard.base.entity.PopularCultivarName;
import com.glority.android.namecard.base.entity.SimpleCmsObject;
import com.glority.android.namecard.base.entity.SimpleTaxonomyName;
import com.glority.android.namecard.base.entity.SimpleTaxonomyType;
import com.glority.android.xx.constants.Args;
import com.glority.component.generatedAPI.kotlinAPI.cms.CmsName;
import com.glority.component.generatedAPI.kotlinAPI.cms.SimpleCmsName;
import com.glority.component.generatedAPI.kotlinAPI.cms.TaxonomyName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NameCardItemView.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, d2 = {"Lcom/glority/android/cmsui/widget/NameCardItemView;", "Lcom/glority/android/cmsui/entity/namecard/BaseNameCardItem;", "memoNo", "", Args.cmsName, "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName;", "isInfoCard", "", "customName", "customNotes", "editEnable", Args.pageName, "(Ljava/lang/String;Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getMemoNo", "()Ljava/lang/String;", "converter", "Lcom/glority/android/namecard/base/entity/SimpleCmsObject;", "doRender", "", "context", "Landroid/content/Context;", "helper", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "data", "Lcom/glority/android/cms/base/ExtraData;", "getLayoutId", "", "getRootViewId", "taxonomyNameConverter", "Lcom/glority/android/namecard/base/entity/SimpleTaxonomyName;", "name", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/TaxonomyName;", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class NameCardItemView extends BaseNameCardItem {
    private final String memoNo;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ NameCardItemView(java.lang.String r11, com.glority.component.generatedAPI.kotlinAPI.cms.CmsName r12, boolean r13, java.lang.String r14, java.lang.String r15, boolean r16, java.lang.String r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r10 = this;
            r0 = r18 & 8
            r1 = 0
            if (r0 == 0) goto La
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            r6 = r1
            goto Lb
        La:
            r6 = r14
        Lb:
            r0 = r18 & 16
            if (r0 == 0) goto L14
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            r7 = r1
            goto L15
        L14:
            r7 = r15
        L15:
            r0 = r18 & 32
            if (r0 == 0) goto L1c
            r0 = 1
            r8 = r0
            goto L1e
        L1c:
            r8 = r16
        L1e:
            r0 = r18 & 64
            if (r0 == 0) goto L27
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            r9 = r1
            goto L29
        L27:
            r9 = r17
        L29:
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.cmsui.widget.NameCardItemView.<init>(java.lang.String, com.glority.component.generatedAPI.kotlinAPI.cms.CmsName, boolean, java.lang.String, java.lang.String, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getMemoNo() {
        return this.memoNo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NameCardItemView(String str, CmsName cmsName, boolean z, String str2, String str3, boolean z2, String str4) {
        super(cmsName, z, str2, str3, z2, str4);
        Intrinsics.checkNotNullParameter(cmsName, "cmsName");
        this.memoNo = str;
    }

    @Override // com.glority.android.cmsui.entity.namecard.BaseNameCardItem
    public int getRootViewId() {
        return R.id.ll_container;
    }

    @Override // com.glority.android.cms.base.BaseItem
    public int getLayoutId() {
        return R.layout.item_cms_name_card;
    }

    @Override // com.glority.android.cmsui.entity.namecard.BaseNameCardItem
    public void doRender(Context context, BaseViewHolder helper, ExtraData data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(data, "data");
        String str = AppContext.INSTANCE.getConfig("NAMECARD_DEFAULT_MEMO") + AppContext.INSTANCE.getConfig("NAMECARD_DEFAULT_MEMO_INDEX");
        CmsNameCardFactory cmsNameCardFactory = CmsNameCardFactory.INSTANCE;
        String str2 = this.memoNo;
        if (str2 == null) {
            str2 = "";
        }
        AbsCmsNameCardView absCmsNameCardView = cmsNameCardFactory.get(context, str2, str);
        if (absCmsNameCardView != null) {
            ((ViewGroup) helper.getView(R.id.ll_container)).removeAllViews();
            ((ViewGroup) helper.getView(R.id.ll_container)).addView(absCmsNameCardView, -1, -2);
            absCmsNameCardView.setData(converter(getCmsObject()), getCustomName(), getCustomNotes(), getEditEnable());
            absCmsNameCardView.setCmsNameCardClickListener(new AbsCmsNameCardView.CmsNameCardClickListener() { // from class: com.glority.android.cmsui.widget.NameCardItemView$doRender$1
                @Override // com.glority.android.namecard.base.AbsCmsNameCardView.CmsNameCardClickListener
                public void onClick(View view, AbsCmsNameCardView.ClickType clickType) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    Intrinsics.checkNotNullParameter(clickType, "clickType");
                    if (clickType == AbsCmsNameCardView.ClickType.EDIT) {
                        BaseItem.logEvent$default(NameCardItemView.this, CmsUILogEvents.NAME_CARD_EDIT, null, 2, null);
                        ClickListener<Object> editClick = NameCardItemView.this.getEditClick();
                        if (editClick != null) {
                            editClick.onClick(view, null);
                        }
                    }
                }
            });
        }
    }

    private final SimpleCmsObject converter(CmsName cmsName) {
        ArrayList arrayList;
        SimpleCmsObject simpleCmsObject = new SimpleCmsObject(cmsName.getUid(), taxonomyNameConverter(cmsName.getName()));
        TaxonomyName taxonomyParent = cmsName.getTaxonomyParent();
        simpleCmsObject.setTaxonomyParent(taxonomyParent != null ? taxonomyNameConverter(taxonomyParent) : null);
        TaxonomyName taxonomyFamilyParent = cmsName.getTaxonomyFamilyParent();
        simpleCmsObject.setTaxonomyFamilyParent(taxonomyFamilyParent != null ? taxonomyNameConverter(taxonomyFamilyParent) : null);
        List<TaxonomyName> taxonomies = cmsName.getTaxonomies();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(taxonomies, 10));
        Iterator<T> it = taxonomies.iterator();
        while (it.hasNext()) {
            arrayList2.add(taxonomyNameConverter((TaxonomyName) it.next()));
        }
        simpleCmsObject.setTaxonomies(arrayList2);
        List<SimpleCmsName> children = cmsName.getChildren();
        if (children == null) {
            arrayList = new ArrayList();
        } else {
            List<SimpleCmsName> list = children;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (SimpleCmsName simpleCmsName : list) {
                arrayList3.add(new PopularCultivarName(simpleCmsName.getPreferredName(), simpleCmsName.getLatinName()));
            }
            arrayList = arrayList3;
        }
        simpleCmsObject.setPopularCultivarNames(arrayList);
        return simpleCmsObject;
    }

    private final SimpleTaxonomyName taxonomyNameConverter(TaxonomyName name) {
        ArrayList arrayList;
        List<String> commonNames = name.getCommonNames();
        if (commonNames == null) {
            arrayList = new ArrayList();
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : commonNames) {
                if (!Intrinsics.areEqual((String) obj, name.getPreferredName())) {
                    arrayList2.add(obj);
                }
            }
            arrayList = arrayList2;
        }
        return new SimpleTaxonomyName(name.getPreferredName(), name.getLatinName(), SimpleTaxonomyType.valueOf(name.getType().name()), name.getTaxonomyTypeName(), arrayList);
    }
}

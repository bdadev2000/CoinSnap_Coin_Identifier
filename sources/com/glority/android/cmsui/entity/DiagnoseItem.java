package com.glority.android.cmsui.entity;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.cms.base.BaseItem;
import com.glority.android.cms.base.ExtraData;
import com.glority.android.cms.common.CmsMarkdown;
import com.glority.android.cms.listener.ClickListener;
import com.glority.android.cmsui.R;
import com.glority.android.cmsui.common.CmsUILogEvents;
import com.glority.android.cmsui.model.CmsDisease;
import com.glority.android.cmsui.model.DiagnoseDetect;
import com.glority.android.cmsui.model.DiagnoseDetectRegion;
import com.glority.android.cmsui.util.DiseaseCropTransformation;
import com.glority.android.core.ext.ViewExtensionsKt;
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

/* compiled from: DiagnoseItem.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 /2\u00020\u0001:\u0001/B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J3\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010 \u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\b\u0010#\u001a\u00020$H\u0016J\t\u0010%\u001a\u00020$HÖ\u0001J \u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0016J\t\u0010.\u001a\u00020\tHÖ\u0001R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u00060"}, d2 = {"Lcom/glority/android/cmsui/entity/DiagnoseItem;", "Lcom/glority/android/cms/base/BaseItem;", "diagnoseResult", "Lcom/glority/android/cmsui/model/CmsDisease;", "newStyle", "", "markdown", "Lio/noties/markwon/Markwon;", Args.pageName, "", "(Lcom/glority/android/cmsui/model/CmsDisease;ZLio/noties/markwon/Markwon;Ljava/lang/String;)V", "diagnoseClick", "Lcom/glority/android/cms/listener/ClickListener;", "getDiagnoseClick", "()Lcom/glority/android/cms/listener/ClickListener;", "setDiagnoseClick", "(Lcom/glority/android/cms/listener/ClickListener;)V", "getDiagnoseResult", "()Lcom/glority/android/cmsui/model/CmsDisease;", "setDiagnoseResult", "(Lcom/glority/android/cmsui/model/CmsDisease;)V", "getMarkdown", "()Lio/noties/markwon/Markwon;", "getNewStyle", "()Z", "getPageName", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "getLayoutId", "", "hashCode", "render", "", "context", "Landroid/content/Context;", "helper", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "data", "Lcom/glority/android/cms/base/ExtraData;", "toString", "Companion", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final /* data */ class DiagnoseItem extends BaseItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private ClickListener<CmsDisease> diagnoseClick;
    private CmsDisease diagnoseResult;
    private final Markwon markdown;
    private final boolean newStyle;
    private final String pageName;

    public static /* synthetic */ DiagnoseItem copy$default(DiagnoseItem diagnoseItem, CmsDisease cmsDisease, boolean z, Markwon markwon, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            cmsDisease = diagnoseItem.diagnoseResult;
        }
        if ((i & 2) != 0) {
            z = diagnoseItem.newStyle;
        }
        if ((i & 4) != 0) {
            markwon = diagnoseItem.markdown;
        }
        if ((i & 8) != 0) {
            str = diagnoseItem.pageName;
        }
        return diagnoseItem.copy(cmsDisease, z, markwon, str);
    }

    /* renamed from: component1, reason: from getter */
    public final CmsDisease getDiagnoseResult() {
        return this.diagnoseResult;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getNewStyle() {
        return this.newStyle;
    }

    /* renamed from: component3, reason: from getter */
    public final Markwon getMarkdown() {
        return this.markdown;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPageName() {
        return this.pageName;
    }

    public final DiagnoseItem copy(CmsDisease diagnoseResult, boolean newStyle, Markwon markdown, String pageName) {
        Intrinsics.checkNotNullParameter(diagnoseResult, "diagnoseResult");
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        return new DiagnoseItem(diagnoseResult, newStyle, markdown, pageName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DiagnoseItem)) {
            return false;
        }
        DiagnoseItem diagnoseItem = (DiagnoseItem) other;
        return Intrinsics.areEqual(this.diagnoseResult, diagnoseItem.diagnoseResult) && this.newStyle == diagnoseItem.newStyle && Intrinsics.areEqual(this.markdown, diagnoseItem.markdown) && Intrinsics.areEqual(this.pageName, diagnoseItem.pageName);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        CmsDisease cmsDisease = this.diagnoseResult;
        int hashCode = (cmsDisease != null ? cmsDisease.hashCode() : 0) * 31;
        boolean z = this.newStyle;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        Markwon markwon = this.markdown;
        int hashCode2 = (i2 + (markwon != null ? markwon.hashCode() : 0)) * 31;
        String str = this.pageName;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "DiagnoseItem(diagnoseResult=" + this.diagnoseResult + ", newStyle=" + this.newStyle + ", markdown=" + this.markdown + ", pageName=" + this.pageName + ")";
    }

    public final CmsDisease getDiagnoseResult() {
        return this.diagnoseResult;
    }

    public final boolean getNewStyle() {
        return this.newStyle;
    }

    public final void setDiagnoseResult(CmsDisease cmsDisease) {
        Intrinsics.checkNotNullParameter(cmsDisease, "<set-?>");
        this.diagnoseResult = cmsDisease;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnoseItem(CmsDisease diagnoseResult, boolean z, Markwon markwon, String pageName) {
        super(pageName);
        Intrinsics.checkNotNullParameter(diagnoseResult, "diagnoseResult");
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        this.diagnoseResult = diagnoseResult;
        this.newStyle = z;
        this.markdown = markwon;
        this.pageName = pageName;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ DiagnoseItem(com.glority.android.cmsui.model.CmsDisease r1, boolean r2, io.noties.markwon.Markwon r3, java.lang.String r4, int r5, kotlin.jvm.internal.DefaultConstructorMarker r6) {
        /*
            r0 = this;
            r6 = r5 & 2
            if (r6 == 0) goto L5
            r2 = 0
        L5:
            r6 = r5 & 4
            if (r6 == 0) goto Ld
            r3 = 0
            r6 = r3
            io.noties.markwon.Markwon r6 = (io.noties.markwon.Markwon) r6
        Ld:
            r5 = r5 & 8
            if (r5 == 0) goto L13
            java.lang.String r4 = ""
        L13:
            r0.<init>(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.cmsui.entity.DiagnoseItem.<init>(com.glority.android.cmsui.model.CmsDisease, boolean, io.noties.markwon.Markwon, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final Markwon getMarkdown() {
        return this.markdown;
    }

    public final String getPageName() {
        return this.pageName;
    }

    public final ClickListener<CmsDisease> getDiagnoseClick() {
        return this.diagnoseClick;
    }

    public final void setDiagnoseClick(ClickListener<CmsDisease> clickListener) {
        this.diagnoseClick = clickListener;
    }

    @Override // com.glority.android.cms.base.BaseItem
    public int getLayoutId() {
        return R.layout.item_cms_diagnose;
    }

    @Override // com.glority.android.cms.base.BaseItem
    public void render(Context context, BaseViewHolder helper, ExtraData data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(data, "data");
        boolean isH5Disease = INSTANCE.isH5Disease(this.diagnoseResult);
        helper.itemView.setBackgroundColor((int) (this.newStyle ? 4294967295L : 4294961625L));
        TextView textView = (TextView) helper.getView(R.id.tv_disease_title);
        TextView textView2 = (TextView) helper.getView(R.id.tv_disease_content);
        textView.setTextSize(0, ResUtils.getDimension(this.newStyle ? R.dimen.x32 : R.dimen.x40));
        textView2.setTextSize(0, ResUtils.getDimension(this.newStyle ? R.dimen.x28 : R.dimen.x32));
        if (isH5Disease) {
            textView.setText(this.diagnoseResult.getCommonName());
            CmsMarkdown.INSTANCE.setText(this.markdown, textView2, this.diagnoseResult.getSymptomSummary());
        } else {
            CmsMarkdown.INSTANCE.setText(this.markdown, textView2, this.diagnoseResult.getDesc());
        }
        ImageView imageView = (ImageView) helper.getView(R.id.iv_sick_image);
        DiagnoseDetect diagnoseDetect = this.diagnoseResult.getDiagnoseDetect();
        List<DiagnoseDetectRegion> regions = diagnoseDetect != null ? diagnoseDetect.getRegions() : null;
        if (regions != null && (!regions.isEmpty())) {
            imageView.setVisibility(0);
            List<DiagnoseDetectRegion> list = regions;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                List<Double> region = ((DiagnoseDetectRegion) it.next()).getRegion();
                arrayList.add(new RectF((float) region.get(1).doubleValue(), (float) region.get(0).doubleValue(), (float) region.get(3).doubleValue(), (float) region.get(2).doubleValue()));
            }
            Intrinsics.checkNotNullExpressionValue(Glide.with(imageView).load(this.diagnoseResult.getDiseaseImageUrl()).transform(new DiseaseCropTransformation(arrayList, ResUtils.getDimension(R.dimen.x16))).placeholder(R.drawable.common_background_banner).into(imageView), "Glide.with(ivImage)\n    …           .into(ivImage)");
        } else {
            imageView.setVisibility(8);
        }
        View view = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "helper.itemView");
        ViewExtensionsKt.setSingleClickListener$default(view, 0L, new Function1<View, Unit>() { // from class: com.glority.android.cmsui.entity.DiagnoseItem$render$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view2) {
                invoke2(view2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it2) {
                Intrinsics.checkNotNullParameter(it2, "it");
                BaseItem.logEvent$default(DiagnoseItem.this, CmsUILogEvents.BASE_DETAIL_DIAGNOSE_RESULT, null, 2, null);
                ClickListener<CmsDisease> diagnoseClick = DiagnoseItem.this.getDiagnoseClick();
                if (diagnoseClick != null) {
                    diagnoseClick.onClick(it2, DiagnoseItem.this.getDiagnoseResult());
                }
            }
        }, 1, (Object) null);
    }

    /* compiled from: DiagnoseItem.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/glority/android/cmsui/entity/DiagnoseItem$Companion;", "", "()V", "isH5Disease", "", CmsUILogEvents.CMS_DISEASE, "Lcom/glority/android/cmsui/model/CmsDisease;", "isSick", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isSick(CmsDisease disease) {
            Intrinsics.checkNotNullParameter(disease, "disease");
            if (isH5Disease(disease)) {
                return true;
            }
            String desc = disease.getDesc();
            return desc != null && desc.length() > 0 && (disease.getArticle().getTags().isEmpty() ^ true);
        }

        public final boolean isH5Disease(CmsDisease disease) {
            String symptomSummary;
            return ((disease != null ? disease.getCmsStaticUrl() : null) == null || (symptomSummary = disease.getSymptomSummary()) == null || symptomSummary.length() <= 0) ? false : true;
        }
    }
}

package com.glority.android.cmsui.entity;

import android.content.Context;
import android.view.View;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.cms.base.BaseItem;
import com.glority.android.cms.base.ExtraData;
import com.glority.android.cms.listener.ClickListener;
import com.glority.android.cmsui.R;
import com.glority.android.xx.constants.Args;
import com.glority.utils.app.ResUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlantCareItem.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J0\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\nHÖ\u0003J\b\u0010#\u001a\u00020\u0003H\u0016J\t\u0010$\u001a\u00020\u0003HÖ\u0001J \u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J\t\u0010-\u001a\u00020\u0006HÖ\u0001R$\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012¨\u0006."}, d2 = {"Lcom/glority/android/cmsui/entity/PlantCareItem;", "Lcom/glority/android/cms/base/BaseItem;", "waterFrequency", "", "fertilizeFrequency", Args.pageName, "", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "fertilizeClick", "Lcom/glority/android/cms/listener/ClickListener;", "", "getFertilizeClick", "()Lcom/glority/android/cms/listener/ClickListener;", "setFertilizeClick", "(Lcom/glority/android/cms/listener/ClickListener;)V", "getFertilizeFrequency", "()Ljava/lang/Integer;", "setFertilizeFrequency", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getPageName", "()Ljava/lang/String;", "waterClick", "getWaterClick", "setWaterClick", "getWaterFrequency", "setWaterFrequency", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/glority/android/cmsui/entity/PlantCareItem;", "equals", "", "other", "getLayoutId", "hashCode", "render", "", "context", "Landroid/content/Context;", "helper", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "data", "Lcom/glority/android/cms/base/ExtraData;", "toString", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final /* data */ class PlantCareItem extends BaseItem {
    private ClickListener<Object> fertilizeClick;
    private Integer fertilizeFrequency;
    private final String pageName;
    private ClickListener<Object> waterClick;
    private Integer waterFrequency;

    public static /* synthetic */ PlantCareItem copy$default(PlantCareItem plantCareItem, Integer num, Integer num2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = plantCareItem.waterFrequency;
        }
        if ((i & 2) != 0) {
            num2 = plantCareItem.fertilizeFrequency;
        }
        if ((i & 4) != 0) {
            str = plantCareItem.pageName;
        }
        return plantCareItem.copy(num, num2, str);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getWaterFrequency() {
        return this.waterFrequency;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getFertilizeFrequency() {
        return this.fertilizeFrequency;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPageName() {
        return this.pageName;
    }

    public final PlantCareItem copy(Integer waterFrequency, Integer fertilizeFrequency, String pageName) {
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        return new PlantCareItem(waterFrequency, fertilizeFrequency, pageName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlantCareItem)) {
            return false;
        }
        PlantCareItem plantCareItem = (PlantCareItem) other;
        return Intrinsics.areEqual(this.waterFrequency, plantCareItem.waterFrequency) && Intrinsics.areEqual(this.fertilizeFrequency, plantCareItem.fertilizeFrequency) && Intrinsics.areEqual(this.pageName, plantCareItem.pageName);
    }

    public int hashCode() {
        Integer num = this.waterFrequency;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.fertilizeFrequency;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str = this.pageName;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "PlantCareItem(waterFrequency=" + this.waterFrequency + ", fertilizeFrequency=" + this.fertilizeFrequency + ", pageName=" + this.pageName + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlantCareItem(Integer num, Integer num2, String pageName) {
        super(pageName);
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        this.waterFrequency = num;
        this.fertilizeFrequency = num2;
        this.pageName = pageName;
    }

    public /* synthetic */ PlantCareItem(Integer num, Integer num2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, num2, (i & 4) != 0 ? "" : str);
    }

    public final Integer getFertilizeFrequency() {
        return this.fertilizeFrequency;
    }

    public final String getPageName() {
        return this.pageName;
    }

    public final Integer getWaterFrequency() {
        return this.waterFrequency;
    }

    public final void setFertilizeFrequency(Integer num) {
        this.fertilizeFrequency = num;
    }

    public final void setWaterFrequency(Integer num) {
        this.waterFrequency = num;
    }

    public final ClickListener<Object> getWaterClick() {
        return this.waterClick;
    }

    public final void setWaterClick(ClickListener<Object> clickListener) {
        this.waterClick = clickListener;
    }

    public final ClickListener<Object> getFertilizeClick() {
        return this.fertilizeClick;
    }

    public final void setFertilizeClick(ClickListener<Object> clickListener) {
        this.fertilizeClick = clickListener;
    }

    @Override // com.glority.android.cms.base.BaseItem
    public int getLayoutId() {
        return R.layout.item_care_setting;
    }

    @Override // com.glority.android.cms.base.BaseItem
    public void render(Context context, BaseViewHolder helper, ExtraData data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(data, "data");
        if (this.waterFrequency == null || this.fertilizeFrequency == null) {
            return;
        }
        PlantCareItem$render$getFrequency$1 plantCareItem$render$getFrequency$1 = new Function1<Integer, String>() { // from class: com.glority.android.cmsui.entity.PlantCareItem$render$getFrequency$1
            @Override // kotlin.jvm.functions.Function1
            public final String invoke(Integer num) {
                if (num != null && num.intValue() == 0) {
                    String string = ResUtils.getString(R.string.text_none);
                    Intrinsics.checkNotNullExpressionValue(string, "ResUtils.getString(R.string.text_none)");
                    return string;
                }
                if (num != null && num.intValue() == 1) {
                    String string2 = ResUtils.getString(R.string.text_every_day);
                    Intrinsics.checkNotNullExpressionValue(string2, "ResUtils.getString(R.string.text_every_day)");
                    return string2;
                }
                String string3 = ResUtils.getString(R.string.text_every_x_days, num);
                Intrinsics.checkNotNullExpressionValue(string3, "ResUtils.getString(R.string.text_every_x_days, it)");
                return string3;
            }
        };
        helper.setText(R.id.tv_frequency_water, plantCareItem$render$getFrequency$1.invoke((PlantCareItem$render$getFrequency$1) this.waterFrequency)).setText(R.id.tv_frequency_fertilize, plantCareItem$render$getFrequency$1.invoke((PlantCareItem$render$getFrequency$1) this.fertilizeFrequency)).addOnClickListener(R.id.ll_water, R.id.ll_fertilize);
        helper.getView(R.id.ll_water).setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.cmsui.entity.PlantCareItem$render$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View it) {
                ClickListener<Object> waterClick = PlantCareItem.this.getWaterClick();
                if (waterClick != null) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    waterClick.onClick(it, null);
                }
            }
        });
        helper.getView(R.id.ll_fertilize).setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.cmsui.entity.PlantCareItem$render$2
            @Override // android.view.View.OnClickListener
            public final void onClick(View it) {
                ClickListener<Object> fertilizeClick = PlantCareItem.this.getFertilizeClick();
                if (fertilizeClick != null) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    fertilizeClick.onClick(it, null);
                }
            }
        });
    }
}

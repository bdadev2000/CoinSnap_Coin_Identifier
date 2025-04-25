package com.glority.android.core.route.guide;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* compiled from: SkuEnum.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/glority/android/core/route/guide/SkuEnum;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "YEAR_FREE_TRIAL_SKU", "YEAR_SKU", "MONTH_SKU", "WEEK_SKU", "YEAR_MASTER_SKU", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public enum SkuEnum {
    YEAR_FREE_TRIAL_SKU("yearFreeTrialSku"),
    YEAR_SKU("yearSku"),
    MONTH_SKU("monthSku"),
    WEEK_SKU("weekSku"),
    YEAR_MASTER_SKU("yearMasterSku");

    private final String value;

    SkuEnum(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}

package com.glority.android.picturexx.adapter;

import com.glority.android.adapterhelper.BaseMultiItemQuickAdapter;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.picturexx.business.R;
import com.glority.base.entity.BaseMultiEntity;
import com.picturecoin.generatedAPI.kotlinAPI.config.CountryInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChangeCurrencyAdapter.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\n\u000bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0014¨\u0006\f"}, d2 = {"Lcom/glority/android/picturexx/adapter/ChangeCurrencyAdapter;", "Lcom/glority/android/adapterhelper/BaseMultiItemQuickAdapter;", "Lcom/glority/base/entity/BaseMultiEntity;", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "<init>", "()V", "convert", "", "helper", "item", "LabelItem", "CurrencyItem", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class ChangeCurrencyAdapter extends BaseMultiItemQuickAdapter<BaseMultiEntity, BaseViewHolder> {
    public static final int $stable = 0;

    public ChangeCurrencyAdapter() {
        super(null);
        addItemType(1, R.layout.item_change_currency);
        addItemType(2, R.layout.item_change_currency_title);
    }

    /* compiled from: ChangeCurrencyAdapter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/glority/android/picturexx/adapter/ChangeCurrencyAdapter$LabelItem;", "", "name", "", "<init>", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes2.dex */
    public static final class LabelItem {
        public static final int $stable = 0;
        private final String name;

        public LabelItem(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
        }

        public final String getName() {
            return this.name;
        }
    }

    /* compiled from: ChangeCurrencyAdapter.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/glority/android/picturexx/adapter/ChangeCurrencyAdapter$CurrencyItem;", "", "selected", "", "countryInfo", "Lcom/picturecoin/generatedAPI/kotlinAPI/config/CountryInfo;", "<init>", "(ZLcom/picturecoin/generatedAPI/kotlinAPI/config/CountryInfo;)V", "getSelected", "()Z", "getCountryInfo", "()Lcom/picturecoin/generatedAPI/kotlinAPI/config/CountryInfo;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes2.dex */
    public static final class CurrencyItem {
        public static final int $stable = 8;
        private final CountryInfo countryInfo;
        private final boolean selected;

        public CurrencyItem(boolean z, CountryInfo countryInfo) {
            Intrinsics.checkNotNullParameter(countryInfo, "countryInfo");
            this.selected = z;
            this.countryInfo = countryInfo;
        }

        public final CountryInfo getCountryInfo() {
            return this.countryInfo;
        }

        public final boolean getSelected() {
            return this.selected;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.adapterhelper.BaseQuickAdapter
    public void convert(BaseViewHolder helper, BaseMultiEntity item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        Object item2 = item.getItem();
        if (item2 instanceof LabelItem) {
            helper.setText(R.id.name_tv, ((LabelItem) item2).getName());
            return;
        }
        if (item2 instanceof CurrencyItem) {
            CurrencyItem currencyItem = (CurrencyItem) item2;
            helper.setText(R.id.name_tv, currencyItem.getCountryInfo().getName() + "(" + currencyItem.getCountryInfo().getSymbol() + ")");
            helper.setVisible(R.id.check_iv, currencyItem.getSelected());
        }
    }
}

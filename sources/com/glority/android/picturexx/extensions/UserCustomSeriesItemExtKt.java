package com.glority.android.picturexx.extensions;

import com.glority.android.database.entities.UserCustomSeriesItem;
import com.glority.android.picturexx.utils.PriceUtils;
import com.picturecoin.generatedAPI.kotlinAPI.model.PriceValue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserCustomSeriesItemExt.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"getDisplayPrice", "", "Lcom/glority/android/database/entities/UserCustomSeriesItem;", "businessMod_release"}, k = 2, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class UserCustomSeriesItemExtKt {
    public static final String getDisplayPrice(UserCustomSeriesItem userCustomSeriesItem) {
        Intrinsics.checkNotNullParameter(userCustomSeriesItem, "<this>");
        if (userCustomSeriesItem.getTotalPrice() == null) {
            return null;
        }
        PriceValue totalPrice = userCustomSeriesItem.getTotalPrice();
        Intrinsics.checkNotNull(totalPrice);
        String symbol = totalPrice.getSymbol();
        PriceUtils priceUtils = PriceUtils.INSTANCE;
        PriceValue totalPrice2 = userCustomSeriesItem.getTotalPrice();
        Intrinsics.checkNotNull(totalPrice2);
        return symbol + priceUtils.formatPrice(totalPrice2.getValue());
    }
}

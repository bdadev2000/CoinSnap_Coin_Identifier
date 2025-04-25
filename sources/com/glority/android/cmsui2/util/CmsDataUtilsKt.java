package com.glority.android.cmsui2.util;

import com.picturecoin.generatedAPI.kotlinAPI.model.CountryInfo;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: CmsDataUtils.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"getFlag", "", "Lcom/picturecoin/generatedAPI/kotlinAPI/model/CountryInfo;", "cmsUI2_release"}, k = 2, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes14.dex */
public final class CmsDataUtilsKt {
    public static final String getFlag(CountryInfo countryInfo) {
        Intrinsics.checkNotNullParameter(countryInfo, "<this>");
        if (StringsKt.equals(countryInfo.getCountryCode(), "TW", true)) {
            return "";
        }
        String lowerCase = countryInfo.getCountryCode().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String format = String.format("https://cms-cache.coinidentifierai.com/static/flags/64-5/%s_64.png", Arrays.copyOf(new Object[]{lowerCase}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}

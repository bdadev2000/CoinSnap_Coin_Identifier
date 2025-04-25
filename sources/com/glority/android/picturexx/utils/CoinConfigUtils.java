package com.glority.android.picturexx.utils;

import com.glority.base.viewmodel.AppViewModel;
import kotlin.Metadata;

/* compiled from: CoinConfigUtils.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/glority/android/picturexx/utils/CoinConfigUtils;", "", "<init>", "()V", "getCountryCode", "", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CoinConfigUtils {
    public static final int $stable = 0;
    public static final CoinConfigUtils INSTANCE = new CoinConfigUtils();

    private CoinConfigUtils() {
    }

    public final String getCountryCode() {
        String settingCurrencyCountryCode = CoinSPUtils.INSTANCE.getSettingCurrencyCountryCode();
        return settingCurrencyCountryCode == null ? AppViewModel.INSTANCE.getInstance().getCountryCode() : settingCurrencyCountryCode;
    }
}

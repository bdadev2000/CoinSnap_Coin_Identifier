package com.glority.android.picturexx.utils;

import android.content.SharedPreferences;
import android.util.Log;
import com.glority.android.core.app.AppContext;
import com.glority.android.picturexx.GlobalLiveBus;
import com.glority.base.BaseApplication;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.utils.stability.LogUtils;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.picturecoin.generatedAPI.kotlinAPI.article.ExpertPick;
import com.picturecoin.generatedAPI.kotlinAPI.config.CountryInfo;
import java.util.Date;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CoinSPUtils.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0012J\u000e\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0005J\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0005J\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005J\u0014\u0010\u001b\u001a\u00020\r2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dJ\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dJ\u000e\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\"J\b\u0010#\u001a\u0004\u0018\u00010\"J\u000e\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u0012J\u0006\u0010&\u001a\u00020\u0012J\u000e\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\u000fJ\u0006\u0010)\u001a\u00020\u000fJ\u0014\u0010*\u001a\u00020\r2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,J\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,J\u000e\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u00020\u0005J\b\u00101\u001a\u0004\u0018\u00010\u0005J\u0010\u00102\u001a\u00020\r2\b\u00100\u001a\u0004\u0018\u00010\u0005J\b\u00103\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u00064"}, d2 = {"Lcom/glority/android/picturexx/utils/CoinSPUtils;", "", "<init>", "()V", "SP_NAME", "", "configSp", "Landroid/content/SharedPreferences;", "getConfigSp", "()Landroid/content/SharedPreferences;", "configSp$delegate", "Lkotlin/Lazy;", "saveThemeType", "", "themeType", "", "getThemeType", "themeTipsOpended", "", "setThemeTipsOpended", "opended", "setPriceSymbol", "symbol", "getPriceSymbol", "setPriceCurrencyCode", "currencyCode", "getPriceCurrencyCode", "setExpertPickList", "data", "", "Lcom/picturecoin/generatedAPI/kotlinAPI/article/ExpertPick;", "getExpertPickList", "setExpertPickListUpdateTime", "time", "Ljava/util/Date;", "getExpertPickListUpdateTime", "setExpertPicksScrolled", "scrolled", "getExpertPicksScrolled", "setHomeExposureCount", "count", "getHomeExposureCount", "setGetAllCountriesMessage", "countries", "", "Lcom/picturecoin/generatedAPI/kotlinAPI/config/CountryInfo;", "getGetAllCountriesMessage", "setSettingCurrencyCountryCode", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "getSettingCurrencyCountryCode", "setCatalogFilterCountry", "getCatalogFilterCountry", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CoinSPUtils {
    private static final String SP_NAME = "coin_config_sp";
    public static final CoinSPUtils INSTANCE = new CoinSPUtils();

    /* renamed from: configSp$delegate, reason: from kotlin metadata */
    private static final Lazy configSp = LazyKt.lazy(new Function0<SharedPreferences>() { // from class: com.glority.android.picturexx.utils.CoinSPUtils$configSp$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final SharedPreferences invoke() {
            return BaseApplication.getInstance().getApplicationContext().getSharedPreferences("coin_config_sp", 0);
        }
    });
    public static final int $stable = 8;

    public final int getThemeType() {
        return 1;
    }

    private CoinSPUtils() {
    }

    private final SharedPreferences getConfigSp() {
        Object value = configSp.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (SharedPreferences) value;
    }

    public final void saveThemeType(int themeType) {
        getConfigSp().edit().putInt("theme_type", themeType).apply();
    }

    public final boolean themeTipsOpended() {
        return getConfigSp().getBoolean("theme_tips_opended", false);
    }

    public final void setThemeTipsOpended(boolean opended) {
        getConfigSp().edit().putBoolean("theme_tips_opended", opended).apply();
    }

    public final void setPriceSymbol(String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        getConfigSp().edit().putString("price_symbol", symbol).apply();
    }

    public final String getPriceSymbol() {
        return getConfigSp().getString("price_symbol", null);
    }

    public final void setPriceCurrencyCode(String currencyCode) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        getConfigSp().edit().putString("price_currency_code", currencyCode).apply();
    }

    public final String getPriceCurrencyCode() {
        return getConfigSp().getString("price_currency_code", null);
    }

    public final void setExpertPickList(List<ExpertPick> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            INSTANCE.getConfigSp().edit().putString("expert_pick_list", new Gson().toJson(data)).apply();
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }

    public final List<ExpertPick> getExpertPickList() {
        try {
            return (List) new Gson().fromJson(INSTANCE.getConfigSp().getString("expert_pick_list", null), new TypeToken<List<? extends ExpertPick>>() { // from class: com.glority.android.picturexx.utils.CoinSPUtils$getExpertPickList$1$1
            }.getType());
        } catch (Exception e) {
            if (!AppContext.INSTANCE.isDebugMode()) {
                return null;
            }
            LogUtils.e(Log.getStackTraceString(e));
            return null;
        }
    }

    public final void setExpertPickListUpdateTime(Date time) {
        Intrinsics.checkNotNullParameter(time, "time");
        getConfigSp().edit().putLong("expert_pick_list_update_time", time.getTime()).apply();
    }

    public final Date getExpertPickListUpdateTime() {
        long j = getConfigSp().getLong("expert_pick_list_update_time", 0L);
        if (j == 0) {
            return null;
        }
        return new Date(j);
    }

    public final void setExpertPicksScrolled(boolean scrolled) {
        getConfigSp().edit().putBoolean("expert_picks_scrolled", scrolled).apply();
    }

    public final boolean getExpertPicksScrolled() {
        return getConfigSp().getBoolean("expert_picks_scrolled", false);
    }

    public final void setHomeExposureCount(int count) {
        getConfigSp().edit().putInt("home_exposure_count", count).apply();
    }

    public final int getHomeExposureCount() {
        return getConfigSp().getInt("home_exposure_count", 0);
    }

    public final void setGetAllCountriesMessage(List<CountryInfo> countries) {
        Intrinsics.checkNotNullParameter(countries, "countries");
        try {
            INSTANCE.getConfigSp().edit().putString("get_all_countries_message", new Gson().toJson(countries)).apply();
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }

    public final List<CountryInfo> getGetAllCountriesMessage() {
        try {
            return (List) new Gson().fromJson(INSTANCE.getConfigSp().getString("get_all_countries_message", null), new TypeToken<List<CountryInfo>>() { // from class: com.glority.android.picturexx.utils.CoinSPUtils$getGetAllCountriesMessage$1$1
            }.getType());
        } catch (Exception e) {
            if (!AppContext.INSTANCE.isDebugMode()) {
                return null;
            }
            LogUtils.e(Log.getStackTraceString(e));
            return null;
        }
    }

    public final void setSettingCurrencyCountryCode(String countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        getConfigSp().edit().putString("CurrencyCountryCode", countryCode).apply();
        GlobalLiveBus.INSTANCE.getCurrencyChangedLiveData().setValue(true);
    }

    public final String getSettingCurrencyCountryCode() {
        return getConfigSp().getString("CurrencyCountryCode", null);
    }

    public final void setCatalogFilterCountry(String countryCode) {
        getConfigSp().edit().putString("CatalogFilterCountry", countryCode).apply();
    }

    public final String getCatalogFilterCountry() {
        return getConfigSp().getString("CatalogFilterCountry", AppViewModel.INSTANCE.getInstance().getCountryCode());
    }
}

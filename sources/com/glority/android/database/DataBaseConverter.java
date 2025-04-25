package com.glority.android.database;

import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.glority.android.core.app.AppContext;
import com.glority.component.generatedAPI.kotlinAPI.item.ItemImage;
import com.glority.utils.stability.LogUtils;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.picturecoin.generatedAPI.kotlinAPI.model.CoinTag;
import com.picturecoin.generatedAPI.kotlinAPI.model.CountryInfo;
import com.picturecoin.generatedAPI.kotlinAPI.model.PriceValue;
import com.picturecoin.generatedAPI.kotlinAPI.series.RecommendSeriesDetail;
import com.picturecoin.generatedAPI.kotlinAPI.series.UserSeriesDetail;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: DataBaseConverter.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007J\u0019\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0002\u0010\u000fJ\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012H\u0007J\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0007J\u0018\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u0005H\u0007J\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00190\u0012H\u0007J\u0018\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u0007J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u0017\u001a\u00020\u0005H\u0007J\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u0007J\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u001dH\u0007J\u0014\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u0007J\u0014\u0010\"\u001a\u0004\u0018\u00010\u00052\b\u0010#\u001a\u0004\u0018\u00010!H\u0007J\u001a\u0010$\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u0007J\u001a\u0010&\u001a\u0004\u0018\u00010\u00052\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u0014H\u0007J\u001a\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u0007J\u001a\u0010)\u001a\u0004\u0018\u00010\u00052\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0014H\u0007¨\u0006+"}, d2 = {"Lcom/glority/android/database/DataBaseConverter;", "", "<init>", "()V", "fromItemImageToString", "", "value", "Lcom/glority/component/generatedAPI/kotlinAPI/item/ItemImage;", "fromStringToItemImage", "longToDate", "Ljava/util/Date;", "", "(Ljava/lang/Long;)Ljava/util/Date;", "dateToLong", "date", "(Ljava/util/Date;)Ljava/lang/Long;", "listStringToString", "list", "", "listRecommendSeriesDetailToString", "", "Lcom/picturecoin/generatedAPI/kotlinAPI/series/RecommendSeriesDetail;", "stringToListRecommendSeriesDetail", TypedValues.Custom.S_STRING, "listUserSeriesDetailToString", "Lcom/picturecoin/generatedAPI/kotlinAPI/series/UserSeriesDetail;", "stringToListUserSeriesDetail", "stringToListString", "stringToPrice", "Lcom/picturecoin/generatedAPI/kotlinAPI/model/PriceValue;", "priceToString", "price", "stringToCountry", "Lcom/picturecoin/generatedAPI/kotlinAPI/model/CountryInfo;", "countryToString", "countryInfo", "stringToCoinTagList", "Lcom/picturecoin/generatedAPI/kotlinAPI/model/CoinTag;", "coinTagListToString", "coinTagList", "stringToStringMutableList", "stringMutableListToString", "stringList", "database_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes7.dex */
public final class DataBaseConverter {
    public final String fromItemImageToString(ItemImage value) {
        Intrinsics.checkNotNullParameter(value, "value");
        String jSONObject = new JSONObject(value.getJsonMap()).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        return jSONObject;
    }

    public final ItemImage fromStringToItemImage(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new ItemImage(new JSONObject(value));
    }

    public final Date longToDate(Long value) {
        if (value == null) {
            return null;
        }
        return new Date(value.longValue());
    }

    public final Long dateToLong(Date date) {
        if (date != null) {
            return Long.valueOf(date.getTime());
        }
        return null;
    }

    public final String listStringToString(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        return new Gson().toJson(list);
    }

    public final String listRecommendSeriesDetailToString(List<RecommendSeriesDetail> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        try {
            return new Gson().toJson(list);
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
            return null;
        }
    }

    public final List<RecommendSeriesDetail> stringToListRecommendSeriesDetail(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        try {
            return (List) new GsonBuilder().setExclusionStrategies(new ExclusionStrategy() { // from class: com.glority.android.database.DataBaseConverter$stringToListRecommendSeriesDetail$builder$1
                @Override // com.google.gson.ExclusionStrategy
                public boolean shouldSkipClass(Class<?> clazz) {
                    return false;
                }

                @Override // com.google.gson.ExclusionStrategy
                public boolean shouldSkipField(FieldAttributes f) {
                    if (Intrinsics.areEqual(f != null ? f.getName() : null, "_created_at")) {
                        return true;
                    }
                    return Intrinsics.areEqual(f != null ? f.getName() : null, "_response_at");
                }
            }).create().fromJson(string, new TypeToken<List<RecommendSeriesDetail>>() { // from class: com.glority.android.database.DataBaseConverter$stringToListRecommendSeriesDetail$1
            }.getType());
        } catch (Throwable unused) {
            return new ArrayList();
        }
    }

    public final String listUserSeriesDetailToString(List<UserSeriesDetail> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        try {
            return new Gson().toJson(list);
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
            return null;
        }
    }

    public final List<UserSeriesDetail> stringToListUserSeriesDetail(String string) {
        List<UserSeriesDetail> list;
        String str = string;
        if (str == null || str.length() == 0) {
            return CollectionsKt.emptyList();
        }
        try {
            list = (List) new Gson().fromJson(string, new TypeToken<List<? extends UserSeriesDetail>>() { // from class: com.glority.android.database.DataBaseConverter$stringToListUserSeriesDetail$1$1
            }.getType());
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
            list = null;
        }
        return list == null ? CollectionsKt.emptyList() : list;
    }

    public final List<String> stringToListString(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        Object fromJson = new Gson().fromJson(string, new TypeToken<List<? extends String>>() { // from class: com.glority.android.database.DataBaseConverter$stringToListString$1
        }.getType());
        Intrinsics.checkNotNullExpressionValue(fromJson, "fromJson(...)");
        return (List) fromJson;
    }

    public final PriceValue stringToPrice(String string) {
        if (string == null) {
            return null;
        }
        try {
            return (PriceValue) new Gson().fromJson(string, PriceValue.class);
        } catch (Exception e) {
            if (!AppContext.INSTANCE.isDebugMode()) {
                return null;
            }
            LogUtils.e(Log.getStackTraceString(e));
            return null;
        }
    }

    public final String priceToString(PriceValue price) {
        if (price == null) {
            return null;
        }
        try {
            return new Gson().toJson(price);
        } catch (Exception e) {
            if (!AppContext.INSTANCE.isDebugMode()) {
                return null;
            }
            LogUtils.e(Log.getStackTraceString(e));
            return null;
        }
    }

    public final CountryInfo stringToCountry(String string) {
        if (string == null) {
            return null;
        }
        try {
            return (CountryInfo) new Gson().fromJson(string, CountryInfo.class);
        } catch (Exception e) {
            if (!AppContext.INSTANCE.isDebugMode()) {
                return null;
            }
            LogUtils.e(Log.getStackTraceString(e));
            return null;
        }
    }

    public final String countryToString(CountryInfo countryInfo) {
        if (countryInfo == null) {
            return null;
        }
        try {
            return new Gson().toJson(countryInfo);
        } catch (Exception e) {
            if (!AppContext.INSTANCE.isDebugMode()) {
                return null;
            }
            LogUtils.e(Log.getStackTraceString(e));
            return null;
        }
    }

    public final List<CoinTag> stringToCoinTagList(String string) {
        String str = string;
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            return (List) new Gson().fromJson(string, new TypeToken<List<CoinTag>>() { // from class: com.glority.android.database.DataBaseConverter$stringToCoinTagList$1$1
            }.getType());
        } catch (Exception e) {
            if (!AppContext.INSTANCE.isDebugMode()) {
                return null;
            }
            LogUtils.e(Log.getStackTraceString(e));
            return null;
        }
    }

    public final String coinTagListToString(List<CoinTag> coinTagList) {
        List<CoinTag> list = coinTagList;
        if (list == null || list.isEmpty()) {
            return null;
        }
        try {
            return new Gson().toJson(coinTagList);
        } catch (Exception e) {
            if (!AppContext.INSTANCE.isDebugMode()) {
                return null;
            }
            LogUtils.e(Log.getStackTraceString(e));
            return null;
        }
    }

    public final List<String> stringToStringMutableList(String string) {
        String str = string;
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            return (List) new Gson().fromJson(string, new TypeToken<List<String>>() { // from class: com.glority.android.database.DataBaseConverter$stringToStringMutableList$1$1
            }.getType());
        } catch (Exception e) {
            if (!AppContext.INSTANCE.isDebugMode()) {
                return null;
            }
            LogUtils.e(Log.getStackTraceString(e));
            return null;
        }
    }

    public final String stringMutableListToString(List<String> stringList) {
        List<String> list = stringList;
        if (list == null || list.isEmpty()) {
            return null;
        }
        try {
            return new Gson().toJson(stringList);
        } catch (Exception e) {
            if (!AppContext.INSTANCE.isDebugMode()) {
                return null;
            }
            LogUtils.e(Log.getStackTraceString(e));
            return null;
        }
    }
}

package com.glority.base.abtest;

import com.glority.abtest.utils.AbtestUtils;
import com.glority.abtesting.generatedAPI.kotlinAPI.config.AbtestingVariable;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.core.utils.data.PersistData;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.component.generatedAPI.kotlinAPI.enums.LanguageCode;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: CoinAbTestUtils.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0018\u001a\u00020\u0016J\u0006\u0010\u0019\u001a\u00020\u0007J\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005J\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005J\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\u001d\u001a\u00020\u0016J\u0006\u0010\u001e\u001a\u00020\u0016J\u0006\u0010\u001f\u001a\u00020\u0005J\u0006\u0010 \u001a\u00020\u0005J\u0006\u0010!\u001a\u00020\u0016J\u0006\u0010\"\u001a\u00020\u0007J\u0006\u0010#\u001a\u00020\u0007J\u0006\u0010$\u001a\u00020\u0007J\u0006\u0010%\u001a\u00020\u0007J\u0006\u0010&\u001a\u00020\u0007J+\u0010+\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010)j\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u0001`(¢\u0006\u0002\u0010,J\u0006\u0010.\u001a\u00020\u0007J\u0010\u0010.\u001a\u00020\u00072\b\b\u0002\u0010/\u001a\u00020\u0005J\u0006\u00100\u001a\u00020\u0007J\u0006\u00101\u001a\u00020\u0007J\u0006\u00102\u001a\u00020\u0007J\u0006\u00103\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0086T¢\u0006\u0002\n\u0000R0\u0010'\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010)j\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u0001`(X\u0082\u000e¢\u0006\u0004\n\u0002\u0010*R\u000e\u0010-\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/glority/base/abtest/CoinAbTestUtils;", "", "<init>", "()V", "KEY_ENABLE_H5_V4", "", "value", "", "enableH5V4Recorded", "getEnableH5V4Recorded", "()Z", "setEnableH5V4Recorded", "(Z)V", "priceABGroup", "engineABGroup", CoinAbTestUtils.onetime_chatbot_ab, CoinAbTestUtils.onetime_collectionpay_ab, CoinAbTestUtils.appconfig_notesnap_offer, "priceVariableData", "engineVariableData", "priceVariable", "value_onetime_chatbot_ab", "", "value_new_home", "getCollectionPayCount", "enableChatbot", "getPriceABVariableData", "getEngineABVariableData", "getH5PriceABVariable", "surveyNoVip", "surveyVip", "surveyVipUrl", "surveyNOVipUrl", "reviewValue", "enableBankNoteOffer", "enableDarkMode", "enableNewMainImageHeader", "enableValueChecker", "visibleHomeGrade", "engineHashMap", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "Ljava/util/HashMap;", "getEngineAbMap", "()Ljava/util/HashMap;", "KEY_LAYER_IDENTIFY_RESULT_NEW", "enableV4H5", "from", "enableCoinGradingReport", "enablePriceIncreaseExperiment", "enablePriceIncreaseExperimentUSA", "enableCoinDistributionMap", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class CoinAbTestUtils {
    private static final String KEY_ENABLE_H5_V4 = "key_enable_h5_v4";
    private static final String KEY_LAYER_IDENTIFY_RESULT_NEW = "layer_identify_result_new";
    public static final String appconfig_notesnap_offer = "appconfig_notesnap_offer";
    private static final String engineABGroup = "engine-abtesting-coin-categorywithsimilar-global";
    private static HashMap<String, String> engineHashMap = null;
    private static String engineVariableData = null;
    public static final String onetime_chatbot_ab = "onetime_chatbot_ab";
    public static final String onetime_collectionpay_ab = "onetime_collectionpay_ab";
    private static final String priceABGroup = "coin_price_version";
    private static String priceVariable = null;
    private static String priceVariableData = null;
    public static final int value_new_home = 110264;
    public static final int value_onetime_chatbot_ab = 110219;
    public static final CoinAbTestUtils INSTANCE = new CoinAbTestUtils();
    public static final int $stable = 8;

    private CoinAbTestUtils() {
    }

    private final boolean getEnableH5V4Recorded() {
        return ((Boolean) PersistData.INSTANCE.get(KEY_ENABLE_H5_V4, false)).booleanValue();
    }

    private final void setEnableH5V4Recorded(boolean z) {
        PersistData.INSTANCE.set(KEY_ENABLE_H5_V4, Boolean.valueOf(z));
    }

    public final int getCollectionPayCount() {
        String variableData;
        AbtestingVariable abtestingVariable$default = AbtestUtils.getAbtestingVariable$default(AbtestUtils.INSTANCE, onetime_collectionpay_ab, 0, null, null, 14, null);
        Integer num = null;
        if (!Intrinsics.areEqual(abtestingVariable$default != null ? abtestingVariable$default.getVariable() : null, "110322")) {
            return Integer.MAX_VALUE;
        }
        AbtestingVariable abtestingVariable$default2 = AbtestUtils.getAbtestingVariable$default(AbtestUtils.INSTANCE, onetime_collectionpay_ab, 0, null, null, 14, null);
        if (abtestingVariable$default2 != null && (variableData = abtestingVariable$default2.getVariableData()) != null) {
            num = StringsKt.toIntOrNull(variableData);
        }
        if (num != null) {
            return num.intValue();
        }
        return 20;
    }

    public final boolean enableChatbot() {
        String variable;
        AbtestingVariable abtestingVariable$default = AbtestUtils.getAbtestingVariable$default(AbtestUtils.INSTANCE, onetime_chatbot_ab, 0, null, null, 14, null);
        Integer intOrNull = (abtestingVariable$default == null || (variable = abtestingVariable$default.getVariable()) == null) ? null : StringsKt.toIntOrNull(variable);
        return intOrNull == null || intOrNull.intValue() == 110219;
    }

    public final String getPriceABVariableData() {
        if (priceVariableData == null) {
            AbtestingVariable abtestingVariable$default = AbtestUtils.getAbtestingVariable$default(AbtestUtils.INSTANCE, priceABGroup, 0, null, null, 14, null);
            priceVariableData = abtestingVariable$default != null ? abtestingVariable$default.getVariableData() : null;
        }
        return priceVariableData;
    }

    public final String getEngineABVariableData() {
        if (engineVariableData == null) {
            AbtestingVariable abtestingVariable$default = AbtestUtils.getAbtestingVariable$default(AbtestUtils.INSTANCE, engineABGroup, 0, null, null, 14, null);
            engineVariableData = abtestingVariable$default != null ? abtestingVariable$default.getVariableData() : null;
        }
        return engineVariableData;
    }

    public final String getH5PriceABVariable() {
        if (priceVariable == null) {
            AbtestingVariable abtestingVariable$default = AbtestUtils.getAbtestingVariable$default(AbtestUtils.INSTANCE, "coin_name_h5_price_version", 0, null, null, 14, null);
            String variableData = abtestingVariable$default != null ? abtestingVariable$default.getVariableData() : null;
            priceVariable = variableData;
            if (variableData == null) {
                AbtestingVariable abtestingVariable$default2 = AbtestUtils.getAbtestingVariable$default(AbtestUtils.INSTANCE, "coin_name_h5_price_version", 0, null, null, 14, null);
                priceVariable = abtestingVariable$default2 != null ? abtestingVariable$default2.getVariable() : null;
            }
        }
        return priceVariable;
    }

    public final int surveyNoVip() {
        AbtestingVariable abtestingVariable$default = AbtestUtils.getAbtestingVariable$default(AbtestUtils.INSTANCE, "survey_questionnaire_rate", 0, null, null, 14, null);
        if (abtestingVariable$default == null) {
            return 0;
        }
        try {
            return Integer.parseInt(abtestingVariable$default.getVariable());
        } catch (Exception unused) {
            return 0;
        }
    }

    public final int surveyVip() {
        AbtestingVariable abtestingVariable$default = AbtestUtils.getAbtestingVariable$default(AbtestUtils.INSTANCE, "vip_survey_questionnaire_rate", 0, null, null, 14, null);
        if (abtestingVariable$default == null) {
            return 0;
        }
        try {
            return Integer.parseInt(abtestingVariable$default.getVariable());
        } catch (Exception unused) {
            return 0;
        }
    }

    public final String surveyVipUrl() {
        AbtestingVariable abtestingVariable$default = AbtestUtils.getAbtestingVariable$default(AbtestUtils.INSTANCE, "vip_survey_questionnaire_rate", 0, null, null, 14, null);
        if (abtestingVariable$default == null) {
            return "";
        }
        try {
            String variableData = abtestingVariable$default.getVariableData();
            Intrinsics.checkNotNull(variableData);
            return variableData.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public final String surveyNOVipUrl() {
        AbtestingVariable abtestingVariable$default = AbtestUtils.getAbtestingVariable$default(AbtestUtils.INSTANCE, "survey_questionnaire_rate", 0, null, null, 14, null);
        if (abtestingVariable$default == null) {
            return "";
        }
        try {
            String variableData = abtestingVariable$default.getVariableData();
            Intrinsics.checkNotNull(variableData);
            return variableData.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public final int reviewValue() {
        AbtestingVariable abtestingVariable$default = AbtestUtils.getAbtestingVariable$default(AbtestUtils.INSTANCE, "review_rate_key", 0, null, null, 14, null);
        if (abtestingVariable$default == null) {
            return 0;
        }
        try {
            return Integer.parseInt(abtestingVariable$default.getVariable());
        } catch (Exception unused) {
            return 0;
        }
    }

    public final boolean enableBankNoteOffer() {
        List listOf = CollectionsKt.listOf((Object[]) new String[]{"US", "GB", "AU", "CA", "UK"});
        if (AppViewModel.INSTANCE.getInstance().getLanguageCode() == LanguageCode.English && listOf.contains(AppViewModel.INSTANCE.getInstance().getCountryCode())) {
            AbtestingVariable abtestingVariable$default = AbtestUtils.getAbtestingVariable$default(AbtestUtils.INSTANCE, appconfig_notesnap_offer, 0, null, null, 14, null);
            if (Intrinsics.areEqual(abtestingVariable$default != null ? abtestingVariable$default.getVariableData() : null, "1")) {
                return true;
            }
        }
        return false;
    }

    public final boolean enableDarkMode() {
        AbtestingVariable abtestingVariable$default = AbtestUtils.getAbtestingVariable$default(AbtestUtils.INSTANCE, "onetime_darkmode_ab", 0, null, null, 14, null);
        return Intrinsics.areEqual(abtestingVariable$default != null ? abtestingVariable$default.getVariable() : null, "110453");
    }

    public final boolean enableNewMainImageHeader() {
        AbtestingVariable abtestingVariable$default = AbtestUtils.getAbtestingVariable$default(AbtestUtils.INSTANCE, KEY_LAYER_IDENTIFY_RESULT_NEW, 0, null, null, 14, null);
        return Intrinsics.areEqual(abtestingVariable$default != null ? abtestingVariable$default.getVariable() : null, "110420");
    }

    public final boolean enableValueChecker() {
        return AppViewModel.INSTANCE.getInstance().getLanguageCode() == LanguageCode.English;
    }

    public final boolean visibleHomeGrade() {
        return !Intrinsics.areEqual(AbtestUtils.getAbtestingVariable$default(AbtestUtils.INSTANCE, "onetime_nograding_ab", 0, null, null, 14, null) != null ? r0.getVariable() : null, "110650");
    }

    public final HashMap<String, String> getEngineAbMap() {
        if (engineHashMap != null && (!r0.isEmpty())) {
            return engineHashMap;
        }
        HashMap<String, String> allEngineAbMap = AbtestUtils.INSTANCE.getAllEngineAbMap("engine-abtesting-", true);
        engineHashMap = allEngineAbMap;
        return allEngineAbMap;
    }

    public final boolean enableV4H5() {
        return enableV4H5("identify");
    }

    public static /* synthetic */ boolean enableV4H5$default(CoinAbTestUtils coinAbTestUtils, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "identify";
        }
        return coinAbTestUtils.enableV4H5(str);
    }

    public final boolean enableV4H5(String from) {
        Intrinsics.checkNotNullParameter(from, "from");
        if (AppViewModel.INSTANCE.getInstance().getLanguageCode() == LanguageCode.English) {
            return true;
        }
        if (!getEnableH5V4Recorded()) {
            new LogEventRequest("h5v4_from_click", LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("from", from))).post();
            setEnableH5V4Recorded(true);
        }
        AbtestingVariable abtestingVariable$default = AbtestUtils.getAbtestingVariable$default(AbtestUtils.INSTANCE, KEY_LAYER_IDENTIFY_RESULT_NEW, 0, null, null, 14, null);
        String variable = abtestingVariable$default != null ? abtestingVariable$default.getVariable() : null;
        return Intrinsics.areEqual(variable, "110886") || Intrinsics.areEqual(variable, "110965");
    }

    public final boolean enableCoinGradingReport() {
        if (AppViewModel.INSTANCE.getInstance().getLanguageCode() != LanguageCode.English) {
            return false;
        }
        AbtestingVariable abtestingVariable$default = AbtestUtils.getAbtestingVariable$default(AbtestUtils.INSTANCE, "onetime_home_page_SCO-1184", 0, null, null, 14, null);
        return Intrinsics.areEqual(abtestingVariable$default != null ? abtestingVariable$default.getVariable() : null, "110964");
    }

    public final boolean enablePriceIncreaseExperiment() {
        AbtestingVariable abtestingVariable$default = AbtestUtils.getAbtestingVariable$default(AbtestUtils.INSTANCE, "onetime_price_ab", 0, null, null, 14, null);
        return Intrinsics.areEqual(abtestingVariable$default != null ? abtestingVariable$default.getVariable() : null, "110966");
    }

    public final boolean enablePriceIncreaseExperimentUSA() {
        AbtestingVariable abtestingVariable$default = AbtestUtils.getAbtestingVariable$default(AbtestUtils.INSTANCE, "onetime_price_ab", 0, null, null, 14, null);
        return Intrinsics.areEqual(abtestingVariable$default != null ? abtestingVariable$default.getVariable() : null, "110967");
    }

    public final boolean enableCoinDistributionMap() {
        AbtestingVariable abtestingVariable$default = AbtestUtils.getAbtestingVariable$default(AbtestUtils.INSTANCE, "layer_collection_page", 0, null, null, 14, null);
        return Intrinsics.areEqual(abtestingVariable$default != null ? abtestingVariable$default.getVariable() : null, "111017");
    }
}

package com.glority.base.utils;

import com.glority.abtest.utils.AbtestUtils;
import com.glority.abtesting.generatedAPI.kotlinAPI.config.AbtestingVariable;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.route.abtest.AbtestGetVariableRequest;
import com.glority.base.viewmodel.AppViewModel;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.RandomKt;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* compiled from: AbTestUtil.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0006\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0002J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0005J\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018J\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005J\r\u0010\u001f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010 J\u0010\u0010!\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001e¨\u0006\""}, d2 = {"Lcom/glority/base/utils/AbTestUtil;", "", "<init>", "()V", "tag_conversion_page", "", "PURCHASE_DETAIN_ANDROID", "COVERT_RETAIN_ANDROID", AbTestUtil.inappreview_rate, AbTestUtil.layer_camera_page, "abtestVariableMap", "Ljava/util/LinkedHashMap;", "Lcom/glority/abtesting/generatedAPI/kotlinAPI/config/AbtestingVariable;", "getABConfig", "key", "getConversionPageId", "", "getConversionPageGroup", "showInAppReviewData", "getShowInAppReviewData", "()Lcom/glority/abtesting/generatedAPI/kotlinAPI/config/AbtestingVariable;", "setShowInAppReviewData", "(Lcom/glority/abtesting/generatedAPI/kotlinAPI/config/AbtestingVariable;)V", "showInAppReview", "Lkotlin/Pair;", "", "", "cmsAbTesting", "getCmsH5VariableData", "cameraAb", "Ljava/lang/Integer;", "getCameraAb", "()Ljava/lang/Integer;", "getAbtestVariable", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class AbTestUtil {
    public static final String COVERT_RETAIN_ANDROID = "covert_retain_android";
    public static final String PURCHASE_DETAIN_ANDROID = "purchase_detain_android";
    private static Integer cameraAb = null;
    private static String cmsAbTesting = null;
    public static final String inappreview_rate = "inappreview_rate";
    public static final String layer_camera_page = "layer_camera_page";
    private static AbtestingVariable showInAppReviewData = null;
    public static final String tag_conversion_page = "conversion_page";
    public static final AbTestUtil INSTANCE = new AbTestUtil();
    private static final LinkedHashMap<String, AbtestingVariable> abtestVariableMap = new LinkedHashMap<>();
    public static final int $stable = 8;

    private AbTestUtil() {
    }

    private final AbtestingVariable getABConfig(String key) {
        return AbtestUtils.getAbtestingVariable$default(AbtestUtils.INSTANCE, key, 0, null, null, 14, null);
    }

    public final int getConversionPageId() {
        Integer result = new AbtestGetVariableRequest(tag_conversion_page).toResult();
        int parseInt = Integer.parseInt(AppContext.INSTANCE.getConfig("BUI_DEFAULT_MEMO") + AppContext.INSTANCE.getConfig("BUI_DEFAULT_MEMO_INDEX"));
        Integer intOrNull = StringsKt.toIntOrNull(AppContext.INSTANCE.getConfig("BUI_DEFAULT_MEMO_VIP_IN_HISTORY") + AppContext.INSTANCE.getConfig("BUI_DEFAULT_MEMO_VIP_IN_HISTORY_INDEX"));
        if (result != null) {
            return result.intValue();
        }
        return (!AppViewModel.INSTANCE.getInstance().isVipInHistory() || intOrNull == null) ? parseInt : intOrNull.intValue();
    }

    public final String getConversionPageGroup() {
        AbtestingVariable aBConfig = getABConfig(tag_conversion_page);
        if (aBConfig == null) {
            return "";
        }
        try {
            String variableData = aBConfig.getVariableData();
            return variableData == null ? "" : variableData;
        } catch (Exception unused) {
            return "";
        }
    }

    public final AbtestingVariable getShowInAppReviewData() {
        return showInAppReviewData;
    }

    public final void setShowInAppReviewData(AbtestingVariable abtestingVariable) {
        showInAppReviewData = abtestingVariable;
    }

    public final Pair<Boolean, Double> showInAppReview() {
        if (showInAppReviewData == null) {
            showInAppReviewData = getABConfig(inappreview_rate);
        }
        if (showInAppReviewData == null) {
            return new Pair<>(false, Double.valueOf(1.0d));
        }
        try {
            int nextInt = RandomKt.Random(System.currentTimeMillis()).nextInt(0, 100);
            AbtestingVariable abtestingVariable = showInAppReviewData;
            Intrinsics.checkNotNull(abtestingVariable);
            boolean z = nextInt <= Integer.parseInt(abtestingVariable.getVariable());
            AbtestingVariable abtestingVariable2 = showInAppReviewData;
            Intrinsics.checkNotNull(abtestingVariable2);
            String variableData = abtestingVariable2.getVariableData();
            if (variableData == null) {
                variableData = "";
            }
            return new Pair<>(Boolean.valueOf(z), Double.valueOf(new JSONObject(variableData).getDouble("engine_probability")));
        } catch (Throwable unused) {
            return new Pair<>(false, Double.valueOf(1.0d));
        }
    }

    public final String getCmsH5VariableData() {
        String str = cmsAbTesting;
        if (str != null) {
            return str;
        }
        AbtestingVariable abtestingVariable$default = AbtestUtils.getAbtestingVariable$default(AbtestUtils.INSTANCE, "cms-abtesting", 1, null, null, 12, null);
        if (abtestingVariable$default == null) {
            return null;
        }
        String variable = abtestingVariable$default.getVariable();
        cmsAbTesting = variable;
        return variable;
    }

    public final Integer getCameraAb() {
        Integer num = cameraAb;
        if (num != null) {
            return num;
        }
        Integer result = new AbtestGetVariableRequest(layer_camera_page).toResult();
        if (result == null) {
            return null;
        }
        Integer valueOf = Integer.valueOf(result.intValue());
        cameraAb = valueOf;
        return valueOf;
    }

    public final AbtestingVariable getAbtestVariable(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        LinkedHashMap<String, AbtestingVariable> linkedHashMap = abtestVariableMap;
        if (linkedHashMap.containsKey(key)) {
            return linkedHashMap.get(key);
        }
        AbtestingVariable abtestingVariable = AbtestUtils.INSTANCE.getAbtestingVariable(key, 1, "", "");
        if (abtestingVariable != null) {
            linkedHashMap.put(key, abtestingVariable);
        }
        return abtestingVariable;
    }
}

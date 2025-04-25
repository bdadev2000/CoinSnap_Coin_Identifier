package com.glority.abtest.utils;

import com.glority.android.core.route.abtest.AbtestGetTagMapRequest;
import com.glority.android.core.utils.data.PersistData;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AbTestTagManage.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004J\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0011J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000RL\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00072\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00078B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/glority/abtest/utils/AbTestTagManage;", "", "()V", "AB_USED_FEATURES", "", "value", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "abUsedFeatures", "getAbUsedFeatures", "()Ljava/util/ArrayList;", "setAbUsedFeatures", "(Ljava/util/ArrayList;)V", "addUsedFeature", "", "feature", "getABTagMap", "", "isUsedFeature", "", "base-abtest_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes7.dex */
public final class AbTestTagManage {
    private static final String AB_USED_FEATURES = "ab_used_features";
    public static final AbTestTagManage INSTANCE = new AbTestTagManage();

    private AbTestTagManage() {
    }

    public final Map<String, Object> getABTagMap() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(new AbtestGetTagMapRequest().toResult());
        ArrayList<String> abUsedFeatures = getAbUsedFeatures();
        if (abUsedFeatures != null) {
            hashMap.put(AB_USED_FEATURES, abUsedFeatures);
        }
        return hashMap;
    }

    private final ArrayList<String> getAbUsedFeatures() {
        return new Function0<ArrayList<String>>() { // from class: com.glority.abtest.utils.AbTestTagManage$abUsedFeatures$1
            @Override // kotlin.jvm.functions.Function0
            public final ArrayList<String> invoke() {
                String str = (String) PersistData.INSTANCE.get("ab_used_features", "");
                if (str.length() == 0) {
                    return new ArrayList<>();
                }
                try {
                    String[] abUsed = (String[]) new Gson().fromJson(str, String[].class);
                    Intrinsics.checkNotNullExpressionValue(abUsed, "abUsed");
                    return (ArrayList) ArraysKt.toCollection(abUsed, new ArrayList());
                } catch (Exception unused) {
                    return new ArrayList<>();
                }
            }
        }.invoke();
    }

    private final void setAbUsedFeatures(ArrayList<String> arrayList) {
        if (arrayList != null) {
            PersistData.INSTANCE.set(AB_USED_FEATURES, new Gson().toJson(arrayList));
        }
    }

    public final boolean isUsedFeature(String feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        ArrayList<String> abUsedFeatures = getAbUsedFeatures();
        if (abUsedFeatures != null) {
            return abUsedFeatures.contains(feature);
        }
        return false;
    }

    public final synchronized void addUsedFeature(String feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        ArrayList<String> abUsedFeatures = getAbUsedFeatures();
        if (abUsedFeatures == null || !abUsedFeatures.contains(feature)) {
            if (abUsedFeatures != null) {
                abUsedFeatures.add(feature);
            }
            if (abUsedFeatures != null) {
                INSTANCE.setAbUsedFeatures(abUsedFeatures);
            }
        }
    }
}

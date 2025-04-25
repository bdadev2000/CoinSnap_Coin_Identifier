package com.glority.analysis.utils;

import android.os.Bundle;
import com.glority.android.core.app.AppContext;
import com.glority.trackingconfig.generatedAPI.kotlinAPI.trackingconfig.EventConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: AnalysisUtils.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\u0013\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0014j\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u0001`\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/glority/analysis/utils/AnalysisUtils;", "", "()V", "SDK_VERSION", "", "getSDK_VERSION", "()Ljava/lang/String;", "SDK_VERSION$delegate", "Lkotlin/Lazy;", "backListEvents", "", "getBackListEvents", "()Ljava/util/List;", "setBackListEvents", "(Ljava/util/List;)V", "eventsConfig", "Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/trackingconfig/EventConfig;", "getEventsConfig", "setEventsConfig", "bundle2Map", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "bundle", "Landroid/os/Bundle;", "base-analysis_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes7.dex */
public final class AnalysisUtils {
    public static final AnalysisUtils INSTANCE = new AnalysisUtils();

    /* renamed from: SDK_VERSION$delegate, reason: from kotlin metadata */
    private static final Lazy SDK_VERSION = LazyKt.lazy(new Function0<String>() { // from class: com.glority.analysis.utils.AnalysisUtils$SDK_VERSION$2
        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "android-analytics-" + AppContext.INSTANCE.getConfig("ANALYSIS_SDK_VERSION");
        }
    });
    private static List<String> backListEvents;
    private static List<EventConfig> eventsConfig;

    public final String getSDK_VERSION() {
        return (String) SDK_VERSION.getValue();
    }

    private AnalysisUtils() {
    }

    public final List<EventConfig> getEventsConfig() {
        return eventsConfig;
    }

    public final void setEventsConfig(List<EventConfig> list) {
        eventsConfig = list;
    }

    public final List<String> getBackListEvents() {
        return backListEvents;
    }

    public final void setBackListEvents(List<String> list) {
        backListEvents = list;
    }

    public final HashMap<String, Object> bundle2Map(Bundle bundle) {
        Set<String> keySet;
        HashMap<String, Object> hashMap = new HashMap<>();
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            for (String str : keySet) {
                hashMap.put(str, bundle.get(str));
            }
        }
        return hashMap;
    }
}

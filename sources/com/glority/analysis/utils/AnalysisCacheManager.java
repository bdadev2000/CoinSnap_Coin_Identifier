package com.glority.analysis.utils;

import android.content.SharedPreferences;
import com.glority.analysis.handler.PersistKey;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.route.analysis.SendErrorEventRequest;
import com.glority.android.core.route.utils.PersistDataReadRequest;
import com.glority.android.core.route.utils.PersistDataWriteRequest;
import com.glority.trackingconfig.generatedAPI.kotlinAPI.trackingconfig.EventConfig;
import com.glority.utils.stability.LogUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnalysisCacheManager.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\rH\u0007J\u0016\u0010%\u001a\u00020&2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00190\rH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R0\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u001a\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u0015\"\u0004\b\u001c\u0010\u0017R#\u0010\u001d\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010!¨\u0006("}, d2 = {"Lcom/glority/analysis/utils/AnalysisCacheManager;", "", "()V", "BATCH_LIMIT_NUM", "", "INTERVAL_NUM", "KEY_BACK_LIST", "", "KEY_BATCH_LIMIT", "KEY_EVENT_CONFIG", "KEY_INTERVAL", "SP_NAME", "value", "", "backList", "getBackList", "()Ljava/util/List;", "setBackList", "(Ljava/util/List;)V", "batchLimit", "getBatchLimit", "()I", "setBatchLimit", "(I)V", "eventConfigMemoryCache", "Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/trackingconfig/EventConfig;", AnalysisCacheManager.KEY_INTERVAL, "getInterval", "setInterval", "sp", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "getSp", "()Landroid/content/SharedPreferences;", "sp$delegate", "Lkotlin/Lazy;", "getEventConfig", "saveEventConfig", "", "configs", "base-analysis_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes7.dex */
public final class AnalysisCacheManager {
    private static final int BATCH_LIMIT_NUM = 5;
    private static final int INTERVAL_NUM = 10;
    private static final String KEY_BACK_LIST = "back_list";
    private static final String KEY_BATCH_LIMIT = "batch_limit";
    private static final String KEY_EVENT_CONFIG = "event_config";
    private static final String KEY_INTERVAL = "interval";
    private static final String SP_NAME = "base_analysis_cache";
    private static List<EventConfig> eventConfigMemoryCache;
    public static final AnalysisCacheManager INSTANCE = new AnalysisCacheManager();

    /* renamed from: sp$delegate, reason: from kotlin metadata */
    private static final Lazy sp = LazyKt.lazy(new Function0<SharedPreferences>() { // from class: com.glority.analysis.utils.AnalysisCacheManager$sp$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final SharedPreferences invoke() {
            return AppContext.INSTANCE.peekContext().getSharedPreferences("base_analysis_cache", 0);
        }
    });

    private final SharedPreferences getSp() {
        return (SharedPreferences) sp.getValue();
    }

    private AnalysisCacheManager() {
    }

    public final int getInterval() {
        return getSp().getInt(KEY_INTERVAL, 10);
    }

    public final void setInterval(int i) {
        getSp().edit().putInt(KEY_INTERVAL, i).apply();
    }

    public final int getBatchLimit() {
        int i = getSp().getInt(KEY_BATCH_LIMIT, 5);
        if (i < 1) {
            return 5;
        }
        return i;
    }

    public final void setBatchLimit(int i) {
        getSp().edit().putInt(KEY_BATCH_LIMIT, i).apply();
    }

    public final List<String> getBackList() {
        List<String> list;
        Set<String> stringSet = getSp().getStringSet(KEY_BACK_LIST, SetsKt.emptySet());
        return (stringSet == null || (list = CollectionsKt.toList(stringSet)) == null) ? CollectionsKt.emptyList() : list;
    }

    public final void setBackList(List<String> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        getSp().edit().putStringSet(KEY_BACK_LIST, CollectionsKt.toSet(value)).apply();
    }

    public final void saveEventConfig(List<EventConfig> configs) {
        Object m8274constructorimpl;
        Intrinsics.checkNotNullParameter(configs, "configs");
        try {
            Result.Companion companion = Result.INSTANCE;
            AnalysisCacheManager analysisCacheManager = this;
            eventConfigMemoryCache = configs;
            File file = new File(AppContext.INSTANCE.peekContext().getFilesDir(), KEY_EVENT_CONFIG);
            String json = new Gson().toJson(configs);
            Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(configs)");
            FilesKt.writeText$default(file, json, null, 2, null);
            String result = new PersistDataReadRequest(PersistKey.EVENT_OF_CONFIG).toResult();
            if (result != null && result.length() != 0) {
                new PersistDataWriteRequest(PersistKey.EVENT_OF_CONFIG, null).post();
            }
            m8274constructorimpl = Result.m8274constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8274constructorimpl = Result.m8274constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8277exceptionOrNullimpl = Result.m8277exceptionOrNullimpl(m8274constructorimpl);
        if (m8277exceptionOrNullimpl != null) {
            LogUtils.e(m8277exceptionOrNullimpl);
            new SendErrorEventRequest("InitAnalysis", m8277exceptionOrNullimpl.toString()).post();
        }
    }

    public final List<EventConfig> getEventConfig() {
        Object obj;
        try {
            List<EventConfig> list = eventConfigMemoryCache;
            if (list == null) {
                File file = new File(AppContext.INSTANCE.peekContext().getFilesDir(), KEY_EVENT_CONFIG);
                if (file.exists()) {
                    obj = (Void) new Gson().fromJson(FilesKt.readText$default(file, null, 1, null), new TypeToken<List<? extends EventConfig>>() { // from class: com.glority.analysis.utils.AnalysisCacheManager$getEventConfig$1
                    }.getType());
                } else {
                    obj = null;
                }
                list = (List) obj;
            }
            return list;
        } catch (Throwable th) {
            LogUtils.e(th);
            new SendErrorEventRequest("InitAnalysis", th.toString()).post();
            return null;
        }
    }
}

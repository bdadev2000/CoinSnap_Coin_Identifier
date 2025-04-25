package com.glority.base.server;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.glority.android.core.definition.APIDefinition;
import com.glority.android.xx.constants.LogEvents;
import com.glority.network.model.Resource;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;

/* compiled from: CacheThenNetworkRequest.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u0013*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0004\b\u0001\u0010\u00032\u00020\u0004:\u0002\u0013\u0014J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H&J\u000f\u0010\u0007\u001a\u0004\u0018\u00018\u0001H&¢\u0006\u0002\u0010\bJ\u0017\u0010\t\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u000e0\rH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002¨\u0006\u0015"}, d2 = {"Lcom/glority/base/server/CacheThenNetworkRequest;", "X", "Lcom/glority/android/core/definition/APIDefinition;", "Y", "", "networkRequest", "Lcom/glority/network/model/Resource;", "cacheRequest", "()Ljava/lang/Object;", "updateCache", "resource", "(Lcom/glority/android/core/definition/APIDefinition;)Ljava/lang/Object;", "doRequest", "Landroidx/lifecycle/LiveData;", "Lcom/glority/base/server/CacheThenNetworkRequest$ResultData;", "removeCreateAtAndResponseAt", "", "json", "Lcom/google/gson/JsonObject;", "Companion", "ResultData", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public interface CacheThenNetworkRequest<X extends APIDefinition, Y> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    Y cacheRequest();

    LiveData<ResultData<Y>> doRequest();

    Resource<X> networkRequest();

    Y updateCache(X resource);

    /* compiled from: CacheThenNetworkRequest.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static <X extends APIDefinition, Y> LiveData<ResultData<Y>> doRequest(CacheThenNetworkRequest<X, Y> cacheThenNetworkRequest) {
            MutableLiveData mutableLiveData = new MutableLiveData();
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new CacheThenNetworkRequest$doRequest$1(mutableLiveData, cacheThenNetworkRequest, null), 3, null);
            return mutableLiveData;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <X extends APIDefinition, Y> void removeCreateAtAndResponseAt(CacheThenNetworkRequest<X, Y> cacheThenNetworkRequest, JsonObject jsonObject) {
            if (jsonObject.has("_created_at")) {
                jsonObject.remove("_created_at");
            }
            if (jsonObject.has("_response_at")) {
                jsonObject.remove("_response_at");
            }
            Set<Map.Entry<String, JsonElement>> entrySet = jsonObject.entrySet();
            Intrinsics.checkNotNullExpressionValue(entrySet, "entrySet(...)");
            Iterator<T> it = entrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((JsonElement) entry.getValue()).isJsonObject()) {
                    JsonObject asJsonObject = ((JsonElement) entry.getValue()).getAsJsonObject();
                    Intrinsics.checkNotNullExpressionValue(asJsonObject, "getAsJsonObject(...)");
                    removeCreateAtAndResponseAt(cacheThenNetworkRequest, asJsonObject);
                } else if (((JsonElement) entry.getValue()).isJsonArray()) {
                    JsonArray asJsonArray = ((JsonElement) entry.getValue()).getAsJsonArray();
                    Intrinsics.checkNotNullExpressionValue(asJsonArray, "getAsJsonArray(...)");
                    for (JsonElement jsonElement : asJsonArray) {
                        if (jsonElement.isJsonObject()) {
                            JsonObject asJsonObject2 = jsonElement.getAsJsonObject();
                            Intrinsics.checkNotNullExpressionValue(asJsonObject2, "getAsJsonObject(...)");
                            removeCreateAtAndResponseAt(cacheThenNetworkRequest, asJsonObject2);
                        }
                    }
                }
            }
        }
    }

    /* compiled from: CacheThenNetworkRequest.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/glority/base/server/CacheThenNetworkRequest$Companion;", "", "<init>", "()V", "cacheThread", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final ExecutorCoroutineDispatcher cacheThread;

        private Companion() {
        }

        static {
            ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(1);
            Intrinsics.checkNotNullExpressionValue(newFixedThreadPool, "newFixedThreadPool(...)");
            cacheThread = ExecutorsKt.from(newFixedThreadPool);
        }
    }

    /* compiled from: CacheThenNetworkRequest.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\tR\u0013\u0010\u0005\u001a\u00028\u0002¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/glority/base/server/CacheThenNetworkRequest$ResultData;", ExifInterface.GPS_DIRECTION_TRUE, "", "isCache", "", LogEvents.result, "error", "<init>", "(ZLjava/lang/Object;Z)V", "()Z", "getResult", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getError", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class ResultData<T> {
        public static final int $stable = 0;
        private final boolean error;
        private final boolean isCache;
        private final T result;

        public ResultData(boolean z, T t, boolean z2) {
            this.isCache = z;
            this.result = t;
            this.error = z2;
        }

        public final boolean getError() {
            return this.error;
        }

        public final T getResult() {
            return this.result;
        }

        /* renamed from: isCache, reason: from getter */
        public final boolean getIsCache() {
            return this.isCache;
        }
    }
}

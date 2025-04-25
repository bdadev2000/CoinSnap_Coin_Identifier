package com.glority.network;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.definition.APIDefinition;
import com.glority.network.cache.NetworkCache;
import com.glority.network.cache.NetworkFileCache;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import com.glority.network.util.ParseResultUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: CacheableApiServer.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a/\u0010\u0002\u001a\n\u0012\u0004\u0012\u0002H\u0004\u0018\u00010\u0003\"\b\b\u0000\u0010\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0002¢\u0006\u0002\u0010\t\u001a5\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00030\u000b\"\b\b\u0000\u0010\u0004*\u00020\u0005*\u00020\f2\u0006\u0010\u0006\u001a\u0002H\u00042\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000f\u001a1\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\b\b\u0000\u0010\u0004*\u00020\u0005*\u00020\f2\u0006\u0010\u0006\u001a\u0002H\u00042\u0006\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0002\u0010\u0012\u001a/\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\b\b\u0000\u0010\u0004*\u00020\u0005*\u00020\f2\u0006\u0010\u0006\u001a\u0002H\u00042\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u0014\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"fileCache", "Lcom/glority/network/cache/NetworkFileCache;", "getMessageCache", "Lcom/glority/network/Response;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/glority/android/core/definition/APIDefinition;", LogEventArguments.ARG_MESSAGE, "cacheManager", "Lcom/glority/network/cache/NetworkCache;", "(Lcom/glority/android/core/definition/APIDefinition;Lcom/glority/network/cache/NetworkCache;)Lcom/glority/network/Response;", "sendMessage", "Landroidx/lifecycle/LiveData;", "Lcom/glority/network/ApiServer;", "requestType", "Lcom/glority/network/RequestType;", "(Lcom/glority/network/ApiServer;Lcom/glority/android/core/definition/APIDefinition;Lcom/glority/network/RequestType;)Landroidx/lifecycle/LiveData;", "sendMessageAndUpdateCache", "networkCache", "(Lcom/glority/network/ApiServer;Lcom/glority/android/core/definition/APIDefinition;Lcom/glority/network/cache/NetworkCache;)Lcom/glority/network/Response;", "sendMessageBlocking", "(Lcom/glority/network/ApiServer;Lcom/glority/android/core/definition/APIDefinition;Lcom/glority/network/RequestType;)Lcom/glority/network/Response;", "fwk-network_release"}, k = 2, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes9.dex */
public final class CacheableApiServerKt {
    private static final NetworkFileCache fileCache = new NetworkFileCache();

    /* compiled from: CacheableApiServer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes9.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RequestType.values().length];
            try {
                iArr[RequestType.CACHE_ELSE_NETWORK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RequestType.NETWORK_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RequestType.CACHE_THEN_NETWORK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RequestType.NETWORK_ELSE_CACHE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RequestType.CACHE_ONLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final <T extends APIDefinition> Response<T> sendMessageBlocking(ApiServer apiServer, T message, RequestType requestType) {
        Response<T> messageCache;
        Intrinsics.checkNotNullParameter(apiServer, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        int i = WhenMappings.$EnumSwitchMapping$0[requestType.ordinal()];
        if (i == 1) {
            NetworkFileCache networkFileCache = fileCache;
            Response<T> messageCache2 = getMessageCache(message, networkFileCache);
            if (messageCache2 != null) {
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new CacheableApiServerKt$sendMessageBlocking$1(apiServer, message, null), 3, null);
                return messageCache2;
            }
            return sendMessageAndUpdateCache(apiServer, message, networkFileCache);
        }
        if (i == 2) {
            return sendMessageAndUpdateCache(apiServer, message, fileCache);
        }
        if (i == 3) {
            throw new Exception("not supported  sync CACHE_THEN_NETWORK");
        }
        if (i == 4) {
            NetworkFileCache networkFileCache2 = fileCache;
            Response<T> sendMessageAndUpdateCache = sendMessageAndUpdateCache(apiServer, message, networkFileCache2);
            return (sendMessageAndUpdateCache.isSuccess() || (messageCache = getMessageCache(message, networkFileCache2)) == null || !messageCache.isSuccess()) ? sendMessageAndUpdateCache : messageCache;
        }
        if (i != 5) {
            return null;
        }
        NetworkFileCache networkFileCache3 = fileCache;
        Response<T> messageCache3 = getMessageCache(message, networkFileCache3);
        return (messageCache3 == null || !messageCache3.isSuccess()) ? sendMessageAndUpdateCache(apiServer, message, networkFileCache3) : messageCache3;
    }

    public static final <T extends APIDefinition> LiveData<Response<T>> sendMessage(ApiServer apiServer, T message, RequestType requestType) {
        Intrinsics.checkNotNullParameter(apiServer, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        MutableLiveData mutableLiveData = new MutableLiveData();
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new CacheableApiServerKt$sendMessage$1(requestType, mutableLiveData, apiServer, message, null), 3, null);
        return mutableLiveData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends APIDefinition> Response<T> sendMessageAndUpdateCache(ApiServer apiServer, T t, NetworkCache networkCache) {
        Resource<T> sendMessageBlocking = apiServer.sendMessageBlocking(t);
        String originalServerJson = sendMessageBlocking.getOriginalServerJson();
        if (sendMessageBlocking.getStatus() == Status.SUCCESS) {
            T data = sendMessageBlocking.getData();
            if (originalServerJson != null && data != null) {
                networkCache.put(data, originalServerJson);
            }
        }
        boolean z = sendMessageBlocking.getStatus() == Status.SUCCESS;
        return new Response<>(z, z ? t : null, ResponseType.NETWORK, originalServerJson, z ? null : sendMessageBlocking.getException());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends APIDefinition> Response<T> getMessageCache(T t, NetworkCache networkCache) {
        try {
            String str = networkCache.get(t);
            if (str != null) {
                ParseResultUtils.INSTANCE.parseResult$fwk_network_release(str, t);
                return new Response<>(true, t, ResponseType.CACHE, str, null, 16, null);
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}

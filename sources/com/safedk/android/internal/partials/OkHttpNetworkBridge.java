package com.safedk.android.internal.partials;

import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.NetworkBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.k;
import okhttp3.ResponseBody;
import okio.BufferedSource;

/* compiled from: OkHttpSourceFile */
/* loaded from: classes.dex */
public class OkHttpNetworkBridge {
    public static BufferedSource retrofitExceptionCatchingRequestBody_source(ResponseBody targetInstance) {
        Logger.d("OkHttpNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/OkHttpNetworkBridge;->retrofitExceptionCatchingRequestBody_source(Lokhttp3/ResponseBody;)Lokio/BufferedSource;");
        BufferedSource source = targetInstance.source();
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o()) {
            try {
                int identityHashCode = System.identityHashCode(targetInstance);
                Logger.d("SafeDKNetwork", "retrofit|retrofitExceptionCatchingRequestBody_source bodyId " + identityHashCode + " retroReq " + NetworkBridge.f29995c + ", isOnUiThread = " + k.c());
                NetworkBridge.RequestInfo requestInfo = NetworkBridge.f29995c.get(Integer.valueOf(identityHashCode));
                if (requestInfo != null) {
                    source = CreativeInfoManager.a(requestInfo.a(), requestInfo.b(), source, identityHashCode);
                    Logger.d("SafeDKNetwork", "retrofit|retrofitExceptionCatchingRequestBody_source found responseBodyId:" + identityHashCode + ", RequestInfo:" + requestInfo + ", returning Source: " + source);
                }
                return source;
            } catch (Throwable th) {
                Logger.d("SafeDKNetwork", "retrofit|retrofitExceptionCatchingRequestBody_source error " + th.getMessage());
                return source;
            }
        }
        return source;
    }
}

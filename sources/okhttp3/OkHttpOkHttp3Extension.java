package okhttp3;

import com.safedk.android.internal.partials.NetworkBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.annotations.PartialClassExtension;
import okhttp3.internal.connection.RealCall;

/* compiled from: OkHttpSourceFile */
@PartialClassExtension(partialName = "Network")
/* loaded from: classes.dex */
public class OkHttpOkHttp3Extension {
    public static Response okhttp3RealCall_getResponseWithInterceptorChain$okhttp(RealCall targetInstance) {
        Logger.d("OkHttpNetwork|SafeDK: Partial-Network> Lokhttp3/OkHttpOkHttp3Extension;->okhttp3RealCall_getResponseWithInterceptorChain$okhttp(Lokhttp3/internal/connection/RealCall;)Lokhttp3/Response;");
        Response responseWithInterceptorChain$okhttp = targetInstance.getResponseWithInterceptorChain$okhttp();
        try {
            int identityHashCode = System.identityHashCode(targetInstance.request());
            NetworkBridge.RequestInfo requestInfo = NetworkBridge.f29995c.get(Integer.valueOf(identityHashCode));
            Logger.d("SafeDKNetwork", "retrofit|okhttp3 RealCall.getResponseWithInterceptorChain$okhttp reqId:" + identityHashCode + ", RequestInfo:" + requestInfo);
            if (requestInfo != null) {
                int identityHashCode2 = System.identityHashCode(responseWithInterceptorChain$okhttp);
                NetworkBridge.f29995c.put(Integer.valueOf(identityHashCode2), requestInfo);
                Logger.d("SafeDKNetwork", "retrofit|okhttp3 RealCall.getResponseWithInterceptorChain$okhttp replace reqId:" + identityHashCode + ", RequestInfo:" + requestInfo + " - with response id" + identityHashCode2);
            } else {
                Logger.d("SafeDKNetwork", "retrofit|okhttp3 RealCall.getResponseWithInterceptorChain$okhttp, skipping response Id:" + identityHashCode);
            }
        } catch (Throwable th) {
            Logger.d("SafeDKNetwork", "retrofit|okhttp3 RealCall.getResponseWithInterceptorChain$okhttp error " + th.getMessage());
        }
        return responseWithInterceptorChain$okhttp;
    }
}

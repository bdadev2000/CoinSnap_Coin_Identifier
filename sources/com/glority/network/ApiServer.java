package com.glority.network;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.webkit.ProxyConfig;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.definition.APIDefinition;
import com.glority.android.core.definition.APIModelBase;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.xx.constants.LogEvents;
import com.glority.network.eventListener.BaseEventListener;
import com.glority.network.eventListener.EventListenerFactory;
import com.glority.network.eventListener.PrintingEventListener;
import com.glority.network.exception.APIException;
import com.glority.network.exception.RequestFailException;
import com.glority.network.interceptor.LoggingInterceptor;
import com.glority.network.interceptor.ParseInterceptor;
import com.glority.network.model.NetworkMode;
import com.glority.network.model.Resource;
import com.glority.network.util.ParseResultUtils;
import com.glority.utils.device.NetworkUtils;
import com.glority.utils.stability.LogUtils;
import com.glority.utils.ui.ToastUtils;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.gson.Gson;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.json.JSONException;

/* compiled from: ApiServer.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 62\u00020\u0001:\u000256B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001f\u0010\n\u001a\u00020\u0006\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\r\u001a\u0002H\u000bH\u0003¢\u0006\u0002\u0010\u000eJ'\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0010\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\r\u001a\u0002H\u000bH\u0003¢\u0006\u0002\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u0006\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\r\u001a\u0002H\u000bH\u0003¢\u0006\u0002\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0003J4\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00170\u00162\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0019J0\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00172\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0019H\u0007J+\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00170\u0010\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\r\u001a\u0002H\u000bH\u0003¢\u0006\u0002\u0010\u0011J\u001f\u0010\u001c\u001a\u00020\u0006\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\r\u001a\u0002H\u000bH\u0003¢\u0006\u0002\u0010\u000eJ'\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0010\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\r\u001a\u0002H\u000bH\u0003¢\u0006\u0002\u0010\u0011J\u001f\u0010\u001e\u001a\u00020\u0006\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\r\u001a\u0002H\u000bH\u0003¢\u0006\u0002\u0010\u000eJ+\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00170\u0010\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\r\u001a\u0002H\u000bH\u0003¢\u0006\u0002\u0010\u0011J$\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00170\u00162\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010!\u001a\u00020\u0006J \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00130\u00172\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010!\u001a\u00020\u0006H\u0007J\u0010\u0010#\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002J \u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020*H\u0002J\u0010\u0010+\u001a\u00020%2\u0006\u0010,\u001a\u00020\u0006H\u0002J\u0018\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00102\u0006\u0010.\u001a\u00020/H\u0002J)\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u00170\u0016\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\r\u001a\u0002H\u000b¢\u0006\u0002\u00101J%\u00102\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0017\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\r\u001a\u0002H\u000bH\u0007¢\u0006\u0002\u00103J+\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00170\u0010\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\r\u001a\u0002H\u000bH\u0007¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/glority/network/ApiServer;", "", "builder", "Lcom/glority/network/ApiServer$Builder;", "(Lcom/glority/network/ApiServer$Builder;)V", "host", "", "internalHttpClient", "Lokhttp3/OkHttpClient;", "internalHttpClientWithLongTimeout", "doFormPost", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/glority/android/core/definition/APIDefinition;", LogEventArguments.ARG_MESSAGE, "(Lcom/glority/android/core/definition/APIDefinition;)Ljava/lang/String;", "doFormPostStreaming", "Lkotlinx/coroutines/flow/Flow;", "(Lcom/glority/android/core/definition/APIDefinition;)Lkotlinx/coroutines/flow/Flow;", "doGet", "Ljava/io/File;", "url", "path", "Landroidx/lifecycle/LiveData;", "Lcom/glority/network/model/Resource;", "params", "", "doGetBlocking", "doGetStreaming", "doMultipartPost", "doMultipartPostStreaming", "doPost", "doPostStreaming", "download", "filePath", "downloadBlocking", "getAPIUrl", "logApiEvent", "", "startTs", "", "apiName", "code", "", "logTooManyRequestsErrorEvent", "apiUrl", "processStreamingResponse", "response", "Lokhttp3/Response;", "sendMessage", "(Lcom/glority/android/core/definition/APIDefinition;)Landroidx/lifecycle/LiveData;", "sendMessageBlocking", "(Lcom/glority/android/core/definition/APIDefinition;)Lcom/glority/network/model/Resource;", "sendMessageStreaming", "Builder", "Companion", "fwk-network_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes9.dex */
public final class ApiServer {
    private final String host;
    private final OkHttpClient internalHttpClient;
    private final OkHttpClient internalHttpClientWithLongTimeout;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static boolean enableEncryption = true;
    private static boolean enableNetworkTracker = true;
    private static final LinkedHashSet<Interceptor> customInterceptors = new LinkedHashSet<>();
    private static final LinkedHashSet<Class<? extends BaseEventListener>> eventListeners = new LinkedHashSet<>();

    public /* synthetic */ ApiServer(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    private ApiServer(Builder builder) {
        this.host = builder.getHost();
        this.internalHttpClient = builder.getInternalHttpClient$fwk_network_release();
        this.internalHttpClientWithLongTimeout = builder.getInternalHttpClientWithLongTimeout$fwk_network_release();
    }

    public final <T extends APIDefinition> Flow<Resource<String>> sendMessageStreaming(T message) {
        Intrinsics.checkNotNullParameter(message, "message");
        String simpleName = message.getClass().getSimpleName();
        long currentTimeMillis = System.currentTimeMillis();
        if (enableNetworkTracker) {
            if (!NetworkUtils.isConnected()) {
                NetworkTracker.INSTANCE.getNetworkMode().postValue(NetworkMode.NO_INTERNET);
                String api = message.api();
                Intrinsics.checkNotNullExpressionValue(api, "api(...)");
                logApiEvent(currentTimeMillis, api, RequestFailException.ErrorCode.NO_INTERNET.getValue());
                return FlowKt.flow(new ApiServer$sendMessageStreaming$1(new RequestFailException(simpleName, "No internet connection.", RequestFailException.ErrorCode.NO_INTERNET.getValue()), null));
            }
            if (!NetworkTracker.INSTANCE.isServerAvailable()) {
                String api2 = message.api();
                Intrinsics.checkNotNullExpressionValue(api2, "api(...)");
                if (!StringsKt.endsWith$default(api2, "application/ping", false, 2, (Object) null)) {
                    NetworkMode value = NetworkTracker.INSTANCE.getNetworkMode().getValue();
                    String str = "Server is unavailable, current mode: " + (value != null ? value.name() : null);
                    RequestFailException.ErrorCode.Companion companion = RequestFailException.ErrorCode.INSTANCE;
                    if (value == null) {
                        value = NetworkMode.MAINTAIN;
                    }
                    return FlowKt.flow(new ApiServer$sendMessageStreaming$2(new RequestFailException(simpleName, str, companion.fromValue(value).getValue()), null));
                }
            }
        }
        try {
            String[] methods = message.methods();
            Intrinsics.checkNotNullExpressionValue(methods, "methods(...)");
            for (String str2 : methods) {
                if (StringsKt.equals(str2, "post", true)) {
                    return doPostStreaming(message);
                }
                if (StringsKt.equals(str2, LogEvents.exportemptyalert_close_click_type_get, true)) {
                    return doGetStreaming(message);
                }
            }
            return FlowKt.flow(new ApiServer$sendMessageStreaming$12(null));
        } catch (ParameterCheckFailException e) {
            String api3 = message.api();
            Intrinsics.checkNotNullExpressionValue(api3, "api(...)");
            logApiEvent(currentTimeMillis, api3, RequestFailException.ErrorCode.ILLEGAL_API_ARGUMENT.getValue());
            return FlowKt.flow(new ApiServer$sendMessageStreaming$9(new RequestFailException(simpleName, e.getMessage(), RequestFailException.ErrorCode.ILLEGAL_API_ARGUMENT.getValue()), null));
        } catch (APIException e2) {
            String api4 = message.api();
            Intrinsics.checkNotNullExpressionValue(api4, "api(...)");
            logApiEvent(currentTimeMillis, api4, e2.getCode());
            return FlowKt.flow(new ApiServer$sendMessageStreaming$3(e2, null));
        } catch (RequestFailException e3) {
            String api5 = message.api();
            Intrinsics.checkNotNullExpressionValue(api5, "api(...)");
            logApiEvent(currentTimeMillis, api5, e3.getCode());
            return FlowKt.flow(new ApiServer$sendMessageStreaming$10(e3, null));
        } catch (SocketTimeoutException e4) {
            NetworkTracker.INSTANCE.getNetworkMode().postValue(NetworkMode.NO_INTERNET);
            String api6 = message.api();
            Intrinsics.checkNotNullExpressionValue(api6, "api(...)");
            logApiEvent(currentTimeMillis, api6, RequestFailException.ErrorCode.NO_INTERNET.getValue());
            return FlowKt.flow(new ApiServer$sendMessageStreaming$4(new RequestFailException(simpleName, e4.getMessage(), RequestFailException.ErrorCode.HTTP_IO.getValue()), null));
        } catch (IOException e5) {
            String api7 = message.api();
            Intrinsics.checkNotNullExpressionValue(api7, "api(...)");
            logApiEvent(currentTimeMillis, api7, RequestFailException.ErrorCode.HTTP_IO.getValue());
            return FlowKt.flow(new ApiServer$sendMessageStreaming$5(new RequestFailException(simpleName, e5.getMessage(), RequestFailException.ErrorCode.HTTP_IO.getValue()), null));
        } catch (IllegalArgumentException e6) {
            String api8 = message.api();
            Intrinsics.checkNotNullExpressionValue(api8, "api(...)");
            logApiEvent(currentTimeMillis, api8, RequestFailException.ErrorCode.HTTP_ILLEGAL_ARGUMENT.getValue());
            return FlowKt.flow(new ApiServer$sendMessageStreaming$7(new RequestFailException(simpleName, e6.getMessage(), RequestFailException.ErrorCode.HTTP_ILLEGAL_ARGUMENT.getValue()), null));
        } catch (IllegalStateException e7) {
            String api9 = message.api();
            Intrinsics.checkNotNullExpressionValue(api9, "api(...)");
            logApiEvent(currentTimeMillis, api9, RequestFailException.ErrorCode.HTTP_ILLEGAL_STATE.getValue());
            return FlowKt.flow(new ApiServer$sendMessageStreaming$6(new RequestFailException(simpleName, e7.getMessage(), RequestFailException.ErrorCode.HTTP_ILLEGAL_STATE.getValue()), null));
        } catch (JSONException e8) {
            String api10 = message.api();
            Intrinsics.checkNotNullExpressionValue(api10, "api(...)");
            logApiEvent(currentTimeMillis, api10, RequestFailException.ErrorCode.INVALID_RESPONSE.getValue());
            return FlowKt.flow(new ApiServer$sendMessageStreaming$8(new RequestFailException(simpleName, e8.getMessage(), RequestFailException.ErrorCode.INVALID_RESPONSE.getValue()), null));
        } catch (Exception e9) {
            String api11 = message.api();
            Intrinsics.checkNotNullExpressionValue(api11, "api(...)");
            logApiEvent(currentTimeMillis, api11, RequestFailException.ErrorCode.INTERNAL_ERROR.getValue());
            return FlowKt.flow(new ApiServer$sendMessageStreaming$11(new RequestFailException(simpleName, e9.getMessage(), RequestFailException.ErrorCode.INTERNAL_ERROR.getValue()), null));
        }
    }

    public final <T extends APIDefinition> Resource<T> sendMessageBlocking(T message) {
        Resource<T> error;
        Intrinsics.checkNotNullParameter(message, "message");
        String simpleName = message.getClass().getSimpleName();
        long currentTimeMillis = System.currentTimeMillis();
        if (enableNetworkTracker) {
            if (!NetworkUtils.isConnected()) {
                NetworkTracker.INSTANCE.getNetworkMode().postValue(NetworkMode.NO_INTERNET);
                String api = message.api();
                Intrinsics.checkNotNullExpressionValue(api, "api(...)");
                logApiEvent(currentTimeMillis, api, RequestFailException.ErrorCode.NO_INTERNET.getValue());
                RequestFailException requestFailException = new RequestFailException(simpleName, "No internet connection.", RequestFailException.ErrorCode.NO_INTERNET.getValue());
                return Resource.INSTANCE.error(requestFailException.getMessage(), message, requestFailException);
            }
            if (!NetworkTracker.INSTANCE.isServerAvailable()) {
                String api2 = message.api();
                Intrinsics.checkNotNullExpressionValue(api2, "api(...)");
                if (!StringsKt.endsWith$default(api2, "application/ping", false, 2, (Object) null)) {
                    NetworkMode value = NetworkTracker.INSTANCE.getNetworkMode().getValue();
                    String str = "Server is unavailable, current mode: " + (value != null ? value.name() : null);
                    RequestFailException.ErrorCode.Companion companion = RequestFailException.ErrorCode.INSTANCE;
                    if (value == null) {
                        value = NetworkMode.MAINTAIN;
                    }
                    RequestFailException requestFailException2 = new RequestFailException(simpleName, str, companion.fromValue(value).getValue());
                    return Resource.INSTANCE.error(requestFailException2.getMessage(), message, requestFailException2);
                }
            }
        }
        String str2 = "";
        try {
            String[] methods = message.methods();
            Intrinsics.checkNotNullExpressionValue(methods, "methods(...)");
            int length = methods.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                String str3 = methods[i];
                if (StringsKt.equals(str3, "post", true)) {
                    str2 = doPost(message);
                    break;
                }
                if (StringsKt.equals(str3, LogEvents.exportemptyalert_close_click_type_get, true)) {
                    str2 = doGet(message);
                    break;
                }
                i++;
            }
            LogUtils.json(str2);
            ParseResultUtils.INSTANCE.parseResult$fwk_network_release(str2, message);
            String api3 = message.api();
            Intrinsics.checkNotNullExpressionValue(api3, "api(...)");
            logApiEvent(currentTimeMillis, api3, 0);
            error = Resource.INSTANCE.success(message);
        } catch (ParameterCheckFailException e) {
            String api4 = message.api();
            Intrinsics.checkNotNullExpressionValue(api4, "api(...)");
            logApiEvent(currentTimeMillis, api4, RequestFailException.ErrorCode.ILLEGAL_API_ARGUMENT.getValue());
            RequestFailException requestFailException3 = new RequestFailException(simpleName, e.getMessage(), RequestFailException.ErrorCode.ILLEGAL_API_ARGUMENT.getValue());
            error = Resource.INSTANCE.error(requestFailException3.getMessage(), message, requestFailException3);
        } catch (APIException e2) {
            String api5 = message.api();
            Intrinsics.checkNotNullExpressionValue(api5, "api(...)");
            logApiEvent(currentTimeMillis, api5, e2.getCode());
            error = Resource.INSTANCE.error(e2.getMessage(), message, e2);
        } catch (RequestFailException e3) {
            String api6 = message.api();
            Intrinsics.checkNotNullExpressionValue(api6, "api(...)");
            logApiEvent(currentTimeMillis, api6, e3.getCode());
            error = Resource.INSTANCE.error(e3.getMessage(), message, e3);
        } catch (SocketTimeoutException e4) {
            NetworkTracker.INSTANCE.getNetworkMode().postValue(NetworkMode.NO_INTERNET);
            String api7 = message.api();
            Intrinsics.checkNotNullExpressionValue(api7, "api(...)");
            logApiEvent(currentTimeMillis, api7, RequestFailException.ErrorCode.NO_INTERNET.getValue());
            RequestFailException requestFailException4 = new RequestFailException(simpleName, e4.getMessage(), RequestFailException.ErrorCode.HTTP_IO.getValue());
            error = Resource.INSTANCE.error(requestFailException4.getMessage(), message, requestFailException4);
        } catch (IOException e5) {
            String api8 = message.api();
            Intrinsics.checkNotNullExpressionValue(api8, "api(...)");
            logApiEvent(currentTimeMillis, api8, RequestFailException.ErrorCode.HTTP_IO.getValue());
            RequestFailException requestFailException5 = new RequestFailException(simpleName, e5.getMessage(), RequestFailException.ErrorCode.HTTP_IO.getValue());
            error = Resource.INSTANCE.error(requestFailException5.getMessage(), message, requestFailException5);
        } catch (IllegalArgumentException e6) {
            String api9 = message.api();
            Intrinsics.checkNotNullExpressionValue(api9, "api(...)");
            logApiEvent(currentTimeMillis, api9, RequestFailException.ErrorCode.HTTP_ILLEGAL_ARGUMENT.getValue());
            RequestFailException requestFailException6 = new RequestFailException(simpleName, e6.getMessage(), RequestFailException.ErrorCode.HTTP_ILLEGAL_ARGUMENT.getValue());
            error = Resource.INSTANCE.error(requestFailException6.getMessage(), message, requestFailException6);
        } catch (IllegalStateException e7) {
            String api10 = message.api();
            Intrinsics.checkNotNullExpressionValue(api10, "api(...)");
            logApiEvent(currentTimeMillis, api10, RequestFailException.ErrorCode.HTTP_ILLEGAL_STATE.getValue());
            RequestFailException requestFailException7 = new RequestFailException(simpleName, e7.getMessage(), RequestFailException.ErrorCode.HTTP_ILLEGAL_STATE.getValue());
            error = Resource.INSTANCE.error(requestFailException7.getMessage(), message, requestFailException7);
        } catch (JSONException e8) {
            String api11 = message.api();
            Intrinsics.checkNotNullExpressionValue(api11, "api(...)");
            logApiEvent(currentTimeMillis, api11, RequestFailException.ErrorCode.INVALID_RESPONSE.getValue());
            RequestFailException requestFailException8 = new RequestFailException(simpleName, e8.getMessage(), RequestFailException.ErrorCode.INVALID_RESPONSE.getValue());
            error = Resource.INSTANCE.error(requestFailException8.getMessage(), message, requestFailException8);
        } catch (Exception e9) {
            String api12 = message.api();
            Intrinsics.checkNotNullExpressionValue(api12, "api(...)");
            logApiEvent(currentTimeMillis, api12, RequestFailException.ErrorCode.INTERNAL_ERROR.getValue());
            RequestFailException requestFailException9 = new RequestFailException(simpleName, e9.getMessage(), RequestFailException.ErrorCode.INTERNAL_ERROR.getValue());
            error = Resource.INSTANCE.error(requestFailException9.getMessage(), message, requestFailException9);
        }
        error.setOriginalServerJson(str2);
        return error;
    }

    public final <T extends APIDefinition> LiveData<Resource<T>> sendMessage(T message) {
        Intrinsics.checkNotNullParameter(message, "message");
        String simpleName = message.getClass().getSimpleName();
        MutableLiveData mutableLiveData = new MutableLiveData();
        long currentTimeMillis = System.currentTimeMillis();
        if (!NetworkUtils.isConnected()) {
            NetworkTracker.INSTANCE.getNetworkMode().postValue(NetworkMode.NO_INTERNET);
            String api = message.api();
            Intrinsics.checkNotNullExpressionValue(api, "api(...)");
            logApiEvent(currentTimeMillis, api, RequestFailException.ErrorCode.NO_INTERNET.getValue());
            RequestFailException requestFailException = new RequestFailException(simpleName, "No internet connection.", RequestFailException.ErrorCode.NO_INTERNET.getValue());
            mutableLiveData.postValue(Resource.INSTANCE.error(requestFailException.getMessage(), message, requestFailException));
            return mutableLiveData;
        }
        if (!NetworkTracker.INSTANCE.isServerAvailable()) {
            String api2 = message.api();
            Intrinsics.checkNotNullExpressionValue(api2, "api(...)");
            if (!StringsKt.endsWith$default(api2, "application/ping", false, 2, (Object) null)) {
                NetworkMode value = NetworkTracker.INSTANCE.getNetworkMode().getValue();
                String str = "Server is unavailable, current mode: " + (value != null ? value.name() : null);
                RequestFailException.ErrorCode.Companion companion = RequestFailException.ErrorCode.INSTANCE;
                if (value == null) {
                    value = NetworkMode.MAINTAIN;
                }
                RequestFailException requestFailException2 = new RequestFailException(simpleName, str, companion.fromValue(value).getValue());
                mutableLiveData.postValue(Resource.INSTANCE.error(requestFailException2.getMessage(), message, requestFailException2));
                return mutableLiveData;
            }
        }
        mutableLiveData.postValue(Resource.INSTANCE.loading(message));
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new ApiServer$sendMessage$1(message, this, currentTimeMillis, simpleName, mutableLiveData, null), 3, null);
        return mutableLiveData;
    }

    public final LiveData<Resource<File>> download(String url, String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        MutableLiveData mutableLiveData = new MutableLiveData();
        if (!NetworkUtils.isConnected()) {
            NetworkTracker.INSTANCE.getNetworkMode().postValue(NetworkMode.NO_INTERNET);
            RequestFailException requestFailException = new RequestFailException("download: " + url, "No internet connection.", RequestFailException.ErrorCode.NO_INTERNET.getValue());
            mutableLiveData.postValue(Resource.INSTANCE.error(requestFailException.getMessage(), null, requestFailException));
            return mutableLiveData;
        }
        mutableLiveData.postValue(Resource.INSTANCE.loading(null));
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new ApiServer$download$1(this, url, filePath, mutableLiveData, null), 3, null);
        return mutableLiveData;
    }

    public final Resource<File> downloadBlocking(String url, String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        if (!NetworkUtils.isConnected()) {
            NetworkTracker.INSTANCE.getNetworkMode().postValue(NetworkMode.NO_INTERNET);
            RequestFailException requestFailException = new RequestFailException("download: " + url, "No internet connection.", RequestFailException.ErrorCode.NO_INTERNET.getValue());
            return Resource.INSTANCE.error(requestFailException.getMessage(), null, requestFailException);
        }
        try {
            return Resource.INSTANCE.success(doGet(url, filePath));
        } catch (IOException e) {
            RequestFailException requestFailException2 = new RequestFailException("download: " + url, e.getMessage(), RequestFailException.ErrorCode.HTTP_IO.getValue());
            return Resource.INSTANCE.error(requestFailException2.getMessage(), null, requestFailException2);
        } catch (Exception e2) {
            RequestFailException requestFailException3 = new RequestFailException("download: " + url, e2.getMessage(), RequestFailException.ErrorCode.INTERNAL_ERROR.getValue());
            return Resource.INSTANCE.error(requestFailException3.getMessage(), null, requestFailException3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiveData doGet$default(ApiServer apiServer, String str, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            map = null;
        }
        return apiServer.doGet(str, (Map<String, String>) map);
    }

    public final LiveData<Resource<String>> doGet(String url, Map<String, String> params) {
        MutableLiveData mutableLiveData = new MutableLiveData();
        if (url == null) {
            RequestFailException requestFailException = new RequestFailException("HttpGetBlocking", "empty url", RequestFailException.ErrorCode.HTTP_ILLEGAL_ARGUMENT.getValue());
            mutableLiveData.postValue(Resource.INSTANCE.error(requestFailException.getMessage(), null, requestFailException));
            return mutableLiveData;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (NetworkUtils.isConnected()) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new ApiServer$doGet$1(url, mutableLiveData, "HttpGetBlocking", params, this, currentTimeMillis, null), 3, null);
            return mutableLiveData;
        }
        NetworkTracker.INSTANCE.getNetworkMode().postValue(NetworkMode.NO_INTERNET);
        logApiEvent(currentTimeMillis, url, RequestFailException.ErrorCode.NO_INTERNET.getValue());
        RequestFailException requestFailException2 = new RequestFailException("HttpGetBlocking", "No internet connection.", RequestFailException.ErrorCode.NO_INTERNET.getValue());
        mutableLiveData.postValue(Resource.INSTANCE.error(requestFailException2.getMessage(), null, requestFailException2));
        return mutableLiveData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Resource doGetBlocking$default(ApiServer apiServer, String str, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            map = null;
        }
        return apiServer.doGetBlocking(str, map);
    }

    public final Resource<String> doGetBlocking(String url, Map<String, String> params) {
        if (url == null) {
            RequestFailException requestFailException = new RequestFailException("HttpGetBlocking", "empty url", RequestFailException.ErrorCode.HTTP_ILLEGAL_ARGUMENT.getValue());
            return Resource.INSTANCE.error(requestFailException.getMessage(), null, requestFailException);
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!NetworkUtils.isConnected()) {
            NetworkTracker.INSTANCE.getNetworkMode().postValue(NetworkMode.NO_INTERNET);
            logApiEvent(currentTimeMillis, url, RequestFailException.ErrorCode.NO_INTERNET.getValue());
            RequestFailException requestFailException2 = new RequestFailException("HttpGetBlocking", "No internet connection.", RequestFailException.ErrorCode.NO_INTERNET.getValue());
            return Resource.INSTANCE.error(requestFailException2.getMessage(), null, requestFailException2);
        }
        HttpUrl parse = HttpUrl.parse(url);
        HttpUrl.Builder newBuilder = parse != null ? parse.newBuilder() : null;
        if (newBuilder == null) {
            return Resource.INSTANCE.error("HttpGetBlocking", null, new RequestFailException("HttpGetBlocking", "empty url", RequestFailException.ErrorCode.HTTP_ILLEGAL_ARGUMENT.getValue()));
        }
        if (params != null) {
            for (Map.Entry<String, String> entry : params.entrySet()) {
                newBuilder.addQueryParameter(entry.getKey(), entry.getValue());
            }
        }
        try {
            okhttp3.Response execute = this.internalHttpClient.newCall(new Request.Builder().url(newBuilder.build()).build()).execute();
            ResponseBody body = execute.body();
            Intrinsics.checkNotNull(body);
            String string = body.string();
            ResponseBody body2 = execute.body();
            Intrinsics.checkNotNull(body2);
            body2.close();
            return Resource.INSTANCE.success(string);
        } catch (SocketTimeoutException e) {
            NetworkTracker.INSTANCE.getNetworkMode().postValue(NetworkMode.NO_INTERNET);
            logApiEvent(currentTimeMillis, url, RequestFailException.ErrorCode.NO_INTERNET.getValue());
            RequestFailException requestFailException3 = new RequestFailException("HttpGetBlocking", e.getMessage(), RequestFailException.ErrorCode.HTTP_IO.getValue());
            return Resource.INSTANCE.error(requestFailException3.getMessage(), "Request timeout.", requestFailException3);
        } catch (IOException e2) {
            RequestFailException requestFailException4 = new RequestFailException("HttpGetBlocking", e2.getMessage(), RequestFailException.ErrorCode.HTTP_IO.getValue());
            return Resource.INSTANCE.error(requestFailException4.getMessage(), null, requestFailException4);
        } catch (Exception e3) {
            RequestFailException requestFailException5 = new RequestFailException("HttpGetBlocking", e3.getMessage(), RequestFailException.ErrorCode.INTERNAL_ERROR.getValue());
            return Resource.INSTANCE.error(requestFailException5.getMessage(), null, requestFailException5);
        }
    }

    private final String getAPIUrl(APIDefinition message) {
        String str = this.host + "/api/" + message.api();
        if (message.forceHttps() || !StringsKt.startsWith$default(str, "https", false, 2, (Object) null)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(ProxyConfig.MATCH_HTTP);
        String substring = str.substring(5);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return sb.append(substring).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T extends APIDefinition> String doGet(T message) throws IOException {
        HttpUrl parse = HttpUrl.parse(getAPIUrl(message));
        Intrinsics.checkNotNull(parse);
        HttpUrl.Builder newBuilder = parse.newBuilder();
        Map<String, Object> params = message.getParams();
        Intrinsics.checkNotNullExpressionValue(params, "getParams(...)");
        for (Map.Entry<String, Object> entry : params.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if ((value instanceof Map) || (value instanceof List)) {
                newBuilder.addQueryParameter(key, new Gson().toJson(value));
            } else if (value instanceof APIModelBase) {
                newBuilder.addQueryParameter(key, new Gson().toJson(((APIModelBase) value).getJsonMap()));
            } else {
                newBuilder.addQueryParameter(key, value.toString());
            }
        }
        okhttp3.Response execute = this.internalHttpClient.newCall(new Request.Builder().url(newBuilder.build()).build()).execute();
        if (execute.code() == RequestFailException.ErrorCode.TOO_MANY_REQUESTS.getValue()) {
            logTooManyRequestsErrorEvent(getAPIUrl(message));
            ToastUtils.showShort(R.string.network_text_too_many_requests);
            throw new RequestFailException(message.getClass().getSimpleName(), "too_many_requests", RequestFailException.ErrorCode.TOO_MANY_REQUESTS.getValue());
        }
        ResponseBody body = execute.body();
        Intrinsics.checkNotNull(body);
        String string = body.string();
        ResponseBody body2 = execute.body();
        Intrinsics.checkNotNull(body2);
        body2.close();
        Intrinsics.checkNotNull(string);
        return string;
    }

    private final <T extends APIDefinition> Flow<Resource<String>> doGetStreaming(T message) throws IOException {
        HttpUrl parse = HttpUrl.parse(getAPIUrl(message));
        Intrinsics.checkNotNull(parse);
        HttpUrl.Builder newBuilder = parse.newBuilder();
        Map<String, Object> params = message.getParams();
        Intrinsics.checkNotNullExpressionValue(params, "getParams(...)");
        for (Map.Entry<String, Object> entry : params.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if ((value instanceof Map) || (value instanceof List)) {
                newBuilder.addQueryParameter(key, new Gson().toJson(value));
            } else if (value instanceof APIModelBase) {
                newBuilder.addQueryParameter(key, new Gson().toJson(((APIModelBase) value).getJsonMap()));
            } else {
                newBuilder.addQueryParameter(key, value.toString());
            }
        }
        okhttp3.Response execute = this.internalHttpClientWithLongTimeout.newCall(new Request.Builder().url(newBuilder.build()).build()).execute();
        if (execute.code() == RequestFailException.ErrorCode.TOO_MANY_REQUESTS.getValue()) {
            logTooManyRequestsErrorEvent(getAPIUrl(message));
            ToastUtils.showShort(R.string.network_text_too_many_requests);
            throw new RequestFailException(message.getClass().getSimpleName(), "too_many_requests", RequestFailException.ErrorCode.TOO_MANY_REQUESTS.getValue());
        }
        Intrinsics.checkNotNull(execute);
        final Flow<String> processStreamingResponse = processStreamingResponse(execute);
        return (Flow) new Flow<Resource<? extends String>>() { // from class: com.glority.network.ApiServer$doGetStreaming$$inlined$map$1

            /* compiled from: Collect.kt */
            @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\t"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$$special$$inlined$collect$5", "kotlinx/coroutines/flow/FlowKt__TransformKt$unsafeTransform$$inlined$unsafeFlow$5$lambda$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 9, 0})
            /* renamed from: com.glority.network.ApiServer$doGetStreaming$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes9.dex */
            public static final class AnonymousClass2 implements FlowCollector<String> {
                final /* synthetic */ FlowCollector $this_unsafeFlow$inlined;
                final /* synthetic */ ApiServer$doGetStreaming$$inlined$map$1 this$0;

                @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0096@¨\u0006\n"}, d2 = {"emit", "", ExifInterface.GPS_DIRECTION_TRUE, "value", "continuation", "Lkotlin/coroutines/Continuation;", "", "kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3$emit$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$$special$$inlined$collect$5$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$unsafeTransform$$inlined$unsafeFlow$5$lambda$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1"}, k = 3, mv = {1, 9, 0})
                @DebugMetadata(c = "com.glority.network.ApiServer$doGetStreaming$$inlined$map$1$2", f = "ApiServer.kt", i = {}, l = {TsExtractor.TS_STREAM_TYPE_SPLICE_INFO}, m = "emit", n = {}, s = {})
                /* renamed from: com.glority.network.ApiServer$doGetStreaming$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: classes9.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    Object L$5;
                    Object L$6;
                    Object L$7;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, ApiServer$doGetStreaming$$inlined$map$1 apiServer$doGetStreaming$$inlined$map$1) {
                    this.$this_unsafeFlow$inlined = flowCollector;
                    this.this$0 = apiServer$doGetStreaming$$inlined$map$1;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public java.lang.Object emit(java.lang.String r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.glority.network.ApiServer$doGetStreaming$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L14
                        r0 = r6
                        com.glority.network.ApiServer$doGetStreaming$$inlined$map$1$2$1 r0 = (com.glority.network.ApiServer$doGetStreaming$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r1 = r1 & r2
                        if (r1 == 0) goto L14
                        int r6 = r0.label
                        int r6 = r6 - r2
                        r0.label = r6
                        goto L19
                    L14:
                        com.glority.network.ApiServer$doGetStreaming$$inlined$map$1$2$1 r0 = new com.glority.network.ApiServer$doGetStreaming$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L19:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L32
                        if (r2 != r3) goto L2a
                        kotlin.ResultKt.throwOnFailure(r6)
                        goto L4b
                    L2a:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L32:
                        kotlin.ResultKt.throwOnFailure(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.$this_unsafeFlow$inlined
                        r2 = r0
                        kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                        java.lang.String r5 = (java.lang.String) r5
                        com.glority.network.model.Resource$Companion r2 = com.glority.network.model.Resource.INSTANCE
                        com.glority.network.model.Resource r5 = r2.success(r5)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4b
                        return r1
                    L4b:
                        kotlin.Unit r5 = kotlin.Unit.INSTANCE
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.glority.network.ApiServer$doGetStreaming$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Resource<? extends String>> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File doGet(String url, String path) throws Exception {
        if (url == null) {
            throw new IllegalArgumentException("url must not be null");
        }
        HttpUrl parse = HttpUrl.parse(url);
        HttpUrl.Builder newBuilder = parse != null ? parse.newBuilder() : null;
        if (newBuilder == null) {
            throw new IllegalArgumentException("invalid url");
        }
        okhttp3.Response execute = this.internalHttpClient.newCall(new Request.Builder().url(newBuilder.build()).build()).execute();
        if (execute.code() == RequestFailException.ErrorCode.TOO_MANY_REQUESTS.getValue()) {
            logTooManyRequestsErrorEvent(url);
            ToastUtils.showShort(R.string.network_text_too_many_requests);
            throw new RequestFailException(url, "too_many_requests", RequestFailException.ErrorCode.TOO_MANY_REQUESTS.getValue());
        }
        File file = new File(path);
        ResponseBody body = execute.body();
        Intrinsics.checkNotNull(body);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(body.byteStream());
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(path)));
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read != -1) {
                    bufferedOutputStream.write(bArr, 0, read);
                } else {
                    bufferedOutputStream.flush();
                    return file;
                }
            }
        } finally {
            bufferedOutputStream.close();
            bufferedInputStream.close();
            ResponseBody body2 = execute.body();
            Intrinsics.checkNotNull(body2);
            body2.close();
        }
    }

    private final <T extends APIDefinition> String doMultipartPost(T message) throws Exception {
        String str;
        MultipartBody.Builder type = new MultipartBody.Builder().setType(MultipartBody.FORM);
        Map<String, Object> params = message.getParams();
        Intrinsics.checkNotNullExpressionValue(params, "getParams(...)");
        for (Map.Entry<String, Object> entry : params.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if ((value instanceof Map) || (value instanceof List)) {
                type.addFormDataPart(key, new Gson().toJson(value));
            } else if (value instanceof APIModelBase) {
                type.addFormDataPart(key, new Gson().toJson(((APIModelBase) value).getJsonMap()));
            } else {
                type.addFormDataPart(key, value.toString());
            }
        }
        Map<String, File> files = message.getFiles();
        Intrinsics.checkNotNullExpressionValue(files, "getFiles(...)");
        for (Map.Entry<String, File> entry2 : files.entrySet()) {
            String key2 = entry2.getKey();
            File value2 = entry2.getValue();
            if (value2 != null) {
                String name = value2.getName();
                Intrinsics.checkNotNull(name);
                String substring = name.substring(StringsKt.lastIndexOf$default((CharSequence) name, '.', 0, false, 6, (Object) null));
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                if (!StringsKt.equals(".png", substring, true)) {
                    str = "jpeg";
                } else {
                    str = "png";
                }
                type.addFormDataPart(key2, value2.getName(), RequestBody.create(MediaType.parse("image/".concat(str)), value2));
            }
        }
        MultipartBody build = type.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        okhttp3.Response execute = this.internalHttpClientWithLongTimeout.newCall(new Request.Builder().url(getAPIUrl(message)).post(build).build()).execute();
        if (execute.code() == RequestFailException.ErrorCode.TOO_MANY_REQUESTS.getValue()) {
            logTooManyRequestsErrorEvent(getAPIUrl(message));
            ToastUtils.showShort(R.string.network_text_too_many_requests);
            throw new RequestFailException(message.getClass().getSimpleName(), "too_many_requests", RequestFailException.ErrorCode.TOO_MANY_REQUESTS.getValue());
        }
        ResponseBody body = execute.body();
        Intrinsics.checkNotNull(body);
        String string = body.string();
        ResponseBody body2 = execute.body();
        Intrinsics.checkNotNull(body2);
        body2.close();
        Intrinsics.checkNotNull(string);
        return string;
    }

    private final <T extends APIDefinition> Flow<String> doMultipartPostStreaming(T message) throws Exception {
        String str;
        MultipartBody.Builder type = new MultipartBody.Builder().setType(MultipartBody.FORM);
        Map<String, Object> params = message.getParams();
        Intrinsics.checkNotNullExpressionValue(params, "getParams(...)");
        for (Map.Entry<String, Object> entry : params.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if ((value instanceof Map) || (value instanceof List)) {
                type.addFormDataPart(key, new Gson().toJson(value));
            } else if (value instanceof APIModelBase) {
                type.addFormDataPart(key, new Gson().toJson(((APIModelBase) value).getJsonMap()));
            } else {
                type.addFormDataPart(key, value.toString());
            }
        }
        Map<String, File> files = message.getFiles();
        Intrinsics.checkNotNullExpressionValue(files, "getFiles(...)");
        for (Map.Entry<String, File> entry2 : files.entrySet()) {
            String key2 = entry2.getKey();
            File value2 = entry2.getValue();
            if (value2 != null) {
                String name = value2.getName();
                Intrinsics.checkNotNull(name);
                String substring = name.substring(StringsKt.lastIndexOf$default((CharSequence) name, '.', 0, false, 6, (Object) null));
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                if (!StringsKt.equals(".png", substring, true)) {
                    str = "jpeg";
                } else {
                    str = "png";
                }
                type.addFormDataPart(key2, value2.getName(), RequestBody.create(MediaType.parse("image/".concat(str)), value2));
            }
        }
        MultipartBody build = type.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        okhttp3.Response execute = this.internalHttpClientWithLongTimeout.newCall(new Request.Builder().url(getAPIUrl(message)).post(build).build()).execute();
        if (execute.code() == RequestFailException.ErrorCode.TOO_MANY_REQUESTS.getValue()) {
            logTooManyRequestsErrorEvent(getAPIUrl(message));
            ToastUtils.showShort(R.string.network_text_too_many_requests);
            throw new RequestFailException(message.getClass().getSimpleName(), "too_many_requests", RequestFailException.ErrorCode.TOO_MANY_REQUESTS.getValue());
        }
        Intrinsics.checkNotNull(execute);
        return processStreamingResponse(execute);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T extends APIDefinition> String doPost(T message) throws Exception {
        if (message.getFiles() != null && (!r0.isEmpty())) {
            return doMultipartPost(message);
        }
        return doFormPost(message);
    }

    private final <T extends APIDefinition> Flow<Resource<String>> doPostStreaming(T message) throws Exception {
        if (message.getFiles() != null && (!r0.isEmpty())) {
            final Flow<String> doMultipartPostStreaming = doMultipartPostStreaming(message);
            return (Flow) new Flow<Resource<? extends String>>() { // from class: com.glority.network.ApiServer$doPostStreaming$$inlined$map$1

                /* compiled from: Collect.kt */
                @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\t"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$$special$$inlined$collect$5", "kotlinx/coroutines/flow/FlowKt__TransformKt$unsafeTransform$$inlined$unsafeFlow$5$lambda$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 9, 0})
                /* renamed from: com.glority.network.ApiServer$doPostStreaming$$inlined$map$1$2, reason: invalid class name */
                /* loaded from: classes9.dex */
                public static final class AnonymousClass2 implements FlowCollector<String> {
                    final /* synthetic */ FlowCollector $this_unsafeFlow$inlined;
                    final /* synthetic */ ApiServer$doPostStreaming$$inlined$map$1 this$0;

                    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0096@¨\u0006\n"}, d2 = {"emit", "", ExifInterface.GPS_DIRECTION_TRUE, "value", "continuation", "Lkotlin/coroutines/Continuation;", "", "kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3$emit$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$$special$$inlined$collect$5$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$unsafeTransform$$inlined$unsafeFlow$5$lambda$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1"}, k = 3, mv = {1, 9, 0})
                    @DebugMetadata(c = "com.glority.network.ApiServer$doPostStreaming$$inlined$map$1$2", f = "ApiServer.kt", i = {}, l = {TsExtractor.TS_STREAM_TYPE_SPLICE_INFO}, m = "emit", n = {}, s = {})
                    /* renamed from: com.glority.network.ApiServer$doPostStreaming$$inlined$map$1$2$1, reason: invalid class name */
                    /* loaded from: classes9.dex */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        Object L$1;
                        Object L$2;
                        Object L$3;
                        Object L$4;
                        Object L$5;
                        Object L$6;
                        Object L$7;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector, ApiServer$doPostStreaming$$inlined$map$1 apiServer$doPostStreaming$$inlined$map$1) {
                        this.$this_unsafeFlow$inlined = flowCollector;
                        this.this$0 = apiServer$doPostStreaming$$inlined$map$1;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public java.lang.Object emit(java.lang.String r5, kotlin.coroutines.Continuation r6) {
                        /*
                            r4 = this;
                            boolean r0 = r6 instanceof com.glority.network.ApiServer$doPostStreaming$$inlined$map$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L14
                            r0 = r6
                            com.glority.network.ApiServer$doPostStreaming$$inlined$map$1$2$1 r0 = (com.glority.network.ApiServer$doPostStreaming$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r1 = r1 & r2
                            if (r1 == 0) goto L14
                            int r6 = r0.label
                            int r6 = r6 - r2
                            r0.label = r6
                            goto L19
                        L14:
                            com.glority.network.ApiServer$doPostStreaming$$inlined$map$1$2$1 r0 = new com.glority.network.ApiServer$doPostStreaming$$inlined$map$1$2$1
                            r0.<init>(r6)
                        L19:
                            java.lang.Object r6 = r0.result
                            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L32
                            if (r2 != r3) goto L2a
                            kotlin.ResultKt.throwOnFailure(r6)
                            goto L4b
                        L2a:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r6)
                            throw r5
                        L32:
                            kotlin.ResultKt.throwOnFailure(r6)
                            kotlinx.coroutines.flow.FlowCollector r6 = r4.$this_unsafeFlow$inlined
                            r2 = r0
                            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                            java.lang.String r5 = (java.lang.String) r5
                            com.glority.network.model.Resource$Companion r2 = com.glority.network.model.Resource.INSTANCE
                            com.glority.network.model.Resource r5 = r2.success(r5)
                            r0.label = r3
                            java.lang.Object r5 = r6.emit(r5, r0)
                            if (r5 != r1) goto L4b
                            return r1
                        L4b:
                            kotlin.Unit r5 = kotlin.Unit.INSTANCE
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.glority.network.ApiServer$doPostStreaming$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Resource<? extends String>> flowCollector, Continuation continuation) {
                    Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), continuation);
                    return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                }
            };
        }
        final Flow<String> doFormPostStreaming = doFormPostStreaming(message);
        return (Flow) new Flow<Resource<? extends String>>() { // from class: com.glority.network.ApiServer$doPostStreaming$$inlined$map$2

            /* compiled from: Collect.kt */
            @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\t"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$$special$$inlined$collect$5", "kotlinx/coroutines/flow/FlowKt__TransformKt$unsafeTransform$$inlined$unsafeFlow$5$lambda$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 9, 0})
            /* renamed from: com.glority.network.ApiServer$doPostStreaming$$inlined$map$2$2, reason: invalid class name */
            /* loaded from: classes9.dex */
            public static final class AnonymousClass2 implements FlowCollector<String> {
                final /* synthetic */ FlowCollector $this_unsafeFlow$inlined;
                final /* synthetic */ ApiServer$doPostStreaming$$inlined$map$2 this$0;

                @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0096@¨\u0006\n"}, d2 = {"emit", "", ExifInterface.GPS_DIRECTION_TRUE, "value", "continuation", "Lkotlin/coroutines/Continuation;", "", "kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3$emit$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$$special$$inlined$collect$5$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$unsafeTransform$$inlined$unsafeFlow$5$lambda$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1"}, k = 3, mv = {1, 9, 0})
                @DebugMetadata(c = "com.glority.network.ApiServer$doPostStreaming$$inlined$map$2$2", f = "ApiServer.kt", i = {}, l = {TsExtractor.TS_STREAM_TYPE_SPLICE_INFO}, m = "emit", n = {}, s = {})
                /* renamed from: com.glority.network.ApiServer$doPostStreaming$$inlined$map$2$2$1, reason: invalid class name */
                /* loaded from: classes9.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    Object L$5;
                    Object L$6;
                    Object L$7;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, ApiServer$doPostStreaming$$inlined$map$2 apiServer$doPostStreaming$$inlined$map$2) {
                    this.$this_unsafeFlow$inlined = flowCollector;
                    this.this$0 = apiServer$doPostStreaming$$inlined$map$2;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public java.lang.Object emit(java.lang.String r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.glority.network.ApiServer$doPostStreaming$$inlined$map$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L14
                        r0 = r6
                        com.glority.network.ApiServer$doPostStreaming$$inlined$map$2$2$1 r0 = (com.glority.network.ApiServer$doPostStreaming$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r1 = r1 & r2
                        if (r1 == 0) goto L14
                        int r6 = r0.label
                        int r6 = r6 - r2
                        r0.label = r6
                        goto L19
                    L14:
                        com.glority.network.ApiServer$doPostStreaming$$inlined$map$2$2$1 r0 = new com.glority.network.ApiServer$doPostStreaming$$inlined$map$2$2$1
                        r0.<init>(r6)
                    L19:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L32
                        if (r2 != r3) goto L2a
                        kotlin.ResultKt.throwOnFailure(r6)
                        goto L4b
                    L2a:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L32:
                        kotlin.ResultKt.throwOnFailure(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.$this_unsafeFlow$inlined
                        r2 = r0
                        kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                        java.lang.String r5 = (java.lang.String) r5
                        com.glority.network.model.Resource$Companion r2 = com.glority.network.model.Resource.INSTANCE
                        com.glority.network.model.Resource r5 = r2.success(r5)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4b
                        return r1
                    L4b:
                        kotlin.Unit r5 = kotlin.Unit.INSTANCE
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.glority.network.ApiServer$doPostStreaming$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Resource<? extends String>> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        };
    }

    private final <T extends APIDefinition> String doFormPost(T message) throws Exception {
        FormBody.Builder builder = new FormBody.Builder();
        Map<String, Object> params = message.getParams();
        Intrinsics.checkNotNullExpressionValue(params, "getParams(...)");
        for (Map.Entry<String, Object> entry : params.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if ((value instanceof Map) || (value instanceof List)) {
                builder.add(key, new Gson().toJson(value));
            } else if (value instanceof APIModelBase) {
                builder.add(key, new Gson().toJson(((APIModelBase) value).getJsonMap()));
            } else {
                builder.add(key, value.toString());
            }
        }
        FormBody build = builder.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        okhttp3.Response execute = this.internalHttpClient.newCall(new Request.Builder().url(getAPIUrl(message)).post(build).build()).execute();
        if (execute.code() == RequestFailException.ErrorCode.TOO_MANY_REQUESTS.getValue()) {
            logTooManyRequestsErrorEvent(getAPIUrl(message));
            ToastUtils.showShort(R.string.network_text_too_many_requests);
            throw new RequestFailException(message.getClass().getSimpleName(), "too_many_requests", RequestFailException.ErrorCode.TOO_MANY_REQUESTS.getValue());
        }
        ResponseBody body = execute.body();
        Intrinsics.checkNotNull(body);
        String string = body.string();
        ResponseBody body2 = execute.body();
        Intrinsics.checkNotNull(body2);
        body2.close();
        Intrinsics.checkNotNull(string);
        return string;
    }

    private final <T extends APIDefinition> Flow<String> doFormPostStreaming(T message) throws Exception {
        FormBody.Builder builder = new FormBody.Builder();
        Map<String, Object> params = message.getParams();
        Intrinsics.checkNotNullExpressionValue(params, "getParams(...)");
        for (Map.Entry<String, Object> entry : params.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if ((value instanceof Map) || (value instanceof List)) {
                builder.add(key, new Gson().toJson(value));
            } else if (value instanceof APIModelBase) {
                builder.add(key, new Gson().toJson(((APIModelBase) value).getJsonMap()));
            } else {
                builder.add(key, value.toString());
            }
        }
        FormBody build = builder.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        okhttp3.Response execute = this.internalHttpClientWithLongTimeout.newCall(new Request.Builder().url(getAPIUrl(message)).post(build).build()).execute();
        if (execute.code() == RequestFailException.ErrorCode.TOO_MANY_REQUESTS.getValue()) {
            logTooManyRequestsErrorEvent(getAPIUrl(message));
            ToastUtils.showShort(R.string.network_text_too_many_requests);
            throw new RequestFailException(message.getClass().getSimpleName(), "too_many_requests", RequestFailException.ErrorCode.TOO_MANY_REQUESTS.getValue());
        }
        Intrinsics.checkNotNull(execute);
        return processStreamingResponse(execute);
    }

    private final Flow<String> processStreamingResponse(okhttp3.Response response) {
        if (!response.isSuccessful()) {
            StringBuilder append = new StringBuilder("Unexpected code ").append(response.code()).append(", \n").append(response.message()).append(", \n");
            ResponseBody body = response.body();
            throw new IOException(append.append(body != null ? body.string() : null).toString());
        }
        ResponseBody body2 = response.body();
        if (body2 == null) {
            response.close();
            return FlowKt.flow(new ApiServer$processStreamingResponse$1(null));
        }
        return FlowKt.flow(new ApiServer$processStreamingResponse$2(body2.source(), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logApiEvent(long startTs, String apiName, int code) {
        new LogEventRequest("http_request", LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("id", apiName), TuplesKt.to("time", Long.valueOf(System.currentTimeMillis() - startTs)), TuplesKt.to("code", Integer.valueOf(code)))).post();
    }

    private final void logTooManyRequestsErrorEvent(String apiUrl) {
        new LogEventRequest("client_error", LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("error", "too_many_requests"), TuplesKt.to("content", apiUrl))).post();
    }

    /* compiled from: ApiServer.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J)\u0010\u001e\u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u00152\b\u0010 \u001a\u0004\u0018\u00010\u00152\b\u0010!\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\"J)\u0010#\u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u00152\b\u0010 \u001a\u0004\u0018\u00010\u00152\b\u0010!\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\"R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0016R\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0016R\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0016R\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0016R\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0016R\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0016¨\u0006$"}, d2 = {"Lcom/glority/network/ApiServer$Builder;", "", "()V", "enableEncryption", "", "host", "", "getHost$fwk_network_release", "()Ljava/lang/String;", "setHost$fwk_network_release", "(Ljava/lang/String;)V", "internalHttpClient", "Lokhttp3/OkHttpClient;", "getInternalHttpClient$fwk_network_release", "()Lokhttp3/OkHttpClient;", "setInternalHttpClient$fwk_network_release", "(Lokhttp3/OkHttpClient;)V", "internalHttpClientWithLongTimeout", "getInternalHttpClientWithLongTimeout$fwk_network_release", "setInternalHttpClientWithLongTimeout$fwk_network_release", "internalHttpConnectTimeout", "", "Ljava/lang/Long;", "internalHttpReadTimeout", "internalHttpWriteTimeout", "longTimeInternalHttpConnectTimeout", "longTimeInternalHttpReadTimeout", "longTimeInternalHttpWriteTimeout", "build", "Lcom/glority/network/ApiServer;", "setInternalHttpClientWithLongTimeout", "connectTimeout", "writeTimeout", "readTimeout", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Lcom/glority/network/ApiServer$Builder;", "setInternalHttpTimeout", "fwk-network_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes9.dex */
    public static final class Builder {
        private boolean enableEncryption = ApiServer.INSTANCE.getEnableEncryption();
        private String host = "";
        public OkHttpClient internalHttpClient;
        public OkHttpClient internalHttpClientWithLongTimeout;
        private Long internalHttpConnectTimeout;
        private Long internalHttpReadTimeout;
        private Long internalHttpWriteTimeout;
        private Long longTimeInternalHttpConnectTimeout;
        private Long longTimeInternalHttpReadTimeout;
        private Long longTimeInternalHttpWriteTimeout;

        /* renamed from: getHost$fwk_network_release, reason: from getter */
        public final String getHost() {
            return this.host;
        }

        public final void setHost$fwk_network_release(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.host = str;
        }

        public final OkHttpClient getInternalHttpClient$fwk_network_release() {
            OkHttpClient okHttpClient = this.internalHttpClient;
            if (okHttpClient != null) {
                return okHttpClient;
            }
            Intrinsics.throwUninitializedPropertyAccessException("internalHttpClient");
            return null;
        }

        public final void setInternalHttpClient$fwk_network_release(OkHttpClient okHttpClient) {
            Intrinsics.checkNotNullParameter(okHttpClient, "<set-?>");
            this.internalHttpClient = okHttpClient;
        }

        public final OkHttpClient getInternalHttpClientWithLongTimeout$fwk_network_release() {
            OkHttpClient okHttpClient = this.internalHttpClientWithLongTimeout;
            if (okHttpClient != null) {
                return okHttpClient;
            }
            Intrinsics.throwUninitializedPropertyAccessException("internalHttpClientWithLongTimeout");
            return null;
        }

        public final void setInternalHttpClientWithLongTimeout$fwk_network_release(OkHttpClient okHttpClient) {
            Intrinsics.checkNotNullParameter(okHttpClient, "<set-?>");
            this.internalHttpClientWithLongTimeout = okHttpClient;
        }

        public final Builder host(String host) {
            Intrinsics.checkNotNullParameter(host, "host");
            this.host = host;
            return this;
        }

        public final Builder enableEncryption(boolean enableEncryption) {
            this.enableEncryption = enableEncryption;
            return this;
        }

        public final Builder setInternalHttpTimeout(Long connectTimeout, Long writeTimeout, Long readTimeout) {
            this.internalHttpConnectTimeout = connectTimeout;
            this.internalHttpWriteTimeout = writeTimeout;
            this.internalHttpReadTimeout = readTimeout;
            return this;
        }

        public final Builder setInternalHttpClientWithLongTimeout(Long connectTimeout, Long writeTimeout, Long readTimeout) {
            this.longTimeInternalHttpConnectTimeout = connectTimeout;
            this.longTimeInternalHttpWriteTimeout = writeTimeout;
            this.longTimeInternalHttpReadTimeout = readTimeout;
            return this;
        }

        public final ApiServer build() {
            OkHttpClient.Builder defaultInternalHttpClientBuilder = ApiServer.INSTANCE.defaultInternalHttpClientBuilder(this.enableEncryption);
            Long l = this.internalHttpConnectTimeout;
            if (l != null) {
                defaultInternalHttpClientBuilder.connectTimeout(l.longValue(), TimeUnit.SECONDS);
            }
            Long l2 = this.internalHttpWriteTimeout;
            if (l2 != null) {
                defaultInternalHttpClientBuilder.writeTimeout(l2.longValue(), TimeUnit.SECONDS);
            }
            Long l3 = this.internalHttpReadTimeout;
            if (l3 != null) {
                defaultInternalHttpClientBuilder.readTimeout(l3.longValue(), TimeUnit.SECONDS);
            }
            OkHttpClient build = defaultInternalHttpClientBuilder.build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            setInternalHttpClient$fwk_network_release(build);
            OkHttpClient.Builder defaultInternalHttpClientWithLongTimeoutBuilder = ApiServer.INSTANCE.defaultInternalHttpClientWithLongTimeoutBuilder(this.enableEncryption);
            Long l4 = this.longTimeInternalHttpConnectTimeout;
            if (l4 != null) {
                defaultInternalHttpClientWithLongTimeoutBuilder.connectTimeout(l4.longValue(), TimeUnit.SECONDS);
            }
            Long l5 = this.longTimeInternalHttpWriteTimeout;
            if (l5 != null) {
                defaultInternalHttpClientWithLongTimeoutBuilder.writeTimeout(l5.longValue(), TimeUnit.SECONDS);
            }
            Long l6 = this.longTimeInternalHttpReadTimeout;
            if (l6 != null) {
                defaultInternalHttpClientWithLongTimeoutBuilder.readTimeout(l6.longValue(), TimeUnit.SECONDS);
            }
            OkHttpClient build2 = defaultInternalHttpClientWithLongTimeoutBuilder.build();
            Intrinsics.checkNotNullExpressionValue(build2, "build(...)");
            setInternalHttpClientWithLongTimeout$fwk_network_release(build2);
            return new ApiServer(this, null);
        }
    }

    /* compiled from: ApiServer.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0013\u001a\u00020\u0014\"\b\b\u0000\u0010\u0015*\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0011J\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0005J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR.\u0010\u0010\u001a\"\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u00110\u0004j\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u0011`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/glority/network/ApiServer$Companion;", "", "()V", "customInterceptors", "Ljava/util/LinkedHashSet;", "Lokhttp3/Interceptor;", "Lkotlin/collections/LinkedHashSet;", "enableEncryption", "", "getEnableEncryption", "()Z", "setEnableEncryption", "(Z)V", "enableNetworkTracker", "getEnableNetworkTracker", "setEnableNetworkTracker", "eventListeners", "Ljava/lang/Class;", "Lcom/glority/network/eventListener/BaseEventListener;", "addEventListener", "", ExifInterface.GPS_DIRECTION_TRUE, "eventListener", "addInterceptor", "interceptor", "defaultInternalHttpClientBuilder", "Lokhttp3/OkHttpClient$Builder;", "defaultInternalHttpClientWithLongTimeoutBuilder", "fwk-network_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes9.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean getEnableEncryption() {
            return ApiServer.enableEncryption;
        }

        public final void setEnableEncryption(boolean z) {
            ApiServer.enableEncryption = z;
        }

        public final boolean getEnableNetworkTracker() {
            return ApiServer.enableNetworkTracker;
        }

        public final void setEnableNetworkTracker(boolean z) {
            ApiServer.enableNetworkTracker = z;
        }

        public final void addInterceptor(Interceptor interceptor) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            ApiServer.customInterceptors.add(interceptor);
        }

        public final <T extends BaseEventListener> void addEventListener(Class<T> eventListener) {
            Intrinsics.checkNotNullParameter(eventListener, "eventListener");
            ApiServer.eventListeners.add(eventListener);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final OkHttpClient.Builder defaultInternalHttpClientBuilder(boolean enableEncryption) {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            Iterator it = ApiServer.customInterceptors.iterator();
            while (it.hasNext()) {
                builder.addInterceptor((Interceptor) it.next());
            }
            HashSet hashSet = new HashSet();
            hashSet.add(PrintingEventListener.class);
            if (!ApiServer.eventListeners.isEmpty()) {
                hashSet.addAll(ApiServer.eventListeners);
            }
            builder.eventListenerFactory(new EventListenerFactory(hashSet));
            builder.protocols(CollectionsKt.listOf((Object[]) new Protocol[]{Protocol.HTTP_1_1, Protocol.HTTP_2})).addInterceptor(new LoggingInterceptor()).addInterceptor(new ParseInterceptor(enableEncryption));
            return builder;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final OkHttpClient.Builder defaultInternalHttpClientWithLongTimeoutBuilder(boolean enableEncryption) {
            OkHttpClient.Builder readTimeout = new OkHttpClient.Builder().connectTimeout(30L, TimeUnit.SECONDS).writeTimeout(30L, TimeUnit.SECONDS).readTimeout(30L, TimeUnit.SECONDS);
            Iterator it = ApiServer.customInterceptors.iterator();
            while (it.hasNext()) {
                readTimeout.addInterceptor((Interceptor) it.next());
            }
            HashSet hashSet = new HashSet();
            hashSet.add(PrintingEventListener.class);
            if (!ApiServer.eventListeners.isEmpty()) {
                hashSet.addAll(ApiServer.eventListeners);
            }
            readTimeout.eventListenerFactory(new EventListenerFactory(hashSet));
            readTimeout.protocols(CollectionsKt.listOf((Object[]) new Protocol[]{Protocol.HTTP_1_1, Protocol.HTTP_2})).addInterceptor(new LoggingInterceptor()).addInterceptor(new ParseInterceptor(enableEncryption));
            Intrinsics.checkNotNull(readTimeout);
            return readTimeout;
        }
    }
}

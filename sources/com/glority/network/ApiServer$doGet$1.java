package com.glority.network;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import com.glority.network.exception.RequestFailException;
import com.glority.network.model.NetworkMode;
import com.glority.network.model.Resource;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.ResponseBody;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ApiServer.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "com.glority.network.ApiServer$doGet$1", f = "ApiServer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class ApiServer$doGet$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $messageName;
    final /* synthetic */ Map<String, String> $params;
    final /* synthetic */ MutableLiveData<Resource<String>> $result;
    final /* synthetic */ long $startTs;
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ ApiServer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiServer$doGet$1(String str, MutableLiveData<Resource<String>> mutableLiveData, String str2, Map<String, String> map, ApiServer apiServer, long j, Continuation<? super ApiServer$doGet$1> continuation) {
        super(2, continuation);
        this.$url = str;
        this.$result = mutableLiveData;
        this.$messageName = str2;
        this.$params = map;
        this.this$0 = apiServer;
        this.$startTs = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ApiServer$doGet$1(this.$url, this.$result, this.$messageName, this.$params, this.this$0, this.$startTs, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ApiServer$doGet$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OkHttpClient okHttpClient;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        HttpUrl parse = HttpUrl.parse(this.$url);
        HttpUrl.Builder newBuilder = parse != null ? parse.newBuilder() : null;
        if (newBuilder == null) {
            this.$result.postValue(Resource.INSTANCE.error(this.$messageName, null, new RequestFailException(this.$messageName, "empty url", RequestFailException.ErrorCode.HTTP_ILLEGAL_ARGUMENT.getValue())));
            return Unit.INSTANCE;
        }
        Map<String, String> map = this.$params;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                newBuilder.addQueryParameter(entry.getKey(), entry.getValue());
            }
        }
        Request build = new Request.Builder().url(newBuilder.build()).build();
        try {
            okHttpClient = this.this$0.internalHttpClient;
            okhttp3.Response execute = okHttpClient.newCall(build).execute();
            ResponseBody body = execute.body();
            Intrinsics.checkNotNull(body);
            String string = body.string();
            ResponseBody body2 = execute.body();
            Intrinsics.checkNotNull(body2);
            body2.close();
            this.$result.postValue(Resource.INSTANCE.success(string));
        } catch (SocketTimeoutException e) {
            NetworkTracker.INSTANCE.getNetworkMode().postValue(NetworkMode.NO_INTERNET);
            this.this$0.logApiEvent(this.$startTs, this.$url, RequestFailException.ErrorCode.NO_INTERNET.getValue());
            RequestFailException requestFailException = new RequestFailException(this.$messageName, e.getMessage(), RequestFailException.ErrorCode.HTTP_IO.getValue());
            this.$result.postValue(Resource.INSTANCE.error(requestFailException.getMessage(), "Request timeout.", requestFailException));
        } catch (IOException e2) {
            RequestFailException requestFailException2 = new RequestFailException(this.$messageName, e2.getMessage(), RequestFailException.ErrorCode.HTTP_IO.getValue());
            this.$result.postValue(Resource.INSTANCE.error(requestFailException2.getMessage(), null, requestFailException2));
        } catch (Exception e3) {
            RequestFailException requestFailException3 = new RequestFailException(this.$messageName, e3.getMessage(), RequestFailException.ErrorCode.INTERNAL_ERROR.getValue());
            this.$result.postValue(Resource.INSTANCE.error(requestFailException3.getMessage(), null, requestFailException3));
        }
        return Unit.INSTANCE;
    }
}

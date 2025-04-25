package com.glority.network;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.MutableLiveData;
import com.glority.android.core.definition.APIDefinition;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.glority.android.xx.constants.LogEvents;
import com.glority.network.exception.APIException;
import com.glority.network.exception.RequestFailException;
import com.glority.network.model.NetworkMode;
import com.glority.network.model.Resource;
import com.glority.network.util.ParseResultUtils;
import com.glority.utils.stability.LogUtils;
import java.io.IOException;
import java.net.SocketTimeoutException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONException;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Incorrect field signature: TT; */
/* compiled from: ApiServer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/glority/android/core/definition/APIDefinition;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "com.glority.network.ApiServer$sendMessage$1", f = "ApiServer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class ApiServer$sendMessage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ APIDefinition $message;
    final /* synthetic */ String $messageName;
    final /* synthetic */ MutableLiveData<Resource<T>> $result;
    final /* synthetic */ long $startTs;
    int label;
    final /* synthetic */ ApiServer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (TT;Lcom/glority/network/ApiServer;JLjava/lang/String;Landroidx/lifecycle/MutableLiveData<Lcom/glority/network/model/Resource<TT;>;>;Lkotlin/coroutines/Continuation<-Lcom/glority/network/ApiServer$sendMessage$1;>;)V */
    public ApiServer$sendMessage$1(APIDefinition aPIDefinition, ApiServer apiServer, long j, String str, MutableLiveData mutableLiveData, Continuation continuation) {
        super(2, continuation);
        this.$message = aPIDefinition;
        this.this$0 = apiServer;
        this.$startTs = j;
        this.$messageName = str;
        this.$result = mutableLiveData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ApiServer$sendMessage$1(this.$message, this.this$0, this.$startTs, this.$messageName, this.$result, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ApiServer$sendMessage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Resource error;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        String str = "";
        try {
            String[] methods = this.$message.methods();
            Intrinsics.checkNotNullExpressionValue(methods, "methods(...)");
            int length = methods.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                String str2 = methods[i];
                if (StringsKt.equals(str2, "post", true)) {
                    str = this.this$0.doPost(this.$message);
                    break;
                }
                if (StringsKt.equals(str2, LogEvents.exportemptyalert_close_click_type_get, true)) {
                    str = this.this$0.doGet(this.$message);
                    break;
                }
                i++;
            }
            LogUtils.json(str);
            ParseResultUtils.INSTANCE.parseResult$fwk_network_release(str, this.$message);
            ApiServer apiServer = this.this$0;
            long j = this.$startTs;
            String api = this.$message.api();
            Intrinsics.checkNotNullExpressionValue(api, "api(...)");
            apiServer.logApiEvent(j, api, 0);
            error = Resource.INSTANCE.success(this.$message);
        } catch (ParameterCheckFailException e) {
            ApiServer apiServer2 = this.this$0;
            long j2 = this.$startTs;
            String api2 = this.$message.api();
            Intrinsics.checkNotNullExpressionValue(api2, "api(...)");
            apiServer2.logApiEvent(j2, api2, RequestFailException.ErrorCode.ILLEGAL_API_ARGUMENT.getValue());
            RequestFailException requestFailException = new RequestFailException(this.$messageName, e.getMessage(), RequestFailException.ErrorCode.ILLEGAL_API_ARGUMENT.getValue());
            error = Resource.INSTANCE.error(requestFailException.getMessage(), this.$message, requestFailException);
        } catch (APIException e2) {
            ApiServer apiServer3 = this.this$0;
            long j3 = this.$startTs;
            String api3 = this.$message.api();
            Intrinsics.checkNotNullExpressionValue(api3, "api(...)");
            apiServer3.logApiEvent(j3, api3, e2.getCode());
            error = Resource.INSTANCE.error(e2.getMessage(), this.$message, e2);
        } catch (RequestFailException e3) {
            ApiServer apiServer4 = this.this$0;
            long j4 = this.$startTs;
            String api4 = this.$message.api();
            Intrinsics.checkNotNullExpressionValue(api4, "api(...)");
            apiServer4.logApiEvent(j4, api4, e3.getCode());
            error = Resource.INSTANCE.error(e3.getMessage(), this.$message, e3);
        } catch (IOException e4) {
            ApiServer apiServer5 = this.this$0;
            long j5 = this.$startTs;
            String api5 = this.$message.api();
            Intrinsics.checkNotNullExpressionValue(api5, "api(...)");
            apiServer5.logApiEvent(j5, api5, RequestFailException.ErrorCode.HTTP_IO.getValue());
            RequestFailException requestFailException2 = new RequestFailException(this.$messageName, e4.getMessage(), RequestFailException.ErrorCode.HTTP_IO.getValue());
            error = Resource.INSTANCE.error(requestFailException2.getMessage(), this.$message, requestFailException2);
        } catch (IllegalArgumentException e5) {
            ApiServer apiServer6 = this.this$0;
            long j6 = this.$startTs;
            String api6 = this.$message.api();
            Intrinsics.checkNotNullExpressionValue(api6, "api(...)");
            apiServer6.logApiEvent(j6, api6, RequestFailException.ErrorCode.HTTP_ILLEGAL_ARGUMENT.getValue());
            RequestFailException requestFailException3 = new RequestFailException(this.$messageName, e5.getMessage(), RequestFailException.ErrorCode.HTTP_ILLEGAL_ARGUMENT.getValue());
            error = Resource.INSTANCE.error(requestFailException3.getMessage(), this.$message, requestFailException3);
        } catch (IllegalStateException e6) {
            ApiServer apiServer7 = this.this$0;
            long j7 = this.$startTs;
            String api7 = this.$message.api();
            Intrinsics.checkNotNullExpressionValue(api7, "api(...)");
            apiServer7.logApiEvent(j7, api7, RequestFailException.ErrorCode.HTTP_ILLEGAL_STATE.getValue());
            RequestFailException requestFailException4 = new RequestFailException(this.$messageName, e6.getMessage(), RequestFailException.ErrorCode.HTTP_ILLEGAL_STATE.getValue());
            error = Resource.INSTANCE.error(requestFailException4.getMessage(), this.$message, requestFailException4);
        } catch (SocketTimeoutException e7) {
            NetworkTracker.INSTANCE.getNetworkMode().postValue(NetworkMode.NO_INTERNET);
            ApiServer apiServer8 = this.this$0;
            long j8 = this.$startTs;
            String api8 = this.$message.api();
            Intrinsics.checkNotNullExpressionValue(api8, "api(...)");
            apiServer8.logApiEvent(j8, api8, RequestFailException.ErrorCode.NO_INTERNET.getValue());
            RequestFailException requestFailException5 = new RequestFailException(this.$messageName, e7.getMessage(), RequestFailException.ErrorCode.HTTP_IO.getValue());
            error = Resource.INSTANCE.error(requestFailException5.getMessage(), this.$message, requestFailException5);
        } catch (JSONException e8) {
            ApiServer apiServer9 = this.this$0;
            long j9 = this.$startTs;
            String api9 = this.$message.api();
            Intrinsics.checkNotNullExpressionValue(api9, "api(...)");
            apiServer9.logApiEvent(j9, api9, RequestFailException.ErrorCode.INVALID_RESPONSE.getValue());
            RequestFailException requestFailException6 = new RequestFailException(this.$messageName, e8.getMessage(), RequestFailException.ErrorCode.INVALID_RESPONSE.getValue());
            error = Resource.INSTANCE.error(requestFailException6.getMessage(), this.$message, requestFailException6);
        } catch (Exception e9) {
            ApiServer apiServer10 = this.this$0;
            long j10 = this.$startTs;
            String api10 = this.$message.api();
            Intrinsics.checkNotNullExpressionValue(api10, "api(...)");
            apiServer10.logApiEvent(j10, api10, RequestFailException.ErrorCode.INTERNAL_ERROR.getValue());
            RequestFailException requestFailException7 = new RequestFailException(this.$messageName, e9.getMessage(), RequestFailException.ErrorCode.INTERNAL_ERROR.getValue());
            error = Resource.INSTANCE.error(requestFailException7.getMessage(), this.$message, requestFailException7);
        }
        error.setOriginalServerJson(str);
        this.$result.postValue(error);
        return Unit.INSTANCE;
    }
}

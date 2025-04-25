package com.glority.network;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import com.glority.network.exception.RequestFailException;
import com.glority.network.model.Resource;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ApiServer.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "com.glority.network.ApiServer$download$1", f = "ApiServer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class ApiServer$download$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $filePath;
    final /* synthetic */ MutableLiveData<Resource<File>> $result;
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ ApiServer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiServer$download$1(ApiServer apiServer, String str, String str2, MutableLiveData<Resource<File>> mutableLiveData, Continuation<? super ApiServer$download$1> continuation) {
        super(2, continuation);
        this.this$0 = apiServer;
        this.$url = str;
        this.$filePath = str2;
        this.$result = mutableLiveData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ApiServer$download$1(this.this$0, this.$url, this.$filePath, this.$result, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ApiServer$download$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        File doGet;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                doGet = this.this$0.doGet(this.$url, this.$filePath);
                this.$result.postValue(Resource.INSTANCE.success(doGet));
            } catch (IOException e) {
                RequestFailException requestFailException = new RequestFailException("download: " + this.$url, e.getMessage(), RequestFailException.ErrorCode.HTTP_IO.getValue());
                this.$result.postValue(Resource.INSTANCE.error(requestFailException.getMessage(), null, requestFailException));
            } catch (Exception e2) {
                RequestFailException requestFailException2 = new RequestFailException("download: " + this.$url, e2.getMessage(), RequestFailException.ErrorCode.INTERNAL_ERROR.getValue());
                this.$result.postValue(Resource.INSTANCE.error(requestFailException2.getMessage(), null, requestFailException2));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

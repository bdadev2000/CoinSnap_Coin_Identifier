package com.glority.android.datareader;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.MutableLiveData;
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

/* compiled from: TSVReader.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
@DebugMetadata(c = "com.glority.android.datareader.TSVReader$queryOneAsync$1", f = "TSVReader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class TSVReader$queryOneAsync$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $contains;
    final /* synthetic */ String $keyword;
    final /* synthetic */ MutableLiveData $liveData;
    final /* synthetic */ String $rowName;
    int label;
    final /* synthetic */ TSVReader this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TSVReader$queryOneAsync$1(TSVReader tSVReader, MutableLiveData mutableLiveData, String str, String str2, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = tSVReader;
        this.$liveData = mutableLiveData;
        this.$rowName = str;
        this.$keyword = str2;
        this.$contains = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        return new TSVReader$queryOneAsync$1(this.this$0, this.$liveData, this.$rowName, this.$keyword, this.$contains, completion);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TSVReader$queryOneAsync$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$liveData.postValue(this.this$0.queryOneSync(this.$rowName, this.$keyword, this.$contains));
        return Unit.INSTANCE;
    }
}

package com.glority.network;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.location.LocationRequestCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.MutableLiveData;
import com.glority.android.core.definition.APIDefinition;
import com.glority.network.cache.NetworkFileCache;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* JADX WARN: Incorrect field signature: TT; */
/* compiled from: CacheableApiServer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/glority/android/core/definition/APIDefinition;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "com.glority.network.CacheableApiServerKt$sendMessage$1", f = "CacheableApiServer.kt", i = {0, 1}, l = {LocationRequestCompat.QUALITY_LOW_POWER, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR}, m = "invokeSuspend", n = {"networkJob", "cache"}, s = {"L$0", "L$0"})
/* loaded from: classes9.dex */
final class CacheableApiServerKt$sendMessage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableLiveData<Response<T>> $liveData;
    final /* synthetic */ APIDefinition $message;
    final /* synthetic */ RequestType $requestType;
    final /* synthetic */ ApiServer $this_sendMessage;
    private /* synthetic */ Object L$0;
    int label;

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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lcom/glority/network/RequestType;Landroidx/lifecycle/MutableLiveData<Lcom/glority/network/Response<TT;>;>;Lcom/glority/network/ApiServer;TT;Lkotlin/coroutines/Continuation<-Lcom/glority/network/CacheableApiServerKt$sendMessage$1;>;)V */
    public CacheableApiServerKt$sendMessage$1(RequestType requestType, MutableLiveData mutableLiveData, ApiServer apiServer, APIDefinition aPIDefinition, Continuation continuation) {
        super(2, continuation);
        this.$requestType = requestType;
        this.$liveData = mutableLiveData;
        this.$this_sendMessage = apiServer;
        this.$message = aPIDefinition;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CacheableApiServerKt$sendMessage$1 cacheableApiServerKt$sendMessage$1 = new CacheableApiServerKt$sendMessage$1(this.$requestType, this.$liveData, this.$this_sendMessage, this.$message, continuation);
        cacheableApiServerKt$sendMessage$1.L$0 = obj;
        return cacheableApiServerKt$sendMessage$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CacheableApiServerKt$sendMessage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Deferred async$default;
        Deferred async$default2;
        Deferred deferred;
        NetworkFileCache networkFileCache;
        Response messageCache;
        Response response;
        Response response2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            int i2 = WhenMappings.$EnumSwitchMapping$0[this.$requestType.ordinal()];
            if (i2 == 1) {
                this.$liveData.postValue(CacheableApiServerKt.sendMessageBlocking(this.$this_sendMessage, this.$message, this.$requestType));
            } else if (i2 == 2) {
                this.$liveData.postValue(CacheableApiServerKt.sendMessageBlocking(this.$this_sendMessage, this.$message, this.$requestType));
            } else if (i2 == 3) {
                async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CacheableApiServerKt$sendMessage$1$cacheJob$1(this.$message, null), 3, null);
                async$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CacheableApiServerKt$sendMessage$1$networkJob$1(this.$this_sendMessage, this.$message, null), 3, null);
                this.L$0 = async$default2;
                this.label = 1;
                Object await = async$default.await(this);
                if (await == coroutine_suspended) {
                    return coroutine_suspended;
                }
                deferred = async$default2;
                obj = await;
            } else if (i2 == 4) {
                Response sendMessageBlocking = CacheableApiServerKt.sendMessageBlocking(this.$this_sendMessage, this.$message, RequestType.NETWORK_ONLY);
                if (sendMessageBlocking.isSuccess()) {
                    this.$liveData.postValue(sendMessageBlocking);
                } else {
                    APIDefinition aPIDefinition = this.$message;
                    networkFileCache = CacheableApiServerKt.fileCache;
                    messageCache = CacheableApiServerKt.getMessageCache(aPIDefinition, networkFileCache);
                    if (messageCache != null && messageCache.isSuccess()) {
                        this.$liveData.postValue(messageCache);
                    } else {
                        this.$liveData.postValue(sendMessageBlocking);
                    }
                }
            } else if (i2 == 5) {
                this.$liveData.postValue(CacheableApiServerKt.sendMessageBlocking(this.$this_sendMessage, this.$message, this.$requestType));
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            response = (Response) this.L$0;
            ResultKt.throwOnFailure(obj);
            response2 = (Response) obj;
            if (!response2.isSuccess() || response == null) {
                this.$liveData.postValue(response2);
            }
            return Unit.INSTANCE;
        }
        deferred = (Deferred) this.L$0;
        ResultKt.throwOnFailure(obj);
        Response response3 = (Response) obj;
        if (response3 != null && response3.isSuccess()) {
            this.$liveData.postValue(response3);
        }
        this.L$0 = response3;
        this.label = 2;
        Object await2 = deferred.await(this);
        if (await2 == coroutine_suspended) {
            return coroutine_suspended;
        }
        response = response3;
        obj = await2;
        response2 = (Response) obj;
        if (!response2.isSuccess()) {
        }
        this.$liveData.postValue(response2);
        return Unit.INSTANCE;
    }
}

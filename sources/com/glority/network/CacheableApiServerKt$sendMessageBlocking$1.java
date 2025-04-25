package com.glority.network;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
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
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Incorrect field signature: TT; */
/* compiled from: CacheableApiServer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/glority/android/core/definition/APIDefinition;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "com.glority.network.CacheableApiServerKt$sendMessageBlocking$1", f = "CacheableApiServer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class CacheableApiServerKt$sendMessageBlocking$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ APIDefinition $message;
    final /* synthetic */ ApiServer $this_sendMessageBlocking;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lcom/glority/network/ApiServer;TT;Lkotlin/coroutines/Continuation<-Lcom/glority/network/CacheableApiServerKt$sendMessageBlocking$1;>;)V */
    public CacheableApiServerKt$sendMessageBlocking$1(ApiServer apiServer, APIDefinition aPIDefinition, Continuation continuation) {
        super(2, continuation);
        this.$this_sendMessageBlocking = apiServer;
        this.$message = aPIDefinition;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CacheableApiServerKt$sendMessageBlocking$1(this.$this_sendMessageBlocking, this.$message, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CacheableApiServerKt$sendMessageBlocking$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        NetworkFileCache networkFileCache;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ApiServer apiServer = this.$this_sendMessageBlocking;
        APIDefinition aPIDefinition = this.$message;
        networkFileCache = CacheableApiServerKt.fileCache;
        CacheableApiServerKt.sendMessageAndUpdateCache(apiServer, aPIDefinition, networkFileCache);
        return Unit.INSTANCE;
    }
}

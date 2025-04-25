package com.glority.android.picturexx.vm;

import com.glority.android.core.route.analysis.GetLongIdRequest;
import com.glority.android.xx.constants.Args;
import com.glority.base.viewmodel.BaseViewModel;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.picturecoin.generatedAPI.kotlinAPI.chatbot.MessageDataEvent;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.json.JSONObject;

/* compiled from: GradingDetailViewModel.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0087@¢\u0006\u0002\u0010\u0013J\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0087@¢\u0006\u0002\u0010\u0017JJ\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u00192\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u00162\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020!0 H\u0087@¢\u0006\u0002\u0010\"J\u0018\u0010#\u001a\u0004\u0018\u00010\u00162\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00160%H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0007\"\u0004\b\u0010\u0010\t¨\u0006&"}, d2 = {"Lcom/glority/android/picturexx/vm/GradingDetailViewModel;", "Lcom/glority/base/viewmodel/BaseViewModel;", "<init>", "()V", "hasRequestedGpt", "", "getHasRequestedGpt", "()Z", "setHasRequestedGpt", "(Z)V", "streamingResponse", "Ljava/lang/StringBuilder;", "getStreamingResponse", "()Ljava/lang/StringBuilder;", "hasJudged", "getHasJudged", "setHasJudged", "getItemId", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSessionId", Args.sessionType, "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGradingDetailGPT4oStreamMessage", "Lkotlinx/coroutines/flow/Flow;", Args.sessionId, RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "messageContents", Args.extraFields, "", "", "(JLcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processStreamingResponseData", "resource", "Lcom/glority/network/model/Resource;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class GradingDetailViewModel extends BaseViewModel {
    public static final int $stable = 8;
    private boolean hasJudged;
    private boolean hasRequestedGpt;
    private final StringBuilder streamingResponse = new StringBuilder();

    public final boolean getHasRequestedGpt() {
        return this.hasRequestedGpt;
    }

    public final void setHasRequestedGpt(boolean z) {
        this.hasRequestedGpt = z;
    }

    public final StringBuilder getStreamingResponse() {
        return this.streamingResponse;
    }

    public final boolean getHasJudged() {
        return this.hasJudged;
    }

    public final void setHasJudged(boolean z) {
        this.hasJudged = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getSessionId(java.lang.String r6, kotlin.coroutines.Continuation<? super java.lang.Long> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.glority.android.picturexx.vm.GradingDetailViewModel$getSessionId$1
            if (r0 == 0) goto L14
            r0 = r7
            com.glority.android.picturexx.vm.GradingDetailViewModel$getSessionId$1 r0 = (com.glority.android.picturexx.vm.GradingDetailViewModel$getSessionId$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L19
        L14:
            com.glority.android.picturexx.vm.GradingDetailViewModel$getSessionId$1 r0 = new com.glority.android.picturexx.vm.GradingDetailViewModel$getSessionId$1
            r0.<init>(r5, r7)
        L19:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.throwOnFailure(r7)
            goto L56
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.ResultKt.throwOnFailure(r7)
            r7 = r6
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            int r7 = r7.length()
            if (r7 != 0) goto L40
            return r4
        L40:
            kotlinx.coroutines.CoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getIO()
            kotlin.coroutines.CoroutineContext r7 = (kotlin.coroutines.CoroutineContext) r7
            com.glority.android.picturexx.vm.GradingDetailViewModel$getSessionId$resource$1 r2 = new com.glority.android.picturexx.vm.GradingDetailViewModel$getSessionId$resource$1
            r2.<init>(r6, r4)
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            r0.label = r3
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r2, r0)
            if (r7 != r1) goto L56
            return r1
        L56:
            com.glority.network.model.Resource r7 = (com.glority.network.model.Resource) r7
            com.glority.network.model.Status r6 = r7.getStatus()
            com.glority.network.model.Status r0 = com.glority.network.model.Status.SUCCESS
            if (r6 != r0) goto L70
            java.lang.Object r6 = r7.getData()
            com.picturecoin.generatedAPI.kotlinAPI.chatbot.CreateSessionMessage r6 = (com.picturecoin.generatedAPI.kotlinAPI.chatbot.CreateSessionMessage) r6
            if (r6 == 0) goto L70
            long r6 = r6.getSessionId()
            java.lang.Long r4 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r6)
        L70:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.vm.GradingDetailViewModel.getSessionId(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getGradingDetailGPT4oStreamMessage(long r16, com.glority.component.generatedAPI.kotlinAPI.enums.LanguageCode r18, java.lang.String r19, java.lang.String r20, java.util.Map<java.lang.String, ? extends java.lang.Object> r21, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<java.lang.String>> r22) {
        /*
            r15 = this;
            r0 = r22
            boolean r1 = r0 instanceof com.glority.android.picturexx.vm.GradingDetailViewModel$getGradingDetailGPT4oStreamMessage$1
            if (r1 == 0) goto L17
            r1 = r0
            com.glority.android.picturexx.vm.GradingDetailViewModel$getGradingDetailGPT4oStreamMessage$1 r1 = (com.glority.android.picturexx.vm.GradingDetailViewModel$getGradingDetailGPT4oStreamMessage$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L17
            int r0 = r1.label
            int r0 = r0 - r3
            r1.label = r0
            r11 = r15
            goto L1d
        L17:
            com.glority.android.picturexx.vm.GradingDetailViewModel$getGradingDetailGPT4oStreamMessage$1 r1 = new com.glority.android.picturexx.vm.GradingDetailViewModel$getGradingDetailGPT4oStreamMessage$1
            r11 = r15
            r1.<init>(r15, r0)
        L1d:
            java.lang.Object r0 = r1.result
            java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r1.label
            r13 = 1
            if (r2 == 0) goto L36
            if (r2 != r13) goto L2e
            kotlin.ResultKt.throwOnFailure(r0)
            goto L5c
        L2e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L36:
            kotlin.ResultKt.throwOnFailure(r0)
            kotlinx.coroutines.CoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.getIO()
            kotlin.coroutines.CoroutineContext r0 = (kotlin.coroutines.CoroutineContext) r0
            com.glority.android.picturexx.vm.GradingDetailViewModel$getGradingDetailGPT4oStreamMessage$resourceFlow$1 r14 = new com.glority.android.picturexx.vm.GradingDetailViewModel$getGradingDetailGPT4oStreamMessage$resourceFlow$1
            r10 = 0
            r2 = r14
            r3 = r16
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r15
            r2.<init>(r3, r5, r6, r7, r8, r9, r10)
            kotlin.jvm.functions.Function2 r14 = (kotlin.jvm.functions.Function2) r14
            r1.label = r13
            java.lang.Object r0 = kotlinx.coroutines.BuildersKt.withContext(r0, r14, r1)
            if (r0 != r12) goto L5c
            return r12
        L5c:
            kotlinx.coroutines.flow.Flow r0 = (kotlinx.coroutines.flow.Flow) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.vm.GradingDetailViewModel.getGradingDetailGPT4oStreamMessage(long, com.glority.component.generatedAPI.kotlinAPI.enums.LanguageCode, java.lang.String, java.lang.String, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String processStreamingResponseData(Resource<String> resource) throws Exception {
        String data;
        if (resource.getStatus() != Status.SUCCESS || (data = resource.getData()) == null) {
            return null;
        }
        try {
            return new MessageDataEvent(new JSONObject(StringsKt.substringAfter$default(data, "data:", (String) null, 2, (Object) null))).getData().getContent();
        } catch (Exception unused) {
            return null;
        }
    }

    public final Object getItemId(Continuation<? super Long> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        new GetLongIdRequest().subscribe(new Consumer() { // from class: com.glority.android.picturexx.vm.GradingDetailViewModel$getItemId$2$1
            @Override // io.reactivex.functions.Consumer
            public /* bridge */ /* synthetic */ void accept(Object obj) {
                accept(((Number) obj).longValue());
            }

            public final void accept(long j) {
                if (cancellableContinuationImpl2.isCancelled() || !cancellableContinuationImpl2.isActive()) {
                    return;
                }
                Long valueOf = Long.valueOf(j);
                CancellableContinuation<Long> cancellableContinuation = cancellableContinuationImpl2;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m8274constructorimpl(valueOf));
            }
        }, new Consumer() { // from class: com.glority.android.picturexx.vm.GradingDetailViewModel$getItemId$2$2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Throwable e) {
                Intrinsics.checkNotNullParameter(e, "e");
                if (cancellableContinuationImpl2.isCancelled() || !cancellableContinuationImpl2.isActive()) {
                    return;
                }
                CancellableContinuation<Long> cancellableContinuation = cancellableContinuationImpl2;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m8274constructorimpl(null));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}

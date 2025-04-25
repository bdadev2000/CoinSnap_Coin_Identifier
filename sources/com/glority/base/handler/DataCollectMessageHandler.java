package com.glority.base.handler;

import com.glority.android.core.route.RouteHandler;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.core.route.analysis.DataCollectMessageRequest;
import com.glority.android.core.route.analysis.UrlTracking;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;

/* compiled from: DataCollectMessageHandler.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0082@¢\u0006\u0002\u0010\fJ\u0016\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/glority/base/handler/DataCollectMessageHandler;", "Lcom/glority/android/core/route/RouteHandler;", "", "<init>", "()V", "url", "", "getUrl", "()Ljava/lang/String;", "delayGetAdjustId", "count", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "post", "", "request", "Lcom/glority/android/core/route/RouteRequest;", "Companion", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class DataCollectMessageHandler implements RouteHandler<Boolean> {
    public static final int $stable = 0;
    public static final String TAG = "DataCollectMessageHandler";

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.glority.android.core.route.RouteHandler
    public Boolean execute(RouteRequest<Boolean> routeRequest) {
        return (Boolean) RouteHandler.DefaultImpls.execute(this, routeRequest);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public Observable<?> getDependency() {
        return RouteHandler.DefaultImpls.getDependency(this);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public String getUrl() {
        return UrlTracking.INSTANCE.getURL_DATA_COLLECT_MESSAGE();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object delayGetAdjustId(int r8, kotlin.coroutines.Continuation<? super java.lang.String> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.glority.base.handler.DataCollectMessageHandler$delayGetAdjustId$1
            if (r0 == 0) goto L14
            r0 = r9
            com.glority.base.handler.DataCollectMessageHandler$delayGetAdjustId$1 r0 = (com.glority.base.handler.DataCollectMessageHandler$delayGetAdjustId$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.label
            int r9 = r9 - r2
            r0.label = r9
            goto L19
        L14:
            com.glority.base.handler.DataCollectMessageHandler$delayGetAdjustId$1 r0 = new com.glority.base.handler.DataCollectMessageHandler$delayGetAdjustId$1
            r0.<init>(r7, r9)
        L19:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.throwOnFailure(r9)
            goto L77
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            int r8 = r0.I$0
            java.lang.Object r2 = r0.L$0
            com.glority.base.handler.DataCollectMessageHandler r2 = (com.glority.base.handler.DataCollectMessageHandler) r2
            kotlin.ResultKt.throwOnFailure(r9)
            goto L52
        L3f:
            kotlin.ResultKt.throwOnFailure(r9)
            r0.L$0 = r7
            r0.I$0 = r8
            r0.label = r4
            r5 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r9 = kotlinx.coroutines.DelayKt.delay(r5, r0)
            if (r9 != r1) goto L51
            return r1
        L51:
            r2 = r7
        L52:
            com.glority.android.core.route.adjust.GetAdjustIdRequest r9 = new com.glority.android.core.route.adjust.GetAdjustIdRequest
            r9.<init>()
            java.lang.Object r9 = r9.toResult()
            java.lang.String r9 = (java.lang.String) r9
            r5 = r9
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            if (r5 == 0) goto L68
            int r5 = r5.length()
            if (r5 != 0) goto L77
        L68:
            if (r8 <= 0) goto L77
            int r8 = r8 - r4
            r9 = 0
            r0.L$0 = r9
            r0.label = r3
            java.lang.Object r9 = r2.delayGetAdjustId(r8, r0)
            if (r9 != r1) goto L77
            return r1
        L77:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.base.handler.DataCollectMessageHandler.delayGetAdjustId(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object delayGetAdjustId$default(DataCollectMessageHandler dataCollectMessageHandler, int i, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 3;
        }
        return dataCollectMessageHandler.delayGetAdjustId(i, continuation);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public void post(RouteRequest<Boolean> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request instanceof DataCollectMessageRequest) {
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new DataCollectMessageHandler$post$1(request, this, null), 3, null);
        }
    }
}

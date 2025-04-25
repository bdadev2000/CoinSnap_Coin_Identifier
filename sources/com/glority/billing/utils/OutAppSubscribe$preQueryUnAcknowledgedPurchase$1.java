package com.glority.billing.utils;

import androidx.core.os.BundleKt;
import com.android.billingclient.api.Purchase;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.billing.PurchaseLogEvent;
import com.glority.network.util.HttpState;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OutAppSubscribe.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lcom/android/billingclient/api/Purchase;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.billing.utils.OutAppSubscribe$preQueryUnAcknowledgedPurchase$1", f = "OutAppSubscribe.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class OutAppSubscribe$preQueryUnAcknowledgedPurchase$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Purchase>>, Object> {
    int label;
    final /* synthetic */ OutAppSubscribe this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutAppSubscribe$preQueryUnAcknowledgedPurchase$1(OutAppSubscribe outAppSubscribe, Continuation<? super OutAppSubscribe$preQueryUnAcknowledgedPurchase$1> continuation) {
        super(2, continuation);
        this.this$0 = outAppSubscribe;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OutAppSubscribe$preQueryUnAcknowledgedPurchase$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Purchase>> continuation) {
        return ((OutAppSubscribe$preQueryUnAcknowledgedPurchase$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                j = this.this$0.timeout;
                this.label = 1;
                obj = TimeoutKt.withTimeout(j, new AnonymousClass1(this.this$0, null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return (List) obj;
        } catch (Throwable unused) {
            new LogEventRequest(PurchaseLogEvent.QUERY_PURCHASELIST_TIME, BundleKt.bundleOf(TuplesKt.to("status", HttpState.TIMEOUT))).post();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OutAppSubscribe.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lcom/android/billingclient/api/Purchase;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
    @DebugMetadata(c = "com.glority.billing.utils.OutAppSubscribe$preQueryUnAcknowledgedPurchase$1$1", f = "OutAppSubscribe.kt", i = {0, 0, 1}, l = {39, 40}, m = "invokeSuspend", n = {"start", "querySuccess", "start"}, s = {"J$0", "I$0", "J$0"})
    /* renamed from: com.glority.billing.utils.OutAppSubscribe$preQueryUnAcknowledgedPurchase$1$1, reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Purchase>>, Object> {
        int I$0;
        long J$0;
        int label;
        final /* synthetic */ OutAppSubscribe this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(OutAppSubscribe outAppSubscribe, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = outAppSubscribe;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Purchase>> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x0113, code lost:
        
            if (r2 == null) goto L39;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00ca  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x007d  */
        /* JADX WARN: Type inference failed for: r2v27, types: [int] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r16) {
            /*
                Method dump skipped, instructions count: 302
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.glority.billing.utils.OutAppSubscribe$preQueryUnAcknowledgedPurchase$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }
}

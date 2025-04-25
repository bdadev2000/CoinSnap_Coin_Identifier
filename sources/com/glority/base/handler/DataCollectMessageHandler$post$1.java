package com.glority.base.handler;

import com.glority.android.core.route.RouteRequest;
import com.glority.network.model.Status;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DataCollectMessageHandler.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.base.handler.DataCollectMessageHandler$post$1", f = "DataCollectMessageHandler.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class DataCollectMessageHandler$post$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ RouteRequest<Boolean> $request;
    int label;
    final /* synthetic */ DataCollectMessageHandler this$0;

    /* compiled from: DataCollectMessageHandler.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Status.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataCollectMessageHandler$post$1(RouteRequest<Boolean> routeRequest, DataCollectMessageHandler dataCollectMessageHandler, Continuation<? super DataCollectMessageHandler$post$1> continuation) {
        super(2, continuation);
        this.$request = routeRequest;
        this.this$0 = dataCollectMessageHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DataCollectMessageHandler$post$1(this.$request, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DataCollectMessageHandler$post$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0155  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.base.handler.DataCollectMessageHandler$post$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

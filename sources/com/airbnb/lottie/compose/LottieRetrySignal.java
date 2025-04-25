package com.airbnb.lottie.compose;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelsKt;

/* compiled from: LottieRetrySignal.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\u0011\u0010\u000e\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u0006\u0010\u0010\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/airbnb/lottie/compose/LottieRetrySignal;", "", "()V", "channel", "Lkotlinx/coroutines/channels/Channel;", "", "<set-?>", "", "isAwaitingRetry", "()Z", "setAwaitingRetry", "(Z)V", "isAwaitingRetry$delegate", "Landroidx/compose/runtime/MutableState;", "awaitRetry", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retry", "lottie-compose_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class LottieRetrySignal {
    public static final int $stable = 0;
    private final Channel<Unit> channel = ChannelKt.Channel$default(1, BufferOverflow.DROP_OLDEST, null, 4, null);

    /* renamed from: isAwaitingRetry$delegate, reason: from kotlin metadata */
    private final MutableState isAwaitingRetry;

    public LottieRetrySignal() {
        MutableState mutableStateOf$default;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.isAwaitingRetry = mutableStateOf$default;
    }

    private final void setAwaitingRetry(boolean z) {
        this.isAwaitingRetry.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isAwaitingRetry() {
        return ((Boolean) this.isAwaitingRetry.getValue()).booleanValue();
    }

    public final void retry() {
        ChannelsKt.trySendBlocking(this.channel, Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object awaitRetry(kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.airbnb.lottie.compose.LottieRetrySignal$awaitRetry$1
            if (r0 == 0) goto L14
            r0 = r6
            com.airbnb.lottie.compose.LottieRetrySignal$awaitRetry$1 r0 = (com.airbnb.lottie.compose.LottieRetrySignal$awaitRetry$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L19
        L14:
            com.airbnb.lottie.compose.LottieRetrySignal$awaitRetry$1 r0 = new com.airbnb.lottie.compose.LottieRetrySignal$awaitRetry$1
            r0.<init>(r5, r6)
        L19:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L31
            java.lang.Object r0 = r0.L$0
            com.airbnb.lottie.compose.LottieRetrySignal r0 = (com.airbnb.lottie.compose.LottieRetrySignal) r0
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L2f
            goto L4d
        L2f:
            r6 = move-exception
            goto L55
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L39:
            kotlin.ResultKt.throwOnFailure(r6)
            r5.setAwaitingRetry(r4)     // Catch: java.lang.Throwable -> L53
            kotlinx.coroutines.channels.Channel<kotlin.Unit> r6 = r5.channel     // Catch: java.lang.Throwable -> L53
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L53
            r0.label = r4     // Catch: java.lang.Throwable -> L53
            java.lang.Object r6 = r6.receive(r0)     // Catch: java.lang.Throwable -> L53
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r0 = r5
        L4d:
            r0.setAwaitingRetry(r3)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L53:
            r6 = move-exception
            r0 = r5
        L55:
            r0.setAwaitingRetry(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.compose.LottieRetrySignal.awaitRetry(kotlin.coroutines.Continuation):java.lang.Object");
    }
}

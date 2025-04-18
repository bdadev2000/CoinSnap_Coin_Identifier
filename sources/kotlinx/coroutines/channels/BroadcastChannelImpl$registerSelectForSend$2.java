package kotlinx.coroutines.channels;

import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.selects.SelectImplementation;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.selects.TrySelectDetailedResult;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"E", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "kotlinx.coroutines.channels.BroadcastChannelImpl$registerSelectForSend$2", f = "BroadcastChannel.kt", i = {}, l = {291}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nBroadcastChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl$registerSelectForSend$2\n+ 2 Concurrent.kt\nkotlinx/coroutines/internal/ConcurrentKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,414:1\n15#2:415\n1#3:416\n*S KotlinDebug\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl$registerSelectForSend$2\n*L\n304#1:415\n*E\n"})
/* loaded from: classes3.dex */
public final class BroadcastChannelImpl$registerSelectForSend$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Object $element;
    final /* synthetic */ SelectInstance<?> $select;
    int label;
    final /* synthetic */ BroadcastChannelImpl<E> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastChannelImpl$registerSelectForSend$2(BroadcastChannelImpl<E> broadcastChannelImpl, Object obj, SelectInstance<?> selectInstance, Continuation<? super BroadcastChannelImpl$registerSelectForSend$2> continuation) {
        super(2, continuation);
        this.this$0 = broadcastChannelImpl;
        this.$element = obj;
        this.$select = selectInstance;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BroadcastChannelImpl$registerSelectForSend$2(this.this$0, this.$element, this.$select, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        HashMap hashMap;
        Object channel_closed;
        HashMap hashMap2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        boolean z10 = true;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                BroadcastChannel broadcastChannel = this.this$0;
                Object obj2 = this.$element;
                this.label = 1;
                if (broadcastChannel.send(obj2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } catch (Throwable th2) {
            if (this.this$0.isClosedForSend() && ((th2 instanceof ClosedSendChannelException) || this.this$0.getSendException() == th2)) {
                z10 = false;
            } else {
                throw th2;
            }
        }
        ReentrantLock reentrantLock = ((BroadcastChannelImpl) this.this$0).lock;
        BroadcastChannelImpl<E> broadcastChannelImpl = this.this$0;
        SelectInstance<?> selectInstance = this.$select;
        reentrantLock.lock();
        try {
            hashMap = ((BroadcastChannelImpl) broadcastChannelImpl).onSendInternalResult;
            if (z10) {
                channel_closed = Unit.INSTANCE;
            } else {
                channel_closed = BufferedChannelKt.getCHANNEL_CLOSED();
            }
            hashMap.put(selectInstance, channel_closed);
            Intrinsics.checkNotNull(selectInstance, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            Object obj3 = Unit.INSTANCE;
            if (((SelectImplementation) selectInstance).trySelectDetailed(broadcastChannelImpl, obj3) != TrySelectDetailedResult.REREGISTER) {
                hashMap2 = ((BroadcastChannelImpl) broadcastChannelImpl).onSendInternalResult;
                hashMap2.remove(selectInstance);
            }
            return obj3;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BroadcastChannelImpl$registerSelectForSend$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}

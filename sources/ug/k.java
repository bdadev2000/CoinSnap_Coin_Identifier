package ug;

import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.plantcare.ai.identifier.plantid.ui.component.ring.RingViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* loaded from: classes4.dex */
public final class k extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f25821b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RingViewModel f25822c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(RingViewModel ringViewModel, Continuation continuation) {
        super(2, continuation);
        this.f25822c = ringViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new k(this.f25822c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f25821b;
        if (i10 != 0) {
            if (i10 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            this.f25821b = 1;
            if (DelayKt.delay(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        this.f25822c.f16734g.postValue(Boxing.boxBoolean(true));
        return Unit.INSTANCE;
    }
}

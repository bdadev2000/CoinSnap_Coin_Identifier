package com.glority.mediaplayer.exo;

import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.app.AppContext;
import com.glority.mediaplayer.interfaces.GlorityPlayerListener;
import com.glority.utils.stability.LogUtils;
import com.google.android.exoplayer2.SimpleExoPlayer;
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
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExoPlayerView.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "com.glority.mediaplayer.exo.ExoPlayerView$init$1$onPlaybackStateChanged$1$1", f = "ExoPlayerView.kt", i = {0}, l = {56}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* loaded from: classes9.dex */
public final class ExoPlayerView$init$1$onPlaybackStateChanged$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ExoPlayer $exoPlayer;
    final /* synthetic */ SimpleExoPlayer $player;
    final /* synthetic */ GlorityPlayerListener $playerListener;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExoPlayerView$init$1$onPlaybackStateChanged$1$1(GlorityPlayerListener glorityPlayerListener, ExoPlayer exoPlayer, SimpleExoPlayer simpleExoPlayer, Continuation<? super ExoPlayerView$init$1$onPlaybackStateChanged$1$1> continuation) {
        super(2, continuation);
        this.$playerListener = glorityPlayerListener;
        this.$exoPlayer = exoPlayer;
        this.$player = simpleExoPlayer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ExoPlayerView$init$1$onPlaybackStateChanged$1$1 exoPlayerView$init$1$onPlaybackStateChanged$1$1 = new ExoPlayerView$init$1$onPlaybackStateChanged$1$1(this.$playerListener, this.$exoPlayer, this.$player, continuation);
        exoPlayerView$init$1$onPlaybackStateChanged$1$1.L$0 = obj;
        return exoPlayerView$init$1$onPlaybackStateChanged$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ExoPlayerView$init$1$onPlaybackStateChanged$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        while (CoroutineScopeKt.isActive(coroutineScope)) {
            try {
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new ExoPlayerView$init$1$onPlaybackStateChanged$1$1$1$1(this.$playerListener, this.$exoPlayer, this.$player, null), 3, null);
            } catch (Exception e) {
                if (AppContext.INSTANCE.isDebugMode()) {
                    LogUtils.e(Log.getStackTraceString(e));
                }
            }
            this.L$0 = coroutineScope;
            this.label = 1;
            if (DelayKt.delay(100L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}

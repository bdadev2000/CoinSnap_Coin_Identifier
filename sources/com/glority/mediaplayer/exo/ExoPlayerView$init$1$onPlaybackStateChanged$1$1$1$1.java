package com.glority.mediaplayer.exo;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.mediaplayer.interfaces.GlorityPlayerListener;
import com.google.android.exoplayer2.SimpleExoPlayer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ExoPlayerView.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "com.glority.mediaplayer.exo.ExoPlayerView$init$1$onPlaybackStateChanged$1$1$1$1", f = "ExoPlayerView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class ExoPlayerView$init$1$onPlaybackStateChanged$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ExoPlayer $exoPlayer;
    final /* synthetic */ SimpleExoPlayer $player;
    final /* synthetic */ GlorityPlayerListener $playerListener;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExoPlayerView$init$1$onPlaybackStateChanged$1$1$1$1(GlorityPlayerListener glorityPlayerListener, ExoPlayer exoPlayer, SimpleExoPlayer simpleExoPlayer, Continuation<? super ExoPlayerView$init$1$onPlaybackStateChanged$1$1$1$1> continuation) {
        super(2, continuation);
        this.$playerListener = glorityPlayerListener;
        this.$exoPlayer = exoPlayer;
        this.$player = simpleExoPlayer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ExoPlayerView$init$1$onPlaybackStateChanged$1$1$1$1(this.$playerListener, this.$exoPlayer, this.$player, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ExoPlayerView$init$1$onPlaybackStateChanged$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        float f = 1000;
        this.$playerListener.onCurrentTime(this.$exoPlayer, ((float) this.$player.getCurrentPosition()) / f);
        this.$playerListener.onDuration(this.$exoPlayer, ((float) this.$player.getDuration()) / f);
        this.$playerListener.onVideoLoadedFraction(this.$exoPlayer, ((float) this.$player.getBufferedPosition()) / f);
        return Unit.INSTANCE;
    }
}

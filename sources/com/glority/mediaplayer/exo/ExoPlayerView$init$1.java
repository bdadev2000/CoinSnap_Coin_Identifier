package com.glority.mediaplayer.exo;

import android.os.Handler;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.mediaplayer.PlayerConstants;
import com.glority.mediaplayer.interfaces.GlorityPlayerListener;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.Timeline;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;

/* compiled from: ExoPlayerView.kt */
@Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0016¨\u0006\u0010"}, d2 = {"com/glority/mediaplayer/exo/ExoPlayerView$init$1", "Lcom/google/android/exoplayer2/Player$EventListener;", "onIsPlayingChanged", "", "isPlaying", "", "onPlaybackStateChanged", "state", "", "onPlayerError", "error", "Lcom/google/android/exoplayer2/ExoPlaybackException;", "onTimelineChanged", "timeline", "Lcom/google/android/exoplayer2/Timeline;", "reason", "exo_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes9.dex */
public final class ExoPlayerView$init$1 implements Player.EventListener {
    final /* synthetic */ ExoPlayer $exoPlayer;
    final /* synthetic */ SimpleExoPlayer $player;
    final /* synthetic */ GlorityPlayerListener $playerListener;
    final /* synthetic */ ExoPlayerView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ExoPlayerView$init$1(ExoPlayerView exoPlayerView, GlorityPlayerListener glorityPlayerListener, ExoPlayer exoPlayer, SimpleExoPlayer simpleExoPlayer) {
        this.this$0 = exoPlayerView;
        this.$playerListener = glorityPlayerListener;
        this.$exoPlayer = exoPlayer;
        this.$player = simpleExoPlayer;
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public void onPlayerError(final ExoPlaybackException error) {
        Handler handler;
        Intrinsics.checkNotNullParameter(error, "error");
        handler = this.this$0.mainThreadHandler;
        final GlorityPlayerListener glorityPlayerListener = this.$playerListener;
        handler.post(new Runnable() { // from class: com.glority.mediaplayer.exo.ExoPlayerView$init$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ExoPlayerView$init$1.m7987onPlayerError$lambda0(GlorityPlayerListener.this, error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onPlayerError$lambda-0, reason: not valid java name */
    public static final void m7987onPlayerError$lambda0(GlorityPlayerListener playerListener, ExoPlaybackException error) {
        Intrinsics.checkNotNullParameter(playerListener, "$playerListener");
        Intrinsics.checkNotNullParameter(error, "$error");
        playerListener.onError(error);
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public void onPlaybackStateChanged(final int state) {
        Handler handler;
        super.onPlaybackStateChanged(state);
        handler = this.this$0.mainThreadHandler;
        final GlorityPlayerListener glorityPlayerListener = this.$playerListener;
        final ExoPlayer exoPlayer = this.$exoPlayer;
        final ExoPlayerView exoPlayerView = this.this$0;
        final SimpleExoPlayer simpleExoPlayer = this.$player;
        handler.post(new Runnable() { // from class: com.glority.mediaplayer.exo.ExoPlayerView$init$1$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                ExoPlayerView$init$1.m7986onPlaybackStateChanged$lambda1(state, glorityPlayerListener, exoPlayer, exoPlayerView, simpleExoPlayer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onPlaybackStateChanged$lambda-1, reason: not valid java name */
    public static final void m7986onPlaybackStateChanged$lambda1(int i, GlorityPlayerListener playerListener, ExoPlayer exoPlayer, ExoPlayerView this$0, SimpleExoPlayer player) {
        Job job;
        Job launch$default;
        Intrinsics.checkNotNullParameter(playerListener, "$playerListener");
        Intrinsics.checkNotNullParameter(exoPlayer, "$exoPlayer");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(player, "$player");
        if (i == 1) {
            playerListener.onStateChange(exoPlayer, PlayerConstants.PlayerState.UNSTARTED);
            return;
        }
        if (i == 2) {
            playerListener.onStateChange(exoPlayer, PlayerConstants.PlayerState.BUFFERING);
            return;
        }
        if (i != 3) {
            if (i != 4) {
                return;
            }
            playerListener.onStateChange(exoPlayer, PlayerConstants.PlayerState.ENDED);
        } else {
            job = this$0.job;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            launch$default = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new ExoPlayerView$init$1$onPlaybackStateChanged$1$1(playerListener, exoPlayer, player, null), 3, null);
            this$0.job = launch$default;
        }
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public void onIsPlayingChanged(final boolean isPlaying) {
        Handler handler;
        super.onIsPlayingChanged(isPlaying);
        handler = this.this$0.mainThreadHandler;
        final GlorityPlayerListener glorityPlayerListener = this.$playerListener;
        final ExoPlayer exoPlayer = this.$exoPlayer;
        handler.post(new Runnable() { // from class: com.glority.mediaplayer.exo.ExoPlayerView$init$1$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                ExoPlayerView$init$1.m7985onIsPlayingChanged$lambda2(isPlaying, glorityPlayerListener, exoPlayer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onIsPlayingChanged$lambda-2, reason: not valid java name */
    public static final void m7985onIsPlayingChanged$lambda2(boolean z, GlorityPlayerListener playerListener, ExoPlayer exoPlayer) {
        Intrinsics.checkNotNullParameter(playerListener, "$playerListener");
        Intrinsics.checkNotNullParameter(exoPlayer, "$exoPlayer");
        if (z) {
            playerListener.onStateChange(exoPlayer, PlayerConstants.PlayerState.PLAYING);
        } else {
            playerListener.onStateChange(exoPlayer, PlayerConstants.PlayerState.PAUSED);
        }
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public void onTimelineChanged(Timeline timeline, int reason) {
        Intrinsics.checkNotNullParameter(timeline, "timeline");
        super.onTimelineChanged(timeline, reason);
    }
}

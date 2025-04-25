package com.glority.mediaplayer.exo;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.mediaplayer.PlayerType;
import com.glority.mediaplayer.interfaces.GlorityPlayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.SimpleExoPlayer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExoPlayer.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016J\b\u0010\u0010\u001a\u00020\nH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\bH\u0016J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0019"}, d2 = {"Lcom/glority/mediaplayer/exo/ExoPlayer;", "Lcom/glority/mediaplayer/interfaces/GlorityPlayer;", "player", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "(Lcom/google/android/exoplayer2/SimpleExoPlayer;)V", "getPlayer", "()Lcom/google/android/exoplayer2/SimpleExoPlayer;", "getCurrentTime", "", "loadVideo", "", "videoId", "", "startSeconds", "mute", "pause", "play", "playerType", "Lcom/glority/mediaplayer/PlayerType;", "seekTo", "time", "setRepeatMode", "int", "", "unMute", "exo_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes9.dex */
public final class ExoPlayer implements GlorityPlayer {
    private final SimpleExoPlayer player;

    public ExoPlayer(SimpleExoPlayer player) {
        Intrinsics.checkNotNullParameter(player, "player");
        this.player = player;
    }

    public final SimpleExoPlayer getPlayer() {
        return this.player;
    }

    @Override // com.glority.mediaplayer.interfaces.GlorityPlayer
    public void loadVideo(String videoId, float startSeconds) {
        Intrinsics.checkNotNullParameter(videoId, "videoId");
        this.player.setMediaItem(MediaItem.fromUri(videoId), startSeconds);
        this.player.prepare();
        this.player.getPlayWhenReady();
    }

    @Override // com.glority.mediaplayer.interfaces.GlorityPlayer
    public void loadVideo(String videoId) {
        Intrinsics.checkNotNullParameter(videoId, "videoId");
        this.player.setMediaItem(MediaItem.fromUri(videoId));
        this.player.prepare();
        this.player.getPlayWhenReady();
    }

    @Override // com.glority.mediaplayer.interfaces.GlorityPlayer
    public void play() {
        this.player.play();
    }

    @Override // com.glority.mediaplayer.interfaces.GlorityPlayer
    public void pause() {
        this.player.pause();
    }

    @Override // com.glority.mediaplayer.interfaces.GlorityPlayer
    public void mute() {
        this.player.setDeviceMuted(true);
    }

    @Override // com.glority.mediaplayer.interfaces.GlorityPlayer
    public void unMute() {
        this.player.setDeviceMuted(false);
    }

    @Override // com.glority.mediaplayer.interfaces.GlorityPlayer
    public void seekTo(float time) {
        this.player.seekTo(time * 1000);
    }

    @Override // com.glority.mediaplayer.interfaces.GlorityPlayer
    public float getCurrentTime() {
        return (float) this.player.getCurrentPosition();
    }

    @Override // com.glority.mediaplayer.interfaces.GlorityPlayer
    public PlayerType playerType() {
        return PlayerType.EXO;
    }

    @Override // com.glority.mediaplayer.interfaces.GlorityPlayer
    public void setRepeatMode(int r2) {
        this.player.setRepeatMode(r2);
    }
}

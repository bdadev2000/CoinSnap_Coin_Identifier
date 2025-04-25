package com.glority.mediaplayer.interfaces;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.mediaplayer.PlayerType;
import kotlin.Metadata;

/* compiled from: GlorityPlayer.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0014J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0005H&J\b\u0010\n\u001a\u00020\u0005H&J\b\u0010\u000b\u001a\u00020\u0005H&J\b\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0003H&J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H&J\b\u0010\u0013\u001a\u00020\u0005H&¨\u0006\u0015"}, d2 = {"Lcom/glority/mediaplayer/interfaces/GlorityPlayer;", "", "getCurrentTime", "", "loadVideo", "", "videoId", "", "startSeconds", "mute", "pause", "play", "playerType", "Lcom/glority/mediaplayer/PlayerType;", "seekTo", "time", "setRepeatMode", "int", "", "unMute", "RepeatMode", "base_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes9.dex */
public interface GlorityPlayer {
    float getCurrentTime();

    void loadVideo(String videoId);

    void loadVideo(String videoId, float startSeconds);

    void mute();

    void pause();

    void play();

    PlayerType playerType();

    void seekTo(float time);

    void setRepeatMode(int r1);

    void unMute();

    /* compiled from: GlorityPlayer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/glority/mediaplayer/interfaces/GlorityPlayer$RepeatMode;", "", "()V", "REPEAT_MODE_ALL", "", "getREPEAT_MODE_ALL", "()I", "setREPEAT_MODE_ALL", "(I)V", "REPEAT_MODE_OFF", "getREPEAT_MODE_OFF", "setREPEAT_MODE_OFF", "REPEAT_MODE_ONE", "getREPEAT_MODE_ONE", "setREPEAT_MODE_ONE", "base_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes9.dex */
    public static final class RepeatMode {
        private int REPEAT_MODE_OFF;
        private int REPEAT_MODE_ONE = 1;
        private int REPEAT_MODE_ALL = 2;

        public final int getREPEAT_MODE_OFF() {
            return this.REPEAT_MODE_OFF;
        }

        public final void setREPEAT_MODE_OFF(int i) {
            this.REPEAT_MODE_OFF = i;
        }

        public final int getREPEAT_MODE_ONE() {
            return this.REPEAT_MODE_ONE;
        }

        public final void setREPEAT_MODE_ONE(int i) {
            this.REPEAT_MODE_ONE = i;
        }

        public final int getREPEAT_MODE_ALL() {
            return this.REPEAT_MODE_ALL;
        }

        public final void setREPEAT_MODE_ALL(int i) {
            this.REPEAT_MODE_ALL = i;
        }
    }
}

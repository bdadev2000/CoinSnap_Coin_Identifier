package com.glority.mediaplayer.interfaces;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.mediaplayer.PlayerConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlorityPlayerListener.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u0011"}, d2 = {"Lcom/glority/mediaplayer/interfaces/GlorityPlayerListener;", "", "onCurrentTime", "", "glorityPlayer", "Lcom/glority/mediaplayer/interfaces/GlorityPlayer;", TypedValues.Custom.S_FLOAT, "", "onDuration", "onError", "e", "", "onReady", "onStateChange", "state", "Lcom/glority/mediaplayer/PlayerConstants$PlayerState;", "onVideoLoadedFraction", "base_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes9.dex */
public interface GlorityPlayerListener {

    /* compiled from: GlorityPlayerListener.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes9.dex */
    public static final class DefaultImpls {
        public static void onCurrentTime(GlorityPlayerListener glorityPlayerListener, GlorityPlayer glorityPlayer, float f) {
            Intrinsics.checkNotNullParameter(glorityPlayerListener, "this");
            Intrinsics.checkNotNullParameter(glorityPlayer, "glorityPlayer");
        }

        public static void onDuration(GlorityPlayerListener glorityPlayerListener, GlorityPlayer glorityPlayer, float f) {
            Intrinsics.checkNotNullParameter(glorityPlayerListener, "this");
            Intrinsics.checkNotNullParameter(glorityPlayer, "glorityPlayer");
        }

        public static void onError(GlorityPlayerListener glorityPlayerListener, Throwable e) {
            Intrinsics.checkNotNullParameter(glorityPlayerListener, "this");
            Intrinsics.checkNotNullParameter(e, "e");
        }

        public static void onStateChange(GlorityPlayerListener glorityPlayerListener, GlorityPlayer glorityPlayer, PlayerConstants.PlayerState state) {
            Intrinsics.checkNotNullParameter(glorityPlayerListener, "this");
            Intrinsics.checkNotNullParameter(glorityPlayer, "glorityPlayer");
            Intrinsics.checkNotNullParameter(state, "state");
        }

        public static void onVideoLoadedFraction(GlorityPlayerListener glorityPlayerListener, GlorityPlayer glorityPlayer, float f) {
            Intrinsics.checkNotNullParameter(glorityPlayerListener, "this");
            Intrinsics.checkNotNullParameter(glorityPlayer, "glorityPlayer");
        }
    }

    void onCurrentTime(GlorityPlayer glorityPlayer, float r2);

    void onDuration(GlorityPlayer glorityPlayer, float r2);

    void onError(Throwable e);

    void onReady(GlorityPlayer glorityPlayer);

    void onStateChange(GlorityPlayer glorityPlayer, PlayerConstants.PlayerState state);

    void onVideoLoadedFraction(GlorityPlayer glorityPlayer, float r2);
}

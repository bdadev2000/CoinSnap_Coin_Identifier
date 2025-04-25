package com.glority.mediaplayer.exo;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.mediaplayer.interfaces.GlorityPlayerListener;
import com.glority.mediaplayer.interfaces.PlayerView;
import com.google.android.exoplayer2.SimpleExoPlayer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* compiled from: ExoPlayerView.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/glority/mediaplayer/exo/ExoPlayerView;", "Lcom/glority/mediaplayer/exo/BaseExoPlayerView;", "Lcom/glority/mediaplayer/interfaces/PlayerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "job", "Lkotlinx/coroutines/Job;", "mainThreadHandler", "Landroid/os/Handler;", "init", "", "playerListener", "Lcom/glority/mediaplayer/interfaces/GlorityPlayerListener;", "exo_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes9.dex */
public final class ExoPlayerView extends BaseExoPlayerView implements PlayerView {
    private Job job;
    private final Handler mainThreadHandler;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExoPlayerView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ExoPlayerView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExoPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mainThreadHandler = new Handler(Looper.getMainLooper());
    }

    @Override // com.glority.mediaplayer.interfaces.PlayerView
    public void init(GlorityPlayerListener playerListener) {
        Intrinsics.checkNotNullParameter(playerListener, "playerListener");
        SimpleExoPlayer build = new SimpleExoPlayer.Builder(getContext()).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder(context).build()");
        ExoPlayer exoPlayer = new ExoPlayer(build);
        setPlayer(build);
        build.setPlayWhenReady(true);
        playerListener.onReady(exoPlayer);
        build.addListener(new ExoPlayerView$init$1(this, playerListener, exoPlayer, build));
    }
}

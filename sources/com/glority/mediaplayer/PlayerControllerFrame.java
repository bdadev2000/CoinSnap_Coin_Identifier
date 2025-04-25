package com.glority.mediaplayer;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewGroupKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.glority.mediaplayer.PlayerConstants;
import com.glority.mediaplayer.interfaces.GlorityPlayer;
import com.glority.mediaplayer.interfaces.GlorityPlayerListener;
import com.glority.mediaplayer.interfaces.PlayerFullScreenListener;
import com.glority.mediaplayer.interfaces.PlayerView;
import com.glority.mediaplayer.view.PlayerSeekBar;
import com.glority.mediaplayer.view.PlayerSeekBarListener;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlayerControllerFrame.kt */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010&\u001a\u00020\n2\u0006\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020*H\u0002J&\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010/\u001a\u00020\nJ\b\u00100\u001a\u00020*H\u0003J\b\u00101\u001a\u00020*H\u0003J\u0018\u00102\u001a\u00020*2\u0006\u00103\u001a\u00020\u001d2\u0006\u00104\u001a\u000205H\u0016J\u0018\u00106\u001a\u00020*2\u0006\u00103\u001a\u00020\u001d2\u0006\u00104\u001a\u000205H\u0016J\u0010\u00107\u001a\u00020*2\u0006\u00108\u001a\u000209H\u0016J\u0010\u0010:\u001a\u00020*2\u0006\u00103\u001a\u00020\u001dH\u0016J\u0018\u0010;\u001a\u00020*2\u0006\u00103\u001a\u00020\u001d2\u0006\u0010<\u001a\u00020=H\u0016J\u0018\u0010>\u001a\u00020*2\u0006\u00103\u001a\u00020\u001d2\u0006\u00104\u001a\u000205H\u0016J\b\u0010?\u001a\u00020*H\u0002J\u0010\u0010@\u001a\u00020*2\u0006\u0010\u0015\u001a\u00020\nH\u0002J\b\u0010A\u001a\u00020*H\u0002J\u0010\u0010B\u001a\u00020*2\u0006\u0010A\u001a\u00020\nH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006C"}, d2 = {"Lcom/glority/mediaplayer/PlayerControllerFrame;", "Landroid/widget/FrameLayout;", "Landroidx/lifecycle/LifecycleObserver;", "Lcom/glority/mediaplayer/interfaces/GlorityPlayerListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "autoPause", "", "controllerView", "Landroid/view/View;", "getControllerView", "()Landroid/view/View;", "setControllerView", "(Landroid/view/View;)V", "fullScreenBt", "Landroid/widget/ImageView;", "fullScreenListener", "Lcom/glority/mediaplayer/interfaces/PlayerFullScreenListener;", "isFullScreen", "isPlaying", "mainThreadHandler", "Landroid/os/Handler;", "getMainThreadHandler", "()Landroid/os/Handler;", "playPauseBt", "player", "Lcom/glority/mediaplayer/interfaces/GlorityPlayer;", "playerView", "Lcom/glority/mediaplayer/interfaces/PlayerView;", "progressBar", "Landroid/widget/ProgressBar;", "seekBar", "Lcom/glority/mediaplayer/view/PlayerSeekBar;", "smallActionBt", "userPlayerListener", "dispatchTouchEvent", "ev", "Landroid/view/MotionEvent;", "inVisible", "", "init", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "playerListener", "currentIsFullScreen", "onActivityPause", "onActivityResume", "onCurrentTime", "glorityPlayer", TypedValues.Custom.S_FLOAT, "", "onDuration", "onError", "e", "", "onReady", "onStateChange", "state", "Lcom/glority/mediaplayer/PlayerConstants$PlayerState;", "onVideoLoadedFraction", "setActionBt", "toggleFullScreenBt", "visible", "visibleActionBt", "base_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes9.dex */
public final class PlayerControllerFrame extends FrameLayout implements LifecycleObserver, GlorityPlayerListener {
    private boolean autoPause;
    private View controllerView;
    private ImageView fullScreenBt;
    private PlayerFullScreenListener fullScreenListener;
    private boolean isFullScreen;
    private boolean isPlaying;
    private final Handler mainThreadHandler;
    private ImageView playPauseBt;
    private GlorityPlayer player;
    private PlayerView playerView;
    private ProgressBar progressBar;
    private PlayerSeekBar seekBar;
    private ImageView smallActionBt;
    private GlorityPlayerListener userPlayerListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlayerControllerFrame(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ PlayerControllerFrame(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerControllerFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mainThreadHandler = new Handler(Looper.getMainLooper());
    }

    public final Handler getMainThreadHandler() {
        return this.mainThreadHandler;
    }

    public final View getControllerView() {
        return this.controllerView;
    }

    public final void setControllerView(View view) {
        this.controllerView = view;
    }

    public final void init(Lifecycle lifecycle, GlorityPlayerListener playerListener, final PlayerFullScreenListener fullScreenListener, boolean currentIsFullScreen) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(playerListener, "playerListener");
        Intrinsics.checkNotNullParameter(fullScreenListener, "fullScreenListener");
        PlayerControllerFrame playerControllerFrame = this;
        for (KeyEvent.Callback callback : ViewGroupKt.getChildren(playerControllerFrame)) {
            if (callback instanceof PlayerView) {
                this.playerView = (PlayerView) callback;
            }
        }
        if (this.playerView == null) {
            throw new Exception("PlayerControllerFrame must contains iplayer");
        }
        lifecycle.addObserver(this);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.player_default_player_ui, playerControllerFrame);
        Intrinsics.checkNotNullExpressionValue(inflate, "from(context).inflate(R.…_default_player_ui, this)");
        this.controllerView = inflate.findViewById(R.id.controller);
        View findViewById = inflate.findViewById(R.id.progress);
        Intrinsics.checkNotNullExpressionValue(findViewById, "inflate.findViewById(R.id.progress)");
        this.progressBar = (ProgressBar) findViewById;
        View findViewById2 = inflate.findViewById(R.id.play_pause_button);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "inflate.findViewById(R.id.play_pause_button)");
        this.playPauseBt = (ImageView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.player_seekbar);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "inflate.findViewById(R.id.player_seekbar)");
        this.seekBar = (PlayerSeekBar) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.fullscreen_button);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "inflate.findViewById(R.id.fullscreen_button)");
        this.fullScreenBt = (ImageView) findViewById4;
        View findViewById5 = inflate.findViewById(R.id.small_action_bt);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "inflate.findViewById(R.id.small_action_bt)");
        this.smallActionBt = (ImageView) findViewById5;
        ProgressBar progressBar = this.progressBar;
        PlayerSeekBar playerSeekBar = null;
        if (progressBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressBar");
            progressBar = null;
        }
        progressBar.setVisibility(0);
        this.fullScreenListener = fullScreenListener;
        this.isFullScreen = currentIsFullScreen;
        this.userPlayerListener = playerListener;
        PlayerView playerView = this.playerView;
        if (playerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerView");
            playerView = null;
        }
        playerView.init(this);
        toggleFullScreenBt(currentIsFullScreen);
        setActionBt();
        visibleActionBt(true);
        ImageView imageView = this.fullScreenBt;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fullScreenBt");
            imageView = null;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.glority.mediaplayer.PlayerControllerFrame$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PlayerControllerFrame.m7978init$lambda1(PlayerControllerFrame.this, fullScreenListener, view);
            }
        });
        PlayerSeekBar playerSeekBar2 = this.seekBar;
        if (playerSeekBar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("seekBar");
        } else {
            playerSeekBar = playerSeekBar2;
        }
        playerSeekBar.setPlayerSeekBarListener(new PlayerSeekBarListener() { // from class: com.glority.mediaplayer.PlayerControllerFrame$init$4
            @Override // com.glority.mediaplayer.view.PlayerSeekBarListener
            public void seekTo(float time) {
                GlorityPlayer glorityPlayer;
                glorityPlayer = PlayerControllerFrame.this.player;
                if (glorityPlayer == null) {
                    return;
                }
                glorityPlayer.seekTo(time);
            }
        });
        this.mainThreadHandler.postDelayed(new Runnable() { // from class: com.glority.mediaplayer.PlayerControllerFrame$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                PlayerControllerFrame.m7979init$lambda2(PlayerControllerFrame.this);
            }
        }, 3000L);
        setOnClickListener(new View.OnClickListener() { // from class: com.glority.mediaplayer.PlayerControllerFrame$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PlayerControllerFrame.m7980init$lambda5(PlayerControllerFrame.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: init$lambda-1, reason: not valid java name */
    public static final void m7978init$lambda1(PlayerControllerFrame this$0, PlayerFullScreenListener fullScreenListener, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(fullScreenListener, "$fullScreenListener");
        boolean z = !this$0.isFullScreen;
        this$0.isFullScreen = z;
        fullScreenListener.toggleFullScreen(z);
        this$0.toggleFullScreenBt(this$0.isFullScreen);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: init$lambda-2, reason: not valid java name */
    public static final void m7979init$lambda2(PlayerControllerFrame this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.inVisible();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: init$lambda-5, reason: not valid java name */
    public static final void m7980init$lambda5(final PlayerControllerFrame this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getMainThreadHandler().removeCallbacksAndMessages(null);
        View controllerView = this$0.getControllerView();
        if (controllerView != null && controllerView.getVisibility() == 0) {
            this$0.inVisible();
        } else {
            this$0.getMainThreadHandler().post(new Runnable() { // from class: com.glority.mediaplayer.PlayerControllerFrame$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    PlayerControllerFrame.m7981init$lambda5$lambda3(PlayerControllerFrame.this);
                }
            });
            this$0.getMainThreadHandler().postDelayed(new Runnable() { // from class: com.glority.mediaplayer.PlayerControllerFrame$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    PlayerControllerFrame.m7982init$lambda5$lambda4(PlayerControllerFrame.this);
                }
            }, 4000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: init$lambda-5$lambda-3, reason: not valid java name */
    public static final void m7981init$lambda5$lambda3(PlayerControllerFrame this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.visible();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: init$lambda-5$lambda-4, reason: not valid java name */
    public static final void m7982init$lambda5$lambda4(PlayerControllerFrame this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.inVisible();
    }

    private final void setActionBt() {
        ImageView imageView = this.playPauseBt;
        ImageView imageView2 = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playPauseBt");
            imageView = null;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.glority.mediaplayer.PlayerControllerFrame$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PlayerControllerFrame.m7983setActionBt$lambda6(PlayerControllerFrame.this, view);
            }
        });
        ImageView imageView3 = this.smallActionBt;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("smallActionBt");
        } else {
            imageView2 = imageView3;
        }
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.glority.mediaplayer.PlayerControllerFrame$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PlayerControllerFrame.m7984setActionBt$lambda7(PlayerControllerFrame.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setActionBt$lambda-6, reason: not valid java name */
    public static final void m7983setActionBt$lambda6(PlayerControllerFrame this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isPlaying) {
            GlorityPlayer glorityPlayer = this$0.player;
            if (glorityPlayer == null) {
                return;
            }
            glorityPlayer.pause();
            return;
        }
        GlorityPlayer glorityPlayer2 = this$0.player;
        if (glorityPlayer2 == null) {
            return;
        }
        glorityPlayer2.play();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setActionBt$lambda-7, reason: not valid java name */
    public static final void m7984setActionBt$lambda7(PlayerControllerFrame this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isPlaying) {
            GlorityPlayer glorityPlayer = this$0.player;
            if (glorityPlayer == null) {
                return;
            }
            glorityPlayer.pause();
            return;
        }
        GlorityPlayer glorityPlayer2 = this$0.player;
        if (glorityPlayer2 == null) {
            return;
        }
        glorityPlayer2.play();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        this.mainThreadHandler.removeCallbacksAndMessages(null);
        if (ev.getAction() == 1) {
            View view = this.controllerView;
            if (view != null && view.getVisibility() == 0) {
                GlorityPlayer glorityPlayer = this.player;
                if ((glorityPlayer != null ? glorityPlayer.playerType() : null) == PlayerType.YOUTUBE) {
                    inVisible();
                }
            }
            this.mainThreadHandler.post(new Runnable() { // from class: com.glority.mediaplayer.PlayerControllerFrame$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    PlayerControllerFrame.m7976dispatchTouchEvent$lambda8(PlayerControllerFrame.this);
                }
            });
            this.mainThreadHandler.postDelayed(new Runnable() { // from class: com.glority.mediaplayer.PlayerControllerFrame$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    PlayerControllerFrame.m7977dispatchTouchEvent$lambda9(PlayerControllerFrame.this);
                }
            }, 4000L);
        }
        return super.dispatchTouchEvent(ev);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dispatchTouchEvent$lambda-8, reason: not valid java name */
    public static final void m7976dispatchTouchEvent$lambda8(PlayerControllerFrame this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.visible();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dispatchTouchEvent$lambda-9, reason: not valid java name */
    public static final void m7977dispatchTouchEvent$lambda9(PlayerControllerFrame this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.inVisible();
    }

    private final void toggleFullScreenBt(boolean isFullScreen) {
        ImageView imageView = null;
        if (isFullScreen) {
            ImageView imageView2 = this.fullScreenBt;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fullScreenBt");
            } else {
                imageView = imageView2;
            }
            imageView.setImageResource(R.drawable.player_ic_fullscreen_exit_24dp);
            return;
        }
        ImageView imageView3 = this.fullScreenBt;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fullScreenBt");
        } else {
            imageView = imageView3;
        }
        imageView.setImageResource(R.drawable.player_ic_fullscreen_24dp);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    private final void onActivityResume() {
        if (this.autoPause) {
            GlorityPlayer glorityPlayer = this.player;
            if (glorityPlayer != null) {
                glorityPlayer.play();
            }
            this.autoPause = false;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    private final void onActivityPause() {
        if (this.isPlaying) {
            GlorityPlayer glorityPlayer = this.player;
            if (glorityPlayer != null) {
                glorityPlayer.pause();
            }
            this.autoPause = true;
        }
    }

    @Override // com.glority.mediaplayer.interfaces.GlorityPlayerListener
    public void onReady(GlorityPlayer glorityPlayer) {
        Intrinsics.checkNotNullParameter(glorityPlayer, "glorityPlayer");
        ProgressBar progressBar = this.progressBar;
        PlayerSeekBar playerSeekBar = null;
        if (progressBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressBar");
            progressBar = null;
        }
        progressBar.setVisibility(8);
        this.player = glorityPlayer;
        GlorityPlayerListener glorityPlayerListener = this.userPlayerListener;
        if (glorityPlayerListener != null) {
            glorityPlayerListener.onReady(glorityPlayer);
        }
        PlayerSeekBar playerSeekBar2 = this.seekBar;
        if (playerSeekBar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("seekBar");
        } else {
            playerSeekBar = playerSeekBar2;
        }
        playerSeekBar.onReady(glorityPlayer);
    }

    @Override // com.glority.mediaplayer.interfaces.GlorityPlayerListener
    public void onError(Throwable e) {
        Intrinsics.checkNotNullParameter(e, "e");
        GlorityPlayerListener glorityPlayerListener = this.userPlayerListener;
        if (glorityPlayerListener != null) {
            glorityPlayerListener.onError(e);
        }
        PlayerSeekBar playerSeekBar = this.seekBar;
        if (playerSeekBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("seekBar");
            playerSeekBar = null;
        }
        playerSeekBar.onError(e);
    }

    @Override // com.glority.mediaplayer.interfaces.GlorityPlayerListener
    public void onCurrentTime(GlorityPlayer glorityPlayer, float r3) {
        Intrinsics.checkNotNullParameter(glorityPlayer, "glorityPlayer");
        GlorityPlayerListener glorityPlayerListener = this.userPlayerListener;
        if (glorityPlayerListener != null) {
            glorityPlayerListener.onCurrentTime(glorityPlayer, r3);
        }
        PlayerSeekBar playerSeekBar = this.seekBar;
        if (playerSeekBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("seekBar");
            playerSeekBar = null;
        }
        playerSeekBar.onCurrentTime(glorityPlayer, r3);
    }

    @Override // com.glority.mediaplayer.interfaces.GlorityPlayerListener
    public void onStateChange(GlorityPlayer glorityPlayer, PlayerConstants.PlayerState state) {
        Intrinsics.checkNotNullParameter(glorityPlayer, "glorityPlayer");
        Intrinsics.checkNotNullParameter(state, "state");
        this.isPlaying = state == PlayerConstants.PlayerState.PLAYING;
        GlorityPlayerListener glorityPlayerListener = this.userPlayerListener;
        if (glorityPlayerListener != null) {
            glorityPlayerListener.onStateChange(glorityPlayer, state);
        }
        PlayerSeekBar playerSeekBar = this.seekBar;
        ImageView imageView = null;
        if (playerSeekBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("seekBar");
            playerSeekBar = null;
        }
        playerSeekBar.onStateChange(glorityPlayer, state);
        if (this.isPlaying) {
            ImageView imageView2 = this.playPauseBt;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("playPauseBt");
                imageView2 = null;
            }
            imageView2.setImageResource(R.drawable.player_ic_pause_36dp);
            ImageView imageView3 = this.smallActionBt;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("smallActionBt");
            } else {
                imageView = imageView3;
            }
            imageView.setImageResource(R.drawable.player_ic_pause_36dp);
            return;
        }
        ImageView imageView4 = this.playPauseBt;
        if (imageView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playPauseBt");
            imageView4 = null;
        }
        imageView4.setImageResource(R.drawable.player_ic_play_36dp);
        ImageView imageView5 = this.smallActionBt;
        if (imageView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("smallActionBt");
        } else {
            imageView = imageView5;
        }
        imageView.setImageResource(R.drawable.player_ic_play_36dp);
    }

    @Override // com.glority.mediaplayer.interfaces.GlorityPlayerListener
    public void onDuration(GlorityPlayer glorityPlayer, float r3) {
        Intrinsics.checkNotNullParameter(glorityPlayer, "glorityPlayer");
        GlorityPlayerListener glorityPlayerListener = this.userPlayerListener;
        if (glorityPlayerListener != null) {
            glorityPlayerListener.onDuration(glorityPlayer, r3);
        }
        PlayerSeekBar playerSeekBar = this.seekBar;
        if (playerSeekBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("seekBar");
            playerSeekBar = null;
        }
        playerSeekBar.onDuration(glorityPlayer, r3);
    }

    @Override // com.glority.mediaplayer.interfaces.GlorityPlayerListener
    public void onVideoLoadedFraction(GlorityPlayer glorityPlayer, float r3) {
        Intrinsics.checkNotNullParameter(glorityPlayer, "glorityPlayer");
        GlorityPlayerListener glorityPlayerListener = this.userPlayerListener;
        if (glorityPlayerListener != null) {
            glorityPlayerListener.onVideoLoadedFraction(glorityPlayer, r3);
        }
        PlayerSeekBar playerSeekBar = this.seekBar;
        if (playerSeekBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("seekBar");
            playerSeekBar = null;
        }
        playerSeekBar.onVideoLoadedFraction(glorityPlayer, r3);
    }

    private final void visibleActionBt(boolean visible) {
        GlorityPlayer glorityPlayer = this.player;
        ImageView imageView = null;
        if ((glorityPlayer == null ? null : glorityPlayer.playerType()) != PlayerType.EXO) {
            ImageView imageView2 = this.playPauseBt;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("playPauseBt");
            } else {
                imageView = imageView2;
            }
            imageView.setVisibility(8);
            return;
        }
        if (visible) {
            ImageView imageView3 = this.playPauseBt;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("playPauseBt");
            } else {
                imageView = imageView3;
            }
            imageView.setVisibility(0);
            return;
        }
        ImageView imageView4 = this.playPauseBt;
        if (imageView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playPauseBt");
        } else {
            imageView = imageView4;
        }
        imageView.setVisibility(8);
    }

    private final void visible() {
        View view;
        View view2 = this.controllerView;
        if (view2 == null || view2.getVisibility() == 0 || (view = this.controllerView) == null) {
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.glority.mediaplayer.PlayerControllerFrame$visible$1$1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                View controllerView = PlayerControllerFrame.this.getControllerView();
                if (controllerView == null) {
                    return;
                }
                controllerView.setVisibility(0);
            }
        });
        Unit unit = Unit.INSTANCE;
        view.startAnimation(alphaAnimation);
    }

    private final void inVisible() {
        View view;
        View view2 = this.controllerView;
        if (view2 == null || view2.getVisibility() != 0 || (view = this.controllerView) == null) {
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.glority.mediaplayer.PlayerControllerFrame$inVisible$1$1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                View controllerView = PlayerControllerFrame.this.getControllerView();
                if (controllerView == null) {
                    return;
                }
                controllerView.setVisibility(8);
            }
        });
        Unit unit = Unit.INSTANCE;
        view.startAnimation(alphaAnimation);
    }
}

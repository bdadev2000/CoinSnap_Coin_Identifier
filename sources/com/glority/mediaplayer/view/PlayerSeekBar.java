package com.glority.mediaplayer.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.glority.mediaplayer.PlayerConstants;
import com.glority.mediaplayer.R;
import com.glority.mediaplayer.interfaces.GlorityPlayer;
import com.glority.mediaplayer.interfaces.GlorityPlayerListener;
import com.glority.mediaplayer.utils.Utils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlayerSeekBar.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J\u0018\u0010-\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u000200H\u0016J \u00101\u001a\u00020(2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u00102\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u000eH\u0016J\u0010\u00104\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0016J\u0010\u00105\u001a\u00020(2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u00106\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u00107\u001a\u000208H\u0016J\u0010\u00109\u001a\u00020(2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010:\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J\b\u0010;\u001a\u00020(H\u0002J\u0010\u0010<\u001a\u00020(2\b\b\u0001\u0010=\u001a\u00020\u0010J\u000e\u0010>\u001a\u00020(2\u0006\u0010?\u001a\u00020,J\u0010\u0010@\u001a\u00020(2\u0006\u00107\u001a\u000208H\u0002R\u0014\u0010\t\u001a\u00020\nX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\"¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020\"¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$¨\u0006A"}, d2 = {"Lcom/glority/mediaplayer/view/PlayerSeekBar;", "Landroid/widget/LinearLayout;", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "Lcom/glority/mediaplayer/interfaces/GlorityPlayerListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defaultTime", "", "getDefaultTime", "()Ljava/lang/String;", "isPlaying", "", "newSeekBarProgress", "", "playerSeekBarListener", "Lcom/glority/mediaplayer/view/PlayerSeekBarListener;", "getPlayerSeekBarListener", "()Lcom/glority/mediaplayer/view/PlayerSeekBarListener;", "setPlayerSeekBarListener", "(Lcom/glority/mediaplayer/view/PlayerSeekBarListener;)V", "seekBar", "Landroid/widget/SeekBar;", "getSeekBar", "()Landroid/widget/SeekBar;", "seekBarTouchStarted", "showBufferingProgress", "getShowBufferingProgress", "()Z", "setShowBufferingProgress", "(Z)V", "videoCurrentTimeTextView", "Landroid/widget/TextView;", "getVideoCurrentTimeTextView", "()Landroid/widget/TextView;", "videoDurationTextView", "getVideoDurationTextView", "onCurrentTime", "", "glorityPlayer", "Lcom/glority/mediaplayer/interfaces/GlorityPlayer;", TypedValues.Custom.S_FLOAT, "", "onDuration", "onError", "e", "", "onProgressChanged", "progress", "fromUser", "onReady", "onStartTrackingTouch", "onStateChange", "state", "Lcom/glority/mediaplayer/PlayerConstants$PlayerState;", "onStopTrackingTouch", "onVideoLoadedFraction", "resetUi", "setColor", "color", "setFontSize", TtmlNode.ATTR_TTS_FONT_SIZE, "updateState", "base_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes9.dex */
public class PlayerSeekBar extends LinearLayout implements SeekBar.OnSeekBarChangeListener, GlorityPlayerListener {
    private final String defaultTime;
    private boolean isPlaying;
    private int newSeekBarProgress;
    private PlayerSeekBarListener playerSeekBarListener;
    private final SeekBar seekBar;
    private boolean seekBarTouchStarted;
    private boolean showBufferingProgress;
    private final TextView videoCurrentTimeTextView;
    private final TextView videoDurationTextView;

    /* compiled from: PlayerSeekBar.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes9.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlayerConstants.PlayerState.values().length];
            iArr[PlayerConstants.PlayerState.ENDED.ordinal()] = 1;
            iArr[PlayerConstants.PlayerState.PAUSED.ordinal()] = 2;
            iArr[PlayerConstants.PlayerState.PLAYING.ordinal()] = 3;
            iArr[PlayerConstants.PlayerState.UNSTARTED.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.glority.mediaplayer.interfaces.GlorityPlayerListener
    public void onError(Throwable e) {
        Intrinsics.checkNotNullParameter(e, "e");
    }

    @Override // com.glority.mediaplayer.interfaces.GlorityPlayerListener
    public void onReady(GlorityPlayer glorityPlayer) {
        Intrinsics.checkNotNullParameter(glorityPlayer, "glorityPlayer");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.newSeekBarProgress = -1;
        this.showBufferingProgress = true;
        TextView textView = new TextView(context);
        this.videoCurrentTimeTextView = textView;
        TextView textView2 = new TextView(context);
        this.videoDurationTextView = textView2;
        SeekBar seekBar = new SeekBar(context);
        this.seekBar = seekBar;
        this.defaultTime = "0:00";
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.PlayerSeekBar, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.theme.obtainStyl…able.PlayerSeekBar, 0, 0)");
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.PlayerSeekBar_fontSize, getResources().getDimensionPixelSize(R.dimen.x24));
        int color = obtainStyledAttributes.getColor(R.styleable.PlayerSeekBar_color, ContextCompat.getColor(context, R.color.player_red));
        obtainStyledAttributes.recycle();
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.x16);
        textView.setText("0:00");
        textView.setPadding(dimensionPixelSize2, dimensionPixelSize2, 0, dimensionPixelSize2);
        textView.setTextColor(ContextCompat.getColor(context, android.R.color.white));
        textView.setGravity(16);
        textView2.setText("0:00");
        textView2.setPadding(0, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
        textView2.setTextColor(ContextCompat.getColor(context, android.R.color.white));
        textView2.setGravity(16);
        setFontSize(dimensionPixelSize);
        int i = dimensionPixelSize2 * 2;
        seekBar.setPadding(i, dimensionPixelSize2, i, dimensionPixelSize2);
        setColor(color);
        addView(textView, new LinearLayout.LayoutParams(-2, -2));
        addView(seekBar, new LinearLayout.LayoutParams(0, -2, 1.0f));
        addView(textView2, new LinearLayout.LayoutParams(-2, -2));
        setGravity(16);
        seekBar.setOnSeekBarChangeListener(this);
    }

    public /* synthetic */ PlayerSeekBar(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    public final boolean getShowBufferingProgress() {
        return this.showBufferingProgress;
    }

    public final void setShowBufferingProgress(boolean z) {
        this.showBufferingProgress = z;
    }

    public final PlayerSeekBarListener getPlayerSeekBarListener() {
        return this.playerSeekBarListener;
    }

    public final void setPlayerSeekBarListener(PlayerSeekBarListener playerSeekBarListener) {
        this.playerSeekBarListener = playerSeekBarListener;
    }

    public final TextView getVideoCurrentTimeTextView() {
        return this.videoCurrentTimeTextView;
    }

    public final TextView getVideoDurationTextView() {
        return this.videoDurationTextView;
    }

    public final SeekBar getSeekBar() {
        return this.seekBar;
    }

    public final String getDefaultTime() {
        return this.defaultTime;
    }

    public final void setFontSize(float fontSize) {
        this.videoCurrentTimeTextView.setTextSize(0, fontSize);
        this.videoDurationTextView.setTextSize(0, fontSize);
    }

    public final void setColor(int color) {
        DrawableCompat.setTint(this.seekBar.getThumb(), color);
        DrawableCompat.setTint(this.seekBar.getProgressDrawable(), color);
    }

    private final void updateState(PlayerConstants.PlayerState state) {
        int i = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i == 1) {
            this.isPlaying = false;
            return;
        }
        if (i == 2) {
            this.isPlaying = false;
        } else if (i == 3) {
            this.isPlaying = true;
        } else {
            if (i != 4) {
                return;
            }
            resetUi();
        }
    }

    private final void resetUi() {
        this.seekBar.setProgress(0);
        this.seekBar.setMax(0);
        this.videoDurationTextView.post(new Runnable() { // from class: com.glority.mediaplayer.view.PlayerSeekBar$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                PlayerSeekBar.m7988resetUi$lambda0(PlayerSeekBar.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: resetUi$lambda-0, reason: not valid java name */
    public static final void m7988resetUi$lambda0(PlayerSeekBar this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getVideoDurationTextView().setText("");
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        Intrinsics.checkNotNullParameter(seekBar, "seekBar");
        this.videoCurrentTimeTextView.setText(Utils.formatTime(progress));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        Intrinsics.checkNotNullParameter(seekBar, "seekBar");
        this.seekBarTouchStarted = true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        Intrinsics.checkNotNullParameter(seekBar, "seekBar");
        if (this.isPlaying) {
            this.newSeekBarProgress = seekBar.getProgress();
        }
        PlayerSeekBarListener playerSeekBarListener = this.playerSeekBarListener;
        if (playerSeekBarListener != null) {
            playerSeekBarListener.seekTo(seekBar.getProgress());
        }
        this.seekBarTouchStarted = false;
    }

    @Override // com.glority.mediaplayer.interfaces.GlorityPlayerListener
    public void onStateChange(GlorityPlayer glorityPlayer, PlayerConstants.PlayerState state) {
        Intrinsics.checkNotNullParameter(glorityPlayer, "glorityPlayer");
        Intrinsics.checkNotNullParameter(state, "state");
        this.newSeekBarProgress = -1;
        updateState(state);
    }

    @Override // com.glority.mediaplayer.interfaces.GlorityPlayerListener
    public void onDuration(GlorityPlayer glorityPlayer, float r3) {
        Intrinsics.checkNotNullParameter(glorityPlayer, "glorityPlayer");
        this.videoDurationTextView.setText(Utils.formatTime(r3));
        this.seekBar.setMax((int) r3);
    }

    @Override // com.glority.mediaplayer.interfaces.GlorityPlayerListener
    public void onVideoLoadedFraction(GlorityPlayer glorityPlayer, float r3) {
        Intrinsics.checkNotNullParameter(glorityPlayer, "glorityPlayer");
        if (this.showBufferingProgress) {
            this.seekBar.setSecondaryProgress((int) (r3 * r2.getMax()));
        } else {
            this.seekBar.setSecondaryProgress(0);
        }
    }

    @Override // com.glority.mediaplayer.interfaces.GlorityPlayerListener
    public void onCurrentTime(GlorityPlayer glorityPlayer, float r3) {
        Intrinsics.checkNotNullParameter(glorityPlayer, "glorityPlayer");
        if (this.seekBarTouchStarted) {
            return;
        }
        if (this.newSeekBarProgress <= 0 || Intrinsics.areEqual(Utils.formatTime(r3), Utils.formatTime(this.newSeekBarProgress))) {
            this.newSeekBarProgress = -1;
            this.seekBar.setProgress((int) r3);
        }
    }
}

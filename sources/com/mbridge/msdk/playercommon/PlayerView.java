package com.mbridge.msdk.playercommon;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.a;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import kd.i;
import ld.b;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class PlayerView extends LinearLayout {
    public static final String TAG = "PlayerView";
    private boolean hadOMPause;
    private boolean isBTVideo;
    private boolean isBTVideoPlaying;
    private boolean mHasReportedData;
    private boolean mInitState;
    private boolean mIsCovered;
    private boolean mIsFirstCreateHolder;
    private boolean mIsNeedToRepeatPrepare;
    private boolean mIsSurfaceHolderDestoryed;
    private LinearLayout mLlSurContainer;
    private LinearLayout mLoadingView;
    private String mPlayUrl;
    private SurfaceHolder mSurfaceHolder;
    private VideoFeedsPlayer mVideoFeedsPlayer;
    private OnPlayerViewVisibleListener onPlayerViewVisibleListener;
    protected int orientation;
    private b videoEvents;
    protected float xInScreen;
    protected float yInScreen;

    /* loaded from: classes4.dex */
    public class MySurfaceHoldeCallback implements SurfaceHolder.Callback {
        private MySurfaceHoldeCallback() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            try {
                ad.c(PlayerView.TAG, "surfaceChanged");
                if (PlayerView.this.mIsSurfaceHolderDestoryed && !PlayerView.this.mIsCovered && !PlayerView.this.isComplete() && !PlayerView.this.isBTVideo && !com.mbridge.msdk.foundation.d.b.f13103c) {
                    if (PlayerView.this.mVideoFeedsPlayer.hasPrepare()) {
                        ad.c(PlayerView.TAG, "surfaceChanged  start====");
                        PlayerView.this.resumeStart();
                    } else {
                        ad.c(PlayerView.TAG, "surfaceChanged  PLAY====");
                        PlayerView.this.playVideo(0);
                        PlayerView.this.resumeOMSDK();
                    }
                    if (PlayerView.this.isBTVideo) {
                        if (PlayerView.this.isBTVideoPlaying) {
                            if (!PlayerView.this.mVideoFeedsPlayer.hasPrepare()) {
                                PlayerView.this.mVideoFeedsPlayer.prepare();
                            }
                            PlayerView.this.mVideoFeedsPlayer.start(false);
                            PlayerView.this.resumeOMSDK();
                        } else {
                            PlayerView.this.pause();
                        }
                    }
                }
                PlayerView.this.mIsSurfaceHolderDestoryed = false;
            } catch (Exception e2) {
                ad.b(PlayerView.TAG, e2.getMessage());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            try {
                ad.c(PlayerView.TAG, "surfaceCreated");
                if (PlayerView.this.mVideoFeedsPlayer != null && surfaceHolder != null) {
                    PlayerView.this.mSurfaceHolder = surfaceHolder;
                    PlayerView.this.mVideoFeedsPlayer.setDisplay(surfaceHolder);
                }
            } catch (Exception e2) {
                ad.b(PlayerView.TAG, e2.getMessage());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            try {
                ad.c(PlayerView.TAG, "surfaceDestroyed ");
                PlayerView.this.mIsSurfaceHolderDestoryed = true;
                PlayerView.this.mIsNeedToRepeatPrepare = true;
                PlayerView.this.mVideoFeedsPlayer.pause();
                PlayerView.this.pauseOmsdk();
            } catch (Exception e2) {
                ad.b(PlayerView.TAG, e2.getMessage());
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface OnPlayerViewVisibleListener {
        void playerViewVisibleCallback();
    }

    public PlayerView(Context context) {
        super(context);
        this.mInitState = false;
        this.mIsFirstCreateHolder = true;
        this.mIsSurfaceHolderDestoryed = false;
        this.mIsCovered = false;
        this.mIsNeedToRepeatPrepare = false;
        this.isBTVideo = false;
        this.isBTVideoPlaying = false;
        this.orientation = 1;
        this.mHasReportedData = false;
        this.hadOMPause = false;
        init();
    }

    private void init() {
        try {
            initView();
            initPlayer();
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
    }

    private void initPlayer() {
        this.mVideoFeedsPlayer = new VideoFeedsPlayer();
    }

    private void initView() {
        View inflate = LayoutInflater.from(getContext()).inflate(v.a(getContext(), "mbridge_playercommon_player_view", TtmlNode.TAG_LAYOUT), (ViewGroup) null);
        if (inflate != null) {
            this.mLlSurContainer = (LinearLayout) inflate.findViewById(v.a(getContext(), "mbridge_playercommon_ll_sur_container", "id"));
            this.mLoadingView = (LinearLayout) inflate.findViewById(v.a(getContext(), "mbridge_playercommon_ll_loading", "id"));
            addSurfaceView();
            addView(inflate, -1, -1);
        }
    }

    public void addSurfaceView() {
        try {
            ad.c(TAG, "addSurfaceView");
            SurfaceView surfaceView = new SurfaceView(getContext().getApplicationContext());
            SurfaceHolder holder = surfaceView.getHolder();
            this.mSurfaceHolder = holder;
            holder.setType(3);
            this.mSurfaceHolder.setKeepScreenOn(true);
            this.mSurfaceHolder.addCallback(new MySurfaceHoldeCallback());
            this.mLlSurContainer.addView(surfaceView, -1, -1);
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
    }

    public JSONObject buildH5JsonObject(int i10) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(a.f13277h, ai.b(c.m().c(), this.xInScreen));
                jSONObject2.put(a.f13278i, ai.b(c.m().c(), this.yInScreen));
                jSONObject2.put(a.f13282m, i10);
                try {
                    this.orientation = getContext().getResources().getConfiguration().orientation;
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                jSONObject2.put(a.f13280k, this.orientation);
                jSONObject2.put(a.f13281l, ai.d(getContext()));
                return jSONObject2;
            } catch (JSONException e10) {
                e = e10;
                jSONObject = jSONObject2;
                e.printStackTrace();
                return jSONObject;
            }
        } catch (JSONException e11) {
            e = e11;
        }
    }

    public void closeSound() {
        VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
        if (videoFeedsPlayer != null) {
            videoFeedsPlayer.closeSound();
        }
    }

    public void coverUnlockResume() {
        try {
            this.mVideoFeedsPlayer.setIsFrontDesk(true);
            if (this.mVideoFeedsPlayer != null) {
                ad.c(TAG, "coverUnlockResume========");
                if (this.mVideoFeedsPlayer.hasPrepare() && !this.mIsNeedToRepeatPrepare) {
                    start(true);
                }
                playVideo(0);
            }
        } catch (Throwable th2) {
            ad.b(TAG, th2.getMessage());
        }
    }

    public int getCurPosition() {
        try {
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer == null) {
                return 0;
            }
            return videoFeedsPlayer.getCurPosition();
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
            return 0;
        }
    }

    public int getDuration() {
        VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
        if (videoFeedsPlayer != null) {
            return videoFeedsPlayer.getDuration();
        }
        return 0;
    }

    public b getVideoEvents() {
        return this.videoEvents;
    }

    public float getVolume() {
        VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
        if (videoFeedsPlayer != null) {
            return videoFeedsPlayer.getVolume();
        }
        return 0.0f;
    }

    public void initBufferIngParam(int i10) {
        VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
        if (videoFeedsPlayer != null) {
            videoFeedsPlayer.initBufferIngParam(i10);
        }
    }

    public boolean initVFPData(String str, String str2, VideoPlayerStatusListener videoPlayerStatusListener) {
        if (TextUtils.isEmpty(str)) {
            ad.c(TAG, "playUrl==null");
            return false;
        }
        this.mPlayUrl = str;
        this.mVideoFeedsPlayer.initPlayer(getContext(), this.mLoadingView, str, videoPlayerStatusListener);
        this.mInitState = true;
        return true;
    }

    public boolean isComplete() {
        try {
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer == null) {
                return false;
            }
            if (!videoFeedsPlayer.isComplete()) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            ad.b(TAG, th2.getMessage(), th2);
            return false;
        }
    }

    public boolean isPlayIng() {
        try {
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer != null) {
                return videoFeedsPlayer.isPlayIng();
            }
            return false;
        } catch (Throwable th2) {
            ad.b(TAG, th2.getMessage());
            return false;
        }
    }

    public boolean isSilent() {
        return this.mVideoFeedsPlayer.isSilent();
    }

    public void justSeekTo(int i10) {
        try {
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer != null) {
                videoFeedsPlayer.justSeekTo(i10);
            }
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.xInScreen = motionEvent.getRawX();
        this.yInScreen = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onPause() {
        try {
            pause();
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer != null) {
                videoFeedsPlayer.setIsFrontDesk(false);
            }
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
    }

    public void onResume() {
        try {
            this.mVideoFeedsPlayer.setIsFrontDesk(true);
            if (this.mVideoFeedsPlayer != null && !this.mIsSurfaceHolderDestoryed && !isComplete() && !this.mIsCovered) {
                ad.c(TAG, "onresume========");
                if (this.mVideoFeedsPlayer.hasPrepare()) {
                    resumeStart();
                } else {
                    playVideo(0);
                }
            }
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        try {
            if (af.a().a("i_l_s_t_r_i", false) && i10 == 0 && !this.mHasReportedData) {
                this.mHasReportedData = true;
                OnPlayerViewVisibleListener onPlayerViewVisibleListener = this.onPlayerViewVisibleListener;
                if (onPlayerViewVisibleListener != null) {
                    onPlayerViewVisibleListener.playerViewVisibleCallback();
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void openSound() {
        VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
        if (videoFeedsPlayer != null) {
            videoFeedsPlayer.openSound();
        }
    }

    public void pause() {
        try {
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer != null) {
                videoFeedsPlayer.pause();
            }
            pauseOmsdk();
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
    }

    public void pauseOmsdk() {
        try {
            if (this.videoEvents != null && !this.hadOMPause) {
                ad.a("omsdk", "play view:  pause");
                this.hadOMPause = true;
                i iVar = this.videoEvents.a;
                com.facebook.internal.i.d(iVar);
                iVar.f20672e.a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE, null);
            }
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public boolean playVideo(int i10) {
        try {
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer == null) {
                ad.c(TAG, "player init error 播放失败");
                return false;
            }
            if (!this.mInitState) {
                ad.c(TAG, "vfp init failed 播放失败");
                return false;
            }
            videoFeedsPlayer.play(this.mPlayUrl, i10);
            this.mIsNeedToRepeatPrepare = false;
            return true;
        } catch (Throwable th2) {
            ad.b(TAG, th2.getMessage(), th2);
            return false;
        }
    }

    public void prepare() {
        try {
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer != null) {
                videoFeedsPlayer.prepare();
            }
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
    }

    public void release() {
        try {
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer != null) {
                videoFeedsPlayer.releasePlayer();
            }
            if (this.mSurfaceHolder != null) {
                ad.b(TAG, "mSurfaceHolder release");
                this.mSurfaceHolder.getSurface().release();
            }
        } catch (Throwable th2) {
            ad.b(TAG, th2.getMessage());
        }
    }

    public void removeSurface() {
        try {
            ad.c(TAG, "removeSurface");
            this.mLlSurContainer.removeAllViews();
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
    }

    public void resumeOMSDK() {
        try {
            b bVar = this.videoEvents;
            if (bVar != null) {
                this.hadOMPause = false;
                bVar.c();
                ad.a("omsdk", "play view:  resume");
            }
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public void resumeStart() {
        try {
            start(true);
            resumeOMSDK();
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
    }

    public void seekTo(int i10) {
        try {
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer != null) {
                videoFeedsPlayer.seekTo(i10);
            }
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
    }

    public void seekToEndFrame() {
        VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
        if (videoFeedsPlayer != null) {
            videoFeedsPlayer.seekToEndFrame();
        }
    }

    public void setDataSource() {
        try {
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer != null) {
                videoFeedsPlayer.showLoading();
                this.mVideoFeedsPlayer.setDataSource();
                this.mIsNeedToRepeatPrepare = false;
            }
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
    }

    public void setDesk(boolean z10) {
        this.mVideoFeedsPlayer.setIsFrontDesk(z10);
    }

    public void setIsBTVideo(boolean z10) {
        this.isBTVideo = z10;
    }

    public void setIsBTVideoPlaying(boolean z10) {
        this.isBTVideoPlaying = z10;
    }

    public void setIsCovered(boolean z10) {
        try {
            this.mIsCovered = z10;
            ad.b(TAG, "mIsCovered:" + z10);
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
    }

    public void setNotifyListener(OnPlayerViewVisibleListener onPlayerViewVisibleListener) {
        this.onPlayerViewVisibleListener = onPlayerViewVisibleListener;
    }

    public void setPlaybackParams(float f10) {
        VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
        if (videoFeedsPlayer != null) {
            videoFeedsPlayer.setPlaybackParams(f10);
        }
    }

    public void setVideoEvents(b bVar) {
        this.videoEvents = bVar;
    }

    public void setVolume(float f10, float f11) {
        VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
        if (videoFeedsPlayer != null) {
            videoFeedsPlayer.setVolume(f10, f11);
        }
    }

    public void start(boolean z10) {
        try {
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer == null || this.mIsCovered) {
                return;
            }
            videoFeedsPlayer.start(z10);
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
    }

    public void stop() {
        try {
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer != null) {
                videoFeedsPlayer.stop();
            }
            if (this.videoEvents != null) {
                this.videoEvents = null;
            }
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
    }

    public void start(int i10) {
        try {
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer != null) {
                videoFeedsPlayer.start(i10);
            }
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
    }

    public boolean playVideo() {
        return playVideo(0);
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mInitState = false;
        this.mIsFirstCreateHolder = true;
        this.mIsSurfaceHolderDestoryed = false;
        this.mIsCovered = false;
        this.mIsNeedToRepeatPrepare = false;
        this.isBTVideo = false;
        this.isBTVideoPlaying = false;
        this.orientation = 1;
        this.mHasReportedData = false;
        this.hadOMPause = false;
        init();
    }
}

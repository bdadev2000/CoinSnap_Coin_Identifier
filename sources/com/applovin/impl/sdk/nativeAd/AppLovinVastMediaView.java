package com.applovin.impl.sdk.nativeAd;

import a4.j;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.exoplayer2.ui.d;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.ar;
import com.applovin.impl.bq;
import com.applovin.impl.gq;
import com.applovin.impl.hq;
import com.applovin.impl.kh;
import com.applovin.impl.lq;
import com.applovin.impl.mq;
import com.applovin.impl.nh;
import com.applovin.impl.nq;
import com.applovin.impl.od;
import com.applovin.impl.oj;
import com.applovin.impl.p;
import com.applovin.impl.pq;
import com.applovin.impl.r;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.t4;
import com.applovin.impl.u5;
import com.applovin.impl.up;
import com.applovin.impl.wd;
import com.applovin.impl.x3;
import com.applovin.impl.yh;
import com.applovin.impl.yp;
import com.applovin.impl.zj;
import com.applovin.impl.zp;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class AppLovinVastMediaView extends AppLovinMediaView implements AppLovinCommunicatorSubscriber, zp.b {
    private static final String COUNTDOWN_IDENTIFIER_PROGRESS_TRACKING = "PROGRESS_TRACKING";
    private static final long FADE_ANIMATION_DURATION_MILLIS = 250;
    private static final String TAG = "AppLovinVastMediaView";
    private final AtomicBoolean automaticPauseHandled;
    private final AtomicBoolean automaticResumeHandled;
    private final Handler countdownHandler;
    private final t4 countdownManager;

    @Nullable
    private ImageView industryIconImageView;
    private final AtomicBoolean initialOnAttachedToWindowHandled;
    private boolean isVideoMuted;
    private boolean isVideoPausedByUser;
    private final boolean isVideoStream;
    private long lastVideoPositionFromPauseMillis;
    private final p lifecycleCallbacksAdapter;
    private final AtomicBoolean mediaErrorHandled;
    private final zj mediaPlayer;

    @Nullable
    private ImageView muteButtonImageView;

    @Nullable
    private ImageView playPauseButtonImageView;

    @Nullable
    private FrameLayout replayIconContainer;
    private int savedVideoPercentViewed;
    private long startTimeMillis;
    private final bq vastAd;
    private long videoDurationMillis;
    private final AtomicBoolean videoEndListenerNotified;
    private final Set<lq> videoProgressTrackers;
    private final com.applovin.exoplayer2.ui.e videoView;
    private boolean videoWasCompleted;

    @Nullable
    private LinearLayout videoWidgetLinearLayout;
    private Activity viewActivity;

    /* loaded from: classes.dex */
    public class a extends p {
        public a() {
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (activity.equals(AppLovinVastMediaView.this.viewActivity)) {
                AppLovinVastMediaView.this.maybeHandlePause();
            }
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (activity.equals(AppLovinVastMediaView.this.viewActivity) && !AppLovinVastMediaView.this.isVideoPausedByUser) {
                AppLovinVastMediaView.this.maybeHandleResume();
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements t4.b {
        public b() {
        }

        @Override // com.applovin.impl.t4.b
        public void a() {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(AppLovinVastMediaView.this.videoDurationMillis - (AppLovinVastMediaView.this.mediaPlayer.getDuration() - AppLovinVastMediaView.this.mediaPlayer.getCurrentPosition()));
            int videoPercentViewed = AppLovinVastMediaView.this.getVideoPercentViewed();
            HashSet hashSet = new HashSet();
            Iterator it = new HashSet(AppLovinVastMediaView.this.videoProgressTrackers).iterator();
            while (it.hasNext()) {
                lq lqVar = (lq) it.next();
                if (lqVar.a(seconds, videoPercentViewed)) {
                    hashSet.add(lqVar);
                    AppLovinVastMediaView.this.videoProgressTrackers.remove(lqVar);
                }
            }
            AppLovinVastMediaView.this.maybeFireTrackers(hashSet);
            if (videoPercentViewed >= 25 && videoPercentViewed < 50) {
                AppLovinVastMediaView.this.vastAd.getAdEventTracker().x();
                return;
            }
            if (videoPercentViewed >= 50 && videoPercentViewed < 75) {
                AppLovinVastMediaView.this.vastAd.getAdEventTracker().y();
            } else if (videoPercentViewed >= 75) {
                AppLovinVastMediaView.this.vastAd.getAdEventTracker().C();
            }
        }

        @Override // com.applovin.impl.t4.b
        public boolean b() {
            return !AppLovinVastMediaView.this.videoWasCompleted;
        }
    }

    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        private c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Uri b3;
            hq k12 = AppLovinVastMediaView.this.vastAd.k1();
            if (k12 == null || (b3 = k12.b()) == null) {
                return;
            }
            t tVar = AppLovinVastMediaView.this.logger;
            if (t.a()) {
                AppLovinVastMediaView.this.logger.a(AppLovinVastMediaView.TAG, "Industry icon clicked, opening URL: " + b3);
            }
            AppLovinVastMediaView.this.maybeFireTrackers(bq.d.INDUSTRY_ICON_CLICK);
            up.a(b3, view.getContext(), AppLovinVastMediaView.this.sdk);
        }

        public /* synthetic */ c(AppLovinVastMediaView appLovinVastMediaView, a aVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public class d implements AppLovinTouchToClickListener.OnClickListener {
        private final AppLovinNativeAdImpl a;

        public d(AppLovinNativeAdImpl appLovinNativeAdImpl) {
            this.a = appLovinNativeAdImpl;
        }

        @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
        public void onClick(View view, MotionEvent motionEvent) {
            Uri j02;
            Context context;
            AppLovinVastMediaView.this.maybeFireTrackers(bq.d.VIDEO_CLICK);
            AppLovinVastMediaView.this.vastAd.getAdEventTracker().v();
            if (!AppLovinVastMediaView.this.vastAd.F0() || (j02 = AppLovinVastMediaView.this.vastAd.j0()) == null) {
                return;
            }
            t tVar = AppLovinVastMediaView.this.logger;
            if (t.a()) {
                AppLovinVastMediaView.this.logger.a(AppLovinVastMediaView.TAG, "Clicking through video");
            }
            AppLovinVastMediaView.this.sdk.i().maybeSubmitPersistentPostbacks(AppLovinVastMediaView.this.vastAd.a(motionEvent, false));
            if (((Boolean) AppLovinVastMediaView.this.sdk.a(oj.N)).booleanValue() && AppLovinVastMediaView.this.viewActivity != null) {
                context = AppLovinVastMediaView.this.viewActivity;
            } else {
                context = AppLovinVastMediaView.this.getContext();
            }
            this.a.handleNativeAdClick(j02, null, motionEvent, context);
        }
    }

    /* loaded from: classes.dex */
    public class e implements nh.c, d.e {
        private e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() {
            AppLovinVastMediaView.this.mediaPlayer.a(0L);
        }

        @Override // com.applovin.impl.nh.c
        public void b(int i10) {
            t tVar = AppLovinVastMediaView.this.logger;
            if (t.a()) {
                t tVar2 = AppLovinVastMediaView.this.logger;
                StringBuilder m10 = j.m("Player state changed to state ", i10, " and will play when ready: ");
                m10.append(AppLovinVastMediaView.this.mediaPlayer.l());
                tVar2.a(AppLovinVastMediaView.TAG, m10.toString());
            }
            if (i10 == 3) {
                AppLovinVastMediaView.this.mediaPlayer.a(!AppLovinVastMediaView.this.isVideoMuted ? 1 : 0);
                AppLovinVastMediaView appLovinVastMediaView = AppLovinVastMediaView.this;
                appLovinVastMediaView.videoDurationMillis = appLovinVastMediaView.mediaPlayer.getDuration();
                AppLovinVastMediaView.this.vastAd.getAdEventTracker().b((float) TimeUnit.MILLISECONDS.toSeconds(AppLovinVastMediaView.this.videoDurationMillis), zp.e(AppLovinVastMediaView.this.sdk));
                t tVar3 = AppLovinVastMediaView.this.logger;
                if (t.a()) {
                    AppLovinVastMediaView.this.logger.a(AppLovinVastMediaView.TAG, "MediaPlayer prepared: " + AppLovinVastMediaView.this.mediaPlayer);
                }
                AppLovinVastMediaView.this.countdownManager.b();
                return;
            }
            if (i10 == 4) {
                t tVar4 = AppLovinVastMediaView.this.logger;
                if (t.a()) {
                    AppLovinVastMediaView.this.logger.a(AppLovinVastMediaView.TAG, "Video completed");
                }
                AppLovinVastMediaView.this.videoWasCompleted = true;
                AppLovinVastMediaView.this.finishVideo();
                if (AppLovinVastMediaView.this.replayIconContainer != null) {
                    ar.a(AppLovinVastMediaView.this.replayIconContainer, AppLovinVastMediaView.FADE_ANIMATION_DURATION_MILLIS, new com.applovin.impl.sdk.nativeAd.d(this, 0));
                } else {
                    AppLovinVastMediaView.this.showMediaImageView();
                }
            }
        }

        @Override // com.applovin.exoplayer2.ui.d.e
        public void d(int i10) {
            if (i10 == 0) {
                AppLovinVastMediaView.this.videoView.c();
            }
        }

        public /* synthetic */ e(AppLovinVastMediaView appLovinVastMediaView, a aVar) {
            this();
        }

        @Override // com.applovin.impl.nh.c
        public void a(kh khVar) {
            AppLovinVastMediaView.this.handleMediaError("Video view error (" + zp.a(khVar, AppLovinVastMediaView.this.sdk) + ")");
        }
    }

    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        private f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i10 = 1;
            if (view == AppLovinVastMediaView.this.playPauseButtonImageView) {
                if (AppLovinVastMediaView.this.mediaPlayer.isPlaying()) {
                    AppLovinVastMediaView.this.isVideoPausedByUser = true;
                    AppLovinVastMediaView.this.maybeHandlePause();
                    return;
                } else {
                    AppLovinVastMediaView.this.isVideoPausedByUser = false;
                    AppLovinVastMediaView.this.maybeHandleResume();
                    return;
                }
            }
            if (view == AppLovinVastMediaView.this.muteButtonImageView) {
                boolean z10 = AppLovinVastMediaView.this.isVideoMuted;
                boolean z11 = !z10;
                AppLovinVastMediaView.this.isVideoMuted = z11;
                AppLovinVastMediaView.this.mediaPlayer.a(z10 ? 1.0f : 0.0f);
                AppLovinVastMediaView.this.populateMuteImage(z11);
                return;
            }
            if (view == AppLovinVastMediaView.this.replayIconContainer) {
                ar.b(AppLovinVastMediaView.this.replayIconContainer, AppLovinVastMediaView.FADE_ANIMATION_DURATION_MILLIS, new com.applovin.impl.sdk.nativeAd.d(this, i10));
            }
        }

        public /* synthetic */ f(AppLovinVastMediaView appLovinVastMediaView, a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            AppLovinVastMediaView.this.videoWasCompleted = false;
            AppLovinVastMediaView.this.automaticResumeHandled.set(false);
            AppLovinVastMediaView.this.sdk.e().a(AppLovinVastMediaView.this.lifecycleCallbacksAdapter);
            AppLovinVastMediaView.this.maybeHandleResume();
        }
    }

    public AppLovinVastMediaView(AppLovinNativeAdImpl appLovinNativeAdImpl, k kVar, Context context) {
        super(appLovinNativeAdImpl, kVar, context);
        int i10;
        Handler handler = new Handler(Looper.getMainLooper());
        this.countdownHandler = handler;
        this.countdownManager = new t4(handler, this.sdk);
        this.videoEndListenerNotified = new AtomicBoolean();
        this.mediaErrorHandled = new AtomicBoolean();
        this.initialOnAttachedToWindowHandled = new AtomicBoolean();
        this.automaticPauseHandled = new AtomicBoolean();
        this.automaticResumeHandled = new AtomicBoolean();
        this.isVideoMuted = true;
        this.lastVideoPositionFromPauseMillis = -1L;
        HashSet hashSet = new HashSet();
        this.videoProgressTrackers = hashSet;
        this.lifecycleCallbacksAdapter = new a();
        bq vastAd = appLovinNativeAdImpl.getVastAd();
        this.vastAd = vastAd;
        boolean G0 = vastAd.G0();
        this.isVideoStream = G0;
        if (zp.a(oj.f6713n1, kVar)) {
            checkCachedAdResourcesAsync(!G0);
        }
        if (G0) {
            AppLovinCommunicator.getInstance(context).subscribe(this, "video_caching_failed");
        }
        a aVar = null;
        if (vastAd.q1()) {
            this.industryIconImageView = hq.a(vastAd.k1().d(), context, kVar);
            int dpToPx = AppLovinSdkUtils.dpToPx(context, ((Integer) kVar.a(oj.W4)).intValue());
            this.industryIconImageView.setLayoutParams(new FrameLayout.LayoutParams(dpToPx, dpToPx, ((Integer) kVar.a(oj.Y4)).intValue()));
            this.industryIconImageView.setOnClickListener(new c(this, aVar));
            addView(this.industryIconImageView);
        }
        if (((Boolean) kVar.a(oj.f6640d5)).booleanValue()) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.videoWidgetLinearLayout = linearLayout;
            linearLayout.setOrientation(0);
            this.videoWidgetLinearLayout.setBackgroundResource(R.drawable.applovin_rounded_black_background);
            this.videoWidgetLinearLayout.setAlpha(((Float) kVar.a(oj.f6632c5)).floatValue());
            ImageView imageView = new ImageView(context);
            this.playPauseButtonImageView = imageView;
            imageView.setClickable(true);
            f fVar = new f(this, aVar);
            this.playPauseButtonImageView.setOnClickListener(fVar);
            int dpToPx2 = AppLovinSdkUtils.dpToPx(context, ((Integer) kVar.a(oj.f6618a5)).intValue());
            this.playPauseButtonImageView.setLayoutParams(new FrameLayout.LayoutParams(dpToPx2, dpToPx2));
            populatePlayPauseImage(false);
            this.videoWidgetLinearLayout.addView(this.playPauseButtonImageView);
            this.muteButtonImageView = new ImageView(context);
            if (populateMuteImage(this.isVideoMuted)) {
                i10 = AppLovinSdkUtils.dpToPx(context, ((Integer) kVar.a(oj.Z4)).intValue());
                this.muteButtonImageView.setClickable(true);
                this.muteButtonImageView.setOnClickListener(fVar);
                this.muteButtonImageView.setLayoutParams(new FrameLayout.LayoutParams(i10, i10));
                this.videoWidgetLinearLayout.addView(this.muteButtonImageView);
            } else {
                i10 = 0;
            }
            int dpToPx3 = AppLovinSdkUtils.dpToPx(context, ((Integer) kVar.a(oj.f6624b5)).intValue());
            this.videoWidgetLinearLayout.setPadding(dpToPx3, dpToPx3, dpToPx3, dpToPx3);
            int i11 = dpToPx3 * 2;
            this.videoWidgetLinearLayout.setLayoutParams(new FrameLayout.LayoutParams(dpToPx2 + i10 + i11, Math.max(dpToPx2, i10) + i11, 8388691));
            addView(this.videoWidgetLinearLayout);
        }
        if (((Boolean) kVar.a(oj.f6646e5)).booleanValue()) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.replayIconContainer = frameLayout;
            frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            this.replayIconContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.replayIconContainer.setVisibility(4);
            this.replayIconContainer.setOnClickListener(new f(this, aVar));
            ImageView imageView2 = new ImageView(getContext());
            int dpToPx4 = AppLovinSdkUtils.dpToPx(context, ((Integer) kVar.a(oj.f6654f5)).intValue());
            imageView2.setLayoutParams(new FrameLayout.LayoutParams(dpToPx4, dpToPx4, 17));
            imageView2.setImageResource(R.drawable.applovin_ic_replay_icon);
            imageView2.setAdjustViewBounds(true);
            imageView2.setMaxHeight(this.replayIconContainer.getHeight());
            imageView2.setMaxWidth(this.replayIconContainer.getWidth());
            this.replayIconContainer.addView(imageView2);
            addView(this.replayIconContainer);
        }
        zj a10 = new zj.b(getContext()).a();
        this.mediaPlayer = a10;
        e eVar = new e(this, aVar);
        a10.a((nh.c) eVar);
        a10.a(0);
        com.applovin.exoplayer2.ui.e eVar2 = new com.applovin.exoplayer2.ui.e(getContext());
        this.videoView = eVar2;
        eVar2.c();
        eVar2.setControllerVisibilityListener(eVar);
        eVar2.setPlayer(a10);
        eVar2.setOnTouchListener(new AppLovinTouchToClickListener(kVar, oj.B0, getContext(), new d(appLovinNativeAdImpl)));
        addView(eVar2);
        bringChildToFront(this.industryIconImageView);
        bringChildToFront(this.videoWidgetLinearLayout);
        prepareMediaPlayer();
        appLovinNativeAdImpl.setVideoView(eVar2);
        hashSet.addAll(vastAd.a(bq.d.VIDEO, mq.a));
    }

    private void checkCachedAdResourcesAsync(boolean z10) {
        zp.a(z10, this.vastAd, this.sdk, k.k(), this);
    }

    private void checkCachedAdResourcesImmediately(boolean z10) {
        if (zp.a(z10, this.vastAd, this.sdk, getContext()).isEmpty()) {
            return;
        }
        handleUnavailableCachedResources();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishVideo() {
        maybeFireTrackers(bq.d.VIDEO, "close");
        maybeHandlePause();
        this.sdk.e().b(this.lifecycleCallbacksAdapter);
        if (this.videoWasCompleted) {
            maybeFireRemainingCompletionTrackers();
            this.vastAd.getAdEventTracker().w();
        }
        if (this.videoEndListenerNotified.compareAndSet(false, true)) {
            this.sdk.i().trackVideoEnd(this.vastAd, TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - this.startTimeMillis), getVideoPercentViewed(), this.isVideoStream);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getVideoPercentViewed() {
        long currentPosition = this.mediaPlayer.getCurrentPosition();
        if (this.videoWasCompleted) {
            return 100;
        }
        if (currentPosition > 0) {
            return (int) ((((float) currentPosition) / ((float) this.videoDurationMillis)) * 100.0f);
        }
        return this.savedVideoPercentViewed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleMediaError(String str) {
        if (t.a()) {
            this.logger.b(TAG, str);
        }
        maybeFireTrackers(bq.d.ERROR, gq.MEDIA_FILE_ERROR);
        this.vastAd.getAdEventTracker().b(str);
        if (this.mediaErrorHandled.compareAndSet(false, true)) {
            finishVideo();
            showMediaImageView();
        }
    }

    private void handleUnavailableCachedResources() {
        if (t.a()) {
            this.logger.b(TAG, "Video failed due to unavailable resources");
        }
        finishVideo();
        showMediaImageView();
    }

    private void maybeFireRemainingCompletionTrackers() {
        if (getVideoPercentViewed() >= this.vastAd.m0() && !this.videoProgressTrackers.isEmpty()) {
            if (t.a()) {
                this.logger.k(TAG, "Firing " + this.videoProgressTrackers.size() + " un-fired video progress trackers when video was completed.");
            }
            maybeFireTrackers(this.videoProgressTrackers);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeFireTrackers(bq.d dVar) {
        maybeFireTrackers(dVar, gq.UNSPECIFIED);
    }

    private void maybeHandleOnAttachedToWindow() {
        if (!this.initialOnAttachedToWindowHandled.compareAndSet(false, true)) {
            return;
        }
        if (this.industryIconImageView != null && this.vastAd.q1()) {
            maybeFireTrackers(bq.d.INDUSTRY_ICON_IMPRESSION);
            this.industryIconImageView.setVisibility(0);
        }
        this.startTimeMillis = SystemClock.elapsedRealtime();
        maybeFireTrackers(bq.d.IMPRESSION);
        maybeFireTrackers(bq.d.VIDEO, "creativeView");
        this.vastAd.getAdEventTracker().g();
        this.vastAd.setHasShown(true);
        this.sdk.i().trackImpression(this.vastAd);
        this.viewActivity = r.a(ar.b(this));
        this.sdk.e().a(this.lifecycleCallbacksAdapter);
        this.mediaPlayer.a(true);
        this.countdownManager.a(COUNTDOWN_IDENTIFIER_PROGRESS_TRACKING, TimeUnit.SECONDS.toMillis(1L), new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeHandlePause() {
        if (!this.automaticPauseHandled.compareAndSet(false, true)) {
            return;
        }
        maybeFireTrackers(bq.d.VIDEO, CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
        this.vastAd.getAdEventTracker().z();
        pauseVideo();
        populatePlayPauseImage(true);
        this.automaticResumeHandled.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeHandleResume() {
        if (!this.automaticResumeHandled.compareAndSet(false, true)) {
            return;
        }
        maybeFireTrackers(bq.d.VIDEO, CampaignEx.JSON_NATIVE_VIDEO_RESUME);
        this.vastAd.getAdEventTracker().A();
        if (this.lastVideoPositionFromPauseMillis >= 0) {
            if (t.a()) {
                this.logger.a(TAG, "Resuming video at position " + this.lastVideoPositionFromPauseMillis);
            }
            this.mediaPlayer.a(true);
            this.countdownManager.b();
            this.lastVideoPositionFromPauseMillis = -1L;
        } else if (t.a()) {
            this.logger.a(TAG, "Invalid last video position, isVideoPlaying=" + this.mediaPlayer.isPlaying());
        }
        populatePlayPauseImage(false);
        this.automaticPauseHandled.set(false);
    }

    private void pauseVideo() {
        if (t.a()) {
            this.logger.a(TAG, "Pausing video");
        }
        this.savedVideoPercentViewed = getVideoPercentViewed();
        this.lastVideoPositionFromPauseMillis = this.mediaPlayer.getCurrentPosition();
        this.mediaPlayer.a(false);
        this.countdownManager.c();
        if (t.a()) {
            this.logger.a(TAG, j.j(new StringBuilder("Paused video at position "), this.lastVideoPositionFromPauseMillis, " ms"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean populateMuteImage(boolean z10) {
        Uri e02;
        int i10;
        if (this.muteButtonImageView == null) {
            return false;
        }
        if (x3.f()) {
            Context context = getContext();
            if (z10) {
                i10 = R.drawable.applovin_ic_unmute_to_mute;
            } else {
                i10 = R.drawable.applovin_ic_mute_to_unmute;
            }
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) context.getDrawable(i10);
            if (animatedVectorDrawable != null) {
                this.muteButtonImageView.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return true;
            }
        }
        if (z10) {
            e02 = this.vastAd.L();
        } else {
            e02 = this.vastAd.e0();
        }
        if (e02 == null) {
            return false;
        }
        ImageViewUtils.setImageUri(this.muteButtonImageView, e02, this.sdk);
        return true;
    }

    private void populatePlayPauseImage(boolean z10) {
        int i10;
        ImageView imageView = this.playPauseButtonImageView;
        if (imageView == null) {
            return;
        }
        if (z10) {
            i10 = R.drawable.applovin_ic_play_icon;
        } else {
            i10 = R.drawable.applovin_ic_pause_icon;
        }
        imageView.setImageResource(i10);
    }

    private void prepareMediaPlayer() {
        if (!zp.a(oj.f6713n1, this.sdk)) {
            checkCachedAdResourcesImmediately(!this.isVideoStream);
        }
        yh a10 = new yh.b(new u5(getContext(), yp.a(getContext(), AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN))).a(od.a(this.vastAd.s0()));
        this.mediaPlayer.a(!this.isVideoMuted ? 1 : 0);
        this.mediaPlayer.a((wd) a10);
        this.mediaPlayer.b();
        this.mediaPlayer.a(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showMediaImageView() {
        if (this.imageView.getDrawable() == null) {
            return;
        }
        this.imageView.setVisibility(0);
        this.videoView.setVisibility(8);
        LinearLayout linearLayout = this.videoWidgetLinearLayout;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        ImageView imageView = this.industryIconImageView;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinMediaView
    public void destroy() {
        finishVideo();
        ImageView imageView = this.industryIconImageView;
        if (imageView != null) {
            imageView.setOnClickListener(null);
        }
        ImageView imageView2 = this.playPauseButtonImageView;
        if (imageView2 != null) {
            imageView2.setOnClickListener(null);
        }
        ImageView imageView3 = this.muteButtonImageView;
        if (imageView3 != null) {
            imageView3.setOnClickListener(null);
        }
        FrameLayout frameLayout = this.replayIconContainer;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(null);
        }
        this.videoView.setOnTouchListener(null);
        this.viewActivity = null;
        this.mediaPlayer.V();
        this.vastAd.getAdEventTracker().f();
        this.countdownManager.a();
        this.countdownHandler.removeCallbacksAndMessages(null);
        if (this.isVideoStream) {
            AppLovinCommunicator.getInstance(getContext()).unsubscribe(this, "video_caching_failed");
        }
        super.destroy();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return TAG;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        maybeHandleOnAttachedToWindow();
        if (!this.isVideoPausedByUser) {
            maybeHandleResume();
        }
    }

    @Override // com.applovin.impl.zp.b
    public void onCachedResourcesChecked(boolean z10) {
        if (z10) {
            return;
        }
        handleUnavailableCachedResources();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        maybeHandlePause();
        super.onDetachedFromWindow();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if (!"video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            return;
        }
        Bundle messageData = appLovinCommunicatorMessage.getMessageData();
        if (messageData.getLong("ad_id") == this.vastAd.getAdIdNumber() && this.isVideoStream) {
            int i10 = messageData.getInt("load_response_code");
            String string = messageData.getString("load_exception_message");
            if ((string != null || i10 < 200 || i10 >= 300) && !this.videoWasCompleted && !this.mediaPlayer.isPlaying()) {
                handleMediaError("Video cache error during stream. ResponseCode=" + i10 + ", exception=" + string);
            }
        }
    }

    private void maybeFireTrackers(bq.d dVar, gq gqVar) {
        maybeFireTrackers(dVar, "", gqVar);
    }

    private void maybeFireTrackers(bq.d dVar, String str) {
        maybeFireTrackers(dVar, str, gq.UNSPECIFIED);
    }

    private void maybeFireTrackers(bq.d dVar, String str, gq gqVar) {
        maybeFireTrackers((Set<lq>) this.vastAd.a(dVar, str), gqVar);
    }

    private void maybeFireTrackers(Set<lq> set, gq gqVar) {
        if (set == null || set.isEmpty()) {
            return;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.mediaPlayer.getCurrentPosition());
        pq p12 = this.vastAd.p1();
        Uri c10 = p12 != null ? p12.c() : null;
        if (t.a()) {
            this.logger.a(TAG, "Firing " + set.size() + " tracker(s): " + set);
        }
        nq.a(set, seconds, c10, gqVar, this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeFireTrackers(Set<lq> set) {
        maybeFireTrackers(set, gq.UNSPECIFIED);
    }
}

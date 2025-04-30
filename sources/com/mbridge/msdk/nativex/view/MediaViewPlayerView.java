package com.mbridge.msdk.nativex.view;

import O5.g;
import O5.k;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.adjust.sdk.Constants;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.an;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.playercommon.VideoNativePlayer;
import com.mbridge.msdk.playercommon.VideoPlayerStatusListener;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.mbridge.msdk.videocommon.view.MyImageView;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes3.dex */
public class MediaViewPlayerView extends LinearLayout implements VideoPlayerStatusListener {

    /* renamed from: F, reason: collision with root package name */
    private static Handler f16790F = new Handler();

    /* renamed from: A, reason: collision with root package name */
    private String f16791A;

    /* renamed from: B, reason: collision with root package name */
    private String f16792B;

    /* renamed from: C, reason: collision with root package name */
    private CampaignEx f16793C;

    /* renamed from: D, reason: collision with root package name */
    private com.mbridge.msdk.nativex.listener.a f16794D;

    /* renamed from: E, reason: collision with root package name */
    private Timer f16795E;

    /* renamed from: G, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.download.a f16796G;

    /* renamed from: H, reason: collision with root package name */
    private VideoNativePlayer f16797H;

    /* renamed from: I, reason: collision with root package name */
    private a f16798I;

    /* renamed from: J, reason: collision with root package name */
    private O5.b f16799J;

    /* renamed from: K, reason: collision with root package name */
    private P5.b f16800K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f16801L;

    /* renamed from: a, reason: collision with root package name */
    private boolean f16802a;
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16803c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16804d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f16805e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f16806f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f16807g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f16808h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f16809i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f16810j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f16811k;
    private volatile int l;
    private boolean m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f16812n;

    /* renamed from: o, reason: collision with root package name */
    private TextureView f16813o;

    /* renamed from: p, reason: collision with root package name */
    private LinearLayout f16814p;

    /* renamed from: q, reason: collision with root package name */
    private Surface f16815q;

    /* renamed from: r, reason: collision with root package name */
    private ProgressBar f16816r;

    /* renamed from: s, reason: collision with root package name */
    private MyImageView f16817s;

    /* renamed from: t, reason: collision with root package name */
    private ImageView f16818t;

    /* renamed from: u, reason: collision with root package name */
    private ImageView f16819u;

    /* renamed from: v, reason: collision with root package name */
    private ImageView f16820v;

    /* renamed from: w, reason: collision with root package name */
    private ImageView f16821w;

    /* renamed from: x, reason: collision with root package name */
    private View f16822x;

    /* renamed from: y, reason: collision with root package name */
    private AnimationDrawable f16823y;

    /* renamed from: z, reason: collision with root package name */
    private AlphaAnimation f16824z;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private MediaViewPlayerView f16832a;

        public a(MediaViewPlayerView mediaViewPlayerView) {
            this.f16832a = mediaViewPlayerView;
        }

        public void a() {
            try {
                MediaViewPlayerView mediaViewPlayerView = this.f16832a;
                if (mediaViewPlayerView != null && !mediaViewPlayerView.f16810j) {
                    ad.c("MediaViewPlayerView", "play end and display endcardView");
                    this.f16832a.e();
                }
            } catch (Exception e4) {
                ad.b("MediaViewPlayerView", e4.getMessage());
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b implements TextureView.SurfaceTextureListener {
        private b() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i9, int i10) {
            try {
                MediaViewPlayerView.this.f16815q = new Surface(surfaceTexture);
                MediaViewPlayerView.this.f16807g = true;
                MediaViewPlayerView.this.f16809i = true;
                if (MediaViewPlayerView.this.f16804d) {
                    if (MediaViewPlayerView.this.f16808h) {
                        MediaViewPlayerView.this.f16803c = false;
                        MediaViewPlayerView.this.f16808h = false;
                    }
                    if (!MediaViewPlayerView.this.isComplete() && !MediaViewPlayerView.this.f16805e) {
                        MediaViewPlayerView.this.startOrPlayVideo();
                        return;
                    }
                    MediaViewPlayerView.this.e();
                    return;
                }
                if (MediaViewPlayerView.this.b) {
                    if (MediaViewPlayerView.this.hasPrepare() && MediaViewPlayerView.this.isComplete()) {
                        MediaViewPlayerView.this.e();
                        return;
                    }
                    MediaViewPlayerView.this.startOrPlayVideo();
                    return;
                }
                if (MediaViewPlayerView.this.hasPrepare() && !MediaViewPlayerView.this.isComplete()) {
                    MediaViewPlayerView.this.startOrPlayVideo();
                    return;
                }
                MediaViewPlayerView.this.e();
            } catch (Exception e4) {
                ad.b("MediaViewPlayerView", e4.getMessage());
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            try {
                if (MediaViewPlayerView.this.f16797H != null && MediaViewPlayerView.this.f16797H.isPlayIng()) {
                    MediaViewPlayerView.this.pause();
                }
                MediaViewPlayerView.this.f16803c = true;
                MediaViewPlayerView.this.f16807g = false;
            } catch (Throwable th) {
                ad.b("MediaViewPlayerView", th.getMessage());
            }
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i9, int i10) {
            ad.c("MediaViewPlayerView", "onSurfaceTextureSizeChanged ");
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public MediaViewPlayerView(Context context) {
        super(context);
        this.f16802a = false;
        this.b = false;
        this.f16803c = false;
        this.f16804d = false;
        this.f16805e = false;
        this.f16806f = false;
        this.f16807g = false;
        this.f16808h = true;
        this.f16809i = false;
        this.f16810j = true;
        this.f16811k = false;
        this.l = -1;
        this.m = true;
        this.f16812n = true;
        this.f16799J = null;
        this.f16800K = null;
        this.f16801L = false;
        a();
    }

    private void g() {
        ImageView imageView;
        if (this.f16804d || (imageView = this.f16821w) == null || imageView.getVisibility() == 0 || !this.m) {
            return;
        }
        this.f16821w.setVisibility(0);
    }

    public void closeSound() {
        this.f16811k = false;
        try {
            if (this.f16797H != null) {
                this.f16820v.setImageResource(v.a(getContext(), "mbridge_nativex_sound_close", "drawable"));
                this.f16797H.closeSound();
            }
            try {
                P5.b bVar = this.f16800K;
                if (bVar != null) {
                    bVar.e(0.0f);
                }
            } catch (IllegalArgumentException e4) {
                ad.a("OMSDK", e4.getMessage());
            }
        } catch (Throwable th) {
            ad.b("MediaViewPlayerView", th.getMessage());
        }
    }

    public boolean curIsFullScreen() {
        return this.f16804d;
    }

    public Campaign getCampaign() {
        return this.f16793C;
    }

    public boolean getIsActiviePause() {
        return this.f16805e;
    }

    public void gonePauseView() {
        Handler handler = f16790F;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.mbridge.msdk.nativex.view.MediaViewPlayerView.5
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        MediaViewPlayerView.this.k();
                        MediaViewPlayerView.this.j();
                    } catch (Exception e4) {
                        ad.b("MediaViewPlayerView", e4.getMessage());
                    }
                }
            });
        }
    }

    public boolean halfLoadingViewisVisible() {
        try {
            VideoNativePlayer videoNativePlayer = this.f16797H;
            if (videoNativePlayer != null) {
                if (videoNativePlayer.loadingViewIsVisible()) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (Throwable th) {
            ad.b("MediaViewPlayerView", th.getMessage());
            return false;
        }
    }

    public boolean hasPrepare() {
        try {
            VideoNativePlayer videoNativePlayer = this.f16797H;
            if (videoNativePlayer != null) {
                return videoNativePlayer.hasPrepare();
            }
            return false;
        } catch (Throwable th) {
            ad.b("MediaViewPlayerView", th.getMessage());
            return false;
        }
    }

    public boolean initPlayerViewData(String str, CampaignEx campaignEx, boolean z8, VideoPlayerStatusListener videoPlayerStatusListener, com.mbridge.msdk.videocommon.download.a aVar, String str2) {
        try {
        } catch (Exception e4) {
            ad.b("MediaViewPlayerView", e4.getMessage());
            this.f16802a = false;
        }
        if (TextUtils.isEmpty(str) || campaignEx == null) {
            return false;
        }
        this.f16792B = str;
        this.b = z8;
        this.f16793C = campaignEx;
        this.f16796G = aVar;
        this.f16791A = str2;
        this.f16797H.initParameter(campaignEx.getVideoUrlEncode(), true, this.f16810j, this.f16817s, videoPlayerStatusListener);
        try {
            CampaignEx campaignEx2 = this.f16793C;
            if (campaignEx2 != null) {
                String imageUrl = campaignEx2.getImageUrl();
                if (!an.a(imageUrl) && getContext() != null) {
                    if (com.mbridge.msdk.foundation.same.c.b.a(getContext()).b(imageUrl)) {
                        Bitmap a6 = com.mbridge.msdk.foundation.same.c.b.a(c.m().c()).a(imageUrl);
                        MyImageView myImageView = this.f16817s;
                        if (myImageView != null && a6 != null) {
                            myImageView.setImageUrl(imageUrl);
                            this.f16817s.setImageBitmap(a6);
                            this.f16817s.setVisibility(0);
                        }
                    } else {
                        com.mbridge.msdk.foundation.same.c.b.a(getContext()).a(imageUrl, new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.nativex.view.MediaViewPlayerView.6
                            @Override // com.mbridge.msdk.foundation.same.c.c
                            public final void onFailedLoad(String str3, String str4) {
                            }

                            @Override // com.mbridge.msdk.foundation.same.c.c
                            public final void onSuccessLoad(Bitmap bitmap, String str3) {
                                if (MediaViewPlayerView.this.f16817s != null && bitmap != null) {
                                    MediaViewPlayerView.this.f16817s.setImageUrl(str3);
                                    MediaViewPlayerView.this.f16817s.setImageBitmap(bitmap);
                                }
                            }
                        });
                    }
                }
            }
        } catch (Throwable th) {
            ad.b("MediaViewPlayerView", th.getMessage());
        }
        this.f16802a = true;
        return true;
    }

    public boolean isComplete() {
        try {
            VideoNativePlayer videoNativePlayer = this.f16797H;
            if (videoNativePlayer != null) {
                return videoNativePlayer.isComplete();
            }
            return false;
        } catch (Throwable th) {
            ad.b("MediaViewPlayerView", th.getMessage());
            return false;
        }
    }

    public boolean isPlaying() {
        try {
            VideoNativePlayer videoNativePlayer = this.f16797H;
            if (videoNativePlayer != null) {
                return videoNativePlayer.isPlaying();
            }
            return false;
        } catch (Throwable th) {
            ad.b("MediaViewPlayerView", th.getMessage());
            return false;
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onBufferingEnd() {
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onBufferingStart(String str) {
    }

    public void onClickPlayButton() {
        com.mbridge.msdk.nativex.listener.a aVar;
        try {
            f();
            j();
            setIsComplete(false);
            if (this.f16806f) {
                this.f16797H.play();
            } else if (hasPrepare() && !this.f16803c) {
                ad.c("MediaViewPlayerView", "startOrPlayVideo() hasPrepare():" + hasPrepare() + " mIsNeedToRepeatPrepare:" + this.f16803c);
                startOrPlayVideo();
            } else {
                ad.c("MediaViewPlayerView", "点击播放 playVideo()");
                this.f16797H.replaySameSource(getContext(), this.f16792B, this.f16815q);
            }
            if (this.f16805e && (aVar = this.f16794D) != null) {
                aVar.d();
            }
            this.f16805e = false;
        } catch (Throwable th) {
            ad.b("MediaViewPlayerView", th.getMessage(), th);
        }
    }

    public void onClickPlayerView() {
        ImageView imageView;
        try {
            MyImageView myImageView = this.f16817s;
            if ((myImageView != null && myImageView.getVisibility() == 0) || !isPlaying() || (imageView = this.f16819u) == null) {
                return;
            }
            if (imageView.getVisibility() == 0) {
                gonePauseView();
                l();
                return;
            }
            AlphaAnimation alphaAnimation = this.f16824z;
            if (alphaAnimation != null) {
                alphaAnimation.cancel();
            }
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
            this.f16824z = alphaAnimation2;
            alphaAnimation2.setDuration(300L);
            this.f16824z.setInterpolator(new DecelerateInterpolator());
            this.f16824z.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.nativex.view.MediaViewPlayerView.4
                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation) {
                    MediaViewPlayerView.this.f16819u.setVisibility(0);
                    MediaViewPlayerView.g(MediaViewPlayerView.this);
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationStart(Animation animation) {
                }
            });
            i();
            this.f16822x.startAnimation(this.f16824z);
        } catch (Throwable th) {
            ad.b("MediaViewPlayerView", th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayCompleted() {
        if (this.f16794D != null && !TextUtils.isEmpty(this.f16792B)) {
            this.f16794D.b(this.f16792B);
        }
        a aVar = this.f16798I;
        if (aVar != null) {
            aVar.a();
            return;
        }
        try {
            if (!this.f16810j) {
                this.f16803c = true;
                e();
            }
        } catch (Exception e4) {
            ad.b("MediaViewPlayerView", e4.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayError(String str) {
        try {
            this.f16803c = true;
            e();
            if (!this.f16801L) {
                this.f16797H.play(getContext(), this.f16792B, this.f16815q);
                this.f16801L = true;
            }
        } catch (Exception e4) {
            ad.b("MediaViewPlayerView", e4.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayProgress(int i9, int i10) {
        try {
            f();
            g();
            this.f16805e = false;
            this.f16803c = false;
            this.l = i9;
        } catch (Throwable th) {
            ad.b("MediaViewPlayerView", th.getMessage(), th);
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayProgressMS(int i9, int i10) {
        try {
            ProgressBar progressBar = this.f16816r;
            if (progressBar != null && progressBar.getVisibility() == 0) {
                if (i10 > 0) {
                    this.f16816r.setMax(i10);
                }
                if (i9 >= 0) {
                    this.f16816r.setProgress(i9 + 1);
                }
            }
        } catch (Throwable th) {
            ad.b("MediaViewPlayerView", th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlaySetDataSourceError(String str) {
        try {
            this.f16803c = true;
            try {
                if (!URLUtil.isNetworkUrl(this.f16792B)) {
                    String videoUrlEncode = this.f16793C.getVideoUrlEncode();
                    if (an.b(videoUrlEncode)) {
                        this.f16792B = videoUrlEncode;
                    }
                }
            } catch (Throwable th) {
                ad.b("MediaViewPlayerView", th.getMessage());
            }
        } catch (Exception e4) {
            ad.b("MediaViewPlayerView", e4.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayStarted(int i9) {
        if (this.f16794D != null && !TextUtils.isEmpty(this.f16792B)) {
            this.f16794D.a(this.f16792B);
        }
    }

    public void openSound() {
        this.f16811k = true;
        try {
            if (this.f16797H != null) {
                this.f16820v.setImageResource(v.a(getContext(), "mbridge_nativex_sound_open", "drawable"));
                this.f16797H.openSound();
            }
            try {
                P5.b bVar = this.f16800K;
                if (bVar != null) {
                    bVar.e(1.0f);
                }
            } catch (IllegalArgumentException e4) {
                ad.a("OMSDK", e4.getMessage());
            }
        } catch (Throwable th) {
            ad.b("MediaViewPlayerView", th.getMessage());
        }
    }

    public void pause() {
        try {
            VideoNativePlayer videoNativePlayer = this.f16797H;
            if (videoNativePlayer != null) {
                videoNativePlayer.pause();
                this.f16806f = true;
            }
            if (this.f16800K != null) {
                ad.b("omsdk", "mediaviewplayerview pause");
                k kVar = this.f16800K.f2431a;
                R2.b.b(kVar);
                kVar.f2232e.c(CampaignEx.JSON_NATIVE_VIDEO_PAUSE, null);
            }
            h();
        } catch (Throwable th) {
            ad.b("MediaViewPlayerView", th.getMessage());
        }
    }

    public void playVideo() {
        P5.b bVar;
        try {
            if (!this.f16802a || this.f16797H == null) {
                return;
            }
            if (!this.f16807g) {
                e();
                return;
            }
            if ((!TextUtils.isEmpty(this.f16792B) && this.f16792B.startsWith("http")) || this.f16792B.startsWith(Constants.SCHEME)) {
                this.f16792B = m();
            }
            f();
            this.f16797H.play(getContext(), this.f16792B, this.f16815q);
            if ((this.f16806f || this.f16805e) && (bVar = this.f16800K) != null) {
                this.f16806f = false;
                bVar.c();
            }
            if (this.f16811k) {
                this.f16797H.openSound();
            } else {
                this.f16797H.closeSound();
            }
            this.f16803c = false;
        } catch (Throwable th) {
            ad.b("MediaViewPlayerView", th.getMessage());
        }
    }

    public void registerView(O5.b bVar) {
        this.f16799J = bVar;
        if (bVar != null) {
            bVar.d(this);
            LinearLayout linearLayout = this.f16814p;
            g gVar = g.f2220f;
            bVar.a(linearLayout, gVar);
            bVar.a(this.f16816r, gVar);
            MyImageView myImageView = this.f16817s;
            g gVar2 = g.b;
            bVar.a(myImageView, gVar2);
            bVar.a(this.f16818t, gVar2);
            bVar.a(this.f16819u, gVar2);
            bVar.a(this.f16820v, gVar);
        }
    }

    public void release() {
        try {
            VideoNativePlayer videoNativePlayer = this.f16797H;
            if (videoNativePlayer != null) {
                videoNativePlayer.releasePlayer();
                this.f16797H = null;
            }
        } catch (Throwable th) {
            ad.b("MediaViewPlayerView", th.getMessage());
        }
    }

    public void setAllowLoopPlay(boolean z8) {
        this.f16810j = z8;
    }

    public void setEnterFullScreen() {
        try {
            ad.c("MediaViewPlayerView", "setEnterFullScreen");
            this.f16804d = true;
            this.f16808h = true;
            this.f16820v.setVisibility(0);
            h();
        } catch (Throwable th) {
            ad.b("MediaViewPlayerView", th.getMessage(), th);
        }
    }

    public void setExitFullScreen() {
        try {
            this.f16804d = false;
            this.f16803c = false;
            this.f16820v.setVisibility(8);
            g();
            f();
        } catch (Throwable th) {
            ad.b("MediaViewPlayerView", th.getMessage(), th);
        }
    }

    public void setIsActivePause(boolean z8) {
        this.f16805e = z8;
    }

    public void setIsComplete(boolean z8) {
        try {
            VideoNativePlayer videoNativePlayer = this.f16797H;
            if (videoNativePlayer != null) {
                videoNativePlayer.setIsComplete(z8);
            }
        } catch (Throwable th) {
            ad.b("MediaViewPlayerView", th.getMessage());
        }
    }

    public void setIsFrontDesk(boolean z8) {
        try {
            VideoNativePlayer videoNativePlayer = this.f16797H;
            if (videoNativePlayer != null) {
                videoNativePlayer.setIsFrontDesk(z8);
            }
        } catch (Throwable th) {
            ad.b("MediaViewPlayerView", th.getMessage());
        }
    }

    public void setMediaViewPlayListener(a aVar) {
        this.f16798I = aVar;
    }

    public void setOnMediaViewPlayerViewListener(com.mbridge.msdk.nativex.listener.a aVar) {
        this.f16794D = aVar;
    }

    public void setVideoEvents(P5.b bVar) {
        this.f16800K = bVar;
    }

    public void showPlayView() {
        this.f16818t.setVisibility(0);
    }

    public void showProgressView(boolean z8) {
        int i9;
        this.f16812n = z8;
        ProgressBar progressBar = this.f16816r;
        if (progressBar != null) {
            if (z8) {
                i9 = 0;
            } else {
                i9 = 4;
            }
            progressBar.setVisibility(i9);
        }
    }

    public void showSoundIndicator(boolean z8) {
        this.m = z8;
        if (z8) {
            g();
        } else {
            h();
        }
    }

    public void startOrPlayVideo() {
        P5.b bVar;
        try {
            if (!this.f16807g) {
                e();
                return;
            }
            if (!hasPrepare()) {
                playVideo();
                return;
            }
            try {
                if (this.f16797H != null) {
                    f();
                    if (this.f16809i) {
                        this.f16797H.start(this.f16815q);
                        this.f16809i = false;
                    } else {
                        this.f16797H.start();
                    }
                    if ((this.f16806f || this.f16805e) && (bVar = this.f16800K) != null) {
                        this.f16806f = false;
                        bVar.c();
                    }
                }
            } catch (Throwable th) {
                ad.b("MediaViewPlayerView", th.getMessage(), th);
            }
        } catch (Exception e4) {
            ad.b("MediaViewPlayerView", e4.getMessage());
        }
    }

    public void stop() {
        try {
            VideoNativePlayer videoNativePlayer = this.f16797H;
            if (videoNativePlayer != null) {
                videoNativePlayer.stop();
            }
            h();
        } catch (Exception e4) {
            ad.b("MediaViewPlayerView", e4.getMessage());
        }
    }

    public void unregisterView() {
        O5.b bVar = this.f16799J;
        if (bVar != null) {
            bVar.e();
        }
    }

    private void f() {
        try {
            this.f16817s.setVisibility(8);
            this.f16818t.setVisibility(8);
            j();
            showProgressView(this.f16812n);
        } catch (Throwable th) {
            ad.b("MediaViewPlayerView", th.getMessage());
        }
    }

    private void h() {
        if (this.f16821w.getVisibility() == 0) {
            this.f16821w.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.f16822x.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (this.f16818t.getVisibility() != 0) {
            this.f16822x.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        this.f16819u.setVisibility(8);
    }

    private void l() {
        try {
            Handler handler = f16790F;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            Timer timer = this.f16795E;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e4) {
            ad.b("MediaViewPlayerView", e4.getMessage());
        }
    }

    private String m() {
        CampaignEx campaignEx;
        String str;
        try {
            campaignEx = this.f16793C;
        } catch (Exception e4) {
            ad.b("MediaViewPlayerView", e4.getMessage());
        }
        if (campaignEx == null) {
            return null;
        }
        try {
            if (this.f16796G == null) {
                if (campaignEx.getAdType() != 287 && this.f16793C.getAdType() != 94) {
                    str = this.f16793C.getId() + this.f16793C.getVideoUrlEncode() + this.f16793C.getBidToken();
                    this.f16796G = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f16791A, str);
                }
                str = this.f16793C.getRequestId() + this.f16793C.getId() + this.f16793C.getVideoUrlEncode();
                this.f16796G = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f16791A, str);
            }
        } catch (Exception e9) {
            ad.b("MediaViewPlayerView", e9.getMessage());
        }
        com.mbridge.msdk.videocommon.download.a aVar = this.f16796G;
        if (aVar != null && aVar.k() == 5) {
            String h6 = this.f16796G.h();
            if (new File(h6).exists()) {
                return h6;
            }
        }
        String videoUrlEncode = this.f16793C.getVideoUrlEncode();
        if (an.b(videoUrlEncode)) {
            return videoUrlEncode;
        }
        return null;
    }

    private void b() {
        VideoNativePlayer videoNativePlayer = new VideoNativePlayer();
        this.f16797H = videoNativePlayer;
        videoNativePlayer.setSelfVideoFeedsPlayerListener(this);
    }

    private void c() {
        try {
            View inflate = LayoutInflater.from(getContext()).inflate(v.a(getContext(), "mbridge_nativex_playerview", TtmlNode.TAG_LAYOUT), (ViewGroup) null);
            if (inflate != null) {
                this.f16814p = (LinearLayout) inflate.findViewById(v.a(getContext(), "mbridge_ll_loading", "id"));
                TextureView textureView = (TextureView) inflate.findViewById(v.a(getContext(), "mbridge_textureview", "id"));
                this.f16813o = textureView;
                textureView.setKeepScreenOn(true);
                this.f16813o.setSurfaceTextureListener(new b());
                this.f16816r = (ProgressBar) inflate.findViewById(v.a(getContext(), "mbridge_progress", "id"));
                this.f16817s = (MyImageView) inflate.findViewById(v.a(getContext(), "mbridge_iv_playend_pic", "id"));
                this.f16818t = (ImageView) inflate.findViewById(v.a(getContext(), "mbridge_iv_play", "id"));
                this.f16819u = (ImageView) inflate.findViewById(v.a(getContext(), "mbridge_iv_pause", "id"));
                this.f16820v = (ImageView) inflate.findViewById(v.a(getContext(), "mbridge_iv_sound", "id"));
                this.f16822x = inflate.findViewById(v.a(getContext(), "mbridge_view_cover", "id"));
                ImageView imageView = (ImageView) inflate.findViewById(v.a(getContext(), "mbridge_iv_sound_animation", "id"));
                this.f16821w = imageView;
                AnimationDrawable animationDrawable = (AnimationDrawable) imageView.getDrawable();
                this.f16823y = animationDrawable;
                animationDrawable.start();
                d();
                addView(inflate, -1, -1);
            }
        } catch (Throwable th) {
            ad.b("MediaViewPlayerView", th.getMessage());
        }
    }

    private void d() {
        this.f16820v.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.nativex.view.MediaViewPlayerView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                try {
                    if (MediaViewPlayerView.this.f16811k) {
                        MediaViewPlayerView.this.closeSound();
                        if (MediaViewPlayerView.this.f16794D != null) {
                            MediaViewPlayerView.this.f16794D.a();
                        }
                    } else {
                        MediaViewPlayerView.this.openSound();
                        if (MediaViewPlayerView.this.f16794D != null) {
                            MediaViewPlayerView.this.f16794D.b();
                        }
                    }
                } catch (Throwable th) {
                    ad.b("MediaViewPlayerView", th.getMessage());
                }
            }
        });
        this.f16819u.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.nativex.view.MediaViewPlayerView.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                try {
                    MediaViewPlayerView.this.pause();
                    MediaViewPlayerView.this.f16818t.setVisibility(0);
                    MediaViewPlayerView.this.i();
                    MediaViewPlayerView.this.k();
                    if (MediaViewPlayerView.this.f16794D != null) {
                        MediaViewPlayerView.this.f16794D.c();
                    }
                    MediaViewPlayerView.this.f16805e = true;
                } catch (Throwable th) {
                    ad.b("MediaViewPlayerView", th.getMessage(), th);
                }
            }
        });
        this.f16818t.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.nativex.view.MediaViewPlayerView.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MediaViewPlayerView.this.onClickPlayButton();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        try {
            this.f16817s.setVisibility(0);
            this.f16818t.setVisibility(0);
            i();
            k();
            this.f16816r.setVisibility(8);
        } catch (Throwable th) {
            ad.b("MediaViewPlayerView", th.getMessage());
        }
    }

    private void a() {
        try {
            c();
            b();
        } catch (Exception e4) {
            ad.b("MediaViewPlayerView", e4.getMessage());
        }
    }

    public static /* synthetic */ void g(MediaViewPlayerView mediaViewPlayerView) {
        mediaViewPlayerView.l();
        mediaViewPlayerView.f16795E = new Timer();
        mediaViewPlayerView.f16795E.schedule(new TimerTask() { // from class: com.mbridge.msdk.nativex.view.MediaViewPlayerView.7
            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() {
                try {
                    MediaViewPlayerView.this.gonePauseView();
                } catch (Throwable th) {
                    ad.b("MediaViewPlayerView", th.getMessage(), th);
                }
            }
        }, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
    }

    public MediaViewPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16802a = false;
        this.b = false;
        this.f16803c = false;
        this.f16804d = false;
        this.f16805e = false;
        this.f16806f = false;
        this.f16807g = false;
        this.f16808h = true;
        this.f16809i = false;
        this.f16810j = true;
        this.f16811k = false;
        this.l = -1;
        this.m = true;
        this.f16812n = true;
        this.f16799J = null;
        this.f16800K = null;
        this.f16801L = false;
        a();
    }
}

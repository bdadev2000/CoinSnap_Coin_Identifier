package com.mbridge.msdk.nativex.view;

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
import kd.e;
import kd.i;

/* loaded from: classes4.dex */
public class MediaViewPlayerView extends LinearLayout implements VideoPlayerStatusListener {
    private static Handler F = new Handler();
    private String A;
    private String B;
    private CampaignEx C;
    private com.mbridge.msdk.nativex.listener.a D;
    private Timer E;
    private com.mbridge.msdk.videocommon.download.a G;
    private VideoNativePlayer H;
    private a I;
    private kd.b J;
    private ld.b K;
    private boolean L;
    private boolean a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f14223b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f14224c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f14225d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f14226e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f14227f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f14228g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f14229h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f14230i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f14231j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f14232k;

    /* renamed from: l, reason: collision with root package name */
    private volatile int f14233l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f14234m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f14235n;

    /* renamed from: o, reason: collision with root package name */
    private TextureView f14236o;

    /* renamed from: p, reason: collision with root package name */
    private LinearLayout f14237p;

    /* renamed from: q, reason: collision with root package name */
    private Surface f14238q;

    /* renamed from: r, reason: collision with root package name */
    private ProgressBar f14239r;

    /* renamed from: s, reason: collision with root package name */
    private MyImageView f14240s;

    /* renamed from: t, reason: collision with root package name */
    private ImageView f14241t;
    private ImageView u;

    /* renamed from: v, reason: collision with root package name */
    private ImageView f14242v;

    /* renamed from: w, reason: collision with root package name */
    private ImageView f14243w;

    /* renamed from: x, reason: collision with root package name */
    private View f14244x;

    /* renamed from: y, reason: collision with root package name */
    private AnimationDrawable f14245y;

    /* renamed from: z, reason: collision with root package name */
    private AlphaAnimation f14246z;

    /* loaded from: classes4.dex */
    public static class a {
        private MediaViewPlayerView a;

        public a(MediaViewPlayerView mediaViewPlayerView) {
            this.a = mediaViewPlayerView;
        }

        public void a() {
            try {
                MediaViewPlayerView mediaViewPlayerView = this.a;
                if (mediaViewPlayerView != null && !mediaViewPlayerView.f14231j) {
                    ad.c("MediaViewPlayerView", "play end and display endcardView");
                    this.a.e();
                }
            } catch (Exception e2) {
                ad.b("MediaViewPlayerView", e2.getMessage());
            }
        }
    }

    /* loaded from: classes4.dex */
    public class b implements TextureView.SurfaceTextureListener {
        private b() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            try {
                MediaViewPlayerView.this.f14238q = new Surface(surfaceTexture);
                MediaViewPlayerView.this.f14228g = true;
                MediaViewPlayerView.this.f14230i = true;
                if (MediaViewPlayerView.this.f14225d) {
                    if (MediaViewPlayerView.this.f14229h) {
                        MediaViewPlayerView.this.f14224c = false;
                        MediaViewPlayerView.this.f14229h = false;
                    }
                    if (!MediaViewPlayerView.this.isComplete() && !MediaViewPlayerView.this.f14226e) {
                        MediaViewPlayerView.this.startOrPlayVideo();
                        return;
                    }
                    MediaViewPlayerView.this.e();
                    return;
                }
                if (MediaViewPlayerView.this.f14223b) {
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
            } catch (Exception e2) {
                ad.b("MediaViewPlayerView", e2.getMessage());
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            try {
                if (MediaViewPlayerView.this.H != null && MediaViewPlayerView.this.H.isPlayIng()) {
                    MediaViewPlayerView.this.pause();
                }
                MediaViewPlayerView.this.f14224c = true;
                MediaViewPlayerView.this.f14228g = false;
            } catch (Throwable th2) {
                ad.b("MediaViewPlayerView", th2.getMessage());
            }
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            ad.c("MediaViewPlayerView", "onSurfaceTextureSizeChanged ");
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public MediaViewPlayerView(Context context) {
        super(context);
        this.a = false;
        this.f14223b = false;
        this.f14224c = false;
        this.f14225d = false;
        this.f14226e = false;
        this.f14227f = false;
        this.f14228g = false;
        this.f14229h = true;
        this.f14230i = false;
        this.f14231j = true;
        this.f14232k = false;
        this.f14233l = -1;
        this.f14234m = true;
        this.f14235n = true;
        this.J = null;
        this.K = null;
        this.L = false;
        a();
    }

    private void g() {
        ImageView imageView;
        if (this.f14225d || (imageView = this.f14243w) == null || imageView.getVisibility() == 0 || !this.f14234m) {
            return;
        }
        this.f14243w.setVisibility(0);
    }

    public void closeSound() {
        this.f14232k = false;
        try {
            if (this.H != null) {
                this.f14242v.setImageResource(v.a(getContext(), "mbridge_nativex_sound_close", "drawable"));
                this.H.closeSound();
            }
            try {
                ld.b bVar = this.K;
                if (bVar != null) {
                    bVar.e(0.0f);
                }
            } catch (IllegalArgumentException e2) {
                ad.a("OMSDK", e2.getMessage());
            }
        } catch (Throwable th2) {
            ad.b("MediaViewPlayerView", th2.getMessage());
        }
    }

    public boolean curIsFullScreen() {
        return this.f14225d;
    }

    public Campaign getCampaign() {
        return this.C;
    }

    public boolean getIsActiviePause() {
        return this.f14226e;
    }

    public void gonePauseView() {
        Handler handler = F;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.mbridge.msdk.nativex.view.MediaViewPlayerView.5
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        MediaViewPlayerView.this.k();
                        MediaViewPlayerView.this.j();
                    } catch (Exception e2) {
                        ad.b("MediaViewPlayerView", e2.getMessage());
                    }
                }
            });
        }
    }

    public boolean halfLoadingViewisVisible() {
        try {
            VideoNativePlayer videoNativePlayer = this.H;
            if (videoNativePlayer != null) {
                if (videoNativePlayer.loadingViewIsVisible()) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (Throwable th2) {
            ad.b("MediaViewPlayerView", th2.getMessage());
            return false;
        }
    }

    public boolean hasPrepare() {
        try {
            VideoNativePlayer videoNativePlayer = this.H;
            if (videoNativePlayer != null) {
                return videoNativePlayer.hasPrepare();
            }
            return false;
        } catch (Throwable th2) {
            ad.b("MediaViewPlayerView", th2.getMessage());
            return false;
        }
    }

    public boolean initPlayerViewData(String str, CampaignEx campaignEx, boolean z10, VideoPlayerStatusListener videoPlayerStatusListener, com.mbridge.msdk.videocommon.download.a aVar, String str2) {
        try {
        } catch (Exception e2) {
            ad.b("MediaViewPlayerView", e2.getMessage());
            this.a = false;
        }
        if (TextUtils.isEmpty(str) || campaignEx == null) {
            return false;
        }
        this.B = str;
        this.f14223b = z10;
        this.C = campaignEx;
        this.G = aVar;
        this.A = str2;
        this.H.initParameter(campaignEx.getVideoUrlEncode(), true, this.f14231j, this.f14240s, videoPlayerStatusListener);
        try {
            CampaignEx campaignEx2 = this.C;
            if (campaignEx2 != null) {
                String imageUrl = campaignEx2.getImageUrl();
                if (!an.a(imageUrl) && getContext() != null) {
                    if (com.mbridge.msdk.foundation.same.c.b.a(getContext()).b(imageUrl)) {
                        Bitmap a10 = com.mbridge.msdk.foundation.same.c.b.a(c.m().c()).a(imageUrl);
                        MyImageView myImageView = this.f14240s;
                        if (myImageView != null && a10 != null) {
                            myImageView.setImageUrl(imageUrl);
                            this.f14240s.setImageBitmap(a10);
                            this.f14240s.setVisibility(0);
                        }
                    } else {
                        com.mbridge.msdk.foundation.same.c.b.a(getContext()).a(imageUrl, new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.nativex.view.MediaViewPlayerView.6
                            @Override // com.mbridge.msdk.foundation.same.c.c
                            public final void onFailedLoad(String str3, String str4) {
                            }

                            @Override // com.mbridge.msdk.foundation.same.c.c
                            public final void onSuccessLoad(Bitmap bitmap, String str3) {
                                if (MediaViewPlayerView.this.f14240s != null && bitmap != null) {
                                    MediaViewPlayerView.this.f14240s.setImageUrl(str3);
                                    MediaViewPlayerView.this.f14240s.setImageBitmap(bitmap);
                                }
                            }
                        });
                    }
                }
            }
        } catch (Throwable th2) {
            ad.b("MediaViewPlayerView", th2.getMessage());
        }
        this.a = true;
        return true;
    }

    public boolean isComplete() {
        try {
            VideoNativePlayer videoNativePlayer = this.H;
            if (videoNativePlayer != null) {
                return videoNativePlayer.isComplete();
            }
            return false;
        } catch (Throwable th2) {
            ad.b("MediaViewPlayerView", th2.getMessage());
            return false;
        }
    }

    public boolean isPlaying() {
        try {
            VideoNativePlayer videoNativePlayer = this.H;
            if (videoNativePlayer != null) {
                return videoNativePlayer.isPlaying();
            }
            return false;
        } catch (Throwable th2) {
            ad.b("MediaViewPlayerView", th2.getMessage());
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
            if (this.f14227f) {
                this.H.play();
            } else if (hasPrepare() && !this.f14224c) {
                ad.c("MediaViewPlayerView", "startOrPlayVideo() hasPrepare():" + hasPrepare() + " mIsNeedToRepeatPrepare:" + this.f14224c);
                startOrPlayVideo();
            } else {
                ad.c("MediaViewPlayerView", "点击播放 playVideo()");
                this.H.replaySameSource(getContext(), this.B, this.f14238q);
            }
            if (this.f14226e && (aVar = this.D) != null) {
                aVar.d();
            }
            this.f14226e = false;
        } catch (Throwable th2) {
            ad.b("MediaViewPlayerView", th2.getMessage(), th2);
        }
    }

    public void onClickPlayerView() {
        ImageView imageView;
        try {
            MyImageView myImageView = this.f14240s;
            if ((myImageView != null && myImageView.getVisibility() == 0) || !isPlaying() || (imageView = this.u) == null) {
                return;
            }
            if (imageView.getVisibility() == 0) {
                gonePauseView();
                l();
                return;
            }
            AlphaAnimation alphaAnimation = this.f14246z;
            if (alphaAnimation != null) {
                alphaAnimation.cancel();
            }
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
            this.f14246z = alphaAnimation2;
            alphaAnimation2.setDuration(300L);
            this.f14246z.setInterpolator(new DecelerateInterpolator());
            this.f14246z.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.nativex.view.MediaViewPlayerView.4
                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation) {
                    MediaViewPlayerView.this.u.setVisibility(0);
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
            this.f14244x.startAnimation(this.f14246z);
        } catch (Throwable th2) {
            ad.b("MediaViewPlayerView", th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayCompleted() {
        if (this.D != null && !TextUtils.isEmpty(this.B)) {
            this.D.b(this.B);
        }
        a aVar = this.I;
        if (aVar != null) {
            aVar.a();
            return;
        }
        try {
            if (!this.f14231j) {
                this.f14224c = true;
                e();
            }
        } catch (Exception e2) {
            ad.b("MediaViewPlayerView", e2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayError(String str) {
        try {
            this.f14224c = true;
            e();
            if (!this.L) {
                this.H.play(getContext(), this.B, this.f14238q);
                this.L = true;
            }
        } catch (Exception e2) {
            ad.b("MediaViewPlayerView", e2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayProgress(int i10, int i11) {
        try {
            f();
            g();
            this.f14226e = false;
            this.f14224c = false;
            this.f14233l = i10;
        } catch (Throwable th2) {
            ad.b("MediaViewPlayerView", th2.getMessage(), th2);
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayProgressMS(int i10, int i11) {
        try {
            ProgressBar progressBar = this.f14239r;
            if (progressBar != null && progressBar.getVisibility() == 0) {
                if (i11 > 0) {
                    this.f14239r.setMax(i11);
                }
                if (i10 >= 0) {
                    this.f14239r.setProgress(i10 + 1);
                }
            }
        } catch (Throwable th2) {
            ad.b("MediaViewPlayerView", th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlaySetDataSourceError(String str) {
        try {
            this.f14224c = true;
            try {
                if (!URLUtil.isNetworkUrl(this.B)) {
                    String videoUrlEncode = this.C.getVideoUrlEncode();
                    if (an.b(videoUrlEncode)) {
                        this.B = videoUrlEncode;
                    }
                }
            } catch (Throwable th2) {
                ad.b("MediaViewPlayerView", th2.getMessage());
            }
        } catch (Exception e2) {
            ad.b("MediaViewPlayerView", e2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayStarted(int i10) {
        if (this.D != null && !TextUtils.isEmpty(this.B)) {
            this.D.a(this.B);
        }
    }

    public void openSound() {
        this.f14232k = true;
        try {
            if (this.H != null) {
                this.f14242v.setImageResource(v.a(getContext(), "mbridge_nativex_sound_open", "drawable"));
                this.H.openSound();
            }
            try {
                ld.b bVar = this.K;
                if (bVar != null) {
                    bVar.e(1.0f);
                }
            } catch (IllegalArgumentException e2) {
                ad.a("OMSDK", e2.getMessage());
            }
        } catch (Throwable th2) {
            ad.b("MediaViewPlayerView", th2.getMessage());
        }
    }

    public void pause() {
        try {
            VideoNativePlayer videoNativePlayer = this.H;
            if (videoNativePlayer != null) {
                videoNativePlayer.pause();
                this.f14227f = true;
            }
            if (this.K != null) {
                ad.b("omsdk", "mediaviewplayerview pause");
                i iVar = this.K.a;
                com.facebook.internal.i.d(iVar);
                iVar.f20672e.a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE, null);
            }
            h();
        } catch (Throwable th2) {
            ad.b("MediaViewPlayerView", th2.getMessage());
        }
    }

    public void playVideo() {
        ld.b bVar;
        try {
            if (!this.a || this.H == null) {
                return;
            }
            if (!this.f14228g) {
                e();
                return;
            }
            if ((!TextUtils.isEmpty(this.B) && this.B.startsWith("http")) || this.B.startsWith(Constants.SCHEME)) {
                this.B = m();
            }
            f();
            this.H.play(getContext(), this.B, this.f14238q);
            if ((this.f14227f || this.f14226e) && (bVar = this.K) != null) {
                this.f14227f = false;
                bVar.c();
            }
            if (this.f14232k) {
                this.H.openSound();
            } else {
                this.H.closeSound();
            }
            this.f14224c = false;
        } catch (Throwable th2) {
            ad.b("MediaViewPlayerView", th2.getMessage());
        }
    }

    public void registerView(kd.b bVar) {
        this.J = bVar;
        if (bVar != null) {
            bVar.d(this);
            LinearLayout linearLayout = this.f14237p;
            e eVar = e.OTHER;
            bVar.a(linearLayout, eVar);
            bVar.a(this.f14239r, eVar);
            MyImageView myImageView = this.f14240s;
            e eVar2 = e.VIDEO_CONTROLS;
            bVar.a(myImageView, eVar2);
            bVar.a(this.f14241t, eVar2);
            bVar.a(this.u, eVar2);
            bVar.a(this.f14242v, eVar);
        }
    }

    public void release() {
        try {
            VideoNativePlayer videoNativePlayer = this.H;
            if (videoNativePlayer != null) {
                videoNativePlayer.releasePlayer();
                this.H = null;
            }
        } catch (Throwable th2) {
            ad.b("MediaViewPlayerView", th2.getMessage());
        }
    }

    public void setAllowLoopPlay(boolean z10) {
        this.f14231j = z10;
    }

    public void setEnterFullScreen() {
        try {
            ad.c("MediaViewPlayerView", "setEnterFullScreen");
            this.f14225d = true;
            this.f14229h = true;
            this.f14242v.setVisibility(0);
            h();
        } catch (Throwable th2) {
            ad.b("MediaViewPlayerView", th2.getMessage(), th2);
        }
    }

    public void setExitFullScreen() {
        try {
            this.f14225d = false;
            this.f14224c = false;
            this.f14242v.setVisibility(8);
            g();
            f();
        } catch (Throwable th2) {
            ad.b("MediaViewPlayerView", th2.getMessage(), th2);
        }
    }

    public void setIsActivePause(boolean z10) {
        this.f14226e = z10;
    }

    public void setIsComplete(boolean z10) {
        try {
            VideoNativePlayer videoNativePlayer = this.H;
            if (videoNativePlayer != null) {
                videoNativePlayer.setIsComplete(z10);
            }
        } catch (Throwable th2) {
            ad.b("MediaViewPlayerView", th2.getMessage());
        }
    }

    public void setIsFrontDesk(boolean z10) {
        try {
            VideoNativePlayer videoNativePlayer = this.H;
            if (videoNativePlayer != null) {
                videoNativePlayer.setIsFrontDesk(z10);
            }
        } catch (Throwable th2) {
            ad.b("MediaViewPlayerView", th2.getMessage());
        }
    }

    public void setMediaViewPlayListener(a aVar) {
        this.I = aVar;
    }

    public void setOnMediaViewPlayerViewListener(com.mbridge.msdk.nativex.listener.a aVar) {
        this.D = aVar;
    }

    public void setVideoEvents(ld.b bVar) {
        this.K = bVar;
    }

    public void showPlayView() {
        this.f14241t.setVisibility(0);
    }

    public void showProgressView(boolean z10) {
        int i10;
        this.f14235n = z10;
        ProgressBar progressBar = this.f14239r;
        if (progressBar != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            progressBar.setVisibility(i10);
        }
    }

    public void showSoundIndicator(boolean z10) {
        this.f14234m = z10;
        if (z10) {
            g();
        } else {
            h();
        }
    }

    public void startOrPlayVideo() {
        ld.b bVar;
        try {
            if (!this.f14228g) {
                e();
                return;
            }
            if (!hasPrepare()) {
                playVideo();
                return;
            }
            try {
                if (this.H != null) {
                    f();
                    if (this.f14230i) {
                        this.H.start(this.f14238q);
                        this.f14230i = false;
                    } else {
                        this.H.start();
                    }
                    if ((this.f14227f || this.f14226e) && (bVar = this.K) != null) {
                        this.f14227f = false;
                        bVar.c();
                    }
                }
            } catch (Throwable th2) {
                ad.b("MediaViewPlayerView", th2.getMessage(), th2);
            }
        } catch (Exception e2) {
            ad.b("MediaViewPlayerView", e2.getMessage());
        }
    }

    public void stop() {
        try {
            VideoNativePlayer videoNativePlayer = this.H;
            if (videoNativePlayer != null) {
                videoNativePlayer.stop();
            }
            h();
        } catch (Exception e2) {
            ad.b("MediaViewPlayerView", e2.getMessage());
        }
    }

    public void unregisterView() {
        kd.b bVar = this.J;
        if (bVar != null) {
            bVar.e();
        }
    }

    private void f() {
        try {
            this.f14240s.setVisibility(8);
            this.f14241t.setVisibility(8);
            j();
            showProgressView(this.f14235n);
        } catch (Throwable th2) {
            ad.b("MediaViewPlayerView", th2.getMessage());
        }
    }

    private void h() {
        if (this.f14243w.getVisibility() == 0) {
            this.f14243w.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.f14244x.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (this.f14241t.getVisibility() != 0) {
            this.f14244x.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        this.u.setVisibility(8);
    }

    private void l() {
        try {
            Handler handler = F;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            Timer timer = this.E;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e2) {
            ad.b("MediaViewPlayerView", e2.getMessage());
        }
    }

    private String m() {
        CampaignEx campaignEx;
        String str;
        try {
            campaignEx = this.C;
        } catch (Exception e2) {
            ad.b("MediaViewPlayerView", e2.getMessage());
        }
        if (campaignEx == null) {
            return null;
        }
        try {
            if (this.G == null) {
                if (campaignEx.getAdType() != 287 && this.C.getAdType() != 94) {
                    str = this.C.getId() + this.C.getVideoUrlEncode() + this.C.getBidToken();
                    this.G = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.A, str);
                }
                str = this.C.getRequestId() + this.C.getId() + this.C.getVideoUrlEncode();
                this.G = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.A, str);
            }
        } catch (Exception e10) {
            ad.b("MediaViewPlayerView", e10.getMessage());
        }
        com.mbridge.msdk.videocommon.download.a aVar = this.G;
        if (aVar != null && aVar.k() == 5) {
            String h10 = this.G.h();
            if (new File(h10).exists()) {
                return h10;
            }
        }
        String videoUrlEncode = this.C.getVideoUrlEncode();
        if (an.b(videoUrlEncode)) {
            return videoUrlEncode;
        }
        return null;
    }

    private void b() {
        VideoNativePlayer videoNativePlayer = new VideoNativePlayer();
        this.H = videoNativePlayer;
        videoNativePlayer.setSelfVideoFeedsPlayerListener(this);
    }

    private void c() {
        try {
            View inflate = LayoutInflater.from(getContext()).inflate(v.a(getContext(), "mbridge_nativex_playerview", TtmlNode.TAG_LAYOUT), (ViewGroup) null);
            if (inflate != null) {
                this.f14237p = (LinearLayout) inflate.findViewById(v.a(getContext(), "mbridge_ll_loading", "id"));
                TextureView textureView = (TextureView) inflate.findViewById(v.a(getContext(), "mbridge_textureview", "id"));
                this.f14236o = textureView;
                textureView.setKeepScreenOn(true);
                this.f14236o.setSurfaceTextureListener(new b());
                this.f14239r = (ProgressBar) inflate.findViewById(v.a(getContext(), "mbridge_progress", "id"));
                this.f14240s = (MyImageView) inflate.findViewById(v.a(getContext(), "mbridge_iv_playend_pic", "id"));
                this.f14241t = (ImageView) inflate.findViewById(v.a(getContext(), "mbridge_iv_play", "id"));
                this.u = (ImageView) inflate.findViewById(v.a(getContext(), "mbridge_iv_pause", "id"));
                this.f14242v = (ImageView) inflate.findViewById(v.a(getContext(), "mbridge_iv_sound", "id"));
                this.f14244x = inflate.findViewById(v.a(getContext(), "mbridge_view_cover", "id"));
                ImageView imageView = (ImageView) inflate.findViewById(v.a(getContext(), "mbridge_iv_sound_animation", "id"));
                this.f14243w = imageView;
                AnimationDrawable animationDrawable = (AnimationDrawable) imageView.getDrawable();
                this.f14245y = animationDrawable;
                animationDrawable.start();
                d();
                addView(inflate, -1, -1);
            }
        } catch (Throwable th2) {
            ad.b("MediaViewPlayerView", th2.getMessage());
        }
    }

    private void d() {
        this.f14242v.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.nativex.view.MediaViewPlayerView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                try {
                    if (MediaViewPlayerView.this.f14232k) {
                        MediaViewPlayerView.this.closeSound();
                        if (MediaViewPlayerView.this.D != null) {
                            MediaViewPlayerView.this.D.a();
                        }
                    } else {
                        MediaViewPlayerView.this.openSound();
                        if (MediaViewPlayerView.this.D != null) {
                            MediaViewPlayerView.this.D.b();
                        }
                    }
                } catch (Throwable th2) {
                    ad.b("MediaViewPlayerView", th2.getMessage());
                }
            }
        });
        this.u.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.nativex.view.MediaViewPlayerView.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                try {
                    MediaViewPlayerView.this.pause();
                    MediaViewPlayerView.this.f14241t.setVisibility(0);
                    MediaViewPlayerView.this.i();
                    MediaViewPlayerView.this.k();
                    if (MediaViewPlayerView.this.D != null) {
                        MediaViewPlayerView.this.D.c();
                    }
                    MediaViewPlayerView.this.f14226e = true;
                } catch (Throwable th2) {
                    ad.b("MediaViewPlayerView", th2.getMessage(), th2);
                }
            }
        });
        this.f14241t.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.nativex.view.MediaViewPlayerView.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MediaViewPlayerView.this.onClickPlayButton();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        try {
            this.f14240s.setVisibility(0);
            this.f14241t.setVisibility(0);
            i();
            k();
            this.f14239r.setVisibility(8);
        } catch (Throwable th2) {
            ad.b("MediaViewPlayerView", th2.getMessage());
        }
    }

    private void a() {
        try {
            c();
            b();
        } catch (Exception e2) {
            ad.b("MediaViewPlayerView", e2.getMessage());
        }
    }

    public static /* synthetic */ void g(MediaViewPlayerView mediaViewPlayerView) {
        mediaViewPlayerView.l();
        mediaViewPlayerView.E = new Timer();
        mediaViewPlayerView.E.schedule(new TimerTask() { // from class: com.mbridge.msdk.nativex.view.MediaViewPlayerView.7
            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() {
                try {
                    MediaViewPlayerView.this.gonePauseView();
                } catch (Throwable th2) {
                    ad.b("MediaViewPlayerView", th2.getMessage(), th2);
                }
            }
        }, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
    }

    public MediaViewPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = false;
        this.f14223b = false;
        this.f14224c = false;
        this.f14225d = false;
        this.f14226e = false;
        this.f14227f = false;
        this.f14228g = false;
        this.f14229h = true;
        this.f14230i = false;
        this.f14231j = true;
        this.f14232k = false;
        this.f14233l = -1;
        this.f14234m = true;
        this.f14235n = true;
        this.J = null;
        this.K = null;
        this.L = false;
        a();
    }
}

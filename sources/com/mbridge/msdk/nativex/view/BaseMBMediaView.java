package com.mbridge.msdk.nativex.view;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.webkit.URLUtil;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.r3;
import androidx.core.view.ViewCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.k;
import com.mbridge.msdk.foundation.db.o;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ah;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.an;
import com.mbridge.msdk.foundation.tools.aq;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.mbnative.controller.NativeController;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.nativex.view.MediaViewPlayerView;
import com.mbridge.msdk.nativex.view.mbfullview.BaseView;
import com.mbridge.msdk.nativex.view.mbfullview.MBridgeTopFullView;
import com.mbridge.msdk.out.BaseTrackingListener;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.out.OnMBMediaViewListener;
import com.mbridge.msdk.out.OnMBMediaViewListenerPlus;
import com.mbridge.msdk.playercommon.VideoPlayerStatusListener;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.video.signal.communication.IRewardCommunication;
import com.mbridge.msdk.videocommon.download.j;
import com.mbridge.msdk.videocommon.view.MyImageView;
import com.mbridge.msdk.widget.MBAdChoice;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kd.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class BaseMBMediaView extends LinearLayout implements VideoPlayerStatusListener, IRewardCommunication {
    public static final int OPEN_FULLSCREEN_ON_VIDEO_TYPE_1_LANDING_PAGE = 1;
    public static final int OPEN_FULLSCREEN_ON_VIDEO_TYPE_2_NORMAL_FULLSCREEN = 2;
    public static final int OPEN_FULLSCREEN_ON_VIDEO_TYPE_3_NORMAL_FULLSCREEN_ENDCARD = 3;
    public static final int OPEN_FULLSCREEN_ON_VIDEO_TYPE_4_NORMAL_FULLSCREEN_LP = 4;
    public static final int OPEN_FULLSCREEN_ON_VIDEO_TYPE_6_SMALLVIDEO = 6;
    public static final String TAG = "BaseMBMediaView";
    public static final int WHAT_VIEW_FULL_SCREEN = 2;
    public static final int WHAT_VIEW_SMALL_SCREEN = 1;

    /* renamed from: p, reason: collision with root package name */
    private static int f14183p = 2;

    /* renamed from: q, reason: collision with root package name */
    private static int f14184q = 1;
    private RelativeLayout A;
    private WindVaneWebViewForNV B;
    private WindVaneWebViewForNV C;
    private MyImageView D;
    private ProgressBar E;
    private View F;
    private BaseView G;
    private RelativeLayout H;
    private RelativeLayout I;
    private TextView J;
    private ProgressBar K;
    private RelativeLayout L;
    private int M;
    private Handler N;
    private CampaignEx O;
    private int P;
    private int Q;
    private double R;
    private double S;
    private int T;
    private int U;
    private e V;
    private SensorManager W;
    protected boolean a;

    /* renamed from: aa, reason: collision with root package name */
    private Sensor f14185aa;

    /* renamed from: ab, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.download.a f14186ab;

    /* renamed from: ac, reason: collision with root package name */
    private a f14187ac;

    /* renamed from: ad, reason: collision with root package name */
    private OnMBMediaViewListener f14188ad;

    /* renamed from: ae, reason: collision with root package name */
    private OnMBMediaViewListenerPlus f14189ae;

    /* renamed from: af, reason: collision with root package name */
    private int f14190af;

    /* renamed from: ag, reason: collision with root package name */
    private boolean f14191ag;

    /* renamed from: ah, reason: collision with root package name */
    private boolean f14192ah;

    /* renamed from: ai, reason: collision with root package name */
    private RelativeLayout f14193ai;
    private ImageView aj;
    private int ak;
    private boolean al;
    private Context am;
    private boolean an;
    private Runnable ao;

    /* renamed from: b, reason: collision with root package name */
    private boolean f14194b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f14195c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f14196d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f14197e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f14198f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f14199g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f14200h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f14201i;

    /* renamed from: j, reason: collision with root package name */
    private volatile boolean f14202j;

    /* renamed from: k, reason: collision with root package name */
    private volatile boolean f14203k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f14204l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f14205m;

    /* renamed from: n, reason: collision with root package name */
    private ArrayList<String> f14206n;

    /* renamed from: o, reason: collision with root package name */
    private ArrayList<String> f14207o;

    /* renamed from: r, reason: collision with root package name */
    private boolean f14208r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f14209s;

    /* renamed from: t, reason: collision with root package name */
    private kd.b f14210t;
    private kd.a u;

    /* renamed from: v, reason: collision with root package name */
    private ld.b f14211v;

    /* renamed from: w, reason: collision with root package name */
    private int f14212w;

    /* renamed from: x, reason: collision with root package name */
    private MediaViewPlayerView f14213x;

    /* renamed from: y, reason: collision with root package name */
    private RelativeLayout f14214y;

    /* renamed from: z, reason: collision with root package name */
    private RelativeLayout f14215z;

    /* renamed from: com.mbridge.msdk.nativex.view.BaseMBMediaView$10, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass10 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[BaseView.a.values().length];
            a = iArr;
            try {
                iArr[BaseView.a.FULL_MIDDLE_VIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[BaseView.a.FULL_TOP_VIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes4.dex */
    public enum a {
        BIG_IMAGE,
        VIDEO,
        GIF
    }

    /* loaded from: classes4.dex */
    public static final class b implements Runnable {
        WeakReference<BaseMBMediaView> a;

        public b(BaseMBMediaView baseMBMediaView) {
            this.a = new WeakReference<>(baseMBMediaView);
        }

        @Override // java.lang.Runnable
        public final void run() {
            BaseMBMediaView baseMBMediaView = this.a.get();
            if (baseMBMediaView != null) {
                try {
                    if (baseMBMediaView.f14187ac != null && baseMBMediaView.f14187ac == a.BIG_IMAGE) {
                        baseMBMediaView.f();
                        baseMBMediaView.f14187ac = a.VIDEO;
                        baseMBMediaView.changeNoticeURL();
                    }
                } catch (Throwable th2) {
                    ad.b(BaseMBMediaView.TAG, th2.getMessage(), th2);
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements com.mbridge.msdk.mbsignalcommon.base.a {
        private d() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.base.a
        public final boolean a(String str) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    if (ah.a.b(str)) {
                        ah.a(com.mbridge.msdk.foundation.controller.c.m().c(), str, (NativeListener.NativeTrackingListener) null);
                        return true;
                    }
                    if (URLUtil.isNetworkUrl(str)) {
                        return false;
                    }
                    ah.a(com.mbridge.msdk.foundation.controller.c.m().c(), str, (BaseTrackingListener) null);
                    return true;
                }
            } catch (Exception e2) {
                ad.b(BaseMBMediaView.TAG, e2.getMessage());
            }
            return false;
        }
    }

    /* loaded from: classes4.dex */
    public class e implements SensorEventListener {
        private e() {
        }

        @Override // android.hardware.SensorEventListener
        public final void onAccuracyChanged(Sensor sensor, int i10) {
        }

        @Override // android.hardware.SensorEventListener
        public final void onSensorChanged(SensorEvent sensorEvent) {
            int i10;
            if (BaseMBMediaView.this.al) {
                return;
            }
            try {
                float[] fArr = sensorEvent.values;
                float f10 = -fArr[0];
                float f11 = -fArr[1];
                float f12 = -fArr[2];
                if (((f11 * f11) + (f10 * f10)) * 4.0f >= f12 * f12) {
                    i10 = 90 - Math.round(((float) Math.atan2(-f11, f10)) * 57.29578f);
                    while (i10 >= 360) {
                        i10 -= 360;
                    }
                    while (i10 < 0) {
                        i10 += 360;
                    }
                } else {
                    i10 = -1;
                }
                float B = BaseMBMediaView.this.B();
                int g10 = ai.g(BaseMBMediaView.this.getContext());
                if ((i10 > 45 && i10 < 135) || (i10 > 225 && i10 < 315)) {
                    if (B >= g10 && !BaseMBMediaView.this.f14203k) {
                        BaseMBMediaView.this.f14202j = true;
                        BaseMBMediaView.this.f14203k = true;
                        BaseMBMediaView.this.N.postDelayed(new Runnable() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.e.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                try {
                                    com.mbridge.msdk.nativex.view.mbfullview.a.a(BaseMBMediaView.this.getContext()).a(BaseMBMediaView.this.G, BaseMBMediaView.this.f14202j);
                                    BaseMBMediaView.this.E();
                                    BaseMBMediaView.this.i();
                                    BaseMBMediaView.this.g();
                                    BaseMBMediaView.this.h();
                                    if (BaseMBMediaView.this.C != null) {
                                        BaseMBMediaView.this.C.orientation(BaseMBMediaView.this.f14202j);
                                    }
                                } catch (Exception e2) {
                                    ad.b(BaseMBMediaView.TAG, e2.getMessage());
                                }
                            }
                        }, 200L);
                        return;
                    }
                    return;
                }
                if (((i10 > 135 && i10 < 225) || ((i10 > 315 && i10 < 360) || ((i10 >= 0 && i10 <= 45) || i10 == -1))) && B <= g10 && BaseMBMediaView.this.f14203k) {
                    BaseMBMediaView.this.f14202j = false;
                    BaseMBMediaView.this.f14203k = false;
                    BaseMBMediaView.this.N.postDelayed(new Runnable() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.e.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                com.mbridge.msdk.nativex.view.mbfullview.a.a(BaseMBMediaView.this.getContext()).a(BaseMBMediaView.this.G, BaseMBMediaView.this.f14202j);
                                BaseMBMediaView.this.D();
                                BaseMBMediaView.this.i();
                                BaseMBMediaView.this.g();
                                BaseMBMediaView.this.h();
                                if (BaseMBMediaView.this.C != null) {
                                    BaseMBMediaView.this.C.orientation(BaseMBMediaView.this.f14202j);
                                }
                            } catch (Exception e2) {
                                ad.b(BaseMBMediaView.TAG, e2.getMessage());
                            }
                        }
                    }, 200L);
                }
            } catch (Throwable th2) {
                ad.b(BaseMBMediaView.TAG, th2.getMessage(), th2);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class f implements com.mbridge.msdk.videocommon.listener.a {
        WeakReference<BaseMBMediaView> a;

        public f(BaseMBMediaView baseMBMediaView) {
            this.a = new WeakReference<>(baseMBMediaView);
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public final void a(String str, String str2) {
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public final void a(String str) {
            BaseMBMediaView baseMBMediaView = this.a.get();
            if (baseMBMediaView != null) {
                baseMBMediaView.N.post(new b(baseMBMediaView));
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class g extends WebViewClient {
        WeakReference<BaseMBMediaView> a;

        public g(BaseMBMediaView baseMBMediaView) {
            this.a = new WeakReference<>(baseMBMediaView);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            try {
                BaseMBMediaView baseMBMediaView = this.a.get();
                if (baseMBMediaView != null && baseMBMediaView.f14187ac != null && baseMBMediaView.f14187ac == a.BIG_IMAGE) {
                    baseMBMediaView.m();
                    baseMBMediaView.f14187ac = a.GIF;
                    baseMBMediaView.changeNoticeURL();
                }
            } catch (Exception e2) {
                ad.b(BaseMBMediaView.TAG, e2.getMessage());
            }
        }
    }

    public BaseMBMediaView(Context context) {
        super(context);
        this.f14194b = true;
        this.f14195c = true;
        this.f14196d = true;
        this.f14197e = true;
        this.f14198f = true;
        this.f14199g = false;
        this.f14200h = true;
        this.f14201i = false;
        this.f14202j = false;
        this.f14203k = false;
        this.f14204l = true;
        this.f14205m = true;
        this.f14206n = new ArrayList<>();
        this.f14207o = new ArrayList<>();
        this.f14208r = false;
        this.f14209s = false;
        this.f14210t = null;
        this.u = null;
        this.f14211v = null;
        this.f14212w = 0;
        this.a = false;
        this.f14186ab = null;
        this.f14187ac = null;
        this.f14191ag = false;
        this.f14192ah = false;
        this.al = false;
        this.an = false;
        this.ao = new Runnable() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.9
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (!BaseMBMediaView.this.f14201i) {
                        BaseMBMediaView baseMBMediaView = BaseMBMediaView.this;
                        if (!baseMBMediaView.a((View) baseMBMediaView)) {
                            BaseMBMediaView.R(BaseMBMediaView.this);
                        } else {
                            BaseMBMediaView.S(BaseMBMediaView.this);
                        }
                    }
                    BaseMBMediaView.this.N.postDelayed(this, 300L);
                } catch (Exception e2) {
                    ad.b(BaseMBMediaView.TAG, e2.getMessage());
                }
            }
        };
        a(context);
    }

    public static /* synthetic */ void M(BaseMBMediaView baseMBMediaView) {
        CampaignEx.b mediaViewHolder;
        CampaignEx campaignEx = baseMBMediaView.O;
        if (campaignEx != null && (mediaViewHolder = campaignEx.getMediaViewHolder()) != null && !mediaViewHolder.f13152f && baseMBMediaView.O.getNativeVideoTracking() != null && baseMBMediaView.O.getNativeVideoTracking().j() != null) {
            mediaViewHolder.f13152f = true;
            Context context = baseMBMediaView.getContext();
            CampaignEx campaignEx2 = baseMBMediaView.O;
            com.mbridge.msdk.click.a.a(context, campaignEx2, campaignEx2.getCampaignUnitId(), baseMBMediaView.O.getNativeVideoTracking().j(), false, false);
        }
    }

    public static /* synthetic */ void N(BaseMBMediaView baseMBMediaView) {
        CampaignEx.b mediaViewHolder;
        CampaignEx campaignEx = baseMBMediaView.O;
        if (campaignEx != null && (mediaViewHolder = campaignEx.getMediaViewHolder()) != null && !mediaViewHolder.f13156j && baseMBMediaView.O.getNativeVideoTracking() != null && baseMBMediaView.O.getNativeVideoTracking().k() != null) {
            mediaViewHolder.f13156j = true;
            Context context = baseMBMediaView.getContext();
            CampaignEx campaignEx2 = baseMBMediaView.O;
            com.mbridge.msdk.click.a.a(context, campaignEx2, campaignEx2.getCampaignUnitId(), baseMBMediaView.O.getNativeVideoTracking().k(), false, false);
        }
    }

    public static /* synthetic */ void O(BaseMBMediaView baseMBMediaView) {
        CampaignEx.b mediaViewHolder;
        CampaignEx campaignEx = baseMBMediaView.O;
        if (campaignEx != null && (mediaViewHolder = campaignEx.getMediaViewHolder()) != null && !mediaViewHolder.f13153g && baseMBMediaView.O.getNativeVideoTracking() != null && baseMBMediaView.O.getNativeVideoTracking().m() != null) {
            mediaViewHolder.f13153g = true;
            Context context = baseMBMediaView.getContext();
            CampaignEx campaignEx2 = baseMBMediaView.O;
            com.mbridge.msdk.click.a.a(context, campaignEx2, campaignEx2.getCampaignUnitId(), baseMBMediaView.O.getNativeVideoTracking().m(), false, false);
        }
    }

    public static /* synthetic */ void P(BaseMBMediaView baseMBMediaView) {
        CampaignEx.b mediaViewHolder;
        CampaignEx campaignEx = baseMBMediaView.O;
        if (campaignEx != null && (mediaViewHolder = campaignEx.getMediaViewHolder()) != null && !mediaViewHolder.f13155i && baseMBMediaView.O.getNativeVideoTracking() != null && baseMBMediaView.O.getNativeVideoTracking().n() != null) {
            mediaViewHolder.f13155i = true;
            Context context = baseMBMediaView.getContext();
            CampaignEx campaignEx2 = baseMBMediaView.O;
            com.mbridge.msdk.click.a.a(context, campaignEx2, campaignEx2.getCampaignUnitId(), baseMBMediaView.O.getNativeVideoTracking().n(), false, false);
        }
    }

    public static /* synthetic */ void R(BaseMBMediaView baseMBMediaView) {
        try {
            MediaViewPlayerView mediaViewPlayerView = baseMBMediaView.f14213x;
            if (mediaViewPlayerView != null && mediaViewPlayerView.hasPrepare() && baseMBMediaView.f14213x.isPlaying()) {
                try {
                    MediaViewPlayerView mediaViewPlayerView2 = baseMBMediaView.f14213x;
                    if (mediaViewPlayerView2 != null) {
                        mediaViewPlayerView2.pause();
                    }
                } catch (Throwable th2) {
                    ad.b(TAG, th2.getMessage());
                }
            }
        } catch (Throwable th3) {
            ad.b(TAG, th3.getMessage());
        }
    }

    public static /* synthetic */ void S(BaseMBMediaView baseMBMediaView) {
        try {
            MediaViewPlayerView mediaViewPlayerView = baseMBMediaView.f14213x;
            if (mediaViewPlayerView != null && mediaViewPlayerView.hasPrepare() && !baseMBMediaView.f14213x.isPlaying() && !baseMBMediaView.f14213x.isComplete() && baseMBMediaView.f14213x.hasPrepare()) {
                baseMBMediaView.f14213x.startOrPlayVideo();
            }
        } catch (Throwable th2) {
            ad.b(TAG, th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        RelativeLayout relativeLayout;
        int i10;
        int i11;
        try {
            if (this.f14187ac == a.GIF) {
                int i12 = this.Q;
                if (i12 != 0 && (i10 = this.U) != 0 && (i11 = this.T) != 0) {
                    int i13 = (i12 * i10) / i11;
                    RelativeLayout relativeLayout2 = this.A;
                    if (relativeLayout2 != null && i13 != 0) {
                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout2.getLayoutParams();
                        layoutParams.width = this.Q;
                        layoutParams.height = i13;
                        layoutParams.addRule(13);
                        this.A.setLayoutParams(layoutParams);
                    }
                } else if (i12 != 0 && (relativeLayout = this.A) != null) {
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
                    int i14 = this.Q;
                    layoutParams2.width = i14;
                    layoutParams2.height = (i14 * 627) / 1200;
                    layoutParams2.addRule(13);
                    this.A.setLayoutParams(layoutParams2);
                }
            }
        } catch (Throwable th2) {
            ad.b(TAG, th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        try {
            this.f14214y.setVisibility(8);
            this.D.setVisibility(8);
            this.A.setVisibility(0);
            this.B.setVisibility(0);
        } catch (Throwable th2) {
            ad.b(TAG, th2.getMessage());
        }
    }

    private void n() {
        try {
            CampaignEx campaignEx = this.O;
            if (campaignEx == null) {
                return;
            }
            String imageUrl = campaignEx.getImageUrl();
            if (an.a(imageUrl) || getContext() == null) {
                return;
            }
            com.mbridge.msdk.foundation.same.c.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(imageUrl, new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.12
                @Override // com.mbridge.msdk.foundation.same.c.c
                public final void onFailedLoad(String str, String str2) {
                }

                @Override // com.mbridge.msdk.foundation.same.c.c
                public final void onSuccessLoad(Bitmap bitmap, String str) {
                    if (BaseMBMediaView.this.D != null && BaseMBMediaView.this.f14187ac == a.BIG_IMAGE) {
                        if (bitmap != null) {
                            BaseMBMediaView.this.T = bitmap.getWidth();
                            BaseMBMediaView.this.U = bitmap.getHeight();
                            BaseMBMediaView.this.D.setImageUrl(str);
                            BaseMBMediaView.this.D.setImageBitmap(bitmap);
                        }
                        BaseMBMediaView.this.D.setOnClickListener(new com.mbridge.msdk.widget.a() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.12.1
                            @Override // com.mbridge.msdk.widget.a
                            public final void a(View view) {
                                if (BaseMBMediaView.this.am == null) {
                                    BaseMBMediaView.this.b(view.getContext());
                                } else {
                                    BaseMBMediaView baseMBMediaView = BaseMBMediaView.this;
                                    baseMBMediaView.b(baseMBMediaView.am);
                                }
                            }
                        });
                    }
                }
            });
        } catch (Throwable th2) {
            ad.b(TAG, th2.getMessage());
        }
    }

    private void o() {
        try {
            CampaignEx campaignEx = this.O;
            if (campaignEx == null) {
                return;
            }
            String gifUrl = campaignEx.getGifUrl();
            if (an.a(gifUrl) || getContext() == null) {
                return;
            }
            this.B.loadDataWithBaseURL(null, "<!DOCTYPE html><html lang=\"en\"><head>  <meta charset=\"UTF-8\">  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"><meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">  <title>Document</title>  <style>  *{    margin: 0;    padding: 0;  }  html, body{    width: 100%;    height: 100%;  }  body{    background-image: url('gifUrl');    background-position: center;    background-size: contain;    background-repeat: no-repeat;  }  </style></head><body></body></html>".replace("gifUrl", gifUrl), "text/html", "utf-8", null);
            this.B.setInterceptTouch(true);
            this.A.setOnClickListener(new com.mbridge.msdk.widget.a() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.13
                @Override // com.mbridge.msdk.widget.a
                public final void a(View view) {
                    if (BaseMBMediaView.this.am == null) {
                        BaseMBMediaView.this.b(view.getContext());
                    } else {
                        BaseMBMediaView baseMBMediaView = BaseMBMediaView.this;
                        baseMBMediaView.b(baseMBMediaView.am);
                    }
                    ad.c(BaseMBMediaView.TAG, "CLICK WEBVIEW LAYOUT ");
                }
            });
        } catch (Throwable th2) {
            ad.b(TAG, th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String p() {
        try {
            CampaignEx campaignEx = this.O;
            if (campaignEx == null || !an.b(campaignEx.getCampaignUnitId())) {
                return null;
            }
            return this.O.getCampaignUnitId();
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
            return null;
        }
    }

    private void q() {
        try {
            if (this.O == null) {
                ad.c(TAG, "campaign is null addPlayerView return");
            }
            MediaViewPlayerView mediaViewPlayerView = this.f14213x;
            if (mediaViewPlayerView != null && mediaViewPlayerView.getParent() != null) {
                ((ViewGroup) this.f14213x.getParent()).removeView(this.f14213x);
            }
            l();
            MediaViewPlayerView mediaViewPlayerView2 = new MediaViewPlayerView(getContext());
            this.f14213x = mediaViewPlayerView2;
            mediaViewPlayerView2.showProgressView(this.f14204l);
            this.f14213x.showSoundIndicator(this.f14205m);
            if (this.f14199g) {
                this.f14213x.openSound();
            } else {
                this.f14213x.closeSound();
            }
            this.f14213x.setAllowLoopPlay(this.f14195c);
            this.f14213x.initPlayerViewData(s(), this.O, v(), this, this.f14186ab, p());
            this.f14213x.setOnMediaViewPlayerViewListener(new c(this));
            this.f14214y.addView(this.f14213x, -1, -1);
            try {
                MediaViewPlayerView mediaViewPlayerView3 = this.f14213x;
                if (mediaViewPlayerView3 != null) {
                    mediaViewPlayerView3.setOnClickListener(new com.mbridge.msdk.widget.a() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.11
                        @Override // com.mbridge.msdk.widget.a
                        public final void a(View view) {
                            try {
                                if (!BaseMBMediaView.this.f14201i) {
                                    BaseMBMediaView.d(BaseMBMediaView.this);
                                }
                                BaseMBMediaView.this.f14213x.showSoundIndicator(true);
                                BaseMBMediaView.this.f14213x.showProgressView(true);
                                if (BaseMBMediaView.this.f14197e && !BaseMBMediaView.this.f14201i && (BaseMBMediaView.this.F == null || BaseMBMediaView.this.F.getParent() == null)) {
                                    if (!BaseMBMediaView.this.f14213x.halfLoadingViewisVisible() && BaseMBMediaView.this.f14213x.isPlaying()) {
                                        BaseMBMediaView.this.a();
                                        return;
                                    }
                                    ad.c(BaseMBMediaView.TAG, "is loading or no playing return;");
                                    return;
                                }
                                if (BaseMBMediaView.this.f14201i) {
                                    ad.c(BaseMBMediaView.TAG, "fullScreenShowUI");
                                    BaseMBMediaView.h(BaseMBMediaView.this);
                                    return;
                                }
                                if (BaseMBMediaView.this.am == null) {
                                    BaseMBMediaView.this.b(view.getContext());
                                } else {
                                    BaseMBMediaView baseMBMediaView = BaseMBMediaView.this;
                                    baseMBMediaView.b(baseMBMediaView.am);
                                }
                                if (BaseMBMediaView.this.f14211v != null) {
                                    try {
                                        BaseMBMediaView.this.f14211v.a();
                                        ad.a("omsdk", "mnv adUserInteraction click");
                                    } catch (Exception e2) {
                                        ad.b("omsdk", e2.getMessage());
                                    }
                                }
                            } catch (Throwable th2) {
                                ad.b(BaseMBMediaView.TAG, th2.getMessage(), th2);
                            }
                        }
                    });
                }
            } catch (Throwable th2) {
                ad.b(TAG, th2.getMessage());
            }
            kd.b bVar = this.f14210t;
            if (bVar != null) {
                MediaViewPlayerView mediaViewPlayerView4 = this.f14213x;
                if (mediaViewPlayerView4 != null) {
                    mediaViewPlayerView4.registerView(bVar);
                }
                this.u = kd.a.a(this.f14210t);
                this.f14211v = ld.b.b(this.f14210t);
                this.f14210t.f();
                this.u.d(new r3(0));
                MediaViewPlayerView mediaViewPlayerView5 = this.f14213x;
                if (mediaViewPlayerView5 != null) {
                    mediaViewPlayerView5.setVideoEvents(this.f14211v);
                }
                try {
                    kd.a aVar = this.u;
                    if (aVar != null) {
                        aVar.b();
                    }
                } catch (Exception e2) {
                    ad.a("omsdk", e2.getMessage());
                }
            }
        } catch (Throwable th3) {
            ad.b(TAG, th3.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void cai(Object obj, String str) {
        int i10;
        ad.a(TAG, "cai:" + str);
        if (TextUtils.isEmpty(str)) {
            com.mbridge.msdk.mbsignalcommon.communication.d.a(obj, "params is null");
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                try {
                    String optString = new JSONObject(str).optString("packageName");
                    if (TextUtils.isEmpty(optString)) {
                        com.mbridge.msdk.mbsignalcommon.communication.d.a(obj, "packageName is empty");
                    }
                    if (ai.c(com.mbridge.msdk.foundation.controller.c.m().c(), optString)) {
                        i10 = 1;
                    } else {
                        i10 = 2;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", com.mbridge.msdk.mbsignalcommon.communication.d.f14119b);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("result", i10);
                        jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e2) {
                        com.mbridge.msdk.mbsignalcommon.communication.d.a(obj, e2.getMessage());
                        ad.a(TAG, e2.getMessage());
                    }
                } catch (JSONException e10) {
                    com.mbridge.msdk.mbsignalcommon.communication.d.a(obj, "exception: " + e10.getLocalizedMessage());
                    ad.b(TAG, "cai", e10);
                }
            } catch (Throwable th2) {
                com.mbridge.msdk.mbsignalcommon.communication.d.a(obj, "exception: " + th2.getLocalizedMessage());
                ad.b(TAG, "cai", th2);
            }
        }
    }

    public boolean canShowVideo() {
        if (a(false) != a.VIDEO) {
            return false;
        }
        return true;
    }

    public void changeNoticeURL() {
        String str;
        CampaignEx campaignEx = this.O;
        if (campaignEx != null) {
            String noticeUrl = campaignEx.getNoticeUrl();
            if (!TextUtils.isEmpty(noticeUrl)) {
                if (noticeUrl.contains("is_video")) {
                    a aVar = this.f14187ac;
                    if (aVar == a.VIDEO) {
                        if (noticeUrl.contains("is_video=2")) {
                            noticeUrl = noticeUrl.replace("is_video=2", "is_video=1");
                        }
                    } else if (aVar == a.BIG_IMAGE && noticeUrl.contains("is_video=1")) {
                        noticeUrl = noticeUrl.replace("is_video=1", "is_video=2");
                    }
                } else {
                    a aVar2 = this.f14187ac;
                    if (aVar2 == a.VIDEO) {
                        str = "1";
                    } else if (aVar2 == a.BIG_IMAGE) {
                        str = MBridgeConstans.API_REUQEST_CATEGORY_APP;
                    } else {
                        str = "";
                    }
                    StringBuilder sb2 = new StringBuilder(noticeUrl);
                    if (noticeUrl.contains("?")) {
                        sb2.append("&is_video=");
                        sb2.append(str);
                    } else {
                        sb2.append("?is_video=");
                        sb2.append(str);
                    }
                    noticeUrl = sb2.toString();
                }
                this.O.setNoticeUrl(noticeUrl);
            }
        }
    }

    public void destory() {
        try {
            MediaViewPlayerView mediaViewPlayerView = this.f14213x;
            if (mediaViewPlayerView != null) {
                mediaViewPlayerView.release();
            }
            b();
        } catch (Throwable th2) {
            ad.b(TAG, th2.getMessage());
        }
    }

    public void exitFullScreen() {
        try {
            x();
            if (this.f14195c) {
                this.f14213x.onClickPlayButton();
            }
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
    }

    public String getAddNVT2ToNoticeURL() {
        CampaignEx campaignEx = this.O;
        if (campaignEx != null) {
            String noticeUrl = campaignEx.getNoticeUrl();
            if (!TextUtils.isEmpty(noticeUrl) && !noticeUrl.contains(CampaignEx.JSON_KEY_NV_T2)) {
                return noticeUrl + "&nv_t2=" + this.O.getNvT2();
            }
            return noticeUrl;
        }
        return null;
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void getEndScreenInfo(Object obj, String str) {
        String str2;
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.O);
            String a10 = a(arrayList, p(), "MAL_16.7.71,3.0.1");
            if (!TextUtils.isEmpty(a10)) {
                str2 = Base64.encodeToString(a10.getBytes(), 2);
            } else {
                str2 = "";
            }
            ad.b(TAG, "getEndScreenInfo-mCampaign.name:" + this.O.getAppName());
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(obj, str2);
        } catch (Throwable th2) {
            ad.b(TAG, th2.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.mbridge.msdk.nativex.view.mbfullview.BaseView getFullScreenViewByStyle(android.content.Context r3, com.mbridge.msdk.nativex.view.mbfullview.BaseView.a r4) {
        /*
            r2 = this;
            int[] r0 = com.mbridge.msdk.nativex.view.BaseMBMediaView.AnonymousClass10.a
            int r1 = r4.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L16
            r1 = 2
            if (r0 == r1) goto L10
            r3 = 0
            goto L1c
        L10:
            com.mbridge.msdk.nativex.view.mbfullview.MBridgeTopFullView r0 = new com.mbridge.msdk.nativex.view.mbfullview.MBridgeTopFullView
            r0.<init>(r3)
            goto L1b
        L16:
            com.mbridge.msdk.nativex.view.mbfullview.MBridgeFullView r0 = new com.mbridge.msdk.nativex.view.mbfullview.MBridgeFullView
            r0.<init>(r3)
        L1b:
            r3 = r0
        L1c:
            if (r3 == 0) goto L21
            r3.setStytle(r4)
        L21:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.nativex.view.BaseMBMediaView.getFullScreenViewByStyle(android.content.Context, com.mbridge.msdk.nativex.view.mbfullview.BaseView$a):com.mbridge.msdk.nativex.view.mbfullview.BaseView");
    }

    public float getMediaContentAspectRatio() {
        String imageSize;
        float f10 = 0.0f;
        try {
            CampaignEx campaignEx = this.O;
            if (campaignEx != null) {
                if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                    imageSize = this.O.getVideoResolution();
                } else {
                    imageSize = this.O.getImageSize();
                }
                if (!TextUtils.isEmpty(imageSize)) {
                    if (imageSize.split("x").length == 2) {
                        f10 = Integer.parseInt(r3[0]) / Integer.parseInt(r3[1]);
                    }
                }
                ad.b(TAG, "resource ratio is : " + f10);
            }
        } catch (Throwable th2) {
            ad.b(TAG, th2.getMessage());
        }
        return f10;
    }

    public BaseView.a handleViewStyleResult(Context context) {
        int nvT2 = this.O.getNvT2();
        if (nvT2 != 1) {
            if (nvT2 != 2 && nvT2 != 3 && nvT2 != 4) {
                if (nvT2 == 6) {
                    return BaseView.a.FULL_TOP_VIEW;
                }
            } else {
                return BaseView.a.FULL_MIDDLE_VIEW;
            }
        } else {
            b(context);
        }
        return null;
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void handlerPlayableException(Object obj, String str) {
    }

    public void hideEndCardWebViewCloseBtn() {
        ImageView imageView = this.aj;
        if (imageView != null && imageView.getVisibility() == 0) {
            this.aj.setVisibility(8);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void install(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        try {
            Context context = this.am;
            if (context != null) {
                b(context);
            } else if ((obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f14146b) != null) {
                b(windVaneWebView.getContext());
            }
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
    }

    public boolean ismCurIsFullScreen() {
        return this.f14201i;
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void notifyCloseBtn(Object obj, String str) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            if (this.f14196d) {
                try {
                    SensorManager sensorManager = (SensorManager) getContext().getSystemService("sensor");
                    this.W = sensorManager;
                    this.f14185aa = sensorManager.getDefaultSensor(1);
                    e eVar = new e();
                    this.V = eVar;
                    this.W.registerListener(eVar, this.f14185aa, 2);
                } catch (Throwable th2) {
                    ad.b(TAG, th2.getMessage());
                }
            }
            this.f14200h = isHardwareAccelerated();
            this.ak = getOrientation();
            e();
            this.N.postDelayed(this.ao, 300L);
        } catch (Throwable th3) {
            ad.b(TAG, th3.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onBufferingEnd() {
        ad.c("omsdk", "base media end");
        ld.b bVar = this.f14211v;
        if (bVar != null) {
            i iVar = bVar.a;
            com.facebook.internal.i.d(iVar);
            iVar.f20672e.a("bufferFinish", null);
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onBufferingStart(String str) {
        ad.c("omsdk", "base media start");
        ld.b bVar = this.f14211v;
        if (bVar != null) {
            i iVar = bVar.a;
            com.facebook.internal.i.d(iVar);
            iVar.f20672e.a("bufferStart", null);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        boolean z10;
        super.onConfigurationChanged(configuration);
        if (this.al) {
            int i10 = this.ak;
            int i11 = configuration.orientation;
            if (i10 == i11) {
                return;
            }
            this.ak = i11;
            boolean z11 = true;
            if (i11 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f14202j = z10;
            if (this.ak != 0) {
                z11 = false;
            }
            this.f14203k = z11;
            this.N.postDelayed(new Runnable() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.8
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        com.mbridge.msdk.nativex.view.mbfullview.a.a(BaseMBMediaView.this.getContext()).a(BaseMBMediaView.this.G, BaseMBMediaView.this.f14202j);
                        if (BaseMBMediaView.this.ak == 0) {
                            BaseMBMediaView.this.E();
                        } else {
                            BaseMBMediaView.this.D();
                        }
                        BaseMBMediaView.this.i();
                        BaseMBMediaView.this.g();
                        BaseMBMediaView.this.h();
                        if (BaseMBMediaView.this.C != null) {
                            BaseMBMediaView.this.C.orientation(BaseMBMediaView.this.f14202j);
                        }
                    } catch (Exception e2) {
                        ad.b(BaseMBMediaView.TAG, e2.getMessage());
                    }
                }
            }, 200L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        e eVar;
        super.onDetachedFromWindow();
        try {
            if (this.f14210t != null) {
                MediaViewPlayerView mediaViewPlayerView = this.f14213x;
                if (mediaViewPlayerView != null) {
                    mediaViewPlayerView.unregisterView();
                }
                this.f14210t.c();
                this.f14210t = null;
            }
            if (this.f14211v != null) {
                this.f14211v = null;
            }
            if (this.u != null) {
                this.u = null;
            }
            this.N.removeCallbacks(this.ao);
            Handler handler = this.N;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            try {
                SensorManager sensorManager = this.W;
                if (sensorManager != null && (eVar = this.V) != null) {
                    sensorManager.unregisterListener(eVar);
                }
            } catch (Throwable th2) {
                ad.b(TAG, th2.getMessage());
            }
            b();
        } catch (Throwable th3) {
            ad.b(TAG, th3.getMessage());
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        try {
            this.P = getHeight();
            int width = getWidth();
            this.Q = width;
            if (width == 0) {
                this.Q = getMeasuredWidth();
            }
            if (this.P == 0) {
                this.P = getMeasuredHeight();
            }
            if (this.Q == 0 && this.P == 0) {
                this.Q = (int) B();
            }
            a aVar = this.f14187ac;
            if (aVar == a.VIDEO && !this.f14201i) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (this.P == 0 || ((layoutParams != null && layoutParams.height == -2) || (layoutParams != null && layoutParams.height == -1))) {
                    this.P = (int) ((this.Q * this.S) / this.R);
                }
                i();
                return;
            }
            if (aVar == a.BIG_IMAGE && !this.f14201i) {
                g();
            } else if (aVar == a.GIF && !this.f14201i) {
                h();
            }
        } catch (Throwable th2) {
            ad.b(TAG, th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayCompleted() {
        ld.b bVar = this.f14211v;
        if (bVar != null) {
            i iVar = bVar.a;
            com.facebook.internal.i.d(iVar);
            iVar.f20672e.a(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE, null);
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayError(final String str) {
        try {
            ad.c("error", str);
            Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.15
                @Override // java.lang.Runnable
                public final void run() {
                    BaseMBMediaView.q(BaseMBMediaView.this);
                    BaseMBMediaView.a(BaseMBMediaView.this, str);
                    NativeController.insertExcludeId(BaseMBMediaView.this.O.getCampaignUnitId(), BaseMBMediaView.this.O);
                }
            };
            com.mbridge.msdk.foundation.controller.d.a();
            com.mbridge.msdk.foundation.same.f.b.b().execute(runnable);
        } catch (Throwable th2) {
            ad.b(TAG, th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayProgress(int i10, int i11) {
        int i12;
        String str;
        CampaignEx.b mediaViewHolder;
        CampaignEx.b mediaViewHolder2;
        Map<Integer, String> map;
        try {
            CampaignEx campaignEx = this.O;
            if (campaignEx != null && (mediaViewHolder2 = campaignEx.getMediaViewHolder()) != null && !mediaViewHolder2.f13148b && (map = mediaViewHolder2.a) != null && map.size() > 0) {
                Map<Integer, String> map2 = mediaViewHolder2.a;
                Iterator<Map.Entry<Integer, String>> it = map2.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<Integer, String> next = it.next();
                    Integer key = next.getKey();
                    String value = next.getValue();
                    if (i10 >= key.intValue() && !TextUtils.isEmpty(value)) {
                        Context context = getContext();
                        CampaignEx campaignEx2 = this.O;
                        com.mbridge.msdk.click.a.a(context, campaignEx2, campaignEx2.getCampaignUnitId(), value, false, false);
                        it.remove();
                    }
                }
                if (map2.size() <= 0) {
                    mediaViewHolder2.f13148b = true;
                }
            }
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
        int i13 = 0;
        try {
            CampaignEx campaignEx3 = this.O;
            if (campaignEx3 != null && (mediaViewHolder = campaignEx3.getMediaViewHolder()) != null && !mediaViewHolder.f13154h && i11 != 0) {
                List<Map<Integer, String>> i14 = this.O.getNativeVideoTracking().i();
                int i15 = ((i10 + 1) * 100) / i11;
                if (i14 != null) {
                    int i16 = 0;
                    while (i16 < i14.size()) {
                        Map<Integer, String> map3 = i14.get(i16);
                        if (map3 != null && map3.size() > 0) {
                            Iterator<Map.Entry<Integer, String>> it2 = map3.entrySet().iterator();
                            while (it2.hasNext()) {
                                Map.Entry<Integer, String> next2 = it2.next();
                                int intValue = next2.getKey().intValue();
                                String value2 = next2.getValue();
                                if (intValue <= i15 && !TextUtils.isEmpty(value2)) {
                                    Context context2 = getContext();
                                    CampaignEx campaignEx4 = this.O;
                                    com.mbridge.msdk.click.a.a(context2, campaignEx4, campaignEx4.getCampaignUnitId(), new String[]{value2}, false, true);
                                    it2.remove();
                                    i14.remove(i16);
                                    i16--;
                                }
                            }
                        }
                        i16++;
                    }
                    if (i14.size() <= 0) {
                        mediaViewHolder.f13154h = true;
                    }
                }
            }
        } catch (Throwable unused) {
            ad.b(TAG, "reportPlayPercentageData error");
        }
        ld.b bVar = this.f14211v;
        if (bVar != null) {
            int i17 = (i10 * 100) / i11;
            int i18 = ((i10 + 1) * 100) / i11;
            i iVar = bVar.a;
            if (i17 <= 25 && 25 < i18) {
                com.facebook.internal.i.d(iVar);
                iVar.f20672e.a("firstQuartile", null);
            } else if (i17 <= 50 && 50 < i18) {
                com.facebook.internal.i.d(iVar);
                iVar.f20672e.a(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT, null);
            } else if (i17 <= 75 && 75 < i18) {
                com.facebook.internal.i.d(iVar);
                iVar.f20672e.a("thirdQuartile", null);
            }
        }
        if (t() != 100 && !this.an) {
            if (u() != null) {
                i13 = u().g();
            }
            int t5 = t();
            if (t5 == 0) {
                return;
            }
            if (i13 > t5) {
                i13 = t5 / 2;
            }
            if (i13 >= 0 && i10 >= (i12 = (i13 * i11) / 100)) {
                if (this.O.getAdType() != 94 && this.O.getAdType() != 287) {
                    str = this.O.getId() + this.O.getVideoUrlEncode() + this.O.getBidToken();
                } else {
                    str = this.O.getRequestId() + this.O.getId() + this.O.getVideoUrlEncode();
                }
                com.mbridge.msdk.videocommon.download.a a10 = com.mbridge.msdk.videocommon.download.b.getInstance().a(p(), str);
                if (a10 != null) {
                    a10.p();
                    this.an = true;
                    ad.b(TAG, "CDRate is : " + i12 + " and start download !");
                }
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayProgressMS(int i10, int i11) {
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlaySetDataSourceError(String str) {
        ad.c("errorstr", str);
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayStarted(int i10) {
        float f10;
        ld.b bVar = this.f14211v;
        if (bVar != null) {
            float f11 = i10;
            try {
                if (this.f14199g) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                bVar.d(f11, f10);
            } catch (IllegalArgumentException e2) {
                ad.a("omsdk", e2.getMessage());
            }
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        MediaViewPlayerView mediaViewPlayerView;
        super.onWindowFocusChanged(z10);
        try {
            this.f14198f = z10;
            if (this.f14187ac == a.VIDEO && (mediaViewPlayerView = this.f14213x) != null) {
                mediaViewPlayerView.setIsFrontDesk(z10);
            }
            try {
                if (this.f14201i) {
                    MediaViewPlayerView mediaViewPlayerView2 = this.f14213x;
                    if (mediaViewPlayerView2 != null) {
                        if (this.f14198f) {
                            if (mediaViewPlayerView2.isPlaying()) {
                                ad.c(TAG, "fullscreen windowfocuse true isPlaying do nothing return");
                            } else {
                                MediaViewPlayerView mediaViewPlayerView3 = this.f14213x;
                                if (mediaViewPlayerView3 != null && !mediaViewPlayerView3.isComplete() && !this.f14213x.getIsActiviePause()) {
                                    this.f14213x.onClickPlayButton();
                                }
                            }
                        } else {
                            mediaViewPlayerView2.pause();
                        }
                    } else {
                        ad.b(TAG, "fullscreen playerview is null return");
                    }
                }
            } catch (Throwable th2) {
                ad.b(TAG, th2.getMessage());
            }
            requestLayout();
        } catch (Throwable th3) {
            ad.b(TAG, th3.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void openURL(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        ad.b(TAG, "openURL:" + str);
        if (TextUtils.isEmpty(str)) {
            com.mbridge.msdk.mbsignalcommon.communication.d.a(obj, "params is null");
            return;
        }
        Context c10 = com.mbridge.msdk.foundation.controller.c.m().c();
        if (!TextUtils.isEmpty(str)) {
            if (c10 == null) {
                try {
                    if ((obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f14146b) != null) {
                        c10 = windVaneWebView.getContext();
                    }
                } catch (Exception e2) {
                    ad.b(TAG, e2.getMessage());
                }
            }
            if (c10 == null) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("url");
                int optInt = jSONObject.optInt("type");
                if (optInt == 1) {
                    com.mbridge.msdk.click.c.c(c10, optString);
                } else if (optInt == 2) {
                    com.mbridge.msdk.click.c.e(c10, optString);
                }
            } catch (JSONException e10) {
                ad.b(TAG, e10.getMessage());
            } catch (Throwable th2) {
                ad.b(TAG, th2.getMessage());
            }
        }
    }

    public void setAllowLoopPlay(boolean z10) {
        this.f14195c = z10;
    }

    public void setAllowScreenChange(boolean z10) {
        this.f14196d = z10;
    }

    public void setAllowVideoRefresh(boolean z10) {
        this.f14194b = z10;
    }

    public void setFollowActivityOrientation(boolean z10) {
        this.al = z10;
    }

    public void setFullScreenViewBackgroundColor(int i10) {
        this.f14212w = i10;
    }

    public void setIsAllowFullScreen(boolean z10) {
        this.f14197e = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a7 A[Catch: all -> 0x010a, TryCatch #0 {all -> 0x010a, blocks: (B:5:0x0003, B:9:0x000a, B:11:0x0025, B:12:0x0037, B:14:0x0041, B:17:0x004c, B:18:0x0095, B:20:0x00a7, B:22:0x00ac, B:24:0x00b0, B:25:0x00b3, B:26:0x00ba, B:28:0x00be, B:29:0x00c0, B:31:0x00c4, B:32:0x00c6, B:34:0x00ca, B:36:0x00d0, B:37:0x0102, B:39:0x0106, B:43:0x0071), top: B:4:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0106 A[Catch: all -> 0x010a, TRY_LEAVE, TryCatch #0 {all -> 0x010a, blocks: (B:5:0x0003, B:9:0x000a, B:11:0x0025, B:12:0x0037, B:14:0x0041, B:17:0x004c, B:18:0x0095, B:20:0x00a7, B:22:0x00ac, B:24:0x00b0, B:25:0x00b3, B:26:0x00ba, B:28:0x00be, B:29:0x00c0, B:31:0x00c4, B:32:0x00c6, B:34:0x00ca, B:36:0x00d0, B:37:0x0102, B:39:0x0106, B:43:0x0071), top: B:4:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setNativeAd(com.mbridge.msdk.out.Campaign r9) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.nativex.view.BaseMBMediaView.setNativeAd(com.mbridge.msdk.out.Campaign):void");
    }

    public void setOnMediaViewListener(OnMBMediaViewListener onMBMediaViewListener) {
        this.f14188ad = onMBMediaViewListener;
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void setOrientation(Object obj, String str) {
    }

    public void setProgressVisibility(boolean z10) {
        this.f14204l = z10;
        MediaViewPlayerView mediaViewPlayerView = this.f14213x;
        if (mediaViewPlayerView != null) {
            mediaViewPlayerView.showProgressView(z10);
        }
    }

    public void setSoundIndicatorVisibility(boolean z10) {
        this.f14205m = z10;
        MediaViewPlayerView mediaViewPlayerView = this.f14213x;
        if (mediaViewPlayerView != null) {
            mediaViewPlayerView.showSoundIndicator(z10);
        }
    }

    public void setVideoSoundOnOff(boolean z10) {
        this.f14199g = z10;
        MediaViewPlayerView mediaViewPlayerView = this.f14213x;
        if (mediaViewPlayerView != null) {
            if (z10) {
                mediaViewPlayerView.openSound();
            } else {
                mediaViewPlayerView.closeSound();
            }
        }
    }

    public void showEndCardWebViewCloseBtn() {
        ImageView imageView = this.aj;
        if (imageView != null && imageView.getVisibility() != 0) {
            this.aj.setVisibility(0);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                try {
                    new JSONObject(str).optInt("state", 1);
                } catch (Exception e2) {
                    ad.b(TAG, e2.getMessage());
                }
            }
            ad.b(TAG, "SHOW CLOSE BTN ");
            showEndCardWebViewCloseBtn();
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(obj, a(0));
        } catch (Exception e10) {
            ad.b(TAG, e10.getMessage());
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().b(obj, a(1));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void triggerCloseBtn(Object obj, String str) {
        try {
            exitFullScreen();
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(obj, a(0));
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().b(obj, a(1));
        }
    }

    public void updateViewManger(boolean z10) {
        boolean z11;
        com.mbridge.msdk.nativex.view.mbfullview.a a10 = com.mbridge.msdk.nativex.view.mbfullview.a.a(getContext());
        boolean z12 = true;
        int i10 = 0;
        if (a10 != null) {
            try {
                this.G.getmAnimationPlayer().clearAnimation();
                if (!this.f14213x.isComplete()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                a10.a(z10, z11, this.G);
                a10.a(z10, this.G, this.f14190af);
            } catch (NullPointerException e2) {
                e2.printStackTrace();
                return;
            }
        }
        BaseView baseView = this.G;
        if ((baseView instanceof MBridgeTopFullView) && a10 != null) {
            if (z10) {
                z12 = false;
            }
            if (baseView instanceof MBridgeTopFullView) {
                MBridgeTopFullView mBridgeTopFullView = (MBridgeTopFullView) baseView;
                if (!z12) {
                    i10 = 8;
                }
                mBridgeTopFullView.getMBridgeFullViewDisplayIcon().setVisibility(i10);
                mBridgeTopFullView.getMBridgeFullViewDisplayTitle().setVisibility(i10);
                mBridgeTopFullView.getMBridgeFullViewDisplayDscription().setVisibility(i10);
                mBridgeTopFullView.getStarLevelLayoutView().setVisibility(i10);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements com.mbridge.msdk.nativex.listener.a {
        WeakReference<BaseMBMediaView> a;

        public c(BaseMBMediaView baseMBMediaView) {
            this.a = new WeakReference<>(baseMBMediaView);
        }

        @Override // com.mbridge.msdk.nativex.listener.a
        public final void a() {
            BaseMBMediaView baseMBMediaView = this.a.get();
            if (baseMBMediaView != null) {
                BaseMBMediaView.M(baseMBMediaView);
            }
        }

        @Override // com.mbridge.msdk.nativex.listener.a
        public final void b() {
            BaseMBMediaView baseMBMediaView = this.a.get();
            if (baseMBMediaView != null) {
                BaseMBMediaView.N(baseMBMediaView);
            }
        }

        @Override // com.mbridge.msdk.nativex.listener.a
        public final void c() {
            BaseMBMediaView baseMBMediaView = this.a.get();
            if (baseMBMediaView != null) {
                BaseMBMediaView.O(baseMBMediaView);
            }
        }

        @Override // com.mbridge.msdk.nativex.listener.a
        public final void d() {
            BaseMBMediaView baseMBMediaView = this.a.get();
            if (baseMBMediaView != null) {
                BaseMBMediaView.P(baseMBMediaView);
            }
        }

        @Override // com.mbridge.msdk.nativex.listener.a
        public final void a(String str) {
            BaseMBMediaView baseMBMediaView = this.a.get();
            if (baseMBMediaView != null) {
                baseMBMediaView.a(str);
            }
        }

        @Override // com.mbridge.msdk.nativex.listener.a
        public final void b(String str) {
            BaseMBMediaView baseMBMediaView = this.a.get();
            if (baseMBMediaView != null) {
                baseMBMediaView.b(str);
            }
        }
    }

    private void A() {
        String[] split;
        try {
            CampaignEx campaignEx = this.O;
            if (campaignEx == null || an.a(campaignEx.getVideoResolution()) || (split = this.O.getVideoResolution().split("x")) == null || split.length != 2) {
                return;
            }
            String str = split[0];
            String str2 = split[1];
            double m10 = ai.m(str);
            double m11 = ai.m(str2);
            if (m10 <= 0.0d || m11 <= 0.0d) {
                return;
            }
            this.R = m10;
            this.S = m11;
        } catch (Throwable th2) {
            ad.b(TAG, th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float B() {
        try {
            float h10 = ai.h(getContext());
            return this.f14202j ? h10 + ai.c(getContext()) : h10;
        } catch (Throwable th2) {
            ad.b(TAG, th2.getMessage());
            return 0.0f;
        }
    }

    private float C() {
        try {
            float g10 = ai.g(getContext());
            return !this.f14202j ? g10 + ai.c(getContext()) : g10;
        } catch (Throwable th2) {
            ad.b(TAG, th2.getMessage());
            return 0.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        try {
            if (this.I == null && this.aj == null) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ai.a(getContext(), 30.0f), ai.a(getContext(), 30.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(10);
            layoutParams.topMargin = ai.a(getContext(), 8.0f);
            layoutParams.rightMargin = ai.a(getContext(), 8.0f);
            RelativeLayout relativeLayout = this.I;
            if (relativeLayout != null) {
                relativeLayout.setLayoutParams(layoutParams);
            }
            ImageView imageView = this.aj;
            if (imageView != null) {
                imageView.setLayoutParams(layoutParams);
            }
            updateViewManger(false);
        } catch (Throwable th2) {
            ad.b(TAG, th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        try {
            if (this.I == null && this.aj == null) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ai.a(getContext(), 30.0f), ai.a(getContext(), 30.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(10);
            if (this.f14190af == 0 && com.mbridge.msdk.foundation.tools.d.a(getContext())) {
                layoutParams.rightMargin = ai.c(getContext()) + ai.a(getContext(), 8.0f);
            } else {
                layoutParams.rightMargin = ai.a(getContext(), 8.0f);
            }
            layoutParams.topMargin = ai.a(getContext(), 8.0f);
            RelativeLayout relativeLayout = this.I;
            if (relativeLayout != null) {
                relativeLayout.setLayoutParams(layoutParams);
            }
            ImageView imageView = this.aj;
            if (imageView != null) {
                imageView.setLayoutParams(layoutParams);
            }
            updateViewManger(true);
        } catch (Throwable th2) {
            ad.b(TAG, th2.getMessage());
        }
    }

    private void F() {
        int i10;
        try {
            CampaignEx campaignEx = this.O;
            if (campaignEx == null || campaignEx.getNativeVideoTracking() == null) {
                return;
            }
            String[] c10 = this.O.getNativeVideoTracking().c();
            if (this.f14202j) {
                i10 = f14183p;
            } else {
                i10 = f14184q;
            }
            for (String str : c10) {
                if (!TextUtils.isEmpty(str)) {
                    Context context = getContext();
                    CampaignEx campaignEx2 = this.O;
                    com.mbridge.msdk.click.a.a(context, campaignEx2, campaignEx2.getCampaignUnitId(), str + "&orienation=" + i10, false, false);
                }
            }
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WindVaneWebViewForNV G() {
        try {
            WindVaneWebViewForNV windVaneWebViewForNV = this.C;
            if (windVaneWebViewForNV != null && this.f14192ah) {
                return windVaneWebViewForNV;
            }
            if (this.f14192ah) {
                return null;
            }
            b(true);
            return null;
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
            return null;
        }
    }

    private void d() {
        this.N = new Handler() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                Object obj;
                if (message != null) {
                    try {
                        int i10 = message.what;
                        if (i10 == 1) {
                            BaseMBMediaView.this.r();
                        } else if (i10 == 3 && (obj = message.obj) != null && (obj instanceof View)) {
                            if (BaseMBMediaView.this.a((View) obj)) {
                                BaseMBMediaView.b(BaseMBMediaView.this);
                            }
                        }
                    } catch (Exception e2) {
                        ad.b(BaseMBMediaView.TAG, e2.getMessage());
                    }
                }
            }
        };
    }

    private void e() {
        kd.b bVar;
        try {
            this.f14187ac = a(true);
            changeNoticeURL();
            a aVar = this.f14187ac;
            if (aVar == a.BIG_IMAGE) {
                CampaignEx campaignEx = this.O;
                if (campaignEx != null && TextUtils.isEmpty(campaignEx.getVideoUrlEncode()) && (bVar = this.f14210t) != null) {
                    try {
                        bVar.d(this.D);
                        this.u = kd.a.a(this.f14210t);
                        this.f14210t.f();
                        kd.a aVar2 = this.u;
                        if (aVar2 != null) {
                            aVar2.b();
                        }
                    } catch (Exception e2) {
                        ad.a("omsdk", e2.getMessage());
                    }
                }
                k();
                n();
            } else if (aVar == a.VIDEO) {
                f();
            } else if (aVar == a.GIF) {
                o();
                m();
            }
            this.f14208r = true;
        } catch (Throwable th2) {
            ad.b(TAG, th2.getMessage(), th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        A();
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        int i10;
        int i11;
        int i12;
        try {
            if (this.f14187ac != a.BIG_IMAGE || (i10 = this.Q) == 0 || (i11 = this.U) == 0 || (i12 = this.T) == 0) {
                return;
            }
            int i13 = (i10 * i11) / i12;
            MyImageView myImageView = this.D;
            if (myImageView == null || i13 == 0) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) myImageView.getLayoutParams();
            layoutParams.width = this.Q;
            layoutParams.height = i13;
            this.D.setLayoutParams(layoutParams);
        } catch (Throwable th2) {
            ad.b(TAG, th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        try {
            if (this.f14187ac != a.VIDEO || this.f14214y == null) {
                return;
            }
            int B = (int) B();
            int g10 = ai.g(getContext());
            if (!this.f14201i) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f14214y.getLayoutParams();
                layoutParams.width = this.Q;
                layoutParams.height = this.P;
                layoutParams.addRule(13);
                this.f14214y.setLayoutParams(layoutParams);
            } else {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.H.getLayoutParams();
                layoutParams2.width = B;
                layoutParams2.height = g10;
                layoutParams2.addRule(13);
                this.H.setLayoutParams(layoutParams2);
            }
            r();
            if (!this.f14201i) {
                a(this.f14213x, this.Q, this.P);
            } else {
                a(this.f14213x, B, g10);
            }
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
    }

    private void j() {
        try {
            this.f14213x.showSoundIndicator(this.f14205m);
            this.f14213x.showProgressView(this.f14204l);
            OnMBMediaViewListener onMBMediaViewListener = this.f14188ad;
            if (onMBMediaViewListener != null) {
                onMBMediaViewListener.onExitFullscreen();
            }
            OnMBMediaViewListenerPlus onMBMediaViewListenerPlus = this.f14189ae;
            if (onMBMediaViewListenerPlus != null) {
                onMBMediaViewListenerPlus.onExitFullscreen();
            }
            ld.b bVar = this.f14211v;
            if (bVar != null) {
                ld.c cVar = ld.c.NORMAL;
                i iVar = bVar.a;
                com.facebook.internal.i.d(iVar);
                JSONObject jSONObject = new JSONObject();
                qd.c.b(jSONObject, "state", cVar);
                iVar.f20672e.a("playerStateChange", jSONObject);
            }
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
    }

    private void k() {
        try {
            ai.a((ImageView) this.D);
            this.D.setVisibility(0);
            this.f14214y.setVisibility(8);
            this.A.setVisibility(8);
        } catch (Throwable th2) {
            ad.b(TAG, th2.getMessage());
        }
    }

    private void l() {
        try {
            this.f14214y.setVisibility(0);
            this.D.setVisibility(8);
            this.A.setVisibility(8);
        } catch (Throwable th2) {
            ad.b(TAG, th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        try {
            if (getVisibility() != 0) {
                return;
            }
            if (a((View) this)) {
                k u = u();
                int i10 = 0;
                int l10 = u != null ? u.l() : 0;
                CampaignEx campaignEx = this.O;
                if (campaignEx == null || campaignEx.getImpReportType() != 1) {
                    i10 = l10;
                }
                Message obtainMessage = this.N.obtainMessage();
                obtainMessage.what = 3;
                obtainMessage.obj = this;
                this.N.sendMessageDelayed(obtainMessage, (i10 == 0 ? 0L : i10 * 1000) + 300);
            }
            if (this.f14187ac == a.VIDEO) {
                MediaViewPlayerView mediaViewPlayerView = this.f14213x;
                if (mediaViewPlayerView == null) {
                    q();
                    return;
                }
                if (this.O != mediaViewPlayerView.getCampaign()) {
                    this.f14213x.release();
                    q();
                    if (getParent() != null) {
                        ((View) getParent()).invalidate();
                    }
                    requestLayout();
                }
            }
        } catch (Throwable th2) {
            ad.b(TAG, th2.getMessage());
        }
    }

    private String s() {
        try {
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
        if (this.O == null) {
            return null;
        }
        com.mbridge.msdk.videocommon.download.a aVar = this.f14186ab;
        if (aVar != null && aVar.k() == 5) {
            String h10 = this.f14186ab.h();
            if (new File(h10).exists() && (this.f14186ab.i() || this.f14186ab.j() == ai.a(new File(h10)))) {
                return h10;
            }
        }
        String videoUrlEncode = this.O.getVideoUrlEncode();
        if (an.b(videoUrlEncode)) {
            return videoUrlEncode;
        }
        return null;
    }

    private int t() {
        if (u() != null) {
            return u().p();
        }
        return 100;
    }

    private k u() {
        try {
            CampaignEx campaignEx = this.O;
            if (campaignEx != null && !an.a(campaignEx.getCampaignUnitId())) {
                String campaignUnitId = this.O.getCampaignUnitId();
                String k10 = com.mbridge.msdk.foundation.controller.c.m().k();
                if (!an.a(campaignUnitId) && !an.a(k10)) {
                    k d10 = h.a().d(k10, campaignUnitId);
                    return d10 != null ? d10 : k.d(campaignUnitId);
                }
                return k.d(campaignUnitId);
            }
            return null;
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
            return null;
        }
    }

    private boolean v() {
        k u;
        try {
            u = u();
        } catch (Throwable th2) {
            ad.b(TAG, th2.getMessage());
        }
        if (u == null) {
            return false;
        }
        int v10 = u.v();
        if (v10 == 1) {
            return ai.m(getContext());
        }
        if (v10 == 2) {
            return false;
        }
        return v10 == 3 ? ai.k(getContext()) : ai.m(getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View w() {
        try {
            this.f14193ai = new RelativeLayout(getContext());
            this.f14193ai.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            ImageView imageView = new ImageView(getContext());
            this.aj = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ai.a(getContext(), 30.0f), ai.a(getContext(), 30.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(10);
            layoutParams.topMargin = ai.a(getContext(), 8.0f);
            layoutParams.rightMargin = ai.a(getContext(), 8.0f);
            this.aj.setLayoutParams(layoutParams);
            this.aj.setBackgroundResource(v.a(getContext(), "mbridge_nativex_close", "drawable"));
            this.aj.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.17
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaseMBMediaView.this.exitFullScreen();
                }
            });
            this.C.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            this.f14193ai.addView(this.C);
            this.f14193ai.addView(this.aj);
            return this.f14193ai;
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        try {
            FrameLayout frameLayout = (FrameLayout) getRootView().findViewById(R.id.content);
            FrameLayout frameLayout2 = (FrameLayout) getRootView().findViewById(100);
            RelativeLayout relativeLayout = (RelativeLayout) getRootView().findViewById(101);
            RelativeLayout relativeLayout2 = (RelativeLayout) getRootView().findViewById(103);
            if (relativeLayout2 == null && relativeLayout != null) {
                relativeLayout2 = (RelativeLayout) relativeLayout.findViewById(103);
            }
            RelativeLayout relativeLayout3 = (RelativeLayout) getRootView().findViewById(v.a(getContext(), "mbridge_full_rl_playcontainer", "id"));
            if (relativeLayout3 == null && relativeLayout2 != null) {
                relativeLayout3 = (RelativeLayout) relativeLayout2.findViewById(v.a(getContext(), "mbridge_full_rl_playcontainer", "id"));
            }
            RelativeLayout relativeLayout4 = (RelativeLayout) getRootView().findViewById(v.a(getContext(), "mbridge_full_player_parent", "id"));
            if (relativeLayout4 == null && relativeLayout3 != null) {
                relativeLayout4 = (RelativeLayout) relativeLayout3.findViewById(v.a(getContext(), "mbridge_full_player_parent", "id"));
            }
            ProgressBar progressBar = (ProgressBar) getRootView().findViewById(v.a(getContext(), "mbridge_full_pb_loading", "id"));
            RelativeLayout relativeLayout5 = (RelativeLayout) getRootView().findViewById(v.a(getContext(), "mbridge_full_rl_install", "id"));
            LinearLayout linearLayout = (LinearLayout) getRootView().findViewById(v.a(getContext(), "mbridge_full_ll_pro_dur", "id"));
            ViewGroup viewGroup = frameLayout2 != null ? (ViewGroup) frameLayout2.getParent() : null;
            if (relativeLayout2 != null) {
                relativeLayout2.removeView(linearLayout);
            } else if (linearLayout != null && linearLayout.getParent() != null) {
                ((ViewGroup) linearLayout.getParent()).removeView(linearLayout);
            }
            RelativeLayout relativeLayout6 = this.f14193ai;
            if (relativeLayout6 != null) {
                if (relativeLayout2 != null) {
                    relativeLayout2.removeView(relativeLayout6);
                } else if (relativeLayout6.getParent() != null) {
                    ((ViewGroup) this.f14193ai.getParent()).removeView(this.f14193ai);
                }
                this.C.setBackListener(null);
                this.C.setObject(null);
                this.C = null;
                this.f14193ai = null;
            }
            if (relativeLayout2 != null) {
                relativeLayout2.removeView(relativeLayout5);
            } else if (relativeLayout5 != null && relativeLayout5.getParent() != null) {
                ((ViewGroup) relativeLayout5.getParent()).removeView(relativeLayout5);
            }
            if (relativeLayout2 != null) {
                relativeLayout2.removeView(progressBar);
            } else if (progressBar != null && progressBar.getParent() != null) {
                ((ViewGroup) progressBar.getParent()).removeView(progressBar);
            }
            if (relativeLayout4 != null) {
                relativeLayout4.removeView(this.f14213x);
            }
            if (relativeLayout3 != null) {
                relativeLayout3.removeView(relativeLayout4);
            } else if (relativeLayout4 != null && relativeLayout4.getParent() != null) {
                ((ViewGroup) relativeLayout4.getParent()).removeView(relativeLayout4);
            }
            if (relativeLayout2 != null) {
                relativeLayout2.removeView(relativeLayout3);
            } else if (relativeLayout3 != null && relativeLayout3.getParent() != null) {
                ((ViewGroup) relativeLayout3.getParent()).removeView(relativeLayout3);
            } else {
                BaseView baseView = this.G;
                if (baseView != null) {
                    baseView.removeView(this.H);
                }
            }
            if (relativeLayout != null) {
                relativeLayout.removeView(relativeLayout2);
            } else if (relativeLayout2 != null && relativeLayout2.getParent() != null) {
                ((ViewGroup) relativeLayout2.getParent()).removeView(relativeLayout2);
            } else {
                View view = this.F;
                if (view != null) {
                    ((ViewGroup) view).removeView(this.G);
                    ((ViewGroup) this.F.getParent()).removeView(this.F);
                }
            }
            if (frameLayout != null) {
                if (relativeLayout != null) {
                    frameLayout.removeView(relativeLayout);
                } else {
                    frameLayout.removeView(this.F);
                    if (this.F.getParent() != null) {
                        ((ViewGroup) this.F.getParent()).removeView(this.F);
                        this.F.setVisibility(8);
                    }
                }
            }
            setVisibility(0);
            requestLayout();
            if (viewGroup != null) {
                if (this.f14213x.getParent() != null && this.f14213x.getParent() != viewGroup) {
                    ((ViewGroup) this.f14213x.getParent()).removeView(this.f14213x);
                }
                viewGroup.addView(this.f14213x, this.M);
                viewGroup.removeView(frameLayout2);
                viewGroup.invalidate();
            }
            j();
            this.f14201i = false;
            MediaViewPlayerView mediaViewPlayerView = this.f14213x;
            if (mediaViewPlayerView != null) {
                mediaViewPlayerView.setExitFullScreen();
                if (this.f14199g) {
                    this.f14213x.openSound();
                } else {
                    this.f14213x.closeSound();
                }
                this.f14213x.gonePauseView();
            }
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
    }

    private boolean y() {
        try {
            this.H = this.G.getMBridgeFullPlayContainer();
            this.L = this.G.getMBridgeFullPlayerParent();
            this.I = this.G.getMBridgeFullClose();
            this.J = this.G.getMBridgeFullTvInstall();
            this.K = this.G.getMBridgeFullPb();
            return true;
        } catch (Throwable th2) {
            ad.b(TAG, th2.getMessage());
            return false;
        }
    }

    private void z() {
        try {
            this.f14202j = ai.h(getContext()) >= ai.g(getContext());
            this.f14203k = this.f14202j;
        } catch (Throwable th2) {
            ad.b(TAG, th2.getMessage());
        }
    }

    public void setOnMediaViewListener(OnMBMediaViewListenerPlus onMBMediaViewListenerPlus) {
        this.f14189ae = onMBMediaViewListenerPlus;
    }

    private void b() {
        com.mbridge.msdk.videocommon.download.a aVar = this.f14186ab;
        if (aVar != null) {
            aVar.b((com.mbridge.msdk.videocommon.listener.a) null);
        }
    }

    private void c() {
        int a10 = v.a(getContext(), "mbridge_nativex_mbmediaview", TtmlNode.TAG_LAYOUT);
        if (a10 == -1) {
            ad.b(TAG, "can not find mediaview resource");
            return;
        }
        View inflate = LayoutInflater.from(getContext()).inflate(a10, (ViewGroup) null);
        this.f14215z = (RelativeLayout) inflate.findViewById(v.a(getContext(), "mbridge_rl_mediaview_root", "id"));
        this.f14214y = (RelativeLayout) inflate.findViewById(v.a(getContext(), "mbridge_ll_playerview_container", "id"));
        this.D = (MyImageView) inflate.findViewById(v.a(getContext(), "mbridge_my_big_img", "id"));
        this.E = (ProgressBar) inflate.findViewById(v.a(getContext(), "mbridge_native_pb", "id"));
        this.A = (RelativeLayout) inflate.findViewById(v.a(getContext(), "mbridge_nativex_webview_layout", "id"));
        this.B = (WindVaneWebViewForNV) inflate.findViewById(v.a(getContext(), "mbridge_nativex_webview_layout_webview", "id"));
        this.f14215z.setClickable(true);
        addView(inflate, -1, -1);
    }

    public static /* synthetic */ void d(BaseMBMediaView baseMBMediaView) {
        CampaignEx.b mediaViewHolder;
        CampaignEx campaignEx = baseMBMediaView.O;
        if (campaignEx == null || (mediaViewHolder = campaignEx.getMediaViewHolder()) == null || mediaViewHolder.f13157k || baseMBMediaView.O.getNativeVideoTracking() == null || baseMBMediaView.O.getNativeVideoTracking().t() == null) {
            return;
        }
        mediaViewHolder.f13157k = true;
        Context context = baseMBMediaView.getContext();
        CampaignEx campaignEx2 = baseMBMediaView.O;
        com.mbridge.msdk.click.a.a(context, campaignEx2, campaignEx2.getCampaignUnitId(), baseMBMediaView.O.getNativeVideoTracking().t(), false, false);
    }

    public static /* synthetic */ void p(BaseMBMediaView baseMBMediaView) {
        try {
            ProgressBar progressBar = baseMBMediaView.K;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
    }

    public final void b(String str) {
        try {
            if (TextUtils.isEmpty(str) || this.f14207o.contains(str)) {
                return;
            }
            this.f14207o.add(str);
            OnMBMediaViewListenerPlus onMBMediaViewListenerPlus = this.f14189ae;
            if (onMBMediaViewListenerPlus != null) {
                onMBMediaViewListenerPlus.onVideoComplete();
            }
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
    }

    public static /* synthetic */ void m(BaseMBMediaView baseMBMediaView) {
        try {
            ProgressBar progressBar = baseMBMediaView.E;
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
    }

    private void a(Context context) {
        try {
            d();
            c();
            this.am = context;
        } catch (Throwable th2) {
            ad.b(TAG, th2.getMessage());
        }
    }

    public static /* synthetic */ void n(BaseMBMediaView baseMBMediaView) {
        try {
            ProgressBar progressBar = baseMBMediaView.K;
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
    }

    private void b(View view) {
        if (view == null) {
            return;
        }
        try {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
            layoutParams.width = -1;
            if (this.f14202j) {
                layoutParams.height = -1;
            } else {
                layoutParams.height = (((int) B()) * 9) / 16;
                layoutParams.addRule(13);
            }
            view.setLayoutParams(layoutParams);
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
    }

    public static /* synthetic */ void o(BaseMBMediaView baseMBMediaView) {
        try {
            ProgressBar progressBar = baseMBMediaView.E;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
    }

    public final void a(String str) {
        try {
            if (TextUtils.isEmpty(str) || this.f14206n.contains(str)) {
                return;
            }
            this.f14206n.add(str);
            OnMBMediaViewListener onMBMediaViewListener = this.f14188ad;
            if (onMBMediaViewListener != null) {
                onMBMediaViewListener.onVideoStart();
            }
            OnMBMediaViewListenerPlus onMBMediaViewListenerPlus = this.f14189ae;
            if (onMBMediaViewListenerPlus != null) {
                onMBMediaViewListenerPlus.onVideoStart();
            }
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
    }

    private boolean c(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    public static /* synthetic */ void c(BaseMBMediaView baseMBMediaView, Campaign campaign, String str) {
        try {
            OnMBMediaViewListener onMBMediaViewListener = baseMBMediaView.f14188ad;
            if (onMBMediaViewListener != null) {
                onMBMediaViewListener.onFinishRedirection(campaign, str);
            }
            OnMBMediaViewListenerPlus onMBMediaViewListenerPlus = baseMBMediaView.f14189ae;
            if (onMBMediaViewListenerPlus != null) {
                onMBMediaViewListenerPlus.onFinishRedirection(campaign, str);
            }
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
    }

    public static /* synthetic */ void h(BaseMBMediaView baseMBMediaView) {
        try {
            MediaViewPlayerView mediaViewPlayerView = baseMBMediaView.f14213x;
            if (mediaViewPlayerView == null) {
                return;
            }
            mediaViewPlayerView.onClickPlayerView();
        } catch (Throwable th2) {
            ad.b(TAG, th2.getMessage());
        }
    }

    private a a(boolean z10) {
        try {
            CampaignEx campaignEx = this.O;
            if (campaignEx == null) {
                return null;
            }
            if (an.a(campaignEx.getVideoUrlEncode())) {
                a aVar = an.b(this.O.getImageUrl()) ? a.BIG_IMAGE : null;
                if (!an.b(this.O.getGifUrl())) {
                    return aVar;
                }
                if (an.a(this.O.getImageUrl())) {
                    aVar = a.GIF;
                }
                this.B.setWebViewClient(new g(this));
                o();
                return aVar;
            }
            if (this.f14200h && this.f14186ab != null) {
                if (an.b(this.O.getVideoUrlEncode()) && an.a(this.O.getImageUrl())) {
                    return a.VIDEO;
                }
                if (!an.b(this.O.getVideoUrlEncode()) || !an.b(this.O.getImageUrl())) {
                    return null;
                }
                if (j.a(this.f14186ab, t())) {
                    return a.VIDEO;
                }
                a aVar2 = a.BIG_IMAGE;
                if (z10 && this.f14194b) {
                    this.f14186ab.b(new f(this));
                }
                return aVar2;
            }
            return a.BIG_IMAGE;
        } catch (Throwable th2) {
            ad.b(TAG, th2.getMessage());
            return a.BIG_IMAGE;
        }
    }

    private void b(boolean z10) {
        try {
            int nvT2 = this.O.getNvT2();
            if (this.C == null) {
                WindVaneWebViewForNV windVaneWebViewForNV = new WindVaneWebViewForNV(getContext());
                this.C = windVaneWebViewForNV;
                windVaneWebViewForNV.setObject(this);
                this.C.setBackListener(new com.mbridge.msdk.nativex.listener.b() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.6
                    @Override // com.mbridge.msdk.nativex.listener.b
                    public final void a() {
                        BaseMBMediaView.this.exitFullScreen();
                    }
                });
                this.C.setWebViewListener(new com.mbridge.msdk.mbsignalcommon.b.b() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.7
                    @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
                    public final void a(WebView webView, String str) {
                        super.a(webView, str);
                        BaseMBMediaView.this.f14191ag = true;
                    }

                    @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
                    public final void a(WebView webView, int i10, String str, String str2) {
                        super.a(webView, i10, str, str2);
                        BaseMBMediaView.this.f14191ag = false;
                    }
                });
            }
            if (nvT2 != 3) {
                if (nvT2 == 4) {
                    this.f14192ah = true;
                    CampaignEx campaignEx = this.O;
                    if (campaignEx != null) {
                        com.mbridge.msdk.foundation.same.g.a aVar = new com.mbridge.msdk.foundation.same.g.a(campaignEx);
                        aVar.a(this.O.getAppName());
                        this.C.setDownloadListener(aVar);
                        this.C.setFilter(new d());
                        return;
                    }
                    return;
                }
                return;
            }
            String str = this.O.getendcard_url();
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.O.getMediaViewHolder();
            if (str.contains(".zip") && str.contains(ResourceManager.KEY_MD5FILENAME)) {
                String h5ResAddress = H5DownLoadManager.getInstance().getH5ResAddress(str);
                if (an.b(h5ResAddress)) {
                    this.f14192ah = true;
                    this.C.loadUrl(h5ResAddress);
                    return;
                }
                return;
            }
            String htmlContentFromUrl = HTMLResourceManager.getInstance().getHtmlContentFromUrl(str);
            if (an.b(htmlContentFromUrl)) {
                ad.a(TAG, "load html...");
                this.f14192ah = true;
                this.C.loadDataWithBaseURL(str, htmlContentFromUrl, "text/html", "UTF-8", null);
            }
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
    }

    public BaseMBMediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14194b = true;
        this.f14195c = true;
        this.f14196d = true;
        this.f14197e = true;
        this.f14198f = true;
        this.f14199g = false;
        this.f14200h = true;
        this.f14201i = false;
        this.f14202j = false;
        this.f14203k = false;
        this.f14204l = true;
        this.f14205m = true;
        this.f14206n = new ArrayList<>();
        this.f14207o = new ArrayList<>();
        this.f14208r = false;
        this.f14209s = false;
        this.f14210t = null;
        this.u = null;
        this.f14211v = null;
        this.f14212w = 0;
        this.a = false;
        this.f14186ab = null;
        this.f14187ac = null;
        this.f14191ag = false;
        this.f14192ah = false;
        this.al = false;
        this.an = false;
        this.ao = new Runnable() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.9
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (!BaseMBMediaView.this.f14201i) {
                        BaseMBMediaView baseMBMediaView = BaseMBMediaView.this;
                        if (!baseMBMediaView.a((View) baseMBMediaView)) {
                            BaseMBMediaView.R(BaseMBMediaView.this);
                        } else {
                            BaseMBMediaView.S(BaseMBMediaView.this);
                        }
                    }
                    BaseMBMediaView.this.N.postDelayed(this, 300L);
                } catch (Exception e2) {
                    ad.b(BaseMBMediaView.TAG, e2.getMessage());
                }
            }
        };
        a(context);
    }

    public static /* synthetic */ void q(BaseMBMediaView baseMBMediaView) {
        CampaignEx campaignEx = baseMBMediaView.O;
        if (campaignEx == null || campaignEx.getMediaViewHolder() == null || baseMBMediaView.O.getMediaViewHolder().f13150d || TextUtils.isEmpty(baseMBMediaView.O.getCampaignUnitId()) || baseMBMediaView.O.getNativeVideoTracking() == null || baseMBMediaView.O.getNativeVideoTracking().o() == null) {
            return;
        }
        baseMBMediaView.O.getMediaViewHolder().f13150d = true;
        Context context = baseMBMediaView.getContext();
        CampaignEx campaignEx2 = baseMBMediaView.O;
        com.mbridge.msdk.click.a.a(context, campaignEx2, campaignEx2.getCampaignUnitId(), baseMBMediaView.O.getNativeVideoTracking().o(), false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(View view) {
        try {
            return !aq.a(view, this.O == null ? 0 : r1.getImpReportType());
        } catch (Throwable th2) {
            ad.b(TAG, th2.getMessage());
            return false;
        }
    }

    public final void a() {
        WindowInsets rootWindowInsets;
        BitmapDrawable a10;
        CampaignEx campaignEx;
        try {
            if (getRootView() != null && (getRootView() instanceof ViewGroup)) {
                BaseView.a handleViewStyleResult = handleViewStyleResult(getContext());
                if (handleViewStyleResult == null) {
                    return;
                }
                BaseView fullScreenViewByStyle = getFullScreenViewByStyle(getContext(), handleViewStyleResult);
                this.G = fullScreenViewByStyle;
                if (fullScreenViewByStyle != null && y()) {
                    com.mbridge.msdk.nativex.view.mbfullview.a a11 = com.mbridge.msdk.nativex.view.mbfullview.a.a(getContext());
                    BaseView baseView = this.G;
                    a11.a(baseView.style, this.O, baseView);
                    this.f14201i = true;
                    this.f14209s = false;
                    MediaViewPlayerView mediaViewPlayerView = this.f14213x;
                    if (mediaViewPlayerView != null) {
                        mediaViewPlayerView.setEnterFullScreen();
                        this.f14213x.setIsActivePause(false);
                    }
                    try {
                        OnMBMediaViewListener onMBMediaViewListener = this.f14188ad;
                        if (onMBMediaViewListener != null) {
                            onMBMediaViewListener.onEnterFullscreen();
                        }
                        OnMBMediaViewListenerPlus onMBMediaViewListenerPlus = this.f14189ae;
                        if (onMBMediaViewListenerPlus != null) {
                            onMBMediaViewListenerPlus.onEnterFullscreen();
                        }
                        ld.b bVar = this.f14211v;
                        if (bVar != null) {
                            ld.c cVar = ld.c.FULLSCREEN;
                            i iVar = bVar.a;
                            com.facebook.internal.i.d(iVar);
                            JSONObject jSONObject = new JSONObject();
                            qd.c.b(jSONObject, "state", cVar);
                            iVar.f20672e.a("playerStateChange", jSONObject);
                        }
                    } catch (Exception e2) {
                        ad.b(TAG, e2.getMessage());
                    }
                    FrameLayout frameLayout = (FrameLayout) getRootView().findViewById(R.id.content);
                    RelativeLayout relativeLayout = new RelativeLayout(getContext());
                    this.F = relativeLayout;
                    relativeLayout.setClickable(true);
                    ViewGroup viewGroup = (ViewGroup) this.f14213x.getParent();
                    int childCount = viewGroup.getChildCount();
                    int i10 = 0;
                    while (i10 < childCount && viewGroup.getChildAt(i10) != this.f14213x) {
                        i10++;
                    }
                    this.M = i10;
                    FrameLayout frameLayout2 = new FrameLayout(getContext());
                    frameLayout2.setId(100);
                    viewGroup.addView(frameLayout2, i10, new ViewGroup.LayoutParams(getWidth(), getHeight()));
                    viewGroup.removeView(this.f14213x);
                    ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    relativeLayout.setId(101);
                    new RelativeLayout.LayoutParams(-1, -1);
                    this.L.addView(this.f14213x, new RelativeLayout.LayoutParams(-1, -1));
                    if (this.L != null && (campaignEx = this.O) != null && campaignEx.getPrivacyButtonTemplateVisibility() != 0) {
                        try {
                            MBAdChoice mBAdChoice = new MBAdChoice(com.mbridge.msdk.foundation.controller.c.m().c());
                            mBAdChoice.setCampaign(this.O);
                            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 12.0f), ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 12.0f));
                            layoutParams2.addRule(11);
                            layoutParams2.addRule(12);
                            this.L.addView(mBAdChoice, layoutParams2);
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                    if (this.a && frameLayout != null && (a10 = com.mbridge.msdk.foundation.controller.c.m().a(p(), this.O.getAdType())) != null) {
                        ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.m().c());
                        ai.a(imageView, a10, getResources().getDisplayMetrics());
                        this.G.addView(imageView, new RelativeLayout.LayoutParams(-1, -1));
                    }
                    frameLayout.addView(relativeLayout, layoutParams);
                    int i11 = AnonymousClass10.a[this.G.style.ordinal()] != 2 ? ViewCompat.MEASURED_STATE_MASK : -1;
                    int i12 = this.f14212w;
                    if (i12 != 0) {
                        relativeLayout.setBackgroundColor(i12);
                    } else {
                        relativeLayout.setBackgroundColor(i11);
                    }
                    this.G.setId(103);
                    RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
                    int[] iArr = new int[2];
                    frameLayout.getLocationInWindow(iArr);
                    int i13 = iArr[1];
                    this.f14190af = i13;
                    if (i13 == 0 && (rootWindowInsets = getRootWindowInsets()) != null) {
                        layoutParams3.setMargins(0, rootWindowInsets.getStableInsetTop(), 0, 0);
                    }
                    relativeLayout.addView(this.G, layoutParams3);
                    try {
                        z();
                        a(this.H, B(), C());
                        com.mbridge.msdk.nativex.view.mbfullview.a.a(getContext()).a(this.G, this.f14202j);
                        if (this.f14202j) {
                            E();
                        } else {
                            D();
                        }
                        this.N.postDelayed(new Runnable() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.5
                            @Override // java.lang.Runnable
                            public final void run() {
                                BaseMBMediaView.this.f14209s = true;
                                if (BaseMBMediaView.this.f14201i) {
                                    TextView unused = BaseMBMediaView.this.J;
                                }
                            }
                        }, 3000L);
                    } catch (Throwable th2) {
                        ad.b(TAG, th2.getMessage());
                    }
                    try {
                        this.F.setFocusableInTouchMode(true);
                        this.F.requestFocus();
                        this.F.setOnKeyListener(new View.OnKeyListener() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.18
                            @Override // android.view.View.OnKeyListener
                            public final boolean onKey(View view, int i14, KeyEvent keyEvent) {
                                try {
                                    if (keyEvent.getKeyCode() == 4) {
                                        BaseMBMediaView.this.x();
                                        return true;
                                    }
                                    return false;
                                } catch (Throwable th3) {
                                    ad.b(BaseMBMediaView.TAG, th3.getMessage());
                                    return false;
                                }
                            }
                        });
                        this.F.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.2
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                BaseMBMediaView.h(BaseMBMediaView.this);
                            }
                        });
                        this.I.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.3
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                BaseMBMediaView.this.x();
                            }
                        });
                        this.J.setOnClickListener(new com.mbridge.msdk.widget.a() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.4
                            @Override // com.mbridge.msdk.widget.a
                            public final void a(View view) {
                                try {
                                    BaseMBMediaView.this.b(view.getContext());
                                    if (BaseMBMediaView.this.f14211v != null) {
                                        try {
                                            BaseMBMediaView.this.f14211v.a();
                                            ad.a("omsdk", "bmnv adUserInteraction click");
                                        } catch (Exception e11) {
                                            ad.b("omsdk", e11.getMessage());
                                        }
                                    }
                                } catch (Exception e12) {
                                    ad.b(BaseMBMediaView.TAG, e12.getMessage());
                                }
                            }
                        });
                    } catch (Exception e11) {
                        ad.b(TAG, e11.getMessage());
                    }
                    MediaViewPlayerView mediaViewPlayerView2 = this.f14213x;
                    if (mediaViewPlayerView2 != null) {
                        mediaViewPlayerView2.openSound();
                        MediaViewPlayerView mediaViewPlayerView3 = this.f14213x;
                        mediaViewPlayerView3.setMediaViewPlayListener(new MediaViewPlayerView.a(mediaViewPlayerView3) { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.16
                            @Override // com.mbridge.msdk.nativex.view.MediaViewPlayerView.a
                            public final void a() {
                                int nvT2 = BaseMBMediaView.this.O.getNvT2();
                                if (BaseMBMediaView.this.f14201i && (nvT2 == 3 || nvT2 == 4)) {
                                    WindVaneWebViewForNV G = BaseMBMediaView.this.G();
                                    if (G != null) {
                                        View w10 = BaseMBMediaView.this.w();
                                        if (w10 == null) {
                                            super.a();
                                            return;
                                        }
                                        if (nvT2 == 3 && BaseMBMediaView.this.f14191ag) {
                                            com.mbridge.msdk.nativex.view.mbfullview.a.a(BaseMBMediaView.this.getContext()).a(w10, BaseMBMediaView.this.G);
                                            Context context = BaseMBMediaView.this.getContext();
                                            CampaignEx campaignEx2 = BaseMBMediaView.this.O;
                                            String campaignUnitId = BaseMBMediaView.this.O.getCampaignUnitId();
                                            if (campaignEx2 != null) {
                                                try {
                                                    if (campaignEx2.getNativeVideoTracking() != null && campaignEx2.getNativeVideoTracking().r() != null) {
                                                        for (String str : campaignEx2.getNativeVideoTracking().r()) {
                                                            if (!TextUtils.isEmpty(str)) {
                                                                com.mbridge.msdk.click.a.a(context, campaignEx2, campaignUnitId, str, false, true);
                                                            }
                                                        }
                                                    }
                                                } catch (Exception e12) {
                                                    e12.printStackTrace();
                                                }
                                            }
                                        } else if (nvT2 == 4) {
                                            com.mbridge.msdk.nativex.view.mbfullview.a.a(BaseMBMediaView.this.getContext()).a(w10, BaseMBMediaView.this.G);
                                            String clickURL = BaseMBMediaView.this.O.getClickURL();
                                            if (!TextUtils.isEmpty(clickURL)) {
                                                com.mbridge.msdk.click.a.a(BaseMBMediaView.this.getContext(), BaseMBMediaView.this.O, BaseMBMediaView.this.p(), BaseMBMediaView.this.getAddNVT2ToNoticeURL(), true, false, com.mbridge.msdk.click.a.a.f12482i);
                                                BaseMBMediaView.this.C.loadUrl(clickURL);
                                            }
                                        } else {
                                            super.a();
                                            return;
                                        }
                                        G.webViewShow(BaseMBMediaView.this.O, BaseMBMediaView.this.p());
                                        G.orientation(BaseMBMediaView.this.f14202j);
                                        return;
                                    }
                                    super.a();
                                    return;
                                }
                                super.a();
                            }
                        });
                    }
                    b(false);
                    CampaignEx campaignEx2 = this.O;
                    if (campaignEx2 == null || campaignEx2.getMediaViewHolder() == null || this.O.getMediaViewHolder().f13151e || TextUtils.isEmpty(this.O.getCampaignUnitId()) || this.O.getNativeVideoTracking() == null || this.O.getNativeVideoTracking().c() == null) {
                        return;
                    }
                    this.O.getMediaViewHolder().f13151e = true;
                    F();
                    return;
                }
                return;
            }
            ad.c(TAG, "rootView is null");
        } catch (Exception e12) {
            ad.b(TAG, e12.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context) {
        try {
            try {
                OnMBMediaViewListener onMBMediaViewListener = this.f14188ad;
                if (onMBMediaViewListener != null) {
                    onMBMediaViewListener.onVideoAdClicked(this.O);
                }
                OnMBMediaViewListenerPlus onMBMediaViewListenerPlus = this.f14189ae;
                if (onMBMediaViewListenerPlus != null) {
                    onMBMediaViewListenerPlus.onVideoAdClicked(this.O);
                }
            } catch (Exception e2) {
                ad.b(TAG, e2.getMessage());
            }
            if (this.O != null && !an.a(p())) {
                if (!this.O.isReportClick()) {
                    this.O.setReportClick(true);
                    CampaignEx campaignEx = this.O;
                    if (campaignEx != null && campaignEx.getNativeVideoTracking() != null && this.O.getNativeVideoTracking().l() != null) {
                        Context context2 = getContext();
                        CampaignEx campaignEx2 = this.O;
                        com.mbridge.msdk.click.a.a(context2, campaignEx2, campaignEx2.getCampaignUnitId(), this.O.getNativeVideoTracking().l(), false, false);
                    }
                }
                com.mbridge.msdk.click.a aVar = new com.mbridge.msdk.click.a(getContext(), p());
                aVar.a(new NativeListener.NativeTrackingListener() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.14
                    @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
                    public final void onDismissLoading(Campaign campaign) {
                    }

                    @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
                    public final void onDownloadFinish(Campaign campaign) {
                    }

                    @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
                    public final void onDownloadProgress(int i10) {
                    }

                    @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
                    public final void onDownloadStart(Campaign campaign) {
                    }

                    @Override // com.mbridge.msdk.out.BaseTrackingListener
                    public final void onFinishRedirection(Campaign campaign, String str) {
                        try {
                            BaseMBMediaView.o(BaseMBMediaView.this);
                            BaseMBMediaView.p(BaseMBMediaView.this);
                            BaseMBMediaView.c(BaseMBMediaView.this, campaign, str);
                        } catch (Exception e10) {
                            ad.b(BaseMBMediaView.TAG, e10.getMessage());
                        }
                    }

                    @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
                    public final boolean onInterceptDefaultLoadingDialog() {
                        return true;
                    }

                    @Override // com.mbridge.msdk.out.BaseTrackingListener
                    public final void onRedirectionFailed(Campaign campaign, String str) {
                        try {
                            BaseMBMediaView.o(BaseMBMediaView.this);
                            BaseMBMediaView.p(BaseMBMediaView.this);
                            BaseMBMediaView.b(BaseMBMediaView.this, campaign, str);
                        } catch (Exception e10) {
                            ad.b(BaseMBMediaView.TAG, e10.getMessage());
                        }
                    }

                    @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
                    public final void onShowLoading(Campaign campaign) {
                    }

                    @Override // com.mbridge.msdk.out.BaseTrackingListener
                    public final void onStartRedirection(Campaign campaign, String str) {
                        try {
                            BaseMBMediaView.m(BaseMBMediaView.this);
                            BaseMBMediaView.n(BaseMBMediaView.this);
                            BaseMBMediaView.a(BaseMBMediaView.this, campaign, str);
                        } catch (Exception e10) {
                            ad.b(BaseMBMediaView.TAG, e10.getMessage());
                        }
                    }
                });
                aVar.a(this.O);
            }
        } catch (Exception e10) {
            ad.b(TAG, e10.getMessage());
        }
    }

    public static /* synthetic */ void b(BaseMBMediaView baseMBMediaView) {
        CampaignEx campaignEx = baseMBMediaView.O;
        if (campaignEx == null || campaignEx.getMediaViewHolder() == null) {
            return;
        }
        com.mbridge.msdk.foundation.controller.c.m().a(baseMBMediaView.getContext());
        com.mbridge.msdk.mbnative.e.b.a(baseMBMediaView.O, baseMBMediaView.getContext(), baseMBMediaView.p(), null);
        CampaignEx.b mediaViewHolder = baseMBMediaView.O.getMediaViewHolder();
        if (!mediaViewHolder.f13158l && baseMBMediaView.f14187ac == a.VIDEO && an.b(baseMBMediaView.O.getImpressionURL())) {
            mediaViewHolder.f13158l = true;
            String impressionURL = baseMBMediaView.O.getImpressionURL();
            if (!impressionURL.contains("is_video=1")) {
                StringBuilder sb2 = new StringBuilder(impressionURL);
                if (impressionURL.contains("?")) {
                    sb2.append("&is_video=1");
                } else {
                    sb2.append("?is_video=1");
                }
                impressionURL = sb2.toString();
            }
            Context context = baseMBMediaView.getContext();
            CampaignEx campaignEx2 = baseMBMediaView.O;
            com.mbridge.msdk.click.a.a(context, campaignEx2, campaignEx2.getCampaignUnitId(), impressionURL, false, true, com.mbridge.msdk.click.a.a.f12480g);
        }
    }

    public static /* synthetic */ void b(BaseMBMediaView baseMBMediaView, Campaign campaign, String str) {
        try {
            OnMBMediaViewListener onMBMediaViewListener = baseMBMediaView.f14188ad;
            if (onMBMediaViewListener != null) {
                onMBMediaViewListener.onRedirectionFailed(campaign, str);
            }
            OnMBMediaViewListenerPlus onMBMediaViewListenerPlus = baseMBMediaView.f14189ae;
            if (onMBMediaViewListenerPlus != null) {
                onMBMediaViewListenerPlus.onRedirectionFailed(campaign, str);
            }
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
    }

    private void a(View view, float f10, float f11) {
        if (view == null) {
            return;
        }
        try {
            double d10 = this.R;
            double d11 = 0.0d;
            if (d10 > 0.0d) {
                double d12 = this.S;
                if (d12 > 0.0d) {
                    double d13 = d10 / d12;
                    if (f10 > 0.0f && f11 > 0.0f) {
                        d11 = f10 / f11;
                    }
                    double a10 = ai.a(Double.valueOf(d13));
                    double a11 = ai.a(Double.valueOf(d11));
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f14214y.getLayoutParams();
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) view.getLayoutParams();
                    boolean z10 = c(getContext()) && this.f14202j;
                    int i10 = -1;
                    if (a10 > a11) {
                        double d14 = (f10 * this.S) / this.R;
                        layoutParams2.width = -1;
                        if (!z10) {
                            i10 = (int) d14;
                        }
                        layoutParams2.height = i10;
                        layoutParams2.addRule(13);
                        layoutParams.width = this.Q;
                        layoutParams.height = (int) d14;
                        layoutParams.addRule(13);
                    } else if (a10 < a11) {
                        double d15 = f11 * d13;
                        layoutParams2.width = z10 ? -1 : (int) d15;
                        layoutParams2.height = -1;
                        layoutParams2.addRule(13);
                        layoutParams.width = (int) d15;
                        layoutParams.height = this.P;
                        layoutParams.addRule(13);
                    } else {
                        layoutParams2.width = -1;
                        layoutParams2.height = -1;
                        layoutParams.width = this.Q;
                        layoutParams.height = this.P;
                        layoutParams.addRule(13);
                    }
                    if (!this.f14201i) {
                        this.f14214y.setLayoutParams(layoutParams);
                    }
                    view.setLayoutParams(layoutParams2);
                    return;
                }
            }
            b(view);
        } catch (Throwable th2) {
            ad.b(TAG, th2.getMessage());
        }
    }

    private String a(int i10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i10);
            String jSONObject2 = jSONObject.toString();
            return !TextUtils.isEmpty(jSONObject2) ? Base64.encodeToString(jSONObject2.getBytes(), 2) : "";
        } catch (Throwable unused) {
            ad.b(TAG, "code to string is error");
            return "";
        }
    }

    private String a(List<CampaignEx> list, String str, String str2) {
        if (list == null) {
            return null;
        }
        try {
            if (list.size() <= 0) {
                return null;
            }
            JSONArray parseCamplistToJson = CampaignEx.parseCamplistToJson(list);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("campaignList", parseCamplistToJson);
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            jSONObject.put("sdk_info", str2);
            return jSONObject.toString();
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
            return null;
        }
    }

    public static /* synthetic */ void a(BaseMBMediaView baseMBMediaView, Campaign campaign, String str) {
        try {
            OnMBMediaViewListener onMBMediaViewListener = baseMBMediaView.f14188ad;
            if (onMBMediaViewListener != null) {
                onMBMediaViewListener.onStartRedirection(campaign, str);
            }
            OnMBMediaViewListenerPlus onMBMediaViewListenerPlus = baseMBMediaView.f14189ae;
            if (onMBMediaViewListenerPlus != null) {
                onMBMediaViewListenerPlus.onStartRedirection(campaign, str);
            }
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
    }

    public static /* synthetic */ void a(BaseMBMediaView baseMBMediaView, String str) {
        n nVar;
        try {
            o a10 = o.a(com.mbridge.msdk.foundation.db.g.a(baseMBMediaView.getContext()));
            if (!TextUtils.isEmpty(baseMBMediaView.O.getNoticeUrl())) {
                int l10 = z.l(baseMBMediaView.getContext());
                nVar = new n("2000021", l10, baseMBMediaView.O.getNoticeUrl(), str, z.a(baseMBMediaView.getContext(), l10));
            } else if (TextUtils.isEmpty(baseMBMediaView.O.getClickURL())) {
                nVar = null;
            } else {
                int l11 = z.l(baseMBMediaView.getContext());
                nVar = new n("2000021", l11, baseMBMediaView.O.getClickURL(), str, z.a(baseMBMediaView.getContext(), l11));
            }
            if (nVar != null) {
                nVar.e(baseMBMediaView.O.getId());
                nVar.m(baseMBMediaView.O.getVideoUrlEncode());
                nVar.h(str);
                nVar.f(baseMBMediaView.O.getRequestId());
                nVar.g(baseMBMediaView.O.getRequestIdNotice());
                nVar.c(baseMBMediaView.p());
                a10.a(nVar);
            }
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
    }
}

package com.mbridge.msdk.nativex.view;

import O5.k;
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
import androidx.core.view.ViewCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.h;
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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
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
    private static int f16713p = 2;

    /* renamed from: q, reason: collision with root package name */
    private static int f16714q = 1;

    /* renamed from: A, reason: collision with root package name */
    private RelativeLayout f16715A;

    /* renamed from: B, reason: collision with root package name */
    private WindVaneWebViewForNV f16716B;

    /* renamed from: C, reason: collision with root package name */
    private WindVaneWebViewForNV f16717C;

    /* renamed from: D, reason: collision with root package name */
    private MyImageView f16718D;

    /* renamed from: E, reason: collision with root package name */
    private ProgressBar f16719E;

    /* renamed from: F, reason: collision with root package name */
    private View f16720F;

    /* renamed from: G, reason: collision with root package name */
    private BaseView f16721G;

    /* renamed from: H, reason: collision with root package name */
    private RelativeLayout f16722H;

    /* renamed from: I, reason: collision with root package name */
    private RelativeLayout f16723I;

    /* renamed from: J, reason: collision with root package name */
    private TextView f16724J;

    /* renamed from: K, reason: collision with root package name */
    private ProgressBar f16725K;

    /* renamed from: L, reason: collision with root package name */
    private RelativeLayout f16726L;

    /* renamed from: M, reason: collision with root package name */
    private int f16727M;

    /* renamed from: N, reason: collision with root package name */
    private Handler f16728N;
    private CampaignEx O;

    /* renamed from: P, reason: collision with root package name */
    private int f16729P;

    /* renamed from: Q, reason: collision with root package name */
    private int f16730Q;

    /* renamed from: R, reason: collision with root package name */
    private double f16731R;

    /* renamed from: S, reason: collision with root package name */
    private double f16732S;

    /* renamed from: T, reason: collision with root package name */
    private int f16733T;

    /* renamed from: U, reason: collision with root package name */
    private int f16734U;

    /* renamed from: V, reason: collision with root package name */
    private e f16735V;

    /* renamed from: W, reason: collision with root package name */
    private SensorManager f16736W;

    /* renamed from: a, reason: collision with root package name */
    protected boolean f16737a;
    private Sensor aa;
    private com.mbridge.msdk.videocommon.download.a ab;
    private a ac;
    private OnMBMediaViewListener ad;
    private OnMBMediaViewListenerPlus ae;
    private int af;
    private boolean ag;
    private boolean ah;
    private RelativeLayout ai;
    private ImageView aj;
    private int ak;
    private boolean al;
    private Context am;
    private boolean an;
    private Runnable ao;
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16738c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16739d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f16740e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f16741f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f16742g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f16743h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f16744i;

    /* renamed from: j, reason: collision with root package name */
    private volatile boolean f16745j;

    /* renamed from: k, reason: collision with root package name */
    private volatile boolean f16746k;
    private boolean l;
    private boolean m;

    /* renamed from: n, reason: collision with root package name */
    private ArrayList<String> f16747n;

    /* renamed from: o, reason: collision with root package name */
    private ArrayList<String> f16748o;

    /* renamed from: r, reason: collision with root package name */
    private boolean f16749r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f16750s;

    /* renamed from: t, reason: collision with root package name */
    private O5.b f16751t;

    /* renamed from: u, reason: collision with root package name */
    private O5.a f16752u;

    /* renamed from: v, reason: collision with root package name */
    private P5.b f16753v;

    /* renamed from: w, reason: collision with root package name */
    private int f16754w;

    /* renamed from: x, reason: collision with root package name */
    private MediaViewPlayerView f16755x;

    /* renamed from: y, reason: collision with root package name */
    private RelativeLayout f16756y;

    /* renamed from: z, reason: collision with root package name */
    private RelativeLayout f16757z;

    /* renamed from: com.mbridge.msdk.nativex.view.BaseMBMediaView$10, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass10 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16759a;

        static {
            int[] iArr = new int[BaseView.a.values().length];
            f16759a = iArr;
            try {
                iArr[BaseView.a.FULL_MIDDLE_VIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16759a[BaseView.a.FULL_TOP_VIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public enum a {
        BIG_IMAGE,
        VIDEO,
        GIF
    }

    /* loaded from: classes3.dex */
    public static final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        WeakReference<BaseMBMediaView> f16780a;

        public b(BaseMBMediaView baseMBMediaView) {
            this.f16780a = new WeakReference<>(baseMBMediaView);
        }

        @Override // java.lang.Runnable
        public final void run() {
            BaseMBMediaView baseMBMediaView = this.f16780a.get();
            if (baseMBMediaView != null) {
                try {
                    if (baseMBMediaView.ac != null && baseMBMediaView.ac == a.BIG_IMAGE) {
                        baseMBMediaView.f();
                        baseMBMediaView.ac = a.VIDEO;
                        baseMBMediaView.changeNoticeURL();
                    }
                } catch (Throwable th) {
                    ad.b(BaseMBMediaView.TAG, th.getMessage(), th);
                }
            }
        }
    }

    /* loaded from: classes3.dex */
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
            } catch (Exception e4) {
                ad.b(BaseMBMediaView.TAG, e4.getMessage());
            }
            return false;
        }
    }

    /* loaded from: classes3.dex */
    public class e implements SensorEventListener {
        private e() {
        }

        @Override // android.hardware.SensorEventListener
        public final void onAccuracyChanged(Sensor sensor, int i9) {
        }

        @Override // android.hardware.SensorEventListener
        public final void onSensorChanged(SensorEvent sensorEvent) {
            int i9;
            if (BaseMBMediaView.this.al) {
                return;
            }
            try {
                float[] fArr = sensorEvent.values;
                float f9 = -fArr[0];
                float f10 = -fArr[1];
                float f11 = -fArr[2];
                if (((f10 * f10) + (f9 * f9)) * 4.0f >= f11 * f11) {
                    i9 = 90 - Math.round(((float) Math.atan2(-f10, f9)) * 57.29578f);
                    while (i9 >= 360) {
                        i9 -= 360;
                    }
                    while (i9 < 0) {
                        i9 += 360;
                    }
                } else {
                    i9 = -1;
                }
                float B5 = BaseMBMediaView.this.B();
                int g9 = ai.g(BaseMBMediaView.this.getContext());
                if ((i9 > 45 && i9 < 135) || (i9 > 225 && i9 < 315)) {
                    if (B5 >= g9 && !BaseMBMediaView.this.f16746k) {
                        BaseMBMediaView.this.f16745j = true;
                        BaseMBMediaView.this.f16746k = true;
                        BaseMBMediaView.this.f16728N.postDelayed(new Runnable() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.e.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                try {
                                    com.mbridge.msdk.nativex.view.mbfullview.a.a(BaseMBMediaView.this.getContext()).a(BaseMBMediaView.this.f16721G, BaseMBMediaView.this.f16745j);
                                    BaseMBMediaView.this.E();
                                    BaseMBMediaView.this.i();
                                    BaseMBMediaView.this.g();
                                    BaseMBMediaView.this.h();
                                    if (BaseMBMediaView.this.f16717C != null) {
                                        BaseMBMediaView.this.f16717C.orientation(BaseMBMediaView.this.f16745j);
                                    }
                                } catch (Exception e4) {
                                    ad.b(BaseMBMediaView.TAG, e4.getMessage());
                                }
                            }
                        }, 200L);
                        return;
                    }
                    return;
                }
                if (((i9 > 135 && i9 < 225) || ((i9 > 315 && i9 < 360) || ((i9 >= 0 && i9 <= 45) || i9 == -1))) && B5 <= g9 && BaseMBMediaView.this.f16746k) {
                    BaseMBMediaView.this.f16745j = false;
                    BaseMBMediaView.this.f16746k = false;
                    BaseMBMediaView.this.f16728N.postDelayed(new Runnable() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.e.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                com.mbridge.msdk.nativex.view.mbfullview.a.a(BaseMBMediaView.this.getContext()).a(BaseMBMediaView.this.f16721G, BaseMBMediaView.this.f16745j);
                                BaseMBMediaView.this.D();
                                BaseMBMediaView.this.i();
                                BaseMBMediaView.this.g();
                                BaseMBMediaView.this.h();
                                if (BaseMBMediaView.this.f16717C != null) {
                                    BaseMBMediaView.this.f16717C.orientation(BaseMBMediaView.this.f16745j);
                                }
                            } catch (Exception e4) {
                                ad.b(BaseMBMediaView.TAG, e4.getMessage());
                            }
                        }
                    }, 200L);
                }
            } catch (Throwable th) {
                ad.b(BaseMBMediaView.TAG, th.getMessage(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class f implements com.mbridge.msdk.videocommon.listener.a {

        /* renamed from: a, reason: collision with root package name */
        WeakReference<BaseMBMediaView> f16785a;

        public f(BaseMBMediaView baseMBMediaView) {
            this.f16785a = new WeakReference<>(baseMBMediaView);
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public final void a(String str, String str2) {
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public final void a(String str) {
            BaseMBMediaView baseMBMediaView = this.f16785a.get();
            if (baseMBMediaView != null) {
                baseMBMediaView.f16728N.post(new b(baseMBMediaView));
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class g extends WebViewClient {

        /* renamed from: a, reason: collision with root package name */
        WeakReference<BaseMBMediaView> f16786a;

        public g(BaseMBMediaView baseMBMediaView) {
            this.f16786a = new WeakReference<>(baseMBMediaView);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            try {
                BaseMBMediaView baseMBMediaView = this.f16786a.get();
                if (baseMBMediaView != null && baseMBMediaView.ac != null && baseMBMediaView.ac == a.BIG_IMAGE) {
                    baseMBMediaView.m();
                    baseMBMediaView.ac = a.GIF;
                    baseMBMediaView.changeNoticeURL();
                }
            } catch (Exception e4) {
                ad.b(BaseMBMediaView.TAG, e4.getMessage());
            }
        }
    }

    public BaseMBMediaView(Context context) {
        super(context);
        this.b = true;
        this.f16738c = true;
        this.f16739d = true;
        this.f16740e = true;
        this.f16741f = true;
        this.f16742g = false;
        this.f16743h = true;
        this.f16744i = false;
        this.f16745j = false;
        this.f16746k = false;
        this.l = true;
        this.m = true;
        this.f16747n = new ArrayList<>();
        this.f16748o = new ArrayList<>();
        this.f16749r = false;
        this.f16750s = false;
        this.f16751t = null;
        this.f16752u = null;
        this.f16753v = null;
        this.f16754w = 0;
        this.f16737a = false;
        this.ab = null;
        this.ac = null;
        this.ag = false;
        this.ah = false;
        this.al = false;
        this.an = false;
        this.ao = new Runnable() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.9
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (!BaseMBMediaView.this.f16744i) {
                        BaseMBMediaView baseMBMediaView = BaseMBMediaView.this;
                        if (!baseMBMediaView.a((View) baseMBMediaView)) {
                            BaseMBMediaView.R(BaseMBMediaView.this);
                        } else {
                            BaseMBMediaView.S(BaseMBMediaView.this);
                        }
                    }
                    BaseMBMediaView.this.f16728N.postDelayed(this, 300L);
                } catch (Exception e4) {
                    ad.b(BaseMBMediaView.TAG, e4.getMessage());
                }
            }
        };
        a(context);
    }

    public static /* synthetic */ void M(BaseMBMediaView baseMBMediaView) {
        CampaignEx.b mediaViewHolder;
        CampaignEx campaignEx = baseMBMediaView.O;
        if (campaignEx != null && (mediaViewHolder = campaignEx.getMediaViewHolder()) != null && !mediaViewHolder.f15525f && baseMBMediaView.O.getNativeVideoTracking() != null && baseMBMediaView.O.getNativeVideoTracking().j() != null) {
            mediaViewHolder.f15525f = true;
            Context context = baseMBMediaView.getContext();
            CampaignEx campaignEx2 = baseMBMediaView.O;
            com.mbridge.msdk.click.a.a(context, campaignEx2, campaignEx2.getCampaignUnitId(), baseMBMediaView.O.getNativeVideoTracking().j(), false, false);
        }
    }

    public static /* synthetic */ void N(BaseMBMediaView baseMBMediaView) {
        CampaignEx.b mediaViewHolder;
        CampaignEx campaignEx = baseMBMediaView.O;
        if (campaignEx != null && (mediaViewHolder = campaignEx.getMediaViewHolder()) != null && !mediaViewHolder.f15529j && baseMBMediaView.O.getNativeVideoTracking() != null && baseMBMediaView.O.getNativeVideoTracking().k() != null) {
            mediaViewHolder.f15529j = true;
            Context context = baseMBMediaView.getContext();
            CampaignEx campaignEx2 = baseMBMediaView.O;
            com.mbridge.msdk.click.a.a(context, campaignEx2, campaignEx2.getCampaignUnitId(), baseMBMediaView.O.getNativeVideoTracking().k(), false, false);
        }
    }

    public static /* synthetic */ void O(BaseMBMediaView baseMBMediaView) {
        CampaignEx.b mediaViewHolder;
        CampaignEx campaignEx = baseMBMediaView.O;
        if (campaignEx != null && (mediaViewHolder = campaignEx.getMediaViewHolder()) != null && !mediaViewHolder.f15526g && baseMBMediaView.O.getNativeVideoTracking() != null && baseMBMediaView.O.getNativeVideoTracking().m() != null) {
            mediaViewHolder.f15526g = true;
            Context context = baseMBMediaView.getContext();
            CampaignEx campaignEx2 = baseMBMediaView.O;
            com.mbridge.msdk.click.a.a(context, campaignEx2, campaignEx2.getCampaignUnitId(), baseMBMediaView.O.getNativeVideoTracking().m(), false, false);
        }
    }

    public static /* synthetic */ void P(BaseMBMediaView baseMBMediaView) {
        CampaignEx.b mediaViewHolder;
        CampaignEx campaignEx = baseMBMediaView.O;
        if (campaignEx != null && (mediaViewHolder = campaignEx.getMediaViewHolder()) != null && !mediaViewHolder.f15528i && baseMBMediaView.O.getNativeVideoTracking() != null && baseMBMediaView.O.getNativeVideoTracking().n() != null) {
            mediaViewHolder.f15528i = true;
            Context context = baseMBMediaView.getContext();
            CampaignEx campaignEx2 = baseMBMediaView.O;
            com.mbridge.msdk.click.a.a(context, campaignEx2, campaignEx2.getCampaignUnitId(), baseMBMediaView.O.getNativeVideoTracking().n(), false, false);
        }
    }

    public static /* synthetic */ void R(BaseMBMediaView baseMBMediaView) {
        try {
            MediaViewPlayerView mediaViewPlayerView = baseMBMediaView.f16755x;
            if (mediaViewPlayerView != null && mediaViewPlayerView.hasPrepare() && baseMBMediaView.f16755x.isPlaying()) {
                try {
                    MediaViewPlayerView mediaViewPlayerView2 = baseMBMediaView.f16755x;
                    if (mediaViewPlayerView2 != null) {
                        mediaViewPlayerView2.pause();
                    }
                } catch (Throwable th) {
                    ad.b(TAG, th.getMessage());
                }
            }
        } catch (Throwable th2) {
            ad.b(TAG, th2.getMessage());
        }
    }

    public static /* synthetic */ void S(BaseMBMediaView baseMBMediaView) {
        try {
            MediaViewPlayerView mediaViewPlayerView = baseMBMediaView.f16755x;
            if (mediaViewPlayerView != null && mediaViewPlayerView.hasPrepare() && !baseMBMediaView.f16755x.isPlaying() && !baseMBMediaView.f16755x.isComplete() && baseMBMediaView.f16755x.hasPrepare()) {
                baseMBMediaView.f16755x.startOrPlayVideo();
            }
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        RelativeLayout relativeLayout;
        int i9;
        int i10;
        try {
            if (this.ac == a.GIF) {
                int i11 = this.f16730Q;
                if (i11 != 0 && (i9 = this.f16734U) != 0 && (i10 = this.f16733T) != 0) {
                    int i12 = (i11 * i9) / i10;
                    RelativeLayout relativeLayout2 = this.f16715A;
                    if (relativeLayout2 != null && i12 != 0) {
                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout2.getLayoutParams();
                        layoutParams.width = this.f16730Q;
                        layoutParams.height = i12;
                        layoutParams.addRule(13);
                        this.f16715A.setLayoutParams(layoutParams);
                    }
                } else if (i11 != 0 && (relativeLayout = this.f16715A) != null) {
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
                    int i13 = this.f16730Q;
                    layoutParams2.width = i13;
                    layoutParams2.height = (i13 * 627) / 1200;
                    layoutParams2.addRule(13);
                    this.f16715A.setLayoutParams(layoutParams2);
                }
            }
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        try {
            this.f16756y.setVisibility(8);
            this.f16718D.setVisibility(8);
            this.f16715A.setVisibility(0);
            this.f16716B.setVisibility(0);
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
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
                    if (BaseMBMediaView.this.f16718D != null && BaseMBMediaView.this.ac == a.BIG_IMAGE) {
                        if (bitmap != null) {
                            BaseMBMediaView.this.f16733T = bitmap.getWidth();
                            BaseMBMediaView.this.f16734U = bitmap.getHeight();
                            BaseMBMediaView.this.f16718D.setImageUrl(str);
                            BaseMBMediaView.this.f16718D.setImageBitmap(bitmap);
                        }
                        BaseMBMediaView.this.f16718D.setOnClickListener(new com.mbridge.msdk.widget.a() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.12.1
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
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
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
            this.f16716B.loadDataWithBaseURL(null, "<!DOCTYPE html><html lang=\"en\"><head>  <meta charset=\"UTF-8\">  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"><meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">  <title>Document</title>  <style>  *{    margin: 0;    padding: 0;  }  html, body{    width: 100%;    height: 100%;  }  body{    background-image: url('gifUrl');    background-position: center;    background-size: contain;    background-repeat: no-repeat;  }  </style></head><body></body></html>".replace("gifUrl", gifUrl), "text/html", "utf-8", null);
            this.f16716B.setInterceptTouch(true);
            this.f16715A.setOnClickListener(new com.mbridge.msdk.widget.a() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.13
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
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
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
        } catch (Exception e4) {
            ad.b(TAG, e4.getMessage());
            return null;
        }
    }

    private void q() {
        try {
            if (this.O == null) {
                ad.c(TAG, "campaign is null addPlayerView return");
            }
            MediaViewPlayerView mediaViewPlayerView = this.f16755x;
            if (mediaViewPlayerView != null && mediaViewPlayerView.getParent() != null) {
                ((ViewGroup) this.f16755x.getParent()).removeView(this.f16755x);
            }
            l();
            MediaViewPlayerView mediaViewPlayerView2 = new MediaViewPlayerView(getContext());
            this.f16755x = mediaViewPlayerView2;
            mediaViewPlayerView2.showProgressView(this.l);
            this.f16755x.showSoundIndicator(this.m);
            if (this.f16742g) {
                this.f16755x.openSound();
            } else {
                this.f16755x.closeSound();
            }
            this.f16755x.setAllowLoopPlay(this.f16738c);
            this.f16755x.initPlayerViewData(s(), this.O, v(), this, this.ab, p());
            this.f16755x.setOnMediaViewPlayerViewListener(new c(this));
            this.f16756y.addView(this.f16755x, -1, -1);
            try {
                MediaViewPlayerView mediaViewPlayerView3 = this.f16755x;
                if (mediaViewPlayerView3 != null) {
                    mediaViewPlayerView3.setOnClickListener(new com.mbridge.msdk.widget.a() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.11
                        @Override // com.mbridge.msdk.widget.a
                        public final void a(View view) {
                            try {
                                if (!BaseMBMediaView.this.f16744i) {
                                    BaseMBMediaView.d(BaseMBMediaView.this);
                                }
                                BaseMBMediaView.this.f16755x.showSoundIndicator(true);
                                BaseMBMediaView.this.f16755x.showProgressView(true);
                                if (BaseMBMediaView.this.f16740e && !BaseMBMediaView.this.f16744i && (BaseMBMediaView.this.f16720F == null || BaseMBMediaView.this.f16720F.getParent() == null)) {
                                    if (!BaseMBMediaView.this.f16755x.halfLoadingViewisVisible() && BaseMBMediaView.this.f16755x.isPlaying()) {
                                        BaseMBMediaView.this.a();
                                        return;
                                    }
                                    ad.c(BaseMBMediaView.TAG, "is loading or no playing return;");
                                    return;
                                }
                                if (BaseMBMediaView.this.f16744i) {
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
                                if (BaseMBMediaView.this.f16753v != null) {
                                    try {
                                        BaseMBMediaView.this.f16753v.a();
                                        ad.a("omsdk", "mnv adUserInteraction click");
                                    } catch (Exception e4) {
                                        ad.b("omsdk", e4.getMessage());
                                    }
                                }
                            } catch (Throwable th) {
                                ad.b(BaseMBMediaView.TAG, th.getMessage(), th);
                            }
                        }
                    });
                }
            } catch (Throwable th) {
                ad.b(TAG, th.getMessage());
            }
            O5.b bVar = this.f16751t;
            if (bVar != null) {
                MediaViewPlayerView mediaViewPlayerView4 = this.f16755x;
                if (mediaViewPlayerView4 != null) {
                    mediaViewPlayerView4.registerView(bVar);
                }
                this.f16752u = O5.a.a(this.f16751t);
                this.f16753v = P5.b.b(this.f16751t);
                this.f16751t.f();
                this.f16752u.d(new B3.e(3));
                MediaViewPlayerView mediaViewPlayerView5 = this.f16755x;
                if (mediaViewPlayerView5 != null) {
                    mediaViewPlayerView5.setVideoEvents(this.f16753v);
                }
                try {
                    O5.a aVar = this.f16752u;
                    if (aVar != null) {
                        aVar.b();
                    }
                } catch (Exception e4) {
                    ad.a("omsdk", e4.getMessage());
                }
            }
        } catch (Throwable th2) {
            ad.b(TAG, th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void cai(Object obj, String str) {
        int i9;
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
                        i9 = 1;
                    } else {
                        i9 = 2;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", com.mbridge.msdk.mbsignalcommon.communication.d.b);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("result", i9);
                        jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e4) {
                        com.mbridge.msdk.mbsignalcommon.communication.d.a(obj, e4.getMessage());
                        ad.a(TAG, e4.getMessage());
                    }
                } catch (JSONException e9) {
                    com.mbridge.msdk.mbsignalcommon.communication.d.a(obj, "exception: " + e9.getLocalizedMessage());
                    ad.b(TAG, "cai", e9);
                }
            } catch (Throwable th) {
                com.mbridge.msdk.mbsignalcommon.communication.d.a(obj, "exception: " + th.getLocalizedMessage());
                ad.b(TAG, "cai", th);
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
                    a aVar = this.ac;
                    if (aVar == a.VIDEO) {
                        if (noticeUrl.contains("is_video=2")) {
                            noticeUrl = noticeUrl.replace("is_video=2", "is_video=1");
                        }
                    } else if (aVar == a.BIG_IMAGE && noticeUrl.contains("is_video=1")) {
                        noticeUrl = noticeUrl.replace("is_video=1", "is_video=2");
                    }
                } else {
                    a aVar2 = this.ac;
                    if (aVar2 == a.VIDEO) {
                        str = "1";
                    } else if (aVar2 == a.BIG_IMAGE) {
                        str = MBridgeConstans.API_REUQEST_CATEGORY_APP;
                    } else {
                        str = "";
                    }
                    StringBuilder sb = new StringBuilder(noticeUrl);
                    if (noticeUrl.contains("?")) {
                        sb.append("&is_video=");
                        sb.append(str);
                    } else {
                        sb.append("?is_video=");
                        sb.append(str);
                    }
                    noticeUrl = sb.toString();
                }
                this.O.setNoticeUrl(noticeUrl);
            }
        }
    }

    public void destory() {
        try {
            MediaViewPlayerView mediaViewPlayerView = this.f16755x;
            if (mediaViewPlayerView != null) {
                mediaViewPlayerView.release();
            }
            b();
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
        }
    }

    public void exitFullScreen() {
        try {
            x();
            if (this.f16738c) {
                this.f16755x.onClickPlayButton();
            }
        } catch (Exception e4) {
            ad.b(TAG, e4.getMessage());
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
            String a6 = a(arrayList, p(), "MAL_16.7.71,3.0.1");
            if (!TextUtils.isEmpty(a6)) {
                str2 = Base64.encodeToString(a6.getBytes(), 2);
            } else {
                str2 = "";
            }
            ad.b(TAG, "getEndScreenInfo-mCampaign.name:" + this.O.getAppName());
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(obj, str2);
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.mbridge.msdk.nativex.view.mbfullview.BaseView getFullScreenViewByStyle(android.content.Context r3, com.mbridge.msdk.nativex.view.mbfullview.BaseView.a r4) {
        /*
            r2 = this;
            int[] r0 = com.mbridge.msdk.nativex.view.BaseMBMediaView.AnonymousClass10.f16759a
            int r1 = r4.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L17
            r1 = 2
            if (r0 == r1) goto L10
            r3 = 0
            goto L1d
        L10:
            com.mbridge.msdk.nativex.view.mbfullview.MBridgeTopFullView r0 = new com.mbridge.msdk.nativex.view.mbfullview.MBridgeTopFullView
            r0.<init>(r3)
        L15:
            r3 = r0
            goto L1d
        L17:
            com.mbridge.msdk.nativex.view.mbfullview.MBridgeFullView r0 = new com.mbridge.msdk.nativex.view.mbfullview.MBridgeFullView
            r0.<init>(r3)
            goto L15
        L1d:
            if (r3 == 0) goto L22
            r3.setStytle(r4)
        L22:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.nativex.view.BaseMBMediaView.getFullScreenViewByStyle(android.content.Context, com.mbridge.msdk.nativex.view.mbfullview.BaseView$a):com.mbridge.msdk.nativex.view.mbfullview.BaseView");
    }

    public float getMediaContentAspectRatio() {
        String imageSize;
        float f9 = 0.0f;
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
                        f9 = Integer.parseInt(r3[0]) / Integer.parseInt(r3[1]);
                    }
                }
                ad.b(TAG, "resource ratio is : " + f9);
            }
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
        }
        return f9;
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
            } else if ((obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).b) != null) {
                b(windVaneWebView.getContext());
            }
        } catch (Exception e4) {
            ad.b(TAG, e4.getMessage());
        }
    }

    public boolean ismCurIsFullScreen() {
        return this.f16744i;
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void notifyCloseBtn(Object obj, String str) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            if (this.f16739d) {
                try {
                    SensorManager sensorManager = (SensorManager) getContext().getSystemService("sensor");
                    this.f16736W = sensorManager;
                    this.aa = sensorManager.getDefaultSensor(1);
                    e eVar = new e();
                    this.f16735V = eVar;
                    this.f16736W.registerListener(eVar, this.aa, 2);
                } catch (Throwable th) {
                    ad.b(TAG, th.getMessage());
                }
            }
            this.f16743h = isHardwareAccelerated();
            this.ak = getOrientation();
            e();
            this.f16728N.postDelayed(this.ao, 300L);
        } catch (Throwable th2) {
            ad.b(TAG, th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onBufferingEnd() {
        ad.c("omsdk", "base media end");
        P5.b bVar = this.f16753v;
        if (bVar != null) {
            k kVar = bVar.f2431a;
            R2.b.b(kVar);
            kVar.f2232e.c("bufferFinish", null);
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onBufferingStart(String str) {
        ad.c("omsdk", "base media start");
        P5.b bVar = this.f16753v;
        if (bVar != null) {
            k kVar = bVar.f2431a;
            R2.b.b(kVar);
            kVar.f2232e.c("bufferStart", null);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        boolean z8;
        super.onConfigurationChanged(configuration);
        if (this.al) {
            int i9 = this.ak;
            int i10 = configuration.orientation;
            if (i9 == i10) {
                return;
            }
            this.ak = i10;
            boolean z9 = false;
            if (i10 == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.f16745j = z8;
            if (this.ak == 0) {
                z9 = true;
            }
            this.f16746k = z9;
            this.f16728N.postDelayed(new Runnable() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.8
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        com.mbridge.msdk.nativex.view.mbfullview.a.a(BaseMBMediaView.this.getContext()).a(BaseMBMediaView.this.f16721G, BaseMBMediaView.this.f16745j);
                        if (BaseMBMediaView.this.ak == 0) {
                            BaseMBMediaView.this.E();
                        } else {
                            BaseMBMediaView.this.D();
                        }
                        BaseMBMediaView.this.i();
                        BaseMBMediaView.this.g();
                        BaseMBMediaView.this.h();
                        if (BaseMBMediaView.this.f16717C != null) {
                            BaseMBMediaView.this.f16717C.orientation(BaseMBMediaView.this.f16745j);
                        }
                    } catch (Exception e4) {
                        ad.b(BaseMBMediaView.TAG, e4.getMessage());
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
            if (this.f16751t != null) {
                MediaViewPlayerView mediaViewPlayerView = this.f16755x;
                if (mediaViewPlayerView != null) {
                    mediaViewPlayerView.unregisterView();
                }
                this.f16751t.c();
                this.f16751t = null;
            }
            if (this.f16753v != null) {
                this.f16753v = null;
            }
            if (this.f16752u != null) {
                this.f16752u = null;
            }
            this.f16728N.removeCallbacks(this.ao);
            Handler handler = this.f16728N;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            try {
                SensorManager sensorManager = this.f16736W;
                if (sensorManager != null && (eVar = this.f16735V) != null) {
                    sensorManager.unregisterListener(eVar);
                }
            } catch (Throwable th) {
                ad.b(TAG, th.getMessage());
            }
            b();
        } catch (Throwable th2) {
            ad.b(TAG, th2.getMessage());
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        try {
            this.f16729P = getHeight();
            int width = getWidth();
            this.f16730Q = width;
            if (width == 0) {
                this.f16730Q = getMeasuredWidth();
            }
            if (this.f16729P == 0) {
                this.f16729P = getMeasuredHeight();
            }
            if (this.f16730Q == 0 && this.f16729P == 0) {
                this.f16730Q = (int) B();
            }
            a aVar = this.ac;
            if (aVar == a.VIDEO && !this.f16744i) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (this.f16729P == 0 || ((layoutParams != null && layoutParams.height == -2) || (layoutParams != null && layoutParams.height == -1))) {
                    this.f16729P = (int) ((this.f16730Q * this.f16732S) / this.f16731R);
                }
                i();
                return;
            }
            if (aVar == a.BIG_IMAGE && !this.f16744i) {
                g();
            } else if (aVar == a.GIF && !this.f16744i) {
                h();
            }
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayCompleted() {
        P5.b bVar = this.f16753v;
        if (bVar != null) {
            k kVar = bVar.f2431a;
            R2.b.b(kVar);
            kVar.f2232e.c(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE, null);
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
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayProgress(int i9, int i10) {
        int i11;
        String str;
        CampaignEx.b mediaViewHolder;
        CampaignEx.b mediaViewHolder2;
        Map<Integer, String> map;
        try {
            CampaignEx campaignEx = this.O;
            if (campaignEx != null && (mediaViewHolder2 = campaignEx.getMediaViewHolder()) != null && !mediaViewHolder2.b && (map = mediaViewHolder2.f15521a) != null && map.size() > 0) {
                Map<Integer, String> map2 = mediaViewHolder2.f15521a;
                Iterator<Map.Entry<Integer, String>> it = map2.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<Integer, String> next = it.next();
                    Integer key = next.getKey();
                    String value = next.getValue();
                    if (i9 >= key.intValue() && !TextUtils.isEmpty(value)) {
                        Context context = getContext();
                        CampaignEx campaignEx2 = this.O;
                        com.mbridge.msdk.click.a.a(context, campaignEx2, campaignEx2.getCampaignUnitId(), value, false, false);
                        it.remove();
                    }
                }
                if (map2.size() <= 0) {
                    mediaViewHolder2.b = true;
                }
            }
        } catch (Exception e4) {
            ad.b(TAG, e4.getMessage());
        }
        int i12 = 0;
        try {
            CampaignEx campaignEx3 = this.O;
            if (campaignEx3 != null && (mediaViewHolder = campaignEx3.getMediaViewHolder()) != null && !mediaViewHolder.f15527h && i10 != 0) {
                List<Map<Integer, String>> i13 = this.O.getNativeVideoTracking().i();
                int i14 = ((i9 + 1) * 100) / i10;
                if (i13 != null) {
                    int i15 = 0;
                    while (i15 < i13.size()) {
                        Map<Integer, String> map3 = i13.get(i15);
                        if (map3 != null && map3.size() > 0) {
                            Iterator<Map.Entry<Integer, String>> it2 = map3.entrySet().iterator();
                            while (it2.hasNext()) {
                                Map.Entry<Integer, String> next2 = it2.next();
                                int intValue = next2.getKey().intValue();
                                String value2 = next2.getValue();
                                if (intValue <= i14 && !TextUtils.isEmpty(value2)) {
                                    Context context2 = getContext();
                                    CampaignEx campaignEx4 = this.O;
                                    com.mbridge.msdk.click.a.a(context2, campaignEx4, campaignEx4.getCampaignUnitId(), new String[]{value2}, false, true);
                                    it2.remove();
                                    i13.remove(i15);
                                    i15--;
                                }
                            }
                        }
                        i15++;
                    }
                    if (i13.size() <= 0) {
                        mediaViewHolder.f15527h = true;
                    }
                }
            }
        } catch (Throwable unused) {
            ad.b(TAG, "reportPlayPercentageData error");
        }
        P5.b bVar = this.f16753v;
        if (bVar != null) {
            int i16 = (i9 * 100) / i10;
            int i17 = ((i9 + 1) * 100) / i10;
            k kVar = bVar.f2431a;
            if (i16 <= 25 && 25 < i17) {
                R2.b.b(kVar);
                kVar.f2232e.c("firstQuartile", null);
            } else if (i16 <= 50 && 50 < i17) {
                R2.b.b(kVar);
                kVar.f2232e.c(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT, null);
            } else if (i16 <= 75 && 75 < i17) {
                R2.b.b(kVar);
                kVar.f2232e.c("thirdQuartile", null);
            }
        }
        if (t() != 100 && !this.an) {
            if (u() != null) {
                i12 = u().g();
            }
            int t9 = t();
            if (t9 == 0) {
                return;
            }
            if (i12 > t9) {
                i12 = t9 / 2;
            }
            if (i12 >= 0 && i9 >= (i11 = (i12 * i10) / 100)) {
                if (this.O.getAdType() != 94 && this.O.getAdType() != 287) {
                    str = this.O.getId() + this.O.getVideoUrlEncode() + this.O.getBidToken();
                } else {
                    str = this.O.getRequestId() + this.O.getId() + this.O.getVideoUrlEncode();
                }
                com.mbridge.msdk.videocommon.download.a a6 = com.mbridge.msdk.videocommon.download.b.getInstance().a(p(), str);
                if (a6 != null) {
                    a6.p();
                    this.an = true;
                    ad.b(TAG, "CDRate is : " + i11 + " and start download !");
                }
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayProgressMS(int i9, int i10) {
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlaySetDataSourceError(String str) {
        ad.c("errorstr", str);
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayStarted(int i9) {
        float f9;
        P5.b bVar = this.f16753v;
        if (bVar != null) {
            float f10 = i9;
            try {
                if (this.f16742g) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                bVar.d(f10, f9);
            } catch (IllegalArgumentException e4) {
                ad.a("omsdk", e4.getMessage());
            }
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z8) {
        MediaViewPlayerView mediaViewPlayerView;
        super.onWindowFocusChanged(z8);
        try {
            this.f16741f = z8;
            if (this.ac == a.VIDEO && (mediaViewPlayerView = this.f16755x) != null) {
                mediaViewPlayerView.setIsFrontDesk(z8);
            }
            try {
                if (this.f16744i) {
                    MediaViewPlayerView mediaViewPlayerView2 = this.f16755x;
                    if (mediaViewPlayerView2 != null) {
                        if (this.f16741f) {
                            if (mediaViewPlayerView2.isPlaying()) {
                                ad.c(TAG, "fullscreen windowfocuse true isPlaying do nothing return");
                            } else {
                                MediaViewPlayerView mediaViewPlayerView3 = this.f16755x;
                                if (mediaViewPlayerView3 != null && !mediaViewPlayerView3.isComplete() && !this.f16755x.getIsActiviePause()) {
                                    this.f16755x.onClickPlayButton();
                                }
                            }
                        } else {
                            mediaViewPlayerView2.pause();
                        }
                    } else {
                        ad.b(TAG, "fullscreen playerview is null return");
                    }
                }
            } catch (Throwable th) {
                ad.b(TAG, th.getMessage());
            }
            requestLayout();
        } catch (Throwable th2) {
            ad.b(TAG, th2.getMessage());
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
        Context c9 = com.mbridge.msdk.foundation.controller.c.m().c();
        if (!TextUtils.isEmpty(str)) {
            if (c9 == null) {
                try {
                    if ((obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).b) != null) {
                        c9 = windVaneWebView.getContext();
                    }
                } catch (Exception e4) {
                    ad.b(TAG, e4.getMessage());
                }
            }
            if (c9 == null) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("url");
                int optInt = jSONObject.optInt("type");
                if (optInt == 1) {
                    com.mbridge.msdk.click.c.c(c9, optString);
                } else if (optInt == 2) {
                    com.mbridge.msdk.click.c.e(c9, optString);
                }
            } catch (JSONException e9) {
                ad.b(TAG, e9.getMessage());
            } catch (Throwable th) {
                ad.b(TAG, th.getMessage());
            }
        }
    }

    public void setAllowLoopPlay(boolean z8) {
        this.f16738c = z8;
    }

    public void setAllowScreenChange(boolean z8) {
        this.f16739d = z8;
    }

    public void setAllowVideoRefresh(boolean z8) {
        this.b = z8;
    }

    public void setFollowActivityOrientation(boolean z8) {
        this.al = z8;
    }

    public void setFullScreenViewBackgroundColor(int i9) {
        this.f16754w = i9;
    }

    public void setIsAllowFullScreen(boolean z8) {
        this.f16740e = z8;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00ab A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:5:0x0003, B:9:0x000a, B:11:0x0025, B:12:0x003b, B:14:0x0045, B:17:0x0050, B:18:0x0099, B:20:0x00ab, B:22:0x00b0, B:24:0x00b4, B:25:0x00b7, B:26:0x00be, B:28:0x00c2, B:29:0x00c4, B:31:0x00c8, B:32:0x00ca, B:34:0x00ce, B:36:0x00d4, B:37:0x0106, B:39:0x010a, B:43:0x0075), top: B:4:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010a A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #0 {all -> 0x0038, blocks: (B:5:0x0003, B:9:0x000a, B:11:0x0025, B:12:0x003b, B:14:0x0045, B:17:0x0050, B:18:0x0099, B:20:0x00ab, B:22:0x00b0, B:24:0x00b4, B:25:0x00b7, B:26:0x00be, B:28:0x00c2, B:29:0x00c4, B:31:0x00c8, B:32:0x00ca, B:34:0x00ce, B:36:0x00d4, B:37:0x0106, B:39:0x010a, B:43:0x0075), top: B:4:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setNativeAd(com.mbridge.msdk.out.Campaign r9) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.nativex.view.BaseMBMediaView.setNativeAd(com.mbridge.msdk.out.Campaign):void");
    }

    public void setOnMediaViewListener(OnMBMediaViewListener onMBMediaViewListener) {
        this.ad = onMBMediaViewListener;
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void setOrientation(Object obj, String str) {
    }

    public void setProgressVisibility(boolean z8) {
        this.l = z8;
        MediaViewPlayerView mediaViewPlayerView = this.f16755x;
        if (mediaViewPlayerView != null) {
            mediaViewPlayerView.showProgressView(z8);
        }
    }

    public void setSoundIndicatorVisibility(boolean z8) {
        this.m = z8;
        MediaViewPlayerView mediaViewPlayerView = this.f16755x;
        if (mediaViewPlayerView != null) {
            mediaViewPlayerView.showSoundIndicator(z8);
        }
    }

    public void setVideoSoundOnOff(boolean z8) {
        this.f16742g = z8;
        MediaViewPlayerView mediaViewPlayerView = this.f16755x;
        if (mediaViewPlayerView != null) {
            if (z8) {
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
                } catch (Exception e4) {
                    ad.b(TAG, e4.getMessage());
                }
            }
            ad.b(TAG, "SHOW CLOSE BTN ");
            showEndCardWebViewCloseBtn();
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(obj, a(0));
        } catch (Exception e9) {
            ad.b(TAG, e9.getMessage());
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().b(obj, a(1));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void triggerCloseBtn(Object obj, String str) {
        try {
            exitFullScreen();
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(obj, a(0));
        } catch (Exception e4) {
            ad.b(TAG, e4.getMessage());
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().b(obj, a(1));
        }
    }

    public void updateViewManger(boolean z8) {
        com.mbridge.msdk.nativex.view.mbfullview.a a6 = com.mbridge.msdk.nativex.view.mbfullview.a.a(getContext());
        int i9 = 0;
        if (a6 != null) {
            try {
                this.f16721G.getmAnimationPlayer().clearAnimation();
                a6.a(z8, !this.f16755x.isComplete(), this.f16721G);
                a6.a(z8, this.f16721G, this.af);
            } catch (NullPointerException e4) {
                e4.printStackTrace();
                return;
            }
        }
        BaseView baseView = this.f16721G;
        if ((baseView instanceof MBridgeTopFullView) && a6 != null) {
            boolean z9 = !z8;
            if (baseView instanceof MBridgeTopFullView) {
                MBridgeTopFullView mBridgeTopFullView = (MBridgeTopFullView) baseView;
                if (!z9) {
                    i9 = 8;
                }
                mBridgeTopFullView.getMBridgeFullViewDisplayIcon().setVisibility(i9);
                mBridgeTopFullView.getMBridgeFullViewDisplayTitle().setVisibility(i9);
                mBridgeTopFullView.getMBridgeFullViewDisplayDscription().setVisibility(i9);
                mBridgeTopFullView.getStarLevelLayoutView().setVisibility(i9);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements com.mbridge.msdk.nativex.listener.a {

        /* renamed from: a, reason: collision with root package name */
        WeakReference<BaseMBMediaView> f16781a;

        public c(BaseMBMediaView baseMBMediaView) {
            this.f16781a = new WeakReference<>(baseMBMediaView);
        }

        @Override // com.mbridge.msdk.nativex.listener.a
        public final void a() {
            BaseMBMediaView baseMBMediaView = this.f16781a.get();
            if (baseMBMediaView != null) {
                BaseMBMediaView.M(baseMBMediaView);
            }
        }

        @Override // com.mbridge.msdk.nativex.listener.a
        public final void b() {
            BaseMBMediaView baseMBMediaView = this.f16781a.get();
            if (baseMBMediaView != null) {
                BaseMBMediaView.N(baseMBMediaView);
            }
        }

        @Override // com.mbridge.msdk.nativex.listener.a
        public final void c() {
            BaseMBMediaView baseMBMediaView = this.f16781a.get();
            if (baseMBMediaView != null) {
                BaseMBMediaView.O(baseMBMediaView);
            }
        }

        @Override // com.mbridge.msdk.nativex.listener.a
        public final void d() {
            BaseMBMediaView baseMBMediaView = this.f16781a.get();
            if (baseMBMediaView != null) {
                BaseMBMediaView.P(baseMBMediaView);
            }
        }

        @Override // com.mbridge.msdk.nativex.listener.a
        public final void a(String str) {
            BaseMBMediaView baseMBMediaView = this.f16781a.get();
            if (baseMBMediaView != null) {
                baseMBMediaView.a(str);
            }
        }

        @Override // com.mbridge.msdk.nativex.listener.a
        public final void b(String str) {
            BaseMBMediaView baseMBMediaView = this.f16781a.get();
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
            double m = ai.m(str);
            double m2 = ai.m(str2);
            if (m <= 0.0d || m2 <= 0.0d) {
                return;
            }
            this.f16731R = m;
            this.f16732S = m2;
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float B() {
        try {
            float h6 = ai.h(getContext());
            return this.f16745j ? h6 + ai.c(getContext()) : h6;
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
            return 0.0f;
        }
    }

    private float C() {
        try {
            float g9 = ai.g(getContext());
            return !this.f16745j ? g9 + ai.c(getContext()) : g9;
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
            return 0.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        try {
            if (this.f16723I == null && this.aj == null) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ai.a(getContext(), 30.0f), ai.a(getContext(), 30.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(10);
            layoutParams.topMargin = ai.a(getContext(), 8.0f);
            layoutParams.rightMargin = ai.a(getContext(), 8.0f);
            RelativeLayout relativeLayout = this.f16723I;
            if (relativeLayout != null) {
                relativeLayout.setLayoutParams(layoutParams);
            }
            ImageView imageView = this.aj;
            if (imageView != null) {
                imageView.setLayoutParams(layoutParams);
            }
            updateViewManger(false);
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        try {
            if (this.f16723I == null && this.aj == null) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ai.a(getContext(), 30.0f), ai.a(getContext(), 30.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(10);
            if (this.af == 0 && com.mbridge.msdk.foundation.tools.d.a(getContext())) {
                layoutParams.rightMargin = ai.c(getContext()) + ai.a(getContext(), 8.0f);
            } else {
                layoutParams.rightMargin = ai.a(getContext(), 8.0f);
            }
            layoutParams.topMargin = ai.a(getContext(), 8.0f);
            RelativeLayout relativeLayout = this.f16723I;
            if (relativeLayout != null) {
                relativeLayout.setLayoutParams(layoutParams);
            }
            ImageView imageView = this.aj;
            if (imageView != null) {
                imageView.setLayoutParams(layoutParams);
            }
            updateViewManger(true);
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
        }
    }

    private void F() {
        int i9;
        try {
            CampaignEx campaignEx = this.O;
            if (campaignEx == null || campaignEx.getNativeVideoTracking() == null) {
                return;
            }
            String[] c9 = this.O.getNativeVideoTracking().c();
            if (this.f16745j) {
                i9 = f16713p;
            } else {
                i9 = f16714q;
            }
            for (String str : c9) {
                if (!TextUtils.isEmpty(str)) {
                    Context context = getContext();
                    CampaignEx campaignEx2 = this.O;
                    com.mbridge.msdk.click.a.a(context, campaignEx2, campaignEx2.getCampaignUnitId(), str + "&orienation=" + i9, false, false);
                }
            }
        } catch (Exception e4) {
            ad.b(TAG, e4.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WindVaneWebViewForNV G() {
        try {
            WindVaneWebViewForNV windVaneWebViewForNV = this.f16717C;
            if (windVaneWebViewForNV != null && this.ah) {
                return windVaneWebViewForNV;
            }
            if (this.ah) {
                return null;
            }
            b(true);
            return null;
        } catch (Exception e4) {
            ad.b(TAG, e4.getMessage());
            return null;
        }
    }

    private void d() {
        this.f16728N = new Handler() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                Object obj;
                if (message != null) {
                    try {
                        int i9 = message.what;
                        if (i9 == 1) {
                            BaseMBMediaView.this.r();
                        } else if (i9 == 3 && (obj = message.obj) != null && (obj instanceof View)) {
                            if (BaseMBMediaView.this.a((View) obj)) {
                                BaseMBMediaView.b(BaseMBMediaView.this);
                            }
                        }
                    } catch (Exception e4) {
                        ad.b(BaseMBMediaView.TAG, e4.getMessage());
                    }
                }
            }
        };
    }

    private void e() {
        O5.b bVar;
        try {
            this.ac = a(true);
            changeNoticeURL();
            a aVar = this.ac;
            if (aVar == a.BIG_IMAGE) {
                CampaignEx campaignEx = this.O;
                if (campaignEx != null && TextUtils.isEmpty(campaignEx.getVideoUrlEncode()) && (bVar = this.f16751t) != null) {
                    try {
                        bVar.d(this.f16718D);
                        this.f16752u = O5.a.a(this.f16751t);
                        this.f16751t.f();
                        O5.a aVar2 = this.f16752u;
                        if (aVar2 != null) {
                            aVar2.b();
                        }
                    } catch (Exception e4) {
                        ad.a("omsdk", e4.getMessage());
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
            this.f16749r = true;
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        A();
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        int i9;
        int i10;
        int i11;
        try {
            if (this.ac != a.BIG_IMAGE || (i9 = this.f16730Q) == 0 || (i10 = this.f16734U) == 0 || (i11 = this.f16733T) == 0) {
                return;
            }
            int i12 = (i9 * i10) / i11;
            MyImageView myImageView = this.f16718D;
            if (myImageView == null || i12 == 0) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) myImageView.getLayoutParams();
            layoutParams.width = this.f16730Q;
            layoutParams.height = i12;
            this.f16718D.setLayoutParams(layoutParams);
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        try {
            if (this.ac != a.VIDEO || this.f16756y == null) {
                return;
            }
            int B5 = (int) B();
            int g9 = ai.g(getContext());
            if (!this.f16744i) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f16756y.getLayoutParams();
                layoutParams.width = this.f16730Q;
                layoutParams.height = this.f16729P;
                layoutParams.addRule(13);
                this.f16756y.setLayoutParams(layoutParams);
            } else {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f16722H.getLayoutParams();
                layoutParams2.width = B5;
                layoutParams2.height = g9;
                layoutParams2.addRule(13);
                this.f16722H.setLayoutParams(layoutParams2);
            }
            r();
            if (!this.f16744i) {
                a(this.f16755x, this.f16730Q, this.f16729P);
            } else {
                a(this.f16755x, B5, g9);
            }
        } catch (Exception e4) {
            ad.b(TAG, e4.getMessage());
        }
    }

    private void j() {
        try {
            this.f16755x.showSoundIndicator(this.m);
            this.f16755x.showProgressView(this.l);
            OnMBMediaViewListener onMBMediaViewListener = this.ad;
            if (onMBMediaViewListener != null) {
                onMBMediaViewListener.onExitFullscreen();
            }
            OnMBMediaViewListenerPlus onMBMediaViewListenerPlus = this.ae;
            if (onMBMediaViewListenerPlus != null) {
                onMBMediaViewListenerPlus.onExitFullscreen();
            }
            P5.b bVar = this.f16753v;
            if (bVar != null) {
                P5.c cVar = P5.c.NORMAL;
                k kVar = bVar.f2431a;
                R2.b.b(kVar);
                JSONObject jSONObject = new JSONObject();
                U5.b.b(jSONObject, "state", cVar);
                kVar.f2232e.c("playerStateChange", jSONObject);
            }
        } catch (Exception e4) {
            ad.b(TAG, e4.getMessage());
        }
    }

    private void k() {
        try {
            ai.a((ImageView) this.f16718D);
            this.f16718D.setVisibility(0);
            this.f16756y.setVisibility(8);
            this.f16715A.setVisibility(8);
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
        }
    }

    private void l() {
        try {
            this.f16756y.setVisibility(0);
            this.f16718D.setVisibility(8);
            this.f16715A.setVisibility(8);
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        try {
            if (getVisibility() != 0) {
                return;
            }
            if (a((View) this)) {
                com.mbridge.msdk.c.k u8 = u();
                int i9 = 0;
                int l = u8 != null ? u8.l() : 0;
                CampaignEx campaignEx = this.O;
                if (campaignEx == null || campaignEx.getImpReportType() != 1) {
                    i9 = l;
                }
                Message obtainMessage = this.f16728N.obtainMessage();
                obtainMessage.what = 3;
                obtainMessage.obj = this;
                this.f16728N.sendMessageDelayed(obtainMessage, (i9 == 0 ? 0L : i9 * 1000) + 300);
            }
            if (this.ac == a.VIDEO) {
                MediaViewPlayerView mediaViewPlayerView = this.f16755x;
                if (mediaViewPlayerView == null) {
                    q();
                    return;
                }
                if (this.O != mediaViewPlayerView.getCampaign()) {
                    this.f16755x.release();
                    q();
                    if (getParent() != null) {
                        ((View) getParent()).invalidate();
                    }
                    requestLayout();
                }
            }
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
        }
    }

    private String s() {
        try {
        } catch (Exception e4) {
            ad.b(TAG, e4.getMessage());
        }
        if (this.O == null) {
            return null;
        }
        com.mbridge.msdk.videocommon.download.a aVar = this.ab;
        if (aVar != null && aVar.k() == 5) {
            String h6 = this.ab.h();
            if (new File(h6).exists()) {
                if (!this.ab.i()) {
                    if (this.ab.j() == ai.a(new File(h6))) {
                    }
                }
                return h6;
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

    private com.mbridge.msdk.c.k u() {
        try {
            CampaignEx campaignEx = this.O;
            if (campaignEx != null && !an.a(campaignEx.getCampaignUnitId())) {
                String campaignUnitId = this.O.getCampaignUnitId();
                String k6 = com.mbridge.msdk.foundation.controller.c.m().k();
                if (!an.a(campaignUnitId) && !an.a(k6)) {
                    com.mbridge.msdk.c.k d2 = h.a().d(k6, campaignUnitId);
                    return d2 != null ? d2 : com.mbridge.msdk.c.k.d(campaignUnitId);
                }
                return com.mbridge.msdk.c.k.d(campaignUnitId);
            }
            return null;
        } catch (Exception e4) {
            ad.b(TAG, e4.getMessage());
            return null;
        }
    }

    private boolean v() {
        com.mbridge.msdk.c.k u8;
        try {
            u8 = u();
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
        }
        if (u8 == null) {
            return false;
        }
        int v6 = u8.v();
        if (v6 == 1) {
            return ai.m(getContext());
        }
        if (v6 == 2) {
            return false;
        }
        return v6 == 3 ? ai.k(getContext()) : ai.m(getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View w() {
        try {
            this.ai = new RelativeLayout(getContext());
            this.ai.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
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
            this.f16717C.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            this.ai.addView(this.f16717C);
            this.ai.addView(this.aj);
            return this.ai;
        } catch (Exception e4) {
            ad.b(TAG, e4.getMessage());
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
            RelativeLayout relativeLayout6 = this.ai;
            if (relativeLayout6 != null) {
                if (relativeLayout2 != null) {
                    relativeLayout2.removeView(relativeLayout6);
                } else if (relativeLayout6.getParent() != null) {
                    ((ViewGroup) this.ai.getParent()).removeView(this.ai);
                }
                this.f16717C.setBackListener(null);
                this.f16717C.setObject(null);
                this.f16717C = null;
                this.ai = null;
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
                relativeLayout4.removeView(this.f16755x);
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
                BaseView baseView = this.f16721G;
                if (baseView != null) {
                    baseView.removeView(this.f16722H);
                }
            }
            if (relativeLayout != null) {
                relativeLayout.removeView(relativeLayout2);
            } else if (relativeLayout2 != null && relativeLayout2.getParent() != null) {
                ((ViewGroup) relativeLayout2.getParent()).removeView(relativeLayout2);
            } else {
                View view = this.f16720F;
                if (view != null) {
                    ((ViewGroup) view).removeView(this.f16721G);
                    ((ViewGroup) this.f16720F.getParent()).removeView(this.f16720F);
                }
            }
            if (frameLayout != null) {
                if (relativeLayout != null) {
                    frameLayout.removeView(relativeLayout);
                } else {
                    frameLayout.removeView(this.f16720F);
                    if (this.f16720F.getParent() != null) {
                        ((ViewGroup) this.f16720F.getParent()).removeView(this.f16720F);
                        this.f16720F.setVisibility(8);
                    }
                }
            }
            setVisibility(0);
            requestLayout();
            if (viewGroup != null) {
                if (this.f16755x.getParent() != null && this.f16755x.getParent() != viewGroup) {
                    ((ViewGroup) this.f16755x.getParent()).removeView(this.f16755x);
                }
                viewGroup.addView(this.f16755x, this.f16727M);
                viewGroup.removeView(frameLayout2);
                viewGroup.invalidate();
            }
            j();
            this.f16744i = false;
            MediaViewPlayerView mediaViewPlayerView = this.f16755x;
            if (mediaViewPlayerView != null) {
                mediaViewPlayerView.setExitFullScreen();
                if (this.f16742g) {
                    this.f16755x.openSound();
                } else {
                    this.f16755x.closeSound();
                }
                this.f16755x.gonePauseView();
            }
        } catch (Exception e4) {
            ad.b(TAG, e4.getMessage());
        }
    }

    private boolean y() {
        try {
            this.f16722H = this.f16721G.getMBridgeFullPlayContainer();
            this.f16726L = this.f16721G.getMBridgeFullPlayerParent();
            this.f16723I = this.f16721G.getMBridgeFullClose();
            this.f16724J = this.f16721G.getMBridgeFullTvInstall();
            this.f16725K = this.f16721G.getMBridgeFullPb();
            return true;
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
            return false;
        }
    }

    private void z() {
        try {
            this.f16745j = ai.h(getContext()) >= ai.g(getContext());
            this.f16746k = this.f16745j;
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
        }
    }

    public void setOnMediaViewListener(OnMBMediaViewListenerPlus onMBMediaViewListenerPlus) {
        this.ae = onMBMediaViewListenerPlus;
    }

    private void b() {
        com.mbridge.msdk.videocommon.download.a aVar = this.ab;
        if (aVar != null) {
            aVar.b((com.mbridge.msdk.videocommon.listener.a) null);
        }
    }

    private void c() {
        int a6 = v.a(getContext(), "mbridge_nativex_mbmediaview", TtmlNode.TAG_LAYOUT);
        if (a6 == -1) {
            ad.b(TAG, "can not find mediaview resource");
            return;
        }
        View inflate = LayoutInflater.from(getContext()).inflate(a6, (ViewGroup) null);
        this.f16757z = (RelativeLayout) inflate.findViewById(v.a(getContext(), "mbridge_rl_mediaview_root", "id"));
        this.f16756y = (RelativeLayout) inflate.findViewById(v.a(getContext(), "mbridge_ll_playerview_container", "id"));
        this.f16718D = (MyImageView) inflate.findViewById(v.a(getContext(), "mbridge_my_big_img", "id"));
        this.f16719E = (ProgressBar) inflate.findViewById(v.a(getContext(), "mbridge_native_pb", "id"));
        this.f16715A = (RelativeLayout) inflate.findViewById(v.a(getContext(), "mbridge_nativex_webview_layout", "id"));
        this.f16716B = (WindVaneWebViewForNV) inflate.findViewById(v.a(getContext(), "mbridge_nativex_webview_layout_webview", "id"));
        this.f16757z.setClickable(true);
        addView(inflate, -1, -1);
    }

    public static /* synthetic */ void d(BaseMBMediaView baseMBMediaView) {
        CampaignEx.b mediaViewHolder;
        CampaignEx campaignEx = baseMBMediaView.O;
        if (campaignEx == null || (mediaViewHolder = campaignEx.getMediaViewHolder()) == null || mediaViewHolder.f15530k || baseMBMediaView.O.getNativeVideoTracking() == null || baseMBMediaView.O.getNativeVideoTracking().t() == null) {
            return;
        }
        mediaViewHolder.f15530k = true;
        Context context = baseMBMediaView.getContext();
        CampaignEx campaignEx2 = baseMBMediaView.O;
        com.mbridge.msdk.click.a.a(context, campaignEx2, campaignEx2.getCampaignUnitId(), baseMBMediaView.O.getNativeVideoTracking().t(), false, false);
    }

    public static /* synthetic */ void p(BaseMBMediaView baseMBMediaView) {
        try {
            ProgressBar progressBar = baseMBMediaView.f16725K;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
        } catch (Exception e4) {
            ad.b(TAG, e4.getMessage());
        }
    }

    public final void b(String str) {
        try {
            if (TextUtils.isEmpty(str) || this.f16748o.contains(str)) {
                return;
            }
            this.f16748o.add(str);
            OnMBMediaViewListenerPlus onMBMediaViewListenerPlus = this.ae;
            if (onMBMediaViewListenerPlus != null) {
                onMBMediaViewListenerPlus.onVideoComplete();
            }
        } catch (Exception e4) {
            ad.b(TAG, e4.getMessage());
        }
    }

    public static /* synthetic */ void m(BaseMBMediaView baseMBMediaView) {
        try {
            ProgressBar progressBar = baseMBMediaView.f16719E;
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
        } catch (Exception e4) {
            ad.b(TAG, e4.getMessage());
        }
    }

    private void a(Context context) {
        try {
            d();
            c();
            this.am = context;
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
        }
    }

    public static /* synthetic */ void n(BaseMBMediaView baseMBMediaView) {
        try {
            ProgressBar progressBar = baseMBMediaView.f16725K;
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
        } catch (Exception e4) {
            ad.b(TAG, e4.getMessage());
        }
    }

    private void b(View view) {
        if (view == null) {
            return;
        }
        try {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
            layoutParams.width = -1;
            if (this.f16745j) {
                layoutParams.height = -1;
            } else {
                layoutParams.height = (((int) B()) * 9) / 16;
                layoutParams.addRule(13);
            }
            view.setLayoutParams(layoutParams);
        } catch (Exception e4) {
            ad.b(TAG, e4.getMessage());
        }
    }

    public static /* synthetic */ void o(BaseMBMediaView baseMBMediaView) {
        try {
            ProgressBar progressBar = baseMBMediaView.f16719E;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
        } catch (Exception e4) {
            ad.b(TAG, e4.getMessage());
        }
    }

    public final void a(String str) {
        try {
            if (TextUtils.isEmpty(str) || this.f16747n.contains(str)) {
                return;
            }
            this.f16747n.add(str);
            OnMBMediaViewListener onMBMediaViewListener = this.ad;
            if (onMBMediaViewListener != null) {
                onMBMediaViewListener.onVideoStart();
            }
            OnMBMediaViewListenerPlus onMBMediaViewListenerPlus = this.ae;
            if (onMBMediaViewListenerPlus != null) {
                onMBMediaViewListenerPlus.onVideoStart();
            }
        } catch (Exception e4) {
            ad.b(TAG, e4.getMessage());
        }
    }

    private boolean c(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    public static /* synthetic */ void c(BaseMBMediaView baseMBMediaView, Campaign campaign, String str) {
        try {
            OnMBMediaViewListener onMBMediaViewListener = baseMBMediaView.ad;
            if (onMBMediaViewListener != null) {
                onMBMediaViewListener.onFinishRedirection(campaign, str);
            }
            OnMBMediaViewListenerPlus onMBMediaViewListenerPlus = baseMBMediaView.ae;
            if (onMBMediaViewListenerPlus != null) {
                onMBMediaViewListenerPlus.onFinishRedirection(campaign, str);
            }
        } catch (Exception e4) {
            ad.b(TAG, e4.getMessage());
        }
    }

    public static /* synthetic */ void h(BaseMBMediaView baseMBMediaView) {
        try {
            MediaViewPlayerView mediaViewPlayerView = baseMBMediaView.f16755x;
            if (mediaViewPlayerView == null) {
                return;
            }
            mediaViewPlayerView.onClickPlayerView();
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
        }
    }

    private a a(boolean z8) {
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
                this.f16716B.setWebViewClient(new g(this));
                o();
                return aVar;
            }
            if (this.f16743h && this.ab != null) {
                if (an.b(this.O.getVideoUrlEncode()) && an.a(this.O.getImageUrl())) {
                    return a.VIDEO;
                }
                if (!an.b(this.O.getVideoUrlEncode()) || !an.b(this.O.getImageUrl())) {
                    return null;
                }
                if (j.a(this.ab, t())) {
                    return a.VIDEO;
                }
                a aVar2 = a.BIG_IMAGE;
                if (z8 && this.b) {
                    this.ab.b(new f(this));
                }
                return aVar2;
            }
            return a.BIG_IMAGE;
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
            return a.BIG_IMAGE;
        }
    }

    private void b(boolean z8) {
        try {
            int nvT2 = this.O.getNvT2();
            if (this.f16717C == null) {
                WindVaneWebViewForNV windVaneWebViewForNV = new WindVaneWebViewForNV(getContext());
                this.f16717C = windVaneWebViewForNV;
                windVaneWebViewForNV.setObject(this);
                this.f16717C.setBackListener(new com.mbridge.msdk.nativex.listener.b() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.6
                    @Override // com.mbridge.msdk.nativex.listener.b
                    public final void a() {
                        BaseMBMediaView.this.exitFullScreen();
                    }
                });
                this.f16717C.setWebViewListener(new com.mbridge.msdk.mbsignalcommon.b.b() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.7
                    @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
                    public final void a(WebView webView, String str) {
                        super.a(webView, str);
                        BaseMBMediaView.this.ag = true;
                    }

                    @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
                    public final void a(WebView webView, int i9, String str, String str2) {
                        super.a(webView, i9, str, str2);
                        BaseMBMediaView.this.ag = false;
                    }
                });
            }
            if (nvT2 != 3) {
                if (nvT2 == 4) {
                    this.ah = true;
                    CampaignEx campaignEx = this.O;
                    if (campaignEx != null) {
                        com.mbridge.msdk.foundation.same.g.a aVar = new com.mbridge.msdk.foundation.same.g.a(campaignEx);
                        aVar.a(this.O.getAppName());
                        this.f16717C.setDownloadListener(aVar);
                        this.f16717C.setFilter(new d());
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
                    this.ah = true;
                    this.f16717C.loadUrl(h5ResAddress);
                    return;
                }
                return;
            }
            String htmlContentFromUrl = HTMLResourceManager.getInstance().getHtmlContentFromUrl(str);
            if (an.b(htmlContentFromUrl)) {
                ad.a(TAG, "load html...");
                this.ah = true;
                this.f16717C.loadDataWithBaseURL(str, htmlContentFromUrl, "text/html", "UTF-8", null);
            }
        } catch (Exception e4) {
            ad.b(TAG, e4.getMessage());
        }
    }

    public BaseMBMediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = true;
        this.f16738c = true;
        this.f16739d = true;
        this.f16740e = true;
        this.f16741f = true;
        this.f16742g = false;
        this.f16743h = true;
        this.f16744i = false;
        this.f16745j = false;
        this.f16746k = false;
        this.l = true;
        this.m = true;
        this.f16747n = new ArrayList<>();
        this.f16748o = new ArrayList<>();
        this.f16749r = false;
        this.f16750s = false;
        this.f16751t = null;
        this.f16752u = null;
        this.f16753v = null;
        this.f16754w = 0;
        this.f16737a = false;
        this.ab = null;
        this.ac = null;
        this.ag = false;
        this.ah = false;
        this.al = false;
        this.an = false;
        this.ao = new Runnable() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.9
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (!BaseMBMediaView.this.f16744i) {
                        BaseMBMediaView baseMBMediaView = BaseMBMediaView.this;
                        if (!baseMBMediaView.a((View) baseMBMediaView)) {
                            BaseMBMediaView.R(BaseMBMediaView.this);
                        } else {
                            BaseMBMediaView.S(BaseMBMediaView.this);
                        }
                    }
                    BaseMBMediaView.this.f16728N.postDelayed(this, 300L);
                } catch (Exception e4) {
                    ad.b(BaseMBMediaView.TAG, e4.getMessage());
                }
            }
        };
        a(context);
    }

    public static /* synthetic */ void q(BaseMBMediaView baseMBMediaView) {
        CampaignEx campaignEx = baseMBMediaView.O;
        if (campaignEx == null || campaignEx.getMediaViewHolder() == null || baseMBMediaView.O.getMediaViewHolder().f15523d || TextUtils.isEmpty(baseMBMediaView.O.getCampaignUnitId()) || baseMBMediaView.O.getNativeVideoTracking() == null || baseMBMediaView.O.getNativeVideoTracking().o() == null) {
            return;
        }
        baseMBMediaView.O.getMediaViewHolder().f15523d = true;
        Context context = baseMBMediaView.getContext();
        CampaignEx campaignEx2 = baseMBMediaView.O;
        com.mbridge.msdk.click.a.a(context, campaignEx2, campaignEx2.getCampaignUnitId(), baseMBMediaView.O.getNativeVideoTracking().o(), false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(View view) {
        try {
            return !aq.a(view, this.O == null ? 0 : r1.getImpReportType());
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
            return false;
        }
    }

    public final void a() {
        WindowInsets rootWindowInsets;
        BitmapDrawable a6;
        CampaignEx campaignEx;
        try {
            if (getRootView() != null && (getRootView() instanceof ViewGroup)) {
                BaseView.a handleViewStyleResult = handleViewStyleResult(getContext());
                if (handleViewStyleResult == null) {
                    return;
                }
                BaseView fullScreenViewByStyle = getFullScreenViewByStyle(getContext(), handleViewStyleResult);
                this.f16721G = fullScreenViewByStyle;
                if (fullScreenViewByStyle != null && y()) {
                    com.mbridge.msdk.nativex.view.mbfullview.a a9 = com.mbridge.msdk.nativex.view.mbfullview.a.a(getContext());
                    BaseView baseView = this.f16721G;
                    a9.a(baseView.style, this.O, baseView);
                    this.f16744i = true;
                    this.f16750s = false;
                    MediaViewPlayerView mediaViewPlayerView = this.f16755x;
                    if (mediaViewPlayerView != null) {
                        mediaViewPlayerView.setEnterFullScreen();
                        this.f16755x.setIsActivePause(false);
                    }
                    try {
                        OnMBMediaViewListener onMBMediaViewListener = this.ad;
                        if (onMBMediaViewListener != null) {
                            onMBMediaViewListener.onEnterFullscreen();
                        }
                        OnMBMediaViewListenerPlus onMBMediaViewListenerPlus = this.ae;
                        if (onMBMediaViewListenerPlus != null) {
                            onMBMediaViewListenerPlus.onEnterFullscreen();
                        }
                        P5.b bVar = this.f16753v;
                        if (bVar != null) {
                            P5.c cVar = P5.c.FULLSCREEN;
                            k kVar = bVar.f2431a;
                            R2.b.b(kVar);
                            JSONObject jSONObject = new JSONObject();
                            U5.b.b(jSONObject, "state", cVar);
                            kVar.f2232e.c("playerStateChange", jSONObject);
                        }
                    } catch (Exception e4) {
                        ad.b(TAG, e4.getMessage());
                    }
                    FrameLayout frameLayout = (FrameLayout) getRootView().findViewById(R.id.content);
                    RelativeLayout relativeLayout = new RelativeLayout(getContext());
                    this.f16720F = relativeLayout;
                    relativeLayout.setClickable(true);
                    ViewGroup viewGroup = (ViewGroup) this.f16755x.getParent();
                    int childCount = viewGroup.getChildCount();
                    int i9 = 0;
                    while (i9 < childCount && viewGroup.getChildAt(i9) != this.f16755x) {
                        i9++;
                    }
                    this.f16727M = i9;
                    FrameLayout frameLayout2 = new FrameLayout(getContext());
                    frameLayout2.setId(100);
                    viewGroup.addView(frameLayout2, i9, new ViewGroup.LayoutParams(getWidth(), getHeight()));
                    viewGroup.removeView(this.f16755x);
                    ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    relativeLayout.setId(101);
                    new RelativeLayout.LayoutParams(-1, -1);
                    this.f16726L.addView(this.f16755x, new RelativeLayout.LayoutParams(-1, -1));
                    if (this.f16726L != null && (campaignEx = this.O) != null && campaignEx.getPrivacyButtonTemplateVisibility() != 0) {
                        try {
                            MBAdChoice mBAdChoice = new MBAdChoice(com.mbridge.msdk.foundation.controller.c.m().c());
                            mBAdChoice.setCampaign(this.O);
                            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 12.0f), ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 12.0f));
                            layoutParams2.addRule(11);
                            layoutParams2.addRule(12);
                            this.f16726L.addView(mBAdChoice, layoutParams2);
                        } catch (Exception e9) {
                            e9.printStackTrace();
                        }
                    }
                    if (this.f16737a && frameLayout != null && (a6 = com.mbridge.msdk.foundation.controller.c.m().a(p(), this.O.getAdType())) != null) {
                        ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.m().c());
                        ai.a(imageView, a6, getResources().getDisplayMetrics());
                        this.f16721G.addView(imageView, new RelativeLayout.LayoutParams(-1, -1));
                    }
                    frameLayout.addView(relativeLayout, layoutParams);
                    int i10 = AnonymousClass10.f16759a[this.f16721G.style.ordinal()] != 2 ? ViewCompat.MEASURED_STATE_MASK : -1;
                    int i11 = this.f16754w;
                    if (i11 != 0) {
                        relativeLayout.setBackgroundColor(i11);
                    } else {
                        relativeLayout.setBackgroundColor(i10);
                    }
                    this.f16721G.setId(103);
                    RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
                    int[] iArr = new int[2];
                    frameLayout.getLocationInWindow(iArr);
                    int i12 = iArr[1];
                    this.af = i12;
                    if (i12 == 0 && (rootWindowInsets = getRootWindowInsets()) != null) {
                        layoutParams3.setMargins(0, rootWindowInsets.getStableInsetTop(), 0, 0);
                    }
                    relativeLayout.addView(this.f16721G, layoutParams3);
                    try {
                        z();
                        a(this.f16722H, B(), C());
                        com.mbridge.msdk.nativex.view.mbfullview.a.a(getContext()).a(this.f16721G, this.f16745j);
                        if (this.f16745j) {
                            E();
                        } else {
                            D();
                        }
                        this.f16728N.postDelayed(new Runnable() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.5
                            @Override // java.lang.Runnable
                            public final void run() {
                                BaseMBMediaView.this.f16750s = true;
                                if (BaseMBMediaView.this.f16744i) {
                                    TextView unused = BaseMBMediaView.this.f16724J;
                                }
                            }
                        }, 3000L);
                    } catch (Throwable th) {
                        ad.b(TAG, th.getMessage());
                    }
                    try {
                        this.f16720F.setFocusableInTouchMode(true);
                        this.f16720F.requestFocus();
                        this.f16720F.setOnKeyListener(new View.OnKeyListener() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.18
                            @Override // android.view.View.OnKeyListener
                            public final boolean onKey(View view, int i13, KeyEvent keyEvent) {
                                try {
                                    if (keyEvent.getKeyCode() == 4) {
                                        BaseMBMediaView.this.x();
                                        return true;
                                    }
                                    return false;
                                } catch (Throwable th2) {
                                    ad.b(BaseMBMediaView.TAG, th2.getMessage());
                                    return false;
                                }
                            }
                        });
                        this.f16720F.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.2
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                BaseMBMediaView.h(BaseMBMediaView.this);
                            }
                        });
                        this.f16723I.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.3
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                BaseMBMediaView.this.x();
                            }
                        });
                        this.f16724J.setOnClickListener(new com.mbridge.msdk.widget.a() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.4
                            @Override // com.mbridge.msdk.widget.a
                            public final void a(View view) {
                                try {
                                    BaseMBMediaView.this.b(view.getContext());
                                    if (BaseMBMediaView.this.f16753v != null) {
                                        try {
                                            BaseMBMediaView.this.f16753v.a();
                                            ad.a("omsdk", "bmnv adUserInteraction click");
                                        } catch (Exception e10) {
                                            ad.b("omsdk", e10.getMessage());
                                        }
                                    }
                                } catch (Exception e11) {
                                    ad.b(BaseMBMediaView.TAG, e11.getMessage());
                                }
                            }
                        });
                    } catch (Exception e10) {
                        ad.b(TAG, e10.getMessage());
                    }
                    MediaViewPlayerView mediaViewPlayerView2 = this.f16755x;
                    if (mediaViewPlayerView2 != null) {
                        mediaViewPlayerView2.openSound();
                        MediaViewPlayerView mediaViewPlayerView3 = this.f16755x;
                        mediaViewPlayerView3.setMediaViewPlayListener(new MediaViewPlayerView.a(mediaViewPlayerView3) { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.16
                            @Override // com.mbridge.msdk.nativex.view.MediaViewPlayerView.a
                            public final void a() {
                                int nvT2 = BaseMBMediaView.this.O.getNvT2();
                                if (BaseMBMediaView.this.f16744i && (nvT2 == 3 || nvT2 == 4)) {
                                    WindVaneWebViewForNV G3 = BaseMBMediaView.this.G();
                                    if (G3 != null) {
                                        View w2 = BaseMBMediaView.this.w();
                                        if (w2 == null) {
                                            super.a();
                                            return;
                                        }
                                        if (nvT2 == 3 && BaseMBMediaView.this.ag) {
                                            com.mbridge.msdk.nativex.view.mbfullview.a.a(BaseMBMediaView.this.getContext()).a(w2, BaseMBMediaView.this.f16721G);
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
                                                } catch (Exception e11) {
                                                    e11.printStackTrace();
                                                }
                                            }
                                        } else if (nvT2 == 4) {
                                            com.mbridge.msdk.nativex.view.mbfullview.a.a(BaseMBMediaView.this.getContext()).a(w2, BaseMBMediaView.this.f16721G);
                                            String clickURL = BaseMBMediaView.this.O.getClickURL();
                                            if (!TextUtils.isEmpty(clickURL)) {
                                                com.mbridge.msdk.click.a.a(BaseMBMediaView.this.getContext(), BaseMBMediaView.this.O, BaseMBMediaView.this.p(), BaseMBMediaView.this.getAddNVT2ToNoticeURL(), true, false, com.mbridge.msdk.click.a.a.f14773i);
                                                BaseMBMediaView.this.f16717C.loadUrl(clickURL);
                                            }
                                        } else {
                                            super.a();
                                            return;
                                        }
                                        G3.webViewShow(BaseMBMediaView.this.O, BaseMBMediaView.this.p());
                                        G3.orientation(BaseMBMediaView.this.f16745j);
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
                    if (campaignEx2 == null || campaignEx2.getMediaViewHolder() == null || this.O.getMediaViewHolder().f15524e || TextUtils.isEmpty(this.O.getCampaignUnitId()) || this.O.getNativeVideoTracking() == null || this.O.getNativeVideoTracking().c() == null) {
                        return;
                    }
                    this.O.getMediaViewHolder().f15524e = true;
                    F();
                    return;
                }
                return;
            }
            ad.c(TAG, "rootView is null");
        } catch (Exception e11) {
            ad.b(TAG, e11.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context) {
        try {
            try {
                OnMBMediaViewListener onMBMediaViewListener = this.ad;
                if (onMBMediaViewListener != null) {
                    onMBMediaViewListener.onVideoAdClicked(this.O);
                }
                OnMBMediaViewListenerPlus onMBMediaViewListenerPlus = this.ae;
                if (onMBMediaViewListenerPlus != null) {
                    onMBMediaViewListenerPlus.onVideoAdClicked(this.O);
                }
            } catch (Exception e4) {
                ad.b(TAG, e4.getMessage());
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
                    public final void onDownloadProgress(int i9) {
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
                        } catch (Exception e9) {
                            ad.b(BaseMBMediaView.TAG, e9.getMessage());
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
                        } catch (Exception e9) {
                            ad.b(BaseMBMediaView.TAG, e9.getMessage());
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
                        } catch (Exception e9) {
                            ad.b(BaseMBMediaView.TAG, e9.getMessage());
                        }
                    }
                });
                aVar.a(this.O);
            }
        } catch (Exception e9) {
            ad.b(TAG, e9.getMessage());
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
        if (!mediaViewHolder.l && baseMBMediaView.ac == a.VIDEO && an.b(baseMBMediaView.O.getImpressionURL())) {
            mediaViewHolder.l = true;
            String impressionURL = baseMBMediaView.O.getImpressionURL();
            if (!impressionURL.contains("is_video=1")) {
                StringBuilder sb = new StringBuilder(impressionURL);
                if (impressionURL.contains("?")) {
                    sb.append("&is_video=1");
                } else {
                    sb.append("?is_video=1");
                }
                impressionURL = sb.toString();
            }
            Context context = baseMBMediaView.getContext();
            CampaignEx campaignEx2 = baseMBMediaView.O;
            com.mbridge.msdk.click.a.a(context, campaignEx2, campaignEx2.getCampaignUnitId(), impressionURL, false, true, com.mbridge.msdk.click.a.a.f14771g);
        }
    }

    public static /* synthetic */ void b(BaseMBMediaView baseMBMediaView, Campaign campaign, String str) {
        try {
            OnMBMediaViewListener onMBMediaViewListener = baseMBMediaView.ad;
            if (onMBMediaViewListener != null) {
                onMBMediaViewListener.onRedirectionFailed(campaign, str);
            }
            OnMBMediaViewListenerPlus onMBMediaViewListenerPlus = baseMBMediaView.ae;
            if (onMBMediaViewListenerPlus != null) {
                onMBMediaViewListenerPlus.onRedirectionFailed(campaign, str);
            }
        } catch (Exception e4) {
            ad.b(TAG, e4.getMessage());
        }
    }

    private void a(View view, float f9, float f10) {
        if (view == null) {
            return;
        }
        try {
            double d2 = this.f16731R;
            double d9 = 0.0d;
            if (d2 > 0.0d) {
                double d10 = this.f16732S;
                if (d10 > 0.0d) {
                    double d11 = d2 / d10;
                    if (f9 > 0.0f && f10 > 0.0f) {
                        d9 = f9 / f10;
                    }
                    double a6 = ai.a(Double.valueOf(d11));
                    double a9 = ai.a(Double.valueOf(d9));
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f16756y.getLayoutParams();
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) view.getLayoutParams();
                    boolean z8 = c(getContext()) && this.f16745j;
                    int i9 = -1;
                    if (a6 > a9) {
                        double d12 = (f9 * this.f16732S) / this.f16731R;
                        layoutParams2.width = -1;
                        if (!z8) {
                            i9 = (int) d12;
                        }
                        layoutParams2.height = i9;
                        layoutParams2.addRule(13);
                        layoutParams.width = this.f16730Q;
                        layoutParams.height = (int) d12;
                        layoutParams.addRule(13);
                    } else if (a6 < a9) {
                        double d13 = f10 * d11;
                        layoutParams2.width = z8 ? -1 : (int) d13;
                        layoutParams2.height = -1;
                        layoutParams2.addRule(13);
                        layoutParams.width = (int) d13;
                        layoutParams.height = this.f16729P;
                        layoutParams.addRule(13);
                    } else {
                        layoutParams2.width = -1;
                        layoutParams2.height = -1;
                        layoutParams.width = this.f16730Q;
                        layoutParams.height = this.f16729P;
                        layoutParams.addRule(13);
                    }
                    if (!this.f16744i) {
                        this.f16756y.setLayoutParams(layoutParams);
                    }
                    view.setLayoutParams(layoutParams2);
                    return;
                }
            }
            b(view);
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
        }
    }

    private String a(int i9) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i9);
            String jSONObject2 = jSONObject.toString();
            if (TextUtils.isEmpty(jSONObject2)) {
                return "";
            }
            return Base64.encodeToString(jSONObject2.getBytes(), 2);
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
        } catch (Exception e4) {
            ad.b(TAG, e4.getMessage());
            return null;
        }
    }

    public static /* synthetic */ void a(BaseMBMediaView baseMBMediaView, Campaign campaign, String str) {
        try {
            OnMBMediaViewListener onMBMediaViewListener = baseMBMediaView.ad;
            if (onMBMediaViewListener != null) {
                onMBMediaViewListener.onStartRedirection(campaign, str);
            }
            OnMBMediaViewListenerPlus onMBMediaViewListenerPlus = baseMBMediaView.ae;
            if (onMBMediaViewListenerPlus != null) {
                onMBMediaViewListenerPlus.onStartRedirection(campaign, str);
            }
        } catch (Exception e4) {
            ad.b(TAG, e4.getMessage());
        }
    }

    public static /* synthetic */ void a(BaseMBMediaView baseMBMediaView, String str) {
        n nVar;
        try {
            o a6 = o.a(com.mbridge.msdk.foundation.db.g.a(baseMBMediaView.getContext()));
            if (!TextUtils.isEmpty(baseMBMediaView.O.getNoticeUrl())) {
                int l = z.l(baseMBMediaView.getContext());
                nVar = new n("2000021", l, baseMBMediaView.O.getNoticeUrl(), str, z.a(baseMBMediaView.getContext(), l));
            } else if (TextUtils.isEmpty(baseMBMediaView.O.getClickURL())) {
                nVar = null;
            } else {
                int l2 = z.l(baseMBMediaView.getContext());
                nVar = new n("2000021", l2, baseMBMediaView.O.getClickURL(), str, z.a(baseMBMediaView.getContext(), l2));
            }
            if (nVar != null) {
                nVar.e(baseMBMediaView.O.getId());
                nVar.m(baseMBMediaView.O.getVideoUrlEncode());
                nVar.h(str);
                nVar.f(baseMBMediaView.O.getRequestId());
                nVar.g(baseMBMediaView.O.getRequestIdNotice());
                nVar.c(baseMBMediaView.p());
                a6.a(nVar);
            }
        } catch (Exception e4) {
            ad.b(TAG, e4.getMessage());
        }
    }
}

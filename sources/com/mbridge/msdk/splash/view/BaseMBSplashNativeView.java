package com.mbridge.msdk.splash.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ac;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.shake.MBShakeView;
import com.mbridge.msdk.shake.b;
import com.mbridge.msdk.splash.view.nativeview.MBNoRecycledCrashImageView;
import com.mbridge.msdk.splash.view.nativeview.MBSplashClickView;
import com.mbridge.msdk.widget.FeedBackButton;

/* loaded from: classes3.dex */
public class BaseMBSplashNativeView extends RelativeLayout {

    /* renamed from: A, reason: collision with root package name */
    private MBNoRecycledCrashImageView f17974A;

    /* renamed from: B, reason: collision with root package name */
    private TextView f17975B;

    /* renamed from: C, reason: collision with root package name */
    private MBNoRecycledCrashImageView f17976C;

    /* renamed from: D, reason: collision with root package name */
    private TextView f17977D;

    /* renamed from: E, reason: collision with root package name */
    private TextView f17978E;

    /* renamed from: F, reason: collision with root package name */
    private int f17979F;

    /* renamed from: G, reason: collision with root package name */
    private int f17980G;

    /* renamed from: H, reason: collision with root package name */
    private int f17981H;

    /* renamed from: I, reason: collision with root package name */
    private int f17982I;

    /* renamed from: J, reason: collision with root package name */
    private int f17983J;

    /* renamed from: K, reason: collision with root package name */
    private int f17984K;

    /* renamed from: L, reason: collision with root package name */
    private float f17985L;

    /* renamed from: M, reason: collision with root package name */
    private float f17986M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f17987N;
    private boolean O;

    /* renamed from: P, reason: collision with root package name */
    private String f17988P;

    /* renamed from: Q, reason: collision with root package name */
    private String f17989Q;

    /* renamed from: R, reason: collision with root package name */
    private String f17990R;

    /* renamed from: S, reason: collision with root package name */
    private String f17991S;

    /* renamed from: a, reason: collision with root package name */
    protected TextView f17992a;
    protected RelativeLayout b;

    /* renamed from: c, reason: collision with root package name */
    protected TextView f17993c;

    /* renamed from: d, reason: collision with root package name */
    protected TextView f17994d;

    /* renamed from: e, reason: collision with root package name */
    protected TextView f17995e;

    /* renamed from: f, reason: collision with root package name */
    protected TextView f17996f;

    /* renamed from: g, reason: collision with root package name */
    protected MBSplashClickView f17997g;

    /* renamed from: h, reason: collision with root package name */
    protected int f17998h;

    /* renamed from: i, reason: collision with root package name */
    protected int f17999i;

    /* renamed from: j, reason: collision with root package name */
    protected int f18000j;

    /* renamed from: k, reason: collision with root package name */
    protected int f18001k;
    protected int l;
    protected boolean m;

    /* renamed from: n, reason: collision with root package name */
    protected boolean f18002n;

    /* renamed from: o, reason: collision with root package name */
    protected boolean f18003o;

    /* renamed from: p, reason: collision with root package name */
    protected String f18004p;

    /* renamed from: q, reason: collision with root package name */
    protected MBSplashView f18005q;

    /* renamed from: r, reason: collision with root package name */
    protected CampaignEx f18006r;

    /* renamed from: s, reason: collision with root package name */
    protected MBShakeView f18007s;

    /* renamed from: t, reason: collision with root package name */
    protected b f18008t;

    /* renamed from: u, reason: collision with root package name */
    private MBNoRecycledCrashImageView f18009u;

    /* renamed from: v, reason: collision with root package name */
    private MBNoRecycledCrashImageView f18010v;

    /* renamed from: w, reason: collision with root package name */
    private RelativeLayout f18011w;

    /* renamed from: x, reason: collision with root package name */
    private ImageView f18012x;

    /* renamed from: y, reason: collision with root package name */
    private FeedBackButton f18013y;

    /* renamed from: z, reason: collision with root package name */
    private RelativeLayout f18014z;

    public BaseMBSplashNativeView(Context context) {
        super(context);
        this.f18002n = false;
        this.f18003o = false;
    }

    public static /* synthetic */ void f(BaseMBSplashNativeView baseMBSplashNativeView) {
        if (!TextUtils.isEmpty(baseMBSplashNativeView.f18006r.getIconUrl())) {
            com.mbridge.msdk.foundation.same.c.b.a(c.m().c()).a(baseMBSplashNativeView.f18006r.getIconUrl(), new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.splash.view.BaseMBSplashNativeView.2
                @Override // com.mbridge.msdk.foundation.same.c.c
                public final void onFailedLoad(String str, String str2) {
                    BaseMBSplashNativeView.this.f17974A.setVisibility(4);
                }

                @Override // com.mbridge.msdk.foundation.same.c.c
                public final void onSuccessLoad(Bitmap bitmap, String str) {
                    Bitmap a6;
                    if (bitmap != null) {
                        try {
                            if (!bitmap.isRecycled()) {
                                try {
                                    if (BaseMBSplashNativeView.this.f17974A != null && (a6 = ac.a(bitmap, 1, ai.a(c.m().c(), 40.0f))) != null && !a6.isRecycled()) {
                                        BaseMBSplashNativeView.this.f17974A.setImageBitmap(a6);
                                    }
                                } catch (Throwable th) {
                                    ad.b("MBSplashNativeView", th.getMessage());
                                    BaseMBSplashNativeView.this.f17974A.setImageBitmap(bitmap);
                                }
                            }
                        } catch (Throwable th2) {
                            ad.b("MBSplashNativeView", th2.getMessage());
                        }
                    }
                }
            });
        } else {
            baseMBSplashNativeView.f17974A.setVisibility(4);
        }
    }

    public void a() {
    }

    public void b() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            if (this.f18000j == 1 && this.f18007s != null && this.f18008t != null) {
                com.mbridge.msdk.shake.a.a().a(this.f18008t);
            }
        } catch (Throwable th) {
            ad.b("MBSplashNativeView", th.getMessage());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f17985L = motionEvent.getRawX();
        this.f17986M = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void release() {
        try {
            if (this.f18008t != null) {
                com.mbridge.msdk.shake.a.a().b(this.f18008t);
                this.f18008t = null;
            }
            com.mbridge.msdk.foundation.d.b.a().c(this.f18004p);
            detachAllViewsFromParent();
        } catch (Exception e4) {
            ad.b("MBSplashNativeView", e4.getMessage());
        }
    }

    public void setIsPause(boolean z8) {
        this.f18002n = z8;
    }

    public void setNotchPadding(int i9, int i10, int i11, int i12) {
        try {
            RelativeLayout relativeLayout = this.f18011w;
            if (relativeLayout == null) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
            int i13 = this.f17984K;
            layoutParams.leftMargin = i9 + i13;
            layoutParams.rightMargin = i10 + i13;
            layoutParams.topMargin = i11 + i13;
            layoutParams.bottomMargin = i13 + i12;
        } catch (Throwable th) {
            ad.b("MBSplashNativeView", th.getMessage());
        }
    }

    public void updateCountDown(int i9) {
        String str;
        if (this.f17992a != null) {
            this.f17979F = i9;
            if (this.m) {
                str = this.f17990R + " " + i9 + this.f17989Q;
            } else {
                str = i9 + this.f17989Q + " " + this.f17991S;
            }
            this.f17992a.setText(str);
        }
    }

    public static /* synthetic */ void b(BaseMBSplashNativeView baseMBSplashNativeView, boolean z8) {
        if (baseMBSplashNativeView.f18005q.getSplashSignalCommunicationImpl() == null || baseMBSplashNativeView.f18005q.getSplashSignalCommunicationImpl().a() == null) {
            return;
        }
        baseMBSplashNativeView.f18005q.getSplashSignalCommunicationImpl().a().a(z8 ? 2 : 1, baseMBSplashNativeView.f17979F);
    }

    public BaseMBSplashNativeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(int i9) {
        if (this.f18005q.getSplashSignalCommunicationImpl() == null || this.f18005q.getSplashSignalCommunicationImpl().a() == null) {
            return;
        }
        try {
            this.f18005q.getSplashSignalCommunicationImpl().a().a(com.mbridge.msdk.splash.a.a.a.a(com.mbridge.msdk.splash.a.a.a.a(i9, this.f17985L, this.f17986M), this.f18006r));
        } catch (Throwable th) {
            ad.b("MBSplashNativeView", th.getMessage());
            this.f18005q.getSplashSignalCommunicationImpl().a().a(this.f18006r);
        }
    }

    public BaseMBSplashNativeView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f18002n = false;
        this.f18003o = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public BaseMBSplashNativeView(android.content.Context r11, com.mbridge.msdk.splash.view.MBSplashView r12, com.mbridge.msdk.splash.a.d r13) {
        /*
            Method dump skipped, instructions count: 1050
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.splash.view.BaseMBSplashNativeView.<init>(android.content.Context, com.mbridge.msdk.splash.view.MBSplashView, com.mbridge.msdk.splash.a.d):void");
    }
}

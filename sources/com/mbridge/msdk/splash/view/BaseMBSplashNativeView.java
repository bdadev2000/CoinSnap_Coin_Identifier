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

/* loaded from: classes4.dex */
public class BaseMBSplashNativeView extends RelativeLayout {
    private MBNoRecycledCrashImageView A;
    private TextView B;
    private MBNoRecycledCrashImageView C;
    private TextView D;
    private TextView E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private float L;
    private float M;
    private boolean N;
    private boolean O;
    private String P;
    private String Q;
    private String R;
    private String S;
    protected TextView a;

    /* renamed from: b, reason: collision with root package name */
    protected RelativeLayout f15268b;

    /* renamed from: c, reason: collision with root package name */
    protected TextView f15269c;

    /* renamed from: d, reason: collision with root package name */
    protected TextView f15270d;

    /* renamed from: e, reason: collision with root package name */
    protected TextView f15271e;

    /* renamed from: f, reason: collision with root package name */
    protected TextView f15272f;

    /* renamed from: g, reason: collision with root package name */
    protected MBSplashClickView f15273g;

    /* renamed from: h, reason: collision with root package name */
    protected int f15274h;

    /* renamed from: i, reason: collision with root package name */
    protected int f15275i;

    /* renamed from: j, reason: collision with root package name */
    protected int f15276j;

    /* renamed from: k, reason: collision with root package name */
    protected int f15277k;

    /* renamed from: l, reason: collision with root package name */
    protected int f15278l;

    /* renamed from: m, reason: collision with root package name */
    protected boolean f15279m;

    /* renamed from: n, reason: collision with root package name */
    protected boolean f15280n;

    /* renamed from: o, reason: collision with root package name */
    protected boolean f15281o;

    /* renamed from: p, reason: collision with root package name */
    protected String f15282p;

    /* renamed from: q, reason: collision with root package name */
    protected MBSplashView f15283q;

    /* renamed from: r, reason: collision with root package name */
    protected CampaignEx f15284r;

    /* renamed from: s, reason: collision with root package name */
    protected MBShakeView f15285s;

    /* renamed from: t, reason: collision with root package name */
    protected b f15286t;
    private MBNoRecycledCrashImageView u;

    /* renamed from: v, reason: collision with root package name */
    private MBNoRecycledCrashImageView f15287v;

    /* renamed from: w, reason: collision with root package name */
    private RelativeLayout f15288w;

    /* renamed from: x, reason: collision with root package name */
    private ImageView f15289x;

    /* renamed from: y, reason: collision with root package name */
    private FeedBackButton f15290y;

    /* renamed from: z, reason: collision with root package name */
    private RelativeLayout f15291z;

    public BaseMBSplashNativeView(Context context) {
        super(context);
        this.f15280n = false;
        this.f15281o = false;
    }

    public static /* synthetic */ void f(BaseMBSplashNativeView baseMBSplashNativeView) {
        if (!TextUtils.isEmpty(baseMBSplashNativeView.f15284r.getIconUrl())) {
            com.mbridge.msdk.foundation.same.c.b.a(c.m().c()).a(baseMBSplashNativeView.f15284r.getIconUrl(), new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.splash.view.BaseMBSplashNativeView.2
                @Override // com.mbridge.msdk.foundation.same.c.c
                public final void onFailedLoad(String str, String str2) {
                    BaseMBSplashNativeView.this.A.setVisibility(4);
                }

                @Override // com.mbridge.msdk.foundation.same.c.c
                public final void onSuccessLoad(Bitmap bitmap, String str) {
                    Bitmap a;
                    if (bitmap != null) {
                        try {
                            if (!bitmap.isRecycled()) {
                                try {
                                    if (BaseMBSplashNativeView.this.A != null && (a = ac.a(bitmap, 1, ai.a(c.m().c(), 40.0f))) != null && !a.isRecycled()) {
                                        BaseMBSplashNativeView.this.A.setImageBitmap(a);
                                    }
                                } catch (Throwable th2) {
                                    ad.b("MBSplashNativeView", th2.getMessage());
                                    BaseMBSplashNativeView.this.A.setImageBitmap(bitmap);
                                }
                            }
                        } catch (Throwable th3) {
                            ad.b("MBSplashNativeView", th3.getMessage());
                        }
                    }
                }
            });
        } else {
            baseMBSplashNativeView.A.setVisibility(4);
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
            if (this.f15276j == 1 && this.f15285s != null && this.f15286t != null) {
                com.mbridge.msdk.shake.a.a().a(this.f15286t);
            }
        } catch (Throwable th2) {
            ad.b("MBSplashNativeView", th2.getMessage());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.L = motionEvent.getRawX();
        this.M = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void release() {
        try {
            if (this.f15286t != null) {
                com.mbridge.msdk.shake.a.a().b(this.f15286t);
                this.f15286t = null;
            }
            com.mbridge.msdk.foundation.d.b.a().c(this.f15282p);
            detachAllViewsFromParent();
        } catch (Exception e2) {
            ad.b("MBSplashNativeView", e2.getMessage());
        }
    }

    public void setIsPause(boolean z10) {
        this.f15280n = z10;
    }

    public void setNotchPadding(int i10, int i11, int i12, int i13) {
        try {
            RelativeLayout relativeLayout = this.f15288w;
            if (relativeLayout == null) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
            int i14 = this.K;
            layoutParams.leftMargin = i10 + i14;
            layoutParams.rightMargin = i11 + i14;
            layoutParams.topMargin = i12 + i14;
            layoutParams.bottomMargin = i14 + i13;
        } catch (Throwable th2) {
            ad.b("MBSplashNativeView", th2.getMessage());
        }
    }

    public void updateCountDown(int i10) {
        String str;
        if (this.a != null) {
            this.F = i10;
            if (this.f15279m) {
                str = this.R + " " + i10 + this.Q;
            } else {
                str = i10 + this.Q + " " + this.S;
            }
            this.a.setText(str);
        }
    }

    public static /* synthetic */ void b(BaseMBSplashNativeView baseMBSplashNativeView, boolean z10) {
        if (baseMBSplashNativeView.f15283q.getSplashSignalCommunicationImpl() == null || baseMBSplashNativeView.f15283q.getSplashSignalCommunicationImpl().a() == null) {
            return;
        }
        baseMBSplashNativeView.f15283q.getSplashSignalCommunicationImpl().a().a(z10 ? 2 : 1, baseMBSplashNativeView.F);
    }

    public BaseMBSplashNativeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(int i10) {
        if (this.f15283q.getSplashSignalCommunicationImpl() == null || this.f15283q.getSplashSignalCommunicationImpl().a() == null) {
            return;
        }
        try {
            this.f15283q.getSplashSignalCommunicationImpl().a().a(com.mbridge.msdk.splash.a.a.a.a(com.mbridge.msdk.splash.a.a.a.a(i10, this.L, this.M), this.f15284r));
        } catch (Throwable th2) {
            ad.b("MBSplashNativeView", th2.getMessage());
            this.f15283q.getSplashSignalCommunicationImpl().a().a(this.f15284r);
        }
    }

    public BaseMBSplashNativeView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f15280n = false;
        this.f15281o = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03bd  */
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

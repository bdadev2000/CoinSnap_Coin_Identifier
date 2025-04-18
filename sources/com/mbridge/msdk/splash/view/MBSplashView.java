package com.mbridge.msdk.splash.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdError;
import com.mbridge.msdk.dycreator.listener.DyCountDownListener;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.ar;
import com.mbridge.msdk.foundation.tools.r;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.splash.signal.c;
import com.mbridge.msdk.splash.signal.d;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class MBSplashView extends RelativeLayout {
    private static String a = "MBSplashView";

    /* renamed from: b, reason: collision with root package name */
    private int f15316b;

    /* renamed from: c, reason: collision with root package name */
    private MBSplashWebview f15317c;

    /* renamed from: d, reason: collision with root package name */
    private a f15318d;

    /* renamed from: e, reason: collision with root package name */
    private ViewGroup f15319e;

    /* renamed from: f, reason: collision with root package name */
    private View f15320f;

    /* renamed from: g, reason: collision with root package name */
    private View f15321g;

    /* renamed from: h, reason: collision with root package name */
    private int f15322h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f15323i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f15324j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f15325k;

    /* renamed from: l, reason: collision with root package name */
    private ViewGroup f15326l;

    /* renamed from: m, reason: collision with root package name */
    private View f15327m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f15328n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f15329o;

    /* renamed from: p, reason: collision with root package name */
    private RelativeLayout.LayoutParams f15330p;

    /* renamed from: q, reason: collision with root package name */
    private c f15331q;

    /* renamed from: r, reason: collision with root package name */
    private DyCountDownListener f15332r;

    public MBSplashView(Context context) {
        this(context, null);
    }

    private void b() {
        setBackgroundColor(0);
        this.f15316b = getResources().getConfiguration().orientation;
    }

    private void c() {
        MBSplashWebview mBSplashWebview = this.f15317c;
        if (mBSplashWebview != null) {
            mBSplashWebview.setObject(this.f15331q);
            this.f15317c.post(new Runnable() { // from class: com.mbridge.msdk.splash.view.MBSplashView.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        ad.a(MBSplashView.a, "webviewshow");
                        String str = "";
                        try {
                            int[] iArr = new int[2];
                            MBSplashView.this.f15317c.getLocationOnScreen(iArr);
                            ad.b(MBSplashView.a, "coordinate:" + iArr[0] + "--" + iArr[1]);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("startX", ai.b(com.mbridge.msdk.foundation.controller.c.m().c(), (float) iArr[0]));
                            jSONObject.put("startY", ai.b(com.mbridge.msdk.foundation.controller.c.m().c(), (float) iArr[1]));
                            str = jSONObject.toString();
                        } catch (Throwable th2) {
                            ad.b(MBSplashView.a, th2.getMessage(), th2);
                        }
                        int[] iArr2 = new int[2];
                        MBSplashView.this.f15317c.getLocationInWindow(iArr2);
                        MBSplashView.transInfoForMraid(MBSplashView.this.f15317c, iArr2[0], iArr2[1], MBSplashView.this.f15317c.getWidth(), MBSplashView.this.f15317c.getHeight());
                        g.a().a((WebView) MBSplashView.this.f15317c, "webviewshow", Base64.encodeToString(str.toString().getBytes(), 2));
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            });
        }
    }

    public static void transInfoForMraid(WebView webView, int i10, int i11, int i12, int i13) {
        String str;
        ad.b(a, "transInfoForMraid");
        try {
            int i14 = com.mbridge.msdk.foundation.controller.c.m().c().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            if (i14 == 2) {
                str = "landscape";
            } else if (i14 == 1) {
                str = "portrait";
            } else {
                str = AdError.UNDEFINED_DOMAIN;
            }
            jSONObject.put("orientation", str);
            jSONObject.put("locked", "true");
            float i15 = z.i(com.mbridge.msdk.foundation.controller.c.m().c());
            float g10 = z.g(com.mbridge.msdk.foundation.controller.c.m().c());
            HashMap h10 = z.h(com.mbridge.msdk.foundation.controller.c.m().c());
            int intValue = ((Integer) h10.get("width")).intValue();
            int intValue2 = ((Integer) h10.get("height")).intValue();
            HashMap hashMap = new HashMap();
            hashMap.put("placementType", "Interstitial");
            hashMap.put("state", "default");
            hashMap.put("viewable", "true");
            hashMap.put("currentAppOrientation", jSONObject);
            float f10 = i10;
            float f11 = i11;
            float f12 = i12;
            float f13 = i13;
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView, f10, f11, f12, f13);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(webView, f10, f11, f12, f13);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(webView, i15, g10);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().c(webView, intValue, intValue2);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView, hashMap);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView);
        } catch (Throwable th2) {
            ad.b(a, "transInfoForMraid", th2);
        }
    }

    public void changeCloseBtnState(int i10) {
        View view = this.f15320f;
        if (view != null) {
            if (i10 == 2) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    public void clearResState() {
        this.f15325k = false;
        this.f15324j = false;
        this.f15323i = false;
    }

    public void destroy() {
        removeAllViews();
        ViewGroup viewGroup = this.f15326l;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        MBSplashWebview mBSplashWebview = this.f15317c;
        if (mBSplashWebview != null && !mBSplashWebview.isDestoryed()) {
            this.f15317c.finishAdSession();
            d.a(this.f15317c, "onSystemDestory", "");
            this.f15317c.release();
            this.f15317c = null;
        }
    }

    public View getCloseView() {
        return this.f15320f;
    }

    public ViewGroup getDevContainer() {
        return this.f15326l;
    }

    public View getIconVg() {
        return this.f15321g;
    }

    public c getSplashSignalCommunicationImpl() {
        return this.f15331q;
    }

    public MBSplashWebview getSplashWebview() {
        return this.f15317c;
    }

    public boolean isAttach() {
        return this.f15329o;
    }

    public boolean isDynamicView() {
        return this.f15328n;
    }

    public boolean isH5Ready() {
        return this.f15323i;
    }

    public boolean isImageReady() {
        return this.f15325k;
    }

    public boolean isVideoReady() {
        return this.f15324j;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f15329o = true;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b();
    }

    public void onPause() {
        View view = this.f15327m;
        if (view != null && (view instanceof MBSplashNativeView)) {
            ((MBSplashNativeView) view).setIsPause(true);
        }
    }

    public void onResume() {
        View view = this.f15327m;
        if (view != null && (view instanceof MBSplashNativeView)) {
            ((MBSplashNativeView) view).setIsPause(false);
        }
    }

    public void resetLoadState() {
        this.f15324j = false;
        this.f15323i = false;
    }

    public void setAllowClickSplash(final boolean z10) {
        MBSplashWebview mBSplashWebview = this.f15317c;
        if (mBSplashWebview != null) {
            mBSplashWebview.setOnTouchListener(new View.OnTouchListener() { // from class: com.mbridge.msdk.splash.view.MBSplashView.2
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return !z10;
                }
            });
        }
        setOnTouchListener(new View.OnTouchListener() { // from class: com.mbridge.msdk.splash.view.MBSplashView.3
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return !z10;
            }
        });
    }

    public void setCloseView(View view) {
        this.f15320f = view;
        if (view != null) {
            view.setContentDescription("closeButton");
        }
    }

    public void setDevContainer(ViewGroup viewGroup) {
        this.f15326l = viewGroup;
    }

    public void setDyCountDownListener(DyCountDownListener dyCountDownListener) {
        this.f15332r = dyCountDownListener;
    }

    public void setDynamicView(boolean z10) {
        this.f15328n = z10;
    }

    public void setH5Ready(boolean z10) {
        this.f15323i = z10;
    }

    public void setIconVg(View view, RelativeLayout.LayoutParams layoutParams) {
        this.f15321g = view;
        this.f15330p = layoutParams;
    }

    public void setImageReady(boolean z10) {
        this.f15325k = z10;
    }

    public void setNotchPadding(int i10, int i11, int i12, int i13) {
        View view = this.f15327m;
        if (view != null && (view instanceof MBSplashNativeView)) {
            ((MBSplashNativeView) view).setNotchPadding(i10, i11, i12, i13);
        }
        if (this.f15317c != null) {
            g.a().a((WebView) this.f15317c, "oncutoutfetched", Base64.encodeToString(r.a(-999, i10, i11, i12, i13).getBytes(), 0));
        }
    }

    public void setSplashNativeView(View view) {
        if (view != null) {
            this.f15327m = view;
        }
    }

    public void setSplashSignalCommunicationImpl(c cVar) {
        this.f15331q = cVar;
        MBSplashWebview mBSplashWebview = this.f15317c;
        if (mBSplashWebview != null) {
            mBSplashWebview.setObject(cVar);
        }
    }

    public void setSplashWebView() {
        if (this.f15317c == null) {
            try {
                MBSplashWebview mBSplashWebview = new MBSplashWebview(getContext());
                this.f15317c = mBSplashWebview;
                c cVar = this.f15331q;
                if (cVar != null) {
                    mBSplashWebview.setObject(cVar);
                }
                a aVar = this.f15318d;
                if (aVar != null) {
                    this.f15317c.setWebViewClient(aVar);
                    return;
                }
                a aVar2 = new a();
                this.f15318d = aVar2;
                this.f15317c.setWebViewClient(aVar2);
            } catch (Throwable th2) {
                ad.b(a, th2.getMessage());
            }
        }
    }

    public void setVideoReady(boolean z10) {
        this.f15324j = z10;
    }

    public void show() {
        View view;
        View view2;
        View view3;
        ViewGroup viewGroup;
        com.mbridge.msdk.splash.d.a a10;
        if (this.f15331q != null && (viewGroup = this.f15326l) != null && (viewGroup.getContext() instanceof Activity)) {
            this.f15331q.a(this.f15326l.getContext());
            a aVar = this.f15318d;
            if (aVar != null && (a10 = this.f15331q.a()) != null) {
                aVar.a = a10;
            }
        }
        if (this.f15321g == null) {
            if (this.f15328n && (view3 = this.f15327m) != null) {
                if (view3.getParent() != null) {
                    ar.a(this.f15327m);
                }
                addView(this.f15327m, new ViewGroup.LayoutParams(-1, -1));
            } else {
                MBSplashWebview mBSplashWebview = this.f15317c;
                if (mBSplashWebview != null && mBSplashWebview.getParent() == null) {
                    addView(this.f15317c, new ViewGroup.LayoutParams(-1, -1));
                }
                c();
            }
        } else {
            if (this.f15319e == null) {
                RelativeLayout relativeLayout = new RelativeLayout(getContext());
                this.f15319e = relativeLayout;
                relativeLayout.setId(2147482647);
            }
            if (this.f15316b == 2) {
                this.f15322h = ai.f(getContext());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(0, this.f15319e.getId());
                if (this.f15328n && (view2 = this.f15327m) != null) {
                    if (view2.getParent() != null) {
                        ar.a(this.f15327m);
                    }
                    addView(this.f15327m, layoutParams);
                } else {
                    MBSplashWebview mBSplashWebview2 = this.f15317c;
                    if (mBSplashWebview2 != null && mBSplashWebview2.getParent() == null) {
                        addView(this.f15317c, layoutParams);
                    }
                    c();
                }
                ViewGroup viewGroup2 = this.f15319e;
                if (viewGroup2 != null && viewGroup2.getParent() == null) {
                    int i10 = this.f15330p.width;
                    ar.a(this.f15321g);
                    int i11 = this.f15322h;
                    if (i10 > i11 / 4) {
                        i10 = i11 / 4;
                    }
                    this.f15319e.addView(this.f15321g, i10, -1);
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i10, -1);
                    layoutParams2.addRule(11);
                    layoutParams2.addRule(13);
                    addView(this.f15319e, layoutParams2);
                }
            } else {
                this.f15322h = ai.e(getContext());
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams3.addRule(2, this.f15319e.getId());
                if (this.f15328n && (view = this.f15327m) != null) {
                    if (view.getParent() != null) {
                        ar.a(this.f15327m);
                    }
                    addView(this.f15327m, layoutParams3);
                } else {
                    MBSplashWebview mBSplashWebview3 = this.f15317c;
                    if (mBSplashWebview3 != null && mBSplashWebview3.getParent() == null) {
                        addView(this.f15317c, layoutParams3);
                    }
                    c();
                }
                ViewGroup viewGroup3 = this.f15319e;
                if (viewGroup3 != null && viewGroup3.getParent() == null) {
                    int i12 = this.f15330p.height;
                    int i13 = this.f15322h;
                    if (i12 > i13 / 4) {
                        i12 = i13 / 4;
                    }
                    ar.a(this.f15321g);
                    this.f15319e.addView(this.f15321g, -1, i12);
                    RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, i12);
                    layoutParams4.addRule(12);
                    addView(this.f15319e, layoutParams4);
                }
            }
        }
        View view4 = this.f15320f;
        if (view4 != null) {
            if (view4.getParent() == null) {
                RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(ai.a(getContext(), 100.0f), ai.a(getContext(), 30.0f));
                layoutParams5.addRule(10);
                layoutParams5.addRule(11);
                layoutParams5.rightMargin = ai.a(getContext(), 10.0f);
                layoutParams5.topMargin = ai.a(getContext(), 10.0f);
                addView(this.f15320f, layoutParams5);
            } else {
                bringChildToFront(this.f15320f);
            }
        }
        clearResState();
    }

    public void updateCountdown(int i10) {
        DyCountDownListener dyCountDownListener;
        View view;
        if (this.f15317c != null && !this.f15328n) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("countdown", i10);
                g.a().a((WebView) this.f15317c, "updateCountdown", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        if (this.f15328n && (view = this.f15327m) != null && (view instanceof MBSplashNativeView)) {
            ((MBSplashNativeView) view).updateCountDown(i10);
        }
        if (this.f15328n && (dyCountDownListener = this.f15332r) != null) {
            dyCountDownListener.getCountDownValue(i10);
        }
    }

    public MBSplashView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MBSplashView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        b();
    }
}

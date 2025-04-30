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

/* loaded from: classes3.dex */
public class MBSplashView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private static String f18054a = "MBSplashView";
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private MBSplashWebview f18055c;

    /* renamed from: d, reason: collision with root package name */
    private a f18056d;

    /* renamed from: e, reason: collision with root package name */
    private ViewGroup f18057e;

    /* renamed from: f, reason: collision with root package name */
    private View f18058f;

    /* renamed from: g, reason: collision with root package name */
    private View f18059g;

    /* renamed from: h, reason: collision with root package name */
    private int f18060h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f18061i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f18062j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f18063k;
    private ViewGroup l;
    private View m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f18064n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f18065o;

    /* renamed from: p, reason: collision with root package name */
    private RelativeLayout.LayoutParams f18066p;

    /* renamed from: q, reason: collision with root package name */
    private c f18067q;

    /* renamed from: r, reason: collision with root package name */
    private DyCountDownListener f18068r;

    public MBSplashView(Context context) {
        this(context, null);
    }

    private void b() {
        setBackgroundColor(0);
        this.b = getResources().getConfiguration().orientation;
    }

    private void c() {
        MBSplashWebview mBSplashWebview = this.f18055c;
        if (mBSplashWebview != null) {
            mBSplashWebview.setObject(this.f18067q);
            this.f18055c.post(new Runnable() { // from class: com.mbridge.msdk.splash.view.MBSplashView.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        ad.a(MBSplashView.f18054a, "webviewshow");
                        String str = "";
                        try {
                            int[] iArr = new int[2];
                            MBSplashView.this.f18055c.getLocationOnScreen(iArr);
                            ad.b(MBSplashView.f18054a, "coordinate:" + iArr[0] + "--" + iArr[1]);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("startX", ai.b(com.mbridge.msdk.foundation.controller.c.m().c(), (float) iArr[0]));
                            jSONObject.put("startY", ai.b(com.mbridge.msdk.foundation.controller.c.m().c(), (float) iArr[1]));
                            str = jSONObject.toString();
                        } catch (Throwable th) {
                            ad.b(MBSplashView.f18054a, th.getMessage(), th);
                        }
                        int[] iArr2 = new int[2];
                        MBSplashView.this.f18055c.getLocationInWindow(iArr2);
                        MBSplashView.transInfoForMraid(MBSplashView.this.f18055c, iArr2[0], iArr2[1], MBSplashView.this.f18055c.getWidth(), MBSplashView.this.f18055c.getHeight());
                        g.a().a((WebView) MBSplashView.this.f18055c, "webviewshow", Base64.encodeToString(str.toString().getBytes(), 2));
                    } catch (Exception e4) {
                        e4.printStackTrace();
                    }
                }
            });
        }
    }

    public static void transInfoForMraid(WebView webView, int i9, int i10, int i11, int i12) {
        String str;
        ad.b(f18054a, "transInfoForMraid");
        try {
            int i13 = com.mbridge.msdk.foundation.controller.c.m().c().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            if (i13 == 2) {
                str = "landscape";
            } else if (i13 == 1) {
                str = "portrait";
            } else {
                str = AdError.UNDEFINED_DOMAIN;
            }
            jSONObject.put("orientation", str);
            jSONObject.put("locked", "true");
            float i14 = z.i(com.mbridge.msdk.foundation.controller.c.m().c());
            float g9 = z.g(com.mbridge.msdk.foundation.controller.c.m().c());
            HashMap h6 = z.h(com.mbridge.msdk.foundation.controller.c.m().c());
            int intValue = ((Integer) h6.get("width")).intValue();
            int intValue2 = ((Integer) h6.get("height")).intValue();
            HashMap hashMap = new HashMap();
            hashMap.put("placementType", "Interstitial");
            hashMap.put("state", "default");
            hashMap.put("viewable", "true");
            hashMap.put("currentAppOrientation", jSONObject);
            float f9 = i9;
            float f10 = i10;
            float f11 = i11;
            float f12 = i12;
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView, f9, f10, f11, f12);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(webView, f9, f10, f11, f12);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(webView, i14, g9);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().c(webView, intValue, intValue2);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView, hashMap);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView);
        } catch (Throwable th) {
            ad.b(f18054a, "transInfoForMraid", th);
        }
    }

    public void changeCloseBtnState(int i9) {
        View view = this.f18058f;
        if (view != null) {
            if (i9 == 2) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    public void clearResState() {
        this.f18063k = false;
        this.f18062j = false;
        this.f18061i = false;
    }

    public void destroy() {
        removeAllViews();
        ViewGroup viewGroup = this.l;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        MBSplashWebview mBSplashWebview = this.f18055c;
        if (mBSplashWebview != null && !mBSplashWebview.isDestoryed()) {
            this.f18055c.finishAdSession();
            d.a(this.f18055c, "onSystemDestory", "");
            this.f18055c.release();
            this.f18055c = null;
        }
    }

    public View getCloseView() {
        return this.f18058f;
    }

    public ViewGroup getDevContainer() {
        return this.l;
    }

    public View getIconVg() {
        return this.f18059g;
    }

    public c getSplashSignalCommunicationImpl() {
        return this.f18067q;
    }

    public MBSplashWebview getSplashWebview() {
        return this.f18055c;
    }

    public boolean isAttach() {
        return this.f18065o;
    }

    public boolean isDynamicView() {
        return this.f18064n;
    }

    public boolean isH5Ready() {
        return this.f18061i;
    }

    public boolean isImageReady() {
        return this.f18063k;
    }

    public boolean isVideoReady() {
        return this.f18062j;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f18065o = true;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b();
    }

    public void onPause() {
        View view = this.m;
        if (view != null && (view instanceof MBSplashNativeView)) {
            ((MBSplashNativeView) view).setIsPause(true);
        }
    }

    public void onResume() {
        View view = this.m;
        if (view != null && (view instanceof MBSplashNativeView)) {
            ((MBSplashNativeView) view).setIsPause(false);
        }
    }

    public void resetLoadState() {
        this.f18062j = false;
        this.f18061i = false;
    }

    public void setAllowClickSplash(final boolean z8) {
        MBSplashWebview mBSplashWebview = this.f18055c;
        if (mBSplashWebview != null) {
            mBSplashWebview.setOnTouchListener(new View.OnTouchListener() { // from class: com.mbridge.msdk.splash.view.MBSplashView.2
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return !z8;
                }
            });
        }
        setOnTouchListener(new View.OnTouchListener() { // from class: com.mbridge.msdk.splash.view.MBSplashView.3
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return !z8;
            }
        });
    }

    public void setCloseView(View view) {
        this.f18058f = view;
        if (view != null) {
            view.setContentDescription("closeButton");
        }
    }

    public void setDevContainer(ViewGroup viewGroup) {
        this.l = viewGroup;
    }

    public void setDyCountDownListener(DyCountDownListener dyCountDownListener) {
        this.f18068r = dyCountDownListener;
    }

    public void setDynamicView(boolean z8) {
        this.f18064n = z8;
    }

    public void setH5Ready(boolean z8) {
        this.f18061i = z8;
    }

    public void setIconVg(View view, RelativeLayout.LayoutParams layoutParams) {
        this.f18059g = view;
        this.f18066p = layoutParams;
    }

    public void setImageReady(boolean z8) {
        this.f18063k = z8;
    }

    public void setNotchPadding(int i9, int i10, int i11, int i12) {
        View view = this.m;
        if (view != null && (view instanceof MBSplashNativeView)) {
            ((MBSplashNativeView) view).setNotchPadding(i9, i10, i11, i12);
        }
        if (this.f18055c != null) {
            g.a().a((WebView) this.f18055c, "oncutoutfetched", Base64.encodeToString(r.a(-999, i9, i10, i11, i12).getBytes(), 0));
        }
    }

    public void setSplashNativeView(View view) {
        if (view != null) {
            this.m = view;
        }
    }

    public void setSplashSignalCommunicationImpl(c cVar) {
        this.f18067q = cVar;
        MBSplashWebview mBSplashWebview = this.f18055c;
        if (mBSplashWebview != null) {
            mBSplashWebview.setObject(cVar);
        }
    }

    public void setSplashWebView() {
        if (this.f18055c == null) {
            try {
                MBSplashWebview mBSplashWebview = new MBSplashWebview(getContext());
                this.f18055c = mBSplashWebview;
                c cVar = this.f18067q;
                if (cVar != null) {
                    mBSplashWebview.setObject(cVar);
                }
                a aVar = this.f18056d;
                if (aVar != null) {
                    this.f18055c.setWebViewClient(aVar);
                    return;
                }
                a aVar2 = new a();
                this.f18056d = aVar2;
                this.f18055c.setWebViewClient(aVar2);
            } catch (Throwable th) {
                ad.b(f18054a, th.getMessage());
            }
        }
    }

    public void setVideoReady(boolean z8) {
        this.f18062j = z8;
    }

    public void show() {
        View view;
        View view2;
        View view3;
        ViewGroup viewGroup;
        com.mbridge.msdk.splash.d.a a6;
        if (this.f18067q != null && (viewGroup = this.l) != null && (viewGroup.getContext() instanceof Activity)) {
            this.f18067q.a(this.l.getContext());
            a aVar = this.f18056d;
            if (aVar != null && (a6 = this.f18067q.a()) != null) {
                aVar.f18075a = a6;
            }
        }
        if (this.f18059g == null) {
            if (this.f18064n && (view3 = this.m) != null) {
                if (view3.getParent() != null) {
                    ar.a(this.m);
                }
                addView(this.m, new ViewGroup.LayoutParams(-1, -1));
            } else {
                MBSplashWebview mBSplashWebview = this.f18055c;
                if (mBSplashWebview != null && mBSplashWebview.getParent() == null) {
                    addView(this.f18055c, new ViewGroup.LayoutParams(-1, -1));
                }
                c();
            }
        } else {
            if (this.f18057e == null) {
                RelativeLayout relativeLayout = new RelativeLayout(getContext());
                this.f18057e = relativeLayout;
                relativeLayout.setId(2147482647);
            }
            if (this.b == 2) {
                this.f18060h = ai.f(getContext());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(0, this.f18057e.getId());
                if (this.f18064n && (view2 = this.m) != null) {
                    if (view2.getParent() != null) {
                        ar.a(this.m);
                    }
                    addView(this.m, layoutParams);
                } else {
                    MBSplashWebview mBSplashWebview2 = this.f18055c;
                    if (mBSplashWebview2 != null && mBSplashWebview2.getParent() == null) {
                        addView(this.f18055c, layoutParams);
                    }
                    c();
                }
                ViewGroup viewGroup2 = this.f18057e;
                if (viewGroup2 != null && viewGroup2.getParent() == null) {
                    int i9 = this.f18066p.width;
                    ar.a(this.f18059g);
                    int i10 = this.f18060h;
                    if (i9 > i10 / 4) {
                        i9 = i10 / 4;
                    }
                    this.f18057e.addView(this.f18059g, i9, -1);
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i9, -1);
                    layoutParams2.addRule(11);
                    layoutParams2.addRule(13);
                    addView(this.f18057e, layoutParams2);
                }
            } else {
                this.f18060h = ai.e(getContext());
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams3.addRule(2, this.f18057e.getId());
                if (this.f18064n && (view = this.m) != null) {
                    if (view.getParent() != null) {
                        ar.a(this.m);
                    }
                    addView(this.m, layoutParams3);
                } else {
                    MBSplashWebview mBSplashWebview3 = this.f18055c;
                    if (mBSplashWebview3 != null && mBSplashWebview3.getParent() == null) {
                        addView(this.f18055c, layoutParams3);
                    }
                    c();
                }
                ViewGroup viewGroup3 = this.f18057e;
                if (viewGroup3 != null && viewGroup3.getParent() == null) {
                    int i11 = this.f18066p.height;
                    int i12 = this.f18060h;
                    if (i11 > i12 / 4) {
                        i11 = i12 / 4;
                    }
                    ar.a(this.f18059g);
                    this.f18057e.addView(this.f18059g, -1, i11);
                    RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, i11);
                    layoutParams4.addRule(12);
                    addView(this.f18057e, layoutParams4);
                }
            }
        }
        View view4 = this.f18058f;
        if (view4 != null) {
            if (view4.getParent() == null) {
                RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(ai.a(getContext(), 100.0f), ai.a(getContext(), 30.0f));
                layoutParams5.addRule(10);
                layoutParams5.addRule(11);
                layoutParams5.rightMargin = ai.a(getContext(), 10.0f);
                layoutParams5.topMargin = ai.a(getContext(), 10.0f);
                addView(this.f18058f, layoutParams5);
            } else {
                bringChildToFront(this.f18058f);
            }
        }
        clearResState();
    }

    public void updateCountdown(int i9) {
        DyCountDownListener dyCountDownListener;
        View view;
        if (this.f18055c != null && !this.f18064n) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("countdown", i9);
                g.a().a((WebView) this.f18055c, "updateCountdown", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (JSONException e4) {
                e4.printStackTrace();
            }
        }
        if (this.f18064n && (view = this.m) != null && (view instanceof MBSplashNativeView)) {
            ((MBSplashNativeView) view).updateCountDown(i9);
        }
        if (this.f18064n && (dyCountDownListener = this.f18068r) != null) {
            dyCountDownListener.getCountDownValue(i9);
        }
    }

    public MBSplashView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MBSplashView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        b();
    }
}

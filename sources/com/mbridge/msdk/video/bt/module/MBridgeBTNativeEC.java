package com.mbridge.msdk.video.bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.c.b;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.video.bt.a.d;
import com.mbridge.msdk.video.module.a.a.e;
import com.mbridge.msdk.video.module.a.a.j;
import com.mbridge.msdk.video.signal.a.k;
import com.mbridge.msdk.videocommon.d.c;
import com.mbridge.msdk.videocommon.view.RoundImageView;
import com.mbridge.msdk.videocommon.view.StarLevelView;
import com.mbridge.msdk.widget.a;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class MBridgeBTNativeEC extends MBridgeBTNativeECDiff {
    private TextView A;
    private StarLevelView B;
    private boolean C;
    private boolean D;
    private int E;
    private Runnable F;
    private boolean G;
    private View H;
    private String I;
    private k J;
    private WebView K;

    /* renamed from: p, reason: collision with root package name */
    private ViewGroup f15645p;

    /* renamed from: q, reason: collision with root package name */
    private ViewGroup f15646q;

    /* renamed from: r, reason: collision with root package name */
    private RelativeLayout f15647r;

    /* renamed from: s, reason: collision with root package name */
    private ImageView f15648s;

    /* renamed from: t, reason: collision with root package name */
    private RoundImageView f15649t;
    private ImageView u;

    /* renamed from: v, reason: collision with root package name */
    private ImageView f15650v;

    /* renamed from: w, reason: collision with root package name */
    private ImageView f15651w;

    /* renamed from: x, reason: collision with root package name */
    private ImageView f15652x;

    /* renamed from: y, reason: collision with root package name */
    private TextView f15653y;

    /* renamed from: z, reason: collision with root package name */
    private TextView f15654z;

    public MBridgeBTNativeEC(Context context) {
        super(context);
        this.C = false;
        this.D = false;
        this.E = 0;
        this.G = false;
    }

    public Bitmap blurBitmap(Bitmap bitmap) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            RenderScript create = RenderScript.create(this.a.getApplicationContext());
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap);
            Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
            create2.setRadius(10.0f);
            create2.setInput(createFromBitmap);
            create2.forEach(createFromBitmap2);
            createFromBitmap2.copyTo(createBitmap);
            bitmap.recycle();
            create.destroy();
            return createBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.MBridgeBTNativeECDiff, com.mbridge.msdk.video.bt.module.BTBaseView
    public void init(Context context) {
        String str;
        boolean b3;
        if (isLandscape()) {
            str = "mbridge_reward_endcard_native_land";
        } else {
            str = "mbridge_reward_endcard_native_hor";
        }
        int findLayout = findLayout(str);
        if (findLayout > 0) {
            if (isLandscape()) {
                ViewGroup viewGroup = (ViewGroup) this.f15604f.inflate(findLayout, (ViewGroup) null);
                this.f15646q = viewGroup;
                addView(viewGroup);
                b3 = b(this.f15646q);
            } else {
                ViewGroup viewGroup2 = (ViewGroup) this.f15604f.inflate(findLayout, (ViewGroup) null);
                this.f15645p = viewGroup2;
                addView(viewGroup2);
                b3 = b(this.f15645p);
            }
            this.f15606h = b3;
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.F == null) {
            this.F = new Runnable() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTNativeEC.1
                @Override // java.lang.Runnable
                public final void run() {
                    MBridgeBTNativeEC.this.D = true;
                    if (MBridgeBTNativeEC.this.H != null) {
                        MBridgeBTNativeEC.this.H.setVisibility(0);
                    }
                }
            };
        }
        Runnable runnable = this.F;
        if (runnable != null) {
            postDelayed(runnable, this.E * 1000);
        }
        if (!this.f15606h && this.K != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("id", this.f15602d);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, this.I);
                jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                ad.a(BTBaseView.TAG, "NativeEC Call H5 onCloseBtnClicked " + jSONObject.toString());
            } catch (JSONException e2) {
                ad.a(BTBaseView.TAG, e2.getMessage());
            }
            g.a().a(this.K, "onCloseBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        }
        if (this.K != null) {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("id", this.f15602d);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, this.I);
                jSONObject3.put(DataSchemeDataSource.SCHEME_DATA, jSONObject4);
                ad.a(BTBaseView.TAG, "NativeEC Call H5 onEndCardShow " + jSONObject3.toString());
            } catch (JSONException e10) {
                ad.a(BTBaseView.TAG, e10.getMessage());
            }
            g.a().a(this.K, "onNativeECShow", Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.MBridgeBTNativeECDiff, com.mbridge.msdk.video.bt.module.BTBaseView
    public void onDestory() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.F;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        int i10 = configuration.orientation;
        this.f15605g = i10;
        if (i10 == 2) {
            removeView(this.f15645p);
            a(this.f15646q);
        } else {
            removeView(this.f15646q);
            a(this.f15645p);
        }
    }

    public void preLoadData() {
        Bitmap blurBitmap;
        try {
            CampaignEx campaignEx = this.f15600b;
            if (campaignEx != null && this.f15606h) {
                if (campaignEx.getCbd() > -2) {
                    this.E = this.f15600b.getCbd();
                } else {
                    c cVar = this.f15603e;
                    if (cVar != null) {
                        this.E = cVar.p();
                    }
                }
                b.a(this.a.getApplicationContext()).a(this.f15600b.getImageUrl(), new e(this.f15649t, this.f15600b, this.I));
                b.a(this.a.getApplicationContext()).a(this.f15600b.getIconUrl(), new j(this.u, ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 8.0f)));
                this.f15653y.setText(this.f15600b.getAppName());
                this.f15654z.setText(this.f15600b.getAppDesc());
                this.A.setText(this.f15600b.getNumberRating() + ")");
                this.B.removeAllViews();
                if (com.mbridge.msdk.e.b.a()) {
                    setChinaCTAData(this.f15600b);
                }
                double rating = this.f15600b.getRating();
                if (rating <= 0.0d) {
                    rating = 5.0d;
                }
                this.B.initScore(rating);
                try {
                    Bitmap a = a(this.f15649t.getDrawable());
                    if (a != null && (blurBitmap = blurBitmap(a)) != null) {
                        this.f15648s.setImageBitmap(blurBitmap);
                    }
                } catch (Throwable unused) {
                    this.f15648s.setVisibility(8);
                }
                if (!TextUtils.isEmpty(this.f15600b.getendcard_url()) && this.f15600b.getendcard_url().contains("alecfc=1")) {
                    this.C = true;
                }
                if (!TextUtils.isEmpty(this.f15600b.getendcard_url()) && this.f15600b.getendcard_url().contains("wlgo=1")) {
                    this.G = true;
                }
                String language = Locale.getDefault().getLanguage();
                if (!TextUtils.isEmpty(language) && language.equals("zh")) {
                    this.f15650v.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_reward_flag_cn", "drawable", com.mbridge.msdk.foundation.controller.c.m().g())));
                } else {
                    this.f15650v.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_reward_flag_en", "drawable", com.mbridge.msdk.foundation.controller.c.m().g())));
                }
                if (!this.G) {
                    this.f15650v.setVisibility(4);
                    this.f15652x.setVisibility(4);
                }
                ai.a(2, this.f15651w, this.f15600b, this.a, true, null);
                if (!this.D) {
                    this.H.setVisibility(8);
                }
            }
        } catch (Throwable th2) {
            ad.a(BTBaseView.TAG, th2.getMessage());
        }
    }

    public void setCreateWebView(WebView webView) {
        this.K = webView;
    }

    public void setJSCommon(k kVar) {
        this.J = kVar;
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void setUnitId(String str) {
        this.I = str;
    }

    private boolean b(View view) {
        try {
            this.f15647r = (RelativeLayout) view.findViewById(findID("mbridge_native_ec_layout"));
            this.f15648s = (ImageView) view.findViewById(findID("mbridge_iv_adbanner_bg"));
            this.f15649t = (RoundImageView) view.findViewById(findID("mbridge_iv_adbanner"));
            this.u = (ImageView) view.findViewById(findID("mbridge_iv_icon"));
            this.f15650v = (ImageView) view.findViewById(findID("mbridge_iv_flag"));
            this.f15651w = (ImageView) view.findViewById(findID("mbridge_iv_link"));
            this.f15653y = (TextView) view.findViewById(findID("mbridge_tv_apptitle"));
            this.f15654z = (TextView) view.findViewById(findID("mbridge_tv_appdesc"));
            this.A = (TextView) view.findViewById(findID("mbridge_tv_number"));
            this.B = (StarLevelView) view.findViewById(findID("mbridge_sv_starlevel"));
            this.H = view.findViewById(findID("mbridge_iv_close"));
            this.ctaView = view.findViewById(findID("mbridge_tv_cta"));
            this.f15652x = (ImageView) view.findViewById(findID("mbridge_iv_logo"));
            return isNotNULL(this.f15648s, this.f15649t, this.u, this.f15653y, this.f15654z, this.A, this.B, this.H, this.ctaView);
        } catch (Throwable th2) {
            ad.b(BTBaseView.TAG, th2.getMessage(), th2);
            return false;
        }
    }

    private void a(View view) {
        if (view == null) {
            init(this.a);
            preLoadData();
            return;
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        addView(view);
        b(view);
        a();
    }

    public MBridgeBTNativeEC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.C = false;
        this.D = false;
        this.E = 0;
        this.G = false;
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public final void a() {
        if (this.f15606h) {
            this.f15647r.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTNativeEC.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (MBridgeBTNativeEC.this.C) {
                        MBridgeBTNativeEC.a(MBridgeBTNativeEC.this, 1, view.getContext());
                        MBridgeBTNativeEC.a(MBridgeBTNativeEC.this, view.getX(), view.getY());
                    }
                }
            });
            this.H.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTNativeEC.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (MBridgeBTNativeEC.this.K != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", MBridgeBTNativeEC.this.f15602d);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, MBridgeBTNativeEC.this.I);
                            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                            ad.a(BTBaseView.TAG, "NativeEC Call H5 onCloseBtnClicked " + jSONObject.toString());
                        } catch (JSONException e2) {
                            ad.a(BTBaseView.TAG, e2.getMessage());
                        }
                        g.a().a(MBridgeBTNativeEC.this.K, "onCloseBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }
            });
            this.ctaView.setOnClickListener(new a() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTNativeEC.4
                @Override // com.mbridge.msdk.widget.a
                public final void a(View view) {
                    MBridgeBTNativeEC.a(MBridgeBTNativeEC.this, 0, view.getContext());
                    MBridgeBTNativeEC.a(MBridgeBTNativeEC.this, view.getX(), view.getY());
                }
            });
            this.u.setOnClickListener(new a() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTNativeEC.5
                @Override // com.mbridge.msdk.widget.a
                public final void a(View view) {
                    if (!com.mbridge.msdk.e.b.a() || MBridgeBTNativeEC.this.checkChinaProgressBarStatus()) {
                        MBridgeBTNativeEC.a(MBridgeBTNativeEC.this, 0, view.getContext());
                    }
                    MBridgeBTNativeEC.a(MBridgeBTNativeEC.this, view.getX(), view.getY());
                }
            });
            this.f15649t.setOnClickListener(new a() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTNativeEC.6
                @Override // com.mbridge.msdk.widget.a
                public final void a(View view) {
                    if (!com.mbridge.msdk.e.b.a() || MBridgeBTNativeEC.this.checkChinaProgressBarStatus()) {
                        MBridgeBTNativeEC.a(MBridgeBTNativeEC.this, 0, view.getContext());
                    }
                    MBridgeBTNativeEC.a(MBridgeBTNativeEC.this, view.getX(), view.getY());
                }
            });
        }
    }

    private Bitmap a(Drawable drawable) {
        try {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            return createBitmap;
        } catch (Throwable th2) {
            ad.a(BTBaseView.TAG, th2.getMessage());
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e A[Catch: all -> 0x0013, TryCatch #0 {all -> 0x0013, blocks: (B:3:0x0001, B:6:0x0006, B:7:0x001a, B:9:0x001e, B:11:0x0024, B:12:0x0029, B:14:0x002d, B:15:0x0034, B:24:0x0016), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(com.mbridge.msdk.video.bt.module.MBridgeBTNativeEC r2, int r3, android.content.Context r4) {
        /*
            r0 = 0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L13 org.json.JSONException -> L15
            r1.<init>()     // Catch: java.lang.Throwable -> L13 org.json.JSONException -> L15
            java.lang.String r0 = com.mbridge.msdk.foundation.same.a.f13279j     // Catch: org.json.JSONException -> L10 java.lang.Throwable -> L13
            org.json.JSONObject r3 = r2.a(r3)     // Catch: org.json.JSONException -> L10 java.lang.Throwable -> L13
            r1.put(r0, r3)     // Catch: org.json.JSONException -> L10 java.lang.Throwable -> L13
            goto L1a
        L10:
            r3 = move-exception
            r0 = r1
            goto L16
        L13:
            r2 = move-exception
            goto L39
        L15:
            r3 = move-exception
        L16:
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L13
            r1 = r0
        L1a:
            com.mbridge.msdk.video.signal.a.k r3 = r2.J     // Catch: java.lang.Throwable -> L13
            if (r3 == 0) goto L42
            boolean r3 = com.mbridge.msdk.e.b.a()     // Catch: java.lang.Throwable -> L13
            if (r3 == 0) goto L29
            com.mbridge.msdk.video.signal.a.k r3 = r2.J     // Catch: java.lang.Throwable -> L13
            r2.doChinaJumpClick(r4, r3)     // Catch: java.lang.Throwable -> L13
        L29:
            com.mbridge.msdk.video.signal.a.k r2 = r2.J     // Catch: java.lang.Throwable -> L13
            if (r1 == 0) goto L32
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L13
            goto L34
        L32:
            java.lang.String r3 = ""
        L34:
            r4 = 1
            r2.click(r4, r3)     // Catch: java.lang.Throwable -> L13
            goto L42
        L39:
            java.lang.String r3 = "BTBaseView"
            java.lang.String r2 = r2.getMessage()
            com.mbridge.msdk.foundation.tools.ad.a(r3, r2)
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.bt.module.MBridgeBTNativeEC.a(com.mbridge.msdk.video.bt.module.MBridgeBTNativeEC, int, android.content.Context):void");
    }

    public static /* synthetic */ void a(MBridgeBTNativeEC mBridgeBTNativeEC, float f10, float f11) {
        if (mBridgeBTNativeEC.K != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", BTBaseView.f15598n);
                jSONObject.put("id", mBridgeBTNativeEC.f15602d);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("x", String.valueOf(f10));
                jSONObject2.put("y", String.valueOf(f11));
                jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                g.a().a(mBridgeBTNativeEC.K, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (Exception unused) {
                d.c().a(mBridgeBTNativeEC.K, "onClicked", mBridgeBTNativeEC.f15602d);
            }
        }
    }
}

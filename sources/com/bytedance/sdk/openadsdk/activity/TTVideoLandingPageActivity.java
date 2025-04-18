package com.bytedance.sdk.openadsdk.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.utils.EH;
import com.bytedance.sdk.component.utils.Ne;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.component.utils.qO;
import com.bytedance.sdk.openadsdk.AlY.eT;
import com.bytedance.sdk.openadsdk.AlY.nc;
import com.bytedance.sdk.openadsdk.AlY.tN;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.DSW;
import com.bytedance.sdk.openadsdk.common.GA;
import com.bytedance.sdk.openadsdk.core.bZ;
import com.bytedance.sdk.openadsdk.core.hQ;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.pDU;
import com.bytedance.sdk.openadsdk.core.widget.YFl.vc;
import com.bytedance.sdk.openadsdk.core.zB;
import com.bytedance.sdk.openadsdk.utils.GS;
import com.bytedance.sdk.openadsdk.utils.Sco;
import com.bytedance.sdk.openadsdk.utils.mn;
import com.bytedance.sdk.openadsdk.utils.rkt;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import l5.a;
import l5.b;
import l5.d;
import l5.g;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class TTVideoLandingPageActivity extends TTBaseActivity implements com.bytedance.sdk.openadsdk.nc.AlY {
    protected TextView AlY;
    protected com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.vc Cfr;
    private int Cqy;
    protected long EH;
    protected GA Ga;
    protected RelativeLayout Ne;
    protected String NjR;
    protected ImageView Sg;
    protected eT UI;
    protected TextView UZM;
    private int VB;
    protected TextView VOe;
    protected com.bytedance.sdk.component.NjR.AlY YFl;
    protected TextView YI;
    protected FrameLayout YoT;
    protected com.bytedance.sdk.openadsdk.core.widget.YFl bZ;
    protected Button dXO;
    protected int eT;
    private ILoader iY;
    protected vc.YFl ko;
    protected int lu;
    protected com.bytedance.sdk.openadsdk.multipro.Sg.YFl mB;

    /* renamed from: nc, reason: collision with root package name */
    protected hQ f10545nc;
    protected com.bytedance.sdk.openadsdk.core.GA.Sg.vc pDU;
    protected String pq;
    protected String qsH;
    protected Wwa rkt;
    protected ImageView tN;

    /* renamed from: vc, reason: collision with root package name */
    protected int f10546vc;
    protected Context wN;
    protected String zG;
    protected int GA = -1;
    protected int lG = 0;
    protected int Wwa = 0;
    protected int qO = 0;
    protected int aIu = 0;
    protected String wXo = "ダウンロード";
    protected boolean hQ = false;
    protected boolean mn = false;
    protected boolean zB = true;
    protected boolean Sco = false;
    protected String GS = null;
    protected AtomicBoolean ZU = new AtomicBoolean(true);
    protected JSONArray BPI = null;
    private final AtomicInteger Bh = new AtomicInteger(0);
    private final AtomicInteger dGX = new AtomicInteger(0);
    private final AtomicInteger Ld = new AtomicInteger(0);
    protected com.bytedance.sdk.openadsdk.core.Sg.YFl fIu = null;
    private final d Jc = new d() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.11
        @Override // l5.d
        public void YFl(boolean z10) {
            TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
            tTVideoLandingPageActivity.hQ = z10;
            if (!tTVideoLandingPageActivity.isFinishing()) {
                if (z10) {
                    GS.YFl((View) TTVideoLandingPageActivity.this.YFl, 8);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) TTVideoLandingPageActivity.this.YoT.getLayoutParams();
                    TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                    tTVideoLandingPageActivity2.Wwa = marginLayoutParams.leftMargin;
                    tTVideoLandingPageActivity2.lG = marginLayoutParams.topMargin;
                    tTVideoLandingPageActivity2.qO = marginLayoutParams.width;
                    tTVideoLandingPageActivity2.aIu = marginLayoutParams.height;
                    marginLayoutParams.width = -1;
                    marginLayoutParams.height = -1;
                    marginLayoutParams.topMargin = 0;
                    marginLayoutParams.leftMargin = 0;
                    tTVideoLandingPageActivity2.YoT.setLayoutParams(marginLayoutParams);
                    return;
                }
                GS.YFl((View) TTVideoLandingPageActivity.this.YFl, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) TTVideoLandingPageActivity.this.YoT.getLayoutParams();
                TTVideoLandingPageActivity tTVideoLandingPageActivity3 = TTVideoLandingPageActivity.this;
                marginLayoutParams2.width = tTVideoLandingPageActivity3.qO;
                marginLayoutParams2.height = tTVideoLandingPageActivity3.aIu;
                marginLayoutParams2.leftMargin = tTVideoLandingPageActivity3.Wwa;
                marginLayoutParams2.topMargin = tTVideoLandingPageActivity3.lG;
                tTVideoLandingPageActivity3.YoT.setLayoutParams(marginLayoutParams2);
            }
        }
    };
    private final Ne.YFl RX = new Ne.YFl() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.2
        @Override // com.bytedance.sdk.component.utils.Ne.YFl
        public void YFl(Context context, Intent intent, boolean z10, final int i10) {
            mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.2.1
                @Override // java.lang.Runnable
                public void run() {
                    YFl(i10);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void YFl(int i10) {
            com.bytedance.sdk.component.NjR.AlY alY;
            String str;
            TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
            if (tTVideoLandingPageActivity.lu == 0 && i10 != 0 && (alY = tTVideoLandingPageActivity.YFl) != null && (str = tTVideoLandingPageActivity.GS) != null) {
                alY.a_(str);
            }
            com.bytedance.sdk.openadsdk.core.GA.Sg.vc vcVar = TTVideoLandingPageActivity.this.pDU;
            if (vcVar != null && vcVar.getNativeVideoController() != null) {
                TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                if (!tTVideoLandingPageActivity2.mn && tTVideoLandingPageActivity2.lu != i10) {
                    ((com.bytedance.sdk.openadsdk.core.GA.Sg.tN) tTVideoLandingPageActivity2.pDU.getNativeVideoController()).tN(i10);
                }
            }
            TTVideoLandingPageActivity.this.lu = i10;
        }
    };

    @SuppressLint({"StaticFieldLeak"})
    /* loaded from: classes.dex */
    public static class YFl extends AsyncTask<Void, Void, Drawable> {
        private final WeakReference<a> Sg;
        private final Bitmap YFl;

        @Override // android.os.AsyncTask
        /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
        public Drawable doInBackground(Void... voidArr) {
            try {
                Bitmap YFl = com.bytedance.sdk.component.adexpress.AlY.YFl.YFl(lG.YFl(), this.YFl, 25);
                if (YFl == null) {
                    return null;
                }
                return new BitmapDrawable(lG.YFl().getResources(), YFl);
            } catch (Throwable th2) {
                YoT.YFl("TTVideoLandingPage", th2.getMessage());
                return null;
            }
        }

        private YFl(Bitmap bitmap, a aVar) {
            this.YFl = bitmap;
            this.Sg = new WeakReference<>(aVar);
        }

        @Override // android.os.AsyncTask
        /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Drawable drawable) {
            WeakReference<a> weakReference;
            if (drawable == null || (weakReference = this.Sg) == null || weakReference.get() == null) {
                return;
            }
            this.Sg.get().YFl(drawable);
        }
    }

    private void EH() {
        if (this.pDU != null && !rkt()) {
            this.pDU.GA();
        }
    }

    private void GA() {
        hQ hQVar = new hQ(this);
        this.f10545nc = hQVar;
        hQVar.Sg(this.YFl).tN(this.qsH).AlY(this.NjR).Sg(this.eT).YFl(this.rkt).YFl(this.rkt.GS()).YFl(this.YFl).Sg("landingpage_split_screen").wN(this.rkt.cC());
    }

    private void Wwa() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isBackIntercept", true);
            this.f10545nc.YFl("temai_back_event", jSONObject);
        } catch (Exception unused) {
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void YoT() {
        Wwa wwa = this.rkt;
        if (wwa != null && wwa.ko() == 4) {
            this.Ga.setVisibility(0);
            Button button = (Button) findViewById(com.bytedance.sdk.openadsdk.utils.GA.AfY);
            this.dXO = button;
            if (button != null) {
                YFl(Sg());
                this.dXO.setOnClickListener(this.fIu);
                this.dXO.setOnTouchListener(this.fIu);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean lG() {
        return !TextUtils.isEmpty(this.GS) && this.GS.contains("__luban_sdk");
    }

    private void pDU() {
        com.bytedance.sdk.openadsdk.core.GA.Sg.vc vcVar = this.pDU;
        if (vcVar != null && vcVar.getNativeVideoController() != null && !rkt()) {
            this.pDU.GA();
        }
    }

    private boolean rkt() {
        com.bytedance.sdk.openadsdk.core.GA.Sg.vc vcVar = this.pDU;
        if (vcVar != null && vcVar.getNativeVideoController() != null) {
            return this.pDU.getNativeVideoController().EH();
        }
        return true;
    }

    public int DSW() {
        com.bytedance.sdk.openadsdk.core.GA.Sg.vc vcVar = this.pDU;
        if (vcVar != null && vcVar.getNativeVideoController() != null) {
            return this.pDU.getNativeVideoController().nc();
        }
        return 0;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void NjR() {
        Wwa wwa = this.rkt;
        if (wwa == null) {
            return;
        }
        this.Cfr = DSW.YFl(this, wwa, this.pq);
        com.bytedance.sdk.openadsdk.core.Sg.YFl yFl = new com.bytedance.sdk.openadsdk.core.Sg.YFl(this, this.rkt, this.pq, this.eT);
        this.fIu = yFl;
        yFl.YFl(false);
        this.fIu.tN(true);
        this.YI.setOnClickListener(this.fIu);
        this.YI.setOnTouchListener(this.fIu);
        this.fIu.YFl(this.Cfr);
    }

    public abstract View YFl();

    public void eT() {
        try {
            Ne.YFl(this.RX);
        } catch (Exception unused) {
        }
    }

    public void nc() {
        Ne.YFl(this.RX, this.wN);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        com.bytedance.sdk.openadsdk.core.GA.Sg.vc vcVar;
        if (this.hQ && (vcVar = this.pDU) != null && vcVar.getNativeVideoController() != null) {
            ((b) this.pDU.getNativeVideoController()).wN(null, null);
            this.hQ = false;
        } else if (lG() && !this.ZU.getAndSet(true)) {
            Wwa();
            YFl(0);
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        YoT();
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        int i10;
        super.onCreate(bundle);
        if (!pDU.wN()) {
            finish();
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            getWindow().addFlags(16777216);
        } catch (Throwable unused) {
        }
        try {
            lG.Sg(this);
        } catch (Throwable unused2) {
        }
        this.lu = EH.tN(getApplicationContext());
        try {
            setContentView(YFl());
            this.wN = this;
            Intent intent = getIntent();
            this.f10546vc = intent.getIntExtra("sdk_version", 1);
            this.qsH = intent.getStringExtra("adid");
            this.NjR = intent.getStringExtra("log_extra");
            this.eT = intent.getIntExtra("source", -1);
            this.GS = intent.getStringExtra("url");
            String stringExtra = intent.getStringExtra("web_title");
            this.pq = intent.getStringExtra("event_tag");
            this.zG = intent.getStringExtra("gecko_id");
            this.Sco = intent.getBooleanExtra("video_is_auto_play", true);
            if (bundle != null && bundle.getLong("video_play_position") > 0) {
                this.EH = bundle.getLong("video_play_position", 0L);
            }
            String stringExtra2 = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_DATA);
            if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
                String stringExtra3 = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
                if (stringExtra3 != null) {
                    try {
                        this.rkt = com.bytedance.sdk.openadsdk.core.Sg.YFl(new JSONObject(stringExtra3));
                    } catch (Exception unused3) {
                    }
                }
                Wwa wwa = this.rkt;
                if (wwa != null) {
                    this.GA = wwa.ZLB();
                }
            } else {
                Wwa Sg = bZ.YFl().Sg();
                this.rkt = Sg;
                if (Sg != null) {
                    this.GA = Sg.ZLB();
                }
                bZ.YFl().vc();
            }
            if (this.rkt == null) {
                finish();
                return;
            }
            if (!TextUtils.isEmpty(this.zG)) {
                this.iY = com.bytedance.sdk.openadsdk.DSW.Sg.YFl().Sg();
                int YFl2 = com.bytedance.sdk.openadsdk.DSW.Sg.YFl().YFl(this.iY, this.zG);
                this.Cqy = YFl2;
                if (YFl2 > 0) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                this.VB = i10;
            }
            if (stringExtra2 != null) {
                try {
                    this.mB = com.bytedance.sdk.openadsdk.multipro.Sg.YFl.YFl(new JSONObject(stringExtra2));
                } catch (Exception unused4) {
                }
                com.bytedance.sdk.openadsdk.multipro.Sg.YFl yFl = this.mB;
                if (yFl != null) {
                    this.EH = yFl.DSW;
                }
            }
            if (bundle != null) {
                String string = bundle.getString("material_meta");
                if (this.rkt == null) {
                    try {
                        this.rkt = com.bytedance.sdk.openadsdk.core.Sg.YFl(new JSONObject(string));
                    } catch (Throwable unused5) {
                    }
                }
                long j3 = bundle.getLong("video_play_position");
                if (j3 > 0) {
                    this.EH = j3;
                }
            }
            tN();
            NjR();
            GA();
            YFl(4);
            if (this.YFl != null) {
                com.bytedance.sdk.openadsdk.core.widget.YFl.tN.YFl(this.wN).YFl(true).Sg(false).YFl(this.YFl.getWebView());
                eT YFl3 = new eT(this.rkt, this.YFl.getWebView(), new nc() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.1
                    @Override // com.bytedance.sdk.openadsdk.AlY.nc
                    public void YFl(int i11) {
                        tN.YFl.YFl(TTVideoLandingPageActivity.this.Cqy, TTVideoLandingPageActivity.this.Ld.get(), TTVideoLandingPageActivity.this.dGX.get(), TTVideoLandingPageActivity.this.Bh.get() - TTVideoLandingPageActivity.this.dGX.get(), TTVideoLandingPageActivity.this.rkt, "landingpage_split_screen", i11);
                    }
                }, this.VB).YFl(true);
                this.UI = YFl3;
                this.ko = YFl3.YFl;
                YFl3.YFl("landingpage_split_screen");
            }
            com.bytedance.sdk.component.NjR.AlY alY = this.YFl;
            if (alY != null) {
                alY.setLandingPage(true);
                this.YFl.setTag("landingpage_split_screen");
                this.YFl.setMaterialMeta(this.rkt.JT());
                this.YFl.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.YFl.wN(this.wN, this.f10545nc, this.qsH, this.UI, true) { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.4
                    @Override // com.bytedance.sdk.openadsdk.core.widget.YFl.wN, android.webkit.WebViewClient
                    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                        try {
                            if (TextUtils.isEmpty(TTVideoLandingPageActivity.this.zG)) {
                                return super.shouldInterceptRequest(webView, str);
                            }
                            TTVideoLandingPageActivity.this.Bh.incrementAndGet();
                            WebResourceResponseModel YFl4 = com.bytedance.sdk.openadsdk.DSW.Sg.YFl().YFl(TTVideoLandingPageActivity.this.iY, TTVideoLandingPageActivity.this.zG, str);
                            if (YFl4 != null && YFl4.getWebResourceResponse() != null) {
                                TTVideoLandingPageActivity.this.dGX.incrementAndGet();
                                return YFl4.getWebResourceResponse();
                            }
                            if (YFl4 != null && YFl4.getMsg() == 2) {
                                TTVideoLandingPageActivity.this.Ld.incrementAndGet();
                            }
                            return super.shouldInterceptRequest(webView, str);
                        } catch (Throwable th2) {
                            YoT.YFl("TTVideoLandingPage", "shouldInterceptRequest url error", th2);
                            return super.shouldInterceptRequest(webView, str);
                        }
                    }
                });
                com.bytedance.sdk.component.NjR.AlY alY2 = this.YFl;
                alY2.setUserAgentString(rkt.YFl(alY2.getWebView(), this.f10546vc));
            }
            com.bytedance.sdk.component.NjR.AlY alY3 = this.YFl;
            if (alY3 != null) {
                alY3.setMixedContentMode(0);
            }
            com.bytedance.sdk.openadsdk.AlY.tN.YFl(this.rkt, "landingpage_split_screen", this.VB);
            com.bytedance.sdk.openadsdk.utils.Wwa.YFl(this.YFl, this.GS);
            this.YFl.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.YFl.AlY(this.f10545nc, this.UI) { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.5
                @Override // com.bytedance.sdk.openadsdk.core.widget.YFl.AlY, android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i11) {
                    super.onProgressChanged(webView, i11);
                }
            });
            this.YFl.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.6
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
                    com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.vc vcVar = TTVideoLandingPageActivity.this.Cfr;
                    if (vcVar != null) {
                        vcVar.AlY();
                    }
                }
            });
            TextView textView = this.AlY;
            if (textView != null) {
                if (TextUtils.isEmpty(stringExtra)) {
                    stringExtra = qO.YFl(this, "tt_web_title_default");
                }
                textView.setText(stringExtra);
            }
            nc();
            AlY();
            YoT();
            tN.YFl.YFl(SystemClock.elapsedRealtime() - elapsedRealtime, this.rkt, "landingpage_split_screen", this.iY, this.zG);
        } catch (Throwable unused6) {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        eT();
        try {
            if (getWindow() != null) {
                ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            }
            this.rkt.vc(false);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.component.NjR.AlY alY = this.YFl;
        if (alY != null) {
            zB.YFl(alY.getWebView());
        }
        this.YFl = null;
        hQ hQVar = this.f10545nc;
        if (hQVar != null) {
            hQVar.eT();
        }
        com.bytedance.sdk.openadsdk.core.GA.Sg.vc vcVar = this.pDU;
        if (vcVar != null && vcVar.getNativeVideoController() != null) {
            this.pDU.getNativeVideoController().AlY();
        }
        this.pDU = null;
        this.rkt = null;
        eT eTVar = this.UI;
        if (eTVar != null) {
            eTVar.tN(true);
        }
        if (!TextUtils.isEmpty(this.zG)) {
            tN.YFl.YFl(this.dGX.get(), this.Bh.get(), this.rkt);
        }
        com.bytedance.sdk.openadsdk.DSW.Sg.YFl().YFl(this.iY);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        EH();
        com.bytedance.sdk.openadsdk.core.GA.Sg.vc vcVar = this.pDU;
        if (vcVar != null && vcVar.getNativeVideoController() != null) {
            YFl(this.pDU.getNativeVideoController());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (!this.zB) {
            pDU();
        }
        this.zB = false;
        hQ hQVar = this.f10545nc;
        if (hQVar != null) {
            hQVar.nc();
        }
        eT eTVar = this.UI;
        if (eTVar != null) {
            eTVar.DSW();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        String str;
        if (bundle == null) {
            bundle = new Bundle();
        }
        Wwa wwa = this.rkt;
        if (wwa != null) {
            str = wwa.ni().toString();
        } else {
            str = null;
        }
        bundle.putString("material_meta", str);
        bundle.putLong("video_play_position", this.EH);
        bundle.putBoolean("is_complete", this.mn);
        long j3 = this.EH;
        com.bytedance.sdk.openadsdk.core.GA.Sg.vc vcVar = this.pDU;
        if (vcVar != null && vcVar.getNativeVideoController() != null) {
            j3 = this.pDU.getNativeVideoController().wN();
        }
        bundle.putLong("video_play_position", j3);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        com.bytedance.sdk.openadsdk.utils.tN.YFl(this, this.rkt);
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        eT eTVar = this.UI;
        if (eTVar != null) {
            eTVar.qsH();
        }
    }

    public void qsH() {
        String str;
        Wwa wwa = this.rkt;
        if (wwa != null && wwa.ko() == 4) {
            GS.YFl((View) this.Ne, 0);
            if (!TextUtils.isEmpty(this.rkt.Hjb())) {
                str = this.rkt.Hjb();
            } else if (!TextUtils.isEmpty(this.rkt.dd())) {
                str = this.rkt.dd();
            } else if (!TextUtils.isEmpty(this.rkt.zG())) {
                str = this.rkt.zG();
            } else {
                str = "";
            }
            if (this.rkt.dGX() != null && this.rkt.dGX().YFl() != null) {
                GS.YFl((View) this.bZ, 0);
                GS.YFl((View) this.VOe, 4);
                com.bytedance.sdk.openadsdk.lG.tN.YFl().YFl(this.rkt.dGX(), this.bZ, this.rkt);
            } else if (!TextUtils.isEmpty(str)) {
                GS.YFl((View) this.bZ, 4);
                GS.YFl((View) this.VOe, 0);
                this.VOe.setText(str.substring(0, 1));
            }
            if (!TextUtils.isEmpty(this.rkt.lL())) {
                this.YI.setText(this.rkt.lL());
            }
            if (!TextUtils.isEmpty(str)) {
                this.UZM.setText(str);
            }
            GS.YFl((View) this.UZM, 0);
            GS.YFl((View) this.YI, 0);
        }
    }

    public abstract boolean wN();

    private void YFl(final String str) {
        Button button;
        if (TextUtils.isEmpty(str) || (button = this.dXO) == null) {
            return;
        }
        button.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.7
            @Override // java.lang.Runnable
            public void run() {
                TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                if (tTVideoLandingPageActivity.dXO != null && !tTVideoLandingPageActivity.isFinishing()) {
                    TTVideoLandingPageActivity.this.dXO.setText(str);
                }
            }
        });
    }

    public void AlY() {
        if (wN()) {
            try {
                com.bytedance.sdk.openadsdk.core.GA.Sg.vc vcVar = new com.bytedance.sdk.openadsdk.core.GA.Sg.vc(this.wN, this.rkt, true, null);
                this.pDU = vcVar;
                if (vcVar.getNativeVideoController() != null) {
                    this.pDU.getNativeVideoController().YFl(false);
                }
                if (this.mn) {
                    this.YoT.setVisibility(0);
                    this.YoT.removeAllViews();
                    this.YoT.addView(this.pDU);
                    this.pDU.Sg(true);
                } else {
                    if (!this.Sco) {
                        this.EH = 0L;
                    }
                    if (this.mB != null && this.pDU.getNativeVideoController() != null) {
                        this.pDU.getNativeVideoController().Sg(this.mB.DSW);
                        this.pDU.getNativeVideoController().tN(this.mB.wN);
                        this.pDU.setIsQuiet(lG.AlY().tN(String.valueOf(this.rkt.kU())));
                    }
                    if (this.pDU.YFl(this.EH, this.zB, this.mn)) {
                        this.YoT.setVisibility(0);
                        this.YoT.removeAllViews();
                        this.YoT.addView(this.pDU);
                    }
                    if (this.pDU.getNativeVideoController() != null) {
                        this.pDU.getNativeVideoController().YFl(false);
                        this.pDU.getNativeVideoController().YFl(this.Jc);
                    }
                }
                String YFl2 = this.rkt.VB().get(0).YFl();
                com.bytedance.sdk.openadsdk.NjR.AlY.YFl().YFl(YFl2).YFl(this.rkt.VB().get(0).Sg()).Sg(this.rkt.VB().get(0).tN()).wN(GS.AlY(lG.YFl())).AlY(GS.tN(lG.YFl())).tN(2).YFl(new com.bytedance.sdk.openadsdk.NjR.Sg(this.rkt, YFl2, new com.bytedance.sdk.component.wN.rkt<Bitmap>() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.10
                    @Override // com.bytedance.sdk.component.wN.rkt
                    public void YFl(int i10, String str, @Nullable Throwable th2) {
                    }

                    @Override // com.bytedance.sdk.component.wN.rkt
                    public void YFl(com.bytedance.sdk.component.wN.eT<Bitmap> eTVar) {
                        try {
                            new YFl(eTVar.Sg(), TTVideoLandingPageActivity.this.pDU.getNativeVideoController().GA()).execute(new Void[0]);
                        } catch (Exception unused) {
                        }
                    }
                }), 4);
                this.pDU.findViewById(520093726).setOnTouchListener(null);
                this.pDU.findViewById(520093726).setOnClickListener(null);
            } catch (Exception e2) {
                YoT.YFl("TTVideoLandingPage", e2.getMessage());
                if (this.pDU == null) {
                    ApmHelper.reportCustomError("mNativeVideoTsView is null", "FUNCTION EXCEPTION", e2);
                }
            }
            if (this.lu == 0) {
                try {
                    Toast.makeText(this, qO.YFl(this, "tt_no_network"), 0).show();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public String Sg() {
        Wwa wwa = this.rkt;
        if (wwa != null && !TextUtils.isEmpty(wwa.lL())) {
            this.wXo = this.rkt.lL();
        }
        return this.wXo;
    }

    public void tN() {
        this.Ga = (GA) findViewById(com.bytedance.sdk.openadsdk.utils.GA.RX);
        this.YFl = (com.bytedance.sdk.component.NjR.AlY) findViewById(com.bytedance.sdk.openadsdk.utils.GA.fIu);
        ImageView imageView = (ImageView) findViewById(520093720);
        this.Sg = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.8
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    JSONObject jSONObject;
                    TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                    if (tTVideoLandingPageActivity.YFl != null) {
                        vc.YFl yFl = tTVideoLandingPageActivity.ko;
                        if (yFl != null) {
                            yFl.YFl();
                        }
                        if (TTVideoLandingPageActivity.this.YFl.wN()) {
                            TTVideoLandingPageActivity.this.YFl.vc();
                            return;
                        }
                        if (TTVideoLandingPageActivity.this.lG()) {
                            TTVideoLandingPageActivity.this.onBackPressed();
                            return;
                        }
                        com.bytedance.sdk.openadsdk.core.GA.Sg.vc vcVar = TTVideoLandingPageActivity.this.pDU;
                        if (vcVar != null && vcVar.getNativeVideoController() != null) {
                            TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                            jSONObject = Sco.YFl(tTVideoLandingPageActivity2.rkt, tTVideoLandingPageActivity2.pDU.getNativeVideoController().vc(), TTVideoLandingPageActivity.this.pDU.getNativeVideoController().YoT());
                        } else {
                            jSONObject = null;
                        }
                        JSONObject jSONObject2 = jSONObject;
                        TTVideoLandingPageActivity tTVideoLandingPageActivity3 = TTVideoLandingPageActivity.this;
                        com.bytedance.sdk.openadsdk.AlY.tN.YFl(tTVideoLandingPageActivity3.rkt, "embeded_ad", "detail_back", tTVideoLandingPageActivity3.vc(), TTVideoLandingPageActivity.this.DSW(), jSONObject2, (com.bytedance.sdk.openadsdk.AlY.DSW) null);
                        TTVideoLandingPageActivity.this.finish();
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.core.GA.Sg.vc vcVar = this.pDU;
        if (vcVar != null) {
            vcVar.setIsAutoPlay(this.Sco);
        }
        ImageView imageView2 = (ImageView) findViewById(com.bytedance.sdk.openadsdk.utils.GA.mB);
        this.tN = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.9
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    JSONObject jSONObject;
                    com.bytedance.sdk.openadsdk.core.GA.Sg.vc vcVar2 = TTVideoLandingPageActivity.this.pDU;
                    if (vcVar2 != null) {
                        if (vcVar2.getNativeVideoController() != null) {
                            TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                            jSONObject = Sco.YFl(tTVideoLandingPageActivity.rkt, tTVideoLandingPageActivity.pDU.getNativeVideoController().vc(), TTVideoLandingPageActivity.this.pDU.getNativeVideoController().YoT());
                        } else {
                            jSONObject = null;
                        }
                        JSONObject jSONObject2 = jSONObject;
                        TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                        com.bytedance.sdk.openadsdk.AlY.tN.YFl(tTVideoLandingPageActivity2.rkt, "embeded_ad", "detail_skip", tTVideoLandingPageActivity2.vc(), TTVideoLandingPageActivity.this.DSW(), jSONObject2, (com.bytedance.sdk.openadsdk.AlY.DSW) null);
                    }
                    TTVideoLandingPageActivity.this.finish();
                }
            });
        }
        this.AlY = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.GA.SVa);
        this.YoT = (FrameLayout) findViewById(com.bytedance.sdk.openadsdk.utils.GA.lu);
        this.Ne = (RelativeLayout) findViewById(com.bytedance.sdk.openadsdk.utils.GA.UI);
        this.VOe = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.GA.BPI);
        this.UZM = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.GA.zG);
        this.YI = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.GA.ko);
        this.bZ = (com.bytedance.sdk.openadsdk.core.widget.YFl) findViewById(com.bytedance.sdk.openadsdk.utils.GA.ZU);
        qsH();
    }

    public long vc() {
        com.bytedance.sdk.openadsdk.core.GA.Sg.vc vcVar = this.pDU;
        if (vcVar == null || vcVar.getNativeVideoController() == null) {
            return 0L;
        }
        return this.pDU.getNativeVideoController().qsH();
    }

    private void YFl(g gVar) {
        this.mn = this.mn || gVar.EH();
        Boolean bool = Boolean.TRUE;
        com.bytedance.sdk.openadsdk.multipro.AlY.YFl.YFl("sp_multi_native_video_data", "key_video_is_update_flag", bool);
        com.bytedance.sdk.openadsdk.multipro.AlY.YFl.YFl("sp_multi_native_video_data", "key_video_isfromvideodetailpage", bool);
        com.bytedance.sdk.openadsdk.multipro.AlY.YFl.YFl("sp_multi_native_video_data", "key_native_video_complete", Boolean.valueOf(this.mn));
        com.bytedance.sdk.openadsdk.multipro.AlY.YFl.YFl("sp_multi_native_video_data", "key_video_current_play_position", Long.valueOf(gVar.wN()));
        com.bytedance.sdk.openadsdk.multipro.AlY.YFl.YFl("sp_multi_native_video_data", "key_video_total_play_duration", Long.valueOf(gVar.vc() + gVar.qsH()));
        com.bytedance.sdk.openadsdk.multipro.AlY.YFl.YFl("sp_multi_native_video_data", "key_video_duration", Long.valueOf(gVar.qsH()));
    }

    private void YFl(final int i10) {
        if (this.tN == null || !lG()) {
            return;
        }
        mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.3
            @Override // java.lang.Runnable
            public void run() {
                GS.YFl((View) TTVideoLandingPageActivity.this.tN, i10);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.nc.AlY
    public void YFl(boolean z10, JSONArray jSONArray) {
        if (!z10 || jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        this.BPI = jSONArray;
    }
}

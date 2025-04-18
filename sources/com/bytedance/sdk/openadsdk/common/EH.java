package com.bytedance.sdk.openadsdk.common;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.widget.YFl.vc;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class EH {
    private final String AlY;
    private ImageView DSW;
    private final com.bytedance.sdk.component.NjR.AlY Sg;
    private final LinearLayout YFl;
    private vc.YFl qsH;
    private final Wwa tN;

    /* renamed from: vc, reason: collision with root package name */
    private ImageView f10560vc;
    private final Context wN;

    public EH(Context context, LinearLayout linearLayout, com.bytedance.sdk.component.NjR.AlY alY, Wwa wwa, String str) {
        this.wN = context;
        this.YFl = linearLayout;
        this.Sg = alY;
        this.tN = wwa;
        this.AlY = str;
        tN();
    }

    private void tN() {
        this.f10560vc = (ImageView) this.YFl.findViewById(com.bytedance.sdk.openadsdk.utils.GA.UT);
        this.DSW = (ImageView) this.YFl.findViewById(com.bytedance.sdk.openadsdk.utils.GA.DjU);
        ImageView imageView = (ImageView) this.YFl.findViewById(com.bytedance.sdk.openadsdk.utils.GA.YP);
        ImageView imageView2 = (ImageView) this.YFl.findViewById(com.bytedance.sdk.openadsdk.utils.GA.rE);
        this.f10560vc.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.EH.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (EH.this.Sg != null && EH.this.Sg.wN()) {
                    if (EH.this.qsH != null) {
                        EH.this.qsH.YFl();
                    }
                    EH.this.YFl(ToolBar.BACKWARD);
                    EH.this.Sg.vc();
                }
            }
        });
        this.DSW.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.EH.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (EH.this.Sg != null && EH.this.Sg.DSW()) {
                    EH.this.YFl(ToolBar.FORWARD);
                    EH.this.Sg.qsH();
                }
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.EH.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (EH.this.Sg != null) {
                    EH.this.Sg(ToolBar.REFRESH);
                    EH.this.Sg.AlY();
                }
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.EH.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (EH.this.Sg != null) {
                    EH.this.Sg("external_btn_click");
                    Intent intent = new Intent("android.intent.action.VIEW");
                    String url = EH.this.Sg.getUrl();
                    if (!TextUtils.isEmpty(url)) {
                        intent.setData(Uri.parse(url));
                        com.bytedance.sdk.component.utils.Sg.YFl(EH.this.wN, intent, null);
                    }
                }
            }
        });
        this.YFl.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.EH.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        this.f10560vc.setClickable(false);
        this.DSW.setClickable(false);
        this.f10560vc.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
        this.DSW.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
    }

    public void Sg() {
        if (this.YFl.getAlpha() == 1.0f) {
            ObjectAnimator.ofFloat(this.YFl, "alpha", 1.0f, 0.0f).setDuration(300L).start();
        }
    }

    public void YFl(WebView webView, vc.YFl yFl) {
        this.qsH = yFl;
        try {
            if (this.f10560vc != null) {
                if (webView.canGoBack()) {
                    this.f10560vc.setClickable(true);
                    this.f10560vc.clearColorFilter();
                } else {
                    this.f10560vc.setClickable(false);
                    this.f10560vc.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
                }
            }
            if (this.DSW != null) {
                if (webView.canGoForward()) {
                    this.DSW.setClickable(true);
                    this.DSW.clearColorFilter();
                } else {
                    this.DSW.setClickable(false);
                    this.DSW.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sg(String str) {
        WebBackForwardList copyBackForwardList;
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.Sg.getWebView() != null && (copyBackForwardList = this.Sg.getWebView().copyBackForwardList()) != null) {
                String url = copyBackForwardList.getItemAtIndex(copyBackForwardList.getCurrentIndex()).getUrl();
                if (TextUtils.isEmpty(url)) {
                    url = this.Sg.getUrl();
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("url", url);
                jSONObject2.putOpt("first_page", Integer.valueOf(copyBackForwardList.getCurrentIndex() == 0 ? 1 : 0));
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            }
        } catch (Exception unused) {
        }
        com.bytedance.sdk.openadsdk.AlY.tN.YFl(System.currentTimeMillis(), this.tN, this.AlY, str, jSONObject, (com.bytedance.sdk.openadsdk.AlY.DSW) null, (com.bytedance.sdk.openadsdk.AlY.Sg.YFl) null);
    }

    public void YFl() {
        if (this.YFl.getAlpha() == 0.0f) {
            ObjectAnimator.ofFloat(this.YFl, "alpha", 0.0f, 1.0f).setDuration(300L).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(String str) {
        WebBackForwardList copyBackForwardList;
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.Sg.getWebView() != null && (copyBackForwardList = this.Sg.getWebView().copyBackForwardList()) != null) {
                int currentIndex = copyBackForwardList.getCurrentIndex();
                String url = copyBackForwardList.getItemAtIndex(currentIndex).getUrl();
                if (TextUtils.isEmpty(url)) {
                    url = this.Sg.getUrl();
                }
                String url2 = str.equals(ToolBar.BACKWARD) ? copyBackForwardList.getItemAtIndex(currentIndex - 1).getUrl() : "";
                int i10 = 1;
                if (str.equals(ToolBar.FORWARD)) {
                    url2 = copyBackForwardList.getItemAtIndex(currentIndex + 1).getUrl();
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("url", url);
                jSONObject2.putOpt("next_url", url2);
                if (copyBackForwardList.getCurrentIndex() != 0) {
                    i10 = 0;
                }
                jSONObject2.putOpt("first_page", Integer.valueOf(i10));
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            }
        } catch (Exception unused) {
        }
        com.bytedance.sdk.openadsdk.AlY.tN.YFl(System.currentTimeMillis(), this.tN, this.AlY, str, jSONObject, (com.bytedance.sdk.openadsdk.AlY.DSW) null, (com.bytedance.sdk.openadsdk.AlY.Sg.YFl) null);
    }
}

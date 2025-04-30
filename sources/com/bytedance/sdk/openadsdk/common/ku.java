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
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.utils.vDp;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ku {
    private final Context COT;
    private ImageView HWF;
    private final woN KS;
    private ImageView QR;
    private final String jU;
    private final SSWebView lMd;
    private final LinearLayout zp;

    public ku(Context context, LinearLayout linearLayout, SSWebView sSWebView, woN won, String str) {
        this.COT = context;
        this.zp = linearLayout;
        this.lMd = sSWebView;
        this.KS = won;
        this.jU = str;
        KS();
    }

    private void KS() {
        this.HWF = (ImageView) this.zp.findViewById(vDp.CZ);
        this.QR = (ImageView) this.zp.findViewById(vDp.vLi);
        ImageView imageView = (ImageView) this.zp.findViewById(vDp.bQm);
        ImageView imageView2 = (ImageView) this.zp.findViewById(vDp.Eg);
        this.HWF.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.ku.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ku.this.lMd != null && ku.this.lMd.COT()) {
                    ku.this.zp(ToolBar.BACKWARD);
                    ku.this.lMd.HWF();
                }
            }
        });
        this.QR.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.ku.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ku.this.lMd != null && ku.this.lMd.QR()) {
                    ku.this.zp(ToolBar.FORWARD);
                    ku.this.lMd.ku();
                }
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.ku.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ku.this.lMd != null) {
                    ku.this.lMd(ToolBar.REFRESH);
                    ku.this.lMd.jU();
                }
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.ku.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ku.this.lMd != null) {
                    ku.this.lMd("external_btn_click");
                    Intent intent = new Intent("android.intent.action.VIEW");
                    String url = ku.this.lMd.getUrl();
                    if (!TextUtils.isEmpty(url)) {
                        intent.setData(Uri.parse(url));
                        com.bytedance.sdk.component.utils.lMd.zp(ku.this.COT, intent, null);
                    }
                }
            }
        });
        this.zp.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.ku.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        this.HWF.setClickable(false);
        this.QR.setClickable(false);
        ImageView imageView3 = this.HWF;
        int parseColor = Color.parseColor("#A8FFFFFF");
        PorterDuff.Mode mode = PorterDuff.Mode.ADD;
        imageView3.setColorFilter(parseColor, mode);
        this.QR.setColorFilter(Color.parseColor("#A8FFFFFF"), mode);
    }

    public void lMd() {
        if (this.zp.getAlpha() == 1.0f) {
            ObjectAnimator.ofFloat(this.zp, "alpha", 1.0f, 0.0f).setDuration(300L).start();
        }
    }

    public void zp(WebView webView) {
        try {
            if (this.HWF != null) {
                if (webView.canGoBack()) {
                    this.HWF.setClickable(true);
                    this.HWF.clearColorFilter();
                } else {
                    this.HWF.setClickable(false);
                    this.HWF.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
                }
            }
            if (this.QR != null) {
                if (webView.canGoForward()) {
                    this.QR.setClickable(true);
                    this.QR.clearColorFilter();
                } else {
                    this.QR.setClickable(false);
                    this.QR.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lMd(String str) {
        WebBackForwardList copyBackForwardList;
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.lMd.getWebView() != null && (copyBackForwardList = this.lMd.getWebView().copyBackForwardList()) != null) {
                String url = copyBackForwardList.getItemAtIndex(copyBackForwardList.getCurrentIndex()).getUrl();
                if (TextUtils.isEmpty(url)) {
                    url = this.lMd.getUrl();
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("url", url);
                jSONObject2.putOpt("first_page", Integer.valueOf(copyBackForwardList.getCurrentIndex() == 0 ? 1 : 0));
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            }
        } catch (Exception unused) {
        }
        com.bytedance.sdk.openadsdk.lMd.KS.KS(this.KS, this.jU, str, jSONObject);
    }

    public void zp() {
        if (this.zp.getAlpha() == 0.0f) {
            ObjectAnimator.ofFloat(this.zp, "alpha", 0.0f, 1.0f).setDuration(300L).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(String str) {
        WebBackForwardList copyBackForwardList;
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.lMd.getWebView() != null && (copyBackForwardList = this.lMd.getWebView().copyBackForwardList()) != null) {
                int currentIndex = copyBackForwardList.getCurrentIndex();
                String url = copyBackForwardList.getItemAtIndex(currentIndex).getUrl();
                if (TextUtils.isEmpty(url)) {
                    url = this.lMd.getUrl();
                }
                String str2 = "";
                if (str.equals(ToolBar.BACKWARD)) {
                    str2 = copyBackForwardList.getItemAtIndex(currentIndex - 1).getUrl();
                }
                int i9 = 1;
                if (str.equals(ToolBar.FORWARD)) {
                    str2 = copyBackForwardList.getItemAtIndex(currentIndex + 1).getUrl();
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("url", url);
                jSONObject2.putOpt("next_url", str2);
                if (copyBackForwardList.getCurrentIndex() != 0) {
                    i9 = 0;
                }
                jSONObject2.putOpt("first_page", Integer.valueOf(i9));
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            }
        } catch (Exception unused) {
        }
        com.bytedance.sdk.openadsdk.lMd.KS.KS(this.KS, this.jU, str, jSONObject);
    }
}

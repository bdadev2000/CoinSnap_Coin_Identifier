package com.mbridge.msdk.video.module;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.d.d;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.video.signal.factory.b;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class MBridgeClickMiniCardView extends MBridgeH5EndCardView {

    /* renamed from: w, reason: collision with root package name */
    private boolean f18791w;

    public MBridgeClickMiniCardView(Context context) {
        super(context);
        this.f18791w = false;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    public final String a() {
        CampaignEx campaignEx = this.b;
        if (campaignEx == null) {
            return null;
        }
        CampaignEx.c rewardTemplateMode = campaignEx.getRewardTemplateMode();
        String c9 = rewardTemplateMode != null ? rewardTemplateMode.c() : null;
        if (TextUtils.isEmpty(c9) || !c9.contains(".zip")) {
            return c9;
        }
        String h5ResAddress = H5DownLoadManager.getInstance().getH5ResAddress(c9);
        return !TextUtils.isEmpty(h5ResAddress) ? h5ResAddress : c9;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    public final RelativeLayout.LayoutParams b() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13, -1);
        return layoutParams;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    public final void e() {
        super.e();
        if (this.f18771e) {
            setBackgroundResource(findColor("mbridge_reward_minicard_bg"));
            a(this.m);
            setClickable(true);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView, com.mbridge.msdk.video.module.MBridgeBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        if (this.f18771e) {
            a(this.m);
        }
        super.onSelfConfigurationChanged(configuration);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    public void preLoadData(b bVar) {
        super.preLoadData(bVar);
        setCloseVisible(0);
    }

    public void resizeMiniCard(int i9, int i10) {
        View findViewById = ((Activity) this.f18768a).getWindow().findViewById(R.id.content);
        int width = findViewById.getWidth();
        int height = findViewById.getHeight();
        if (i9 > 0 && i10 > 0 && i9 <= width && i10 <= height) {
            ViewGroup.LayoutParams layoutParams = this.m.getLayoutParams();
            layoutParams.width = i9;
            layoutParams.height = i10;
            this.m.setLayoutParams(layoutParams);
        }
    }

    public void setMBridgeClickMiniCardViewClickable(boolean z8) {
        setClickable(z8);
    }

    public void setMBridgeClickMiniCardViewTransparent() {
        setBackgroundColor(0);
    }

    public void setMiniCardLocation(int i9, int i10, int i11, int i12) {
        this.f18791w = true;
        resizeMiniCard(i11, i12);
    }

    public void setRadius(int i9) {
        if (i9 > 0) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(ai.a(getContext(), i9));
            gradientDrawable.setColor(-1);
            this.f18845p.setBackground(gradientDrawable);
            this.f18845p.setClipToOutline(true);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    public void webviewshow() {
        WindVaneWebView windVaneWebView = this.f18845p;
        if (windVaneWebView != null) {
            windVaneWebView.post(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeClickMiniCardView.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        ad.a(MBridgeBaseView.TAG, "webviewshow");
                        String str = "";
                        try {
                            int[] iArr = new int[2];
                            MBridgeClickMiniCardView.this.f18845p.getLocationOnScreen(iArr);
                            ad.b(MBridgeBaseView.TAG, "coordinate:" + iArr[0] + "--" + iArr[1]);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("startX", ai.b(c.m().c(), (float) iArr[0]));
                            jSONObject.put("startY", ai.b(c.m().c(), (float) iArr[1]));
                            str = jSONObject.toString();
                        } catch (Throwable th) {
                            ad.b(MBridgeBaseView.TAG, th.getMessage(), th);
                        }
                        g.a().a((WebView) MBridgeClickMiniCardView.this.f18845p, "webviewshow", Base64.encodeToString(str.toString().getBytes(), 2));
                    } catch (Exception e4) {
                        e4.printStackTrace();
                    }
                }
            });
            d dVar = new d();
            dVar.a("type", 3);
            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000133", this.b, dVar);
        }
    }

    public MBridgeClickMiniCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18791w = false;
    }

    private void a(View view) {
        int f9 = ai.f(this.f18768a);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = (int) ((f9 * 0.7f) + 0.5f);
        layoutParams.height = (int) ((ai.e(this.f18768a) * 0.7f) + 0.5f);
        view.setLayoutParams(layoutParams);
    }
}

package com.mbridge.msdk.video.module;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.i;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.video.dynview.a;
import com.mbridge.msdk.video.dynview.e.h;
import com.mbridge.msdk.video.dynview.j.c;
import com.mbridge.msdk.video.module.a.a.e;
import com.mbridge.msdk.video.signal.factory.b;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class MBridgeClickCTAView extends MBridgeClickCTAViewDiff {

    /* renamed from: m, reason: collision with root package name */
    private ViewGroup f15906m;

    /* renamed from: n, reason: collision with root package name */
    private ImageView f15907n;

    /* renamed from: o, reason: collision with root package name */
    private TextView f15908o;

    /* renamed from: p, reason: collision with root package name */
    private TextView f15909p;

    /* renamed from: q, reason: collision with root package name */
    private String f15910q;

    /* renamed from: r, reason: collision with root package name */
    private float f15911r;

    /* renamed from: s, reason: collision with root package name */
    private float f15912s;

    /* renamed from: t, reason: collision with root package name */
    private int f15913t;
    private ObjectAnimator u;

    public MBridgeClickCTAView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b() {
        this.f15906m = (ViewGroup) findViewById(findID("mbridge_viewgroup_ctaroot"));
        this.f15907n = (ImageView) findViewById(findID("mbridge_iv_appicon"));
        this.f15908o = (TextView) findViewById(findID("mbridge_tv_title"));
        TextView textView = (TextView) findViewById(findID("mbridge_tv_install"));
        this.ctaTv = textView;
        return isNotNULL(this.f15906m, this.f15907n, this.f15908o, textView);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeClickCTAViewDiff, com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ObjectAnimator objectAnimator = this.u;
        if (objectAnimator != null) {
            try {
                objectAnimator.start();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.u;
        if (objectAnimator != null) {
            try {
                objectAnimator.cancel();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f15911r = motionEvent.getRawX();
        this.f15912s = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        this.f15913t = configuration.orientation;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeClickCTAViewDiff
    public void preLoadData(b bVar) {
        CampaignEx campaignEx = this.f15895b;
        if (campaignEx != null) {
            if (campaignEx.isDynamicView()) {
                com.mbridge.msdk.video.dynview.b.a().a(new c().b(this, this.f15895b), new h() { // from class: com.mbridge.msdk.video.module.MBridgeClickCTAView.1
                    @Override // com.mbridge.msdk.video.dynview.e.h
                    public final void a(a aVar) {
                        if (aVar != null) {
                            this.addView(aVar.a());
                            MBridgeClickCTAView mBridgeClickCTAView = MBridgeClickCTAView.this;
                            mBridgeClickCTAView.f15898e = mBridgeClickCTAView.b();
                            MBridgeClickCTAView mBridgeClickCTAView2 = MBridgeClickCTAView.this;
                            mBridgeClickCTAView2.f15909p = (TextView) mBridgeClickCTAView2.findViewById(mBridgeClickCTAView2.findID("mbridge_tv_desc"));
                            MBridgeClickCTAView.this.c();
                        }
                    }

                    @Override // com.mbridge.msdk.video.dynview.e.h
                    public final void a(com.mbridge.msdk.video.dynview.c.a aVar) {
                        ad.b(MBridgeBaseView.TAG, "errorMsg:" + aVar.b());
                    }
                });
            } else {
                int findLayout = findLayout("mbridge_reward_clickable_cta");
                if (findLayout >= 0) {
                    this.f15896c.inflate(findLayout, this);
                    this.f15898e = b();
                    c();
                    setWrapContent();
                }
            }
            if (this.f15898e) {
                if (com.mbridge.msdk.e.b.a()) {
                    setChinaCTAData();
                }
                this.ctaTv.setText(this.f15895b.getAdCall());
                if (!TextUtils.isEmpty(this.f15895b.getIconUrl())) {
                    com.mbridge.msdk.foundation.same.c.b.a(this.a.getApplicationContext()).a(this.f15895b.getIconUrl(), new e(this.f15907n, this.f15895b, this.f15910q) { // from class: com.mbridge.msdk.video.module.MBridgeClickCTAView.5
                        @Override // com.mbridge.msdk.video.module.a.a.e, com.mbridge.msdk.foundation.same.c.c
                        public final void onFailedLoad(String str, String str2) {
                            super.onFailedLoad(str, str2);
                            MBridgeClickCTAView.this.a();
                        }
                    });
                } else {
                    a();
                }
                if (this.f15908o != null && !TextUtils.isEmpty(this.f15895b.getAppName())) {
                    this.f15908o.setText(this.f15895b.getAppName());
                }
                if (this.f15909p != null && !TextUtils.isEmpty(this.f15895b.getAppDesc())) {
                    this.f15909p.setText(this.f15895b.getAppDesc());
                }
            }
        }
    }

    public void setObjectAnimator(ObjectAnimator objectAnimator) {
        this.u = objectAnimator;
    }

    public void setUnitId(String str) {
        this.f15910q = str;
    }

    public MBridgeClickCTAView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public final void c() {
        super.c();
        if (this.f15898e) {
            CampaignEx campaignEx = this.f15895b;
            if (campaignEx != null && campaignEx.isDynamicView()) {
                setOnClickListener(new com.mbridge.msdk.widget.a() { // from class: com.mbridge.msdk.video.module.MBridgeClickCTAView.2
                    @Override // com.mbridge.msdk.widget.a
                    public final void a(View view) {
                        MBridgeClickCTAView.b(MBridgeClickCTAView.this);
                    }
                });
            }
            this.ctaTv.setOnClickListener(new com.mbridge.msdk.widget.a() { // from class: com.mbridge.msdk.video.module.MBridgeClickCTAView.3
                @Override // com.mbridge.msdk.widget.a
                public final void a(View view) {
                    MBridgeClickCTAView.b(MBridgeClickCTAView.this);
                }
            });
            ImageView imageView = this.f15907n;
            if (imageView != null) {
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeClickCTAView.4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        ImageView imageView = this.f15907n;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    public static /* synthetic */ void b(MBridgeClickCTAView mBridgeClickCTAView) {
        JSONObject jSONObject;
        JSONException e2;
        CampaignEx campaignEx = mBridgeClickCTAView.f15895b;
        if (campaignEx != null && campaignEx.isDynamicView()) {
            try {
                CampaignEx.c rewardTemplateMode = mBridgeClickCTAView.f15895b.getRewardTemplateMode();
                String str = "";
                if (rewardTemplateMode != null) {
                    str = rewardTemplateMode.f() + "";
                }
                i.a(com.mbridge.msdk.foundation.controller.c.m().c(), "cta_click", mBridgeClickCTAView.f15895b.getCampaignUnitId(), mBridgeClickCTAView.f15895b.isBidCampaign(), mBridgeClickCTAView.f15895b.getRequestId(), mBridgeClickCTAView.f15895b.getRequestIdNotice(), mBridgeClickCTAView.f15895b.getId(), str);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        try {
            jSONObject = new JSONObject();
        } catch (JSONException e11) {
            jSONObject = null;
            e2 = e11;
        }
        try {
            jSONObject.put(com.mbridge.msdk.foundation.same.a.f13279j, mBridgeClickCTAView.a(0));
        } catch (JSONException e12) {
            e2 = e12;
            e2.printStackTrace();
            mBridgeClickCTAView.f15895b.setTriggerClickSource(1);
            mBridgeClickCTAView.f15895b.setClickTempSource(1);
            mBridgeClickCTAView.notifyListener.a(105, jSONObject);
        }
        mBridgeClickCTAView.f15895b.setTriggerClickSource(1);
        mBridgeClickCTAView.f15895b.setClickTempSource(1);
        mBridgeClickCTAView.notifyListener.a(105, jSONObject);
    }
}

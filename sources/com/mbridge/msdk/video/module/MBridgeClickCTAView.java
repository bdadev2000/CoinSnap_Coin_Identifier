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

/* loaded from: classes3.dex */
public class MBridgeClickCTAView extends MBridgeClickCTAViewDiff {
    private ViewGroup m;

    /* renamed from: n, reason: collision with root package name */
    private ImageView f18778n;

    /* renamed from: o, reason: collision with root package name */
    private TextView f18779o;

    /* renamed from: p, reason: collision with root package name */
    private TextView f18780p;

    /* renamed from: q, reason: collision with root package name */
    private String f18781q;

    /* renamed from: r, reason: collision with root package name */
    private float f18782r;

    /* renamed from: s, reason: collision with root package name */
    private float f18783s;

    /* renamed from: t, reason: collision with root package name */
    private int f18784t;

    /* renamed from: u, reason: collision with root package name */
    private ObjectAnimator f18785u;

    public MBridgeClickCTAView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b() {
        this.m = (ViewGroup) findViewById(findID("mbridge_viewgroup_ctaroot"));
        this.f18778n = (ImageView) findViewById(findID("mbridge_iv_appicon"));
        this.f18779o = (TextView) findViewById(findID("mbridge_tv_title"));
        TextView textView = (TextView) findViewById(findID("mbridge_tv_install"));
        this.ctaTv = textView;
        return isNotNULL(this.m, this.f18778n, this.f18779o, textView);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeClickCTAViewDiff, com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ObjectAnimator objectAnimator = this.f18785u;
        if (objectAnimator != null) {
            try {
                objectAnimator.start();
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.f18785u;
        if (objectAnimator != null) {
            try {
                objectAnimator.cancel();
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f18782r = motionEvent.getRawX();
        this.f18783s = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        this.f18784t = configuration.orientation;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeClickCTAViewDiff
    public void preLoadData(b bVar) {
        CampaignEx campaignEx = this.b;
        if (campaignEx != null) {
            if (campaignEx.isDynamicView()) {
                com.mbridge.msdk.video.dynview.b.a().a(new c().b(this, this.b), new h() { // from class: com.mbridge.msdk.video.module.MBridgeClickCTAView.1
                    @Override // com.mbridge.msdk.video.dynview.e.h
                    public final void a(a aVar) {
                        if (aVar != null) {
                            this.addView(aVar.a());
                            MBridgeClickCTAView mBridgeClickCTAView = MBridgeClickCTAView.this;
                            mBridgeClickCTAView.f18771e = mBridgeClickCTAView.b();
                            MBridgeClickCTAView mBridgeClickCTAView2 = MBridgeClickCTAView.this;
                            mBridgeClickCTAView2.f18780p = (TextView) mBridgeClickCTAView2.findViewById(mBridgeClickCTAView2.findID("mbridge_tv_desc"));
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
                    this.f18769c.inflate(findLayout, this);
                    this.f18771e = b();
                    c();
                    setWrapContent();
                }
            }
            if (this.f18771e) {
                if (com.mbridge.msdk.e.b.a()) {
                    setChinaCTAData();
                }
                this.ctaTv.setText(this.b.getAdCall());
                if (!TextUtils.isEmpty(this.b.getIconUrl())) {
                    com.mbridge.msdk.foundation.same.c.b.a(this.f18768a.getApplicationContext()).a(this.b.getIconUrl(), new e(this.f18778n, this.b, this.f18781q) { // from class: com.mbridge.msdk.video.module.MBridgeClickCTAView.5
                        @Override // com.mbridge.msdk.video.module.a.a.e, com.mbridge.msdk.foundation.same.c.c
                        public final void onFailedLoad(String str, String str2) {
                            super.onFailedLoad(str, str2);
                            MBridgeClickCTAView.this.a();
                        }
                    });
                } else {
                    a();
                }
                if (this.f18779o != null && !TextUtils.isEmpty(this.b.getAppName())) {
                    this.f18779o.setText(this.b.getAppName());
                }
                if (this.f18780p != null && !TextUtils.isEmpty(this.b.getAppDesc())) {
                    this.f18780p.setText(this.b.getAppDesc());
                }
            }
        }
    }

    public void setObjectAnimator(ObjectAnimator objectAnimator) {
        this.f18785u = objectAnimator;
    }

    public void setUnitId(String str) {
        this.f18781q = str;
    }

    public MBridgeClickCTAView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public final void c() {
        super.c();
        if (this.f18771e) {
            CampaignEx campaignEx = this.b;
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
            ImageView imageView = this.f18778n;
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
        ImageView imageView = this.f18778n;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    public static /* synthetic */ void b(MBridgeClickCTAView mBridgeClickCTAView) {
        JSONObject jSONObject;
        JSONException e4;
        CampaignEx campaignEx = mBridgeClickCTAView.b;
        if (campaignEx != null && campaignEx.isDynamicView()) {
            try {
                CampaignEx.c rewardTemplateMode = mBridgeClickCTAView.b.getRewardTemplateMode();
                String str = "";
                if (rewardTemplateMode != null) {
                    str = rewardTemplateMode.f() + "";
                }
                i.a(com.mbridge.msdk.foundation.controller.c.m().c(), "cta_click", mBridgeClickCTAView.b.getCampaignUnitId(), mBridgeClickCTAView.b.isBidCampaign(), mBridgeClickCTAView.b.getRequestId(), mBridgeClickCTAView.b.getRequestIdNotice(), mBridgeClickCTAView.b.getId(), str);
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
        try {
            jSONObject = new JSONObject();
        } catch (JSONException e10) {
            jSONObject = null;
            e4 = e10;
        }
        try {
            jSONObject.put(com.mbridge.msdk.foundation.same.a.f15684j, mBridgeClickCTAView.a(0));
        } catch (JSONException e11) {
            e4 = e11;
            e4.printStackTrace();
            mBridgeClickCTAView.b.setTriggerClickSource(1);
            mBridgeClickCTAView.b.setClickTempSource(1);
            mBridgeClickCTAView.notifyListener.a(105, jSONObject);
        }
        mBridgeClickCTAView.b.setTriggerClickSource(1);
        mBridgeClickCTAView.b.setClickTempSource(1);
        mBridgeClickCTAView.notifyListener.a(105, jSONObject);
    }
}

package com.mbridge.msdk.video.dynview.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.d.d;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.video.bt.module.b.f;
import com.mbridge.msdk.video.dynview.e.b;
import com.mbridge.msdk.video.dynview.e.c;
import com.mbridge.msdk.video.dynview.e.h;
import com.mbridge.msdk.video.module.MBridgeBaseView;
import com.mbridge.msdk.widget.FeedBackButton;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public class MBridgeOrderCampView extends MBridgeBaseView {
    private MBridgeOrderCampView m;

    /* renamed from: n, reason: collision with root package name */
    private List<CampaignEx> f18745n;

    /* renamed from: o, reason: collision with root package name */
    private int f18746o;

    /* renamed from: p, reason: collision with root package name */
    private int f18747p;

    /* renamed from: q, reason: collision with root package name */
    private int f18748q;

    /* renamed from: r, reason: collision with root package name */
    private int f18749r;

    /* renamed from: s, reason: collision with root package name */
    private String f18750s;

    /* renamed from: t, reason: collision with root package name */
    private FeedBackButton f18751t;

    /* renamed from: u, reason: collision with root package name */
    private ImageView f18752u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f18753v;

    /* renamed from: w, reason: collision with root package name */
    private c f18754w;

    /* renamed from: x, reason: collision with root package name */
    private b f18755x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f18756y;

    public MBridgeOrderCampView(Context context) {
        super(context);
        this.f18753v = false;
        this.f18754w = new c() { // from class: com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView.1
            @Override // com.mbridge.msdk.video.dynview.e.c
            public final void a(CampaignEx campaignEx, int i9) {
                if (campaignEx != null) {
                    try {
                        MBridgeOrderCampView.this.setCampaign(campaignEx);
                        campaignEx.setClickTempSource(2);
                        campaignEx.setTriggerClickSource(2);
                        MBridgeOrderCampView.a(MBridgeOrderCampView.this, campaignEx, 0, i9);
                    } catch (Exception e4) {
                        ad.b(MBridgeBaseView.TAG, e4.getMessage());
                    }
                }
            }

            @Override // com.mbridge.msdk.video.dynview.e.c
            public final void a() {
                MBridgeOrderCampView.a(MBridgeOrderCampView.this);
            }
        };
        this.f18756y = false;
    }

    public static /* synthetic */ void a(MBridgeOrderCampView mBridgeOrderCampView) {
        try {
            d dVar = new d();
            dVar.a("type", 2);
            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000152", dVar);
            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000134", mBridgeOrderCampView.b);
        } catch (Throwable th) {
            ad.a(MBridgeBaseView.TAG, th.getMessage());
        }
        try {
            com.mbridge.msdk.video.dynview.moffer.a.a().b();
        } catch (Exception e4) {
            ad.b(MBridgeBaseView.TAG, e4.getMessage());
        }
        com.mbridge.msdk.video.module.a.a aVar = mBridgeOrderCampView.notifyListener;
        if (aVar != null) {
            aVar.a(104, "");
        }
    }

    public void createView(final ViewGroup viewGroup) {
        if (this.f18745n == null) {
            b bVar = this.f18755x;
            if (bVar != null) {
                bVar.b();
                return;
            }
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("order_view_callback", this.f18754w);
        com.mbridge.msdk.video.dynview.c b = new com.mbridge.msdk.video.dynview.j.c().b(com.mbridge.msdk.foundation.controller.c.m().c(), this.f18745n);
        com.mbridge.msdk.video.dynview.b.a();
        new com.mbridge.msdk.video.dynview.h.a(b, new h() { // from class: com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView.2
            @Override // com.mbridge.msdk.video.dynview.e.h
            public final void a(com.mbridge.msdk.video.dynview.a aVar) {
                if (aVar != null) {
                    try {
                        MBridgeOrderCampView.this.m.addView(aVar.a());
                        MBridgeOrderCampView.this.f18753v = aVar.c();
                        viewGroup.removeAllViews();
                        viewGroup.addView(MBridgeOrderCampView.this.m);
                        f.a(com.mbridge.msdk.foundation.controller.c.m().c(), (List<CampaignEx>) MBridgeOrderCampView.this.f18745n, ((CampaignEx) MBridgeOrderCampView.this.f18745n.get(0)).getCampaignUnitId());
                        MBridgeOrderCampView.this.setViewStatus();
                        if (MBridgeOrderCampView.this.f18755x != null) {
                            MBridgeOrderCampView.this.f18755x.a();
                        }
                    } catch (Exception e4) {
                        ad.b(MBridgeBaseView.TAG, e4.getMessage());
                    }
                }
            }

            @Override // com.mbridge.msdk.video.dynview.e.h
            public final void a(com.mbridge.msdk.video.dynview.c.a aVar) {
                try {
                    f.a(com.mbridge.msdk.foundation.controller.c.m().c(), (List<CampaignEx>) MBridgeOrderCampView.this.f18745n, ((CampaignEx) MBridgeOrderCampView.this.f18745n.get(0)).getCampaignUnitId(), aVar.b());
                    if (MBridgeOrderCampView.this.f18755x != null) {
                        MBridgeOrderCampView.this.f18755x.b();
                    }
                } catch (Exception e4) {
                    ad.b(MBridgeBaseView.TAG, e4.getMessage());
                }
            }
        }, hashMap);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        this.m = this;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f A[SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r0 = r5.f18745n
            if (r0 != 0) goto L8
            return
        L8:
            r0 = 0
        L9:
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r1 = r5.f18745n
            int r1 = r1.size()
            if (r0 >= r1) goto L32
            r1 = 0
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L1f
            r2.<init>()     // Catch: org.json.JSONException -> L1f
            java.lang.String r1 = "camp_position"
            r2.put(r1, r0)     // Catch: org.json.JSONException -> L1d
            goto L26
        L1d:
            r1 = move-exception
            goto L23
        L1f:
            r2 = move-exception
            r4 = r2
            r2 = r1
            r1 = r4
        L23:
            r1.printStackTrace()
        L26:
            com.mbridge.msdk.video.module.a.a r1 = r5.notifyListener
            if (r1 == 0) goto L2f
            r3 = 110(0x6e, float:1.54E-43)
            r1.a(r3, r2)
        L2f:
            int r0 = r0 + 1
            goto L9
        L32:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView.onAttachedToWindow():void");
    }

    public void setCampOrderViewBuildCallback(b bVar) {
        this.f18755x = bVar;
    }

    public void setCampaignExes(List<CampaignEx> list) {
        this.f18745n = list;
    }

    public void setNotchPadding(int i9, int i10, int i11, int i12) {
        this.f18746o = i9;
        this.f18747p = i10;
        this.f18748q = i11;
        this.f18749r = i12;
        setViewStatus();
    }

    public void setRewarded(boolean z8) {
        this.f18756y = z8;
    }

    public void setViewStatus() {
        MBridgeOrderCampView mBridgeOrderCampView = this.m;
        if (mBridgeOrderCampView != null && this.f18756y) {
            RelativeLayout relativeLayout = (RelativeLayout) mBridgeOrderCampView.findViewById(filterFindViewId(this.f18753v, "mbridge_native_order_camp_controller"));
            this.f18751t = (FeedBackButton) this.m.findViewById(filterFindViewId(this.f18753v, "mbridge_native_order_camp_feed_btn"));
            this.f18752u = (ImageView) this.m.findViewById(filterFindViewId(this.f18753v, "mbridge_iv_link"));
            if (relativeLayout != null) {
                relativeLayout.setPadding(this.f18746o, this.f18748q, this.f18747p, this.f18749r);
            }
            if (this.f18751t != null) {
                try {
                    List<CampaignEx> list = this.f18745n;
                    if (list != null && list.get(0) != null) {
                        this.f18750s = this.f18745n.get(0).getCampaignUnitId();
                        this.b = this.f18745n.get(0);
                        com.mbridge.msdk.foundation.d.b.a().a(this.f18750s + "_2", this.b);
                        if (this.f18751t != null) {
                            if (com.mbridge.msdk.foundation.d.b.a().b()) {
                                com.mbridge.msdk.foundation.d.b.a().a(this.f18750s + "_2", new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView.3
                                    @Override // com.mbridge.msdk.foundation.d.a
                                    public final void a() {
                                    }

                                    @Override // com.mbridge.msdk.foundation.d.a
                                    public final void b() {
                                    }

                                    @Override // com.mbridge.msdk.foundation.d.a
                                    public final void a(String str) {
                                    }
                                });
                                com.mbridge.msdk.foundation.d.b.a().a(this.f18750s + "_2", this.f18751t);
                            } else {
                                this.f18751t.setVisibility(8);
                            }
                        }
                    }
                    FeedBackButton feedBackButton = this.f18751t;
                    if (feedBackButton != null) {
                        feedBackButton.setVisibility(8);
                    }
                } catch (Exception e4) {
                    ad.b(MBridgeBaseView.TAG, e4.getMessage());
                }
            }
            ImageView imageView = this.f18752u;
            if (imageView != null && imageView != null) {
                try {
                    g b = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
                    if (b != null) {
                        final String g9 = b.g();
                        if (TextUtils.isEmpty(g9)) {
                            this.f18752u.setVisibility(8);
                        }
                        this.f18752u.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView.4
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                com.mbridge.msdk.click.c.e(((MBridgeBaseView) MBridgeOrderCampView.this).f18768a, g9);
                            }
                        });
                        return;
                    }
                    this.f18752u.setVisibility(8);
                } catch (Exception e9) {
                    ad.b(MBridgeBaseView.TAG, e9.getMessage());
                }
            }
        }
    }

    public void startAlphaAnimation() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(500L);
        this.m.startAnimation(alphaAnimation);
    }

    public void startTranslateAnimation() {
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 1.0f, 2, 0.0f, 2, 0.0f, 2, 0.0f);
        translateAnimation.setDuration(500L);
        this.m.startAnimation(translateAnimation);
    }

    public MBridgeOrderCampView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18753v = false;
        this.f18754w = new c() { // from class: com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView.1
            @Override // com.mbridge.msdk.video.dynview.e.c
            public final void a(CampaignEx campaignEx, int i9) {
                if (campaignEx != null) {
                    try {
                        MBridgeOrderCampView.this.setCampaign(campaignEx);
                        campaignEx.setClickTempSource(2);
                        campaignEx.setTriggerClickSource(2);
                        MBridgeOrderCampView.a(MBridgeOrderCampView.this, campaignEx, 0, i9);
                    } catch (Exception e4) {
                        ad.b(MBridgeBaseView.TAG, e4.getMessage());
                    }
                }
            }

            @Override // com.mbridge.msdk.video.dynview.e.c
            public final void a() {
                MBridgeOrderCampView.a(MBridgeOrderCampView.this);
            }
        };
        this.f18756y = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView r8, com.mbridge.msdk.foundation.entity.CampaignEx r9, int r10, int r11) {
        /*
            java.lang.String r0 = "order_view_click"
            if (r9 == 0) goto L65
            boolean r1 = r9.isDynamicView()
            if (r1 == 0) goto L65
            com.mbridge.msdk.foundation.entity.CampaignEx$c r1 = r9.getRewardTemplateMode()     // Catch: java.lang.Exception -> L27
            java.lang.String r2 = ""
            if (r1 == 0) goto L25
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L27
            r3.<init>()     // Catch: java.lang.Exception -> L27
            int r1 = r1.f()     // Catch: java.lang.Exception -> L27
            r3.append(r1)     // Catch: java.lang.Exception -> L27
            r3.append(r2)     // Catch: java.lang.Exception -> L27
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Exception -> L27
        L25:
            r7 = r2
            goto L29
        L27:
            r9 = move-exception
            goto L5c
        L29:
            com.mbridge.msdk.foundation.controller.c r1 = com.mbridge.msdk.foundation.controller.c.m()     // Catch: java.lang.Exception -> L27
            android.content.Context r1 = r1.c()     // Catch: java.lang.Exception -> L27
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L27
            r2.<init>(r0)     // Catch: java.lang.Exception -> L27
            r2.append(r7)     // Catch: java.lang.Exception -> L27
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L27
            java.lang.String r3 = r9.getCampaignUnitId()     // Catch: java.lang.Exception -> L27
            boolean r4 = r9.isBidCampaign()     // Catch: java.lang.Exception -> L27
            java.lang.String r5 = r9.getRequestId()     // Catch: java.lang.Exception -> L27
            java.lang.String r6 = r9.getRequestIdNotice()     // Catch: java.lang.Exception -> L27
            java.lang.String r9 = r9.getId()     // Catch: java.lang.Exception -> L27
            r0 = r1
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r9
            com.mbridge.msdk.foundation.same.report.i.a(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L27
            goto L65
        L5c:
            java.lang.String r0 = "MBridgeBaseView"
            java.lang.String r9 = r9.getMessage()
            com.mbridge.msdk.foundation.tools.ad.b(r0, r9)
        L65:
            r9 = 0
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L7c
            r0.<init>()     // Catch: org.json.JSONException -> L7c
            java.lang.String r9 = com.mbridge.msdk.foundation.same.a.f15684j     // Catch: org.json.JSONException -> L7a
            org.json.JSONObject r10 = r8.a(r10)     // Catch: org.json.JSONException -> L7a
            r0.put(r9, r10)     // Catch: org.json.JSONException -> L7a
            java.lang.String r9 = "camp_position"
            r0.put(r9, r11)     // Catch: org.json.JSONException -> L7a
            goto L82
        L7a:
            r9 = move-exception
            goto L7f
        L7c:
            r10 = move-exception
            r0 = r9
            r9 = r10
        L7f:
            r9.printStackTrace()
        L82:
            com.mbridge.msdk.video.module.a.a r8 = r8.notifyListener
            if (r8 == 0) goto L8b
            r9 = 105(0x69, float:1.47E-43)
            r8.a(r9, r0)
        L8b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView.a(com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView, com.mbridge.msdk.foundation.entity.CampaignEx, int, int):void");
    }
}

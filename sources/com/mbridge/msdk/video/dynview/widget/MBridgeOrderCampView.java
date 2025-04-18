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

/* loaded from: classes4.dex */
public class MBridgeOrderCampView extends MBridgeBaseView {

    /* renamed from: m, reason: collision with root package name */
    private MBridgeOrderCampView f15876m;

    /* renamed from: n, reason: collision with root package name */
    private List<CampaignEx> f15877n;

    /* renamed from: o, reason: collision with root package name */
    private int f15878o;

    /* renamed from: p, reason: collision with root package name */
    private int f15879p;

    /* renamed from: q, reason: collision with root package name */
    private int f15880q;

    /* renamed from: r, reason: collision with root package name */
    private int f15881r;

    /* renamed from: s, reason: collision with root package name */
    private String f15882s;

    /* renamed from: t, reason: collision with root package name */
    private FeedBackButton f15883t;
    private ImageView u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f15884v;

    /* renamed from: w, reason: collision with root package name */
    private c f15885w;

    /* renamed from: x, reason: collision with root package name */
    private b f15886x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f15887y;

    public MBridgeOrderCampView(Context context) {
        super(context);
        this.f15884v = false;
        this.f15885w = new c() { // from class: com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView.1
            @Override // com.mbridge.msdk.video.dynview.e.c
            public final void a(CampaignEx campaignEx, int i10) {
                if (campaignEx != null) {
                    try {
                        MBridgeOrderCampView.this.setCampaign(campaignEx);
                        campaignEx.setClickTempSource(2);
                        campaignEx.setTriggerClickSource(2);
                        MBridgeOrderCampView.a(MBridgeOrderCampView.this, campaignEx, 0, i10);
                    } catch (Exception e2) {
                        ad.b(MBridgeBaseView.TAG, e2.getMessage());
                    }
                }
            }

            @Override // com.mbridge.msdk.video.dynview.e.c
            public final void a() {
                MBridgeOrderCampView.a(MBridgeOrderCampView.this);
            }
        };
        this.f15887y = false;
    }

    public void createView(final ViewGroup viewGroup) {
        if (this.f15877n == null) {
            b bVar = this.f15886x;
            if (bVar != null) {
                bVar.b();
                return;
            }
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("order_view_callback", this.f15885w);
        com.mbridge.msdk.video.dynview.c b3 = new com.mbridge.msdk.video.dynview.j.c().b(com.mbridge.msdk.foundation.controller.c.m().c(), this.f15877n);
        com.mbridge.msdk.video.dynview.b.a();
        new com.mbridge.msdk.video.dynview.h.a(b3, new h() { // from class: com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView.2
            @Override // com.mbridge.msdk.video.dynview.e.h
            public final void a(com.mbridge.msdk.video.dynview.a aVar) {
                if (aVar != null) {
                    try {
                        MBridgeOrderCampView.this.f15876m.addView(aVar.a());
                        MBridgeOrderCampView.this.f15884v = aVar.c();
                        viewGroup.removeAllViews();
                        viewGroup.addView(MBridgeOrderCampView.this.f15876m);
                        f.a(com.mbridge.msdk.foundation.controller.c.m().c(), (List<CampaignEx>) MBridgeOrderCampView.this.f15877n, ((CampaignEx) MBridgeOrderCampView.this.f15877n.get(0)).getCampaignUnitId());
                        MBridgeOrderCampView.this.setViewStatus();
                        if (MBridgeOrderCampView.this.f15886x != null) {
                            MBridgeOrderCampView.this.f15886x.a();
                        }
                    } catch (Exception e2) {
                        ad.b(MBridgeBaseView.TAG, e2.getMessage());
                    }
                }
            }

            @Override // com.mbridge.msdk.video.dynview.e.h
            public final void a(com.mbridge.msdk.video.dynview.c.a aVar) {
                try {
                    f.a(com.mbridge.msdk.foundation.controller.c.m().c(), (List<CampaignEx>) MBridgeOrderCampView.this.f15877n, ((CampaignEx) MBridgeOrderCampView.this.f15877n.get(0)).getCampaignUnitId(), aVar.b());
                    if (MBridgeOrderCampView.this.f15886x != null) {
                        MBridgeOrderCampView.this.f15886x.b();
                    }
                } catch (Exception e2) {
                    ad.b(MBridgeBaseView.TAG, e2.getMessage());
                }
            }
        }, hashMap);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        this.f15876m = this;
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
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r0 = r5.f15877n
            if (r0 != 0) goto L8
            return
        L8:
            r0 = 0
        L9:
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r1 = r5.f15877n
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
        this.f15886x = bVar;
    }

    public void setCampaignExes(List<CampaignEx> list) {
        this.f15877n = list;
    }

    public void setNotchPadding(int i10, int i11, int i12, int i13) {
        this.f15878o = i10;
        this.f15879p = i11;
        this.f15880q = i12;
        this.f15881r = i13;
        setViewStatus();
    }

    public void setRewarded(boolean z10) {
        this.f15887y = z10;
    }

    public void setViewStatus() {
        MBridgeOrderCampView mBridgeOrderCampView = this.f15876m;
        if (mBridgeOrderCampView != null && this.f15887y) {
            RelativeLayout relativeLayout = (RelativeLayout) mBridgeOrderCampView.findViewById(filterFindViewId(this.f15884v, "mbridge_native_order_camp_controller"));
            this.f15883t = (FeedBackButton) this.f15876m.findViewById(filterFindViewId(this.f15884v, "mbridge_native_order_camp_feed_btn"));
            this.u = (ImageView) this.f15876m.findViewById(filterFindViewId(this.f15884v, "mbridge_iv_link"));
            if (relativeLayout != null) {
                relativeLayout.setPadding(this.f15878o, this.f15880q, this.f15879p, this.f15881r);
            }
            if (this.f15883t != null) {
                try {
                    List<CampaignEx> list = this.f15877n;
                    if (list != null && list.get(0) != null) {
                        this.f15882s = this.f15877n.get(0).getCampaignUnitId();
                        this.f15895b = this.f15877n.get(0);
                        com.mbridge.msdk.foundation.d.b.a().a(this.f15882s + "_2", this.f15895b);
                        if (this.f15883t != null) {
                            if (com.mbridge.msdk.foundation.d.b.a().b()) {
                                com.mbridge.msdk.foundation.d.b.a().a(this.f15882s + "_2", new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView.3
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
                                com.mbridge.msdk.foundation.d.b.a().a(this.f15882s + "_2", this.f15883t);
                            } else {
                                this.f15883t.setVisibility(8);
                            }
                        }
                    }
                    FeedBackButton feedBackButton = this.f15883t;
                    if (feedBackButton != null) {
                        feedBackButton.setVisibility(8);
                    }
                } catch (Exception e2) {
                    ad.b(MBridgeBaseView.TAG, e2.getMessage());
                }
            }
            ImageView imageView = this.u;
            if (imageView != null && imageView != null) {
                try {
                    g b3 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
                    if (b3 != null) {
                        final String g10 = b3.g();
                        if (TextUtils.isEmpty(g10)) {
                            this.u.setVisibility(8);
                        }
                        this.u.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView.4
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                com.mbridge.msdk.click.c.e(((MBridgeBaseView) MBridgeOrderCampView.this).a, g10);
                            }
                        });
                        return;
                    }
                    this.u.setVisibility(8);
                } catch (Exception e10) {
                    ad.b(MBridgeBaseView.TAG, e10.getMessage());
                }
            }
        }
    }

    public void startAlphaAnimation() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(500L);
        this.f15876m.startAnimation(alphaAnimation);
    }

    public void startTranslateAnimation() {
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 1.0f, 2, 0.0f, 2, 0.0f, 2, 0.0f);
        translateAnimation.setDuration(500L);
        this.f15876m.startAnimation(translateAnimation);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView r8, com.mbridge.msdk.foundation.entity.CampaignEx r9, int r10, int r11) {
        /*
            java.lang.String r0 = "order_view_click"
            if (r9 == 0) goto L63
            boolean r1 = r9.isDynamicView()
            if (r1 == 0) goto L63
            com.mbridge.msdk.foundation.entity.CampaignEx$c r1 = r9.getRewardTemplateMode()     // Catch: java.lang.Exception -> L59
            java.lang.String r2 = ""
            if (r1 == 0) goto L25
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L59
            r3.<init>()     // Catch: java.lang.Exception -> L59
            int r1 = r1.f()     // Catch: java.lang.Exception -> L59
            r3.append(r1)     // Catch: java.lang.Exception -> L59
            r3.append(r2)     // Catch: java.lang.Exception -> L59
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Exception -> L59
        L25:
            r7 = r2
            com.mbridge.msdk.foundation.controller.c r1 = com.mbridge.msdk.foundation.controller.c.m()     // Catch: java.lang.Exception -> L59
            android.content.Context r1 = r1.c()     // Catch: java.lang.Exception -> L59
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L59
            r2.<init>(r0)     // Catch: java.lang.Exception -> L59
            r2.append(r7)     // Catch: java.lang.Exception -> L59
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L59
            java.lang.String r3 = r9.getCampaignUnitId()     // Catch: java.lang.Exception -> L59
            boolean r4 = r9.isBidCampaign()     // Catch: java.lang.Exception -> L59
            java.lang.String r5 = r9.getRequestId()     // Catch: java.lang.Exception -> L59
            java.lang.String r6 = r9.getRequestIdNotice()     // Catch: java.lang.Exception -> L59
            java.lang.String r9 = r9.getId()     // Catch: java.lang.Exception -> L59
            r0 = r1
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r9
            com.mbridge.msdk.foundation.same.report.i.a(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L59
            goto L63
        L59:
            r9 = move-exception
            java.lang.String r0 = "MBridgeBaseView"
            java.lang.String r9 = r9.getMessage()
            com.mbridge.msdk.foundation.tools.ad.b(r0, r9)
        L63:
            r9 = 0
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L7a
            r0.<init>()     // Catch: org.json.JSONException -> L7a
            java.lang.String r9 = com.mbridge.msdk.foundation.same.a.f13279j     // Catch: org.json.JSONException -> L78
            org.json.JSONObject r10 = r8.a(r10)     // Catch: org.json.JSONException -> L78
            r0.put(r9, r10)     // Catch: org.json.JSONException -> L78
            java.lang.String r9 = "camp_position"
            r0.put(r9, r11)     // Catch: org.json.JSONException -> L78
            goto L80
        L78:
            r9 = move-exception
            goto L7d
        L7a:
            r10 = move-exception
            r0 = r9
            r9 = r10
        L7d:
            r9.printStackTrace()
        L80:
            com.mbridge.msdk.video.module.a.a r8 = r8.notifyListener
            if (r8 == 0) goto L89
            r9 = 105(0x69, float:1.47E-43)
            r8.a(r9, r0)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView.a(com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView, com.mbridge.msdk.foundation.entity.CampaignEx, int, int):void");
    }

    public MBridgeOrderCampView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15884v = false;
        this.f15885w = new c() { // from class: com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView.1
            @Override // com.mbridge.msdk.video.dynview.e.c
            public final void a(CampaignEx campaignEx, int i10) {
                if (campaignEx != null) {
                    try {
                        MBridgeOrderCampView.this.setCampaign(campaignEx);
                        campaignEx.setClickTempSource(2);
                        campaignEx.setTriggerClickSource(2);
                        MBridgeOrderCampView.a(MBridgeOrderCampView.this, campaignEx, 0, i10);
                    } catch (Exception e2) {
                        ad.b(MBridgeBaseView.TAG, e2.getMessage());
                    }
                }
            }

            @Override // com.mbridge.msdk.video.dynview.e.c
            public final void a() {
                MBridgeOrderCampView.a(MBridgeOrderCampView.this);
            }
        };
        this.f15887y = false;
    }

    public static /* synthetic */ void a(MBridgeOrderCampView mBridgeOrderCampView) {
        try {
            d dVar = new d();
            dVar.a("type", 2);
            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000152", dVar);
            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000134", mBridgeOrderCampView.f15895b);
        } catch (Throwable th2) {
            ad.a(MBridgeBaseView.TAG, th2.getMessage());
        }
        try {
            com.mbridge.msdk.video.dynview.moffer.a.a().b();
        } catch (Exception e2) {
            ad.b(MBridgeBaseView.TAG, e2.getMessage());
        }
        com.mbridge.msdk.video.module.a.a aVar = mBridgeOrderCampView.notifyListener;
        if (aVar != null) {
            aVar.a(104, "");
        }
    }
}

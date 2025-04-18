package com.bytedance.sdk.openadsdk.core.tN;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.qsH.qsH;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.DSW;
import com.bytedance.sdk.openadsdk.core.Sg.Sg;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.qsH.NjR;
import com.bytedance.sdk.openadsdk.core.qsH.qO;
import com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.GS;
import com.bytedance.sdk.openadsdk.utils.Ne;
import com.bytedance.sdk.openadsdk.utils.Sco;
import com.bytedance.sdk.openadsdk.utils.dXO;
import com.bytedance.sdk.openadsdk.utils.lu;
import com.bytedance.sdk.openadsdk.utils.mn;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AlY extends PAGBannerAd {
    protected AdSlot AlY;
    private final boolean DSW;
    private com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.vc NjR;
    protected final Context Sg;
    protected tN YFl;
    private boolean YoT;
    private boolean eT;
    private qO pDU;
    private PAGBannerAdWrapperListener qsH;
    private boolean rkt;
    protected Wwa tN;
    TTDislikeDialogAbstract wN;

    /* renamed from: nc, reason: collision with root package name */
    private final Queue<Long> f10749nc = new LinkedList();
    private String GA = "banner_ad";
    private final AtomicBoolean EH = new AtomicBoolean(false);

    /* renamed from: vc, reason: collision with root package name */
    protected final View.OnAttachStateChangeListener f10750vc = new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.tN.AlY.1
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (!AlY.this.rkt) {
                AlY alY = AlY.this;
                alY.YFl(alY.YFl.getCurView(), AlY.this.tN);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            AlY.this.YFl.tN();
        }
    };

    /* loaded from: classes.dex */
    public static class Sg extends qsH {
        Wwa Sg;
        boolean YFl;
        WeakReference<AlY> tN;

        public Sg(boolean z10, Wwa wwa, AlY alY) {
            super("ReportWindowFocusChangedAdShow");
            this.YFl = z10;
            this.Sg = wwa;
            this.tN = new WeakReference<>(alY);
        }

        @Override // java.lang.Runnable
        public void run() {
            WeakReference<AlY> weakReference = this.tN;
            if (weakReference != null && weakReference.get() != null) {
                this.tN.get().Sg(this.YFl, this.Sg);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface YFl {
        void YFl();
    }

    public AlY(Context context, Wwa wwa, AdSlot adSlot) {
        this.Sg = context;
        this.tN = wwa;
        this.AlY = adSlot;
        YFl(context, wwa, adSlot);
        this.DSW = false;
        this.rkt = false;
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void destroy() {
        tN tNVar = this.YFl;
        if (tNVar != null) {
            try {
                tNVar.tN();
                this.YFl.removeOnAttachStateChangeListener(this.f10750vc);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public View getBannerView() {
        com.bytedance.sdk.openadsdk.utils.Sg.YFl(this.tN);
        IPMiBroadcastReceiver.YFl(this.Sg, this.tN);
        return this.YFl;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        Wwa wwa = this.tN;
        if (wwa != null && wwa.AfY() != null) {
            try {
                return this.tN.AfY().get(str);
            } catch (Throwable th2) {
                YoT.YFl("PAGBannerAdImpl", th2.getMessage());
                return null;
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        Wwa wwa = this.tN;
        if (wwa != null) {
            return wwa.AfY();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d10, String str, String str2) {
        if (!this.YoT) {
            dXO.YFl(this.tN, d10, str, str2);
            this.YoT = true;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void setAdInteractionCallback(PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback) {
        wN wNVar = new wN(pAGBannerAdInteractionCallback);
        this.qsH = wNVar;
        this.YFl.setExpressInteractionListener(wNVar);
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void setAdInteractionListener(PAGBannerAdInteractionListener pAGBannerAdInteractionListener) {
        wN wNVar = new wN(pAGBannerAdInteractionListener);
        this.qsH = wNVar;
        this.YFl.setExpressInteractionListener(wNVar);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d10) {
        if (!this.eT) {
            dXO.YFl(this.tN, d10);
            this.eT = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tN() {
        Sg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sg(boolean z10, Wwa wwa) {
        Long poll;
        try {
            if (z10) {
                this.f10749nc.offer(Long.valueOf(System.currentTimeMillis()));
            } else {
                if (this.f10749nc.size() <= 0 || this.pDU == null || (poll = this.f10749nc.poll()) == null) {
                    return;
                }
                com.bytedance.sdk.openadsdk.AlY.tN.YFl(String.valueOf(System.currentTimeMillis() - poll.longValue()), wwa, this.GA, this.pDU.getAdShowTime());
            }
        } catch (Exception e2) {
            YoT.YFl("PAGBannerAdImpl", e2.getMessage());
        }
    }

    public void YFl(Context context, Wwa wwa, AdSlot adSlot) {
        tN tNVar = new tN(context, wwa, adSlot);
        this.YFl = tNVar;
        tNVar.addOnAttachStateChangeListener(this.f10750vc);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void YFl(@NonNull final qO qOVar, @NonNull final Wwa wwa) {
        final com.bytedance.sdk.openadsdk.core.DSW dsw;
        if (qOVar == null || wwa == null) {
            return;
        }
        this.tN = wwa;
        this.NjR = YFl(wwa);
        this.pDU = qOVar;
        final String YFl2 = Ne.YFl();
        final YFl YFl3 = YFl();
        qOVar.setClosedListenerKey(YFl2);
        qOVar.setBannerClickClosedListener(YFl3);
        qOVar.setBackupListener(new com.bytedance.sdk.component.adexpress.Sg.tN() { // from class: com.bytedance.sdk.openadsdk.core.tN.AlY.2
            @Override // com.bytedance.sdk.component.adexpress.Sg.tN
            public boolean YFl(ViewGroup viewGroup, int i10) {
                try {
                    qOVar.YoT();
                    if (AlY.this.tN.yn()) {
                        DSW dsw2 = new DSW(qOVar.getContext());
                        dsw2.setClosedListenerKey(YFl2);
                        AlY alY = AlY.this;
                        dsw2.YFl(alY.tN, qOVar, alY.NjR);
                        dsw2.setDislikeOuter(AlY.this.wN);
                        dsw2.setAdInteractionListener(AlY.this.qsH);
                        qOVar.setVastVideoHelper(dsw2);
                        return true;
                    }
                    com.bytedance.sdk.openadsdk.core.tN.YFl yFl = new com.bytedance.sdk.openadsdk.core.tN.YFl(qOVar.getContext());
                    yFl.setClosedListenerKey(YFl2);
                    AlY alY2 = AlY.this;
                    yFl.YFl(alY2.tN, qOVar, alY2.NjR);
                    yFl.setDislikeOuter(AlY.this.wN);
                    yFl.setAdInteractionListener(AlY.this.qsH);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        });
        if (!this.DSW) {
            com.bytedance.sdk.openadsdk.core.DSW YFl4 = YFl(qOVar);
            if (YFl4 == null) {
                YFl4 = new com.bytedance.sdk.openadsdk.core.DSW(this.Sg, qOVar);
                qOVar.addView(YFl4);
            }
            dsw = YFl4;
            dsw.setCallback(new DSW.YFl() { // from class: com.bytedance.sdk.openadsdk.core.tN.AlY.3
                @Override // com.bytedance.sdk.openadsdk.core.DSW.YFl
                public void Sg() {
                    AlY.this.YFl(dsw, false, wwa);
                }

                @Override // com.bytedance.sdk.openadsdk.core.DSW.YFl
                public void YFl(boolean z10) {
                    AlY.this.YFl(z10, wwa);
                }

                @Override // com.bytedance.sdk.openadsdk.core.DSW.YFl
                public void YFl() {
                    AlY.this.tN();
                }

                @Override // com.bytedance.sdk.openadsdk.core.DSW.YFl
                public void YFl(View view) {
                    if (AlY.this.EH.compareAndSet(false, true)) {
                        AlY.this.YFl(view, qOVar, wwa, YFl2, YFl3);
                    }
                }
            });
        } else {
            lu.YFl(qOVar, true, 1, new lu.Sg() { // from class: com.bytedance.sdk.openadsdk.core.tN.AlY.4
                @Override // com.bytedance.sdk.openadsdk.utils.lu.Sg
                public void Sg() {
                    AlY.this.YFl((com.bytedance.sdk.openadsdk.core.DSW) null, true, wwa);
                }

                @Override // com.bytedance.sdk.openadsdk.utils.lu.Sg
                public void YFl(boolean z10) {
                    AlY.this.YFl(z10, wwa);
                }

                @Override // com.bytedance.sdk.openadsdk.utils.lu.Sg
                public void YFl() {
                    AlY.this.tN();
                }

                @Override // com.bytedance.sdk.openadsdk.utils.lu.Sg
                public void YFl(View view, boolean z10) {
                    if (z10 && AlY.this.EH.compareAndSet(false, true)) {
                        AlY.this.YFl(view, qOVar, wwa, YFl2, YFl3);
                    }
                }
            }, null);
            dsw = null;
        }
        Context YFl5 = com.bytedance.sdk.component.utils.Sg.YFl(qOVar);
        if (YFl5 == null) {
            YFl5 = this.Sg;
        }
        NjR njR = new NjR(YFl5, wwa, this.GA, 2);
        njR.YFl(qOVar);
        njR.YFl(this);
        njR.YFl(this.NjR);
        njR.YFl(new Sg.YFl() { // from class: com.bytedance.sdk.openadsdk.core.tN.AlY.5
            @Override // com.bytedance.sdk.openadsdk.core.Sg.Sg.YFl
            public void YFl(View view, int i10) {
                if (AlY.this.qsH != null) {
                    AlY.this.qsH.onAdClicked();
                }
            }
        });
        qOVar.setClickListener(njR);
        com.bytedance.sdk.openadsdk.core.qsH.qsH qsh = new com.bytedance.sdk.openadsdk.core.qsH.qsH(this.Sg, wwa, this.GA, 2);
        qsh.YFl((View) qOVar);
        qsh.YFl(this);
        qsh.YFl(new Sg.YFl() { // from class: com.bytedance.sdk.openadsdk.core.tN.AlY.6
            @Override // com.bytedance.sdk.openadsdk.core.Sg.Sg.YFl
            public void YFl(View view, int i10) {
                if (AlY.this.qsH != null) {
                    AlY.this.qsH.onAdClicked();
                }
            }
        });
        qO qOVar2 = this.pDU;
        if (qOVar2 instanceof com.bytedance.sdk.openadsdk.core.qsH.Wwa) {
            qsh.YFl(((com.bytedance.sdk.openadsdk.core.qsH.Wwa) qOVar2).getVideoController());
        }
        qsh.YFl(this.NjR);
        qOVar.setClickCreativeListener(qsh);
        if (this.DSW) {
            return;
        }
        dsw.setNeedCheckingShow(true);
    }

    private void Sg(Wwa wwa) {
        Queue<Long> queue = this.f10749nc;
        if (queue == null || queue.size() <= 0 || wwa == null) {
            return;
        }
        try {
            long longValue = this.f10749nc.poll().longValue();
            if (longValue <= 0 || this.pDU == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.AlY.tN.YFl(String.valueOf(System.currentTimeMillis() - longValue), wwa, this.GA, this.pDU.getAdShowTime());
        } catch (Exception e2) {
            YoT.YFl("PAGBannerAdImpl", e2.getMessage());
        }
    }

    public void Sg() {
        this.tN.YFl(SystemClock.elapsedRealtime());
        this.YFl.Sg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(boolean z10, Wwa wwa) {
        if (z10 && this.tN.xSx() && !this.tN.VRF()) {
            this.tN.DSW(true);
            Wwa wwa2 = this.tN;
            com.bytedance.sdk.openadsdk.AlY.tN.YFl(wwa2, this.GA, wwa2.EQ());
        }
        mn.Sg(new Sg(z10, wwa, this), 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(com.bytedance.sdk.openadsdk.core.DSW dsw, boolean z10, Wwa wwa) {
        Sg(wwa);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(View view, qO qOVar, Wwa wwa, String str, YFl yFl) {
        com.bytedance.sdk.openadsdk.core.NjR.Sg().YFl(str, yFl);
        Queue<Long> queue = this.f10749nc;
        if (queue != null) {
            queue.offer(Long.valueOf(System.currentTimeMillis()));
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (qOVar != null) {
                jSONObject.put("dynamic_show_type", qOVar.getDynamicShowType());
                qOVar.YFl(jSONObject, wwa);
            }
            if (view != null) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("width", view.getWidth());
                    jSONObject2.put("height", view.getHeight());
                    jSONObject2.put("alpha", view.getAlpha());
                } catch (Throwable unused) {
                }
                jSONObject.put("root_view", jSONObject2.toString());
            }
            com.bytedance.sdk.openadsdk.AlY.tN.YFl(wwa, this.GA, jSONObject);
        } catch (JSONException unused2) {
            YoT.YFl("PAGBannerAdImpl", "onShowFun json error");
        }
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = this.qsH;
        if (pAGBannerAdWrapperListener != null) {
            pAGBannerAdWrapperListener.onAdShow(view, wwa.ko());
        }
        if (wwa.rE()) {
            Sco.YFl(wwa, view);
        }
        tN tNVar = this.YFl;
        if (tNVar == null || tNVar.getCurView() == null) {
            return;
        }
        this.YFl.getCurView().nc();
        this.YFl.getCurView().qsH();
    }

    private com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.vc YFl(Wwa wwa) {
        if (wwa.ko() == 4) {
            return com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.DSW.YFl(this.Sg, wwa, this.GA);
        }
        return null;
    }

    private com.bytedance.sdk.openadsdk.core.DSW YFl(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return null;
        }
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            try {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof com.bytedance.sdk.openadsdk.core.DSW) {
                    return (com.bytedance.sdk.openadsdk.core.DSW) childAt;
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public YFl YFl() {
        return new YFl() { // from class: com.bytedance.sdk.openadsdk.core.tN.AlY.7
            @Override // com.bytedance.sdk.openadsdk.core.tN.AlY.YFl
            public void YFl() {
                int width = AlY.this.pDU.getWidth();
                int height = AlY.this.pDU.getHeight();
                View YFl2 = YFl(((double) height) >= Math.floor((((double) width) * 450.0d) / 600.0d));
                AlY.this.pDU.pDU();
                AlY.this.pDU.removeAllViews();
                AlY.this.pDU.addView(YFl2, new ViewGroup.LayoutParams(width, height));
                AlY.this.pDU.setClickCreativeListener(null);
                AlY.this.pDU.setClickListener(null);
                if (AlY.this.qsH != null) {
                    AlY.this.qsH.onAdDismissed();
                }
                AlY.this.rkt = true;
            }

            private View YFl(boolean z10) {
                com.bytedance.sdk.openadsdk.core.wN.tN tNVar = new com.bytedance.sdk.openadsdk.core.wN.tN(AlY.this.Sg);
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                tNVar.setBackgroundColor(-1);
                tNVar.setLayoutParams(layoutParams);
                View view = new View(AlY.this.Sg);
                ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                view.setAlpha(0.3f);
                view.setBackgroundColor(Color.parseColor("#F3F7F8"));
                tNVar.addView(view, layoutParams2);
                com.bytedance.sdk.openadsdk.core.wN.tN tNVar2 = new com.bytedance.sdk.openadsdk.core.wN.tN(AlY.this.Sg);
                ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
                if (z10) {
                    tNVar2.setBackground(com.bytedance.sdk.component.utils.qO.tN(AlY.this.Sg, "tt_ad_closed_background_300_250"));
                } else {
                    tNVar2.setBackground(com.bytedance.sdk.component.utils.qO.tN(AlY.this.Sg, "tt_ad_closed_background_320_50"));
                }
                tNVar.addView(tNVar2, layoutParams3);
                com.bytedance.sdk.openadsdk.core.wN.AlY alY = new com.bytedance.sdk.openadsdk.core.wN.AlY(AlY.this.Sg);
                alY.setId(520093739);
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
                if (z10) {
                    int tN = GS.tN(AlY.this.Sg, 16.0f);
                    layoutParams4.width = GS.tN(AlY.this.Sg, 77.0f);
                    layoutParams4.height = GS.tN(AlY.this.Sg, 14.0f);
                    layoutParams4.leftMargin = tN;
                    layoutParams4.topMargin = tN;
                } else {
                    int tN2 = GS.tN(AlY.this.Sg, 8.0f);
                    layoutParams4.width = GS.tN(AlY.this.Sg, 45.0f);
                    layoutParams4.height = GS.tN(AlY.this.Sg, 8.18f);
                    layoutParams4.leftMargin = tN2;
                    layoutParams4.topMargin = tN2;
                }
                alY.setImageResource(com.bytedance.sdk.component.utils.qO.AlY(AlY.this.Sg, "tt_ad_closed_logo_red"));
                tNVar2.addView(alY, layoutParams4);
                com.bytedance.sdk.openadsdk.core.wN.qsH qsh = new com.bytedance.sdk.openadsdk.core.wN.qsH(AlY.this.Sg);
                FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams5.gravity = 17;
                qsh.setAlpha(0.5f);
                qsh.setLines(1);
                qsh.setText(com.bytedance.sdk.component.utils.qO.YFl(AlY.this.Sg, "tt_ad_is_closed"));
                if (z10) {
                    qsh.setTextSize(18.0f);
                } else {
                    qsh.setTextSize(12.0f);
                }
                tNVar2.addView(qsh, layoutParams5);
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.tN.AlY.7.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        AlY alY2 = AlY.this;
                        TTWebsiteActivity.YFl(alY2.Sg, alY2.tN, alY2.GA);
                    }
                };
                alY.setOnClickListener(onClickListener);
                qsh.setOnClickListener(onClickListener);
                return tNVar;
            }
        };
    }
}

package com.bytedance.sdk.openadsdk.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.JProtect;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView;
import com.bytedance.sdk.openadsdk.core.EmptyView;
import com.bytedance.sdk.openadsdk.core.lMd.KS;
import com.bytedance.sdk.openadsdk.core.lMd.lMd;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.utils.UPs;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.YhE;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class dQp {
    private com.bykv.vk.openvk.component.video.api.jU.KS Bj;
    private final String HWF;
    private final Context KS;
    private com.bytedance.sdk.openadsdk.apiImpl.feed.HWF QR;
    private final com.bytedance.sdk.openadsdk.apiImpl.feed.zp dT;
    private final PAGNativeAd jU;
    private long ku;
    private com.com.bytedance.overseas.sdk.zp.KS lMd;
    private com.bytedance.sdk.openadsdk.core.lMd.zp rV;
    private com.bytedance.sdk.openadsdk.core.lMd.lMd tG;
    private final com.bytedance.sdk.openadsdk.core.model.woN zp;
    private List<View> COT = new ArrayList();
    private final com.bytedance.sdk.openadsdk.lMd.QR YW = new com.bytedance.sdk.openadsdk.lMd.QR();
    private final AtomicBoolean vDp = new AtomicBoolean(false);

    /* loaded from: classes.dex */
    public static class zp implements View.OnLayoutChangeListener {
        private final ViewGroup lMd;
        private final com.bytedance.sdk.openadsdk.lMd.QR zp;

        public zp(com.bytedance.sdk.openadsdk.lMd.QR qr, ViewGroup viewGroup) {
            this.zp = qr;
            this.lMd = viewGroup;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
            this.zp.zp(System.currentTimeMillis(), Lij.zp(this.lMd));
        }
    }

    public dQp(Context context, PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.core.model.woN won, String str, com.bytedance.sdk.openadsdk.apiImpl.feed.zp zpVar) {
        this.jU = pAGNativeAd;
        this.zp = won;
        this.KS = context;
        this.HWF = str;
        this.dT = zpVar;
        if (won.oKZ() == 4) {
            this.lMd = com.com.bytedance.overseas.sdk.zp.jU.zp(context, won, str);
        }
    }

    private void KS(ViewGroup viewGroup) {
        com.bytedance.sdk.openadsdk.core.model.woN won;
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.COT != null) {
                JSONArray jSONArray = new JSONArray();
                for (View view : this.COT) {
                    if (view != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put("width", view.getWidth());
                            jSONObject2.put("height", view.getHeight());
                            jSONObject2.put("alpha", view.getAlpha());
                        } catch (Throwable unused) {
                        }
                        jSONArray.put(jSONObject2);
                    }
                }
                jSONObject.put("image_view", jSONArray.toString());
            }
            if (viewGroup != null) {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("width", viewGroup.getWidth());
                    jSONObject3.put("height", viewGroup.getHeight());
                    jSONObject3.put("alpha", viewGroup.getAlpha());
                } catch (Throwable unused2) {
                }
                jSONObject.put("root_view", jSONObject3.toString());
            }
            if (this.dT.ku() != null) {
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("width", WNy.KS(this.KS, r11.getWidth()) * 1.0f);
                    jSONObject4.put("height", WNy.KS(this.KS, r11.getHeight()) * 1.0f);
                } catch (Throwable unused3) {
                }
                jSONObject.put("media_view", jSONObject4.toString());
            }
            NativeExpressView lMd = this.dT.lMd();
            if (lMd != null && (won = this.zp) != null) {
                jSONObject.put("dynamic_show_type", won.yRU());
                lMd.zp(jSONObject, this.zp);
            }
            com.bytedance.sdk.openadsdk.lMd.KS.zp(this.zp, this.HWF, jSONObject);
        } catch (JSONException e4) {
            com.bytedance.sdk.component.utils.tG.zp("InteractionManager", "onShowFun json error", e4);
        }
    }

    private EmptyView jU(ViewGroup viewGroup) {
        for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
            View childAt = viewGroup.getChildAt(i9);
            if (childAt instanceof EmptyView) {
                return (EmptyView) childAt;
            }
        }
        return null;
    }

    private EmptyView lMd(@NonNull ViewGroup viewGroup, List<View> list, List<View> list2, @Nullable List<View> list3, com.bytedance.sdk.openadsdk.apiImpl.feed.HWF hwf) {
        this.QR = hwf;
        viewGroup.addOnLayoutChangeListener(new zp(this.YW, viewGroup));
        this.COT = list;
        EmptyView jU = jU(viewGroup);
        if (jU == null) {
            jU = new EmptyView(this.KS, viewGroup);
            viewGroup.addView(jU);
        }
        jU.zp();
        jU.setRefClickViews(list2);
        if (list != null) {
            for (View view : this.COT) {
                if (view != null) {
                    view.setTag(520093762, Boolean.TRUE);
                }
            }
            if (list3 != null) {
                list3.addAll(list);
            }
        }
        jU.setRefCreativeViews(list3);
        return jU;
    }

    public com.bytedance.sdk.openadsdk.lMd.QR zp() {
        return this.YW;
    }

    public void zp(View view, int i9) {
        com.bytedance.sdk.openadsdk.apiImpl.feed.HWF hwf = this.QR;
        if (hwf != null) {
            hwf.onAdClicked();
        }
    }

    public void zp(@NonNull ViewGroup viewGroup, List<View> list, List<View> list2, @Nullable List<View> list3, @Nullable View view, com.bytedance.sdk.openadsdk.apiImpl.feed.HWF hwf) {
        zp(viewGroup, list, list2, list3, hwf);
        zp(viewGroup, view);
        zp(viewGroup, list2, list3);
    }

    private void zp(@NonNull ViewGroup viewGroup, List<View> list, List<View> list2, @Nullable List<View> list3, com.bytedance.sdk.openadsdk.apiImpl.feed.HWF hwf) {
        this.QR = hwf;
        viewGroup.addOnLayoutChangeListener(new zp(this.YW, viewGroup));
        this.COT = list;
        zp(list2, (com.bytedance.sdk.openadsdk.core.lMd.KS) null);
        if (list != null) {
            for (View view : this.COT) {
                if (view != null) {
                    view.setTag(520093762, Boolean.TRUE);
                }
            }
            if (list3 != null) {
                list3.addAll(list);
            }
        }
        zp(list3, (com.bytedance.sdk.openadsdk.core.lMd.KS) null);
    }

    private void lMd(com.bytedance.sdk.openadsdk.core.lMd.lMd lmd, com.bytedance.sdk.openadsdk.core.lMd.zp zpVar) {
        com.bytedance.sdk.openadsdk.apiImpl.feed.zp zpVar2 = this.dT;
        if (zpVar2 != null && zpVar2.lMd() != null) {
            NativeExpressView lMd = this.dT.lMd();
            if ((lmd instanceof com.bytedance.sdk.openadsdk.core.nativeexpress.QR) && (zpVar instanceof com.bytedance.sdk.openadsdk.core.nativeexpress.HWF)) {
                lMd.setClickListener((com.bytedance.sdk.openadsdk.core.nativeexpress.QR) lmd);
                lMd.setClickCreativeListener((com.bytedance.sdk.openadsdk.core.nativeexpress.HWF) zpVar);
            }
            lMd.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.lMd() { // from class: com.bytedance.sdk.openadsdk.core.dQp.3
                @Override // com.bytedance.sdk.openadsdk.core.widget.lMd
                public void zp() {
                    dQp.this.QR.onAdClicked();
                }
            });
        }
        com.bytedance.sdk.openadsdk.apiImpl.feed.zp zpVar3 = this.dT;
        if (zpVar3 != null && zpVar3.zp() != null) {
            this.dT.zp().setOnClickListener(zpVar);
            this.dT.zp().setOnTouchListener(zpVar);
        }
        com.bytedance.sdk.openadsdk.apiImpl.feed.zp zpVar4 = this.dT;
        if (zpVar4 != null) {
            zpVar4.zp(zpVar);
            this.dT.zp(lmd);
        }
    }

    private void zp(List<View> list, com.bytedance.sdk.openadsdk.core.lMd.KS ks) {
        if (com.bytedance.sdk.component.utils.Bj.lMd(list)) {
            for (View view : list) {
                if (view != null) {
                    view.setOnClickListener(ks);
                    view.setOnTouchListener(ks);
                }
            }
        }
    }

    public void zp(com.bykv.vk.openvk.component.video.api.jU.KS ks) {
        this.Bj = ks;
        com.bytedance.sdk.openadsdk.core.lMd.lMd lmd = this.tG;
        if (lmd != null) {
            lmd.zp(ks);
        }
        com.bytedance.sdk.openadsdk.core.lMd.zp zpVar = this.rV;
        if (zpVar != null) {
            zpVar.zp(ks);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lMd(ViewGroup viewGroup) {
        this.YW.zp(System.currentTimeMillis(), Lij.zp(viewGroup));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lMd() {
        if (this.ku > 0) {
            com.bytedance.sdk.openadsdk.lMd.KS.zp(String.valueOf(SystemClock.elapsedRealtime() - this.ku), this.zp, this.HWF, this.YW);
            this.ku = 0L;
        }
    }

    private void zp(@NonNull ViewGroup viewGroup, @Nullable View view) {
        HashMap hashMap = new HashMap();
        hashMap.put("click_scence", 1);
        Context zp2 = viewGroup != null ? com.bytedance.sdk.component.utils.lMd.zp(viewGroup) : null;
        if (zp2 == null) {
            zp2 = this.KS;
        }
        if (this.zp.cz() == 2) {
            com.bytedance.sdk.openadsdk.core.model.woN won = this.zp;
            String str = this.HWF;
            this.tG = new com.bytedance.sdk.openadsdk.core.nativeexpress.QR(zp2, won, str, YhE.zp(str));
        } else {
            com.bytedance.sdk.openadsdk.core.model.woN won2 = this.zp;
            String str2 = this.HWF;
            this.tG = new com.bytedance.sdk.openadsdk.core.lMd.lMd(zp2, won2, str2, YhE.zp(str2));
        }
        this.tG.zp(viewGroup);
        this.tG.zp(this.Bj);
        this.tG.lMd(view);
        this.tG.zp(this.lMd);
        this.tG.zp(this.jU);
        this.tG.zp(hashMap);
        this.tG.zp(new lMd.zp() { // from class: com.bytedance.sdk.openadsdk.core.dQp.1
            @Override // com.bytedance.sdk.openadsdk.core.lMd.lMd.zp
            public void zp(View view2, int i9) {
                if (dQp.this.QR != null) {
                    dQp.this.QR.onAdClicked();
                }
            }
        });
        if (this.zp.cz() == 2) {
            Context context = this.KS;
            com.bytedance.sdk.openadsdk.core.model.woN won3 = this.zp;
            String str3 = this.HWF;
            this.rV = new com.bytedance.sdk.openadsdk.core.nativeexpress.HWF(context, won3, str3, YhE.zp(str3));
        } else {
            Context context2 = this.KS;
            com.bytedance.sdk.openadsdk.core.model.woN won4 = this.zp;
            String str4 = this.HWF;
            this.rV = new com.bytedance.sdk.openadsdk.core.lMd.zp(context2, won4, str4, YhE.zp(str4));
        }
        this.rV.zp(viewGroup);
        this.rV.zp(this.Bj);
        this.rV.lMd(view);
        this.rV.zp(this.lMd);
        this.rV.zp(this.jU);
        this.rV.zp(hashMap);
        this.rV.zp(new lMd.zp() { // from class: com.bytedance.sdk.openadsdk.core.dQp.2
            @Override // com.bytedance.sdk.openadsdk.core.lMd.lMd.zp
            public void zp(View view2, int i9) {
                if (dQp.this.QR != null) {
                    dQp.this.QR.onAdClicked();
                }
                com.bytedance.sdk.openadsdk.rV.zp.COT.zp(dQp.this.zp, 9);
                dQp.this.dT.tG();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lMd(ViewGroup viewGroup, View view) {
        if (this.vDp.get()) {
            return;
        }
        this.vDp.set(true);
        if (this.jU instanceof com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.lMd) {
            NativeExpressView lMd = this.dT.lMd();
            if (lMd != null) {
                lMd.ku();
            }
            ((com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.lMd) this.jU).zp(true);
        }
        this.YW.zp(System.currentTimeMillis(), Lij.zp(viewGroup));
        this.ku = SystemClock.elapsedRealtime();
        KS(viewGroup);
        com.bytedance.sdk.openadsdk.apiImpl.feed.HWF hwf = this.QR;
        if (hwf != null) {
            hwf.zp(this.jU);
        }
        if (this.zp.YcG()) {
            YhE.zp(this.zp, view);
        }
        if (this.zp.xg() != null) {
            this.zp.xg().zp().zp(0L);
        }
    }

    private void zp(@NonNull ViewGroup viewGroup, EmptyView emptyView, List<View> list, @Nullable List<View> list2) {
        com.bytedance.sdk.openadsdk.core.lMd.lMd lmd = this.tG;
        if (lmd == null || this.rV == null) {
            return;
        }
        emptyView.zp(list, lmd);
        emptyView.zp(list2, this.rV);
        zp(this.tG, this.rV);
        zp(emptyView, viewGroup);
    }

    private void zp(@NonNull ViewGroup viewGroup, List<View> list, @Nullable List<View> list2) {
        com.bytedance.sdk.openadsdk.core.lMd.lMd lmd = this.tG;
        if (lmd == null || this.rV == null) {
            return;
        }
        zp(list, lmd);
        zp(list2, this.rV);
        zp(this.tG, this.rV);
        zp(viewGroup);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void zp(com.bytedance.sdk.openadsdk.core.lMd.lMd lmd, com.bytedance.sdk.openadsdk.core.lMd.zp zpVar) {
        if (this.zp.cz() == 2) {
            lMd(lmd, zpVar);
        } else {
            zp(zpVar);
        }
    }

    private void zp(com.bytedance.sdk.openadsdk.core.lMd.zp zpVar) {
        if (com.bytedance.sdk.openadsdk.core.settings.dQp.etV().jU(String.valueOf(this.zp.FGx()))) {
            com.bytedance.sdk.openadsdk.apiImpl.feed.zp zpVar2 = this.dT;
            if (zpVar2 != null && zpVar2.zp() != null) {
                this.dT.zp().setOnClickListener(zpVar);
                this.dT.zp().setOnTouchListener(zpVar);
            }
            com.bytedance.sdk.openadsdk.apiImpl.feed.zp zpVar3 = this.dT;
            if (zpVar3 != null) {
                zpVar3.zp(zpVar);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.apiImpl.feed.zp zpVar4 = this.dT;
        if (zpVar4 != null && zpVar4.zp() != null) {
            PAGMediaView zp2 = this.dT.zp();
            com.bytedance.sdk.openadsdk.core.lMd.KS ks = new com.bytedance.sdk.openadsdk.core.lMd.KS() { // from class: com.bytedance.sdk.openadsdk.core.dQp.4
                @Override // com.bytedance.sdk.openadsdk.core.lMd.KS
                public void zp(View view, float f9, float f10, float f11, float f12, SparseArray<KS.zp> sparseArray, boolean z8) {
                    if (view instanceof PAGVideoMediaView) {
                        ((PAGVideoMediaView) view).handleInterruptVideo();
                    }
                }
            };
            zp2.setOnClickListener(ks);
            zp2.setOnTouchListener(ks);
        }
        com.bytedance.sdk.openadsdk.apiImpl.feed.zp zpVar5 = this.dT;
        if (zpVar5 != null) {
            zpVar5.zp((com.bytedance.sdk.openadsdk.core.lMd.zp) null);
        }
    }

    private void zp(EmptyView emptyView, final ViewGroup viewGroup) {
        emptyView.setCallback(new EmptyView.zp() { // from class: com.bytedance.sdk.openadsdk.core.dQp.5
            @Override // com.bytedance.sdk.openadsdk.core.EmptyView.zp
            public void lMd() {
                dQp.this.lMd();
            }

            @Override // com.bytedance.sdk.openadsdk.core.EmptyView.zp
            public void zp(boolean z8) {
                dQp.this.zp(z8, viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.core.EmptyView.zp
            public void zp() {
                dQp.this.lMd(viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.core.EmptyView.zp
            @JProtect
            public void zp(View view) {
                dQp.this.lMd(viewGroup, view);
            }
        });
    }

    private void zp(final ViewGroup viewGroup) {
        UPs.zp(viewGroup, true, 5, new UPs.lMd() { // from class: com.bytedance.sdk.openadsdk.core.dQp.6
            @Override // com.bytedance.sdk.openadsdk.utils.UPs.lMd
            public void lMd() {
                dQp.this.lMd();
            }

            @Override // com.bytedance.sdk.openadsdk.utils.UPs.lMd
            public void zp(boolean z8) {
                dQp.this.zp(z8, viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.UPs.lMd
            public void zp() {
                dQp.this.lMd(viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.UPs.lMd
            public void zp(View view, boolean z8) {
                if (z8) {
                    dQp.this.lMd(viewGroup, view);
                }
            }
        }, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(boolean z8, ViewGroup viewGroup) {
        if (z8 && this.zp.IhO() && !this.zp.Oza()) {
            this.zp.QR(true);
            com.bytedance.sdk.openadsdk.core.model.woN won = this.zp;
            com.bytedance.sdk.openadsdk.lMd.KS.zp(won, this.HWF, won.ITK());
        }
        if (!z8 && this.ku > 0) {
            String valueOf = String.valueOf(SystemClock.elapsedRealtime() - this.ku);
            this.YW.zp(System.currentTimeMillis(), Lij.zp(viewGroup));
            com.bytedance.sdk.openadsdk.lMd.KS.zp(valueOf, this.zp, this.HWF, this.YW);
            this.ku = 0L;
            return;
        }
        this.YW.zp(System.currentTimeMillis(), Lij.zp(viewGroup));
        this.ku = SystemClock.elapsedRealtime();
    }
}

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
import com.bytedance.sdk.openadsdk.core.DSW;
import com.bytedance.sdk.openadsdk.core.Sg.Sg;
import com.bytedance.sdk.openadsdk.core.Sg.tN;
import com.bytedance.sdk.openadsdk.utils.GS;
import com.bytedance.sdk.openadsdk.utils.Sco;
import com.bytedance.sdk.openadsdk.utils.lu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import l5.g;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class rkt {
    private final PAGNativeAd AlY;
    private com.bytedance.sdk.openadsdk.YFl.Sg.vc DSW;
    private com.bytedance.sdk.openadsdk.core.Sg.Sg GA;
    private com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.vc Sg;
    private final com.bytedance.sdk.openadsdk.core.model.Wwa YFl;
    private g eT;

    /* renamed from: nc, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.YFl.Sg.YFl f10739nc;
    private com.bytedance.sdk.openadsdk.core.Sg.YFl pDU;
    private long qsH;
    private final Context tN;

    /* renamed from: vc, reason: collision with root package name */
    private final String f10740vc;
    private List<View> wN = new ArrayList();
    private final com.bytedance.sdk.openadsdk.AlY.DSW NjR = new com.bytedance.sdk.openadsdk.AlY.DSW();
    private final AtomicBoolean YoT = new AtomicBoolean(false);

    /* loaded from: classes.dex */
    public static class YFl implements View.OnLayoutChangeListener {
        private final ViewGroup Sg;
        private final com.bytedance.sdk.openadsdk.AlY.DSW YFl;

        public YFl(com.bytedance.sdk.openadsdk.AlY.DSW dsw, ViewGroup viewGroup) {
            this.YFl = dsw;
            this.Sg = viewGroup;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.YFl.YFl(System.currentTimeMillis(), pq.YFl(this.Sg));
        }
    }

    public rkt(Context context, PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.core.model.Wwa wwa, String str, com.bytedance.sdk.openadsdk.YFl.Sg.YFl yFl) {
        this.AlY = pAGNativeAd;
        this.YFl = wwa;
        this.tN = context;
        this.f10740vc = str;
        this.f10739nc = yFl;
        if (wwa.ko() == 4) {
            this.Sg = com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.DSW.YFl(context, wwa, str);
        }
    }

    private DSW AlY(ViewGroup viewGroup) {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof DSW) {
                return (DSW) childAt;
            }
        }
        return null;
    }

    private DSW Sg(@NonNull ViewGroup viewGroup, List<View> list, List<View> list2, @Nullable List<View> list3, com.bytedance.sdk.openadsdk.YFl.Sg.vc vcVar) {
        this.DSW = vcVar;
        viewGroup.addOnLayoutChangeListener(new YFl(this.NjR, viewGroup));
        this.wN = list;
        DSW AlY = AlY(viewGroup);
        if (AlY == null) {
            AlY = new DSW(this.tN, viewGroup);
            viewGroup.addView(AlY);
        }
        AlY.YFl();
        AlY.setRefClickViews(list2);
        if (list != null) {
            for (View view : this.wN) {
                if (view != null) {
                    view.setTag(520093762, Boolean.TRUE);
                }
            }
            if (list3 != null) {
                list3.addAll(list);
            }
        }
        AlY.setRefCreativeViews(list3);
        return AlY;
    }

    private void tN(ViewGroup viewGroup) {
        com.bytedance.sdk.openadsdk.core.model.Wwa wwa;
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.wN != null) {
                JSONArray jSONArray = new JSONArray();
                for (View view : this.wN) {
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
            if (this.f10739nc.qsH() != null) {
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("width", GS.AlY(this.tN, r11.getWidth()) * 1.0f);
                    jSONObject4.put("height", GS.AlY(this.tN, r11.getHeight()) * 1.0f);
                } catch (Throwable unused3) {
                }
                jSONObject.put("media_view", jSONObject4.toString());
            }
            com.bytedance.sdk.openadsdk.core.qsH.qO Sg = this.f10739nc.Sg();
            if (Sg != null && (wwa = this.YFl) != null) {
                jSONObject.put("dynamic_show_type", wwa.UZM());
                Sg.YFl(jSONObject, this.YFl);
            }
            com.bytedance.sdk.openadsdk.AlY.tN.YFl(this.YFl, this.f10740vc, jSONObject);
        } catch (JSONException e2) {
            com.bytedance.sdk.component.utils.YoT.YFl("InteractionManager", "onShowFun json error", e2);
        }
    }

    public com.bytedance.sdk.openadsdk.AlY.DSW YFl() {
        return this.NjR;
    }

    public void YFl(View view, int i10) {
        com.bytedance.sdk.openadsdk.YFl.Sg.vc vcVar = this.DSW;
        if (vcVar != null) {
            vcVar.onAdClicked();
        }
    }

    public void YFl(@NonNull ViewGroup viewGroup, List<View> list, List<View> list2, @Nullable List<View> list3, @Nullable View view, com.bytedance.sdk.openadsdk.YFl.Sg.vc vcVar) {
        YFl(viewGroup, list, list2, list3, vcVar);
        YFl(viewGroup, view);
        YFl(viewGroup, list2, list3);
    }

    private void YFl(@NonNull ViewGroup viewGroup, List<View> list, List<View> list2, @Nullable List<View> list3, com.bytedance.sdk.openadsdk.YFl.Sg.vc vcVar) {
        this.DSW = vcVar;
        viewGroup.addOnLayoutChangeListener(new YFl(this.NjR, viewGroup));
        this.wN = list;
        YFl(list2, (com.bytedance.sdk.openadsdk.core.Sg.tN) null);
        if (list != null) {
            for (View view : this.wN) {
                if (view != null) {
                    view.setTag(520093762, Boolean.TRUE);
                }
            }
            if (list3 != null) {
                list3.addAll(list);
            }
        }
        YFl(list3, (com.bytedance.sdk.openadsdk.core.Sg.tN) null);
    }

    private void Sg(com.bytedance.sdk.openadsdk.core.Sg.Sg sg2, com.bytedance.sdk.openadsdk.core.Sg.YFl yFl) {
        com.bytedance.sdk.openadsdk.YFl.Sg.YFl yFl2 = this.f10739nc;
        if (yFl2 != null && yFl2.Sg() != null) {
            com.bytedance.sdk.openadsdk.core.qsH.qO Sg = this.f10739nc.Sg();
            if ((sg2 instanceof com.bytedance.sdk.openadsdk.core.qsH.NjR) && (yFl instanceof com.bytedance.sdk.openadsdk.core.qsH.qsH)) {
                Sg.setClickListener((com.bytedance.sdk.openadsdk.core.qsH.NjR) sg2);
                Sg.setClickCreativeListener((com.bytedance.sdk.openadsdk.core.qsH.qsH) yFl);
            }
            Sg.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.vc() { // from class: com.bytedance.sdk.openadsdk.core.rkt.3
                @Override // com.bytedance.sdk.openadsdk.core.widget.vc
                public void YFl() {
                    if (rkt.this.DSW != null) {
                        rkt.this.DSW.onAdClicked();
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.YFl.Sg.YFl yFl3 = this.f10739nc;
        if (yFl3 != null && yFl3.YFl() != null) {
            this.f10739nc.YFl().setOnClickListener(yFl);
            this.f10739nc.YFl().setOnTouchListener(yFl);
        }
        com.bytedance.sdk.openadsdk.YFl.Sg.YFl yFl4 = this.f10739nc;
        if (yFl4 != null) {
            yFl4.YFl(yFl);
            this.f10739nc.YFl(sg2);
        }
    }

    private void YFl(List<View> list, com.bytedance.sdk.openadsdk.core.Sg.tN tNVar) {
        if (com.bytedance.sdk.component.utils.nc.Sg(list)) {
            for (View view : list) {
                if (view != null) {
                    view.setOnClickListener(tNVar);
                    view.setOnTouchListener(tNVar);
                }
            }
        }
    }

    public void YFl(g gVar) {
        this.eT = gVar;
        com.bytedance.sdk.openadsdk.core.Sg.Sg sg2 = this.GA;
        if (sg2 != null) {
            sg2.YFl(gVar);
        }
        com.bytedance.sdk.openadsdk.core.Sg.YFl yFl = this.pDU;
        if (yFl != null) {
            yFl.YFl(gVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sg(ViewGroup viewGroup) {
        this.NjR.YFl(System.currentTimeMillis(), pq.YFl(viewGroup));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sg() {
        if (this.qsH > 0) {
            com.bytedance.sdk.openadsdk.AlY.tN.YFl(String.valueOf(SystemClock.elapsedRealtime() - this.qsH), this.YFl, this.f10740vc, this.NjR);
            this.qsH = 0L;
        }
    }

    private void YFl(@NonNull ViewGroup viewGroup, @Nullable View view) {
        HashMap hashMap = new HashMap();
        hashMap.put("click_scence", 1);
        Context YFl2 = viewGroup != null ? com.bytedance.sdk.component.utils.Sg.YFl(viewGroup) : null;
        if (YFl2 == null) {
            YFl2 = this.tN;
        }
        if (this.YFl.Ne() == 2) {
            com.bytedance.sdk.openadsdk.core.model.Wwa wwa = this.YFl;
            String str = this.f10740vc;
            this.GA = new com.bytedance.sdk.openadsdk.core.qsH.NjR(YFl2, wwa, str, Sco.YFl(str));
        } else {
            com.bytedance.sdk.openadsdk.core.model.Wwa wwa2 = this.YFl;
            String str2 = this.f10740vc;
            this.GA = new com.bytedance.sdk.openadsdk.core.Sg.Sg(YFl2, wwa2, str2, Sco.YFl(str2));
        }
        this.GA.YFl(viewGroup);
        this.GA.YFl(this.eT);
        this.GA.Sg(view);
        this.GA.YFl(this.Sg);
        this.GA.YFl(this.AlY);
        this.GA.YFl(hashMap);
        this.GA.YFl(new Sg.YFl() { // from class: com.bytedance.sdk.openadsdk.core.rkt.1
            @Override // com.bytedance.sdk.openadsdk.core.Sg.Sg.YFl
            public void YFl(View view2, int i10) {
                if (rkt.this.DSW != null) {
                    rkt.this.DSW.onAdClicked();
                }
            }
        });
        if (this.YFl.Ne() == 2) {
            Context context = this.tN;
            com.bytedance.sdk.openadsdk.core.model.Wwa wwa3 = this.YFl;
            String str3 = this.f10740vc;
            this.pDU = new com.bytedance.sdk.openadsdk.core.qsH.qsH(context, wwa3, str3, Sco.YFl(str3));
        } else {
            Context context2 = this.tN;
            com.bytedance.sdk.openadsdk.core.model.Wwa wwa4 = this.YFl;
            String str4 = this.f10740vc;
            this.pDU = new com.bytedance.sdk.openadsdk.core.Sg.YFl(context2, wwa4, str4, Sco.YFl(str4));
        }
        this.pDU.YFl(viewGroup);
        this.pDU.YFl(this.eT);
        this.pDU.Sg(view);
        this.pDU.YFl(this.Sg);
        this.pDU.YFl(this.AlY);
        this.pDU.YFl(hashMap);
        this.pDU.YFl(new Sg.YFl() { // from class: com.bytedance.sdk.openadsdk.core.rkt.2
            @Override // com.bytedance.sdk.openadsdk.core.Sg.Sg.YFl
            public void YFl(View view2, int i10) {
                if (rkt.this.DSW != null) {
                    rkt.this.DSW.onAdClicked();
                }
                com.bytedance.sdk.openadsdk.VOe.YFl.wN.YFl(rkt.this.YFl, 9);
                rkt.this.f10739nc.GA();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sg(ViewGroup viewGroup, View view) {
        if (this.YoT.get()) {
            return;
        }
        this.YoT.set(true);
        if (this.AlY instanceof com.bytedance.sdk.openadsdk.YFl.Sg.YFl.tN) {
            com.bytedance.sdk.openadsdk.core.qsH.qO Sg = this.f10739nc.Sg();
            if (Sg != null) {
                Sg.qsH();
            }
            ((com.bytedance.sdk.openadsdk.YFl.Sg.YFl.tN) this.AlY).YFl(true);
        }
        this.NjR.YFl(System.currentTimeMillis(), pq.YFl(viewGroup));
        this.qsH = SystemClock.elapsedRealtime();
        tN(viewGroup);
        com.bytedance.sdk.openadsdk.YFl.Sg.vc vcVar = this.DSW;
        if (vcVar != null) {
            vcVar.YFl(this.AlY);
        }
        if (this.YFl.rE()) {
            Sco.YFl(this.YFl, view);
        }
        if (this.YFl.Af() != null) {
            this.YFl.Af().YFl().YFl(0L);
        }
    }

    private void YFl(@NonNull ViewGroup viewGroup, DSW dsw, List<View> list, @Nullable List<View> list2) {
        com.bytedance.sdk.openadsdk.core.Sg.Sg sg2 = this.GA;
        if (sg2 == null || this.pDU == null) {
            return;
        }
        dsw.YFl(list, sg2);
        dsw.YFl(list2, this.pDU);
        YFl(this.GA, this.pDU);
        YFl(dsw, viewGroup);
    }

    private void YFl(@NonNull ViewGroup viewGroup, List<View> list, @Nullable List<View> list2) {
        com.bytedance.sdk.openadsdk.core.Sg.Sg sg2 = this.GA;
        if (sg2 == null || this.pDU == null) {
            return;
        }
        YFl(list, sg2);
        YFl(list2, this.pDU);
        YFl(this.GA, this.pDU);
        YFl(viewGroup);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void YFl(com.bytedance.sdk.openadsdk.core.Sg.Sg sg2, com.bytedance.sdk.openadsdk.core.Sg.YFl yFl) {
        if (this.YFl.Ne() == 2) {
            Sg(sg2, yFl);
        } else {
            YFl(yFl);
        }
    }

    private void YFl(com.bytedance.sdk.openadsdk.core.Sg.YFl yFl) {
        if (com.bytedance.sdk.openadsdk.core.settings.rkt.JwO().AlY(String.valueOf(this.YFl.kU()))) {
            com.bytedance.sdk.openadsdk.YFl.Sg.YFl yFl2 = this.f10739nc;
            if (yFl2 != null && yFl2.YFl() != null) {
                this.f10739nc.YFl().setOnClickListener(yFl);
                this.f10739nc.YFl().setOnTouchListener(yFl);
            }
            com.bytedance.sdk.openadsdk.YFl.Sg.YFl yFl3 = this.f10739nc;
            if (yFl3 != null) {
                yFl3.YFl(yFl);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.YFl.Sg.YFl yFl4 = this.f10739nc;
        if (yFl4 != null && yFl4.YFl() != null) {
            PAGMediaView YFl2 = this.f10739nc.YFl();
            com.bytedance.sdk.openadsdk.core.Sg.tN tNVar = new com.bytedance.sdk.openadsdk.core.Sg.tN() { // from class: com.bytedance.sdk.openadsdk.core.rkt.4
                @Override // com.bytedance.sdk.openadsdk.core.Sg.tN
                public void YFl(View view, float f10, float f11, float f12, float f13, SparseArray<tN.YFl> sparseArray, boolean z10) {
                    if (view instanceof PAGVideoMediaView) {
                        ((PAGVideoMediaView) view).handleInterruptVideo();
                    }
                }
            };
            YFl2.setOnClickListener(tNVar);
            YFl2.setOnTouchListener(tNVar);
        }
        com.bytedance.sdk.openadsdk.YFl.Sg.YFl yFl5 = this.f10739nc;
        if (yFl5 != null) {
            yFl5.YFl((com.bytedance.sdk.openadsdk.core.Sg.YFl) null);
        }
    }

    private void YFl(DSW dsw, final ViewGroup viewGroup) {
        dsw.setCallback(new DSW.YFl() { // from class: com.bytedance.sdk.openadsdk.core.rkt.5
            @Override // com.bytedance.sdk.openadsdk.core.DSW.YFl
            public void Sg() {
                rkt.this.Sg();
            }

            @Override // com.bytedance.sdk.openadsdk.core.DSW.YFl
            public void YFl(boolean z10) {
                rkt.this.YFl(z10, viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.core.DSW.YFl
            public void YFl() {
                rkt.this.Sg(viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.core.DSW.YFl
            @JProtect
            public void YFl(View view) {
                rkt.this.Sg(viewGroup, view);
            }
        });
    }

    private void YFl(final ViewGroup viewGroup) {
        lu.YFl(viewGroup, true, 5, new lu.Sg() { // from class: com.bytedance.sdk.openadsdk.core.rkt.6
            @Override // com.bytedance.sdk.openadsdk.utils.lu.Sg
            public void Sg() {
                rkt.this.Sg();
            }

            @Override // com.bytedance.sdk.openadsdk.utils.lu.Sg
            public void YFl(boolean z10) {
                rkt.this.YFl(z10, viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.lu.Sg
            public void YFl() {
                rkt.this.Sg(viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.lu.Sg
            public void YFl(View view, boolean z10) {
                if (z10) {
                    rkt.this.Sg(viewGroup, view);
                }
            }
        }, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(boolean z10, ViewGroup viewGroup) {
        if (z10 && this.YFl.xSx() && !this.YFl.VRF()) {
            this.YFl.DSW(true);
            com.bytedance.sdk.openadsdk.core.model.Wwa wwa = this.YFl;
            com.bytedance.sdk.openadsdk.AlY.tN.YFl(wwa, this.f10740vc, wwa.EQ());
        }
        if (!z10 && this.qsH > 0) {
            String valueOf = String.valueOf(SystemClock.elapsedRealtime() - this.qsH);
            this.NjR.YFl(System.currentTimeMillis(), pq.YFl(viewGroup));
            com.bytedance.sdk.openadsdk.AlY.tN.YFl(valueOf, this.YFl, this.f10740vc, this.NjR);
            this.qsH = 0L;
            return;
        }
        this.NjR.YFl(System.currentTimeMillis(), pq.YFl(viewGroup));
        this.qsH = SystemClock.elapsedRealtime();
    }
}

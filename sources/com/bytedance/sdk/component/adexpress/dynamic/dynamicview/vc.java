package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.applovin.impl.mediation.ads.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class vc extends wN {
    private static String aIu = "";
    private ImageView Ne;
    private Runnable Sg;
    private Runnable YFl;
    protected com.bytedance.sdk.component.adexpress.dynamic.tN.NjR qO;
    private volatile boolean wXo;

    /* loaded from: classes.dex */
    public static class Sg implements com.bytedance.sdk.component.wN.rkt<Bitmap> {
        private final WeakReference<wN> Sg;
        private final WeakReference<View> YFl;

        public Sg(View view, wN wNVar) {
            this.YFl = new WeakReference<>(view);
            this.Sg = new WeakReference<>(wNVar);
        }

        @Override // com.bytedance.sdk.component.wN.rkt
        public void YFl(int i10, String str, Throwable th2) {
        }

        @Override // com.bytedance.sdk.component.wN.rkt
        public void YFl(com.bytedance.sdk.component.wN.eT<Bitmap> eTVar) {
            Bitmap Sg;
            wN wNVar;
            View view = this.YFl.get();
            if (view == null || (Sg = eTVar.Sg()) == null || eTVar.tN() == null || (wNVar = this.Sg.get()) == null) {
                return;
            }
            view.setBackground(wNVar.YFl(Sg));
        }
    }

    /* loaded from: classes.dex */
    public static class YFl implements com.bytedance.sdk.component.wN.rkt<Bitmap> {
        private final WeakReference<DynamicRootView> Sg;
        private final WeakReference<View> YFl;
        private final com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH tN;

        public YFl(View view, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh) {
            this.YFl = new WeakReference<>(view);
            this.Sg = new WeakReference<>(dynamicRootView);
            this.tN = qsh;
        }

        @Override // com.bytedance.sdk.component.wN.rkt
        public void YFl(int i10, String str, Throwable th2) {
        }

        @Override // com.bytedance.sdk.component.wN.rkt
        public void YFl(com.bytedance.sdk.component.wN.eT<Bitmap> eTVar) {
            View view = this.YFl.get();
            if (!com.bytedance.sdk.component.adexpress.AlY.Sg()) {
                DynamicRootView dynamicRootView = this.Sg.get();
                if (dynamicRootView == null) {
                    return;
                }
                if (!"open_ad".equals(dynamicRootView.getRenderRequest().AlY()) && !"splash_ad".equals(dynamicRootView.getRenderRequest().AlY())) {
                    view.setBackground(new BitmapDrawable(eTVar.Sg()));
                    return;
                } else {
                    view.setBackground(new BitmapDrawable(eTVar.Sg()));
                    return;
                }
            }
            if (view == null) {
                return;
            }
            view.setBackground(new BitmapDrawable(eTVar.Sg()));
            com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh = this.tN;
            if (qsh == null || qsh.nc() == null || 6 != this.tN.nc().YFl() || view.getBackground() == null) {
                return;
            }
            view.getBackground().setAutoMirrored(true);
        }
    }

    /* loaded from: classes.dex */
    public static class tN implements com.bytedance.sdk.component.wN.qsH {
        private final int Sg;
        private final WeakReference<Context> YFl;

        public tN(Context context, int i10) {
            this.YFl = new WeakReference<>(context);
            this.Sg = i10;
        }

        @Override // com.bytedance.sdk.component.wN.qsH
        public Bitmap YFl(Bitmap bitmap) {
            Context context = this.YFl.get();
            if (context != null) {
                return com.bytedance.sdk.component.adexpress.AlY.YFl.YFl(context, bitmap, this.Sg);
            }
            return null;
        }
    }

    public vc(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh) {
        super(context, dynamicRootView, qsh);
        this.wXo = true;
        setTag(Integer.valueOf(getClickArea()));
        String Sg2 = qsh.nc().Sg();
        if ("logo-union".equals(Sg2)) {
            dynamicRootView.setLogoUnionHeight(this.qsH - ((int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(context, this.YoT.YFl() + this.YoT.Sg())));
        } else if ("scoreCountWithIcon".equals(Sg2)) {
            dynamicRootView.setScoreCountWithIcon(this.qsH - ((int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(context, this.YoT.YFl() + this.YoT.Sg())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Drawable Sg(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            String str2 = "";
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (jSONArray.getString(i10).startsWith("#")) {
                    arrayList.add(jSONArray.getString(i10));
                } else if (jSONArray.getString(i10).endsWith("deg")) {
                    str2 = jSONArray.getString(i10);
                }
            }
            if (arrayList.size() <= 0) {
                return null;
            }
            int[] iArr = new int[arrayList.size()];
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                iArr[i11] = com.bytedance.sdk.component.adexpress.dynamic.AlY.DSW.YFl(((String) arrayList.get(i11)).substring(0, 7));
            }
            GradientDrawable YFl2 = YFl(YFl(str2), iArr);
            YFl2.setShape(0);
            YFl2.setCornerRadius(com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.eT, this.YoT.EH()));
            return YFl2;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String getBuildModel() {
        try {
            aIu = com.bytedance.sdk.component.utils.wXo.YFl();
        } catch (Throwable unused) {
            aIu = Build.MODEL;
        }
        if (TextUtils.isEmpty(aIu)) {
            aIu = Build.MODEL;
        }
        return aIu;
    }

    public boolean NjR() {
        String str;
        Drawable backgroundDrawable;
        DynamicRootView dynamicRootView;
        JSONObject optJSONObject;
        final View view = this.EH;
        if (view == null) {
            view = this;
        }
        setContentDescription(this.GA.YFl(this.YoT.Ga()));
        String rE = this.YoT.rE();
        String str2 = null;
        if (!TextUtils.isEmpty(rE) && (dynamicRootView = this.pDU) != null && dynamicRootView.getRenderRequest() != null && this.pDU.getRenderRequest().tN() != null && (optJSONObject = this.pDU.getRenderRequest().tN().optJSONObject("creative")) != null) {
            str = YFl(optJSONObject.opt(rE));
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            str = this.YoT.wXo();
        }
        if (this.YoT.aIu()) {
            com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl().wN().YFl(this.YoT.Sg).tN(2).YFl(new tN(this.eT, this.YoT.qO())).YFl(new Sg(view, this));
        } else if (!TextUtils.isEmpty(str)) {
            if (!str.startsWith("http:") && !str.startsWith("https:")) {
                DynamicRootView dynamicRootView2 = this.pDU;
                if (dynamicRootView2 != null && dynamicRootView2.getRenderRequest() != null) {
                    str2 = this.pDU.getRenderRequest().bZ();
                }
                str = com.bytedance.sdk.component.adexpress.dynamic.wN.NjR.Sg(str, str2);
            }
            com.bytedance.sdk.component.wN.nc tN2 = com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl().wN().YFl(str).tN(2);
            YFl(tN2);
            if (!com.bytedance.sdk.component.adexpress.AlY.Sg()) {
                if ((view instanceof FrameLayout) && e.w(this.GA, "vessel")) {
                    if (com.bytedance.sdk.component.adexpress.AlY.nc.Sg(str)) {
                        this.Ne = new com.bytedance.sdk.component.adexpress.vc.GA(this.eT);
                    } else {
                        this.Ne = new ImageView(this.eT);
                    }
                    ((FrameLayout) view).addView(this.Ne, new FrameLayout.LayoutParams(-1, -1));
                    tN2.tN(3).YFl(new com.bytedance.sdk.component.wN.rkt() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vc.1
                        @Override // com.bytedance.sdk.component.wN.rkt
                        public void YFl(int i10, String str3, Throwable th2) {
                        }

                        @Override // com.bytedance.sdk.component.wN.rkt
                        public void YFl(com.bytedance.sdk.component.wN.eT eTVar) {
                            Object Sg2 = eTVar.Sg();
                            if (Sg2 instanceof byte[]) {
                                vc vcVar = vc.this;
                                com.bytedance.sdk.component.adexpress.AlY.vc.Sg(vc.this.Ne, (byte[]) Sg2, vcVar.DSW, vcVar.qsH);
                            }
                        }
                    });
                } else {
                    YFl(tN2, view);
                }
            } else {
                tN2.YFl(new YFl(view, this.pDU, this.GA));
            }
        }
        if (getBackground() == null && (backgroundDrawable = getBackgroundDrawable()) != null) {
            view.setBackground(backgroundDrawable);
        }
        if (this.YoT.Cfr() > 0.0d) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vc.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (vc.this.YoT.Sco() > 0) {
                            vc vcVar = vc.this;
                            Drawable Sg2 = vcVar.Sg(vcVar.pDU.getBgMaterialCenterCalcColor().get(Integer.valueOf(vc.this.YoT.Sco())));
                            if (Sg2 == null) {
                                vc vcVar2 = vc.this;
                                Sg2 = vcVar2.YFl(true, vcVar2.pDU.getBgMaterialCenterCalcColor().get(Integer.valueOf(vc.this.YoT.Sco())));
                            }
                            if (Sg2 != null) {
                                view.setBackground(Sg2);
                                return;
                            }
                            View view2 = view;
                            vc vcVar3 = vc.this;
                            view2.setBackground(vcVar3.YFl(true, vcVar3.pDU.getBgColor()));
                        }
                    } catch (Exception unused) {
                    }
                }
            }, (long) (this.YoT.Cfr() * 1000.0d));
        }
        View view2 = this.EH;
        if (view2 != null) {
            view2.setPadding((int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.eT, this.YoT.tN()), (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.eT, this.YoT.Sg()), (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.eT, this.YoT.AlY()), (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.eT, this.YoT.YFl()));
        }
        if (this.rkt || this.YoT.pDU() > 0.0d) {
            setShouldInvisible(true);
            view.setVisibility(4);
            setVisibility(4);
        }
        return true;
    }

    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(this.DSW, this.qsH);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        View view = this.EH;
        if (view == null) {
            view = this;
        }
        double aIu2 = this.GA.nc().wN().aIu();
        if (aIu2 < 90.0d && aIu2 > 0.0d) {
            com.bytedance.sdk.component.utils.DSW.Sg().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vc.4
                @Override // java.lang.Runnable
                public void run() {
                    vc.this.setVisibility(8);
                }
            }, (long) (aIu2 * 1000.0d));
        }
        YFl(this.GA.nc().wN().qO(), view);
        if (!TextUtils.isEmpty(this.YoT.BPI())) {
            YFl();
        }
        super.onAttachedToWindow();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            removeCallbacks(this.YFl);
            removeCallbacks(this.Sg);
        } catch (Exception unused) {
        }
    }

    private String YFl(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof JSONArray) {
            return YFl(((JSONArray) obj).opt(0));
        }
        if (obj instanceof JSONObject) {
            return YFl((Object) ((JSONObject) obj).optString("url"));
        }
        return null;
    }

    private void YFl(com.bytedance.sdk.component.wN.nc ncVar, final View view) {
        ncVar.YFl(new com.bytedance.sdk.component.wN.rkt<Bitmap>() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vc.3
            @Override // com.bytedance.sdk.component.wN.rkt
            public void YFl(int i10, String str, Throwable th2) {
            }

            @Override // com.bytedance.sdk.component.wN.rkt
            public void YFl(com.bytedance.sdk.component.wN.eT<Bitmap> eTVar) {
                DynamicRootView dynamicRootView = vc.this.pDU;
                if (dynamicRootView == null) {
                    return;
                }
                if (!"open_ad".equals(dynamicRootView.getRenderRequest().AlY()) && !"splash_ad".equals(vc.this.pDU.getRenderRequest().AlY())) {
                    view.setBackground(new BitmapDrawable(eTVar.Sg()));
                } else {
                    if (com.bytedance.sdk.component.adexpress.AlY.Sg()) {
                        view.setBackground(new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.YFl(eTVar.Sg(), ((Wwa) vc.this.pDU.getChildAt(0)).YFl));
                        return;
                    }
                    view.setBackground(new BitmapDrawable(eTVar.Sg()));
                }
            }
        });
    }

    private static void YFl(com.bytedance.sdk.component.wN.nc ncVar) {
        if ("SMARTISAN".equals(Build.BRAND) && "SM901".equals(getBuildModel())) {
            ncVar.YFl(Bitmap.Config.ARGB_8888);
        }
    }

    private void YFl(double d10, final View view) {
        if (d10 > 0.0d) {
            com.bytedance.sdk.component.utils.DSW.Sg().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vc.5
                @Override // java.lang.Runnable
                public void run() {
                    if (vc.this.GA.nc().wN().ZS() != null) {
                        return;
                    }
                    view.setVisibility(0);
                    vc.this.setVisibility(0);
                }
            }, (long) (d10 * 1000.0d));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() <= 0) {
            return;
        }
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            if (viewGroup.getChildAt(i10) instanceof com.bytedance.sdk.component.adexpress.dynamic.tN.NjR) {
                viewGroup.removeViewAt(i10);
            }
        }
    }

    private void YFl() {
        if (this.wXo) {
            int Bh = this.YoT.Bh();
            int dGX = this.YoT.dGX();
            Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vc.6
                @Override // java.lang.Runnable
                public void run() {
                    DynamicRootView dynamicRootView = vc.this.pDU;
                    if (dynamicRootView != null && dynamicRootView.getRenderRequest() != null) {
                        com.bytedance.sdk.component.adexpress.Sg.GA renderRequest = vc.this.pDU.getRenderRequest();
                        com.bytedance.sdk.component.adexpress.dynamic.AlY.nc ncVar = new com.bytedance.sdk.component.adexpress.dynamic.AlY.nc();
                        ncVar.YFl(renderRequest.EH());
                        ncVar.Sg(renderRequest.rkt());
                        ncVar.tN(renderRequest.lG());
                        ncVar.YFl(renderRequest.Wwa());
                        ncVar.Sg(renderRequest.qO());
                        ncVar.tN(renderRequest.aIu());
                        ncVar.AlY(renderRequest.wXo());
                        ncVar.wN(renderRequest.Ne());
                        vc vcVar = vc.this;
                        vc vcVar2 = vc.this;
                        vcVar.qO = new com.bytedance.sdk.component.adexpress.dynamic.tN.NjR(vcVar2.eT, vcVar2, vcVar2.YoT, ncVar, renderRequest);
                    } else {
                        vc vcVar3 = vc.this;
                        vc vcVar4 = vc.this;
                        vcVar3.qO = new com.bytedance.sdk.component.adexpress.dynamic.tN.NjR(vcVar4.eT, vcVar4, vcVar4.YoT);
                    }
                    vc vcVar5 = vc.this;
                    vcVar5.Sg(vcVar5.qO);
                    if (vc.this.getParent() instanceof ViewGroup) {
                        ((ViewGroup) vc.this.getParent()).setClipChildren(false);
                    }
                    vc.this.setClipChildren(false);
                    vc.this.qO.setTag(2);
                    vc vcVar6 = vc.this;
                    vcVar6.YFl((ViewGroup) vcVar6);
                    vc vcVar7 = vc.this;
                    vcVar7.addView(vcVar7.qO, new FrameLayout.LayoutParams(-1, -1));
                    vc.this.qO.tN();
                }
            };
            this.YFl = runnable;
            postDelayed(runnable, Bh * 1000);
            if (this.YoT.Ld() || dGX >= Integer.MAX_VALUE || Bh >= dGX) {
                return;
            }
            Runnable runnable2 = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vc.7
                @Override // java.lang.Runnable
                public void run() {
                    vc vcVar = vc.this;
                    if (vcVar.qO != null) {
                        vcVar.wXo = false;
                        vc.this.qO.AlY();
                        vc.this.qO.setVisibility(4);
                        vc vcVar2 = vc.this;
                        vcVar2.removeView(vcVar2.qO);
                    }
                }
            };
            this.Sg = runnable2;
            postDelayed(runnable2, dGX * 1000);
        }
    }
}

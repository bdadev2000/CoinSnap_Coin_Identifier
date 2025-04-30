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
import com.applovin.impl.L;
import com.bytedance.sdk.component.COT.Bj;
import com.bytedance.sdk.component.COT.KVG;
import com.bytedance.sdk.component.COT.dT;
import com.bytedance.sdk.component.adexpress.dynamic.KS.ku;
import com.bytedance.sdk.component.adexpress.dynamic.interact.InteractViewContainer;
import com.bytedance.sdk.component.adexpress.dynamic.jU.YW;
import com.bytedance.sdk.component.adexpress.jU.QR;
import com.bytedance.sdk.component.adexpress.lMd.tG;
import com.bytedance.sdk.component.adexpress.widget.GifView;
import com.bytedance.sdk.component.utils.ot;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class DynamicBaseWidgetImp extends DynamicBaseWidget {
    private static String cz = "";
    private volatile boolean FP;
    private Runnable lMd;
    private ImageView ot;
    protected InteractViewContainer pvr;
    private Runnable zp;

    public DynamicBaseWidgetImp(Context context, DynamicRootView dynamicRootView, ku kuVar) {
        super(context, dynamicRootView, kuVar);
        this.FP = true;
        setTag(Integer.valueOf(getClickArea()));
        String lMd = kuVar.dT().lMd();
        if ("logo-union".equals(lMd)) {
            dynamicRootView.setLogoUnionHeight(this.ku - ((int) QR.zp(context, this.vDp.zp() + this.vDp.lMd())));
        } else if ("scoreCountWithIcon".equals(lMd)) {
            dynamicRootView.setScoreCountWithIcon(this.ku - ((int) QR.zp(context, this.vDp.zp() + this.vDp.lMd())));
        }
    }

    private static String getBuildModel() {
        try {
            cz = ot.zp();
        } catch (Throwable unused) {
            cz = Build.MODEL;
        }
        if (TextUtils.isEmpty(cz)) {
            cz = Build.MODEL;
        }
        return cz;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Drawable lMd(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            String str2 = "";
            for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                if (jSONArray.getString(i9).startsWith("#")) {
                    arrayList.add(jSONArray.getString(i9));
                } else if (jSONArray.getString(i9).endsWith("deg")) {
                    str2 = jSONArray.getString(i9);
                }
            }
            if (arrayList.size() <= 0) {
                return null;
            }
            int[] iArr = new int[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                iArr[i10] = com.bytedance.sdk.component.adexpress.dynamic.KS.QR.zp(((String) arrayList.get(i10)).substring(0, 7));
            }
            GradientDrawable zp = zp(zp(str2), iArr);
            zp.setShape(0);
            zp.setCornerRadius(QR.zp(this.Bj, this.vDp.dQp()));
            return zp;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jU
    public boolean YW() {
        String str;
        Drawable backgroundDrawable;
        DynamicRootView dynamicRootView;
        JSONObject optJSONObject;
        final View view = this.dQp;
        if (view == null) {
            view = this;
        }
        setContentDescription(this.tG.zp(this.vDp.Gzh()));
        String Eg = this.vDp.Eg();
        String str2 = null;
        if (!TextUtils.isEmpty(Eg) && (dynamicRootView = this.rV) != null && dynamicRootView.getRenderRequest() != null && this.rV.getRenderRequest().KS() != null && (optJSONObject = this.rV.getRenderRequest().KS().optJSONObject("creative")) != null) {
            str = zp(optJSONObject.opt(Eg));
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            str = this.vDp.FP();
        }
        if (this.vDp.cz()) {
            final int pvr = this.vDp.pvr();
            com.bytedance.sdk.component.adexpress.zp.zp.zp.zp().COT().zp(this.vDp.lMd).KS(2).zp(new com.bytedance.sdk.component.COT.ku() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp.3
                @Override // com.bytedance.sdk.component.COT.ku
                public Bitmap zp(Bitmap bitmap) {
                    return com.bytedance.sdk.component.adexpress.jU.zp.zp(DynamicBaseWidgetImp.this.Bj, bitmap, pvr);
                }
            }).zp(new KVG<Bitmap>() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp.1
                @Override // com.bytedance.sdk.component.COT.KVG
                public void zp(int i9, String str3, Throwable th) {
                }

                @Override // com.bytedance.sdk.component.COT.KVG
                public void zp(Bj<Bitmap> bj) {
                    Bitmap lMd = bj.lMd();
                    if (lMd == null || bj.KS() == null) {
                        return;
                    }
                    view.setBackground(DynamicBaseWidgetImp.this.zp(lMd));
                }
            });
        } else if (!TextUtils.isEmpty(str)) {
            if (!str.startsWith("http:") && !str.startsWith("https:")) {
                DynamicRootView dynamicRootView2 = this.rV;
                if (dynamicRootView2 != null && dynamicRootView2.getRenderRequest() != null) {
                    str2 = this.rV.getRenderRequest().ot();
                }
                str = YW.lMd(str, str2);
            }
            dT KS = com.bytedance.sdk.component.adexpress.zp.zp.zp.zp().COT().zp(str).KS(2);
            zp(KS);
            if (!com.bytedance.sdk.component.adexpress.jU.lMd()) {
                if ((view instanceof FrameLayout) && L.x(this.tG, "vessel")) {
                    if (com.bytedance.sdk.component.adexpress.jU.ku.lMd(str)) {
                        this.ot = new GifView(this.Bj);
                    } else {
                        this.ot = new ImageView(this.Bj);
                    }
                    ((FrameLayout) view).addView(this.ot, new FrameLayout.LayoutParams(-1, -1));
                    KS.KS(3).zp(new KVG() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp.4
                        @Override // com.bytedance.sdk.component.COT.KVG
                        public void zp(int i9, String str3, Throwable th) {
                        }

                        @Override // com.bytedance.sdk.component.COT.KVG
                        public void zp(Bj bj) {
                            Object lMd = bj.lMd();
                            if (lMd instanceof byte[]) {
                                DynamicBaseWidgetImp dynamicBaseWidgetImp = DynamicBaseWidgetImp.this;
                                com.bytedance.sdk.component.adexpress.jU.COT.zp(DynamicBaseWidgetImp.this.ot, (byte[]) lMd, dynamicBaseWidgetImp.QR, dynamicBaseWidgetImp.ku);
                            }
                        }
                    });
                } else {
                    zp(KS, view);
                }
            } else {
                KS.zp(new KVG<Bitmap>() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp.5
                    @Override // com.bytedance.sdk.component.COT.KVG
                    public void zp(int i9, String str3, Throwable th) {
                    }

                    @Override // com.bytedance.sdk.component.COT.KVG
                    public void zp(Bj<Bitmap> bj) {
                        if (com.bytedance.sdk.component.adexpress.jU.lMd()) {
                            view.setBackground(new BitmapDrawable(bj.lMd()));
                            ku kuVar = DynamicBaseWidgetImp.this.tG;
                            if (kuVar == null || kuVar.dT() == null || 6 != DynamicBaseWidgetImp.this.tG.dT().zp() || view.getBackground() == null) {
                                return;
                            }
                            view.getBackground().setAutoMirrored(true);
                            return;
                        }
                        DynamicRootView dynamicRootView3 = DynamicBaseWidgetImp.this.rV;
                        if (dynamicRootView3 == null) {
                            return;
                        }
                        if (!"open_ad".equals(dynamicRootView3.getRenderRequest().jU()) && !"splash_ad".equals(DynamicBaseWidgetImp.this.rV.getRenderRequest().jU())) {
                            view.setBackground(new BitmapDrawable(bj.lMd()));
                        } else {
                            view.setBackground(new BitmapDrawable(bj.lMd()));
                        }
                    }
                });
            }
        }
        if (getBackground() == null && (backgroundDrawable = getBackgroundDrawable()) != null) {
            view.setBackground(backgroundDrawable);
        }
        if (this.vDp.QUv() > 0.0d) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp.6
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (DynamicBaseWidgetImp.this.vDp.fRl() > 0) {
                            DynamicBaseWidgetImp dynamicBaseWidgetImp = DynamicBaseWidgetImp.this;
                            Drawable lMd = dynamicBaseWidgetImp.lMd(dynamicBaseWidgetImp.rV.getBgMaterialCenterCalcColor().get(Integer.valueOf(DynamicBaseWidgetImp.this.vDp.fRl())));
                            if (lMd == null) {
                                DynamicBaseWidgetImp dynamicBaseWidgetImp2 = DynamicBaseWidgetImp.this;
                                lMd = dynamicBaseWidgetImp2.zp(true, dynamicBaseWidgetImp2.rV.getBgMaterialCenterCalcColor().get(Integer.valueOf(DynamicBaseWidgetImp.this.vDp.fRl())));
                            }
                            if (lMd != null) {
                                view.setBackground(lMd);
                                return;
                            }
                            View view2 = view;
                            DynamicBaseWidgetImp dynamicBaseWidgetImp3 = DynamicBaseWidgetImp.this;
                            view2.setBackground(dynamicBaseWidgetImp3.zp(true, dynamicBaseWidgetImp3.rV.getBgColor()));
                        }
                    } catch (Exception unused) {
                    }
                }
            }, (long) (this.vDp.QUv() * 1000.0d));
        }
        View view2 = this.dQp;
        if (view2 != null) {
            view2.setPadding((int) QR.zp(this.Bj, this.vDp.KS()), (int) QR.zp(this.Bj, this.vDp.lMd()), (int) QR.zp(this.Bj, this.vDp.jU()), (int) QR.zp(this.Bj, this.vDp.zp()));
        }
        if (this.KVG || this.vDp.rV() > 0.0d) {
            setShouldInvisible(true);
            view.setVisibility(4);
            setVisibility(4);
        }
        return true;
    }

    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(this.QR, this.ku);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        View view = this.dQp;
        if (view == null) {
            view = this;
        }
        double cz2 = this.tG.dT().COT().cz();
        if (cz2 < 90.0d && cz2 > 0.0d) {
            com.bytedance.sdk.component.utils.ku.lMd().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp.8
                @Override // java.lang.Runnable
                public void run() {
                    DynamicBaseWidgetImp.this.setVisibility(8);
                }
            }, (long) (cz2 * 1000.0d));
        }
        zp(this.tG.dT().COT().pvr(), view);
        if (!TextUtils.isEmpty(this.vDp.Iv())) {
            zp();
        }
        super.onAttachedToWindow();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            removeCallbacks(this.zp);
            removeCallbacks(this.lMd);
        } catch (Exception unused) {
        }
    }

    private String zp(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof JSONArray) {
            return zp(((JSONArray) obj).opt(0));
        }
        if (obj instanceof JSONObject) {
            return zp((Object) ((JSONObject) obj).optString("url"));
        }
        return null;
    }

    private void zp(dT dTVar, final View view) {
        dTVar.zp(new KVG<Bitmap>() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp.7
            @Override // com.bytedance.sdk.component.COT.KVG
            public void zp(int i9, String str, Throwable th) {
            }

            @Override // com.bytedance.sdk.component.COT.KVG
            public void zp(Bj<Bitmap> bj) {
                DynamicRootView dynamicRootView = DynamicBaseWidgetImp.this.rV;
                if (dynamicRootView == null) {
                    return;
                }
                if (!"open_ad".equals(dynamicRootView.getRenderRequest().jU()) && !"splash_ad".equals(DynamicBaseWidgetImp.this.rV.getRenderRequest().jU())) {
                    view.setBackground(new BitmapDrawable(bj.lMd()));
                } else {
                    if (com.bytedance.sdk.component.adexpress.jU.lMd()) {
                        view.setBackground(new zp(bj.lMd(), ((DynamicRoot) DynamicBaseWidgetImp.this.rV.getChildAt(0)).zp));
                        return;
                    }
                    view.setBackground(new BitmapDrawable(bj.lMd()));
                }
            }
        });
    }

    private static void zp(dT dTVar) {
        if ("SMARTISAN".equals(Build.BRAND) && "SM901".equals(getBuildModel())) {
            dTVar.zp(Bitmap.Config.ARGB_8888);
        }
    }

    private void zp(double d2, final View view) {
        if (d2 > 0.0d) {
            com.bytedance.sdk.component.utils.ku.lMd().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp.9
                @Override // java.lang.Runnable
                public void run() {
                    if (DynamicBaseWidgetImp.this.tG.dT().COT().Sr() != null) {
                        return;
                    }
                    view.setVisibility(0);
                    DynamicBaseWidgetImp.this.setVisibility(0);
                }
            }, (long) (d2 * 1000.0d));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() <= 0) {
            return;
        }
        for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
            if (viewGroup.getChildAt(i9) instanceof InteractViewContainer) {
                viewGroup.removeViewAt(i9);
            }
        }
    }

    private void zp() {
        if (this.FP) {
            int Rh = this.vDp.Rh();
            int gH = this.vDp.gH();
            Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp.10
                @Override // java.lang.Runnable
                public void run() {
                    DynamicRootView dynamicRootView = DynamicBaseWidgetImp.this.rV;
                    if (dynamicRootView != null && dynamicRootView.getRenderRequest() != null) {
                        tG renderRequest = DynamicBaseWidgetImp.this.rV.getRenderRequest();
                        com.bytedance.sdk.component.adexpress.dynamic.KS.dT dTVar = new com.bytedance.sdk.component.adexpress.dynamic.KS.dT();
                        dTVar.zp(renderRequest.dQp());
                        dTVar.lMd(renderRequest.KVG());
                        dTVar.KS(renderRequest.woN());
                        dTVar.zp(renderRequest.vwr());
                        dTVar.jU(renderRequest.pvr());
                        dTVar.COT(renderRequest.cz());
                        DynamicBaseWidgetImp dynamicBaseWidgetImp = DynamicBaseWidgetImp.this;
                        DynamicBaseWidgetImp dynamicBaseWidgetImp2 = DynamicBaseWidgetImp.this;
                        dynamicBaseWidgetImp.pvr = new InteractViewContainer(dynamicBaseWidgetImp2.Bj, dynamicBaseWidgetImp2, dynamicBaseWidgetImp2.vDp, dTVar, renderRequest);
                    } else {
                        DynamicBaseWidgetImp dynamicBaseWidgetImp3 = DynamicBaseWidgetImp.this;
                        DynamicBaseWidgetImp dynamicBaseWidgetImp4 = DynamicBaseWidgetImp.this;
                        dynamicBaseWidgetImp3.pvr = new InteractViewContainer(dynamicBaseWidgetImp4.Bj, dynamicBaseWidgetImp4, dynamicBaseWidgetImp4.vDp);
                    }
                    DynamicBaseWidgetImp dynamicBaseWidgetImp5 = DynamicBaseWidgetImp.this;
                    dynamicBaseWidgetImp5.lMd(dynamicBaseWidgetImp5.pvr);
                    if (DynamicBaseWidgetImp.this.getParent() instanceof ViewGroup) {
                        ((ViewGroup) DynamicBaseWidgetImp.this.getParent()).setClipChildren(false);
                    }
                    DynamicBaseWidgetImp.this.setClipChildren(false);
                    DynamicBaseWidgetImp.this.pvr.setTag(2);
                    DynamicBaseWidgetImp dynamicBaseWidgetImp6 = DynamicBaseWidgetImp.this;
                    dynamicBaseWidgetImp6.zp((ViewGroup) dynamicBaseWidgetImp6);
                    DynamicBaseWidgetImp dynamicBaseWidgetImp7 = DynamicBaseWidgetImp.this;
                    dynamicBaseWidgetImp7.addView(dynamicBaseWidgetImp7.pvr, new FrameLayout.LayoutParams(-1, -1));
                    DynamicBaseWidgetImp.this.pvr.KS();
                }
            };
            this.zp = runnable;
            postDelayed(runnable, Rh * 1000);
            if (this.vDp.rCC() || gH >= Integer.MAX_VALUE || Rh >= gH) {
                return;
            }
            Runnable runnable2 = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp.2
                @Override // java.lang.Runnable
                public void run() {
                    DynamicBaseWidgetImp dynamicBaseWidgetImp = DynamicBaseWidgetImp.this;
                    if (dynamicBaseWidgetImp.pvr != null) {
                        dynamicBaseWidgetImp.FP = false;
                        DynamicBaseWidgetImp.this.pvr.jU();
                        DynamicBaseWidgetImp.this.pvr.setVisibility(4);
                        DynamicBaseWidgetImp dynamicBaseWidgetImp2 = DynamicBaseWidgetImp.this;
                        dynamicBaseWidgetImp2.removeView(dynamicBaseWidgetImp2.pvr);
                    }
                }
            };
            this.lMd = runnable2;
            postDelayed(runnable2, gH * 1000);
        }
    }
}

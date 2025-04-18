package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.Map;
import n0.w0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class eT extends vc {
    private String YFl;

    /* loaded from: classes.dex */
    public static class Sg implements com.bytedance.sdk.component.wN.rkt<Bitmap> {
        private Resources Sg;
        private WeakReference<View> YFl;

        public Sg(View view, Resources resources) {
            this.YFl = new WeakReference<>(view);
            this.Sg = resources;
        }

        @Override // com.bytedance.sdk.component.wN.rkt
        public void YFl(int i10, String str, Throwable th2) {
        }

        @Override // com.bytedance.sdk.component.wN.rkt
        public void YFl(com.bytedance.sdk.component.wN.eT<Bitmap> eTVar) {
            Bitmap Sg;
            View view = this.YFl.get();
            if (view == null || (Sg = eTVar.Sg()) == null || eTVar.tN() == null) {
                return;
            }
            view.setBackground(new BitmapDrawable(this.Sg, Sg));
        }
    }

    /* loaded from: classes.dex */
    public static class YFl implements com.bytedance.sdk.component.wN.qsH {
        private final WeakReference<Context> YFl;

        public YFl(Context context) {
            this.YFl = new WeakReference<>(context);
        }

        @Override // com.bytedance.sdk.component.wN.qsH
        public Bitmap YFl(Bitmap bitmap) {
            Context context = this.YFl.get();
            if (context != null) {
                return com.bytedance.sdk.component.adexpress.AlY.YFl.YFl(context, bitmap, 25);
            }
            return null;
        }
    }

    public eT(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh) {
        super(context, dynamicRootView, qsh);
        if (!TextUtils.isEmpty(this.YoT.Bn()) && qsh.qO()) {
            com.bytedance.sdk.component.adexpress.vc.nc ncVar = new com.bytedance.sdk.component.adexpress.vc.nc(context);
            ncVar.setAnimationsLoop(this.YoT.uGS());
            ncVar.setImageLottieTosPath(this.YoT.Bn());
            ncVar.setLottieAppNameMaxLength(this.YoT.DjU());
            ncVar.setLottieAdTitleMaxLength(this.YoT.UT());
            ncVar.setLottieAdDescMaxLength(this.YoT.ZLB());
            ncVar.setData(qsh.aIu());
            this.EH = ncVar;
        } else if (this.YoT.EH() > 0.0f) {
            com.bytedance.sdk.component.adexpress.vc.UZM uzm = new com.bytedance.sdk.component.adexpress.vc.UZM(context);
            this.EH = uzm;
            uzm.setXRound((int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(context, this.YoT.EH()));
            ((com.bytedance.sdk.component.adexpress.vc.UZM) this.EH).setYRound((int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(context, this.YoT.EH()));
        } else if (!qsH() && "arrowButton".equals(qsh.nc().Sg())) {
            com.bytedance.sdk.component.adexpress.dynamic.animation.view.Sg sg2 = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.Sg(context);
            sg2.setBrickNativeValue(this.YoT);
            this.EH = sg2;
        } else if (com.bytedance.sdk.component.adexpress.AlY.nc.Sg(this.YoT.eT())) {
            this.EH = new com.bytedance.sdk.component.adexpress.vc.GA(context);
        } else {
            this.EH = new ImageView(context);
        }
        this.YFl = getImageKey();
        this.EH.setTag(Integer.valueOf(getClickArea()));
        if ("arrowButton".equals(qsh.nc().Sg())) {
            if (this.YoT.Sg() <= 0 && this.YoT.YFl() <= 0) {
                int max = Math.max(this.DSW, this.qsH);
                this.DSW = max;
                this.qsH = Math.max(max, this.qsH);
            } else {
                int min = Math.min(this.DSW, this.qsH);
                this.DSW = min;
                this.qsH = Math.min(min, this.qsH);
                this.NjR = (int) (com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(context, (this.YoT.YFl() / 2) + this.YoT.Sg() + 0.5f) + this.NjR);
            }
            this.YoT.YFl(this.DSW / 2);
        }
        addView(this.EH, new FrameLayout.LayoutParams(this.DSW, this.qsH));
    }

    private boolean YFl() {
        String YoT = this.YoT.YoT();
        if (this.YoT.aIu()) {
            return true;
        }
        if (TextUtils.isEmpty(YoT)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(YoT);
            return Math.abs((((float) this.DSW) / (((float) this.qsH) * 1.0f)) - (((float) jSONObject.optInt("width")) / (((float) jSONObject.optInt("height")) * 1.0f))) > 0.01f;
        } catch (JSONException unused) {
            return false;
        }
    }

    private String getImageKey() {
        Map<String, String> eT = this.pDU.getRenderRequest().eT();
        if (eT != null && eT.size() > 0) {
            return eT.get(this.YoT.eT());
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Sco
    public boolean NjR() {
        String str;
        super.NjR();
        if (!TextUtils.isEmpty(this.YoT.Bn())) {
            ((ImageView) this.EH).setScaleType(ImageView.ScaleType.CENTER_CROP);
            return true;
        }
        if ("arrowButton".equals(this.GA.nc().Sg())) {
            ((ImageView) this.EH).setImageResource(com.bytedance.sdk.component.utils.qO.AlY(this.eT, "tt_white_righterbackicon_titlebar"));
            if (((ImageView) this.EH).getDrawable() != null) {
                ((ImageView) this.EH).getDrawable().setAutoMirrored(true);
            }
            this.EH.setPadding(0, 0, 0, 0);
            ((ImageView) this.EH).setScaleType(ImageView.ScaleType.FIT_XY);
            return true;
        }
        this.EH.setBackgroundColor(this.YoT.dXO());
        String tN = this.GA.nc().tN();
        if ("user".equals(tN)) {
            ((ImageView) this.EH).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ((ImageView) this.EH).setColorFilter(this.YoT.DSW());
            ((ImageView) this.EH).setImageDrawable(com.bytedance.sdk.component.utils.qO.tN(getContext(), "tt_user"));
            ImageView imageView = (ImageView) this.EH;
            int i10 = this.DSW;
            imageView.setPadding(i10 / 10, this.qsH / 5, i10 / 10, 0);
        } else if (tN != null && tN.startsWith("@")) {
            try {
                ((ImageView) this.EH).setImageResource(Integer.parseInt(tN.substring(1)));
            } catch (Exception unused) {
            }
        }
        com.bytedance.sdk.component.wN.EH wN = com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl().wN();
        String eT = this.YoT.eT();
        if (!TextUtils.isEmpty(eT) && !eT.startsWith("http:") && !eT.startsWith("https:")) {
            DynamicRootView dynamicRootView = this.pDU;
            if (dynamicRootView != null && dynamicRootView.getRenderRequest() != null) {
                str = this.pDU.getRenderRequest().bZ();
            } else {
                str = null;
            }
            eT = com.bytedance.sdk.component.adexpress.dynamic.wN.NjR.Sg(eT, str);
        }
        com.bytedance.sdk.component.wN.nc YFl2 = wN.YFl(eT).YFl(this.YFl);
        String pDU = this.pDU.getRenderRequest().pDU();
        if (!TextUtils.isEmpty(pDU)) {
            YFl2.Sg(pDU);
        }
        if (YFl()) {
            ((ImageView) this.EH).setScaleType(ImageView.ScaleType.FIT_CENTER);
            YFl2.YFl(Bitmap.Config.ARGB_4444).tN(2).YFl(new YFl(this.eT)).YFl(new Sg(this.EH, getResources()));
        } else {
            if (com.bytedance.sdk.component.adexpress.AlY.Sg()) {
                YFl2.YFl((ImageView) this.EH);
            }
            ((ImageView) this.EH).setScaleType(ImageView.ScaleType.FIT_XY);
        }
        if ((this.EH instanceof ImageView) && "cover".equals(getImageObjectFit())) {
            ((ImageView) this.EH).setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        if (!com.bytedance.sdk.component.adexpress.AlY.Sg()) {
            YFl(YFl2);
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = ((ImageView) this.EH).getDrawable();
        if (Build.VERSION.SDK_INT >= 28 && w0.x(drawable)) {
            w0.f(drawable).start();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = ((ImageView) this.EH).getDrawable();
        if (Build.VERSION.SDK_INT >= 28 && w0.x(drawable)) {
            w0.f(drawable).stop();
        }
    }

    private void YFl(com.bytedance.sdk.component.wN.nc ncVar) {
        ncVar.tN(3).YFl(new com.bytedance.sdk.component.wN.rkt() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.eT.1
            @Override // com.bytedance.sdk.component.wN.rkt
            public void YFl(int i10, String str, Throwable th2) {
            }

            @Override // com.bytedance.sdk.component.wN.rkt
            public void YFl(com.bytedance.sdk.component.wN.eT eTVar) {
                Object Sg2 = eTVar.Sg();
                if (Sg2 instanceof byte[]) {
                    eT eTVar2 = eT.this;
                    View view = eTVar2.EH;
                    if (view instanceof ImageView) {
                        com.bytedance.sdk.component.adexpress.AlY.vc.Sg((ImageView) view, (byte[]) Sg2, eTVar2.DSW, eTVar2.qsH);
                    }
                }
            }
        });
    }
}

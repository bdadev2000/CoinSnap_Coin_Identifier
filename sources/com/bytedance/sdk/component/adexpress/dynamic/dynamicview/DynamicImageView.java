package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import V1.b;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.COT.Bj;
import com.bytedance.sdk.component.COT.KVG;
import com.bytedance.sdk.component.COT.dQp;
import com.bytedance.sdk.component.COT.dT;
import com.bytedance.sdk.component.adexpress.dynamic.KS.ku;
import com.bytedance.sdk.component.adexpress.dynamic.animation.view.AnimationImageView;
import com.bytedance.sdk.component.adexpress.dynamic.jU.YW;
import com.bytedance.sdk.component.adexpress.jU.QR;
import com.bytedance.sdk.component.adexpress.widget.DynamicLottieView;
import com.bytedance.sdk.component.adexpress.widget.GifView;
import com.bytedance.sdk.component.adexpress.widget.TTRoundRectImageView;
import com.bytedance.sdk.component.utils.cz;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class DynamicImageView extends DynamicBaseWidgetImp {
    private String zp;

    public DynamicImageView(Context context, DynamicRootView dynamicRootView, ku kuVar) {
        super(context, dynamicRootView, kuVar);
        if (!TextUtils.isEmpty(this.vDp.zpV()) && kuVar.pvr()) {
            DynamicLottieView dynamicLottieView = new DynamicLottieView(context);
            dynamicLottieView.setAnimationsLoop(this.vDp.REM());
            dynamicLottieView.setImageLottieTosPath(this.vDp.zpV());
            dynamicLottieView.setLottieAppNameMaxLength(this.vDp.vLi());
            dynamicLottieView.setLottieAdTitleMaxLength(this.vDp.CZ());
            dynamicLottieView.setLottieAdDescMaxLength(this.vDp.bX());
            dynamicLottieView.setData(kuVar.cz());
            this.dQp = dynamicLottieView;
        } else if (this.vDp.dQp() > 0.0f) {
            TTRoundRectImageView tTRoundRectImageView = new TTRoundRectImageView(context);
            this.dQp = tTRoundRectImageView;
            tTRoundRectImageView.setXRound((int) QR.zp(context, this.vDp.dQp()));
            ((TTRoundRectImageView) this.dQp).setYRound((int) QR.zp(context, this.vDp.dQp()));
        } else if (!ku() && "arrowButton".equals(kuVar.dT().lMd())) {
            AnimationImageView animationImageView = new AnimationImageView(context);
            animationImageView.setBrickNativeValue(this.vDp);
            this.dQp = animationImageView;
        } else if (com.bytedance.sdk.component.adexpress.jU.ku.lMd(this.vDp.Bj())) {
            this.dQp = new GifView(context);
        } else {
            this.dQp = new ImageView(context);
        }
        this.zp = getImageKey();
        this.dQp.setTag(Integer.valueOf(getClickArea()));
        if ("arrowButton".equals(kuVar.dT().lMd())) {
            if (this.vDp.lMd() <= 0 && this.vDp.zp() <= 0) {
                int max = Math.max(this.QR, this.ku);
                this.QR = max;
                this.ku = Math.max(max, this.ku);
            } else {
                int min = Math.min(this.QR, this.ku);
                this.QR = min;
                this.ku = Math.min(min, this.ku);
                this.YW = (int) (QR.zp(context, (this.vDp.zp() / 2) + this.vDp.lMd() + 0.5f) + this.YW);
            }
            this.vDp.zp(this.QR / 2);
        }
        addView(this.dQp, new FrameLayout.LayoutParams(this.QR, this.ku));
    }

    private String getImageKey() {
        Map<String, String> Bj = this.rV.getRenderRequest().Bj();
        if (Bj != null && Bj.size() > 0) {
            return Bj.get(this.vDp.Bj());
        }
        return null;
    }

    private boolean zp() {
        String vDp = this.vDp.vDp();
        if (this.vDp.cz()) {
            return true;
        }
        if (TextUtils.isEmpty(vDp)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(vDp);
            return Math.abs((((float) this.QR) / (((float) this.ku) * 1.0f)) - (((float) jSONObject.optInt("width")) / (((float) jSONObject.optInt("height")) * 1.0f))) > 0.01f;
        } catch (JSONException unused) {
            return false;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jU
    public boolean YW() {
        String str;
        super.YW();
        if (!TextUtils.isEmpty(this.vDp.zpV())) {
            ((ImageView) this.dQp).setScaleType(ImageView.ScaleType.CENTER_CROP);
            return true;
        }
        if ("arrowButton".equals(this.tG.dT().lMd())) {
            ((ImageView) this.dQp).setImageResource(cz.jU(this.Bj, "tt_white_righterbackicon_titlebar"));
            if (((ImageView) this.dQp).getDrawable() != null) {
                ((ImageView) this.dQp).getDrawable().setAutoMirrored(true);
            }
            this.dQp.setPadding(0, 0, 0, 0);
            ((ImageView) this.dQp).setScaleType(ImageView.ScaleType.FIT_XY);
            return true;
        }
        this.dQp.setBackgroundColor(this.vDp.irS());
        String KS = this.tG.dT().KS();
        if ("user".equals(KS)) {
            ((ImageView) this.dQp).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ((ImageView) this.dQp).setColorFilter(this.vDp.QR());
            ((ImageView) this.dQp).setImageDrawable(cz.KS(getContext(), "tt_user"));
            ImageView imageView = (ImageView) this.dQp;
            int i9 = this.QR;
            imageView.setPadding(i9 / 10, this.ku / 5, i9 / 10, 0);
        } else if (KS != null && KS.startsWith("@")) {
            try {
                ((ImageView) this.dQp).setImageResource(Integer.parseInt(KS.substring(1)));
            } catch (Exception unused) {
            }
        }
        dQp COT = com.bytedance.sdk.component.adexpress.zp.zp.zp.zp().COT();
        String Bj = this.vDp.Bj();
        if (!TextUtils.isEmpty(Bj) && !Bj.startsWith("http:") && !Bj.startsWith("https:")) {
            DynamicRootView dynamicRootView = this.rV;
            if (dynamicRootView != null && dynamicRootView.getRenderRequest() != null) {
                str = this.rV.getRenderRequest().ot();
            } else {
                str = null;
            }
            Bj = YW.lMd(Bj, str);
        }
        dT zp = COT.zp(Bj).zp(this.zp);
        String rV = this.rV.getRenderRequest().rV();
        if (!TextUtils.isEmpty(rV)) {
            zp.lMd(rV);
        }
        if (zp()) {
            ((ImageView) this.dQp).setScaleType(ImageView.ScaleType.FIT_CENTER);
            zp.zp(Bitmap.Config.ARGB_4444).KS(2).zp(new com.bytedance.sdk.component.COT.ku() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicImageView.2
                @Override // com.bytedance.sdk.component.COT.ku
                public Bitmap zp(Bitmap bitmap) {
                    return com.bytedance.sdk.component.adexpress.jU.zp.zp(DynamicImageView.this.Bj, bitmap, 25);
                }
            }).zp(new KVG<Bitmap>() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicImageView.1
                @Override // com.bytedance.sdk.component.COT.KVG
                public void zp(int i10, String str2, Throwable th) {
                }

                @Override // com.bytedance.sdk.component.COT.KVG
                public void zp(Bj<Bitmap> bj) {
                    Bitmap lMd = bj.lMd();
                    if (lMd == null || bj.KS() == null) {
                        return;
                    }
                    DynamicImageView.this.dQp.setBackground(new BitmapDrawable(DynamicImageView.this.getResources(), lMd));
                }
            });
        } else {
            if (com.bytedance.sdk.component.adexpress.jU.lMd()) {
                zp.zp((ImageView) this.dQp);
            }
            ((ImageView) this.dQp).setScaleType(ImageView.ScaleType.FIT_XY);
        }
        if ((this.dQp instanceof ImageView) && "cover".equals(getImageObjectFit())) {
            ((ImageView) this.dQp).setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        if (!com.bytedance.sdk.component.adexpress.jU.lMd()) {
            zp(zp);
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = ((ImageView) this.dQp).getDrawable();
        if (Build.VERSION.SDK_INT >= 28 && b.x(drawable)) {
            b.k(drawable).start();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = ((ImageView) this.dQp).getDrawable();
        if (Build.VERSION.SDK_INT >= 28 && b.x(drawable)) {
            b.k(drawable).stop();
        }
    }

    private void zp(dT dTVar) {
        dTVar.KS(3).zp(new KVG() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicImageView.3
            @Override // com.bytedance.sdk.component.COT.KVG
            public void zp(int i9, String str, Throwable th) {
            }

            @Override // com.bytedance.sdk.component.COT.KVG
            public void zp(Bj bj) {
                Object lMd = bj.lMd();
                if (lMd instanceof byte[]) {
                    DynamicImageView dynamicImageView = DynamicImageView.this;
                    View view = dynamicImageView.dQp;
                    if (view instanceof ImageView) {
                        com.bytedance.sdk.component.adexpress.jU.COT.zp((ImageView) view, (byte[]) lMd, dynamicImageView.QR, dynamicImageView.ku);
                    }
                }
            }
        });
    }
}

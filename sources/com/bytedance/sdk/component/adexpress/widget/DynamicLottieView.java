package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.adsdk.lottie.LottieAnimationView;
import com.bytedance.adsdk.lottie.YW;
import com.bytedance.adsdk.lottie.jU;
import com.bytedance.sdk.component.COT.Bj;
import com.bytedance.sdk.component.COT.KVG;
import com.bytedance.sdk.component.COT.ku;
import com.bytedance.sdk.component.adexpress.zp.zp.zp;
import com.mbridge.msdk.foundation.entity.o;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class DynamicLottieView extends LottieAnimationView {
    private String lMd;
    private Map<String, Bitmap> zp;

    public DynamicLottieView(Context context) {
        super(context);
        this.zp = new HashMap();
    }

    public void HWF() {
        if (TextUtils.isEmpty(this.lMd)) {
            return;
        }
        setProgress(0.0f);
        lMd(true);
        setAnimationFromUrl(this.lMd);
        setImageAssetDelegate(new jU() { // from class: com.bytedance.sdk.component.adexpress.widget.DynamicLottieView.1
            @Override // com.bytedance.adsdk.lottie.jU
            public Bitmap zp(final YW yw) {
                final String KS = yw.KS();
                String COT = yw.COT();
                String jU = yw.jU();
                if (TextUtils.equals(KS, "image_0") && TextUtils.equals(jU, "Lark20201123-180048_2.png")) {
                    jU = "hand.png";
                }
                Bitmap bitmap = (Bitmap) DynamicLottieView.this.zp.get(KS);
                if (bitmap != null) {
                    return bitmap;
                }
                if (TextUtils.isEmpty(COT) || !TextUtils.isEmpty(jU)) {
                    if (!TextUtils.isEmpty(jU) && TextUtils.isEmpty(COT)) {
                        COT = jU;
                    } else if (!TextUtils.isEmpty(jU) && !TextUtils.isEmpty(COT)) {
                        COT = o.j(COT, jU);
                    } else {
                        COT = "";
                    }
                }
                if (TextUtils.isEmpty(COT)) {
                    return null;
                }
                zp.zp().COT().zp(COT).zp(new ku() { // from class: com.bytedance.sdk.component.adexpress.widget.DynamicLottieView.1.2
                    @Override // com.bytedance.sdk.component.COT.ku
                    public Bitmap zp(Bitmap bitmap2) {
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap2, yw.zp(), yw.lMd(), false);
                        DynamicLottieView.this.zp.put(KS, createScaledBitmap);
                        return createScaledBitmap;
                    }
                }).zp(new KVG<Bitmap>() { // from class: com.bytedance.sdk.component.adexpress.widget.DynamicLottieView.1.1
                    @Override // com.bytedance.sdk.component.COT.KVG
                    public void zp(int i9, String str, Throwable th) {
                    }

                    @Override // com.bytedance.sdk.component.COT.KVG
                    public void zp(Bj<Bitmap> bj) {
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bj.lMd(), yw.zp(), yw.lMd(), false);
                        DynamicLottieView.this.zp.put(KS, createScaledBitmap);
                        DynamicLottieView.this.zp(yw.KS(), createScaledBitmap);
                    }
                });
                return (Bitmap) DynamicLottieView.this.zp.get(KS);
            }
        });
        zp();
    }

    public void setAnimationsLoop(boolean z8) {
    }

    public void setData(Map<String, String> map) {
    }

    public void setImageLottieTosPath(String str) {
        this.lMd = str;
    }

    public void setLottieAdDescMaxLength(int i9) {
    }

    public void setLottieAdTitleMaxLength(int i9) {
    }

    public void setLottieAppNameMaxLength(int i9) {
    }
}

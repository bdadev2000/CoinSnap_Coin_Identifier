package com.bytedance.sdk.component.adexpress.vc;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import eb.j;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class nc extends com.bytedance.adsdk.Sg.vc {
    private String Sg;
    private Map<String, Bitmap> YFl;

    /* loaded from: classes.dex */
    public static class YFl implements com.bytedance.sdk.component.wN.rkt<Bitmap> {
        private final Map<String, Bitmap> AlY;
        private final com.bytedance.adsdk.Sg.nc Sg;
        private final WeakReference<nc> YFl;
        private final String tN;

        public YFl(nc ncVar, com.bytedance.adsdk.Sg.nc ncVar2, String str, Map<String, Bitmap> map) {
            this.YFl = new WeakReference<>(ncVar);
            this.Sg = ncVar2;
            this.tN = str;
            this.AlY = map;
        }

        @Override // com.bytedance.sdk.component.wN.rkt
        public void YFl(int i10, String str, Throwable th2) {
        }

        @Override // com.bytedance.sdk.component.wN.rkt
        public void YFl(com.bytedance.sdk.component.wN.eT<Bitmap> eTVar) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(eTVar.Sg(), this.Sg.YFl(), this.Sg.Sg(), false);
            this.AlY.put(this.tN, createScaledBitmap);
            nc ncVar = this.YFl.get();
            if (ncVar != null) {
                ncVar.YFl(this.Sg.DSW(), createScaledBitmap);
            }
        }
    }

    public nc(Context context) {
        super(context);
        this.YFl = new HashMap();
    }

    public void qsH() {
        if (TextUtils.isEmpty(this.Sg)) {
            return;
        }
        setProgress(0.0f);
        YFl(true);
        setAnimationFromUrl(this.Sg);
        setImageAssetDelegate(new com.bytedance.adsdk.Sg.AlY() { // from class: com.bytedance.sdk.component.adexpress.vc.nc.1
            @Override // com.bytedance.adsdk.Sg.AlY
            public Bitmap YFl(final com.bytedance.adsdk.Sg.nc ncVar) {
                final String DSW = ncVar.DSW();
                String NjR = ncVar.NjR();
                String qsH = ncVar.qsH();
                if (TextUtils.equals(DSW, "image_0") && TextUtils.equals(qsH, "Lark20201123-180048_2.png")) {
                    qsH = "hand.png";
                }
                Bitmap bitmap = (Bitmap) nc.this.YFl.get(DSW);
                if (bitmap != null) {
                    return bitmap;
                }
                if (TextUtils.isEmpty(NjR) || !TextUtils.isEmpty(qsH)) {
                    if (!TextUtils.isEmpty(qsH) && TextUtils.isEmpty(NjR)) {
                        NjR = qsH;
                    } else if (!TextUtils.isEmpty(qsH) && !TextUtils.isEmpty(NjR)) {
                        NjR = j.k(NjR, qsH);
                    } else {
                        NjR = "";
                    }
                }
                if (TextUtils.isEmpty(NjR)) {
                    return null;
                }
                com.bytedance.sdk.component.wN.nc YFl2 = com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl().wN().YFl(NjR).YFl(new com.bytedance.sdk.component.wN.qsH() { // from class: com.bytedance.sdk.component.adexpress.vc.nc.1.1
                    @Override // com.bytedance.sdk.component.wN.qsH
                    public Bitmap YFl(Bitmap bitmap2) {
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap2, ncVar.YFl(), ncVar.Sg(), false);
                        nc.this.YFl.put(DSW, createScaledBitmap);
                        return createScaledBitmap;
                    }
                });
                nc ncVar2 = nc.this;
                YFl2.YFl(new YFl(ncVar2, ncVar, DSW, ncVar2.YFl));
                return (Bitmap) nc.this.YFl.get(DSW);
            }
        });
        YFl();
    }

    public void setAnimationsLoop(boolean z10) {
    }

    public void setData(Map<String, String> map) {
    }

    public void setImageLottieTosPath(String str) {
        this.Sg = str;
    }

    public void setLottieAdDescMaxLength(int i10) {
    }

    public void setLottieAdTitleMaxLength(int i10) {
    }

    public void setLottieAppNameMaxLength(int i10) {
    }
}

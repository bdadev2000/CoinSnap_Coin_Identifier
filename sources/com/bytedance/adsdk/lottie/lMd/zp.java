package com.bytedance.adsdk.lottie.lMd;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.adsdk.lottie.KS;
import com.bytedance.adsdk.lottie.KS.QR;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class zp {
    private KS COT;
    private final AssetManager jU;
    private final QR<String> zp = new QR<>();
    private final Map<QR<String>, Typeface> lMd = new HashMap();
    private final Map<String, Typeface> KS = new HashMap();
    private String HWF = ".ttf";

    public zp(Drawable.Callback callback, KS ks) {
        this.COT = ks;
        if (!(callback instanceof View)) {
            this.jU = null;
        } else {
            this.jU = ((View) callback).getContext().getAssets();
        }
    }

    private Typeface lMd(com.bytedance.adsdk.lottie.KS.KS ks) {
        Typeface typeface;
        String zp = ks.zp();
        Typeface typeface2 = this.KS.get(zp);
        if (typeface2 != null) {
            return typeface2;
        }
        String KS = ks.KS();
        String lMd = ks.lMd();
        KS ks2 = this.COT;
        if (ks2 != null) {
            typeface = ks2.zp(zp, KS, lMd);
            if (typeface == null) {
                typeface = this.COT.zp(zp);
            }
        } else {
            typeface = null;
        }
        KS ks3 = this.COT;
        if (ks3 != null && typeface == null) {
            String lMd2 = ks3.lMd(zp, KS, lMd);
            if (lMd2 == null) {
                lMd2 = this.COT.lMd(zp);
            }
            if (lMd2 != null) {
                try {
                    typeface = Typeface.createFromAsset(this.jU, lMd2);
                } catch (Throwable unused) {
                    typeface = Typeface.DEFAULT;
                }
            }
        }
        if (ks.jU() != null) {
            return ks.jU();
        }
        if (typeface == null) {
            try {
                typeface = Typeface.createFromAsset(this.jU, "fonts/" + zp + this.HWF);
            } catch (Throwable unused2) {
                typeface = Typeface.DEFAULT;
            }
        }
        this.KS.put(zp, typeface);
        return typeface;
    }

    public void zp(KS ks) {
        this.COT = ks;
    }

    public void zp(String str) {
        this.HWF = str;
    }

    public Typeface zp(com.bytedance.adsdk.lottie.KS.KS ks) {
        this.zp.zp(ks.zp(), ks.KS());
        Typeface typeface = this.lMd.get(this.zp);
        if (typeface != null) {
            return typeface;
        }
        Typeface zp = zp(lMd(ks), ks.KS());
        this.lMd.put(this.zp, zp);
        return zp;
    }

    private Typeface zp(Typeface typeface, String str) {
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        int i9 = (contains && contains2) ? 3 : contains ? 2 : contains2 ? 1 : 0;
        return typeface.getStyle() == i9 ? typeface : Typeface.create(typeface, i9);
    }
}

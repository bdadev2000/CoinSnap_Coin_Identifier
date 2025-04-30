package com.bytedance.adsdk.lottie.lMd;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.bytedance.adsdk.lottie.HWF.HWF;
import com.bytedance.adsdk.lottie.YW;
import com.bytedance.adsdk.lottie.jU;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public class lMd {
    private static final Object zp = new Object();
    private final Map<String, YW> COT;
    private final String KS;
    private jU jU;
    private final Context lMd;

    public lMd(Drawable.Callback callback, String str, jU jUVar, Map<String, YW> map) {
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            this.KS = str.concat("/");
        } else {
            this.KS = str;
        }
        this.COT = map;
        zp(jUVar);
        if (!(callback instanceof View)) {
            this.lMd = null;
        } else {
            this.lMd = ((View) callback).getContext().getApplicationContext();
        }
    }

    private Bitmap lMd(String str, Bitmap bitmap) {
        synchronized (zp) {
            this.COT.get(str).zp(bitmap);
        }
        return bitmap;
    }

    public void zp(jU jUVar) {
        this.jU = jUVar;
    }

    public Bitmap zp(String str, Bitmap bitmap) {
        if (bitmap == null) {
            YW yw = this.COT.get(str);
            Bitmap HWF = yw.HWF();
            yw.zp(null);
            return HWF;
        }
        Bitmap HWF2 = this.COT.get(str).HWF();
        lMd(str, bitmap);
        return HWF2;
    }

    public Bitmap zp(String str) {
        YW yw = this.COT.get(str);
        if (yw == null) {
            return null;
        }
        Bitmap HWF = yw.HWF();
        if (HWF != null) {
            return HWF;
        }
        jU jUVar = this.jU;
        if (jUVar != null) {
            return jUVar.zp(yw);
        }
        Context context = this.lMd;
        if (context == null) {
            return null;
        }
        String jU = yw.jU();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (jU.startsWith("data:") && jU.indexOf("base64,") > 0) {
            try {
                byte[] decode = Base64.decode(jU.substring(jU.indexOf(44) + 1), 0);
                return lMd(str, BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        try {
            if (!TextUtils.isEmpty(this.KS)) {
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(context.getAssets().open(this.KS + jU), null, options);
                    if (decodeStream == null) {
                        return null;
                    }
                    return lMd(str, HWF.zp(decodeStream, yw.zp(), yw.lMd()));
                } catch (IllegalArgumentException unused2) {
                    return null;
                }
            }
            throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
        } catch (IOException unused3) {
            return null;
        }
    }

    public boolean zp(Context context) {
        return (context == null && this.lMd == null) || this.lMd.equals(context);
    }
}

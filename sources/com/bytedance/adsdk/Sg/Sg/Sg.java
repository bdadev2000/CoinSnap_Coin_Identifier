package com.bytedance.adsdk.Sg.Sg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.bytedance.adsdk.Sg.AlY;
import com.bytedance.adsdk.Sg.nc;
import com.bytedance.adsdk.Sg.vc.vc;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public class Sg {
    private static final Object YFl = new Object();
    private AlY AlY;
    private final Context Sg;
    private final String tN;
    private final Map<String, nc> wN;

    public Sg(Drawable.Callback callback, String str, AlY alY, Map<String, nc> map) {
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            this.tN = str.concat("/");
        } else {
            this.tN = str;
        }
        this.wN = map;
        YFl(alY);
        if (!(callback instanceof View)) {
            this.Sg = null;
        } else {
            this.Sg = ((View) callback).getContext().getApplicationContext();
        }
    }

    private Bitmap Sg(String str, Bitmap bitmap) {
        synchronized (YFl) {
            this.wN.get(str).YFl(bitmap);
        }
        return bitmap;
    }

    public void YFl(AlY alY) {
        this.AlY = alY;
    }

    public Bitmap YFl(String str, Bitmap bitmap) {
        if (bitmap == null) {
            nc ncVar = this.wN.get(str);
            Bitmap nc2 = ncVar.nc();
            ncVar.YFl(null);
            return nc2;
        }
        Bitmap nc3 = this.wN.get(str).nc();
        Sg(str, bitmap);
        return nc3;
    }

    public Bitmap YFl(String str) {
        nc ncVar = this.wN.get(str);
        if (ncVar == null) {
            return null;
        }
        Bitmap nc2 = ncVar.nc();
        if (nc2 != null) {
            return nc2;
        }
        AlY alY = this.AlY;
        if (alY != null) {
            return alY.YFl(ncVar);
        }
        Context context = this.Sg;
        if (context == null) {
            return null;
        }
        String qsH = ncVar.qsH();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (qsH.startsWith("data:") && qsH.indexOf("base64,") > 0) {
            try {
                byte[] decode = Base64.decode(qsH.substring(qsH.indexOf(44) + 1), 0);
                return Sg(str, BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        try {
            if (!TextUtils.isEmpty(this.tN)) {
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(context.getAssets().open(this.tN + qsH), null, options);
                    if (decodeStream == null) {
                        return null;
                    }
                    return Sg(str, vc.YFl(decodeStream, ncVar.YFl(), ncVar.Sg()));
                } catch (IllegalArgumentException unused2) {
                    return null;
                }
            }
            throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
        } catch (IOException unused3) {
            return null;
        }
    }

    public boolean YFl(Context context) {
        return (context == null && this.Sg == null) || this.Sg.equals(context);
    }
}

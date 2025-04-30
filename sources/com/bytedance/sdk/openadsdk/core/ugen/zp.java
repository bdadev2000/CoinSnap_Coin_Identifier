package com.bytedance.sdk.openadsdk.core.ugen;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.zp;
import com.bytedance.sdk.component.COT.Bj;
import com.bytedance.sdk.component.COT.KVG;
import com.bytedance.sdk.component.COT.ku;
import com.bytedance.sdk.openadsdk.HWF.jU;
import com.bytedance.sdk.openadsdk.core.widget.GifView;
import com.bytedance.sdk.openadsdk.utils.tG;

/* loaded from: classes.dex */
public class zp implements com.bytedance.adsdk.ugeno.zp {
    @Override // com.bytedance.adsdk.ugeno.zp
    public void zp(Context context, String str, ImageView imageView) {
        if (imageView instanceof GifView) {
            final GifView gifView = (GifView) imageView;
            gifView.setAdjustViewBounds(true);
            gifView.setBackgroundColor(Color.parseColor("#00000000"));
            jU.zp(str).KS(3).zp(Bitmap.Config.RGB_565).zp(new KVG() { // from class: com.bytedance.sdk.openadsdk.core.ugen.zp.1
                @Override // com.bytedance.sdk.component.COT.KVG
                public void zp(int i9, String str2, Throwable th) {
                }

                @Override // com.bytedance.sdk.component.COT.KVG
                public void zp(Bj bj) {
                    try {
                        Object lMd = bj.lMd();
                        if (lMd instanceof byte[]) {
                            if (bj.COT()) {
                                gifView.zp((byte[]) lMd, false);
                                gifView.setRepeatConfig(true);
                            } else {
                                gifView.setImageDrawable(tG.zp((byte[]) lMd, 0));
                            }
                        }
                    } catch (Throwable th) {
                        zp(1002, "", th);
                    }
                }
            });
            return;
        }
        jU.zp(str).zp(imageView);
    }

    @Override // com.bytedance.adsdk.ugeno.zp
    public void zp(final Context context, String str, final float f9, final zp.InterfaceC0070zp interfaceC0070zp) {
        jU.zp(str).zp(new ku() { // from class: com.bytedance.sdk.openadsdk.core.ugen.zp.3
            @Override // com.bytedance.sdk.component.COT.ku
            public Bitmap zp(Bitmap bitmap) {
                float f10 = f9;
                if (f10 > 0.0f) {
                    return com.bytedance.sdk.component.adexpress.jU.zp.zp(context, bitmap, (int) f10);
                }
                return null;
            }
        }).zp(new KVG() { // from class: com.bytedance.sdk.openadsdk.core.ugen.zp.2
            @Override // com.bytedance.sdk.component.COT.KVG
            public void zp(int i9, String str2, Throwable th) {
            }

            @Override // com.bytedance.sdk.component.COT.KVG
            public void zp(Bj bj) {
                Object lMd = bj.lMd();
                if (lMd instanceof Bitmap) {
                    interfaceC0070zp.zp((Bitmap) lMd);
                }
            }
        });
    }
}

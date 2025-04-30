package com.bytedance.sdk.openadsdk.utils;

import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.Bj.zp.zp;

/* loaded from: classes.dex */
public class tG {

    /* loaded from: classes.dex */
    public interface zp {
        void zp();

        void zp(com.bytedance.sdk.openadsdk.Bj.zp.lMd lmd);
    }

    public static void zp(com.bytedance.sdk.openadsdk.Bj.zp zpVar, int i9, int i10, zp zpVar2, String str) {
        zp(zpVar, i9, i10, zpVar2, str, 0);
    }

    public static void zp(com.bytedance.sdk.openadsdk.Bj.zp zpVar, int i9, int i10, final zp zpVar2, String str, int i11) {
        com.bytedance.sdk.component.utils.tG.zp("splashLoadAd", " getImageBytes url ".concat(String.valueOf(zpVar)));
        com.bytedance.sdk.openadsdk.Bj.KS.zp().KS().zp(zpVar, new zp.InterfaceC0094zp() { // from class: com.bytedance.sdk.openadsdk.utils.tG.1
            @Override // com.bytedance.sdk.openadsdk.Bj.zp.zp.InterfaceC0094zp
            public void zp(String str2, com.bytedance.sdk.openadsdk.Bj.zp.lMd lmd) {
                zp zpVar3;
                if (lmd.jU() && (zpVar3 = zp.this) != null) {
                    zpVar3.zp(lmd);
                    return;
                }
                zp zpVar4 = zp.this;
                if (zpVar4 != null) {
                    zpVar4.zp();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.Bj.zp.zp.InterfaceC0094zp
            public void zp(int i12, String str2, Throwable th) {
                zp zpVar3 = zp.this;
                if (zpVar3 != null) {
                    zpVar3.zp();
                }
            }
        }, i9, i10, ImageView.ScaleType.CENTER_INSIDE, str, i11, null);
    }

    public static Drawable zp(byte[] bArr, int i9) {
        if (bArr != null && bArr.length > 0) {
            try {
                return new BitmapDrawable(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
            } catch (Throwable unused) {
                return new ColorDrawable(0);
            }
        }
        return new ColorDrawable(0);
    }
}

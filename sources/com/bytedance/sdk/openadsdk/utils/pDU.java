package com.bytedance.sdk.openadsdk.utils;

import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.lG.YFl.YFl;

/* loaded from: classes.dex */
public class pDU {

    /* loaded from: classes.dex */
    public interface YFl {
        void YFl();

        void YFl(com.bytedance.sdk.openadsdk.lG.YFl.Sg sg2);
    }

    public static void YFl(com.bytedance.sdk.openadsdk.lG.YFl yFl, int i10, int i11, YFl yFl2, String str) {
        YFl(yFl, i10, i11, yFl2, str, 0);
    }

    public static void YFl(com.bytedance.sdk.openadsdk.lG.YFl yFl, int i10, int i11, final YFl yFl2, String str, int i12) {
        com.bytedance.sdk.component.utils.YoT.YFl("splashLoadAd", " getImageBytes url ".concat(String.valueOf(yFl)));
        com.bytedance.sdk.openadsdk.lG.tN.YFl().tN().YFl(yFl, new YFl.InterfaceC0134YFl() { // from class: com.bytedance.sdk.openadsdk.utils.pDU.1
            @Override // com.bytedance.sdk.openadsdk.lG.YFl.YFl.InterfaceC0134YFl
            public void YFl(String str2, com.bytedance.sdk.openadsdk.lG.YFl.Sg sg2) {
                YFl yFl3;
                if (sg2.AlY() && (yFl3 = YFl.this) != null) {
                    yFl3.YFl(sg2);
                    return;
                }
                YFl yFl4 = YFl.this;
                if (yFl4 != null) {
                    yFl4.YFl();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.lG.YFl.YFl.InterfaceC0134YFl
            public void YFl(int i13, String str2, Throwable th2) {
                YFl yFl3 = YFl.this;
                if (yFl3 != null) {
                    yFl3.YFl();
                }
            }
        }, i10, i11, ImageView.ScaleType.CENTER_INSIDE, str, i12, null);
    }

    public static Drawable YFl(byte[] bArr, int i10) {
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

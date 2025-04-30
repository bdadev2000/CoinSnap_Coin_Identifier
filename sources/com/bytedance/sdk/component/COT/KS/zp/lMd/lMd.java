package com.bytedance.sdk.component.COT.KS.zp.lMd;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.COT.vwr;

/* loaded from: classes.dex */
public class lMd implements vwr {
    private com.bytedance.sdk.component.COT.KS.zp.KS<String, Bitmap> KS;
    private int lMd;
    private int zp;

    public lMd(int i9, int i10) {
        this.lMd = i9;
        this.zp = i10;
        this.KS = new com.bytedance.sdk.component.COT.KS.zp.KS<String, Bitmap>(i9) { // from class: com.bytedance.sdk.component.COT.KS.zp.lMd.lMd.1
            @Override // com.bytedance.sdk.component.COT.KS.zp.KS
            /* renamed from: zp, reason: merged with bridge method [inline-methods] */
            public int lMd(String str, Bitmap bitmap) {
                if (bitmap == null) {
                    return 0;
                }
                return lMd.zp(bitmap);
            }
        };
    }

    @Override // com.bytedance.sdk.component.COT.zp
    public boolean lMd(String str) {
        return this.KS.zp((com.bytedance.sdk.component.COT.KS.zp.KS<String, Bitmap>) str) != null;
    }

    @Override // com.bytedance.sdk.component.COT.zp
    public boolean zp(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            return false;
        }
        this.KS.zp(str, bitmap);
        return true;
    }

    @Override // com.bytedance.sdk.component.COT.zp
    public Bitmap zp(String str) {
        return this.KS.zp((com.bytedance.sdk.component.COT.KS.zp.KS<String, Bitmap>) str);
    }

    public static int zp(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getAllocationByteCount();
    }
}

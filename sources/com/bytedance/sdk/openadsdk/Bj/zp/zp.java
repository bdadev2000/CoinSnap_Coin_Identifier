package com.bytedance.sdk.openadsdk.Bj.zp;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.sdk.component.COT.Bj;
import com.bytedance.sdk.component.COT.ku;
import com.bytedance.sdk.openadsdk.HWF.jU;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;

/* loaded from: classes.dex */
public class zp {

    /* renamed from: com.bytedance.sdk.openadsdk.Bj.zp.zp$zp, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0094zp {
        void zp(int i9, String str, Throwable th);

        void zp(String str, lMd lmd);
    }

    public void zp(com.bytedance.sdk.openadsdk.Bj.zp zpVar, final InterfaceC0094zp interfaceC0094zp, int i9, int i10, ImageView.ScaleType scaleType, String str, final int i11, woN won) {
        jU.zp(zpVar.zp).zp(zpVar.lMd).zp(i9).lMd(i10).COT(WNy.jU(KVG.zp())).jU(WNy.KS(KVG.zp())).lMd(str).zp(Bitmap.Config.RGB_565).zp(scaleType).zp(!TextUtils.isEmpty(str)).zp(new ku() { // from class: com.bytedance.sdk.openadsdk.Bj.zp.zp.2
            @Override // com.bytedance.sdk.component.COT.ku
            public Bitmap zp(Bitmap bitmap) {
                if (i11 <= 0) {
                    return bitmap;
                }
                return com.bytedance.sdk.component.adexpress.jU.zp.zp(KVG.zp(), bitmap, i11);
            }
        }).zp(new com.bytedance.sdk.openadsdk.HWF.lMd(won, zpVar.zp, new com.bytedance.sdk.component.COT.KVG() { // from class: com.bytedance.sdk.openadsdk.Bj.zp.zp.1
            @Override // com.bytedance.sdk.component.COT.KVG
            public void zp(Bj bj) {
                zp.this.zp(bj, interfaceC0094zp);
            }

            @Override // com.bytedance.sdk.component.COT.KVG
            public void zp(int i12, String str2, Throwable th) {
                zp.this.zp(i12, str2, th, interfaceC0094zp);
            }
        }));
    }

    public void zp(Bj bj, InterfaceC0094zp interfaceC0094zp) {
        if (interfaceC0094zp != null) {
            Object lMd = bj.lMd();
            int zp = zp(bj);
            if (lMd instanceof byte[]) {
                interfaceC0094zp.zp(bj.zp(), new lMd((byte[]) lMd, zp));
                return;
            }
            if (lMd instanceof Bitmap) {
                interfaceC0094zp.zp(bj.zp(), new lMd((Bitmap) lMd, bj.KS() instanceof Bitmap ? (Bitmap) bj.KS() : null, zp));
            } else {
                interfaceC0094zp.zp(0, "not bitmap or gif result!", null);
            }
        }
    }

    private int zp(Bj bj) {
        Object obj;
        Map<String, String> jU = bj.jU();
        if (jU == null || (obj = jU.get(CampaignEx.JSON_KEY_IMAGE_SIZE)) == null || !(obj instanceof Integer)) {
            return 0;
        }
        return ((Integer) obj).intValue();
    }

    public void zp(int i9, String str, Throwable th, InterfaceC0094zp interfaceC0094zp) {
        if (interfaceC0094zp != null) {
            interfaceC0094zp.zp(i9, str, th);
        }
    }
}

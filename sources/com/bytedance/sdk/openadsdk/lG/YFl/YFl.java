package com.bytedance.sdk.openadsdk.lG.YFl;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.sdk.component.wN.eT;
import com.bytedance.sdk.component.wN.qsH;
import com.bytedance.sdk.component.wN.rkt;
import com.bytedance.sdk.openadsdk.NjR.AlY;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.utils.GS;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;

/* loaded from: classes.dex */
public class YFl {

    /* renamed from: com.bytedance.sdk.openadsdk.lG.YFl.YFl$YFl, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0134YFl {
        void YFl(int i10, String str, Throwable th2);

        void YFl(String str, Sg sg2);
    }

    public void YFl(com.bytedance.sdk.openadsdk.lG.YFl yFl, final InterfaceC0134YFl interfaceC0134YFl, int i10, int i11, ImageView.ScaleType scaleType, String str, final int i12, Wwa wwa) {
        AlY.YFl(yFl.YFl).YFl(yFl.Sg).YFl(i10).Sg(i11).wN(GS.AlY(lG.YFl())).AlY(GS.tN(lG.YFl())).Sg(str).YFl(Bitmap.Config.RGB_565).YFl(scaleType).YFl(!TextUtils.isEmpty(str)).YFl(new qsH() { // from class: com.bytedance.sdk.openadsdk.lG.YFl.YFl.2
            @Override // com.bytedance.sdk.component.wN.qsH
            public Bitmap YFl(Bitmap bitmap) {
                if (i12 <= 0) {
                    return bitmap;
                }
                return com.bytedance.sdk.component.adexpress.AlY.YFl.YFl(lG.YFl(), bitmap, i12);
            }
        }).YFl(new com.bytedance.sdk.openadsdk.NjR.Sg(wwa, yFl.YFl, new rkt() { // from class: com.bytedance.sdk.openadsdk.lG.YFl.YFl.1
            @Override // com.bytedance.sdk.component.wN.rkt
            public void YFl(eT eTVar) {
                YFl.this.YFl(eTVar, interfaceC0134YFl);
            }

            @Override // com.bytedance.sdk.component.wN.rkt
            public void YFl(int i13, String str2, Throwable th2) {
                YFl.this.YFl(i13, str2, th2, interfaceC0134YFl);
            }
        }));
    }

    public void YFl(eT eTVar, InterfaceC0134YFl interfaceC0134YFl) {
        if (interfaceC0134YFl != null) {
            Object Sg = eTVar.Sg();
            int YFl = YFl(eTVar);
            if (Sg instanceof byte[]) {
                interfaceC0134YFl.YFl(eTVar.YFl(), new Sg((byte[]) Sg, YFl));
                return;
            }
            if (Sg instanceof Bitmap) {
                interfaceC0134YFl.YFl(eTVar.YFl(), new Sg((Bitmap) Sg, eTVar.tN() instanceof Bitmap ? (Bitmap) eTVar.tN() : null, YFl));
            } else {
                interfaceC0134YFl.YFl(0, "not bitmap or gif result!", null);
            }
        }
    }

    private int YFl(eT eTVar) {
        Object obj;
        Map<String, String> AlY = eTVar.AlY();
        if (AlY == null || (obj = AlY.get(CampaignEx.JSON_KEY_IMAGE_SIZE)) == null || !(obj instanceof Integer)) {
            return 0;
        }
        return ((Integer) obj).intValue();
    }

    public void YFl(int i10, String str, Throwable th2, InterfaceC0134YFl interfaceC0134YFl) {
        if (interfaceC0134YFl != null) {
            interfaceC0134YFl.YFl(i10, str, th2);
        }
    }
}

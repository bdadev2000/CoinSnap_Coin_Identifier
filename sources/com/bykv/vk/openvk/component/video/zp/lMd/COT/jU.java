package com.bykv.vk.openvk.component.video.zp.lMd.COT;

import android.text.TextUtils;
import com.bytedance.sdk.component.lMd.zp.Bj;
import com.bytedance.sdk.component.lMd.zp.dQp;
import com.bytedance.sdk.component.lMd.zp.tG;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public class jU implements lMd {
    private Bj zp;

    public jU() {
        this.zp = null;
        this.zp = com.bykv.vk.openvk.component.video.api.KS.jU();
    }

    @Override // com.bykv.vk.openvk.component.video.zp.lMd.COT.lMd
    public zp zp(COT cot) throws IOException {
        tG.zp zpVar = new tG.zp();
        try {
            Map<String, String> map = cot.COT;
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (!TextUtils.isEmpty(key)) {
                        String value = entry.getValue();
                        if (value == null) {
                            value = "";
                        }
                        zpVar.lMd(key, value);
                    }
                }
            }
            dQp zp = this.zp.zp(zpVar.lMd(cot.lMd).zp().zp("videoPreloadLowVersion").zp(6).lMd()).zp();
            zp.KS();
            return new HWF(zp, cot);
        } catch (Throwable unused) {
            return null;
        }
    }
}

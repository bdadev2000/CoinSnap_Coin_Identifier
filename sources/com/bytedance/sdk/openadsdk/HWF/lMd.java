package com.bytedance.sdk.openadsdk.HWF;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.COT.Bj;
import com.bytedance.sdk.component.COT.KVG;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.utils.YhE;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class lMd<T> implements KVG<T> {
    private final KVG<T> KS;
    private final woN jU;
    private final String lMd;
    private final long zp = SystemClock.elapsedRealtime();

    public lMd(woN won, String str, KVG<T> kvg) {
        this.KS = kvg;
        this.jU = won;
        this.lMd = str;
    }

    @Override // com.bytedance.sdk.component.COT.KVG
    public void zp(Bj<T> bj) {
        KVG<T> kvg = this.KS;
        if (kvg != null) {
            kvg.zp(bj);
        }
        if (this.jU != null) {
            final long elapsedRealtime = SystemClock.elapsedRealtime() - this.zp;
            final int QR = bj.QR() / 1024;
            final int i9 = bj.HWF() ? 1 : 0;
            com.bytedance.sdk.openadsdk.dT.KS.zp("load_image_success", false, new com.bytedance.sdk.openadsdk.dT.lMd() { // from class: com.bytedance.sdk.openadsdk.HWF.lMd.1
                @Override // com.bytedance.sdk.openadsdk.dT.lMd
                @Nullable
                public com.bytedance.sdk.openadsdk.dT.zp.lMd getLogStats() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", elapsedRealtime);
                    jSONObject.put("url", lMd.this.lMd);
                    jSONObject.put("preload_size", QR);
                    jSONObject.put("local_cache", i9);
                    jSONObject.put("image_mode", lMd.this.jU.mW());
                    return com.bytedance.sdk.openadsdk.dT.zp.KS.lMd().zp("load_image_success").zp(lMd.this.jU.WJ()).lMd(jSONObject.toString());
                }
            });
        }
    }

    @Override // com.bytedance.sdk.component.COT.KVG
    public void zp(final int i9, final String str, @Nullable Throwable th) {
        KVG<T> kvg = this.KS;
        if (kvg != null) {
            kvg.zp(i9, str, th);
        }
        woN won = this.jU;
        if (won == null || TextUtils.isEmpty(YhE.zp(won))) {
            return;
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime() - this.zp;
        com.bytedance.sdk.openadsdk.dT.KS.zp("load_image_error", false, new com.bytedance.sdk.openadsdk.dT.lMd() { // from class: com.bytedance.sdk.openadsdk.HWF.lMd.2
            @Override // com.bytedance.sdk.openadsdk.dT.lMd
            @Nullable
            public com.bytedance.sdk.openadsdk.dT.zp.lMd getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", elapsedRealtime);
                jSONObject.put("url", lMd.this.lMd);
                jSONObject.put("error_code", i9);
                jSONObject.put("error_message", str);
                jSONObject.put("image_mode", lMd.this.jU.mW());
                return com.bytedance.sdk.openadsdk.dT.zp.KS.lMd().zp("load_image_error").zp(lMd.this.jU.WJ()).lMd(jSONObject.toString());
            }
        });
    }
}

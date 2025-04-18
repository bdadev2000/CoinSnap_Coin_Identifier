package com.bytedance.sdk.openadsdk.NjR;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.wN.eT;
import com.bytedance.sdk.component.wN.rkt;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.utils.Sco;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Sg<T> implements rkt<T> {
    private final Wwa AlY;
    private final String Sg;
    private final long YFl = SystemClock.elapsedRealtime();
    private final rkt<T> tN;

    public Sg(Wwa wwa, String str, rkt<T> rktVar) {
        this.tN = rktVar;
        this.AlY = wwa;
        this.Sg = str;
    }

    @Override // com.bytedance.sdk.component.wN.rkt
    public void YFl(eT<T> eTVar) {
        rkt<T> rktVar = this.tN;
        if (rktVar != null) {
            rktVar.YFl(eTVar);
        }
        if (this.AlY != null) {
            final long elapsedRealtime = SystemClock.elapsedRealtime() - this.YFl;
            final int DSW = eTVar.DSW() / LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            final int i10 = eTVar.vc() ? 1 : 0;
            com.bytedance.sdk.openadsdk.pDU.tN.YFl("load_image_success", false, new com.bytedance.sdk.openadsdk.pDU.Sg() { // from class: com.bytedance.sdk.openadsdk.NjR.Sg.1
                @Override // com.bytedance.sdk.openadsdk.pDU.Sg
                @Nullable
                public com.bytedance.sdk.openadsdk.pDU.YFl.tN getLogStats() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", elapsedRealtime);
                    jSONObject.put("url", Sg.this.Sg);
                    jSONObject.put("preload_size", DSW);
                    jSONObject.put("local_cache", i10);
                    jSONObject.put("image_mode", Sg.this.AlY.ZLB());
                    return com.bytedance.sdk.openadsdk.pDU.YFl.AlY.Sg().YFl("load_image_success").YFl(Sg.this.AlY.JGG()).Sg(jSONObject.toString());
                }
            });
        }
    }

    @Override // com.bytedance.sdk.component.wN.rkt
    public void YFl(final int i10, final String str, @Nullable Throwable th2) {
        rkt<T> rktVar = this.tN;
        if (rktVar != null) {
            rktVar.YFl(i10, str, th2);
        }
        Wwa wwa = this.AlY;
        if (wwa == null || TextUtils.isEmpty(Sco.YFl(wwa))) {
            return;
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime() - this.YFl;
        com.bytedance.sdk.openadsdk.pDU.tN.YFl("load_image_error", false, new com.bytedance.sdk.openadsdk.pDU.Sg() { // from class: com.bytedance.sdk.openadsdk.NjR.Sg.2
            @Override // com.bytedance.sdk.openadsdk.pDU.Sg
            @Nullable
            public com.bytedance.sdk.openadsdk.pDU.YFl.tN getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", elapsedRealtime);
                jSONObject.put("url", Sg.this.Sg);
                jSONObject.put("error_code", i10);
                jSONObject.put("error_message", str);
                jSONObject.put("image_mode", Sg.this.AlY.ZLB());
                return com.bytedance.sdk.openadsdk.pDU.YFl.AlY.Sg().YFl("load_image_error").YFl(Sg.this.AlY.JGG()).Sg(jSONObject.toString());
            }
        });
    }
}

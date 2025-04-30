package com.bytedance.sdk.openadsdk.Bj;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.sdk.component.QR.zp;
import com.bytedance.sdk.component.lMd.zp.jU;
import com.bytedance.sdk.component.lMd.zp.zp.zp.YW;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.model.rV;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.settings.dQp;
import com.bytedance.sdk.openadsdk.utils.QUv;
import com.bytedance.sdk.openadsdk.utils.WNy;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class KS {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile KS zp;
    private final com.bytedance.sdk.component.QR.zp KS;
    private com.bytedance.sdk.openadsdk.Bj.zp.KS jU;
    private final Context lMd;

    private KS(Context context) {
        Context applicationContext;
        if (context == null) {
            applicationContext = KVG.zp();
        } else {
            applicationContext = context.getApplicationContext();
        }
        this.lMd = applicationContext;
        zp.C0077zp c0077zp = new zp.C0077zp();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        com.bytedance.sdk.component.QR.zp zp2 = c0077zp.zp(10000L, timeUnit).lMd(10000L, timeUnit).KS(10000L, timeUnit).zp(true).zp();
        this.KS = zp2;
        com.bytedance.sdk.component.lMd.zp.zp.zp.zp.zp(new YW() { // from class: com.bytedance.sdk.openadsdk.Bj.KS.1
            @Override // com.bytedance.sdk.component.lMd.zp.zp.zp.YW
            public boolean lMd() {
                return dQp.etV().RRQ();
            }

            @Override // com.bytedance.sdk.component.lMd.zp.zp.zp.YW
            public ExecutorService zp() {
                if (dQp.etV().RRQ()) {
                    return QUv.YW();
                }
                return null;
            }
        });
        jU zp3 = zp2.COT().zp();
        if (zp3 != null) {
            zp3.zp(32);
        }
    }

    private void jU() {
        if (this.jU == null) {
            this.jU = new com.bytedance.sdk.openadsdk.Bj.zp.KS();
        }
    }

    public static KS zp() {
        if (zp == null) {
            synchronized (KS.class) {
                try {
                    if (zp == null) {
                        zp = new KS(KVG.zp());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zp;
    }

    public com.bytedance.sdk.openadsdk.Bj.zp.KS KS() {
        jU();
        return this.jU;
    }

    public com.bytedance.sdk.component.QR.zp lMd() {
        return this.KS;
    }

    public void zp(String str, int i9, int i10, ImageView imageView, woN won) {
        com.bytedance.sdk.openadsdk.HWF.jU.zp(str).zp(i9).lMd(i10).COT(WNy.jU(KVG.zp())).jU(WNy.KS(KVG.zp())).KS(2).zp(com.bytedance.sdk.openadsdk.HWF.KS.zp(won, str, imageView));
    }

    public void zp(int i9, final ImageView imageView, final woN won) {
        com.bytedance.sdk.openadsdk.HWF.jU.zp(won.COT()).zp(i9).lMd(i9).COT(WNy.jU(KVG.zp())).jU(WNy.KS(KVG.zp())).KS(2).zp(com.bytedance.sdk.openadsdk.HWF.KS.zp(won, won.COT(), imageView));
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.Bj.KS.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (imageView.getDrawable() != null) {
                        Intent intent = new Intent();
                        String HWF = won.HWF();
                        intent.setAction("android.intent.action.VIEW");
                        intent.setData(Uri.parse(HWF));
                        try {
                            com.bytedance.sdk.component.utils.lMd.zp(KVG.zp(), intent, null);
                        } catch (Exception unused) {
                        }
                    }
                }
            });
        }
    }

    public void zp(rV rVVar, ImageView imageView, woN won) {
        if (rVVar == null || TextUtils.isEmpty(rVVar.zp()) || imageView == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.HWF.jU.zp(rVVar).KS(2).zp(com.bytedance.sdk.openadsdk.HWF.KS.zp(won, rVVar.zp(), imageView));
    }
}

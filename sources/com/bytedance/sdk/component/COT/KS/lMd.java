package com.bytedance.sdk.component.COT.KS;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.COT.KS.KS;
import com.bytedance.sdk.component.COT.dQp;
import com.bytedance.sdk.component.COT.dT;
import com.bytedance.sdk.component.COT.pvr;
import com.bytedance.sdk.component.COT.tG;
import com.bytedance.sdk.openadsdk.ats.ATS;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;

@ATS(single = true, value = {"img_service"})
/* loaded from: classes.dex */
public class lMd implements dQp {
    private volatile HWF zp;

    private lMd() {
    }

    private void lMd(Context context, tG tGVar) {
        if (this.zp != null) {
            Log.w("ImageLoader", "already init!");
        }
        if (tGVar == null) {
            tGVar = COT.zp(context);
        }
        this.zp = new HWF(context, tGVar);
    }

    public static dQp zp(Context context, tG tGVar) {
        lMd lmd = new lMd();
        lmd.lMd(context, tGVar);
        return lmd;
    }

    @Override // com.bytedance.sdk.component.COT.dQp
    public dT zp(String str) {
        return new KS.lMd(this.zp).KS(str);
    }

    @Override // com.bytedance.sdk.component.COT.dQp
    public InputStream zp(String str, String str2) {
        if (this.zp != null) {
            if (TextUtils.isEmpty(str2)) {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                str2 = com.bytedance.sdk.component.COT.KS.KS.KS.zp(str);
            }
            Collection<pvr> lMd = this.zp.lMd();
            if (lMd != null) {
                Iterator<pvr> it = lMd.iterator();
                while (it.hasNext()) {
                    byte[] zp = it.next().zp(str2);
                    if (zp != null) {
                        return new ByteArrayInputStream(zp);
                    }
                }
            }
            Collection<com.bytedance.sdk.component.COT.KS> KS = this.zp.KS();
            if (KS != null) {
                Iterator<com.bytedance.sdk.component.COT.KS> it2 = KS.iterator();
                while (it2.hasNext()) {
                    InputStream zp2 = it2.next().zp(str2);
                    if (zp2 != null) {
                        return zp2;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.COT.dQp
    public boolean zp(String str, String str2, String str3) {
        if (this.zp == null || TextUtils.isEmpty(str3)) {
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            str2 = com.bytedance.sdk.component.COT.KS.KS.KS.zp(str);
        }
        com.bytedance.sdk.component.COT.KS zp = this.zp.zp(str3);
        if (zp != null) {
            return zp.lMd(str2);
        }
        return false;
    }
}

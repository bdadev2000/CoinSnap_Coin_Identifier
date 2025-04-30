package com.bykv.vk.openvk.component.video.zp.lMd;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import com.bykv.vk.openvk.component.video.zp.lMd.zp.KS;
import com.bytedance.sdk.component.utils.tG;
import java.util.Set;

/* loaded from: classes.dex */
public class COT {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile Context Bj;
    static volatile boolean HWF;
    public static volatile Integer YW;
    private static volatile com.bykv.vk.openvk.component.video.zp.lMd.lMd.KS dT;
    public static volatile boolean jU;
    static volatile com.bykv.vk.openvk.component.video.zp.lMd.zp.KS lMd;
    static volatile com.bykv.vk.openvk.component.video.zp.lMd.zp.lMd zp;
    public static final boolean KS = tG.jU();
    static volatile boolean COT = true;
    static volatile int QR = 0;
    public static volatile int ku = 3;

    public static com.bykv.vk.openvk.component.video.zp.lMd.zp.lMd KS() {
        return zp;
    }

    public static void lMd(boolean z8) {
        HWF = z8;
    }

    public static Context zp() {
        return Bj;
    }

    public static com.bykv.vk.openvk.component.video.zp.lMd.zp.KS lMd() {
        return lMd;
    }

    public static void zp(boolean z8) {
        COT = z8;
    }

    public static void zp(int i9) {
        QR = i9;
    }

    public static void zp(com.bykv.vk.openvk.component.video.zp.lMd.zp.KS ks, Context context) {
        if (ks != null && context != null) {
            Bj = context.getApplicationContext();
            if (lMd != null) {
                return;
            }
            if (zp == null) {
                lMd = ks;
                dT = com.bykv.vk.openvk.component.video.zp.lMd.lMd.KS.zp(context);
                lMd.zp(new KS.zp() { // from class: com.bykv.vk.openvk.component.video.zp.lMd.COT.1
                    @Override // com.bykv.vk.openvk.component.video.zp.lMd.zp.KS.zp
                    public void zp(String str) {
                        if (COT.KS) {
                            Log.i("TAG_PROXY_DiskLruCache", "new cache created: ".concat(String.valueOf(str)));
                        }
                    }

                    @Override // com.bykv.vk.openvk.component.video.zp.lMd.zp.KS.zp
                    public void zp(Set<String> set) {
                        COT.dT.zp(set, 0);
                        if (COT.KS) {
                            Log.i("TAG_PROXY_DiskLruCache", "cache file removed, ".concat(String.valueOf(set)));
                        }
                    }
                });
                HWF zp2 = HWF.zp();
                zp2.zp(ks);
                zp2.zp(dT);
                jU KS2 = jU.KS();
                KS2.zp(ks);
                KS2.zp(dT);
                return;
            }
            throw null;
        }
        throw new IllegalArgumentException("DiskLruCache and Context can't be null !!!");
    }
}

package com.bykv.vk.openvk.component.video.zp.zp.lMd;

import android.content.Context;
import com.bykv.vk.openvk.component.video.api.COT.zp;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class KS {
    public static final ConcurrentHashMap<String, lMd> zp = new ConcurrentHashMap<>();

    public static synchronized void zp(Context context, com.bykv.vk.openvk.component.video.api.KS.KS ks, zp.InterfaceC0049zp interfaceC0049zp) {
        synchronized (KS.class) {
            if (ks == null) {
                return;
            }
            try {
                ConcurrentHashMap<String, lMd> concurrentHashMap = zp;
                lMd lmd = concurrentHashMap.get(ks.rV());
                if (lmd == null) {
                    lmd = new lMd(context, ks);
                    concurrentHashMap.put(ks.rV(), lmd);
                    ks.KS();
                    ks.rV();
                }
                lmd.zp(interfaceC0049zp);
                ks.KS();
                ks.rV();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized void zp(com.bykv.vk.openvk.component.video.api.KS.KS ks) {
        synchronized (KS.class) {
            try {
                lMd remove = zp.remove(ks.rV());
                if (remove != null) {
                    remove.zp(true);
                }
                ks.KS();
                ks.rV();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

package com.bytedance.sdk.component.QR.KS;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes.dex */
public class ku {
    private static HashMap<Integer, zp> KS;
    private static HashMap<Integer, HWF> lMd;
    private static volatile ku zp;

    private ku() {
        lMd = new HashMap<>();
        KS = new HashMap<>();
    }

    public static synchronized ku zp() {
        ku kuVar;
        synchronized (ku.class) {
            try {
                if (zp == null) {
                    synchronized (ku.class) {
                        try {
                            if (zp == null) {
                                zp = new ku();
                            }
                        } finally {
                        }
                    }
                }
                kuVar = zp;
            } catch (Throwable th) {
                throw th;
            }
        }
        return kuVar;
    }

    public HWF zp(int i9) {
        HWF hwf = lMd.get(Integer.valueOf(i9));
        if (hwf != null) {
            return hwf;
        }
        HWF hwf2 = new HWF(i9);
        lMd.put(Integer.valueOf(i9), hwf2);
        return hwf2;
    }

    public zp zp(int i9, Context context) {
        zp zpVar = KS.get(Integer.valueOf(i9));
        if (zpVar != null) {
            return zpVar;
        }
        zp zpVar2 = new zp(context, i9);
        KS.put(Integer.valueOf(i9), zpVar2);
        return zpVar2;
    }
}

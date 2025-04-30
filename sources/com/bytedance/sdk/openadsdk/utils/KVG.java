package com.bytedance.sdk.openadsdk.utils;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class KVG {
    public static final long zp = zp(0.05f);

    private static void lMd(final long j7, final String str) {
        QUv.lMd(new com.bytedance.sdk.component.ku.ku("isMemoryEnough") { // from class: com.bytedance.sdk.openadsdk.utils.KVG.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("scene", str);
                    jSONObject.put("mem_size", j7);
                    com.bytedance.sdk.openadsdk.dT.KS.zp().zp("dynamic_mem_not_enough", jSONObject);
                } catch (Exception e4) {
                    com.bytedance.sdk.component.utils.tG.zp("MemoryUtils", "run: ", e4);
                }
            }
        }, 5);
    }

    public static long zp(float f9) {
        return Double.valueOf(f9 * ((float) Runtime.getRuntime().maxMemory())).longValue();
    }

    public static boolean zp(long j7, String str) {
        if (!com.bytedance.sdk.openadsdk.core.KVG.jU().tG() || Runtime.getRuntime().maxMemory() - (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) >= j7) {
            return true;
        }
        lMd(j7, str);
        return false;
    }

    public static int zp() {
        try {
            int maxMemory = (int) (Runtime.getRuntime().maxMemory() / 33554432);
            if (maxMemory <= 2) {
                return 2;
            }
            if (maxMemory >= 5) {
                return 5;
            }
            return maxMemory;
        } catch (Throwable unused) {
            return 2;
        }
    }
}

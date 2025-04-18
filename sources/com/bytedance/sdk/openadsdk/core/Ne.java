package com.bytedance.sdk.openadsdk.core;

import android.os.Build;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.vungle.ads.internal.signals.j;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Ne {
    private static final AtomicInteger AlY;
    private static final AtomicInteger Sg;
    private static final AtomicInteger YFl;
    private static final AtomicInteger tN;

    static {
        AtomicInteger atomicInteger = new AtomicInteger();
        YFl = atomicInteger;
        AtomicInteger atomicInteger2 = new AtomicInteger();
        Sg = atomicInteger2;
        AtomicInteger atomicInteger3 = new AtomicInteger();
        tN = atomicInteger3;
        AtomicInteger atomicInteger4 = new AtomicInteger();
        AlY = atomicInteger4;
        atomicInteger.addAndGet(com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("encrypt_statistics_file", "encrypt_success_count", 0));
        atomicInteger2.addAndGet(com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("encrypt_statistics_file", "encrypt_fail_count", 0));
        atomicInteger3.addAndGet(com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("encrypt_statistics_file", "decrypt_success_count", 0));
        atomicInteger4.addAndGet(com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("encrypt_statistics_file", "decrypt_fail_count", 0));
    }

    private static void Sg() {
        final int i10 = YFl.get();
        final int i11 = Sg.get();
        final int i12 = tN.get();
        final int i13 = AlY.get();
        com.bytedance.sdk.openadsdk.pDU.tN.YFl("crypt_v4_statistics", false, new com.bytedance.sdk.openadsdk.pDU.Sg() { // from class: com.bytedance.sdk.openadsdk.core.Ne.1
            @Override // com.bytedance.sdk.openadsdk.pDU.Sg
            @Nullable
            public com.bytedance.sdk.openadsdk.pDU.YFl.tN getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("encrypt_success_count", i10);
                    jSONObject.put("encrypt_fail_count", i11);
                    jSONObject.put("decrypt_success_count", i12);
                    jSONObject.put("decrypt_fail_count", i13);
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.pDU.YFl.AlY.Sg().YFl("crypt_v4_statistics").Sg(jSONObject.toString());
            }
        });
    }

    public static void YFl() {
        try {
            long YFl2 = com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("encrypt_statistics_file", "upload_time_key", 0L);
            if (YFl2 <= 0 || System.currentTimeMillis() - YFl2 < j.TWENTY_FOUR_HOURS_MILLIS) {
                if (YFl2 <= 0 || YFl2 > System.currentTimeMillis()) {
                    com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("encrypt_statistics_file", "upload_time_key", Long.valueOf(System.currentTimeMillis()));
                    return;
                }
                return;
            }
            Sg();
            synchronized (Ne.class) {
                YFl.set(0);
                Sg.set(0);
                tN.set(0);
                AlY.set(0);
                com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("encrypt_statistics_file");
                com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("encrypt_statistics_file", "upload_time_key", Long.valueOf(System.currentTimeMillis()));
            }
        } catch (Throwable unused) {
        }
    }

    public static synchronized void Sg(boolean z10) {
        synchronized (Ne.class) {
            if (z10) {
                com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("encrypt_statistics_file", "encrypt_success_count", Integer.valueOf(YFl.incrementAndGet()));
            } else {
                com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("encrypt_statistics_file", "encrypt_fail_count", Integer.valueOf(Sg.incrementAndGet()));
            }
        }
    }

    public static void YFl(final int i10, final PangleEncryptConstant.CryptDataScene cryptDataScene, final int i11) {
        com.bytedance.sdk.openadsdk.pDU.tN.YFl("crypt_v4_fail", false, new com.bytedance.sdk.openadsdk.pDU.Sg() { // from class: com.bytedance.sdk.openadsdk.core.Ne.2
            @Override // com.bytedance.sdk.openadsdk.pDU.Sg
            @Nullable
            public com.bytedance.sdk.openadsdk.pDU.YFl.tN getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("crypt", i10);
                    jSONObject.put("scene", cryptDataScene.value());
                    jSONObject.put("reason", i11);
                    if (i11 == 6) {
                        jSONObject.put("model", Build.MODEL);
                        jSONObject.put("vendor", Build.MANUFACTURER);
                    }
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.pDU.YFl.AlY.Sg().YFl("crypt_v4_fail").Sg(jSONObject.toString());
            }
        });
    }

    public static synchronized void YFl(boolean z10) {
        synchronized (Ne.class) {
            if (z10) {
                com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("encrypt_statistics_file", "decrypt_success_count", Integer.valueOf(tN.incrementAndGet()));
            } else {
                com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("encrypt_statistics_file", "decrypt_fail_count", Integer.valueOf(tN.incrementAndGet()));
            }
        }
    }

    public static void YFl(JSONObject jSONObject) {
        Sg(jSONObject != null && jSONObject.optInt("cypher") == 4);
    }
}

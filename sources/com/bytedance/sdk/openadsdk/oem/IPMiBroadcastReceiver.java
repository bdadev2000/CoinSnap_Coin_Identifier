package com.bytedance.sdk.openadsdk.oem;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import android.util.LruCache;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.qsH.qsH;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.openadsdk.AlY.tN;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.model.wXo;
import com.bytedance.sdk.openadsdk.core.pDU;
import com.bytedance.sdk.openadsdk.utils.Sco;
import com.bytedance.sdk.openadsdk.utils.mn;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class IPMiBroadcastReceiver extends BroadcastReceiver {
    private static volatile IPMiBroadcastReceiver YFl;
    private int AlY = 0;
    private final LruCache<String, Wwa> Sg;
    private YFl tN;

    private IPMiBroadcastReceiver() {
        int i10 = 10;
        int YFl2 = com.bytedance.sdk.openadsdk.aIu.YFl.YFl("ip_data_config", "ip_ad_cache_count", 10);
        if (YFl2 > 0 && YFl2 <= 200) {
            i10 = YFl2;
        }
        this.Sg = new LruCache<>(i10);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, final Intent intent) {
        if ("com.xiaomi.market.DOWNLOAD_INSTALL_RESULT".equals(intent.getAction())) {
            mn.tN(new qsH("ip-mi") { // from class: com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver.1
                @Override // java.lang.Runnable
                public void run() {
                    final int i10;
                    final int i11;
                    final int i12;
                    try {
                        final int intExtra = intent.getIntExtra("errorCode", 0);
                        if (intExtra < 0) {
                            int intExtra2 = intent.getIntExtra("reason", 0);
                            if (intExtra == -4 && intExtra2 == -1) {
                                return;
                            } else {
                                i10 = intExtra2;
                            }
                        } else {
                            i10 = 0;
                        }
                        if (intExtra == 5) {
                            i11 = intent.getIntExtra(NotificationCompat.CATEGORY_STATUS, 0);
                            if (i11 == -2) {
                                try {
                                    i12 = intent.getIntExtra(NotificationCompat.CATEGORY_PROGRESS, 0);
                                } catch (Throwable unused) {
                                    IPMiBroadcastReceiver.this.AlY = 1;
                                    i12 = 0;
                                }
                                if (i12 < 100) {
                                    return;
                                }
                            } else {
                                i12 = 0;
                            }
                        } else {
                            i11 = 0;
                            i12 = 0;
                        }
                        String stringExtra = intent.getStringExtra("packageName");
                        YFl yFl = IPMiBroadcastReceiver.this.tN;
                        if (intExtra > 0 && yFl != null) {
                            yFl.YFl(stringExtra, intExtra);
                        }
                        Wwa YFl2 = IPMiBroadcastReceiver.this.YFl(stringExtra);
                        YoT.YFl("IPMiBroadcastReceiver", "err_code=", Integer.valueOf(intExtra), " reason=", Integer.valueOf(i10), " status=", Integer.valueOf(i11), " progress=", Integer.valueOf(i12));
                        if (YFl2 != null) {
                            tN.YFl(System.currentTimeMillis(), YFl2, Sco.YFl(YFl2), "ip_listener_log", new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver.1.1
                                @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
                                public JSONObject YFl() {
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        JSONObject jSONObject2 = new JSONObject();
                                        JSONObject jSONObject3 = new JSONObject();
                                        jSONObject3.put("ip_error_code", intExtra);
                                        int i13 = intExtra;
                                        if (i13 > 0) {
                                            if (i13 == 5) {
                                                jSONObject3.put("ip_status", i11);
                                                jSONObject3.put("ip_exec_type", IPMiBroadcastReceiver.this.AlY);
                                            }
                                            if (i11 == -2) {
                                                jSONObject3.put("ip_progress", i12);
                                            }
                                        }
                                        if (intExtra < 0) {
                                            jSONObject3.put("ip_reason", i10);
                                        }
                                        jSONObject2.put("pag_json_data", jSONObject3.toString());
                                        jSONObject.put("ad_extra_data", jSONObject2);
                                    } catch (Throwable th2) {
                                        YoT.YFl("IPMiBroadcastReceiver", th2.getMessage());
                                    }
                                    return jSONObject;
                                }
                            });
                        }
                    } catch (Throwable th2) {
                        YoT.YFl("IPMiBroadcastReceiver", th2.getMessage());
                    }
                }
            });
        }
    }

    public void YFl(String str, Wwa wwa) {
        if (TextUtils.isEmpty(str) || wwa == null || this.Sg.get(str) != null) {
            return;
        }
        this.Sg.put(str, wwa);
    }

    public Wwa YFl(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.Sg.get(str);
    }

    public void YFl(YFl yFl) {
        this.tN = yFl;
    }

    public void YFl() {
        this.tN = null;
    }

    public static IPMiBroadcastReceiver YFl(Context context) {
        int YFl2 = com.bytedance.sdk.openadsdk.aIu.YFl.YFl("ip_data_config", "ip_link_listener", 0);
        YoT.YFl("IPMiBroadcastReceiver", "open =", Integer.valueOf(YFl2));
        if (YFl2 == 0) {
            return null;
        }
        if (YFl == null) {
            synchronized (IPMiBroadcastReceiver.class) {
                if (YFl == null) {
                    YFl = new IPMiBroadcastReceiver();
                    IntentFilter intentFilter = new IntentFilter("com.xiaomi.market.DOWNLOAD_INSTALL_RESULT");
                    if (Build.VERSION.SDK_INT >= 34 && Sco.nc(context) >= 34) {
                        context.registerReceiver(YFl, intentFilter, 2);
                    } else {
                        context.registerReceiver(YFl, intentFilter);
                    }
                }
            }
        }
        return YFl;
    }

    public static void YFl(final Context context, Wwa wwa) {
        wXo AXS;
        if (YFl == null && wwa != null && (AXS = wwa.AXS()) != null && AXS.YFl()) {
            pDU.Sg().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        IPMiBroadcastReceiver.YFl(lG.YFl(context));
                    } catch (Throwable th2) {
                        YoT.YFl("IPMiBroadcastReceiver", th2.getMessage());
                    }
                }
            });
        }
    }
}

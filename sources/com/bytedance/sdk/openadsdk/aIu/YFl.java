package com.bytedance.sdk.openadsdk.aIu;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.Ne;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.openadsdk.core.NjR;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.pDU;
import com.bytedance.sdk.openadsdk.utils.Sco;
import com.bytedance.sdk.openadsdk.utils.mn;
import com.bytedance.sdk.openadsdk.wXo.AlY;
import com.bytedance.sdk.openadsdk.wXo.tN;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.Command;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class YFl {
    private static volatile tN Sg;
    public static final ConcurrentHashMap<String, Object> YFl = new ConcurrentHashMap<>();

    private static tN Sg() {
        return YFl(lG.YFl(), NjR.Sg().AlY());
    }

    public static tN YFl(final Context context, final String str) {
        if (Sg == null) {
            synchronized (YFl.class) {
                if (Sg == null) {
                    try {
                        tN tNVar = new tN(new AlY() { // from class: com.bytedance.sdk.openadsdk.aIu.YFl.1
                            @Override // com.bytedance.sdk.openadsdk.wXo.AlY
                            public Handler AlY() {
                                return pDU.Sg();
                            }

                            @Override // com.bytedance.sdk.openadsdk.wXo.AlY
                            public Map<String, String> DSW() {
                                HashMap hashMap = new HashMap();
                                hashMap.put(Command.HTTP_HEADER_USER_AGENT, Sco.tN());
                                return hashMap;
                            }

                            @Override // com.bytedance.sdk.openadsdk.wXo.AlY
                            public Context Sg() {
                                Context context2 = context;
                                if (context2 != null) {
                                    return context2;
                                }
                                return lG.YFl();
                            }

                            @Override // com.bytedance.sdk.openadsdk.wXo.AlY
                            public ExecutorService YFl() {
                                return mn.AlY();
                            }

                            @Override // com.bytedance.sdk.openadsdk.wXo.AlY
                            public String tN() {
                                return "pag_adn_strategy_center";
                            }

                            @Override // com.bytedance.sdk.openadsdk.wXo.AlY
                            public JSONObject vc() {
                                try {
                                    JSONObject YFl2 = com.bytedance.sdk.openadsdk.core.settings.pDU.YFl(Ne.YFl(lG.YFl(), 0L));
                                    if (!YFl2.has(MBridgeConstans.APP_ID)) {
                                        if (!TextUtils.isEmpty(str)) {
                                            YFl2.put(MBridgeConstans.APP_ID, str);
                                        } else {
                                            if (TextUtils.isEmpty(NjR.Sg().AlY())) {
                                                return null;
                                            }
                                            YFl2.put(MBridgeConstans.APP_ID, NjR.Sg().AlY());
                                        }
                                    }
                                    return com.bytedance.sdk.component.utils.YFl.YFl(YFl2);
                                } catch (Throwable th2) {
                                    YoT.YFl("StrategyUtils", th2.getMessage());
                                    return null;
                                }
                            }

                            @Override // com.bytedance.sdk.openadsdk.wXo.AlY
                            public String wN() {
                                return Sco.AlY("/api/ad/union/sdk/strategies/adn");
                            }

                            @Override // com.bytedance.sdk.openadsdk.wXo.AlY
                            public JSONObject YFl(JSONObject jSONObject) {
                                int optInt = jSONObject.optInt("cypher", -1);
                                if (optInt == -1 || optInt != 3) {
                                    return jSONObject;
                                }
                                String tN = com.bytedance.sdk.component.utils.YFl.tN(jSONObject.optString(PglCryptUtils.KEY_MESSAGE));
                                if (TextUtils.isEmpty(tN)) {
                                    return jSONObject;
                                }
                                try {
                                    return new JSONObject(tN);
                                } catch (Throwable unused) {
                                    return jSONObject;
                                }
                            }
                        });
                        Sg = tNVar;
                        tNVar.YFl(new com.bytedance.sdk.openadsdk.wXo.YFl() { // from class: com.bytedance.sdk.openadsdk.aIu.YFl.2
                            @Override // com.bytedance.sdk.openadsdk.wXo.YFl
                            public void Sg() {
                                com.bytedance.sdk.openadsdk.rkt.tN.Sg(new com.bytedance.sdk.openadsdk.rkt.AlY() { // from class: com.bytedance.sdk.openadsdk.aIu.YFl.2.2
                                    @Override // com.bytedance.sdk.openadsdk.rkt.AlY
                                    public com.bytedance.sdk.openadsdk.rkt.Sg.YFl generatorModel() {
                                        com.bytedance.sdk.openadsdk.rkt.Sg.YFl yFl = new com.bytedance.sdk.openadsdk.rkt.Sg.YFl();
                                        yFl.Sg("strategy_fetch");
                                        return yFl;
                                    }
                                });
                                com.bytedance.sdk.openadsdk.vc.YFl.YFl().Sg();
                            }

                            @Override // com.bytedance.sdk.openadsdk.wXo.YFl
                            public void YFl() {
                                com.bytedance.sdk.openadsdk.rkt.tN.YFl(new com.bytedance.sdk.openadsdk.rkt.AlY() { // from class: com.bytedance.sdk.openadsdk.aIu.YFl.2.1
                                    @Override // com.bytedance.sdk.openadsdk.rkt.AlY
                                    public com.bytedance.sdk.openadsdk.rkt.Sg.YFl generatorModel() {
                                        com.bytedance.sdk.openadsdk.rkt.Sg.YFl yFl = new com.bytedance.sdk.openadsdk.rkt.Sg.YFl();
                                        yFl.Sg("strategy_fetch");
                                        return yFl;
                                    }
                                });
                            }

                            @Override // com.bytedance.sdk.openadsdk.wXo.YFl
                            public void YFl(int i10, String str2) {
                                com.bytedance.sdk.openadsdk.rkt.tN.tN(new com.bytedance.sdk.openadsdk.rkt.AlY() { // from class: com.bytedance.sdk.openadsdk.aIu.YFl.2.3
                                    @Override // com.bytedance.sdk.openadsdk.rkt.AlY
                                    public com.bytedance.sdk.openadsdk.rkt.Sg.YFl generatorModel() {
                                        com.bytedance.sdk.openadsdk.rkt.Sg.YFl yFl = new com.bytedance.sdk.openadsdk.rkt.Sg.YFl();
                                        yFl.Sg("strategy_fetch");
                                        return yFl;
                                    }
                                });
                            }
                        });
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                }
            }
        }
        return Sg;
    }

    public static int YFl(String str, int i10) {
        tN Sg2 = Sg();
        return Sg2 != null ? Sg2.YFl(str, i10) : i10;
    }

    public static boolean YFl(String str, boolean z10) {
        tN Sg2 = Sg();
        return Sg2 != null ? Sg2.YFl(str, z10) : z10;
    }

    public static String YFl(String str, String str2) {
        tN Sg2 = Sg();
        return Sg2 != null ? Sg2.YFl(str, str2) : str2;
    }

    public static int YFl(String str, String str2, int i10) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String m10 = a.m(str, "_", str2);
            ConcurrentHashMap<String, Object> concurrentHashMap = YFl;
            Object obj = concurrentHashMap.get(m10);
            if (obj != null && (obj instanceof Integer)) {
                return ((Integer) obj).intValue();
            }
            try {
                String YFl2 = Sg().YFl(str, "");
                if (TextUtils.isEmpty(YFl2)) {
                    return i10;
                }
                int optInt = new JSONObject(YFl2).optInt(str2, i10);
                concurrentHashMap.put(m10, Integer.valueOf(optInt));
                return optInt;
            } catch (Throwable th2) {
                YoT.YFl("StrategyUtils", th2.getMessage());
            }
        }
        return i10;
    }

    public static void YFl() {
        tN Sg2 = Sg();
        if (Sg2 != null) {
            Sg2.YFl();
        }
    }
}

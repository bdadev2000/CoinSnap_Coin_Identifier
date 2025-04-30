package com.bytedance.sdk.component.HWF.zp.HWF;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.component.HWF.zp.ku;
import com.mbridge.msdk.foundation.download.Command;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class KS implements lMd {
    private final COT lMd;
    private final Context zp;

    @SuppressLint({"StaticFieldLeak"})
    /* loaded from: classes.dex */
    public class zp extends com.bytedance.sdk.component.HWF.zp.COT.COT {
        private final String KS;
        private final Map<String, String> jU;
        private final jU lMd;

        private String KS(String str) {
            if (!TextUtils.isEmpty(str)) {
                if (str.contains("{TS}") || str.contains("__TS__")) {
                    long currentTimeMillis = System.currentTimeMillis();
                    str = str.replace("{TS}", String.valueOf(currentTimeMillis)).replace("__TS__", String.valueOf(currentTimeMillis));
                }
                if ((str.contains("{UID}") || str.contains("__UID__")) && !TextUtils.isEmpty(this.KS)) {
                    return str.replace("{UID}", this.KS).replace("__UID__", this.KS);
                }
                return str;
            }
            return str;
        }

        public String lMd(String str) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    return str.replace("[ss_random]", String.valueOf(KS.lMd().nextLong())).replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
                } catch (Exception unused) {
                    return str;
                }
            }
            return str;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.component.HWF.zp.COT.jU jUVar;
            com.bytedance.sdk.component.HWF.zp.COT KVG = ku.QR().KVG();
            if (KVG == null || ku.QR().HWF() == null || !KVG.KS() || !zp(this.lMd.lMd())) {
                return;
            }
            if (this.lMd.jU() >= KVG.KS(this.lMd.HWF())) {
                KS.this.lMd.KS(this.lMd);
                return;
            }
            try {
                KVG.tG();
                if (this.lMd.Bj()) {
                    KS.this.lMd.zp(this.lMd);
                }
                if (!KVG.zp(KS.this.zp())) {
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                String lMd = this.lMd.lMd();
                if (KVG.HWF() == 0) {
                    lMd = KS(this.lMd.lMd());
                    if (this.lMd.KS()) {
                        lMd = lMd(lMd);
                    }
                }
                com.bytedance.sdk.component.HWF.zp.COT.KS dT = KVG.dT();
                if (dT == null) {
                    return;
                }
                dT.zp(Command.HTTP_HEADER_USER_AGENT, KVG.YW());
                dT.zp("csj_client_source_from", "1");
                if (this.jU != null) {
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry<String, String> entry : this.jU.entrySet()) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                    dT.zp("csj_extra_info", jSONObject.toString());
                }
                dT.zp(lMd);
                try {
                    jUVar = dT.zp();
                    try {
                        KVG.zp(jUVar.zp());
                    } catch (Throwable unused) {
                    }
                } catch (Throwable unused2) {
                    jUVar = null;
                }
                jU jUVar2 = this.lMd;
                jUVar2.zp(jUVar2.jU() + 1);
                if (jUVar != null && jUVar.zp()) {
                    KS.this.lMd.KS(this.lMd);
                    this.lMd.lMd();
                    KVG.zp(true, 200, System.currentTimeMillis() - currentTimeMillis, this.lMd);
                    return;
                }
                if (jUVar != null) {
                    this.lMd.lMd(jUVar.lMd());
                    this.lMd.KS(jUVar.KS());
                }
                if (jUVar != null && jUVar.lMd() == 8848) {
                    jUVar.KS();
                    KS.this.lMd.KS(this.lMd);
                } else {
                    this.lMd.lMd();
                    if (this.lMd.jU() >= KVG.KS(this.lMd.HWF())) {
                        KS.this.lMd.KS(this.lMd);
                        this.lMd.lMd();
                    } else {
                        KS.this.lMd.lMd(this.lMd);
                    }
                }
                KVG.zp(false, this.lMd.ku(), System.currentTimeMillis() - currentTimeMillis, this.lMd);
            } catch (Throwable unused3) {
            }
        }

        public boolean zp(String str) {
            if (!TextUtils.isEmpty(str)) {
                if (str.startsWith("http://") || str.startsWith("https://")) {
                    return true;
                }
                return false;
            }
            return false;
        }

        private zp(jU jUVar, String str, Map<String, String> map) {
            super("AdsStats");
            this.lMd = jUVar;
            this.KS = str;
            this.jU = map;
        }
    }

    public KS(Context context, COT cot) {
        this.zp = context;
        this.lMd = cot;
    }

    private static Random KS() {
        SecureRandom instanceStrong;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                instanceStrong = SecureRandom.getInstanceStrong();
                return instanceStrong;
            } catch (Throwable unused) {
                return new SecureRandom();
            }
        }
        return new SecureRandom();
    }

    public static /* synthetic */ Random lMd() {
        return KS();
    }

    public Context zp() {
        Context context = this.zp;
        return context == null ? ku.QR().HWF() : context;
    }

    @Override // com.bytedance.sdk.component.HWF.zp.HWF.lMd
    public void zp(String str, List<String> list, boolean z8, Map<String, String> map, int i9, String str2) {
        com.bytedance.sdk.component.HWF.zp.COT KVG = ku.QR().KVG();
        if (KVG == null || ku.QR().HWF() == null || KVG.jU() == null || !KVG.KS() || list == null || list.size() == 0) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            KVG.jU().execute(new zp(new jU(UUID.randomUUID().toString() + "_" + System.currentTimeMillis(), it.next(), z8, i9, str2), str, map));
        }
    }

    @Override // com.bytedance.sdk.component.HWF.zp.HWF.lMd
    public Runnable zp(final jU jUVar, final String str, final Map<String, String> map) {
        if (jUVar == null || TextUtils.isEmpty(jUVar.zp())) {
            return null;
        }
        return new Runnable() { // from class: com.bytedance.sdk.component.HWF.zp.HWF.KS.1
            @Override // java.lang.Runnable
            public void run() {
                if (KS.this.lMd.zp(jUVar.zp()) != null) {
                    new zp(jUVar, str, map).run();
                }
            }
        };
    }

    @Override // com.bytedance.sdk.component.HWF.zp.HWF.lMd
    public void zp(final String str, final boolean z8) {
        com.bytedance.sdk.component.HWF.zp.COT KVG = ku.QR().KVG();
        if (KVG == null || ku.QR().HWF() == null || !KVG.KS()) {
            return;
        }
        com.bytedance.sdk.component.HWF.zp.COT.COT cot = new com.bytedance.sdk.component.HWF.zp.COT.COT("trackFailedUrls") { // from class: com.bytedance.sdk.component.HWF.zp.HWF.KS.2
            @Override // java.lang.Runnable
            public void run() {
                KS.this.zp(KS.this.lMd.zp(), str, z8);
            }
        };
        cot.zp(1);
        if (KVG.jU() != null) {
            KVG.jU().execute(cot);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(List<jU> list, String str, boolean z8) {
        if (list == null || list.size() == 0) {
            return;
        }
        com.bytedance.sdk.component.HWF.zp.COT KVG = ku.QR().KVG();
        for (jU jUVar : list) {
            if (KVG != null && KVG.jU() != null) {
                jUVar.zp(z8);
                KVG.jU().execute(new zp(jUVar, str, null));
            }
        }
    }
}

package com.bytedance.sdk.openadsdk.HWF;

import com.bytedance.sdk.component.COT.YW;
import com.bytedance.sdk.component.COT.cz;

/* loaded from: classes.dex */
public class COT implements cz {
    private static int zp;
    private final String COT;
    private long KS;
    private boolean jU;
    private long lMd = 0;

    public COT() {
        zp++;
        this.COT = "image_request_" + zp;
    }

    private String KS(String str, YW yw) {
        com.bytedance.sdk.component.COT.KS.zp vwr;
        String str2;
        if (str != null) {
            char c9 = 65535;
            switch (str.hashCode()) {
                case -1867169789:
                    if (str.equals("success")) {
                        c9 = 0;
                        break;
                    }
                    break;
                case -1584526165:
                    if (str.equals("raw_cache")) {
                        c9 = 1;
                        break;
                    }
                    break;
                case -1442758754:
                    if (str.equals("image_type")) {
                        c9 = 2;
                        break;
                    }
                    break;
                case -1428113824:
                    if (str.equals("disk_cache")) {
                        c9 = 3;
                        break;
                    }
                    break;
                case -1335717394:
                    if (str.equals("decode")) {
                        c9 = 4;
                        break;
                    }
                    break;
                case -1281977283:
                    if (str.equals("failed")) {
                        c9 = 5;
                        break;
                    }
                    break;
                case -1076854124:
                    if (str.equals("check_duplicate")) {
                        c9 = 6;
                        break;
                    }
                    break;
                case 1017400004:
                    if (str.equals("memory_cache")) {
                        c9 = 7;
                        break;
                    }
                    break;
                case 1478448621:
                    if (str.equals("net_request")) {
                        c9 = '\b';
                        break;
                    }
                    break;
                case 1718821013:
                    if (str.equals("generate_key")) {
                        c9 = '\t';
                        break;
                    }
                    break;
                case 2067979407:
                    if (str.equals("cache_policy")) {
                        c9 = '\n';
                        break;
                    }
                    break;
            }
            switch (c9) {
                case 0:
                    return "success";
                case 1:
                    return "raw cache";
                case 2:
                    return "image type：";
                case 3:
                    return "disk cache";
                case 4:
                    return "decode";
                case 5:
                    if ((yw instanceof com.bytedance.sdk.component.COT.KS.KS) && (vwr = ((com.bytedance.sdk.component.COT.KS.KS) yw).vwr()) != null) {
                        Throwable KS = vwr.KS();
                        StringBuilder sb = new StringBuilder("fail：code:");
                        sb.append(vwr.zp());
                        sb.append(", msg:");
                        sb.append(vwr.lMd());
                        sb.append(", exception:");
                        if (KS != null) {
                            str2 = KS.getMessage();
                        } else {
                            str2 = "null \r\n";
                        }
                        sb.append(str2);
                        return sb.toString();
                    }
                    return "fail";
                case 6:
                    return "duplicate request";
                case 7:
                    return "memory cache";
                case '\b':
                    return "net request";
                case '\t':
                    return "generate key:" + yw.COT();
                case '\n':
                    return "cache policy";
            }
        }
        return str;
    }

    @Override // com.bytedance.sdk.component.COT.cz
    public void lMd(String str, YW yw) {
        this.KS += System.currentTimeMillis() - this.lMd;
        KS(str, yw);
    }

    @Override // com.bytedance.sdk.component.COT.cz
    public void zp(String str, YW yw) {
        if (!this.jU) {
            yw.zp();
            yw.lMd();
            yw.KS();
            this.jU = true;
        }
        this.lMd = System.currentTimeMillis();
        KS(str, yw);
    }
}

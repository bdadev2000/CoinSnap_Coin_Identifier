package com.bytedance.sdk.openadsdk.NjR;

import com.bytedance.sdk.component.wN.NjR;
import com.bytedance.sdk.component.wN.aIu;

/* loaded from: classes.dex */
public class wN implements aIu {
    private static int YFl;
    private boolean AlY;
    private long Sg = 0;
    private long tN;
    private final String wN;

    public wN() {
        YFl++;
        this.wN = "image_request_" + YFl;
    }

    private String tN(String str, NjR njR) {
        com.bytedance.sdk.component.wN.tN.YFl Wwa;
        String str2;
        if (str != null) {
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1867169789:
                    if (str.equals("success")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1584526165:
                    if (str.equals("raw_cache")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1442758754:
                    if (str.equals("image_type")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1428113824:
                    if (str.equals("disk_cache")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case -1335717394:
                    if (str.equals("decode")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case -1281977283:
                    if (str.equals("failed")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case -1076854124:
                    if (str.equals("check_duplicate")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 1017400004:
                    if (str.equals("memory_cache")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 1478448621:
                    if (str.equals("net_request")) {
                        c10 = '\b';
                        break;
                    }
                    break;
                case 1718821013:
                    if (str.equals("generate_key")) {
                        c10 = '\t';
                        break;
                    }
                    break;
                case 2067979407:
                    if (str.equals("cache_policy")) {
                        c10 = '\n';
                        break;
                    }
                    break;
            }
            switch (c10) {
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
                    if ((njR instanceof com.bytedance.sdk.component.wN.tN.tN) && (Wwa = ((com.bytedance.sdk.component.wN.tN.tN) njR).Wwa()) != null) {
                        Throwable tN = Wwa.tN();
                        StringBuilder sb2 = new StringBuilder("fail：code:");
                        sb2.append(Wwa.YFl());
                        sb2.append(", msg:");
                        sb2.append(Wwa.Sg());
                        sb2.append(", exception:");
                        if (tN != null) {
                            str2 = tN.getMessage();
                        } else {
                            str2 = "null \r\n";
                        }
                        sb2.append(str2);
                        return sb2.toString();
                    }
                    return "fail";
                case 6:
                    return "duplicate request";
                case 7:
                    return "memory cache";
                case '\b':
                    return "net request";
                case '\t':
                    return "generate key:" + njR.wN();
                case '\n':
                    return "cache policy";
            }
        }
        return str;
    }

    @Override // com.bytedance.sdk.component.wN.aIu
    public void Sg(String str, NjR njR) {
        this.tN += System.currentTimeMillis() - this.Sg;
        tN(str, njR);
    }

    @Override // com.bytedance.sdk.component.wN.aIu
    public void YFl(String str, NjR njR) {
        if (!this.AlY) {
            njR.YFl();
            njR.Sg();
            njR.tN();
            this.AlY = true;
        }
        this.Sg = System.currentTimeMillis();
        tN(str, njR);
    }
}

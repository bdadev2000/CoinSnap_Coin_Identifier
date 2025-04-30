package com.bytedance.sdk.openadsdk.api.init;

import android.text.TextUtils;
import com.bytedance.sdk.component.QR.jU.KS;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.openadsdk.InitConfig;
import com.bytedance.sdk.openadsdk.api.PAGConstant;
import com.bytedance.sdk.openadsdk.core.yRU;
import com.bytedance.sdk.openadsdk.utils.YhE;
import com.bytedance.sdk.openadsdk.utils.pvr;

/* loaded from: classes.dex */
public final class PAGConfig implements InitConfig {
    private static String Bj;
    private int KS;
    private String YW;
    private String dT;
    private boolean ku;
    private boolean lMd;
    private String zp;
    private int jU = -1;
    private int COT = -1;
    private int HWF = -1;
    private int QR = 0;

    /* loaded from: classes.dex */
    public static class Builder {
        private String Bj;
        private int KS;
        private String[] YW;
        private String dT;
        private boolean lMd;
        private String zp;
        private int jU = -1;
        private int COT = -1;
        private int HWF = -1;
        private int QR = 0;
        private boolean ku = false;

        public Builder appIcon(int i9) {
            this.KS = i9;
            return this;
        }

        public Builder appId(String str) {
            this.zp = str;
            return this;
        }

        public PAGConfig build() {
            PAGConfig pAGConfig = new PAGConfig();
            pAGConfig.lMd(this.zp);
            pAGConfig.lMd(this.jU);
            pAGConfig.zp(this.KS);
            pAGConfig.COT(this.QR);
            pAGConfig.lMd(this.ku);
            pAGConfig.KS(this.COT);
            pAGConfig.jU(this.HWF);
            pAGConfig.zp(this.lMd);
            pAGConfig.KS(this.dT);
            pAGConfig.zp(this.Bj);
            return pAGConfig;
        }

        public Builder debugLog(boolean z8) {
            this.lMd = z8;
            return this;
        }

        public Builder needClearTaskReset(String... strArr) {
            this.YW = strArr;
            return this;
        }

        public Builder setChildDirected(@PAGConstant.PAGChildDirectedType int i9) {
            this.jU = i9;
            return this;
        }

        public Builder setDoNotSell(@PAGConstant.PAGDoNotSellType int i9) {
            this.HWF = i9;
            return this;
        }

        public Builder setGDPRConsent(@PAGConstant.PAGGDPRConsentType int i9) {
            this.COT = i9;
            return this;
        }

        public Builder setPackageName(String str) {
            this.dT = str;
            return this;
        }

        public Builder setUserData(String str) {
            this.Bj = str;
            return this;
        }

        public Builder supportMultiProcess(boolean z8) {
            this.ku = z8;
            return this;
        }

        public Builder titleBarTheme(int i9) {
            this.QR = i9;
            return this;
        }

        public Builder useTextureView(boolean z8) {
            return this;
        }
    }

    public static void debugLog(boolean z8) {
        if (yRU.zp() != null) {
            if (z8) {
                yRU.zp().COT(1);
                yRU.zp().zp();
                return;
            }
            yRU.zp().COT(0);
            KS.zp(KS.zp.OFF);
            tG.KS();
            com.bykv.vk.openvk.component.video.api.HWF.KS.lMd();
            pvr.lMd();
        }
    }

    public static int getChildDirected() {
        if (!YhE.YW("getCoppa")) {
            return -1;
        }
        return yRU.zp().lMd();
    }

    public static int getDoNotSell() {
        if (!YhE.YW("getCCPA")) {
            return -1;
        }
        return yRU.zp().HWF();
    }

    public static int getGDPRConsent() {
        if (!YhE.YW("getGdpr")) {
            return -1;
        }
        int KS = yRU.zp().KS();
        if (KS == 1) {
            return 0;
        }
        if (KS == 0) {
            return 1;
        }
        return KS;
    }

    public static void setAppIconId(int i9) {
        if (yRU.zp() != null) {
            yRU.zp().HWF(i9);
        }
    }

    public static void setChildDirected(@PAGConstant.PAGChildDirectedType int i9) {
        if (!YhE.YW("setCoppa")) {
            return;
        }
        if (i9 < -1 || i9 > 1) {
            i9 = -1;
        }
        yRU.zp().lMd(i9);
    }

    public static void setDoNotSell(@PAGConstant.PAGDoNotSellType int i9) {
        if (!YhE.YW("setCCPA")) {
            return;
        }
        if (i9 < -1 || i9 > 1) {
            i9 = -1;
        }
        yRU.zp().jU(i9);
    }

    public static void setGDPRConsent(@PAGConstant.PAGGDPRConsentType int i9) {
        YhE.YW("setGdpr");
        if (i9 < -1 || i9 > 1) {
            i9 = -1;
        }
        yRU.zp().KS(i9);
    }

    public static void setPackageName(String str) {
        Bj = str;
    }

    public static void setUserData(String str) {
        if (yRU.zp() != null) {
            yRU.zp().lMd(str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getAppIconId() {
        return this.KS;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getAppId() {
        return this.zp;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getCcpa() {
        return this.HWF;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getCoppa() {
        return this.jU;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getData() {
        return this.dT;
    }

    public boolean getDebugLog() {
        return this.lMd;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getGdpr() {
        return this.COT;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getPackageName() {
        if (TextUtils.isEmpty(this.YW)) {
            return Bj;
        }
        return this.YW;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getTitleBarTheme() {
        return this.QR;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public boolean isSupportMultiProcess() {
        return this.ku;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public boolean isUseTextureView() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void COT(int i9) {
        this.QR = i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jU(int i9) {
        if (i9 < -1 || i9 > 1) {
            i9 = -1;
        }
        this.HWF = i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void KS(int i9) {
        if (i9 < -1 || i9 > 1) {
            i9 = -1;
        }
        this.COT = i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void KS(String str) {
        this.YW = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lMd(String str) {
        this.zp = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(String str) {
        this.dT = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lMd(int i9) {
        if (i9 < -1 || i9 > 1) {
            i9 = -1;
        }
        this.jU = i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(boolean z8) {
        this.lMd = z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lMd(boolean z8) {
        this.ku = z8;
        com.bykv.vk.openvk.component.video.api.KS.zp(z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(int i9) {
        this.KS = i9;
    }
}

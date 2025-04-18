package com.bytedance.sdk.openadsdk.api.init;

import android.text.TextUtils;
import com.bytedance.sdk.component.DSW.AlY.tN;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.openadsdk.InitConfig;
import com.bytedance.sdk.openadsdk.api.PAGConstant;
import com.bytedance.sdk.openadsdk.core.dXO;
import com.bytedance.sdk.openadsdk.utils.Sco;
import com.bytedance.sdk.openadsdk.utils.aIu;
import k5.d;

/* loaded from: classes.dex */
public final class PAGConfig implements InitConfig {
    private static String eT;
    private String NjR;
    private boolean Sg;
    private String YFl;

    /* renamed from: nc, reason: collision with root package name */
    private String f10556nc;
    private boolean qsH;
    private int tN;
    private int AlY = -1;
    private int wN = -1;

    /* renamed from: vc, reason: collision with root package name */
    private int f10557vc = -1;
    private int DSW = 0;

    /* loaded from: classes.dex */
    public static class Builder {
        private String[] NjR;
        private boolean Sg;
        private String YFl;
        private String eT;

        /* renamed from: nc, reason: collision with root package name */
        private String f10558nc;
        private int tN;
        private int AlY = -1;
        private int wN = -1;

        /* renamed from: vc, reason: collision with root package name */
        private int f10559vc = -1;
        private int DSW = 0;
        private boolean qsH = false;

        public Builder appIcon(int i10) {
            this.tN = i10;
            return this;
        }

        public Builder appId(String str) {
            this.YFl = str;
            return this;
        }

        public PAGConfig build() {
            PAGConfig pAGConfig = new PAGConfig();
            pAGConfig.Sg(this.YFl);
            pAGConfig.Sg(this.AlY);
            pAGConfig.YFl(this.tN);
            pAGConfig.wN(this.DSW);
            pAGConfig.Sg(this.qsH);
            pAGConfig.tN(this.wN);
            pAGConfig.AlY(this.f10559vc);
            pAGConfig.YFl(this.Sg);
            pAGConfig.tN(this.f10558nc);
            pAGConfig.YFl(this.eT);
            return pAGConfig;
        }

        public Builder debugLog(boolean z10) {
            this.Sg = z10;
            return this;
        }

        public Builder needClearTaskReset(String... strArr) {
            this.NjR = strArr;
            return this;
        }

        public Builder setChildDirected(@PAGConstant.PAGChildDirectedType int i10) {
            this.AlY = i10;
            return this;
        }

        public Builder setDoNotSell(@PAGConstant.PAGDoNotSellType int i10) {
            this.f10559vc = i10;
            return this;
        }

        public Builder setGDPRConsent(@PAGConstant.PAGGDPRConsentType int i10) {
            this.wN = i10;
            return this;
        }

        public Builder setPackageName(String str) {
            this.f10558nc = str;
            return this;
        }

        public Builder setUserData(String str) {
            this.eT = str;
            return this;
        }

        public Builder supportMultiProcess(boolean z10) {
            this.qsH = z10;
            return this;
        }

        public Builder titleBarTheme(int i10) {
            this.DSW = i10;
            return this;
        }

        public Builder useTextureView(boolean z10) {
            return this;
        }
    }

    public static void debugLog(boolean z10) {
        if (dXO.YFl() != null) {
            if (z10) {
                dXO.YFl().wN(1);
                dXO.YFl().YFl();
            } else {
                dXO.YFl().wN(0);
                tN.YFl(tN.YFl.OFF);
                YoT.tN();
                aIu.Sg();
            }
        }
    }

    public static int getChildDirected() {
        if (!Sco.NjR("getCoppa")) {
            return -1;
        }
        return dXO.YFl().Sg();
    }

    public static int getDoNotSell() {
        if (!Sco.NjR("getCCPA")) {
            return -1;
        }
        return dXO.YFl().vc();
    }

    public static int getGDPRConsent() {
        if (!Sco.NjR("getGdpr")) {
            return -1;
        }
        int tN = dXO.YFl().tN();
        if (tN == 1) {
            return 0;
        }
        if (tN == 0) {
            return 1;
        }
        return tN;
    }

    public static void setAppIconId(int i10) {
        if (dXO.YFl() != null) {
            dXO.YFl().vc(i10);
        }
    }

    public static void setChildDirected(@PAGConstant.PAGChildDirectedType int i10) {
        if (!Sco.NjR("setCoppa")) {
            return;
        }
        if (i10 < -1 || i10 > 1) {
            i10 = -1;
        }
        dXO.YFl().Sg(i10);
    }

    public static void setDoNotSell(@PAGConstant.PAGDoNotSellType int i10) {
        if (!Sco.NjR("setCCPA")) {
            return;
        }
        if (i10 < -1 || i10 > 1) {
            i10 = -1;
        }
        dXO.YFl().AlY(i10);
    }

    public static void setGDPRConsent(@PAGConstant.PAGGDPRConsentType int i10) {
        Sco.NjR("setGdpr");
        if (i10 < -1 || i10 > 1) {
            i10 = -1;
        }
        dXO.YFl().tN(i10);
    }

    public static void setPackageName(String str) {
        eT = str;
    }

    public static void setUserData(String str) {
        if (dXO.YFl() != null) {
            dXO.YFl().Sg(str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getAppIconId() {
        return this.tN;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getAppId() {
        return this.YFl;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getCcpa() {
        return this.f10557vc;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getCoppa() {
        return this.AlY;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getData() {
        return this.f10556nc;
    }

    public boolean getDebugLog() {
        return this.Sg;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getGdpr() {
        return this.wN;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getPackageName() {
        if (TextUtils.isEmpty(this.NjR)) {
            return eT;
        }
        return this.NjR;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getTitleBarTheme() {
        return this.DSW;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public boolean isSupportMultiProcess() {
        return this.qsH;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public boolean isUseTextureView() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AlY(int i10) {
        if (i10 < -1 || i10 > 1) {
            i10 = -1;
        }
        this.f10557vc = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    public void wN(int i10) {
        this.DSW = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tN(int i10) {
        if (i10 < -1 || i10 > 1) {
            i10 = -1;
        }
        this.wN = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sg(String str) {
        this.YFl = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(String str) {
        this.f10556nc = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tN(String str) {
        this.NjR = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sg(int i10) {
        if (i10 < -1 || i10 > 1) {
            i10 = -1;
        }
        this.AlY = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(boolean z10) {
        this.Sg = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sg(boolean z10) {
        this.qsH = z10;
        d.f20273c = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(int i10) {
        this.tN = i10;
    }
}

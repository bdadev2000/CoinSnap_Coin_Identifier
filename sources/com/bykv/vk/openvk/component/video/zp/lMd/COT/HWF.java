package com.bykv.vk.openvk.component.video.zp.lMd.COT;

import com.bykv.vk.openvk.component.video.zp.lMd.YW;
import com.bytedance.sdk.component.lMd.zp.dQp;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class HWF extends zp {
    private dQp KS;

    public HWF(dQp dqp, COT cot) {
        com.bytedance.sdk.component.lMd.zp.HWF QR;
        this.KS = dqp;
        this.zp = new ArrayList();
        if (dqp != null && (QR = dqp.QR()) != null) {
            for (int i9 = 0; i9 < QR.zp(); i9++) {
                this.zp.add(new YW.lMd(QR.zp(i9), QR.lMd(i9)));
            }
        }
        this.lMd = cot;
    }

    @Override // com.bykv.vk.openvk.component.video.zp.lMd.COT.zp
    public String COT() {
        dQp dqp = this.KS;
        if (dqp != null && dqp.ku() != null) {
            return this.KS.ku().toString();
        }
        return "http/1.1";
    }

    @Override // com.bykv.vk.openvk.component.video.zp.lMd.COT.zp
    public String HWF() {
        return zp(this.KS.KS());
    }

    @Override // com.bykv.vk.openvk.component.video.zp.lMd.COT.zp
    public List<YW.lMd> KS() {
        return this.zp;
    }

    @Override // com.bykv.vk.openvk.component.video.zp.lMd.COT.zp
    public InputStream jU() {
        return this.KS.HWF().KS();
    }

    @Override // com.bykv.vk.openvk.component.video.zp.lMd.COT.zp
    public boolean lMd() {
        if (this.KS.KS() >= 200 && this.KS.KS() < 300) {
            return true;
        }
        return false;
    }

    @Override // com.bykv.vk.openvk.component.video.zp.lMd.COT.zp
    public int zp() {
        return this.KS.KS();
    }

    @Override // com.bykv.vk.openvk.component.video.zp.lMd.COT.zp
    public String zp(String str, String str2) {
        return zp(str) != null ? zp(str).lMd : str2;
    }
}

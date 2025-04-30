package com.bytedance.sdk.component.COT.KS.zp.lMd;

import com.bytedance.sdk.component.COT.pvr;

/* loaded from: classes.dex */
public class KS implements pvr {
    private com.bytedance.sdk.component.COT.KS.zp.KS<String, byte[]> KS;
    private int lMd;
    private int zp;

    public KS(int i9, int i10) {
        this.lMd = i9;
        this.zp = i10;
        this.KS = new com.bytedance.sdk.component.COT.KS.zp.KS<String, byte[]>(i9) { // from class: com.bytedance.sdk.component.COT.KS.zp.lMd.KS.1
            @Override // com.bytedance.sdk.component.COT.KS.zp.KS
            /* renamed from: zp, reason: merged with bridge method [inline-methods] */
            public int lMd(String str, byte[] bArr) {
                if (bArr == null) {
                    return 0;
                }
                return bArr.length;
            }
        };
    }

    @Override // com.bytedance.sdk.component.COT.zp
    public boolean lMd(String str) {
        return this.KS.zp((com.bytedance.sdk.component.COT.KS.zp.KS<String, byte[]>) str) != null;
    }

    @Override // com.bytedance.sdk.component.COT.zp
    public boolean zp(String str, byte[] bArr) {
        if (str == null || bArr == null) {
            return false;
        }
        this.KS.zp(str, bArr);
        return true;
    }

    @Override // com.bytedance.sdk.component.COT.zp
    public byte[] zp(String str) {
        return this.KS.zp((com.bytedance.sdk.component.COT.KS.zp.KS<String, byte[]>) str);
    }
}

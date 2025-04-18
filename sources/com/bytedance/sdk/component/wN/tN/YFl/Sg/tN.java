package com.bytedance.sdk.component.wN.tN.YFl.Sg;

import com.bytedance.sdk.component.wN.qO;

/* loaded from: classes.dex */
public class tN implements qO {
    private int Sg;
    private int YFl;
    private com.bytedance.sdk.component.wN.tN.YFl.tN<String, byte[]> tN;

    public tN(int i10, int i11) {
        this.Sg = i10;
        this.YFl = i11;
        this.tN = new com.bytedance.sdk.component.wN.tN.YFl.tN<String, byte[]>(i10) { // from class: com.bytedance.sdk.component.wN.tN.YFl.Sg.tN.1
            @Override // com.bytedance.sdk.component.wN.tN.YFl.tN
            /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
            public int Sg(String str, byte[] bArr) {
                if (bArr == null) {
                    return 0;
                }
                return bArr.length;
            }
        };
    }

    @Override // com.bytedance.sdk.component.wN.YFl
    public boolean Sg(String str) {
        return this.tN.YFl((com.bytedance.sdk.component.wN.tN.YFl.tN<String, byte[]>) str) != null;
    }

    @Override // com.bytedance.sdk.component.wN.YFl
    public boolean YFl(String str, byte[] bArr) {
        if (str == null || bArr == null) {
            return false;
        }
        this.tN.YFl(str, bArr);
        return true;
    }

    @Override // com.bytedance.sdk.component.wN.YFl
    public byte[] YFl(String str) {
        return this.tN.YFl((com.bytedance.sdk.component.wN.tN.YFl.tN<String, byte[]>) str);
    }
}

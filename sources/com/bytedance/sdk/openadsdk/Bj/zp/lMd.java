package com.bytedance.sdk.openadsdk.Bj.zp;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.utils.jU;
import com.bytedance.sdk.component.utils.tG;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class lMd {
    private List<Object> COT;
    private Map<String, String> HWF;
    private Bitmap KS;
    private Bitmap jU;
    private byte[] lMd;
    int zp;

    public lMd(byte[] bArr, int i9) {
        this.KS = null;
        this.jU = null;
        this.COT = null;
        this.HWF = null;
        this.lMd = bArr;
        this.zp = i9;
    }

    public byte[] KS() {
        try {
            if (this.lMd == null) {
                this.lMd = jU.zp(this.KS);
            }
        } catch (OutOfMemoryError e4) {
            tG.zp("GifRequestResult", e4.getMessage());
        }
        return this.lMd;
    }

    public boolean jU() {
        if (this.KS != null) {
            return true;
        }
        byte[] bArr = this.lMd;
        if (bArr != null && bArr.length > 0) {
            return true;
        }
        return false;
    }

    public Bitmap lMd() {
        return this.jU;
    }

    public Bitmap zp() {
        return this.KS;
    }

    public lMd(Bitmap bitmap, Bitmap bitmap2, int i9) {
        this.lMd = null;
        this.COT = null;
        this.HWF = null;
        this.jU = bitmap2;
        this.KS = bitmap;
        this.zp = i9;
    }
}

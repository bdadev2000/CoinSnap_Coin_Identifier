package com.bykv.vk.openvk.component.video.api.KS;

import android.os.Build;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class KS implements Serializable {
    private String Bj;
    private lMd COT;
    private lMd HWF;
    private boolean KVG;
    private String QR;
    private long dQp;
    public int jU;
    public int lMd;
    private int pvr;
    private String rV;
    private int tG;
    private int vDp;
    private int vwr;
    private boolean woN;
    public String zp;
    private int ku = 204800;
    private int YW = 0;
    private int dT = 0;
    public final HashMap<String, Object> KS = new HashMap<>();
    private int cz = 10000;
    private int FP = 10000;
    private int ot = 10000;
    private int yRU = 0;
    private JSONObject ox = new JSONObject();

    public KS(String str, lMd lmd, lMd lmd2, int i9, int i10) {
        this.vwr = 0;
        this.pvr = 0;
        this.QR = str;
        this.COT = lmd;
        this.HWF = lmd2;
        this.vwr = i9;
        this.pvr = i10;
    }

    public boolean Bj() {
        lMd lmd;
        if (this.pvr == 1 && (lmd = this.HWF) != null && !TextUtils.isEmpty(lmd.Bj())) {
            if (com.bykv.vk.openvk.component.video.api.KS.HWF() == 2) {
                if (Build.VERSION.SDK_INT >= 26) {
                    return true;
                }
            } else if (this.vwr == 1) {
                return true;
            }
        }
        return false;
    }

    public int COT() {
        return this.vDp;
    }

    public lMd FP() {
        return this.HWF;
    }

    public int HWF() {
        return this.tG;
    }

    public int KS() {
        if (Bj()) {
            return this.HWF.dQp();
        }
        lMd lmd = this.COT;
        if (lmd != null) {
            return lmd.dQp();
        }
        return 0;
    }

    public int KVG() {
        return this.cz;
    }

    public long QR() {
        return this.dQp;
    }

    public long YW() {
        if (Bj()) {
            return this.HWF.COT();
        }
        lMd lmd = this.COT;
        if (lmd != null) {
            return lmd.COT();
        }
        return 0L;
    }

    public lMd cz() {
        return this.COT;
    }

    public int dQp() {
        return this.vwr;
    }

    public boolean dT() {
        if (Bj()) {
            return this.HWF.FP();
        }
        lMd lmd = this.COT;
        if (lmd != null) {
            return lmd.FP();
        }
        return true;
    }

    public boolean jU() {
        return this.woN;
    }

    public boolean ku() {
        return this.KVG;
    }

    public String lMd() {
        return this.QR;
    }

    public int pvr() {
        return this.yRU;
    }

    public String rV() {
        if (Bj()) {
            return this.HWF.rV();
        }
        lMd lmd = this.COT;
        if (lmd != null) {
            return lmd.rV();
        }
        return null;
    }

    public String tG() {
        if (Bj()) {
            return this.HWF.Bj();
        }
        lMd lmd = this.COT;
        if (lmd != null) {
            return lmd.Bj();
        }
        return null;
    }

    public float vDp() {
        if (Bj()) {
            return this.HWF.ku();
        }
        lMd lmd = this.COT;
        if (lmd != null) {
            return lmd.ku();
        }
        return -1.0f;
    }

    public int vwr() {
        return this.ot;
    }

    public int woN() {
        return this.FP;
    }

    public int zp() {
        return this.ox.optInt("pitaya_cache_size", 0);
    }

    public synchronized Object COT(String str) {
        return this.KS.get(str);
    }

    public void HWF(int i9) {
        this.ot = i9;
    }

    public void QR(int i9) {
        this.yRU = i9;
    }

    public void jU(String str) {
        this.zp = str;
    }

    public void lMd(String str) {
        this.Bj = str;
    }

    public void zp(String str) {
        this.QR = str;
    }

    public void COT(int i9) {
        this.FP = i9;
    }

    public void jU(int i9) {
        this.cz = i9;
    }

    public void lMd(int i9) {
        this.tG = i9;
    }

    public void zp(int i9) {
        this.vDp = i9;
    }

    public void zp(long j7) {
        this.dQp = j7;
    }

    public void KS(String str) {
        this.rV = str;
    }

    public void zp(boolean z8) {
        this.KVG = z8;
    }

    public void KS(int i9) {
        this.lMd = i9;
    }

    public synchronized void zp(String str, Object obj) {
        this.KS.put(str, obj);
    }
}

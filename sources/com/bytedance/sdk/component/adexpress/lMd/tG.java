package com.bytedance.sdk.component.adexpress.lMd;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class tG {
    private long Bj;
    private int COT;
    private int FP;
    private JSONObject Gzh;
    private String HWF;
    private String KS;
    private boolean KVG;
    private boolean Lij;
    private String QR;
    private String QUv;
    private int RCv;
    private boolean YW;
    private int cz;
    private int dQp;
    private int dT;
    private boolean irS;
    private YW jU;
    private String ku;
    private COT lMd;
    private int ot;
    private double ox;
    private int pvr;
    private Map<String, String> rV;
    private String tG;
    private int vDp;
    private int vwr;
    private String woN;
    private String yRU;
    private JSONObject zp;

    /* loaded from: classes.dex */
    public static class zp {
        private long Bj;
        private int COT;
        private int FP;
        private JSONObject Gzh;
        private String HWF;
        private String KS;
        private boolean KVG;
        private boolean Lij = true;
        private String QR;
        private String QUv;
        private int RCv;
        private boolean YW;
        private int cz;
        private int dQp;
        private int dT;
        private boolean irS;
        private YW jU;
        private String ku;
        private COT lMd;
        private int ot;
        private double ox;
        private int pvr;
        private Map<String, String> rV;
        private String tG;
        private int vDp;
        private int vwr;
        private String woN;
        private String yRU;
        private JSONObject zp;

        public zp COT(String str) {
            this.woN = str;
            return this;
        }

        public zp HWF(String str) {
            this.QUv = str;
            return this;
        }

        public zp KS(String str) {
            this.QR = str;
            return this;
        }

        public zp jU(String str) {
            this.ku = str;
            return this;
        }

        public zp lMd(String str) {
            this.HWF = str;
            return this;
        }

        public zp zp(COT cot) {
            this.lMd = cot;
            return this;
        }

        public zp COT(int i9) {
            this.RCv = i9;
            return this;
        }

        public zp KS(int i9) {
            this.vDp = i9;
            return this;
        }

        public zp jU(int i9) {
            this.dQp = i9;
            return this;
        }

        public zp lMd(boolean z8) {
            this.YW = z8;
            return this;
        }

        public zp zp(boolean z8) {
            this.Lij = z8;
            return this;
        }

        public zp KS(boolean z8) {
            this.KVG = z8;
            return this;
        }

        public zp jU(boolean z8) {
            this.irS = z8;
            return this;
        }

        public zp lMd(int i9) {
            this.dT = i9;
            return this;
        }

        public zp zp(String str) {
            this.KS = str;
            return this;
        }

        public zp zp(YW yw) {
            this.jU = yw;
            return this;
        }

        public zp zp(int i9) {
            this.COT = i9;
            return this;
        }

        public zp zp(long j7) {
            this.Bj = j7;
            return this;
        }

        public zp zp(Map<String, String> map) {
            this.rV = map;
            return this;
        }

        public tG zp() {
            return new tG(this);
        }

        public zp zp(double d2) {
            this.ox = d2;
            return this;
        }
    }

    public tG(zp zpVar) {
        this.zp = zpVar.zp;
        this.lMd = zpVar.lMd;
        this.KS = zpVar.KS;
        this.jU = zpVar.jU;
        this.COT = zpVar.COT;
        this.HWF = zpVar.HWF;
        this.QR = zpVar.QR;
        this.ku = zpVar.ku;
        this.YW = zpVar.YW;
        this.dT = zpVar.dT;
        this.Bj = zpVar.Bj;
        this.vDp = zpVar.vDp;
        this.tG = zpVar.tG;
        this.rV = zpVar.rV;
        this.dQp = zpVar.dQp;
        this.KVG = zpVar.KVG;
        this.woN = zpVar.woN;
        this.vwr = zpVar.vwr;
        this.pvr = zpVar.pvr;
        this.cz = zpVar.cz;
        this.FP = zpVar.FP;
        this.ot = zpVar.ot;
        this.yRU = zpVar.yRU;
        this.ox = zpVar.ox;
        this.RCv = zpVar.RCv;
        this.Lij = zpVar.Lij;
        this.Gzh = zpVar.Gzh;
        this.irS = zpVar.irS;
        this.QUv = zpVar.QUv;
    }

    public Map<String, String> Bj() {
        return this.rV;
    }

    public YW COT() {
        return this.jU;
    }

    public boolean FP() {
        return this.irS;
    }

    public int HWF() {
        return this.COT;
    }

    public JSONObject KS() {
        COT cot;
        if (this.zp == null && (cot = this.lMd) != null) {
            this.zp = cot.zp();
        }
        return this.zp;
    }

    public int KVG() {
        return this.pvr;
    }

    public int QR() {
        return this.RCv;
    }

    public long YW() {
        return this.Bj;
    }

    public int cz() {
        return this.ot;
    }

    public int dQp() {
        return this.vwr;
    }

    public int dT() {
        return this.vDp;
    }

    public String jU() {
        return this.KS;
    }

    public boolean ku() {
        return this.YW;
    }

    public double lMd() {
        return this.ox;
    }

    public String ot() {
        return this.QUv;
    }

    public int pvr() {
        return this.FP;
    }

    public String rV() {
        return this.woN;
    }

    public boolean tG() {
        return this.KVG;
    }

    public int vDp() {
        return this.dQp;
    }

    public JSONObject vwr() {
        return this.Gzh;
    }

    public int woN() {
        return this.cz;
    }

    public boolean zp() {
        return this.Lij;
    }
}

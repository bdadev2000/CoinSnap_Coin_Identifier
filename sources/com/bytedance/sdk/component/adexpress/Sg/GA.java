package com.bytedance.sdk.component.adexpress.Sg;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class GA {
    private NjR AlY;
    private JSONObject Cfr;
    private String DSW;
    private int EH;
    private String GA;
    private JSONObject Ga;
    private int Ne;
    private boolean NjR;
    private wN Sg;
    private int UZM;
    private String VOe;
    private int Wwa;
    private JSONObject YFl;
    private boolean YI;
    private int YoT;
    private int aIu;
    private double bZ;
    private JSONObject dXO;
    private long eT;
    private boolean hQ;
    private String lG;
    private final boolean mn;

    /* renamed from: nc, reason: collision with root package name */
    private int f10349nc;
    private Map<String, String> pDU;
    private String pq;
    private int qO;
    private String qsH;
    private boolean rkt;
    private String tN;

    /* renamed from: vc, reason: collision with root package name */
    private String f10350vc;
    private int wN;
    private int wXo;

    /* loaded from: classes.dex */
    public static class YFl {
        private NjR AlY;
        private JSONObject Cfr;
        private String DSW;
        private int EH;
        private String GA;
        private JSONObject Ga;
        private int Ne;
        private boolean NjR;
        private wN Sg;
        private int UZM;
        private String VOe;
        private int Wwa;
        private JSONObject YFl;
        private int YoT;
        private int aIu;
        private double bZ;
        private JSONObject dXO;
        private long eT;
        private boolean hQ;
        private String lG;

        /* renamed from: nc, reason: collision with root package name */
        private int f10351nc;
        private Map<String, String> pDU;
        private String pq;
        private int qO;
        private String qsH;
        private boolean rkt;
        private String tN;

        /* renamed from: vc, reason: collision with root package name */
        private String f10352vc;
        private int wN;
        private int wXo;
        private boolean YI = true;
        private boolean mn = true;

        public YFl AlY(String str) {
            this.qsH = str;
            return this;
        }

        public YFl Sg(String str) {
            this.f10352vc = str;
            return this;
        }

        public YFl YFl(wN wNVar) {
            this.Sg = wNVar;
            return this;
        }

        public YFl tN(String str) {
            this.DSW = str;
            return this;
        }

        public YFl vc(String str) {
            this.pq = str;
            return this;
        }

        public YFl wN(String str) {
            this.lG = str;
            return this;
        }

        public YFl AlY(int i10) {
            this.EH = i10;
            return this;
        }

        public YFl Sg(boolean z10) {
            this.NjR = z10;
            return this;
        }

        public YFl YFl(boolean z10) {
            this.YI = z10;
            return this;
        }

        public YFl tN(boolean z10) {
            this.mn = z10;
            return this;
        }

        public YFl wN(int i10) {
            this.UZM = i10;
            return this;
        }

        public YFl AlY(boolean z10) {
            this.rkt = z10;
            return this;
        }

        public YFl Sg(int i10) {
            this.f10351nc = i10;
            return this;
        }

        public YFl YFl(String str) {
            this.tN = str;
            return this;
        }

        public YFl tN(int i10) {
            this.YoT = i10;
            return this;
        }

        public YFl wN(boolean z10) {
            this.hQ = z10;
            return this;
        }

        public YFl YFl(NjR njR) {
            this.AlY = njR;
            return this;
        }

        public YFl YFl(int i10) {
            this.wN = i10;
            return this;
        }

        public YFl YFl(long j3) {
            this.eT = j3;
            return this;
        }

        public YFl YFl(Map<String, String> map) {
            this.pDU = map;
            return this;
        }

        public GA YFl() {
            return new GA(this);
        }

        public YFl YFl(double d10) {
            this.bZ = d10;
            return this;
        }
    }

    public GA(YFl yFl) {
        this.YFl = yFl.YFl;
        this.Sg = yFl.Sg;
        this.tN = yFl.tN;
        this.AlY = yFl.AlY;
        this.wN = yFl.wN;
        this.f10350vc = yFl.f10352vc;
        this.DSW = yFl.DSW;
        this.qsH = yFl.qsH;
        this.NjR = yFl.NjR;
        this.f10349nc = yFl.f10351nc;
        this.eT = yFl.eT;
        this.YoT = yFl.YoT;
        this.GA = yFl.GA;
        this.pDU = yFl.pDU;
        this.EH = yFl.EH;
        this.rkt = yFl.rkt;
        this.lG = yFl.lG;
        this.Wwa = yFl.Wwa;
        this.qO = yFl.qO;
        this.aIu = yFl.aIu;
        this.wXo = yFl.wXo;
        this.Ne = yFl.Ne;
        this.VOe = yFl.VOe;
        this.bZ = yFl.bZ;
        this.UZM = yFl.UZM;
        this.YI = yFl.YI;
        this.Ga = yFl.Ga;
        this.dXO = yFl.dXO;
        this.Cfr = yFl.Cfr;
        this.hQ = yFl.hQ;
        this.pq = yFl.pq;
        this.mn = yFl.mn;
    }

    public String AlY() {
        return this.tN;
    }

    public int DSW() {
        return this.UZM;
    }

    public int EH() {
        return this.Wwa;
    }

    public boolean GA() {
        return this.rkt;
    }

    public int Ne() {
        return this.Ne;
    }

    public long NjR() {
        return this.eT;
    }

    public double Sg() {
        return this.bZ;
    }

    public boolean UZM() {
        return this.mn;
    }

    public boolean VOe() {
        return this.hQ;
    }

    public JSONObject Wwa() {
        return this.Ga;
    }

    public boolean YFl() {
        return this.YI;
    }

    public int YoT() {
        return this.EH;
    }

    public JSONObject aIu() {
        return this.Cfr;
    }

    public String bZ() {
        return this.pq;
    }

    public Map<String, String> eT() {
        return this.pDU;
    }

    public int lG() {
        return this.aIu;
    }

    public int nc() {
        return this.YoT;
    }

    public String pDU() {
        return this.lG;
    }

    public JSONObject qO() {
        return this.dXO;
    }

    public boolean qsH() {
        return this.NjR;
    }

    public int rkt() {
        return this.qO;
    }

    public JSONObject tN() {
        wN wNVar;
        if (this.YFl == null && (wNVar = this.Sg) != null) {
            this.YFl = wNVar.YFl();
        }
        return this.YFl;
    }

    public int vc() {
        return this.wN;
    }

    public NjR wN() {
        return this.AlY;
    }

    public int wXo() {
        return this.wXo;
    }
}

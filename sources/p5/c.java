package p5;

import android.os.Build;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.HashMap;
import k5.d;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class c implements Serializable {
    public int AlY;
    private String DSW;
    private long EH;
    private int GA;
    public int Sg;
    private int Wwa;
    public String YFl;
    private int YoT;
    private String eT;
    private boolean lG;
    private String pDU;
    private int qO;
    private boolean rkt;

    /* renamed from: vc, reason: collision with root package name */
    private a f23477vc;
    private a wN;
    private int qsH = 204800;
    private int NjR = 0;

    /* renamed from: nc, reason: collision with root package name */
    private int f23476nc = 0;
    public final HashMap<String, Object> tN = new HashMap<>();
    private int aIu = 10000;
    private int wXo = 10000;
    private int Ne = 10000;
    private int VOe = 0;
    private JSONObject bZ = new JSONObject();

    public c(String str, a aVar, a aVar2, int i10, int i11) {
        this.Wwa = 0;
        this.qO = 0;
        this.DSW = str;
        this.wN = aVar;
        this.f23477vc = aVar2;
        this.Wwa = i10;
        this.qO = i11;
    }

    public boolean AlY() {
        return this.lG;
    }

    public long DSW() {
        return this.EH;
    }

    public int EH() {
        return this.Wwa;
    }

    public String GA() {
        if (eT()) {
            return this.f23477vc.f23462g;
        }
        a aVar = this.wN;
        if (aVar != null) {
            return aVar.f23462g;
        }
        return null;
    }

    public long NjR() {
        if (eT()) {
            return this.f23477vc.f23458c;
        }
        a aVar = this.wN;
        if (aVar != null) {
            return aVar.f23458c;
        }
        return 0L;
    }

    public String Sg() {
        return this.DSW;
    }

    public int Wwa() {
        return this.Ne;
    }

    public int YFl() {
        return this.bZ.optInt("pitaya_cache_size", 0);
    }

    public float YoT() {
        if (eT()) {
            this.f23477vc.getClass();
            return -1.0f;
        }
        a aVar = this.wN;
        if (aVar != null) {
            aVar.getClass();
        }
        return -1.0f;
    }

    public a aIu() {
        return this.wN;
    }

    public boolean eT() {
        a aVar;
        if (this.qO == 1 && (aVar = this.f23477vc) != null && !TextUtils.isEmpty(aVar.f23462g)) {
            if (d.f20275e == 2) {
                if (Build.VERSION.SDK_INT >= 26) {
                    return true;
                }
            } else if (this.Wwa == 1) {
                return true;
            }
        }
        return false;
    }

    public int lG() {
        return this.wXo;
    }

    public boolean nc() {
        if (eT()) {
            if (this.f23477vc.f23470o != 0) {
                return false;
            }
            return true;
        }
        a aVar = this.wN;
        if (aVar != null && aVar.f23470o != 0) {
            return false;
        }
        return true;
    }

    public String pDU() {
        if (eT()) {
            return this.f23477vc.c();
        }
        a aVar = this.wN;
        if (aVar != null) {
            return aVar.c();
        }
        return null;
    }

    public int qO() {
        return this.VOe;
    }

    public boolean qsH() {
        return this.rkt;
    }

    public int rkt() {
        return this.aIu;
    }

    public int tN() {
        if (eT()) {
            return this.f23477vc.a();
        }
        a aVar = this.wN;
        if (aVar != null) {
            return aVar.a();
        }
        return 0;
    }

    public int vc() {
        return this.GA;
    }

    public int wN() {
        return this.YoT;
    }

    public a wXo() {
        return this.f23477vc;
    }

    public void AlY(String str) {
        this.YFl = str;
    }

    public void DSW(int i10) {
        this.VOe = i10;
    }

    public void Sg(String str) {
        this.eT = str;
    }

    public void YFl(String str) {
        this.DSW = str;
    }

    public void vc(int i10) {
        this.Ne = i10;
    }

    public synchronized Object wN(String str) {
        return this.tN.get(str);
    }

    public void AlY(int i10) {
        this.aIu = i10;
    }

    public void Sg(int i10) {
        this.GA = i10;
    }

    public void YFl(int i10) {
        this.YoT = i10;
    }

    public void wN(int i10) {
        this.wXo = i10;
    }

    public void YFl(long j3) {
        this.EH = j3;
    }

    public void YFl(boolean z10) {
        this.rkt = z10;
    }

    public void tN(String str) {
        this.pDU = str;
    }

    public synchronized void YFl(String str, Object obj) {
        this.tN.put(str, obj);
    }

    public void tN(int i10) {
        this.Sg = i10;
    }
}

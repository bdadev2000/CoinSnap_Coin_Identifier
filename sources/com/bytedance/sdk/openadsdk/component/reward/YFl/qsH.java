package com.bytedance.sdk.openadsdk.component.reward.YFl;

import android.webkit.DownloadListener;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.model.Ne;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class qsH {
    public static int Sg = 1;
    public static int YFl = 0;
    public static int tN = 2;
    private final boolean AlY;

    /* renamed from: vc, reason: collision with root package name */
    @Nullable
    private NjR f10598vc;

    @Nullable
    private nc wN;

    public qsH(YFl yFl, com.bytedance.sdk.openadsdk.core.model.Wwa wwa) {
        nc ncVar;
        boolean jqV = wwa.jqV();
        this.AlY = jqV;
        if (jqV) {
            if (Ne.vc(wwa)) {
                ncVar = new DSW(yFl);
            } else {
                ncVar = new nc(yFl);
            }
            this.wN = ncVar;
            return;
        }
        this.f10598vc = new NjR(yFl);
    }

    public com.bytedance.sdk.openadsdk.qO.qsH AlY() {
        NjR njR = this.f10598vc;
        if (njR != null) {
            return njR.Wwa();
        }
        return null;
    }

    public boolean DSW() {
        NjR njR = this.f10598vc;
        if (njR != null) {
            return njR.EH();
        }
        return false;
    }

    public void EH() {
        if (this.AlY) {
            nc ncVar = this.wN;
            if (ncVar != null) {
                ncVar.YFl();
                return;
            }
            return;
        }
        NjR njR = this.f10598vc;
        if (njR != null) {
            njR.YFl();
        }
    }

    public void GA() {
        if (this.AlY) {
            nc ncVar = this.wN;
            if (ncVar != null) {
                ncVar.AlY();
                return;
            }
            return;
        }
        NjR njR = this.f10598vc;
        if (njR != null) {
            njR.eT();
        }
    }

    public long NjR() {
        if (this.f10598vc != null) {
            return r0.NjR();
        }
        return 0L;
    }

    public float Sg() {
        if (this.f10598vc != null) {
            return r0.nc();
        }
        return 0.0f;
    }

    public void Wwa() {
        nc ncVar = this.wN;
        if (ncVar != null) {
            ncVar.tN();
        }
    }

    public boolean YFl() {
        NjR njR = this.f10598vc;
        return njR != null && njR.lG();
    }

    public void YoT() {
        NjR njR = this.f10598vc;
        if (njR != null) {
            njR.AlY();
        }
    }

    public com.bytedance.sdk.openadsdk.YoT.AlY eT() {
        NjR njR = this.f10598vc;
        if (njR != null) {
            return njR.pDU();
        }
        return null;
    }

    public void lG() {
        nc ncVar = this.wN;
        if (ncVar != null) {
            ncVar.eT();
        }
    }

    public void nc() {
        NjR njR = this.f10598vc;
        if (njR != null) {
            njR.wN();
        }
    }

    public void pDU() {
        if (this.AlY) {
            nc ncVar = this.wN;
            if (ncVar != null) {
                ncVar.qsH();
                return;
            }
            return;
        }
        NjR njR = this.f10598vc;
        if (njR != null) {
            njR.GA();
        }
    }

    public void qsH() {
        NjR njR = this.f10598vc;
        if (njR != null) {
            njR.Sg();
        }
    }

    public void rkt() {
        if (this.AlY) {
            nc ncVar = this.wN;
            if (ncVar != null) {
                ncVar.wN();
                return;
            }
            return;
        }
        NjR njR = this.f10598vc;
        if (njR != null) {
            njR.YoT();
        }
    }

    public boolean tN() {
        NjR njR = this.f10598vc;
        if (njR != null) {
            return njR.rkt();
        }
        return true;
    }

    public void vc() {
        NjR njR = this.f10598vc;
        if (njR != null) {
            njR.DSW();
        }
    }

    public void wN() {
        NjR njR = this.f10598vc;
        if (njR != null) {
            njR.vc();
        }
    }

    public void YFl(int i10) {
        NjR njR = this.f10598vc;
        if (njR != null) {
            njR.Sg(i10);
        }
    }

    public void AlY(boolean z10) {
        NjR njR = this.f10598vc;
        if (njR != null) {
            njR.AlY(z10);
        }
    }

    public void DSW(int i10) {
        nc ncVar;
        if (this.AlY && i10 != tN && (ncVar = this.wN) != null) {
            ncVar.vc();
            return;
        }
        NjR njR = this.f10598vc;
        if (njR == null || i10 == Sg) {
            return;
        }
        njR.tN();
    }

    public int Sg(int i10) {
        NjR njR = this.f10598vc;
        if (njR != null) {
            return njR.AlY(i10);
        }
        return 0;
    }

    public boolean qsH(int i10) {
        if (this.AlY && i10 == Sg) {
            nc ncVar = this.wN;
            if (ncVar != null) {
                return ncVar.nc();
            }
            return false;
        }
        NjR njR = this.f10598vc;
        if (njR != null) {
            return njR.qsH();
        }
        return false;
    }

    public void tN(int i10) {
        NjR njR = this.f10598vc;
        if (njR != null) {
            njR.tN(i10);
        }
    }

    public void vc(int i10) {
        if (this.AlY) {
            nc ncVar = this.wN;
            if (ncVar != null) {
                ncVar.Sg(i10);
                return;
            }
            return;
        }
        NjR njR = this.f10598vc;
        if (njR != null) {
            njR.vc(i10);
        }
    }

    public void wN(boolean z10) {
        NjR njR = this.f10598vc;
        if (njR != null) {
            njR.wN(z10);
        }
    }

    public void YFl(boolean z10) {
        NjR njR = this.f10598vc;
        if (njR != null) {
            njR.Sg(z10);
        }
    }

    public boolean AlY(int i10) {
        if (this.AlY) {
            nc ncVar = this.wN;
            if (ncVar != null) {
                return ncVar.NjR();
            }
        } else {
            NjR njR = this.f10598vc;
            if (njR != null && njR.NjR() - this.f10598vc.nc() >= i10) {
                return true;
            }
        }
        return false;
    }

    public void Sg(boolean z10) {
        NjR njR = this.f10598vc;
        if (njR != null) {
            njR.vc(z10);
        }
    }

    public void tN(boolean z10) {
        NjR njR = this.f10598vc;
        if (njR != null) {
            njR.YFl(z10);
        }
    }

    public void wN(int i10) {
        if (this.AlY) {
            nc ncVar = this.wN;
            if (ncVar != null) {
                ncVar.YFl(i10);
                return;
            }
            return;
        }
        NjR njR = this.f10598vc;
        if (njR != null) {
            njR.YFl(i10);
        }
    }

    public void YFl(JSONObject jSONObject) {
        NjR njR = this.f10598vc;
        if (njR != null) {
            njR.YFl(jSONObject);
        }
    }

    public void Sg(String str) {
        NjR njR = this.f10598vc;
        if (njR != null) {
            njR.Sg(str);
        }
    }

    public void tN(String str) {
        NjR njR = this.f10598vc;
        if (njR != null) {
            njR.YFl(str);
        }
    }

    public void YFl(int i10, com.bytedance.sdk.openadsdk.core.model.Wwa wwa, boolean z10) {
        NjR njR = this.f10598vc;
        if (njR != null) {
            njR.YFl(i10, wwa, z10);
        }
    }

    public void vc(boolean z10) {
        nc ncVar = this.wN;
        if (ncVar != null) {
            ncVar.Sg(z10);
        }
    }

    public void YFl(DownloadListener downloadListener) {
        NjR njR = this.f10598vc;
        if (njR != null) {
            njR.YFl(downloadListener);
        }
    }

    public void YFl(String str) {
        NjR njR = this.f10598vc;
        if (njR != null) {
            njR.tN(str);
        }
    }

    public void YFl(int i10, String str, String str2) {
        NjR njR = this.f10598vc;
        if (njR != null) {
            njR.YFl(i10, str, str2);
        }
    }

    public void YFl(boolean z10, String str, int i10) {
        NjR njR = this.f10598vc;
        if (njR != null) {
            njR.YFl(z10, str, i10);
        }
    }

    public void YFl(com.bytedance.sdk.openadsdk.core.Sg.wN wNVar) {
        if (this.AlY) {
            nc ncVar = this.wN;
            if (ncVar != null) {
                ncVar.YFl(wNVar);
                return;
            }
            return;
        }
        NjR njR = this.f10598vc;
        if (njR != null) {
            njR.YFl(wNVar);
        }
    }

    public void YFl(com.bytedance.sdk.openadsdk.YoT.wN wNVar, boolean z10) {
        if (this.AlY) {
            nc ncVar = this.wN;
            if (ncVar != null) {
                ncVar.YFl(z10);
                return;
            }
            return;
        }
        NjR njR = this.f10598vc;
        if (njR != null) {
            njR.YFl(wNVar, z10);
        }
    }
}

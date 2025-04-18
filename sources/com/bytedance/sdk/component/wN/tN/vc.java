package com.bytedance.sdk.component.wN.tN;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.sdk.component.wN.GA;
import com.bytedance.sdk.component.wN.Wwa;
import com.bytedance.sdk.component.wN.YoT;
import com.bytedance.sdk.component.wN.lG;
import com.bytedance.sdk.component.wN.qO;
import com.bytedance.sdk.component.wN.wXo;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class vc {
    private YoT DSW;
    private lG NjR;
    private final GA Sg;
    private ExecutorService qsH;

    /* renamed from: vc, reason: collision with root package name */
    private com.bytedance.sdk.component.wN.AlY f10483vc;
    private Map<String, List<tN>> YFl = new ConcurrentHashMap();
    private Map<String, Wwa> tN = new HashMap();
    private Map<String, qO> AlY = new HashMap();
    private Map<String, com.bytedance.sdk.component.wN.tN> wN = new HashMap();

    public vc(Context context, GA ga2) {
        this.Sg = (GA) qsH.YFl(ga2);
        com.bytedance.sdk.component.wN.tN.YFl.YFl.YFl(context, ga2.NjR());
    }

    private Wwa AlY(com.bytedance.sdk.component.wN.Sg sg2) {
        Wwa wN = this.Sg.wN();
        if (wN != null) {
            return com.bytedance.sdk.component.wN.tN.YFl.Sg.YFl.YFl(wN);
        }
        return com.bytedance.sdk.component.wN.tN.YFl.Sg.YFl.YFl(sg2.Sg());
    }

    private com.bytedance.sdk.component.wN.AlY NjR() {
        com.bytedance.sdk.component.wN.AlY AlY = this.Sg.AlY();
        if (AlY == null) {
            return com.bytedance.sdk.component.wN.Sg.Sg.YFl();
        }
        return AlY;
    }

    private lG YoT() {
        lG qsH = this.Sg.qsH();
        if (qsH == null) {
            return new DSW();
        }
        return qsH;
    }

    private ExecutorService eT() {
        ExecutorService Sg = this.Sg.Sg();
        if (Sg != null) {
            return Sg;
        }
        return com.bytedance.sdk.component.wN.YFl.tN.YFl();
    }

    private YoT nc() {
        YoT YFl = this.Sg.YFl();
        if (YFl != null) {
            return YFl;
        }
        return com.bytedance.sdk.component.wN.YFl.Sg.YFl();
    }

    private com.bytedance.sdk.component.wN.tN vc(com.bytedance.sdk.component.wN.Sg sg2) {
        com.bytedance.sdk.component.wN.tN DSW = this.Sg.DSW();
        return DSW != null ? DSW : new com.bytedance.sdk.component.wN.tN.YFl.YFl.Sg(sg2.wN(), sg2.YFl(), vc());
    }

    private qO wN(com.bytedance.sdk.component.wN.Sg sg2) {
        qO vc2 = this.Sg.vc();
        return vc2 != null ? vc2 : com.bytedance.sdk.component.wN.tN.YFl.Sg.wN.YFl(sg2.Sg());
    }

    public Map<String, List<tN>> DSW() {
        return this.YFl;
    }

    public Collection<qO> Sg() {
        return this.AlY.values();
    }

    public Collection<Wwa> YFl() {
        return this.tN.values();
    }

    public lG qsH() {
        if (this.NjR == null) {
            this.NjR = YoT();
        }
        return this.NjR;
    }

    public Collection<com.bytedance.sdk.component.wN.tN> tN() {
        return this.wN.values();
    }

    public qO Sg(com.bytedance.sdk.component.wN.Sg sg2) {
        if (sg2 == null) {
            sg2 = com.bytedance.sdk.component.wN.tN.YFl.YFl.DSW();
        }
        String file = sg2.wN().toString();
        qO qOVar = this.AlY.get(file);
        if (qOVar != null) {
            return qOVar;
        }
        qO wN = wN(sg2);
        this.AlY.put(file, wN);
        return wN;
    }

    public Wwa YFl(com.bytedance.sdk.component.wN.Sg sg2) {
        if (sg2 == null) {
            sg2 = com.bytedance.sdk.component.wN.tN.YFl.YFl.DSW();
        }
        String file = sg2.wN().toString();
        Wwa wwa = this.tN.get(file);
        if (wwa != null) {
            return wwa;
        }
        Wwa AlY = AlY(sg2);
        this.tN.put(file, AlY);
        return AlY;
    }

    public com.bytedance.sdk.component.wN.tN tN(com.bytedance.sdk.component.wN.Sg sg2) {
        if (sg2 == null) {
            sg2 = com.bytedance.sdk.component.wN.tN.YFl.YFl.DSW();
        }
        String file = sg2.wN().toString();
        com.bytedance.sdk.component.wN.tN tNVar = this.wN.get(file);
        if (tNVar != null) {
            return tNVar;
        }
        com.bytedance.sdk.component.wN.tN vc2 = vc(sg2);
        this.wN.put(file, vc2);
        return vc2;
    }

    public ExecutorService vc() {
        ExecutorService YFl;
        wXo tN = this.Sg.tN();
        if (tN != null && (YFl = tN.YFl()) != null) {
            return YFl;
        }
        if (this.qsH == null) {
            this.qsH = eT();
        }
        return this.qsH;
    }

    public YoT wN() {
        if (this.DSW == null) {
            this.DSW = nc();
        }
        return this.DSW;
    }

    public com.bytedance.sdk.component.wN.AlY AlY() {
        if (this.f10483vc == null) {
            this.f10483vc = NjR();
        }
        return this.f10483vc;
    }

    public com.bytedance.sdk.component.wN.tN YFl(String str) {
        return tN(com.bytedance.sdk.component.wN.tN.YFl.YFl.YFl(new File(str)));
    }

    public com.bytedance.sdk.component.wN.tN.Sg.YFl YFl(tN tNVar) {
        ImageView.ScaleType AlY = tNVar.AlY();
        if (AlY == null) {
            AlY = com.bytedance.sdk.component.wN.tN.Sg.YFl.YFl;
        }
        ImageView.ScaleType scaleType = AlY;
        Bitmap.Config eT = tNVar.eT();
        if (eT == null) {
            eT = com.bytedance.sdk.component.wN.tN.Sg.YFl.Sg;
        }
        return new com.bytedance.sdk.component.wN.tN.Sg.YFl(tNVar.Sg(), tNVar.tN(), scaleType, eT, tNVar.DSW(), tNVar.qsH());
    }
}

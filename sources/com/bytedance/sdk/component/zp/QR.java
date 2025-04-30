package com.bytedance.sdk.component.zp;

import com.bytedance.component.sdk.annotation.MainThread;
import com.bytedance.sdk.component.zp.FP;
import com.bytedance.sdk.component.zp.jU;
import com.bytedance.sdk.component.zp.ot;
import com.bytedance.sdk.component.zp.pvr;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;

/* loaded from: classes.dex */
class QR implements ot.zp {
    private final tG QR;
    private final boolean YW;
    private final com.bytedance.sdk.component.zp.zp dT;
    private final boolean ku;
    private final cz lMd;
    private final ku zp;
    private final Map<String, lMd> KS = new HashMap();
    private final Map<String, jU.lMd> jU = new HashMap();
    private final List<KVG> COT = new ArrayList();
    private final Set<jU> HWF = new HashSet();

    /* loaded from: classes.dex */
    public static final class zp {
        String lMd;
        boolean zp;

        private zp(boolean z8, String str) {
            this.zp = z8;
            this.lMd = str;
        }
    }

    public QR(dT dTVar, com.bytedance.sdk.component.zp.zp zpVar, FP fp) {
        this.dT = zpVar;
        this.zp = dTVar.jU;
        cz czVar = new cz(fp, dTVar.vDp, dTVar.tG);
        this.lMd = czVar;
        czVar.zp(this);
        czVar.zp(dTVar.KVG);
        this.QR = dTVar.YW;
        this.ku = dTVar.ku;
        this.YW = dTVar.dQp;
    }

    private yRU lMd(String str, lMd lmd) {
        if (this.YW) {
            return yRU.PRIVATE;
        }
        return this.lMd.zp(this.ku, str, lmd);
    }

    @MainThread
    public zp zp(KVG kvg, HWF hwf) throws Exception {
        lMd lmd = this.KS.get(kvg.jU);
        if (lmd != null) {
            try {
                yRU lMd = lMd(hwf.lMd, lmd);
                hwf.jU = lMd;
                if (lMd != null) {
                    if (lmd instanceof COT) {
                        kvg.toString();
                        return zp(kvg, (COT) lmd, hwf);
                    }
                    if (lmd instanceof KS) {
                        kvg.toString();
                        return zp(kvg, (KS) lmd, lMd);
                    }
                } else {
                    kvg.toString();
                    throw new vwr(-1);
                }
            } catch (FP.zp unused) {
                kvg.toString();
                this.COT.add(kvg);
                return new zp(false, ox.zp());
            }
        }
        jU.lMd lmd2 = this.jU.get(kvg.jU);
        if (lmd2 != null) {
            jU zp2 = lmd2.zp();
            zp2.zp(kvg.jU);
            yRU lMd2 = lMd(hwf.lMd, zp2);
            hwf.jU = lMd2;
            if (lMd2 != null) {
                kvg.toString();
                return zp(kvg, zp2, hwf);
            }
            kvg.toString();
            zp2.jU();
            throw new vwr(-1);
        }
        kvg.toString();
        return null;
    }

    public void zp(String str, COT<?, ?> cot) {
        cot.zp(str);
        this.KS.put(str, cot);
    }

    public void zp(String str, jU.lMd lmd) {
        this.jU.put(str, lmd);
    }

    public void zp() {
        Iterator<jU> it = this.HWF.iterator();
        while (it.hasNext()) {
            it.next().COT();
        }
        this.HWF.clear();
        this.KS.clear();
        this.jU.clear();
        this.lMd.lMd(this);
    }

    @MainThread
    private zp zp(KVG kvg, COT cot, HWF hwf) throws Exception {
        return new zp(true, ox.zp(this.zp.zp((ku) cot.zp(zp(kvg.COT, (lMd) cot), hwf))));
    }

    @MainThread
    private zp zp(final KVG kvg, final jU jUVar, HWF hwf) throws Exception {
        this.HWF.add(jUVar);
        jUVar.zp(zp(kvg.COT, jUVar), hwf, new jU.zp() { // from class: com.bytedance.sdk.component.zp.QR.1
            @Override // com.bytedance.sdk.component.zp.jU.zp
            public void zp(Object obj) {
                if (QR.this.dT == null) {
                    return;
                }
                QR.this.dT.lMd(ox.zp(QR.this.zp.zp((ku) obj)), kvg);
                QR.this.HWF.remove(jUVar);
            }

            @Override // com.bytedance.sdk.component.zp.jU.zp
            public void zp(Throwable th) {
                if (QR.this.dT == null) {
                    return;
                }
                QR.this.dT.lMd(ox.zp(th), kvg);
                QR.this.HWF.remove(jUVar);
            }
        });
        return new zp(false, ox.zp());
    }

    @MainThread
    private zp zp(final KVG kvg, KS ks, yRU yru) throws Exception {
        new pvr(kvg.jU, yru, new pvr.zp() { // from class: com.bytedance.sdk.component.zp.QR.2
        });
        return new zp(false, ox.zp());
    }

    private Object zp(String str, lMd lmd) throws JSONException {
        return this.zp.zp(str, zp(lmd)[0]);
    }

    private static Type[] zp(Object obj) {
        Type genericSuperclass = obj.getClass().getGenericSuperclass();
        if (genericSuperclass != null) {
            return ((ParameterizedType) genericSuperclass).getActualTypeArguments();
        }
        throw new IllegalStateException("Method is not parameterized?!");
    }
}

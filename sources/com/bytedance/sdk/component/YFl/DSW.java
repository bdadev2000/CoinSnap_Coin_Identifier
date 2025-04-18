package com.bytedance.sdk.component.YFl;

import com.bytedance.component.sdk.annotation.MainThread;
import com.bytedance.sdk.component.YFl.AlY;
import com.bytedance.sdk.component.YFl.Ne;
import com.bytedance.sdk.component.YFl.qO;
import com.bytedance.sdk.component.YFl.wXo;
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

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class DSW implements Ne.YFl {
    private final GA DSW;
    private final boolean NjR;
    private final aIu Sg;
    private final qsH YFl;

    /* renamed from: nc, reason: collision with root package name */
    private final com.bytedance.sdk.component.YFl.YFl f10339nc;
    private final boolean qsH;
    private final Map<String, Sg> tN = new HashMap();
    private final Map<String, AlY.Sg> AlY = new HashMap();
    private final List<rkt> wN = new ArrayList();

    /* renamed from: vc, reason: collision with root package name */
    private final Set<AlY> f10340vc = new HashSet();

    /* loaded from: classes.dex */
    public static final class YFl {
        String Sg;
        boolean YFl;

        private YFl(boolean z10, String str) {
            this.YFl = z10;
            this.Sg = str;
        }
    }

    public DSW(nc ncVar, com.bytedance.sdk.component.YFl.YFl yFl, wXo wxo) {
        this.f10339nc = yFl;
        this.YFl = ncVar.AlY;
        aIu aiu = new aIu(wxo, ncVar.YoT, ncVar.GA);
        this.Sg = aiu;
        aiu.YFl(this);
        aiu.YFl(ncVar.rkt);
        this.DSW = ncVar.NjR;
        this.qsH = ncVar.qsH;
        this.NjR = ncVar.EH;
    }

    private VOe Sg(String str, Sg sg2) {
        if (this.NjR) {
            return VOe.PRIVATE;
        }
        return this.Sg.YFl(this.qsH, str, sg2);
    }

    @MainThread
    public YFl YFl(rkt rktVar, vc vcVar) throws Exception {
        Sg sg2 = this.tN.get(rktVar.AlY);
        if (sg2 != null) {
            try {
                VOe Sg = Sg(vcVar.Sg, sg2);
                vcVar.AlY = Sg;
                if (Sg != null) {
                    if (sg2 instanceof wN) {
                        rktVar.toString();
                        return YFl(rktVar, (wN) sg2, vcVar);
                    }
                    if (sg2 instanceof tN) {
                        rktVar.toString();
                        return YFl(rktVar, (tN) sg2, Sg);
                    }
                } else {
                    rktVar.toString();
                    throw new Wwa(-1);
                }
            } catch (wXo.YFl unused) {
                rktVar.toString();
                this.wN.add(rktVar);
                return new YFl(false, bZ.YFl());
            }
        }
        AlY.Sg sg3 = this.AlY.get(rktVar.AlY);
        if (sg3 != null) {
            AlY YFl2 = sg3.YFl();
            YFl2.YFl(rktVar.AlY);
            VOe Sg2 = Sg(vcVar.Sg, YFl2);
            vcVar.AlY = Sg2;
            if (Sg2 != null) {
                rktVar.toString();
                return YFl(rktVar, YFl2, vcVar);
            }
            rktVar.toString();
            YFl2.AlY();
            throw new Wwa(-1);
        }
        rktVar.toString();
        return null;
    }

    public void YFl(String str, wN<?, ?> wNVar) {
        wNVar.YFl(str);
        this.tN.put(str, wNVar);
    }

    public void YFl(String str, AlY.Sg sg2) {
        this.AlY.put(str, sg2);
    }

    public void YFl() {
        Iterator<AlY> it = this.f10340vc.iterator();
        while (it.hasNext()) {
            it.next().wN();
        }
        this.f10340vc.clear();
        this.tN.clear();
        this.AlY.clear();
        this.Sg.Sg(this);
    }

    @MainThread
    private YFl YFl(rkt rktVar, wN wNVar, vc vcVar) throws Exception {
        return new YFl(true, bZ.YFl(this.YFl.YFl((qsH) wNVar.YFl(YFl(rktVar.wN, (Sg) wNVar), vcVar))));
    }

    @MainThread
    private YFl YFl(final rkt rktVar, final AlY alY, vc vcVar) throws Exception {
        this.f10340vc.add(alY);
        alY.YFl(YFl(rktVar.wN, alY), vcVar, new AlY.YFl() { // from class: com.bytedance.sdk.component.YFl.DSW.1
            @Override // com.bytedance.sdk.component.YFl.AlY.YFl
            public void YFl(Object obj) {
                if (DSW.this.f10339nc == null) {
                    return;
                }
                DSW.this.f10339nc.Sg(bZ.YFl(DSW.this.YFl.YFl((qsH) obj)), rktVar);
                DSW.this.f10340vc.remove(alY);
            }

            @Override // com.bytedance.sdk.component.YFl.AlY.YFl
            public void YFl(Throwable th2) {
                if (DSW.this.f10339nc == null) {
                    return;
                }
                DSW.this.f10339nc.Sg(bZ.YFl(th2), rktVar);
                DSW.this.f10340vc.remove(alY);
            }
        });
        return new YFl(false, bZ.YFl());
    }

    @MainThread
    private YFl YFl(final rkt rktVar, tN tNVar, VOe vOe) throws Exception {
        new qO(rktVar.AlY, vOe, new qO.YFl() { // from class: com.bytedance.sdk.component.YFl.DSW.2
        });
        return new YFl(false, bZ.YFl());
    }

    private Object YFl(String str, Sg sg2) throws JSONException {
        return this.YFl.YFl(str, YFl(sg2)[0]);
    }

    private static Type[] YFl(Object obj) {
        Type genericSuperclass = obj.getClass().getGenericSuperclass();
        if (genericSuperclass != null) {
            return ((ParameterizedType) genericSuperclass).getActualTypeArguments();
        }
        throw new IllegalStateException("Method is not parameterized?!");
    }
}

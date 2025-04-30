package com.bytedance.sdk.component.zp;

import android.net.Uri;
import com.bytedance.component.sdk.annotation.MainThread;
import com.bytedance.sdk.component.zp.Bj;
import com.bytedance.sdk.component.zp.FP;
import com.bytedance.sdk.component.zp.ot;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class cz {
    private Bj.zp COT;
    private final ot KS = woN.zp;
    private final FP jU;
    private final Set<String> lMd;
    private final Set<String> zp;

    public cz(FP fp, Set<String> set, Set<String> set2) {
        this.jU = fp;
        if (set != null && !set.isEmpty()) {
            this.zp = new LinkedHashSet(set);
        } else {
            this.zp = new LinkedHashSet();
        }
        if (set2 != null && !set2.isEmpty()) {
            this.lMd = new LinkedHashSet(set2);
        } else {
            this.lMd = new LinkedHashSet();
        }
    }

    public final synchronized yRU lMd(String str, lMd lmd) {
        return zp(str, lmd, false);
    }

    @MainThread
    public final synchronized yRU zp(boolean z8, String str, lMd lmd) throws FP.zp {
        yRU lMd;
        Bj.zp zpVar;
        try {
            Uri parse = Uri.parse(str);
            String host = parse.getHost();
            if (host == null) {
                return null;
            }
            yRU yru = this.lMd.contains(lmd.zp()) ? yRU.PUBLIC : null;
            for (String str2 : this.zp) {
                if (parse.getHost().equals(str2) || host.endsWith(".".concat(String.valueOf(str2)))) {
                    yru = yRU.PRIVATE;
                    break;
                }
            }
            if (yru == null && (zpVar = this.COT) != null && zpVar.zp(str)) {
                if (this.COT.zp(str, lmd.zp())) {
                    return null;
                }
                yru = yRU.PRIVATE;
            }
            if (z8) {
                lMd = zp(str, lmd);
            } else {
                lMd = lMd(str, lmd);
            }
            return lMd != null ? lMd : yru;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void lMd(ot.zp zpVar) {
        if (this.KS != null) {
            throw null;
        }
    }

    @MainThread
    public final synchronized yRU zp(String str, lMd lmd) throws FP.zp {
        return zp(str, lmd, true);
    }

    public void zp(Bj.zp zpVar) {
        this.COT = zpVar;
    }

    public void zp(ot.zp zpVar) {
        if (this.KS != null) {
            throw null;
        }
    }

    private yRU zp(String str, lMd lmd, boolean z8) {
        if (!z8 || this.jU == null) {
            return null;
        }
        throw null;
    }
}

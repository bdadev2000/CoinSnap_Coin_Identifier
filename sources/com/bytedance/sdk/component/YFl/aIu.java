package com.bytedance.sdk.component.YFl;

import android.net.Uri;
import com.bytedance.component.sdk.annotation.MainThread;
import com.bytedance.sdk.component.YFl.Ne;
import com.bytedance.sdk.component.YFl.eT;
import com.bytedance.sdk.component.YFl.wXo;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class aIu {
    private final wXo AlY;
    private final Set<String> Sg;
    private final Set<String> YFl;
    private final Ne tN = lG.YFl;
    private eT.YFl wN;

    public aIu(wXo wxo, Set<String> set, Set<String> set2) {
        this.AlY = wxo;
        if (set != null && !set.isEmpty()) {
            this.YFl = new LinkedHashSet(set);
        } else {
            this.YFl = new LinkedHashSet();
        }
        if (set2 != null && !set2.isEmpty()) {
            this.Sg = new LinkedHashSet(set2);
        } else {
            this.Sg = new LinkedHashSet();
        }
    }

    public final synchronized VOe Sg(String str, Sg sg2) {
        return YFl(str, sg2, false);
    }

    @MainThread
    public final synchronized VOe YFl(boolean z10, String str, Sg sg2) throws wXo.YFl {
        VOe Sg;
        eT.YFl yFl;
        Uri parse = Uri.parse(str);
        String host = parse.getHost();
        if (host == null) {
            return null;
        }
        VOe vOe = this.Sg.contains(sg2.YFl()) ? VOe.PUBLIC : null;
        for (String str2 : this.YFl) {
            if (parse.getHost().equals(str2) || host.endsWith(".".concat(String.valueOf(str2)))) {
                vOe = VOe.PRIVATE;
                break;
            }
        }
        if (vOe == null && (yFl = this.wN) != null && yFl.YFl(str)) {
            if (this.wN.YFl(str, sg2.YFl())) {
                return null;
            }
            vOe = VOe.PRIVATE;
        }
        if (z10) {
            Sg = YFl(str, sg2);
        } else {
            Sg = Sg(str, sg2);
        }
        return Sg != null ? Sg : vOe;
    }

    public void Sg(Ne.YFl yFl) {
        if (this.tN != null) {
            throw null;
        }
    }

    @MainThread
    public final synchronized VOe YFl(String str, Sg sg2) throws wXo.YFl {
        return YFl(str, sg2, true);
    }

    public void YFl(eT.YFl yFl) {
        this.wN = yFl;
    }

    public void YFl(Ne.YFl yFl) {
        if (this.tN != null) {
            throw null;
        }
    }

    private VOe YFl(String str, Sg sg2, boolean z10) {
        if (!z10 || this.AlY == null) {
            return null;
        }
        throw null;
    }
}

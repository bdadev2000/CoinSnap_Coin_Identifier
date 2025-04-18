package com.facebook.ads.redexgen.uinode;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.cN, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1241cN {
    public final Map<String, C1253ca> A00;
    public final Set<C1253ca> A01;

    public C1241cN() {
        this.A00 = new HashMap();
        this.A01 = new HashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Collection<C1253ca> A00() {
        return this.A01;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Collection<C1253ca> A01() {
        return this.A00.values();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        this.A00.clear();
        for (C1253ca c1253ca : this.A01) {
            this.A00.put(c1253ca.A04, c1253ca);
        }
        this.A01.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A06(C1253ca c1253ca) {
        if (this.A01.add(c1253ca)) {
            this.A00.remove(c1253ca.A04);
            return true;
        }
        return false;
    }
}

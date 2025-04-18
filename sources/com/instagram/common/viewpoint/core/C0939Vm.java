package com.instagram.common.viewpoint.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.facebook.ads.redexgen.X.Vm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0939Vm implements InterfaceC0676Lj {
    public final Collection<String> A00;

    public C0939Vm() {
        this.A00 = new ArrayList();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0676Lj
    public final void AEb(String str) {
        this.A00.add(str);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0676Lj
    public final void flush() {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.A00.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append('\n');
        }
        return sb.toString();
    }
}

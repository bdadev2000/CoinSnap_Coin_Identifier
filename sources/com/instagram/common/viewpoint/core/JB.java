package com.instagram.common.viewpoint.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: assets/audience_network.dex */
public class JB implements InterfaceC1268dj {
    public final /* synthetic */ C0612Is A00;

    public JB(C0612Is c0612Is) {
        this.A00 = c0612Is;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1268dj
    public final void ADV() {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap3;
        LinkedHashMap linkedHashMap4;
        InterfaceC1268dj interfaceC1268dj;
        InterfaceC1268dj interfaceC1268dj2;
        linkedHashMap = this.A00.A06;
        synchronized (linkedHashMap) {
            linkedHashMap2 = this.A00.A06;
            arrayList = new ArrayList(linkedHashMap2.size());
            linkedHashMap3 = this.A00.A06;
            for (Runnable runnable : linkedHashMap3.values()) {
                if (runnable != null) {
                    arrayList.add(runnable);
                }
            }
            linkedHashMap4 = this.A00.A06;
            linkedHashMap4.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        interfaceC1268dj = this.A00.A00;
        if (interfaceC1268dj != null) {
            interfaceC1268dj2 = this.A00.A00;
            interfaceC1268dj2.ADV();
        }
    }
}

package com.meta.analytics.dsp.uinode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: assets/audience_network.dex */
public class HD implements InterfaceC1815cV {
    public final /* synthetic */ C1814cU A00;

    public HD(C1814cU c1814cU) {
        this.A00 = c1814cU;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1815cV
    public final void AD2() {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap3;
        LinkedHashMap linkedHashMap4;
        InterfaceC1815cV interfaceC1815cV;
        InterfaceC1815cV interfaceC1815cV2;
        linkedHashMap = this.A00.A05;
        synchronized (linkedHashMap) {
            linkedHashMap2 = this.A00.A05;
            arrayList = new ArrayList(linkedHashMap2.size());
            linkedHashMap3 = this.A00.A05;
            for (Runnable runnable : linkedHashMap3.values()) {
                if (runnable != null) {
                    arrayList.add(runnable);
                }
            }
            linkedHashMap4 = this.A00.A05;
            linkedHashMap4.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        interfaceC1815cV = this.A00.A00;
        if (interfaceC1815cV == null) {
            return;
        }
        interfaceC1815cV2 = this.A00.A00;
        interfaceC1815cV2.AD2();
    }
}

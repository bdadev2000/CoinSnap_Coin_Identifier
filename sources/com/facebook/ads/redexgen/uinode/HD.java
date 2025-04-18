package com.facebook.ads.redexgen.uinode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: assets/audience_network.dex */
public class HD implements InterfaceC1249cV {
    public final /* synthetic */ C1248cU A00;

    public HD(C1248cU c1248cU) {
        this.A00 = c1248cU;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC1249cV
    public final void AD2() {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap3;
        LinkedHashMap linkedHashMap4;
        InterfaceC1249cV interfaceC1249cV;
        InterfaceC1249cV interfaceC1249cV2;
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
        interfaceC1249cV = this.A00.A00;
        if (interfaceC1249cV == null) {
            return;
        }
        interfaceC1249cV2 = this.A00.A00;
        interfaceC1249cV2.AD2();
    }
}

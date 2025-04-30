package com.google.protobuf;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class B4 extends K4 {
    public B4(int i9) {
        super(i9, null);
    }

    @Override // com.google.protobuf.K4
    public void makeImmutable() {
        if (!isImmutable()) {
            for (int i9 = 0; i9 < getNumArrayEntries(); i9++) {
                Map.Entry<Comparable<Object>, Object> arrayEntryAt = getArrayEntryAt(i9);
                if (((I2) ((InterfaceC1994s2) arrayEntryAt.getKey())).isRepeated()) {
                    arrayEntryAt.setValue(Collections.unmodifiableList((List) arrayEntryAt.getValue()));
                }
            }
            for (Map.Entry<Comparable<Object>, Object> entry : getOverflowEntries()) {
                if (((I2) ((InterfaceC1994s2) entry.getKey())).isRepeated()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.makeImmutable();
    }

    @Override // com.google.protobuf.K4, java.util.AbstractMap, java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return super.put((Comparable<Object>) obj, obj2);
    }
}

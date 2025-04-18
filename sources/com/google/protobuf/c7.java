package com.google.protobuf;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class c7 extends l7 {
    public c7(int i10) {
        super(i10, null);
    }

    @Override // com.google.protobuf.l7
    public void makeImmutable() {
        if (!isImmutable()) {
            for (int i10 = 0; i10 < getNumArrayEntries(); i10++) {
                Map.Entry<Comparable<Object>, Object> arrayEntryAt = getArrayEntryAt(i10);
                if (((l3) ((w2) arrayEntryAt.getKey())).isRepeated()) {
                    arrayEntryAt.setValue(Collections.unmodifiableList((List) arrayEntryAt.getValue()));
                }
            }
            for (Map.Entry<Comparable<Object>, Object> entry : getOverflowEntries()) {
                if (((l3) ((w2) entry.getKey())).isRepeated()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.makeImmutable();
    }

    @Override // com.google.protobuf.l7, java.util.AbstractMap, java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return super.put((Comparable<Object>) obj, obj2);
    }
}

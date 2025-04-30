package com.google.protobuf;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.protobuf.q5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1984q5 extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;
    private final List<String> missingFields;

    public C1984q5(N3 n32) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.missingFields = null;
    }

    private static String buildDescription(List<String> list) {
        StringBuilder sb = new StringBuilder("Message missing required fields: ");
        boolean z8 = true;
        for (String str : list) {
            if (z8) {
                z8 = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public C1912g3 asInvalidProtocolBufferException() {
        return new C1912g3(getMessage());
    }

    public List<String> getMissingFields() {
        return Collections.unmodifiableList(this.missingFields);
    }

    public C1984q5(List<String> list) {
        super(buildDescription(list));
        this.missingFields = list;
    }
}

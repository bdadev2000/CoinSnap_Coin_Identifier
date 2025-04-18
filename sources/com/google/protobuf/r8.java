package com.google.protobuf;

import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class r8 extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;
    private final List<String> missingFields;

    public r8(o5 o5Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.missingFields = null;
    }

    private static String buildDescription(List<String> list) {
        StringBuilder sb2 = new StringBuilder("Message missing required fields: ");
        boolean z10 = true;
        for (String str : list) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(str);
        }
        return sb2.toString();
    }

    public h4 asInvalidProtocolBufferException() {
        return new h4(getMessage());
    }

    public List<String> getMissingFields() {
        return Collections.unmodifiableList(this.missingFields);
    }

    public r8(List<String> list) {
        super(buildDescription(list));
        this.missingFields = list;
    }
}

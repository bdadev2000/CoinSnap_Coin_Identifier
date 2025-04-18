package com.google.protobuf;

import java.io.IOException;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class b2 {
    public abstract int extensionNumber(Map.Entry<?, ?> entry);

    public abstract Object findExtensionByNumber(a2 a2Var, o5 o5Var, int i10);

    public abstract x2 getExtensions(Object obj);

    public abstract x2 getMutableExtensions(Object obj);

    public abstract boolean hasExtensions(o5 o5Var);

    public abstract void makeImmutable(Object obj);

    public abstract <UT, UB> UB parseExtension(Object obj, t6 t6Var, Object obj2, a2 a2Var, x2 x2Var, UB ub2, s8 s8Var) throws IOException;

    public abstract void parseLengthPrefixedMessageSetItem(t6 t6Var, Object obj, a2 a2Var, x2 x2Var) throws IOException;

    public abstract void parseMessageSetItem(h0 h0Var, Object obj, a2 a2Var, x2 x2Var) throws IOException;

    public abstract void serializeExtension(ba baVar, Map.Entry<?, ?> entry) throws IOException;

    public abstract void setExtensions(Object obj, x2 x2Var);
}

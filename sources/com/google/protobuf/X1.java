package com.google.protobuf;

import java.io.IOException;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class X1 {
    public abstract int extensionNumber(Map.Entry<?, ?> entry);

    public abstract Object findExtensionByNumber(W1 w1, N3 n32, int i9);

    public abstract C2001t2 getExtensions(Object obj);

    public abstract C2001t2 getMutableExtensions(Object obj);

    public abstract boolean hasExtensions(N3 n32);

    public abstract void makeImmutable(Object obj);

    public abstract <UT, UB> UB parseExtension(Object obj, InterfaceC1996s4 interfaceC1996s4, Object obj2, W1 w1, C2001t2 c2001t2, UB ub, AbstractC1990r5 abstractC1990r5) throws IOException;

    public abstract void parseLengthPrefixedMessageSetItem(InterfaceC1996s4 interfaceC1996s4, Object obj, W1 w1, C2001t2 c2001t2) throws IOException;

    public abstract void parseMessageSetItem(H h6, Object obj, W1 w1, C2001t2 c2001t2) throws IOException;

    public abstract void serializeExtension(a6 a6Var, Map.Entry<?, ?> entry) throws IOException;

    public abstract void setExtensions(Object obj, C2001t2 c2001t2);
}

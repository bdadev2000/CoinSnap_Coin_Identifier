package com.google.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class W1 {
    static final W1 EMPTY_REGISTRY_LITE = new W1(true);
    static final String EXTENSION_CLASS_NAME = "com.google.protobuf.Extension";
    private static boolean doFullRuntimeInheritanceCheck = true;
    private static volatile boolean eagerlyParseMessageSets = false;
    private static volatile W1 emptyRegistry;
    private final Map<V1, J2> extensionsByNumber;

    public W1() {
        this.extensionsByNumber = new HashMap();
    }

    public static W1 getEmptyRegistry() {
        W1 w1 = emptyRegistry;
        if (w1 == null) {
            synchronized (W1.class) {
                try {
                    w1 = emptyRegistry;
                    if (w1 == null) {
                        if (doFullRuntimeInheritanceCheck) {
                            w1 = T1.createEmpty();
                        } else {
                            w1 = EMPTY_REGISTRY_LITE;
                        }
                        emptyRegistry = w1;
                    }
                } finally {
                }
            }
        }
        return w1;
    }

    public static boolean isEagerlyParseMessageSets() {
        return eagerlyParseMessageSets;
    }

    public static W1 newInstance() {
        if (doFullRuntimeInheritanceCheck) {
            return T1.create();
        }
        return new W1();
    }

    public static void setEagerlyParseMessageSets(boolean z8) {
        eagerlyParseMessageSets = z8;
    }

    public final void add(J2 j22) {
        this.extensionsByNumber.put(new V1(j22.getContainingTypeDefaultInstance(), j22.getNumber()), j22);
    }

    public <ContainingType extends N3> J2 findLiteExtensionByNumber(ContainingType containingtype, int i9) {
        return this.extensionsByNumber.get(new V1(containingtype, i9));
    }

    public W1 getUnmodifiable() {
        return new W1(this);
    }

    public W1(W1 w1) {
        if (w1 == EMPTY_REGISTRY_LITE) {
            this.extensionsByNumber = Collections.emptyMap();
        } else {
            this.extensionsByNumber = Collections.unmodifiableMap(w1.extensionsByNumber);
        }
    }

    public final void add(S1 s1) {
        if (J2.class.isAssignableFrom(s1.getClass())) {
            add((J2) s1);
        }
        if (doFullRuntimeInheritanceCheck && T1.isFullRegistry(this)) {
            try {
                W1.class.getMethod("add", U1.INSTANCE).invoke(this, s1);
            } catch (Exception e4) {
                throw new IllegalArgumentException(String.format("Could not invoke ExtensionRegistry#add for %s", s1), e4);
            }
        }
    }

    public W1(boolean z8) {
        this.extensionsByNumber = Collections.emptyMap();
    }
}

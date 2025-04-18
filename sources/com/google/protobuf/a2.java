package com.google.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class a2 {
    static final a2 EMPTY_REGISTRY_LITE = new a2(true);
    static final String EXTENSION_CLASS_NAME = "com.google.protobuf.Extension";
    private static boolean doFullRuntimeInheritanceCheck = true;
    private static volatile boolean eagerlyParseMessageSets = false;
    private static volatile a2 emptyRegistry;
    private final Map<z1, m3> extensionsByNumber;

    public a2() {
        this.extensionsByNumber = new HashMap();
    }

    public static a2 getEmptyRegistry() {
        a2 a2Var = emptyRegistry;
        if (a2Var == null) {
            synchronized (a2.class) {
                a2Var = emptyRegistry;
                if (a2Var == null) {
                    if (doFullRuntimeInheritanceCheck) {
                        a2Var = x1.createEmpty();
                    } else {
                        a2Var = EMPTY_REGISTRY_LITE;
                    }
                    emptyRegistry = a2Var;
                }
            }
        }
        return a2Var;
    }

    public static boolean isEagerlyParseMessageSets() {
        return eagerlyParseMessageSets;
    }

    public static a2 newInstance() {
        if (doFullRuntimeInheritanceCheck) {
            return x1.create();
        }
        return new a2();
    }

    public static void setEagerlyParseMessageSets(boolean z10) {
        eagerlyParseMessageSets = z10;
    }

    public final void add(m3 m3Var) {
        this.extensionsByNumber.put(new z1(m3Var.getContainingTypeDefaultInstance(), m3Var.getNumber()), m3Var);
    }

    public <ContainingType extends o5> m3 findLiteExtensionByNumber(ContainingType containingtype, int i10) {
        return this.extensionsByNumber.get(new z1(containingtype, i10));
    }

    public a2 getUnmodifiable() {
        return new a2(this);
    }

    public a2(a2 a2Var) {
        if (a2Var == EMPTY_REGISTRY_LITE) {
            this.extensionsByNumber = Collections.emptyMap();
        } else {
            this.extensionsByNumber = Collections.unmodifiableMap(a2Var.extensionsByNumber);
        }
    }

    public final void add(w1 w1Var) {
        if (m3.class.isAssignableFrom(w1Var.getClass())) {
            add((m3) w1Var);
        }
        if (doFullRuntimeInheritanceCheck && x1.isFullRegistry(this)) {
            try {
                a2.class.getMethod("add", y1.INSTANCE).invoke(this, w1Var);
            } catch (Exception e2) {
                throw new IllegalArgumentException(String.format("Could not invoke ExtensionRegistry#add for %s", w1Var), e2);
            }
        }
    }

    public a2(boolean z10) {
        this.extensionsByNumber = Collections.emptyMap();
    }
}

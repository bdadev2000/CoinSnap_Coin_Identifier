package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class V4 {
    private int[] checkInitialized;
    private Object defaultInstance;
    private final List<C1946l2> fields;
    private boolean messageSetWireFormat;
    private EnumC1962n4 syntax;
    private boolean wasBuilt;

    public V4() {
        this.checkInitialized = null;
        this.fields = new ArrayList();
    }

    public W4 build() {
        if (!this.wasBuilt) {
            if (this.syntax != null) {
                this.wasBuilt = true;
                Collections.sort(this.fields);
                return new W4(this.syntax, this.messageSetWireFormat, this.checkInitialized, (C1946l2[]) this.fields.toArray(new C1946l2[0]), this.defaultInstance);
            }
            throw new IllegalStateException("Must specify a proto syntax");
        }
        throw new IllegalStateException("Builder can only build once");
    }

    public void withCheckInitialized(int[] iArr) {
        this.checkInitialized = iArr;
    }

    public void withDefaultInstance(Object obj) {
        this.defaultInstance = obj;
    }

    public void withField(C1946l2 c1946l2) {
        if (!this.wasBuilt) {
            this.fields.add(c1946l2);
            return;
        }
        throw new IllegalStateException("Builder can only build once");
    }

    public void withMessageSetWireFormat(boolean z8) {
        this.messageSetWireFormat = z8;
    }

    public void withSyntax(EnumC1962n4 enumC1962n4) {
        this.syntax = (EnumC1962n4) C1898e3.checkNotNull(enumC1962n4, "syntax");
    }

    public V4(int i9) {
        this.checkInitialized = null;
        this.fields = new ArrayList(i9);
    }
}

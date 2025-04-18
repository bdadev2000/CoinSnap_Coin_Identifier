package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class w7 {
    private int[] checkInitialized;
    private Object defaultInstance;
    private final List<p2> fields;
    private boolean messageSetWireFormat;
    private o6 syntax;
    private boolean wasBuilt;

    public w7() {
        this.checkInitialized = null;
        this.fields = new ArrayList();
    }

    public x7 build() {
        if (!this.wasBuilt) {
            if (this.syntax != null) {
                this.wasBuilt = true;
                Collections.sort(this.fields);
                return new x7(this.syntax, this.messageSetWireFormat, this.checkInitialized, (p2[]) this.fields.toArray(new p2[0]), this.defaultInstance);
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

    public void withField(p2 p2Var) {
        if (!this.wasBuilt) {
            this.fields.add(p2Var);
            return;
        }
        throw new IllegalStateException("Builder can only build once");
    }

    public void withMessageSetWireFormat(boolean z10) {
        this.messageSetWireFormat = z10;
    }

    public void withSyntax(o6 o6Var) {
        this.syntax = (o6) f4.checkNotNull(o6Var, "syntax");
    }

    public w7(int i10) {
        this.checkInitialized = null;
        this.fields = new ArrayList(i10);
    }
}

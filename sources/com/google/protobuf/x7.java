package com.google.protobuf;

/* loaded from: classes4.dex */
public final class x7 implements l5 {
    private final int[] checkInitialized;
    private final o5 defaultInstance;
    private final p2[] fields;
    private final boolean messageSetWireFormat;
    private final o6 syntax;

    public x7(o6 o6Var, boolean z10, int[] iArr, p2[] p2VarArr, Object obj) {
        this.syntax = o6Var;
        this.messageSetWireFormat = z10;
        this.checkInitialized = iArr;
        this.fields = p2VarArr;
        this.defaultInstance = (o5) f4.checkNotNull(obj, "defaultInstance");
    }

    public static w7 newBuilder() {
        return new w7();
    }

    public int[] getCheckInitialized() {
        return this.checkInitialized;
    }

    @Override // com.google.protobuf.l5
    public o5 getDefaultInstance() {
        return this.defaultInstance;
    }

    public p2[] getFields() {
        return this.fields;
    }

    @Override // com.google.protobuf.l5
    public o6 getSyntax() {
        return this.syntax;
    }

    @Override // com.google.protobuf.l5
    public boolean isMessageSetWireFormat() {
        return this.messageSetWireFormat;
    }

    public static w7 newBuilder(int i10) {
        return new w7(i10);
    }
}

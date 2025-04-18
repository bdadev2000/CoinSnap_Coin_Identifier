package com.google.protobuf;

import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class r2 extends h3 implements s2 {
    public /* synthetic */ r2(q2 q2Var) {
        this();
    }

    public r2 addAllPaths(Iterable<String> iterable) {
        copyOnWrite();
        FieldMask.access$300((FieldMask) this.instance, iterable);
        return this;
    }

    public r2 addPaths(String str) {
        copyOnWrite();
        FieldMask.access$200((FieldMask) this.instance, str);
        return this;
    }

    public r2 addPathsBytes(h0 h0Var) {
        copyOnWrite();
        FieldMask.access$500((FieldMask) this.instance, h0Var);
        return this;
    }

    public r2 clearPaths() {
        copyOnWrite();
        FieldMask.access$400((FieldMask) this.instance);
        return this;
    }

    @Override // com.google.protobuf.s2
    public String getPaths(int i10) {
        return ((FieldMask) this.instance).getPaths(i10);
    }

    @Override // com.google.protobuf.s2
    public h0 getPathsBytes(int i10) {
        return ((FieldMask) this.instance).getPathsBytes(i10);
    }

    @Override // com.google.protobuf.s2
    public int getPathsCount() {
        return ((FieldMask) this.instance).getPathsCount();
    }

    @Override // com.google.protobuf.s2
    public List<String> getPathsList() {
        return Collections.unmodifiableList(((FieldMask) this.instance).getPathsList());
    }

    public r2 setPaths(int i10, String str) {
        copyOnWrite();
        FieldMask.access$100((FieldMask) this.instance, i10, str);
        return this;
    }

    private r2() {
        super(FieldMask.access$000());
    }
}

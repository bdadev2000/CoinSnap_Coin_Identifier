package com.google.protobuf;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.protobuf.n2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1960n2 extends D2 implements InterfaceC1967o2 {
    public /* synthetic */ C1960n2(AbstractC1953m2 abstractC1953m2) {
        this();
    }

    public C1960n2 addAllPaths(Iterable<String> iterable) {
        copyOnWrite();
        FieldMask.access$300((FieldMask) this.instance, iterable);
        return this;
    }

    public C1960n2 addPaths(String str) {
        copyOnWrite();
        FieldMask.access$200((FieldMask) this.instance, str);
        return this;
    }

    public C1960n2 addPathsBytes(H h6) {
        copyOnWrite();
        FieldMask.access$500((FieldMask) this.instance, h6);
        return this;
    }

    public C1960n2 clearPaths() {
        copyOnWrite();
        FieldMask.access$400((FieldMask) this.instance);
        return this;
    }

    @Override // com.google.protobuf.InterfaceC1967o2
    public String getPaths(int i9) {
        return ((FieldMask) this.instance).getPaths(i9);
    }

    @Override // com.google.protobuf.InterfaceC1967o2
    public H getPathsBytes(int i9) {
        return ((FieldMask) this.instance).getPathsBytes(i9);
    }

    @Override // com.google.protobuf.InterfaceC1967o2
    public int getPathsCount() {
        return ((FieldMask) this.instance).getPathsCount();
    }

    @Override // com.google.protobuf.InterfaceC1967o2
    public List<String> getPathsList() {
        return Collections.unmodifiableList(((FieldMask) this.instance).getPathsList());
    }

    public C1960n2 setPaths(int i9, String str) {
        copyOnWrite();
        FieldMask.access$100((FieldMask) this.instance, i9, str);
        return this;
    }

    private C1960n2() {
        super(FieldMask.access$000());
    }
}

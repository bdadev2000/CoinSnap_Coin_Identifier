package com.google.protobuf;

import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class S0 extends D2 implements T0 {
    public /* synthetic */ S0(AbstractC1916h0 abstractC1916h0) {
        this();
    }

    public S0 addAllFile(Iterable<? extends DescriptorProtos$FileDescriptorProto> iterable) {
        copyOnWrite();
        DescriptorProtos$FileDescriptorSet.access$400((DescriptorProtos$FileDescriptorSet) this.instance, iterable);
        return this;
    }

    public S0 addFile(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
        copyOnWrite();
        DescriptorProtos$FileDescriptorSet.access$200((DescriptorProtos$FileDescriptorSet) this.instance, descriptorProtos$FileDescriptorProto);
        return this;
    }

    public S0 clearFile() {
        copyOnWrite();
        DescriptorProtos$FileDescriptorSet.access$500((DescriptorProtos$FileDescriptorSet) this.instance);
        return this;
    }

    @Override // com.google.protobuf.T0
    public DescriptorProtos$FileDescriptorProto getFile(int i9) {
        return ((DescriptorProtos$FileDescriptorSet) this.instance).getFile(i9);
    }

    @Override // com.google.protobuf.T0
    public int getFileCount() {
        return ((DescriptorProtos$FileDescriptorSet) this.instance).getFileCount();
    }

    @Override // com.google.protobuf.T0
    public List<DescriptorProtos$FileDescriptorProto> getFileList() {
        return Collections.unmodifiableList(((DescriptorProtos$FileDescriptorSet) this.instance).getFileList());
    }

    public S0 removeFile(int i9) {
        copyOnWrite();
        DescriptorProtos$FileDescriptorSet.access$600((DescriptorProtos$FileDescriptorSet) this.instance, i9);
        return this;
    }

    public S0 setFile(int i9, DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
        copyOnWrite();
        DescriptorProtos$FileDescriptorSet.access$100((DescriptorProtos$FileDescriptorSet) this.instance, i9, descriptorProtos$FileDescriptorProto);
        return this;
    }

    private S0() {
        super(DescriptorProtos$FileDescriptorSet.access$000());
    }

    public S0 addFile(int i9, DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
        copyOnWrite();
        DescriptorProtos$FileDescriptorSet.access$300((DescriptorProtos$FileDescriptorSet) this.instance, i9, descriptorProtos$FileDescriptorProto);
        return this;
    }

    public S0 setFile(int i9, Q0 q02) {
        copyOnWrite();
        DescriptorProtos$FileDescriptorSet.access$100((DescriptorProtos$FileDescriptorSet) this.instance, i9, (DescriptorProtos$FileDescriptorProto) q02.build());
        return this;
    }

    public S0 addFile(Q0 q02) {
        copyOnWrite();
        DescriptorProtos$FileDescriptorSet.access$200((DescriptorProtos$FileDescriptorSet) this.instance, (DescriptorProtos$FileDescriptorProto) q02.build());
        return this;
    }

    public S0 addFile(int i9, Q0 q02) {
        copyOnWrite();
        DescriptorProtos$FileDescriptorSet.access$300((DescriptorProtos$FileDescriptorSet) this.instance, i9, (DescriptorProtos$FileDescriptorProto) q02.build());
        return this;
    }
}

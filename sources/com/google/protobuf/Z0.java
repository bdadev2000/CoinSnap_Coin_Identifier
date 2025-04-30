package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$GeneratedCodeInfo;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class Z0 extends D2 implements InterfaceC1868a1 {
    public /* synthetic */ Z0(AbstractC1916h0 abstractC1916h0) {
        this();
    }

    public Z0 addAllPath(Iterable<? extends Integer> iterable) {
        copyOnWrite();
        ((DescriptorProtos$GeneratedCodeInfo.Annotation) this.instance).addAllPath(iterable);
        return this;
    }

    public Z0 addPath(int i9) {
        copyOnWrite();
        ((DescriptorProtos$GeneratedCodeInfo.Annotation) this.instance).addPath(i9);
        return this;
    }

    public Z0 clearBegin() {
        copyOnWrite();
        ((DescriptorProtos$GeneratedCodeInfo.Annotation) this.instance).clearBegin();
        return this;
    }

    public Z0 clearEnd() {
        copyOnWrite();
        ((DescriptorProtos$GeneratedCodeInfo.Annotation) this.instance).clearEnd();
        return this;
    }

    public Z0 clearPath() {
        copyOnWrite();
        ((DescriptorProtos$GeneratedCodeInfo.Annotation) this.instance).clearPath();
        return this;
    }

    public Z0 clearSourceFile() {
        copyOnWrite();
        ((DescriptorProtos$GeneratedCodeInfo.Annotation) this.instance).clearSourceFile();
        return this;
    }

    @Override // com.google.protobuf.InterfaceC1868a1
    public int getBegin() {
        return ((DescriptorProtos$GeneratedCodeInfo.Annotation) this.instance).getBegin();
    }

    @Override // com.google.protobuf.InterfaceC1868a1
    public int getEnd() {
        return ((DescriptorProtos$GeneratedCodeInfo.Annotation) this.instance).getEnd();
    }

    @Override // com.google.protobuf.InterfaceC1868a1
    public int getPath(int i9) {
        return ((DescriptorProtos$GeneratedCodeInfo.Annotation) this.instance).getPath(i9);
    }

    @Override // com.google.protobuf.InterfaceC1868a1
    public int getPathCount() {
        return ((DescriptorProtos$GeneratedCodeInfo.Annotation) this.instance).getPathCount();
    }

    @Override // com.google.protobuf.InterfaceC1868a1
    public List<Integer> getPathList() {
        return Collections.unmodifiableList(((DescriptorProtos$GeneratedCodeInfo.Annotation) this.instance).getPathList());
    }

    @Override // com.google.protobuf.InterfaceC1868a1
    public String getSourceFile() {
        return ((DescriptorProtos$GeneratedCodeInfo.Annotation) this.instance).getSourceFile();
    }

    @Override // com.google.protobuf.InterfaceC1868a1
    public H getSourceFileBytes() {
        return ((DescriptorProtos$GeneratedCodeInfo.Annotation) this.instance).getSourceFileBytes();
    }

    @Override // com.google.protobuf.InterfaceC1868a1
    public boolean hasBegin() {
        return ((DescriptorProtos$GeneratedCodeInfo.Annotation) this.instance).hasBegin();
    }

    @Override // com.google.protobuf.InterfaceC1868a1
    public boolean hasEnd() {
        return ((DescriptorProtos$GeneratedCodeInfo.Annotation) this.instance).hasEnd();
    }

    @Override // com.google.protobuf.InterfaceC1868a1
    public boolean hasSourceFile() {
        return ((DescriptorProtos$GeneratedCodeInfo.Annotation) this.instance).hasSourceFile();
    }

    public Z0 setBegin(int i9) {
        copyOnWrite();
        ((DescriptorProtos$GeneratedCodeInfo.Annotation) this.instance).setBegin(i9);
        return this;
    }

    public Z0 setEnd(int i9) {
        copyOnWrite();
        ((DescriptorProtos$GeneratedCodeInfo.Annotation) this.instance).setEnd(i9);
        return this;
    }

    public Z0 setPath(int i9, int i10) {
        copyOnWrite();
        ((DescriptorProtos$GeneratedCodeInfo.Annotation) this.instance).setPath(i9, i10);
        return this;
    }

    public Z0 setSourceFile(String str) {
        copyOnWrite();
        ((DescriptorProtos$GeneratedCodeInfo.Annotation) this.instance).setSourceFile(str);
        return this;
    }

    public Z0 setSourceFileBytes(H h6) {
        copyOnWrite();
        ((DescriptorProtos$GeneratedCodeInfo.Annotation) this.instance).setSourceFileBytes(h6);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private Z0() {
        /*
            r1 = this;
            com.google.protobuf.DescriptorProtos$GeneratedCodeInfo$Annotation r0 = com.google.protobuf.DescriptorProtos$GeneratedCodeInfo.Annotation.access$45500()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Z0.<init>():void");
    }
}

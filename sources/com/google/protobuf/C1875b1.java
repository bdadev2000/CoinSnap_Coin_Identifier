package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$GeneratedCodeInfo;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.protobuf.b1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1875b1 extends D2 implements InterfaceC1882c1 {
    public /* synthetic */ C1875b1(AbstractC1916h0 abstractC1916h0) {
        this();
    }

    public C1875b1 addAllAnnotation(Iterable<? extends DescriptorProtos$GeneratedCodeInfo.Annotation> iterable) {
        copyOnWrite();
        ((DescriptorProtos$GeneratedCodeInfo) this.instance).addAllAnnotation(iterable);
        return this;
    }

    public C1875b1 addAnnotation(DescriptorProtos$GeneratedCodeInfo.Annotation annotation) {
        copyOnWrite();
        ((DescriptorProtos$GeneratedCodeInfo) this.instance).addAnnotation(annotation);
        return this;
    }

    public C1875b1 clearAnnotation() {
        copyOnWrite();
        ((DescriptorProtos$GeneratedCodeInfo) this.instance).clearAnnotation();
        return this;
    }

    @Override // com.google.protobuf.InterfaceC1882c1
    public DescriptorProtos$GeneratedCodeInfo.Annotation getAnnotation(int i9) {
        return ((DescriptorProtos$GeneratedCodeInfo) this.instance).getAnnotation(i9);
    }

    @Override // com.google.protobuf.InterfaceC1882c1
    public int getAnnotationCount() {
        return ((DescriptorProtos$GeneratedCodeInfo) this.instance).getAnnotationCount();
    }

    @Override // com.google.protobuf.InterfaceC1882c1
    public List<DescriptorProtos$GeneratedCodeInfo.Annotation> getAnnotationList() {
        return Collections.unmodifiableList(((DescriptorProtos$GeneratedCodeInfo) this.instance).getAnnotationList());
    }

    public C1875b1 removeAnnotation(int i9) {
        copyOnWrite();
        ((DescriptorProtos$GeneratedCodeInfo) this.instance).removeAnnotation(i9);
        return this;
    }

    public C1875b1 setAnnotation(int i9, DescriptorProtos$GeneratedCodeInfo.Annotation annotation) {
        copyOnWrite();
        ((DescriptorProtos$GeneratedCodeInfo) this.instance).setAnnotation(i9, annotation);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private C1875b1() {
        /*
            r1 = this;
            com.google.protobuf.DescriptorProtos$GeneratedCodeInfo r0 = com.google.protobuf.DescriptorProtos$GeneratedCodeInfo.access$46800()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C1875b1.<init>():void");
    }

    public C1875b1 addAnnotation(int i9, DescriptorProtos$GeneratedCodeInfo.Annotation annotation) {
        copyOnWrite();
        ((DescriptorProtos$GeneratedCodeInfo) this.instance).addAnnotation(i9, annotation);
        return this;
    }

    public C1875b1 setAnnotation(int i9, Z0 z02) {
        copyOnWrite();
        ((DescriptorProtos$GeneratedCodeInfo) this.instance).setAnnotation(i9, (DescriptorProtos$GeneratedCodeInfo.Annotation) z02.build());
        return this;
    }

    public C1875b1 addAnnotation(Z0 z02) {
        copyOnWrite();
        ((DescriptorProtos$GeneratedCodeInfo) this.instance).addAnnotation((DescriptorProtos$GeneratedCodeInfo.Annotation) z02.build());
        return this;
    }

    public C1875b1 addAnnotation(int i9, Z0 z02) {
        copyOnWrite();
        ((DescriptorProtos$GeneratedCodeInfo) this.instance).addAnnotation(i9, (DescriptorProtos$GeneratedCodeInfo.Annotation) z02.build());
        return this;
    }
}

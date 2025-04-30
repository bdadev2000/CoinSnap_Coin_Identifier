package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$SourceCodeInfo;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.protobuf.v1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2014v1 extends D2 implements InterfaceC2021w1 {
    public /* synthetic */ C2014v1(AbstractC1916h0 abstractC1916h0) {
        this();
    }

    public C2014v1 addAllLeadingDetachedComments(Iterable<String> iterable) {
        copyOnWrite();
        ((DescriptorProtos$SourceCodeInfo.Location) this.instance).addAllLeadingDetachedComments(iterable);
        return this;
    }

    public C2014v1 addAllPath(Iterable<? extends Integer> iterable) {
        copyOnWrite();
        ((DescriptorProtos$SourceCodeInfo.Location) this.instance).addAllPath(iterable);
        return this;
    }

    public C2014v1 addAllSpan(Iterable<? extends Integer> iterable) {
        copyOnWrite();
        ((DescriptorProtos$SourceCodeInfo.Location) this.instance).addAllSpan(iterable);
        return this;
    }

    public C2014v1 addLeadingDetachedComments(String str) {
        copyOnWrite();
        ((DescriptorProtos$SourceCodeInfo.Location) this.instance).addLeadingDetachedComments(str);
        return this;
    }

    public C2014v1 addLeadingDetachedCommentsBytes(H h6) {
        copyOnWrite();
        ((DescriptorProtos$SourceCodeInfo.Location) this.instance).addLeadingDetachedCommentsBytes(h6);
        return this;
    }

    public C2014v1 addPath(int i9) {
        copyOnWrite();
        ((DescriptorProtos$SourceCodeInfo.Location) this.instance).addPath(i9);
        return this;
    }

    public C2014v1 addSpan(int i9) {
        copyOnWrite();
        ((DescriptorProtos$SourceCodeInfo.Location) this.instance).addSpan(i9);
        return this;
    }

    public C2014v1 clearLeadingComments() {
        copyOnWrite();
        ((DescriptorProtos$SourceCodeInfo.Location) this.instance).clearLeadingComments();
        return this;
    }

    public C2014v1 clearLeadingDetachedComments() {
        copyOnWrite();
        ((DescriptorProtos$SourceCodeInfo.Location) this.instance).clearLeadingDetachedComments();
        return this;
    }

    public C2014v1 clearPath() {
        copyOnWrite();
        ((DescriptorProtos$SourceCodeInfo.Location) this.instance).clearPath();
        return this;
    }

    public C2014v1 clearSpan() {
        copyOnWrite();
        ((DescriptorProtos$SourceCodeInfo.Location) this.instance).clearSpan();
        return this;
    }

    public C2014v1 clearTrailingComments() {
        copyOnWrite();
        ((DescriptorProtos$SourceCodeInfo.Location) this.instance).clearTrailingComments();
        return this;
    }

    @Override // com.google.protobuf.InterfaceC2021w1
    public String getLeadingComments() {
        return ((DescriptorProtos$SourceCodeInfo.Location) this.instance).getLeadingComments();
    }

    @Override // com.google.protobuf.InterfaceC2021w1
    public H getLeadingCommentsBytes() {
        return ((DescriptorProtos$SourceCodeInfo.Location) this.instance).getLeadingCommentsBytes();
    }

    @Override // com.google.protobuf.InterfaceC2021w1
    public String getLeadingDetachedComments(int i9) {
        return ((DescriptorProtos$SourceCodeInfo.Location) this.instance).getLeadingDetachedComments(i9);
    }

    @Override // com.google.protobuf.InterfaceC2021w1
    public H getLeadingDetachedCommentsBytes(int i9) {
        return ((DescriptorProtos$SourceCodeInfo.Location) this.instance).getLeadingDetachedCommentsBytes(i9);
    }

    @Override // com.google.protobuf.InterfaceC2021w1
    public int getLeadingDetachedCommentsCount() {
        return ((DescriptorProtos$SourceCodeInfo.Location) this.instance).getLeadingDetachedCommentsCount();
    }

    @Override // com.google.protobuf.InterfaceC2021w1
    public List<String> getLeadingDetachedCommentsList() {
        return Collections.unmodifiableList(((DescriptorProtos$SourceCodeInfo.Location) this.instance).getLeadingDetachedCommentsList());
    }

    @Override // com.google.protobuf.InterfaceC2021w1
    public int getPath(int i9) {
        return ((DescriptorProtos$SourceCodeInfo.Location) this.instance).getPath(i9);
    }

    @Override // com.google.protobuf.InterfaceC2021w1
    public int getPathCount() {
        return ((DescriptorProtos$SourceCodeInfo.Location) this.instance).getPathCount();
    }

    @Override // com.google.protobuf.InterfaceC2021w1
    public List<Integer> getPathList() {
        return Collections.unmodifiableList(((DescriptorProtos$SourceCodeInfo.Location) this.instance).getPathList());
    }

    @Override // com.google.protobuf.InterfaceC2021w1
    public int getSpan(int i9) {
        return ((DescriptorProtos$SourceCodeInfo.Location) this.instance).getSpan(i9);
    }

    @Override // com.google.protobuf.InterfaceC2021w1
    public int getSpanCount() {
        return ((DescriptorProtos$SourceCodeInfo.Location) this.instance).getSpanCount();
    }

    @Override // com.google.protobuf.InterfaceC2021w1
    public List<Integer> getSpanList() {
        return Collections.unmodifiableList(((DescriptorProtos$SourceCodeInfo.Location) this.instance).getSpanList());
    }

    @Override // com.google.protobuf.InterfaceC2021w1
    public String getTrailingComments() {
        return ((DescriptorProtos$SourceCodeInfo.Location) this.instance).getTrailingComments();
    }

    @Override // com.google.protobuf.InterfaceC2021w1
    public H getTrailingCommentsBytes() {
        return ((DescriptorProtos$SourceCodeInfo.Location) this.instance).getTrailingCommentsBytes();
    }

    @Override // com.google.protobuf.InterfaceC2021w1
    public boolean hasLeadingComments() {
        return ((DescriptorProtos$SourceCodeInfo.Location) this.instance).hasLeadingComments();
    }

    @Override // com.google.protobuf.InterfaceC2021w1
    public boolean hasTrailingComments() {
        return ((DescriptorProtos$SourceCodeInfo.Location) this.instance).hasTrailingComments();
    }

    public C2014v1 setLeadingComments(String str) {
        copyOnWrite();
        ((DescriptorProtos$SourceCodeInfo.Location) this.instance).setLeadingComments(str);
        return this;
    }

    public C2014v1 setLeadingCommentsBytes(H h6) {
        copyOnWrite();
        ((DescriptorProtos$SourceCodeInfo.Location) this.instance).setLeadingCommentsBytes(h6);
        return this;
    }

    public C2014v1 setLeadingDetachedComments(int i9, String str) {
        copyOnWrite();
        ((DescriptorProtos$SourceCodeInfo.Location) this.instance).setLeadingDetachedComments(i9, str);
        return this;
    }

    public C2014v1 setPath(int i9, int i10) {
        copyOnWrite();
        ((DescriptorProtos$SourceCodeInfo.Location) this.instance).setPath(i9, i10);
        return this;
    }

    public C2014v1 setSpan(int i9, int i10) {
        copyOnWrite();
        ((DescriptorProtos$SourceCodeInfo.Location) this.instance).setSpan(i9, i10);
        return this;
    }

    public C2014v1 setTrailingComments(String str) {
        copyOnWrite();
        ((DescriptorProtos$SourceCodeInfo.Location) this.instance).setTrailingComments(str);
        return this;
    }

    public C2014v1 setTrailingCommentsBytes(H h6) {
        copyOnWrite();
        ((DescriptorProtos$SourceCodeInfo.Location) this.instance).setTrailingCommentsBytes(h6);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private C2014v1() {
        /*
            r1 = this;
            com.google.protobuf.DescriptorProtos$SourceCodeInfo$Location r0 = com.google.protobuf.DescriptorProtos$SourceCodeInfo.Location.access$42600()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C2014v1.<init>():void");
    }
}

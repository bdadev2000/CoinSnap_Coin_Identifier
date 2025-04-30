package com.google.protobuf;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.protobuf.d1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1889d1 extends F2 implements InterfaceC1896e1 {
    public /* synthetic */ C1889d1(AbstractC1916h0 abstractC1916h0) {
        this();
    }

    public C1889d1 addAllUninterpretedOption(Iterable<? extends DescriptorProtos$UninterpretedOption> iterable) {
        copyOnWrite();
        DescriptorProtos$MessageOptions.access$32100((DescriptorProtos$MessageOptions) this.instance, iterable);
        return this;
    }

    public C1889d1 addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        copyOnWrite();
        DescriptorProtos$MessageOptions.access$31900((DescriptorProtos$MessageOptions) this.instance, descriptorProtos$UninterpretedOption);
        return this;
    }

    public C1889d1 clearDeprecated() {
        copyOnWrite();
        DescriptorProtos$MessageOptions.access$31500((DescriptorProtos$MessageOptions) this.instance);
        return this;
    }

    public C1889d1 clearMapEntry() {
        copyOnWrite();
        DescriptorProtos$MessageOptions.access$31700((DescriptorProtos$MessageOptions) this.instance);
        return this;
    }

    public C1889d1 clearMessageSetWireFormat() {
        copyOnWrite();
        DescriptorProtos$MessageOptions.access$31100((DescriptorProtos$MessageOptions) this.instance);
        return this;
    }

    public C1889d1 clearNoStandardDescriptorAccessor() {
        copyOnWrite();
        DescriptorProtos$MessageOptions.access$31300((DescriptorProtos$MessageOptions) this.instance);
        return this;
    }

    public C1889d1 clearUninterpretedOption() {
        copyOnWrite();
        DescriptorProtos$MessageOptions.access$32200((DescriptorProtos$MessageOptions) this.instance);
        return this;
    }

    @Override // com.google.protobuf.InterfaceC1896e1
    public boolean getDeprecated() {
        return ((DescriptorProtos$MessageOptions) this.instance).getDeprecated();
    }

    @Override // com.google.protobuf.InterfaceC1896e1
    public boolean getMapEntry() {
        return ((DescriptorProtos$MessageOptions) this.instance).getMapEntry();
    }

    @Override // com.google.protobuf.InterfaceC1896e1
    public boolean getMessageSetWireFormat() {
        return ((DescriptorProtos$MessageOptions) this.instance).getMessageSetWireFormat();
    }

    @Override // com.google.protobuf.InterfaceC1896e1
    public boolean getNoStandardDescriptorAccessor() {
        return ((DescriptorProtos$MessageOptions) this.instance).getNoStandardDescriptorAccessor();
    }

    @Override // com.google.protobuf.InterfaceC1896e1
    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i9) {
        return ((DescriptorProtos$MessageOptions) this.instance).getUninterpretedOption(i9);
    }

    @Override // com.google.protobuf.InterfaceC1896e1
    public int getUninterpretedOptionCount() {
        return ((DescriptorProtos$MessageOptions) this.instance).getUninterpretedOptionCount();
    }

    @Override // com.google.protobuf.InterfaceC1896e1
    public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
        return Collections.unmodifiableList(((DescriptorProtos$MessageOptions) this.instance).getUninterpretedOptionList());
    }

    @Override // com.google.protobuf.InterfaceC1896e1
    public boolean hasDeprecated() {
        return ((DescriptorProtos$MessageOptions) this.instance).hasDeprecated();
    }

    @Override // com.google.protobuf.InterfaceC1896e1
    public boolean hasMapEntry() {
        return ((DescriptorProtos$MessageOptions) this.instance).hasMapEntry();
    }

    @Override // com.google.protobuf.InterfaceC1896e1
    public boolean hasMessageSetWireFormat() {
        return ((DescriptorProtos$MessageOptions) this.instance).hasMessageSetWireFormat();
    }

    @Override // com.google.protobuf.InterfaceC1896e1
    public boolean hasNoStandardDescriptorAccessor() {
        return ((DescriptorProtos$MessageOptions) this.instance).hasNoStandardDescriptorAccessor();
    }

    public C1889d1 removeUninterpretedOption(int i9) {
        copyOnWrite();
        DescriptorProtos$MessageOptions.access$32300((DescriptorProtos$MessageOptions) this.instance, i9);
        return this;
    }

    public C1889d1 setDeprecated(boolean z8) {
        copyOnWrite();
        DescriptorProtos$MessageOptions.access$31400((DescriptorProtos$MessageOptions) this.instance, z8);
        return this;
    }

    public C1889d1 setMapEntry(boolean z8) {
        copyOnWrite();
        DescriptorProtos$MessageOptions.access$31600((DescriptorProtos$MessageOptions) this.instance, z8);
        return this;
    }

    public C1889d1 setMessageSetWireFormat(boolean z8) {
        copyOnWrite();
        DescriptorProtos$MessageOptions.access$31000((DescriptorProtos$MessageOptions) this.instance, z8);
        return this;
    }

    public C1889d1 setNoStandardDescriptorAccessor(boolean z8) {
        copyOnWrite();
        DescriptorProtos$MessageOptions.access$31200((DescriptorProtos$MessageOptions) this.instance, z8);
        return this;
    }

    public C1889d1 setUninterpretedOption(int i9, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        copyOnWrite();
        DescriptorProtos$MessageOptions.access$31800((DescriptorProtos$MessageOptions) this.instance, i9, descriptorProtos$UninterpretedOption);
        return this;
    }

    private C1889d1() {
        super(DescriptorProtos$MessageOptions.access$30900());
    }

    public C1889d1 addUninterpretedOption(int i9, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        copyOnWrite();
        DescriptorProtos$MessageOptions.access$32000((DescriptorProtos$MessageOptions) this.instance, i9, descriptorProtos$UninterpretedOption);
        return this;
    }

    public C1889d1 setUninterpretedOption(int i9, C2035y1 c2035y1) {
        copyOnWrite();
        DescriptorProtos$MessageOptions.access$31800((DescriptorProtos$MessageOptions) this.instance, i9, (DescriptorProtos$UninterpretedOption) c2035y1.build());
        return this;
    }

    public C1889d1 addUninterpretedOption(C2035y1 c2035y1) {
        copyOnWrite();
        DescriptorProtos$MessageOptions.access$31900((DescriptorProtos$MessageOptions) this.instance, (DescriptorProtos$UninterpretedOption) c2035y1.build());
        return this;
    }

    public C1889d1 addUninterpretedOption(int i9, C2035y1 c2035y1) {
        copyOnWrite();
        DescriptorProtos$MessageOptions.access$32000((DescriptorProtos$MessageOptions) this.instance, i9, (DescriptorProtos$UninterpretedOption) c2035y1.build());
        return this;
    }
}

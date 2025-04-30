package com.google.protobuf;

import java.util.List;

/* loaded from: classes3.dex */
public interface P0 extends H2 {
    L0 getCtype();

    @Override // com.google.protobuf.H2, com.google.protobuf.O3
    /* synthetic */ N3 getDefaultInstanceForType();

    boolean getDeprecated();

    @Override // com.google.protobuf.H2
    /* synthetic */ Object getExtension(S1 s1);

    @Override // com.google.protobuf.H2
    /* synthetic */ Object getExtension(S1 s1, int i9);

    @Override // com.google.protobuf.H2
    /* synthetic */ int getExtensionCount(S1 s1);

    O0 getJstype();

    boolean getLazy();

    boolean getPacked();

    DescriptorProtos$UninterpretedOption getUninterpretedOption(int i9);

    int getUninterpretedOptionCount();

    List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList();

    boolean getWeak();

    boolean hasCtype();

    boolean hasDeprecated();

    @Override // com.google.protobuf.H2
    /* synthetic */ boolean hasExtension(S1 s1);

    boolean hasJstype();

    boolean hasLazy();

    boolean hasPacked();

    boolean hasWeak();

    @Override // com.google.protobuf.H2, com.google.protobuf.O3
    /* synthetic */ boolean isInitialized();
}

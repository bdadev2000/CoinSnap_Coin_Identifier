package com.google.protobuf;

/* loaded from: classes3.dex */
public final class C3 implements InterfaceC2045z4 {
    private static final L3 EMPTY_FACTORY = new A3();
    private final L3 messageInfoFactory;

    public C3() {
        this(getDefaultMessageInfoFactory());
    }

    private static L3 getDefaultMessageInfoFactory() {
        return new B3(B2.getInstance(), getDescriptorMessageInfoFactory());
    }

    private static L3 getDescriptorMessageInfoFactory() {
        try {
            return (L3) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return EMPTY_FACTORY;
        }
    }

    private static boolean isProto2(K3 k32) {
        if (k32.getSyntax() == EnumC1962n4.PROTO2) {
            return true;
        }
        return false;
    }

    private static <T> InterfaceC2038y4 newSchema(Class<T> cls, K3 k32) {
        if (L2.class.isAssignableFrom(cls)) {
            if (isProto2(k32)) {
                return R3.newSchema(cls, k32, C1878b4.lite(), AbstractC2016v3.lite(), A4.unknownFieldSetLiteSchema(), C1869a2.lite(), J3.lite());
            }
            return R3.newSchema(cls, k32, C1878b4.lite(), AbstractC2016v3.lite(), A4.unknownFieldSetLiteSchema(), null, J3.lite());
        }
        if (isProto2(k32)) {
            return R3.newSchema(cls, k32, C1878b4.full(), AbstractC2016v3.full(), A4.proto2UnknownFieldSetSchema(), C1869a2.full(), J3.full());
        }
        return R3.newSchema(cls, k32, C1878b4.full(), AbstractC2016v3.full(), A4.proto3UnknownFieldSetSchema(), null, J3.full());
    }

    @Override // com.google.protobuf.InterfaceC2045z4
    public <T> InterfaceC2038y4 createSchema(Class<T> cls) {
        A4.requireGeneratedMessage(cls);
        K3 messageInfoFor = this.messageInfoFactory.messageInfoFor(cls);
        if (messageInfoFor.isMessageSetWireFormat()) {
            if (L2.class.isAssignableFrom(cls)) {
                return S3.newSchema(A4.unknownFieldSetLiteSchema(), C1869a2.lite(), messageInfoFor.getDefaultInstance());
            }
            return S3.newSchema(A4.proto2UnknownFieldSetSchema(), C1869a2.full(), messageInfoFor.getDefaultInstance());
        }
        return newSchema(cls, messageInfoFor);
    }

    private C3(L3 l32) {
        this.messageInfoFactory = (L3) C1898e3.checkNotNull(l32, "messageInfoFactory");
    }
}

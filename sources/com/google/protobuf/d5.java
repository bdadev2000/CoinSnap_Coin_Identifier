package com.google.protobuf;

/* loaded from: classes4.dex */
public final class d5 implements a7 {
    private static final m5 EMPTY_FACTORY = new b5();
    private final m5 messageInfoFactory;

    public d5() {
        this(getDefaultMessageInfoFactory());
    }

    private static m5 getDefaultMessageInfoFactory() {
        return new c5(f3.getInstance(), getDescriptorMessageInfoFactory());
    }

    private static m5 getDescriptorMessageInfoFactory() {
        try {
            return (m5) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return EMPTY_FACTORY;
        }
    }

    private static boolean isProto2(l5 l5Var) {
        return l5Var.getSyntax() == o6.PROTO2;
    }

    private static <T> z6 newSchema(Class<T> cls, l5 l5Var) {
        if (o3.class.isAssignableFrom(cls)) {
            if (isProto2(l5Var)) {
                return s5.newSchema(cls, l5Var, c6.lite(), w4.lite(), b7.unknownFieldSetLiteSchema(), e2.lite(), k5.lite());
            }
            return s5.newSchema(cls, l5Var, c6.lite(), w4.lite(), b7.unknownFieldSetLiteSchema(), null, k5.lite());
        }
        if (isProto2(l5Var)) {
            return s5.newSchema(cls, l5Var, c6.full(), w4.full(), b7.proto2UnknownFieldSetSchema(), e2.full(), k5.full());
        }
        return s5.newSchema(cls, l5Var, c6.full(), w4.full(), b7.proto3UnknownFieldSetSchema(), null, k5.full());
    }

    @Override // com.google.protobuf.a7
    public <T> z6 createSchema(Class<T> cls) {
        b7.requireGeneratedMessage(cls);
        l5 messageInfoFor = this.messageInfoFactory.messageInfoFor(cls);
        if (messageInfoFor.isMessageSetWireFormat()) {
            if (o3.class.isAssignableFrom(cls)) {
                return t5.newSchema(b7.unknownFieldSetLiteSchema(), e2.lite(), messageInfoFor.getDefaultInstance());
            }
            return t5.newSchema(b7.proto2UnknownFieldSetSchema(), e2.full(), messageInfoFor.getDefaultInstance());
        }
        return newSchema(cls, messageInfoFor);
    }

    private d5(m5 m5Var) {
        this.messageInfoFactory = (m5) f4.checkNotNull(m5Var, "messageInfoFactory");
    }
}

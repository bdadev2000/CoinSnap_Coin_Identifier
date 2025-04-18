package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;

/* loaded from: classes3.dex */
public final class Value extends GeneratedMessageLite<Value, Builder> implements ValueOrBuilder {
    public static final int BOOL_VALUE_FIELD_NUMBER = 4;
    private static final Value DEFAULT_INSTANCE;
    public static final int LIST_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 1;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
    private static volatile Parser<Value> PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 3;
    public static final int STRUCT_VALUE_FIELD_NUMBER = 5;
    private int kindCase_ = 0;
    private Object kind_;

    /* renamed from: androidx.datastore.preferences.protobuf.Value$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19398a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f19398a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19398a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19398a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19398a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19398a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19398a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19398a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Value, Builder> implements ValueOrBuilder {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class KindCase {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ KindCase[] f19399a = {new java.lang.Enum("NULL_VALUE", 0), new java.lang.Enum("NUMBER_VALUE", 1), new java.lang.Enum("STRING_VALUE", 2), new java.lang.Enum("BOOL_VALUE", 3), new java.lang.Enum("STRUCT_VALUE", 4), new java.lang.Enum("LIST_VALUE", 5), new java.lang.Enum("KIND_NOT_SET", 6)};

        /* JADX INFO: Fake field, exist only in values array */
        KindCase EF5;

        public static KindCase valueOf(String str) {
            return (KindCase) java.lang.Enum.valueOf(KindCase.class, str);
        }

        public static KindCase[] values() {
            return (KindCase[]) f19399a.clone();
        }
    }

    static {
        Value value = new Value();
        DEFAULT_INSTANCE = value;
        GeneratedMessageLite.s(Value.class, value);
    }

    public static Value t() {
        return DEFAULT_INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.protobuf.Value>] */
    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object m(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003Ȼ\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"kind_", "kindCase_", Struct.class, ListValue.class});
            case 3:
                return new Value();
            case 4:
                return new GeneratedMessageLite.Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<Value> parser = PARSER;
                Parser<Value> parser2 = parser;
                if (parser == null) {
                    synchronized (Value.class) {
                        try {
                            Parser<Value> parser3 = PARSER;
                            Parser<Value> parser4 = parser3;
                            if (parser3 == null) {
                                ?? obj = new Object();
                                PARSER = obj;
                                parser4 = obj;
                            }
                        } finally {
                        }
                    }
                }
                return parser2;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

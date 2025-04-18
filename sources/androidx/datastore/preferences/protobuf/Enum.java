package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.Internal;

/* loaded from: classes.dex */
public final class Enum extends GeneratedMessageLite<Enum, Builder> implements EnumOrBuilder {
    private static final Enum DEFAULT_INSTANCE;
    public static final int ENUMVALUE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile Parser<Enum> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 5;
    private Internal.ProtobufList<EnumValue> enumvalue_;
    private String name_ = "";
    private Internal.ProtobufList<Option> options_;
    private SourceContext sourceContext_;
    private int syntax_;

    /* renamed from: androidx.datastore.preferences.protobuf.Enum$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19174a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f19174a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19174a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19174a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19174a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19174a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19174a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19174a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Enum, Builder> implements EnumOrBuilder {
    }

    static {
        Enum r02 = new Enum();
        DEFAULT_INSTANCE = r02;
        GeneratedMessageLite.s(Enum.class, r02);
    }

    public Enum() {
        ProtobufArrayList protobufArrayList = ProtobufArrayList.d;
        this.enumvalue_ = protobufArrayList;
        this.options_ = protobufArrayList;
    }

    /* JADX WARN: Type inference failed for: r8v14, types: [androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.protobuf.Enum>, java.lang.Object] */
    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object m(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004\t\u0005\f", new Object[]{"name_", "enumvalue_", EnumValue.class, "options_", Option.class, "sourceContext_", "syntax_"});
            case 3:
                return new Enum();
            case 4:
                return new GeneratedMessageLite.Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<Enum> parser = PARSER;
                Parser<Enum> parser2 = parser;
                if (parser == null) {
                    synchronized (Enum.class) {
                        try {
                            Parser<Enum> parser3 = PARSER;
                            Parser<Enum> parser4 = parser3;
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

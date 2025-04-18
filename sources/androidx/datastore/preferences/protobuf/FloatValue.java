package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;

/* loaded from: classes.dex */
public final class FloatValue extends GeneratedMessageLite<FloatValue, Builder> implements FloatValueOrBuilder {
    private static final FloatValue DEFAULT_INSTANCE;
    private static volatile Parser<FloatValue> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private float value_;

    /* renamed from: androidx.datastore.preferences.protobuf.FloatValue$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19235a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f19235a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19235a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19235a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19235a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19235a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19235a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19235a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<FloatValue, Builder> implements FloatValueOrBuilder {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.FloatValue, androidx.datastore.preferences.protobuf.GeneratedMessageLite] */
    static {
        ?? generatedMessageLite = new GeneratedMessageLite();
        DEFAULT_INSTANCE = generatedMessageLite;
        GeneratedMessageLite.s(FloatValue.class, generatedMessageLite);
    }

    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.protobuf.FloatValue>] */
    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object m(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001", new Object[]{"value_"});
            case 3:
                return new GeneratedMessageLite();
            case 4:
                return new GeneratedMessageLite.Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<FloatValue> parser = PARSER;
                Parser<FloatValue> parser2 = parser;
                if (parser == null) {
                    synchronized (FloatValue.class) {
                        try {
                            Parser<FloatValue> parser3 = PARSER;
                            Parser<FloatValue> parser4 = parser3;
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

package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;

/* loaded from: classes2.dex */
public final class Empty extends GeneratedMessageLite<Empty, Builder> implements EmptyOrBuilder {
    private static final Empty DEFAULT_INSTANCE;
    private static volatile Parser<Empty> PARSER;

    /* renamed from: androidx.datastore.preferences.protobuf.Empty$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19173a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f19173a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19173a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19173a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19173a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19173a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19173a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19173a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Empty, Builder> implements EmptyOrBuilder {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.Empty] */
    static {
        ?? generatedMessageLite = new GeneratedMessageLite();
        DEFAULT_INSTANCE = generatedMessageLite;
        GeneratedMessageLite.s(Empty.class, generatedMessageLite);
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.protobuf.Empty>, java.lang.Object] */
    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object m(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 3:
                return new GeneratedMessageLite();
            case 4:
                return new GeneratedMessageLite.Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<Empty> parser = PARSER;
                Parser<Empty> parser2 = parser;
                if (parser == null) {
                    synchronized (Empty.class) {
                        try {
                            Parser<Empty> parser3 = PARSER;
                            Parser<Empty> parser4 = parser3;
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

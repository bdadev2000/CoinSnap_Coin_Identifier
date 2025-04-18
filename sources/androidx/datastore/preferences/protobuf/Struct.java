package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.WireFormat;

/* loaded from: classes2.dex */
public final class Struct extends GeneratedMessageLite<Struct, Builder> implements StructOrBuilder {
    private static final Struct DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile Parser<Struct> PARSER;
    private MapFieldLite<String, Value> fields_ = MapFieldLite.f19289b;

    /* renamed from: androidx.datastore.preferences.protobuf.Struct$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19371a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f19371a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19371a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19371a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19371a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19371a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19371a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19371a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Struct, Builder> implements StructOrBuilder {
    }

    /* loaded from: classes2.dex */
    public static final class FieldsDefaultEntryHolder {

        /* renamed from: a, reason: collision with root package name */
        public static final MapEntryLite f19372a = new MapEntryLite(WireFormat.FieldType.f19408l, WireFormat.FieldType.f19410n, Value.t());
    }

    static {
        Struct struct = new Struct();
        DEFAULT_INSTANCE = struct;
        GeneratedMessageLite.s(Struct.class, struct);
    }

    /* JADX WARN: Type inference failed for: r4v15, types: [androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.protobuf.Struct>, java.lang.Object] */
    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object m(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", FieldsDefaultEntryHolder.f19372a});
            case 3:
                return new Struct();
            case 4:
                return new GeneratedMessageLite.Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<Struct> parser = PARSER;
                Parser<Struct> parser2 = parser;
                if (parser == null) {
                    synchronized (Struct.class) {
                        try {
                            Parser<Struct> parser3 = PARSER;
                            Parser<Struct> parser4 = parser3;
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

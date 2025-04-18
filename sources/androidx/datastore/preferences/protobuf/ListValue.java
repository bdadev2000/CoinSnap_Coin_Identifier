package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.Internal;

/* loaded from: classes.dex */
public final class ListValue extends GeneratedMessageLite<ListValue, Builder> implements ListValueOrBuilder {
    private static final ListValue DEFAULT_INSTANCE;
    private static volatile Parser<ListValue> PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private Internal.ProtobufList<Value> values_ = ProtobufArrayList.d;

    /* renamed from: androidx.datastore.preferences.protobuf.ListValue$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19276a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f19276a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19276a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19276a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19276a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19276a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19276a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19276a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ListValue, Builder> implements ListValueOrBuilder {
    }

    static {
        ListValue listValue = new ListValue();
        DEFAULT_INSTANCE = listValue;
        GeneratedMessageLite.s(ListValue.class, listValue);
    }

    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.protobuf.ListValue>] */
    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object m(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", Value.class});
            case 3:
                return new ListValue();
            case 4:
                return new GeneratedMessageLite.Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<ListValue> parser = PARSER;
                Parser<ListValue> parser2 = parser;
                if (parser == null) {
                    synchronized (ListValue.class) {
                        try {
                            Parser<ListValue> parser3 = PARSER;
                            Parser<ListValue> parser4 = parser3;
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

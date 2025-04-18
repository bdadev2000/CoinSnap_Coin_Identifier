package androidx.datastore.preferences;

import androidx.datastore.preferences.protobuf.AbstractMessageLite;
import androidx.datastore.preferences.protobuf.CodedInputStream;
import androidx.datastore.preferences.protobuf.ExtensionRegistryLite;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.MapEntryLite;
import androidx.datastore.preferences.protobuf.MapFieldLite;
import androidx.datastore.preferences.protobuf.MessageLiteOrBuilder;
import androidx.datastore.preferences.protobuf.Parser;
import androidx.datastore.preferences.protobuf.UninitializedMessageException;
import androidx.datastore.preferences.protobuf.WireFormat;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class PreferencesProto {

    /* renamed from: androidx.datastore.preferences.PreferencesProto$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19073a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f19073a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19073a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19073a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19073a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19073a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19073a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19073a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class PreferenceMap extends GeneratedMessageLite<PreferenceMap, Builder> implements PreferenceMapOrBuilder {
        private static final PreferenceMap DEFAULT_INSTANCE;
        private static volatile Parser<PreferenceMap> PARSER = null;
        public static final int PREFERENCES_FIELD_NUMBER = 1;
        private MapFieldLite<String, Value> preferences_ = MapFieldLite.f19289b;

        /* loaded from: classes.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<PreferenceMap, Builder> implements PreferenceMapOrBuilder {
        }

        /* loaded from: classes.dex */
        public static final class PreferencesDefaultEntryHolder {

            /* renamed from: a, reason: collision with root package name */
            public static final MapEntryLite f19074a = new MapEntryLite(WireFormat.FieldType.f19408l, WireFormat.FieldType.f19410n, Value.B());
        }

        static {
            PreferenceMap preferenceMap = new PreferenceMap();
            DEFAULT_INSTANCE = preferenceMap;
            GeneratedMessageLite.s(PreferenceMap.class, preferenceMap);
        }

        public static MapFieldLite t(PreferenceMap preferenceMap) {
            MapFieldLite<String, Value> mapFieldLite = preferenceMap.preferences_;
            if (!mapFieldLite.f19290a) {
                preferenceMap.preferences_ = mapFieldLite.d();
            }
            return preferenceMap.preferences_;
        }

        public static Builder v() {
            return (Builder) ((GeneratedMessageLite.Builder) DEFAULT_INSTANCE.m(GeneratedMessageLite.MethodToInvoke.f19244f));
        }

        public static PreferenceMap w(FileInputStream fileInputStream) {
            GeneratedMessageLite r2 = GeneratedMessageLite.r(DEFAULT_INSTANCE, CodedInputStream.f(fileInputStream), ExtensionRegistryLite.a());
            if (r2.isInitialized()) {
                return (PreferenceMap) r2;
            }
            throw new IOException(new UninitializedMessageException().getMessage());
        }

        /* JADX WARN: Type inference failed for: r3v16, types: [androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.PreferencesProto$PreferenceMap>, java.lang.Object] */
        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
        public final Object m(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.q(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", PreferencesDefaultEntryHolder.f19074a});
                case 3:
                    return new PreferenceMap();
                case 4:
                    return new GeneratedMessageLite.Builder(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    Parser<PreferenceMap> parser = PARSER;
                    Parser<PreferenceMap> parser2 = parser;
                    if (parser == null) {
                        synchronized (PreferenceMap.class) {
                            try {
                                Parser<PreferenceMap> parser3 = PARSER;
                                Parser<PreferenceMap> parser4 = parser3;
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

        public final Map u() {
            return Collections.unmodifiableMap(this.preferences_);
        }
    }

    /* loaded from: classes.dex */
    public interface PreferenceMapOrBuilder extends MessageLiteOrBuilder {
    }

    /* loaded from: classes.dex */
    public static final class StringSet extends GeneratedMessageLite<StringSet, Builder> implements StringSetOrBuilder {
        private static final StringSet DEFAULT_INSTANCE;
        private static volatile Parser<StringSet> PARSER = null;
        public static final int STRINGS_FIELD_NUMBER = 1;
        private Internal.ProtobufList<String> strings_ = GeneratedMessageLite.n();

        /* loaded from: classes.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<StringSet, Builder> implements StringSetOrBuilder {
        }

        static {
            StringSet stringSet = new StringSet();
            DEFAULT_INSTANCE = stringSet;
            GeneratedMessageLite.s(StringSet.class, stringSet);
        }

        public static void t(StringSet stringSet, Iterable iterable) {
            if (!stringSet.strings_.v()) {
                Internal.ProtobufList<String> protobufList = stringSet.strings_;
                int size = protobufList.size();
                stringSet.strings_ = protobufList.y(size == 0 ? 10 : size * 2);
            }
            AbstractMessageLite.h(iterable, stringSet.strings_);
        }

        public static StringSet u() {
            return DEFAULT_INSTANCE;
        }

        public static Builder w() {
            return (Builder) ((GeneratedMessageLite.Builder) DEFAULT_INSTANCE.m(GeneratedMessageLite.MethodToInvoke.f19244f));
        }

        /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object, androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.PreferencesProto$StringSet>] */
        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
        public final Object m(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.q(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
                case 3:
                    return new StringSet();
                case 4:
                    return new GeneratedMessageLite.Builder(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    Parser<StringSet> parser = PARSER;
                    Parser<StringSet> parser2 = parser;
                    if (parser == null) {
                        synchronized (StringSet.class) {
                            try {
                                Parser<StringSet> parser3 = PARSER;
                                Parser<StringSet> parser4 = parser3;
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

        public final Internal.ProtobufList v() {
            return this.strings_;
        }
    }

    /* loaded from: classes.dex */
    public interface StringSetOrBuilder extends MessageLiteOrBuilder {
    }

    /* loaded from: classes.dex */
    public static final class Value extends GeneratedMessageLite<Value, Builder> implements ValueOrBuilder {
        public static final int BOOLEAN_FIELD_NUMBER = 1;
        private static final Value DEFAULT_INSTANCE;
        public static final int DOUBLE_FIELD_NUMBER = 7;
        public static final int FLOAT_FIELD_NUMBER = 2;
        public static final int INTEGER_FIELD_NUMBER = 3;
        public static final int LONG_FIELD_NUMBER = 4;
        private static volatile Parser<Value> PARSER = null;
        public static final int STRING_FIELD_NUMBER = 5;
        public static final int STRING_SET_FIELD_NUMBER = 6;
        private int bitField0_;
        private int valueCase_ = 0;
        private Object value_;

        /* loaded from: classes.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<Value, Builder> implements ValueOrBuilder {
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes.dex */
        public static final class ValueCase {

            /* renamed from: a, reason: collision with root package name */
            public static final ValueCase f19075a;

            /* renamed from: b, reason: collision with root package name */
            public static final ValueCase f19076b;

            /* renamed from: c, reason: collision with root package name */
            public static final ValueCase f19077c;
            public static final ValueCase d;

            /* renamed from: f, reason: collision with root package name */
            public static final ValueCase f19078f;

            /* renamed from: g, reason: collision with root package name */
            public static final ValueCase f19079g;

            /* renamed from: h, reason: collision with root package name */
            public static final ValueCase f19080h;

            /* renamed from: i, reason: collision with root package name */
            public static final ValueCase f19081i;

            /* renamed from: j, reason: collision with root package name */
            public static final /* synthetic */ ValueCase[] f19082j;

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.datastore.preferences.PreferencesProto$Value$ValueCase] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.datastore.preferences.PreferencesProto$Value$ValueCase] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.datastore.preferences.PreferencesProto$Value$ValueCase] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, androidx.datastore.preferences.PreferencesProto$Value$ValueCase] */
            /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, androidx.datastore.preferences.PreferencesProto$Value$ValueCase] */
            /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, androidx.datastore.preferences.PreferencesProto$Value$ValueCase] */
            /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, androidx.datastore.preferences.PreferencesProto$Value$ValueCase] */
            /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, androidx.datastore.preferences.PreferencesProto$Value$ValueCase] */
            static {
                ?? r02 = new Enum("BOOLEAN", 0);
                f19075a = r02;
                ?? r1 = new Enum("FLOAT", 1);
                f19076b = r1;
                ?? r2 = new Enum("INTEGER", 2);
                f19077c = r2;
                ?? r3 = new Enum("LONG", 3);
                d = r3;
                ?? r4 = new Enum("STRING", 4);
                f19078f = r4;
                ?? r5 = new Enum("STRING_SET", 5);
                f19079g = r5;
                ?? r6 = new Enum("DOUBLE", 6);
                f19080h = r6;
                ?? r7 = new Enum("VALUE_NOT_SET", 7);
                f19081i = r7;
                f19082j = new ValueCase[]{r02, r1, r2, r3, r4, r5, r6, r7};
            }

            public static ValueCase valueOf(String str) {
                return (ValueCase) Enum.valueOf(ValueCase.class, str);
            }

            public static ValueCase[] values() {
                return (ValueCase[]) f19082j.clone();
            }
        }

        static {
            Value value = new Value();
            DEFAULT_INSTANCE = value;
            GeneratedMessageLite.s(Value.class, value);
        }

        public static Value B() {
            return DEFAULT_INSTANCE;
        }

        public static Builder J() {
            return (Builder) ((GeneratedMessageLite.Builder) DEFAULT_INSTANCE.m(GeneratedMessageLite.MethodToInvoke.f19244f));
        }

        public static void t(Value value, long j2) {
            value.valueCase_ = 4;
            value.value_ = Long.valueOf(j2);
        }

        public static void u(Value value, String str) {
            value.getClass();
            str.getClass();
            value.valueCase_ = 5;
            value.value_ = str;
        }

        public static void v(Value value, StringSet.Builder builder) {
            value.getClass();
            value.value_ = builder.k();
            value.valueCase_ = 6;
        }

        public static void w(Value value, double d) {
            value.valueCase_ = 7;
            value.value_ = Double.valueOf(d);
        }

        public static void x(Value value, boolean z2) {
            value.valueCase_ = 1;
            value.value_ = Boolean.valueOf(z2);
        }

        public static void y(Value value, float f2) {
            value.valueCase_ = 2;
            value.value_ = Float.valueOf(f2);
        }

        public static void z(Value value, int i2) {
            value.valueCase_ = 3;
            value.value_ = Integer.valueOf(i2);
        }

        public final boolean A() {
            if (this.valueCase_ == 1) {
                return ((Boolean) this.value_).booleanValue();
            }
            return false;
        }

        public final double C() {
            return this.valueCase_ == 7 ? ((Double) this.value_).doubleValue() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }

        public final float D() {
            if (this.valueCase_ == 2) {
                return ((Float) this.value_).floatValue();
            }
            return 0.0f;
        }

        public final int E() {
            if (this.valueCase_ == 3) {
                return ((Integer) this.value_).intValue();
            }
            return 0;
        }

        public final long F() {
            if (this.valueCase_ == 4) {
                return ((Long) this.value_).longValue();
            }
            return 0L;
        }

        public final String G() {
            return this.valueCase_ == 5 ? (String) this.value_ : "";
        }

        public final StringSet H() {
            return this.valueCase_ == 6 ? (StringSet) this.value_ : StringSet.u();
        }

        public final ValueCase I() {
            switch (this.valueCase_) {
                case 0:
                    return ValueCase.f19081i;
                case 1:
                    return ValueCase.f19075a;
                case 2:
                    return ValueCase.f19076b;
                case 3:
                    return ValueCase.f19077c;
                case 4:
                    return ValueCase.d;
                case 5:
                    return ValueCase.f19078f;
                case 6:
                    return ValueCase.f19079g;
                case 7:
                    return ValueCase.f19080h;
                default:
                    return null;
            }
        }

        /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object, androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.PreferencesProto$Value>] */
        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
        public final Object m(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.q(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", StringSet.class});
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

    /* loaded from: classes.dex */
    public interface ValueOrBuilder extends MessageLiteOrBuilder {
    }
}

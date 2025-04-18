package androidx.datastore.preferences.protobuf;

import androidx.compose.foundation.text.input.a;
import androidx.datastore.preferences.protobuf.AbstractMessageLite;
import androidx.datastore.preferences.protobuf.FieldSet;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder;
import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.MessageLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.io.IOException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> extends AbstractMessageLite<MessageType, BuilderType> {
    private static Map<Object, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected int memoizedSerializedSize;
    protected UnknownFieldSetLite unknownFields;

    /* renamed from: androidx.datastore.preferences.protobuf.GeneratedMessageLite$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19237a;

        static {
            int[] iArr = new int[WireFormat.JavaType.values().length];
            f19237a = iArr;
            try {
                iArr[WireFormat.JavaType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19237a[WireFormat.JavaType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Builder<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> extends AbstractMessageLite.Builder<MessageType, BuilderType> {

        /* renamed from: a, reason: collision with root package name */
        public final GeneratedMessageLite f19238a;

        /* renamed from: b, reason: collision with root package name */
        public GeneratedMessageLite f19239b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f19240c = false;

        public Builder(GeneratedMessageLite generatedMessageLite) {
            this.f19238a = generatedMessageLite;
            this.f19239b = (GeneratedMessageLite) generatedMessageLite.m(MethodToInvoke.d);
        }

        public static void n(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
            Protobuf protobuf = Protobuf.f19325c;
            protobuf.getClass();
            protobuf.a(generatedMessageLite.getClass()).a(generatedMessageLite, generatedMessageLite2);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder
        public final Object clone() {
            Builder builder = (Builder) this.f19238a.m(MethodToInvoke.f19244f);
            GeneratedMessageLite e = e();
            builder.m();
            n(builder.f19239b, e);
            return builder;
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLiteOrBuilder
        public final GeneratedMessageLite f() {
            return this.f19238a;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder
        /* renamed from: h */
        public final Builder clone() {
            Builder builder = (Builder) this.f19238a.m(MethodToInvoke.f19244f);
            GeneratedMessageLite e = e();
            builder.m();
            n(builder.f19239b, e);
            return builder;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder
        public final Builder i(AbstractMessageLite abstractMessageLite) {
            m();
            n(this.f19239b, (GeneratedMessageLite) abstractMessageLite);
            return this;
        }

        public final GeneratedMessageLite k() {
            GeneratedMessageLite e = e();
            if (e.isInitialized()) {
                return e;
            }
            throw new UninitializedMessageException();
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public GeneratedMessageLite e() {
            if (this.f19240c) {
                return this.f19239b;
            }
            GeneratedMessageLite generatedMessageLite = this.f19239b;
            generatedMessageLite.getClass();
            Protobuf protobuf = Protobuf.f19325c;
            protobuf.getClass();
            protobuf.a(generatedMessageLite.getClass()).c(generatedMessageLite);
            this.f19240c = true;
            return this.f19239b;
        }

        public void m() {
            if (this.f19240c) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) this.f19239b.m(MethodToInvoke.d);
                n(generatedMessageLite, this.f19239b);
                this.f19239b = generatedMessageLite;
                this.f19240c = false;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class DefaultInstanceBasedParser<T extends GeneratedMessageLite<T, ?>> extends AbstractParser<T> {
    }

    /* loaded from: classes.dex */
    public static abstract class ExtendableBuilder<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends Builder<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType, BuilderType> {
        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder, androidx.datastore.preferences.protobuf.MessageLite.Builder
        public final MessageLite e() {
            if (this.f19240c) {
                return (ExtendableMessage) this.f19239b;
            }
            ((ExtendableMessage) this.f19239b).extensions.l();
            return (ExtendableMessage) super.e();
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder
        /* renamed from: l */
        public final GeneratedMessageLite e() {
            if (this.f19240c) {
                return (ExtendableMessage) this.f19239b;
            }
            ((ExtendableMessage) this.f19239b).extensions.l();
            return (ExtendableMessage) super.e();
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder
        public final void m() {
            if (this.f19240c) {
                super.m();
                GeneratedMessageLite generatedMessageLite = this.f19239b;
                ((ExtendableMessage) generatedMessageLite).extensions = ((ExtendableMessage) generatedMessageLite).extensions.clone();
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends GeneratedMessageLite<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType, BuilderType> {
        protected FieldSet<ExtensionDescriptor> extensions;

        /* loaded from: classes.dex */
        public class ExtensionWriter {
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.MessageLite
        public final Builder a() {
            Builder builder = (Builder) m(MethodToInvoke.f19244f);
            builder.m();
            Builder.n(builder.f19239b, this);
            return builder;
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.MessageLite
        public final Builder d() {
            return (Builder) m(MethodToInvoke.f19244f);
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.MessageLiteOrBuilder
        public final GeneratedMessageLite f() {
            return (GeneratedMessageLite) m(MethodToInvoke.f19245g);
        }
    }

    /* loaded from: classes.dex */
    public interface ExtendableMessageOrBuilder<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends MessageLiteOrBuilder {
    }

    /* loaded from: classes.dex */
    public static final class ExtensionDescriptor implements FieldSet.FieldDescriptorLite<ExtensionDescriptor> {
        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public final void I() {
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public final void J() {
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public final WireFormat.JavaType K() {
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public final void L() {
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            ((ExtensionDescriptor) obj).getClass();
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public final Builder d(MessageLite.Builder builder, MessageLite messageLite) {
            Builder builder2 = (Builder) builder;
            builder2.m();
            Builder.n(builder2.f19239b, (GeneratedMessageLite) messageLite);
            return builder2;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public final void getNumber() {
        }
    }

    /* loaded from: classes.dex */
    public static class GeneratedExtension<ContainingType extends MessageLite, Type> extends ExtensionLite<ContainingType, Type> {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public static final class MethodToInvoke {

        /* renamed from: a, reason: collision with root package name */
        public static final MethodToInvoke f19241a;

        /* renamed from: b, reason: collision with root package name */
        public static final MethodToInvoke f19242b;

        /* renamed from: c, reason: collision with root package name */
        public static final MethodToInvoke f19243c;
        public static final MethodToInvoke d;

        /* renamed from: f, reason: collision with root package name */
        public static final MethodToInvoke f19244f;

        /* renamed from: g, reason: collision with root package name */
        public static final MethodToInvoke f19245g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ MethodToInvoke[] f19246h;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke] */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke] */
        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke] */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke] */
        /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke] */
        static {
            ?? r02 = new java.lang.Enum("GET_MEMOIZED_IS_INITIALIZED", 0);
            f19241a = r02;
            ?? r1 = new java.lang.Enum("SET_MEMOIZED_IS_INITIALIZED", 1);
            f19242b = r1;
            ?? r2 = new java.lang.Enum("BUILD_MESSAGE_INFO", 2);
            f19243c = r2;
            ?? r3 = new java.lang.Enum("NEW_MUTABLE_INSTANCE", 3);
            d = r3;
            ?? r4 = new java.lang.Enum("NEW_BUILDER", 4);
            f19244f = r4;
            ?? r5 = new java.lang.Enum("GET_DEFAULT_INSTANCE", 5);
            f19245g = r5;
            f19246h = new MethodToInvoke[]{r02, r1, r2, r3, r4, r5, new java.lang.Enum("GET_PARSER", 6)};
        }

        public static MethodToInvoke valueOf(String str) {
            return (MethodToInvoke) java.lang.Enum.valueOf(MethodToInvoke.class, str);
        }

        public static MethodToInvoke[] values() {
            return (MethodToInvoke[]) f19246h.clone();
        }
    }

    /* loaded from: classes.dex */
    public static final class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;

        public Object readResolve() throws ObjectStreamException {
            try {
                try {
                    java.lang.reflect.Field declaredField = Class.forName(null).getDeclaredField("DEFAULT_INSTANCE");
                    declaredField.setAccessible(true);
                    ((MessageLite) declaredField.get(null)).d().getClass();
                    throw null;
                } catch (InvalidProtocolBufferException e) {
                    throw new RuntimeException("Unable to understand proto buffer", e);
                } catch (ClassNotFoundException e2) {
                    throw new RuntimeException("Unable to find proto buffer class: null", e2);
                } catch (IllegalAccessException e3) {
                    throw new RuntimeException("Unable to call parsePartialFrom", e3);
                } catch (NoSuchFieldException e4) {
                    throw new RuntimeException("Unable to find defaultInstance in null", e4);
                } catch (SecurityException e5) {
                    throw new RuntimeException("Unable to call defaultInstance in null", e5);
                }
            } catch (InvalidProtocolBufferException e6) {
                throw new RuntimeException("Unable to understand proto buffer", e6);
            } catch (ClassNotFoundException e7) {
                throw new RuntimeException("Unable to find proto buffer class: null", e7);
            } catch (IllegalAccessException e8) {
                throw new RuntimeException("Unable to call parsePartialFrom", e8);
            } catch (NoSuchFieldException unused) {
                java.lang.reflect.Field declaredField2 = Class.forName(null).getDeclaredField("defaultInstance");
                declaredField2.setAccessible(true);
                ((MessageLite) declaredField2.get(null)).d().getClass();
                throw null;
            } catch (SecurityException e9) {
                throw new RuntimeException("Unable to call DEFAULT_INSTANCE in null", e9);
            }
        }
    }

    public GeneratedMessageLite() {
        this.memoizedHashCode = 0;
        this.unknownFields = UnknownFieldSetLite.f19382f;
        this.memoizedSerializedSize = -1;
    }

    public static Internal.ProtobufList n() {
        return ProtobufArrayList.d;
    }

    public static GeneratedMessageLite o(Class cls) {
        GeneratedMessageLite<?, ?> generatedMessageLite = defaultInstanceMap.get(cls);
        if (generatedMessageLite == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                generatedMessageLite = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (generatedMessageLite == null) {
            generatedMessageLite = (GeneratedMessageLite) ((GeneratedMessageLite) UnsafeUtil.a(cls)).m(MethodToInvoke.f19245g);
            if (generatedMessageLite == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, generatedMessageLite);
        }
        return generatedMessageLite;
    }

    public static Object p(java.lang.reflect.Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static Object q(GeneratedMessageLite generatedMessageLite, String str, Object[] objArr) {
        return new RawMessageInfo(generatedMessageLite, str, objArr);
    }

    public static GeneratedMessageLite r(GeneratedMessageLite generatedMessageLite, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        GeneratedMessageLite generatedMessageLite2 = (GeneratedMessageLite) generatedMessageLite.m(MethodToInvoke.d);
        try {
            Protobuf protobuf = Protobuf.f19325c;
            protobuf.getClass();
            Schema a2 = protobuf.a(generatedMessageLite2.getClass());
            CodedInputStreamReader codedInputStreamReader = codedInputStream.d;
            if (codedInputStreamReader == null) {
                codedInputStreamReader = new CodedInputStreamReader(codedInputStream);
            }
            a2.b(generatedMessageLite2, codedInputStreamReader, extensionRegistryLite);
            a2.c(generatedMessageLite2);
            return generatedMessageLite2;
        } catch (IOException e) {
            if (e.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e.getCause());
            }
            throw new IOException(e.getMessage());
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e2.getCause());
            }
            throw e2;
        }
    }

    public static void s(Class cls, GeneratedMessageLite generatedMessageLite) {
        defaultInstanceMap.put(cls, generatedMessageLite);
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public Builder a() {
        Builder builder = (Builder) m(MethodToInvoke.f19244f);
        builder.m();
        Builder.n(builder.f19239b, this);
        return builder;
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public final int c() {
        if (this.memoizedSerializedSize == -1) {
            Protobuf protobuf = Protobuf.f19325c;
            protobuf.getClass();
            this.memoizedSerializedSize = protobuf.a(getClass()).e(this);
        }
        return this.memoizedSerializedSize;
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public Builder d() {
        return (Builder) m(MethodToInvoke.f19244f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((GeneratedMessageLite) m(MethodToInvoke.f19245g)).getClass().isInstance(obj)) {
            return false;
        }
        Protobuf protobuf = Protobuf.f19325c;
        protobuf.getClass();
        return protobuf.a(getClass()).i(this, (GeneratedMessageLite) obj);
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLiteOrBuilder
    public GeneratedMessageLite f() {
        return (GeneratedMessageLite) m(MethodToInvoke.f19245g);
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public final void g(CodedOutputStream codedOutputStream) {
        Protobuf protobuf = Protobuf.f19325c;
        protobuf.getClass();
        Schema a2 = protobuf.a(getClass());
        CodedOutputStreamWriter codedOutputStreamWriter = codedOutputStream.f19163a;
        if (codedOutputStreamWriter == null) {
            codedOutputStreamWriter = new CodedOutputStreamWriter(codedOutputStream);
        }
        a2.h(this, codedOutputStreamWriter);
    }

    public final int hashCode() {
        int i2 = this.memoizedHashCode;
        if (i2 != 0) {
            return i2;
        }
        Protobuf protobuf = Protobuf.f19325c;
        protobuf.getClass();
        int g2 = protobuf.a(getClass()).g(this);
        this.memoizedHashCode = g2;
        return g2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite
    public final int i() {
        return this.memoizedSerializedSize;
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        byte byteValue = ((Byte) m(MethodToInvoke.f19241a)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        Protobuf protobuf = Protobuf.f19325c;
        protobuf.getClass();
        boolean d = protobuf.a(getClass()).d(this);
        m(MethodToInvoke.f19242b);
        return d;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite
    public final void k(int i2) {
        this.memoizedSerializedSize = i2;
    }

    public abstract Object m(MethodToInvoke methodToInvoke);

    public final String toString() {
        StringBuilder B = a.B("# ", super.toString());
        MessageLiteToString.c(this, B, 0);
        return B.toString();
    }
}

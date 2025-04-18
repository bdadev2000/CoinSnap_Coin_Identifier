package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.FieldSet;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.LazyField;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class MessageSetSchema<T> implements Schema<T> {

    /* renamed from: a, reason: collision with root package name */
    public final MessageLite f19311a;

    /* renamed from: b, reason: collision with root package name */
    public final UnknownFieldSchema f19312b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f19313c;
    public final ExtensionSchema d;

    public MessageSetSchema(UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MessageLite messageLite) {
        this.f19312b = unknownFieldSchema;
        this.f19313c = extensionSchema.e(messageLite);
        this.d = extensionSchema;
        this.f19311a = messageLite;
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final void a(Object obj, Object obj2) {
        Class cls = SchemaUtil.f19346a;
        UnknownFieldSchema unknownFieldSchema = this.f19312b;
        unknownFieldSchema.o(obj, unknownFieldSchema.k(unknownFieldSchema.g(obj), unknownFieldSchema.g(obj2)));
        if (this.f19313c) {
            SchemaUtil.B(this.d, obj, obj2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final void b(Object obj, Reader reader, ExtensionRegistryLite extensionRegistryLite) {
        UnknownFieldSchema unknownFieldSchema = this.f19312b;
        UnknownFieldSetLite f2 = unknownFieldSchema.f(obj);
        ExtensionSchema extensionSchema = this.d;
        FieldSet d = extensionSchema.d(obj);
        while (reader.E() != Integer.MAX_VALUE && j(reader, extensionRegistryLite, extensionSchema, d, unknownFieldSchema, f2)) {
            try {
            } finally {
                unknownFieldSchema.n(obj, f2);
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final void c(Object obj) {
        this.f19312b.j(obj);
        this.d.f(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final boolean d(Object obj) {
        return this.d.c(obj).i();
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final int e(Object obj) {
        SmallSortedMap smallSortedMap;
        UnknownFieldSchema unknownFieldSchema = this.f19312b;
        int i2 = unknownFieldSchema.i(unknownFieldSchema.g(obj));
        if (!this.f19313c) {
            return i2;
        }
        FieldSet c2 = this.d.c(obj);
        int i3 = 0;
        int i4 = 0;
        while (true) {
            smallSortedMap = c2.f19214a;
            if (i3 >= smallSortedMap.f19351b.size()) {
                break;
            }
            i4 += FieldSet.f(smallSortedMap.d(i3));
            i3++;
        }
        Iterator<T> it = smallSortedMap.e().iterator();
        while (it.hasNext()) {
            i4 += FieldSet.f((Map.Entry) it.next());
        }
        return i2 + i4;
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final Object f() {
        return this.f19311a.d().e();
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final int g(Object obj) {
        int hashCode = this.f19312b.g(obj).hashCode();
        return this.f19313c ? (hashCode * 53) + this.d.c(obj).f19214a.hashCode() : hashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final void h(Object obj, Writer writer) {
        Iterator k2 = this.d.c(obj).k();
        while (k2.hasNext()) {
            Map.Entry entry = (Map.Entry) k2.next();
            FieldSet.FieldDescriptorLite fieldDescriptorLite = (FieldSet.FieldDescriptorLite) entry.getKey();
            if (fieldDescriptorLite.K() != WireFormat.JavaType.MESSAGE) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            fieldDescriptorLite.I();
            fieldDescriptorLite.L();
            if (entry instanceof LazyField.LazyEntry) {
                fieldDescriptorLite.getNumber();
                writer.b(0, ((LazyField) ((LazyField.LazyEntry) entry).f19267a.getValue()).b());
            } else {
                fieldDescriptorLite.getNumber();
                writer.b(0, entry.getValue());
            }
        }
        UnknownFieldSchema unknownFieldSchema = this.f19312b;
        unknownFieldSchema.r(unknownFieldSchema.g(obj), writer);
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final boolean i(Object obj, Object obj2) {
        UnknownFieldSchema unknownFieldSchema = this.f19312b;
        if (!unknownFieldSchema.g(obj).equals(unknownFieldSchema.g(obj2))) {
            return false;
        }
        if (!this.f19313c) {
            return true;
        }
        ExtensionSchema extensionSchema = this.d;
        return extensionSchema.c(obj).equals(extensionSchema.c(obj2));
    }

    public final boolean j(Reader reader, ExtensionRegistryLite extensionRegistryLite, ExtensionSchema extensionSchema, FieldSet fieldSet, UnknownFieldSchema unknownFieldSchema, Object obj) {
        int l2 = reader.l();
        MessageLite messageLite = this.f19311a;
        if (l2 != 11) {
            if ((l2 & 7) != 2) {
                return reader.I();
            }
            GeneratedMessageLite.GeneratedExtension b2 = extensionSchema.b(extensionRegistryLite, messageLite, l2 >>> 3);
            if (b2 == null) {
                return unknownFieldSchema.l(obj, reader);
            }
            extensionSchema.h(b2);
            return true;
        }
        GeneratedMessageLite.GeneratedExtension generatedExtension = null;
        int i2 = 0;
        ByteString byteString = null;
        while (reader.E() != Integer.MAX_VALUE) {
            int l3 = reader.l();
            if (l3 == 16) {
                i2 = reader.h();
                generatedExtension = extensionSchema.b(extensionRegistryLite, messageLite, i2);
            } else if (l3 == 26) {
                if (generatedExtension != null) {
                    extensionSchema.h(generatedExtension);
                } else {
                    byteString = reader.p();
                }
            } else if (!reader.I()) {
                break;
            }
        }
        if (reader.l() != 12) {
            throw InvalidProtocolBufferException.a();
        }
        if (byteString != null) {
            if (generatedExtension != null) {
                extensionSchema.i(generatedExtension);
            } else {
                unknownFieldSchema.d(obj, i2, byteString);
            }
        }
        return true;
    }
}

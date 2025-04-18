package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Writer;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class UnknownFieldSetLiteSchema extends UnknownFieldSchema<UnknownFieldSetLite, UnknownFieldSetLite> {
    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public final void a(int i2, int i3, Object obj) {
        ((UnknownFieldSetLite) obj).c((i2 << 3) | 5, Integer.valueOf(i3));
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public final void b(int i2, long j2, Object obj) {
        ((UnknownFieldSetLite) obj).c((i2 << 3) | 1, Long.valueOf(j2));
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public final void c(int i2, Object obj, Object obj2) {
        ((UnknownFieldSetLite) obj).c((i2 << 3) | 3, (UnknownFieldSetLite) obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public final void d(Object obj, int i2, ByteString byteString) {
        ((UnknownFieldSetLite) obj).c((i2 << 3) | 2, byteString);
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public final void e(int i2, long j2, Object obj) {
        ((UnknownFieldSetLite) obj).c(i2 << 3, Long.valueOf(j2));
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public final UnknownFieldSetLite f(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite != UnknownFieldSetLite.f19382f) {
            return unknownFieldSetLite;
        }
        UnknownFieldSetLite b2 = UnknownFieldSetLite.b();
        generatedMessageLite.unknownFields = b2;
        return b2;
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public final UnknownFieldSetLite g(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public final int h(Object obj) {
        return ((UnknownFieldSetLite) obj).a();
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public final int i(Object obj) {
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        int i2 = unknownFieldSetLite.d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < unknownFieldSetLite.f19383a; i4++) {
            int i5 = unknownFieldSetLite.f19384b[i4] >>> 3;
            i3 += CodedOutputStream.T(3, (ByteString) unknownFieldSetLite.f19385c[i4]) + CodedOutputStream.l0(2, i5) + (CodedOutputStream.k0(1) * 2);
        }
        unknownFieldSetLite.d = i3;
        return i3;
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public final void j(Object obj) {
        ((GeneratedMessageLite) obj).unknownFields.e = false;
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public final UnknownFieldSetLite k(Object obj, Object obj2) {
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        UnknownFieldSetLite unknownFieldSetLite2 = (UnknownFieldSetLite) obj2;
        if (unknownFieldSetLite2.equals(UnknownFieldSetLite.f19382f)) {
            return unknownFieldSetLite;
        }
        int i2 = unknownFieldSetLite.f19383a + unknownFieldSetLite2.f19383a;
        int[] copyOf = Arrays.copyOf(unknownFieldSetLite.f19384b, i2);
        System.arraycopy(unknownFieldSetLite2.f19384b, 0, copyOf, unknownFieldSetLite.f19383a, unknownFieldSetLite2.f19383a);
        Object[] copyOf2 = Arrays.copyOf(unknownFieldSetLite.f19385c, i2);
        System.arraycopy(unknownFieldSetLite2.f19385c, 0, copyOf2, unknownFieldSetLite.f19383a, unknownFieldSetLite2.f19383a);
        return new UnknownFieldSetLite(i2, copyOf, copyOf2, true);
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public final UnknownFieldSetLite m() {
        return UnknownFieldSetLite.b();
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public final void n(Object obj, Object obj2) {
        ((GeneratedMessageLite) obj).unknownFields = (UnknownFieldSetLite) obj2;
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public final void o(Object obj, Object obj2) {
        ((GeneratedMessageLite) obj).unknownFields = (UnknownFieldSetLite) obj2;
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public final void p() {
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public final UnknownFieldSetLite q(Object obj) {
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        unknownFieldSetLite.e = false;
        return unknownFieldSetLite;
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public final void r(Object obj, Writer writer) {
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        unknownFieldSetLite.getClass();
        if (writer.y() == Writer.FieldOrder.f19433b) {
            for (int i2 = unknownFieldSetLite.f19383a - 1; i2 >= 0; i2--) {
                writer.b(unknownFieldSetLite.f19384b[i2] >>> 3, unknownFieldSetLite.f19385c[i2]);
            }
            return;
        }
        for (int i3 = 0; i3 < unknownFieldSetLite.f19383a; i3++) {
            writer.b(unknownFieldSetLite.f19384b[i3] >>> 3, unknownFieldSetLite.f19385c[i3]);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public final void s(Object obj, Writer writer) {
        ((UnknownFieldSetLite) obj).e(writer);
    }
}

package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.ExtensionRegistryLite;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ExtensionSchemaLite extends ExtensionSchema<GeneratedMessageLite.ExtensionDescriptor> {

    /* renamed from: androidx.datastore.preferences.protobuf.ExtensionSchemaLite$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19182a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f19182a = iArr;
            try {
                iArr[WireFormat.FieldType.f19401c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19182a[WireFormat.FieldType.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19182a[WireFormat.FieldType.f19402f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19182a[WireFormat.FieldType.f19403g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19182a[WireFormat.FieldType.f19404h.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19182a[WireFormat.FieldType.f19405i.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19182a[WireFormat.FieldType.f19406j.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19182a[WireFormat.FieldType.f19407k.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19182a[WireFormat.FieldType.f19412p.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f19182a[WireFormat.FieldType.f19414r.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f19182a[WireFormat.FieldType.f19415s.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f19182a[WireFormat.FieldType.f19416t.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f19182a[WireFormat.FieldType.f19417u.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f19182a[WireFormat.FieldType.f19413q.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f19182a[WireFormat.FieldType.f19411o.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f19182a[WireFormat.FieldType.f19408l.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f19182a[WireFormat.FieldType.f19409m.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f19182a[WireFormat.FieldType.f19410n.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    public final void a(Map.Entry entry) {
        ((GeneratedMessageLite.ExtensionDescriptor) entry.getKey()).getClass();
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    public final GeneratedMessageLite.GeneratedExtension b(ExtensionRegistryLite extensionRegistryLite, MessageLite messageLite, int i2) {
        extensionRegistryLite.getClass();
        return (GeneratedMessageLite.GeneratedExtension) extensionRegistryLite.f19179a.get(new ExtensionRegistryLite.ObjectIntPair(messageLite, i2));
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    public final FieldSet c(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).extensions;
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    public final FieldSet d(Object obj) {
        GeneratedMessageLite.ExtendableMessage extendableMessage = (GeneratedMessageLite.ExtendableMessage) obj;
        FieldSet<GeneratedMessageLite.ExtensionDescriptor> fieldSet = extendableMessage.extensions;
        if (fieldSet.f19215b) {
            extendableMessage.extensions = fieldSet.clone();
        }
        return extendableMessage.extensions;
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    public final boolean e(MessageLite messageLite) {
        return messageLite instanceof GeneratedMessageLite.ExtendableMessage;
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    public final void f(Object obj) {
        ((GeneratedMessageLite.ExtendableMessage) obj).extensions.l();
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    public final Object g(Object obj) {
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    public final void h(Object obj) {
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    public final void i(Object obj) {
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    public final void j(Map.Entry entry) {
        ((GeneratedMessageLite.ExtensionDescriptor) entry.getKey()).getClass();
        throw null;
    }
}

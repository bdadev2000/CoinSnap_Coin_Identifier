package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.WireFormat;

/* loaded from: classes.dex */
public class MapEntryLite<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public final Metadata f19282a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f19283b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f19284c;

    /* renamed from: androidx.datastore.preferences.protobuf.MapEntryLite$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19285a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f19285a = iArr;
            try {
                iArr[WireFormat.FieldType.f19410n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19285a[WireFormat.FieldType.f19413q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19285a[WireFormat.FieldType.f19409m.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class Metadata<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final WireFormat.FieldType f19286a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f19287b = "";

        /* renamed from: c, reason: collision with root package name */
        public final WireFormat.FieldType f19288c;
        public final Object d;

        public Metadata(WireFormat.FieldType fieldType, WireFormat.FieldType fieldType2, GeneratedMessageLite generatedMessageLite) {
            this.f19286a = fieldType;
            this.f19288c = fieldType2;
            this.d = generatedMessageLite;
        }
    }

    public MapEntryLite(WireFormat.FieldType fieldType, WireFormat.FieldType fieldType2, GeneratedMessageLite generatedMessageLite) {
        this.f19282a = new Metadata(fieldType, fieldType2, generatedMessageLite);
    }

    public static int a(Metadata metadata, Object obj, Object obj2) {
        return FieldSet.b(metadata.f19286a, 1, obj) + FieldSet.b(metadata.f19288c, 2, obj2);
    }

    public static void b(CodedOutputStream codedOutputStream, Metadata metadata, Object obj, Object obj2) {
        FieldSet.p(codedOutputStream, metadata.f19286a, 1, obj);
        FieldSet.p(codedOutputStream, metadata.f19288c, 2, obj2);
    }
}

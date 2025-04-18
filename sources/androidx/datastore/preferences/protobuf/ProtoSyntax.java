package androidx.datastore.preferences.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ProtoSyntax {

    /* renamed from: a, reason: collision with root package name */
    public static final ProtoSyntax f19322a;

    /* renamed from: b, reason: collision with root package name */
    public static final ProtoSyntax f19323b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ ProtoSyntax[] f19324c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.datastore.preferences.protobuf.ProtoSyntax] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.datastore.preferences.protobuf.ProtoSyntax] */
    static {
        ?? r02 = new java.lang.Enum("PROTO2", 0);
        f19322a = r02;
        ?? r1 = new java.lang.Enum("PROTO3", 1);
        f19323b = r1;
        f19324c = new ProtoSyntax[]{r02, r1};
    }

    public static ProtoSyntax valueOf(String str) {
        return (ProtoSyntax) java.lang.Enum.valueOf(ProtoSyntax.class, str);
    }

    public static ProtoSyntax[] values() {
        return (ProtoSyntax[]) f19324c.clone();
    }
}

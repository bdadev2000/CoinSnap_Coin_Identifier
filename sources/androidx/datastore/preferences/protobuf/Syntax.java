package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;

/* loaded from: classes3.dex */
public enum Syntax implements Internal.EnumLite {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f19376a;

    /* renamed from: androidx.datastore.preferences.protobuf.Syntax$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static class AnonymousClass1 implements Internal.EnumLiteMap<Syntax> {
    }

    /* loaded from: classes3.dex */
    public static final class SyntaxVerifier implements Internal.EnumVerifier {
        @Override // androidx.datastore.preferences.protobuf.Internal.EnumVerifier
        public final boolean a(int i2) {
            return (i2 != 0 ? i2 != 1 ? null : Syntax.SYNTAX_PROTO3 : Syntax.SYNTAX_PROTO2) != null;
        }
    }

    Syntax(int i2) {
        this.f19376a = i2;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f19376a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

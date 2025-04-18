package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;

/* loaded from: classes2.dex */
public enum NullValue implements Internal.EnumLite {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f19320a;

    /* renamed from: androidx.datastore.preferences.protobuf.NullValue$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static class AnonymousClass1 implements Internal.EnumLiteMap<NullValue> {
    }

    /* loaded from: classes2.dex */
    public static final class NullValueVerifier implements Internal.EnumVerifier {
        @Override // androidx.datastore.preferences.protobuf.Internal.EnumVerifier
        public final boolean a(int i2) {
            return (i2 != 0 ? null : NullValue.NULL_VALUE) != null;
        }
    }

    NullValue(int i2) {
        this.f19320a = i2;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f19320a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

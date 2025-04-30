package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0425a {
    protected int memoizedHashCode;

    public abstract int a();

    public final int b(InterfaceC0426a0 interfaceC0426a0) {
        AbstractC0446v abstractC0446v = (AbstractC0446v) this;
        int i9 = abstractC0446v.memoizedSerializedSize;
        if (i9 == -1) {
            int serializedSize = interfaceC0426a0.getSerializedSize(this);
            abstractC0446v.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }
        return i9;
    }

    public abstract void c(C0435j c0435j);
}

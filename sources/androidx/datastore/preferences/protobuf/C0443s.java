package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0443s implements O {
    public static final C0443s b = new C0443s(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4605a;

    public /* synthetic */ C0443s(int i9) {
        this.f4605a = i9;
    }

    @Override // androidx.datastore.preferences.protobuf.O
    public final boolean isSupported(Class cls) {
        switch (this.f4605a) {
            case 0:
                return AbstractC0446v.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.O
    public final Z messageInfoFor(Class cls) {
        switch (this.f4605a) {
            case 0:
                if (AbstractC0446v.class.isAssignableFrom(cls)) {
                    try {
                        return (Z) AbstractC0446v.e(cls.asSubclass(AbstractC0446v.class)).d(3);
                    } catch (Exception e4) {
                        throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e4);
                    }
                }
                throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}

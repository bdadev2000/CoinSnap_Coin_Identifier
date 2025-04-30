package Q1;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2467a;

    public final int a(Object obj) {
        switch (this.f2467a) {
            case 0:
                return ((byte[]) obj).length;
            default:
                return ((int[]) obj).length;
        }
    }

    public final int b() {
        switch (this.f2467a) {
            case 0:
                return 1;
            default:
                return 4;
        }
    }

    public final String c() {
        switch (this.f2467a) {
            case 0:
                return "ByteArrayPool";
            default:
                return "IntegerArrayPool";
        }
    }

    public final Object d(int i9) {
        switch (this.f2467a) {
            case 0:
                return new byte[i9];
            default:
                return new int[i9];
        }
    }
}

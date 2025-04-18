package h4;

/* loaded from: classes.dex */
public final class e implements a {
    public final /* synthetic */ int a;

    public final int a(Object obj) {
        switch (this.a) {
            case 0:
                return ((byte[]) obj).length;
            default:
                return ((int[]) obj).length;
        }
    }

    public final String b() {
        switch (this.a) {
            case 0:
                return "ByteArrayPool";
            default:
                return "IntegerArrayPool";
        }
    }
}

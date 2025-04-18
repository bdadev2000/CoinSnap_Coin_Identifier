package w7;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26866b;

    /* renamed from: c, reason: collision with root package name */
    public int f26867c;

    public a() {
        this.f26866b = 0;
    }

    public static String b(int i10) {
        return "" + ((char) ((i10 >> 24) & 255)) + ((char) ((i10 >> 16) & 255)) + ((char) ((i10 >> 8) & 255)) + ((char) (i10 & 255));
    }

    public final void a(int i10) {
        this.f26867c = i10 | this.f26867c;
    }

    public final boolean c(int i10) {
        return (this.f26867c & i10) == i10;
    }

    public final boolean d() {
        return c(Integer.MIN_VALUE);
    }

    public String toString() {
        switch (this.f26866b) {
            case 1:
                return b(this.f26867c);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ a(int i10, int i11) {
        this.f26866b = i11;
        this.f26867c = i10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10) {
        this(i10, 2);
        this.f26866b = 2;
    }
}

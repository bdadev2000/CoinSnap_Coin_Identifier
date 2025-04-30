package P1;

/* loaded from: classes.dex */
public final class l {
    public static final l b = new l(0);

    /* renamed from: c, reason: collision with root package name */
    public static final l f2353c = new l(1);

    /* renamed from: d, reason: collision with root package name */
    public static final l f2354d = new l(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2355a;

    public /* synthetic */ l(int i9) {
        this.f2355a = i9;
    }

    public final boolean a() {
        switch (this.f2355a) {
            case 0:
                return false;
            case 1:
                return true;
            default:
                return true;
        }
    }

    public final boolean b() {
        switch (this.f2355a) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return true;
        }
    }

    public final boolean c(int i9) {
        switch (this.f2355a) {
            case 0:
                return false;
            case 1:
                return (i9 == 3 || i9 == 5) ? false : true;
            default:
                return i9 == 2;
        }
    }

    public final boolean d(int i9, int i10, boolean z8) {
        switch (this.f2355a) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return ((z8 && i9 == 3) || i9 == 1) && i10 == 2;
        }
    }
}

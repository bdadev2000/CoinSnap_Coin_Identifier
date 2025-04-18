package s;

/* loaded from: classes.dex */
public final class c extends Throwable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24128b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(String str, int i10) {
        super(str);
        this.f24128b = i10;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        switch (this.f24128b) {
            case 0:
                synchronized (this) {
                }
                return this;
            case 1:
                synchronized (this) {
                }
                return this;
            default:
                synchronized (this) {
                }
                return this;
        }
    }
}

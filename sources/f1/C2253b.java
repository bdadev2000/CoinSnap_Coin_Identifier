package f1;

/* renamed from: f1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2253b extends Throwable {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2253b(String str, int i9) {
        super(str);
        this.b = i9;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        int i9 = this.b;
        synchronized (this) {
            switch (i9) {
                case 0:
                    return this;
                case 1:
                    return this;
                default:
                    return this;
            }
        }
    }
}

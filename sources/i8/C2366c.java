package i8;

/* renamed from: i8.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2366c extends w8.k {
    public final /* synthetic */ C2367d b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2366c(w8.y yVar, C2367d c2367d) {
        super(yVar);
        this.b = c2367d;
    }

    @Override // w8.k, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.b.close();
        super.close();
    }
}

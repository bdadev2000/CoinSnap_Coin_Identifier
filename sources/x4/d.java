package x4;

/* loaded from: classes.dex */
public final class d {
    public volatile boolean a;

    public final void a() {
        if (!this.a) {
        } else {
            throw new IllegalStateException("Already released");
        }
    }
}

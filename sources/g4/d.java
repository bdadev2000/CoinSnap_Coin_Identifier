package g4;

/* loaded from: classes.dex */
public final class d extends RuntimeException {
    private static final long serialVersionUID = -7530898992688511851L;

    public d(Throwable th2) {
        super("Unexpected exception thrown by non-Glide code", th2);
    }
}

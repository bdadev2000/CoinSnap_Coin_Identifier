package e4;

import java.io.IOException;

/* loaded from: classes.dex */
public final class d extends IOException {
    private static final long serialVersionUID = 1;

    public d(int i10, String str, IOException iOException) {
        super(str + ", status code: " + i10, iOException);
    }
}

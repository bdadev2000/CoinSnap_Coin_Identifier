package N1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class c extends IOException {
    private static final long serialVersionUID = 1;

    public c(String str, int i9, IOException iOException) {
        super(str + ", status code: " + i9, iOException);
    }
}

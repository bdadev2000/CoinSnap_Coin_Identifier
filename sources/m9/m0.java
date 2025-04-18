package m9;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class m0 extends IOException {
    public m0(Throwable th2) {
        super("Unexpected " + th2.getClass().getSimpleName() + ": " + th2.getMessage(), th2);
    }
}

package G7;

import java.io.ObjectStreamException;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class b implements Serializable {
    public static final b b = new Object();

    private Object readResolve() throws ObjectStreamException {
        return b;
    }
}

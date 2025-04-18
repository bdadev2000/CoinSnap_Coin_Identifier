package kotlin.jvm.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class g implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final g f30931a = new Object();

    private Object readResolve() throws ObjectStreamException {
        return f30931a;
    }
}

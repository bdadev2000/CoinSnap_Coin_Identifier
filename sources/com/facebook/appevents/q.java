package com.facebook.appevents;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class q implements Serializable {
    private static final long serialVersionUID = 20160629001L;
    public final HashMap b;

    public q(HashMap hashMap) {
        G7.j.e(hashMap, "proxyEvents");
        this.b = hashMap;
    }

    private final Object readResolve() throws ObjectStreamException {
        return new r(this.b);
    }
}

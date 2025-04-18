package com.applovin.impl;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public interface g5 extends e5 {

    /* loaded from: classes.dex */
    public interface a {
        g5 a();
    }

    long a(j5 j5Var);

    void a(yo yoVar);

    Uri c();

    void close();

    default Map e() {
        return Collections.emptyMap();
    }
}

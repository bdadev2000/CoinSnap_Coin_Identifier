package com.applovin.impl;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public interface i5 extends g5 {

    /* loaded from: classes.dex */
    public interface a {
        i5 a();
    }

    long a(l5 l5Var);

    void a(xo xoVar);

    Uri c();

    void close();

    default Map e() {
        return Collections.emptyMap();
    }
}

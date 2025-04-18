package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.o2;

/* loaded from: classes.dex */
public abstract class ki implements o2 {

    /* renamed from: a */
    public static final o2.a f24921a = new rs(21);

    public static ki a(Bundle bundle) {
        int i2 = bundle.getInt(a(0), -1);
        if (i2 == 0) {
            return (ki) na.d.a(bundle);
        }
        if (i2 == 1) {
            return (ki) gh.f24106c.a(bundle);
        }
        if (i2 == 2) {
            return (ki) cl.d.a(bundle);
        }
        if (i2 == 3) {
            return (ki) co.d.a(bundle);
        }
        throw new IllegalArgumentException(android.support.v4.media.d.i("Encountered unknown rating type: ", i2));
    }

    public static /* synthetic */ ki c(Bundle bundle) {
        return a(bundle);
    }

    private static String a(int i2) {
        return Integer.toString(i2, 36);
    }
}

package com.applovin.impl;

import com.applovin.impl.mc;
import com.applovin.impl.oc;
import com.applovin.impl.qa;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes3.dex */
public class g6 implements mc {

    /* renamed from: a, reason: collision with root package name */
    private final int f24055a;

    public g6() {
        this(-1);
    }

    @Override // com.applovin.impl.mc
    public int a(int i2) {
        int i3 = this.f24055a;
        return i3 == -1 ? i2 == 7 ? 6 : 3 : i3;
    }

    public g6(int i2) {
        this.f24055a = i2;
    }

    @Override // com.applovin.impl.mc
    public long a(mc.a aVar) {
        IOException iOException = aVar.f25241c;
        if ((iOException instanceof dh) || (iOException instanceof FileNotFoundException) || (iOException instanceof qa.a) || (iOException instanceof oc.h) || j5.a(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((aVar.d - 1) * 1000, 5000);
    }
}

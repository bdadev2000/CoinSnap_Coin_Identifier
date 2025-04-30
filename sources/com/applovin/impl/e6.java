package com.applovin.impl;

import com.applovin.impl.hc;
import com.applovin.impl.jc;
import com.applovin.impl.ma;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes.dex */
public class e6 implements hc {

    /* renamed from: a, reason: collision with root package name */
    private final int f7385a;

    public e6() {
        this(-1);
    }

    @Override // com.applovin.impl.hc
    public int a(int i9) {
        int i10 = this.f7385a;
        return i10 == -1 ? i9 == 7 ? 6 : 3 : i10;
    }

    public e6(int i9) {
        this.f7385a = i9;
    }

    @Override // com.applovin.impl.hc
    public long a(hc.a aVar) {
        IOException iOException = aVar.f8122c;
        return ((iOException instanceof ah) || (iOException instanceof FileNotFoundException) || (iOException instanceof ma.a) || (iOException instanceof jc.h) || h5.a(iOException)) ? com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET : Math.min((aVar.f8123d - 1) * 1000, 5000);
    }
}

package com.applovin.impl;

import com.applovin.impl.hc;
import com.applovin.impl.jc;
import com.applovin.impl.ma;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes.dex */
public class e6 implements hc {
    private final int a;

    public e6() {
        this(-1);
    }

    @Override // com.applovin.impl.hc
    public int a(int i10) {
        int i11 = this.a;
        return i11 == -1 ? i10 == 7 ? 6 : 3 : i11;
    }

    public e6(int i10) {
        this.a = i10;
    }

    @Override // com.applovin.impl.hc
    public long a(hc.a aVar) {
        IOException iOException = aVar.f5145c;
        return ((iOException instanceof ah) || (iOException instanceof FileNotFoundException) || (iOException instanceof ma.a) || (iOException instanceof jc.h) || h5.a(iOException)) ? C.TIME_UNSET : Math.min((aVar.f5146d - 1) * 1000, 5000);
    }
}

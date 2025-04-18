package com.applovin.impl;

import com.applovin.impl.ej;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes.dex */
interface hj extends ej {

    /* loaded from: classes.dex */
    public static class a extends ej.b implements hj {
        public a() {
            super(C.TIME_UNSET);
        }

        @Override // com.applovin.impl.hj
        public long a(long j3) {
            return 0L;
        }

        @Override // com.applovin.impl.hj
        public long c() {
            return -1L;
        }
    }

    long a(long j3);

    long c();
}

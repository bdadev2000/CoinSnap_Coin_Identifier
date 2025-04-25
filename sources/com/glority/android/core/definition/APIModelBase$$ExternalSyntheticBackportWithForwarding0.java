package com.glority.android.core.definition;

import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class APIModelBase$$ExternalSyntheticBackportWithForwarding0 {
    public static /* synthetic */ BigDecimal m(BigDecimal bigDecimal) {
        return bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros();
    }
}

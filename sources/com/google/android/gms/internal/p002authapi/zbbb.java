package com.google.android.gms.internal.p002authapi;

import android.util.Base64;
import java.util.Random;

/* compiled from: com.google.android.gms:play-services-auth@@20.5.0 */
/* loaded from: classes12.dex */
public final class zbbb {
    private static final Random zba = new Random();

    public static String zba() {
        byte[] bArr = new byte[16];
        zba.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}

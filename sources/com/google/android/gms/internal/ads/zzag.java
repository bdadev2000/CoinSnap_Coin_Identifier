package com.google.android.gms.internal.ads;

import eb.j;

/* loaded from: classes3.dex */
public final class zzag {
    public /* synthetic */ zzag(zzm zzmVar, int i10, int i11, float f10, long j3, zzaf zzafVar) {
        boolean z10;
        String i12 = j.i("width must be positive, but is: ", i10);
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdb.zze(z10, i12);
        zzdb.zze(i11 > 0, "height must be positive, but is: " + i11);
    }
}

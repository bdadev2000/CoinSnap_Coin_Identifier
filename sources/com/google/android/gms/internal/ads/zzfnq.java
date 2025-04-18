package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.view.View;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class zzfnq extends zzfnt {

    @SuppressLint({"StaticFieldLeak"})
    private static final zzfnq zzb = new zzfnq();

    private zzfnq() {
    }

    public static zzfnq zza() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfnt
    public final void zzb(boolean z10) {
        Iterator it = zzfnr.zza().zzc().iterator();
        while (it.hasNext()) {
            ((zzfna) it.next()).zzg().zzk(z10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfnt
    public final boolean zzc() {
        Iterator it = zzfnr.zza().zzb().iterator();
        while (it.hasNext()) {
            View zzf = ((zzfna) it.next()).zzf();
            if (zzf != null && zzf.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}

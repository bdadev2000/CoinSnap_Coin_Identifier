package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.view.View;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class zzfpd extends zzfpg {

    @SuppressLint({"StaticFieldLeak"})
    private static final zzfpd zzb = new zzfpd();

    private zzfpd() {
    }

    public static zzfpd zza() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfpg
    public final void zzb(boolean z8) {
        Iterator it = zzfpe.zza().zzc().iterator();
        while (it.hasNext()) {
            ((zzfon) it.next()).zzg().zzk(z8);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfpg
    public final boolean zzc() {
        Iterator it = zzfpe.zza().zzb().iterator();
        while (it.hasNext()) {
            View zzf = ((zzfon) it.next()).zzf();
            if (zzf != null && zzf.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}

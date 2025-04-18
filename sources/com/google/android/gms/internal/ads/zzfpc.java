package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.view.View;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class zzfpc extends zzfpf {

    @SuppressLint({"StaticFieldLeak"})
    private static final zzfpc zzb = new zzfpc();

    private zzfpc() {
    }

    public static zzfpc zza() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfpf
    public final void zzb(boolean z2) {
        Iterator it = zzfpd.zza().zzc().iterator();
        while (it.hasNext()) {
            ((zzfom) it.next()).zzg().zzk(z2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfpf
    public final boolean zzc() {
        Iterator it = zzfpd.zza().zzb().iterator();
        while (it.hasNext()) {
            View zzf = ((zzfom) it.next()).zzf();
            if (zzf != null && zzf.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}

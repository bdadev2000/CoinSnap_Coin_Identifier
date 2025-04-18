package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzavc;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzp implements View.OnTouchListener {
    final /* synthetic */ zzu zza;

    public zzp(zzu zzuVar) {
        this.zza = zzuVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        zzavc zzavcVar;
        zzavc zzavcVar2;
        zzu zzuVar = this.zza;
        zzavcVar = zzuVar.zzh;
        if (zzavcVar == null) {
            return false;
        }
        zzavcVar2 = zzuVar.zzh;
        zzavcVar2.zzd(motionEvent);
        return false;
    }
}

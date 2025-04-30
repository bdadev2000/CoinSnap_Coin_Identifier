package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzaxd;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzo implements View.OnTouchListener {
    final /* synthetic */ zzt zza;

    public zzo(zzt zztVar) {
        this.zza = zztVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        zzaxd zzaxdVar;
        zzaxd zzaxdVar2;
        zzt zztVar = this.zza;
        zzaxdVar = zztVar.zzh;
        if (zzaxdVar != null) {
            zzaxdVar2 = zztVar.zzh;
            zzaxdVar2.zzd(motionEvent);
            return false;
        }
        return false;
    }
}

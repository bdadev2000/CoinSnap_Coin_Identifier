package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzavn;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzo implements View.OnTouchListener {
    final /* synthetic */ zzt zza;

    public zzo(zzt zztVar) {
        this.zza = zztVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        zzavn zzavnVar;
        zzavn zzavnVar2;
        zzt zztVar = this.zza;
        zzavnVar = zztVar.zzh;
        if (zzavnVar == null) {
            return false;
        }
        zzavnVar2 = zztVar.zzh;
        zzavnVar2.zzd(motionEvent);
        return false;
    }
}

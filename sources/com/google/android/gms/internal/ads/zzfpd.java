package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* loaded from: classes3.dex */
public abstract class zzfpd extends AsyncTask {
    private zzfpe zza;
    protected final zzfov zzd;

    public zzfpd(zzfov zzfovVar) {
        this.zzd = zzfovVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        zzfpe zzfpeVar = this.zza;
        if (zzfpeVar != null) {
            zzfpeVar.zza(this);
        }
    }

    public final void zzb(zzfpe zzfpeVar) {
        this.zza = zzfpeVar;
    }
}

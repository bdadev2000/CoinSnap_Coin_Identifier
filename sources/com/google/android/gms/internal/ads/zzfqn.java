package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* loaded from: classes4.dex */
public abstract class zzfqn extends AsyncTask {
    private zzfqo zza;
    protected final zzfqf zzd;

    public zzfqn(zzfqf zzfqfVar) {
        this.zzd = zzfqfVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        zzfqo zzfqoVar = this.zza;
        if (zzfqoVar != null) {
            zzfqoVar.zza(this);
        }
    }

    public final void zzb(zzfqo zzfqoVar) {
        this.zza = zzfqoVar;
    }
}

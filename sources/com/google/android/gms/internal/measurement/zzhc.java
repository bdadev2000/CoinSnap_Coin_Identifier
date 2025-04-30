package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzhc extends zzgz<Boolean> {
    public zzhc(zzhh zzhhVar, String str, Boolean bool, boolean z8) {
        super(zzhhVar, str, bool);
    }

    @Override // com.google.android.gms.internal.measurement.zzgz
    public final /* synthetic */ Boolean zza(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (zzfy.zzc.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (zzfy.zzd.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        Log.e("PhenotypeFlag", "Invalid boolean value for " + zzb() + ": " + String.valueOf(obj));
        return null;
    }
}

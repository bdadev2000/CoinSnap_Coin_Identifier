package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzhn extends zzhj<Long> {
    public zzhn(zzhr zzhrVar, String str, Long l10, boolean z10) {
        super(zzhrVar, str, l10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.zzhj
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final Long zza(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        Log.e("PhenotypeFlag", "Invalid long value for " + super.zzb() + ": " + String.valueOf(obj));
        return null;
    }
}

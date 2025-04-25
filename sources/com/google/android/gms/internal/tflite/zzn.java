package com.google.android.gms.internal.tflite;

import android.content.Context;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-tflite-impl@@16.1.0 */
/* loaded from: classes12.dex */
final class zzn extends zzr {
    private final Context zza;
    private final zzv zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzn(Context context, @Nullable zzv zzvVar) {
        this.zza = context;
        this.zzb = zzvVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzr) {
            zzr zzrVar = (zzr) obj;
            if (this.zza.equals(zzrVar.zza()) && this.zzb.equals(zzrVar.zzb())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
    }

    public final String toString() {
        return "FlagsContext{context=" + this.zza.toString() + ", hermeticFileOverrides=" + this.zzb.toString() + "}";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.tflite.zzr
    public final Context zza() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.tflite.zzr
    @Nullable
    public final zzv zzb() {
        return this.zzb;
    }
}

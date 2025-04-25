package com.google.android.gms.tflite.client;

/* compiled from: com.google.android.gms:play-services-tflite-impl@@16.1.0 */
/* loaded from: classes12.dex */
final class zzc extends TfLiteInitializationOptions {
    private final boolean zza;
    private final boolean zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzc(boolean z, boolean z2, boolean z3, zzb zzbVar) {
        this.zza = z;
        this.zzb = z3;
    }

    @Override // com.google.android.gms.tflite.client.TfLiteInitializationOptions
    public final boolean enableAutomaticDownload() {
        return this.zzb;
    }

    @Override // com.google.android.gms.tflite.client.TfLiteInitializationOptions
    public final boolean enableGpuDelegateSupport() {
        return this.zza;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TfLiteInitializationOptions) {
            TfLiteInitializationOptions tfLiteInitializationOptions = (TfLiteInitializationOptions) obj;
            if (this.zza == tfLiteInitializationOptions.enableGpuDelegateSupport()) {
                tfLiteInitializationOptions.zza();
                if (this.zzb == tfLiteInitializationOptions.enableAutomaticDownload()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((true != this.zza ? 1237 : 1231) ^ 1000003) * 1000003) ^ 1237) * 1000003) ^ (true != this.zzb ? 1237 : 1231);
    }

    public final String toString() {
        return "TfLiteInitializationOptions{enableGpuDelegateSupport=" + this.zza + ", enableTpuDelegateSupport=false, enableAutomaticDownload=" + this.zzb + "}";
    }

    @Override // com.google.android.gms.tflite.client.TfLiteInitializationOptions
    public final boolean zza() {
        return false;
    }
}

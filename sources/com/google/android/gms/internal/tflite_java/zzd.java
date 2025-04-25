package com.google.android.gms.internal.tflite_java;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tflite.client.TfLiteInitializationOptions;

/* compiled from: com.google.android.gms:play-services-tflite-java@@16.1.0 */
/* loaded from: classes12.dex */
final class zzd {
    private final Task zza;
    private final TfLiteInitializationOptions zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzd(Task task, TfLiteInitializationOptions tfLiteInitializationOptions, zzc zzcVar) {
        this.zza = task;
        this.zzb = tfLiteInitializationOptions;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Task zza(TfLiteInitializationOptions tfLiteInitializationOptions) {
        if (!tfLiteInitializationOptions.enableGpuDelegateSupport() || this.zzb.enableGpuDelegateSupport()) {
            return this.zza;
        }
        throw new IllegalStateException("TFLite has already been initialized without GPU delegate support");
    }
}

package com.google.android.gms.tflite.dynamite.internal;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tflite.client.TfLiteInitializationOptions;

/* compiled from: com.google.android.gms:play-services-tflite-impl@@16.1.0 */
/* loaded from: classes12.dex */
public final /* synthetic */ class zzf implements SuccessContinuation {
    public final /* synthetic */ zzi zza;
    public final /* synthetic */ TfLiteInitializationOptions zzb;

    public /* synthetic */ zzf(zzi zziVar, TfLiteInitializationOptions tfLiteInitializationOptions) {
        this.zza = zziVar;
        this.zzb = tfLiteInitializationOptions;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        return this.zza.zza(this.zzb, (Void) obj);
    }
}

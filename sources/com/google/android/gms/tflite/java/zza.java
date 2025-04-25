package com.google.android.gms.tflite.java;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tflite.client.TfLiteInitializationOptions;
import com.google.android.gms.tflite.internal.TfLiteJavaInitializerBase;
import org.tensorflow.lite.TensorFlowLite;

/* compiled from: com.google.android.gms:play-services-tflite-java@@16.1.0 */
/* loaded from: classes12.dex */
public final class zza extends TfLiteJavaInitializerBase {
    public zza(Context context) {
        super(context);
    }

    public final Task zza() {
        return super.zzb(TfLiteInitializationOptions.builder().setEnableAutomaticDownload(true).build());
    }

    @Override // com.google.android.gms.internal.tflite_java.zze
    public final Task zzb(TfLiteInitializationOptions tfLiteInitializationOptions) {
        return super.zzb(TfLiteInitializationOptions.builder(tfLiteInitializationOptions).setEnableAutomaticDownload(true).build());
    }

    @Override // com.google.android.gms.internal.tflite_java.zze
    protected final void zzc() {
        TensorFlowLite.init();
    }
}

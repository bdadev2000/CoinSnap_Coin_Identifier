package com.google.android.gms.tflite.java;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tflite.client.TfLiteClient;
import com.google.android.gms.tflite.client.TfLiteInitializationOptions;

/* compiled from: com.google.android.gms:play-services-tflite-java@@16.1.0 */
/* loaded from: classes12.dex */
public class TfLite {
    private TfLite() {
    }

    public static TfLiteClient getClient(Context context) {
        return new zza(context).zze();
    }

    public static Task<Void> initialize(Context context) {
        return new zza(context).zza();
    }

    public static Task<Void> initialize(Context context, TfLiteInitializationOptions tfLiteInitializationOptions) {
        return new zza(context).zzb(tfLiteInitializationOptions);
    }
}

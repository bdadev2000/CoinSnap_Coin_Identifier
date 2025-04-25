package com.google.android.gms.tflite.client;

/* compiled from: com.google.android.gms:play-services-tflite-impl@@16.1.0 */
/* loaded from: classes12.dex */
public abstract class TfLiteInitializationOptions {

    /* compiled from: com.google.android.gms:play-services-tflite-impl@@16.1.0 */
    /* loaded from: classes12.dex */
    public static abstract class Builder {
        public abstract TfLiteInitializationOptions build();

        public abstract Builder setEnableAutomaticDownload(boolean z);

        public abstract Builder setEnableGpuDelegateSupport(boolean z);

        public abstract Builder zza(boolean z);
    }

    public static Builder builder() {
        zza zzaVar = new zza();
        zzaVar.setEnableGpuDelegateSupport(false);
        zzaVar.zza(false);
        zzaVar.setEnableAutomaticDownload(false);
        return zzaVar;
    }

    public abstract boolean enableAutomaticDownload();

    public abstract boolean enableGpuDelegateSupport();

    public abstract boolean zza();

    public static Builder builder(TfLiteInitializationOptions tfLiteInitializationOptions) {
        Builder builder = builder();
        builder.setEnableGpuDelegateSupport(tfLiteInitializationOptions.enableGpuDelegateSupport());
        tfLiteInitializationOptions.zza();
        builder.zza(false);
        builder.setEnableAutomaticDownload(tfLiteInitializationOptions.enableAutomaticDownload());
        return builder;
    }
}

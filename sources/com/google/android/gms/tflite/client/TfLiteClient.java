package com.google.android.gms.tflite.client;

import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tflite.dynamite.NativeInitializationHandle;

/* compiled from: com.google.android.gms:play-services-tflite-impl@@16.1.0 */
/* loaded from: classes12.dex */
public interface TfLiteClient extends OptionalModuleApi {
    public static final TfLiteInitializationOptions DEFAULT_TFLITE_INITIALIZATION_OPTIONS = TfLiteInitializationOptions.builder().build();

    Task<NativeInitializationHandle> getTfLiteNativeInitializationHandle();

    Task<NativeInitializationHandle> getTfLiteNativeInitializationHandle(TfLiteInitializationOptions tfLiteInitializationOptions);
}

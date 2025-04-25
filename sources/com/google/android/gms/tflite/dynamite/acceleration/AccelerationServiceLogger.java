package com.google.android.gms.tflite.dynamite.acceleration;

/* compiled from: com.google.android.gms:play-services-tflite-impl@@16.1.0 */
/* loaded from: classes12.dex */
public interface AccelerationServiceLogger {
    void logApplyValidatedConfig(int i, ApplyValidatedConfigStatus applyValidatedConfigStatus);

    void logGenerateBestConfigCounter();

    void logSelectBestConfigCounter();

    void logValidateConfigCounter();

    void logValidationResult(byte[] bArr, ValidationSettings validationSettings);
}

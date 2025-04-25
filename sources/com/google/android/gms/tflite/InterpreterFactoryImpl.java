package com.google.android.gms.tflite;

import com.google.android.gms.tflite.nnapi.NnApiDelegateImpl;
import java.io.File;
import java.nio.ByteBuffer;
import org.tensorflow.lite.InterpreterApi;
import org.tensorflow.lite.InterpreterFactoryApi;
import org.tensorflow.lite.TensorFlowLite;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* compiled from: com.google.android.gms:play-services-tflite-java@@16.1.0 */
/* loaded from: classes12.dex */
class InterpreterFactoryImpl implements InterpreterFactoryApi {
    private static native String nativeRuntimeVersion();

    private static native String nativeSchemaVersion();

    @Override // org.tensorflow.lite.InterpreterFactoryApi
    public final InterpreterApi create(File file, InterpreterApi.Options options) {
        return new zzd(file, options == null ? null : new zzc(options));
    }

    @Override // org.tensorflow.lite.InterpreterFactoryApi
    public final NnApiDelegate.PrivateInterface createNnApiDelegateImpl(NnApiDelegate.Options options) {
        return new NnApiDelegateImpl(options);
    }

    @Override // org.tensorflow.lite.InterpreterFactoryApi
    public final String runtimeVersion() {
        TensorFlowLite.init();
        return nativeRuntimeVersion();
    }

    @Override // org.tensorflow.lite.InterpreterFactoryApi
    public final String schemaVersion() {
        TensorFlowLite.init();
        return nativeSchemaVersion();
    }

    @Override // org.tensorflow.lite.InterpreterFactoryApi
    public final InterpreterApi create(ByteBuffer byteBuffer, InterpreterApi.Options options) {
        return new zzd(byteBuffer, options == null ? null : new zzc(options));
    }
}

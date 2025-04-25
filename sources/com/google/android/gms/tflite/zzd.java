package com.google.android.gms.tflite;

import java.io.File;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import org.tensorflow.lite.InterpreterApi;
import org.tensorflow.lite.Tensor;

/* compiled from: com.google.android.gms:play-services-tflite-java@@16.1.0 */
/* loaded from: classes12.dex */
final class zzd implements InterpreterApi {
    NativeInterpreterWrapper zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzd(File file, zzc zzcVar) {
        this.zza = new NativeInterpreterWrapper(file.getAbsolutePath(), zzcVar);
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public final void allocateTensors() {
        zza();
        this.zza.zzh();
    }

    @Override // org.tensorflow.lite.InterpreterApi, java.lang.AutoCloseable
    public final void close() {
        NativeInterpreterWrapper nativeInterpreterWrapper = this.zza;
        if (nativeInterpreterWrapper != null) {
            nativeInterpreterWrapper.close();
            this.zza = null;
        }
    }

    protected final void finalize() throws Throwable {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public final int getInputIndex(String str) {
        zza();
        return this.zza.zza(str);
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public final Tensor getInputTensor(int i) {
        zza();
        return this.zza.zze(i);
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public final int getInputTensorCount() {
        zza();
        return this.zza.zzb();
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public final Long getLastNativeInferenceDurationNanoseconds() {
        zza();
        return this.zza.zzg();
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public final int getOutputIndex(String str) {
        zza();
        return this.zza.zzc(str);
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public final Tensor getOutputTensor(int i) {
        zza();
        return this.zza.zzf(i);
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public final int getOutputTensorCount() {
        zza();
        return this.zza.zzd();
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public final void resizeInput(int i, int[] iArr) {
        zza();
        this.zza.zzi(i, iArr, false);
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public final void run(Object obj, Object obj2) {
        HashMap hashMap = new HashMap();
        hashMap.put(0, obj2);
        runForMultipleInputsOutputs(new Object[]{obj}, hashMap);
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public final void runForMultipleInputsOutputs(Object[] objArr, Map map) {
        zza();
        this.zza.zzj(objArr, map);
    }

    final void zza() {
        if (this.zza == null) {
            throw new IllegalStateException("Internal error: The Interpreter has already been closed.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzd(ByteBuffer byteBuffer, zzc zzcVar) {
        this.zza = new NativeInterpreterWrapper(byteBuffer, zzcVar);
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public final void resizeInput(int i, int[] iArr, boolean z) {
        zza();
        this.zza.zzi(i, iArr, z);
    }
}

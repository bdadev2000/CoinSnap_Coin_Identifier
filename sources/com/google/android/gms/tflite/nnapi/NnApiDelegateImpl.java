package com.google.android.gms.tflite.nnapi;

import org.tensorflow.lite.Delegate;
import org.tensorflow.lite.TensorFlowLite;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* compiled from: com.google.android.gms:play-services-tflite-java@@16.1.0 */
/* loaded from: classes12.dex */
public class NnApiDelegateImpl implements NnApiDelegate.PrivateInterface, Delegate, AutoCloseable {
    private long zza;

    public NnApiDelegateImpl(NnApiDelegate.Options options) {
        TensorFlowLite.init();
        int executionPreference = options.getExecutionPreference();
        String acceleratorName = options.getAcceleratorName();
        String cacheDir = options.getCacheDir();
        String modelToken = options.getModelToken();
        int maxNumberOfDelegatedPartitions = options.getMaxNumberOfDelegatedPartitions();
        Boolean useNnapiCpu = options.getUseNnapiCpu();
        this.zza = createDelegate(executionPreference, acceleratorName, cacheDir, modelToken, maxNumberOfDelegatedPartitions, useNnapiCpu != null, options.getUseNnapiCpu() == null || !options.getUseNnapiCpu().booleanValue(), options.getAllowFp16(), options.getNnApiSupportLibraryHandle());
    }

    private static native long createDelegate(int i, String str, String str2, String str3, int i2, boolean z, boolean z2, boolean z3, long j);

    private static native void deleteDelegate(long j);

    private static native int getNnapiErrno(long j);

    @Override // org.tensorflow.lite.nnapi.NnApiDelegate.PrivateInterface, org.tensorflow.lite.Delegate, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j = this.zza;
        if (j != 0) {
            deleteDelegate(j);
            this.zza = 0L;
        }
    }

    @Override // org.tensorflow.lite.Delegate
    public final long getNativeHandle() {
        return this.zza;
    }

    @Override // org.tensorflow.lite.nnapi.NnApiDelegate.PrivateInterface
    public final int getNnapiErrno() {
        long j = this.zza;
        if (j != 0) {
            return getNnapiErrno(j);
        }
        throw new IllegalStateException("Should not access delegate after it has been closed.");
    }
}

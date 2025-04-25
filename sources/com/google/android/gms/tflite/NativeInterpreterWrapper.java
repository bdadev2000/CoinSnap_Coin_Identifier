package com.google.android.gms.tflite;

import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.tensorflow.lite.Delegate;
import org.tensorflow.lite.DelegateFactory;
import org.tensorflow.lite.InterpreterApi;
import org.tensorflow.lite.RuntimeFlavor;
import org.tensorflow.lite.TensorFlowLite;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* compiled from: com.google.android.gms:play-services-tflite-java@@16.1.0 */
/* loaded from: classes12.dex */
class NativeInterpreterWrapper implements AutoCloseable {
    private static final RuntimeFlavor zzc = RuntimeFlavor.SYSTEM;
    long zza;
    long zzb;
    private long zzd;
    private ByteBuffer zzf;
    private Map zzg;
    private Map zzh;
    private TensorImpl[] zzi;
    private TensorImpl[] zzj;
    private long zze = 0;
    private long inferenceDurationNanoseconds = -1;
    private boolean zzk = false;
    private final List zzl = new ArrayList();
    private final List zzm = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public NativeInterpreterWrapper(String str, zzc zzcVar) {
        TensorFlowLite.init();
        long createErrorReporter = createErrorReporter(512);
        zzl(createErrorReporter, createModel(str, createErrorReporter), zzcVar);
    }

    private static native long allocateTensors(long j, long j2);

    private static native long createCancellationFlag(long j);

    private static native long createErrorReporter(int i);

    private static native long createInterpreter(long j, long j2, int i, boolean z, List<Long> list);

    private static native long createModel(String str, long j);

    private static native long createModelWithBuffer(ByteBuffer byteBuffer, long j);

    private static native void delete(long j, long j2, long j3);

    private static native long deleteCancellationFlag(long j);

    private static native int getInputCount(long j);

    private static native String[] getInputNames(long j);

    private static native int getInputTensorIndex(long j, int i);

    private static native int getOutputCount(long j);

    private static native String[] getOutputNames(long j);

    private static native int getOutputTensorIndex(long j, int i);

    private static native boolean hasUnresolvedFlexOp(long j);

    private static native boolean resizeInput(long j, long j2, int i, int[] iArr, boolean z);

    private static native void run(long j, long j2);

    private static Delegate zzk(List list) {
        try {
            Class<?> cls = Class.forName("com.google.android.gms.tflite.flex.FlexDelegate");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (cls.isInstance((Delegate) it.next())) {
                    return null;
                }
            }
            return (Delegate) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException unused) {
            return null;
        }
    }

    private final void zzl(long j, long j2, zzc zzcVar) {
        Delegate zzk;
        if (zzcVar == null) {
            zzcVar = new zzc();
        }
        if (zzcVar.getAccelerationConfig() != null) {
            zzcVar.getAccelerationConfig().apply(zzcVar);
        }
        this.zza = j;
        this.zzd = j2;
        ArrayList arrayList = new ArrayList();
        long createInterpreter = createInterpreter(j2, j, zzcVar.getNumThreads(), zzcVar.getUseXNNPACK(), arrayList);
        this.zzb = createInterpreter;
        if (hasUnresolvedFlexOp(createInterpreter) && (zzk = zzk(zzcVar.getDelegates())) != null) {
            this.zzm.add(zzk);
            this.zzl.add(zzk);
        }
        for (Delegate delegate : zzcVar.getDelegates()) {
            if (zzcVar.getRuntime() == InterpreterApi.Options.TfLiteRuntime.FROM_APPLICATION_ONLY || (delegate instanceof NnApiDelegate)) {
                this.zzl.add(delegate);
            } else {
                throw new IllegalArgumentException("Instantiated delegates (other than NnApiDelegate) are not allowed when using TF Lite from Google Play Services. Please use InterpreterApi.Options.addDelegateFactory() with an appropriate DelegateFactory instead.");
            }
        }
        Iterator<DelegateFactory> it = zzcVar.getDelegateFactories().iterator();
        while (it.hasNext()) {
            Delegate create = it.next().create(zzc);
            this.zzm.add(create);
            this.zzl.add(create);
        }
        if (zzcVar.getUseNNAPI()) {
            NnApiDelegate nnApiDelegate = new NnApiDelegate();
            this.zzm.add(nnApiDelegate);
            this.zzl.add(nnApiDelegate);
        }
        InterpreterFactoryImpl interpreterFactoryImpl = new InterpreterFactoryImpl();
        for (Delegate delegate2 : this.zzl) {
            if (delegate2 instanceof NnApiDelegate) {
                ((NnApiDelegate) delegate2).initWithInterpreterFactoryApi(interpreterFactoryImpl);
            }
        }
        arrayList.ensureCapacity(this.zzl.size());
        Iterator it2 = this.zzl.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(((Delegate) it2.next()).getNativeHandle()));
        }
        if (!arrayList.isEmpty()) {
            delete(0L, 0L, this.zzb);
            this.zzb = createInterpreter(j2, j, zzcVar.getNumThreads(), zzcVar.getUseXNNPACK(), arrayList);
        }
        if (zzcVar.isCancellable()) {
            this.zze = createCancellationFlag(this.zzb);
        }
        this.zzi = new TensorImpl[getInputCount(this.zzb)];
        this.zzj = new TensorImpl[getOutputCount(this.zzb)];
        allocateTensors(this.zzb, j);
        this.zzk = true;
    }

    private final boolean zzm() {
        if (this.zzk) {
            return false;
        }
        this.zzk = true;
        allocateTensors(this.zzb, this.zza);
        for (TensorImpl tensorImpl : this.zzj) {
            if (tensorImpl != null) {
                tensorImpl.zzf();
            }
        }
        return true;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        int i = 0;
        while (true) {
            TensorImpl[] tensorImplArr = this.zzi;
            if (i >= tensorImplArr.length) {
                break;
            }
            TensorImpl tensorImpl = tensorImplArr[i];
            if (tensorImpl != null) {
                tensorImpl.zzc();
                this.zzi[i] = null;
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            TensorImpl[] tensorImplArr2 = this.zzj;
            if (i2 >= tensorImplArr2.length) {
                break;
            }
            TensorImpl tensorImpl2 = tensorImplArr2[i2];
            if (tensorImpl2 != null) {
                tensorImpl2.zzc();
                this.zzj[i2] = null;
            }
            i2++;
        }
        delete(this.zza, this.zzd, this.zzb);
        deleteCancellationFlag(this.zze);
        this.zza = 0L;
        this.zzd = 0L;
        this.zzb = 0L;
        this.zze = 0L;
        this.zzf = null;
        this.zzg = null;
        this.zzh = null;
        this.zzk = false;
        this.zzl.clear();
        Iterator it = this.zzm.iterator();
        while (it.hasNext()) {
            ((Delegate) it.next()).close();
        }
        this.zzm.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zza(String str) {
        if (this.zzg == null) {
            String[] inputNames = getInputNames(this.zzb);
            this.zzg = new HashMap();
            if (inputNames != null) {
                for (int i = 0; i < inputNames.length; i++) {
                    this.zzg.put(inputNames[i], Integer.valueOf(i));
                }
            }
        }
        if (!this.zzg.containsKey(str)) {
            throw new IllegalArgumentException(String.format("Input error: '%s' is not a valid name for any input. Names of inputs and their indexes are %s", str, this.zzg));
        }
        return ((Integer) this.zzg.get(str)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzb() {
        return this.zzi.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzc(String str) {
        if (this.zzh == null) {
            String[] outputNames = getOutputNames(this.zzb);
            this.zzh = new HashMap();
            if (outputNames != null) {
                for (int i = 0; i < outputNames.length; i++) {
                    this.zzh.put(outputNames[i], Integer.valueOf(i));
                }
            }
        }
        if (!this.zzh.containsKey(str)) {
            throw new IllegalArgumentException(String.format("Input error: '%s' is not a valid name for any output. Names of outputs and their indexes are %s", str, this.zzh));
        }
        return ((Integer) this.zzh.get(str)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzd() {
        return this.zzj.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final TensorImpl zze(int i) {
        if (i >= 0) {
            TensorImpl[] tensorImplArr = this.zzi;
            if (i < tensorImplArr.length) {
                TensorImpl tensorImpl = tensorImplArr[i];
                if (tensorImpl != null) {
                    return tensorImpl;
                }
                long j = this.zzb;
                TensorImpl zzb = TensorImpl.zzb(j, getInputTensorIndex(j, i));
                tensorImplArr[i] = zzb;
                return zzb;
            }
        }
        throw new IllegalArgumentException("Invalid input Tensor index: " + i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final TensorImpl zzf(int i) {
        if (i >= 0) {
            TensorImpl[] tensorImplArr = this.zzj;
            if (i < tensorImplArr.length) {
                TensorImpl tensorImpl = tensorImplArr[i];
                if (tensorImpl != null) {
                    return tensorImpl;
                }
                long j = this.zzb;
                TensorImpl zzb = TensorImpl.zzb(j, getOutputTensorIndex(j, i));
                tensorImplArr[i] = zzb;
                return zzb;
            }
        }
        throw new IllegalArgumentException("Invalid output Tensor index: " + i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Long zzg() {
        long j = this.inferenceDurationNanoseconds;
        if (j < 0) {
            return null;
        }
        return Long.valueOf(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzh() {
        zzm();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzi(int i, int[] iArr, boolean z) {
        if (resizeInput(this.zzb, this.zza, i, iArr, z)) {
            this.zzk = false;
            TensorImpl tensorImpl = this.zzi[i];
            if (tensorImpl != null) {
                tensorImpl.zzf();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzj(Object[] objArr, Map map) {
        this.inferenceDurationNanoseconds = -1L;
        if (objArr == null || objArr.length == 0) {
            throw new IllegalArgumentException("Input error: Inputs should not be null or empty.");
        }
        if (map != null) {
            for (int i = 0; i < objArr.length; i++) {
                int[] zzh = zze(i).zzh(objArr[i]);
                if (zzh != null) {
                    zzi(i, zzh, false);
                }
            }
            boolean zzm = zzm();
            for (int i2 = 0; i2 < objArr.length; i2++) {
                zze(i2).zzg(objArr[i2]);
            }
            long nanoTime = System.nanoTime();
            run(this.zzb, this.zza);
            long nanoTime2 = System.nanoTime() - nanoTime;
            if (zzm) {
                for (TensorImpl tensorImpl : this.zzj) {
                    if (tensorImpl != null) {
                        tensorImpl.zzf();
                    }
                }
            }
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    zzf(((Integer) entry.getKey()).intValue()).zzd(entry.getValue());
                }
            }
            this.inferenceDurationNanoseconds = nanoTime2;
            return;
        }
        throw new IllegalArgumentException("Input error: Outputs should not be null.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public NativeInterpreterWrapper(ByteBuffer byteBuffer, zzc zzcVar) {
        TensorFlowLite.init();
        if (byteBuffer == null || (!(byteBuffer instanceof MappedByteBuffer) && (!byteBuffer.isDirect() || byteBuffer.order() != ByteOrder.nativeOrder()))) {
            throw new IllegalArgumentException("Model ByteBuffer should be either a MappedByteBuffer of the model file, or a direct ByteBuffer using ByteOrder.nativeOrder() which contains bytes of model content.");
        }
        this.zzf = byteBuffer;
        long createErrorReporter = createErrorReporter(512);
        zzl(createErrorReporter, createModelWithBuffer(this.zzf, createErrorReporter), zzcVar);
    }
}

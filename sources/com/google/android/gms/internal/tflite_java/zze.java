package com.google.android.gms.internal.tflite_java;

import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.gms.tflite.client.TfLiteClient;
import com.google.android.gms.tflite.client.TfLiteInitializationOptions;
import com.google.android.gms.tflite.dynamite.NativeInitializationHandle;
import com.google.android.gms.tflite.dynamite.TfLiteDynamite;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tflite-java@@16.1.0 */
/* loaded from: classes12.dex */
public abstract class zze {
    private static final Map zza = Collections.synchronizedMap(new EnumMap(zzj.class));
    private final Executor zzb;
    private final zzj zzc;
    private final TfLiteClient zzd;

    /* JADX INFO: Access modifiers changed from: protected */
    public zze(Context context, Executor executor, zzj zzjVar) {
        TfLiteClient client = TfLiteDynamite.getClient(context, zzjVar.zza(), executor);
        this.zzb = executor;
        this.zzc = zzjVar;
        this.zzd = client;
    }

    protected abstract void initializeNative(Object obj);

    public Task zzb(TfLiteInitializationOptions tfLiteInitializationOptions) {
        Map map = zza;
        synchronized (map) {
            zzd zzdVar = (zzd) map.get(this.zzc);
            if (zzdVar == null) {
                Task<TContinuationResult> onSuccessTask = this.zzd.getTfLiteNativeInitializationHandle(tfLiteInitializationOptions).onSuccessTask(this.zzb, new SuccessContinuation() { // from class: com.google.android.gms.internal.tflite_java.zzb
                    @Override // com.google.android.gms.tasks.SuccessContinuation
                    public final Task then(Object obj) {
                        return zze.this.zzd((NativeInitializationHandle) obj);
                    }
                });
                map.put(this.zzc, new zzd(onSuccessTask, tfLiteInitializationOptions, null));
                onSuccessTask.addOnFailureListener(zzg.zza(), new OnFailureListener() { // from class: com.google.android.gms.internal.tflite_java.zza
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        zze.this.zzf(exc);
                    }
                });
                return onSuccessTask;
            }
            return zzdVar.zza(tfLiteInitializationOptions);
        }
    }

    protected void zzc() throws UnsatisfiedLinkError {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Task zzd(NativeInitializationHandle nativeInitializationHandle) throws Exception {
        try {
            zzc();
            initializeNative(nativeInitializationHandle.getInternal());
            return Tasks.forResult(null);
        } catch (UnsatisfiedLinkError e) {
            return Tasks.forException(new Exception("Native initialization method not found", e));
        }
    }

    public final TfLiteClient zze() {
        return this.zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(Exception exc) {
        zza.remove(this.zzc);
    }
}

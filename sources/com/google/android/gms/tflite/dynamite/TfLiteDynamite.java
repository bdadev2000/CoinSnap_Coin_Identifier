package com.google.android.gms.tflite.dynamite;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.tflite.zzaa;
import com.google.android.gms.internal.tflite.zzad;
import com.google.android.gms.internal.tflite.zzg;
import com.google.android.gms.tflite.client.TfLiteClient;
import com.google.android.gms.tflite.dynamite.internal.zzi;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-tflite-impl@@16.1.0 */
/* loaded from: classes12.dex */
public class TfLiteDynamite {
    private TfLiteDynamite() {
    }

    public static Executor createDefaultExecutor() {
        zzg.zza();
        zzaa zzaaVar = new zzaa();
        zzaaVar.zza("TFLiteClient-%d");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), zzaaVar.zzb());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public static TfLiteClient getClient(Context context, int i, Executor executor) {
        zzad zzadVar;
        zzad zzadVar2 = zzad.CUSTOMER_UNKNOWN;
        switch (i) {
            case 0:
                zzadVar = zzad.CUSTOMER_UNKNOWN;
                break;
            case 1:
                zzadVar = zzad.CUSTOMER_3P_JAVA_API;
                break;
            case 2:
                zzadVar = zzad.CUSTOMER_3P_TASKS_JAVA_API;
                break;
            case 3:
                zzadVar = zzad.CUSTOMER_BLUESKY;
                break;
            case 4:
                zzadVar = zzad.CUSTOMER_HULK;
                break;
            case 5:
                zzadVar = zzad.CUSTOMER_LEIBNIZ;
                break;
            case 6:
                zzadVar = zzad.CUSTOMER_BARHOPPER;
                break;
            case 7:
                zzadVar = zzad.CUSTOMER_MLKIT_CUSTOM_ICA;
                break;
            case 8:
                zzadVar = zzad.CUSTOMER_MLKIT_NLCLASSIFIER;
                break;
            case 9:
                zzadVar = zzad.CUSTOMER_USERPROFILE;
                break;
            case 10:
                zzadVar = zzad.CUSTOMER_TEST;
                break;
            case 11:
                zzadVar = zzad.CUSTOMER_TASKS_AUDIO;
                break;
            case 12:
                zzadVar = zzad.CUSTOMER_TASKS_TEXT;
                break;
            case 13:
                zzadVar = zzad.CUSTOMER_TASKS_VISION;
                break;
            case 14:
                zzadVar = zzad.CUSTOMER_MLKIT_SMARTREPLY;
                break;
            case 15:
                zzadVar = zzad.CUSTOMER_MLKIT_OCR;
                break;
            case 16:
                zzadVar = zzad.CUSTOMER_MLKIT_IMAGE_CAPTION;
                break;
            case 17:
                zzadVar = zzad.CUSTOMER_MLBENCHMARK;
                break;
            case 18:
                zzadVar = zzad.CUSTOMER_MLKIT_DOCUMENT_DETECTION;
                break;
            case 19:
                zzadVar = zzad.CUSTOMER_TFLITE_DELEGATE_DYNAMITE;
                break;
            case 20:
                zzadVar = zzad.CUSTOMER_ACCELERATION_SERVICE;
                break;
            case 21:
                zzadVar = zzad.CUSTOMER_3P_NATIVE_API;
                break;
            default:
                zzadVar = null;
                break;
        }
        zzi zziVar = new zzi(context, executor, (zzad) Preconditions.checkNotNull(zzadVar, "Invalid customer ID " + i));
        zziVar.zzb();
        return zziVar;
    }
}

package com.google.android.gms.tflite.dynamite.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Process;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.moduleinstall.ModuleInstall;
import com.google.android.gms.common.moduleinstall.ModuleInstallClient;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.internal.tflite.zzad;
import com.google.android.gms.internal.tflite.zzl;
import com.google.android.gms.internal.tflite.zzm;
import com.google.android.gms.internal.tflite.zzs;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.gms.tflite.client.TfLiteClient;
import com.google.android.gms.tflite.client.TfLiteInitializationOptions;
import com.google.android.gms.tflite.dynamite.NativeInitializationHandle;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tflite-impl@@16.1.0 */
/* loaded from: classes12.dex */
public final class zzi implements TfLiteClient {
    public static final /* synthetic */ int zza = 0;
    private final Context zzb;
    private final Executor zzc;
    private final zzad zzd;
    private final ModuleInstallClient zze;

    public zzi(Context context, Executor executor, zzad zzadVar) {
        ModuleInstallClient client = ModuleInstall.getClient(context);
        this.zzb = context;
        this.zzc = executor;
        this.zzd = zzadVar;
        this.zze = client;
        zzs.zza(context);
    }

    @Override // com.google.android.gms.common.api.OptionalModuleApi
    public final Feature[] getOptionalFeatures() {
        return new Feature[]{zzl.zza};
    }

    @Override // com.google.android.gms.tflite.client.TfLiteClient
    public final Task<NativeInitializationHandle> getTfLiteNativeInitializationHandle() {
        Task continueWith;
        TfLiteInitializationOptions tfLiteInitializationOptions = DEFAULT_TFLITE_INITIALIZATION_OPTIONS;
        if (tfLiteInitializationOptions.enableAutomaticDownload()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(zzl.zza);
            if (tfLiteInitializationOptions.enableGpuDelegateSupport()) {
                arrayList.add(zzm.zza);
            }
            Feature[] featureArr = (Feature[]) arrayList.toArray(new Feature[0]);
            continueWith = com.google.android.gms.internal.tflite.zzk.zza(this.zze, featureArr, this.zzc).addOnFailureListener(new zzg(featureArr)).continueWith(this.zzc, zzh.zza);
        } else {
            continueWith = Tasks.forResult(null);
        }
        return continueWith.onSuccessTask(this.zzc, new zzf(this, tfLiteInitializationOptions));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Task zza(TfLiteInitializationOptions tfLiteInitializationOptions, Void r6) throws Exception {
        Context context = this.zzb;
        zzad zzadVar = this.zzd;
        String packageName = context.getPackageName();
        PackageInfo packageInfo = ClientLibraryUtils.getPackageInfo(context, packageName);
        CustomerInfo customerInfo = new CustomerInfo(packageName, packageInfo == null ? null : packageInfo.versionName, zzadVar != null ? Integer.valueOf(zzadVar.zza()) : null);
        Context context2 = this.zzb;
        boolean enableGpuDelegateSupport = tfLiteInitializationOptions.enableGpuDelegateSupport();
        tfLiteInitializationOptions.zza();
        return Tasks.forResult(new NativeInitializationHandle(zzk.zzb(context2, customerInfo, enableGpuDelegateSupport, false).zzc()));
    }

    public final void zzb() {
        String packageName = this.zzb.getPackageName();
        Preconditions.checkArgument(UidVerifier.uidHasPackageName(this.zzb, Process.myUid(), packageName), "Invalid package name \"%s\" for context", packageName);
    }

    @Override // com.google.android.gms.tflite.client.TfLiteClient
    public final Task<NativeInitializationHandle> getTfLiteNativeInitializationHandle(TfLiteInitializationOptions tfLiteInitializationOptions) {
        Task continueWith;
        if (tfLiteInitializationOptions.enableAutomaticDownload()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(zzl.zza);
            if (tfLiteInitializationOptions.enableGpuDelegateSupport()) {
                arrayList.add(zzm.zza);
            }
            Feature[] featureArr = (Feature[]) arrayList.toArray(new Feature[0]);
            continueWith = com.google.android.gms.internal.tflite.zzk.zza(this.zze, featureArr, this.zzc).addOnFailureListener(new zzg(featureArr)).continueWith(this.zzc, zzh.zza);
        } else {
            continueWith = Tasks.forResult(null);
        }
        return continueWith.onSuccessTask(this.zzc, new zzf(this, tfLiteInitializationOptions));
    }
}

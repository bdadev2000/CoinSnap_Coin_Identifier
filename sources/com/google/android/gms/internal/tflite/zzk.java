package com.google.android.gms.internal.tflite;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.common.moduleinstall.ModuleInstallClient;
import com.google.android.gms.common.moduleinstall.ModuleInstallRequest;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tflite-impl@@16.1.0 */
/* loaded from: classes12.dex */
public final class zzk {
    public static Task zza(ModuleInstallClient moduleInstallClient, final Feature[] featureArr, Executor executor) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        OptionalModuleApi optionalModuleApi = new OptionalModuleApi() { // from class: com.google.android.gms.internal.tflite.zzh
            @Override // com.google.android.gms.common.api.OptionalModuleApi
            public final Feature[] getOptionalFeatures() {
                return featureArr;
            }
        };
        return moduleInstallClient.installModules(ModuleInstallRequest.newBuilder().addApi(optionalModuleApi).setListener(new zzj(taskCompletionSource, moduleInstallClient)).build()).continueWithTask(executor, new Continuation() { // from class: com.google.android.gms.internal.tflite.zzi
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                TaskCompletionSource taskCompletionSource2 = TaskCompletionSource.this;
                if (task.getException() != null) {
                    return Tasks.forResult(false);
                }
                if (((ModuleInstallResponse) task.getResult()).areModulesAlreadyInstalled()) {
                    return Tasks.forResult(true);
                }
                return taskCompletionSource2.getTask();
            }
        });
    }
}

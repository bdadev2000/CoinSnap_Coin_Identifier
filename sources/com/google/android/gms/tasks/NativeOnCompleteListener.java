package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes3.dex */
public class NativeOnCompleteListener implements OnCompleteListener<Object> {
    private final long zza;

    @KeepForSdk
    public NativeOnCompleteListener(long j3) {
        this.zza = j3;
    }

    @KeepForSdk
    public static void createAndAddCallback(@NonNull Task<Object> task, long j3) {
        task.addOnCompleteListener(new NativeOnCompleteListener(j3));
    }

    @KeepForSdk
    public native void nativeOnComplete(long j3, @Nullable Object obj, boolean z10, boolean z11, @Nullable String str);

    @Override // com.google.android.gms.tasks.OnCompleteListener
    @KeepForSdk
    public void onComplete(@NonNull Task<Object> task) {
        Object obj;
        String str;
        Exception exception;
        if (task.isSuccessful()) {
            obj = task.getResult();
            str = null;
        } else if (!task.isCanceled() && (exception = task.getException()) != null) {
            str = exception.getMessage();
            obj = null;
        } else {
            obj = null;
            str = null;
        }
        nativeOnComplete(this.zza, obj, task.isSuccessful(), task.isCanceled(), str);
    }
}

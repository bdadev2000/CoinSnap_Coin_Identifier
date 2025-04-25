package com.google.android.gms.tflite.dynamite.internal;

import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-tflite-impl@@16.1.0 */
/* loaded from: classes12.dex */
public final /* synthetic */ class zzg implements OnFailureListener {
    public final /* synthetic */ Feature[] zza;

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        Log.w("TfLiteGMS", String.format(Locale.US, "Module installation for features %s failed", Arrays.toString(this.zza)), exc);
    }
}

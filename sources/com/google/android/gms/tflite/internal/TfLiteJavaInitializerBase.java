package com.google.android.gms.tflite.internal;

import android.content.Context;
import com.google.android.gms.internal.tflite_java.zze;
import com.google.android.gms.internal.tflite_java.zzj;
import com.google.android.gms.tflite.dynamite.TfLiteDynamite;

/* compiled from: com.google.android.gms:play-services-tflite-java@@16.1.0 */
/* loaded from: classes12.dex */
public class TfLiteJavaInitializerBase extends zze {
    public TfLiteJavaInitializerBase(Context context) {
        super(context, TfLiteDynamite.createDefaultExecutor(), zzj.CUSTOMER_3P_JAVA_API);
    }

    @Override // com.google.android.gms.internal.tflite_java.zze
    protected native void initializeNative(Object obj);
}

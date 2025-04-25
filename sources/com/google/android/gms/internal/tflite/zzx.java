package com.google.android.gms.internal.tflite;

/* compiled from: com.google.android.gms:play-services-tflite-impl@@16.1.0 */
/* loaded from: classes12.dex */
final class zzx implements zzv {
    private static final zzv zza = new zzv() { // from class: com.google.android.gms.internal.tflite.zzw
    };
    private volatile zzv zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzx(zzv zzvVar) {
        this.zzb = zzvVar;
    }

    public final String toString() {
        Object obj = this.zzb;
        if (obj == zza) {
            obj = "<supplier that returned null>";
        }
        return "Suppliers.memoize(" + String.valueOf(obj) + ")";
    }
}

package com.google.android.gms.internal.maps;

/* compiled from: com.google.android.gms:play-services-maps@@19.0.0 */
/* loaded from: classes12.dex */
final class zzbj {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbj(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final IllegalArgumentException zza() {
        Object obj = this.zzc;
        Object obj2 = this.zzb;
        Object obj3 = this.zza;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj3) + "=" + String.valueOf(obj2) + " and " + String.valueOf(obj3) + "=" + String.valueOf(obj));
    }
}

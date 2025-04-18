package com.google.android.gms.internal.ads;

/* loaded from: classes4.dex */
public abstract class zzhia {
    public static zzhia zzb(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new zzhhv(cls.getSimpleName()) : new zzhhx(cls.getSimpleName());
    }

    public abstract void zza(String str);
}

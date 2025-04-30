package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public abstract class zzhkh {
    public static zzhkh zzb(Class cls) {
        if (System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik")) {
            return new zzhkc(cls.getSimpleName());
        }
        return new zzhke(cls.getSimpleName());
    }

    public abstract void zza(String str);
}

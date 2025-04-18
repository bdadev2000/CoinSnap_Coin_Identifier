package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* loaded from: classes3.dex */
public final class zzbpc extends zzbpf {
    @Override // com.google.android.gms.internal.ads.zzbpg
    public final zzbpj zzb(String str) throws RemoteException {
        zzbqh zzbqhVar;
        try {
            try {
                Class<?> cls = Class.forName(str, false, zzbpc.class.getClassLoader());
                if (MediationAdapter.class.isAssignableFrom(cls)) {
                    return new zzbqh((MediationAdapter) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                if (Adapter.class.isAssignableFrom(cls)) {
                    return new zzbqh((Adapter) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not instantiate mediation adapter: " + str + " (not a valid adapter).");
                throw new RemoteException();
            } catch (Throwable unused) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("Reflection failed, retrying using direct instantiation");
                if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                    zzbqhVar = new zzbqh(new AdMobAdapter());
                } else {
                    if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                        zzbqhVar = new zzbqh(new CustomEventAdapter());
                    }
                    throw new RemoteException();
                }
                return zzbqhVar;
            }
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not instantiate mediation adapter: " + str + ". ", th2);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpg
    public final zzbrf zzc(String str) throws RemoteException {
        return new zzbrs((RtbAdapter) Class.forName(str, false, zzbrj.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
    }

    @Override // com.google.android.gms.internal.ads.zzbpg
    public final boolean zzd(String str) throws RemoteException {
        try {
            return Adapter.class.isAssignableFrom(Class.forName(str, false, zzbpc.class.getClassLoader()));
        } catch (Throwable unused) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not load custom event implementation class as Adapter: " + str + ", assuming old custom event implementation.");
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpg
    public final boolean zze(String str) throws RemoteException {
        try {
            return CustomEvent.class.isAssignableFrom(Class.forName(str, false, zzbpc.class.getClassLoader()));
        } catch (Throwable unused) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not load custom event implementation class: " + str + ", trying Adapter implementation class.");
            return false;
        }
    }
}

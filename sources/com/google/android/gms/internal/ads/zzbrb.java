package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* loaded from: classes2.dex */
public final class zzbrb extends zzbre {
    private static final zzbti zza = new zzbti();

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final zzbri zzb(String str) throws RemoteException {
        zzbsg zzbsgVar;
        try {
            try {
                Class<?> cls = Class.forName(str, false, zzbrb.class.getClassLoader());
                if (MediationAdapter.class.isAssignableFrom(cls)) {
                    return new zzbsg((MediationAdapter) cls.getDeclaredConstructor(null).newInstance(null));
                }
                if (Adapter.class.isAssignableFrom(cls)) {
                    return new zzbsg((Adapter) cls.getDeclaredConstructor(null).newInstance(null));
                }
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not instantiate mediation adapter: " + str + " (not a valid adapter).");
                throw new RemoteException();
            } catch (Throwable unused) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("Reflection failed, retrying using direct instantiation");
                if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                    zzbsgVar = new zzbsg(new AdMobAdapter());
                } else {
                    if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                        zzbsgVar = new zzbsg(new CustomEventAdapter());
                    }
                    throw new RemoteException();
                }
                return zzbsgVar;
            }
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not instantiate mediation adapter: " + str + ". ", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final zzbte zzc(String str) throws RemoteException {
        return new zzbtr((RtbAdapter) Class.forName(str, false, zzbti.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final boolean zzd(String str) throws RemoteException {
        try {
            return Adapter.class.isAssignableFrom(Class.forName(str, false, zzbrb.class.getClassLoader()));
        } catch (Throwable unused) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not load custom event implementation class as Adapter: " + str + ", assuming old custom event implementation.");
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final boolean zze(String str) throws RemoteException {
        try {
            return CustomEvent.class.isAssignableFrom(Class.forName(str, false, zzbrb.class.getClassLoader()));
        } catch (Throwable unused) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not load custom event implementation class: " + str + ", trying Adapter implementation class.");
            return false;
        }
    }
}

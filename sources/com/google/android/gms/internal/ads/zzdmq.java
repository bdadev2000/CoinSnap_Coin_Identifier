package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzdmq implements zzdkx {

    @Nullable
    private final zzbqa zza;
    private final zzcys zzb;
    private final zzcxy zzc;
    private final zzdfy zzd;
    private final Context zze;
    private final zzfgh zzf;
    private final VersionInfoParcel zzg;
    private final zzfhc zzh;
    private boolean zzi = false;
    private boolean zzj = false;
    private boolean zzk = true;

    @Nullable
    private final zzbpw zzl;

    @Nullable
    private final zzbpx zzm;

    public zzdmq(@Nullable zzbpw zzbpwVar, @Nullable zzbpx zzbpxVar, @Nullable zzbqa zzbqaVar, zzcys zzcysVar, zzcxy zzcxyVar, zzdfy zzdfyVar, Context context, zzfgh zzfghVar, VersionInfoParcel versionInfoParcel, zzfhc zzfhcVar) {
        this.zzl = zzbpwVar;
        this.zzm = zzbpxVar;
        this.zza = zzbqaVar;
        this.zzb = zzcysVar;
        this.zzc = zzcxyVar;
        this.zzd = zzdfyVar;
        this.zze = context;
        this.zzf = zzfghVar;
        this.zzg = versionInfoParcel;
        this.zzh = zzfhcVar;
    }

    private final void zzb(View view) {
        try {
            zzbqa zzbqaVar = this.zza;
            if (zzbqaVar != null && !zzbqaVar.zzA()) {
                this.zza.zzw(ObjectWrapper.wrap(view));
                this.zzc.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzkr)).booleanValue()) {
                    this.zzd.zzdG();
                    return;
                }
                return;
            }
            zzbpw zzbpwVar = this.zzl;
            if (zzbpwVar != null && !zzbpwVar.zzx()) {
                this.zzl.zzs(ObjectWrapper.wrap(view));
                this.zzc.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzkr)).booleanValue()) {
                    this.zzd.zzdG();
                    return;
                }
                return;
            }
            zzbpx zzbpxVar = this.zzm;
            if (zzbpxVar == null || zzbpxVar.zzv()) {
                return;
            }
            this.zzm.zzq(ObjectWrapper.wrap(view));
            this.zzc.onAdClicked();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzkr)).booleanValue()) {
                this.zzd.zzdG();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to call handleClick", e);
        }
    }

    private static final HashMap zzc(Map map) {
        HashMap hashMap = new HashMap();
        if (map != null) {
            synchronized (map) {
                try {
                    for (Map.Entry entry : map.entrySet()) {
                        View view = (View) ((WeakReference) entry.getValue()).get();
                        if (view != null) {
                            hashMap.put((String) entry.getKey(), view);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final boolean zzA() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final boolean zzB() {
        return this.zzf.zzL;
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final boolean zzC(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    @Nullable
    public final JSONObject zze(View view, Map map, Map map2, @Nullable ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    @Nullable
    public final JSONObject zzf(View view, Map map, Map map2, @Nullable ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzg() {
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzj(@Nullable com.google.android.gms.ads.internal.client.zzdh zzdhVar) {
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzk(View view, @Nullable View view2, @Nullable Map map, @Nullable Map map2, boolean z2, @Nullable ImageView.ScaleType scaleType) {
        if (this.zzj && this.zzf.zzL) {
            return;
        }
        zzb(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzl(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzm(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzo(View view, View view2, Map map, Map map2, boolean z2, @Nullable ImageView.ScaleType scaleType, int i2) {
        if (!this.zzj) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.zzf.zzL) {
            zzb(view2);
        } else {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzp() {
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzq(@Nullable View view, @Nullable Map map, @Nullable Map map2, @Nullable ImageView.ScaleType scaleType) {
        try {
            if (!this.zzi) {
                this.zzi = com.google.android.gms.ads.internal.zzu.zzs().zzn(this.zze, this.zzg.afmaVersion, this.zzf.zzC.toString(), this.zzh.zzf);
            }
            if (this.zzk) {
                zzbqa zzbqaVar = this.zza;
                if (zzbqaVar != null && !zzbqaVar.zzB()) {
                    this.zza.zzx();
                    this.zzb.zza();
                    return;
                }
                zzbpw zzbpwVar = this.zzl;
                if (zzbpwVar != null && !zzbpwVar.zzy()) {
                    this.zzl.zzt();
                    this.zzb.zza();
                    return;
                }
                zzbpx zzbpxVar = this.zzm;
                if (zzbpxVar == null || zzbpxVar.zzw()) {
                    return;
                }
                this.zzm.zzr();
                this.zzb.zza();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to call recordImpression", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzr() {
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzs(View view, MotionEvent motionEvent, @Nullable View view2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzt(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzu(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzv() {
        this.zzj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzw(com.google.android.gms.ads.internal.client.zzdd zzddVar) {
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzx(zzbhw zzbhwVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzy(View view, @Nullable Map map, @Nullable Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Object obj;
        IObjectWrapper zzn;
        try {
            IObjectWrapper wrap = ObjectWrapper.wrap(view);
            JSONObject jSONObject = this.zzf.zzaj;
            boolean z2 = true;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzbA)).booleanValue() && jSONObject.length() != 0) {
                Map hashMap = map == null ? new HashMap() : map;
                Map hashMap2 = map2 == null ? new HashMap() : map2;
                HashMap hashMap3 = new HashMap();
                hashMap3.putAll(hashMap);
                hashMap3.putAll(hashMap2);
                Iterator<String> keys = jSONObject.keys();
                loop0: while (keys.hasNext()) {
                    String next = keys.next();
                    JSONArray optJSONArray = jSONObject.optJSONArray(next);
                    if (optJSONArray != null) {
                        WeakReference weakReference = (WeakReference) hashMap3.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            Class<?> cls = obj.getClass();
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzbB)).booleanValue() && next.equals("3010")) {
                                zzbqa zzbqaVar = this.zza;
                                Object obj2 = null;
                                if (zzbqaVar != null) {
                                    try {
                                        zzn = zzbqaVar.zzn();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    zzbpw zzbpwVar = this.zzl;
                                    if (zzbpwVar != null) {
                                        zzn = zzbpwVar.zzk();
                                    } else {
                                        zzbpx zzbpxVar = this.zzm;
                                        zzn = zzbpxVar != null ? zzbpxVar.zzj() : null;
                                    }
                                }
                                if (zzn != null) {
                                    obj2 = ObjectWrapper.unwrap(zzn);
                                }
                                if (obj2 != null) {
                                    cls = obj2.getClass();
                                }
                            }
                            try {
                                ArrayList arrayList = new ArrayList();
                                com.google.android.gms.ads.internal.util.zzbs.zzc(optJSONArray, arrayList);
                                com.google.android.gms.ads.internal.zzu.zzp();
                                ClassLoader classLoader = this.zze.getClassLoader();
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    if (Class.forName((String) it.next(), false, classLoader).isAssignableFrom(cls)) {
                                        break;
                                    }
                                }
                            } catch (JSONException unused2) {
                                continue;
                            }
                        }
                        z2 = false;
                        break;
                    }
                }
            }
            this.zzk = z2;
            HashMap zzc = zzc(map);
            HashMap zzc2 = zzc(map2);
            zzbqa zzbqaVar2 = this.zza;
            if (zzbqaVar2 != null) {
                zzbqaVar2.zzy(wrap, ObjectWrapper.wrap(zzc), ObjectWrapper.wrap(zzc2));
                return;
            }
            zzbpw zzbpwVar2 = this.zzl;
            if (zzbpwVar2 != null) {
                zzbpwVar2.zzv(wrap, ObjectWrapper.wrap(zzc), ObjectWrapper.wrap(zzc2));
                this.zzl.zzu(wrap);
                return;
            }
            zzbpx zzbpxVar2 = this.zzm;
            if (zzbpxVar2 != null) {
                zzbpxVar2.zzt(wrap, ObjectWrapper.wrap(zzc), ObjectWrapper.wrap(zzc2));
                this.zzm.zzs(wrap);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to call trackView", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzz(View view, @Nullable Map map) {
        try {
            IObjectWrapper wrap = ObjectWrapper.wrap(view);
            zzbqa zzbqaVar = this.zza;
            if (zzbqaVar != null) {
                zzbqaVar.zzz(wrap);
                return;
            }
            zzbpw zzbpwVar = this.zzl;
            if (zzbpwVar != null) {
                zzbpwVar.zzw(wrap);
                return;
            }
            zzbpx zzbpxVar = this.zzm;
            if (zzbpxVar != null) {
                zzbpxVar.zzu(wrap);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to call untrackView", e);
        }
    }
}

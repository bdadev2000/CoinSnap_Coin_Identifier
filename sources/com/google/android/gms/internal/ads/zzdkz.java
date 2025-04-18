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
public final class zzdkz implements zzdjg {

    @Nullable
    private final zzbpv zza;
    private final zzcxe zzb;
    private final zzcwk zzc;
    private final zzdej zzd;
    private final Context zze;
    private final zzfet zzf;
    private final VersionInfoParcel zzg;
    private final zzffo zzh;
    private boolean zzi = false;
    private boolean zzj = false;
    private boolean zzk = true;

    @Nullable
    private final zzbpr zzl;

    @Nullable
    private final zzbps zzm;

    public zzdkz(@Nullable zzbpr zzbprVar, @Nullable zzbps zzbpsVar, @Nullable zzbpv zzbpvVar, zzcxe zzcxeVar, zzcwk zzcwkVar, zzdej zzdejVar, Context context, zzfet zzfetVar, VersionInfoParcel versionInfoParcel, zzffo zzffoVar) {
        this.zzl = zzbprVar;
        this.zzm = zzbpsVar;
        this.zza = zzbpvVar;
        this.zzb = zzcxeVar;
        this.zzc = zzcwkVar;
        this.zzd = zzdejVar;
        this.zze = context;
        this.zzf = zzfetVar;
        this.zzg = versionInfoParcel;
        this.zzh = zzffoVar;
    }

    private final void zzb(View view) {
        try {
            zzbpv zzbpvVar = this.zza;
            if (zzbpvVar != null && !zzbpvVar.zzA()) {
                this.zza.zzw(ObjectWrapper.wrap(view));
                this.zzc.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzkt)).booleanValue()) {
                    this.zzd.zzdG();
                    return;
                }
                return;
            }
            zzbpr zzbprVar = this.zzl;
            if (zzbprVar != null && !zzbprVar.zzx()) {
                this.zzl.zzs(ObjectWrapper.wrap(view));
                this.zzc.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzkt)).booleanValue()) {
                    this.zzd.zzdG();
                    return;
                }
                return;
            }
            zzbps zzbpsVar = this.zzm;
            if (zzbpsVar != null && !zzbpsVar.zzv()) {
                this.zzm.zzq(ObjectWrapper.wrap(view));
                this.zzc.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzkt)).booleanValue()) {
                    this.zzd.zzdG();
                }
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to call handleClick", e2);
        }
    }

    private static final HashMap zzc(Map map) {
        HashMap hashMap = new HashMap();
        if (map != null) {
            synchronized (map) {
                for (Map.Entry entry : map.entrySet()) {
                    View view = (View) ((WeakReference) entry.getValue()).get();
                    if (view != null) {
                        hashMap.put((String) entry.getKey(), view);
                    }
                }
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final boolean zzA() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final boolean zzB() {
        return this.zzf.zzL;
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final boolean zzC(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    @Nullable
    public final JSONObject zze(View view, Map map, Map map2, @Nullable ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    @Nullable
    public final JSONObject zzf(View view, Map map, Map map2, @Nullable ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzg() {
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzj(@Nullable com.google.android.gms.ads.internal.client.zzdh zzdhVar) {
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzk(View view, @Nullable View view2, @Nullable Map map, @Nullable Map map2, boolean z10, @Nullable ImageView.ScaleType scaleType) {
        if (this.zzj && this.zzf.zzL) {
            return;
        }
        zzb(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzl(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzm(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzo(View view, View view2, Map map, Map map2, boolean z10, @Nullable ImageView.ScaleType scaleType, int i10) {
        if (!this.zzj) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (!this.zzf.zzL) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        } else {
            zzb(view2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzp() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzq(@Nullable View view, @Nullable Map map, @Nullable Map map2, @Nullable ImageView.ScaleType scaleType) {
        try {
            if (!this.zzi) {
                this.zzi = com.google.android.gms.ads.internal.zzv.zzt().zzn(this.zze, this.zzg.afmaVersion, this.zzf.zzC.toString(), this.zzh.zzf);
            }
            if (this.zzk) {
                zzbpv zzbpvVar = this.zza;
                if (zzbpvVar != null && !zzbpvVar.zzB()) {
                    this.zza.zzx();
                    this.zzb.zza();
                    return;
                }
                zzbpr zzbprVar = this.zzl;
                if (zzbprVar != null && !zzbprVar.zzy()) {
                    this.zzl.zzt();
                    this.zzb.zza();
                    return;
                }
                zzbps zzbpsVar = this.zzm;
                if (zzbpsVar != null && !zzbpsVar.zzw()) {
                    this.zzm.zzr();
                    this.zzb.zza();
                }
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to call recordImpression", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzr() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzs(View view, MotionEvent motionEvent, @Nullable View view2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzt(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzu(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzv() {
        this.zzj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzw(com.google.android.gms.ads.internal.client.zzdd zzddVar) {
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzx(zzbhs zzbhsVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzy(View view, @Nullable Map map, @Nullable Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Map map3;
        Map map4;
        Object obj;
        IObjectWrapper zzn;
        try {
            IObjectWrapper wrap = ObjectWrapper.wrap(view);
            JSONObject jSONObject = this.zzf.zzaj;
            boolean z10 = true;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzbD)).booleanValue() && jSONObject.length() != 0) {
                if (map == null) {
                    map3 = new HashMap();
                } else {
                    map3 = map;
                }
                if (map2 == null) {
                    map4 = new HashMap();
                } else {
                    map4 = map2;
                }
                HashMap hashMap = new HashMap();
                hashMap.putAll(map3);
                hashMap.putAll(map4);
                Iterator<String> keys = jSONObject.keys();
                loop0: while (keys.hasNext()) {
                    String next = keys.next();
                    JSONArray optJSONArray = jSONObject.optJSONArray(next);
                    if (optJSONArray != null) {
                        WeakReference weakReference = (WeakReference) hashMap.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            Class<?> cls = obj.getClass();
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzbE)).booleanValue() && next.equals("3010")) {
                                zzbpv zzbpvVar = this.zza;
                                Object obj2 = null;
                                if (zzbpvVar != null) {
                                    try {
                                        zzn = zzbpvVar.zzn();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    zzbpr zzbprVar = this.zzl;
                                    if (zzbprVar != null) {
                                        zzn = zzbprVar.zzk();
                                    } else {
                                        zzbps zzbpsVar = this.zzm;
                                        if (zzbpsVar != null) {
                                            zzn = zzbpsVar.zzj();
                                        } else {
                                            zzn = null;
                                        }
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
                                com.google.android.gms.ads.internal.util.zzbr.zzc(optJSONArray, arrayList);
                                com.google.android.gms.ads.internal.zzv.zzq();
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
                        z10 = false;
                        break;
                    }
                }
            }
            this.zzk = z10;
            HashMap zzc = zzc(map);
            HashMap zzc2 = zzc(map2);
            zzbpv zzbpvVar2 = this.zza;
            if (zzbpvVar2 != null) {
                zzbpvVar2.zzy(wrap, ObjectWrapper.wrap(zzc), ObjectWrapper.wrap(zzc2));
                return;
            }
            zzbpr zzbprVar2 = this.zzl;
            if (zzbprVar2 != null) {
                zzbprVar2.zzv(wrap, ObjectWrapper.wrap(zzc), ObjectWrapper.wrap(zzc2));
                this.zzl.zzu(wrap);
                return;
            }
            zzbps zzbpsVar2 = this.zzm;
            if (zzbpsVar2 != null) {
                zzbpsVar2.zzt(wrap, ObjectWrapper.wrap(zzc), ObjectWrapper.wrap(zzc2));
                this.zzm.zzs(wrap);
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to call trackView", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzz(View view, @Nullable Map map) {
        try {
            IObjectWrapper wrap = ObjectWrapper.wrap(view);
            zzbpv zzbpvVar = this.zza;
            if (zzbpvVar != null) {
                zzbpvVar.zzz(wrap);
                return;
            }
            zzbpr zzbprVar = this.zzl;
            if (zzbprVar != null) {
                zzbprVar.zzw(wrap);
                return;
            }
            zzbps zzbpsVar = this.zzm;
            if (zzbpsVar != null) {
                zzbpsVar.zzu(wrap);
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to call untrackView", e2);
        }
    }
}

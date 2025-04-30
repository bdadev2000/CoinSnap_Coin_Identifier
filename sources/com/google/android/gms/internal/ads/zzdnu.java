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

/* loaded from: classes2.dex */
public final class zzdnu implements zzdmb {

    @Nullable
    private final zzbru zza;
    private final zzdad zzb;
    private final zzczj zzc;
    private final zzdhg zzd;
    private final Context zze;
    private final zzfgt zzf;
    private final VersionInfoParcel zzg;
    private final zzfho zzh;
    private boolean zzi = false;
    private boolean zzj = false;
    private boolean zzk = true;

    @Nullable
    private final zzbrq zzl;

    @Nullable
    private final zzbrr zzm;

    public zzdnu(@Nullable zzbrq zzbrqVar, @Nullable zzbrr zzbrrVar, @Nullable zzbru zzbruVar, zzdad zzdadVar, zzczj zzczjVar, zzdhg zzdhgVar, Context context, zzfgt zzfgtVar, VersionInfoParcel versionInfoParcel, zzfho zzfhoVar) {
        this.zzl = zzbrqVar;
        this.zzm = zzbrrVar;
        this.zza = zzbruVar;
        this.zzb = zzdadVar;
        this.zzc = zzczjVar;
        this.zzd = zzdhgVar;
        this.zze = context;
        this.zzf = zzfgtVar;
        this.zzg = versionInfoParcel;
        this.zzh = zzfhoVar;
    }

    private final void zzb(View view) {
        try {
            zzbru zzbruVar = this.zza;
            if (zzbruVar != null && !zzbruVar.zzA()) {
                this.zza.zzw(ObjectWrapper.wrap(view));
                this.zzc.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkM)).booleanValue()) {
                    this.zzd.zzdG();
                    return;
                }
                return;
            }
            zzbrq zzbrqVar = this.zzl;
            if (zzbrqVar != null && !zzbrqVar.zzx()) {
                this.zzl.zzs(ObjectWrapper.wrap(view));
                this.zzc.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkM)).booleanValue()) {
                    this.zzd.zzdG();
                    return;
                }
                return;
            }
            zzbrr zzbrrVar = this.zzm;
            if (zzbrrVar != null && !zzbrrVar.zzv()) {
                this.zzm.zzq(ObjectWrapper.wrap(view));
                this.zzc.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkM)).booleanValue()) {
                    this.zzd.zzdG();
                }
            }
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to call handleClick", e4);
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

    @Override // com.google.android.gms.internal.ads.zzdmb
    public final boolean zzA() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdmb
    public final boolean zzB() {
        return this.zzf.zzM;
    }

    @Override // com.google.android.gms.internal.ads.zzdmb
    public final boolean zzC(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdmb
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdmb
    @Nullable
    public final JSONObject zze(View view, Map map, Map map2, @Nullable ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdmb
    @Nullable
    public final JSONObject zzf(View view, Map map, Map map2, @Nullable ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdmb
    public final void zzg() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzdmb
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzdmb
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.zzdmb
    public final void zzj(@Nullable com.google.android.gms.ads.internal.client.zzcw zzcwVar) {
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdmb
    public final void zzk(View view, @Nullable View view2, @Nullable Map map, @Nullable Map map2, boolean z8, @Nullable ImageView.ScaleType scaleType) {
        if (this.zzj && this.zzf.zzM) {
            return;
        }
        zzb(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdmb
    public final void zzl(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdmb
    public final void zzm(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdmb
    public final void zzo(View view, View view2, Map map, Map map2, boolean z8, @Nullable ImageView.ScaleType scaleType, int i9) {
        if (!this.zzj) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (!this.zzf.zzM) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        } else {
            zzb(view2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdmb
    public final void zzp() {
    }

    @Override // com.google.android.gms.internal.ads.zzdmb
    public final void zzq(@Nullable View view, @Nullable Map map, @Nullable Map map2, @Nullable ImageView.ScaleType scaleType) {
        try {
            if (!this.zzi) {
                this.zzi = com.google.android.gms.ads.internal.zzu.zzs().zzn(this.zze, this.zzg.afmaVersion, this.zzf.zzD.toString(), this.zzh.zzf);
            }
            if (this.zzk) {
                zzbru zzbruVar = this.zza;
                if (zzbruVar != null && !zzbruVar.zzB()) {
                    this.zza.zzx();
                    this.zzb.zza();
                    return;
                }
                zzbrq zzbrqVar = this.zzl;
                if (zzbrqVar != null && !zzbrqVar.zzy()) {
                    this.zzl.zzt();
                    this.zzb.zza();
                    return;
                }
                zzbrr zzbrrVar = this.zzm;
                if (zzbrrVar != null && !zzbrrVar.zzw()) {
                    this.zzm.zzr();
                    this.zzb.zza();
                }
            }
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to call recordImpression", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdmb
    public final void zzr() {
    }

    @Override // com.google.android.gms.internal.ads.zzdmb
    public final void zzs(View view, MotionEvent motionEvent, @Nullable View view2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdmb
    public final void zzt(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdmb
    public final void zzu(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzdmb
    public final void zzv() {
        this.zzj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdmb
    public final void zzw(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdmb
    public final void zzx(zzbjp zzbjpVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdmb
    public final void zzy(View view, @Nullable Map map, @Nullable Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Map map3;
        Map map4;
        Object obj;
        IObjectWrapper zzn;
        try {
            IObjectWrapper wrap = ObjectWrapper.wrap(view);
            JSONObject jSONObject = this.zzf.zzak;
            boolean z8 = true;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzby)).booleanValue() && jSONObject.length() != 0) {
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
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbz)).booleanValue() && next.equals("3010")) {
                                zzbru zzbruVar = this.zza;
                                Object obj2 = null;
                                if (zzbruVar != null) {
                                    try {
                                        zzn = zzbruVar.zzn();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    zzbrq zzbrqVar = this.zzl;
                                    if (zzbrqVar != null) {
                                        zzn = zzbrqVar.zzk();
                                    } else {
                                        zzbrr zzbrrVar = this.zzm;
                                        if (zzbrrVar != null) {
                                            zzn = zzbrrVar.zzj();
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
                                com.google.android.gms.ads.internal.util.zzbw.zzc(optJSONArray, arrayList);
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
                        z8 = false;
                        break;
                    }
                }
            }
            this.zzk = z8;
            HashMap zzc = zzc(map);
            HashMap zzc2 = zzc(map2);
            zzbru zzbruVar2 = this.zza;
            if (zzbruVar2 != null) {
                zzbruVar2.zzy(wrap, ObjectWrapper.wrap(zzc), ObjectWrapper.wrap(zzc2));
                return;
            }
            zzbrq zzbrqVar2 = this.zzl;
            if (zzbrqVar2 != null) {
                zzbrqVar2.zzv(wrap, ObjectWrapper.wrap(zzc), ObjectWrapper.wrap(zzc2));
                this.zzl.zzu(wrap);
                return;
            }
            zzbrr zzbrrVar2 = this.zzm;
            if (zzbrrVar2 != null) {
                zzbrrVar2.zzt(wrap, ObjectWrapper.wrap(zzc), ObjectWrapper.wrap(zzc2));
                this.zzm.zzs(wrap);
            }
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to call trackView", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdmb
    public final void zzz(View view, @Nullable Map map) {
        try {
            IObjectWrapper wrap = ObjectWrapper.wrap(view);
            zzbru zzbruVar = this.zza;
            if (zzbruVar != null) {
                zzbruVar.zzz(wrap);
                return;
            }
            zzbrq zzbrqVar = this.zzl;
            if (zzbrqVar != null) {
                zzbrqVar.zzw(wrap);
                return;
            }
            zzbrr zzbrrVar = this.zzm;
            if (zzbrrVar != null) {
                zzbrrVar.zzu(wrap);
            }
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to call untrackView", e4);
        }
    }
}

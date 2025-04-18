package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import com.google.common.collect.b;
import com.google.common.collect.k2;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import v8.u0;

/* loaded from: classes3.dex */
final class zzcs implements SharedPreferences.Editor {
    private boolean zza;
    private Set<String> zzb;
    private Map<String, Object> zzc;
    private final /* synthetic */ zzcp zzd;

    private final void zza(String str, Object obj) {
        if (obj != null) {
            this.zzc.put(str, obj);
        } else {
            remove(str);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        commit();
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.zza = true;
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        if (this.zza) {
            zzcp.zza(this.zzd).clear();
        }
        zzcp.zza(this.zzd).keySet().removeAll(this.zzb);
        for (Map.Entry<String, Object> entry : this.zzc.entrySet()) {
            zzcp.zza(this.zzd).put(entry.getKey(), entry.getValue());
        }
        Iterator it = zzcp.zzb(this.zzd).iterator();
        while (true) {
            int i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = (SharedPreferences.OnSharedPreferenceChangeListener) it.next();
            Set<String> set = this.zzb;
            Set<String> keySet = this.zzc.keySet();
            u0.j(set, "set1");
            u0.j(keySet, "set2");
            b a = new k2(set, keySet, i10).a();
            while (a.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(this.zzd, (String) a.next());
            }
        }
        if (!this.zza && this.zzb.isEmpty() && this.zzc.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z10) {
        zza(str, Boolean.valueOf(z10));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f10) {
        zza(str, Float.valueOf(f10));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i10) {
        zza(str, Integer.valueOf(i10));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j3) {
        zza(str, Long.valueOf(j3));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        zza(str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set<String> set) {
        zza(str, set);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        this.zzb.add(str);
        return this;
    }

    private zzcs(zzcp zzcpVar) {
        this.zzd = zzcpVar;
        this.zza = false;
        this.zzb = new HashSet();
        this.zzc = new HashMap();
    }
}

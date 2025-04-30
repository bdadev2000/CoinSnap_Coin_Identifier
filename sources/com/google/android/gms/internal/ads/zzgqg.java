package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzgqg {
    private final Class zza;
    private zzgqi zzd;
    private Map zzb = new HashMap();
    private final List zzc = new ArrayList();
    private zzgtk zze = zzgtk.zza;

    public /* synthetic */ zzgqg(Class cls, zzgqf zzgqfVar) {
        this.zza = cls;
    }

    private final zzgqg zze(Object obj, zzghi zzghiVar, zzgwt zzgwtVar, boolean z8) throws GeneralSecurityException {
        byte[] zzc;
        zzgze zzgzeVar;
        zzgze zzgzeVar2;
        if (this.zzb != null) {
            if (zzgwtVar.zzd() == zzgwj.ENABLED) {
                zzgxn zzgxnVar = zzgxn.UNKNOWN_PREFIX;
                int ordinal = zzgwtVar.zzg().ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                throw new GeneralSecurityException("unknown output prefix type");
                            }
                        } else {
                            zzc = zzghd.zza;
                        }
                    }
                    zzc = zzgpm.zza(zzgwtVar.zza()).zzc();
                } else {
                    zzc = zzgpm.zzb(zzgwtVar.zza()).zzc();
                }
                zzgqi zzgqiVar = new zzgqi(obj, zzgze.zzb(zzc), zzgwtVar.zzd(), zzgwtVar.zzg(), zzgwtVar.zza(), zzgwtVar.zzc().zzg(), zzghiVar, null);
                Map map = this.zzb;
                List list = this.zzc;
                ArrayList arrayList = new ArrayList();
                arrayList.add(zzgqiVar);
                zzgzeVar = zzgqiVar.zzb;
                List list2 = (List) map.put(zzgzeVar, Collections.unmodifiableList(arrayList));
                if (list2 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(list2);
                    arrayList2.add(zzgqiVar);
                    zzgzeVar2 = zzgqiVar.zzb;
                    map.put(zzgzeVar2, Collections.unmodifiableList(arrayList2));
                }
                list.add(zzgqiVar);
                if (z8) {
                    if (this.zzd == null) {
                        this.zzd = zzgqiVar;
                    } else {
                        throw new IllegalStateException("you cannot set two primary primitives");
                    }
                }
                return this;
            }
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        throw new IllegalStateException("addEntry cannot be called after build");
    }

    public final zzgqg zza(Object obj, zzghi zzghiVar, zzgwt zzgwtVar) throws GeneralSecurityException {
        zze(obj, zzghiVar, zzgwtVar, false);
        return this;
    }

    public final zzgqg zzb(Object obj, zzghi zzghiVar, zzgwt zzgwtVar) throws GeneralSecurityException {
        zze(obj, zzghiVar, zzgwtVar, true);
        return this;
    }

    public final zzgqg zzc(zzgtk zzgtkVar) {
        if (this.zzb != null) {
            this.zze = zzgtkVar;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build");
    }

    public final zzgqk zzd() throws GeneralSecurityException {
        Map map = this.zzb;
        if (map != null) {
            zzgqk zzgqkVar = new zzgqk(map, this.zzc, this.zzd, this.zze, this.zza, null);
            this.zzb = null;
            return zzgqkVar;
        }
        throw new IllegalStateException("build cannot be called twice");
    }
}

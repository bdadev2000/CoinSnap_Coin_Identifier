package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzavm extends zzavl {
    private zzavm(Context context, zzavk zzavkVar) {
        super(context, zzavkVar);
    }

    public static zzavm zzt(Context context, zzavk zzavkVar) {
        zzavl.zzr(context, zzavkVar.zza);
        return new zzavm(context, zzavkVar);
    }

    @Deprecated
    public static zzavm zzu(String str, Context context, boolean z2) {
        return zzt(context, new zzavk(str, false));
    }

    @Deprecated
    public static zzavm zzv(String str, Context context, boolean z2, int i2) {
        return zzt(context, new zzavk(str, z2));
    }

    @Override // com.google.android.gms.internal.ads.zzavl
    public final List zzp(zzawo zzawoVar, Context context, zzasm zzasmVar, zzasc zzascVar) {
        if (zzawoVar.zzk() == null || !((zzavl) this).zzu.zza) {
            return super.zzp(zzawoVar, context, zzasmVar, null);
        }
        int zza = zzawoVar.zza();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.zzp(zzawoVar, context, zzasmVar, null));
        arrayList.add(new zzaxg(zzawoVar, "bxhlS+byKsEaHbhXEyi6TD/EqtsG2sd2GfInhSI7yciYukoqPk/w1i7LSDrcmmYr", "gWtAtoadyS/0GQFYvFINsjkt4bRjT5fE+w3tC36yAJU=", zzasmVar, zza, 24));
        return arrayList;
    }
}

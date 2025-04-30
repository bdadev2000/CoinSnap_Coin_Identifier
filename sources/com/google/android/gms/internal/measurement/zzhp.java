package com.google.android.gms.internal.measurement;

import Q7.n0;
import com.google.android.gms.internal.measurement.zzhp;
import com.google.android.gms.internal.measurement.zzhq;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class zzhp<MessageType extends zzhq<MessageType, BuilderType>, BuilderType extends zzhp<MessageType, BuilderType>> implements zzks {
    @Override // 
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType zzb(zzio zzioVar, zzix zzixVar) throws IOException;

    public BuilderType zza(byte[] bArr, int i9, int i10) throws zzjs {
        try {
            zzio zza = zzio.zza(bArr, 0, i10, false);
            zzb(zza, zzix.zza);
            zza.zzb(0);
            return this;
        } catch (zzjs e4) {
            throw e4;
        } catch (IOException e9) {
            throw new RuntimeException(zza("byte array"), e9);
        }
    }

    @Override // 
    /* renamed from: zzaf, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType clone();

    public BuilderType zza(byte[] bArr, int i9, int i10, zzix zzixVar) throws zzjs {
        try {
            zzio zza = zzio.zza(bArr, 0, i10, false);
            zzb(zza, zzixVar);
            zza.zzb(0);
            return this;
        } catch (zzjs e4) {
            throw e4;
        } catch (IOException e9) {
            throw new RuntimeException(zza("byte array"), e9);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzks
    public final /* synthetic */ zzks zza(byte[] bArr) throws zzjs {
        return zza(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.measurement.zzks
    public final /* synthetic */ zzks zza(byte[] bArr, zzix zzixVar) throws zzjs {
        return zza(bArr, 0, bArr.length, zzixVar);
    }

    private final String zza(String str) {
        return n0.j("Reading ", getClass().getName(), " from a ", str, " threw an IOException (should never happen).");
    }
}

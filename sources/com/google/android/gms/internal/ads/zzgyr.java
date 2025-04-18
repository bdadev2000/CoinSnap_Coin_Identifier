package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgyr;
import com.google.android.gms.internal.ads.zzgyx;
import java.io.IOException;

/* loaded from: classes3.dex */
public class zzgyr<MessageType extends zzgyx<MessageType, BuilderType>, BuilderType extends zzgyr<MessageType, BuilderType>> extends zzgwx<MessageType, BuilderType> {
    protected MessageType zza;
    private final MessageType zzb;

    public zzgyr(MessageType messagetype) {
        this.zzb = messagetype;
        if (!messagetype.zzcf()) {
            this.zza = zza();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    private MessageType zza() {
        return (MessageType) this.zzb.zzbj();
    }

    private static <MessageType> void zzb(MessageType messagetype, MessageType messagetype2) {
        zzhas.zza().zzb(messagetype.getClass()).zzg(messagetype, messagetype2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzgwx
    public /* bridge */ /* synthetic */ zzgwx zzaD(zzgwy zzgwyVar) {
        zzbi((zzgyx) zzgwyVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgwx
    /* renamed from: zzaK */
    public /* bridge */ /* synthetic */ zzgwx zzaW(zzgxv zzgxvVar, zzgyh zzgyhVar) throws IOException {
        zzbk(zzgxvVar, zzgyhVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgwx
    /* renamed from: zzaN */
    public /* bridge */ /* synthetic */ zzgwx zzaZ(byte[] bArr, int i10, int i11) throws zzgzm {
        zzbl(bArr, i10, i11);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgwx
    /* renamed from: zzaO */
    public /* bridge */ /* synthetic */ zzgwx zzba(byte[] bArr, int i10, int i11, zzgyh zzgyhVar) throws zzgzm {
        zzbm(bArr, i10, i11, zzgyhVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgwx
    public /* bridge */ /* synthetic */ zzhah zzaW(zzgxv zzgxvVar, zzgyh zzgyhVar) throws IOException {
        zzbk(zzgxvVar, zzgyhVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgwx
    public /* bridge */ /* synthetic */ zzhah zzaZ(byte[] bArr, int i10, int i11) throws zzgzm {
        zzbl(bArr, i10, i11);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgwx
    public /* bridge */ /* synthetic */ zzhah zzba(byte[] bArr, int i10, int i11, zzgyh zzgyhVar) throws zzgzm {
        zzbm(bArr, i10, i11, zzgyhVar);
        return this;
    }

    public final BuilderType zzbg() {
        if (!this.zzb.zzcf()) {
            this.zza = zza();
            return this;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    @Override // com.google.android.gms.internal.ads.zzgwx
    /* renamed from: zzbh, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BuilderType zzaP() {
        BuilderType buildertype = (BuilderType) zzbt().zzcZ();
        buildertype.zza = zzbs();
        return buildertype;
    }

    public BuilderType zzbi(MessageType messagetype) {
        zzbj(messagetype);
        return this;
    }

    public BuilderType zzbj(MessageType messagetype) {
        if (zzbt().equals(messagetype)) {
            return this;
        }
        zzbu();
        zzb(this.zza, messagetype);
        return this;
    }

    public BuilderType zzbk(zzgxv zzgxvVar, zzgyh zzgyhVar) throws IOException {
        zzbu();
        try {
            zzhas.zza().zzb(this.zza.getClass()).zzh(this.zza, zzgxw.zzq(zzgxvVar), zzgyhVar);
            return this;
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof IOException) {
                throw ((IOException) e2.getCause());
            }
            throw e2;
        }
    }

    public BuilderType zzbl(byte[] bArr, int i10, int i11) throws zzgzm {
        int i12 = zzgyh.zzb;
        int i13 = zzhas.zza;
        zzbm(bArr, i10, i11, zzgyh.zza);
        return this;
    }

    public BuilderType zzbm(byte[] bArr, int i10, int i11, zzgyh zzgyhVar) throws zzgzm {
        zzbu();
        try {
            zzhas.zza().zzb(this.zza.getClass()).zzi(this.zza, bArr, i10, i10 + i11, new zzgxd(zzgyhVar));
            return this;
        } catch (zzgzm e2) {
            throw e2;
        } catch (IOException e10) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e10);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzgzm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    /* renamed from: zzbn, reason: merged with bridge method [inline-methods] */
    public final MessageType zzbr() {
        MessageType zzbs = zzbs();
        if (zzbs.zzbw()) {
            return zzbs;
        }
        throw zzgwx.zzbb(zzbs);
    }

    @Override // com.google.android.gms.internal.ads.zzhah
    /* renamed from: zzbo, reason: merged with bridge method [inline-methods] */
    public MessageType zzbs() {
        if (!this.zza.zzcf()) {
            return this.zza;
        }
        this.zza.zzbW();
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    /* renamed from: zzbp, reason: merged with bridge method [inline-methods] */
    public MessageType zzbt() {
        return this.zzb;
    }

    public /* bridge */ /* synthetic */ zzhah zzbq() {
        zzbg();
        return this;
    }

    public final void zzbu() {
        if (!this.zza.zzcf()) {
            zzbv();
        }
    }

    public void zzbv() {
        MessageType zza = zza();
        zzb(zza, this.zza);
        this.zza = zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final boolean zzbw() {
        return zzgyx.zzce(this.zza, false);
    }
}

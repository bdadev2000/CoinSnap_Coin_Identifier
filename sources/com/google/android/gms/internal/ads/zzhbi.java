package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhbi;
import com.google.android.gms.internal.ads.zzhbo;
import java.io.IOException;

/* loaded from: classes2.dex */
public class zzhbi<MessageType extends zzhbo<MessageType, BuilderType>, BuilderType extends zzhbi<MessageType, BuilderType>> extends zzgzh<MessageType, BuilderType> {
    protected MessageType zza;
    private final MessageType zzb;

    public zzhbi(MessageType messagetype) {
        this.zzb = messagetype;
        if (!messagetype.zzce()) {
            this.zza = zza();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    private MessageType zza() {
        return (MessageType) this.zzb.zzbj();
    }

    private static <MessageType> void zzb(MessageType messagetype, MessageType messagetype2) {
        zzhdo.zza().zzb(messagetype.getClass()).zzg(messagetype, messagetype2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzgzh
    public /* bridge */ /* synthetic */ zzgzh zzaD(zzgzi zzgziVar) {
        zzbi((zzhbo) zzgziVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgzh
    /* renamed from: zzaK */
    public /* bridge */ /* synthetic */ zzgzh zzaW(zzham zzhamVar, zzhay zzhayVar) throws IOException {
        zzbk(zzhamVar, zzhayVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgzh
    /* renamed from: zzaN */
    public /* bridge */ /* synthetic */ zzgzh zzaZ(byte[] bArr, int i9, int i10) throws zzhcd {
        zzbl(bArr, i9, i10);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgzh
    /* renamed from: zzaO */
    public /* bridge */ /* synthetic */ zzgzh zzba(byte[] bArr, int i9, int i10, zzhay zzhayVar) throws zzhcd {
        zzbm(bArr, i9, i10, zzhayVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgzh, com.google.android.gms.internal.ads.zzhdd
    public /* bridge */ /* synthetic */ zzhdd zzaW(zzham zzhamVar, zzhay zzhayVar) throws IOException {
        zzbk(zzhamVar, zzhayVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgzh
    public /* bridge */ /* synthetic */ zzhdd zzaZ(byte[] bArr, int i9, int i10) throws zzhcd {
        zzbl(bArr, i9, i10);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgzh
    public /* bridge */ /* synthetic */ zzhdd zzba(byte[] bArr, int i9, int i10, zzhay zzhayVar) throws zzhcd {
        zzbm(bArr, i9, i10, zzhayVar);
        return this;
    }

    public final BuilderType zzbg() {
        if (!this.zzb.zzce()) {
            this.zza = zza();
            return this;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    @Override // com.google.android.gms.internal.ads.zzgzh
    /* renamed from: zzbh, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BuilderType zzaP() {
        BuilderType buildertype = (BuilderType) zzbt().zzcY();
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

    public BuilderType zzbk(zzham zzhamVar, zzhay zzhayVar) throws IOException {
        zzbu();
        try {
            zzhdo.zza().zzb(this.zza.getClass()).zzh(this.zza, zzhan.zzq(zzhamVar), zzhayVar);
            return this;
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof IOException) {
                throw ((IOException) e4.getCause());
            }
            throw e4;
        }
    }

    public BuilderType zzbl(byte[] bArr, int i9, int i10) throws zzhcd {
        zzbm(bArr, i9, i10, zzhay.zza);
        return this;
    }

    public BuilderType zzbm(byte[] bArr, int i9, int i10, zzhay zzhayVar) throws zzhcd {
        zzbu();
        try {
            zzhdo.zza().zzb(this.zza.getClass()).zzi(this.zza, bArr, i9, i9 + i10, new zzgzn(zzhayVar));
            return this;
        } catch (zzhcd e4) {
            throw e4;
        } catch (IOException e9) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e9);
        } catch (IndexOutOfBoundsException unused) {
            throw zzhcd.zzj();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhdd
    /* renamed from: zzbn, reason: merged with bridge method [inline-methods] */
    public final MessageType zzbr() {
        MessageType zzbs = zzbs();
        if (zzbs.zzbw()) {
            return zzbs;
        }
        throw zzgzh.zzbb(zzbs);
    }

    @Override // com.google.android.gms.internal.ads.zzhdd
    /* renamed from: zzbo, reason: merged with bridge method [inline-methods] */
    public MessageType zzbs() {
        if (!this.zza.zzce()) {
            return this.zza;
        }
        this.zza.zzbV();
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhdf
    /* renamed from: zzbp, reason: merged with bridge method [inline-methods] */
    public MessageType zzbt() {
        return this.zzb;
    }

    public /* bridge */ /* synthetic */ zzhdd zzbq() {
        zzbg();
        return this;
    }

    public final void zzbu() {
        if (!this.zza.zzce()) {
            zzbv();
        }
    }

    public void zzbv() {
        MessageType zza = zza();
        zzb(zza, this.zza);
        this.zza = zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhdf
    public final boolean zzbw() {
        return zzhbo.zzcd(this.zza, false);
    }
}

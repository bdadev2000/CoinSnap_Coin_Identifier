package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhbe;
import java.io.IOException;

/* loaded from: classes2.dex */
public class zzhay<MessageType extends zzhbe<MessageType, BuilderType>, BuilderType extends zzhay<MessageType, BuilderType>> extends zzgza<MessageType, BuilderType> {
    protected MessageType zza;
    private final MessageType zzb;

    public zzhay(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzcf()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = zza();
    }

    private MessageType zza() {
        return (MessageType) this.zzb.zzbj();
    }

    private static <MessageType> void zzb(MessageType messagetype, MessageType messagetype2) {
        zzhcz.zza().zzb(messagetype.getClass()).zzg(messagetype, messagetype2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzgza
    public /* bridge */ /* synthetic */ zzgza zzaD(zzgzb zzgzbVar) {
        zzbi((zzhbe) zzgzbVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    /* renamed from: zzaK */
    public /* bridge */ /* synthetic */ zzgza zzaW(zzhac zzhacVar, zzhao zzhaoVar) throws IOException {
        zzbk(zzhacVar, zzhaoVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    /* renamed from: zzaN */
    public /* bridge */ /* synthetic */ zzgza zzaZ(byte[] bArr, int i2, int i3) throws zzhbt {
        zzbl(bArr, i2, i3);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    /* renamed from: zzaO */
    public /* bridge */ /* synthetic */ zzgza zzba(byte[] bArr, int i2, int i3, zzhao zzhaoVar) throws zzhbt {
        zzbm(bArr, i2, i3, zzhaoVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public /* bridge */ /* synthetic */ zzhco zzaW(zzhac zzhacVar, zzhao zzhaoVar) throws IOException {
        zzbk(zzhacVar, zzhaoVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public /* bridge */ /* synthetic */ zzhco zzaZ(byte[] bArr, int i2, int i3) throws zzhbt {
        zzbl(bArr, i2, i3);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public /* bridge */ /* synthetic */ zzhco zzba(byte[] bArr, int i2, int i3, zzhao zzhaoVar) throws zzhbt {
        zzbm(bArr, i2, i3, zzhaoVar);
        return this;
    }

    public final BuilderType zzbg() {
        if (this.zzb.zzcf()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = zza();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgza
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

    public BuilderType zzbk(zzhac zzhacVar, zzhao zzhaoVar) throws IOException {
        zzbu();
        try {
            zzhcz.zza().zzb(this.zza.getClass()).zzh(this.zza, zzhad.zzq(zzhacVar), zzhaoVar);
            return this;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof IOException) {
                throw ((IOException) e.getCause());
            }
            throw e;
        }
    }

    public BuilderType zzbl(byte[] bArr, int i2, int i3) throws zzhbt {
        int i4 = zzhao.zzb;
        int i5 = zzhcz.zza;
        zzbm(bArr, i2, i3, zzhao.zza);
        return this;
    }

    public BuilderType zzbm(byte[] bArr, int i2, int i3, zzhao zzhaoVar) throws zzhbt {
        zzbu();
        try {
            zzhcz.zza().zzb(this.zza.getClass()).zzi(this.zza, bArr, i2, i2 + i3, new zzgzg(zzhaoVar));
            return this;
        } catch (zzhbt e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzhbt("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    /* renamed from: zzbn, reason: merged with bridge method [inline-methods] */
    public final MessageType zzbr() {
        MessageType zzbs = zzbs();
        if (zzbs.zzbw()) {
            return zzbs;
        }
        throw zzgza.zzbb(zzbs);
    }

    @Override // com.google.android.gms.internal.ads.zzhco
    /* renamed from: zzbo, reason: merged with bridge method [inline-methods] */
    public MessageType zzbs() {
        if (!this.zza.zzcf()) {
            return this.zza;
        }
        this.zza.zzbW();
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhcq
    /* renamed from: zzbp, reason: merged with bridge method [inline-methods] */
    public MessageType zzbt() {
        return this.zzb;
    }

    public /* bridge */ /* synthetic */ zzhco zzbq() {
        zzbg();
        return this;
    }

    public final void zzbu() {
        if (this.zza.zzcf()) {
            return;
        }
        zzbv();
    }

    public void zzbv() {
        MessageType zza = zza();
        zzb(zza, this.zza);
        this.zza = zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhcq
    public final boolean zzbw() {
        return zzhbe.zzce(this.zza, false);
    }
}

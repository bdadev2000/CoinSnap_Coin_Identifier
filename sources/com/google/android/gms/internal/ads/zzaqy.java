package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class zzaqy implements zzaqz {
    private static final Logger zzb = Logger.getLogger(zzaqy.class.getName());
    final ThreadLocal zza = new zzaqx(this);

    public abstract zzarc zza(String str, byte[] bArr, String str2);

    @Override // com.google.android.gms.internal.ads.zzaqz
    public final zzarc zzb(zzhfj zzhfjVar, zzard zzardVar) throws IOException {
        int zza;
        long j3;
        String str;
        long zzb2 = zzhfjVar.zzb();
        ((ByteBuffer) this.zza.get()).rewind().limit(8);
        do {
            zza = zzhfjVar.zza((ByteBuffer) this.zza.get());
            if (zza == 8) {
                ((ByteBuffer) this.zza.get()).rewind();
                long zze = zzarb.zze((ByteBuffer) this.zza.get());
                byte[] bArr = null;
                if (zze < 8 && zze > 1) {
                    Logger logger = zzb;
                    Level level = Level.SEVERE;
                    StringBuilder sb2 = new StringBuilder(80);
                    sb2.append("Plausibility check failed: size < 8 (size = ");
                    sb2.append(zze);
                    sb2.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb2.toString());
                    return null;
                }
                byte[] bArr2 = new byte[4];
                ((ByteBuffer) this.zza.get()).get(bArr2);
                try {
                    String str2 = new String(bArr2, "ISO-8859-1");
                    if (zze == 1) {
                        ((ByteBuffer) this.zza.get()).limit(16);
                        zzhfjVar.zza((ByteBuffer) this.zza.get());
                        ((ByteBuffer) this.zza.get()).position(8);
                        j3 = zzarb.zzf((ByteBuffer) this.zza.get()) - 16;
                    } else if (zze == 0) {
                        j3 = zzhfjVar.zzc() - zzhfjVar.zzb();
                    } else {
                        j3 = zze - 8;
                    }
                    if ("uuid".equals(str2)) {
                        ((ByteBuffer) this.zza.get()).limit(((ByteBuffer) this.zza.get()).limit() + 16);
                        zzhfjVar.zza((ByteBuffer) this.zza.get());
                        bArr = new byte[16];
                        for (int position = ((ByteBuffer) this.zza.get()).position() - 16; position < ((ByteBuffer) this.zza.get()).position(); position++) {
                            bArr[position - (((ByteBuffer) this.zza.get()).position() - 16)] = ((ByteBuffer) this.zza.get()).get(position);
                        }
                        j3 -= 16;
                    }
                    long j10 = j3;
                    if (zzardVar instanceof zzarc) {
                        str = ((zzarc) zzardVar).zza();
                    } else {
                        str = "";
                    }
                    zzarc zza2 = zza(str2, bArr, str);
                    ((ByteBuffer) this.zza.get()).rewind();
                    zza2.zzb(zzhfjVar, (ByteBuffer) this.zza.get(), j10, this);
                    return zza2;
                } catch (UnsupportedEncodingException e2) {
                    throw new RuntimeException(e2);
                }
            }
        } while (zza >= 0);
        zzhfjVar.zze(zzb2);
        throw new EOFException();
    }
}

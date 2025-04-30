package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class zzasn implements zzaso {
    private static final Logger zzb = Logger.getLogger(zzasn.class.getName());
    final ThreadLocal zza = new zzasm(this);

    public abstract zzasr zza(String str, byte[] bArr, String str2);

    @Override // com.google.android.gms.internal.ads.zzaso
    public final zzasr zzb(zzhkb zzhkbVar, zzass zzassVar) throws IOException {
        int zza;
        long j7;
        String str;
        long zzb2 = zzhkbVar.zzb();
        ((ByteBuffer) this.zza.get()).rewind().limit(8);
        do {
            zza = zzhkbVar.zza((ByteBuffer) this.zza.get());
            if (zza == 8) {
                ((ByteBuffer) this.zza.get()).rewind();
                long zze = zzasq.zze((ByteBuffer) this.zza.get());
                byte[] bArr = null;
                if (zze < 8 && zze > 1) {
                    Logger logger = zzb;
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(zze);
                    sb.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                byte[] bArr2 = new byte[4];
                ((ByteBuffer) this.zza.get()).get(bArr2);
                try {
                    String str2 = new String(bArr2, "ISO-8859-1");
                    if (zze == 1) {
                        ((ByteBuffer) this.zza.get()).limit(16);
                        zzhkbVar.zza((ByteBuffer) this.zza.get());
                        ((ByteBuffer) this.zza.get()).position(8);
                        j7 = zzasq.zzf((ByteBuffer) this.zza.get()) - 16;
                    } else if (zze == 0) {
                        j7 = zzhkbVar.zzc() - zzhkbVar.zzb();
                    } else {
                        j7 = zze - 8;
                    }
                    if ("uuid".equals(str2)) {
                        ((ByteBuffer) this.zza.get()).limit(((ByteBuffer) this.zza.get()).limit() + 16);
                        zzhkbVar.zza((ByteBuffer) this.zza.get());
                        bArr = new byte[16];
                        for (int position = ((ByteBuffer) this.zza.get()).position() - 16; position < ((ByteBuffer) this.zza.get()).position(); position++) {
                            bArr[position - (((ByteBuffer) this.zza.get()).position() - 16)] = ((ByteBuffer) this.zza.get()).get(position);
                        }
                        j7 -= 16;
                    }
                    long j9 = j7;
                    if (zzassVar instanceof zzasr) {
                        str = ((zzasr) zzassVar).zza();
                    } else {
                        str = "";
                    }
                    zzasr zza2 = zza(str2, bArr, str);
                    zza2.zzc(zzassVar);
                    ((ByteBuffer) this.zza.get()).rewind();
                    zza2.zzb(zzhkbVar, (ByteBuffer) this.zza.get(), j9, this);
                    return zza2;
                } catch (UnsupportedEncodingException e4) {
                    throw new RuntimeException(e4);
                }
            }
        } while (zza >= 0);
        zzhkbVar.zze(zzb2);
        throw new EOFException();
    }
}

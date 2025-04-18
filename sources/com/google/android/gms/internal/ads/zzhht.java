package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public class zzhht implements Iterator, Closeable, zzarq {
    private static final zzarp zza = new zzhhs("eof ");
    protected zzarm zzb;
    protected zzhhu zzc;
    zzarp zzd = null;
    long zze = 0;
    long zzf = 0;
    private final List zzg = new ArrayList();

    static {
        zzhia.zzb(zzhht.class);
    }

    public void close() throws IOException {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zzarp zzarpVar = this.zzd;
        if (zzarpVar == zza) {
            return false;
        }
        if (zzarpVar != null) {
            return true;
        }
        try {
            this.zzd = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.zzd = zza;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i2 = 0; i2 < this.zzg.size(); i2++) {
            if (i2 > 0) {
                sb.append(";");
            }
            sb.append(((zzarp) this.zzg.get(i2)).toString());
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.Iterator
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzarp next() {
        zzarp zzb;
        zzarp zzarpVar = this.zzd;
        if (zzarpVar != null && zzarpVar != zza) {
            this.zzd = null;
            return zzarpVar;
        }
        zzhhu zzhhuVar = this.zzc;
        if (zzhhuVar == null || this.zze >= this.zzf) {
            this.zzd = zza;
            throw new NoSuchElementException();
        }
        try {
            synchronized (zzhhuVar) {
                this.zzc.zze(this.zze);
                zzb = this.zzb.zzb(this.zzc, this);
                this.zze = this.zzc.zzb();
            }
            return zzb;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    public final List zzd() {
        return (this.zzc == null || this.zzd == zza) ? this.zzg : new zzhhz(this.zzg, this);
    }

    public final void zze(zzhhu zzhhuVar, long j2, zzarm zzarmVar) throws IOException {
        this.zzc = zzhhuVar;
        this.zze = zzhhuVar.zzb();
        zzhhuVar.zze(zzhhuVar.zzb() + j2);
        this.zzf = zzhhuVar.zzb();
        this.zzb = zzarmVar;
    }
}
